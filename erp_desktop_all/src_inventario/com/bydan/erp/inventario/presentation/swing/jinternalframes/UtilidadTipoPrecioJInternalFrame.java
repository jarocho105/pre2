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
import com.bydan.erp.inventario.util.UtilidadTipoPrecioConstantesFunciones;

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
public class UtilidadTipoPrecioJInternalFrame extends UtilidadTipoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUtilidadTipoPrecio;
	
	protected JMenuBar jmenuBarUtilidadTipoPrecio;
	
	protected JMenu jmenuUtilidadTipoPrecio;
	protected JMenu jmenuDatosUtilidadTipoPrecio;
	protected JMenu jmenuArchivoUtilidadTipoPrecio;
	protected JMenu jmenuAccionesUtilidadTipoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadTipoPrecio;	
	protected GridBagConstraints gridBagConstraintsUtilidadTipoPrecio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UtilidadTipoPrecioDetalleFormJInternalFrame jInternalFrameDetalleFormUtilidadTipoPrecio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUtilidadTipoPrecio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUtilidadTipoPrecio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";
	
	public UtilidadTipoPrecioSessionBean utilidadtipoprecioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UtilidadTipoPrecio> utilidadtipoprecios;		
	public List<UtilidadTipoPrecio> utilidadtipopreciosEliminados;	
	public List<UtilidadTipoPrecio> utilidadtipopreciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUtilidadTipoPrecio;		
	protected JButton jButtonAbrirOrderByUtilidadTipoPrecio;
	
	
	//protected JPanel jPanelOrderByUtilidadTipoPrecio;
	//public JScrollPane jScrollPanelOrderByUtilidadTipoPrecio;	
	//protected JButton jButtonCerrarOrderByUtilidadTipoPrecio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UtilidadTipoPrecioLogic utilidadtipoprecioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUtilidadTipoPrecio;
	public JScrollPane jScrollPanelDatosEdicionUtilidadTipoPrecio;
	public JScrollPane jScrollPanelDatosGeneralUtilidadTipoPrecio;
    
	
	
	//public JScrollPane jScrollPanelDatosUtilidadTipoPrecioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUtilidadTipoPrecio;
	//public JScrollPane jScrollPanelImportacionUtilidadTipoPrecio;
	
	
	
	protected JPanel jPanelAccionesUtilidadTipoPrecio;
	
    protected JPanel jPanelPaginacionUtilidadTipoPrecio;
    protected JPanel jPanelParametrosReportesUtilidadTipoPrecio;
	protected JPanel jPanelParametrosReportesAccionesUtilidadTipoPrecio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UtilidadTipoPrecio;
	protected JPanel jPanelParametrosAuxiliar2UtilidadTipoPrecio;
	protected JPanel jPanelParametrosAuxiliar3UtilidadTipoPrecio;
	protected JPanel jPanelParametrosAuxiliar4UtilidadTipoPrecio;
	//protected JPanel jPanelParametrosAuxiliar5UtilidadTipoPrecio;
	
	
	
	//protected JPanel jPanelReporteDinamicoUtilidadTipoPrecio;
	//protected JPanel jPanelImportacionUtilidadTipoPrecio;
	
	
	public JTable jTableDatosUtilidadTipoPrecio;
	
	
	
	//public JTable jTableDatosUtilidadTipoPrecioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUtilidadTipoPrecio;
	protected JButton jButtonDuplicarUtilidadTipoPrecio;
	protected JButton jButtonCopiarUtilidadTipoPrecio;
	protected JButton jButtonVerFormUtilidadTipoPrecio;
	protected JButton jButtonNuevoRelacionesUtilidadTipoPrecio;
	protected JButton jButtonModificarUtilidadTipoPrecio;
	
    protected JButton jButtonGuardarCambiosTablaUtilidadTipoPrecio;
	protected JButton jButtonCerrarUtilidadTipoPrecio;
	
	
	protected JButton jButtonRecargarInformacionUtilidadTipoPrecio;
	protected JButton jButtonProcesarInformacionUtilidadTipoPrecio;
	
	
	protected JButton jButtonAnterioresUtilidadTipoPrecio;
	protected JButton jButtonSiguientesUtilidadTipoPrecio;
	protected JButton jButtonNuevoGuardarCambiosUtilidadTipoPrecio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUtilidadTipoPrecio;
	//protected JButton jButtonCerrarReporteDinamicoUtilidadTipoPrecio;
	//protected JButton jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio;	
	
	
	
	//protected JButton jButtonAbrirImportacionUtilidadTipoPrecio;
	//protected JButton jButtonGenerarImportacionUtilidadTipoPrecio;
	//protected JButton jButtonCerrarImportacionUtilidadTipoPrecio;
	//protected JFileChooser jFileChooserImportacionUtilidadTipoPrecio;
	//protected File fileImportacionUtilidadTipoPrecio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadTipoPrecio;
	protected JButton jButtonDuplicarToolBarUtilidadTipoPrecio;
	protected JButton jButtonNuevoRelacionesToolBarUtilidadTipoPrecio;
	
	
	public JButton jButtonGuardarCambiosToolBarUtilidadTipoPrecio;
	protected JButton jButtonCopiarToolBarUtilidadTipoPrecio;
	protected JButton jButtonVerFormToolBarUtilidadTipoPrecio;
	public JButton jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadTipoPrecio;
	protected JButton jButtonCerrarToolBarUtilidadTipoPrecio;
	
	protected JButton jButtonRecargarInformacionToolBarUtilidadTipoPrecio;
	protected JButton jButtonProcesarInformacionToolBarUtilidadTipoPrecio;
	protected JButton jButtonAnterioresToolBarUtilidadTipoPrecio;
	protected JButton jButtonSiguientesToolBarUtilidadTipoPrecio;
	protected JButton jButtonNuevoGuardarCambiosToolBarUtilidadTipoPrecio;
	protected JButton jButtonAbrirOrderByToolBarUtilidadTipoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadTipoPrecio;
	protected JMenuItem jMenuItemDuplicarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemNuevoRelacionesUtilidadTipoPrecio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUtilidadTipoPrecio;
	protected JMenuItem jMenuItemCopiarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemVerFormUtilidadTipoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadTipoPrecio;
	protected JMenuItem jMenuItemCerrarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadTipoPrecio;
	
	protected JMenuItem jMenuItemRecargarInformacionUtilidadTipoPrecio;
	protected JMenuItem jMenuItemProcesarInformacionUtilidadTipoPrecio;
	protected JMenuItem jMenuItemAnterioresUtilidadTipoPrecio;
	protected JMenuItem jMenuItemSiguientesUtilidadTipoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio;
	protected JMenuItem jMenuItemAbrirOrderByUtilidadTipoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadTipoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadTipoPrecio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUtilidadTipoPrecio;
	protected JCheckBox jCheckBoxSeleccionadosUtilidadTipoPrecio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio;
	protected JCheckBox jCheckBoxConGraficoReporteUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUtilidadTipoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUtilidadTipoPrecio;
	protected JTextField jTextFieldValorCampoGeneralUtilidadTipoPrecio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUtilidadTipoPrecio;
	//public JList<Reporte> jListColumnasSelectReporteUtilidadTipoPrecio;
	//public JScrollPane jScrollColumnasSelectReporteUtilidadTipoPrecio;
	
	//public JLabel jLabelRelacionesSelectReporteUtilidadTipoPrecio;
	//public JList<Reporte> jListRelacionesSelectReporteUtilidadTipoPrecio;
	//public JScrollPane jScrollRelacionesSelectReporteUtilidadTipoPrecio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUtilidadTipoPrecio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUtilidadTipoPrecio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUtilidadTipoPrecio;
	//public JLabel jLabelTiposArchivoReporteDinamicoUtilidadTipoPrecio;
	
		
	//public JLabel jLabelArchivoImportacionUtilidadTipoPrecio;	
	//public JLabel jLabelPathArchivoImportacionUtilidadTipoPrecio;
	//protected JTextField jTextFieldPathArchivoImportacionUtilidadTipoPrecio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUtilidadTipoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio;
	
	//public JLabel jLabelColumnaCategoriaValorUtilidadTipoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUtilidadTipoPrecio;
	
	//public JLabel jLabelColumnasValoresGraficoUtilidadTipoPrecio;
	//public JList<Reporte> jListColumnasValoresGraficoUtilidadTipoPrecio;
	//public JScrollPane jScrollColumnasValoresGraficoUtilidadTipoPrecio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUtilidadTipoPrecio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUtilidadTipoPrecio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUtilidadTipoPrecio;
	public JPanel jPanelFK_IdTipoPrecioUtilidadTipoPrecio;
	public JButton jButtonFK_IdTipoPrecioUtilidadTipoPrecio;
	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public UtilidadTipoPrecioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadTipoPrecioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadTipoPrecioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadTipoPrecioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUtilidadTipoPrecio)	{
		this.jButtonRecargarInformacionUtilidadTipoPrecio = jButtonRecargarInformacionUtilidadTipoPrecio;
	}
	
	public JButton getjButtonProcesarInformacionUtilidadTipoPrecio() {
		return this.jButtonProcesarInformacionUtilidadTipoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadTipoPrecio)	{
		this.jButtonProcesarInformacionUtilidadTipoPrecio = jButtonProcesarInformacionUtilidadTipoPrecio;
	}
	
	
	public JButton getjButtonRecargarInformacionUtilidadTipoPrecio() {
		return this.jButtonRecargarInformacionUtilidadTipoPrecio;
	}
	
	
	public List<UtilidadTipoPrecio> getutilidadtipoprecios() {
		return this.utilidadtipoprecios;
	}

	public void setutilidadtipoprecios(List<UtilidadTipoPrecio> utilidadtipoprecios) {
		this.utilidadtipoprecios = utilidadtipoprecios;
	}
	
	public List<UtilidadTipoPrecio> getutilidadtipopreciosAux() {
		return this.utilidadtipopreciosAux;
	}

	public void setutilidadtipopreciosAux(List<UtilidadTipoPrecio> utilidadtipopreciosAux) {
		this.utilidadtipopreciosAux = utilidadtipopreciosAux;
	}
	
	public List<UtilidadTipoPrecio> getutilidadtipopreciosEliminados() {
		return this.utilidadtipopreciosEliminados;
	}

	public void setUtilidadTipoPreciosEliminados(List<UtilidadTipoPrecio> utilidadtipopreciosEliminados) {
		this.utilidadtipopreciosEliminados = utilidadtipopreciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUtilidadTipoPrecio() {
		return jComboBoxTiposSeleccionarUtilidadTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUtilidadTipoPrecio(
			JComboBox jComboBoxTiposSeleccionarUtilidadTipoPrecio) {
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio = jComboBoxTiposSeleccionarUtilidadTipoPrecio;
	}
	
	public void setBorderResaltarTiposSeleccionarUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUtilidadTipoPrecio() {
		return jTextFieldValorCampoGeneralUtilidadTipoPrecio;
	}

	public void setjTextFieldValorCampoGeneralUtilidadTipoPrecio(
			JTextField jTextFieldValorCampoGeneralUtilidadTipoPrecio) {
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio = jTextFieldValorCampoGeneralUtilidadTipoPrecio;
	}

	public void setBorderResaltarValorCampoGeneralUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUtilidadTipoPrecio() {
		return this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio;
	}

	public void setjCheckBoxSeleccionarTodosUtilidadTipoPrecio(
			JCheckBox jCheckBoxSeleccionarTodosUtilidadTipoPrecio) {
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio = jCheckBoxSeleccionarTodosUtilidadTipoPrecio;
	}

	public void setBorderResaltarSeleccionarTodosUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUtilidadTipoPrecio() {
		return this.jCheckBoxSeleccionadosUtilidadTipoPrecio;
	}

	public void setjCheckBoxSeleccionadosUtilidadTipoPrecio(
			JCheckBox jCheckBoxSeleccionadosUtilidadTipoPrecio) {
		this.jCheckBoxSeleccionadosUtilidadTipoPrecio = jCheckBoxSeleccionadosUtilidadTipoPrecio;
	}
	
	public void setBorderResaltarSeleccionadosUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUtilidadTipoPrecio() {
		return this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUtilidadTipoPrecio(
			JComboBox jComboBoxTiposArchivosReportesUtilidadTipoPrecio) {
		this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio = jComboBoxTiposArchivosReportesUtilidadTipoPrecio;
	}

	public void setBorderResaltarTiposArchivosReportesUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUtilidadTipoPrecio() {
		return this.jComboBoxTiposReportesUtilidadTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUtilidadTipoPrecio(
			JComboBox jComboBoxTiposReportesUtilidadTipoPrecio) {
		this.jComboBoxTiposReportesUtilidadTipoPrecio = jComboBoxTiposReportesUtilidadTipoPrecio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUtilidadTipoPrecio() {
	//	return jComboBoxTiposReportesDinamicoUtilidadTipoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUtilidadTipoPrecio(
	//		JComboBox jComboBoxTiposReportesDinamicoUtilidadTipoPrecio) {
	//	this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio = jComboBoxTiposReportesDinamicoUtilidadTipoPrecio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio() {
	//	return jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio = jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio;
	//}
	
	public void setBorderResaltarTiposReportesUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUtilidadTipoPrecio() {
		return this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUtilidadTipoPrecio(
			JComboBox jComboBoxTiposGraficosReportesUtilidadTipoPrecio) {
		this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio = jComboBoxTiposGraficosReportesUtilidadTipoPrecio;
	}
	
	public void setBorderResaltarTiposGraficosReportesUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUtilidadTipoPrecio() {
		return this.jComboBoxTiposPaginacionUtilidadTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUtilidadTipoPrecio(
			JComboBox jComboBoxTiposPaginacionUtilidadTipoPrecio) {
		this.jComboBoxTiposPaginacionUtilidadTipoPrecio = jComboBoxTiposPaginacionUtilidadTipoPrecio;
	}
	
	public void setBorderResaltarTiposPaginacionUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUtilidadTipoPrecio() {
		return this.jComboBoxTiposRelacionesUtilidadTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadTipoPrecio() {
		return this.jComboBoxTiposAccionesUtilidadTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadTipoPrecio(
			JComboBox jComboBoxTiposRelacionesUtilidadTipoPrecio) {
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio = jComboBoxTiposRelacionesUtilidadTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadTipoPrecio(
			JComboBox jComboBoxTiposAccionesUtilidadTipoPrecio) {
		this.jComboBoxTiposAccionesUtilidadTipoPrecio = jComboBoxTiposAccionesUtilidadTipoPrecio;
	}
	
	public void setBorderResaltarTiposRelacionesUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUtilidadTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUtilidadTipoPrecio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUtilidadTipoPrecio() {
	//	return jCheckBoxConGraficoDinamicoUtilidadTipoPrecio;
	//}

	//public void setjCheckBoxConGraficoDinamicoUtilidadTipoPrecio(
	//		JCheckBox jCheckBoxConGraficoDinamicoUtilidadTipoPrecio) {
	//	this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio = jCheckBoxConGraficoDinamicoUtilidadTipoPrecio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUtilidadTipoPrecio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUtilidadTipoPrecio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio .setBorder(borderResaltar);		
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
		this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		
		this.utilidadtipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadtipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadTipoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidad Tipo Precio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
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
		
		UtilidadTipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUtilidadTipoPrecio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"nuevo","nuevo","Nuevo"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"duplicar","duplicar","Duplicar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"copiar","copiar","Copiar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"ver_form","ver_form","Ver"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"recargar","recargar","Recargar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUtilidadTipoPrecio,this.jTtoolBarUtilidadTipoPrecio,
							"cerrar","cerrar","Salir"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUtilidadTipoPrecio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUtilidadTipoPrecio;
			
				this.jButtonProcesarInformacionToolBarUtilidadTipoPrecio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUtilidadTipoPrecio;
				
		//protected JButton jButtonModificarToolBarUtilidadTipoPrecio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUtilidadTipoPrecio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUtilidadTipoPrecio=new JMenuMe("General");
		this.jmenuArchivoUtilidadTipoPrecio=new JMenuMe("Archivo");
		this.jmenuAccionesUtilidadTipoPrecio=new JMenuMe("Acciones");
		this.jmenuDatosUtilidadTipoPrecio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadTipoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadTipoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadTipoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUtilidadTipoPrecio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUtilidadTipoPrecio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUtilidadTipoPrecio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUtilidadTipoPrecio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUtilidadTipoPrecio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUtilidadTipoPrecio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUtilidadTipoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadTipoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadTipoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUtilidadTipoPrecio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUtilidadTipoPrecio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUtilidadTipoPrecio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUtilidadTipoPrecio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUtilidadTipoPrecio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUtilidadTipoPrecio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUtilidadTipoPrecio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUtilidadTipoPrecio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUtilidadTipoPrecio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUtilidadTipoPrecio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUtilidadTipoPrecio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUtilidadTipoPrecio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUtilidadTipoPrecio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUtilidadTipoPrecio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUtilidadTipoPrecio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUtilidadTipoPrecio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUtilidadTipoPrecio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUtilidadTipoPrecio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUtilidadTipoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUtilidadTipoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUtilidadTipoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUtilidadTipoPrecio.add(this.jMenuItemCerrarUtilidadTipoPrecio);
			
			this.jmenuAccionesUtilidadTipoPrecio.add(this.jMenuItemNuevoUtilidadTipoPrecio);
			this.jmenuAccionesUtilidadTipoPrecio.add(this.jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio);
			this.jmenuAccionesUtilidadTipoPrecio.add(this.jMenuItemNuevoRelacionesUtilidadTipoPrecio);
			this.jmenuAccionesUtilidadTipoPrecio.add(this.jMenuItemGuardarCambiosTablaUtilidadTipoPrecio);		
			this.jmenuAccionesUtilidadTipoPrecio.add(this.jMenuItemDuplicarUtilidadTipoPrecio);		
			this.jmenuAccionesUtilidadTipoPrecio.add(this.jMenuItemCopiarUtilidadTipoPrecio);		
			this.jmenuAccionesUtilidadTipoPrecio.add(this.jMenuItemVerFormUtilidadTipoPrecio);		
			
			this.jmenuDatosUtilidadTipoPrecio.add(this.jMenuItemRecargarInformacionUtilidadTipoPrecio);				
			this.jmenuDatosUtilidadTipoPrecio.add(this.jMenuItemAnterioresUtilidadTipoPrecio);				
			this.jmenuDatosUtilidadTipoPrecio.add(this.jMenuItemSiguientesUtilidadTipoPrecio);				
			this.jmenuDatosUtilidadTipoPrecio.add(this.jMenuItemAbrirOrderByUtilidadTipoPrecio);				
			this.jmenuDatosUtilidadTipoPrecio.add(this.jMenuItemMostrarOcultarUtilidadTipoPrecio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUtilidadTipoPrecio.add(this.jMenuItemGuardarCambiosUtilidadTipoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUtilidadTipoPrecio.add(this.jmenuArchivoUtilidadTipoPrecio);		
			this.jmenuBarUtilidadTipoPrecio.add(this.jmenuAccionesUtilidadTipoPrecio);		
			this.jmenuBarUtilidadTipoPrecio.add(this.jmenuDatosUtilidadTipoPrecio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUtilidadTipoPrecio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUtilidadTipoPrecio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoPrecioUtilidadTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioUtilidadTipoPrecio.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioUtilidadTipoPrecio= new JButtonMe();
		this.jButtonFK_IdTipoPrecioUtilidadTipoPrecio.setText("Buscar");
		this.jButtonFK_IdTipoPrecioUtilidadTipoPrecio.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioUtilidadTipoPrecio,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUtilidadTipoPrecio=new JTabbedPane();


		this.jTabbedPaneBusquedasUtilidadTipoPrecio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadTipoPrecio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadTipoPrecio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUtilidadTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUtilidadTipoPrecio = new UtilidadTipoPrecioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Utilidad Tipo Precio DATOS");
			this.jInternalFrameDetalleFormUtilidadTipoPrecio = new UtilidadTipoPrecioDetalleFormJInternalFrame(jDesktopPane,this.utilidadtipoprecioSessionBean.getConGuardarRelaciones(),this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUtilidadTipoPrecio = null;//new UtilidadTipoPrecioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadTipoPrecio= new GridBagLayout();
		
		
		this.jTableDatosUtilidadTipoPrecio = new JTableMe();      
		
		String sToolTipUtilidadTipoPrecio="";
		sToolTipUtilidadTipoPrecio=UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadTipoPrecio+="(Inventario.UtilidadTipoPrecio)";
		}
		
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadTipoPrecio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUtilidadTipoPrecio.setToolTipText(sToolTipUtilidadTipoPrecio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUtilidadTipoPrecio);
		this.jTableDatosUtilidadTipoPrecio.setAutoCreateRowSorter(true);
		this.jTableDatosUtilidadTipoPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUtilidadTipoPrecio.setRowSelectionAllowed(true);
		this.jTableDatosUtilidadTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUtilidadTipoPrecio = new JButtonMe();
		this.jButtonDuplicarUtilidadTipoPrecio = new JButtonMe();
		this.jButtonCopiarUtilidadTipoPrecio = new JButtonMe();
		this.jButtonVerFormUtilidadTipoPrecio = new JButtonMe();
		this.jButtonNuevoRelacionesUtilidadTipoPrecio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio = new JButtonMe();
		this.jButtonCerrarUtilidadTipoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadTipoPrecio = new JScrollPane();   
        this.jScrollPanelDatosGeneralUtilidadTipoPrecio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidad Tipo Precio";
		
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Tipo Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadTipoPrecio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUtilidadTipoPrecio=new ReporteDinamicoJInternalFrame(UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUtilidadTipoPrecio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUtilidadTipoPrecio=new ImportacionJInternalFrame(UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUtilidadTipoPrecio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUtilidadTipoPrecio = new JButtonMe();
		
		this.jButtonAbrirOrderByUtilidadTipoPrecio.setText("Orden");
		this.jButtonAbrirOrderByUtilidadTipoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadTipoPrecio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadTipoPrecio,false,this);
			
			//this.cargarOrderByUtilidadTipoPrecio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadTipoPrecio,true,this);
			
			//this.cargarOrderByUtilidadTipoPrecio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUtilidadTipoPrecio.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosUtilidadTipoPrecio.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosUtilidadTipoPrecio.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosUtilidadTipoPrecio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadTipoPrecio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadTipoPrecio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUtilidadTipoPrecio.setText("Nuevo");
		this.jButtonDuplicarUtilidadTipoPrecio.setText("Duplicar");
		this.jButtonCopiarUtilidadTipoPrecio.setText("Copiar");
		this.jButtonVerFormUtilidadTipoPrecio.setText("Ver");
		this.jButtonNuevoRelacionesUtilidadTipoPrecio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.setText("Guardar");
		this.jButtonCerrarUtilidadTipoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadTipoPrecio,"nuevo_button","Nuevo",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUtilidadTipoPrecio,"duplicar_button","Duplicar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUtilidadTipoPrecio,"copiar_button","Copiar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUtilidadTipoPrecio,"ver_form","Ver",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUtilidadTipoPrecio,"nuevorelaciones_button","Nuevo Rel",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadTipoPrecio,"guardarcambiostabla_button","Guardar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadTipoPrecio,"cerrar_button","Salir",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUtilidadTipoPrecio.setToolTipText("Nuevo"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUtilidadTipoPrecio.setToolTipText("Duplicar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUtilidadTipoPrecio.setToolTipText("Copiar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUtilidadTipoPrecio.setToolTipText("Ver"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUtilidadTipoPrecio.setToolTipText("Nuevo Rel"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.setToolTipText("Guardar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadTipoPrecio.setToolTipText("Salir"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadTipoPrecio";
		inputMap = this.jButtonNuevoUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadTipoPrecio"));
		
		//DUPLICAR
		sMapKey = "DuplicarUtilidadTipoPrecio";
		inputMap = this.jButtonDuplicarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUtilidadTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUtilidadTipoPrecio"));
		
		//COPIAR
		sMapKey = "CopiarUtilidadTipoPrecio";
		inputMap = this.jButtonCopiarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUtilidadTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUtilidadTipoPrecio"));
		
		//VEr FORM
		sMapKey = "VerFormUtilidadTipoPrecio";
		inputMap = this.jButtonVerFormUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUtilidadTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUtilidadTipoPrecio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUtilidadTipoPrecio";
		inputMap = this.jButtonNuevoRelacionesUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUtilidadTipoPrecio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUtilidadTipoPrecio";
		inputMap = this.jButtonModificarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUtilidadTipoPrecio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUtilidadTipoPrecio";
		inputMap = this.jButtonCerrarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadTipoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadTipoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadTipoPrecio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UtilidadTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UtilidadTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UtilidadTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UtilidadTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UtilidadTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUtilidadTipoPrecio.setName("jPanelParametrosReportesUtilidadTipoPrecio"); 
		
		this.jPanelParametrosReportesAccionesUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUtilidadTipoPrecio.setName("jPanelParametrosReportesAccionesUtilidadTipoPrecio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUtilidadTipoPrecio = new JButtonMe();
		this.jButtonRecargarInformacionUtilidadTipoPrecio.setText("Recargar");
		this.jButtonRecargarInformacionUtilidadTipoPrecio.setToolTipText("Recargar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUtilidadTipoPrecio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUtilidadTipoPrecio = new JButtonMe();
		this.jButtonProcesarInformacionUtilidadTipoPrecio.setText("Procesar");
		this.jButtonProcesarInformacionUtilidadTipoPrecio.setToolTipText("Procesar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUtilidadTipoPrecio.setVisible(false);
			
		this.jButtonProcesarInformacionUtilidadTipoPrecio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadTipoPrecio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadTipoPrecio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposReportesUtilidadTipoPrecio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUtilidadTipoPrecio.setText("Paginacion");
		this.jComboBoxTiposPaginacionUtilidadTipoPrecio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUtilidadTipoPrecio.setText("Accion");
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadTipoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.setText("Accion");
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadTipoPrecio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUtilidadTipoPrecio = new JLabelMe();
		
		this.jLabelAccionesUtilidadTipoPrecio.setText("Acciones");		
		this.jLabelAccionesUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUtilidadTipoPrecio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUtilidadTipoPrecio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUtilidadTipoPrecio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUtilidadTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUtilidadTipoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoReporteUtilidadTipoPrecio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUtilidadTipoPrecio = new JButtonMe();
		//this.jButtonAnterioresUtilidadTipoPrecio.setText("<<");
        this.jButtonAnterioresUtilidadTipoPrecio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUtilidadTipoPrecio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUtilidadTipoPrecio = new JButtonMe();
		//this.jButtonSiguientesUtilidadTipoPrecio.setText(">>");
        this.jButtonSiguientesUtilidadTipoPrecio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUtilidadTipoPrecio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio.setText("Nue");
        this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio,"nuevoguardarcambios_button","Nue",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUtilidadTipoPrecio";
		inputMap = this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUtilidadTipoPrecio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUtilidadTipoPrecio";
		inputMap = this.jButtonRecargarInformacionUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUtilidadTipoPrecio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUtilidadTipoPrecio";
		inputMap = this.jButtonSiguientesUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUtilidadTipoPrecio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUtilidadTipoPrecio";
		inputMap = this.jButtonAnterioresUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUtilidadTipoPrecio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUtilidadTipoPrecio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUtilidadTipoPrecio.setMinimumSize(new Dimension(this.getWidth(),UtilidadTipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadTipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadTipoPrecio.setMaximumSize(new Dimension(this.getWidth(),UtilidadTipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadTipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadTipoPrecio.setPreferredSize(new Dimension(this.getWidth(),UtilidadTipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadTipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUtilidadTipoPrecio = new GridBagLayout();

			this.jPanelPaginacionUtilidadTipoPrecio.setLayout(gridaBagLayoutPaginacionUtilidadTipoPrecio);						
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonAnterioresUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
					
						
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
			
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonNuevoGuardarCambiosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
						
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonSiguientesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 1;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonNuevoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
						
			
			
			if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUtilidadTipoPrecio.gridy = 1;
				this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonGuardarCambiosTablaUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			}
			
			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 1;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonDuplicarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 1;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonCopiarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 1;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonVerFormUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 1;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUtilidadTipoPrecio.add(this.jButtonCerrarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		
		this.jButtonRecargarInformacionUtilidadTipoPrecio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadTipoPrecio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadTipoPrecio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUtilidadTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUtilidadTipoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadTipoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadTipoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUtilidadTipoPrecio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadTipoPrecio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadTipoPrecio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUtilidadTipoPrecio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadTipoPrecio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadTipoPrecio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUtilidadTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUtilidadTipoPrecio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UtilidadTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UtilidadTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UtilidadTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UtilidadTipoPrecio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUtilidadTipoPrecio.setLayout(gridaBagParametrosReportesUtilidadTipoPrecio);
			this.jPanelParametrosReportesAccionesUtilidadTipoPrecio.setLayout(gridaBagParametrosReportesAccionesUtilidadTipoPrecio);
			
			
			this.jPanelParametrosAuxiliar1UtilidadTipoPrecio.setLayout(gridaBagParametrosAuxiliar1UtilidadTipoPrecio);
			this.jPanelParametrosAuxiliar2UtilidadTipoPrecio.setLayout(gridaBagParametrosAuxiliar2UtilidadTipoPrecio);
			this.jPanelParametrosAuxiliar3UtilidadTipoPrecio.setLayout(gridaBagParametrosAuxiliar3UtilidadTipoPrecio);
			this.jPanelParametrosAuxiliar4UtilidadTipoPrecio.setLayout(gridaBagParametrosAuxiliar4UtilidadTipoPrecio);
			//this.jPanelParametrosAuxiliar5UtilidadTipoPrecio.setLayout(gridaBagParametrosAuxiliar2UtilidadTipoPrecio);			
			
			
			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jButtonRecargarInformacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadTipoPrecio.add(this.jComboBoxTiposPaginacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadTipoPrecio.add(this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadTipoPrecio.add(this.jComboBoxTiposArchivosReportesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jPanelParametrosAuxiliar1UtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UtilidadTipoPrecio.add(this.jComboBoxTiposReportesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);																		
			
			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4UtilidadTipoPrecio.add(this.jComboBoxTiposGraficosReportesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jPanelParametrosAuxiliar4UtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jComboBoxTiposReportesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jCheckBoxGenerarReporteUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jPanelParametrosAuxiliar2UtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jLabelAccionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jButtonAbrirOrderByUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jComboBoxTiposSeleccionarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
			
			
			/*
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jCheckBoxConGraficoReporteUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadTipoPrecio.add(this.jCheckBoxSeleccionarTodosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);															
				
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadTipoPrecio.add(this.jCheckBoxSeleccionadosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);															
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadTipoPrecio.add(this.jCheckBoxConGraficoReporteUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jPanelParametrosAuxiliar3UtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jComboBoxTiposAccionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
	
				
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadTipoPrecio.add(this.jTextFieldValorCampoGeneralUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUtilidadTipoPrecio = new GridBagLayout();

			this.jScrollPanelDatosUtilidadTipoPrecio.setLayout(gridaBagLayoutDatosUtilidadTipoPrecio);
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
			
			this.jScrollPanelDatosUtilidadTipoPrecio.add(this.jTableDatosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUtilidadTipoPrecio.setViewportView(this.jTableDatosUtilidadTipoPrecio);
		this.jTableDatosUtilidadTipoPrecio.setFillsViewportHeight(true);
		this.jTableDatosUtilidadTipoPrecio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUtilidadTipoPrecio= new GridBagLayout();
		this.jPanelAccionesUtilidadTipoPrecio.setLayout(gridaBagLayoutAccionesUtilidadTipoPrecio);
		
		
		/*	
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
			
		this.jPanelAccionesUtilidadTipoPrecio.add(this.jButtonNuevoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoPrecioUtilidadTipoPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioUtilidadTipoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioUtilidadTipoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioUtilidadTipoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioUtilidadTipoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioUtilidadTipoPrecio.setLayout(gridaBagLayoutFK_IdTipoPrecioUtilidadTipoPrecio);

		gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
		jPanelFK_IdTipoPrecioUtilidadTipoPrecio.add(jLabelid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio, gridBagConstraintsUtilidadTipoPrecio);

		gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		gridBagConstraintsUtilidadTipoPrecio.gridx = 1;
		jPanelFK_IdTipoPrecioUtilidadTipoPrecio.add(jComboBoxid_tipo_precioFK_IdTipoPrecioUtilidadTipoPrecio, gridBagConstraintsUtilidadTipoPrecio);

		gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadTipoPrecio.gridy = 1;
		gridBagConstraintsUtilidadTipoPrecio.gridx =1;
		jPanelFK_IdTipoPrecioUtilidadTipoPrecio.add(jButtonFK_IdTipoPrecioUtilidadTipoPrecio, gridBagConstraintsUtilidadTipoPrecio);

		jTabbedPaneBusquedasUtilidadTipoPrecio.addTab("1.-Por Tipo Precio ", jPanelFK_IdTipoPrecioUtilidadTipoPrecio);
		jTabbedPaneBusquedasUtilidadTipoPrecio.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadTipoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadTipoPrecio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;		
			//this.gridBagConstraintsUtilidadTipoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;		
		//this.gridBagConstraintsUtilidadTipoPrecio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUtilidadTipoPrecio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;		
			this.gridBagConstraintsUtilidadTipoPrecio.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);								
		
		
		/*
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		*/		
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =0;
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadTipoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
				
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUtilidadTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadTipoPrecio = new GridBagLayout();
			this.jPanelBusquedasParametrosUtilidadTipoPrecio.setLayout(gridaBagLayoutBusquedasParametrosUtilidadTipoPrecio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			
			
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
			
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUtilidadTipoPrecio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUtilidadTipoPrecio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUtilidadTipoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUtilidadTipoPrecio.setName("jPanelReporteDinamicoUtilidadTipoPrecio"); 
		
		this.jPanelReporteDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUtilidadTipoPrecio.setLayout(gridaBagLayoutReporteDinamicoUtilidadTipoPrecio);
		
		
		this.jInternalFrameReporteDinamicoUtilidadTipoPrecio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUtilidadTipoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadTipoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setResizable(true);
	    this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setClosable(true);
	    this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Tipo Precioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUtilidadTipoPrecio = new JLabelMe();

		this.jLabelColumnasSelectReporteUtilidadTipoPrecio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelColumnasSelectReporteUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUtilidadTipoPrecio = new JList<Reporte>();
		this.jListColumnasSelectReporteUtilidadTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUtilidadTipoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUtilidadTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUtilidadTipoPrecio=new JScrollPane(this.jListColumnasSelectReporteUtilidadTipoPrecio);
			
			this.jScrollColumnasSelectReporteUtilidadTipoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadTipoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadTipoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jListColumnasSelectReporteUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jScrollColumnasSelectReporteUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUtilidadTipoPrecio = new JLabelMe();

		this.jLabelRelacionesSelectReporteUtilidadTipoPrecio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUtilidadTipoPrecio = new JList<Reporte>();
		this.jListRelacionesSelectReporteUtilidadTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUtilidadTipoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUtilidadTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUtilidadTipoPrecio=new JScrollPane(this.jListRelacionesSelectReporteUtilidadTipoPrecio);
			
			this.jScrollRelacionesSelectReporteUtilidadTipoPrecio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadTipoPrecio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadTipoPrecio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio = new JComboBoxMe();
		this.jListColumnasValoresGraficoUtilidadTipoPrecio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoUtilidadTipoPrecio = new JLabelMe();

		this.jLabelConGraficoDinamicoUtilidadTipoPrecio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelConGraficoDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jCheckBoxConGraficoDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoUtilidadTipoPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoUtilidadTipoPrecio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelColumnaCategoriaGraficoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorUtilidadTipoPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaValorUtilidadTipoPrecio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelColumnaCategoriaValorUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorUtilidadTipoPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorUtilidadTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jComboBoxColumnaCategoriaValorUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoUtilidadTipoPrecio = new JLabelMe();

		this.jLabelColumnasValoresGraficoUtilidadTipoPrecio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelColumnasValoresGraficoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoUtilidadTipoPrecio = new JList<Reporte>();
		this.jListColumnasValoresGraficoUtilidadTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoUtilidadTipoPrecio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoUtilidadTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoUtilidadTipoPrecio=new JScrollPane(this.jListColumnasValoresGraficoUtilidadTipoPrecio);
			
			this.jScrollColumnasValoresGraficoUtilidadTipoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadTipoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadTipoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jListColumnasSelectReporteUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jScrollColumnasValoresGraficoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoUtilidadTipoPrecio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoUtilidadTipoPrecio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelTiposGraficosReportesDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadTipoPrecio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jComboBoxTiposGraficosReportesDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUtilidadTipoPrecio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUtilidadTipoPrecio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelGenerarExcelReporteDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio.setToolTipText("Generar EXCEL"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jButtonGenerarExcelReporteDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jComboBoxTiposReportesDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUtilidadTipoPrecio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUtilidadTipoPrecio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jLabelTiposArchivoReporteDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jComboBoxTiposArchivosReportesDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUtilidadTipoPrecio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUtilidadTipoPrecio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUtilidadTipoPrecio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUtilidadTipoPrecio.setToolTipText("Generar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jButtonGenerarReporteDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUtilidadTipoPrecio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUtilidadTipoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUtilidadTipoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUtilidadTipoPrecio.setToolTipText("Cancelar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadTipoPrecio.add(this.jButtonCerrarReporteDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUtilidadTipoPrecio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUtilidadTipoPrecio= new JScrollPane(jPanelReporteDinamicoUtilidadTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Tipo Precioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUtilidadTipoPrecio);
		this.jInternalFrameReporteDinamicoUtilidadTipoPrecio.getContentPane().add(this.jScrollPanelReporteDinamicoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUtilidadTipoPrecio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUtilidadTipoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUtilidadTipoPrecio.setName("jPanelImportacionUtilidadTipoPrecio"); 
		
		this.jPanelImportacionUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUtilidadTipoPrecio.setLayout(gridaBagLayoutImportacionUtilidadTipoPrecio);
		
		
		this.jInternalFrameImportacionUtilidadTipoPrecio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUtilidadTipoPrecio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUtilidadTipoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadTipoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUtilidadTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadTipoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setResizable(true);
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setClosable(true);
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUtilidadTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadTipoPrecio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setResizable(true);
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setClosable(true);
	    this.jInternalFrameImportacionUtilidadTipoPrecio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Tipo Precioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUtilidadTipoPrecio = new JLabelMe();

		this.jLabelArchivoImportacionUtilidadTipoPrecio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadTipoPrecio.add(this.jLabelArchivoImportacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUtilidadTipoPrecio = new JFileChooser();		
		this.jFileChooserImportacionUtilidadTipoPrecio.setToolTipText("ESCOGER ARCHIVO"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUtilidadTipoPrecio = new JButtonMe();
		this.jButtonAbrirImportacionUtilidadTipoPrecio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUtilidadTipoPrecio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUtilidadTipoPrecio.setToolTipText("Generar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadTipoPrecio.add(this.jButtonAbrirImportacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUtilidadTipoPrecio = new JLabelMe();

		this.jLabelPathArchivoImportacionUtilidadTipoPrecio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadTipoPrecio.add(this.jLabelPathArchivoImportacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUtilidadTipoPrecio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUtilidadTipoPrecio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadTipoPrecio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadTipoPrecio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadTipoPrecio.add(this.jTextFieldPathArchivoImportacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUtilidadTipoPrecio = new JButtonMe();
		this.jButtonGenerarImportacionUtilidadTipoPrecio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUtilidadTipoPrecio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUtilidadTipoPrecio.setToolTipText("Generar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadTipoPrecio.add(this.jButtonGenerarImportacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUtilidadTipoPrecio = new JButtonMe();
		this.jButtonCerrarImportacionUtilidadTipoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUtilidadTipoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUtilidadTipoPrecio.setToolTipText("Cancelar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadTipoPrecio.add(this.jButtonCerrarImportacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUtilidadTipoPrecio = new GridBagLayout();
		
		this.jScrollPanelImportacionUtilidadTipoPrecio= new JScrollPane(jPanelImportacionUtilidadTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy =iPosYImportacion;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =iPosXImportacion;
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUtilidadTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUtilidadTipoPrecio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUtilidadTipoPrecio);
		this.jInternalFrameImportacionUtilidadTipoPrecio.getContentPane().add(this.jScrollPanelImportacionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUtilidadTipoPrecio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUtilidadTipoPrecio = new JButtonMe();
			this.jButtonAbrirOrderByUtilidadTipoPrecio.setText("Orden");
			this.jButtonAbrirOrderByUtilidadTipoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadTipoPrecio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUtilidadTipoPrecio";
			inputMap = this.jButtonAbrirOrderByUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUtilidadTipoPrecio"));
		
		
			GridBagLayout gridaBagLayoutOrderByUtilidadTipoPrecio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUtilidadTipoPrecio.setName("jPanelOrderByUtilidadTipoPrecio"); 
			
			this.jPanelOrderByUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUtilidadTipoPrecio.setLayout(gridaBagLayoutOrderByUtilidadTipoPrecio);
			
			
			this.jTableDatosUtilidadTipoPrecioOrderBy = new JTableMe();        
			this.jTableDatosUtilidadTipoPrecioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUtilidadTipoPrecioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUtilidadTipoPrecioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUtilidadTipoPrecioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUtilidadTipoPrecioOrderBy.setViewportView(this.jTableDatosUtilidadTipoPrecioOrderBy);
			this.jTableDatosUtilidadTipoPrecioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUtilidadTipoPrecioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUtilidadTipoPrecio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUtilidadTipoPrecio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUtilidadTipoPrecio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUtilidadTipoPrecio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUtilidadTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUtilidadTipoPrecio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUtilidadTipoPrecio.setTitle("Orden");
			this.jInternalFrameOrderByUtilidadTipoPrecio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUtilidadTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUtilidadTipoPrecio.setResizable(true);
			this.jInternalFrameOrderByUtilidadTipoPrecio.setClosable(true);
			this.jInternalFrameOrderByUtilidadTipoPrecio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Tipo Precioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUtilidadTipoPrecio.ipady =150;
				
			this.jPanelOrderByUtilidadTipoPrecio.add(jScrollPanelDatosUtilidadTipoPrecioOrderBy, this.gridBagConstraintsUtilidadTipoPrecio);//this.jTableDatosUtilidadTipoPrecioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUtilidadTipoPrecio = new JButtonMe();
			this.jButtonCerrarOrderByUtilidadTipoPrecio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUtilidadTipoPrecio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUtilidadTipoPrecio.setToolTipText("Cancelar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUtilidadTipoPrecio.add(this.jButtonCerrarOrderByUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUtilidadTipoPrecio = new GridBagLayout();
			
			this.jScrollPanelOrderByUtilidadTipoPrecio= new JScrollPane(jPanelOrderByUtilidadTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iPosYOrderBy;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUtilidadTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUtilidadTipoPrecio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUtilidadTipoPrecio);
			
			this.jInternalFrameOrderByUtilidadTipoPrecio.getContentPane().add(this.jScrollPanelOrderByUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
		
		} else {
			this.jButtonAbrirOrderByUtilidadTipoPrecio = new JButtonMe();
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
			&& this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUtilidadTipoPrecio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUtilidadTipoPrecio.getRowHeight();//UtilidadTipoPrecioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio.isSelected()) {
					iHeightTable=UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadTipoPrecio.isSelected()) {
					iHeightTable=UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUtilidadTipoPrecio!=null && this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy()!=null) {
			//if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUtilidadTipoPrecio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUtilidadTipoPrecio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUtilidadTipoPrecio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUtilidadTipoPrecio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=utilidadtipoprecioLogic.getUtilidadTipoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadtipoprecios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UtilidadTipoPrecio> TraerUtilidadTipoPrecioBeans(List<UtilidadTipoPrecio> utilidadtipoprecios,ArrayList<Classe> classes)throws Exception {
		try {
			for(UtilidadTipoPrecio utilidadtipoprecio:utilidadtipoprecios) {
					
				if(!(UtilidadTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UtilidadTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					utilidadtipoprecio.setsDetalleGeneralEntityReporte(UtilidadTipoPrecioConstantesFunciones.getUtilidadTipoPrecioDescripcion(utilidadtipoprecio));
										
						
					
						
					
				} else  {
							
					//utilidadtipoprecio.setsDetalleGeneralEntityReporte(utilidadtipoprecio.getsDetalleGeneralEntityReporte());
										
				}
				
				//utilidadtipopreciobeans.add(utilidadtipopreciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return utilidadtipoprecios;
    }
	//PARA REPORTES FIN
}
