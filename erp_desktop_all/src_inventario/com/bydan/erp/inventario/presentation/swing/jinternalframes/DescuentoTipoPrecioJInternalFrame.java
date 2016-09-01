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
import com.bydan.erp.inventario.util.DescuentoTipoPrecioConstantesFunciones;

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
public class DescuentoTipoPrecioJInternalFrame extends DescuentoTipoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDescuentoTipoPrecio;
	
	protected JMenuBar jmenuBarDescuentoTipoPrecio;
	
	protected JMenu jmenuDescuentoTipoPrecio;
	protected JMenu jmenuDatosDescuentoTipoPrecio;
	protected JMenu jmenuArchivoDescuentoTipoPrecio;
	protected JMenu jmenuAccionesDescuentoTipoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDescuentoTipoPrecio;	
	protected GridBagConstraints gridBagConstraintsDescuentoTipoPrecio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DescuentoTipoPrecioDetalleFormJInternalFrame jInternalFrameDetalleFormDescuentoTipoPrecio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDescuentoTipoPrecio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDescuentoTipoPrecio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";
	
	public DescuentoTipoPrecioSessionBean descuentotipoprecioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DescuentoTipoPrecio> descuentotipoprecios;		
	public List<DescuentoTipoPrecio> descuentotipopreciosEliminados;	
	public List<DescuentoTipoPrecio> descuentotipopreciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDescuentoTipoPrecio;		
	protected JButton jButtonAbrirOrderByDescuentoTipoPrecio;
	
	
	//protected JPanel jPanelOrderByDescuentoTipoPrecio;
	//public JScrollPane jScrollPanelOrderByDescuentoTipoPrecio;	
	//protected JButton jButtonCerrarOrderByDescuentoTipoPrecio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DescuentoTipoPrecioLogic descuentotipoprecioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDescuentoTipoPrecio;
	public JScrollPane jScrollPanelDatosEdicionDescuentoTipoPrecio;
	public JScrollPane jScrollPanelDatosGeneralDescuentoTipoPrecio;
    
	
	
	//public JScrollPane jScrollPanelDatosDescuentoTipoPrecioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDescuentoTipoPrecio;
	//public JScrollPane jScrollPanelImportacionDescuentoTipoPrecio;
	
	
	
	protected JPanel jPanelAccionesDescuentoTipoPrecio;
	
    protected JPanel jPanelPaginacionDescuentoTipoPrecio;
    protected JPanel jPanelParametrosReportesDescuentoTipoPrecio;
	protected JPanel jPanelParametrosReportesAccionesDescuentoTipoPrecio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DescuentoTipoPrecio;
	protected JPanel jPanelParametrosAuxiliar2DescuentoTipoPrecio;
	protected JPanel jPanelParametrosAuxiliar3DescuentoTipoPrecio;
	protected JPanel jPanelParametrosAuxiliar4DescuentoTipoPrecio;
	//protected JPanel jPanelParametrosAuxiliar5DescuentoTipoPrecio;
	
	
	
	//protected JPanel jPanelReporteDinamicoDescuentoTipoPrecio;
	//protected JPanel jPanelImportacionDescuentoTipoPrecio;
	
	
	public JTable jTableDatosDescuentoTipoPrecio;
	
	
	
	//public JTable jTableDatosDescuentoTipoPrecioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDescuentoTipoPrecio;
	protected JButton jButtonDuplicarDescuentoTipoPrecio;
	protected JButton jButtonCopiarDescuentoTipoPrecio;
	protected JButton jButtonVerFormDescuentoTipoPrecio;
	protected JButton jButtonNuevoRelacionesDescuentoTipoPrecio;
	protected JButton jButtonModificarDescuentoTipoPrecio;
	
    protected JButton jButtonGuardarCambiosTablaDescuentoTipoPrecio;
	protected JButton jButtonCerrarDescuentoTipoPrecio;
	
	
	protected JButton jButtonRecargarInformacionDescuentoTipoPrecio;
	protected JButton jButtonProcesarInformacionDescuentoTipoPrecio;
	
	
	protected JButton jButtonAnterioresDescuentoTipoPrecio;
	protected JButton jButtonSiguientesDescuentoTipoPrecio;
	protected JButton jButtonNuevoGuardarCambiosDescuentoTipoPrecio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDescuentoTipoPrecio;
	//protected JButton jButtonCerrarReporteDinamicoDescuentoTipoPrecio;
	//protected JButton jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio;	
	
	
	
	//protected JButton jButtonAbrirImportacionDescuentoTipoPrecio;
	//protected JButton jButtonGenerarImportacionDescuentoTipoPrecio;
	//protected JButton jButtonCerrarImportacionDescuentoTipoPrecio;
	//protected JFileChooser jFileChooserImportacionDescuentoTipoPrecio;
	//protected File fileImportacionDescuentoTipoPrecio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDescuentoTipoPrecio;
	protected JButton jButtonDuplicarToolBarDescuentoTipoPrecio;
	protected JButton jButtonNuevoRelacionesToolBarDescuentoTipoPrecio;
	
	
	public JButton jButtonGuardarCambiosToolBarDescuentoTipoPrecio;
	protected JButton jButtonCopiarToolBarDescuentoTipoPrecio;
	protected JButton jButtonVerFormToolBarDescuentoTipoPrecio;
	public JButton jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarDescuentoTipoPrecio;
	protected JButton jButtonCerrarToolBarDescuentoTipoPrecio;
	
	protected JButton jButtonRecargarInformacionToolBarDescuentoTipoPrecio;
	protected JButton jButtonProcesarInformacionToolBarDescuentoTipoPrecio;
	protected JButton jButtonAnterioresToolBarDescuentoTipoPrecio;
	protected JButton jButtonSiguientesToolBarDescuentoTipoPrecio;
	protected JButton jButtonNuevoGuardarCambiosToolBarDescuentoTipoPrecio;
	protected JButton jButtonAbrirOrderByToolBarDescuentoTipoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDescuentoTipoPrecio;
	protected JMenuItem jMenuItemDuplicarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemNuevoRelacionesDescuentoTipoPrecio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDescuentoTipoPrecio;
	protected JMenuItem jMenuItemCopiarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemVerFormDescuentoTipoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaDescuentoTipoPrecio;
	protected JMenuItem jMenuItemCerrarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarDescuentoTipoPrecio;
	
	protected JMenuItem jMenuItemRecargarInformacionDescuentoTipoPrecio;
	protected JMenuItem jMenuItemProcesarInformacionDescuentoTipoPrecio;
	protected JMenuItem jMenuItemAnterioresDescuentoTipoPrecio;
	protected JMenuItem jMenuItemSiguientesDescuentoTipoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio;
	protected JMenuItem jMenuItemAbrirOrderByDescuentoTipoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarDescuentoTipoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDescuentoTipoPrecio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDescuentoTipoPrecio;
	protected JCheckBox jCheckBoxSeleccionadosDescuentoTipoPrecio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio;
	protected JCheckBox jCheckBoxConGraficoReporteDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDescuentoTipoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDescuentoTipoPrecio;
	protected JTextField jTextFieldValorCampoGeneralDescuentoTipoPrecio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDescuentoTipoPrecio;
	//public JList<Reporte> jListColumnasSelectReporteDescuentoTipoPrecio;
	//public JScrollPane jScrollColumnasSelectReporteDescuentoTipoPrecio;
	
	//public JLabel jLabelRelacionesSelectReporteDescuentoTipoPrecio;
	//public JList<Reporte> jListRelacionesSelectReporteDescuentoTipoPrecio;
	//public JScrollPane jScrollRelacionesSelectReporteDescuentoTipoPrecio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDescuentoTipoPrecio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDescuentoTipoPrecio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDescuentoTipoPrecio;
	//public JLabel jLabelTiposArchivoReporteDinamicoDescuentoTipoPrecio;
	
		
	//public JLabel jLabelArchivoImportacionDescuentoTipoPrecio;	
	//public JLabel jLabelPathArchivoImportacionDescuentoTipoPrecio;
	//protected JTextField jTextFieldPathArchivoImportacionDescuentoTipoPrecio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDescuentoTipoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio;
	
	//public JLabel jLabelColumnaCategoriaValorDescuentoTipoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDescuentoTipoPrecio;
	
	//public JLabel jLabelColumnasValoresGraficoDescuentoTipoPrecio;
	//public JList<Reporte> jListColumnasValoresGraficoDescuentoTipoPrecio;
	//public JScrollPane jScrollColumnasValoresGraficoDescuentoTipoPrecio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDescuentoTipoPrecio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDescuentoTipoPrecio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDescuentoTipoPrecio;
	public JPanel jPanelFK_IdBodegaDescuentoTipoPrecio;
	public JButton jButtonFK_IdBodegaDescuentoTipoPrecio;
	public JPanel jPanelFK_IdTipoPrecioDescuentoTipoPrecio;
	public JButton jButtonFK_IdTipoPrecioDescuentoTipoPrecio;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDescuentoTipoPrecio;
	public JLabel jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio;
	public JButton jButtonid_bodegaFK_IdBodegaDescuentoTipoPrecio= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDescuentoTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDescuentoTipoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecioBusqueda= new JButtonMe();

	
	
	
	
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
	public DescuentoTipoPrecioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoTipoPrecioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoTipoPrecioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoTipoPrecioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDescuentoTipoPrecio)	{
		this.jButtonRecargarInformacionDescuentoTipoPrecio = jButtonRecargarInformacionDescuentoTipoPrecio;
	}
	
	public JButton getjButtonProcesarInformacionDescuentoTipoPrecio() {
		return this.jButtonProcesarInformacionDescuentoTipoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDescuentoTipoPrecio)	{
		this.jButtonProcesarInformacionDescuentoTipoPrecio = jButtonProcesarInformacionDescuentoTipoPrecio;
	}
	
	
	public JButton getjButtonRecargarInformacionDescuentoTipoPrecio() {
		return this.jButtonRecargarInformacionDescuentoTipoPrecio;
	}
	
	
	public List<DescuentoTipoPrecio> getdescuentotipoprecios() {
		return this.descuentotipoprecios;
	}

	public void setdescuentotipoprecios(List<DescuentoTipoPrecio> descuentotipoprecios) {
		this.descuentotipoprecios = descuentotipoprecios;
	}
	
	public List<DescuentoTipoPrecio> getdescuentotipopreciosAux() {
		return this.descuentotipopreciosAux;
	}

	public void setdescuentotipopreciosAux(List<DescuentoTipoPrecio> descuentotipopreciosAux) {
		this.descuentotipopreciosAux = descuentotipopreciosAux;
	}
	
	public List<DescuentoTipoPrecio> getdescuentotipopreciosEliminados() {
		return this.descuentotipopreciosEliminados;
	}

	public void setDescuentoTipoPreciosEliminados(List<DescuentoTipoPrecio> descuentotipopreciosEliminados) {
		this.descuentotipopreciosEliminados = descuentotipopreciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDescuentoTipoPrecio() {
		return jComboBoxTiposSeleccionarDescuentoTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDescuentoTipoPrecio(
			JComboBox jComboBoxTiposSeleccionarDescuentoTipoPrecio) {
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio = jComboBoxTiposSeleccionarDescuentoTipoPrecio;
	}
	
	public void setBorderResaltarTiposSeleccionarDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDescuentoTipoPrecio() {
		return jTextFieldValorCampoGeneralDescuentoTipoPrecio;
	}

	public void setjTextFieldValorCampoGeneralDescuentoTipoPrecio(
			JTextField jTextFieldValorCampoGeneralDescuentoTipoPrecio) {
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio = jTextFieldValorCampoGeneralDescuentoTipoPrecio;
	}

	public void setBorderResaltarValorCampoGeneralDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDescuentoTipoPrecio() {
		return this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio;
	}

	public void setjCheckBoxSeleccionarTodosDescuentoTipoPrecio(
			JCheckBox jCheckBoxSeleccionarTodosDescuentoTipoPrecio) {
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio = jCheckBoxSeleccionarTodosDescuentoTipoPrecio;
	}

	public void setBorderResaltarSeleccionarTodosDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDescuentoTipoPrecio() {
		return this.jCheckBoxSeleccionadosDescuentoTipoPrecio;
	}

	public void setjCheckBoxSeleccionadosDescuentoTipoPrecio(
			JCheckBox jCheckBoxSeleccionadosDescuentoTipoPrecio) {
		this.jCheckBoxSeleccionadosDescuentoTipoPrecio = jCheckBoxSeleccionadosDescuentoTipoPrecio;
	}
	
	public void setBorderResaltarSeleccionadosDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDescuentoTipoPrecio() {
		return this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDescuentoTipoPrecio(
			JComboBox jComboBoxTiposArchivosReportesDescuentoTipoPrecio) {
		this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio = jComboBoxTiposArchivosReportesDescuentoTipoPrecio;
	}

	public void setBorderResaltarTiposArchivosReportesDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDescuentoTipoPrecio() {
		return this.jComboBoxTiposReportesDescuentoTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDescuentoTipoPrecio(
			JComboBox jComboBoxTiposReportesDescuentoTipoPrecio) {
		this.jComboBoxTiposReportesDescuentoTipoPrecio = jComboBoxTiposReportesDescuentoTipoPrecio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDescuentoTipoPrecio() {
	//	return jComboBoxTiposReportesDinamicoDescuentoTipoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDescuentoTipoPrecio(
	//		JComboBox jComboBoxTiposReportesDinamicoDescuentoTipoPrecio) {
	//	this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio = jComboBoxTiposReportesDinamicoDescuentoTipoPrecio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio() {
	//	return jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio = jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio;
	//}
	
	public void setBorderResaltarTiposReportesDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDescuentoTipoPrecio() {
		return this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDescuentoTipoPrecio(
			JComboBox jComboBoxTiposGraficosReportesDescuentoTipoPrecio) {
		this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio = jComboBoxTiposGraficosReportesDescuentoTipoPrecio;
	}
	
	public void setBorderResaltarTiposGraficosReportesDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDescuentoTipoPrecio() {
		return this.jComboBoxTiposPaginacionDescuentoTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDescuentoTipoPrecio(
			JComboBox jComboBoxTiposPaginacionDescuentoTipoPrecio) {
		this.jComboBoxTiposPaginacionDescuentoTipoPrecio = jComboBoxTiposPaginacionDescuentoTipoPrecio;
	}
	
	public void setBorderResaltarTiposPaginacionDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDescuentoTipoPrecio() {
		return this.jComboBoxTiposRelacionesDescuentoTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDescuentoTipoPrecio() {
		return this.jComboBoxTiposAccionesDescuentoTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDescuentoTipoPrecio(
			JComboBox jComboBoxTiposRelacionesDescuentoTipoPrecio) {
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio = jComboBoxTiposRelacionesDescuentoTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDescuentoTipoPrecio(
			JComboBox jComboBoxTiposAccionesDescuentoTipoPrecio) {
		this.jComboBoxTiposAccionesDescuentoTipoPrecio = jComboBoxTiposAccionesDescuentoTipoPrecio;
	}
	
	public void setBorderResaltarTiposRelacionesDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDescuentoTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDescuentoTipoPrecio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDescuentoTipoPrecio() {
	//	return jCheckBoxConGraficoDinamicoDescuentoTipoPrecio;
	//}

	//public void setjCheckBoxConGraficoDinamicoDescuentoTipoPrecio(
	//		JCheckBox jCheckBoxConGraficoDinamicoDescuentoTipoPrecio) {
	//	this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio = jCheckBoxConGraficoDinamicoDescuentoTipoPrecio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDescuentoTipoPrecio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDescuentoTipoPrecio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio .setBorder(borderResaltar);		
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
		this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		
		this.descuentotipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.descuentotipoprecioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DescuentoTipoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Descuento Tipo Precio MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
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
		
		DescuentoTipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDescuentoTipoPrecio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"nuevo","nuevo","Nuevo"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"duplicar","duplicar","Duplicar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"copiar","copiar","Copiar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"ver_form","ver_form","Ver"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"recargar","recargar","Recargar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDescuentoTipoPrecio,this.jTtoolBarDescuentoTipoPrecio,
							"cerrar","cerrar","Salir"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDescuentoTipoPrecio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDescuentoTipoPrecio;
			
				this.jButtonProcesarInformacionToolBarDescuentoTipoPrecio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDescuentoTipoPrecio;
				
		//protected JButton jButtonModificarToolBarDescuentoTipoPrecio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDescuentoTipoPrecio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDescuentoTipoPrecio=new JMenuMe("General");
		this.jmenuArchivoDescuentoTipoPrecio=new JMenuMe("Archivo");
		this.jmenuAccionesDescuentoTipoPrecio=new JMenuMe("Acciones");
		this.jmenuDatosDescuentoTipoPrecio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDescuentoTipoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDescuentoTipoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDescuentoTipoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDescuentoTipoPrecio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDescuentoTipoPrecio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDescuentoTipoPrecio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDescuentoTipoPrecio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDescuentoTipoPrecio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDescuentoTipoPrecio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDescuentoTipoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDescuentoTipoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDescuentoTipoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDescuentoTipoPrecio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDescuentoTipoPrecio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDescuentoTipoPrecio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDescuentoTipoPrecio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDescuentoTipoPrecio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDescuentoTipoPrecio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDescuentoTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDescuentoTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDescuentoTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDescuentoTipoPrecio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDescuentoTipoPrecio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDescuentoTipoPrecio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDescuentoTipoPrecio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDescuentoTipoPrecio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDescuentoTipoPrecio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDescuentoTipoPrecio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDescuentoTipoPrecio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDescuentoTipoPrecio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDescuentoTipoPrecio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDescuentoTipoPrecio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDescuentoTipoPrecio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDescuentoTipoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDescuentoTipoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDescuentoTipoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDescuentoTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDescuentoTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDescuentoTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDescuentoTipoPrecio.add(this.jMenuItemCerrarDescuentoTipoPrecio);
			
			this.jmenuAccionesDescuentoTipoPrecio.add(this.jMenuItemNuevoDescuentoTipoPrecio);
			this.jmenuAccionesDescuentoTipoPrecio.add(this.jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio);
			this.jmenuAccionesDescuentoTipoPrecio.add(this.jMenuItemNuevoRelacionesDescuentoTipoPrecio);
			this.jmenuAccionesDescuentoTipoPrecio.add(this.jMenuItemGuardarCambiosTablaDescuentoTipoPrecio);		
			this.jmenuAccionesDescuentoTipoPrecio.add(this.jMenuItemDuplicarDescuentoTipoPrecio);		
			this.jmenuAccionesDescuentoTipoPrecio.add(this.jMenuItemCopiarDescuentoTipoPrecio);		
			this.jmenuAccionesDescuentoTipoPrecio.add(this.jMenuItemVerFormDescuentoTipoPrecio);		
			
			this.jmenuDatosDescuentoTipoPrecio.add(this.jMenuItemRecargarInformacionDescuentoTipoPrecio);				
			this.jmenuDatosDescuentoTipoPrecio.add(this.jMenuItemAnterioresDescuentoTipoPrecio);				
			this.jmenuDatosDescuentoTipoPrecio.add(this.jMenuItemSiguientesDescuentoTipoPrecio);				
			this.jmenuDatosDescuentoTipoPrecio.add(this.jMenuItemAbrirOrderByDescuentoTipoPrecio);				
			this.jmenuDatosDescuentoTipoPrecio.add(this.jMenuItemMostrarOcultarDescuentoTipoPrecio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDescuentoTipoPrecio.add(this.jMenuItemGuardarCambiosDescuentoTipoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDescuentoTipoPrecio.add(this.jmenuArchivoDescuentoTipoPrecio);		
			this.jmenuBarDescuentoTipoPrecio.add(this.jmenuAccionesDescuentoTipoPrecio);		
			this.jmenuBarDescuentoTipoPrecio.add(this.jmenuDatosDescuentoTipoPrecio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDescuentoTipoPrecio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDescuentoTipoPrecio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDescuentoTipoPrecio.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDescuentoTipoPrecio= new JButtonMe();
		this.jButtonFK_IdBodegaDescuentoTipoPrecio.setText("Buscar");
		this.jButtonFK_IdBodegaDescuentoTipoPrecio.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDescuentoTipoPrecio,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioDescuentoTipoPrecio.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioDescuentoTipoPrecio= new JButtonMe();
		this.jButtonFK_IdTipoPrecioDescuentoTipoPrecio.setText("Buscar");
		this.jButtonFK_IdTipoPrecioDescuentoTipoPrecio.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioDescuentoTipoPrecio,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDescuentoTipoPrecio=new JTabbedPane();


		this.jTabbedPaneBusquedasDescuentoTipoPrecio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDescuentoTipoPrecio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDescuentoTipoPrecio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDescuentoTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDescuentoTipoPrecio = new DescuentoTipoPrecioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Descuento Tipo Precio DATOS");
			this.jInternalFrameDetalleFormDescuentoTipoPrecio = new DescuentoTipoPrecioDetalleFormJInternalFrame(jDesktopPane,this.descuentotipoprecioSessionBean.getConGuardarRelaciones(),this.descuentotipoprecioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDescuentoTipoPrecio = null;//new DescuentoTipoPrecioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDescuentoTipoPrecio= new GridBagLayout();
		
		
		this.jTableDatosDescuentoTipoPrecio = new JTableMe();      
		
		String sToolTipDescuentoTipoPrecio="";
		sToolTipDescuentoTipoPrecio=DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDescuentoTipoPrecio+="(Inventario.DescuentoTipoPrecio)";
		}
		
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipDescuentoTipoPrecio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDescuentoTipoPrecio.setToolTipText(sToolTipDescuentoTipoPrecio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDescuentoTipoPrecio);
		this.jTableDatosDescuentoTipoPrecio.setAutoCreateRowSorter(true);
		this.jTableDatosDescuentoTipoPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDescuentoTipoPrecio.setRowSelectionAllowed(true);
		this.jTableDatosDescuentoTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDescuentoTipoPrecio = new JButtonMe();
		this.jButtonDuplicarDescuentoTipoPrecio = new JButtonMe();
		this.jButtonCopiarDescuentoTipoPrecio = new JButtonMe();
		this.jButtonVerFormDescuentoTipoPrecio = new JButtonMe();
		this.jButtonNuevoRelacionesDescuentoTipoPrecio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio = new JButtonMe();
		this.jButtonCerrarDescuentoTipoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosDescuentoTipoPrecio = new JScrollPane();   
        this.jScrollPanelDatosGeneralDescuentoTipoPrecio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Descuento Tipo Precio";
		
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Tipo Precios" + this.sPath));
		} else {
			this.jScrollPanelDatosDescuentoTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDescuentoTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesDescuentoTipoPrecio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDescuentoTipoPrecio=new ReporteDinamicoJInternalFrame(DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDescuentoTipoPrecio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDescuentoTipoPrecio=new ImportacionJInternalFrame(DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDescuentoTipoPrecio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDescuentoTipoPrecio = new JButtonMe();
		
		this.jButtonAbrirOrderByDescuentoTipoPrecio.setText("Orden");
		this.jButtonAbrirOrderByDescuentoTipoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDescuentoTipoPrecio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDescuentoTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoTipoPrecio,false,this);
			
			//this.cargarOrderByDescuentoTipoPrecio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDescuentoTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDescuentoTipoPrecio,true,this);
			
			//this.cargarOrderByDescuentoTipoPrecio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDescuentoTipoPrecio.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosDescuentoTipoPrecio.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosDescuentoTipoPrecio.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosDescuentoTipoPrecio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDescuentoTipoPrecio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDescuentoTipoPrecio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDescuentoTipoPrecio.setText("Nuevo");
		this.jButtonDuplicarDescuentoTipoPrecio.setText("Duplicar");
		this.jButtonCopiarDescuentoTipoPrecio.setText("Copiar");
		this.jButtonVerFormDescuentoTipoPrecio.setText("Ver");
		this.jButtonNuevoRelacionesDescuentoTipoPrecio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.setText("Guardar");
		this.jButtonCerrarDescuentoTipoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDescuentoTipoPrecio,"nuevo_button","Nuevo",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDescuentoTipoPrecio,"duplicar_button","Duplicar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDescuentoTipoPrecio,"copiar_button","Copiar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDescuentoTipoPrecio,"ver_form","Ver",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDescuentoTipoPrecio,"nuevorelaciones_button","Nuevo Rel",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDescuentoTipoPrecio,"guardarcambiostabla_button","Guardar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDescuentoTipoPrecio,"cerrar_button","Salir",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDescuentoTipoPrecio.setToolTipText("Nuevo"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDescuentoTipoPrecio.setToolTipText("Duplicar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDescuentoTipoPrecio.setToolTipText("Copiar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDescuentoTipoPrecio.setToolTipText("Ver"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDescuentoTipoPrecio.setToolTipText("Nuevo Rel"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.setToolTipText("Guardar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDescuentoTipoPrecio.setToolTipText("Salir"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDescuentoTipoPrecio";
		inputMap = this.jButtonNuevoDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDescuentoTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDescuentoTipoPrecio"));
		
		//DUPLICAR
		sMapKey = "DuplicarDescuentoTipoPrecio";
		inputMap = this.jButtonDuplicarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDescuentoTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDescuentoTipoPrecio"));
		
		//COPIAR
		sMapKey = "CopiarDescuentoTipoPrecio";
		inputMap = this.jButtonCopiarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDescuentoTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDescuentoTipoPrecio"));
		
		//VEr FORM
		sMapKey = "VerFormDescuentoTipoPrecio";
		inputMap = this.jButtonVerFormDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDescuentoTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDescuentoTipoPrecio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDescuentoTipoPrecio";
		inputMap = this.jButtonNuevoRelacionesDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDescuentoTipoPrecio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDescuentoTipoPrecio";
		inputMap = this.jButtonModificarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDescuentoTipoPrecio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDescuentoTipoPrecio";
		inputMap = this.jButtonCerrarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDescuentoTipoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDescuentoTipoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDescuentoTipoPrecio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DescuentoTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DescuentoTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DescuentoTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DescuentoTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DescuentoTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDescuentoTipoPrecio.setName("jPanelParametrosReportesDescuentoTipoPrecio"); 
		
		this.jPanelParametrosReportesAccionesDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDescuentoTipoPrecio.setName("jPanelParametrosReportesAccionesDescuentoTipoPrecio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDescuentoTipoPrecio = new JButtonMe();
		this.jButtonRecargarInformacionDescuentoTipoPrecio.setText("Recargar");
		this.jButtonRecargarInformacionDescuentoTipoPrecio.setToolTipText("Recargar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDescuentoTipoPrecio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDescuentoTipoPrecio = new JButtonMe();
		this.jButtonProcesarInformacionDescuentoTipoPrecio.setText("Procesar");
		this.jButtonProcesarInformacionDescuentoTipoPrecio.setToolTipText("Procesar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDescuentoTipoPrecio.setVisible(false);
			
		this.jButtonProcesarInformacionDescuentoTipoPrecio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDescuentoTipoPrecio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDescuentoTipoPrecio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposReportesDescuentoTipoPrecio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDescuentoTipoPrecio.setText("Paginacion");
		this.jComboBoxTiposPaginacionDescuentoTipoPrecio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDescuentoTipoPrecio.setText("Accion");
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDescuentoTipoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.setText("Accion");
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDescuentoTipoPrecio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDescuentoTipoPrecio = new JLabelMe();
		
		this.jLabelAccionesDescuentoTipoPrecio.setText("Acciones");		
		this.jLabelAccionesDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDescuentoTipoPrecio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDescuentoTipoPrecio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDescuentoTipoPrecio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDescuentoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDescuentoTipoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoReporteDescuentoTipoPrecio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDescuentoTipoPrecio = new JButtonMe();
		//this.jButtonAnterioresDescuentoTipoPrecio.setText("<<");
        this.jButtonAnterioresDescuentoTipoPrecio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDescuentoTipoPrecio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDescuentoTipoPrecio = new JButtonMe();
		//this.jButtonSiguientesDescuentoTipoPrecio.setText(">>");
        this.jButtonSiguientesDescuentoTipoPrecio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDescuentoTipoPrecio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio.setText("Nue");
        this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio,"nuevoguardarcambios_button","Nue",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDescuentoTipoPrecio";
		inputMap = this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDescuentoTipoPrecio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDescuentoTipoPrecio";
		inputMap = this.jButtonRecargarInformacionDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDescuentoTipoPrecio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDescuentoTipoPrecio";
		inputMap = this.jButtonSiguientesDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDescuentoTipoPrecio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDescuentoTipoPrecio";
		inputMap = this.jButtonAnterioresDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDescuentoTipoPrecio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDescuentoTipoPrecio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDescuentoTipoPrecio.setMinimumSize(new Dimension(this.getWidth(),DescuentoTipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DescuentoTipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDescuentoTipoPrecio.setMaximumSize(new Dimension(this.getWidth(),DescuentoTipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DescuentoTipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDescuentoTipoPrecio.setPreferredSize(new Dimension(this.getWidth(),DescuentoTipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DescuentoTipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDescuentoTipoPrecio = new GridBagLayout();

			this.jPanelPaginacionDescuentoTipoPrecio.setLayout(gridaBagLayoutPaginacionDescuentoTipoPrecio);						
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonAnterioresDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
					
						
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
			
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonNuevoGuardarCambiosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
						
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonSiguientesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonNuevoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
						
			
			
			if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
				this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonGuardarCambiosTablaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			}
			
			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonDuplicarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonCopiarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonVerFormDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDescuentoTipoPrecio.add(this.jButtonCerrarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		
		this.jButtonRecargarInformacionDescuentoTipoPrecio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDescuentoTipoPrecio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDescuentoTipoPrecio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDescuentoTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDescuentoTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDescuentoTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDescuentoTipoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDescuentoTipoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDescuentoTipoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDescuentoTipoPrecio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDescuentoTipoPrecio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDescuentoTipoPrecio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDescuentoTipoPrecio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDescuentoTipoPrecio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDescuentoTipoPrecio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDescuentoTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDescuentoTipoPrecio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DescuentoTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DescuentoTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DescuentoTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DescuentoTipoPrecio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDescuentoTipoPrecio.setLayout(gridaBagParametrosReportesDescuentoTipoPrecio);
			this.jPanelParametrosReportesAccionesDescuentoTipoPrecio.setLayout(gridaBagParametrosReportesAccionesDescuentoTipoPrecio);
			
			
			this.jPanelParametrosAuxiliar1DescuentoTipoPrecio.setLayout(gridaBagParametrosAuxiliar1DescuentoTipoPrecio);
			this.jPanelParametrosAuxiliar2DescuentoTipoPrecio.setLayout(gridaBagParametrosAuxiliar2DescuentoTipoPrecio);
			this.jPanelParametrosAuxiliar3DescuentoTipoPrecio.setLayout(gridaBagParametrosAuxiliar3DescuentoTipoPrecio);
			this.jPanelParametrosAuxiliar4DescuentoTipoPrecio.setLayout(gridaBagParametrosAuxiliar4DescuentoTipoPrecio);
			//this.jPanelParametrosAuxiliar5DescuentoTipoPrecio.setLayout(gridaBagParametrosAuxiliar2DescuentoTipoPrecio);			
			
			
			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jButtonRecargarInformacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DescuentoTipoPrecio.add(this.jComboBoxTiposPaginacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DescuentoTipoPrecio.add(this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DescuentoTipoPrecio.add(this.jComboBoxTiposArchivosReportesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jPanelParametrosAuxiliar1DescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DescuentoTipoPrecio.add(this.jComboBoxTiposReportesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);																		
			
			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DescuentoTipoPrecio.add(this.jComboBoxTiposGraficosReportesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jPanelParametrosAuxiliar4DescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jComboBoxTiposReportesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jCheckBoxGenerarReporteDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jPanelParametrosAuxiliar2DescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jLabelAccionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jButtonAbrirOrderByDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jComboBoxTiposSeleccionarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
			
			
			/*
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jCheckBoxConGraficoReporteDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DescuentoTipoPrecio.add(this.jCheckBoxSeleccionarTodosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);															
				
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DescuentoTipoPrecio.add(this.jCheckBoxSeleccionadosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);															
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DescuentoTipoPrecio.add(this.jCheckBoxConGraficoReporteDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jPanelParametrosAuxiliar3DescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jComboBoxTiposAccionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
	
				
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDescuentoTipoPrecio.add(this.jTextFieldValorCampoGeneralDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDescuentoTipoPrecio = new GridBagLayout();

			this.jScrollPanelDatosDescuentoTipoPrecio.setLayout(gridaBagLayoutDatosDescuentoTipoPrecio);
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
			
			this.jScrollPanelDatosDescuentoTipoPrecio.add(this.jTableDatosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDescuentoTipoPrecio.setViewportView(this.jTableDatosDescuentoTipoPrecio);
		this.jTableDatosDescuentoTipoPrecio.setFillsViewportHeight(true);
		this.jTableDatosDescuentoTipoPrecio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDescuentoTipoPrecio= new GridBagLayout();
		this.jPanelAccionesDescuentoTipoPrecio.setLayout(gridaBagLayoutAccionesDescuentoTipoPrecio);
		
		
		/*	
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
			
		this.jPanelAccionesDescuentoTipoPrecio.add(this.jButtonNuevoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDescuentoTipoPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDescuentoTipoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDescuentoTipoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDescuentoTipoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDescuentoTipoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDescuentoTipoPrecio.setLayout(gridaBagLayoutFK_IdBodegaDescuentoTipoPrecio);

		gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
		jPanelFK_IdBodegaDescuentoTipoPrecio.add(jLabelid_bodegaFK_IdBodegaDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);

		gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
		jPanelFK_IdBodegaDescuentoTipoPrecio.add(jComboBoxid_bodegaFK_IdBodegaDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);

		gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
		gridBagConstraintsDescuentoTipoPrecio.gridx =1;
		jPanelFK_IdBodegaDescuentoTipoPrecio.add(jButtonFK_IdBodegaDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);

		jTabbedPaneBusquedasDescuentoTipoPrecio.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDescuentoTipoPrecio);
		jTabbedPaneBusquedasDescuentoTipoPrecio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioDescuentoTipoPrecio= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioDescuentoTipoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioDescuentoTipoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioDescuentoTipoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioDescuentoTipoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioDescuentoTipoPrecio.setLayout(gridaBagLayoutFK_IdTipoPrecioDescuentoTipoPrecio);

		gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
		jPanelFK_IdTipoPrecioDescuentoTipoPrecio.add(jLabelid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);

		gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
		jPanelFK_IdTipoPrecioDescuentoTipoPrecio.add(jComboBoxid_tipo_precioFK_IdTipoPrecioDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);

		gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDescuentoTipoPrecio.gridy = 1;
		gridBagConstraintsDescuentoTipoPrecio.gridx =1;
		jPanelFK_IdTipoPrecioDescuentoTipoPrecio.add(jButtonFK_IdTipoPrecioDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);

		jTabbedPaneBusquedasDescuentoTipoPrecio.addTab("2.-Por Tipo Precio ", jPanelFK_IdTipoPrecioDescuentoTipoPrecio);
		jTabbedPaneBusquedasDescuentoTipoPrecio.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDescuentoTipoPrecio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;		
			//this.gridBagConstraintsDescuentoTipoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;		
		//this.gridBagConstraintsDescuentoTipoPrecio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDescuentoTipoPrecio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;		
			this.gridBagConstraintsDescuentoTipoPrecio.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);								
		
		
		/*
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		*/		
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =0;
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDescuentoTipoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
				
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDescuentoTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDescuentoTipoPrecio = new GridBagLayout();
			this.jPanelBusquedasParametrosDescuentoTipoPrecio.setLayout(gridaBagLayoutBusquedasParametrosDescuentoTipoPrecio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			
			
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
			
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDescuentoTipoPrecio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDescuentoTipoPrecio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDescuentoTipoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDescuentoTipoPrecio.setName("jPanelReporteDinamicoDescuentoTipoPrecio"); 
		
		this.jPanelReporteDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDescuentoTipoPrecio.setLayout(gridaBagLayoutReporteDinamicoDescuentoTipoPrecio);
		
		
		this.jInternalFrameReporteDinamicoDescuentoTipoPrecio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDescuentoTipoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDescuentoTipoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setResizable(true);
	    this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setClosable(true);
	    this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Tipo Precios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDescuentoTipoPrecio = new JLabelMe();

		this.jLabelColumnasSelectReporteDescuentoTipoPrecio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelColumnasSelectReporteDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDescuentoTipoPrecio = new JList<Reporte>();
		this.jListColumnasSelectReporteDescuentoTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDescuentoTipoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDescuentoTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDescuentoTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDescuentoTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDescuentoTipoPrecio=new JScrollPane(this.jListColumnasSelectReporteDescuentoTipoPrecio);
			
			this.jScrollColumnasSelectReporteDescuentoTipoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDescuentoTipoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDescuentoTipoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jListColumnasSelectReporteDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jScrollColumnasSelectReporteDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDescuentoTipoPrecio = new JLabelMe();

		this.jLabelRelacionesSelectReporteDescuentoTipoPrecio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDescuentoTipoPrecio = new JList<Reporte>();
		this.jListRelacionesSelectReporteDescuentoTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDescuentoTipoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDescuentoTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDescuentoTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDescuentoTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDescuentoTipoPrecio=new JScrollPane(this.jListRelacionesSelectReporteDescuentoTipoPrecio);
			
			this.jScrollRelacionesSelectReporteDescuentoTipoPrecio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDescuentoTipoPrecio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDescuentoTipoPrecio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio = new JComboBoxMe();
		this.jListColumnasValoresGraficoDescuentoTipoPrecio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDescuentoTipoPrecio = new JLabelMe();

		this.jLabelConGraficoDinamicoDescuentoTipoPrecio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelConGraficoDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jCheckBoxConGraficoDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDescuentoTipoPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDescuentoTipoPrecio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelColumnaCategoriaGraficoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDescuentoTipoPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaValorDescuentoTipoPrecio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelColumnaCategoriaValorDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDescuentoTipoPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDescuentoTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jComboBoxColumnaCategoriaValorDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDescuentoTipoPrecio = new JLabelMe();

		this.jLabelColumnasValoresGraficoDescuentoTipoPrecio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelColumnasValoresGraficoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDescuentoTipoPrecio = new JList<Reporte>();
		this.jListColumnasValoresGraficoDescuentoTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDescuentoTipoPrecio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDescuentoTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDescuentoTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDescuentoTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDescuentoTipoPrecio=new JScrollPane(this.jListColumnasValoresGraficoDescuentoTipoPrecio);
			
			this.jScrollColumnasValoresGraficoDescuentoTipoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDescuentoTipoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDescuentoTipoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jListColumnasSelectReporteDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jScrollColumnasValoresGraficoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDescuentoTipoPrecio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDescuentoTipoPrecio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelTiposGraficosReportesDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDescuentoTipoPrecio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDescuentoTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jComboBoxTiposGraficosReportesDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDescuentoTipoPrecio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDescuentoTipoPrecio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelGenerarExcelReporteDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio.setToolTipText("Generar EXCEL"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jButtonGenerarExcelReporteDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jComboBoxTiposReportesDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDescuentoTipoPrecio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDescuentoTipoPrecio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jLabelTiposArchivoReporteDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jComboBoxTiposArchivosReportesDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDescuentoTipoPrecio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDescuentoTipoPrecio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDescuentoTipoPrecio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDescuentoTipoPrecio.setToolTipText("Generar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jButtonGenerarReporteDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDescuentoTipoPrecio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDescuentoTipoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDescuentoTipoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDescuentoTipoPrecio.setToolTipText("Cancelar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDescuentoTipoPrecio.add(this.jButtonCerrarReporteDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDescuentoTipoPrecio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDescuentoTipoPrecio= new JScrollPane(jPanelReporteDinamicoDescuentoTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Tipo Precios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDescuentoTipoPrecio);
		this.jInternalFrameReporteDinamicoDescuentoTipoPrecio.getContentPane().add(this.jScrollPanelReporteDinamicoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDescuentoTipoPrecio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDescuentoTipoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDescuentoTipoPrecio.setName("jPanelImportacionDescuentoTipoPrecio"); 
		
		this.jPanelImportacionDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDescuentoTipoPrecio.setLayout(gridaBagLayoutImportacionDescuentoTipoPrecio);
		
		
		this.jInternalFrameImportacionDescuentoTipoPrecio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDescuentoTipoPrecio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDescuentoTipoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDescuentoTipoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDescuentoTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDescuentoTipoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDescuentoTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setResizable(true);
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setClosable(true);
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDescuentoTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDescuentoTipoPrecio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDescuentoTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setResizable(true);
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setClosable(true);
	    this.jInternalFrameImportacionDescuentoTipoPrecio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Tipo Precios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDescuentoTipoPrecio = new JLabelMe();

		this.jLabelArchivoImportacionDescuentoTipoPrecio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDescuentoTipoPrecio.add(this.jLabelArchivoImportacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDescuentoTipoPrecio = new JFileChooser();		
		this.jFileChooserImportacionDescuentoTipoPrecio.setToolTipText("ESCOGER ARCHIVO"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDescuentoTipoPrecio = new JButtonMe();
		this.jButtonAbrirImportacionDescuentoTipoPrecio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDescuentoTipoPrecio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDescuentoTipoPrecio.setToolTipText("Generar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoTipoPrecio.add(this.jButtonAbrirImportacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDescuentoTipoPrecio = new JLabelMe();

		this.jLabelPathArchivoImportacionDescuentoTipoPrecio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDescuentoTipoPrecio.add(this.jLabelPathArchivoImportacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDescuentoTipoPrecio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDescuentoTipoPrecio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDescuentoTipoPrecio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDescuentoTipoPrecio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoTipoPrecio.add(this.jTextFieldPathArchivoImportacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDescuentoTipoPrecio = new JButtonMe();
		this.jButtonGenerarImportacionDescuentoTipoPrecio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDescuentoTipoPrecio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDescuentoTipoPrecio.setToolTipText("Generar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoTipoPrecio.add(this.jButtonGenerarImportacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDescuentoTipoPrecio = new JButtonMe();
		this.jButtonCerrarImportacionDescuentoTipoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDescuentoTipoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDescuentoTipoPrecio.setToolTipText("Cancelar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDescuentoTipoPrecio.add(this.jButtonCerrarImportacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDescuentoTipoPrecio = new GridBagLayout();
		
		this.jScrollPanelImportacionDescuentoTipoPrecio= new JScrollPane(jPanelImportacionDescuentoTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy =iPosYImportacion;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =iPosXImportacion;
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDescuentoTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDescuentoTipoPrecio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDescuentoTipoPrecio);
		this.jInternalFrameImportacionDescuentoTipoPrecio.getContentPane().add(this.jScrollPanelImportacionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDescuentoTipoPrecio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDescuentoTipoPrecio = new JButtonMe();
			this.jButtonAbrirOrderByDescuentoTipoPrecio.setText("Orden");
			this.jButtonAbrirOrderByDescuentoTipoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDescuentoTipoPrecio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDescuentoTipoPrecio";
			inputMap = this.jButtonAbrirOrderByDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDescuentoTipoPrecio"));
		
		
			GridBagLayout gridaBagLayoutOrderByDescuentoTipoPrecio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDescuentoTipoPrecio.setName("jPanelOrderByDescuentoTipoPrecio"); 
			
			this.jPanelOrderByDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDescuentoTipoPrecio.setLayout(gridaBagLayoutOrderByDescuentoTipoPrecio);
			
			
			this.jTableDatosDescuentoTipoPrecioOrderBy = new JTableMe();        
			this.jTableDatosDescuentoTipoPrecioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDescuentoTipoPrecioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDescuentoTipoPrecioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDescuentoTipoPrecioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDescuentoTipoPrecioOrderBy.setViewportView(this.jTableDatosDescuentoTipoPrecioOrderBy);
			this.jTableDatosDescuentoTipoPrecioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDescuentoTipoPrecioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDescuentoTipoPrecio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDescuentoTipoPrecio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDescuentoTipoPrecio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDescuentoTipoPrecio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDescuentoTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDescuentoTipoPrecio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDescuentoTipoPrecio.setTitle("Orden");
			this.jInternalFrameOrderByDescuentoTipoPrecio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDescuentoTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDescuentoTipoPrecio.setResizable(true);
			this.jInternalFrameOrderByDescuentoTipoPrecio.setClosable(true);
			this.jInternalFrameOrderByDescuentoTipoPrecio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Tipo Precios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDescuentoTipoPrecio.ipady =150;
				
			this.jPanelOrderByDescuentoTipoPrecio.add(jScrollPanelDatosDescuentoTipoPrecioOrderBy, this.gridBagConstraintsDescuentoTipoPrecio);//this.jTableDatosDescuentoTipoPrecioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDescuentoTipoPrecio = new JButtonMe();
			this.jButtonCerrarOrderByDescuentoTipoPrecio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDescuentoTipoPrecio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDescuentoTipoPrecio.setToolTipText("Cancelar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDescuentoTipoPrecio.add(this.jButtonCerrarOrderByDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDescuentoTipoPrecio = new GridBagLayout();
			
			this.jScrollPanelOrderByDescuentoTipoPrecio= new JScrollPane(jPanelOrderByDescuentoTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iPosYOrderBy;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDescuentoTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDescuentoTipoPrecio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDescuentoTipoPrecio);
			
			this.jInternalFrameOrderByDescuentoTipoPrecio.getContentPane().add(this.jScrollPanelOrderByDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
		
		} else {
			this.jButtonAbrirOrderByDescuentoTipoPrecio = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.descuentotipoprecioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDescuentoTipoPrecio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDescuentoTipoPrecio.getRowHeight();//DescuentoTipoPrecioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio.isSelected()) {
					iHeightTable=DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDescuentoTipoPrecio.isSelected()) {
					iHeightTable=DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DescuentoTipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDescuentoTipoPrecio!=null && this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy()!=null) {
			//if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDescuentoTipoPrecio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDescuentoTipoPrecio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDescuentoTipoPrecio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDescuentoTipoPrecio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=descuentotipoprecioLogic.getDescuentoTipoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=descuentotipoprecios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DescuentoTipoPrecio> TraerDescuentoTipoPrecioBeans(List<DescuentoTipoPrecio> descuentotipoprecios,ArrayList<Classe> classes)throws Exception {
		try {
			for(DescuentoTipoPrecio descuentotipoprecio:descuentotipoprecios) {
					
				if(!(DescuentoTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DescuentoTipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					descuentotipoprecio.setsDetalleGeneralEntityReporte(DescuentoTipoPrecioConstantesFunciones.getDescuentoTipoPrecioDescripcion(descuentotipoprecio));
										
					descuentotipoprecio.setesta_activo_descripcion(DescuentoTipoPrecioConstantesFunciones.getesta_activoDescripcion(descuentotipoprecio));	
					
						
					
				} else  {
							
					//descuentotipoprecio.setsDetalleGeneralEntityReporte(descuentotipoprecio.getsDetalleGeneralEntityReporte());
										
				}
				
				//descuentotipopreciobeans.add(descuentotipopreciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return descuentotipoprecios;
    }
	//PARA REPORTES FIN
}
