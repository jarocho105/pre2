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
import com.bydan.erp.facturacion.util.report.VentasVentasNoCerradasConstantesFunciones;

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
public class VentasVentasNoCerradasJInternalFrame extends VentasVentasNoCerradasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasVentasNoCerradas;
	
	protected JMenuBar jmenuBarVentasVentasNoCerradas;
	
	protected JMenu jmenuVentasVentasNoCerradas;
	protected JMenu jmenuDatosVentasVentasNoCerradas;
	protected JMenu jmenuArchivoVentasVentasNoCerradas;
	protected JMenu jmenuAccionesVentasVentasNoCerradas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasVentasNoCerradas;	
	protected GridBagConstraints gridBagConstraintsVentasVentasNoCerradas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasVentasNoCerradasDetalleFormJInternalFrame jInternalFrameDetalleFormVentasVentasNoCerradas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasVentasNoCerradas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasVentasNoCerradas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public VentasVentasNoCerradasSessionBean ventasventasnocerradasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasVentasNoCerradas> ventasventasnocerradass;		
	public List<VentasVentasNoCerradas> ventasventasnocerradassEliminados;	
	public List<VentasVentasNoCerradas> ventasventasnocerradassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasVentasNoCerradas;		
	protected JButton jButtonAbrirOrderByVentasVentasNoCerradas;
	
	
	//protected JPanel jPanelOrderByVentasVentasNoCerradas;
	//public JScrollPane jScrollPanelOrderByVentasVentasNoCerradas;	
	//protected JButton jButtonCerrarOrderByVentasVentasNoCerradas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasVentasNoCerradasLogic ventasventasnocerradasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasVentasNoCerradas;
	public JScrollPane jScrollPanelDatosEdicionVentasVentasNoCerradas;
	public JScrollPane jScrollPanelDatosGeneralVentasVentasNoCerradas;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasVentasNoCerradasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasVentasNoCerradas;
	//public JScrollPane jScrollPanelImportacionVentasVentasNoCerradas;
	
	
	
	protected JPanel jPanelAccionesVentasVentasNoCerradas;
	
    protected JPanel jPanelPaginacionVentasVentasNoCerradas;
    protected JPanel jPanelParametrosReportesVentasVentasNoCerradas;
	protected JPanel jPanelParametrosReportesAccionesVentasVentasNoCerradas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasVentasNoCerradas;
	protected JPanel jPanelParametrosAuxiliar2VentasVentasNoCerradas;
	protected JPanel jPanelParametrosAuxiliar3VentasVentasNoCerradas;
	protected JPanel jPanelParametrosAuxiliar4VentasVentasNoCerradas;
	//protected JPanel jPanelParametrosAuxiliar5VentasVentasNoCerradas;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasVentasNoCerradas;
	//protected JPanel jPanelImportacionVentasVentasNoCerradas;
	
	
	public JTable jTableDatosVentasVentasNoCerradas;
	
	
	
	//public JTable jTableDatosVentasVentasNoCerradasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasVentasNoCerradas;
	protected JButton jButtonDuplicarVentasVentasNoCerradas;
	protected JButton jButtonCopiarVentasVentasNoCerradas;
	protected JButton jButtonVerFormVentasVentasNoCerradas;
	protected JButton jButtonNuevoRelacionesVentasVentasNoCerradas;
	protected JButton jButtonModificarVentasVentasNoCerradas;
	
    protected JButton jButtonGuardarCambiosTablaVentasVentasNoCerradas;
	protected JButton jButtonCerrarVentasVentasNoCerradas;
	
	
	protected JButton jButtonRecargarInformacionVentasVentasNoCerradas;
	protected JButton jButtonProcesarInformacionVentasVentasNoCerradas;
	
	
	protected JButton jButtonAnterioresVentasVentasNoCerradas;
	protected JButton jButtonSiguientesVentasVentasNoCerradas;
	protected JButton jButtonNuevoGuardarCambiosVentasVentasNoCerradas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasVentasNoCerradas;
	//protected JButton jButtonCerrarReporteDinamicoVentasVentasNoCerradas;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasVentasNoCerradas;
	//protected JButton jButtonGenerarImportacionVentasVentasNoCerradas;
	//protected JButton jButtonCerrarImportacionVentasVentasNoCerradas;
	//protected JFileChooser jFileChooserImportacionVentasVentasNoCerradas;
	//protected File fileImportacionVentasVentasNoCerradas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasVentasNoCerradas;
	protected JButton jButtonDuplicarToolBarVentasVentasNoCerradas;
	protected JButton jButtonNuevoRelacionesToolBarVentasVentasNoCerradas;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasVentasNoCerradas;
	protected JButton jButtonCopiarToolBarVentasVentasNoCerradas;
	protected JButton jButtonVerFormToolBarVentasVentasNoCerradas;
	public JButton jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasVentasNoCerradas;
	protected JButton jButtonCerrarToolBarVentasVentasNoCerradas;
	
	protected JButton jButtonRecargarInformacionToolBarVentasVentasNoCerradas;
	protected JButton jButtonProcesarInformacionToolBarVentasVentasNoCerradas;
	protected JButton jButtonAnterioresToolBarVentasVentasNoCerradas;
	protected JButton jButtonSiguientesToolBarVentasVentasNoCerradas;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasVentasNoCerradas;
	protected JButton jButtonAbrirOrderByToolBarVentasVentasNoCerradas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasVentasNoCerradas;
	protected JMenuItem jMenuItemDuplicarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemNuevoRelacionesVentasVentasNoCerradas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasVentasNoCerradas;
	protected JMenuItem jMenuItemCopiarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemVerFormVentasVentasNoCerradas;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasVentasNoCerradas;
	protected JMenuItem jMenuItemCerrarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemDetalleCerrarVentasVentasNoCerradas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasVentasNoCerradas;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasVentasNoCerradas;
	protected JMenuItem jMenuItemProcesarInformacionVentasVentasNoCerradas;
	protected JMenuItem jMenuItemAnterioresVentasVentasNoCerradas;
	protected JMenuItem jMenuItemSiguientesVentasVentasNoCerradas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas;
	protected JMenuItem jMenuItemAbrirOrderByVentasVentasNoCerradas;
	protected JMenuItem jMenuItemMostrarOcultarVentasVentasNoCerradas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasVentasNoCerradas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasVentasNoCerradas;
	protected JCheckBox jCheckBoxSeleccionadosVentasVentasNoCerradas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas;
	protected JCheckBox jCheckBoxConGraficoReporteVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasVentasNoCerradas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasVentasNoCerradas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasVentasNoCerradas;
	protected JTextField jTextFieldValorCampoGeneralVentasVentasNoCerradas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasVentasNoCerradas;
	//public JList<Reporte> jListColumnasSelectReporteVentasVentasNoCerradas;
	//public JScrollPane jScrollColumnasSelectReporteVentasVentasNoCerradas;
	
	//public JLabel jLabelRelacionesSelectReporteVentasVentasNoCerradas;
	//public JList<Reporte> jListRelacionesSelectReporteVentasVentasNoCerradas;
	//public JScrollPane jScrollRelacionesSelectReporteVentasVentasNoCerradas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasVentasNoCerradas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasVentasNoCerradas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasVentasNoCerradas;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasVentasNoCerradas;
	
		
	//public JLabel jLabelArchivoImportacionVentasVentasNoCerradas;	
	//public JLabel jLabelPathArchivoImportacionVentasVentasNoCerradas;
	//protected JTextField jTextFieldPathArchivoImportacionVentasVentasNoCerradas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasVentasNoCerradas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas;
	
	//public JLabel jLabelColumnaCategoriaValorVentasVentasNoCerradas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasVentasNoCerradas;
	
	//public JLabel jLabelColumnasValoresGraficoVentasVentasNoCerradas;
	//public JList<Reporte> jListColumnasValoresGraficoVentasVentasNoCerradas;
	//public JScrollPane jScrollColumnasValoresGraficoVentasVentasNoCerradas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasVentasNoCerradas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasVentasNoCerradas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasVentasNoCerradas;
	public JPanel jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	public JButton jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	public JButton jButtonfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas;
	public JButton jButtonfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradasBusqueda= new JButtonMe();

	
	
	
	
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
	public VentasVentasNoCerradasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasVentasNoCerradasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasVentasNoCerradasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasVentasNoCerradasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasVentasNoCerradas)	{
		this.jButtonRecargarInformacionVentasVentasNoCerradas = jButtonRecargarInformacionVentasVentasNoCerradas;
	}
	
	public JButton getjButtonProcesarInformacionVentasVentasNoCerradas() {
		return this.jButtonProcesarInformacionVentasVentasNoCerradas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasVentasNoCerradas)	{
		this.jButtonProcesarInformacionVentasVentasNoCerradas = jButtonProcesarInformacionVentasVentasNoCerradas;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasVentasNoCerradas() {
		return this.jButtonRecargarInformacionVentasVentasNoCerradas;
	}
	
	
	public List<VentasVentasNoCerradas> getventasventasnocerradass() {
		return this.ventasventasnocerradass;
	}

	public void setventasventasnocerradass(List<VentasVentasNoCerradas> ventasventasnocerradass) {
		this.ventasventasnocerradass = ventasventasnocerradass;
	}
	
	public List<VentasVentasNoCerradas> getventasventasnocerradassAux() {
		return this.ventasventasnocerradassAux;
	}

	public void setventasventasnocerradassAux(List<VentasVentasNoCerradas> ventasventasnocerradassAux) {
		this.ventasventasnocerradassAux = ventasventasnocerradassAux;
	}
	
	public List<VentasVentasNoCerradas> getventasventasnocerradassEliminados() {
		return this.ventasventasnocerradassEliminados;
	}

	public void setVentasVentasNoCerradassEliminados(List<VentasVentasNoCerradas> ventasventasnocerradassEliminados) {
		this.ventasventasnocerradassEliminados = ventasventasnocerradassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasVentasNoCerradas() {
		return jComboBoxTiposSeleccionarVentasVentasNoCerradas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasVentasNoCerradas(
			JComboBox jComboBoxTiposSeleccionarVentasVentasNoCerradas) {
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas = jComboBoxTiposSeleccionarVentasVentasNoCerradas;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasVentasNoCerradas() {
		return jTextFieldValorCampoGeneralVentasVentasNoCerradas;
	}

	public void setjTextFieldValorCampoGeneralVentasVentasNoCerradas(
			JTextField jTextFieldValorCampoGeneralVentasVentasNoCerradas) {
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas = jTextFieldValorCampoGeneralVentasVentasNoCerradas;
	}

	public void setBorderResaltarValorCampoGeneralVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasVentasNoCerradas() {
		return this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas;
	}

	public void setjCheckBoxSeleccionarTodosVentasVentasNoCerradas(
			JCheckBox jCheckBoxSeleccionarTodosVentasVentasNoCerradas) {
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas = jCheckBoxSeleccionarTodosVentasVentasNoCerradas;
	}

	public void setBorderResaltarSeleccionarTodosVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasVentasNoCerradas() {
		return this.jCheckBoxSeleccionadosVentasVentasNoCerradas;
	}

	public void setjCheckBoxSeleccionadosVentasVentasNoCerradas(
			JCheckBox jCheckBoxSeleccionadosVentasVentasNoCerradas) {
		this.jCheckBoxSeleccionadosVentasVentasNoCerradas = jCheckBoxSeleccionadosVentasVentasNoCerradas;
	}
	
	public void setBorderResaltarSeleccionadosVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasVentasNoCerradas() {
		return this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasVentasNoCerradas(
			JComboBox jComboBoxTiposArchivosReportesVentasVentasNoCerradas) {
		this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas = jComboBoxTiposArchivosReportesVentasVentasNoCerradas;
	}

	public void setBorderResaltarTiposArchivosReportesVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasVentasNoCerradas() {
		return this.jComboBoxTiposReportesVentasVentasNoCerradas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasVentasNoCerradas(
			JComboBox jComboBoxTiposReportesVentasVentasNoCerradas) {
		this.jComboBoxTiposReportesVentasVentasNoCerradas = jComboBoxTiposReportesVentasVentasNoCerradas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasVentasNoCerradas() {
	//	return jComboBoxTiposReportesDinamicoVentasVentasNoCerradas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasVentasNoCerradas(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasVentasNoCerradas) {
	//	this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas = jComboBoxTiposReportesDinamicoVentasVentasNoCerradas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas = jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas;
	//}
	
	public void setBorderResaltarTiposReportesVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasVentasNoCerradas() {
		return this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasVentasNoCerradas(
			JComboBox jComboBoxTiposGraficosReportesVentasVentasNoCerradas) {
		this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas = jComboBoxTiposGraficosReportesVentasVentasNoCerradas;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasVentasNoCerradas() {
		return this.jComboBoxTiposPaginacionVentasVentasNoCerradas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasVentasNoCerradas(
			JComboBox jComboBoxTiposPaginacionVentasVentasNoCerradas) {
		this.jComboBoxTiposPaginacionVentasVentasNoCerradas = jComboBoxTiposPaginacionVentasVentasNoCerradas;
	}
	
	public void setBorderResaltarTiposPaginacionVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasVentasNoCerradas() {
		return this.jComboBoxTiposRelacionesVentasVentasNoCerradas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasVentasNoCerradas() {
		return this.jComboBoxTiposAccionesVentasVentasNoCerradas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasVentasNoCerradas(
			JComboBox jComboBoxTiposRelacionesVentasVentasNoCerradas) {
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas = jComboBoxTiposRelacionesVentasVentasNoCerradas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasVentasNoCerradas(
			JComboBox jComboBoxTiposAccionesVentasVentasNoCerradas) {
		this.jComboBoxTiposAccionesVentasVentasNoCerradas = jComboBoxTiposAccionesVentasVentasNoCerradas;
	}
	
	public void setBorderResaltarTiposRelacionesVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasVentasNoCerradas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasVentasNoCerradas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasVentasNoCerradas() {
	//	return jCheckBoxConGraficoDinamicoVentasVentasNoCerradas;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasVentasNoCerradas(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasVentasNoCerradas) {
	//	this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas = jCheckBoxConGraficoDinamicoVentasVentasNoCerradas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasVentasNoCerradas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasVentasNoCerradas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas .setBorder(borderResaltar);		
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
		this.ventasventasnocerradasSessionBean=new VentasVentasNoCerradasSessionBean();
		
		this.ventasventasnocerradasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasventasnocerradasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasVentasNoCerradasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasVentasNoCerradasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasVentasNoCerradasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasVentasNoCerradasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasVentasNoCerradasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Ventas No Cerradas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasVentasNoCerradasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasVentasNoCerradas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasVentasNoCerradas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"nuevo","nuevo","Nuevo"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"duplicar","duplicar","Duplicar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"copiar","copiar","Copiar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"ver_form","ver_form","Ver"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"recargar","recargar","Buscar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasVentasNoCerradas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasVentasNoCerradas,this.jTtoolBarVentasVentasNoCerradas,
							"cerrar","cerrar","Salir"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasVentasNoCerradas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasVentasNoCerradas;
			
				this.jButtonProcesarInformacionToolBarVentasVentasNoCerradas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasVentasNoCerradas;
				
		//protected JButton jButtonModificarToolBarVentasVentasNoCerradas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasVentasNoCerradas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasVentasNoCerradas=new JMenuMe("General");
		this.jmenuArchivoVentasVentasNoCerradas=new JMenuMe("Archivo");
		this.jmenuAccionesVentasVentasNoCerradas=new JMenuMe("Acciones");
		this.jmenuDatosVentasVentasNoCerradas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasVentasNoCerradas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasVentasNoCerradas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasVentasNoCerradas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasVentasNoCerradas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasVentasNoCerradas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasVentasNoCerradas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasVentasNoCerradas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasVentasNoCerradas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasVentasNoCerradas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasVentasNoCerradas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasVentasNoCerradas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasVentasNoCerradas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasVentasNoCerradas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasVentasNoCerradas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasVentasNoCerradas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasVentasNoCerradas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasVentasNoCerradas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasVentasNoCerradas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasVentasNoCerradas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasVentasNoCerradas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasVentasNoCerradas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasVentasNoCerradas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasVentasNoCerradas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasVentasNoCerradas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasVentasNoCerradas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasVentasNoCerradas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasVentasNoCerradas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasVentasNoCerradas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasVentasNoCerradas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasVentasNoCerradas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasVentasNoCerradas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasVentasNoCerradas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasVentasNoCerradas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasVentasNoCerradas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasVentasNoCerradas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasVentasNoCerradas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasVentasNoCerradas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasVentasNoCerradas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasVentasNoCerradas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasVentasNoCerradas.add(this.jMenuItemCerrarVentasVentasNoCerradas);
			
			this.jmenuAccionesVentasVentasNoCerradas.add(this.jMenuItemNuevoVentasVentasNoCerradas);
			this.jmenuAccionesVentasVentasNoCerradas.add(this.jMenuItemNuevoGuardarCambiosVentasVentasNoCerradas);
			this.jmenuAccionesVentasVentasNoCerradas.add(this.jMenuItemNuevoRelacionesVentasVentasNoCerradas);
			this.jmenuAccionesVentasVentasNoCerradas.add(this.jMenuItemGuardarCambiosTablaVentasVentasNoCerradas);		
			this.jmenuAccionesVentasVentasNoCerradas.add(this.jMenuItemDuplicarVentasVentasNoCerradas);		
			this.jmenuAccionesVentasVentasNoCerradas.add(this.jMenuItemCopiarVentasVentasNoCerradas);		
			this.jmenuAccionesVentasVentasNoCerradas.add(this.jMenuItemVerFormVentasVentasNoCerradas);		
			
			this.jmenuDatosVentasVentasNoCerradas.add(this.jMenuItemRecargarInformacionVentasVentasNoCerradas);				
			this.jmenuDatosVentasVentasNoCerradas.add(this.jMenuItemAnterioresVentasVentasNoCerradas);				
			this.jmenuDatosVentasVentasNoCerradas.add(this.jMenuItemSiguientesVentasVentasNoCerradas);				
			this.jmenuDatosVentasVentasNoCerradas.add(this.jMenuItemAbrirOrderByVentasVentasNoCerradas);				
			this.jmenuDatosVentasVentasNoCerradas.add(this.jMenuItemMostrarOcultarVentasVentasNoCerradas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasVentasNoCerradas.add(this.jMenuItemGuardarCambiosVentasVentasNoCerradas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasVentasNoCerradas.add(this.jmenuArchivoVentasVentasNoCerradas);		
			this.jmenuBarVentasVentasNoCerradas.add(this.jmenuAccionesVentasVentasNoCerradas);		
			this.jmenuBarVentasVentasNoCerradas.add(this.jmenuDatosVentasVentasNoCerradas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasVentasNoCerradas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasVentasNoCerradas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas= new JButtonMe();
		this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setText("Buscar");
		this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasVentasNoCerradas=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasVentasNoCerradas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasVentasNoCerradas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasVentasNoCerradas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasVentasNoCerradas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasVentasNoCerradas = new VentasVentasNoCerradasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Ventas No Cerradas DATOS");
			this.jInternalFrameDetalleFormVentasVentasNoCerradas = new VentasVentasNoCerradasDetalleFormJInternalFrame(jDesktopPane,this.ventasventasnocerradasSessionBean.getConGuardarRelaciones(),this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasVentasNoCerradas = null;//new VentasVentasNoCerradasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasVentasNoCerradas= new GridBagLayout();
		
		
		this.jTableDatosVentasVentasNoCerradas = new JTableMe();      
		
		String sToolTipVentasVentasNoCerradas="";
		sToolTipVentasVentasNoCerradas=VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasVentasNoCerradas+="(Facturacion.VentasVentasNoCerradas)";
		}
		
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasVentasNoCerradas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasVentasNoCerradas.setToolTipText(sToolTipVentasVentasNoCerradas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasVentasNoCerradas);
		this.jTableDatosVentasVentasNoCerradas.setAutoCreateRowSorter(true);
		this.jTableDatosVentasVentasNoCerradas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasVentasNoCerradas.setRowSelectionAllowed(true);
		this.jTableDatosVentasVentasNoCerradas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasVentasNoCerradas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasVentasNoCerradas = new JButtonMe();
		this.jButtonDuplicarVentasVentasNoCerradas = new JButtonMe();
		this.jButtonCopiarVentasVentasNoCerradas = new JButtonMe();
		this.jButtonVerFormVentasVentasNoCerradas = new JButtonMe();
		this.jButtonNuevoRelacionesVentasVentasNoCerradas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas = new JButtonMe();
		this.jButtonCerrarVentasVentasNoCerradas = new JButtonMe();
		
		this.jScrollPanelDatosVentasVentasNoCerradas = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasVentasNoCerradas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Ventas No Cerradas";
		
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Ventas No Cerradases" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasVentasNoCerradas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasVentasNoCerradas.setToolTipText("Acciones");
        this.jPanelAccionesVentasVentasNoCerradas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasVentasNoCerradas=new ReporteDinamicoJInternalFrame(VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasVentasNoCerradas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasVentasNoCerradas=new ImportacionJInternalFrame(VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasVentasNoCerradas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasVentasNoCerradas = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasVentasNoCerradas.setText("Orden");
		this.jButtonAbrirOrderByVentasVentasNoCerradas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasVentasNoCerradas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasVentasNoCerradas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasVentasNoCerradas,false,this);
			
			//this.cargarOrderByVentasVentasNoCerradas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasVentasNoCerradas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasVentasNoCerradas,true,this);
			
			//this.cargarOrderByVentasVentasNoCerradas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasVentasNoCerradas.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosVentasVentasNoCerradas.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosVentasVentasNoCerradas.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosVentasVentasNoCerradas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasVentasNoCerradas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasVentasNoCerradas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasVentasNoCerradas.setText("Nuevo");
		this.jButtonDuplicarVentasVentasNoCerradas.setText("Duplicar");
		this.jButtonCopiarVentasVentasNoCerradas.setText("Copiar");
		this.jButtonVerFormVentasVentasNoCerradas.setText("Ver");
		this.jButtonNuevoRelacionesVentasVentasNoCerradas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.setText("Guardar");
		this.jButtonCerrarVentasVentasNoCerradas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasVentasNoCerradas,"nuevo_button","Nuevo",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasVentasNoCerradas,"duplicar_button","Duplicar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasVentasNoCerradas,"copiar_button","Copiar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasVentasNoCerradas,"ver_form","Ver",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasVentasNoCerradas,"nuevorelaciones_button","Nuevo Rel",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasVentasNoCerradas,"guardarcambiostabla_button","Guardar",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasVentasNoCerradas,"cerrar_button","Salir",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasVentasNoCerradas.setToolTipText("Nuevo"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasVentasNoCerradas.setToolTipText("Duplicar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasVentasNoCerradas.setToolTipText("Copiar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasVentasNoCerradas.setToolTipText("Ver"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasVentasNoCerradas.setToolTipText("Nuevo Rel"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.setToolTipText("Guardar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasVentasNoCerradas.setToolTipText("Salir"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasVentasNoCerradas";
		inputMap = this.jButtonNuevoVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasVentasNoCerradas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasVentasNoCerradas"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasVentasNoCerradas";
		inputMap = this.jButtonDuplicarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasVentasNoCerradas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasVentasNoCerradas"));
		
		//COPIAR
		sMapKey = "CopiarVentasVentasNoCerradas";
		inputMap = this.jButtonCopiarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasVentasNoCerradas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasVentasNoCerradas"));
		
		//VEr FORM
		sMapKey = "VerFormVentasVentasNoCerradas";
		inputMap = this.jButtonVerFormVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasVentasNoCerradas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasVentasNoCerradas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasVentasNoCerradas";
		inputMap = this.jButtonNuevoRelacionesVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasVentasNoCerradas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasVentasNoCerradas";
		inputMap = this.jButtonModificarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasVentasNoCerradas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasVentasNoCerradas";
		inputMap = this.jButtonCerrarVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasVentasNoCerradas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasVentasNoCerradas";
		inputMap = this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasVentasNoCerradas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasVentasNoCerradas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasVentasNoCerradas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasVentasNoCerradas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasVentasNoCerradas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasVentasNoCerradas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasVentasNoCerradas.setName("jPanelParametrosReportesVentasVentasNoCerradas"); 
		
		this.jPanelParametrosReportesAccionesVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasVentasNoCerradas.setName("jPanelParametrosReportesAccionesVentasVentasNoCerradas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasVentasNoCerradas = new JButtonMe();
		this.jButtonRecargarInformacionVentasVentasNoCerradas.setText("Buscar");
		this.jButtonRecargarInformacionVentasVentasNoCerradas.setToolTipText("Buscar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasVentasNoCerradas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasVentasNoCerradas.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasVentasNoCerradas = new JButtonMe();
		this.jButtonProcesarInformacionVentasVentasNoCerradas.setText("Procesar");
		this.jButtonProcesarInformacionVentasVentasNoCerradas.setToolTipText("Procesar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasVentasNoCerradas.setVisible(false);
			
		this.jButtonProcesarInformacionVentasVentasNoCerradas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasVentasNoCerradas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasVentasNoCerradas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.setText("TIPO");       
		this.jComboBoxTiposReportesVentasVentasNoCerradas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasVentasNoCerradas.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasVentasNoCerradas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasVentasNoCerradas.setText("Accion");
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasVentasNoCerradas.setText("Accion");
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasVentasNoCerradas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasVentasNoCerradas = new JLabelMe();
		
		this.jLabelAccionesVentasVentasNoCerradas.setText("Acciones");		
		this.jLabelAccionesVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasVentasNoCerradas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasVentasNoCerradas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasVentasNoCerradas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasVentasNoCerradas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasVentasNoCerradas.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasVentasNoCerradas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasVentasNoCerradas = new JButtonMe();
		//this.jButtonAnterioresVentasVentasNoCerradas.setText("<<");
        this.jButtonAnterioresVentasVentasNoCerradas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasVentasNoCerradas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasVentasNoCerradas = new JButtonMe();
		//this.jButtonSiguientesVentasVentasNoCerradas.setText(">>");
        this.jButtonSiguientesVentasVentasNoCerradas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasVentasNoCerradas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas,"nuevoguardarcambios_button","Nue",this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasVentasNoCerradas";
		inputMap = this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasVentasNoCerradas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasVentasNoCerradas";
		inputMap = this.jButtonRecargarInformacionVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasVentasNoCerradas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasVentasNoCerradas";
		inputMap = this.jButtonSiguientesVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasVentasNoCerradas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasVentasNoCerradas";
		inputMap = this.jButtonAnterioresVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasVentasNoCerradas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasVentasNoCerradas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasVentasNoCerradas.setMinimumSize(new Dimension(this.getWidth(),VentasVentasNoCerradasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasVentasNoCerradasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasVentasNoCerradas.setMaximumSize(new Dimension(this.getWidth(),VentasVentasNoCerradasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasVentasNoCerradasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasVentasNoCerradas.setPreferredSize(new Dimension(this.getWidth(),VentasVentasNoCerradasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasVentasNoCerradasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasVentasNoCerradas = new GridBagLayout();

			this.jPanelPaginacionVentasVentasNoCerradas.setLayout(gridaBagLayoutPaginacionVentasVentasNoCerradas);						
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonAnterioresVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
					
						
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
			
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonNuevoGuardarCambiosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
						
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonSiguientesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonNuevoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
						
			
			
			if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
				this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
				this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonGuardarCambiosTablaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			}
			
			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonDuplicarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonCopiarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonVerFormVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasVentasNoCerradas.add(this.jButtonCerrarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		
		this.jButtonRecargarInformacionVentasVentasNoCerradas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasVentasNoCerradas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasVentasNoCerradas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasVentasNoCerradas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasVentasNoCerradas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasVentasNoCerradas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasVentasNoCerradas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasVentasNoCerradas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasVentasNoCerradas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasVentasNoCerradas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasVentasNoCerradas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasVentasNoCerradas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasVentasNoCerradas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasVentasNoCerradas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasVentasNoCerradas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasVentasNoCerradas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasVentasNoCerradas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasVentasNoCerradas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasVentasNoCerradas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasVentasNoCerradas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasVentasNoCerradas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasVentasNoCerradas.setLayout(gridaBagParametrosReportesVentasVentasNoCerradas);
			this.jPanelParametrosReportesAccionesVentasVentasNoCerradas.setLayout(gridaBagParametrosReportesAccionesVentasVentasNoCerradas);
			
			
			this.jPanelParametrosAuxiliar1VentasVentasNoCerradas.setLayout(gridaBagParametrosAuxiliar1VentasVentasNoCerradas);
			this.jPanelParametrosAuxiliar2VentasVentasNoCerradas.setLayout(gridaBagParametrosAuxiliar2VentasVentasNoCerradas);
			this.jPanelParametrosAuxiliar3VentasVentasNoCerradas.setLayout(gridaBagParametrosAuxiliar3VentasVentasNoCerradas);
			this.jPanelParametrosAuxiliar4VentasVentasNoCerradas.setLayout(gridaBagParametrosAuxiliar4VentasVentasNoCerradas);
			//this.jPanelParametrosAuxiliar5VentasVentasNoCerradas.setLayout(gridaBagParametrosAuxiliar2VentasVentasNoCerradas);			
			
			
			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jButtonRecargarInformacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasVentasNoCerradas.add(this.jComboBoxTiposPaginacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasVentasNoCerradas.add(this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasVentasNoCerradas.add(this.jComboBoxTiposArchivosReportesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jPanelParametrosAuxiliar1VentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasVentasNoCerradas.add(this.jComboBoxTiposReportesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);																		
			
			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasVentasNoCerradas.add(this.jComboBoxTiposGraficosReportesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jPanelParametrosAuxiliar4VentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jComboBoxTiposReportesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jCheckBoxGenerarReporteVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jPanelParametrosAuxiliar2VentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jLabelAccionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
				this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jButtonAbrirOrderByVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jComboBoxTiposSeleccionarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
			
			
			/*
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jCheckBoxConGraficoReporteVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasVentasNoCerradas.add(this.jCheckBoxSeleccionarTodosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);															
				
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasVentasNoCerradas.add(this.jCheckBoxSeleccionadosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);															
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasVentasNoCerradas.add(this.jCheckBoxConGraficoReporteVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jPanelParametrosAuxiliar3VentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasVentasNoCerradas.add(this.jComboBoxTiposAccionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasVentasNoCerradas = new GridBagLayout();

			this.jScrollPanelDatosVentasVentasNoCerradas.setLayout(gridaBagLayoutDatosVentasVentasNoCerradas);
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
			
			this.jScrollPanelDatosVentasVentasNoCerradas.add(this.jTableDatosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasVentasNoCerradas.setViewportView(this.jTableDatosVentasVentasNoCerradas);
		this.jTableDatosVentasVentasNoCerradas.setFillsViewportHeight(true);
		this.jTableDatosVentasVentasNoCerradas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasVentasNoCerradas= new GridBagLayout();
		this.jPanelAccionesVentasVentasNoCerradas.setLayout(gridaBagLayoutAccionesVentasVentasNoCerradas);
		
		
		/*	
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
			
		this.jPanelAccionesVentasVentasNoCerradas.add(this.jButtonNuevoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasVentasNoCerradasVentasVentasNoCerradas= new GridBagLayout();
		gridaBagLayoutBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.setLayout(gridaBagLayoutBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);

		gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
		jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.add(jLabelfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);

		gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasVentasNoCerradas.gridy = 0;
		gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
		jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.add(jDateChooserfecha_emision_desdeBusquedaVentasVentasNoCerradasVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);


		gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
		gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
		jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.add(jLabelfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);

		gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasVentasNoCerradas.gridy = 1;
		gridBagConstraintsVentasVentasNoCerradas.gridx = 1;
		jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.add(jDateChooserfecha_emision_hastaBusquedaVentasVentasNoCerradasVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);

		gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasVentasNoCerradas.gridy = 2;
		gridBagConstraintsVentasVentasNoCerradas.gridx =1;
		jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas.add(jButtonBusquedaVentasVentasNoCerradasVentasVentasNoCerradas, gridBagConstraintsVentasVentasNoCerradas);

		jTabbedPaneBusquedasVentasVentasNoCerradas.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasVentasNoCerradasVentasVentasNoCerradas);
		jTabbedPaneBusquedasVentasVentasNoCerradas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasVentasNoCerradas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasVentasNoCerradas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();						
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;		
			//this.gridBagConstraintsVentasVentasNoCerradas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;		
		//this.gridBagConstraintsVentasVentasNoCerradas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasVentasNoCerradas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;		
			this.gridBagConstraintsVentasVentasNoCerradas.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasVentasNoCerradas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);								
		
		
		/*
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		*/		
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =0;
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasVentasNoCerradas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
				
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasVentasNoCerradasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasVentasNoCerradas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasVentasNoCerradas = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasVentasNoCerradas.setLayout(gridaBagLayoutBusquedasParametrosVentasVentasNoCerradas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
			
			
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
			
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasVentasNoCerradas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasVentasNoCerradas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasVentasNoCerradas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasVentasNoCerradas.setName("jPanelReporteDinamicoVentasVentasNoCerradas"); 
		
		this.jPanelReporteDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasVentasNoCerradas.setLayout(gridaBagLayoutReporteDinamicoVentasVentasNoCerradas);
		
		
		this.jInternalFrameReporteDinamicoVentasVentasNoCerradas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasVentasNoCerradas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasVentasNoCerradas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Ventas No Cerradases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasVentasNoCerradas = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasVentasNoCerradas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelColumnasSelectReporteVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasVentasNoCerradas = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasVentasNoCerradas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasVentasNoCerradas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasVentasNoCerradas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasVentasNoCerradas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasVentasNoCerradas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasVentasNoCerradas=new JScrollPane(this.jListColumnasSelectReporteVentasVentasNoCerradas);
			
			this.jScrollColumnasSelectReporteVentasVentasNoCerradas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasVentasNoCerradas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasVentasNoCerradas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jListColumnasSelectReporteVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jScrollColumnasSelectReporteVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasVentasNoCerradas = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasVentasNoCerradas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasVentasNoCerradas = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasVentasNoCerradas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasVentasNoCerradas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasVentasNoCerradas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasVentasNoCerradas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasVentasNoCerradas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasVentasNoCerradas=new JScrollPane(this.jListRelacionesSelectReporteVentasVentasNoCerradas);
			
			this.jScrollRelacionesSelectReporteVentasVentasNoCerradas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasVentasNoCerradas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasVentasNoCerradas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasVentasNoCerradas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasVentasNoCerradas = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasVentasNoCerradas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelConGraficoDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jCheckBoxConGraficoDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasVentasNoCerradas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasVentasNoCerradas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelColumnaCategoriaGraficoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasVentasNoCerradas = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasVentasNoCerradas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelColumnaCategoriaValorVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasVentasNoCerradas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasVentasNoCerradas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jComboBoxColumnaCategoriaValorVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasVentasNoCerradas = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasVentasNoCerradas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelColumnasValoresGraficoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasVentasNoCerradas = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasVentasNoCerradas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasVentasNoCerradas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasVentasNoCerradas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasVentasNoCerradas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasVentasNoCerradas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasVentasNoCerradas=new JScrollPane(this.jListColumnasValoresGraficoVentasVentasNoCerradas);
			
			this.jScrollColumnasValoresGraficoVentasVentasNoCerradas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasVentasNoCerradas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasVentasNoCerradas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jListColumnasSelectReporteVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jScrollColumnasValoresGraficoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasVentasNoCerradas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasVentasNoCerradas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelTiposGraficosReportesDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasVentasNoCerradas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasVentasNoCerradas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasVentasNoCerradas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jComboBoxTiposGraficosReportesDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasVentasNoCerradas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasVentasNoCerradas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelGenerarExcelReporteDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas.setToolTipText("Generar EXCEL"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		//this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jButtonGenerarExcelReporteDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jComboBoxTiposReportesDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasVentasNoCerradas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasVentasNoCerradas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jLabelTiposArchivoReporteDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jComboBoxTiposArchivosReportesDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasVentasNoCerradas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasVentasNoCerradas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasVentasNoCerradas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasVentasNoCerradas.setToolTipText("Generar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jButtonGenerarReporteDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasVentasNoCerradas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasVentasNoCerradas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasVentasNoCerradas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasVentasNoCerradas.setToolTipText("Cancelar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasVentasNoCerradas.add(this.jButtonCerrarReporteDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasVentasNoCerradas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasVentasNoCerradas= new JScrollPane(jPanelReporteDinamicoVentasVentasNoCerradas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Ventas No Cerradases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasVentasNoCerradas);
		this.jInternalFrameReporteDinamicoVentasVentasNoCerradas.getContentPane().add(this.jScrollPanelReporteDinamicoVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasVentasNoCerradas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasVentasNoCerradas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasVentasNoCerradas.setName("jPanelImportacionVentasVentasNoCerradas"); 
		
		this.jPanelImportacionVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasVentasNoCerradas.setLayout(gridaBagLayoutImportacionVentasVentasNoCerradas);
		
		
		this.jInternalFrameImportacionVentasVentasNoCerradas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasVentasNoCerradas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasVentasNoCerradas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasVentasNoCerradas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasVentasNoCerradas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasVentasNoCerradas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasVentasNoCerradas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setResizable(true);
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setClosable(true);
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasVentasNoCerradas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasVentasNoCerradas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasVentasNoCerradas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setResizable(true);
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setClosable(true);
	    this.jInternalFrameImportacionVentasVentasNoCerradas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Ventas No Cerradases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasVentasNoCerradas = new JLabelMe();

		this.jLabelArchivoImportacionVentasVentasNoCerradas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasVentasNoCerradas.add(this.jLabelArchivoImportacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasVentasNoCerradas = new JFileChooser();		
		this.jFileChooserImportacionVentasVentasNoCerradas.setToolTipText("ESCOGER ARCHIVO"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasVentasNoCerradas = new JButtonMe();
		this.jButtonAbrirImportacionVentasVentasNoCerradas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasVentasNoCerradas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasVentasNoCerradas.setToolTipText("Generar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasVentasNoCerradas.add(this.jButtonAbrirImportacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasVentasNoCerradas = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasVentasNoCerradas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasVentasNoCerradas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasVentasNoCerradas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasVentasNoCerradas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasVentasNoCerradas.add(this.jLabelPathArchivoImportacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasVentasNoCerradas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasVentasNoCerradas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasVentasNoCerradas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasVentasNoCerradas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasVentasNoCerradas.add(this.jTextFieldPathArchivoImportacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasVentasNoCerradas = new JButtonMe();
		this.jButtonGenerarImportacionVentasVentasNoCerradas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasVentasNoCerradas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasVentasNoCerradas.setToolTipText("Generar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasVentasNoCerradas.add(this.jButtonGenerarImportacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasVentasNoCerradas = new JButtonMe();
		this.jButtonCerrarImportacionVentasVentasNoCerradas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasVentasNoCerradas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasVentasNoCerradas.setToolTipText("Cancelar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasVentasNoCerradas.add(this.jButtonCerrarImportacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasVentasNoCerradas = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasVentasNoCerradas= new JScrollPane(jPanelImportacionVentasVentasNoCerradas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
		this.gridBagConstraintsVentasVentasNoCerradas.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasVentasNoCerradas.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasVentasNoCerradas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasVentasNoCerradas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasVentasNoCerradas);
		this.jInternalFrameImportacionVentasVentasNoCerradas.getContentPane().add(this.jScrollPanelImportacionVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasVentasNoCerradas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasVentasNoCerradas = new JButtonMe();
			this.jButtonAbrirOrderByVentasVentasNoCerradas.setText("Orden");
			this.jButtonAbrirOrderByVentasVentasNoCerradas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasVentasNoCerradas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasVentasNoCerradas";
			inputMap = this.jButtonAbrirOrderByVentasVentasNoCerradas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasVentasNoCerradas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasVentasNoCerradas"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasVentasNoCerradas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasVentasNoCerradas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasVentasNoCerradas.setName("jPanelOrderByVentasVentasNoCerradas"); 
			
			this.jPanelOrderByVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasVentasNoCerradas.setLayout(gridaBagLayoutOrderByVentasVentasNoCerradas);
			
			
			this.jTableDatosVentasVentasNoCerradasOrderBy = new JTableMe();        
			this.jTableDatosVentasVentasNoCerradasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasVentasNoCerradasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasVentasNoCerradasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasVentasNoCerradasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasVentasNoCerradasOrderBy.setViewportView(this.jTableDatosVentasVentasNoCerradasOrderBy);
			this.jTableDatosVentasVentasNoCerradasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasVentasNoCerradasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasVentasNoCerradas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasVentasNoCerradas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasVentasNoCerradas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasVentasNoCerradas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasVentasNoCerradas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasVentasNoCerradas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasVentasNoCerradas.setTitle("Orden");
			this.jInternalFrameOrderByVentasVentasNoCerradas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasVentasNoCerradas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasVentasNoCerradas.setResizable(true);
			this.jInternalFrameOrderByVentasVentasNoCerradas.setClosable(true);
			this.jInternalFrameOrderByVentasVentasNoCerradas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasVentasNoCerradas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Ventas No Cerradases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasVentasNoCerradas.ipady =150;
				
			this.jPanelOrderByVentasVentasNoCerradas.add(jScrollPanelDatosVentasVentasNoCerradasOrderBy, this.gridBagConstraintsVentasVentasNoCerradas);//this.jTableDatosVentasVentasNoCerradasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasVentasNoCerradas = new JButtonMe();
			this.jButtonCerrarOrderByVentasVentasNoCerradas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasVentasNoCerradas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasVentasNoCerradas.setToolTipText("Cancelar"+" "+VentasVentasNoCerradasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasVentasNoCerradas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasVentasNoCerradas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasVentasNoCerradas.add(this.jButtonCerrarOrderByVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasVentasNoCerradas = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasVentasNoCerradas= new JScrollPane(jPanelOrderByVentasVentasNoCerradas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasVentasNoCerradas = new GridBagConstraints();
			this.gridBagConstraintsVentasVentasNoCerradas.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasVentasNoCerradas.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasVentasNoCerradas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasVentasNoCerradas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasVentasNoCerradas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasVentasNoCerradas);
			
			this.jInternalFrameOrderByVentasVentasNoCerradas.getContentPane().add(this.jScrollPanelOrderByVentasVentasNoCerradas, this.gridBagConstraintsVentasVentasNoCerradas);			
		
		} else {
			this.jButtonAbrirOrderByVentasVentasNoCerradas = new JButtonMe();
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
		//	&& this.ventasventasnocerradasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasVentasNoCerradas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasVentasNoCerradas.getRowHeight();//VentasVentasNoCerradasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas.isSelected()) {
					iHeightTable=VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasVentasNoCerradas.isSelected()) {
					iHeightTable=VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasVentasNoCerradasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasVentasNoCerradas!=null && this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy()!=null) {
			//if(!this.ventasventasnocerradasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasVentasNoCerradas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasVentasNoCerradas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasVentasNoCerradas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasVentasNoCerradas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasVentasNoCerradas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasVentasNoCerradas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasVentasNoCerradas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventasventasnocerradasLogic.getVentasVentasNoCerradass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasventasnocerradass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasVentasNoCerradas> TraerVentasVentasNoCerradasBeans(List<VentasVentasNoCerradas> ventasventasnocerradass,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasVentasNoCerradas ventasventasnocerradas:ventasventasnocerradass) {
					
				if(!(VentasVentasNoCerradasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasVentasNoCerradasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventasventasnocerradas.setsDetalleGeneralEntityReporte(VentasVentasNoCerradasConstantesFunciones.getVentasVentasNoCerradasDescripcion(ventasventasnocerradas));
										
						
					
						
					
				} else  {
							
					//ventasventasnocerradas.setsDetalleGeneralEntityReporte(ventasventasnocerradas.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventasventasnocerradasbeans.add(ventasventasnocerradasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventasventasnocerradass;
    }
	//PARA REPORTES FIN
}
