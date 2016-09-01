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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.GuardarIvasVentasConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class GuardarIvasVentasJInternalFrame extends GuardarIvasVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGuardarIvasVentas;
	
	protected JMenuBar jmenuBarGuardarIvasVentas;
	
	protected JMenu jmenuGuardarIvasVentas;
	protected JMenu jmenuDatosGuardarIvasVentas;
	protected JMenu jmenuArchivoGuardarIvasVentas;
	protected JMenu jmenuAccionesGuardarIvasVentas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGuardarIvasVentas;	
	protected GridBagConstraints gridBagConstraintsGuardarIvasVentas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GuardarIvasVentasDetalleFormJInternalFrame jInternalFrameDetalleFormGuardarIvasVentas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGuardarIvasVentas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGuardarIvasVentas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuenteivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuenteiva="";
	
	public GuardarIvasVentasSessionBean guardarivasventasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoRetencionSessionBean tiporetencionfuenteivaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GuardarIvasVentas> guardarivasventass;		
	public List<GuardarIvasVentas> guardarivasventassEliminados;	
	public List<GuardarIvasVentas> guardarivasventassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGuardarIvasVentas;		
	protected JButton jButtonAbrirOrderByGuardarIvasVentas;
	
	
	//protected JPanel jPanelOrderByGuardarIvasVentas;
	//public JScrollPane jScrollPanelOrderByGuardarIvasVentas;	
	//protected JButton jButtonCerrarOrderByGuardarIvasVentas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GuardarIvasVentasLogic guardarivasventasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGuardarIvasVentas;
	public JScrollPane jScrollPanelDatosEdicionGuardarIvasVentas;
	public JScrollPane jScrollPanelDatosGeneralGuardarIvasVentas;
    
	
	
	//public JScrollPane jScrollPanelDatosGuardarIvasVentasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGuardarIvasVentas;
	//public JScrollPane jScrollPanelImportacionGuardarIvasVentas;
	
	
	
	protected JPanel jPanelAccionesGuardarIvasVentas;
	
    protected JPanel jPanelPaginacionGuardarIvasVentas;
    protected JPanel jPanelParametrosReportesGuardarIvasVentas;
	protected JPanel jPanelParametrosReportesAccionesGuardarIvasVentas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GuardarIvasVentas;
	protected JPanel jPanelParametrosAuxiliar2GuardarIvasVentas;
	protected JPanel jPanelParametrosAuxiliar3GuardarIvasVentas;
	protected JPanel jPanelParametrosAuxiliar4GuardarIvasVentas;
	//protected JPanel jPanelParametrosAuxiliar5GuardarIvasVentas;
	
	
	
	//protected JPanel jPanelReporteDinamicoGuardarIvasVentas;
	//protected JPanel jPanelImportacionGuardarIvasVentas;
	
	
	public JTable jTableDatosGuardarIvasVentas;
	
	
	
	//public JTable jTableDatosGuardarIvasVentasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGuardarIvasVentas;
	protected JButton jButtonDuplicarGuardarIvasVentas;
	protected JButton jButtonCopiarGuardarIvasVentas;
	protected JButton jButtonVerFormGuardarIvasVentas;
	protected JButton jButtonNuevoRelacionesGuardarIvasVentas;
	protected JButton jButtonModificarGuardarIvasVentas;
	
    protected JButton jButtonGuardarCambiosTablaGuardarIvasVentas;
	protected JButton jButtonCerrarGuardarIvasVentas;
	
	
	protected JButton jButtonRecargarInformacionGuardarIvasVentas;
	protected JButton jButtonProcesarInformacionGuardarIvasVentas;
	
	
	protected JButton jButtonAnterioresGuardarIvasVentas;
	protected JButton jButtonSiguientesGuardarIvasVentas;
	protected JButton jButtonNuevoGuardarCambiosGuardarIvasVentas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGuardarIvasVentas;
	//protected JButton jButtonCerrarReporteDinamicoGuardarIvasVentas;
	//protected JButton jButtonGenerarExcelReporteDinamicoGuardarIvasVentas;	
	
	
	
	//protected JButton jButtonAbrirImportacionGuardarIvasVentas;
	//protected JButton jButtonGenerarImportacionGuardarIvasVentas;
	//protected JButton jButtonCerrarImportacionGuardarIvasVentas;
	//protected JFileChooser jFileChooserImportacionGuardarIvasVentas;
	//protected File fileImportacionGuardarIvasVentas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGuardarIvasVentas;
	protected JButton jButtonDuplicarToolBarGuardarIvasVentas;
	protected JButton jButtonNuevoRelacionesToolBarGuardarIvasVentas;
	
	
	public JButton jButtonGuardarCambiosToolBarGuardarIvasVentas;
	protected JButton jButtonCopiarToolBarGuardarIvasVentas;
	protected JButton jButtonVerFormToolBarGuardarIvasVentas;
	public JButton jButtonGuardarCambiosTablaToolBarGuardarIvasVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarGuardarIvasVentas;
	protected JButton jButtonCerrarToolBarGuardarIvasVentas;
	
	protected JButton jButtonRecargarInformacionToolBarGuardarIvasVentas;
	protected JButton jButtonProcesarInformacionToolBarGuardarIvasVentas;
	protected JButton jButtonAnterioresToolBarGuardarIvasVentas;
	protected JButton jButtonSiguientesToolBarGuardarIvasVentas;
	protected JButton jButtonNuevoGuardarCambiosToolBarGuardarIvasVentas;
	protected JButton jButtonAbrirOrderByToolBarGuardarIvasVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGuardarIvasVentas;
	protected JMenuItem jMenuItemDuplicarGuardarIvasVentas;
	protected JMenuItem jMenuItemNuevoRelacionesGuardarIvasVentas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGuardarIvasVentas;
	protected JMenuItem jMenuItemCopiarGuardarIvasVentas;
	protected JMenuItem jMenuItemVerFormGuardarIvasVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaGuardarIvasVentas;
	protected JMenuItem jMenuItemCerrarGuardarIvasVentas;
	protected JMenuItem jMenuItemDetalleCerrarGuardarIvasVentas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGuardarIvasVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarGuardarIvasVentas;
	
	protected JMenuItem jMenuItemRecargarInformacionGuardarIvasVentas;
	protected JMenuItem jMenuItemProcesarInformacionGuardarIvasVentas;
	protected JMenuItem jMenuItemAnterioresGuardarIvasVentas;
	protected JMenuItem jMenuItemSiguientesGuardarIvasVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGuardarIvasVentas;
	protected JMenuItem jMenuItemAbrirOrderByGuardarIvasVentas;
	protected JMenuItem jMenuItemMostrarOcultarGuardarIvasVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGuardarIvasVentas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGuardarIvasVentas;
	protected JCheckBox jCheckBoxSeleccionadosGuardarIvasVentas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGuardarIvasVentas;
	protected JCheckBox jCheckBoxConGraficoReporteGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGuardarIvasVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGuardarIvasVentas;
	protected JTextField jTextFieldValorCampoGeneralGuardarIvasVentas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGuardarIvasVentas;
	//public JList<Reporte> jListColumnasSelectReporteGuardarIvasVentas;
	//public JScrollPane jScrollColumnasSelectReporteGuardarIvasVentas;
	
	//public JLabel jLabelRelacionesSelectReporteGuardarIvasVentas;
	//public JList<Reporte> jListRelacionesSelectReporteGuardarIvasVentas;
	//public JScrollPane jScrollRelacionesSelectReporteGuardarIvasVentas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGuardarIvasVentas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGuardarIvasVentas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGuardarIvasVentas;
	//public JLabel jLabelTiposArchivoReporteDinamicoGuardarIvasVentas;
	
		
	//public JLabel jLabelArchivoImportacionGuardarIvasVentas;	
	//public JLabel jLabelPathArchivoImportacionGuardarIvasVentas;
	//protected JTextField jTextFieldPathArchivoImportacionGuardarIvasVentas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGuardarIvasVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGuardarIvasVentas;
	
	//public JLabel jLabelColumnaCategoriaValorGuardarIvasVentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGuardarIvasVentas;
	
	//public JLabel jLabelColumnasValoresGraficoGuardarIvasVentas;
	//public JList<Reporte> jListColumnasValoresGraficoGuardarIvasVentas;
	//public JScrollPane jScrollColumnasValoresGraficoGuardarIvasVentas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGuardarIvasVentas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGuardarIvasVentas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGuardarIvasVentas;
	public JPanel jPanelBusquedaGuardarIvasVentasGuardarIvasVentas;
	public JButton jButtonBusquedaGuardarIvasVentasGuardarIvasVentas;
	
	public JPanel jPanelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas;
	public JLabel jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas;
	public JButton jButtonid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas;
	public JLabel jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas;
	public JButton jButtonid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas= new JButtonMe();
	public JButton jButtonid_periodoBusquedaGuardarIvasVentasGuardarIvasVentasUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaGuardarIvasVentasGuardarIvasVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas;
	public JLabel jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas;
	public JButton jButtonid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentasBusqueda= new JButtonMe();

	
	
	
	
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
	public GuardarIvasVentasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuardarIvasVentasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuardarIvasVentasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuardarIvasVentasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGuardarIvasVentas)	{
		this.jButtonRecargarInformacionGuardarIvasVentas = jButtonRecargarInformacionGuardarIvasVentas;
	}
	
	public JButton getjButtonProcesarInformacionGuardarIvasVentas() {
		return this.jButtonProcesarInformacionGuardarIvasVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGuardarIvasVentas)	{
		this.jButtonProcesarInformacionGuardarIvasVentas = jButtonProcesarInformacionGuardarIvasVentas;
	}
	
	
	public JButton getjButtonRecargarInformacionGuardarIvasVentas() {
		return this.jButtonRecargarInformacionGuardarIvasVentas;
	}
	
	
	public List<GuardarIvasVentas> getguardarivasventass() {
		return this.guardarivasventass;
	}

	public void setguardarivasventass(List<GuardarIvasVentas> guardarivasventass) {
		this.guardarivasventass = guardarivasventass;
	}
	
	public List<GuardarIvasVentas> getguardarivasventassAux() {
		return this.guardarivasventassAux;
	}

	public void setguardarivasventassAux(List<GuardarIvasVentas> guardarivasventassAux) {
		this.guardarivasventassAux = guardarivasventassAux;
	}
	
	public List<GuardarIvasVentas> getguardarivasventassEliminados() {
		return this.guardarivasventassEliminados;
	}

	public void setGuardarIvasVentassEliminados(List<GuardarIvasVentas> guardarivasventassEliminados) {
		this.guardarivasventassEliminados = guardarivasventassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGuardarIvasVentas() {
		return jComboBoxTiposSeleccionarGuardarIvasVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGuardarIvasVentas(
			JComboBox jComboBoxTiposSeleccionarGuardarIvasVentas) {
		this.jComboBoxTiposSeleccionarGuardarIvasVentas = jComboBoxTiposSeleccionarGuardarIvasVentas;
	}
	
	public void setBorderResaltarTiposSeleccionarGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGuardarIvasVentas() {
		return jTextFieldValorCampoGeneralGuardarIvasVentas;
	}

	public void setjTextFieldValorCampoGeneralGuardarIvasVentas(
			JTextField jTextFieldValorCampoGeneralGuardarIvasVentas) {
		this.jTextFieldValorCampoGeneralGuardarIvasVentas = jTextFieldValorCampoGeneralGuardarIvasVentas;
	}

	public void setBorderResaltarValorCampoGeneralGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGuardarIvasVentas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGuardarIvasVentas() {
		return this.jCheckBoxSeleccionarTodosGuardarIvasVentas;
	}

	public void setjCheckBoxSeleccionarTodosGuardarIvasVentas(
			JCheckBox jCheckBoxSeleccionarTodosGuardarIvasVentas) {
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas = jCheckBoxSeleccionarTodosGuardarIvasVentas;
	}

	public void setBorderResaltarSeleccionarTodosGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGuardarIvasVentas() {
		return this.jCheckBoxSeleccionadosGuardarIvasVentas;
	}

	public void setjCheckBoxSeleccionadosGuardarIvasVentas(
			JCheckBox jCheckBoxSeleccionadosGuardarIvasVentas) {
		this.jCheckBoxSeleccionadosGuardarIvasVentas = jCheckBoxSeleccionadosGuardarIvasVentas;
	}
	
	public void setBorderResaltarSeleccionadosGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGuardarIvasVentas() {
		return this.jComboBoxTiposArchivosReportesGuardarIvasVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGuardarIvasVentas(
			JComboBox jComboBoxTiposArchivosReportesGuardarIvasVentas) {
		this.jComboBoxTiposArchivosReportesGuardarIvasVentas = jComboBoxTiposArchivosReportesGuardarIvasVentas;
	}

	public void setBorderResaltarTiposArchivosReportesGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGuardarIvasVentas() {
		return this.jComboBoxTiposReportesGuardarIvasVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGuardarIvasVentas(
			JComboBox jComboBoxTiposReportesGuardarIvasVentas) {
		this.jComboBoxTiposReportesGuardarIvasVentas = jComboBoxTiposReportesGuardarIvasVentas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGuardarIvasVentas() {
	//	return jComboBoxTiposReportesDinamicoGuardarIvasVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGuardarIvasVentas(
	//		JComboBox jComboBoxTiposReportesDinamicoGuardarIvasVentas) {
	//	this.jComboBoxTiposReportesDinamicoGuardarIvasVentas = jComboBoxTiposReportesDinamicoGuardarIvasVentas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas() {
	//	return jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas = jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas;
	//}
	
	public void setBorderResaltarTiposReportesGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGuardarIvasVentas() {
		return this.jComboBoxTiposGraficosReportesGuardarIvasVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGuardarIvasVentas(
			JComboBox jComboBoxTiposGraficosReportesGuardarIvasVentas) {
		this.jComboBoxTiposGraficosReportesGuardarIvasVentas = jComboBoxTiposGraficosReportesGuardarIvasVentas;
	}
	
	public void setBorderResaltarTiposGraficosReportesGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGuardarIvasVentas() {
		return this.jComboBoxTiposPaginacionGuardarIvasVentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGuardarIvasVentas(
			JComboBox jComboBoxTiposPaginacionGuardarIvasVentas) {
		this.jComboBoxTiposPaginacionGuardarIvasVentas = jComboBoxTiposPaginacionGuardarIvasVentas;
	}
	
	public void setBorderResaltarTiposPaginacionGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGuardarIvasVentas() {
		return this.jComboBoxTiposRelacionesGuardarIvasVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGuardarIvasVentas() {
		return this.jComboBoxTiposAccionesGuardarIvasVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGuardarIvasVentas(
			JComboBox jComboBoxTiposRelacionesGuardarIvasVentas) {
		this.jComboBoxTiposRelacionesGuardarIvasVentas = jComboBoxTiposRelacionesGuardarIvasVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGuardarIvasVentas(
			JComboBox jComboBoxTiposAccionesGuardarIvasVentas) {
		this.jComboBoxTiposAccionesGuardarIvasVentas = jComboBoxTiposAccionesGuardarIvasVentas;
	}
	
	public void setBorderResaltarTiposRelacionesGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGuardarIvasVentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGuardarIvasVentas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGuardarIvasVentas() {
	//	return jCheckBoxConGraficoDinamicoGuardarIvasVentas;
	//}

	//public void setjCheckBoxConGraficoDinamicoGuardarIvasVentas(
	//		JCheckBox jCheckBoxConGraficoDinamicoGuardarIvasVentas) {
	//	this.jCheckBoxConGraficoDinamicoGuardarIvasVentas = jCheckBoxConGraficoDinamicoGuardarIvasVentas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGuardarIvasVentas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGuardarIvasVentas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGuardarIvasVentas .setBorder(borderResaltar);		
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
		this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
		
		this.guardarivasventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guardarivasventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.guardarivasventasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GuardarIvasVentasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GuardarIvasVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GuardarIvasVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GuardarIvasVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GuardarIvasVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Guardar Ivas Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
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
		
		GuardarIvasVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGuardarIvasVentas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"nuevo","nuevo","Nuevo"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"duplicar","duplicar","Duplicar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"copiar","copiar","Copiar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"ver_form","ver_form","Ver"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"recargar","recargar","Buscar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,
							"cerrar","cerrar","Salir"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGuardarIvasVentas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGuardarIvasVentas;
			
				this.jButtonProcesarInformacionToolBarGuardarIvasVentas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGuardarIvasVentas;
				
		//protected JButton jButtonModificarToolBarGuardarIvasVentas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGuardarIvasVentas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGuardarIvasVentas=new JMenuMe("General");
		this.jmenuArchivoGuardarIvasVentas=new JMenuMe("Archivo");
		this.jmenuAccionesGuardarIvasVentas=new JMenuMe("Acciones");
		this.jmenuDatosGuardarIvasVentas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGuardarIvasVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGuardarIvasVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarIvasVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGuardarIvasVentas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGuardarIvasVentas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGuardarIvasVentas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGuardarIvasVentas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGuardarIvasVentas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGuardarIvasVentas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGuardarIvasVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGuardarIvasVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGuardarIvasVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGuardarIvasVentas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGuardarIvasVentas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGuardarIvasVentas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGuardarIvasVentas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGuardarIvasVentas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGuardarIvasVentas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGuardarIvasVentas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGuardarIvasVentas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGuardarIvasVentas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGuardarIvasVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGuardarIvasVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGuardarIvasVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGuardarIvasVentas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGuardarIvasVentas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGuardarIvasVentas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGuardarIvasVentas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGuardarIvasVentas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGuardarIvasVentas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGuardarIvasVentas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGuardarIvasVentas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGuardarIvasVentas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGuardarIvasVentas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGuardarIvasVentas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGuardarIvasVentas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGuardarIvasVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGuardarIvasVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGuardarIvasVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGuardarIvasVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGuardarIvasVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGuardarIvasVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGuardarIvasVentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGuardarIvasVentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGuardarIvasVentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGuardarIvasVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGuardarIvasVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGuardarIvasVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGuardarIvasVentas.add(this.jMenuItemCerrarGuardarIvasVentas);
			
			this.jmenuAccionesGuardarIvasVentas.add(this.jMenuItemNuevoGuardarIvasVentas);
			this.jmenuAccionesGuardarIvasVentas.add(this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas);
			this.jmenuAccionesGuardarIvasVentas.add(this.jMenuItemNuevoRelacionesGuardarIvasVentas);
			this.jmenuAccionesGuardarIvasVentas.add(this.jMenuItemGuardarCambiosTablaGuardarIvasVentas);		
			this.jmenuAccionesGuardarIvasVentas.add(this.jMenuItemDuplicarGuardarIvasVentas);		
			this.jmenuAccionesGuardarIvasVentas.add(this.jMenuItemCopiarGuardarIvasVentas);		
			this.jmenuAccionesGuardarIvasVentas.add(this.jMenuItemVerFormGuardarIvasVentas);		
			
			this.jmenuDatosGuardarIvasVentas.add(this.jMenuItemRecargarInformacionGuardarIvasVentas);				
			this.jmenuDatosGuardarIvasVentas.add(this.jMenuItemAnterioresGuardarIvasVentas);				
			this.jmenuDatosGuardarIvasVentas.add(this.jMenuItemSiguientesGuardarIvasVentas);				
			this.jmenuDatosGuardarIvasVentas.add(this.jMenuItemAbrirOrderByGuardarIvasVentas);				
			this.jmenuDatosGuardarIvasVentas.add(this.jMenuItemMostrarOcultarGuardarIvasVentas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGuardarIvasVentas.add(this.jMenuItemGuardarCambiosGuardarIvasVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGuardarIvasVentas.add(this.jmenuArchivoGuardarIvasVentas);		
			this.jmenuBarGuardarIvasVentas.add(this.jmenuAccionesGuardarIvasVentas);		
			this.jmenuBarGuardarIvasVentas.add(this.jmenuDatosGuardarIvasVentas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGuardarIvasVentas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGuardarIvasVentas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaGuardarIvasVentasGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.setToolTipText("Buscar Por Ejercicio Por Periodo Por Tipo Retencion Fuente Iva ");
		this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentas= new JButtonMe();
		this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentas.setText("Buscar");
		this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentas.setToolTipText("Buscar Por Ejercicio Por Periodo Por Tipo Retencion Fuente Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentas,"buscar_button","Buscar Por Ejercicio Por Periodo Por Tipo Retencion Fuente Iva ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas = new JLabelMe();
		jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas = new JLabelMe();
		jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setText("Periodo :");
		jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setToolTipText("Periodo");
		jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas= new JComboBoxMe();
		jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas = new JLabelMe();
		jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setText("Tipo Retencion Fuente Iva :");
		jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setToolTipText("Tipo Retencion Fuente Iva");
		jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGuardarIvasVentas=new JTabbedPane();


		this.jTabbedPaneBusquedasGuardarIvasVentas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasGuardarIvasVentas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasGuardarIvasVentas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGuardarIvasVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGuardarIvasVentas = new GuardarIvasVentasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Guardar Ivas Ventas DATOS");
			this.jInternalFrameDetalleFormGuardarIvasVentas = new GuardarIvasVentasDetalleFormJInternalFrame(jDesktopPane,this.guardarivasventasSessionBean.getConGuardarRelaciones(),this.guardarivasventasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGuardarIvasVentas = null;//new GuardarIvasVentasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGuardarIvasVentas= new GridBagLayout();
		
		
		this.jTableDatosGuardarIvasVentas = new JTableMe();      
		
		String sToolTipGuardarIvasVentas="";
		sToolTipGuardarIvasVentas=GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGuardarIvasVentas+="(Sris.GuardarIvasVentas)";
		}
		
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipGuardarIvasVentas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGuardarIvasVentas.setToolTipText(sToolTipGuardarIvasVentas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGuardarIvasVentas);
		this.jTableDatosGuardarIvasVentas.setAutoCreateRowSorter(true);
		this.jTableDatosGuardarIvasVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGuardarIvasVentas.setRowSelectionAllowed(true);
		this.jTableDatosGuardarIvasVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGuardarIvasVentas = new JButtonMe();
		this.jButtonDuplicarGuardarIvasVentas = new JButtonMe();
		this.jButtonCopiarGuardarIvasVentas = new JButtonMe();
		this.jButtonVerFormGuardarIvasVentas = new JButtonMe();
		this.jButtonNuevoRelacionesGuardarIvasVentas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas = new JButtonMe();
		this.jButtonCerrarGuardarIvasVentas = new JButtonMe();
		
		this.jScrollPanelDatosGuardarIvasVentas = new JScrollPane();   
        this.jScrollPanelDatosGeneralGuardarIvasVentas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Guardar Ivas Ventas";
		
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guardar Ivas Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosGuardarIvasVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGuardarIvasVentas.setToolTipText("Acciones");
        this.jPanelAccionesGuardarIvasVentas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGuardarIvasVentas=new ReporteDinamicoJInternalFrame(GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGuardarIvasVentas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGuardarIvasVentas=new ImportacionJInternalFrame(GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGuardarIvasVentas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGuardarIvasVentas = new JButtonMe();
		
		this.jButtonAbrirOrderByGuardarIvasVentas.setText("Orden");
		this.jButtonAbrirOrderByGuardarIvasVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGuardarIvasVentas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGuardarIvasVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuardarIvasVentas,false,this);
			
			//this.cargarOrderByGuardarIvasVentas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGuardarIvasVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuardarIvasVentas,true,this);
			
			//this.cargarOrderByGuardarIvasVentas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGuardarIvasVentas.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosGuardarIvasVentas.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosGuardarIvasVentas.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosGuardarIvasVentas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGuardarIvasVentas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGuardarIvasVentas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGuardarIvasVentas.setText("Nuevo");
		this.jButtonDuplicarGuardarIvasVentas.setText("Duplicar");
		this.jButtonCopiarGuardarIvasVentas.setText("Copiar");
		this.jButtonVerFormGuardarIvasVentas.setText("Ver");
		this.jButtonNuevoRelacionesGuardarIvasVentas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.setText("Guardar");
		this.jButtonCerrarGuardarIvasVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarIvasVentas,"nuevo_button","Nuevo",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGuardarIvasVentas,"duplicar_button","Duplicar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGuardarIvasVentas,"copiar_button","Copiar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGuardarIvasVentas,"ver_form","Ver",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGuardarIvasVentas,"nuevorelaciones_button","Nuevo Rel",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGuardarIvasVentas,"guardarcambiostabla_button","Guardar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGuardarIvasVentas,"cerrar_button","Salir",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGuardarIvasVentas.setToolTipText("Nuevo"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGuardarIvasVentas.setToolTipText("Duplicar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGuardarIvasVentas.setToolTipText("Copiar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGuardarIvasVentas.setToolTipText("Ver"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGuardarIvasVentas.setToolTipText("Nuevo Rel"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.setToolTipText("Guardar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGuardarIvasVentas.setToolTipText("Salir"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGuardarIvasVentas";
		inputMap = this.jButtonNuevoGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGuardarIvasVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGuardarIvasVentas"));
		
		//DUPLICAR
		sMapKey = "DuplicarGuardarIvasVentas";
		inputMap = this.jButtonDuplicarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGuardarIvasVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGuardarIvasVentas"));
		
		//COPIAR
		sMapKey = "CopiarGuardarIvasVentas";
		inputMap = this.jButtonCopiarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGuardarIvasVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGuardarIvasVentas"));
		
		//VEr FORM
		sMapKey = "VerFormGuardarIvasVentas";
		inputMap = this.jButtonVerFormGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGuardarIvasVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGuardarIvasVentas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGuardarIvasVentas";
		inputMap = this.jButtonNuevoRelacionesGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGuardarIvasVentas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGuardarIvasVentas";
		inputMap = this.jButtonModificarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGuardarIvasVentas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGuardarIvasVentas";
		inputMap = this.jButtonCerrarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGuardarIvasVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGuardarIvasVentas";
		inputMap = this.jButtonGuardarCambiosTablaGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGuardarIvasVentas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GuardarIvasVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GuardarIvasVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GuardarIvasVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GuardarIvasVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GuardarIvasVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGuardarIvasVentas.setName("jPanelParametrosReportesGuardarIvasVentas"); 
		
		this.jPanelParametrosReportesAccionesGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGuardarIvasVentas.setName("jPanelParametrosReportesAccionesGuardarIvasVentas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGuardarIvasVentas = new JButtonMe();
		this.jButtonRecargarInformacionGuardarIvasVentas.setText("Buscar");
		this.jButtonRecargarInformacionGuardarIvasVentas.setToolTipText("Buscar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGuardarIvasVentas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionGuardarIvasVentas.setVisible(false);
		
		
		this.jButtonProcesarInformacionGuardarIvasVentas = new JButtonMe();
		this.jButtonProcesarInformacionGuardarIvasVentas.setText("Procesar");
		this.jButtonProcesarInformacionGuardarIvasVentas.setToolTipText("Procesar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGuardarIvasVentas.setVisible(false);
			
		this.jButtonProcesarInformacionGuardarIvasVentas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGuardarIvasVentas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGuardarIvasVentas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuardarIvasVentas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGuardarIvasVentas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuardarIvasVentas.setText("TIPO");       
		this.jComboBoxTiposReportesGuardarIvasVentas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuardarIvasVentas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGuardarIvasVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGuardarIvasVentas.setText("Paginacion");
		this.jComboBoxTiposPaginacionGuardarIvasVentas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGuardarIvasVentas.setText("Accion");
		this.jComboBoxTiposRelacionesGuardarIvasVentas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGuardarIvasVentas.setText("Accion");
		this.jComboBoxTiposAccionesGuardarIvasVentas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGuardarIvasVentas.setText("Accion");
		this.jComboBoxTiposSeleccionarGuardarIvasVentas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGuardarIvasVentas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGuardarIvasVentas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGuardarIvasVentas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGuardarIvasVentas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGuardarIvasVentas = new JLabelMe();
		
		this.jLabelAccionesGuardarIvasVentas.setText("Acciones");		
		this.jLabelAccionesGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGuardarIvasVentas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGuardarIvasVentas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGuardarIvasVentas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGuardarIvasVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGuardarIvasVentas.setText("Graf.");
		this.jCheckBoxConGraficoReporteGuardarIvasVentas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGuardarIvasVentas = new JButtonMe();
		//this.jButtonAnterioresGuardarIvasVentas.setText("<<");
        this.jButtonAnterioresGuardarIvasVentas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGuardarIvasVentas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGuardarIvasVentas = new JButtonMe();
		//this.jButtonSiguientesGuardarIvasVentas.setText(">>");
        this.jButtonSiguientesGuardarIvasVentas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGuardarIvasVentas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGuardarIvasVentas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGuardarIvasVentas.setText("Nue");
        this.jButtonNuevoGuardarCambiosGuardarIvasVentas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGuardarIvasVentas,"nuevoguardarcambios_button","Nue",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGuardarIvasVentas";
		inputMap = this.jButtonNuevoGuardarCambiosGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGuardarIvasVentas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGuardarIvasVentas";
		inputMap = this.jButtonRecargarInformacionGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGuardarIvasVentas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGuardarIvasVentas";
		inputMap = this.jButtonSiguientesGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGuardarIvasVentas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGuardarIvasVentas";
		inputMap = this.jButtonAnterioresGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGuardarIvasVentas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGuardarIvasVentas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGuardarIvasVentas.setMinimumSize(new Dimension(this.getWidth(),GuardarIvasVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuardarIvasVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGuardarIvasVentas.setMaximumSize(new Dimension(this.getWidth(),GuardarIvasVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuardarIvasVentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGuardarIvasVentas.setPreferredSize(new Dimension(this.getWidth(),GuardarIvasVentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuardarIvasVentasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGuardarIvasVentas = new GridBagLayout();

			this.jPanelPaginacionGuardarIvasVentas.setLayout(gridaBagLayoutPaginacionGuardarIvasVentas);						
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonAnterioresGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
					
						
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
			
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonNuevoGuardarCambiosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
						
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonSiguientesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 1;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonNuevoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
						
			
			
			if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
				this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGuardarIvasVentas.gridy = 1;
				this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonGuardarCambiosTablaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			}
			
			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 1;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonDuplicarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 1;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonCopiarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 1;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonVerFormGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 1;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGuardarIvasVentas.add(this.jButtonCerrarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		
		this.jButtonRecargarInformacionGuardarIvasVentas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGuardarIvasVentas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGuardarIvasVentas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGuardarIvasVentas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGuardarIvasVentas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGuardarIvasVentas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGuardarIvasVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGuardarIvasVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGuardarIvasVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGuardarIvasVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGuardarIvasVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGuardarIvasVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGuardarIvasVentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGuardarIvasVentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGuardarIvasVentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGuardarIvasVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuardarIvasVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGuardarIvasVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGuardarIvasVentas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGuardarIvasVentas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGuardarIvasVentas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGuardarIvasVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGuardarIvasVentas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGuardarIvasVentas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGuardarIvasVentas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGuardarIvasVentas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGuardarIvasVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGuardarIvasVentas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GuardarIvasVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GuardarIvasVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GuardarIvasVentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GuardarIvasVentas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGuardarIvasVentas.setLayout(gridaBagParametrosReportesGuardarIvasVentas);
			this.jPanelParametrosReportesAccionesGuardarIvasVentas.setLayout(gridaBagParametrosReportesAccionesGuardarIvasVentas);
			
			
			this.jPanelParametrosAuxiliar1GuardarIvasVentas.setLayout(gridaBagParametrosAuxiliar1GuardarIvasVentas);
			this.jPanelParametrosAuxiliar2GuardarIvasVentas.setLayout(gridaBagParametrosAuxiliar2GuardarIvasVentas);
			this.jPanelParametrosAuxiliar3GuardarIvasVentas.setLayout(gridaBagParametrosAuxiliar3GuardarIvasVentas);
			this.jPanelParametrosAuxiliar4GuardarIvasVentas.setLayout(gridaBagParametrosAuxiliar4GuardarIvasVentas);
			//this.jPanelParametrosAuxiliar5GuardarIvasVentas.setLayout(gridaBagParametrosAuxiliar2GuardarIvasVentas);			
			
			
			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jButtonRecargarInformacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuardarIvasVentas.add(this.jComboBoxTiposPaginacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuardarIvasVentas.add(this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuardarIvasVentas.add(this.jComboBoxTiposArchivosReportesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jPanelParametrosAuxiliar1GuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GuardarIvasVentas.add(this.jComboBoxTiposReportesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);																		
			
			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GuardarIvasVentas.add(this.jComboBoxTiposGraficosReportesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jPanelParametrosAuxiliar4GuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jComboBoxTiposReportesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jCheckBoxGenerarReporteGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jPanelParametrosAuxiliar2GuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jLabelAccionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
				this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGuardarIvasVentas.add(this.jButtonAbrirOrderByGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jComboBoxTiposSeleccionarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
			
			
			/*
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jCheckBoxSeleccionarTodosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jCheckBoxConGraficoReporteGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuardarIvasVentas.add(this.jCheckBoxSeleccionarTodosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);															
				
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuardarIvasVentas.add(this.jCheckBoxSeleccionadosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);															
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuardarIvasVentas.add(this.jCheckBoxConGraficoReporteGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jPanelParametrosAuxiliar3GuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuardarIvasVentas.add(this.jComboBoxTiposAccionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGuardarIvasVentas = new GridBagLayout();

			this.jScrollPanelDatosGuardarIvasVentas.setLayout(gridaBagLayoutDatosGuardarIvasVentas);
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
			this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
			
			this.jScrollPanelDatosGuardarIvasVentas.add(this.jTableDatosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGuardarIvasVentas.setViewportView(this.jTableDatosGuardarIvasVentas);
		this.jTableDatosGuardarIvasVentas.setFillsViewportHeight(true);
		this.jTableDatosGuardarIvasVentas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGuardarIvasVentas= new GridBagLayout();
		this.jPanelAccionesGuardarIvasVentas.setLayout(gridaBagLayoutAccionesGuardarIvasVentas);
		
		
		/*	
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
			
		this.jPanelAccionesGuardarIvasVentas.add(this.jButtonNuevoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaGuardarIvasVentasGuardarIvasVentas= new GridBagLayout();
		gridaBagLayoutBusquedaGuardarIvasVentasGuardarIvasVentas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaGuardarIvasVentasGuardarIvasVentas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaGuardarIvasVentasGuardarIvasVentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaGuardarIvasVentasGuardarIvasVentas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.setLayout(gridaBagLayoutBusquedaGuardarIvasVentasGuardarIvasVentas);

		gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuardarIvasVentas.gridy = 0;
		gridBagConstraintsGuardarIvasVentas.gridx = 0;
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.add(jLabelid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);

		gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuardarIvasVentas.gridy = 0;
		gridBagConstraintsGuardarIvasVentas.gridx = 1;
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.add(jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);


		gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuardarIvasVentas.gridy = 1;
		gridBagConstraintsGuardarIvasVentas.gridx = 0;
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.add(jLabelid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);

		gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuardarIvasVentas.gridy = 1;
		gridBagConstraintsGuardarIvasVentas.gridx = 1;
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.add(jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);


		gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuardarIvasVentas.gridy = 2;
		gridBagConstraintsGuardarIvasVentas.gridx = 0;
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.add(jLabelid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);

		gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuardarIvasVentas.gridy = 2;
		gridBagConstraintsGuardarIvasVentas.gridx = 1;
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.add(jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);

		gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuardarIvasVentas.gridy = 3;
		gridBagConstraintsGuardarIvasVentas.gridx =1;
		jPanelBusquedaGuardarIvasVentasGuardarIvasVentas.add(jButtonBusquedaGuardarIvasVentasGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);

		jTabbedPaneBusquedasGuardarIvasVentas.addTab("1.-Por Ejercicio Por Periodo Por Tipo Retencion Fuente Iva ", jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);
		jTabbedPaneBusquedasGuardarIvasVentas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGuardarIvasVentas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();						
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuardarIvasVentas.gridx = 0;		
			//this.gridBagConstraintsGuardarIvasVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGuardarIvasVentas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;		
		//this.gridBagConstraintsGuardarIvasVentas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGuardarIvasVentas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuardarIvasVentas.gridx = 0;		
			this.gridBagConstraintsGuardarIvasVentas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGuardarIvasVentas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);								
		
		
		/*
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		*/		
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGuardarIvasVentas.gridx =0;
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGuardarIvasVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
				
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGuardarIvasVentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGuardarIvasVentas = new GridBagLayout();
			this.jPanelBusquedasParametrosGuardarIvasVentas.setLayout(gridaBagLayoutBusquedasParametrosGuardarIvasVentas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGuardarIvasVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGuardarIvasVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuardarIvasVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuardarIvasVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			
			
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
			
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGuardarIvasVentas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGuardarIvasVentas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGuardarIvasVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGuardarIvasVentas.setName("jPanelReporteDinamicoGuardarIvasVentas"); 
		
		this.jPanelReporteDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGuardarIvasVentas.setLayout(gridaBagLayoutReporteDinamicoGuardarIvasVentas);
		
		
		this.jInternalFrameReporteDinamicoGuardarIvasVentas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGuardarIvasVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGuardarIvasVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGuardarIvasVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGuardarIvasVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGuardarIvasVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGuardarIvasVentas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGuardarIvasVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGuardarIvasVentas.setResizable(true);
	    this.jInternalFrameReporteDinamicoGuardarIvasVentas.setClosable(true);
	    this.jInternalFrameReporteDinamicoGuardarIvasVentas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guardar Ivas Ventases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGuardarIvasVentas = new JLabelMe();

		this.jLabelColumnasSelectReporteGuardarIvasVentas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelColumnasSelectReporteGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGuardarIvasVentas = new JList<Reporte>();
		this.jListColumnasSelectReporteGuardarIvasVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGuardarIvasVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGuardarIvasVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGuardarIvasVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGuardarIvasVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGuardarIvasVentas=new JScrollPane(this.jListColumnasSelectReporteGuardarIvasVentas);
			
			this.jScrollColumnasSelectReporteGuardarIvasVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGuardarIvasVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGuardarIvasVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jListColumnasSelectReporteGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jScrollColumnasSelectReporteGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGuardarIvasVentas = new JLabelMe();

		this.jLabelRelacionesSelectReporteGuardarIvasVentas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGuardarIvasVentas = new JList<Reporte>();
		this.jListRelacionesSelectReporteGuardarIvasVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGuardarIvasVentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGuardarIvasVentas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGuardarIvasVentas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGuardarIvasVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGuardarIvasVentas=new JScrollPane(this.jListRelacionesSelectReporteGuardarIvasVentas);
			
			this.jScrollRelacionesSelectReporteGuardarIvasVentas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGuardarIvasVentas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGuardarIvasVentas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoGuardarIvasVentas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas = new JComboBoxMe();
		this.jListColumnasValoresGraficoGuardarIvasVentas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGuardarIvasVentas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGuardarIvasVentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGuardarIvasVentas = new JLabelMe();

		this.jLabelConGraficoDinamicoGuardarIvasVentas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelConGraficoDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGuardarIvasVentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGuardarIvasVentas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGuardarIvasVentas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jCheckBoxConGraficoDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGuardarIvasVentas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGuardarIvasVentas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelColumnaCategoriaGraficoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGuardarIvasVentas = new JLabelMe();

		this.jLabelColumnaCategoriaValorGuardarIvasVentas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelColumnaCategoriaValorGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGuardarIvasVentas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGuardarIvasVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGuardarIvasVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jComboBoxColumnaCategoriaValorGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGuardarIvasVentas = new JLabelMe();

		this.jLabelColumnasValoresGraficoGuardarIvasVentas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelColumnasValoresGraficoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGuardarIvasVentas = new JList<Reporte>();
		this.jListColumnasValoresGraficoGuardarIvasVentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGuardarIvasVentas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGuardarIvasVentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGuardarIvasVentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGuardarIvasVentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGuardarIvasVentas=new JScrollPane(this.jListColumnasValoresGraficoGuardarIvasVentas);
			
			this.jScrollColumnasValoresGraficoGuardarIvasVentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGuardarIvasVentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGuardarIvasVentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jListColumnasSelectReporteGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jScrollColumnasValoresGraficoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGuardarIvasVentas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGuardarIvasVentas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelTiposGraficosReportesDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGuardarIvasVentas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGuardarIvasVentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jComboBoxTiposGraficosReportesDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGuardarIvasVentas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGuardarIvasVentas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelGenerarExcelReporteDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentas.setToolTipText("Generar EXCEL"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jComboBoxTiposReportesDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGuardarIvasVentas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGuardarIvasVentas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jLabelTiposArchivoReporteDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jComboBoxTiposArchivosReportesDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGuardarIvasVentas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGuardarIvasVentas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGuardarIvasVentas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGuardarIvasVentas.setToolTipText("Generar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jButtonGenerarReporteDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGuardarIvasVentas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGuardarIvasVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGuardarIvasVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGuardarIvasVentas.setToolTipText("Cancelar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuardarIvasVentas.add(this.jButtonCerrarReporteDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGuardarIvasVentas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGuardarIvasVentas= new JScrollPane(jPanelReporteDinamicoGuardarIvasVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGuardarIvasVentas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGuardarIvasVentas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGuardarIvasVentas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guardar Ivas Ventases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGuardarIvasVentas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGuardarIvasVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGuardarIvasVentas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGuardarIvasVentas);
		this.jInternalFrameReporteDinamicoGuardarIvasVentas.getContentPane().add(this.jScrollPanelReporteDinamicoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGuardarIvasVentas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGuardarIvasVentas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGuardarIvasVentas.setName("jPanelImportacionGuardarIvasVentas"); 
		
		this.jPanelImportacionGuardarIvasVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGuardarIvasVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGuardarIvasVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGuardarIvasVentas.setLayout(gridaBagLayoutImportacionGuardarIvasVentas);
		
		
		this.jInternalFrameImportacionGuardarIvasVentas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGuardarIvasVentas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGuardarIvasVentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGuardarIvasVentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGuardarIvasVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGuardarIvasVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGuardarIvasVentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGuardarIvasVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGuardarIvasVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGuardarIvasVentas.setResizable(true);
	    this.jInternalFrameImportacionGuardarIvasVentas.setClosable(true);
	    this.jInternalFrameImportacionGuardarIvasVentas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGuardarIvasVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGuardarIvasVentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGuardarIvasVentas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGuardarIvasVentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGuardarIvasVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGuardarIvasVentas.setResizable(true);
	    this.jInternalFrameImportacionGuardarIvasVentas.setClosable(true);
	    this.jInternalFrameImportacionGuardarIvasVentas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGuardarIvasVentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGuardarIvasVentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGuardarIvasVentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guardar Ivas Ventases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGuardarIvasVentas = new JLabelMe();

		this.jLabelArchivoImportacionGuardarIvasVentas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGuardarIvasVentas.add(this.jLabelArchivoImportacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGuardarIvasVentas = new JFileChooser();		
		this.jFileChooserImportacionGuardarIvasVentas.setToolTipText("ESCOGER ARCHIVO"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGuardarIvasVentas = new JButtonMe();
		this.jButtonAbrirImportacionGuardarIvasVentas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGuardarIvasVentas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGuardarIvasVentas.setToolTipText("Generar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuardarIvasVentas.add(this.jButtonAbrirImportacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGuardarIvasVentas = new JLabelMe();

		this.jLabelPathArchivoImportacionGuardarIvasVentas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGuardarIvasVentas.add(this.jLabelPathArchivoImportacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGuardarIvasVentas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGuardarIvasVentas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGuardarIvasVentas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGuardarIvasVentas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuardarIvasVentas.add(this.jTextFieldPathArchivoImportacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGuardarIvasVentas = new JButtonMe();
		this.jButtonGenerarImportacionGuardarIvasVentas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGuardarIvasVentas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGuardarIvasVentas.setToolTipText("Generar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuardarIvasVentas.add(this.jButtonGenerarImportacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGuardarIvasVentas = new JButtonMe();
		this.jButtonCerrarImportacionGuardarIvasVentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGuardarIvasVentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGuardarIvasVentas.setToolTipText("Cancelar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYImportacion;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuardarIvasVentas.add(this.jButtonCerrarImportacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGuardarIvasVentas = new GridBagLayout();
		
		this.jScrollPanelImportacionGuardarIvasVentas= new JScrollPane(jPanelImportacionGuardarIvasVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy =iPosYImportacion;
		this.gridBagConstraintsGuardarIvasVentas.gridx =iPosXImportacion;
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGuardarIvasVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGuardarIvasVentas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGuardarIvasVentas);
		this.jInternalFrameImportacionGuardarIvasVentas.getContentPane().add(this.jScrollPanelImportacionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGuardarIvasVentas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGuardarIvasVentas = new JButtonMe();
			this.jButtonAbrirOrderByGuardarIvasVentas.setText("Orden");
			this.jButtonAbrirOrderByGuardarIvasVentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGuardarIvasVentas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGuardarIvasVentas";
			inputMap = this.jButtonAbrirOrderByGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGuardarIvasVentas"));
		
		
			GridBagLayout gridaBagLayoutOrderByGuardarIvasVentas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGuardarIvasVentas.setName("jPanelOrderByGuardarIvasVentas"); 
			
			this.jPanelOrderByGuardarIvasVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGuardarIvasVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGuardarIvasVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGuardarIvasVentas.setLayout(gridaBagLayoutOrderByGuardarIvasVentas);
			
			
			this.jTableDatosGuardarIvasVentasOrderBy = new JTableMe();        
			this.jTableDatosGuardarIvasVentasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGuardarIvasVentasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGuardarIvasVentasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGuardarIvasVentasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGuardarIvasVentasOrderBy.setViewportView(this.jTableDatosGuardarIvasVentasOrderBy);
			this.jTableDatosGuardarIvasVentasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGuardarIvasVentasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGuardarIvasVentas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGuardarIvasVentas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGuardarIvasVentas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGuardarIvasVentas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGuardarIvasVentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGuardarIvasVentas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGuardarIvasVentas.setTitle("Orden");
			this.jInternalFrameOrderByGuardarIvasVentas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGuardarIvasVentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGuardarIvasVentas.setResizable(true);
			this.jInternalFrameOrderByGuardarIvasVentas.setClosable(true);
			this.jInternalFrameOrderByGuardarIvasVentas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGuardarIvasVentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGuardarIvasVentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGuardarIvasVentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guardar Ivas Ventases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGuardarIvasVentas.ipady =150;
				
			this.jPanelOrderByGuardarIvasVentas.add(jScrollPanelDatosGuardarIvasVentasOrderBy, this.gridBagConstraintsGuardarIvasVentas);//this.jTableDatosGuardarIvasVentasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGuardarIvasVentas = new JButtonMe();
			this.jButtonCerrarOrderByGuardarIvasVentas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGuardarIvasVentas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGuardarIvasVentas.setToolTipText("Cancelar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGuardarIvasVentas.add(this.jButtonCerrarOrderByGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGuardarIvasVentas = new GridBagLayout();
			
			this.jScrollPanelOrderByGuardarIvasVentas= new JScrollPane(jPanelOrderByGuardarIvasVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridy =iPosYOrderBy;
			this.gridBagConstraintsGuardarIvasVentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGuardarIvasVentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGuardarIvasVentas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGuardarIvasVentas);
			
			this.jInternalFrameOrderByGuardarIvasVentas.getContentPane().add(this.jScrollPanelOrderByGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
		
		} else {
			this.jButtonAbrirOrderByGuardarIvasVentas = new JButtonMe();
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
		//	&& this.guardarivasventasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGuardarIvasVentas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosGuardarIvasVentas.getRowHeight();//GuardarIvasVentasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas.isSelected()) {
					iHeightTable=GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGuardarIvasVentas.isSelected()) {
					iHeightTable=GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GuardarIvasVentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGuardarIvasVentas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGuardarIvasVentas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGuardarIvasVentas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGuardarIvasVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGuardarIvasVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGuardarIvasVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGuardarIvasVentas!=null && this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy()!=null) {
			//if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGuardarIvasVentas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGuardarIvasVentas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGuardarIvasVentas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGuardarIvasVentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGuardarIvasVentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGuardarIvasVentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=guardarivasventasLogic.getGuardarIvasVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=guardarivasventass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GuardarIvasVentas> TraerGuardarIvasVentasBeans(List<GuardarIvasVentas> guardarivasventass,ArrayList<Classe> classes)throws Exception {
		try {
			for(GuardarIvasVentas guardarivasventas:guardarivasventass) {
					
				if(!(GuardarIvasVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GuardarIvasVentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					guardarivasventas.setsDetalleGeneralEntityReporte(GuardarIvasVentasConstantesFunciones.getGuardarIvasVentasDescripcion(guardarivasventas));
										
						
					
						
					
				} else  {
							
					//guardarivasventas.setsDetalleGeneralEntityReporte(guardarivasventas.getsDetalleGeneralEntityReporte());
										
				}
				
				//guardarivasventasbeans.add(guardarivasventasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return guardarivasventass;
    }
	//PARA REPORTES FIN
}
