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
import com.bydan.erp.facturacion.util.report.VentasCajasResumidosConstantesFunciones;

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
public class VentasCajasResumidosJInternalFrame extends VentasCajasResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasCajasResumidos;
	
	protected JMenuBar jmenuBarVentasCajasResumidos;
	
	protected JMenu jmenuVentasCajasResumidos;
	protected JMenu jmenuDatosVentasCajasResumidos;
	protected JMenu jmenuArchivoVentasCajasResumidos;
	protected JMenu jmenuAccionesVentasCajasResumidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasCajasResumidos;	
	protected GridBagConstraints gridBagConstraintsVentasCajasResumidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasCajasResumidosDetalleFormJInternalFrame jInternalFrameDetalleFormVentasCajasResumidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasCajasResumidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasCajasResumidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public VentasCajasResumidosSessionBean ventascajasresumidosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasCajasResumidos> ventascajasresumidoss;		
	public List<VentasCajasResumidos> ventascajasresumidossEliminados;	
	public List<VentasCajasResumidos> ventascajasresumidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasCajasResumidos;		
	protected JButton jButtonAbrirOrderByVentasCajasResumidos;
	
	
	//protected JPanel jPanelOrderByVentasCajasResumidos;
	//public JScrollPane jScrollPanelOrderByVentasCajasResumidos;	
	//protected JButton jButtonCerrarOrderByVentasCajasResumidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasCajasResumidosLogic ventascajasresumidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasCajasResumidos;
	public JScrollPane jScrollPanelDatosEdicionVentasCajasResumidos;
	public JScrollPane jScrollPanelDatosGeneralVentasCajasResumidos;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasCajasResumidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasCajasResumidos;
	//public JScrollPane jScrollPanelImportacionVentasCajasResumidos;
	
	
	
	protected JPanel jPanelAccionesVentasCajasResumidos;
	
    protected JPanel jPanelPaginacionVentasCajasResumidos;
    protected JPanel jPanelParametrosReportesVentasCajasResumidos;
	protected JPanel jPanelParametrosReportesAccionesVentasCajasResumidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasCajasResumidos;
	protected JPanel jPanelParametrosAuxiliar2VentasCajasResumidos;
	protected JPanel jPanelParametrosAuxiliar3VentasCajasResumidos;
	protected JPanel jPanelParametrosAuxiliar4VentasCajasResumidos;
	//protected JPanel jPanelParametrosAuxiliar5VentasCajasResumidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasCajasResumidos;
	//protected JPanel jPanelImportacionVentasCajasResumidos;
	
	
	public JTable jTableDatosVentasCajasResumidos;
	
	
	
	//public JTable jTableDatosVentasCajasResumidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasCajasResumidos;
	protected JButton jButtonDuplicarVentasCajasResumidos;
	protected JButton jButtonCopiarVentasCajasResumidos;
	protected JButton jButtonVerFormVentasCajasResumidos;
	protected JButton jButtonNuevoRelacionesVentasCajasResumidos;
	protected JButton jButtonModificarVentasCajasResumidos;
	
    protected JButton jButtonGuardarCambiosTablaVentasCajasResumidos;
	protected JButton jButtonCerrarVentasCajasResumidos;
	
	
	protected JButton jButtonRecargarInformacionVentasCajasResumidos;
	protected JButton jButtonProcesarInformacionVentasCajasResumidos;
	
	
	protected JButton jButtonAnterioresVentasCajasResumidos;
	protected JButton jButtonSiguientesVentasCajasResumidos;
	protected JButton jButtonNuevoGuardarCambiosVentasCajasResumidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasCajasResumidos;
	//protected JButton jButtonCerrarReporteDinamicoVentasCajasResumidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasCajasResumidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasCajasResumidos;
	//protected JButton jButtonGenerarImportacionVentasCajasResumidos;
	//protected JButton jButtonCerrarImportacionVentasCajasResumidos;
	//protected JFileChooser jFileChooserImportacionVentasCajasResumidos;
	//protected File fileImportacionVentasCajasResumidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasCajasResumidos;
	protected JButton jButtonDuplicarToolBarVentasCajasResumidos;
	protected JButton jButtonNuevoRelacionesToolBarVentasCajasResumidos;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasCajasResumidos;
	protected JButton jButtonCopiarToolBarVentasCajasResumidos;
	protected JButton jButtonVerFormToolBarVentasCajasResumidos;
	public JButton jButtonGuardarCambiosTablaToolBarVentasCajasResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasCajasResumidos;
	protected JButton jButtonCerrarToolBarVentasCajasResumidos;
	
	protected JButton jButtonRecargarInformacionToolBarVentasCajasResumidos;
	protected JButton jButtonProcesarInformacionToolBarVentasCajasResumidos;
	protected JButton jButtonAnterioresToolBarVentasCajasResumidos;
	protected JButton jButtonSiguientesToolBarVentasCajasResumidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasCajasResumidos;
	protected JButton jButtonAbrirOrderByToolBarVentasCajasResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasCajasResumidos;
	protected JMenuItem jMenuItemDuplicarVentasCajasResumidos;
	protected JMenuItem jMenuItemNuevoRelacionesVentasCajasResumidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasCajasResumidos;
	protected JMenuItem jMenuItemCopiarVentasCajasResumidos;
	protected JMenuItem jMenuItemVerFormVentasCajasResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasCajasResumidos;
	protected JMenuItem jMenuItemCerrarVentasCajasResumidos;
	protected JMenuItem jMenuItemDetalleCerrarVentasCajasResumidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasCajasResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasCajasResumidos;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasCajasResumidos;
	protected JMenuItem jMenuItemProcesarInformacionVentasCajasResumidos;
	protected JMenuItem jMenuItemAnterioresVentasCajasResumidos;
	protected JMenuItem jMenuItemSiguientesVentasCajasResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasCajasResumidos;
	protected JMenuItem jMenuItemAbrirOrderByVentasCajasResumidos;
	protected JMenuItem jMenuItemMostrarOcultarVentasCajasResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasCajasResumidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasCajasResumidos;
	protected JCheckBox jCheckBoxSeleccionadosVentasCajasResumidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasCajasResumidos;
	protected JCheckBox jCheckBoxConGraficoReporteVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasCajasResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasCajasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasCajasResumidos;
	protected JTextField jTextFieldValorCampoGeneralVentasCajasResumidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasCajasResumidos;
	//public JList<Reporte> jListColumnasSelectReporteVentasCajasResumidos;
	//public JScrollPane jScrollColumnasSelectReporteVentasCajasResumidos;
	
	//public JLabel jLabelRelacionesSelectReporteVentasCajasResumidos;
	//public JList<Reporte> jListRelacionesSelectReporteVentasCajasResumidos;
	//public JScrollPane jScrollRelacionesSelectReporteVentasCajasResumidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasCajasResumidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasCajasResumidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasCajasResumidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasCajasResumidos;
	
		
	//public JLabel jLabelArchivoImportacionVentasCajasResumidos;	
	//public JLabel jLabelPathArchivoImportacionVentasCajasResumidos;
	//protected JTextField jTextFieldPathArchivoImportacionVentasCajasResumidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasCajasResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasCajasResumidos;
	
	//public JLabel jLabelColumnaCategoriaValorVentasCajasResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasCajasResumidos;
	
	//public JLabel jLabelColumnasValoresGraficoVentasCajasResumidos;
	//public JList<Reporte> jListColumnasValoresGraficoVentasCajasResumidos;
	//public JScrollPane jScrollColumnasValoresGraficoVentasCajasResumidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasCajasResumidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasCajasResumidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasCajasResumidos;
	public JPanel jPanelBusquedaVentasCajasResumidosVentasCajasResumidos;
	public JButton jButtonBusquedaVentasCajasResumidosVentasCajasResumidos;
	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos;
	public JButton jButtonfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos;
	public JButton jButtonfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidosBusqueda= new JButtonMe();

	
	
	
	
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
	public VentasCajasResumidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCajasResumidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCajasResumidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasCajasResumidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasCajasResumidos)	{
		this.jButtonRecargarInformacionVentasCajasResumidos = jButtonRecargarInformacionVentasCajasResumidos;
	}
	
	public JButton getjButtonProcesarInformacionVentasCajasResumidos() {
		return this.jButtonProcesarInformacionVentasCajasResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasCajasResumidos)	{
		this.jButtonProcesarInformacionVentasCajasResumidos = jButtonProcesarInformacionVentasCajasResumidos;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasCajasResumidos() {
		return this.jButtonRecargarInformacionVentasCajasResumidos;
	}
	
	
	public List<VentasCajasResumidos> getventascajasresumidoss() {
		return this.ventascajasresumidoss;
	}

	public void setventascajasresumidoss(List<VentasCajasResumidos> ventascajasresumidoss) {
		this.ventascajasresumidoss = ventascajasresumidoss;
	}
	
	public List<VentasCajasResumidos> getventascajasresumidossAux() {
		return this.ventascajasresumidossAux;
	}

	public void setventascajasresumidossAux(List<VentasCajasResumidos> ventascajasresumidossAux) {
		this.ventascajasresumidossAux = ventascajasresumidossAux;
	}
	
	public List<VentasCajasResumidos> getventascajasresumidossEliminados() {
		return this.ventascajasresumidossEliminados;
	}

	public void setVentasCajasResumidossEliminados(List<VentasCajasResumidos> ventascajasresumidossEliminados) {
		this.ventascajasresumidossEliminados = ventascajasresumidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasCajasResumidos() {
		return jComboBoxTiposSeleccionarVentasCajasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasCajasResumidos(
			JComboBox jComboBoxTiposSeleccionarVentasCajasResumidos) {
		this.jComboBoxTiposSeleccionarVentasCajasResumidos = jComboBoxTiposSeleccionarVentasCajasResumidos;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasCajasResumidos() {
		return jTextFieldValorCampoGeneralVentasCajasResumidos;
	}

	public void setjTextFieldValorCampoGeneralVentasCajasResumidos(
			JTextField jTextFieldValorCampoGeneralVentasCajasResumidos) {
		this.jTextFieldValorCampoGeneralVentasCajasResumidos = jTextFieldValorCampoGeneralVentasCajasResumidos;
	}

	public void setBorderResaltarValorCampoGeneralVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasCajasResumidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasCajasResumidos() {
		return this.jCheckBoxSeleccionarTodosVentasCajasResumidos;
	}

	public void setjCheckBoxSeleccionarTodosVentasCajasResumidos(
			JCheckBox jCheckBoxSeleccionarTodosVentasCajasResumidos) {
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos = jCheckBoxSeleccionarTodosVentasCajasResumidos;
	}

	public void setBorderResaltarSeleccionarTodosVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasCajasResumidos() {
		return this.jCheckBoxSeleccionadosVentasCajasResumidos;
	}

	public void setjCheckBoxSeleccionadosVentasCajasResumidos(
			JCheckBox jCheckBoxSeleccionadosVentasCajasResumidos) {
		this.jCheckBoxSeleccionadosVentasCajasResumidos = jCheckBoxSeleccionadosVentasCajasResumidos;
	}
	
	public void setBorderResaltarSeleccionadosVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasCajasResumidos() {
		return this.jComboBoxTiposArchivosReportesVentasCajasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasCajasResumidos(
			JComboBox jComboBoxTiposArchivosReportesVentasCajasResumidos) {
		this.jComboBoxTiposArchivosReportesVentasCajasResumidos = jComboBoxTiposArchivosReportesVentasCajasResumidos;
	}

	public void setBorderResaltarTiposArchivosReportesVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasCajasResumidos() {
		return this.jComboBoxTiposReportesVentasCajasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasCajasResumidos(
			JComboBox jComboBoxTiposReportesVentasCajasResumidos) {
		this.jComboBoxTiposReportesVentasCajasResumidos = jComboBoxTiposReportesVentasCajasResumidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasCajasResumidos() {
	//	return jComboBoxTiposReportesDinamicoVentasCajasResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasCajasResumidos(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasCajasResumidos) {
	//	this.jComboBoxTiposReportesDinamicoVentasCajasResumidos = jComboBoxTiposReportesDinamicoVentasCajasResumidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos = jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos;
	//}
	
	public void setBorderResaltarTiposReportesVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasCajasResumidos() {
		return this.jComboBoxTiposGraficosReportesVentasCajasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasCajasResumidos(
			JComboBox jComboBoxTiposGraficosReportesVentasCajasResumidos) {
		this.jComboBoxTiposGraficosReportesVentasCajasResumidos = jComboBoxTiposGraficosReportesVentasCajasResumidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasCajasResumidos() {
		return this.jComboBoxTiposPaginacionVentasCajasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasCajasResumidos(
			JComboBox jComboBoxTiposPaginacionVentasCajasResumidos) {
		this.jComboBoxTiposPaginacionVentasCajasResumidos = jComboBoxTiposPaginacionVentasCajasResumidos;
	}
	
	public void setBorderResaltarTiposPaginacionVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasCajasResumidos() {
		return this.jComboBoxTiposRelacionesVentasCajasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasCajasResumidos() {
		return this.jComboBoxTiposAccionesVentasCajasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasCajasResumidos(
			JComboBox jComboBoxTiposRelacionesVentasCajasResumidos) {
		this.jComboBoxTiposRelacionesVentasCajasResumidos = jComboBoxTiposRelacionesVentasCajasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasCajasResumidos(
			JComboBox jComboBoxTiposAccionesVentasCajasResumidos) {
		this.jComboBoxTiposAccionesVentasCajasResumidos = jComboBoxTiposAccionesVentasCajasResumidos;
	}
	
	public void setBorderResaltarTiposRelacionesVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasCajasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasCajasResumidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasCajasResumidos() {
	//	return jCheckBoxConGraficoDinamicoVentasCajasResumidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasCajasResumidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasCajasResumidos) {
	//	this.jCheckBoxConGraficoDinamicoVentasCajasResumidos = jCheckBoxConGraficoDinamicoVentasCajasResumidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasCajasResumidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasCajasResumidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasCajasResumidos .setBorder(borderResaltar);		
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
		this.ventascajasresumidosSessionBean=new VentasCajasResumidosSessionBean();
		
		this.ventascajasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventascajasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventascajasresumidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasCajasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasCajasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasCajasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasCajasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasCajasResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Cajas Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasCajasResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasCajasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasCajasResumidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"nuevo","nuevo","Nuevo"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"duplicar","duplicar","Duplicar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"copiar","copiar","Copiar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"ver_form","ver_form","Ver"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"recargar","recargar","Buscar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasCajasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasCajasResumidos,this.jTtoolBarVentasCajasResumidos,
							"cerrar","cerrar","Salir"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasCajasResumidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasCajasResumidos;
			
				this.jButtonProcesarInformacionToolBarVentasCajasResumidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasCajasResumidos;
				
		//protected JButton jButtonModificarToolBarVentasCajasResumidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasCajasResumidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasCajasResumidos=new JMenuMe("General");
		this.jmenuArchivoVentasCajasResumidos=new JMenuMe("Archivo");
		this.jmenuAccionesVentasCajasResumidos=new JMenuMe("Acciones");
		this.jmenuDatosVentasCajasResumidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasCajasResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasCajasResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasCajasResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasCajasResumidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasCajasResumidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasCajasResumidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasCajasResumidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasCajasResumidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasCajasResumidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasCajasResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasCajasResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasCajasResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasCajasResumidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasCajasResumidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasCajasResumidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasCajasResumidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasCajasResumidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasCajasResumidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasCajasResumidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasCajasResumidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasCajasResumidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasCajasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasCajasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasCajasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasCajasResumidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasCajasResumidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasCajasResumidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasCajasResumidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasCajasResumidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasCajasResumidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasCajasResumidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasCajasResumidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasCajasResumidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasCajasResumidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasCajasResumidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasCajasResumidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasCajasResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasCajasResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasCajasResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasCajasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasCajasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasCajasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasCajasResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasCajasResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasCajasResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasCajasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasCajasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasCajasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasCajasResumidos.add(this.jMenuItemCerrarVentasCajasResumidos);
			
			this.jmenuAccionesVentasCajasResumidos.add(this.jMenuItemNuevoVentasCajasResumidos);
			this.jmenuAccionesVentasCajasResumidos.add(this.jMenuItemNuevoGuardarCambiosVentasCajasResumidos);
			this.jmenuAccionesVentasCajasResumidos.add(this.jMenuItemNuevoRelacionesVentasCajasResumidos);
			this.jmenuAccionesVentasCajasResumidos.add(this.jMenuItemGuardarCambiosTablaVentasCajasResumidos);		
			this.jmenuAccionesVentasCajasResumidos.add(this.jMenuItemDuplicarVentasCajasResumidos);		
			this.jmenuAccionesVentasCajasResumidos.add(this.jMenuItemCopiarVentasCajasResumidos);		
			this.jmenuAccionesVentasCajasResumidos.add(this.jMenuItemVerFormVentasCajasResumidos);		
			
			this.jmenuDatosVentasCajasResumidos.add(this.jMenuItemRecargarInformacionVentasCajasResumidos);				
			this.jmenuDatosVentasCajasResumidos.add(this.jMenuItemAnterioresVentasCajasResumidos);				
			this.jmenuDatosVentasCajasResumidos.add(this.jMenuItemSiguientesVentasCajasResumidos);				
			this.jmenuDatosVentasCajasResumidos.add(this.jMenuItemAbrirOrderByVentasCajasResumidos);				
			this.jmenuDatosVentasCajasResumidos.add(this.jMenuItemMostrarOcultarVentasCajasResumidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasCajasResumidos.add(this.jMenuItemGuardarCambiosVentasCajasResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasCajasResumidos.add(this.jmenuArchivoVentasCajasResumidos);		
			this.jmenuBarVentasCajasResumidos.add(this.jmenuAccionesVentasCajasResumidos);		
			this.jmenuBarVentasCajasResumidos.add(this.jmenuDatosVentasCajasResumidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasCajasResumidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasCajasResumidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasCajasResumidosVentasCajasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasCajasResumidosVentasCajasResumidos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidos= new JButtonMe();
		this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidos.setText("Buscar");
		this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidos,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasCajasResumidosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasCajasResumidos=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasCajasResumidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasCajasResumidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasCajasResumidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasCajasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasCajasResumidos = new VentasCajasResumidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Cajas Resumidos DATOS");
			this.jInternalFrameDetalleFormVentasCajasResumidos = new VentasCajasResumidosDetalleFormJInternalFrame(jDesktopPane,this.ventascajasresumidosSessionBean.getConGuardarRelaciones(),this.ventascajasresumidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasCajasResumidos = null;//new VentasCajasResumidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasCajasResumidos= new GridBagLayout();
		
		
		this.jTableDatosVentasCajasResumidos = new JTableMe();      
		
		String sToolTipVentasCajasResumidos="";
		sToolTipVentasCajasResumidos=VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasCajasResumidos+="(Facturacion.VentasCajasResumidos)";
		}
		
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasCajasResumidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasCajasResumidos.setToolTipText(sToolTipVentasCajasResumidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasCajasResumidos);
		this.jTableDatosVentasCajasResumidos.setAutoCreateRowSorter(true);
		this.jTableDatosVentasCajasResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasCajasResumidos.setRowSelectionAllowed(true);
		this.jTableDatosVentasCajasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasCajasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasCajasResumidos = new JButtonMe();
		this.jButtonDuplicarVentasCajasResumidos = new JButtonMe();
		this.jButtonCopiarVentasCajasResumidos = new JButtonMe();
		this.jButtonVerFormVentasCajasResumidos = new JButtonMe();
		this.jButtonNuevoRelacionesVentasCajasResumidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos = new JButtonMe();
		this.jButtonCerrarVentasCajasResumidos = new JButtonMe();
		
		this.jScrollPanelDatosVentasCajasResumidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasCajasResumidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Cajas Resumidos";
		
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Cajas Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasCajasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasCajasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesVentasCajasResumidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasCajasResumidos=new ReporteDinamicoJInternalFrame(VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasCajasResumidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasCajasResumidos=new ImportacionJInternalFrame(VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasCajasResumidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasCajasResumidos = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasCajasResumidos.setText("Orden");
		this.jButtonAbrirOrderByVentasCajasResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasCajasResumidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasCajasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCajasResumidos,false,this);
			
			//this.cargarOrderByVentasCajasResumidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasCajasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasCajasResumidos,true,this);
			
			//this.cargarOrderByVentasCajasResumidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasCajasResumidos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosVentasCajasResumidos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosVentasCajasResumidos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosVentasCajasResumidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasCajasResumidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasCajasResumidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasCajasResumidos.setText("Nuevo");
		this.jButtonDuplicarVentasCajasResumidos.setText("Duplicar");
		this.jButtonCopiarVentasCajasResumidos.setText("Copiar");
		this.jButtonVerFormVentasCajasResumidos.setText("Ver");
		this.jButtonNuevoRelacionesVentasCajasResumidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.setText("Guardar");
		this.jButtonCerrarVentasCajasResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasCajasResumidos,"nuevo_button","Nuevo",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasCajasResumidos,"duplicar_button","Duplicar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasCajasResumidos,"copiar_button","Copiar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasCajasResumidos,"ver_form","Ver",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasCajasResumidos,"nuevorelaciones_button","Nuevo Rel",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasCajasResumidos,"guardarcambiostabla_button","Guardar",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasCajasResumidos,"cerrar_button","Salir",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasCajasResumidos.setToolTipText("Nuevo"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasCajasResumidos.setToolTipText("Duplicar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasCajasResumidos.setToolTipText("Copiar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasCajasResumidos.setToolTipText("Ver"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasCajasResumidos.setToolTipText("Nuevo Rel"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.setToolTipText("Guardar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasCajasResumidos.setToolTipText("Salir"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasCajasResumidos";
		inputMap = this.jButtonNuevoVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasCajasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasCajasResumidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasCajasResumidos";
		inputMap = this.jButtonDuplicarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasCajasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasCajasResumidos"));
		
		//COPIAR
		sMapKey = "CopiarVentasCajasResumidos";
		inputMap = this.jButtonCopiarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasCajasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasCajasResumidos"));
		
		//VEr FORM
		sMapKey = "VerFormVentasCajasResumidos";
		inputMap = this.jButtonVerFormVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasCajasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasCajasResumidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasCajasResumidos";
		inputMap = this.jButtonNuevoRelacionesVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasCajasResumidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasCajasResumidos";
		inputMap = this.jButtonModificarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasCajasResumidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasCajasResumidos";
		inputMap = this.jButtonCerrarVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasCajasResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasCajasResumidos";
		inputMap = this.jButtonGuardarCambiosTablaVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasCajasResumidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasCajasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasCajasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasCajasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasCajasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasCajasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasCajasResumidos.setName("jPanelParametrosReportesVentasCajasResumidos"); 
		
		this.jPanelParametrosReportesAccionesVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasCajasResumidos.setName("jPanelParametrosReportesAccionesVentasCajasResumidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasCajasResumidos = new JButtonMe();
		this.jButtonRecargarInformacionVentasCajasResumidos.setText("Buscar");
		this.jButtonRecargarInformacionVentasCajasResumidos.setToolTipText("Buscar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasCajasResumidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasCajasResumidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasCajasResumidos = new JButtonMe();
		this.jButtonProcesarInformacionVentasCajasResumidos.setText("Procesar");
		this.jButtonProcesarInformacionVentasCajasResumidos.setToolTipText("Procesar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasCajasResumidos.setVisible(false);
			
		this.jButtonProcesarInformacionVentasCajasResumidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasCajasResumidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasCajasResumidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasCajasResumidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasCajasResumidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasCajasResumidos.setText("TIPO");       
		this.jComboBoxTiposReportesVentasCajasResumidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasCajasResumidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasCajasResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasCajasResumidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasCajasResumidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasCajasResumidos.setText("Accion");
		this.jComboBoxTiposRelacionesVentasCajasResumidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasCajasResumidos.setText("Accion");
		this.jComboBoxTiposAccionesVentasCajasResumidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasCajasResumidos.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasCajasResumidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasCajasResumidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasCajasResumidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasCajasResumidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasCajasResumidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasCajasResumidos = new JLabelMe();
		
		this.jLabelAccionesVentasCajasResumidos.setText("Acciones");		
		this.jLabelAccionesVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasCajasResumidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasCajasResumidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasCajasResumidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasCajasResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasCajasResumidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasCajasResumidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasCajasResumidos = new JButtonMe();
		//this.jButtonAnterioresVentasCajasResumidos.setText("<<");
        this.jButtonAnterioresVentasCajasResumidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasCajasResumidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasCajasResumidos = new JButtonMe();
		//this.jButtonSiguientesVentasCajasResumidos.setText(">>");
        this.jButtonSiguientesVentasCajasResumidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasCajasResumidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasCajasResumidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasCajasResumidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasCajasResumidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasCajasResumidos,"nuevoguardarcambios_button","Nue",this.ventascajasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasCajasResumidos";
		inputMap = this.jButtonNuevoGuardarCambiosVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasCajasResumidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasCajasResumidos";
		inputMap = this.jButtonRecargarInformacionVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasCajasResumidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasCajasResumidos";
		inputMap = this.jButtonSiguientesVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasCajasResumidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasCajasResumidos";
		inputMap = this.jButtonAnterioresVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasCajasResumidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasCajasResumidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasCajasResumidos.setMinimumSize(new Dimension(this.getWidth(),VentasCajasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasCajasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasCajasResumidos.setMaximumSize(new Dimension(this.getWidth(),VentasCajasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasCajasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasCajasResumidos.setPreferredSize(new Dimension(this.getWidth(),VentasCajasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasCajasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasCajasResumidos = new GridBagLayout();

			this.jPanelPaginacionVentasCajasResumidos.setLayout(gridaBagLayoutPaginacionVentasCajasResumidos);						
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonAnterioresVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
					
						
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
			
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonNuevoGuardarCambiosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
						
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonSiguientesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 1;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonNuevoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
						
			
			
			if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
				this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasCajasResumidos.gridy = 1;
				this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonGuardarCambiosTablaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			}
			
			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 1;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonDuplicarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 1;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonCopiarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 1;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonVerFormVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 1;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasCajasResumidos.add(this.jButtonCerrarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		
		this.jButtonRecargarInformacionVentasCajasResumidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasCajasResumidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasCajasResumidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasCajasResumidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasCajasResumidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasCajasResumidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasCajasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasCajasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasCajasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasCajasResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasCajasResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasCajasResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasCajasResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasCajasResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasCajasResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasCajasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasCajasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasCajasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasCajasResumidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasCajasResumidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasCajasResumidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasCajasResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasCajasResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasCajasResumidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasCajasResumidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasCajasResumidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasCajasResumidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasCajasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasCajasResumidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasCajasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasCajasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasCajasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasCajasResumidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasCajasResumidos.setLayout(gridaBagParametrosReportesVentasCajasResumidos);
			this.jPanelParametrosReportesAccionesVentasCajasResumidos.setLayout(gridaBagParametrosReportesAccionesVentasCajasResumidos);
			
			
			this.jPanelParametrosAuxiliar1VentasCajasResumidos.setLayout(gridaBagParametrosAuxiliar1VentasCajasResumidos);
			this.jPanelParametrosAuxiliar2VentasCajasResumidos.setLayout(gridaBagParametrosAuxiliar2VentasCajasResumidos);
			this.jPanelParametrosAuxiliar3VentasCajasResumidos.setLayout(gridaBagParametrosAuxiliar3VentasCajasResumidos);
			this.jPanelParametrosAuxiliar4VentasCajasResumidos.setLayout(gridaBagParametrosAuxiliar4VentasCajasResumidos);
			//this.jPanelParametrosAuxiliar5VentasCajasResumidos.setLayout(gridaBagParametrosAuxiliar2VentasCajasResumidos);			
			
			
			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jButtonRecargarInformacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasCajasResumidos.add(this.jComboBoxTiposPaginacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasCajasResumidos.add(this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasCajasResumidos.add(this.jComboBoxTiposArchivosReportesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jPanelParametrosAuxiliar1VentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasCajasResumidos.add(this.jComboBoxTiposReportesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);																		
			
			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasCajasResumidos.add(this.jComboBoxTiposGraficosReportesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jPanelParametrosAuxiliar4VentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jComboBoxTiposReportesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jCheckBoxGenerarReporteVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jPanelParametrosAuxiliar2VentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jLabelAccionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
				this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasCajasResumidos.add(this.jButtonAbrirOrderByVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jComboBoxTiposSeleccionarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
			
			
			/*
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jCheckBoxSeleccionarTodosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jCheckBoxConGraficoReporteVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasCajasResumidos.add(this.jCheckBoxSeleccionarTodosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);															
				
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasCajasResumidos.add(this.jCheckBoxSeleccionadosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);															
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasCajasResumidos.add(this.jCheckBoxConGraficoReporteVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jPanelParametrosAuxiliar3VentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasCajasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasCajasResumidos.add(this.jComboBoxTiposAccionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasCajasResumidos = new GridBagLayout();

			this.jScrollPanelDatosVentasCajasResumidos.setLayout(gridaBagLayoutDatosVentasCajasResumidos);
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
			this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
			
			this.jScrollPanelDatosVentasCajasResumidos.add(this.jTableDatosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasCajasResumidos.setViewportView(this.jTableDatosVentasCajasResumidos);
		this.jTableDatosVentasCajasResumidos.setFillsViewportHeight(true);
		this.jTableDatosVentasCajasResumidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasCajasResumidos= new GridBagLayout();
		this.jPanelAccionesVentasCajasResumidos.setLayout(gridaBagLayoutAccionesVentasCajasResumidos);
		
		
		/*	
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = 0;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
			
		this.jPanelAccionesVentasCajasResumidos.add(this.jButtonNuevoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasCajasResumidosVentasCajasResumidos= new GridBagLayout();
		gridaBagLayoutBusquedaVentasCajasResumidosVentasCajasResumidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasCajasResumidosVentasCajasResumidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasCajasResumidosVentasCajasResumidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasCajasResumidosVentasCajasResumidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasCajasResumidosVentasCajasResumidos.setLayout(gridaBagLayoutBusquedaVentasCajasResumidosVentasCajasResumidos);

		gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCajasResumidos.gridy = 0;
		gridBagConstraintsVentasCajasResumidos.gridx = 0;
		jPanelBusquedaVentasCajasResumidosVentasCajasResumidos.add(jLabelfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);

		gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCajasResumidos.gridy = 0;
		gridBagConstraintsVentasCajasResumidos.gridx = 1;
		jPanelBusquedaVentasCajasResumidosVentasCajasResumidos.add(jDateChooserfecha_emision_desdeBusquedaVentasCajasResumidosVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);


		gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCajasResumidos.gridy = 1;
		gridBagConstraintsVentasCajasResumidos.gridx = 0;
		jPanelBusquedaVentasCajasResumidosVentasCajasResumidos.add(jLabelfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);

		gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCajasResumidos.gridy = 1;
		gridBagConstraintsVentasCajasResumidos.gridx = 1;
		jPanelBusquedaVentasCajasResumidosVentasCajasResumidos.add(jDateChooserfecha_emision_hastaBusquedaVentasCajasResumidosVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);

		gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasCajasResumidos.gridy = 2;
		gridBagConstraintsVentasCajasResumidos.gridx =1;
		jPanelBusquedaVentasCajasResumidosVentasCajasResumidos.add(jButtonBusquedaVentasCajasResumidosVentasCajasResumidos, gridBagConstraintsVentasCajasResumidos);

		jTabbedPaneBusquedasVentasCajasResumidos.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasCajasResumidosVentasCajasResumidos);
		jTabbedPaneBusquedasVentasCajasResumidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasCajasResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasCajasResumidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();						
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasCajasResumidos.gridx = 0;		
			//this.gridBagConstraintsVentasCajasResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasCajasResumidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;		
		//this.gridBagConstraintsVentasCajasResumidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasCajasResumidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasCajasResumidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasCajasResumidos.gridx = 0;		
			this.gridBagConstraintsVentasCajasResumidos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasCajasResumidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);								
		
		
		/*
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		*/		
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasCajasResumidos.gridx =0;
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasCajasResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
				
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasCajasResumidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasCajasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasCajasResumidos = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasCajasResumidos.setLayout(gridaBagLayoutBusquedasParametrosVentasCajasResumidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasCajasResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasCajasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCajasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasCajasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
			
			
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
			
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasCajasResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasCajasResumidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasCajasResumidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasCajasResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasCajasResumidos.setName("jPanelReporteDinamicoVentasCajasResumidos"); 
		
		this.jPanelReporteDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasCajasResumidos.setLayout(gridaBagLayoutReporteDinamicoVentasCajasResumidos);
		
		
		this.jInternalFrameReporteDinamicoVentasCajasResumidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasCajasResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasCajasResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasCajasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasCajasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasCajasResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasCajasResumidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasCajasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasCajasResumidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasCajasResumidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasCajasResumidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Cajas Resumidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasCajasResumidos = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasCajasResumidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelColumnasSelectReporteVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasCajasResumidos = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasCajasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasCajasResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasCajasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasCajasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasCajasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasCajasResumidos=new JScrollPane(this.jListColumnasSelectReporteVentasCajasResumidos);
			
			this.jScrollColumnasSelectReporteVentasCajasResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasCajasResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasCajasResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jListColumnasSelectReporteVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jScrollColumnasSelectReporteVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasCajasResumidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasCajasResumidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasCajasResumidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasCajasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasCajasResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasCajasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasCajasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasCajasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasCajasResumidos=new JScrollPane(this.jListRelacionesSelectReporteVentasCajasResumidos);
			
			this.jScrollRelacionesSelectReporteVentasCajasResumidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasCajasResumidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasCajasResumidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasCajasResumidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasCajasResumidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasCajasResumidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasCajasResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasCajasResumidos = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasCajasResumidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelConGraficoDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasCajasResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasCajasResumidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasCajasResumidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jCheckBoxConGraficoDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasCajasResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasCajasResumidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelColumnaCategoriaGraficoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasCajasResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasCajasResumidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelColumnaCategoriaValorVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasCajasResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasCajasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasCajasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jComboBoxColumnaCategoriaValorVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasCajasResumidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasCajasResumidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelColumnasValoresGraficoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasCajasResumidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasCajasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasCajasResumidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasCajasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasCajasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasCajasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasCajasResumidos=new JScrollPane(this.jListColumnasValoresGraficoVentasCajasResumidos);
			
			this.jScrollColumnasValoresGraficoVentasCajasResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasCajasResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasCajasResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jListColumnasSelectReporteVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jScrollColumnasValoresGraficoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasCajasResumidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasCajasResumidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelTiposGraficosReportesDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasCajasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasCajasResumidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasCajasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jComboBoxTiposGraficosReportesDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasCajasResumidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasCajasResumidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelGenerarExcelReporteDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidos.setToolTipText("Generar EXCEL"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jButtonGenerarExcelReporteDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jComboBoxTiposReportesDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasCajasResumidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasCajasResumidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jLabelTiposArchivoReporteDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jComboBoxTiposArchivosReportesDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasCajasResumidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasCajasResumidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasCajasResumidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasCajasResumidos.setToolTipText("Generar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jButtonGenerarReporteDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasCajasResumidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasCajasResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasCajasResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasCajasResumidos.setToolTipText("Cancelar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasCajasResumidos.add(this.jButtonCerrarReporteDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasCajasResumidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasCajasResumidos= new JScrollPane(jPanelReporteDinamicoVentasCajasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasCajasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasCajasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasCajasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Cajas Resumidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasCajasResumidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasCajasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasCajasResumidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasCajasResumidos);
		this.jInternalFrameReporteDinamicoVentasCajasResumidos.getContentPane().add(this.jScrollPanelReporteDinamicoVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasCajasResumidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasCajasResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasCajasResumidos.setName("jPanelImportacionVentasCajasResumidos"); 
		
		this.jPanelImportacionVentasCajasResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasCajasResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasCajasResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasCajasResumidos.setLayout(gridaBagLayoutImportacionVentasCajasResumidos);
		
		
		this.jInternalFrameImportacionVentasCajasResumidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasCajasResumidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasCajasResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasCajasResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasCajasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasCajasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasCajasResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasCajasResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasCajasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasCajasResumidos.setResizable(true);
	    this.jInternalFrameImportacionVentasCajasResumidos.setClosable(true);
	    this.jInternalFrameImportacionVentasCajasResumidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasCajasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasCajasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasCajasResumidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasCajasResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasCajasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasCajasResumidos.setResizable(true);
	    this.jInternalFrameImportacionVentasCajasResumidos.setClosable(true);
	    this.jInternalFrameImportacionVentasCajasResumidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasCajasResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasCajasResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasCajasResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Cajas Resumidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasCajasResumidos = new JLabelMe();

		this.jLabelArchivoImportacionVentasCajasResumidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasCajasResumidos.add(this.jLabelArchivoImportacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasCajasResumidos = new JFileChooser();		
		this.jFileChooserImportacionVentasCajasResumidos.setToolTipText("ESCOGER ARCHIVO"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasCajasResumidos = new JButtonMe();
		this.jButtonAbrirImportacionVentasCajasResumidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasCajasResumidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasCajasResumidos.setToolTipText("Generar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCajasResumidos.add(this.jButtonAbrirImportacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasCajasResumidos = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasCajasResumidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasCajasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasCajasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasCajasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasCajasResumidos.add(this.jLabelPathArchivoImportacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasCajasResumidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasCajasResumidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasCajasResumidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasCajasResumidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCajasResumidos.add(this.jTextFieldPathArchivoImportacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasCajasResumidos = new JButtonMe();
		this.jButtonGenerarImportacionVentasCajasResumidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasCajasResumidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasCajasResumidos.setToolTipText("Generar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCajasResumidos.add(this.jButtonGenerarImportacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasCajasResumidos = new JButtonMe();
		this.jButtonCerrarImportacionVentasCajasResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasCajasResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasCajasResumidos.setToolTipText("Cancelar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasCajasResumidos.add(this.jButtonCerrarImportacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasCajasResumidos = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasCajasResumidos= new JScrollPane(jPanelImportacionVentasCajasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
		this.gridBagConstraintsVentasCajasResumidos.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasCajasResumidos.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasCajasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasCajasResumidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasCajasResumidos);
		this.jInternalFrameImportacionVentasCajasResumidos.getContentPane().add(this.jScrollPanelImportacionVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasCajasResumidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasCajasResumidos = new JButtonMe();
			this.jButtonAbrirOrderByVentasCajasResumidos.setText("Orden");
			this.jButtonAbrirOrderByVentasCajasResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasCajasResumidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasCajasResumidos";
			inputMap = this.jButtonAbrirOrderByVentasCajasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasCajasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasCajasResumidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasCajasResumidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasCajasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasCajasResumidos.setName("jPanelOrderByVentasCajasResumidos"); 
			
			this.jPanelOrderByVentasCajasResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasCajasResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasCajasResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasCajasResumidos.setLayout(gridaBagLayoutOrderByVentasCajasResumidos);
			
			
			this.jTableDatosVentasCajasResumidosOrderBy = new JTableMe();        
			this.jTableDatosVentasCajasResumidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasCajasResumidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasCajasResumidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasCajasResumidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasCajasResumidosOrderBy.setViewportView(this.jTableDatosVentasCajasResumidosOrderBy);
			this.jTableDatosVentasCajasResumidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasCajasResumidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasCajasResumidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasCajasResumidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasCajasResumidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasCajasResumidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasCajasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasCajasResumidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasCajasResumidos.setTitle("Orden");
			this.jInternalFrameOrderByVentasCajasResumidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasCajasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasCajasResumidos.setResizable(true);
			this.jInternalFrameOrderByVentasCajasResumidos.setClosable(true);
			this.jInternalFrameOrderByVentasCajasResumidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasCajasResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasCajasResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasCajasResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasCajasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Cajas Resumidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasCajasResumidos.ipady =150;
				
			this.jPanelOrderByVentasCajasResumidos.add(jScrollPanelDatosVentasCajasResumidosOrderBy, this.gridBagConstraintsVentasCajasResumidos);//this.jTableDatosVentasCajasResumidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasCajasResumidos = new JButtonMe();
			this.jButtonCerrarOrderByVentasCajasResumidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasCajasResumidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasCajasResumidos.setToolTipText("Cancelar"+" "+VentasCajasResumidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasCajasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasCajasResumidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasCajasResumidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasCajasResumidos.add(this.jButtonCerrarOrderByVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasCajasResumidos = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasCajasResumidos= new JScrollPane(jPanelOrderByVentasCajasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasCajasResumidos = new GridBagConstraints();
			this.gridBagConstraintsVentasCajasResumidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasCajasResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasCajasResumidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasCajasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasCajasResumidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasCajasResumidos);
			
			this.jInternalFrameOrderByVentasCajasResumidos.getContentPane().add(this.jScrollPanelOrderByVentasCajasResumidos, this.gridBagConstraintsVentasCajasResumidos);			
		
		} else {
			this.jButtonAbrirOrderByVentasCajasResumidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ventascajasresumidosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasCajasResumidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasCajasResumidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasCajasResumidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasCajasResumidos.getRowHeight();//VentasCajasResumidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos.isSelected()) {
					iHeightTable=VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasCajasResumidos.isSelected()) {
					iHeightTable=VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasCajasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasCajasResumidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasCajasResumidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasCajasResumidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasCajasResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasCajasResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasCajasResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasCajasResumidos!=null && this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy()!=null) {
			//if(!this.ventascajasresumidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasCajasResumidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasCajasResumidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasCajasResumidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasCajasResumidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasCajasResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasCajasResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasCajasResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventascajasresumidosLogic.getVentasCajasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventascajasresumidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasCajasResumidos> TraerVentasCajasResumidosBeans(List<VentasCajasResumidos> ventascajasresumidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasCajasResumidos ventascajasresumidos:ventascajasresumidoss) {
					
				if(!(VentasCajasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasCajasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventascajasresumidos.setsDetalleGeneralEntityReporte(VentasCajasResumidosConstantesFunciones.getVentasCajasResumidosDescripcion(ventascajasresumidos));
										
						
					
						
					
				} else  {
							
					//ventascajasresumidos.setsDetalleGeneralEntityReporte(ventascajasresumidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventascajasresumidosbeans.add(ventascajasresumidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventascajasresumidoss;
    }
	//PARA REPORTES FIN
}
