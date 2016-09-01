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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.EstadisticaProductosConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class EstadisticaProductosJInternalFrame extends EstadisticaProductosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadisticaProductos;
	
	protected JMenuBar jmenuBarEstadisticaProductos;
	
	protected JMenu jmenuEstadisticaProductos;
	protected JMenu jmenuDatosEstadisticaProductos;
	protected JMenu jmenuArchivoEstadisticaProductos;
	protected JMenu jmenuAccionesEstadisticaProductos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadisticaProductos;	
	protected GridBagConstraints gridBagConstraintsEstadisticaProductos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadisticaProductosDetalleFormJInternalFrame jInternalFrameDetalleFormEstadisticaProductos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadisticaProductos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadisticaProductos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";
	
	public EstadisticaProductosSessionBean estadisticaproductosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadisticaProductos> estadisticaproductoss;		
	public List<EstadisticaProductos> estadisticaproductossEliminados;	
	public List<EstadisticaProductos> estadisticaproductossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadisticaProductos;		
	protected JButton jButtonAbrirOrderByEstadisticaProductos;
	
	
	//protected JPanel jPanelOrderByEstadisticaProductos;
	//public JScrollPane jScrollPanelOrderByEstadisticaProductos;	
	//protected JButton jButtonCerrarOrderByEstadisticaProductos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadisticaProductosLogic estadisticaproductosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadisticaProductos;
	public JScrollPane jScrollPanelDatosEdicionEstadisticaProductos;
	public JScrollPane jScrollPanelDatosGeneralEstadisticaProductos;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadisticaProductosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadisticaProductos;
	//public JScrollPane jScrollPanelImportacionEstadisticaProductos;
	
	
	
	protected JPanel jPanelAccionesEstadisticaProductos;
	
    protected JPanel jPanelPaginacionEstadisticaProductos;
    protected JPanel jPanelParametrosReportesEstadisticaProductos;
	protected JPanel jPanelParametrosReportesAccionesEstadisticaProductos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadisticaProductos;
	protected JPanel jPanelParametrosAuxiliar2EstadisticaProductos;
	protected JPanel jPanelParametrosAuxiliar3EstadisticaProductos;
	protected JPanel jPanelParametrosAuxiliar4EstadisticaProductos;
	//protected JPanel jPanelParametrosAuxiliar5EstadisticaProductos;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadisticaProductos;
	//protected JPanel jPanelImportacionEstadisticaProductos;
	
	
	public JTable jTableDatosEstadisticaProductos;
	
	
	
	//public JTable jTableDatosEstadisticaProductosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadisticaProductos;
	protected JButton jButtonDuplicarEstadisticaProductos;
	protected JButton jButtonCopiarEstadisticaProductos;
	protected JButton jButtonVerFormEstadisticaProductos;
	protected JButton jButtonNuevoRelacionesEstadisticaProductos;
	protected JButton jButtonModificarEstadisticaProductos;
	
    protected JButton jButtonGuardarCambiosTablaEstadisticaProductos;
	protected JButton jButtonCerrarEstadisticaProductos;
	
	
	protected JButton jButtonRecargarInformacionEstadisticaProductos;
	protected JButton jButtonProcesarInformacionEstadisticaProductos;
	
	
	protected JButton jButtonAnterioresEstadisticaProductos;
	protected JButton jButtonSiguientesEstadisticaProductos;
	protected JButton jButtonNuevoGuardarCambiosEstadisticaProductos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadisticaProductos;
	//protected JButton jButtonCerrarReporteDinamicoEstadisticaProductos;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadisticaProductos;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadisticaProductos;
	//protected JButton jButtonGenerarImportacionEstadisticaProductos;
	//protected JButton jButtonCerrarImportacionEstadisticaProductos;
	//protected JFileChooser jFileChooserImportacionEstadisticaProductos;
	//protected File fileImportacionEstadisticaProductos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadisticaProductos;
	protected JButton jButtonDuplicarToolBarEstadisticaProductos;
	protected JButton jButtonNuevoRelacionesToolBarEstadisticaProductos;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadisticaProductos;
	protected JButton jButtonCopiarToolBarEstadisticaProductos;
	protected JButton jButtonVerFormToolBarEstadisticaProductos;
	public JButton jButtonGuardarCambiosTablaToolBarEstadisticaProductos;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadisticaProductos;
	protected JButton jButtonCerrarToolBarEstadisticaProductos;
	
	protected JButton jButtonRecargarInformacionToolBarEstadisticaProductos;
	protected JButton jButtonProcesarInformacionToolBarEstadisticaProductos;
	protected JButton jButtonAnterioresToolBarEstadisticaProductos;
	protected JButton jButtonSiguientesToolBarEstadisticaProductos;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadisticaProductos;
	protected JButton jButtonAbrirOrderByToolBarEstadisticaProductos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadisticaProductos;
	protected JMenuItem jMenuItemDuplicarEstadisticaProductos;
	protected JMenuItem jMenuItemNuevoRelacionesEstadisticaProductos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadisticaProductos;
	protected JMenuItem jMenuItemCopiarEstadisticaProductos;
	protected JMenuItem jMenuItemVerFormEstadisticaProductos;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadisticaProductos;
	protected JMenuItem jMenuItemCerrarEstadisticaProductos;
	protected JMenuItem jMenuItemDetalleCerrarEstadisticaProductos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadisticaProductos;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadisticaProductos;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadisticaProductos;
	protected JMenuItem jMenuItemProcesarInformacionEstadisticaProductos;
	protected JMenuItem jMenuItemAnterioresEstadisticaProductos;
	protected JMenuItem jMenuItemSiguientesEstadisticaProductos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadisticaProductos;
	protected JMenuItem jMenuItemAbrirOrderByEstadisticaProductos;
	protected JMenuItem jMenuItemMostrarOcultarEstadisticaProductos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadisticaProductos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadisticaProductos;
	protected JCheckBox jCheckBoxSeleccionadosEstadisticaProductos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadisticaProductos;
	protected JCheckBox jCheckBoxConGraficoReporteEstadisticaProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadisticaProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadisticaProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadisticaProductos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadisticaProductos;
	protected JTextField jTextFieldValorCampoGeneralEstadisticaProductos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadisticaProductos;
	//public JList<Reporte> jListColumnasSelectReporteEstadisticaProductos;
	//public JScrollPane jScrollColumnasSelectReporteEstadisticaProductos;
	
	//public JLabel jLabelRelacionesSelectReporteEstadisticaProductos;
	//public JList<Reporte> jListRelacionesSelectReporteEstadisticaProductos;
	//public JScrollPane jScrollRelacionesSelectReporteEstadisticaProductos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadisticaProductos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadisticaProductos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadisticaProductos;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadisticaProductos;
	
		
	//public JLabel jLabelArchivoImportacionEstadisticaProductos;	
	//public JLabel jLabelPathArchivoImportacionEstadisticaProductos;
	//protected JTextField jTextFieldPathArchivoImportacionEstadisticaProductos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadisticaProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadisticaProductos;
	
	//public JLabel jLabelColumnaCategoriaValorEstadisticaProductos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadisticaProductos;
	
	//public JLabel jLabelColumnasValoresGraficoEstadisticaProductos;
	//public JList<Reporte> jListColumnasValoresGraficoEstadisticaProductos;
	//public JScrollPane jScrollColumnasValoresGraficoEstadisticaProductos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadisticaProductos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadisticaProductos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstadisticaProductos;
	public JPanel jPanelBusquedaEstadisticaProductosEstadisticaProductos;
	public JButton jButtonBusquedaEstadisticaProductosEstadisticaProductos;
	
	public JPanel jPanelid_productoBusquedaEstadisticaProductosEstadisticaProductos;
	public JLabel jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos;
	public JButton jButtonid_productoBusquedaEstadisticaProductosEstadisticaProductos= new JButtonMe();
	public JButton jButtonid_productoBusquedaEstadisticaProductosEstadisticaProductosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaEstadisticaProductosEstadisticaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos;
	public JLabel jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos;

	public JDateChooser jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos;
	public JButton jButtonfecha_inicioBusquedaEstadisticaProductosEstadisticaProductosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaEstadisticaProductosEstadisticaProductos;
	public JLabel jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos;
	//public JFormattedTextField jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos;

	public JDateChooser jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos;
	public JButton jButtonfecha_finBusquedaEstadisticaProductosEstadisticaProductosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadisticaProductosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadisticaProductosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadisticaProductosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadisticaProductosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadisticaProductos)	{
		this.jButtonRecargarInformacionEstadisticaProductos = jButtonRecargarInformacionEstadisticaProductos;
	}
	
	public JButton getjButtonProcesarInformacionEstadisticaProductos() {
		return this.jButtonProcesarInformacionEstadisticaProductos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadisticaProductos)	{
		this.jButtonProcesarInformacionEstadisticaProductos = jButtonProcesarInformacionEstadisticaProductos;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadisticaProductos() {
		return this.jButtonRecargarInformacionEstadisticaProductos;
	}
	
	
	public List<EstadisticaProductos> getestadisticaproductoss() {
		return this.estadisticaproductoss;
	}

	public void setestadisticaproductoss(List<EstadisticaProductos> estadisticaproductoss) {
		this.estadisticaproductoss = estadisticaproductoss;
	}
	
	public List<EstadisticaProductos> getestadisticaproductossAux() {
		return this.estadisticaproductossAux;
	}

	public void setestadisticaproductossAux(List<EstadisticaProductos> estadisticaproductossAux) {
		this.estadisticaproductossAux = estadisticaproductossAux;
	}
	
	public List<EstadisticaProductos> getestadisticaproductossEliminados() {
		return this.estadisticaproductossEliminados;
	}

	public void setEstadisticaProductossEliminados(List<EstadisticaProductos> estadisticaproductossEliminados) {
		this.estadisticaproductossEliminados = estadisticaproductossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadisticaProductos() {
		return jComboBoxTiposSeleccionarEstadisticaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadisticaProductos(
			JComboBox jComboBoxTiposSeleccionarEstadisticaProductos) {
		this.jComboBoxTiposSeleccionarEstadisticaProductos = jComboBoxTiposSeleccionarEstadisticaProductos;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadisticaProductos() {
		return jTextFieldValorCampoGeneralEstadisticaProductos;
	}

	public void setjTextFieldValorCampoGeneralEstadisticaProductos(
			JTextField jTextFieldValorCampoGeneralEstadisticaProductos) {
		this.jTextFieldValorCampoGeneralEstadisticaProductos = jTextFieldValorCampoGeneralEstadisticaProductos;
	}

	public void setBorderResaltarValorCampoGeneralEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadisticaProductos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadisticaProductos() {
		return this.jCheckBoxSeleccionarTodosEstadisticaProductos;
	}

	public void setjCheckBoxSeleccionarTodosEstadisticaProductos(
			JCheckBox jCheckBoxSeleccionarTodosEstadisticaProductos) {
		this.jCheckBoxSeleccionarTodosEstadisticaProductos = jCheckBoxSeleccionarTodosEstadisticaProductos;
	}

	public void setBorderResaltarSeleccionarTodosEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadisticaProductos() {
		return this.jCheckBoxSeleccionadosEstadisticaProductos;
	}

	public void setjCheckBoxSeleccionadosEstadisticaProductos(
			JCheckBox jCheckBoxSeleccionadosEstadisticaProductos) {
		this.jCheckBoxSeleccionadosEstadisticaProductos = jCheckBoxSeleccionadosEstadisticaProductos;
	}
	
	public void setBorderResaltarSeleccionadosEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadisticaProductos() {
		return this.jComboBoxTiposArchivosReportesEstadisticaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadisticaProductos(
			JComboBox jComboBoxTiposArchivosReportesEstadisticaProductos) {
		this.jComboBoxTiposArchivosReportesEstadisticaProductos = jComboBoxTiposArchivosReportesEstadisticaProductos;
	}

	public void setBorderResaltarTiposArchivosReportesEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadisticaProductos() {
		return this.jComboBoxTiposReportesEstadisticaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadisticaProductos(
			JComboBox jComboBoxTiposReportesEstadisticaProductos) {
		this.jComboBoxTiposReportesEstadisticaProductos = jComboBoxTiposReportesEstadisticaProductos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadisticaProductos() {
	//	return jComboBoxTiposReportesDinamicoEstadisticaProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadisticaProductos(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadisticaProductos) {
	//	this.jComboBoxTiposReportesDinamicoEstadisticaProductos = jComboBoxTiposReportesDinamicoEstadisticaProductos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadisticaProductos() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadisticaProductos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos = jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos;
	//}
	
	public void setBorderResaltarTiposReportesEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadisticaProductos() {
		return this.jComboBoxTiposGraficosReportesEstadisticaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadisticaProductos(
			JComboBox jComboBoxTiposGraficosReportesEstadisticaProductos) {
		this.jComboBoxTiposGraficosReportesEstadisticaProductos = jComboBoxTiposGraficosReportesEstadisticaProductos;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadisticaProductos() {
		return this.jComboBoxTiposPaginacionEstadisticaProductos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadisticaProductos(
			JComboBox jComboBoxTiposPaginacionEstadisticaProductos) {
		this.jComboBoxTiposPaginacionEstadisticaProductos = jComboBoxTiposPaginacionEstadisticaProductos;
	}
	
	public void setBorderResaltarTiposPaginacionEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadisticaProductos() {
		return this.jComboBoxTiposRelacionesEstadisticaProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadisticaProductos() {
		return this.jComboBoxTiposAccionesEstadisticaProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadisticaProductos(
			JComboBox jComboBoxTiposRelacionesEstadisticaProductos) {
		this.jComboBoxTiposRelacionesEstadisticaProductos = jComboBoxTiposRelacionesEstadisticaProductos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadisticaProductos(
			JComboBox jComboBoxTiposAccionesEstadisticaProductos) {
		this.jComboBoxTiposAccionesEstadisticaProductos = jComboBoxTiposAccionesEstadisticaProductos;
	}
	
	public void setBorderResaltarTiposRelacionesEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadisticaProductos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadisticaProductos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadisticaProductos() {
	//	return jCheckBoxConGraficoDinamicoEstadisticaProductos;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadisticaProductos(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadisticaProductos) {
	//	this.jCheckBoxConGraficoDinamicoEstadisticaProductos = jCheckBoxConGraficoDinamicoEstadisticaProductos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadisticaProductos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadisticaProductos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadisticaProductos .setBorder(borderResaltar);		
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
		this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
		
		this.estadisticaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadisticaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadisticaproductosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadisticaProductosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadisticaProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadisticaProductosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadisticaProductosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadisticaProductosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estadistica Productos MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadisticaProductosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadisticaProductos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadisticaProductos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"nuevo","nuevo","Nuevo"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"duplicar","duplicar","Duplicar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"copiar","copiar","Copiar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"ver_form","ver_form","Ver"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"recargar","recargar","Buscar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadisticaProductos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadisticaProductos,this.jTtoolBarEstadisticaProductos,
							"cerrar","cerrar","Salir"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadisticaProductos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadisticaProductos;
			
				this.jButtonProcesarInformacionToolBarEstadisticaProductos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadisticaProductos;
				
		//protected JButton jButtonModificarToolBarEstadisticaProductos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadisticaProductos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadisticaProductos=new JMenuMe("General");
		this.jmenuArchivoEstadisticaProductos=new JMenuMe("Archivo");
		this.jmenuAccionesEstadisticaProductos=new JMenuMe("Acciones");
		this.jmenuDatosEstadisticaProductos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadisticaProductos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadisticaProductos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadisticaProductos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadisticaProductos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadisticaProductos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadisticaProductos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadisticaProductos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadisticaProductos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadisticaProductos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadisticaProductos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadisticaProductos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadisticaProductos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadisticaProductos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadisticaProductos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadisticaProductos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadisticaProductos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadisticaProductos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadisticaProductos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadisticaProductos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadisticaProductos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadisticaProductos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadisticaProductos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadisticaProductos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadisticaProductos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadisticaProductos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadisticaProductos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadisticaProductos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadisticaProductos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadisticaProductos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadisticaProductos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadisticaProductos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadisticaProductos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadisticaProductos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadisticaProductos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadisticaProductos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadisticaProductos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadisticaProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadisticaProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadisticaProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadisticaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadisticaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadisticaProductos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadisticaProductos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadisticaProductos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadisticaProductos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadisticaProductos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadisticaProductos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadisticaProductos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadisticaProductos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadisticaProductos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadisticaProductos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadisticaProductos.add(this.jMenuItemCerrarEstadisticaProductos);
			
			this.jmenuAccionesEstadisticaProductos.add(this.jMenuItemNuevoEstadisticaProductos);
			this.jmenuAccionesEstadisticaProductos.add(this.jMenuItemNuevoGuardarCambiosEstadisticaProductos);
			this.jmenuAccionesEstadisticaProductos.add(this.jMenuItemNuevoRelacionesEstadisticaProductos);
			this.jmenuAccionesEstadisticaProductos.add(this.jMenuItemGuardarCambiosTablaEstadisticaProductos);		
			this.jmenuAccionesEstadisticaProductos.add(this.jMenuItemDuplicarEstadisticaProductos);		
			this.jmenuAccionesEstadisticaProductos.add(this.jMenuItemCopiarEstadisticaProductos);		
			this.jmenuAccionesEstadisticaProductos.add(this.jMenuItemVerFormEstadisticaProductos);		
			
			this.jmenuDatosEstadisticaProductos.add(this.jMenuItemRecargarInformacionEstadisticaProductos);				
			this.jmenuDatosEstadisticaProductos.add(this.jMenuItemAnterioresEstadisticaProductos);				
			this.jmenuDatosEstadisticaProductos.add(this.jMenuItemSiguientesEstadisticaProductos);				
			this.jmenuDatosEstadisticaProductos.add(this.jMenuItemAbrirOrderByEstadisticaProductos);				
			this.jmenuDatosEstadisticaProductos.add(this.jMenuItemMostrarOcultarEstadisticaProductos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadisticaProductos.add(this.jMenuItemGuardarCambiosEstadisticaProductos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadisticaProductos.add(this.jmenuArchivoEstadisticaProductos);		
			this.jmenuBarEstadisticaProductos.add(this.jmenuAccionesEstadisticaProductos);		
			this.jmenuBarEstadisticaProductos.add(this.jmenuDatosEstadisticaProductos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadisticaProductos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadisticaProductos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaEstadisticaProductosEstadisticaProductos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaEstadisticaProductosEstadisticaProductos.setToolTipText("Buscar Por Producto Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaEstadisticaProductosEstadisticaProductos= new JButtonMe();
		this.jButtonBusquedaEstadisticaProductosEstadisticaProductos.setText("Buscar");
		this.jButtonBusquedaEstadisticaProductosEstadisticaProductos.setToolTipText("Buscar Por Producto Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaEstadisticaProductosEstadisticaProductos,"buscar_button","Buscar Por Producto Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaEstadisticaProductosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos = new JLabelMe();
		jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos.setText("Producto :");
		jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos.setToolTipText("Producto");
		jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos= new JComboBoxMe();
		jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos = new JLabelMe();
		jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos= new JDateChooser();
		jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setDate(new Date());
		jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos = new JLabelMe();
		jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setText("Fecha Fin :");
		jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos= new JDateChooser();
		jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setDate(new Date());
		jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasEstadisticaProductos=new JTabbedPane();


		this.jTabbedPaneBusquedasEstadisticaProductos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasEstadisticaProductos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasEstadisticaProductos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstadisticaProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstadisticaProductos = new EstadisticaProductosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estadistica Productos DATOS");
			this.jInternalFrameDetalleFormEstadisticaProductos = new EstadisticaProductosDetalleFormJInternalFrame(jDesktopPane,this.estadisticaproductosSessionBean.getConGuardarRelaciones(),this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadisticaProductos = null;//new EstadisticaProductosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadisticaProductos= new GridBagLayout();
		
		
		this.jTableDatosEstadisticaProductos = new JTableMe();      
		
		String sToolTipEstadisticaProductos="";
		sToolTipEstadisticaProductos=EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadisticaProductos+="(PuntoVenta.EstadisticaProductos)";
		}
		
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadisticaProductos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadisticaProductos.setToolTipText(sToolTipEstadisticaProductos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadisticaProductos);
		this.jTableDatosEstadisticaProductos.setAutoCreateRowSorter(true);
		this.jTableDatosEstadisticaProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadisticaProductos.setRowSelectionAllowed(true);
		this.jTableDatosEstadisticaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadisticaProductos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadisticaProductos = new JButtonMe();
		this.jButtonDuplicarEstadisticaProductos = new JButtonMe();
		this.jButtonCopiarEstadisticaProductos = new JButtonMe();
		this.jButtonVerFormEstadisticaProductos = new JButtonMe();
		this.jButtonNuevoRelacionesEstadisticaProductos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos = new JButtonMe();
		this.jButtonCerrarEstadisticaProductos = new JButtonMe();
		
		this.jScrollPanelDatosEstadisticaProductos = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadisticaProductos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estadistica Productos";
		
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadistica Productoses" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadisticaProductos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadisticaProductos.setToolTipText("Acciones");
        this.jPanelAccionesEstadisticaProductos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadisticaProductos=new ReporteDinamicoJInternalFrame(EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadisticaProductos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadisticaProductos=new ImportacionJInternalFrame(EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadisticaProductos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadisticaProductos = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadisticaProductos.setText("Orden");
		this.jButtonAbrirOrderByEstadisticaProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadisticaProductos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadisticaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadisticaProductos,false,this);
			
			//this.cargarOrderByEstadisticaProductos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadisticaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadisticaProductos,true,this);
			
			//this.cargarOrderByEstadisticaProductos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadisticaProductos.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosEstadisticaProductos.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosEstadisticaProductos.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosEstadisticaProductos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadisticaProductos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadisticaProductos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadisticaProductos.setText("Nuevo");
		this.jButtonDuplicarEstadisticaProductos.setText("Duplicar");
		this.jButtonCopiarEstadisticaProductos.setText("Copiar");
		this.jButtonVerFormEstadisticaProductos.setText("Ver");
		this.jButtonNuevoRelacionesEstadisticaProductos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos.setText("Guardar");
		this.jButtonCerrarEstadisticaProductos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadisticaProductos,"nuevo_button","Nuevo",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadisticaProductos,"duplicar_button","Duplicar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadisticaProductos,"copiar_button","Copiar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadisticaProductos,"ver_form","Ver",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadisticaProductos,"nuevorelaciones_button","Nuevo Rel",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadisticaProductos,"guardarcambiostabla_button","Guardar",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadisticaProductos,"cerrar_button","Salir",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadisticaProductos.setToolTipText("Nuevo"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadisticaProductos.setToolTipText("Duplicar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadisticaProductos.setToolTipText("Copiar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadisticaProductos.setToolTipText("Ver"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadisticaProductos.setToolTipText("Nuevo Rel"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos.setToolTipText("Guardar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadisticaProductos.setToolTipText("Salir"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadisticaProductos";
		inputMap = this.jButtonNuevoEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadisticaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadisticaProductos"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadisticaProductos";
		inputMap = this.jButtonDuplicarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadisticaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadisticaProductos"));
		
		//COPIAR
		sMapKey = "CopiarEstadisticaProductos";
		inputMap = this.jButtonCopiarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadisticaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadisticaProductos"));
		
		//VEr FORM
		sMapKey = "VerFormEstadisticaProductos";
		inputMap = this.jButtonVerFormEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadisticaProductos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadisticaProductos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadisticaProductos";
		inputMap = this.jButtonNuevoRelacionesEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadisticaProductos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadisticaProductos";
		inputMap = this.jButtonModificarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadisticaProductos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadisticaProductos";
		inputMap = this.jButtonCerrarEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadisticaProductos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadisticaProductos";
		inputMap = this.jButtonGuardarCambiosTablaEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadisticaProductos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadisticaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadisticaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadisticaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadisticaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadisticaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadisticaProductos.setName("jPanelParametrosReportesEstadisticaProductos"); 
		
		this.jPanelParametrosReportesAccionesEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadisticaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadisticaProductos.setName("jPanelParametrosReportesAccionesEstadisticaProductos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadisticaProductos = new JButtonMe();
		this.jButtonRecargarInformacionEstadisticaProductos.setText("Buscar");
		this.jButtonRecargarInformacionEstadisticaProductos.setToolTipText("Buscar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadisticaProductos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionEstadisticaProductos.setVisible(false);
		
		
		this.jButtonProcesarInformacionEstadisticaProductos = new JButtonMe();
		this.jButtonProcesarInformacionEstadisticaProductos.setText("Procesar");
		this.jButtonProcesarInformacionEstadisticaProductos.setToolTipText("Procesar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadisticaProductos.setVisible(false);
			
		this.jButtonProcesarInformacionEstadisticaProductos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadisticaProductos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadisticaProductos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadisticaProductos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadisticaProductos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadisticaProductos.setText("TIPO");       
		this.jComboBoxTiposReportesEstadisticaProductos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadisticaProductos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadisticaProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadisticaProductos.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadisticaProductos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadisticaProductos.setText("Accion");
		this.jComboBoxTiposRelacionesEstadisticaProductos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadisticaProductos.setText("Accion");
		this.jComboBoxTiposAccionesEstadisticaProductos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadisticaProductos.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadisticaProductos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadisticaProductos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadisticaProductos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadisticaProductos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadisticaProductos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadisticaProductos = new JLabelMe();
		
		this.jLabelAccionesEstadisticaProductos.setText("Acciones");		
		this.jLabelAccionesEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadisticaProductos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadisticaProductos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadisticaProductos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadisticaProductos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadisticaProductos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadisticaProductos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadisticaProductos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadisticaProductos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadisticaProductos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadisticaProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadisticaProductos.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadisticaProductos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadisticaProductos = new JButtonMe();
		//this.jButtonAnterioresEstadisticaProductos.setText("<<");
        this.jButtonAnterioresEstadisticaProductos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadisticaProductos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadisticaProductos = new JButtonMe();
		//this.jButtonSiguientesEstadisticaProductos.setText(">>");
        this.jButtonSiguientesEstadisticaProductos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadisticaProductos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadisticaProductos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadisticaProductos.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadisticaProductos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadisticaProductos,"nuevoguardarcambios_button","Nue",this.estadisticaproductosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadisticaProductos";
		inputMap = this.jButtonNuevoGuardarCambiosEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadisticaProductos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadisticaProductos";
		inputMap = this.jButtonRecargarInformacionEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadisticaProductos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadisticaProductos";
		inputMap = this.jButtonSiguientesEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadisticaProductos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadisticaProductos";
		inputMap = this.jButtonAnterioresEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadisticaProductos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadisticaProductos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadisticaProductos.setMinimumSize(new Dimension(this.getWidth(),EstadisticaProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadisticaProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadisticaProductos.setMaximumSize(new Dimension(this.getWidth(),EstadisticaProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadisticaProductosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadisticaProductos.setPreferredSize(new Dimension(this.getWidth(),EstadisticaProductosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadisticaProductosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadisticaProductos = new GridBagLayout();

			this.jPanelPaginacionEstadisticaProductos.setLayout(gridaBagLayoutPaginacionEstadisticaProductos);						
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = 0;
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonAnterioresEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
					
						
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadisticaProductos.gridy = 0;
			
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonNuevoGuardarCambiosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
						
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadisticaProductos.gridy = 0;
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonSiguientesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = 1;
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonNuevoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
						
			
			
			if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
				this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadisticaProductos.gridy = 1;
				this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadisticaProductos.add(this.jButtonGuardarCambiosTablaEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			}
			
			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = 1;
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonDuplicarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = 1;
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonCopiarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = 1;
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonVerFormEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = 1;
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadisticaProductos.add(this.jButtonCerrarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		
		this.jButtonRecargarInformacionEstadisticaProductos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadisticaProductos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadisticaProductos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadisticaProductos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadisticaProductos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadisticaProductos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadisticaProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadisticaProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadisticaProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadisticaProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadisticaProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadisticaProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadisticaProductos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadisticaProductos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadisticaProductos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadisticaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadisticaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadisticaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadisticaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadisticaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadisticaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadisticaProductos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadisticaProductos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadisticaProductos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadisticaProductos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadisticaProductos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadisticaProductos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadisticaProductos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadisticaProductos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadisticaProductos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadisticaProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadisticaProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadisticaProductos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadisticaProductos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadisticaProductos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadisticaProductos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadisticaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadisticaProductos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadisticaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadisticaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadisticaProductos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadisticaProductos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadisticaProductos.setLayout(gridaBagParametrosReportesEstadisticaProductos);
			this.jPanelParametrosReportesAccionesEstadisticaProductos.setLayout(gridaBagParametrosReportesAccionesEstadisticaProductos);
			
			
			this.jPanelParametrosAuxiliar1EstadisticaProductos.setLayout(gridaBagParametrosAuxiliar1EstadisticaProductos);
			this.jPanelParametrosAuxiliar2EstadisticaProductos.setLayout(gridaBagParametrosAuxiliar2EstadisticaProductos);
			this.jPanelParametrosAuxiliar3EstadisticaProductos.setLayout(gridaBagParametrosAuxiliar3EstadisticaProductos);
			this.jPanelParametrosAuxiliar4EstadisticaProductos.setLayout(gridaBagParametrosAuxiliar4EstadisticaProductos);
			//this.jPanelParametrosAuxiliar5EstadisticaProductos.setLayout(gridaBagParametrosAuxiliar2EstadisticaProductos);			
			
			
			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jButtonRecargarInformacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadisticaProductos.add(this.jComboBoxTiposPaginacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadisticaProductos.add(this.jCheckBoxConAltoMaximoTablaEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadisticaProductos.add(this.jComboBoxTiposArchivosReportesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jPanelParametrosAuxiliar1EstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadisticaProductos.add(this.jComboBoxTiposReportesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);																		
			
			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EstadisticaProductos.add(this.jComboBoxTiposGraficosReportesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jPanelParametrosAuxiliar4EstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jComboBoxTiposReportesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jCheckBoxGenerarReporteEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jPanelParametrosAuxiliar2EstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jLabelAccionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
				this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadisticaProductos.add(this.jButtonAbrirOrderByEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jComboBoxTiposSeleccionarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
			
			
			/*
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jCheckBoxSeleccionarTodosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jCheckBoxConGraficoReporteEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadisticaProductos.add(this.jCheckBoxSeleccionarTodosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);															
				
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadisticaProductos.add(this.jCheckBoxSeleccionadosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);															
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadisticaProductos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadisticaProductos.add(this.jCheckBoxConGraficoReporteEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jPanelParametrosAuxiliar3EstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadisticaProductos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadisticaProductos.add(this.jComboBoxTiposAccionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadisticaProductos = new GridBagLayout();

			this.jScrollPanelDatosEstadisticaProductos.setLayout(gridaBagLayoutDatosEstadisticaProductos);
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = 0;
			this.gridBagConstraintsEstadisticaProductos.gridx = 0;
			
			this.jScrollPanelDatosEstadisticaProductos.add(this.jTableDatosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadisticaProductos.setViewportView(this.jTableDatosEstadisticaProductos);
		this.jTableDatosEstadisticaProductos.setFillsViewportHeight(true);
		this.jTableDatosEstadisticaProductos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadisticaProductos= new GridBagLayout();
		this.jPanelAccionesEstadisticaProductos.setLayout(gridaBagLayoutAccionesEstadisticaProductos);
		
		
		/*	
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = 0;
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
			
		this.jPanelAccionesEstadisticaProductos.add(this.jButtonNuevoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaEstadisticaProductosEstadisticaProductos= new GridBagLayout();
		gridaBagLayoutBusquedaEstadisticaProductosEstadisticaProductos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaEstadisticaProductosEstadisticaProductos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaEstadisticaProductosEstadisticaProductos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaEstadisticaProductosEstadisticaProductos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.setLayout(gridaBagLayoutBusquedaEstadisticaProductosEstadisticaProductos);

		gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadisticaProductos.gridy = 0;
		gridBagConstraintsEstadisticaProductos.gridx = 0;
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.add(jLabelid_productoBusquedaEstadisticaProductosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);

		gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadisticaProductos.gridy = 0;
		gridBagConstraintsEstadisticaProductos.gridx = 1;
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.add(jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);


		gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadisticaProductos.gridy = 1;
		gridBagConstraintsEstadisticaProductos.gridx = 0;
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.add(jLabelfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);

		gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadisticaProductos.gridy = 1;
		gridBagConstraintsEstadisticaProductos.gridx = 1;
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.add(jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);


		gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadisticaProductos.gridy = 2;
		gridBagConstraintsEstadisticaProductos.gridx = 0;
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.add(jLabelfecha_finBusquedaEstadisticaProductosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);

		gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadisticaProductos.gridy = 2;
		gridBagConstraintsEstadisticaProductos.gridx = 1;
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.add(jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);

		gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstadisticaProductos.gridy = 3;
		gridBagConstraintsEstadisticaProductos.gridx =1;
		jPanelBusquedaEstadisticaProductosEstadisticaProductos.add(jButtonBusquedaEstadisticaProductosEstadisticaProductos, gridBagConstraintsEstadisticaProductos);

		jTabbedPaneBusquedasEstadisticaProductos.addTab("1.-Por Producto Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaEstadisticaProductosEstadisticaProductos);
		jTabbedPaneBusquedasEstadisticaProductos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadisticaProductos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadisticaProductos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();						
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadisticaProductos.gridx = 0;		
			//this.gridBagConstraintsEstadisticaProductos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadisticaProductos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;		
		//this.gridBagConstraintsEstadisticaProductos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadisticaProductos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadisticaProductos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadisticaProductos.gridx = 0;		
			this.gridBagConstraintsEstadisticaProductos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstadisticaProductos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);								
		
		
		/*
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		*/		
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadisticaProductos.gridx =0;
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadisticaProductos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
				
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadisticaProductos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadisticaProductos = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadisticaProductos.setLayout(gridaBagLayoutBusquedasParametrosEstadisticaProductos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadisticaProductos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadisticaProductos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadisticaProductos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadisticaProductos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
			
			
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
			
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadisticaProductos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadisticaProductos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadisticaProductos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadisticaProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadisticaProductos.setName("jPanelReporteDinamicoEstadisticaProductos"); 
		
		this.jPanelReporteDinamicoEstadisticaProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadisticaProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadisticaProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadisticaProductos.setLayout(gridaBagLayoutReporteDinamicoEstadisticaProductos);
		
		
		this.jInternalFrameReporteDinamicoEstadisticaProductos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadisticaProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadisticaProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadisticaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadisticaProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadisticaProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadisticaProductos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadisticaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadisticaProductos.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadisticaProductos.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadisticaProductos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadisticaProductos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadisticaProductos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadisticaProductos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadistica Productoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadisticaProductos = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadisticaProductos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelColumnasSelectReporteEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadisticaProductos = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadisticaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadisticaProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadisticaProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadisticaProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadisticaProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadisticaProductos=new JScrollPane(this.jListColumnasSelectReporteEstadisticaProductos);
			
			this.jScrollColumnasSelectReporteEstadisticaProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadisticaProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadisticaProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadisticaProductos.add(this.jListColumnasSelectReporteEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jScrollColumnasSelectReporteEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadisticaProductos = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadisticaProductos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadisticaProductos = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadisticaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadisticaProductos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadisticaProductos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadisticaProductos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadisticaProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadisticaProductos=new JScrollPane(this.jListRelacionesSelectReporteEstadisticaProductos);
			
			this.jScrollRelacionesSelectReporteEstadisticaProductos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadisticaProductos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadisticaProductos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadisticaProductos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadisticaProductos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadisticaProductos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadisticaProductos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadisticaProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadisticaProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadisticaProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEstadisticaProductos = new JLabelMe();

		this.jLabelConGraficoDinamicoEstadisticaProductos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelConGraficoDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEstadisticaProductos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEstadisticaProductos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEstadisticaProductos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEstadisticaProductos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstadisticaProductos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstadisticaProductos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jCheckBoxConGraficoDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEstadisticaProductos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEstadisticaProductos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelColumnaCategoriaGraficoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEstadisticaProductos = new JLabelMe();

		this.jLabelColumnaCategoriaValorEstadisticaProductos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelColumnaCategoriaValorEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEstadisticaProductos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEstadisticaProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEstadisticaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstadisticaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstadisticaProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jComboBoxColumnaCategoriaValorEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEstadisticaProductos = new JLabelMe();

		this.jLabelColumnasValoresGraficoEstadisticaProductos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelColumnasValoresGraficoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEstadisticaProductos = new JList<Reporte>();
		this.jListColumnasValoresGraficoEstadisticaProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEstadisticaProductos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEstadisticaProductos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstadisticaProductos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstadisticaProductos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEstadisticaProductos=new JScrollPane(this.jListColumnasValoresGraficoEstadisticaProductos);
			
			this.jScrollColumnasValoresGraficoEstadisticaProductos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstadisticaProductos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstadisticaProductos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEstadisticaProductos.add(this.jListColumnasSelectReporteEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jScrollColumnasValoresGraficoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEstadisticaProductos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEstadisticaProductos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelTiposGraficosReportesDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEstadisticaProductos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstadisticaProductos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEstadisticaProductos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEstadisticaProductos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstadisticaProductos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstadisticaProductos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jComboBoxTiposGraficosReportesDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadisticaProductos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadisticaProductos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelGenerarExcelReporteDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadisticaProductos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadisticaProductos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadisticaProductos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadisticaProductos.setToolTipText("Generar EXCEL"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		//this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadisticaProductos.add(this.jButtonGenerarExcelReporteDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jComboBoxTiposReportesDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadisticaProductos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadisticaProductos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jLabelTiposArchivoReporteDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jComboBoxTiposArchivosReportesDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadisticaProductos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadisticaProductos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadisticaProductos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadisticaProductos.setToolTipText("Generar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jButtonGenerarReporteDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadisticaProductos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadisticaProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadisticaProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadisticaProductos.setToolTipText("Cancelar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadisticaProductos.add(this.jButtonCerrarReporteDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadisticaProductos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadisticaProductos= new JScrollPane(jPanelReporteDinamicoEstadisticaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadisticaProductos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadisticaProductos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadisticaProductos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadistica Productoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadisticaProductos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadisticaProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadisticaProductos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadisticaProductos);
		this.jInternalFrameReporteDinamicoEstadisticaProductos.getContentPane().add(this.jScrollPanelReporteDinamicoEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadisticaProductos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadisticaProductos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadisticaProductos.setName("jPanelImportacionEstadisticaProductos"); 
		
		this.jPanelImportacionEstadisticaProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadisticaProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadisticaProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadisticaProductos.setLayout(gridaBagLayoutImportacionEstadisticaProductos);
		
		
		this.jInternalFrameImportacionEstadisticaProductos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadisticaProductos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadisticaProductos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadisticaProductos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadisticaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadisticaProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadisticaProductos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadisticaProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadisticaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadisticaProductos.setResizable(true);
	    this.jInternalFrameImportacionEstadisticaProductos.setClosable(true);
	    this.jInternalFrameImportacionEstadisticaProductos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadisticaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadisticaProductos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadisticaProductos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadisticaProductos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadisticaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadisticaProductos.setResizable(true);
	    this.jInternalFrameImportacionEstadisticaProductos.setClosable(true);
	    this.jInternalFrameImportacionEstadisticaProductos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadisticaProductos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadisticaProductos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadisticaProductos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadistica Productoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadisticaProductos = new JLabelMe();

		this.jLabelArchivoImportacionEstadisticaProductos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadisticaProductos.add(this.jLabelArchivoImportacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadisticaProductos = new JFileChooser();		
		this.jFileChooserImportacionEstadisticaProductos.setToolTipText("ESCOGER ARCHIVO"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadisticaProductos = new JButtonMe();
		this.jButtonAbrirImportacionEstadisticaProductos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadisticaProductos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadisticaProductos.setToolTipText("Generar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadisticaProductos.add(this.jButtonAbrirImportacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadisticaProductos = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadisticaProductos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadisticaProductos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadisticaProductos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadisticaProductos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadisticaProductos.add(this.jLabelPathArchivoImportacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadisticaProductos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadisticaProductos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadisticaProductos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadisticaProductos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadisticaProductos.add(this.jTextFieldPathArchivoImportacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadisticaProductos = new JButtonMe();
		this.jButtonGenerarImportacionEstadisticaProductos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadisticaProductos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadisticaProductos.setToolTipText("Generar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadisticaProductos.add(this.jButtonGenerarImportacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadisticaProductos = new JButtonMe();
		this.jButtonCerrarImportacionEstadisticaProductos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadisticaProductos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadisticaProductos.setToolTipText("Cancelar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadisticaProductos.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadisticaProductos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadisticaProductos.add(this.jButtonCerrarImportacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadisticaProductos = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadisticaProductos= new JScrollPane(jPanelImportacionEstadisticaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
		this.gridBagConstraintsEstadisticaProductos.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadisticaProductos.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadisticaProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadisticaProductos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadisticaProductos);
		this.jInternalFrameImportacionEstadisticaProductos.getContentPane().add(this.jScrollPanelImportacionEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadisticaProductos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadisticaProductos = new JButtonMe();
			this.jButtonAbrirOrderByEstadisticaProductos.setText("Orden");
			this.jButtonAbrirOrderByEstadisticaProductos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadisticaProductos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadisticaProductos";
			inputMap = this.jButtonAbrirOrderByEstadisticaProductos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadisticaProductos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadisticaProductos"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadisticaProductos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadisticaProductos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadisticaProductos.setName("jPanelOrderByEstadisticaProductos"); 
			
			this.jPanelOrderByEstadisticaProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadisticaProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadisticaProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadisticaProductos.setLayout(gridaBagLayoutOrderByEstadisticaProductos);
			
			
			this.jTableDatosEstadisticaProductosOrderBy = new JTableMe();        
			this.jTableDatosEstadisticaProductosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadisticaProductosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadisticaProductosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadisticaProductosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadisticaProductosOrderBy.setViewportView(this.jTableDatosEstadisticaProductosOrderBy);
			this.jTableDatosEstadisticaProductosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadisticaProductosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadisticaProductos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadisticaProductos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadisticaProductos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadisticaProductos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadisticaProductos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadisticaProductos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadisticaProductos.setTitle("Orden");
			this.jInternalFrameOrderByEstadisticaProductos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadisticaProductos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadisticaProductos.setResizable(true);
			this.jInternalFrameOrderByEstadisticaProductos.setClosable(true);
			this.jInternalFrameOrderByEstadisticaProductos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadisticaProductos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadisticaProductos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadisticaProductos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadisticaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estadistica Productoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadisticaProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadisticaProductos.ipady =150;
				
			this.jPanelOrderByEstadisticaProductos.add(jScrollPanelDatosEstadisticaProductosOrderBy, this.gridBagConstraintsEstadisticaProductos);//this.jTableDatosEstadisticaProductosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadisticaProductos = new JButtonMe();
			this.jButtonCerrarOrderByEstadisticaProductos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadisticaProductos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadisticaProductos.setToolTipText("Cancelar"+" "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadisticaProductos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadisticaProductos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadisticaProductos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadisticaProductos.add(this.jButtonCerrarOrderByEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadisticaProductos = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadisticaProductos= new JScrollPane(jPanelOrderByEstadisticaProductos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadisticaProductos = new GridBagConstraints();
			this.gridBagConstraintsEstadisticaProductos.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadisticaProductos.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadisticaProductos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadisticaProductos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadisticaProductos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadisticaProductos);
			
			this.jInternalFrameOrderByEstadisticaProductos.getContentPane().add(this.jScrollPanelOrderByEstadisticaProductos, this.gridBagConstraintsEstadisticaProductos);			
		
		} else {
			this.jButtonAbrirOrderByEstadisticaProductos = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.estadisticaproductosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosEstadisticaProductos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadisticaProductos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosEstadisticaProductos.getRowHeight();//EstadisticaProductosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadisticaProductos.isSelected()) {
					iHeightTable=EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadisticaProductos.isSelected()) {
					iHeightTable=EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadisticaProductosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadisticaProductos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadisticaProductos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadisticaProductos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadisticaProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadisticaProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadisticaProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadisticaProductos!=null && this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy()!=null) {
			//if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadisticaProductos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadisticaProductos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadisticaProductos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadisticaProductos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadisticaProductos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadisticaProductos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=estadisticaproductosLogic.getEstadisticaProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadisticaproductoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadisticaProductos> TraerEstadisticaProductosBeans(List<EstadisticaProductos> estadisticaproductoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadisticaProductos estadisticaproductos:estadisticaproductoss) {
					
				if(!(EstadisticaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadisticaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadisticaproductos.setsDetalleGeneralEntityReporte(EstadisticaProductosConstantesFunciones.getEstadisticaProductosDescripcion(estadisticaproductos));
										
						
					
						
					
				} else  {
							
					//estadisticaproductos.setsDetalleGeneralEntityReporte(estadisticaproductos.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadisticaproductosbeans.add(estadisticaproductosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadisticaproductoss;
    }
	//PARA REPORTES FIN
}
