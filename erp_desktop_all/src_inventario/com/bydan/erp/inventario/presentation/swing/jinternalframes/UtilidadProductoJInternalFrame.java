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
import com.bydan.erp.inventario.util.UtilidadProductoConstantesFunciones;

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
public class UtilidadProductoJInternalFrame extends UtilidadProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUtilidadProducto;
	
	protected JMenuBar jmenuBarUtilidadProducto;
	
	protected JMenu jmenuUtilidadProducto;
	protected JMenu jmenuDatosUtilidadProducto;
	protected JMenu jmenuArchivoUtilidadProducto;
	protected JMenu jmenuAccionesUtilidadProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadProducto;	
	protected GridBagConstraints gridBagConstraintsUtilidadProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UtilidadProductoDetalleFormJInternalFrame jInternalFrameDetalleFormUtilidadProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUtilidadProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUtilidadProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public UtilidadProductoSessionBean utilidadproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UtilidadProducto> utilidadproductos;		
	public List<UtilidadProducto> utilidadproductosEliminados;	
	public List<UtilidadProducto> utilidadproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUtilidadProducto;		
	protected JButton jButtonAbrirOrderByUtilidadProducto;
	
	
	//protected JPanel jPanelOrderByUtilidadProducto;
	//public JScrollPane jScrollPanelOrderByUtilidadProducto;	
	//protected JButton jButtonCerrarOrderByUtilidadProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UtilidadProductoLogic utilidadproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUtilidadProducto;
	public JScrollPane jScrollPanelDatosEdicionUtilidadProducto;
	public JScrollPane jScrollPanelDatosGeneralUtilidadProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosUtilidadProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUtilidadProducto;
	//public JScrollPane jScrollPanelImportacionUtilidadProducto;
	
	
	
	protected JPanel jPanelAccionesUtilidadProducto;
	
    protected JPanel jPanelPaginacionUtilidadProducto;
    protected JPanel jPanelParametrosReportesUtilidadProducto;
	protected JPanel jPanelParametrosReportesAccionesUtilidadProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UtilidadProducto;
	protected JPanel jPanelParametrosAuxiliar2UtilidadProducto;
	protected JPanel jPanelParametrosAuxiliar3UtilidadProducto;
	protected JPanel jPanelParametrosAuxiliar4UtilidadProducto;
	//protected JPanel jPanelParametrosAuxiliar5UtilidadProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoUtilidadProducto;
	//protected JPanel jPanelImportacionUtilidadProducto;
	
	
	public JTable jTableDatosUtilidadProducto;
	
	
	
	//public JTable jTableDatosUtilidadProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUtilidadProducto;
	protected JButton jButtonDuplicarUtilidadProducto;
	protected JButton jButtonCopiarUtilidadProducto;
	protected JButton jButtonVerFormUtilidadProducto;
	protected JButton jButtonNuevoRelacionesUtilidadProducto;
	protected JButton jButtonModificarUtilidadProducto;
	
    protected JButton jButtonGuardarCambiosTablaUtilidadProducto;
	protected JButton jButtonCerrarUtilidadProducto;
	
	
	protected JButton jButtonRecargarInformacionUtilidadProducto;
	protected JButton jButtonProcesarInformacionUtilidadProducto;
	
	
	protected JButton jButtonAnterioresUtilidadProducto;
	protected JButton jButtonSiguientesUtilidadProducto;
	protected JButton jButtonNuevoGuardarCambiosUtilidadProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUtilidadProducto;
	//protected JButton jButtonCerrarReporteDinamicoUtilidadProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoUtilidadProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionUtilidadProducto;
	//protected JButton jButtonGenerarImportacionUtilidadProducto;
	//protected JButton jButtonCerrarImportacionUtilidadProducto;
	//protected JFileChooser jFileChooserImportacionUtilidadProducto;
	//protected File fileImportacionUtilidadProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadProducto;
	protected JButton jButtonDuplicarToolBarUtilidadProducto;
	protected JButton jButtonNuevoRelacionesToolBarUtilidadProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarUtilidadProducto;
	protected JButton jButtonCopiarToolBarUtilidadProducto;
	protected JButton jButtonVerFormToolBarUtilidadProducto;
	public JButton jButtonGuardarCambiosTablaToolBarUtilidadProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadProducto;
	protected JButton jButtonCerrarToolBarUtilidadProducto;
	
	protected JButton jButtonRecargarInformacionToolBarUtilidadProducto;
	protected JButton jButtonProcesarInformacionToolBarUtilidadProducto;
	protected JButton jButtonAnterioresToolBarUtilidadProducto;
	protected JButton jButtonSiguientesToolBarUtilidadProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarUtilidadProducto;
	protected JButton jButtonAbrirOrderByToolBarUtilidadProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadProducto;
	protected JMenuItem jMenuItemDuplicarUtilidadProducto;
	protected JMenuItem jMenuItemNuevoRelacionesUtilidadProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUtilidadProducto;
	protected JMenuItem jMenuItemCopiarUtilidadProducto;
	protected JMenuItem jMenuItemVerFormUtilidadProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadProducto;
	protected JMenuItem jMenuItemCerrarUtilidadProducto;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUtilidadProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionUtilidadProducto;
	protected JMenuItem jMenuItemProcesarInformacionUtilidadProducto;
	protected JMenuItem jMenuItemAnterioresUtilidadProducto;
	protected JMenuItem jMenuItemSiguientesUtilidadProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadProducto;
	protected JMenuItem jMenuItemAbrirOrderByUtilidadProducto;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUtilidadProducto;
	protected JCheckBox jCheckBoxSeleccionadosUtilidadProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUtilidadProducto;
	protected JCheckBox jCheckBoxConGraficoReporteUtilidadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUtilidadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUtilidadProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUtilidadProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUtilidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUtilidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUtilidadProducto;
	protected JTextField jTextFieldValorCampoGeneralUtilidadProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUtilidadProducto;
	//public JList<Reporte> jListColumnasSelectReporteUtilidadProducto;
	//public JScrollPane jScrollColumnasSelectReporteUtilidadProducto;
	
	//public JLabel jLabelRelacionesSelectReporteUtilidadProducto;
	//public JList<Reporte> jListRelacionesSelectReporteUtilidadProducto;
	//public JScrollPane jScrollRelacionesSelectReporteUtilidadProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUtilidadProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUtilidadProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUtilidadProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoUtilidadProducto;
	
		
	//public JLabel jLabelArchivoImportacionUtilidadProducto;	
	//public JLabel jLabelPathArchivoImportacionUtilidadProducto;
	//protected JTextField jTextFieldPathArchivoImportacionUtilidadProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUtilidadProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUtilidadProducto;
	
	//public JLabel jLabelColumnaCategoriaValorUtilidadProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUtilidadProducto;
	
	//public JLabel jLabelColumnasValoresGraficoUtilidadProducto;
	//public JList<Reporte> jListColumnasValoresGraficoUtilidadProducto;
	//public JScrollPane jScrollColumnasValoresGraficoUtilidadProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUtilidadProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUtilidadProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUtilidadProducto;
	public JPanel jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	public JButton jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	public JPanel jPanelFK_IdBodegaUtilidadProducto;
	public JButton jButtonFK_IdBodegaUtilidadProducto;
	
	public JPanel jPanelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	public JLabel jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	public JButton jButtonid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	public JLabel jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto;
	public JButton jButtonid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto= new JButtonMe();
	public JButton jButtonid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaUtilidadProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaUtilidadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaUtilidadProducto;
	public JButton jButtonid_bodegaFK_IdBodegaUtilidadProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaUtilidadProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaUtilidadProductoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public UtilidadProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUtilidadProducto)	{
		this.jButtonRecargarInformacionUtilidadProducto = jButtonRecargarInformacionUtilidadProducto;
	}
	
	public JButton getjButtonProcesarInformacionUtilidadProducto() {
		return this.jButtonProcesarInformacionUtilidadProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadProducto)	{
		this.jButtonProcesarInformacionUtilidadProducto = jButtonProcesarInformacionUtilidadProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionUtilidadProducto() {
		return this.jButtonRecargarInformacionUtilidadProducto;
	}
	
	
	public List<UtilidadProducto> getutilidadproductos() {
		return this.utilidadproductos;
	}

	public void setutilidadproductos(List<UtilidadProducto> utilidadproductos) {
		this.utilidadproductos = utilidadproductos;
	}
	
	public List<UtilidadProducto> getutilidadproductosAux() {
		return this.utilidadproductosAux;
	}

	public void setutilidadproductosAux(List<UtilidadProducto> utilidadproductosAux) {
		this.utilidadproductosAux = utilidadproductosAux;
	}
	
	public List<UtilidadProducto> getutilidadproductosEliminados() {
		return this.utilidadproductosEliminados;
	}

	public void setUtilidadProductosEliminados(List<UtilidadProducto> utilidadproductosEliminados) {
		this.utilidadproductosEliminados = utilidadproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUtilidadProducto() {
		return jComboBoxTiposSeleccionarUtilidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUtilidadProducto(
			JComboBox jComboBoxTiposSeleccionarUtilidadProducto) {
		this.jComboBoxTiposSeleccionarUtilidadProducto = jComboBoxTiposSeleccionarUtilidadProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUtilidadProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUtilidadProducto() {
		return jTextFieldValorCampoGeneralUtilidadProducto;
	}

	public void setjTextFieldValorCampoGeneralUtilidadProducto(
			JTextField jTextFieldValorCampoGeneralUtilidadProducto) {
		this.jTextFieldValorCampoGeneralUtilidadProducto = jTextFieldValorCampoGeneralUtilidadProducto;
	}

	public void setBorderResaltarValorCampoGeneralUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUtilidadProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUtilidadProducto() {
		return this.jCheckBoxSeleccionarTodosUtilidadProducto;
	}

	public void setjCheckBoxSeleccionarTodosUtilidadProducto(
			JCheckBox jCheckBoxSeleccionarTodosUtilidadProducto) {
		this.jCheckBoxSeleccionarTodosUtilidadProducto = jCheckBoxSeleccionarTodosUtilidadProducto;
	}

	public void setBorderResaltarSeleccionarTodosUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUtilidadProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUtilidadProducto() {
		return this.jCheckBoxSeleccionadosUtilidadProducto;
	}

	public void setjCheckBoxSeleccionadosUtilidadProducto(
			JCheckBox jCheckBoxSeleccionadosUtilidadProducto) {
		this.jCheckBoxSeleccionadosUtilidadProducto = jCheckBoxSeleccionadosUtilidadProducto;
	}
	
	public void setBorderResaltarSeleccionadosUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUtilidadProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUtilidadProducto() {
		return this.jComboBoxTiposArchivosReportesUtilidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUtilidadProducto(
			JComboBox jComboBoxTiposArchivosReportesUtilidadProducto) {
		this.jComboBoxTiposArchivosReportesUtilidadProducto = jComboBoxTiposArchivosReportesUtilidadProducto;
	}

	public void setBorderResaltarTiposArchivosReportesUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUtilidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUtilidadProducto() {
		return this.jComboBoxTiposReportesUtilidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUtilidadProducto(
			JComboBox jComboBoxTiposReportesUtilidadProducto) {
		this.jComboBoxTiposReportesUtilidadProducto = jComboBoxTiposReportesUtilidadProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUtilidadProducto() {
	//	return jComboBoxTiposReportesDinamicoUtilidadProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUtilidadProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoUtilidadProducto) {
	//	this.jComboBoxTiposReportesDinamicoUtilidadProducto = jComboBoxTiposReportesDinamicoUtilidadProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUtilidadProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoUtilidadProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUtilidadProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUtilidadProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto = jComboBoxTiposArchivosReportesDinamicoUtilidadProducto;
	//}
	
	public void setBorderResaltarTiposReportesUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUtilidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUtilidadProducto() {
		return this.jComboBoxTiposGraficosReportesUtilidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUtilidadProducto(
			JComboBox jComboBoxTiposGraficosReportesUtilidadProducto) {
		this.jComboBoxTiposGraficosReportesUtilidadProducto = jComboBoxTiposGraficosReportesUtilidadProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUtilidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUtilidadProducto() {
		return this.jComboBoxTiposPaginacionUtilidadProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUtilidadProducto(
			JComboBox jComboBoxTiposPaginacionUtilidadProducto) {
		this.jComboBoxTiposPaginacionUtilidadProducto = jComboBoxTiposPaginacionUtilidadProducto;
	}
	
	public void setBorderResaltarTiposPaginacionUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUtilidadProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUtilidadProducto() {
		return this.jComboBoxTiposRelacionesUtilidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadProducto() {
		return this.jComboBoxTiposAccionesUtilidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadProducto(
			JComboBox jComboBoxTiposRelacionesUtilidadProducto) {
		this.jComboBoxTiposRelacionesUtilidadProducto = jComboBoxTiposRelacionesUtilidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadProducto(
			JComboBox jComboBoxTiposAccionesUtilidadProducto) {
		this.jComboBoxTiposAccionesUtilidadProducto = jComboBoxTiposAccionesUtilidadProducto;
	}
	
	public void setBorderResaltarTiposRelacionesUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUtilidadProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUtilidadProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUtilidadProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUtilidadProducto() {
	//	return jCheckBoxConGraficoDinamicoUtilidadProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoUtilidadProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoUtilidadProducto) {
	//	this.jCheckBoxConGraficoDinamicoUtilidadProducto = jCheckBoxConGraficoDinamicoUtilidadProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUtilidadProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUtilidadProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUtilidadProducto .setBorder(borderResaltar);		
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
		this.utilidadproductoSessionBean=new UtilidadProductoSessionBean();
		
		this.utilidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UtilidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UtilidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidad Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		UtilidadProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UtilidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUtilidadProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"nuevo","nuevo","Nuevo"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"duplicar","duplicar","Duplicar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"copiar","copiar","Copiar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"ver_form","ver_form","Ver"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"recargar","recargar","Recargar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUtilidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUtilidadProducto,this.jTtoolBarUtilidadProducto,
							"cerrar","cerrar","Salir"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUtilidadProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUtilidadProducto;
			
				this.jButtonProcesarInformacionToolBarUtilidadProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUtilidadProducto;
				
		//protected JButton jButtonModificarToolBarUtilidadProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUtilidadProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUtilidadProducto=new JMenuMe("General");
		this.jmenuArchivoUtilidadProducto=new JMenuMe("Archivo");
		this.jmenuAccionesUtilidadProducto=new JMenuMe("Acciones");
		this.jmenuDatosUtilidadProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUtilidadProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUtilidadProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUtilidadProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUtilidadProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUtilidadProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUtilidadProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUtilidadProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUtilidadProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUtilidadProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUtilidadProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUtilidadProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUtilidadProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUtilidadProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUtilidadProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUtilidadProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUtilidadProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUtilidadProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUtilidadProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUtilidadProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUtilidadProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUtilidadProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUtilidadProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUtilidadProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUtilidadProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUtilidadProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUtilidadProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUtilidadProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUtilidadProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUtilidadProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUtilidadProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUtilidadProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUtilidadProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUtilidadProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUtilidadProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUtilidadProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUtilidadProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUtilidadProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUtilidadProducto.add(this.jMenuItemCerrarUtilidadProducto);
			
			this.jmenuAccionesUtilidadProducto.add(this.jMenuItemNuevoUtilidadProducto);
			this.jmenuAccionesUtilidadProducto.add(this.jMenuItemNuevoGuardarCambiosUtilidadProducto);
			this.jmenuAccionesUtilidadProducto.add(this.jMenuItemNuevoRelacionesUtilidadProducto);
			this.jmenuAccionesUtilidadProducto.add(this.jMenuItemGuardarCambiosTablaUtilidadProducto);		
			this.jmenuAccionesUtilidadProducto.add(this.jMenuItemDuplicarUtilidadProducto);		
			this.jmenuAccionesUtilidadProducto.add(this.jMenuItemCopiarUtilidadProducto);		
			this.jmenuAccionesUtilidadProducto.add(this.jMenuItemVerFormUtilidadProducto);		
			
			this.jmenuDatosUtilidadProducto.add(this.jMenuItemRecargarInformacionUtilidadProducto);				
			this.jmenuDatosUtilidadProducto.add(this.jMenuItemAnterioresUtilidadProducto);				
			this.jmenuDatosUtilidadProducto.add(this.jMenuItemSiguientesUtilidadProducto);				
			this.jmenuDatosUtilidadProducto.add(this.jMenuItemAbrirOrderByUtilidadProducto);				
			this.jmenuDatosUtilidadProducto.add(this.jMenuItemMostrarOcultarUtilidadProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUtilidadProducto.add(this.jMenuItemGuardarCambiosUtilidadProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUtilidadProducto.add(this.jmenuArchivoUtilidadProducto);		
			this.jmenuBarUtilidadProducto.add(this.jmenuAccionesUtilidadProducto);		
			this.jmenuBarUtilidadProducto.add(this.jmenuDatosUtilidadProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUtilidadProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUtilidadProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setToolTipText("Buscar Por Bodega Por Producto ");
		this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto= new JButtonMe();
		this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setText("Buscar");
		this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setToolTipText("Buscar Por Bodega Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto,"buscar_button","Buscar Por Bodega Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto = new JLabelMe();
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setText("Bodega :");
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto = new JLabelMe();
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setText("Producto :");
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setToolTipText("Producto");
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto= new JComboBoxMe();
		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto= new JButtonMe();
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.setText("Buscar");
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.setToolTipText("Buscar");
		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto.setFocusable(false);

		this.jPanelFK_IdBodegaUtilidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaUtilidadProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaUtilidadProducto= new JButtonMe();
		this.jButtonFK_IdBodegaUtilidadProducto.setText("Buscar");
		this.jButtonFK_IdBodegaUtilidadProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaUtilidadProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaUtilidadProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaUtilidadProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaUtilidadProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaUtilidadProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUtilidadProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasUtilidadProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUtilidadProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUtilidadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUtilidadProducto = new UtilidadProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Utilidad Producto DATOS");
			this.jInternalFrameDetalleFormUtilidadProducto = new UtilidadProductoDetalleFormJInternalFrame(jDesktopPane,this.utilidadproductoSessionBean.getConGuardarRelaciones(),this.utilidadproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUtilidadProducto = null;//new UtilidadProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadProducto= new GridBagLayout();
		
		
		this.jTableDatosUtilidadProducto = new JTableMe();      
		
		String sToolTipUtilidadProducto="";
		sToolTipUtilidadProducto=UtilidadProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadProducto+="(Inventario.UtilidadProducto)";
		}
		
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUtilidadProducto.setToolTipText(sToolTipUtilidadProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUtilidadProducto);
		this.jTableDatosUtilidadProducto.setAutoCreateRowSorter(true);
		this.jTableDatosUtilidadProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUtilidadProducto.setRowSelectionAllowed(true);
		this.jTableDatosUtilidadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUtilidadProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUtilidadProducto = new JButtonMe();
		this.jButtonDuplicarUtilidadProducto = new JButtonMe();
		this.jButtonCopiarUtilidadProducto = new JButtonMe();
		this.jButtonVerFormUtilidadProducto = new JButtonMe();
		this.jButtonNuevoRelacionesUtilidadProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUtilidadProducto = new JButtonMe();
		this.jButtonCerrarUtilidadProducto = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralUtilidadProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidad Producto";
		
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadProducto.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUtilidadProducto=new ReporteDinamicoJInternalFrame(UtilidadProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUtilidadProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUtilidadProducto=new ImportacionJInternalFrame(UtilidadProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUtilidadProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUtilidadProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByUtilidadProducto.setText("Orden");
		this.jButtonAbrirOrderByUtilidadProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadProducto,false,this);
			
			//this.cargarOrderByUtilidadProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUtilidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadProducto,true,this);
			
			//this.cargarOrderByUtilidadProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUtilidadProducto.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosUtilidadProducto.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosUtilidadProducto.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosUtilidadProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUtilidadProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUtilidadProducto.setText("Nuevo");
		this.jButtonDuplicarUtilidadProducto.setText("Duplicar");
		this.jButtonCopiarUtilidadProducto.setText("Copiar");
		this.jButtonVerFormUtilidadProducto.setText("Ver");
		this.jButtonNuevoRelacionesUtilidadProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUtilidadProducto.setText("Guardar");
		this.jButtonCerrarUtilidadProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadProducto,"nuevo_button","Nuevo",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUtilidadProducto,"duplicar_button","Duplicar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUtilidadProducto,"copiar_button","Copiar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUtilidadProducto,"ver_form","Ver",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUtilidadProducto,"nuevorelaciones_button","Nuevo Rel",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadProducto,"guardarcambiostabla_button","Guardar",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadProducto,"cerrar_button","Salir",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUtilidadProducto.setToolTipText("Nuevo"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUtilidadProducto.setToolTipText("Duplicar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUtilidadProducto.setToolTipText("Copiar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUtilidadProducto.setToolTipText("Ver"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUtilidadProducto.setToolTipText("Nuevo Rel"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUtilidadProducto.setToolTipText("Guardar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadProducto.setToolTipText("Salir"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadProducto";
		inputMap = this.jButtonNuevoUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarUtilidadProducto";
		inputMap = this.jButtonDuplicarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUtilidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUtilidadProducto"));
		
		//COPIAR
		sMapKey = "CopiarUtilidadProducto";
		inputMap = this.jButtonCopiarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUtilidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUtilidadProducto"));
		
		//VEr FORM
		sMapKey = "VerFormUtilidadProducto";
		inputMap = this.jButtonVerFormUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUtilidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUtilidadProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUtilidadProducto";
		inputMap = this.jButtonNuevoRelacionesUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUtilidadProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUtilidadProducto";
		inputMap = this.jButtonModificarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUtilidadProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUtilidadProducto";
		inputMap = this.jButtonCerrarUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadProducto";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UtilidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UtilidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UtilidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UtilidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UtilidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUtilidadProducto.setName("jPanelParametrosReportesUtilidadProducto"); 
		
		this.jPanelParametrosReportesAccionesUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUtilidadProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUtilidadProducto.setName("jPanelParametrosReportesAccionesUtilidadProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUtilidadProducto = new JButtonMe();
		this.jButtonRecargarInformacionUtilidadProducto.setText("Recargar");
		this.jButtonRecargarInformacionUtilidadProducto.setToolTipText("Recargar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUtilidadProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUtilidadProducto = new JButtonMe();
		this.jButtonProcesarInformacionUtilidadProducto.setText("Procesar");
		this.jButtonProcesarInformacionUtilidadProducto.setToolTipText("Procesar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUtilidadProducto.setVisible(false);
			
		this.jButtonProcesarInformacionUtilidadProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUtilidadProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUtilidadProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadProducto.setText("TIPO");       
		this.jComboBoxTiposReportesUtilidadProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUtilidadProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUtilidadProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUtilidadProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionUtilidadProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUtilidadProducto.setText("Accion");
		this.jComboBoxTiposRelacionesUtilidadProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadProducto.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUtilidadProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarUtilidadProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUtilidadProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUtilidadProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUtilidadProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUtilidadProducto = new JLabelMe();
		
		this.jLabelAccionesUtilidadProducto.setText("Acciones");		
		this.jLabelAccionesUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUtilidadProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUtilidadProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUtilidadProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUtilidadProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUtilidadProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUtilidadProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUtilidadProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUtilidadProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUtilidadProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUtilidadProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUtilidadProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteUtilidadProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUtilidadProducto = new JButtonMe();
		//this.jButtonAnterioresUtilidadProducto.setText("<<");
        this.jButtonAnterioresUtilidadProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUtilidadProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUtilidadProducto = new JButtonMe();
		//this.jButtonSiguientesUtilidadProducto.setText(">>");
        this.jButtonSiguientesUtilidadProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUtilidadProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUtilidadProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUtilidadProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosUtilidadProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUtilidadProducto,"nuevoguardarcambios_button","Nue",this.utilidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUtilidadProducto";
		inputMap = this.jButtonNuevoGuardarCambiosUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUtilidadProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUtilidadProducto";
		inputMap = this.jButtonRecargarInformacionUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUtilidadProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUtilidadProducto";
		inputMap = this.jButtonSiguientesUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUtilidadProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUtilidadProducto";
		inputMap = this.jButtonAnterioresUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUtilidadProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUtilidadProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUtilidadProducto.setMinimumSize(new Dimension(this.getWidth(),UtilidadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadProducto.setMaximumSize(new Dimension(this.getWidth(),UtilidadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUtilidadProducto.setPreferredSize(new Dimension(this.getWidth(),UtilidadProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UtilidadProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUtilidadProducto = new GridBagLayout();

			this.jPanelPaginacionUtilidadProducto.setLayout(gridaBagLayoutPaginacionUtilidadProducto);						
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = 0;
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonAnterioresUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
					
						
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadProducto.gridy = 0;
			
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonNuevoGuardarCambiosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
						
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUtilidadProducto.gridy = 0;
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonSiguientesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = 1;
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonNuevoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
						
			
			
			if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
				this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUtilidadProducto.gridy = 1;
				this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUtilidadProducto.add(this.jButtonGuardarCambiosTablaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			}
			
			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = 1;
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonDuplicarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = 1;
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonCopiarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = 1;
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonVerFormUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = 1;
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUtilidadProducto.add(this.jButtonCerrarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		
		this.jButtonRecargarInformacionUtilidadProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUtilidadProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUtilidadProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUtilidadProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUtilidadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUtilidadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUtilidadProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUtilidadProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUtilidadProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUtilidadProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUtilidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUtilidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUtilidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUtilidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUtilidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUtilidadProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUtilidadProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUtilidadProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUtilidadProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUtilidadProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUtilidadProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUtilidadProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUtilidadProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUtilidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUtilidadProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UtilidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UtilidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UtilidadProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UtilidadProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUtilidadProducto.setLayout(gridaBagParametrosReportesUtilidadProducto);
			this.jPanelParametrosReportesAccionesUtilidadProducto.setLayout(gridaBagParametrosReportesAccionesUtilidadProducto);
			
			
			this.jPanelParametrosAuxiliar1UtilidadProducto.setLayout(gridaBagParametrosAuxiliar1UtilidadProducto);
			this.jPanelParametrosAuxiliar2UtilidadProducto.setLayout(gridaBagParametrosAuxiliar2UtilidadProducto);
			this.jPanelParametrosAuxiliar3UtilidadProducto.setLayout(gridaBagParametrosAuxiliar3UtilidadProducto);
			this.jPanelParametrosAuxiliar4UtilidadProducto.setLayout(gridaBagParametrosAuxiliar4UtilidadProducto);
			//this.jPanelParametrosAuxiliar5UtilidadProducto.setLayout(gridaBagParametrosAuxiliar2UtilidadProducto);			
			
			
			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadProducto.add(this.jButtonRecargarInformacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadProducto.add(this.jComboBoxTiposPaginacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadProducto.add(this.jCheckBoxConAltoMaximoTablaUtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UtilidadProducto.add(this.jComboBoxTiposArchivosReportesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadProducto.add(this.jPanelParametrosAuxiliar1UtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UtilidadProducto.add(this.jComboBoxTiposReportesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);																		
			
			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4UtilidadProducto.add(this.jComboBoxTiposGraficosReportesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadProducto.add(this.jPanelParametrosAuxiliar4UtilidadProducto, this.gridBagConstraintsUtilidadProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadProducto.add(this.jComboBoxTiposReportesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadProducto.add(this.jCheckBoxGenerarReporteUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadProducto.add(this.jPanelParametrosAuxiliar2UtilidadProducto, this.gridBagConstraintsUtilidadProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadProducto.add(this.jLabelAccionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
				this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUtilidadProducto.add(this.jButtonAbrirOrderByUtilidadProducto, this.gridBagConstraintsUtilidadProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadProducto.add(this.jComboBoxTiposSeleccionarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
			
			
			/*
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadProducto.add(this.jCheckBoxSeleccionarTodosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUtilidadProducto.add(this.jCheckBoxConGraficoReporteUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadProducto.add(this.jCheckBoxSeleccionarTodosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);															
				
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadProducto.add(this.jCheckBoxSeleccionadosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);															
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUtilidadProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UtilidadProducto.add(this.jCheckBoxConGraficoReporteUtilidadProducto, this.gridBagConstraintsUtilidadProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUtilidadProducto.add(this.jPanelParametrosAuxiliar3UtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadProducto.add(this.jComboBoxTiposAccionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
	
				
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUtilidadProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUtilidadProducto.add(this.jTextFieldValorCampoGeneralUtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUtilidadProducto = new GridBagLayout();

			this.jScrollPanelDatosUtilidadProducto.setLayout(gridaBagLayoutDatosUtilidadProducto);
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = 0;
			this.gridBagConstraintsUtilidadProducto.gridx = 0;
			
			this.jScrollPanelDatosUtilidadProducto.add(this.jTableDatosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUtilidadProducto.setViewportView(this.jTableDatosUtilidadProducto);
		this.jTableDatosUtilidadProducto.setFillsViewportHeight(true);
		this.jTableDatosUtilidadProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUtilidadProducto= new GridBagLayout();
		this.jPanelAccionesUtilidadProducto.setLayout(gridaBagLayoutAccionesUtilidadProducto);
		
		
		/*	
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = 0;
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
			
		this.jPanelAccionesUtilidadProducto.add(this.jButtonNuevoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdBodegaPorIdProductoUtilidadProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoUtilidadProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoUtilidadProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoUtilidadProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdBodegaPorIdProductoUtilidadProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.setLayout(gridaBagLayoutBusquedaPorIdBodegaPorIdProductoUtilidadProducto);

		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 0;
		gridBagConstraintsUtilidadProducto.gridx = 0;
		jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.add(jLabelid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto, gridBagConstraintsUtilidadProducto);

		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 0;
		gridBagConstraintsUtilidadProducto.gridx = 1;
		jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.add(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoUtilidadProducto, gridBagConstraintsUtilidadProducto);


		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 1;
		gridBagConstraintsUtilidadProducto.gridx = 0;
		jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.add(jLabelid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto, gridBagConstraintsUtilidadProducto);

		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 1;
		gridBagConstraintsUtilidadProducto.gridx = 1;
		jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.add(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoUtilidadProducto, gridBagConstraintsUtilidadProducto);


		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsUtilidadProducto.gridy = 1;
		gridBagConstraintsUtilidadProducto.gridx = 0;
		jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.add(this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoUtilidadProducto, gridBagConstraintsUtilidadProducto);

		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 2;
		gridBagConstraintsUtilidadProducto.gridx =1;
		jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto.add(jButtonBusquedaPorIdBodegaPorIdProductoUtilidadProducto, gridBagConstraintsUtilidadProducto);

		jTabbedPaneBusquedasUtilidadProducto.addTab("1.-Por Bodega Por Producto ", jPanelBusquedaPorIdBodegaPorIdProductoUtilidadProducto);
		jTabbedPaneBusquedasUtilidadProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaUtilidadProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaUtilidadProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaUtilidadProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaUtilidadProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaUtilidadProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaUtilidadProducto.setLayout(gridaBagLayoutFK_IdBodegaUtilidadProducto);

		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 0;
		gridBagConstraintsUtilidadProducto.gridx = 0;
		jPanelFK_IdBodegaUtilidadProducto.add(jLabelid_bodegaFK_IdBodegaUtilidadProducto, gridBagConstraintsUtilidadProducto);

		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 0;
		gridBagConstraintsUtilidadProducto.gridx = 1;
		jPanelFK_IdBodegaUtilidadProducto.add(jComboBoxid_bodegaFK_IdBodegaUtilidadProducto, gridBagConstraintsUtilidadProducto);

		gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUtilidadProducto.gridy = 1;
		gridBagConstraintsUtilidadProducto.gridx =1;
		jPanelFK_IdBodegaUtilidadProducto.add(jButtonFK_IdBodegaUtilidadProducto, gridBagConstraintsUtilidadProducto);

		jTabbedPaneBusquedasUtilidadProducto.addTab("2.-Por Bodega ", jPanelFK_IdBodegaUtilidadProducto);
		jTabbedPaneBusquedasUtilidadProducto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadProducto.gridx = 0;		
			//this.gridBagConstraintsUtilidadProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUtilidadProducto, this.gridBagConstraintsUtilidadProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUtilidadProducto.gridx = 0;		
		//this.gridBagConstraintsUtilidadProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUtilidadProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUtilidadProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadProducto.gridx = 0;		
			this.gridBagConstraintsUtilidadProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUtilidadProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUtilidadProducto, this.gridBagConstraintsUtilidadProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);								
		
		
		/*
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		*/		
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadProducto.gridx =0;
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
				
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(UtilidadProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUtilidadProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosUtilidadProducto.setLayout(gridaBagLayoutBusquedasParametrosUtilidadProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUtilidadProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
			
			
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
			
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUtilidadProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUtilidadProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUtilidadProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUtilidadProducto.setName("jPanelReporteDinamicoUtilidadProducto"); 
		
		this.jPanelReporteDinamicoUtilidadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUtilidadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUtilidadProducto.setLayout(gridaBagLayoutReporteDinamicoUtilidadProducto);
		
		
		this.jInternalFrameReporteDinamicoUtilidadProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUtilidadProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUtilidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUtilidadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUtilidadProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUtilidadProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUtilidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUtilidadProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoUtilidadProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoUtilidadProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUtilidadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUtilidadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Productoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUtilidadProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteUtilidadProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelColumnasSelectReporteUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUtilidadProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteUtilidadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUtilidadProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUtilidadProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUtilidadProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUtilidadProducto=new JScrollPane(this.jListColumnasSelectReporteUtilidadProducto);
			
			this.jScrollColumnasSelectReporteUtilidadProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUtilidadProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUtilidadProducto.add(this.jListColumnasSelectReporteUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jScrollColumnasSelectReporteUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUtilidadProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteUtilidadProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUtilidadProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteUtilidadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUtilidadProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUtilidadProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUtilidadProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUtilidadProducto=new JScrollPane(this.jListRelacionesSelectReporteUtilidadProducto);
			
			this.jScrollRelacionesSelectReporteUtilidadProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUtilidadProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoUtilidadProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUtilidadProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoUtilidadProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUtilidadProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUtilidadProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUtilidadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUtilidadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoUtilidadProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoUtilidadProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelConGraficoDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoUtilidadProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoUtilidadProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoUtilidadProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoUtilidadProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoUtilidadProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jCheckBoxConGraficoDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoUtilidadProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoUtilidadProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelColumnaCategoriaGraficoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoUtilidadProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoUtilidadProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoUtilidadProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jComboBoxColumnaCategoriaGraficoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorUtilidadProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorUtilidadProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelColumnaCategoriaValorUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorUtilidadProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorUtilidadProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorUtilidadProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorUtilidadProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jComboBoxColumnaCategoriaValorUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoUtilidadProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoUtilidadProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelColumnasValoresGraficoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoUtilidadProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoUtilidadProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoUtilidadProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoUtilidadProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoUtilidadProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoUtilidadProducto=new JScrollPane(this.jListColumnasValoresGraficoUtilidadProducto);
			
			this.jScrollColumnasValoresGraficoUtilidadProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoUtilidadProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoUtilidadProducto.add(this.jListColumnasSelectReporteUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jScrollColumnasValoresGraficoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoUtilidadProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoUtilidadProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelTiposGraficosReportesDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoUtilidadProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoUtilidadProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoUtilidadProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jComboBoxTiposGraficosReportesDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUtilidadProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUtilidadProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelGenerarExcelReporteDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUtilidadProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUtilidadProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUtilidadProducto.setToolTipText("Generar EXCEL"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUtilidadProducto.add(this.jButtonGenerarExcelReporteDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jComboBoxTiposReportesDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUtilidadProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUtilidadProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jLabelTiposArchivoReporteDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jComboBoxTiposArchivosReportesDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUtilidadProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUtilidadProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUtilidadProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUtilidadProducto.setToolTipText("Generar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jButtonGenerarReporteDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUtilidadProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUtilidadProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUtilidadProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUtilidadProducto.setToolTipText("Cancelar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUtilidadProducto.add(this.jButtonCerrarReporteDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUtilidadProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUtilidadProducto= new JScrollPane(jPanelReporteDinamicoUtilidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUtilidadProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUtilidadProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Productoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUtilidadProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUtilidadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUtilidadProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUtilidadProducto);
		this.jInternalFrameReporteDinamicoUtilidadProducto.getContentPane().add(this.jScrollPanelReporteDinamicoUtilidadProducto, this.gridBagConstraintsUtilidadProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUtilidadProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUtilidadProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUtilidadProducto.setName("jPanelImportacionUtilidadProducto"); 
		
		this.jPanelImportacionUtilidadProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUtilidadProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUtilidadProducto.setLayout(gridaBagLayoutImportacionUtilidadProducto);
		
		
		this.jInternalFrameImportacionUtilidadProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUtilidadProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUtilidadProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUtilidadProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUtilidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUtilidadProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadProducto.setResizable(true);
	    this.jInternalFrameImportacionUtilidadProducto.setClosable(true);
	    this.jInternalFrameImportacionUtilidadProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUtilidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUtilidadProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUtilidadProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUtilidadProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUtilidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUtilidadProducto.setResizable(true);
	    this.jInternalFrameImportacionUtilidadProducto.setClosable(true);
	    this.jInternalFrameImportacionUtilidadProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUtilidadProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUtilidadProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Productoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUtilidadProducto = new JLabelMe();

		this.jLabelArchivoImportacionUtilidadProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadProducto.add(this.jLabelArchivoImportacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUtilidadProducto = new JFileChooser();		
		this.jFileChooserImportacionUtilidadProducto.setToolTipText("ESCOGER ARCHIVO"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUtilidadProducto = new JButtonMe();
		this.jButtonAbrirImportacionUtilidadProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUtilidadProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUtilidadProducto.setToolTipText("Generar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadProducto.add(this.jButtonAbrirImportacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUtilidadProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionUtilidadProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUtilidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUtilidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUtilidadProducto.add(this.jLabelPathArchivoImportacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUtilidadProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUtilidadProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUtilidadProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadProducto.add(this.jTextFieldPathArchivoImportacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUtilidadProducto = new JButtonMe();
		this.jButtonGenerarImportacionUtilidadProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUtilidadProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUtilidadProducto.setToolTipText("Generar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadProducto.add(this.jButtonGenerarImportacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUtilidadProducto = new JButtonMe();
		this.jButtonCerrarImportacionUtilidadProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUtilidadProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUtilidadProducto.setToolTipText("Cancelar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsUtilidadProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUtilidadProducto.add(this.jButtonCerrarImportacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUtilidadProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionUtilidadProducto= new JScrollPane(jPanelImportacionUtilidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
		this.gridBagConstraintsUtilidadProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsUtilidadProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUtilidadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUtilidadProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUtilidadProducto);
		this.jInternalFrameImportacionUtilidadProducto.getContentPane().add(this.jScrollPanelImportacionUtilidadProducto, this.gridBagConstraintsUtilidadProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUtilidadProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUtilidadProducto = new JButtonMe();
			this.jButtonAbrirOrderByUtilidadProducto.setText("Orden");
			this.jButtonAbrirOrderByUtilidadProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUtilidadProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUtilidadProducto";
			inputMap = this.jButtonAbrirOrderByUtilidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUtilidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUtilidadProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByUtilidadProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUtilidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUtilidadProducto.setName("jPanelOrderByUtilidadProducto"); 
			
			this.jPanelOrderByUtilidadProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUtilidadProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUtilidadProducto.setLayout(gridaBagLayoutOrderByUtilidadProducto);
			
			
			this.jTableDatosUtilidadProductoOrderBy = new JTableMe();        
			this.jTableDatosUtilidadProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUtilidadProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUtilidadProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUtilidadProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUtilidadProductoOrderBy.setViewportView(this.jTableDatosUtilidadProductoOrderBy);
			this.jTableDatosUtilidadProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUtilidadProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUtilidadProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUtilidadProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUtilidadProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUtilidadProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUtilidadProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUtilidadProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUtilidadProducto.setTitle("Orden");
			this.jInternalFrameOrderByUtilidadProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUtilidadProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUtilidadProducto.setResizable(true);
			this.jInternalFrameOrderByUtilidadProducto.setClosable(true);
			this.jInternalFrameOrderByUtilidadProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUtilidadProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUtilidadProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUtilidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Productoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUtilidadProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUtilidadProducto.ipady =150;
				
			this.jPanelOrderByUtilidadProducto.add(jScrollPanelDatosUtilidadProductoOrderBy, this.gridBagConstraintsUtilidadProducto);//this.jTableDatosUtilidadProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUtilidadProducto = new JButtonMe();
			this.jButtonCerrarOrderByUtilidadProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUtilidadProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUtilidadProducto.setToolTipText("Cancelar"+" "+UtilidadProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUtilidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUtilidadProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUtilidadProducto.add(this.jButtonCerrarOrderByUtilidadProducto, this.gridBagConstraintsUtilidadProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUtilidadProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByUtilidadProducto= new JScrollPane(jPanelOrderByUtilidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUtilidadProducto = new GridBagConstraints();
			this.gridBagConstraintsUtilidadProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsUtilidadProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsUtilidadProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUtilidadProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUtilidadProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUtilidadProducto);
			
			this.jInternalFrameOrderByUtilidadProducto.getContentPane().add(this.jScrollPanelOrderByUtilidadProducto, this.gridBagConstraintsUtilidadProducto);			
		
		} else {
			this.jButtonAbrirOrderByUtilidadProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.utilidadproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUtilidadProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUtilidadProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUtilidadProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUtilidadProducto.getRowHeight();//UtilidadProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadProducto.isSelected()) {
					iHeightTable=UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUtilidadProducto.isSelected()) {
					iHeightTable=UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UtilidadProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUtilidadProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUtilidadProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUtilidadProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUtilidadProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUtilidadProducto!=null && this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.utilidadproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUtilidadProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUtilidadProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUtilidadProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUtilidadProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUtilidadProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUtilidadProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=utilidadproductoLogic.getUtilidadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UtilidadProducto> TraerUtilidadProductoBeans(List<UtilidadProducto> utilidadproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(UtilidadProducto utilidadproducto:utilidadproductos) {
					
				if(!(UtilidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UtilidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					utilidadproducto.setsDetalleGeneralEntityReporte(UtilidadProductoConstantesFunciones.getUtilidadProductoDescripcion(utilidadproducto));
										
						
					
						
					
				} else  {
							
					//utilidadproducto.setsDetalleGeneralEntityReporte(utilidadproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//utilidadproductobeans.add(utilidadproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return utilidadproductos;
    }
	//PARA REPORTES FIN
}
