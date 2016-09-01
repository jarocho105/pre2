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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasCanalesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasCanalesJInternalFrame extends VentasCanalesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasCanales;
	
	protected JMenuBar jmenuBarVentasCanales;
	
	protected JMenu jmenuVentasCanales;
	protected JMenu jmenuDatosVentasCanales;
	protected JMenu jmenuArchivoVentasCanales;
	protected JMenu jmenuAccionesVentasCanales;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasCanales;	
	protected GridBagConstraints gridBagConstraintsVentasCanales;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasCanalesDetalleFormJInternalFrame jInternalFrameDetalleFormVentasCanales;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasCanales;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasCanales;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TituloClienteBeanSwingJInternalFrame tituloclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_titulocliente="";
	
	public VentasCanalesSessionBean ventascanalesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TituloClienteSessionBean tituloclienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasCanales> ventascanaless;		
	public List<VentasCanales> ventascanalessEliminados;	
	public List<VentasCanales> ventascanalessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasCanales;		
	protected JButton jButtonAbrirOrderByVentasCanales;
	
	
	//protected JPanel jPanelOrderByVentasCanales;
	//public JScrollPane jScrollPanelOrderByVentasCanales;	
	//protected JButton jButtonCerrarOrderByVentasCanales;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasCanalesLogic ventascanalesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasCanales;
	public JScrollPane jScrollPanelDatosEdicionVentasCanales;
	public JScrollPane jScrollPanelDatosGeneralVentasCanales;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasCanalesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasCanales;
	//public JScrollPane jScrollPanelImportacionVentasCanales;
	
	
	
	protected JPanel jPanelAccionesVentasCanales;
	
    protected JPanel jPanelPaginacionVentasCanales;
    protected JPanel jPanelParametrosReportesVentasCanales;
	protected JPanel jPanelParametrosReportesAccionesVentasCanales;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasCanales;
	protected JPanel jPanelParametrosAuxiliar2VentasCanales;
	protected JPanel jPanelParametrosAuxiliar3VentasCanales;
	protected JPanel jPanelParametrosAuxiliar4VentasCanales;
	//protected JPanel jPanelParametrosAuxiliar5VentasCanales;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasCanales;
	//protected JPanel jPanelImportacionVentasCanales;
	
	
	public JTable jTableDatosVentasCanales;
	
	
	
	//public JTable jTableDatosVentasCanalesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasCanales;
	protected JButton jButtonDuplicarVentasCanales;
	protected JButton jButtonCopiarVentasCanales;
	protected JButton jButtonVerFormVentasCanales;
	protected JButton jButtonNuevoRelacionesVentasCanales;
	protected JButton jButtonModificarVentasCanales;
	
    protected JButton jButtonGuardarCambiosTablaVentasCanales;
	protected JButton jButtonCerrarVentasCanales;
	
	
	protected JButton jButtonRecargarInformacionVentasCanales;
	protected JButton jButtonProcesarInformacionVentasCanales;
	
	
	protected JButton jButtonAnterioresVentasCanales;
	protected JButton jButtonSiguientesVentasCanales;
	protected JButton jButtonNuevoGuardarCambiosVentasCanales;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasCanales;
	//protected JButton jButtonCerrarReporteDinamicoVentasCanales;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasCanales;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasCanales;
	//protected JButton jButtonGenerarImportacionVentasCanales;
	//protected JButton jButtonCerrarImportacionVentasCanales;
	//protected JFileChooser jFileChooserImportacionVentasCanales;
	//protected File fileImportacionVentasCanales;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasCanales;
	protected JButton jButtonDuplicarToolBarVentasCanales;
	protected JButton jButtonNuevoRelacionesToolBarVentasCanales;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasCanales;
	protected JButton jButtonCopiarToolBarVentasCanales;
	protected JButton jButtonVerFormToolBarVentasCanales;
	public JButton jButtonGuardarCambiosTablaToolBarVentasCanales;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasCanales;
	protected JButton jButtonCerrarToolBarVentasCanales;
	
	protected JButton jButtonRecargarInformacionToolBarVentasCanales;
	protected JButton jButtonProcesarInformacionToolBarVentasCanales;
	protected JButton jButtonAnterioresToolBarVentasCanales;
	protected JButton jButtonSiguientesToolBarVentasCanales;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasCanales;
	protected JButton jButtonAbrirOrderByToolBarVentasCanales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasCanales;
	protected JMenuItem jMenuItemDuplicarVentasCanales;
	protected JMenuItem jMenuItemNuevoRelacionesVentasCanales;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasCanales;
	protected JMenuItem jMenuItemCopiarVentasCanales;
	protected JMenuItem jMenuItemVerFormVentasCanales;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasCanales;
	protected JMenuItem jMenuItemCerrarVentasCanales;
	protected JMenuItem jMenuItemDetalleCerrarVentasCanales;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasCanales;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasCanales;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasCanales;
	protected JMenuItem jMenuItemProcesarInformacionVentasCanales;
	protected JMenuItem jMenuItemAnterioresVentasCanales;
	protected JMenuItem jMenuItemSiguientesVentasCanales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasCanales;
	protected JMenuItem jMenuItemAbrirOrderByVentasCanales;
	protected JMenuItem jMenuItemMostrarOcultarVentasCanales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasCanales;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasCanales;
	protected JCheckBox jCheckBoxSeleccionadosVentasCanales;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasCanales;
	protected JCheckBox jCheckBoxConGraficoReporteVentasCanales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasCanales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasCanales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasCanales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasCanales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasCanales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasCanales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasCanales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasCanales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasCanales;
	protected JTextField jTextFieldValorCampoGeneralVentasCanales;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasCanales;
	//public JList<Reporte> jListColumnasSelectReporteVentasCanales;
	//public JScrollPane jScrollColumnasSelectReporteVentasCanales;
	
	//public JLabel jLabelRelacionesSelectReporteVentasCanales;
	//public JList<Reporte> jListRelacionesSelectReporteVentasCanales;
	//public JScrollPane jScrollRelacionesSelectReporteVentasCanales;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasCanales;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasCanales;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasCanales;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasCanales;
	
		
	//public JLabel jLabelArchivoImportacionVentasCanales;	
	//public JLabel jLabelPathArchivoImportacionVentasCanales;
	//protected JTextField jTextFieldPathArchivoImportacionVentasCanales;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasCanales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasCanales;
	
	//public JLabel jLabelColumnaCategoriaValorVentasCanales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasCanales;
	
	//public JLabel jLabelColumnasValoresGraficoVentasCanales;
	//public JList<Reporte> jListColumnasValoresGraficoVentasCanales;
	//public JScrollPane jScrollColumnasValoresGraficoVentasCanales;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasCanales;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasCanales;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasCanales;
	public JPanel jPanelBusquedaVentasCanalesVentasCanales;
	public JButton jButtonBusquedaVentasCanalesVentasCanales;
	
	public JPanel jPanelid_titulo_clienteBusquedaVentasCanalesVentasCanales;
	public JLabel jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales;
	public JButton jButtonid_titulo_clienteBusquedaVentasCanalesVentasCanales= new JButtonMe();
	public JButton jButtonid_titulo_clienteBusquedaVentasCanalesVentasCanalesUpdate= new JButtonMe();
	public JButton jButtonid_titulo_clienteBusquedaVentasCanalesVentasCanalesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasCanalesVentasCanales;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales;
	public JButton jButtonfecha_emision_desdeBusquedaVentasCanalesVentasCanalesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasCanalesVentasCanales;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales;
	public JButton jButtonfecha_emision_hastaBusquedaVentasCanalesVentasCanalesBusqueda= new JButtonMe();

	
	
	
	
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
	public VentasCanalesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCanalesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCanalesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCanalesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasCanales)	{
		this.jButtonRecargarInformacionVentasCanales = jButtonRecargarInformacionVentasCanales;
	}
	
	public JButton getjButtonProcesarInformacionVentasCanales() {
		return this.jButtonProcesarInformacionVentasCanales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasCanales)	{
		this.jButtonProcesarInformacionVentasCanales = jButtonProcesarInformacionVentasCanales;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasCanales() {
		return this.jButtonRecargarInformacionVentasCanales;
	}
	
	
	public List<VentasCanales> getventascanaless() {
		return this.ventascanaless;
	}

	public void setventascanaless(List<VentasCanales> ventascanaless) {
		this.ventascanaless = ventascanaless;
	}
	
	public List<VentasCanales> getventascanalessAux() {
		return this.ventascanalessAux;
	}

	public void setventascanalessAux(List<VentasCanales> ventascanalessAux) {
		this.ventascanalessAux = ventascanalessAux;
	}
	
	public List<VentasCanales> getventascanalessEliminados() {
		return this.ventascanalessEliminados;
	}

	public void setVentasCanalessEliminados(List<VentasCanales> ventascanalessEliminados) {
		this.ventascanalessEliminados = ventascanalessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasCanales() {
		return jComboBoxTiposSeleccionarVentasCanales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasCanales(
			JComboBox jComboBoxTiposSeleccionarVentasCanales) {
		this.jComboBoxTiposSeleccionarVentasCanales = jComboBoxTiposSeleccionarVentasCanales;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasCanales .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasCanales() {
		return jTextFieldValorCampoGeneralVentasCanales;
	}

	public void setjTextFieldValorCampoGeneralVentasCanales(
			JTextField jTextFieldValorCampoGeneralVentasCanales) {
		this.jTextFieldValorCampoGeneralVentasCanales = jTextFieldValorCampoGeneralVentasCanales;
	}

	public void setBorderResaltarValorCampoGeneralVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasCanales .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasCanales() {
		return this.jCheckBoxSeleccionarTodosVentasCanales;
	}

	public void setjCheckBoxSeleccionarTodosVentasCanales(
			JCheckBox jCheckBoxSeleccionarTodosVentasCanales) {
		this.jCheckBoxSeleccionarTodosVentasCanales = jCheckBoxSeleccionarTodosVentasCanales;
	}

	public void setBorderResaltarSeleccionarTodosVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasCanales .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasCanales() {
		return this.jCheckBoxSeleccionadosVentasCanales;
	}

	public void setjCheckBoxSeleccionadosVentasCanales(
			JCheckBox jCheckBoxSeleccionadosVentasCanales) {
		this.jCheckBoxSeleccionadosVentasCanales = jCheckBoxSeleccionadosVentasCanales;
	}
	
	public void setBorderResaltarSeleccionadosVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasCanales .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasCanales() {
		return this.jComboBoxTiposArchivosReportesVentasCanales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasCanales(
			JComboBox jComboBoxTiposArchivosReportesVentasCanales) {
		this.jComboBoxTiposArchivosReportesVentasCanales = jComboBoxTiposArchivosReportesVentasCanales;
	}

	public void setBorderResaltarTiposArchivosReportesVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasCanales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasCanales() {
		return this.jComboBoxTiposReportesVentasCanales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasCanales(
			JComboBox jComboBoxTiposReportesVentasCanales) {
		this.jComboBoxTiposReportesVentasCanales = jComboBoxTiposReportesVentasCanales;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasCanales() {
	//	return jComboBoxTiposReportesDinamicoVentasCanales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasCanales(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasCanales) {
	//	this.jComboBoxTiposReportesDinamicoVentasCanales = jComboBoxTiposReportesDinamicoVentasCanales;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasCanales() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasCanales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasCanales(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasCanales) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasCanales = jComboBoxTiposArchivosReportesDinamicoVentasCanales;
	//}
	
	public void setBorderResaltarTiposReportesVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasCanales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasCanales() {
		return this.jComboBoxTiposGraficosReportesVentasCanales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasCanales(
			JComboBox jComboBoxTiposGraficosReportesVentasCanales) {
		this.jComboBoxTiposGraficosReportesVentasCanales = jComboBoxTiposGraficosReportesVentasCanales;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasCanales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasCanales() {
		return this.jComboBoxTiposPaginacionVentasCanales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasCanales(
			JComboBox jComboBoxTiposPaginacionVentasCanales) {
		this.jComboBoxTiposPaginacionVentasCanales = jComboBoxTiposPaginacionVentasCanales;
	}
	
	public void setBorderResaltarTiposPaginacionVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasCanales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasCanales() {
		return this.jComboBoxTiposRelacionesVentasCanales;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasCanales() {
		return this.jComboBoxTiposAccionesVentasCanales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasCanales(
			JComboBox jComboBoxTiposRelacionesVentasCanales) {
		this.jComboBoxTiposRelacionesVentasCanales = jComboBoxTiposRelacionesVentasCanales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasCanales(
			JComboBox jComboBoxTiposAccionesVentasCanales) {
		this.jComboBoxTiposAccionesVentasCanales = jComboBoxTiposAccionesVentasCanales;
	}
	
	public void setBorderResaltarTiposRelacionesVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasCanales .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasCanales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCanales.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasCanales .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasCanales() {
	//	return jCheckBoxConGraficoDinamicoVentasCanales;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasCanales(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasCanales) {
	//	this.jCheckBoxConGraficoDinamicoVentasCanales = jCheckBoxConGraficoDinamicoVentasCanales;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasCanales() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasCanales.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasCanales .setBorder(borderResaltar);		
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
		this.ventascanalesSessionBean=new VentasCanalesSessionBean();
		
		this.ventascanalesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventascanalesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventascanalesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasCanalesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasCanalesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasCanalesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasCanalesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasCanalesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Canales MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasCanalesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasCanales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasCanales= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"nuevo","nuevo","Nuevo"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"duplicar","duplicar","Duplicar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"copiar","copiar","Copiar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"ver_form","ver_form","Ver"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"recargar","recargar","Buscar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasCanales,this.jTtoolBarVentasCanales,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasCanales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasCanales,this.jTtoolBarVentasCanales,
							"cerrar","cerrar","Salir"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasCanales=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasCanales;
			
				this.jButtonProcesarInformacionToolBarVentasCanales=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasCanales;
				
		//protected JButton jButtonModificarToolBarVentasCanales;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasCanales=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasCanales=new JMenuMe("General");
		this.jmenuArchivoVentasCanales=new JMenuMe("Archivo");
		this.jmenuAccionesVentasCanales=new JMenuMe("Acciones");
		this.jmenuDatosVentasCanales=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasCanales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasCanales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasCanales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasCanales= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasCanales.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasCanales,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasCanales= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasCanales.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasCanales,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasCanales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasCanales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasCanales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasCanales= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasCanales.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasCanales,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasCanales= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasCanales.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasCanales,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasCanales= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasCanales.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasCanales,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasCanales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasCanales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasCanales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasCanales= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasCanales.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasCanales,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasCanales= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasCanales.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasCanales,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasCanales= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasCanales.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasCanales,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasCanales= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasCanales.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasCanales,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasCanales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasCanales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasCanales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasCanales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasCanales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasCanales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasCanales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasCanales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasCanales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasCanales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasCanales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasCanales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasCanales= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasCanales.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasCanales,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasCanales.add(this.jMenuItemCerrarVentasCanales);
			
			this.jmenuAccionesVentasCanales.add(this.jMenuItemNuevoVentasCanales);
			this.jmenuAccionesVentasCanales.add(this.jMenuItemNuevoGuardarCambiosVentasCanales);
			this.jmenuAccionesVentasCanales.add(this.jMenuItemNuevoRelacionesVentasCanales);
			this.jmenuAccionesVentasCanales.add(this.jMenuItemGuardarCambiosTablaVentasCanales);		
			this.jmenuAccionesVentasCanales.add(this.jMenuItemDuplicarVentasCanales);		
			this.jmenuAccionesVentasCanales.add(this.jMenuItemCopiarVentasCanales);		
			this.jmenuAccionesVentasCanales.add(this.jMenuItemVerFormVentasCanales);		
			
			this.jmenuDatosVentasCanales.add(this.jMenuItemRecargarInformacionVentasCanales);				
			this.jmenuDatosVentasCanales.add(this.jMenuItemAnterioresVentasCanales);				
			this.jmenuDatosVentasCanales.add(this.jMenuItemSiguientesVentasCanales);				
			this.jmenuDatosVentasCanales.add(this.jMenuItemAbrirOrderByVentasCanales);				
			this.jmenuDatosVentasCanales.add(this.jMenuItemMostrarOcultarVentasCanales);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasCanales.add(this.jMenuItemGuardarCambiosVentasCanales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasCanales.add(this.jmenuArchivoVentasCanales);		
			this.jmenuBarVentasCanales.add(this.jmenuAccionesVentasCanales);		
			this.jmenuBarVentasCanales.add(this.jmenuDatosVentasCanales);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasCanales);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasCanales() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasCanalesVentasCanales=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasCanalesVentasCanales.setToolTipText("Buscar Por Titulo Cliente Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasCanalesVentasCanales= new JButtonMe();
		this.jButtonBusquedaVentasCanalesVentasCanales.setText("Buscar");
		this.jButtonBusquedaVentasCanalesVentasCanales.setToolTipText("Buscar Por Titulo Cliente Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasCanalesVentasCanales,"buscar_button","Buscar Por Titulo Cliente Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasCanalesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales = new JLabelMe();
		jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales.setText("Titulo Cliente :");
		jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales.setToolTipText("Titulo Cliente");
		jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales= new JComboBoxMe();
		jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasCanales=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasCanales.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasVentasCanales.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasVentasCanales.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasCanales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasCanales = new VentasCanalesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Canales DATOS");
			this.jInternalFrameDetalleFormVentasCanales = new VentasCanalesDetalleFormJInternalFrame(jDesktopPane,this.ventascanalesSessionBean.getConGuardarRelaciones(),this.ventascanalesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasCanales = null;//new VentasCanalesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasCanales= new GridBagLayout();
		
		
		this.jTableDatosVentasCanales = new JTableMe();      
		
		String sToolTipVentasCanales="";
		sToolTipVentasCanales=VentasCanalesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasCanales+="(Facturacion.VentasCanales)";
		}
		
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasCanales+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasCanales.setToolTipText(sToolTipVentasCanales);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasCanales);
		this.jTableDatosVentasCanales.setAutoCreateRowSorter(true);
		this.jTableDatosVentasCanales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasCanales.setRowSelectionAllowed(true);
		this.jTableDatosVentasCanales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasCanales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasCanales = new JButtonMe();
		this.jButtonDuplicarVentasCanales = new JButtonMe();
		this.jButtonCopiarVentasCanales = new JButtonMe();
		this.jButtonVerFormVentasCanales = new JButtonMe();
		this.jButtonNuevoRelacionesVentasCanales = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasCanales = new JButtonMe();
		this.jButtonCerrarVentasCanales = new JButtonMe();
		
		this.jScrollPanelDatosVentasCanales = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasCanales = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Canales";
		
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Canaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasCanales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasCanales.setToolTipText("Acciones");
        this.jPanelAccionesVentasCanales.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasCanales=new ReporteDinamicoJInternalFrame(VentasCanalesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasCanales();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasCanales=new ImportacionJInternalFrame(VentasCanalesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasCanales();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasCanales = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasCanales.setText("Orden");
		this.jButtonAbrirOrderByVentasCanales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasCanales,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasCanales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCanales,false,this);
			
			//this.cargarOrderByVentasCanales(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasCanales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCanales,true,this);
			
			//this.cargarOrderByVentasCanales(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasCanales.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosVentasCanales.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosVentasCanales.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosVentasCanales.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasCanales.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasCanales.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasCanales.setText("Nuevo");
		this.jButtonDuplicarVentasCanales.setText("Duplicar");
		this.jButtonCopiarVentasCanales.setText("Copiar");
		this.jButtonVerFormVentasCanales.setText("Ver");
		this.jButtonNuevoRelacionesVentasCanales.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasCanales.setText("Guardar");
		this.jButtonCerrarVentasCanales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasCanales,"nuevo_button","Nuevo",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasCanales,"duplicar_button","Duplicar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasCanales,"copiar_button","Copiar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasCanales,"ver_form","Ver",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasCanales,"nuevorelaciones_button","Nuevo Rel",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasCanales,"guardarcambiostabla_button","Guardar",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasCanales,"cerrar_button","Salir",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasCanales.setToolTipText("Nuevo"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasCanales.setToolTipText("Duplicar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasCanales.setToolTipText("Copiar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasCanales.setToolTipText("Ver"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasCanales.setToolTipText("Nuevo Rel"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasCanales.setToolTipText("Guardar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasCanales.setToolTipText("Salir"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasCanales";
		inputMap = this.jButtonNuevoVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasCanales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasCanales"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasCanales";
		inputMap = this.jButtonDuplicarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasCanales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasCanales"));
		
		//COPIAR
		sMapKey = "CopiarVentasCanales";
		inputMap = this.jButtonCopiarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasCanales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasCanales"));
		
		//VEr FORM
		sMapKey = "VerFormVentasCanales";
		inputMap = this.jButtonVerFormVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasCanales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasCanales"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasCanales";
		inputMap = this.jButtonNuevoRelacionesVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasCanales"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasCanales";
		inputMap = this.jButtonModificarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasCanales"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasCanales";
		inputMap = this.jButtonCerrarVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasCanales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasCanales";
		inputMap = this.jButtonGuardarCambiosTablaVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasCanales"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasCanales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasCanales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasCanales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasCanales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasCanales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasCanales.setName("jPanelParametrosReportesVentasCanales"); 
		
		this.jPanelParametrosReportesAccionesVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasCanales.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasCanales.setName("jPanelParametrosReportesAccionesVentasCanales"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasCanales, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasCanales = new JButtonMe();
		this.jButtonRecargarInformacionVentasCanales.setText("Buscar");
		this.jButtonRecargarInformacionVentasCanales.setToolTipText("Buscar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasCanales,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasCanales.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasCanales = new JButtonMe();
		this.jButtonProcesarInformacionVentasCanales.setText("Procesar");
		this.jButtonProcesarInformacionVentasCanales.setToolTipText("Procesar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasCanales.setVisible(false);
			
		this.jButtonProcesarInformacionVentasCanales.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasCanales.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasCanales.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasCanales.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasCanales.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasCanales.setText("TIPO");       
		this.jComboBoxTiposReportesVentasCanales.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasCanales.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasCanales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasCanales.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasCanales.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasCanales.setText("Accion");
		this.jComboBoxTiposRelacionesVentasCanales.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasCanales.setText("Accion");
		this.jComboBoxTiposAccionesVentasCanales.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasCanales = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasCanales.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasCanales.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasCanales=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasCanales.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasCanales.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasCanales.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasCanales = new JLabelMe();
		
		this.jLabelAccionesVentasCanales.setText("Acciones");		
		this.jLabelAccionesVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasCanales = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasCanales.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasCanales.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasCanales = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasCanales.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasCanales.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasCanales = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasCanales.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasCanales.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasCanales = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasCanales.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasCanales.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasCanales = new JButtonMe();
		//this.jButtonAnterioresVentasCanales.setText("<<");
        this.jButtonAnterioresVentasCanales.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasCanales,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasCanales = new JButtonMe();
		//this.jButtonSiguientesVentasCanales.setText(">>");
        this.jButtonSiguientesVentasCanales.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasCanales,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasCanales = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasCanales.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasCanales.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasCanales,"nuevoguardarcambios_button","Nue",this.ventascanalesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasCanales";
		inputMap = this.jButtonNuevoGuardarCambiosVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasCanales"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasCanales";
		inputMap = this.jButtonRecargarInformacionVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasCanales"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasCanales";
		inputMap = this.jButtonSiguientesVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasCanales"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasCanales";
		inputMap = this.jButtonAnterioresVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasCanales"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasCanales();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasCanales.setMinimumSize(new Dimension(this.getWidth(),VentasCanalesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasCanalesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasCanales.setMaximumSize(new Dimension(this.getWidth(),VentasCanalesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasCanalesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasCanales.setPreferredSize(new Dimension(this.getWidth(),VentasCanalesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasCanalesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasCanales = new GridBagLayout();

			this.jPanelPaginacionVentasCanales.setLayout(gridaBagLayoutPaginacionVentasCanales);						
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = 0;
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasCanales.add(this.jButtonAnterioresVentasCanales, this.gridBagConstraintsVentasCanales);
					
						
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasCanales.gridy = 0;
			
			this.jPanelPaginacionVentasCanales.add(this.jButtonNuevoGuardarCambiosVentasCanales, this.gridBagConstraintsVentasCanales);
						
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasCanales.gridy = 0;
			this.jPanelPaginacionVentasCanales.add(this.jButtonSiguientesVentasCanales, this.gridBagConstraintsVentasCanales);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = 1;
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCanales.add(this.jButtonNuevoVentasCanales, this.gridBagConstraintsVentasCanales);
						
			
			
			if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasCanales = new GridBagConstraints();
				this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasCanales.gridy = 1;
				this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasCanales.add(this.jButtonGuardarCambiosTablaVentasCanales, this.gridBagConstraintsVentasCanales);
			}
			
			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = 1;
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCanales.add(this.jButtonDuplicarVentasCanales, this.gridBagConstraintsVentasCanales);
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = 1;
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCanales.add(this.jButtonCopiarVentasCanales, this.gridBagConstraintsVentasCanales);
		
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = 1;
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCanales.add(this.jButtonVerFormVentasCanales, this.gridBagConstraintsVentasCanales);
		
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = 1;
			this.gridBagConstraintsVentasCanales.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasCanales.add(this.jButtonCerrarVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		
		this.jButtonRecargarInformacionVentasCanales.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasCanales.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasCanales.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasCanales.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasCanales.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasCanales.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasCanales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasCanales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasCanales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasCanales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasCanales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasCanales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasCanales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasCanales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasCanales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasCanales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasCanales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasCanales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasCanales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCanales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCanales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasCanales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasCanales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasCanales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasCanales.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasCanales.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasCanales.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasCanales.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasCanales.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasCanales.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasCanales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasCanales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasCanales.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasCanales.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasCanales.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasCanales.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasCanales = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasCanales = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasCanales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasCanales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasCanales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasCanales = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasCanales.setLayout(gridaBagParametrosReportesVentasCanales);
			this.jPanelParametrosReportesAccionesVentasCanales.setLayout(gridaBagParametrosReportesAccionesVentasCanales);
			
			
			this.jPanelParametrosAuxiliar1VentasCanales.setLayout(gridaBagParametrosAuxiliar1VentasCanales);
			this.jPanelParametrosAuxiliar2VentasCanales.setLayout(gridaBagParametrosAuxiliar2VentasCanales);
			this.jPanelParametrosAuxiliar3VentasCanales.setLayout(gridaBagParametrosAuxiliar3VentasCanales);
			this.jPanelParametrosAuxiliar4VentasCanales.setLayout(gridaBagParametrosAuxiliar4VentasCanales);
			//this.jPanelParametrosAuxiliar5VentasCanales.setLayout(gridaBagParametrosAuxiliar2VentasCanales);			
			
			
			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasCanales.add(this.jButtonRecargarInformacionVentasCanales, this.gridBagConstraintsVentasCanales);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasCanales.add(this.jComboBoxTiposPaginacionVentasCanales, this.gridBagConstraintsVentasCanales);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasCanales.add(this.jCheckBoxConAltoMaximoTablaVentasCanales, this.gridBagConstraintsVentasCanales);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasCanales.add(this.jComboBoxTiposArchivosReportesVentasCanales, this.gridBagConstraintsVentasCanales);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCanales.add(this.jPanelParametrosAuxiliar1VentasCanales, this.gridBagConstraintsVentasCanales);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasCanales.add(this.jComboBoxTiposReportesVentasCanales, this.gridBagConstraintsVentasCanales);																		
			
			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasCanales.add(this.jComboBoxTiposGraficosReportesVentasCanales, this.gridBagConstraintsVentasCanales);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCanales.add(this.jPanelParametrosAuxiliar4VentasCanales, this.gridBagConstraintsVentasCanales);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCanales.add(this.jComboBoxTiposReportesVentasCanales, this.gridBagConstraintsVentasCanales);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCanales.add(this.jCheckBoxGenerarReporteVentasCanales, this.gridBagConstraintsVentasCanales);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCanales.add(this.jPanelParametrosAuxiliar2VentasCanales, this.gridBagConstraintsVentasCanales);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCanales.add(this.jLabelAccionesVentasCanales, this.gridBagConstraintsVentasCanales);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasCanales = new GridBagConstraints();
				this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasCanales.add(this.jButtonAbrirOrderByVentasCanales, this.gridBagConstraintsVentasCanales);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasCanales.add(this.jComboBoxTiposSeleccionarVentasCanales, this.gridBagConstraintsVentasCanales);			
			
			
			/*
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCanales.add(this.jCheckBoxSeleccionarTodosVentasCanales, this.gridBagConstraintsVentasCanales);
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCanales.add(this.jCheckBoxConGraficoReporteVentasCanales, this.gridBagConstraintsVentasCanales);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasCanales.add(this.jCheckBoxSeleccionarTodosVentasCanales, this.gridBagConstraintsVentasCanales);															
				
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasCanales.add(this.jCheckBoxSeleccionadosVentasCanales, this.gridBagConstraintsVentasCanales);															
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCanales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasCanales.add(this.jCheckBoxConGraficoReporteVentasCanales, this.gridBagConstraintsVentasCanales);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCanales.add(this.jPanelParametrosAuxiliar3VentasCanales, this.gridBagConstraintsVentasCanales);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCanales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasCanales.add(this.jComboBoxTiposAccionesVentasCanales, this.gridBagConstraintsVentasCanales);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasCanales = new GridBagLayout();

			this.jScrollPanelDatosVentasCanales.setLayout(gridaBagLayoutDatosVentasCanales);
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = 0;
			this.gridBagConstraintsVentasCanales.gridx = 0;
			
			this.jScrollPanelDatosVentasCanales.add(this.jTableDatosVentasCanales, this.gridBagConstraintsVentasCanales);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasCanales.setViewportView(this.jTableDatosVentasCanales);
		this.jTableDatosVentasCanales.setFillsViewportHeight(true);
		this.jTableDatosVentasCanales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasCanales= new GridBagLayout();
		this.jPanelAccionesVentasCanales.setLayout(gridaBagLayoutAccionesVentasCanales);
		
		
		/*	
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = 0;
		this.gridBagConstraintsVentasCanales.gridx = 0;
			
		this.jPanelAccionesVentasCanales.add(this.jButtonNuevoVentasCanales, this.gridBagConstraintsVentasCanales);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasCanalesVentasCanales= new GridBagLayout();
		gridaBagLayoutBusquedaVentasCanalesVentasCanales.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasCanalesVentasCanales.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasCanalesVentasCanales.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasCanalesVentasCanales.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasCanalesVentasCanales.setLayout(gridaBagLayoutBusquedaVentasCanalesVentasCanales);

		gridBagConstraintsVentasCanales = new GridBagConstraints();
		gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCanales.gridy = 0;
		gridBagConstraintsVentasCanales.gridx = 0;
		jPanelBusquedaVentasCanalesVentasCanales.add(jLabelid_titulo_clienteBusquedaVentasCanalesVentasCanales, gridBagConstraintsVentasCanales);

		gridBagConstraintsVentasCanales = new GridBagConstraints();
		gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCanales.gridy = 0;
		gridBagConstraintsVentasCanales.gridx = 1;
		jPanelBusquedaVentasCanalesVentasCanales.add(jComboBoxid_titulo_clienteBusquedaVentasCanalesVentasCanales, gridBagConstraintsVentasCanales);


		gridBagConstraintsVentasCanales = new GridBagConstraints();
		gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCanales.gridy = 1;
		gridBagConstraintsVentasCanales.gridx = 0;
		jPanelBusquedaVentasCanalesVentasCanales.add(jLabelfecha_emision_desdeBusquedaVentasCanalesVentasCanales, gridBagConstraintsVentasCanales);

		gridBagConstraintsVentasCanales = new GridBagConstraints();
		gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCanales.gridy = 1;
		gridBagConstraintsVentasCanales.gridx = 1;
		jPanelBusquedaVentasCanalesVentasCanales.add(jDateChooserfecha_emision_desdeBusquedaVentasCanalesVentasCanales, gridBagConstraintsVentasCanales);


		gridBagConstraintsVentasCanales = new GridBagConstraints();
		gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCanales.gridy = 2;
		gridBagConstraintsVentasCanales.gridx = 0;
		jPanelBusquedaVentasCanalesVentasCanales.add(jLabelfecha_emision_hastaBusquedaVentasCanalesVentasCanales, gridBagConstraintsVentasCanales);

		gridBagConstraintsVentasCanales = new GridBagConstraints();
		gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCanales.gridy = 2;
		gridBagConstraintsVentasCanales.gridx = 1;
		jPanelBusquedaVentasCanalesVentasCanales.add(jDateChooserfecha_emision_hastaBusquedaVentasCanalesVentasCanales, gridBagConstraintsVentasCanales);

		gridBagConstraintsVentasCanales = new GridBagConstraints();
		gridBagConstraintsVentasCanales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCanales.gridy = 3;
		gridBagConstraintsVentasCanales.gridx =1;
		jPanelBusquedaVentasCanalesVentasCanales.add(jButtonBusquedaVentasCanalesVentasCanales, gridBagConstraintsVentasCanales);

		jTabbedPaneBusquedasVentasCanales.addTab("1.-Por Titulo Cliente Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasCanalesVentasCanales);
		jTabbedPaneBusquedasVentasCanales.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasCanales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasCanales);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventascanalesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();						
			this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasCanales.gridx = 0;		
			//this.gridBagConstraintsVentasCanales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasCanales.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasCanales, this.gridBagConstraintsVentasCanales);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasCanales.gridx = 0;		
		//this.gridBagConstraintsVentasCanales.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasCanales.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasCanales);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasCanales.gridx = 0;		
			this.gridBagConstraintsVentasCanales.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasCanales.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasCanales, this.gridBagConstraintsVentasCanales);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasCanales, this.gridBagConstraintsVentasCanales);								
		
		
		/*
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasCanales, this.gridBagConstraintsVentasCanales);
		*/		
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasCanales.gridx =0;
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasCanales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasCanales, this.gridBagConstraintsVentasCanales);
				
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasCanales, this.gridBagConstraintsVentasCanales);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasCanalesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasCanales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasCanales = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasCanales.setLayout(gridaBagLayoutBusquedasParametrosVentasCanales);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasCanales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasCanales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCanales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCanales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasCanales, this.gridBagConstraintsVentasCanales);
			
			
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasCanales, this.gridBagConstraintsVentasCanales);
		
			
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasCanales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasCanales, this.gridBagConstraintsVentasCanales);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasCanales;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasCanales() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasCanales = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasCanales.setName("jPanelReporteDinamicoVentasCanales"); 
		
		this.jPanelReporteDinamicoVentasCanales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasCanales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasCanales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasCanales.setLayout(gridaBagLayoutReporteDinamicoVentasCanales);
		
		
		this.jInternalFrameReporteDinamicoVentasCanales= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasCanales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasCanales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasCanales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasCanales.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasCanales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasCanales.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasCanales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasCanales.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasCanales.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasCanales.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasCanales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasCanales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasCanales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Canaleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasCanales = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasCanales.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelColumnasSelectReporteVentasCanales, this.gridBagConstraintsVentasCanales);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasCanales = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasCanales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasCanales.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasCanales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasCanales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasCanales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasCanales=new JScrollPane(this.jListColumnasSelectReporteVentasCanales);
			
			this.jScrollColumnasSelectReporteVentasCanales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasCanales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasCanales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasCanales.add(this.jListColumnasSelectReporteVentasCanales, this.gridBagConstraintsVentasCanales);
		this.jPanelReporteDinamicoVentasCanales.add(this.jScrollColumnasSelectReporteVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasCanales = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasCanales.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasCanales = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasCanales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasCanales.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasCanales.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasCanales.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasCanales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasCanales=new JScrollPane(this.jListRelacionesSelectReporteVentasCanales);
			
			this.jScrollRelacionesSelectReporteVentasCanales.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasCanales.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasCanales.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasCanales = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasCanales = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasCanales = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasCanales = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasCanales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasCanales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasCanales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasCanales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasCanales = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasCanales.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasCanales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasCanales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasCanales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasCanales = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasCanales.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelConGraficoDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasCanales = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasCanales.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasCanales.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasCanales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasCanales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasCanales.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCanales.add(this.jCheckBoxConGraficoDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasCanales = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasCanales.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelColumnaCategoriaGraficoVentasCanales, this.gridBagConstraintsVentasCanales);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasCanales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasCanales.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasCanales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasCanales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasCanales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasCanales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasCanales.add(this.jComboBoxColumnaCategoriaGraficoVentasCanales, this.gridBagConstraintsVentasCanales);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasCanales = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasCanales.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelColumnaCategoriaValorVentasCanales, this.gridBagConstraintsVentasCanales);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasCanales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasCanales.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasCanales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasCanales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasCanales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasCanales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasCanales.add(this.jComboBoxColumnaCategoriaValorVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasCanales = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasCanales.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelColumnasValoresGraficoVentasCanales, this.gridBagConstraintsVentasCanales);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasCanales = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasCanales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasCanales.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasCanales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasCanales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasCanales.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasCanales=new JScrollPane(this.jListColumnasValoresGraficoVentasCanales);
			
			this.jScrollColumnasValoresGraficoVentasCanales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasCanales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasCanales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasCanales.add(this.jListColumnasSelectReporteVentasCanales, this.gridBagConstraintsVentasCanales);
		this.jPanelReporteDinamicoVentasCanales.add(this.jScrollColumnasValoresGraficoVentasCanales, this.gridBagConstraintsVentasCanales);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasCanales = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasCanales.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelTiposGraficosReportesDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasCanales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasCanales.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasCanales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasCanales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasCanales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasCanales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCanales.add(this.jComboBoxTiposGraficosReportesDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasCanales = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasCanales.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelGenerarExcelReporteDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasCanales = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasCanales.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasCanales,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasCanales.setToolTipText("Generar EXCEL"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		//this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasCanales.add(this.jButtonGenerarExcelReporteDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCanales.add(this.jComboBoxTiposReportesDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasCanales = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasCanales.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCanales.add(this.jLabelTiposArchivoReporteDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCanales.add(this.jComboBoxTiposArchivosReportesDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasCanales = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasCanales.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasCanales,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasCanales.setToolTipText("Generar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCanales.add(this.jButtonGenerarReporteDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasCanales = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasCanales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasCanales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasCanales.setToolTipText("Cancelar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCanales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCanales.add(this.jButtonCerrarReporteDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasCanales = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasCanales= new JScrollPane(jPanelReporteDinamicoVentasCanales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasCanales.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasCanales.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasCanales.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Canaleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasCanales.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasCanales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasCanales.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasCanales);
		this.jInternalFrameReporteDinamicoVentasCanales.getContentPane().add(this.jScrollPanelReporteDinamicoVentasCanales, this.gridBagConstraintsVentasCanales);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasCanales() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasCanales = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasCanales.setName("jPanelImportacionVentasCanales"); 
		
		this.jPanelImportacionVentasCanales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasCanales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasCanales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasCanales.setLayout(gridaBagLayoutImportacionVentasCanales);
		
		
		this.jInternalFrameImportacionVentasCanales= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasCanales= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasCanales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasCanales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasCanales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasCanales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasCanales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasCanales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasCanales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasCanales.setResizable(true);
	    this.jInternalFrameImportacionVentasCanales.setClosable(true);
	    this.jInternalFrameImportacionVentasCanales.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasCanales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasCanales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasCanales.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasCanales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasCanales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasCanales.setResizable(true);
	    this.jInternalFrameImportacionVentasCanales.setClosable(true);
	    this.jInternalFrameImportacionVentasCanales.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasCanales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasCanales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasCanales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Canaleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasCanales = new JLabelMe();

		this.jLabelArchivoImportacionVentasCanales.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasCanales.add(this.jLabelArchivoImportacionVentasCanales, this.gridBagConstraintsVentasCanales);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasCanales = new JFileChooser();		
		this.jFileChooserImportacionVentasCanales.setToolTipText("ESCOGER ARCHIVO"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasCanales = new JButtonMe();
		this.jButtonAbrirImportacionVentasCanales.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasCanales,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasCanales.setToolTipText("Generar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCanales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCanales.add(this.jButtonAbrirImportacionVentasCanales, this.gridBagConstraintsVentasCanales);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasCanales = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasCanales.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasCanales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasCanales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasCanales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasCanales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasCanales.add(this.jLabelPathArchivoImportacionVentasCanales, this.gridBagConstraintsVentasCanales);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasCanales=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasCanales.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasCanales.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasCanales.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCanales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCanales.add(this.jTextFieldPathArchivoImportacionVentasCanales, this.gridBagConstraintsVentasCanales);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasCanales = new JButtonMe();
		this.jButtonGenerarImportacionVentasCanales.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasCanales,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasCanales.setToolTipText("Generar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCanales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCanales.add(this.jButtonGenerarImportacionVentasCanales, this.gridBagConstraintsVentasCanales);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasCanales = new JButtonMe();
		this.jButtonCerrarImportacionVentasCanales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasCanales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasCanales.setToolTipText("Cancelar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCanales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCanales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCanales.add(this.jButtonCerrarImportacionVentasCanales, this.gridBagConstraintsVentasCanales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasCanales = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasCanales= new JScrollPane(jPanelImportacionVentasCanales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasCanales = new GridBagConstraints();
		this.gridBagConstraintsVentasCanales.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasCanales.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasCanales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasCanales.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasCanales);
		this.jInternalFrameImportacionVentasCanales.getContentPane().add(this.jScrollPanelImportacionVentasCanales, this.gridBagConstraintsVentasCanales);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasCanales(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasCanales = new JButtonMe();
			this.jButtonAbrirOrderByVentasCanales.setText("Orden");
			this.jButtonAbrirOrderByVentasCanales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasCanales,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasCanales";
			inputMap = this.jButtonAbrirOrderByVentasCanales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasCanales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasCanales"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasCanales = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasCanales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasCanales.setName("jPanelOrderByVentasCanales"); 
			
			this.jPanelOrderByVentasCanales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasCanales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasCanales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasCanales.setLayout(gridaBagLayoutOrderByVentasCanales);
			
			
			this.jTableDatosVentasCanalesOrderBy = new JTableMe();        
			this.jTableDatosVentasCanalesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasCanalesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasCanalesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasCanalesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasCanalesOrderBy.setViewportView(this.jTableDatosVentasCanalesOrderBy);
			this.jTableDatosVentasCanalesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasCanalesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasCanales= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasCanales= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasCanales = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasCanales= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasCanales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasCanales.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasCanales.setTitle("Orden");
			this.jInternalFrameOrderByVentasCanales.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasCanales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasCanales.setResizable(true);
			this.jInternalFrameOrderByVentasCanales.setClosable(true);
			this.jInternalFrameOrderByVentasCanales.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasCanales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasCanales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasCanales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasCanales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Canaleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasCanales.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasCanales.ipady =150;
				
			this.jPanelOrderByVentasCanales.add(jScrollPanelDatosVentasCanalesOrderBy, this.gridBagConstraintsVentasCanales);//this.jTableDatosVentasCanalesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasCanales = new JButtonMe();
			this.jButtonCerrarOrderByVentasCanales.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasCanales,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasCanales.setToolTipText("Cancelar"+" "+VentasCanalesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasCanales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCanales.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasCanales.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasCanales.add(this.jButtonCerrarOrderByVentasCanales, this.gridBagConstraintsVentasCanales);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasCanales = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasCanales= new JScrollPane(jPanelOrderByVentasCanales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasCanales = new GridBagConstraints();
			this.gridBagConstraintsVentasCanales.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasCanales.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasCanales.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasCanales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasCanales.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasCanales);
			
			this.jInternalFrameOrderByVentasCanales.getContentPane().add(this.jScrollPanelOrderByVentasCanales, this.gridBagConstraintsVentasCanales);			
		
		} else {
			this.jButtonAbrirOrderByVentasCanales = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventascanalesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasCanales.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasCanales.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasCanales.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasCanales.getRowHeight();//VentasCanalesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasCanalesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasCanales.isSelected()) {
					iHeightTable=VentasCanalesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasCanalesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasCanalesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasCanalesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasCanales.isSelected()) {
					iHeightTable=VentasCanalesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasCanalesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasCanalesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasCanales.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasCanales.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasCanales.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasCanales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasCanales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasCanales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasCanales!=null && this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy()!=null) {
			//if(!this.ventascanalesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasCanales.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasCanales.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasCanales.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasCanales.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasCanales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasCanales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasCanales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventascanalesLogic.getVentasCanaless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventascanaless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasCanales> TraerVentasCanalesBeans(List<VentasCanales> ventascanaless,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasCanales ventascanales:ventascanaless) {
					
				if(!(VentasCanalesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasCanalesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventascanales.setsDetalleGeneralEntityReporte(VentasCanalesConstantesFunciones.getVentasCanalesDescripcion(ventascanales));
										
						
					
						
					
				} else  {
							
					//ventascanales.setsDetalleGeneralEntityReporte(ventascanales.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventascanalesbeans.add(ventascanalesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventascanaless;
    }
	//PARA REPORTES FIN
}
