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
import com.bydan.erp.puntoventa.util.report.VentaPorLineaConstantesFunciones;

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
public class VentaPorLineaJInternalFrame extends VentaPorLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentaPorLinea;
	
	protected JMenuBar jmenuBarVentaPorLinea;
	
	protected JMenu jmenuVentaPorLinea;
	protected JMenu jmenuDatosVentaPorLinea;
	protected JMenu jmenuArchivoVentaPorLinea;
	protected JMenu jmenuAccionesVentaPorLinea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentaPorLinea;	
	protected GridBagConstraints gridBagConstraintsVentaPorLinea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentaPorLineaDetalleFormJInternalFrame jInternalFrameDetalleFormVentaPorLinea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentaPorLinea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentaPorLinea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public VentaPorLineaSessionBean ventaporlineaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentaPorLinea> ventaporlineas;		
	public List<VentaPorLinea> ventaporlineasEliminados;	
	public List<VentaPorLinea> ventaporlineasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentaPorLinea;		
	protected JButton jButtonAbrirOrderByVentaPorLinea;
	
	
	//protected JPanel jPanelOrderByVentaPorLinea;
	//public JScrollPane jScrollPanelOrderByVentaPorLinea;	
	//protected JButton jButtonCerrarOrderByVentaPorLinea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentaPorLineaLogic ventaporlineaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentaPorLinea;
	public JScrollPane jScrollPanelDatosEdicionVentaPorLinea;
	public JScrollPane jScrollPanelDatosGeneralVentaPorLinea;
    
	
	
	//public JScrollPane jScrollPanelDatosVentaPorLineaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentaPorLinea;
	//public JScrollPane jScrollPanelImportacionVentaPorLinea;
	
	
	
	protected JPanel jPanelAccionesVentaPorLinea;
	
    protected JPanel jPanelPaginacionVentaPorLinea;
    protected JPanel jPanelParametrosReportesVentaPorLinea;
	protected JPanel jPanelParametrosReportesAccionesVentaPorLinea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentaPorLinea;
	protected JPanel jPanelParametrosAuxiliar2VentaPorLinea;
	protected JPanel jPanelParametrosAuxiliar3VentaPorLinea;
	protected JPanel jPanelParametrosAuxiliar4VentaPorLinea;
	//protected JPanel jPanelParametrosAuxiliar5VentaPorLinea;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentaPorLinea;
	//protected JPanel jPanelImportacionVentaPorLinea;
	
	
	public JTable jTableDatosVentaPorLinea;
	
	
	
	//public JTable jTableDatosVentaPorLineaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentaPorLinea;
	protected JButton jButtonDuplicarVentaPorLinea;
	protected JButton jButtonCopiarVentaPorLinea;
	protected JButton jButtonVerFormVentaPorLinea;
	protected JButton jButtonNuevoRelacionesVentaPorLinea;
	protected JButton jButtonModificarVentaPorLinea;
	
    protected JButton jButtonGuardarCambiosTablaVentaPorLinea;
	protected JButton jButtonCerrarVentaPorLinea;
	
	
	protected JButton jButtonRecargarInformacionVentaPorLinea;
	protected JButton jButtonProcesarInformacionVentaPorLinea;
	
	
	protected JButton jButtonAnterioresVentaPorLinea;
	protected JButton jButtonSiguientesVentaPorLinea;
	protected JButton jButtonNuevoGuardarCambiosVentaPorLinea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentaPorLinea;
	//protected JButton jButtonCerrarReporteDinamicoVentaPorLinea;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentaPorLinea;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentaPorLinea;
	//protected JButton jButtonGenerarImportacionVentaPorLinea;
	//protected JButton jButtonCerrarImportacionVentaPorLinea;
	//protected JFileChooser jFileChooserImportacionVentaPorLinea;
	//protected File fileImportacionVentaPorLinea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentaPorLinea;
	protected JButton jButtonDuplicarToolBarVentaPorLinea;
	protected JButton jButtonNuevoRelacionesToolBarVentaPorLinea;
	
	
	public JButton jButtonGuardarCambiosToolBarVentaPorLinea;
	protected JButton jButtonCopiarToolBarVentaPorLinea;
	protected JButton jButtonVerFormToolBarVentaPorLinea;
	public JButton jButtonGuardarCambiosTablaToolBarVentaPorLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarVentaPorLinea;
	protected JButton jButtonCerrarToolBarVentaPorLinea;
	
	protected JButton jButtonRecargarInformacionToolBarVentaPorLinea;
	protected JButton jButtonProcesarInformacionToolBarVentaPorLinea;
	protected JButton jButtonAnterioresToolBarVentaPorLinea;
	protected JButton jButtonSiguientesToolBarVentaPorLinea;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentaPorLinea;
	protected JButton jButtonAbrirOrderByToolBarVentaPorLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentaPorLinea;
	protected JMenuItem jMenuItemDuplicarVentaPorLinea;
	protected JMenuItem jMenuItemNuevoRelacionesVentaPorLinea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentaPorLinea;
	protected JMenuItem jMenuItemCopiarVentaPorLinea;
	protected JMenuItem jMenuItemVerFormVentaPorLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentaPorLinea;
	protected JMenuItem jMenuItemCerrarVentaPorLinea;
	protected JMenuItem jMenuItemDetalleCerrarVentaPorLinea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentaPorLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentaPorLinea;
	
	protected JMenuItem jMenuItemRecargarInformacionVentaPorLinea;
	protected JMenuItem jMenuItemProcesarInformacionVentaPorLinea;
	protected JMenuItem jMenuItemAnterioresVentaPorLinea;
	protected JMenuItem jMenuItemSiguientesVentaPorLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentaPorLinea;
	protected JMenuItem jMenuItemAbrirOrderByVentaPorLinea;
	protected JMenuItem jMenuItemMostrarOcultarVentaPorLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentaPorLinea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentaPorLinea;
	protected JCheckBox jCheckBoxSeleccionadosVentaPorLinea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentaPorLinea;
	protected JCheckBox jCheckBoxConGraficoReporteVentaPorLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentaPorLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentaPorLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentaPorLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentaPorLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentaPorLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentaPorLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentaPorLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentaPorLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentaPorLinea;
	protected JTextField jTextFieldValorCampoGeneralVentaPorLinea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentaPorLinea;
	//public JList<Reporte> jListColumnasSelectReporteVentaPorLinea;
	//public JScrollPane jScrollColumnasSelectReporteVentaPorLinea;
	
	//public JLabel jLabelRelacionesSelectReporteVentaPorLinea;
	//public JList<Reporte> jListRelacionesSelectReporteVentaPorLinea;
	//public JScrollPane jScrollRelacionesSelectReporteVentaPorLinea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentaPorLinea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentaPorLinea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentaPorLinea;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentaPorLinea;
	
		
	//public JLabel jLabelArchivoImportacionVentaPorLinea;	
	//public JLabel jLabelPathArchivoImportacionVentaPorLinea;
	//protected JTextField jTextFieldPathArchivoImportacionVentaPorLinea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentaPorLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentaPorLinea;
	
	//public JLabel jLabelColumnaCategoriaValorVentaPorLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentaPorLinea;
	
	//public JLabel jLabelColumnasValoresGraficoVentaPorLinea;
	//public JList<Reporte> jListColumnasValoresGraficoVentaPorLinea;
	//public JScrollPane jScrollColumnasValoresGraficoVentaPorLinea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentaPorLinea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentaPorLinea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentaPorLinea;
	public JPanel jPanelBusquedaVentaPorLineaVentaPorLinea;
	public JButton jButtonBusquedaVentaPorLineaVentaPorLinea;
	
	public JPanel jPanelfecha_desdeBusquedaVentaPorLineaVentaPorLinea;
	public JLabel jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea;

	public JDateChooser jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea;
	public JButton jButtonfecha_desdeBusquedaVentaPorLineaVentaPorLineaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaVentaPorLineaVentaPorLinea;
	public JLabel jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea;

	public JDateChooser jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea;
	public JButton jButtonfecha_hastaBusquedaVentaPorLineaVentaPorLineaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VentaPorLineaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaPorLineaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaPorLineaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentaPorLineaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentaPorLinea)	{
		this.jButtonRecargarInformacionVentaPorLinea = jButtonRecargarInformacionVentaPorLinea;
	}
	
	public JButton getjButtonProcesarInformacionVentaPorLinea() {
		return this.jButtonProcesarInformacionVentaPorLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentaPorLinea)	{
		this.jButtonProcesarInformacionVentaPorLinea = jButtonProcesarInformacionVentaPorLinea;
	}
	
	
	public JButton getjButtonRecargarInformacionVentaPorLinea() {
		return this.jButtonRecargarInformacionVentaPorLinea;
	}
	
	
	public List<VentaPorLinea> getventaporlineas() {
		return this.ventaporlineas;
	}

	public void setventaporlineas(List<VentaPorLinea> ventaporlineas) {
		this.ventaporlineas = ventaporlineas;
	}
	
	public List<VentaPorLinea> getventaporlineasAux() {
		return this.ventaporlineasAux;
	}

	public void setventaporlineasAux(List<VentaPorLinea> ventaporlineasAux) {
		this.ventaporlineasAux = ventaporlineasAux;
	}
	
	public List<VentaPorLinea> getventaporlineasEliminados() {
		return this.ventaporlineasEliminados;
	}

	public void setVentaPorLineasEliminados(List<VentaPorLinea> ventaporlineasEliminados) {
		this.ventaporlineasEliminados = ventaporlineasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentaPorLinea() {
		return jComboBoxTiposSeleccionarVentaPorLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentaPorLinea(
			JComboBox jComboBoxTiposSeleccionarVentaPorLinea) {
		this.jComboBoxTiposSeleccionarVentaPorLinea = jComboBoxTiposSeleccionarVentaPorLinea;
	}
	
	public void setBorderResaltarTiposSeleccionarVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentaPorLinea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentaPorLinea() {
		return jTextFieldValorCampoGeneralVentaPorLinea;
	}

	public void setjTextFieldValorCampoGeneralVentaPorLinea(
			JTextField jTextFieldValorCampoGeneralVentaPorLinea) {
		this.jTextFieldValorCampoGeneralVentaPorLinea = jTextFieldValorCampoGeneralVentaPorLinea;
	}

	public void setBorderResaltarValorCampoGeneralVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentaPorLinea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentaPorLinea() {
		return this.jCheckBoxSeleccionarTodosVentaPorLinea;
	}

	public void setjCheckBoxSeleccionarTodosVentaPorLinea(
			JCheckBox jCheckBoxSeleccionarTodosVentaPorLinea) {
		this.jCheckBoxSeleccionarTodosVentaPorLinea = jCheckBoxSeleccionarTodosVentaPorLinea;
	}

	public void setBorderResaltarSeleccionarTodosVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentaPorLinea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentaPorLinea() {
		return this.jCheckBoxSeleccionadosVentaPorLinea;
	}

	public void setjCheckBoxSeleccionadosVentaPorLinea(
			JCheckBox jCheckBoxSeleccionadosVentaPorLinea) {
		this.jCheckBoxSeleccionadosVentaPorLinea = jCheckBoxSeleccionadosVentaPorLinea;
	}
	
	public void setBorderResaltarSeleccionadosVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentaPorLinea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentaPorLinea() {
		return this.jComboBoxTiposArchivosReportesVentaPorLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentaPorLinea(
			JComboBox jComboBoxTiposArchivosReportesVentaPorLinea) {
		this.jComboBoxTiposArchivosReportesVentaPorLinea = jComboBoxTiposArchivosReportesVentaPorLinea;
	}

	public void setBorderResaltarTiposArchivosReportesVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentaPorLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentaPorLinea() {
		return this.jComboBoxTiposReportesVentaPorLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentaPorLinea(
			JComboBox jComboBoxTiposReportesVentaPorLinea) {
		this.jComboBoxTiposReportesVentaPorLinea = jComboBoxTiposReportesVentaPorLinea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentaPorLinea() {
	//	return jComboBoxTiposReportesDinamicoVentaPorLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentaPorLinea(
	//		JComboBox jComboBoxTiposReportesDinamicoVentaPorLinea) {
	//	this.jComboBoxTiposReportesDinamicoVentaPorLinea = jComboBoxTiposReportesDinamicoVentaPorLinea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentaPorLinea() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentaPorLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentaPorLinea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentaPorLinea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea = jComboBoxTiposArchivosReportesDinamicoVentaPorLinea;
	//}
	
	public void setBorderResaltarTiposReportesVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentaPorLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentaPorLinea() {
		return this.jComboBoxTiposGraficosReportesVentaPorLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentaPorLinea(
			JComboBox jComboBoxTiposGraficosReportesVentaPorLinea) {
		this.jComboBoxTiposGraficosReportesVentaPorLinea = jComboBoxTiposGraficosReportesVentaPorLinea;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentaPorLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentaPorLinea() {
		return this.jComboBoxTiposPaginacionVentaPorLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentaPorLinea(
			JComboBox jComboBoxTiposPaginacionVentaPorLinea) {
		this.jComboBoxTiposPaginacionVentaPorLinea = jComboBoxTiposPaginacionVentaPorLinea;
	}
	
	public void setBorderResaltarTiposPaginacionVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentaPorLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentaPorLinea() {
		return this.jComboBoxTiposRelacionesVentaPorLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentaPorLinea() {
		return this.jComboBoxTiposAccionesVentaPorLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentaPorLinea(
			JComboBox jComboBoxTiposRelacionesVentaPorLinea) {
		this.jComboBoxTiposRelacionesVentaPorLinea = jComboBoxTiposRelacionesVentaPorLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentaPorLinea(
			JComboBox jComboBoxTiposAccionesVentaPorLinea) {
		this.jComboBoxTiposAccionesVentaPorLinea = jComboBoxTiposAccionesVentaPorLinea;
	}
	
	public void setBorderResaltarTiposRelacionesVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentaPorLinea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentaPorLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentaPorLinea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentaPorLinea() {
	//	return jCheckBoxConGraficoDinamicoVentaPorLinea;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentaPorLinea(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentaPorLinea) {
	//	this.jCheckBoxConGraficoDinamicoVentaPorLinea = jCheckBoxConGraficoDinamicoVentaPorLinea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentaPorLinea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentaPorLinea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentaPorLinea .setBorder(borderResaltar);		
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
		this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
		
		this.ventaporlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventaporlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventaporlineaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentaPorLineaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentaPorLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentaPorLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentaPorLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentaPorLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Venta Por Linea MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
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
		
		VentaPorLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentaPorLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentaPorLinea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"nuevo","nuevo","Nuevo"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"duplicar","duplicar","Duplicar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"copiar","copiar","Copiar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"ver_form","ver_form","Ver"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"recargar","recargar","Buscar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentaPorLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentaPorLinea,this.jTtoolBarVentaPorLinea,
							"cerrar","cerrar","Salir"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentaPorLinea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentaPorLinea;
			
				this.jButtonProcesarInformacionToolBarVentaPorLinea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentaPorLinea;
				
		//protected JButton jButtonModificarToolBarVentaPorLinea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentaPorLinea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentaPorLinea=new JMenuMe("General");
		this.jmenuArchivoVentaPorLinea=new JMenuMe("Archivo");
		this.jmenuAccionesVentaPorLinea=new JMenuMe("Acciones");
		this.jmenuDatosVentaPorLinea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentaPorLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentaPorLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentaPorLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentaPorLinea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentaPorLinea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentaPorLinea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentaPorLinea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentaPorLinea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentaPorLinea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentaPorLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentaPorLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentaPorLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentaPorLinea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentaPorLinea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentaPorLinea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentaPorLinea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentaPorLinea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentaPorLinea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentaPorLinea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentaPorLinea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentaPorLinea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentaPorLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentaPorLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentaPorLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentaPorLinea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentaPorLinea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentaPorLinea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentaPorLinea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentaPorLinea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentaPorLinea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentaPorLinea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentaPorLinea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentaPorLinea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentaPorLinea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentaPorLinea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentaPorLinea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentaPorLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentaPorLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentaPorLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentaPorLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentaPorLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentaPorLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentaPorLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentaPorLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentaPorLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentaPorLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentaPorLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentaPorLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentaPorLinea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentaPorLinea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentaPorLinea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentaPorLinea.add(this.jMenuItemCerrarVentaPorLinea);
			
			this.jmenuAccionesVentaPorLinea.add(this.jMenuItemNuevoVentaPorLinea);
			this.jmenuAccionesVentaPorLinea.add(this.jMenuItemNuevoGuardarCambiosVentaPorLinea);
			this.jmenuAccionesVentaPorLinea.add(this.jMenuItemNuevoRelacionesVentaPorLinea);
			this.jmenuAccionesVentaPorLinea.add(this.jMenuItemGuardarCambiosTablaVentaPorLinea);		
			this.jmenuAccionesVentaPorLinea.add(this.jMenuItemDuplicarVentaPorLinea);		
			this.jmenuAccionesVentaPorLinea.add(this.jMenuItemCopiarVentaPorLinea);		
			this.jmenuAccionesVentaPorLinea.add(this.jMenuItemVerFormVentaPorLinea);		
			
			this.jmenuDatosVentaPorLinea.add(this.jMenuItemRecargarInformacionVentaPorLinea);				
			this.jmenuDatosVentaPorLinea.add(this.jMenuItemAnterioresVentaPorLinea);				
			this.jmenuDatosVentaPorLinea.add(this.jMenuItemSiguientesVentaPorLinea);				
			this.jmenuDatosVentaPorLinea.add(this.jMenuItemAbrirOrderByVentaPorLinea);				
			this.jmenuDatosVentaPorLinea.add(this.jMenuItemMostrarOcultarVentaPorLinea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentaPorLinea.add(this.jMenuItemGuardarCambiosVentaPorLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentaPorLinea.add(this.jmenuArchivoVentaPorLinea);		
			this.jmenuBarVentaPorLinea.add(this.jmenuAccionesVentaPorLinea);		
			this.jmenuBarVentaPorLinea.add(this.jmenuDatosVentaPorLinea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentaPorLinea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentaPorLinea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentaPorLineaVentaPorLinea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentaPorLineaVentaPorLinea.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaVentaPorLineaVentaPorLinea= new JButtonMe();
		this.jButtonBusquedaVentaPorLineaVentaPorLinea.setText("Buscar");
		this.jButtonBusquedaVentaPorLineaVentaPorLinea.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentaPorLineaVentaPorLinea,"buscar_button","Buscar Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentaPorLineaVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea = new JLabelMe();
		jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea= new JDateChooser();
		jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setDate(new Date());
		jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea = new JLabelMe();
		jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea= new JDateChooser();
		jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setDate(new Date());
		jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentaPorLinea=new JTabbedPane();


		this.jTabbedPaneBusquedasVentaPorLinea.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentaPorLinea.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentaPorLinea.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentaPorLinea,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentaPorLinea = new VentaPorLineaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Venta Por Linea DATOS");
			this.jInternalFrameDetalleFormVentaPorLinea = new VentaPorLineaDetalleFormJInternalFrame(jDesktopPane,this.ventaporlineaSessionBean.getConGuardarRelaciones(),this.ventaporlineaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentaPorLinea = null;//new VentaPorLineaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentaPorLinea= new GridBagLayout();
		
		
		this.jTableDatosVentaPorLinea = new JTableMe();      
		
		String sToolTipVentaPorLinea="";
		sToolTipVentaPorLinea=VentaPorLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentaPorLinea+="(PuntoVenta.VentaPorLinea)";
		}
		
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentaPorLinea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentaPorLinea.setToolTipText(sToolTipVentaPorLinea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentaPorLinea);
		this.jTableDatosVentaPorLinea.setAutoCreateRowSorter(true);
		this.jTableDatosVentaPorLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentaPorLinea.setRowSelectionAllowed(true);
		this.jTableDatosVentaPorLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentaPorLinea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentaPorLinea = new JButtonMe();
		this.jButtonDuplicarVentaPorLinea = new JButtonMe();
		this.jButtonCopiarVentaPorLinea = new JButtonMe();
		this.jButtonVerFormVentaPorLinea = new JButtonMe();
		this.jButtonNuevoRelacionesVentaPorLinea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentaPorLinea = new JButtonMe();
		this.jButtonCerrarVentaPorLinea = new JButtonMe();
		
		this.jScrollPanelDatosVentaPorLinea = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentaPorLinea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Venta Por Linea";
		
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Por Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosVentaPorLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentaPorLinea.setToolTipText("Acciones");
        this.jPanelAccionesVentaPorLinea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentaPorLinea=new ReporteDinamicoJInternalFrame(VentaPorLineaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentaPorLinea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentaPorLinea=new ImportacionJInternalFrame(VentaPorLineaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentaPorLinea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentaPorLinea = new JButtonMe();
		
		this.jButtonAbrirOrderByVentaPorLinea.setText("Orden");
		this.jButtonAbrirOrderByVentaPorLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentaPorLinea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentaPorLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaPorLinea,false,this);
			
			//this.cargarOrderByVentaPorLinea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentaPorLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaPorLinea,true,this);
			
			//this.cargarOrderByVentaPorLinea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentaPorLinea.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosVentaPorLinea.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosVentaPorLinea.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosVentaPorLinea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentaPorLinea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentaPorLinea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentaPorLinea.setText("Nuevo");
		this.jButtonDuplicarVentaPorLinea.setText("Duplicar");
		this.jButtonCopiarVentaPorLinea.setText("Copiar");
		this.jButtonVerFormVentaPorLinea.setText("Ver");
		this.jButtonNuevoRelacionesVentaPorLinea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentaPorLinea.setText("Guardar");
		this.jButtonCerrarVentaPorLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentaPorLinea,"nuevo_button","Nuevo",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentaPorLinea,"duplicar_button","Duplicar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentaPorLinea,"copiar_button","Copiar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentaPorLinea,"ver_form","Ver",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentaPorLinea,"nuevorelaciones_button","Nuevo Rel",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentaPorLinea,"guardarcambiostabla_button","Guardar",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentaPorLinea,"cerrar_button","Salir",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentaPorLinea.setToolTipText("Nuevo"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentaPorLinea.setToolTipText("Duplicar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentaPorLinea.setToolTipText("Copiar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentaPorLinea.setToolTipText("Ver"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentaPorLinea.setToolTipText("Nuevo Rel"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentaPorLinea.setToolTipText("Guardar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentaPorLinea.setToolTipText("Salir"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentaPorLinea";
		inputMap = this.jButtonNuevoVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentaPorLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentaPorLinea"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentaPorLinea";
		inputMap = this.jButtonDuplicarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentaPorLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentaPorLinea"));
		
		//COPIAR
		sMapKey = "CopiarVentaPorLinea";
		inputMap = this.jButtonCopiarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentaPorLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentaPorLinea"));
		
		//VEr FORM
		sMapKey = "VerFormVentaPorLinea";
		inputMap = this.jButtonVerFormVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentaPorLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentaPorLinea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentaPorLinea";
		inputMap = this.jButtonNuevoRelacionesVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentaPorLinea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentaPorLinea";
		inputMap = this.jButtonModificarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentaPorLinea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentaPorLinea";
		inputMap = this.jButtonCerrarVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentaPorLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentaPorLinea";
		inputMap = this.jButtonGuardarCambiosTablaVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentaPorLinea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentaPorLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentaPorLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentaPorLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentaPorLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentaPorLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentaPorLinea.setName("jPanelParametrosReportesVentaPorLinea"); 
		
		this.jPanelParametrosReportesAccionesVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentaPorLinea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentaPorLinea.setName("jPanelParametrosReportesAccionesVentaPorLinea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentaPorLinea = new JButtonMe();
		this.jButtonRecargarInformacionVentaPorLinea.setText("Buscar");
		this.jButtonRecargarInformacionVentaPorLinea.setToolTipText("Buscar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentaPorLinea,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentaPorLinea.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentaPorLinea = new JButtonMe();
		this.jButtonProcesarInformacionVentaPorLinea.setText("Procesar");
		this.jButtonProcesarInformacionVentaPorLinea.setToolTipText("Procesar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentaPorLinea.setVisible(false);
			
		this.jButtonProcesarInformacionVentaPorLinea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentaPorLinea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentaPorLinea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentaPorLinea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentaPorLinea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentaPorLinea.setText("TIPO");       
		this.jComboBoxTiposReportesVentaPorLinea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentaPorLinea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentaPorLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentaPorLinea.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentaPorLinea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentaPorLinea.setText("Accion");
		this.jComboBoxTiposRelacionesVentaPorLinea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentaPorLinea.setText("Accion");
		this.jComboBoxTiposAccionesVentaPorLinea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentaPorLinea.setText("Accion");
		this.jComboBoxTiposSeleccionarVentaPorLinea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentaPorLinea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentaPorLinea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentaPorLinea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentaPorLinea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentaPorLinea = new JLabelMe();
		
		this.jLabelAccionesVentaPorLinea.setText("Acciones");		
		this.jLabelAccionesVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentaPorLinea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentaPorLinea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentaPorLinea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentaPorLinea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentaPorLinea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentaPorLinea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentaPorLinea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentaPorLinea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentaPorLinea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentaPorLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentaPorLinea.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentaPorLinea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentaPorLinea = new JButtonMe();
		//this.jButtonAnterioresVentaPorLinea.setText("<<");
        this.jButtonAnterioresVentaPorLinea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentaPorLinea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentaPorLinea = new JButtonMe();
		//this.jButtonSiguientesVentaPorLinea.setText(">>");
        this.jButtonSiguientesVentaPorLinea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentaPorLinea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentaPorLinea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentaPorLinea.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentaPorLinea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentaPorLinea,"nuevoguardarcambios_button","Nue",this.ventaporlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentaPorLinea";
		inputMap = this.jButtonNuevoGuardarCambiosVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentaPorLinea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentaPorLinea";
		inputMap = this.jButtonRecargarInformacionVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentaPorLinea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentaPorLinea";
		inputMap = this.jButtonSiguientesVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentaPorLinea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentaPorLinea";
		inputMap = this.jButtonAnterioresVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentaPorLinea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentaPorLinea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentaPorLinea.setMinimumSize(new Dimension(this.getWidth(),VentaPorLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentaPorLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentaPorLinea.setMaximumSize(new Dimension(this.getWidth(),VentaPorLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentaPorLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentaPorLinea.setPreferredSize(new Dimension(this.getWidth(),VentaPorLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentaPorLineaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentaPorLinea = new GridBagLayout();

			this.jPanelPaginacionVentaPorLinea.setLayout(gridaBagLayoutPaginacionVentaPorLinea);						
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = 0;
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonAnterioresVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
					
						
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentaPorLinea.gridy = 0;
			
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonNuevoGuardarCambiosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
						
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentaPorLinea.gridy = 0;
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonSiguientesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = 1;
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonNuevoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
						
			
			
			if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
				this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentaPorLinea.gridy = 1;
				this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentaPorLinea.add(this.jButtonGuardarCambiosTablaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			}
			
			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = 1;
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonDuplicarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = 1;
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonCopiarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = 1;
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonVerFormVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = 1;
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentaPorLinea.add(this.jButtonCerrarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		
		this.jButtonRecargarInformacionVentaPorLinea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentaPorLinea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentaPorLinea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentaPorLinea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentaPorLinea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentaPorLinea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentaPorLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentaPorLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentaPorLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentaPorLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentaPorLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentaPorLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentaPorLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentaPorLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentaPorLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentaPorLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentaPorLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentaPorLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentaPorLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaPorLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentaPorLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentaPorLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentaPorLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentaPorLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentaPorLinea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentaPorLinea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentaPorLinea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentaPorLinea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentaPorLinea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentaPorLinea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentaPorLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentaPorLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentaPorLinea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentaPorLinea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentaPorLinea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentaPorLinea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentaPorLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentaPorLinea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentaPorLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentaPorLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentaPorLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentaPorLinea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentaPorLinea.setLayout(gridaBagParametrosReportesVentaPorLinea);
			this.jPanelParametrosReportesAccionesVentaPorLinea.setLayout(gridaBagParametrosReportesAccionesVentaPorLinea);
			
			
			this.jPanelParametrosAuxiliar1VentaPorLinea.setLayout(gridaBagParametrosAuxiliar1VentaPorLinea);
			this.jPanelParametrosAuxiliar2VentaPorLinea.setLayout(gridaBagParametrosAuxiliar2VentaPorLinea);
			this.jPanelParametrosAuxiliar3VentaPorLinea.setLayout(gridaBagParametrosAuxiliar3VentaPorLinea);
			this.jPanelParametrosAuxiliar4VentaPorLinea.setLayout(gridaBagParametrosAuxiliar4VentaPorLinea);
			//this.jPanelParametrosAuxiliar5VentaPorLinea.setLayout(gridaBagParametrosAuxiliar2VentaPorLinea);			
			
			
			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentaPorLinea.add(this.jButtonRecargarInformacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentaPorLinea.add(this.jComboBoxTiposPaginacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentaPorLinea.add(this.jCheckBoxConAltoMaximoTablaVentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentaPorLinea.add(this.jComboBoxTiposArchivosReportesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaPorLinea.add(this.jPanelParametrosAuxiliar1VentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentaPorLinea.add(this.jComboBoxTiposReportesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);																		
			
			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentaPorLinea.add(this.jComboBoxTiposGraficosReportesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaPorLinea.add(this.jPanelParametrosAuxiliar4VentaPorLinea, this.gridBagConstraintsVentaPorLinea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaPorLinea.add(this.jComboBoxTiposReportesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaPorLinea.add(this.jCheckBoxGenerarReporteVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaPorLinea.add(this.jPanelParametrosAuxiliar2VentaPorLinea, this.gridBagConstraintsVentaPorLinea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaPorLinea.add(this.jLabelAccionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
				this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentaPorLinea.add(this.jButtonAbrirOrderByVentaPorLinea, this.gridBagConstraintsVentaPorLinea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentaPorLinea.add(this.jComboBoxTiposSeleccionarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
			
			
			/*
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaPorLinea.add(this.jCheckBoxSeleccionarTodosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentaPorLinea.add(this.jCheckBoxConGraficoReporteVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentaPorLinea.add(this.jCheckBoxSeleccionarTodosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);															
				
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentaPorLinea.add(this.jCheckBoxSeleccionadosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);															
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentaPorLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentaPorLinea.add(this.jCheckBoxConGraficoReporteVentaPorLinea, this.gridBagConstraintsVentaPorLinea);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentaPorLinea.add(this.jPanelParametrosAuxiliar3VentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentaPorLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentaPorLinea.add(this.jComboBoxTiposAccionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentaPorLinea = new GridBagLayout();

			this.jScrollPanelDatosVentaPorLinea.setLayout(gridaBagLayoutDatosVentaPorLinea);
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = 0;
			this.gridBagConstraintsVentaPorLinea.gridx = 0;
			
			this.jScrollPanelDatosVentaPorLinea.add(this.jTableDatosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentaPorLinea.setViewportView(this.jTableDatosVentaPorLinea);
		this.jTableDatosVentaPorLinea.setFillsViewportHeight(true);
		this.jTableDatosVentaPorLinea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentaPorLinea= new GridBagLayout();
		this.jPanelAccionesVentaPorLinea.setLayout(gridaBagLayoutAccionesVentaPorLinea);
		
		
		/*	
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = 0;
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
			
		this.jPanelAccionesVentaPorLinea.add(this.jButtonNuevoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentaPorLineaVentaPorLinea= new GridBagLayout();
		gridaBagLayoutBusquedaVentaPorLineaVentaPorLinea.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentaPorLineaVentaPorLinea.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentaPorLineaVentaPorLinea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentaPorLineaVentaPorLinea.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentaPorLineaVentaPorLinea.setLayout(gridaBagLayoutBusquedaVentaPorLineaVentaPorLinea);

		gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaPorLinea.gridy = 0;
		gridBagConstraintsVentaPorLinea.gridx = 0;
		jPanelBusquedaVentaPorLineaVentaPorLinea.add(jLabelfecha_desdeBusquedaVentaPorLineaVentaPorLinea, gridBagConstraintsVentaPorLinea);

		gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaPorLinea.gridy = 0;
		gridBagConstraintsVentaPorLinea.gridx = 1;
		jPanelBusquedaVentaPorLineaVentaPorLinea.add(jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea, gridBagConstraintsVentaPorLinea);


		gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaPorLinea.gridy = 1;
		gridBagConstraintsVentaPorLinea.gridx = 0;
		jPanelBusquedaVentaPorLineaVentaPorLinea.add(jLabelfecha_hastaBusquedaVentaPorLineaVentaPorLinea, gridBagConstraintsVentaPorLinea);

		gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaPorLinea.gridy = 1;
		gridBagConstraintsVentaPorLinea.gridx = 1;
		jPanelBusquedaVentaPorLineaVentaPorLinea.add(jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea, gridBagConstraintsVentaPorLinea);

		gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentaPorLinea.gridy = 2;
		gridBagConstraintsVentaPorLinea.gridx =1;
		jPanelBusquedaVentaPorLineaVentaPorLinea.add(jButtonBusquedaVentaPorLineaVentaPorLinea, gridBagConstraintsVentaPorLinea);

		jTabbedPaneBusquedasVentaPorLinea.addTab("1.-Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaVentaPorLineaVentaPorLinea);
		jTabbedPaneBusquedasVentaPorLinea.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentaPorLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentaPorLinea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();						
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentaPorLinea.gridx = 0;		
			//this.gridBagConstraintsVentaPorLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentaPorLinea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentaPorLinea, this.gridBagConstraintsVentaPorLinea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentaPorLinea.gridx = 0;		
		//this.gridBagConstraintsVentaPorLinea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentaPorLinea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentaPorLinea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentaPorLinea.gridx = 0;		
			this.gridBagConstraintsVentaPorLinea.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentaPorLinea.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentaPorLinea, this.gridBagConstraintsVentaPorLinea);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);								
		
		
		/*
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		*/		
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentaPorLinea.gridx =0;
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentaPorLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
				
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentaPorLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentaPorLinea = new GridBagLayout();
			this.jPanelBusquedasParametrosVentaPorLinea.setLayout(gridaBagLayoutBusquedasParametrosVentaPorLinea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentaPorLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentaPorLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaPorLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentaPorLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
			
			
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
			
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentaPorLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentaPorLinea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentaPorLinea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentaPorLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentaPorLinea.setName("jPanelReporteDinamicoVentaPorLinea"); 
		
		this.jPanelReporteDinamicoVentaPorLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentaPorLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentaPorLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentaPorLinea.setLayout(gridaBagLayoutReporteDinamicoVentaPorLinea);
		
		
		this.jInternalFrameReporteDinamicoVentaPorLinea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentaPorLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentaPorLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentaPorLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentaPorLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentaPorLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentaPorLinea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentaPorLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentaPorLinea.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentaPorLinea.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentaPorLinea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentaPorLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentaPorLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentaPorLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Por Lineas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentaPorLinea = new JLabelMe();

		this.jLabelColumnasSelectReporteVentaPorLinea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelColumnasSelectReporteVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentaPorLinea = new JList<Reporte>();
		this.jListColumnasSelectReporteVentaPorLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentaPorLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentaPorLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentaPorLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentaPorLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentaPorLinea=new JScrollPane(this.jListColumnasSelectReporteVentaPorLinea);
			
			this.jScrollColumnasSelectReporteVentaPorLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentaPorLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentaPorLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentaPorLinea.add(this.jListColumnasSelectReporteVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jScrollColumnasSelectReporteVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentaPorLinea = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentaPorLinea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentaPorLinea = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentaPorLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentaPorLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentaPorLinea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentaPorLinea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentaPorLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentaPorLinea=new JScrollPane(this.jListRelacionesSelectReporteVentaPorLinea);
			
			this.jScrollRelacionesSelectReporteVentaPorLinea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentaPorLinea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentaPorLinea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentaPorLinea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentaPorLinea = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentaPorLinea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentaPorLinea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentaPorLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentaPorLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentaPorLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentaPorLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentaPorLinea = new JLabelMe();

		this.jLabelConGraficoDinamicoVentaPorLinea.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelConGraficoDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentaPorLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentaPorLinea.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentaPorLinea.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentaPorLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentaPorLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentaPorLinea.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jCheckBoxConGraficoDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentaPorLinea = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentaPorLinea.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelColumnaCategoriaGraficoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentaPorLinea.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentaPorLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentaPorLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentaPorLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentaPorLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jComboBoxColumnaCategoriaGraficoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentaPorLinea = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentaPorLinea.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelColumnaCategoriaValorVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentaPorLinea.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentaPorLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentaPorLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentaPorLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentaPorLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jComboBoxColumnaCategoriaValorVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentaPorLinea = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentaPorLinea.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelColumnasValoresGraficoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentaPorLinea = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentaPorLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentaPorLinea.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentaPorLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentaPorLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentaPorLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentaPorLinea=new JScrollPane(this.jListColumnasValoresGraficoVentaPorLinea);
			
			this.jScrollColumnasValoresGraficoVentaPorLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentaPorLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentaPorLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentaPorLinea.add(this.jListColumnasSelectReporteVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jScrollColumnasValoresGraficoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentaPorLinea = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentaPorLinea.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelTiposGraficosReportesDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentaPorLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentaPorLinea.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentaPorLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentaPorLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentaPorLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentaPorLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jComboBoxTiposGraficosReportesDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentaPorLinea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentaPorLinea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelGenerarExcelReporteDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentaPorLinea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentaPorLinea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentaPorLinea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentaPorLinea.setToolTipText("Generar EXCEL"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		//this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentaPorLinea.add(this.jButtonGenerarExcelReporteDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jComboBoxTiposReportesDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentaPorLinea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentaPorLinea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jLabelTiposArchivoReporteDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jComboBoxTiposArchivosReportesDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentaPorLinea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentaPorLinea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentaPorLinea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentaPorLinea.setToolTipText("Generar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jButtonGenerarReporteDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentaPorLinea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentaPorLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentaPorLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentaPorLinea.setToolTipText("Cancelar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentaPorLinea.add(this.jButtonCerrarReporteDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentaPorLinea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentaPorLinea= new JScrollPane(jPanelReporteDinamicoVentaPorLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentaPorLinea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentaPorLinea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentaPorLinea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Por Lineas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentaPorLinea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentaPorLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentaPorLinea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentaPorLinea);
		this.jInternalFrameReporteDinamicoVentaPorLinea.getContentPane().add(this.jScrollPanelReporteDinamicoVentaPorLinea, this.gridBagConstraintsVentaPorLinea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentaPorLinea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentaPorLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentaPorLinea.setName("jPanelImportacionVentaPorLinea"); 
		
		this.jPanelImportacionVentaPorLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentaPorLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentaPorLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentaPorLinea.setLayout(gridaBagLayoutImportacionVentaPorLinea);
		
		
		this.jInternalFrameImportacionVentaPorLinea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentaPorLinea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentaPorLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentaPorLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentaPorLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentaPorLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentaPorLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentaPorLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentaPorLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentaPorLinea.setResizable(true);
	    this.jInternalFrameImportacionVentaPorLinea.setClosable(true);
	    this.jInternalFrameImportacionVentaPorLinea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentaPorLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentaPorLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentaPorLinea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentaPorLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentaPorLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentaPorLinea.setResizable(true);
	    this.jInternalFrameImportacionVentaPorLinea.setClosable(true);
	    this.jInternalFrameImportacionVentaPorLinea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentaPorLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentaPorLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentaPorLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Por Lineas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentaPorLinea = new JLabelMe();

		this.jLabelArchivoImportacionVentaPorLinea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentaPorLinea.add(this.jLabelArchivoImportacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentaPorLinea = new JFileChooser();		
		this.jFileChooserImportacionVentaPorLinea.setToolTipText("ESCOGER ARCHIVO"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentaPorLinea = new JButtonMe();
		this.jButtonAbrirImportacionVentaPorLinea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentaPorLinea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentaPorLinea.setToolTipText("Generar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaPorLinea.add(this.jButtonAbrirImportacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentaPorLinea = new JLabelMe();

		this.jLabelPathArchivoImportacionVentaPorLinea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentaPorLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentaPorLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentaPorLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentaPorLinea.add(this.jLabelPathArchivoImportacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentaPorLinea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentaPorLinea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentaPorLinea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentaPorLinea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaPorLinea.add(this.jTextFieldPathArchivoImportacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentaPorLinea = new JButtonMe();
		this.jButtonGenerarImportacionVentaPorLinea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentaPorLinea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentaPorLinea.setToolTipText("Generar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaPorLinea.add(this.jButtonGenerarImportacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentaPorLinea = new JButtonMe();
		this.jButtonCerrarImportacionVentaPorLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentaPorLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentaPorLinea.setToolTipText("Cancelar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentaPorLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsVentaPorLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentaPorLinea.add(this.jButtonCerrarImportacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentaPorLinea = new GridBagLayout();
		
		this.jScrollPanelImportacionVentaPorLinea= new JScrollPane(jPanelImportacionVentaPorLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
		this.gridBagConstraintsVentaPorLinea.gridy =iPosYImportacion;
		this.gridBagConstraintsVentaPorLinea.gridx =iPosXImportacion;
		this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentaPorLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentaPorLinea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentaPorLinea);
		this.jInternalFrameImportacionVentaPorLinea.getContentPane().add(this.jScrollPanelImportacionVentaPorLinea, this.gridBagConstraintsVentaPorLinea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentaPorLinea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentaPorLinea = new JButtonMe();
			this.jButtonAbrirOrderByVentaPorLinea.setText("Orden");
			this.jButtonAbrirOrderByVentaPorLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentaPorLinea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentaPorLinea";
			inputMap = this.jButtonAbrirOrderByVentaPorLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentaPorLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentaPorLinea"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentaPorLinea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentaPorLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentaPorLinea.setName("jPanelOrderByVentaPorLinea"); 
			
			this.jPanelOrderByVentaPorLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentaPorLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentaPorLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentaPorLinea.setLayout(gridaBagLayoutOrderByVentaPorLinea);
			
			
			this.jTableDatosVentaPorLineaOrderBy = new JTableMe();        
			this.jTableDatosVentaPorLineaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentaPorLineaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentaPorLineaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentaPorLineaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentaPorLineaOrderBy.setViewportView(this.jTableDatosVentaPorLineaOrderBy);
			this.jTableDatosVentaPorLineaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentaPorLineaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentaPorLinea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentaPorLinea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentaPorLinea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentaPorLinea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentaPorLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentaPorLinea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentaPorLinea.setTitle("Orden");
			this.jInternalFrameOrderByVentaPorLinea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentaPorLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentaPorLinea.setResizable(true);
			this.jInternalFrameOrderByVentaPorLinea.setClosable(true);
			this.jInternalFrameOrderByVentaPorLinea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentaPorLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentaPorLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentaPorLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentaPorLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Venta Por Lineas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentaPorLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentaPorLinea.ipady =150;
				
			this.jPanelOrderByVentaPorLinea.add(jScrollPanelDatosVentaPorLineaOrderBy, this.gridBagConstraintsVentaPorLinea);//this.jTableDatosVentaPorLineaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentaPorLinea = new JButtonMe();
			this.jButtonCerrarOrderByVentaPorLinea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentaPorLinea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentaPorLinea.setToolTipText("Cancelar"+" "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentaPorLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentaPorLinea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentaPorLinea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentaPorLinea.add(this.jButtonCerrarOrderByVentaPorLinea, this.gridBagConstraintsVentaPorLinea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentaPorLinea = new GridBagLayout();
			
			this.jScrollPanelOrderByVentaPorLinea= new JScrollPane(jPanelOrderByVentaPorLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentaPorLinea = new GridBagConstraints();
			this.gridBagConstraintsVentaPorLinea.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentaPorLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentaPorLinea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentaPorLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentaPorLinea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentaPorLinea);
			
			this.jInternalFrameOrderByVentaPorLinea.getContentPane().add(this.jScrollPanelOrderByVentaPorLinea, this.gridBagConstraintsVentaPorLinea);			
		
		} else {
			this.jButtonAbrirOrderByVentaPorLinea = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventaporlineaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentaPorLinea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentaPorLinea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentaPorLinea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentaPorLinea.getRowHeight();//VentaPorLineaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentaPorLinea.isSelected()) {
					iHeightTable=VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentaPorLinea.isSelected()) {
					iHeightTable=VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentaPorLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentaPorLinea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentaPorLinea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentaPorLinea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentaPorLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentaPorLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentaPorLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentaPorLinea!=null && this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy()!=null) {
			//if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentaPorLinea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentaPorLinea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentaPorLinea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentaPorLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentaPorLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentaPorLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventaporlineaLogic.getVentaPorLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventaporlineas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentaPorLinea> TraerVentaPorLineaBeans(List<VentaPorLinea> ventaporlineas,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentaPorLinea ventaporlinea:ventaporlineas) {
					
				if(!(VentaPorLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentaPorLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventaporlinea.setsDetalleGeneralEntityReporte(VentaPorLineaConstantesFunciones.getVentaPorLineaDescripcion(ventaporlinea));
										
						
					
						
					
				} else  {
							
					//ventaporlinea.setsDetalleGeneralEntityReporte(ventaporlinea.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventaporlineabeans.add(ventaporlineabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventaporlineas;
    }
	//PARA REPORTES FIN
}
