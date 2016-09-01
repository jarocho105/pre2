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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.report.VentasResumidosConstantesFunciones;

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
public class VentasResumidosJInternalFrame extends VentasResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasResumidos;
	
	protected JMenuBar jmenuBarVentasResumidos;
	
	protected JMenu jmenuVentasResumidos;
	protected JMenu jmenuDatosVentasResumidos;
	protected JMenu jmenuArchivoVentasResumidos;
	protected JMenu jmenuAccionesVentasResumidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasResumidos;	
	protected GridBagConstraints gridBagConstraintsVentasResumidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasResumidosDetalleFormJInternalFrame jInternalFrameDetalleFormVentasResumidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasResumidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasResumidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public VentasResumidosSessionBean ventasresumidosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasResumidos> ventasresumidoss;		
	public List<VentasResumidos> ventasresumidossEliminados;	
	public List<VentasResumidos> ventasresumidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasResumidos;		
	protected JButton jButtonAbrirOrderByVentasResumidos;
	
	
	//protected JPanel jPanelOrderByVentasResumidos;
	//public JScrollPane jScrollPanelOrderByVentasResumidos;	
	//protected JButton jButtonCerrarOrderByVentasResumidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasResumidosLogic ventasresumidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasResumidos;
	public JScrollPane jScrollPanelDatosEdicionVentasResumidos;
	public JScrollPane jScrollPanelDatosGeneralVentasResumidos;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasResumidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasResumidos;
	//public JScrollPane jScrollPanelImportacionVentasResumidos;
	
	
	
	protected JPanel jPanelAccionesVentasResumidos;
	
    protected JPanel jPanelPaginacionVentasResumidos;
    protected JPanel jPanelParametrosReportesVentasResumidos;
	protected JPanel jPanelParametrosReportesAccionesVentasResumidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasResumidos;
	protected JPanel jPanelParametrosAuxiliar2VentasResumidos;
	protected JPanel jPanelParametrosAuxiliar3VentasResumidos;
	protected JPanel jPanelParametrosAuxiliar4VentasResumidos;
	//protected JPanel jPanelParametrosAuxiliar5VentasResumidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasResumidos;
	//protected JPanel jPanelImportacionVentasResumidos;
	
	
	public JTable jTableDatosVentasResumidos;
	
	
	
	//public JTable jTableDatosVentasResumidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasResumidos;
	protected JButton jButtonDuplicarVentasResumidos;
	protected JButton jButtonCopiarVentasResumidos;
	protected JButton jButtonVerFormVentasResumidos;
	protected JButton jButtonNuevoRelacionesVentasResumidos;
	protected JButton jButtonModificarVentasResumidos;
	
    protected JButton jButtonGuardarCambiosTablaVentasResumidos;
	protected JButton jButtonCerrarVentasResumidos;
	
	
	protected JButton jButtonRecargarInformacionVentasResumidos;
	protected JButton jButtonProcesarInformacionVentasResumidos;
	
	
	protected JButton jButtonAnterioresVentasResumidos;
	protected JButton jButtonSiguientesVentasResumidos;
	protected JButton jButtonNuevoGuardarCambiosVentasResumidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasResumidos;
	//protected JButton jButtonCerrarReporteDinamicoVentasResumidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasResumidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasResumidos;
	//protected JButton jButtonGenerarImportacionVentasResumidos;
	//protected JButton jButtonCerrarImportacionVentasResumidos;
	//protected JFileChooser jFileChooserImportacionVentasResumidos;
	//protected File fileImportacionVentasResumidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasResumidos;
	protected JButton jButtonDuplicarToolBarVentasResumidos;
	protected JButton jButtonNuevoRelacionesToolBarVentasResumidos;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasResumidos;
	protected JButton jButtonCopiarToolBarVentasResumidos;
	protected JButton jButtonVerFormToolBarVentasResumidos;
	public JButton jButtonGuardarCambiosTablaToolBarVentasResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasResumidos;
	protected JButton jButtonCerrarToolBarVentasResumidos;
	
	protected JButton jButtonRecargarInformacionToolBarVentasResumidos;
	protected JButton jButtonProcesarInformacionToolBarVentasResumidos;
	protected JButton jButtonAnterioresToolBarVentasResumidos;
	protected JButton jButtonSiguientesToolBarVentasResumidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasResumidos;
	protected JButton jButtonAbrirOrderByToolBarVentasResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasResumidos;
	protected JMenuItem jMenuItemDuplicarVentasResumidos;
	protected JMenuItem jMenuItemNuevoRelacionesVentasResumidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasResumidos;
	protected JMenuItem jMenuItemCopiarVentasResumidos;
	protected JMenuItem jMenuItemVerFormVentasResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasResumidos;
	protected JMenuItem jMenuItemCerrarVentasResumidos;
	protected JMenuItem jMenuItemDetalleCerrarVentasResumidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasResumidos;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasResumidos;
	protected JMenuItem jMenuItemProcesarInformacionVentasResumidos;
	protected JMenuItem jMenuItemAnterioresVentasResumidos;
	protected JMenuItem jMenuItemSiguientesVentasResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasResumidos;
	protected JMenuItem jMenuItemAbrirOrderByVentasResumidos;
	protected JMenuItem jMenuItemMostrarOcultarVentasResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasResumidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasResumidos;
	protected JCheckBox jCheckBoxSeleccionadosVentasResumidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasResumidos;
	protected JCheckBox jCheckBoxConGraficoReporteVentasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasResumidos;
	protected JTextField jTextFieldValorCampoGeneralVentasResumidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasResumidos;
	//public JList<Reporte> jListColumnasSelectReporteVentasResumidos;
	//public JScrollPane jScrollColumnasSelectReporteVentasResumidos;
	
	//public JLabel jLabelRelacionesSelectReporteVentasResumidos;
	//public JList<Reporte> jListRelacionesSelectReporteVentasResumidos;
	//public JScrollPane jScrollRelacionesSelectReporteVentasResumidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasResumidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasResumidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasResumidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasResumidos;
	
		
	//public JLabel jLabelArchivoImportacionVentasResumidos;	
	//public JLabel jLabelPathArchivoImportacionVentasResumidos;
	//protected JTextField jTextFieldPathArchivoImportacionVentasResumidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasResumidos;
	
	//public JLabel jLabelColumnaCategoriaValorVentasResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasResumidos;
	
	//public JLabel jLabelColumnasValoresGraficoVentasResumidos;
	//public JList<Reporte> jListColumnasValoresGraficoVentasResumidos;
	//public JScrollPane jScrollColumnasValoresGraficoVentasResumidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasResumidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasResumidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasResumidos;
	public JPanel jPanelBusquedaVentasResumidosVentasResumidos;
	public JButton jButtonBusquedaVentasResumidosVentasResumidos;
	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos;
	public JButton jButtonfecha_emision_desdeBusquedaVentasResumidosVentasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos;
	public JButton jButtonfecha_emision_hastaBusquedaVentasResumidosVentasResumidosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VentasResumidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasResumidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasResumidos)	{
		this.jButtonRecargarInformacionVentasResumidos = jButtonRecargarInformacionVentasResumidos;
	}
	
	public JButton getjButtonProcesarInformacionVentasResumidos() {
		return this.jButtonProcesarInformacionVentasResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasResumidos)	{
		this.jButtonProcesarInformacionVentasResumidos = jButtonProcesarInformacionVentasResumidos;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasResumidos() {
		return this.jButtonRecargarInformacionVentasResumidos;
	}
	
	
	public List<VentasResumidos> getventasresumidoss() {
		return this.ventasresumidoss;
	}

	public void setventasresumidoss(List<VentasResumidos> ventasresumidoss) {
		this.ventasresumidoss = ventasresumidoss;
	}
	
	public List<VentasResumidos> getventasresumidossAux() {
		return this.ventasresumidossAux;
	}

	public void setventasresumidossAux(List<VentasResumidos> ventasresumidossAux) {
		this.ventasresumidossAux = ventasresumidossAux;
	}
	
	public List<VentasResumidos> getventasresumidossEliminados() {
		return this.ventasresumidossEliminados;
	}

	public void setVentasResumidossEliminados(List<VentasResumidos> ventasresumidossEliminados) {
		this.ventasresumidossEliminados = ventasresumidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasResumidos() {
		return jComboBoxTiposSeleccionarVentasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasResumidos(
			JComboBox jComboBoxTiposSeleccionarVentasResumidos) {
		this.jComboBoxTiposSeleccionarVentasResumidos = jComboBoxTiposSeleccionarVentasResumidos;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasResumidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasResumidos() {
		return jTextFieldValorCampoGeneralVentasResumidos;
	}

	public void setjTextFieldValorCampoGeneralVentasResumidos(
			JTextField jTextFieldValorCampoGeneralVentasResumidos) {
		this.jTextFieldValorCampoGeneralVentasResumidos = jTextFieldValorCampoGeneralVentasResumidos;
	}

	public void setBorderResaltarValorCampoGeneralVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasResumidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasResumidos() {
		return this.jCheckBoxSeleccionarTodosVentasResumidos;
	}

	public void setjCheckBoxSeleccionarTodosVentasResumidos(
			JCheckBox jCheckBoxSeleccionarTodosVentasResumidos) {
		this.jCheckBoxSeleccionarTodosVentasResumidos = jCheckBoxSeleccionarTodosVentasResumidos;
	}

	public void setBorderResaltarSeleccionarTodosVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasResumidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasResumidos() {
		return this.jCheckBoxSeleccionadosVentasResumidos;
	}

	public void setjCheckBoxSeleccionadosVentasResumidos(
			JCheckBox jCheckBoxSeleccionadosVentasResumidos) {
		this.jCheckBoxSeleccionadosVentasResumidos = jCheckBoxSeleccionadosVentasResumidos;
	}
	
	public void setBorderResaltarSeleccionadosVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasResumidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasResumidos() {
		return this.jComboBoxTiposArchivosReportesVentasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasResumidos(
			JComboBox jComboBoxTiposArchivosReportesVentasResumidos) {
		this.jComboBoxTiposArchivosReportesVentasResumidos = jComboBoxTiposArchivosReportesVentasResumidos;
	}

	public void setBorderResaltarTiposArchivosReportesVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasResumidos() {
		return this.jComboBoxTiposReportesVentasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasResumidos(
			JComboBox jComboBoxTiposReportesVentasResumidos) {
		this.jComboBoxTiposReportesVentasResumidos = jComboBoxTiposReportesVentasResumidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasResumidos() {
	//	return jComboBoxTiposReportesDinamicoVentasResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasResumidos(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasResumidos) {
	//	this.jComboBoxTiposReportesDinamicoVentasResumidos = jComboBoxTiposReportesDinamicoVentasResumidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasResumidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasResumidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasResumidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos = jComboBoxTiposArchivosReportesDinamicoVentasResumidos;
	//}
	
	public void setBorderResaltarTiposReportesVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasResumidos() {
		return this.jComboBoxTiposGraficosReportesVentasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasResumidos(
			JComboBox jComboBoxTiposGraficosReportesVentasResumidos) {
		this.jComboBoxTiposGraficosReportesVentasResumidos = jComboBoxTiposGraficosReportesVentasResumidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasResumidos() {
		return this.jComboBoxTiposPaginacionVentasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasResumidos(
			JComboBox jComboBoxTiposPaginacionVentasResumidos) {
		this.jComboBoxTiposPaginacionVentasResumidos = jComboBoxTiposPaginacionVentasResumidos;
	}
	
	public void setBorderResaltarTiposPaginacionVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasResumidos() {
		return this.jComboBoxTiposRelacionesVentasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasResumidos() {
		return this.jComboBoxTiposAccionesVentasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasResumidos(
			JComboBox jComboBoxTiposRelacionesVentasResumidos) {
		this.jComboBoxTiposRelacionesVentasResumidos = jComboBoxTiposRelacionesVentasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasResumidos(
			JComboBox jComboBoxTiposAccionesVentasResumidos) {
		this.jComboBoxTiposAccionesVentasResumidos = jComboBoxTiposAccionesVentasResumidos;
	}
	
	public void setBorderResaltarTiposRelacionesVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasResumidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasResumidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasResumidos() {
	//	return jCheckBoxConGraficoDinamicoVentasResumidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasResumidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasResumidos) {
	//	this.jCheckBoxConGraficoDinamicoVentasResumidos = jCheckBoxConGraficoDinamicoVentasResumidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasResumidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasResumidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasResumidos .setBorder(borderResaltar);		
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
		this.ventasresumidosSessionBean=new VentasResumidosSessionBean();
		
		this.ventasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasresumidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasResumidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"nuevo","nuevo","Nuevo"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"duplicar","duplicar","Duplicar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"copiar","copiar","Copiar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"ver_form","ver_form","Ver"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"recargar","recargar","Buscar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasResumidos,this.jTtoolBarVentasResumidos,
							"cerrar","cerrar","Salir"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasResumidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasResumidos;
			
				this.jButtonProcesarInformacionToolBarVentasResumidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasResumidos;
				
		//protected JButton jButtonModificarToolBarVentasResumidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasResumidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasResumidos=new JMenuMe("General");
		this.jmenuArchivoVentasResumidos=new JMenuMe("Archivo");
		this.jmenuAccionesVentasResumidos=new JMenuMe("Acciones");
		this.jmenuDatosVentasResumidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasResumidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasResumidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasResumidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasResumidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasResumidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasResumidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasResumidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasResumidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasResumidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasResumidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasResumidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasResumidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasResumidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasResumidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasResumidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasResumidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasResumidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasResumidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasResumidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasResumidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasResumidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasResumidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasResumidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasResumidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasResumidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasResumidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasResumidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasResumidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasResumidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasResumidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasResumidos.add(this.jMenuItemCerrarVentasResumidos);
			
			this.jmenuAccionesVentasResumidos.add(this.jMenuItemNuevoVentasResumidos);
			this.jmenuAccionesVentasResumidos.add(this.jMenuItemNuevoGuardarCambiosVentasResumidos);
			this.jmenuAccionesVentasResumidos.add(this.jMenuItemNuevoRelacionesVentasResumidos);
			this.jmenuAccionesVentasResumidos.add(this.jMenuItemGuardarCambiosTablaVentasResumidos);		
			this.jmenuAccionesVentasResumidos.add(this.jMenuItemDuplicarVentasResumidos);		
			this.jmenuAccionesVentasResumidos.add(this.jMenuItemCopiarVentasResumidos);		
			this.jmenuAccionesVentasResumidos.add(this.jMenuItemVerFormVentasResumidos);		
			
			this.jmenuDatosVentasResumidos.add(this.jMenuItemRecargarInformacionVentasResumidos);				
			this.jmenuDatosVentasResumidos.add(this.jMenuItemAnterioresVentasResumidos);				
			this.jmenuDatosVentasResumidos.add(this.jMenuItemSiguientesVentasResumidos);				
			this.jmenuDatosVentasResumidos.add(this.jMenuItemAbrirOrderByVentasResumidos);				
			this.jmenuDatosVentasResumidos.add(this.jMenuItemMostrarOcultarVentasResumidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasResumidos.add(this.jMenuItemGuardarCambiosVentasResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasResumidos.add(this.jmenuArchivoVentasResumidos);		
			this.jmenuBarVentasResumidos.add(this.jmenuAccionesVentasResumidos);		
			this.jmenuBarVentasResumidos.add(this.jmenuDatosVentasResumidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasResumidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasResumidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasResumidosVentasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasResumidosVentasResumidos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasResumidosVentasResumidos= new JButtonMe();
		this.jButtonBusquedaVentasResumidosVentasResumidos.setText("Buscar");
		this.jButtonBusquedaVentasResumidosVentasResumidos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasResumidosVentasResumidos,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasResumidosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasResumidos=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasResumidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasResumidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasResumidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasResumidos = new VentasResumidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Resumidos DATOS");
			this.jInternalFrameDetalleFormVentasResumidos = new VentasResumidosDetalleFormJInternalFrame(jDesktopPane,this.ventasresumidosSessionBean.getConGuardarRelaciones(),this.ventasresumidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasResumidos = null;//new VentasResumidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasResumidos= new GridBagLayout();
		
		
		this.jTableDatosVentasResumidos = new JTableMe();      
		
		String sToolTipVentasResumidos="";
		sToolTipVentasResumidos=VentasResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasResumidos+="(Facturacion.VentasResumidos)";
		}
		
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasResumidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasResumidos.setToolTipText(sToolTipVentasResumidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasResumidos);
		this.jTableDatosVentasResumidos.setAutoCreateRowSorter(true);
		this.jTableDatosVentasResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasResumidos.setRowSelectionAllowed(true);
		this.jTableDatosVentasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasResumidos = new JButtonMe();
		this.jButtonDuplicarVentasResumidos = new JButtonMe();
		this.jButtonCopiarVentasResumidos = new JButtonMe();
		this.jButtonVerFormVentasResumidos = new JButtonMe();
		this.jButtonNuevoRelacionesVentasResumidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasResumidos = new JButtonMe();
		this.jButtonCerrarVentasResumidos = new JButtonMe();
		
		this.jScrollPanelDatosVentasResumidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasResumidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Resumidos";
		
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesVentasResumidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasResumidos=new ReporteDinamicoJInternalFrame(VentasResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasResumidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasResumidos=new ImportacionJInternalFrame(VentasResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasResumidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasResumidos = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasResumidos.setText("Orden");
		this.jButtonAbrirOrderByVentasResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasResumidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidos,false,this);
			
			//this.cargarOrderByVentasResumidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasResumidos,true,this);
			
			//this.cargarOrderByVentasResumidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasResumidos.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosVentasResumidos.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosVentasResumidos.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosVentasResumidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasResumidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasResumidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasResumidos.setText("Nuevo");
		this.jButtonDuplicarVentasResumidos.setText("Duplicar");
		this.jButtonCopiarVentasResumidos.setText("Copiar");
		this.jButtonVerFormVentasResumidos.setText("Ver");
		this.jButtonNuevoRelacionesVentasResumidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasResumidos.setText("Guardar");
		this.jButtonCerrarVentasResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasResumidos,"nuevo_button","Nuevo",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasResumidos,"duplicar_button","Duplicar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasResumidos,"copiar_button","Copiar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasResumidos,"ver_form","Ver",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasResumidos,"nuevorelaciones_button","Nuevo Rel",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasResumidos,"guardarcambiostabla_button","Guardar",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasResumidos,"cerrar_button","Salir",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasResumidos.setToolTipText("Nuevo"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasResumidos.setToolTipText("Duplicar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasResumidos.setToolTipText("Copiar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasResumidos.setToolTipText("Ver"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasResumidos.setToolTipText("Nuevo Rel"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasResumidos.setToolTipText("Guardar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasResumidos.setToolTipText("Salir"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasResumidos";
		inputMap = this.jButtonNuevoVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasResumidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasResumidos";
		inputMap = this.jButtonDuplicarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasResumidos"));
		
		//COPIAR
		sMapKey = "CopiarVentasResumidos";
		inputMap = this.jButtonCopiarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasResumidos"));
		
		//VEr FORM
		sMapKey = "VerFormVentasResumidos";
		inputMap = this.jButtonVerFormVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasResumidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasResumidos";
		inputMap = this.jButtonNuevoRelacionesVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasResumidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasResumidos";
		inputMap = this.jButtonModificarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasResumidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasResumidos";
		inputMap = this.jButtonCerrarVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasResumidos";
		inputMap = this.jButtonGuardarCambiosTablaVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasResumidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasResumidos.setName("jPanelParametrosReportesVentasResumidos"); 
		
		this.jPanelParametrosReportesAccionesVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasResumidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasResumidos.setName("jPanelParametrosReportesAccionesVentasResumidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasResumidos = new JButtonMe();
		this.jButtonRecargarInformacionVentasResumidos.setText("Buscar");
		this.jButtonRecargarInformacionVentasResumidos.setToolTipText("Buscar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasResumidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasResumidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasResumidos = new JButtonMe();
		this.jButtonProcesarInformacionVentasResumidos.setText("Procesar");
		this.jButtonProcesarInformacionVentasResumidos.setToolTipText("Procesar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasResumidos.setVisible(false);
			
		this.jButtonProcesarInformacionVentasResumidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasResumidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasResumidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasResumidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidos.setText("TIPO");       
		this.jComboBoxTiposReportesVentasResumidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasResumidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasResumidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasResumidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasResumidos.setText("Accion");
		this.jComboBoxTiposRelacionesVentasResumidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasResumidos.setText("Accion");
		this.jComboBoxTiposAccionesVentasResumidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasResumidos.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasResumidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasResumidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasResumidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasResumidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasResumidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasResumidos = new JLabelMe();
		
		this.jLabelAccionesVentasResumidos.setText("Acciones");		
		this.jLabelAccionesVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasResumidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasResumidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasResumidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasResumidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasResumidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasResumidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasResumidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasResumidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasResumidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasResumidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasResumidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasResumidos = new JButtonMe();
		//this.jButtonAnterioresVentasResumidos.setText("<<");
        this.jButtonAnterioresVentasResumidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasResumidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasResumidos = new JButtonMe();
		//this.jButtonSiguientesVentasResumidos.setText(">>");
        this.jButtonSiguientesVentasResumidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasResumidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasResumidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasResumidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasResumidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasResumidos,"nuevoguardarcambios_button","Nue",this.ventasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasResumidos";
		inputMap = this.jButtonNuevoGuardarCambiosVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasResumidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasResumidos";
		inputMap = this.jButtonRecargarInformacionVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasResumidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasResumidos";
		inputMap = this.jButtonSiguientesVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasResumidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasResumidos";
		inputMap = this.jButtonAnterioresVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasResumidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasResumidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasResumidos.setMinimumSize(new Dimension(this.getWidth(),VentasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasResumidos.setMaximumSize(new Dimension(this.getWidth(),VentasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasResumidos.setPreferredSize(new Dimension(this.getWidth(),VentasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasResumidos = new GridBagLayout();

			this.jPanelPaginacionVentasResumidos.setLayout(gridaBagLayoutPaginacionVentasResumidos);						
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = 0;
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasResumidos.add(this.jButtonAnterioresVentasResumidos, this.gridBagConstraintsVentasResumidos);
					
						
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasResumidos.gridy = 0;
			
			this.jPanelPaginacionVentasResumidos.add(this.jButtonNuevoGuardarCambiosVentasResumidos, this.gridBagConstraintsVentasResumidos);
						
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasResumidos.gridy = 0;
			this.jPanelPaginacionVentasResumidos.add(this.jButtonSiguientesVentasResumidos, this.gridBagConstraintsVentasResumidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = 1;
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidos.add(this.jButtonNuevoVentasResumidos, this.gridBagConstraintsVentasResumidos);
						
			
			
			if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasResumidos.gridy = 1;
				this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasResumidos.add(this.jButtonGuardarCambiosTablaVentasResumidos, this.gridBagConstraintsVentasResumidos);
			}
			
			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = 1;
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidos.add(this.jButtonDuplicarVentasResumidos, this.gridBagConstraintsVentasResumidos);
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = 1;
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidos.add(this.jButtonCopiarVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = 1;
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasResumidos.add(this.jButtonVerFormVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = 1;
			this.gridBagConstraintsVentasResumidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasResumidos.add(this.jButtonCerrarVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		
		this.jButtonRecargarInformacionVentasResumidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasResumidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasResumidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasResumidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasResumidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasResumidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasResumidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasResumidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasResumidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasResumidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasResumidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasResumidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasResumidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasResumidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasResumidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasResumidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasResumidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasResumidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasResumidos.setLayout(gridaBagParametrosReportesVentasResumidos);
			this.jPanelParametrosReportesAccionesVentasResumidos.setLayout(gridaBagParametrosReportesAccionesVentasResumidos);
			
			
			this.jPanelParametrosAuxiliar1VentasResumidos.setLayout(gridaBagParametrosAuxiliar1VentasResumidos);
			this.jPanelParametrosAuxiliar2VentasResumidos.setLayout(gridaBagParametrosAuxiliar2VentasResumidos);
			this.jPanelParametrosAuxiliar3VentasResumidos.setLayout(gridaBagParametrosAuxiliar3VentasResumidos);
			this.jPanelParametrosAuxiliar4VentasResumidos.setLayout(gridaBagParametrosAuxiliar4VentasResumidos);
			//this.jPanelParametrosAuxiliar5VentasResumidos.setLayout(gridaBagParametrosAuxiliar2VentasResumidos);			
			
			
			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidos.add(this.jButtonRecargarInformacionVentasResumidos, this.gridBagConstraintsVentasResumidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidos.add(this.jComboBoxTiposPaginacionVentasResumidos, this.gridBagConstraintsVentasResumidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidos.add(this.jCheckBoxConAltoMaximoTablaVentasResumidos, this.gridBagConstraintsVentasResumidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasResumidos.add(this.jComboBoxTiposArchivosReportesVentasResumidos, this.gridBagConstraintsVentasResumidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidos.add(this.jPanelParametrosAuxiliar1VentasResumidos, this.gridBagConstraintsVentasResumidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasResumidos.add(this.jComboBoxTiposReportesVentasResumidos, this.gridBagConstraintsVentasResumidos);																		
			
			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasResumidos.add(this.jComboBoxTiposGraficosReportesVentasResumidos, this.gridBagConstraintsVentasResumidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidos.add(this.jPanelParametrosAuxiliar4VentasResumidos, this.gridBagConstraintsVentasResumidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidos.add(this.jComboBoxTiposReportesVentasResumidos, this.gridBagConstraintsVentasResumidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidos.add(this.jCheckBoxGenerarReporteVentasResumidos, this.gridBagConstraintsVentasResumidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidos.add(this.jPanelParametrosAuxiliar2VentasResumidos, this.gridBagConstraintsVentasResumidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidos.add(this.jLabelAccionesVentasResumidos, this.gridBagConstraintsVentasResumidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
				this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasResumidos.add(this.jButtonAbrirOrderByVentasResumidos, this.gridBagConstraintsVentasResumidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidos.add(this.jComboBoxTiposSeleccionarVentasResumidos, this.gridBagConstraintsVentasResumidos);			
			
			
			/*
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidos.add(this.jCheckBoxSeleccionarTodosVentasResumidos, this.gridBagConstraintsVentasResumidos);
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasResumidos.add(this.jCheckBoxConGraficoReporteVentasResumidos, this.gridBagConstraintsVentasResumidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidos.add(this.jCheckBoxSeleccionarTodosVentasResumidos, this.gridBagConstraintsVentasResumidos);															
				
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidos.add(this.jCheckBoxSeleccionadosVentasResumidos, this.gridBagConstraintsVentasResumidos);															
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasResumidos.add(this.jCheckBoxConGraficoReporteVentasResumidos, this.gridBagConstraintsVentasResumidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasResumidos.add(this.jPanelParametrosAuxiliar3VentasResumidos, this.gridBagConstraintsVentasResumidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasResumidos.add(this.jComboBoxTiposAccionesVentasResumidos, this.gridBagConstraintsVentasResumidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasResumidos = new GridBagLayout();

			this.jScrollPanelDatosVentasResumidos.setLayout(gridaBagLayoutDatosVentasResumidos);
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = 0;
			this.gridBagConstraintsVentasResumidos.gridx = 0;
			
			this.jScrollPanelDatosVentasResumidos.add(this.jTableDatosVentasResumidos, this.gridBagConstraintsVentasResumidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasResumidos.setViewportView(this.jTableDatosVentasResumidos);
		this.jTableDatosVentasResumidos.setFillsViewportHeight(true);
		this.jTableDatosVentasResumidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasResumidos= new GridBagLayout();
		this.jPanelAccionesVentasResumidos.setLayout(gridaBagLayoutAccionesVentasResumidos);
		
		
		/*	
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = 0;
		this.gridBagConstraintsVentasResumidos.gridx = 0;
			
		this.jPanelAccionesVentasResumidos.add(this.jButtonNuevoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasResumidosVentasResumidos= new GridBagLayout();
		gridaBagLayoutBusquedaVentasResumidosVentasResumidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasResumidosVentasResumidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasResumidosVentasResumidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasResumidosVentasResumidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasResumidosVentasResumidos.setLayout(gridaBagLayoutBusquedaVentasResumidosVentasResumidos);

		gridBagConstraintsVentasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidos.gridy = 0;
		gridBagConstraintsVentasResumidos.gridx = 0;
		jPanelBusquedaVentasResumidosVentasResumidos.add(jLabelfecha_emision_desdeBusquedaVentasResumidosVentasResumidos, gridBagConstraintsVentasResumidos);

		gridBagConstraintsVentasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidos.gridy = 0;
		gridBagConstraintsVentasResumidos.gridx = 1;
		jPanelBusquedaVentasResumidosVentasResumidos.add(jDateChooserfecha_emision_desdeBusquedaVentasResumidosVentasResumidos, gridBagConstraintsVentasResumidos);


		gridBagConstraintsVentasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidos.gridy = 1;
		gridBagConstraintsVentasResumidos.gridx = 0;
		jPanelBusquedaVentasResumidosVentasResumidos.add(jLabelfecha_emision_hastaBusquedaVentasResumidosVentasResumidos, gridBagConstraintsVentasResumidos);

		gridBagConstraintsVentasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidos.gridy = 1;
		gridBagConstraintsVentasResumidos.gridx = 1;
		jPanelBusquedaVentasResumidosVentasResumidos.add(jDateChooserfecha_emision_hastaBusquedaVentasResumidosVentasResumidos, gridBagConstraintsVentasResumidos);

		gridBagConstraintsVentasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasResumidos.gridy = 2;
		gridBagConstraintsVentasResumidos.gridx =1;
		jPanelBusquedaVentasResumidosVentasResumidos.add(jButtonBusquedaVentasResumidosVentasResumidos, gridBagConstraintsVentasResumidos);

		jTabbedPaneBusquedasVentasResumidos.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasResumidosVentasResumidos);
		jTabbedPaneBusquedasVentasResumidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasResumidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();						
			this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidos.gridx = 0;		
			//this.gridBagConstraintsVentasResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasResumidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasResumidos, this.gridBagConstraintsVentasResumidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidos.gridx = 0;		
		//this.gridBagConstraintsVentasResumidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasResumidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasResumidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasResumidos.gridx = 0;		
			this.gridBagConstraintsVentasResumidos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasResumidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasResumidos, this.gridBagConstraintsVentasResumidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasResumidos, this.gridBagConstraintsVentasResumidos);								
		
		
		/*
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasResumidos, this.gridBagConstraintsVentasResumidos);
		*/		
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasResumidos.gridx =0;
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasResumidos, this.gridBagConstraintsVentasResumidos);
				
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasResumidos, this.gridBagConstraintsVentasResumidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasResumidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasResumidos = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasResumidos.setLayout(gridaBagLayoutBusquedasParametrosVentasResumidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasResumidos, this.gridBagConstraintsVentasResumidos);
			
			
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
			
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasResumidos, this.gridBagConstraintsVentasResumidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasResumidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasResumidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasResumidos.setName("jPanelReporteDinamicoVentasResumidos"); 
		
		this.jPanelReporteDinamicoVentasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasResumidos.setLayout(gridaBagLayoutReporteDinamicoVentasResumidos);
		
		
		this.jInternalFrameReporteDinamicoVentasResumidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasResumidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasResumidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasResumidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasResumidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasResumidos = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasResumidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelColumnasSelectReporteVentasResumidos, this.gridBagConstraintsVentasResumidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasResumidos = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasResumidos=new JScrollPane(this.jListColumnasSelectReporteVentasResumidos);
			
			this.jScrollColumnasSelectReporteVentasResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasResumidos.add(this.jListColumnasSelectReporteVentasResumidos, this.gridBagConstraintsVentasResumidos);
		this.jPanelReporteDinamicoVentasResumidos.add(this.jScrollColumnasSelectReporteVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasResumidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasResumidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasResumidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasResumidos=new JScrollPane(this.jListRelacionesSelectReporteVentasResumidos);
			
			this.jScrollRelacionesSelectReporteVentasResumidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasResumidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasResumidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasResumidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasResumidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasResumidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasResumidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasResumidos = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasResumidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelConGraficoDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasResumidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasResumidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasResumidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidos.add(this.jCheckBoxConGraficoDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasResumidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelColumnaCategoriaGraficoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasResumidos.add(this.jComboBoxColumnaCategoriaGraficoVentasResumidos, this.gridBagConstraintsVentasResumidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasResumidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelColumnaCategoriaValorVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasResumidos.add(this.jComboBoxColumnaCategoriaValorVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasResumidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasResumidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelColumnasValoresGraficoVentasResumidos, this.gridBagConstraintsVentasResumidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasResumidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasResumidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasResumidos=new JScrollPane(this.jListColumnasValoresGraficoVentasResumidos);
			
			this.jScrollColumnasValoresGraficoVentasResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasResumidos.add(this.jListColumnasSelectReporteVentasResumidos, this.gridBagConstraintsVentasResumidos);
		this.jPanelReporteDinamicoVentasResumidos.add(this.jScrollColumnasValoresGraficoVentasResumidos, this.gridBagConstraintsVentasResumidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasResumidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasResumidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelTiposGraficosReportesDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasResumidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidos.add(this.jComboBoxTiposGraficosReportesDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasResumidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasResumidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelGenerarExcelReporteDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasResumidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasResumidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasResumidos.setToolTipText("Generar EXCEL"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasResumidos.add(this.jButtonGenerarExcelReporteDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidos.add(this.jComboBoxTiposReportesDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasResumidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasResumidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasResumidos.add(this.jLabelTiposArchivoReporteDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidos.add(this.jComboBoxTiposArchivosReportesDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasResumidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasResumidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasResumidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasResumidos.setToolTipText("Generar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidos.add(this.jButtonGenerarReporteDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasResumidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasResumidos.setToolTipText("Cancelar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasResumidos.add(this.jButtonCerrarReporteDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasResumidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasResumidos= new JScrollPane(jPanelReporteDinamicoVentasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasResumidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasResumidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasResumidos);
		this.jInternalFrameReporteDinamicoVentasResumidos.getContentPane().add(this.jScrollPanelReporteDinamicoVentasResumidos, this.gridBagConstraintsVentasResumidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasResumidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasResumidos.setName("jPanelImportacionVentasResumidos"); 
		
		this.jPanelImportacionVentasResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasResumidos.setLayout(gridaBagLayoutImportacionVentasResumidos);
		
		
		this.jInternalFrameImportacionVentasResumidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasResumidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasResumidos.setResizable(true);
	    this.jInternalFrameImportacionVentasResumidos.setClosable(true);
	    this.jInternalFrameImportacionVentasResumidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasResumidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasResumidos.setResizable(true);
	    this.jInternalFrameImportacionVentasResumidos.setClosable(true);
	    this.jInternalFrameImportacionVentasResumidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasResumidos = new JLabelMe();

		this.jLabelArchivoImportacionVentasResumidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasResumidos.add(this.jLabelArchivoImportacionVentasResumidos, this.gridBagConstraintsVentasResumidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasResumidos = new JFileChooser();		
		this.jFileChooserImportacionVentasResumidos.setToolTipText("ESCOGER ARCHIVO"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasResumidos = new JButtonMe();
		this.jButtonAbrirImportacionVentasResumidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasResumidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasResumidos.setToolTipText("Generar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidos.add(this.jButtonAbrirImportacionVentasResumidos, this.gridBagConstraintsVentasResumidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasResumidos = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasResumidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasResumidos.add(this.jLabelPathArchivoImportacionVentasResumidos, this.gridBagConstraintsVentasResumidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasResumidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasResumidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasResumidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasResumidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidos.add(this.jTextFieldPathArchivoImportacionVentasResumidos, this.gridBagConstraintsVentasResumidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasResumidos = new JButtonMe();
		this.jButtonGenerarImportacionVentasResumidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasResumidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasResumidos.setToolTipText("Generar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidos.add(this.jButtonGenerarImportacionVentasResumidos, this.gridBagConstraintsVentasResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasResumidos = new JButtonMe();
		this.jButtonCerrarImportacionVentasResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasResumidos.setToolTipText("Cancelar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasResumidos.add(this.jButtonCerrarImportacionVentasResumidos, this.gridBagConstraintsVentasResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasResumidos = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasResumidos= new JScrollPane(jPanelImportacionVentasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasResumidos.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasResumidos.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasResumidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasResumidos);
		this.jInternalFrameImportacionVentasResumidos.getContentPane().add(this.jScrollPanelImportacionVentasResumidos, this.gridBagConstraintsVentasResumidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasResumidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasResumidos = new JButtonMe();
			this.jButtonAbrirOrderByVentasResumidos.setText("Orden");
			this.jButtonAbrirOrderByVentasResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasResumidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasResumidos";
			inputMap = this.jButtonAbrirOrderByVentasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasResumidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasResumidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasResumidos.setName("jPanelOrderByVentasResumidos"); 
			
			this.jPanelOrderByVentasResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasResumidos.setLayout(gridaBagLayoutOrderByVentasResumidos);
			
			
			this.jTableDatosVentasResumidosOrderBy = new JTableMe();        
			this.jTableDatosVentasResumidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasResumidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasResumidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasResumidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasResumidosOrderBy.setViewportView(this.jTableDatosVentasResumidosOrderBy);
			this.jTableDatosVentasResumidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasResumidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasResumidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasResumidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasResumidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasResumidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasResumidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasResumidos.setTitle("Orden");
			this.jInternalFrameOrderByVentasResumidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasResumidos.setResizable(true);
			this.jInternalFrameOrderByVentasResumidos.setClosable(true);
			this.jInternalFrameOrderByVentasResumidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Resumidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasResumidos.ipady =150;
				
			this.jPanelOrderByVentasResumidos.add(jScrollPanelDatosVentasResumidosOrderBy, this.gridBagConstraintsVentasResumidos);//this.jTableDatosVentasResumidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasResumidos = new JButtonMe();
			this.jButtonCerrarOrderByVentasResumidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasResumidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasResumidos.setToolTipText("Cancelar"+" "+VentasResumidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasResumidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasResumidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasResumidos.add(this.jButtonCerrarOrderByVentasResumidos, this.gridBagConstraintsVentasResumidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasResumidos = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasResumidos= new JScrollPane(jPanelOrderByVentasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasResumidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasResumidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasResumidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasResumidos);
			
			this.jInternalFrameOrderByVentasResumidos.getContentPane().add(this.jScrollPanelOrderByVentasResumidos, this.gridBagConstraintsVentasResumidos);			
		
		} else {
			this.jButtonAbrirOrderByVentasResumidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventasresumidosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasResumidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasResumidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasResumidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasResumidos.getRowHeight();//VentasResumidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasResumidos.isSelected()) {
					iHeightTable=VentasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasResumidos.isSelected()) {
					iHeightTable=VentasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasResumidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasResumidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasResumidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasResumidos!=null && this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy()!=null) {
			//if(!this.ventasresumidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasResumidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasResumidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasResumidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasResumidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventasresumidosLogic.getVentasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasresumidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasResumidos> TraerVentasResumidosBeans(List<VentasResumidos> ventasresumidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasResumidos ventasresumidos:ventasresumidoss) {
					
				if(!(VentasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventasresumidos.setsDetalleGeneralEntityReporte(VentasResumidosConstantesFunciones.getVentasResumidosDescripcion(ventasresumidos));
										
						
					
						
					
				} else  {
							
					//ventasresumidos.setsDetalleGeneralEntityReporte(ventasresumidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventasresumidosbeans.add(ventasresumidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventasresumidoss;
    }
	//PARA REPORTES FIN
}
