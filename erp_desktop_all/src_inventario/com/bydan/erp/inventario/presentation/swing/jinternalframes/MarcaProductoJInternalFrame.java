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
import com.bydan.erp.inventario.util.MarcaProductoConstantesFunciones;

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
public class MarcaProductoJInternalFrame extends MarcaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMarcaProducto;
	
	protected JMenuBar jmenuBarMarcaProducto;
	
	protected JMenu jmenuMarcaProducto;
	protected JMenu jmenuDatosMarcaProducto;
	protected JMenu jmenuArchivoMarcaProducto;
	protected JMenu jmenuAccionesMarcaProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMarcaProducto;	
	protected GridBagConstraints gridBagConstraintsMarcaProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MarcaProductoDetalleFormJInternalFrame jInternalFrameDetalleFormMarcaProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMarcaProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMarcaProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";
	
	public MarcaProductoSessionBean marcaproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MarcaProducto> marcaproductos;		
	public List<MarcaProducto> marcaproductosEliminados;	
	public List<MarcaProducto> marcaproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMarcaProducto;		
	protected JButton jButtonAbrirOrderByMarcaProducto;
	
	
	//protected JPanel jPanelOrderByMarcaProducto;
	//public JScrollPane jScrollPanelOrderByMarcaProducto;	
	//protected JButton jButtonCerrarOrderByMarcaProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MarcaProductoLogic marcaproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMarcaProducto;
	public JScrollPane jScrollPanelDatosEdicionMarcaProducto;
	public JScrollPane jScrollPanelDatosGeneralMarcaProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosMarcaProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMarcaProducto;
	//public JScrollPane jScrollPanelImportacionMarcaProducto;
	
	
	
	protected JPanel jPanelAccionesMarcaProducto;
	
    protected JPanel jPanelPaginacionMarcaProducto;
    protected JPanel jPanelParametrosReportesMarcaProducto;
	protected JPanel jPanelParametrosReportesAccionesMarcaProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MarcaProducto;
	protected JPanel jPanelParametrosAuxiliar2MarcaProducto;
	protected JPanel jPanelParametrosAuxiliar3MarcaProducto;
	protected JPanel jPanelParametrosAuxiliar4MarcaProducto;
	//protected JPanel jPanelParametrosAuxiliar5MarcaProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoMarcaProducto;
	//protected JPanel jPanelImportacionMarcaProducto;
	
	
	public JTable jTableDatosMarcaProducto;
	
	
	
	//public JTable jTableDatosMarcaProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMarcaProducto;
	protected JButton jButtonDuplicarMarcaProducto;
	protected JButton jButtonCopiarMarcaProducto;
	protected JButton jButtonVerFormMarcaProducto;
	protected JButton jButtonNuevoRelacionesMarcaProducto;
	protected JButton jButtonModificarMarcaProducto;
	
    protected JButton jButtonGuardarCambiosTablaMarcaProducto;
	protected JButton jButtonCerrarMarcaProducto;
	
	
	protected JButton jButtonRecargarInformacionMarcaProducto;
	protected JButton jButtonProcesarInformacionMarcaProducto;
	
	
	protected JButton jButtonAnterioresMarcaProducto;
	protected JButton jButtonSiguientesMarcaProducto;
	protected JButton jButtonNuevoGuardarCambiosMarcaProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMarcaProducto;
	//protected JButton jButtonCerrarReporteDinamicoMarcaProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoMarcaProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionMarcaProducto;
	//protected JButton jButtonGenerarImportacionMarcaProducto;
	//protected JButton jButtonCerrarImportacionMarcaProducto;
	//protected JFileChooser jFileChooserImportacionMarcaProducto;
	//protected File fileImportacionMarcaProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMarcaProducto;
	protected JButton jButtonDuplicarToolBarMarcaProducto;
	protected JButton jButtonNuevoRelacionesToolBarMarcaProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarMarcaProducto;
	protected JButton jButtonCopiarToolBarMarcaProducto;
	protected JButton jButtonVerFormToolBarMarcaProducto;
	public JButton jButtonGuardarCambiosTablaToolBarMarcaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarMarcaProducto;
	protected JButton jButtonCerrarToolBarMarcaProducto;
	
	protected JButton jButtonRecargarInformacionToolBarMarcaProducto;
	protected JButton jButtonProcesarInformacionToolBarMarcaProducto;
	protected JButton jButtonAnterioresToolBarMarcaProducto;
	protected JButton jButtonSiguientesToolBarMarcaProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarMarcaProducto;
	protected JButton jButtonAbrirOrderByToolBarMarcaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMarcaProducto;
	protected JMenuItem jMenuItemDuplicarMarcaProducto;
	protected JMenuItem jMenuItemNuevoRelacionesMarcaProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMarcaProducto;
	protected JMenuItem jMenuItemCopiarMarcaProducto;
	protected JMenuItem jMenuItemVerFormMarcaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaMarcaProducto;
	protected JMenuItem jMenuItemCerrarMarcaProducto;
	protected JMenuItem jMenuItemDetalleCerrarMarcaProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMarcaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarMarcaProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionMarcaProducto;
	protected JMenuItem jMenuItemProcesarInformacionMarcaProducto;
	protected JMenuItem jMenuItemAnterioresMarcaProducto;
	protected JMenuItem jMenuItemSiguientesMarcaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMarcaProducto;
	protected JMenuItem jMenuItemAbrirOrderByMarcaProducto;
	protected JMenuItem jMenuItemMostrarOcultarMarcaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMarcaProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMarcaProducto;
	protected JCheckBox jCheckBoxSeleccionadosMarcaProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMarcaProducto;
	protected JCheckBox jCheckBoxConGraficoReporteMarcaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMarcaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMarcaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMarcaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMarcaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMarcaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMarcaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMarcaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMarcaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMarcaProducto;
	protected JTextField jTextFieldValorCampoGeneralMarcaProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMarcaProducto;
	//public JList<Reporte> jListColumnasSelectReporteMarcaProducto;
	//public JScrollPane jScrollColumnasSelectReporteMarcaProducto;
	
	//public JLabel jLabelRelacionesSelectReporteMarcaProducto;
	//public JList<Reporte> jListRelacionesSelectReporteMarcaProducto;
	//public JScrollPane jScrollRelacionesSelectReporteMarcaProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMarcaProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMarcaProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMarcaProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoMarcaProducto;
	
		
	//public JLabel jLabelArchivoImportacionMarcaProducto;	
	//public JLabel jLabelPathArchivoImportacionMarcaProducto;
	//protected JTextField jTextFieldPathArchivoImportacionMarcaProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMarcaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMarcaProducto;
	
	//public JLabel jLabelColumnaCategoriaValorMarcaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMarcaProducto;
	
	//public JLabel jLabelColumnasValoresGraficoMarcaProducto;
	//public JList<Reporte> jListColumnasValoresGraficoMarcaProducto;
	//public JScrollPane jScrollColumnasValoresGraficoMarcaProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMarcaProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMarcaProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMarcaProducto;
	public JPanel jPanelBusquedaPorCodigoMarcaProducto;
	public JButton jButtonBusquedaPorCodigoMarcaProducto;
	public JPanel jPanelBusquedaPorNombreMarcaProducto;
	public JButton jButtonBusquedaPorNombreMarcaProducto;
	public JPanel jPanelFK_IdTipoProductoMarcaProducto;
	public JButton jButtonFK_IdTipoProductoMarcaProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoMarcaProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoMarcaProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoMarcaProducto;
	public JButton jButtoncodigoBusquedaPorCodigoMarcaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreMarcaProducto;
	public JLabel jLabelnombreBusquedaPorNombreMarcaProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreMarcaProducto;
	public JButton jButtonnombreBusquedaPorNombreMarcaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoMarcaProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoMarcaProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoMarcaProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoMarcaProductoBusqueda= new JButtonMe();

	
	
	
	
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
	public MarcaProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MarcaProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MarcaProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MarcaProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMarcaProducto)	{
		this.jButtonRecargarInformacionMarcaProducto = jButtonRecargarInformacionMarcaProducto;
	}
	
	public JButton getjButtonProcesarInformacionMarcaProducto() {
		return this.jButtonProcesarInformacionMarcaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMarcaProducto)	{
		this.jButtonProcesarInformacionMarcaProducto = jButtonProcesarInformacionMarcaProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionMarcaProducto() {
		return this.jButtonRecargarInformacionMarcaProducto;
	}
	
	
	public List<MarcaProducto> getmarcaproductos() {
		return this.marcaproductos;
	}

	public void setmarcaproductos(List<MarcaProducto> marcaproductos) {
		this.marcaproductos = marcaproductos;
	}
	
	public List<MarcaProducto> getmarcaproductosAux() {
		return this.marcaproductosAux;
	}

	public void setmarcaproductosAux(List<MarcaProducto> marcaproductosAux) {
		this.marcaproductosAux = marcaproductosAux;
	}
	
	public List<MarcaProducto> getmarcaproductosEliminados() {
		return this.marcaproductosEliminados;
	}

	public void setMarcaProductosEliminados(List<MarcaProducto> marcaproductosEliminados) {
		this.marcaproductosEliminados = marcaproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMarcaProducto() {
		return jComboBoxTiposSeleccionarMarcaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMarcaProducto(
			JComboBox jComboBoxTiposSeleccionarMarcaProducto) {
		this.jComboBoxTiposSeleccionarMarcaProducto = jComboBoxTiposSeleccionarMarcaProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMarcaProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMarcaProducto() {
		return jTextFieldValorCampoGeneralMarcaProducto;
	}

	public void setjTextFieldValorCampoGeneralMarcaProducto(
			JTextField jTextFieldValorCampoGeneralMarcaProducto) {
		this.jTextFieldValorCampoGeneralMarcaProducto = jTextFieldValorCampoGeneralMarcaProducto;
	}

	public void setBorderResaltarValorCampoGeneralMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMarcaProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMarcaProducto() {
		return this.jCheckBoxSeleccionarTodosMarcaProducto;
	}

	public void setjCheckBoxSeleccionarTodosMarcaProducto(
			JCheckBox jCheckBoxSeleccionarTodosMarcaProducto) {
		this.jCheckBoxSeleccionarTodosMarcaProducto = jCheckBoxSeleccionarTodosMarcaProducto;
	}

	public void setBorderResaltarSeleccionarTodosMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMarcaProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMarcaProducto() {
		return this.jCheckBoxSeleccionadosMarcaProducto;
	}

	public void setjCheckBoxSeleccionadosMarcaProducto(
			JCheckBox jCheckBoxSeleccionadosMarcaProducto) {
		this.jCheckBoxSeleccionadosMarcaProducto = jCheckBoxSeleccionadosMarcaProducto;
	}
	
	public void setBorderResaltarSeleccionadosMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMarcaProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMarcaProducto() {
		return this.jComboBoxTiposArchivosReportesMarcaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMarcaProducto(
			JComboBox jComboBoxTiposArchivosReportesMarcaProducto) {
		this.jComboBoxTiposArchivosReportesMarcaProducto = jComboBoxTiposArchivosReportesMarcaProducto;
	}

	public void setBorderResaltarTiposArchivosReportesMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMarcaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMarcaProducto() {
		return this.jComboBoxTiposReportesMarcaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMarcaProducto(
			JComboBox jComboBoxTiposReportesMarcaProducto) {
		this.jComboBoxTiposReportesMarcaProducto = jComboBoxTiposReportesMarcaProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMarcaProducto() {
	//	return jComboBoxTiposReportesDinamicoMarcaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMarcaProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoMarcaProducto) {
	//	this.jComboBoxTiposReportesDinamicoMarcaProducto = jComboBoxTiposReportesDinamicoMarcaProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMarcaProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoMarcaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMarcaProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMarcaProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto = jComboBoxTiposArchivosReportesDinamicoMarcaProducto;
	//}
	
	public void setBorderResaltarTiposReportesMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMarcaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMarcaProducto() {
		return this.jComboBoxTiposGraficosReportesMarcaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMarcaProducto(
			JComboBox jComboBoxTiposGraficosReportesMarcaProducto) {
		this.jComboBoxTiposGraficosReportesMarcaProducto = jComboBoxTiposGraficosReportesMarcaProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMarcaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMarcaProducto() {
		return this.jComboBoxTiposPaginacionMarcaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMarcaProducto(
			JComboBox jComboBoxTiposPaginacionMarcaProducto) {
		this.jComboBoxTiposPaginacionMarcaProducto = jComboBoxTiposPaginacionMarcaProducto;
	}
	
	public void setBorderResaltarTiposPaginacionMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMarcaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMarcaProducto() {
		return this.jComboBoxTiposRelacionesMarcaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMarcaProducto() {
		return this.jComboBoxTiposAccionesMarcaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMarcaProducto(
			JComboBox jComboBoxTiposRelacionesMarcaProducto) {
		this.jComboBoxTiposRelacionesMarcaProducto = jComboBoxTiposRelacionesMarcaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMarcaProducto(
			JComboBox jComboBoxTiposAccionesMarcaProducto) {
		this.jComboBoxTiposAccionesMarcaProducto = jComboBoxTiposAccionesMarcaProducto;
	}
	
	public void setBorderResaltarTiposRelacionesMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMarcaProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMarcaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMarcaProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMarcaProducto() {
	//	return jCheckBoxConGraficoDinamicoMarcaProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoMarcaProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoMarcaProducto) {
	//	this.jCheckBoxConGraficoDinamicoMarcaProducto = jCheckBoxConGraficoDinamicoMarcaProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMarcaProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMarcaProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMarcaProducto .setBorder(borderResaltar);		
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
		this.marcaproductoSessionBean=new MarcaProductoSessionBean();
		
		this.marcaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.marcaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.marcaproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MarcaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MarcaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Marca Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		MarcaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MarcaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMarcaProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"nuevo","nuevo","Nuevo"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"duplicar","duplicar","Duplicar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"copiar","copiar","Copiar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"ver_form","ver_form","Ver"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"recargar","recargar","Recargar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMarcaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMarcaProducto,this.jTtoolBarMarcaProducto,
							"cerrar","cerrar","Salir"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMarcaProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMarcaProducto;
			
				this.jButtonProcesarInformacionToolBarMarcaProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMarcaProducto;
				
		//protected JButton jButtonModificarToolBarMarcaProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMarcaProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMarcaProducto=new JMenuMe("General");
		this.jmenuArchivoMarcaProducto=new JMenuMe("Archivo");
		this.jmenuAccionesMarcaProducto=new JMenuMe("Acciones");
		this.jmenuDatosMarcaProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMarcaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMarcaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMarcaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMarcaProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMarcaProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMarcaProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMarcaProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMarcaProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMarcaProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMarcaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMarcaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMarcaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMarcaProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMarcaProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMarcaProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMarcaProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMarcaProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMarcaProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMarcaProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMarcaProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMarcaProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMarcaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMarcaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMarcaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMarcaProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMarcaProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMarcaProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMarcaProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMarcaProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMarcaProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMarcaProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMarcaProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMarcaProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMarcaProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMarcaProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMarcaProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMarcaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMarcaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMarcaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMarcaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMarcaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMarcaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMarcaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMarcaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMarcaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMarcaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMarcaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMarcaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMarcaProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMarcaProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMarcaProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMarcaProducto.add(this.jMenuItemCerrarMarcaProducto);
			
			this.jmenuAccionesMarcaProducto.add(this.jMenuItemNuevoMarcaProducto);
			this.jmenuAccionesMarcaProducto.add(this.jMenuItemNuevoGuardarCambiosMarcaProducto);
			this.jmenuAccionesMarcaProducto.add(this.jMenuItemNuevoRelacionesMarcaProducto);
			this.jmenuAccionesMarcaProducto.add(this.jMenuItemGuardarCambiosTablaMarcaProducto);		
			this.jmenuAccionesMarcaProducto.add(this.jMenuItemDuplicarMarcaProducto);		
			this.jmenuAccionesMarcaProducto.add(this.jMenuItemCopiarMarcaProducto);		
			this.jmenuAccionesMarcaProducto.add(this.jMenuItemVerFormMarcaProducto);		
			
			this.jmenuDatosMarcaProducto.add(this.jMenuItemRecargarInformacionMarcaProducto);				
			this.jmenuDatosMarcaProducto.add(this.jMenuItemAnterioresMarcaProducto);				
			this.jmenuDatosMarcaProducto.add(this.jMenuItemSiguientesMarcaProducto);				
			this.jmenuDatosMarcaProducto.add(this.jMenuItemAbrirOrderByMarcaProducto);				
			this.jmenuDatosMarcaProducto.add(this.jMenuItemMostrarOcultarMarcaProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMarcaProducto.add(this.jMenuItemGuardarCambiosMarcaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMarcaProducto.add(this.jmenuArchivoMarcaProducto);		
			this.jmenuBarMarcaProducto.add(this.jmenuAccionesMarcaProducto);		
			this.jmenuBarMarcaProducto.add(this.jmenuDatosMarcaProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMarcaProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMarcaProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoMarcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoMarcaProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoMarcaProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoMarcaProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoMarcaProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoMarcaProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoMarcaProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoMarcaProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoMarcaProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoMarcaProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreMarcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreMarcaProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreMarcaProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreMarcaProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreMarcaProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreMarcaProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreMarcaProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreMarcaProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreMarcaProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreMarcaProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoMarcaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoMarcaProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoMarcaProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoMarcaProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoMarcaProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoMarcaProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMarcaProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasMarcaProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMarcaProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMarcaProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMarcaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMarcaProducto = new MarcaProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Marca Producto DATOS");
			this.jInternalFrameDetalleFormMarcaProducto = new MarcaProductoDetalleFormJInternalFrame(jDesktopPane,this.marcaproductoSessionBean.getConGuardarRelaciones(),this.marcaproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMarcaProducto = null;//new MarcaProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMarcaProducto= new GridBagLayout();
		
		
		this.jTableDatosMarcaProducto = new JTableMe();      
		
		String sToolTipMarcaProducto="";
		sToolTipMarcaProducto=MarcaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMarcaProducto+="(Inventario.MarcaProducto)";
		}
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMarcaProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMarcaProducto.setToolTipText(sToolTipMarcaProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMarcaProducto);
		this.jTableDatosMarcaProducto.setAutoCreateRowSorter(true);
		this.jTableDatosMarcaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMarcaProducto.setRowSelectionAllowed(true);
		this.jTableDatosMarcaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMarcaProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMarcaProducto = new JButtonMe();
		this.jButtonDuplicarMarcaProducto = new JButtonMe();
		this.jButtonCopiarMarcaProducto = new JButtonMe();
		this.jButtonVerFormMarcaProducto = new JButtonMe();
		this.jButtonNuevoRelacionesMarcaProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMarcaProducto = new JButtonMe();
		this.jButtonCerrarMarcaProducto = new JButtonMe();
		
		this.jScrollPanelDatosMarcaProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralMarcaProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Marca Producto";
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Marca Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosMarcaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMarcaProducto.setToolTipText("Acciones");
        this.jPanelAccionesMarcaProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMarcaProducto=new ReporteDinamicoJInternalFrame(MarcaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMarcaProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMarcaProducto=new ImportacionJInternalFrame(MarcaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMarcaProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMarcaProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByMarcaProducto.setText("Orden");
		this.jButtonAbrirOrderByMarcaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMarcaProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMarcaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMarcaProducto,false,this);
			
			//this.cargarOrderByMarcaProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMarcaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMarcaProducto,true,this);
			
			//this.cargarOrderByMarcaProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMarcaProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosMarcaProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosMarcaProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosMarcaProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMarcaProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMarcaProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMarcaProducto.setText("Nuevo");
		this.jButtonDuplicarMarcaProducto.setText("Duplicar");
		this.jButtonCopiarMarcaProducto.setText("Copiar");
		this.jButtonVerFormMarcaProducto.setText("Ver");
		this.jButtonNuevoRelacionesMarcaProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMarcaProducto.setText("Guardar");
		this.jButtonCerrarMarcaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMarcaProducto,"nuevo_button","Nuevo",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMarcaProducto,"duplicar_button","Duplicar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMarcaProducto,"copiar_button","Copiar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMarcaProducto,"ver_form","Ver",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMarcaProducto,"nuevorelaciones_button","Nuevo Rel",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMarcaProducto,"guardarcambiostabla_button","Guardar",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMarcaProducto,"cerrar_button","Salir",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMarcaProducto.setToolTipText("Nuevo"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMarcaProducto.setToolTipText("Duplicar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMarcaProducto.setToolTipText("Copiar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMarcaProducto.setToolTipText("Ver"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMarcaProducto.setToolTipText("Nuevo Rel"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMarcaProducto.setToolTipText("Guardar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMarcaProducto.setToolTipText("Salir"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMarcaProducto";
		inputMap = this.jButtonNuevoMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMarcaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMarcaProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarMarcaProducto";
		inputMap = this.jButtonDuplicarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMarcaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMarcaProducto"));
		
		//COPIAR
		sMapKey = "CopiarMarcaProducto";
		inputMap = this.jButtonCopiarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMarcaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMarcaProducto"));
		
		//VEr FORM
		sMapKey = "VerFormMarcaProducto";
		inputMap = this.jButtonVerFormMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMarcaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMarcaProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMarcaProducto";
		inputMap = this.jButtonNuevoRelacionesMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMarcaProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMarcaProducto";
		inputMap = this.jButtonModificarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMarcaProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMarcaProducto";
		inputMap = this.jButtonCerrarMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMarcaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMarcaProducto";
		inputMap = this.jButtonGuardarCambiosTablaMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMarcaProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MarcaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MarcaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MarcaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MarcaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MarcaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMarcaProducto.setName("jPanelParametrosReportesMarcaProducto"); 
		
		this.jPanelParametrosReportesAccionesMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMarcaProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMarcaProducto.setName("jPanelParametrosReportesAccionesMarcaProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMarcaProducto = new JButtonMe();
		this.jButtonRecargarInformacionMarcaProducto.setText("Recargar");
		this.jButtonRecargarInformacionMarcaProducto.setToolTipText("Recargar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMarcaProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMarcaProducto = new JButtonMe();
		this.jButtonProcesarInformacionMarcaProducto.setText("Procesar");
		this.jButtonProcesarInformacionMarcaProducto.setToolTipText("Procesar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMarcaProducto.setVisible(false);
			
		this.jButtonProcesarInformacionMarcaProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMarcaProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMarcaProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMarcaProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMarcaProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMarcaProducto.setText("TIPO");       
		this.jComboBoxTiposReportesMarcaProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMarcaProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMarcaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMarcaProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionMarcaProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMarcaProducto.setText("Accion");
		this.jComboBoxTiposRelacionesMarcaProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMarcaProducto.setText("Accion");
		this.jComboBoxTiposAccionesMarcaProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMarcaProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMarcaProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarMarcaProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMarcaProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMarcaProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMarcaProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMarcaProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMarcaProducto = new JLabelMe();
		
		this.jLabelAccionesMarcaProducto.setText("Acciones");		
		this.jLabelAccionesMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMarcaProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMarcaProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMarcaProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMarcaProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMarcaProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMarcaProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMarcaProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMarcaProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMarcaProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMarcaProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMarcaProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteMarcaProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMarcaProducto = new JButtonMe();
		//this.jButtonAnterioresMarcaProducto.setText("<<");
        this.jButtonAnterioresMarcaProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMarcaProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMarcaProducto = new JButtonMe();
		//this.jButtonSiguientesMarcaProducto.setText(">>");
        this.jButtonSiguientesMarcaProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMarcaProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMarcaProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMarcaProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosMarcaProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMarcaProducto,"nuevoguardarcambios_button","Nue",this.marcaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMarcaProducto";
		inputMap = this.jButtonNuevoGuardarCambiosMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMarcaProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMarcaProducto";
		inputMap = this.jButtonRecargarInformacionMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMarcaProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMarcaProducto";
		inputMap = this.jButtonSiguientesMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMarcaProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMarcaProducto";
		inputMap = this.jButtonAnterioresMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMarcaProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMarcaProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMarcaProducto.setMinimumSize(new Dimension(this.getWidth(),MarcaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MarcaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMarcaProducto.setMaximumSize(new Dimension(this.getWidth(),MarcaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MarcaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMarcaProducto.setPreferredSize(new Dimension(this.getWidth(),MarcaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MarcaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMarcaProducto = new GridBagLayout();

			this.jPanelPaginacionMarcaProducto.setLayout(gridaBagLayoutPaginacionMarcaProducto);						
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = 0;
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMarcaProducto.add(this.jButtonAnterioresMarcaProducto, this.gridBagConstraintsMarcaProducto);
					
						
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMarcaProducto.gridy = 0;
			
			this.jPanelPaginacionMarcaProducto.add(this.jButtonNuevoGuardarCambiosMarcaProducto, this.gridBagConstraintsMarcaProducto);
						
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMarcaProducto.gridy = 0;
			this.jPanelPaginacionMarcaProducto.add(this.jButtonSiguientesMarcaProducto, this.gridBagConstraintsMarcaProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = 1;
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMarcaProducto.add(this.jButtonNuevoMarcaProducto, this.gridBagConstraintsMarcaProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
				this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMarcaProducto.gridy = 1;
				this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionMarcaProducto.add(this.jButtonNuevoRelacionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
			}
			
			
			if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
				this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMarcaProducto.gridy = 1;
				this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMarcaProducto.add(this.jButtonGuardarCambiosTablaMarcaProducto, this.gridBagConstraintsMarcaProducto);
			}
			
			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = 1;
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMarcaProducto.add(this.jButtonDuplicarMarcaProducto, this.gridBagConstraintsMarcaProducto);
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = 1;
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMarcaProducto.add(this.jButtonCopiarMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = 1;
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMarcaProducto.add(this.jButtonVerFormMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = 1;
			this.gridBagConstraintsMarcaProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMarcaProducto.add(this.jButtonCerrarMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
		
		
		this.jButtonRecargarInformacionMarcaProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMarcaProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMarcaProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMarcaProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMarcaProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMarcaProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMarcaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMarcaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMarcaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMarcaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMarcaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMarcaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMarcaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMarcaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMarcaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMarcaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMarcaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMarcaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMarcaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMarcaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMarcaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMarcaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMarcaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMarcaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMarcaProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMarcaProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMarcaProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMarcaProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMarcaProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMarcaProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMarcaProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMarcaProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMarcaProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMarcaProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMarcaProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMarcaProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMarcaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMarcaProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MarcaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MarcaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MarcaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MarcaProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMarcaProducto.setLayout(gridaBagParametrosReportesMarcaProducto);
			this.jPanelParametrosReportesAccionesMarcaProducto.setLayout(gridaBagParametrosReportesAccionesMarcaProducto);
			
			
			this.jPanelParametrosAuxiliar1MarcaProducto.setLayout(gridaBagParametrosAuxiliar1MarcaProducto);
			this.jPanelParametrosAuxiliar2MarcaProducto.setLayout(gridaBagParametrosAuxiliar2MarcaProducto);
			this.jPanelParametrosAuxiliar3MarcaProducto.setLayout(gridaBagParametrosAuxiliar3MarcaProducto);
			this.jPanelParametrosAuxiliar4MarcaProducto.setLayout(gridaBagParametrosAuxiliar4MarcaProducto);
			//this.jPanelParametrosAuxiliar5MarcaProducto.setLayout(gridaBagParametrosAuxiliar2MarcaProducto);			
			
			
			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMarcaProducto.add(this.jButtonRecargarInformacionMarcaProducto, this.gridBagConstraintsMarcaProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MarcaProducto.add(this.jComboBoxTiposPaginacionMarcaProducto, this.gridBagConstraintsMarcaProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MarcaProducto.add(this.jCheckBoxConAltoMaximoTablaMarcaProducto, this.gridBagConstraintsMarcaProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MarcaProducto.add(this.jComboBoxTiposArchivosReportesMarcaProducto, this.gridBagConstraintsMarcaProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMarcaProducto.add(this.jPanelParametrosAuxiliar1MarcaProducto, this.gridBagConstraintsMarcaProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMarcaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MarcaProducto.add(this.jComboBoxTiposReportesMarcaProducto, this.gridBagConstraintsMarcaProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMarcaProducto.add(this.jPanelParametrosAuxiliar4MarcaProducto, this.gridBagConstraintsMarcaProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMarcaProducto.add(this.jComboBoxTiposReportesMarcaProducto, this.gridBagConstraintsMarcaProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMarcaProducto.add(this.jCheckBoxGenerarReporteMarcaProducto, this.gridBagConstraintsMarcaProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMarcaProducto.add(this.jPanelParametrosAuxiliar2MarcaProducto, this.gridBagConstraintsMarcaProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMarcaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMarcaProducto.add(this.jLabelAccionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
				this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMarcaProducto.add(this.jButtonAbrirOrderByMarcaProducto, this.gridBagConstraintsMarcaProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMarcaProducto.add(this.jComboBoxTiposSeleccionarMarcaProducto, this.gridBagConstraintsMarcaProducto);			
			
			
			/*
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMarcaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMarcaProducto.add(this.jCheckBoxSeleccionarTodosMarcaProducto, this.gridBagConstraintsMarcaProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMarcaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MarcaProducto.add(this.jCheckBoxSeleccionarTodosMarcaProducto, this.gridBagConstraintsMarcaProducto);															
				
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMarcaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MarcaProducto.add(this.jCheckBoxSeleccionadosMarcaProducto, this.gridBagConstraintsMarcaProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMarcaProducto.add(this.jPanelParametrosAuxiliar3MarcaProducto, this.gridBagConstraintsMarcaProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMarcaProducto.add(this.jComboBoxTiposRelacionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
				
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMarcaProducto.add(this.jComboBoxTiposAccionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
	
				
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMarcaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMarcaProducto.add(this.jTextFieldValorCampoGeneralMarcaProducto, this.gridBagConstraintsMarcaProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMarcaProducto = new GridBagLayout();

			this.jScrollPanelDatosMarcaProducto.setLayout(gridaBagLayoutDatosMarcaProducto);
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = 0;
			this.gridBagConstraintsMarcaProducto.gridx = 0;
			
			this.jScrollPanelDatosMarcaProducto.add(this.jTableDatosMarcaProducto, this.gridBagConstraintsMarcaProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMarcaProducto.setViewportView(this.jTableDatosMarcaProducto);
		this.jTableDatosMarcaProducto.setFillsViewportHeight(true);
		this.jTableDatosMarcaProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMarcaProducto= new GridBagLayout();
		this.jPanelAccionesMarcaProducto.setLayout(gridaBagLayoutAccionesMarcaProducto);
		
		
		/*	
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = 0;
		this.gridBagConstraintsMarcaProducto.gridx = 0;
			
		this.jPanelAccionesMarcaProducto.add(this.jButtonNuevoMarcaProducto, this.gridBagConstraintsMarcaProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoMarcaProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoMarcaProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoMarcaProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoMarcaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoMarcaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoMarcaProducto.setLayout(gridaBagLayoutBusquedaPorCodigoMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 0;
		gridBagConstraintsMarcaProducto.gridx = 0;
		jPanelBusquedaPorCodigoMarcaProducto.add(jLabelcodigoBusquedaPorCodigoMarcaProducto, gridBagConstraintsMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 0;
		gridBagConstraintsMarcaProducto.gridx = 1;
		jPanelBusquedaPorCodigoMarcaProducto.add(jTextFieldcodigoBusquedaPorCodigoMarcaProducto, gridBagConstraintsMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 1;
		gridBagConstraintsMarcaProducto.gridx =1;
		jPanelBusquedaPorCodigoMarcaProducto.add(jButtonBusquedaPorCodigoMarcaProducto, gridBagConstraintsMarcaProducto);

		jTabbedPaneBusquedasMarcaProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoMarcaProducto);
		jTabbedPaneBusquedasMarcaProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreMarcaProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreMarcaProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreMarcaProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreMarcaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreMarcaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreMarcaProducto.setLayout(gridaBagLayoutBusquedaPorNombreMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 0;
		gridBagConstraintsMarcaProducto.gridx = 0;
		jPanelBusquedaPorNombreMarcaProducto.add(jLabelnombreBusquedaPorNombreMarcaProducto, gridBagConstraintsMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 0;
		gridBagConstraintsMarcaProducto.gridx = 1;
		jPanelBusquedaPorNombreMarcaProducto.add(jTextAreanombreBusquedaPorNombreMarcaProducto, gridBagConstraintsMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 1;
		gridBagConstraintsMarcaProducto.gridx =1;
		jPanelBusquedaPorNombreMarcaProducto.add(jButtonBusquedaPorNombreMarcaProducto, gridBagConstraintsMarcaProducto);

		jTabbedPaneBusquedasMarcaProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreMarcaProducto);
		jTabbedPaneBusquedasMarcaProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoMarcaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoMarcaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoMarcaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoMarcaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoMarcaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoMarcaProducto.setLayout(gridaBagLayoutFK_IdTipoProductoMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 0;
		gridBagConstraintsMarcaProducto.gridx = 0;
		jPanelFK_IdTipoProductoMarcaProducto.add(jLabelid_tipo_productoFK_IdTipoProductoMarcaProducto, gridBagConstraintsMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 0;
		gridBagConstraintsMarcaProducto.gridx = 1;
		jPanelFK_IdTipoProductoMarcaProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoMarcaProducto, gridBagConstraintsMarcaProducto);

		gridBagConstraintsMarcaProducto = new GridBagConstraints();
		gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMarcaProducto.gridy = 1;
		gridBagConstraintsMarcaProducto.gridx =1;
		jPanelFK_IdTipoProductoMarcaProducto.add(jButtonFK_IdTipoProductoMarcaProducto, gridBagConstraintsMarcaProducto);

		jTabbedPaneBusquedasMarcaProducto.addTab("3.-Por Tipo Producto ", jPanelFK_IdTipoProductoMarcaProducto);
		jTabbedPaneBusquedasMarcaProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMarcaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMarcaProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.marcaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();						
			this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMarcaProducto.gridx = 0;		
			//this.gridBagConstraintsMarcaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMarcaProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMarcaProducto, this.gridBagConstraintsMarcaProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMarcaProducto.gridx = 0;		
		//this.gridBagConstraintsMarcaProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMarcaProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMarcaProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMarcaProducto.gridx = 0;		
			this.gridBagConstraintsMarcaProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMarcaProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMarcaProducto, this.gridBagConstraintsMarcaProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMarcaProducto, this.gridBagConstraintsMarcaProducto);								
		
		
		/*
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
		*/		
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMarcaProducto.gridx =0;
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMarcaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMarcaProducto, this.gridBagConstraintsMarcaProducto);
				
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMarcaProducto, this.gridBagConstraintsMarcaProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(MarcaProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMarcaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMarcaProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosMarcaProducto.setLayout(gridaBagLayoutBusquedasParametrosMarcaProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMarcaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMarcaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMarcaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMarcaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMarcaProducto, this.gridBagConstraintsMarcaProducto);
			
			
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
			
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMarcaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMarcaProducto, this.gridBagConstraintsMarcaProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMarcaProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMarcaProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMarcaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMarcaProducto.setName("jPanelReporteDinamicoMarcaProducto"); 
		
		this.jPanelReporteDinamicoMarcaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMarcaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMarcaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMarcaProducto.setLayout(gridaBagLayoutReporteDinamicoMarcaProducto);
		
		
		this.jInternalFrameReporteDinamicoMarcaProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMarcaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMarcaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMarcaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMarcaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMarcaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMarcaProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMarcaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMarcaProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoMarcaProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoMarcaProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMarcaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMarcaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMarcaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Marca Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMarcaProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteMarcaProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMarcaProducto.add(this.jLabelColumnasSelectReporteMarcaProducto, this.gridBagConstraintsMarcaProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMarcaProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteMarcaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMarcaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMarcaProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMarcaProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMarcaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMarcaProducto=new JScrollPane(this.jListColumnasSelectReporteMarcaProducto);
			
			this.jScrollColumnasSelectReporteMarcaProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMarcaProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMarcaProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMarcaProducto.add(this.jListColumnasSelectReporteMarcaProducto, this.gridBagConstraintsMarcaProducto);
		this.jPanelReporteDinamicoMarcaProducto.add(this.jScrollColumnasSelectReporteMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMarcaProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteMarcaProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMarcaProducto.add(this.jLabelRelacionesSelectReporteMarcaProducto, this.gridBagConstraintsMarcaProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMarcaProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteMarcaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMarcaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMarcaProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMarcaProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMarcaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMarcaProducto=new JScrollPane(this.jListRelacionesSelectReporteMarcaProducto);
			
			this.jScrollRelacionesSelectReporteMarcaProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMarcaProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMarcaProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMarcaProducto.add(this.jListRelacionesSelectReporteMarcaProducto, this.gridBagConstraintsMarcaProducto);
		this.jPanelReporteDinamicoMarcaProducto.add(this.jScrollRelacionesSelectReporteMarcaProducto, this.gridBagConstraintsMarcaProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoMarcaProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMarcaProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoMarcaProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMarcaProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMarcaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMarcaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMarcaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMarcaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMarcaProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMarcaProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMarcaProducto.add(this.jLabelGenerarExcelReporteDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMarcaProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMarcaProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMarcaProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMarcaProducto.setToolTipText("Generar EXCEL"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		//this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMarcaProducto.add(this.jButtonGenerarExcelReporteDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMarcaProducto.add(this.jComboBoxTiposReportesDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMarcaProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMarcaProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMarcaProducto.add(this.jLabelTiposArchivoReporteDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMarcaProducto.add(this.jComboBoxTiposArchivosReportesDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMarcaProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMarcaProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMarcaProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMarcaProducto.setToolTipText("Generar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMarcaProducto.add(this.jButtonGenerarReporteDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMarcaProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMarcaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMarcaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMarcaProducto.setToolTipText("Cancelar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMarcaProducto.add(this.jButtonCerrarReporteDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMarcaProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMarcaProducto= new JScrollPane(jPanelReporteDinamicoMarcaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMarcaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMarcaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMarcaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Marca Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMarcaProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMarcaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMarcaProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMarcaProducto);
		this.jInternalFrameReporteDinamicoMarcaProducto.getContentPane().add(this.jScrollPanelReporteDinamicoMarcaProducto, this.gridBagConstraintsMarcaProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMarcaProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMarcaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMarcaProducto.setName("jPanelImportacionMarcaProducto"); 
		
		this.jPanelImportacionMarcaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMarcaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMarcaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMarcaProducto.setLayout(gridaBagLayoutImportacionMarcaProducto);
		
		
		this.jInternalFrameImportacionMarcaProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMarcaProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMarcaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMarcaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMarcaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMarcaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMarcaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMarcaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMarcaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMarcaProducto.setResizable(true);
	    this.jInternalFrameImportacionMarcaProducto.setClosable(true);
	    this.jInternalFrameImportacionMarcaProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMarcaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMarcaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMarcaProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMarcaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMarcaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMarcaProducto.setResizable(true);
	    this.jInternalFrameImportacionMarcaProducto.setClosable(true);
	    this.jInternalFrameImportacionMarcaProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMarcaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMarcaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMarcaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Marca Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMarcaProducto = new JLabelMe();

		this.jLabelArchivoImportacionMarcaProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMarcaProducto.add(this.jLabelArchivoImportacionMarcaProducto, this.gridBagConstraintsMarcaProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMarcaProducto = new JFileChooser();		
		this.jFileChooserImportacionMarcaProducto.setToolTipText("ESCOGER ARCHIVO"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMarcaProducto = new JButtonMe();
		this.jButtonAbrirImportacionMarcaProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMarcaProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMarcaProducto.setToolTipText("Generar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMarcaProducto.add(this.jButtonAbrirImportacionMarcaProducto, this.gridBagConstraintsMarcaProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMarcaProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionMarcaProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMarcaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMarcaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMarcaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsMarcaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMarcaProducto.add(this.jLabelPathArchivoImportacionMarcaProducto, this.gridBagConstraintsMarcaProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMarcaProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMarcaProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMarcaProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMarcaProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMarcaProducto.add(this.jTextFieldPathArchivoImportacionMarcaProducto, this.gridBagConstraintsMarcaProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMarcaProducto = new JButtonMe();
		this.jButtonGenerarImportacionMarcaProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMarcaProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMarcaProducto.setToolTipText("Generar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMarcaProducto.add(this.jButtonGenerarImportacionMarcaProducto, this.gridBagConstraintsMarcaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMarcaProducto = new JButtonMe();
		this.jButtonCerrarImportacionMarcaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMarcaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMarcaProducto.setToolTipText("Cancelar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMarcaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsMarcaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMarcaProducto.add(this.jButtonCerrarImportacionMarcaProducto, this.gridBagConstraintsMarcaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMarcaProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionMarcaProducto= new JScrollPane(jPanelImportacionMarcaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
		this.gridBagConstraintsMarcaProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsMarcaProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMarcaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMarcaProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMarcaProducto);
		this.jInternalFrameImportacionMarcaProducto.getContentPane().add(this.jScrollPanelImportacionMarcaProducto, this.gridBagConstraintsMarcaProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMarcaProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMarcaProducto = new JButtonMe();
			this.jButtonAbrirOrderByMarcaProducto.setText("Orden");
			this.jButtonAbrirOrderByMarcaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMarcaProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMarcaProducto";
			inputMap = this.jButtonAbrirOrderByMarcaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMarcaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMarcaProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByMarcaProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMarcaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMarcaProducto.setName("jPanelOrderByMarcaProducto"); 
			
			this.jPanelOrderByMarcaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMarcaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMarcaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMarcaProducto.setLayout(gridaBagLayoutOrderByMarcaProducto);
			
			
			this.jTableDatosMarcaProductoOrderBy = new JTableMe();        
			this.jTableDatosMarcaProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMarcaProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMarcaProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMarcaProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMarcaProductoOrderBy.setViewportView(this.jTableDatosMarcaProductoOrderBy);
			this.jTableDatosMarcaProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMarcaProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMarcaProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMarcaProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMarcaProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMarcaProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMarcaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMarcaProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMarcaProducto.setTitle("Orden");
			this.jInternalFrameOrderByMarcaProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMarcaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMarcaProducto.setResizable(true);
			this.jInternalFrameOrderByMarcaProducto.setClosable(true);
			this.jInternalFrameOrderByMarcaProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMarcaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMarcaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMarcaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMarcaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Marca Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMarcaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMarcaProducto.ipady =150;
				
			this.jPanelOrderByMarcaProducto.add(jScrollPanelDatosMarcaProductoOrderBy, this.gridBagConstraintsMarcaProducto);//this.jTableDatosMarcaProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMarcaProducto = new JButtonMe();
			this.jButtonCerrarOrderByMarcaProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMarcaProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMarcaProducto.setToolTipText("Cancelar"+" "+MarcaProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMarcaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMarcaProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMarcaProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMarcaProducto.add(this.jButtonCerrarOrderByMarcaProducto, this.gridBagConstraintsMarcaProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMarcaProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByMarcaProducto= new JScrollPane(jPanelOrderByMarcaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMarcaProducto = new GridBagConstraints();
			this.gridBagConstraintsMarcaProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsMarcaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsMarcaProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMarcaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMarcaProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMarcaProducto);
			
			this.jInternalFrameOrderByMarcaProducto.getContentPane().add(this.jScrollPanelOrderByMarcaProducto, this.gridBagConstraintsMarcaProducto);			
		
		} else {
			this.jButtonAbrirOrderByMarcaProducto = new JButtonMe();
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
			&& this.marcaproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMarcaProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMarcaProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMarcaProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMarcaProducto.getRowHeight();//MarcaProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MarcaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMarcaProducto.isSelected()) {
					iHeightTable=MarcaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MarcaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MarcaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MarcaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMarcaProducto.isSelected()) {
					iHeightTable=MarcaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MarcaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MarcaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMarcaProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMarcaProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMarcaProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMarcaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMarcaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMarcaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMarcaProducto!=null && this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.marcaproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMarcaProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMarcaProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMarcaProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMarcaProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMarcaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMarcaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMarcaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=marcaproductoLogic.getMarcaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=marcaproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MarcaProducto> TraerMarcaProductoBeans(List<MarcaProducto> marcaproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(MarcaProducto marcaproducto:marcaproductos) {
					
				if(!(MarcaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MarcaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					marcaproducto.setsDetalleGeneralEntityReporte(MarcaProductoConstantesFunciones.getMarcaProductoDescripcion(marcaproducto));
										
						
					
					

					if(marcaproducto.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{marcaproducto.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(marcaproducto.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(marcaproducto.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{marcaproducto.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(marcaproducto.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//marcaproducto.setsDetalleGeneralEntityReporte(marcaproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//marcaproductobeans.add(marcaproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return marcaproductos;
    }
	//PARA REPORTES FIN
}
