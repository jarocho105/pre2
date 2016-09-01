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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.CreditosPendientesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class CreditosPendientesJInternalFrame extends CreditosPendientesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCreditosPendientes;
	
	protected JMenuBar jmenuBarCreditosPendientes;
	
	protected JMenu jmenuCreditosPendientes;
	protected JMenu jmenuDatosCreditosPendientes;
	protected JMenu jmenuArchivoCreditosPendientes;
	protected JMenu jmenuAccionesCreditosPendientes;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCreditosPendientes;	
	protected GridBagConstraints gridBagConstraintsCreditosPendientes;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CreditosPendientesDetalleFormJInternalFrame jInternalFrameDetalleFormCreditosPendientes;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCreditosPendientes;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCreditosPendientes;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public CreditosPendientesSessionBean creditospendientesSessionBean;
		
	
	
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CreditosPendientes> creditospendientess;		
	public List<CreditosPendientes> creditospendientessEliminados;	
	public List<CreditosPendientes> creditospendientessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCreditosPendientes;		
	protected JButton jButtonAbrirOrderByCreditosPendientes;
	
	
	//protected JPanel jPanelOrderByCreditosPendientes;
	//public JScrollPane jScrollPanelOrderByCreditosPendientes;	
	//protected JButton jButtonCerrarOrderByCreditosPendientes;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CreditosPendientesLogic creditospendientesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCreditosPendientes;
	public JScrollPane jScrollPanelDatosEdicionCreditosPendientes;
	public JScrollPane jScrollPanelDatosGeneralCreditosPendientes;
    
	
	
	//public JScrollPane jScrollPanelDatosCreditosPendientesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCreditosPendientes;
	//public JScrollPane jScrollPanelImportacionCreditosPendientes;
	
	
	
	protected JPanel jPanelAccionesCreditosPendientes;
	
    protected JPanel jPanelPaginacionCreditosPendientes;
    protected JPanel jPanelParametrosReportesCreditosPendientes;
	protected JPanel jPanelParametrosReportesAccionesCreditosPendientes;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CreditosPendientes;
	protected JPanel jPanelParametrosAuxiliar2CreditosPendientes;
	protected JPanel jPanelParametrosAuxiliar3CreditosPendientes;
	protected JPanel jPanelParametrosAuxiliar4CreditosPendientes;
	//protected JPanel jPanelParametrosAuxiliar5CreditosPendientes;
	
	
	
	//protected JPanel jPanelReporteDinamicoCreditosPendientes;
	//protected JPanel jPanelImportacionCreditosPendientes;
	
	
	public JTable jTableDatosCreditosPendientes;
	
	
	
	//public JTable jTableDatosCreditosPendientesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCreditosPendientes;
	protected JButton jButtonDuplicarCreditosPendientes;
	protected JButton jButtonCopiarCreditosPendientes;
	protected JButton jButtonVerFormCreditosPendientes;
	protected JButton jButtonNuevoRelacionesCreditosPendientes;
	protected JButton jButtonModificarCreditosPendientes;
	
    protected JButton jButtonGuardarCambiosTablaCreditosPendientes;
	protected JButton jButtonCerrarCreditosPendientes;
	
	
	protected JButton jButtonRecargarInformacionCreditosPendientes;
	protected JButton jButtonProcesarInformacionCreditosPendientes;
	
	
	protected JButton jButtonAnterioresCreditosPendientes;
	protected JButton jButtonSiguientesCreditosPendientes;
	protected JButton jButtonNuevoGuardarCambiosCreditosPendientes;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCreditosPendientes;
	//protected JButton jButtonCerrarReporteDinamicoCreditosPendientes;
	//protected JButton jButtonGenerarExcelReporteDinamicoCreditosPendientes;	
	
	
	
	//protected JButton jButtonAbrirImportacionCreditosPendientes;
	//protected JButton jButtonGenerarImportacionCreditosPendientes;
	//protected JButton jButtonCerrarImportacionCreditosPendientes;
	//protected JFileChooser jFileChooserImportacionCreditosPendientes;
	//protected File fileImportacionCreditosPendientes;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCreditosPendientes;
	protected JButton jButtonDuplicarToolBarCreditosPendientes;
	protected JButton jButtonNuevoRelacionesToolBarCreditosPendientes;
	
	
	public JButton jButtonGuardarCambiosToolBarCreditosPendientes;
	protected JButton jButtonCopiarToolBarCreditosPendientes;
	protected JButton jButtonVerFormToolBarCreditosPendientes;
	public JButton jButtonGuardarCambiosTablaToolBarCreditosPendientes;
	protected JButton jButtonMostrarOcultarTablaToolBarCreditosPendientes;
	protected JButton jButtonCerrarToolBarCreditosPendientes;
	
	protected JButton jButtonRecargarInformacionToolBarCreditosPendientes;
	protected JButton jButtonProcesarInformacionToolBarCreditosPendientes;
	protected JButton jButtonAnterioresToolBarCreditosPendientes;
	protected JButton jButtonSiguientesToolBarCreditosPendientes;
	protected JButton jButtonNuevoGuardarCambiosToolBarCreditosPendientes;
	protected JButton jButtonAbrirOrderByToolBarCreditosPendientes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCreditosPendientes;
	protected JMenuItem jMenuItemDuplicarCreditosPendientes;
	protected JMenuItem jMenuItemNuevoRelacionesCreditosPendientes;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCreditosPendientes;
	protected JMenuItem jMenuItemCopiarCreditosPendientes;
	protected JMenuItem jMenuItemVerFormCreditosPendientes;
	protected JMenuItem jMenuItemGuardarCambiosTablaCreditosPendientes;
	protected JMenuItem jMenuItemCerrarCreditosPendientes;
	protected JMenuItem jMenuItemDetalleCerrarCreditosPendientes;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCreditosPendientes;
	protected JMenuItem jMenuItemDetalleMostarOcultarCreditosPendientes;
	
	protected JMenuItem jMenuItemRecargarInformacionCreditosPendientes;
	protected JMenuItem jMenuItemProcesarInformacionCreditosPendientes;
	protected JMenuItem jMenuItemAnterioresCreditosPendientes;
	protected JMenuItem jMenuItemSiguientesCreditosPendientes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCreditosPendientes;
	protected JMenuItem jMenuItemAbrirOrderByCreditosPendientes;
	protected JMenuItem jMenuItemMostrarOcultarCreditosPendientes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCreditosPendientes;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCreditosPendientes;
	protected JCheckBox jCheckBoxSeleccionadosCreditosPendientes;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCreditosPendientes;
	protected JCheckBox jCheckBoxConGraficoReporteCreditosPendientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCreditosPendientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCreditosPendientes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCreditosPendientes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCreditosPendientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCreditosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCreditosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCreditosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCreditosPendientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCreditosPendientes;
	protected JTextField jTextFieldValorCampoGeneralCreditosPendientes;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCreditosPendientes;
	//public JList<Reporte> jListColumnasSelectReporteCreditosPendientes;
	//public JScrollPane jScrollColumnasSelectReporteCreditosPendientes;
	
	//public JLabel jLabelRelacionesSelectReporteCreditosPendientes;
	//public JList<Reporte> jListRelacionesSelectReporteCreditosPendientes;
	//public JScrollPane jScrollRelacionesSelectReporteCreditosPendientes;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCreditosPendientes;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCreditosPendientes;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCreditosPendientes;
	//public JLabel jLabelTiposArchivoReporteDinamicoCreditosPendientes;
	
		
	//public JLabel jLabelArchivoImportacionCreditosPendientes;	
	//public JLabel jLabelPathArchivoImportacionCreditosPendientes;
	//protected JTextField jTextFieldPathArchivoImportacionCreditosPendientes;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCreditosPendientes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCreditosPendientes;
	
	//public JLabel jLabelColumnaCategoriaValorCreditosPendientes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCreditosPendientes;
	
	//public JLabel jLabelColumnasValoresGraficoCreditosPendientes;
	//public JList<Reporte> jListColumnasValoresGraficoCreditosPendientes;
	//public JScrollPane jScrollColumnasValoresGraficoCreditosPendientes;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCreditosPendientes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCreditosPendientes;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCreditosPendientes;
	public JPanel jPanelBusquedaCreditosPendientesCreditosPendientes;
	public JButton jButtonBusquedaCreditosPendientesCreditosPendientes;
	
	public JPanel jPanelid_cargoBusquedaCreditosPendientesCreditosPendientes;
	public JLabel jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes;
	public JButton jButtonid_cargoBusquedaCreditosPendientesCreditosPendientes= new JButtonMe();
	public JButton jButtonid_cargoBusquedaCreditosPendientesCreditosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_cargoBusquedaCreditosPendientesCreditosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaCreditosPendientesCreditosPendientes;
	public JLabel jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes;
	public JButton jButtonid_estructuraBusquedaCreditosPendientesCreditosPendientes= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaCreditosPendientesCreditosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaCreditosPendientesCreditosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoBusquedaCreditosPendientesCreditosPendientes;
	public JLabel jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes;
	public JButton jButtonid_empleadoBusquedaCreditosPendientesCreditosPendientes= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaCreditosPendientesCreditosPendientesUpdate= new JButtonMe();
	public JButton jButtonid_empleadoBusquedaCreditosPendientesCreditosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes;
	public JLabel jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes;
	//public JFormattedTextField jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes;

	public JDateChooser jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes;
	public JButton jButtonfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes;
	public JLabel jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes;
	//public JFormattedTextField jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes;

	public JDateChooser jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes;
	public JButton jButtonfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CreditosPendientesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosPendientesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosPendientesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CreditosPendientesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCreditosPendientes)	{
		this.jButtonRecargarInformacionCreditosPendientes = jButtonRecargarInformacionCreditosPendientes;
	}
	
	public JButton getjButtonProcesarInformacionCreditosPendientes() {
		return this.jButtonProcesarInformacionCreditosPendientes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCreditosPendientes)	{
		this.jButtonProcesarInformacionCreditosPendientes = jButtonProcesarInformacionCreditosPendientes;
	}
	
	
	public JButton getjButtonRecargarInformacionCreditosPendientes() {
		return this.jButtonRecargarInformacionCreditosPendientes;
	}
	
	
	public List<CreditosPendientes> getcreditospendientess() {
		return this.creditospendientess;
	}

	public void setcreditospendientess(List<CreditosPendientes> creditospendientess) {
		this.creditospendientess = creditospendientess;
	}
	
	public List<CreditosPendientes> getcreditospendientessAux() {
		return this.creditospendientessAux;
	}

	public void setcreditospendientessAux(List<CreditosPendientes> creditospendientessAux) {
		this.creditospendientessAux = creditospendientessAux;
	}
	
	public List<CreditosPendientes> getcreditospendientessEliminados() {
		return this.creditospendientessEliminados;
	}

	public void setCreditosPendientessEliminados(List<CreditosPendientes> creditospendientessEliminados) {
		this.creditospendientessEliminados = creditospendientessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCreditosPendientes() {
		return jComboBoxTiposSeleccionarCreditosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCreditosPendientes(
			JComboBox jComboBoxTiposSeleccionarCreditosPendientes) {
		this.jComboBoxTiposSeleccionarCreditosPendientes = jComboBoxTiposSeleccionarCreditosPendientes;
	}
	
	public void setBorderResaltarTiposSeleccionarCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCreditosPendientes .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCreditosPendientes() {
		return jTextFieldValorCampoGeneralCreditosPendientes;
	}

	public void setjTextFieldValorCampoGeneralCreditosPendientes(
			JTextField jTextFieldValorCampoGeneralCreditosPendientes) {
		this.jTextFieldValorCampoGeneralCreditosPendientes = jTextFieldValorCampoGeneralCreditosPendientes;
	}

	public void setBorderResaltarValorCampoGeneralCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCreditosPendientes .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCreditosPendientes() {
		return this.jCheckBoxSeleccionarTodosCreditosPendientes;
	}

	public void setjCheckBoxSeleccionarTodosCreditosPendientes(
			JCheckBox jCheckBoxSeleccionarTodosCreditosPendientes) {
		this.jCheckBoxSeleccionarTodosCreditosPendientes = jCheckBoxSeleccionarTodosCreditosPendientes;
	}

	public void setBorderResaltarSeleccionarTodosCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCreditosPendientes .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCreditosPendientes() {
		return this.jCheckBoxSeleccionadosCreditosPendientes;
	}

	public void setjCheckBoxSeleccionadosCreditosPendientes(
			JCheckBox jCheckBoxSeleccionadosCreditosPendientes) {
		this.jCheckBoxSeleccionadosCreditosPendientes = jCheckBoxSeleccionadosCreditosPendientes;
	}
	
	public void setBorderResaltarSeleccionadosCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCreditosPendientes .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCreditosPendientes() {
		return this.jComboBoxTiposArchivosReportesCreditosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCreditosPendientes(
			JComboBox jComboBoxTiposArchivosReportesCreditosPendientes) {
		this.jComboBoxTiposArchivosReportesCreditosPendientes = jComboBoxTiposArchivosReportesCreditosPendientes;
	}

	public void setBorderResaltarTiposArchivosReportesCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCreditosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCreditosPendientes() {
		return this.jComboBoxTiposReportesCreditosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCreditosPendientes(
			JComboBox jComboBoxTiposReportesCreditosPendientes) {
		this.jComboBoxTiposReportesCreditosPendientes = jComboBoxTiposReportesCreditosPendientes;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCreditosPendientes() {
	//	return jComboBoxTiposReportesDinamicoCreditosPendientes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCreditosPendientes(
	//		JComboBox jComboBoxTiposReportesDinamicoCreditosPendientes) {
	//	this.jComboBoxTiposReportesDinamicoCreditosPendientes = jComboBoxTiposReportesDinamicoCreditosPendientes;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCreditosPendientes() {
	//	return jComboBoxTiposArchivosReportesDinamicoCreditosPendientes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCreditosPendientes(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCreditosPendientes) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes = jComboBoxTiposArchivosReportesDinamicoCreditosPendientes;
	//}
	
	public void setBorderResaltarTiposReportesCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCreditosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCreditosPendientes() {
		return this.jComboBoxTiposGraficosReportesCreditosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCreditosPendientes(
			JComboBox jComboBoxTiposGraficosReportesCreditosPendientes) {
		this.jComboBoxTiposGraficosReportesCreditosPendientes = jComboBoxTiposGraficosReportesCreditosPendientes;
	}
	
	public void setBorderResaltarTiposGraficosReportesCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCreditosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCreditosPendientes() {
		return this.jComboBoxTiposPaginacionCreditosPendientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCreditosPendientes(
			JComboBox jComboBoxTiposPaginacionCreditosPendientes) {
		this.jComboBoxTiposPaginacionCreditosPendientes = jComboBoxTiposPaginacionCreditosPendientes;
	}
	
	public void setBorderResaltarTiposPaginacionCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCreditosPendientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCreditosPendientes() {
		return this.jComboBoxTiposRelacionesCreditosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCreditosPendientes() {
		return this.jComboBoxTiposAccionesCreditosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCreditosPendientes(
			JComboBox jComboBoxTiposRelacionesCreditosPendientes) {
		this.jComboBoxTiposRelacionesCreditosPendientes = jComboBoxTiposRelacionesCreditosPendientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCreditosPendientes(
			JComboBox jComboBoxTiposAccionesCreditosPendientes) {
		this.jComboBoxTiposAccionesCreditosPendientes = jComboBoxTiposAccionesCreditosPendientes;
	}
	
	public void setBorderResaltarTiposRelacionesCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCreditosPendientes .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCreditosPendientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCreditosPendientes .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCreditosPendientes() {
	//	return jCheckBoxConGraficoDinamicoCreditosPendientes;
	//}

	//public void setjCheckBoxConGraficoDinamicoCreditosPendientes(
	//		JCheckBox jCheckBoxConGraficoDinamicoCreditosPendientes) {
	//	this.jCheckBoxConGraficoDinamicoCreditosPendientes = jCheckBoxConGraficoDinamicoCreditosPendientes;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCreditosPendientes() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCreditosPendientes.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCreditosPendientes .setBorder(borderResaltar);		
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
		this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
		
		this.creditospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.creditospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.creditospendientesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CreditosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CreditosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CreditosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CreditosPendientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CreditosPendientesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Creditos Pendientes MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
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
		
		CreditosPendientesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CreditosPendientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCreditosPendientes= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"nuevo","nuevo","Nuevo"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"duplicar","duplicar","Duplicar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"copiar","copiar","Copiar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"ver_form","ver_form","Ver"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"recargar","recargar","Buscar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCreditosPendientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCreditosPendientes,this.jTtoolBarCreditosPendientes,
							"cerrar","cerrar","Salir"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCreditosPendientes=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCreditosPendientes;
			
				this.jButtonProcesarInformacionToolBarCreditosPendientes=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCreditosPendientes;
				
		//protected JButton jButtonModificarToolBarCreditosPendientes;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCreditosPendientes=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCreditosPendientes=new JMenuMe("General");
		this.jmenuArchivoCreditosPendientes=new JMenuMe("Archivo");
		this.jmenuAccionesCreditosPendientes=new JMenuMe("Acciones");
		this.jmenuDatosCreditosPendientes=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCreditosPendientes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCreditosPendientes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCreditosPendientes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCreditosPendientes= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCreditosPendientes.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCreditosPendientes,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCreditosPendientes= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCreditosPendientes.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCreditosPendientes,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCreditosPendientes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCreditosPendientes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCreditosPendientes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCreditosPendientes= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCreditosPendientes.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCreditosPendientes,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCreditosPendientes= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCreditosPendientes.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCreditosPendientes,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCreditosPendientes= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCreditosPendientes.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCreditosPendientes,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCreditosPendientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCreditosPendientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCreditosPendientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCreditosPendientes= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCreditosPendientes.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCreditosPendientes,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCreditosPendientes= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCreditosPendientes.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCreditosPendientes,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCreditosPendientes= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCreditosPendientes.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCreditosPendientes,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCreditosPendientes= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCreditosPendientes.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCreditosPendientes,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCreditosPendientes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCreditosPendientes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCreditosPendientes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCreditosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCreditosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCreditosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCreditosPendientes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCreditosPendientes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCreditosPendientes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCreditosPendientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCreditosPendientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCreditosPendientes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCreditosPendientes= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCreditosPendientes.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCreditosPendientes,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCreditosPendientes.add(this.jMenuItemCerrarCreditosPendientes);
			
			this.jmenuAccionesCreditosPendientes.add(this.jMenuItemNuevoCreditosPendientes);
			this.jmenuAccionesCreditosPendientes.add(this.jMenuItemNuevoGuardarCambiosCreditosPendientes);
			this.jmenuAccionesCreditosPendientes.add(this.jMenuItemNuevoRelacionesCreditosPendientes);
			this.jmenuAccionesCreditosPendientes.add(this.jMenuItemGuardarCambiosTablaCreditosPendientes);		
			this.jmenuAccionesCreditosPendientes.add(this.jMenuItemDuplicarCreditosPendientes);		
			this.jmenuAccionesCreditosPendientes.add(this.jMenuItemCopiarCreditosPendientes);		
			this.jmenuAccionesCreditosPendientes.add(this.jMenuItemVerFormCreditosPendientes);		
			
			this.jmenuDatosCreditosPendientes.add(this.jMenuItemRecargarInformacionCreditosPendientes);				
			this.jmenuDatosCreditosPendientes.add(this.jMenuItemAnterioresCreditosPendientes);				
			this.jmenuDatosCreditosPendientes.add(this.jMenuItemSiguientesCreditosPendientes);				
			this.jmenuDatosCreditosPendientes.add(this.jMenuItemAbrirOrderByCreditosPendientes);				
			this.jmenuDatosCreditosPendientes.add(this.jMenuItemMostrarOcultarCreditosPendientes);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCreditosPendientes.add(this.jMenuItemGuardarCambiosCreditosPendientes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCreditosPendientes.add(this.jmenuArchivoCreditosPendientes);		
			this.jmenuBarCreditosPendientes.add(this.jmenuAccionesCreditosPendientes);		
			this.jmenuBarCreditosPendientes.add(this.jmenuDatosCreditosPendientes);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCreditosPendientes);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCreditosPendientes() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCreditosPendientesCreditosPendientes=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCreditosPendientesCreditosPendientes.setToolTipText("Buscar Por Cargo Por Estructura Por Empleado Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ");
		this.jButtonBusquedaCreditosPendientesCreditosPendientes= new JButtonMe();
		this.jButtonBusquedaCreditosPendientesCreditosPendientes.setText("Buscar");
		this.jButtonBusquedaCreditosPendientesCreditosPendientes.setToolTipText("Buscar Por Cargo Por Estructura Por Empleado Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCreditosPendientesCreditosPendientes,"buscar_button","Buscar Por Cargo Por Estructura Por Empleado Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCreditosPendientesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes = new JLabelMe();
		jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes.setText("Cargo :");
		jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes.setToolTipText("Cargo");
		jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes= new JComboBoxMe();
		jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes = new JLabelMe();
		jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes.setText("Estructura :");
		jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes = new JLabelMe();
		jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes.setText("Empleado :");
		jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes.setToolTipText("Empleado");
		jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes= new JComboBoxMe();
		jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes = new JLabelMe();
		jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setText("Fecha Vencimiento Desde :");
		jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setToolTipText("Fecha Vencimiento Desde");
		jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes= new JDateChooser();
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setDate(new Date());
		jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes = new JLabelMe();
		jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setText("Fecha Vencimiento Hasta :");
		jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setToolTipText("Fecha Vencimiento Hasta");
		jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes= new JDateChooser();
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setDate(new Date());
		jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCreditosPendientes=new JTabbedPane();


		this.jTabbedPaneBusquedasCreditosPendientes.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasCreditosPendientes.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasCreditosPendientes.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCreditosPendientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCreditosPendientes = new CreditosPendientesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Creditos Pendientes DATOS");
			this.jInternalFrameDetalleFormCreditosPendientes = new CreditosPendientesDetalleFormJInternalFrame(jDesktopPane,this.creditospendientesSessionBean.getConGuardarRelaciones(),this.creditospendientesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCreditosPendientes = null;//new CreditosPendientesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCreditosPendientes= new GridBagLayout();
		
		
		this.jTableDatosCreditosPendientes = new JTableMe();      
		
		String sToolTipCreditosPendientes="";
		sToolTipCreditosPendientes=CreditosPendientesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCreditosPendientes+="(Nomina.CreditosPendientes)";
		}
		
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			sToolTipCreditosPendientes+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCreditosPendientes.setToolTipText(sToolTipCreditosPendientes);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCreditosPendientes);
		this.jTableDatosCreditosPendientes.setAutoCreateRowSorter(true);
		this.jTableDatosCreditosPendientes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCreditosPendientes.setRowSelectionAllowed(true);
		this.jTableDatosCreditosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCreditosPendientes,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCreditosPendientes = new JButtonMe();
		this.jButtonDuplicarCreditosPendientes = new JButtonMe();
		this.jButtonCopiarCreditosPendientes = new JButtonMe();
		this.jButtonVerFormCreditosPendientes = new JButtonMe();
		this.jButtonNuevoRelacionesCreditosPendientes = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCreditosPendientes = new JButtonMe();
		this.jButtonCerrarCreditosPendientes = new JButtonMe();
		
		this.jScrollPanelDatosCreditosPendientes = new JScrollPane();   
        this.jScrollPanelDatosGeneralCreditosPendientes = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Creditos Pendientes";
		
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Pendienteses" + this.sPath));
		} else {
			this.jScrollPanelDatosCreditosPendientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCreditosPendientes.setToolTipText("Acciones");
        this.jPanelAccionesCreditosPendientes.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCreditosPendientes=new ReporteDinamicoJInternalFrame(CreditosPendientesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCreditosPendientes();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCreditosPendientes=new ImportacionJInternalFrame(CreditosPendientesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCreditosPendientes();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCreditosPendientes = new JButtonMe();
		
		this.jButtonAbrirOrderByCreditosPendientes.setText("Orden");
		this.jButtonAbrirOrderByCreditosPendientes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCreditosPendientes,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCreditosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosPendientes,false,this);
			
			//this.cargarOrderByCreditosPendientes(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCreditosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosPendientes,true,this);
			
			//this.cargarOrderByCreditosPendientes(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCreditosPendientes.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosCreditosPendientes.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosCreditosPendientes.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosCreditosPendientes.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCreditosPendientes.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCreditosPendientes.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCreditosPendientes.setText("Nuevo");
		this.jButtonDuplicarCreditosPendientes.setText("Duplicar");
		this.jButtonCopiarCreditosPendientes.setText("Copiar");
		this.jButtonVerFormCreditosPendientes.setText("Ver");
		this.jButtonNuevoRelacionesCreditosPendientes.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCreditosPendientes.setText("Guardar");
		this.jButtonCerrarCreditosPendientes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCreditosPendientes,"nuevo_button","Nuevo",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCreditosPendientes,"duplicar_button","Duplicar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCreditosPendientes,"copiar_button","Copiar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCreditosPendientes,"ver_form","Ver",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCreditosPendientes,"nuevorelaciones_button","Nuevo Rel",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCreditosPendientes,"guardarcambiostabla_button","Guardar",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCreditosPendientes,"cerrar_button","Salir",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCreditosPendientes.setToolTipText("Nuevo"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCreditosPendientes.setToolTipText("Duplicar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCreditosPendientes.setToolTipText("Copiar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCreditosPendientes.setToolTipText("Ver"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCreditosPendientes.setToolTipText("Nuevo Rel"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCreditosPendientes.setToolTipText("Guardar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCreditosPendientes.setToolTipText("Salir"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCreditosPendientes";
		inputMap = this.jButtonNuevoCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCreditosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCreditosPendientes"));
		
		//DUPLICAR
		sMapKey = "DuplicarCreditosPendientes";
		inputMap = this.jButtonDuplicarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCreditosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCreditosPendientes"));
		
		//COPIAR
		sMapKey = "CopiarCreditosPendientes";
		inputMap = this.jButtonCopiarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCreditosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCreditosPendientes"));
		
		//VEr FORM
		sMapKey = "VerFormCreditosPendientes";
		inputMap = this.jButtonVerFormCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCreditosPendientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCreditosPendientes"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCreditosPendientes";
		inputMap = this.jButtonNuevoRelacionesCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCreditosPendientes"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCreditosPendientes";
		inputMap = this.jButtonModificarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCreditosPendientes"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCreditosPendientes";
		inputMap = this.jButtonCerrarCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCreditosPendientes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCreditosPendientes";
		inputMap = this.jButtonGuardarCambiosTablaCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCreditosPendientes"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CreditosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CreditosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CreditosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CreditosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CreditosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCreditosPendientes.setName("jPanelParametrosReportesCreditosPendientes"); 
		
		this.jPanelParametrosReportesAccionesCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCreditosPendientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCreditosPendientes.setName("jPanelParametrosReportesAccionesCreditosPendientes"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCreditosPendientes = new JButtonMe();
		this.jButtonRecargarInformacionCreditosPendientes.setText("Buscar");
		this.jButtonRecargarInformacionCreditosPendientes.setToolTipText("Buscar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCreditosPendientes,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCreditosPendientes.setVisible(false);
		
		
		this.jButtonProcesarInformacionCreditosPendientes = new JButtonMe();
		this.jButtonProcesarInformacionCreditosPendientes.setText("Procesar");
		this.jButtonProcesarInformacionCreditosPendientes.setToolTipText("Procesar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCreditosPendientes.setVisible(false);
			
		this.jButtonProcesarInformacionCreditosPendientes.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCreditosPendientes.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCreditosPendientes.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCreditosPendientes.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCreditosPendientes.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCreditosPendientes.setText("TIPO");       
		this.jComboBoxTiposReportesCreditosPendientes.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCreditosPendientes.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCreditosPendientes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCreditosPendientes.setText("Paginacion");
		this.jComboBoxTiposPaginacionCreditosPendientes.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCreditosPendientes.setText("Accion");
		this.jComboBoxTiposRelacionesCreditosPendientes.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCreditosPendientes.setText("Accion");
		this.jComboBoxTiposAccionesCreditosPendientes.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCreditosPendientes.setText("Accion");
		this.jComboBoxTiposSeleccionarCreditosPendientes.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCreditosPendientes=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCreditosPendientes.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCreditosPendientes.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCreditosPendientes.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCreditosPendientes = new JLabelMe();
		
		this.jLabelAccionesCreditosPendientes.setText("Acciones");		
		this.jLabelAccionesCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCreditosPendientes = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCreditosPendientes.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCreditosPendientes.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCreditosPendientes = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCreditosPendientes.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCreditosPendientes.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCreditosPendientes = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCreditosPendientes.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCreditosPendientes.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCreditosPendientes = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCreditosPendientes.setText("Graf.");
		this.jCheckBoxConGraficoReporteCreditosPendientes.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCreditosPendientes = new JButtonMe();
		//this.jButtonAnterioresCreditosPendientes.setText("<<");
        this.jButtonAnterioresCreditosPendientes.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCreditosPendientes,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCreditosPendientes = new JButtonMe();
		//this.jButtonSiguientesCreditosPendientes.setText(">>");
        this.jButtonSiguientesCreditosPendientes.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCreditosPendientes,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCreditosPendientes = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCreditosPendientes.setText("Nue");
        this.jButtonNuevoGuardarCambiosCreditosPendientes.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCreditosPendientes,"nuevoguardarcambios_button","Nue",this.creditospendientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCreditosPendientes";
		inputMap = this.jButtonNuevoGuardarCambiosCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCreditosPendientes"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCreditosPendientes";
		inputMap = this.jButtonRecargarInformacionCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCreditosPendientes"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCreditosPendientes";
		inputMap = this.jButtonSiguientesCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCreditosPendientes"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCreditosPendientes";
		inputMap = this.jButtonAnterioresCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCreditosPendientes"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCreditosPendientes();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCreditosPendientes.setMinimumSize(new Dimension(this.getWidth(),CreditosPendientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CreditosPendientesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCreditosPendientes.setMaximumSize(new Dimension(this.getWidth(),CreditosPendientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CreditosPendientesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCreditosPendientes.setPreferredSize(new Dimension(this.getWidth(),CreditosPendientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CreditosPendientesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCreditosPendientes = new GridBagLayout();

			this.jPanelPaginacionCreditosPendientes.setLayout(gridaBagLayoutPaginacionCreditosPendientes);						
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = 0;
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonAnterioresCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
					
						
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCreditosPendientes.gridy = 0;
			
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonNuevoGuardarCambiosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
						
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCreditosPendientes.gridy = 0;
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonSiguientesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = 1;
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonNuevoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
						
			
			
			if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
				this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCreditosPendientes.gridy = 1;
				this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCreditosPendientes.add(this.jButtonGuardarCambiosTablaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			}
			
			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = 1;
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonDuplicarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = 1;
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonCopiarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = 1;
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonVerFormCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = 1;
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCreditosPendientes.add(this.jButtonCerrarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		
		this.jButtonRecargarInformacionCreditosPendientes.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCreditosPendientes.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCreditosPendientes.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCreditosPendientes.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCreditosPendientes.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCreditosPendientes.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCreditosPendientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCreditosPendientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCreditosPendientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCreditosPendientes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCreditosPendientes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCreditosPendientes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCreditosPendientes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCreditosPendientes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCreditosPendientes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCreditosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCreditosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCreditosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCreditosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCreditosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCreditosPendientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCreditosPendientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCreditosPendientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCreditosPendientes.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCreditosPendientes.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCreditosPendientes.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCreditosPendientes.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCreditosPendientes.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCreditosPendientes.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCreditosPendientes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCreditosPendientes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCreditosPendientes.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCreditosPendientes.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCreditosPendientes.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCreditosPendientes.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCreditosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCreditosPendientes = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CreditosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CreditosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CreditosPendientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CreditosPendientes = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCreditosPendientes.setLayout(gridaBagParametrosReportesCreditosPendientes);
			this.jPanelParametrosReportesAccionesCreditosPendientes.setLayout(gridaBagParametrosReportesAccionesCreditosPendientes);
			
			
			this.jPanelParametrosAuxiliar1CreditosPendientes.setLayout(gridaBagParametrosAuxiliar1CreditosPendientes);
			this.jPanelParametrosAuxiliar2CreditosPendientes.setLayout(gridaBagParametrosAuxiliar2CreditosPendientes);
			this.jPanelParametrosAuxiliar3CreditosPendientes.setLayout(gridaBagParametrosAuxiliar3CreditosPendientes);
			this.jPanelParametrosAuxiliar4CreditosPendientes.setLayout(gridaBagParametrosAuxiliar4CreditosPendientes);
			//this.jPanelParametrosAuxiliar5CreditosPendientes.setLayout(gridaBagParametrosAuxiliar2CreditosPendientes);			
			
			
			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCreditosPendientes.add(this.jButtonRecargarInformacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CreditosPendientes.add(this.jComboBoxTiposPaginacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CreditosPendientes.add(this.jCheckBoxConAltoMaximoTablaCreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CreditosPendientes.add(this.jComboBoxTiposArchivosReportesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosPendientes.add(this.jPanelParametrosAuxiliar1CreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CreditosPendientes.add(this.jComboBoxTiposReportesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);																		
			
			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CreditosPendientes.add(this.jComboBoxTiposGraficosReportesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosPendientes.add(this.jPanelParametrosAuxiliar4CreditosPendientes, this.gridBagConstraintsCreditosPendientes);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosPendientes.add(this.jComboBoxTiposReportesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosPendientes.add(this.jCheckBoxGenerarReporteCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosPendientes.add(this.jPanelParametrosAuxiliar2CreditosPendientes, this.gridBagConstraintsCreditosPendientes);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosPendientes.add(this.jLabelAccionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
				this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCreditosPendientes.add(this.jButtonAbrirOrderByCreditosPendientes, this.gridBagConstraintsCreditosPendientes);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCreditosPendientes.add(this.jComboBoxTiposSeleccionarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
			
			
			/*
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosPendientes.add(this.jCheckBoxSeleccionarTodosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCreditosPendientes.add(this.jCheckBoxConGraficoReporteCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CreditosPendientes.add(this.jCheckBoxSeleccionarTodosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);															
				
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CreditosPendientes.add(this.jCheckBoxSeleccionadosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);															
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCreditosPendientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CreditosPendientes.add(this.jCheckBoxConGraficoReporteCreditosPendientes, this.gridBagConstraintsCreditosPendientes);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCreditosPendientes.add(this.jPanelParametrosAuxiliar3CreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCreditosPendientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCreditosPendientes.add(this.jComboBoxTiposAccionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCreditosPendientes = new GridBagLayout();

			this.jScrollPanelDatosCreditosPendientes.setLayout(gridaBagLayoutDatosCreditosPendientes);
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = 0;
			this.gridBagConstraintsCreditosPendientes.gridx = 0;
			
			this.jScrollPanelDatosCreditosPendientes.add(this.jTableDatosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCreditosPendientes.setViewportView(this.jTableDatosCreditosPendientes);
		this.jTableDatosCreditosPendientes.setFillsViewportHeight(true);
		this.jTableDatosCreditosPendientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCreditosPendientes= new GridBagLayout();
		this.jPanelAccionesCreditosPendientes.setLayout(gridaBagLayoutAccionesCreditosPendientes);
		
		
		/*	
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = 0;
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
			
		this.jPanelAccionesCreditosPendientes.add(this.jButtonNuevoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCreditosPendientesCreditosPendientes= new GridBagLayout();
		gridaBagLayoutBusquedaCreditosPendientesCreditosPendientes.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCreditosPendientesCreditosPendientes.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCreditosPendientesCreditosPendientes.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCreditosPendientesCreditosPendientes.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCreditosPendientesCreditosPendientes.setLayout(gridaBagLayoutBusquedaCreditosPendientesCreditosPendientes);

		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 0;
		gridBagConstraintsCreditosPendientes.gridx = 0;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jLabelid_cargoBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);

		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 0;
		gridBagConstraintsCreditosPendientes.gridx = 1;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);


		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 1;
		gridBagConstraintsCreditosPendientes.gridx = 0;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jLabelid_estructuraBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);

		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 1;
		gridBagConstraintsCreditosPendientes.gridx = 1;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);


		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 2;
		gridBagConstraintsCreditosPendientes.gridx = 0;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jLabelid_empleadoBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);

		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 2;
		gridBagConstraintsCreditosPendientes.gridx = 1;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);


		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 3;
		gridBagConstraintsCreditosPendientes.gridx = 0;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jLabelfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);

		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 3;
		gridBagConstraintsCreditosPendientes.gridx = 1;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);


		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 4;
		gridBagConstraintsCreditosPendientes.gridx = 0;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jLabelfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);

		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 4;
		gridBagConstraintsCreditosPendientes.gridx = 1;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);

		gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCreditosPendientes.gridy = 5;
		gridBagConstraintsCreditosPendientes.gridx =1;
		jPanelBusquedaCreditosPendientesCreditosPendientes.add(jButtonBusquedaCreditosPendientesCreditosPendientes, gridBagConstraintsCreditosPendientes);

		jTabbedPaneBusquedasCreditosPendientes.addTab("1.-Por Cargo Por Estructura Por Empleado Por Fecha Vencimiento Desde Por Fecha Vencimiento Hasta ", jPanelBusquedaCreditosPendientesCreditosPendientes);
		jTabbedPaneBusquedasCreditosPendientes.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCreditosPendientes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCreditosPendientes);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();						
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCreditosPendientes.gridx = 0;		
			//this.gridBagConstraintsCreditosPendientes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCreditosPendientes.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCreditosPendientes, this.gridBagConstraintsCreditosPendientes);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCreditosPendientes.gridx = 0;		
		//this.gridBagConstraintsCreditosPendientes.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCreditosPendientes.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCreditosPendientes);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCreditosPendientes.gridx = 0;		
			this.gridBagConstraintsCreditosPendientes.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCreditosPendientes.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCreditosPendientes, this.gridBagConstraintsCreditosPendientes);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);								
		
		
		/*
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		*/		
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCreditosPendientes.gridx =0;
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCreditosPendientes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
				
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCreditosPendientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCreditosPendientes = new GridBagLayout();
			this.jPanelBusquedasParametrosCreditosPendientes.setLayout(gridaBagLayoutBusquedasParametrosCreditosPendientes);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCreditosPendientes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCreditosPendientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosPendientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCreditosPendientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
			
			
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
			
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCreditosPendientes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCreditosPendientes;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCreditosPendientes() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCreditosPendientes = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCreditosPendientes.setName("jPanelReporteDinamicoCreditosPendientes"); 
		
		this.jPanelReporteDinamicoCreditosPendientes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCreditosPendientes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCreditosPendientes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCreditosPendientes.setLayout(gridaBagLayoutReporteDinamicoCreditosPendientes);
		
		
		this.jInternalFrameReporteDinamicoCreditosPendientes= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCreditosPendientes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCreditosPendientes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCreditosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCreditosPendientes.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCreditosPendientes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCreditosPendientes.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCreditosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCreditosPendientes.setResizable(true);
	    this.jInternalFrameReporteDinamicoCreditosPendientes.setClosable(true);
	    this.jInternalFrameReporteDinamicoCreditosPendientes.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCreditosPendientes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCreditosPendientes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCreditosPendientes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Pendienteses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCreditosPendientes = new JLabelMe();

		this.jLabelColumnasSelectReporteCreditosPendientes.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelColumnasSelectReporteCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCreditosPendientes = new JList<Reporte>();
		this.jListColumnasSelectReporteCreditosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCreditosPendientes.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCreditosPendientes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCreditosPendientes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCreditosPendientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCreditosPendientes=new JScrollPane(this.jListColumnasSelectReporteCreditosPendientes);
			
			this.jScrollColumnasSelectReporteCreditosPendientes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCreditosPendientes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCreditosPendientes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCreditosPendientes.add(this.jListColumnasSelectReporteCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jScrollColumnasSelectReporteCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCreditosPendientes = new JLabelMe();

		this.jLabelRelacionesSelectReporteCreditosPendientes.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCreditosPendientes = new JList<Reporte>();
		this.jListRelacionesSelectReporteCreditosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCreditosPendientes.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCreditosPendientes.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCreditosPendientes.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCreditosPendientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCreditosPendientes=new JScrollPane(this.jListRelacionesSelectReporteCreditosPendientes);
			
			this.jScrollRelacionesSelectReporteCreditosPendientes.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCreditosPendientes.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCreditosPendientes.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCreditosPendientes = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCreditosPendientes = new JComboBoxMe();
		this.jListColumnasValoresGraficoCreditosPendientes = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCreditosPendientes = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCreditosPendientes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCreditosPendientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCreditosPendientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCreditosPendientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCreditosPendientes = new JLabelMe();

		this.jLabelConGraficoDinamicoCreditosPendientes.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelConGraficoDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCreditosPendientes = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCreditosPendientes.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCreditosPendientes.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCreditosPendientes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCreditosPendientes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCreditosPendientes.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jCheckBoxConGraficoDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCreditosPendientes = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCreditosPendientes.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelColumnaCategoriaGraficoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCreditosPendientes.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCreditosPendientes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCreditosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCreditosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCreditosPendientes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jComboBoxColumnaCategoriaGraficoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCreditosPendientes = new JLabelMe();

		this.jLabelColumnaCategoriaValorCreditosPendientes.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelColumnaCategoriaValorCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCreditosPendientes.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCreditosPendientes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCreditosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCreditosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCreditosPendientes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jComboBoxColumnaCategoriaValorCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCreditosPendientes = new JLabelMe();

		this.jLabelColumnasValoresGraficoCreditosPendientes.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelColumnasValoresGraficoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCreditosPendientes = new JList<Reporte>();
		this.jListColumnasValoresGraficoCreditosPendientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCreditosPendientes.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCreditosPendientes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCreditosPendientes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCreditosPendientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCreditosPendientes=new JScrollPane(this.jListColumnasValoresGraficoCreditosPendientes);
			
			this.jScrollColumnasValoresGraficoCreditosPendientes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCreditosPendientes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCreditosPendientes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCreditosPendientes.add(this.jListColumnasSelectReporteCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jScrollColumnasValoresGraficoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCreditosPendientes = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCreditosPendientes.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelTiposGraficosReportesDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCreditosPendientes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCreditosPendientes.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCreditosPendientes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCreditosPendientes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCreditosPendientes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCreditosPendientes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jComboBoxTiposGraficosReportesDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCreditosPendientes = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCreditosPendientes.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelGenerarExcelReporteDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCreditosPendientes = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCreditosPendientes.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCreditosPendientes,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCreditosPendientes.setToolTipText("Generar EXCEL"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		//this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCreditosPendientes.add(this.jButtonGenerarExcelReporteDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jComboBoxTiposReportesDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCreditosPendientes = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCreditosPendientes.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jLabelTiposArchivoReporteDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jComboBoxTiposArchivosReportesDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCreditosPendientes = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCreditosPendientes.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCreditosPendientes,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCreditosPendientes.setToolTipText("Generar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jButtonGenerarReporteDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCreditosPendientes = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCreditosPendientes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCreditosPendientes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCreditosPendientes.setToolTipText("Cancelar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCreditosPendientes.add(this.jButtonCerrarReporteDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCreditosPendientes = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCreditosPendientes= new JScrollPane(jPanelReporteDinamicoCreditosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCreditosPendientes.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCreditosPendientes.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCreditosPendientes.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Pendienteses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCreditosPendientes.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCreditosPendientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCreditosPendientes.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCreditosPendientes);
		this.jInternalFrameReporteDinamicoCreditosPendientes.getContentPane().add(this.jScrollPanelReporteDinamicoCreditosPendientes, this.gridBagConstraintsCreditosPendientes);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCreditosPendientes() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCreditosPendientes = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCreditosPendientes.setName("jPanelImportacionCreditosPendientes"); 
		
		this.jPanelImportacionCreditosPendientes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCreditosPendientes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCreditosPendientes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCreditosPendientes.setLayout(gridaBagLayoutImportacionCreditosPendientes);
		
		
		this.jInternalFrameImportacionCreditosPendientes= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCreditosPendientes= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCreditosPendientes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCreditosPendientes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCreditosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCreditosPendientes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCreditosPendientes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCreditosPendientes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCreditosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCreditosPendientes.setResizable(true);
	    this.jInternalFrameImportacionCreditosPendientes.setClosable(true);
	    this.jInternalFrameImportacionCreditosPendientes.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCreditosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCreditosPendientes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCreditosPendientes.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCreditosPendientes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCreditosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCreditosPendientes.setResizable(true);
	    this.jInternalFrameImportacionCreditosPendientes.setClosable(true);
	    this.jInternalFrameImportacionCreditosPendientes.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCreditosPendientes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCreditosPendientes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCreditosPendientes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Pendienteses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCreditosPendientes = new JLabelMe();

		this.jLabelArchivoImportacionCreditosPendientes.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYImportacion;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCreditosPendientes.add(this.jLabelArchivoImportacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCreditosPendientes = new JFileChooser();		
		this.jFileChooserImportacionCreditosPendientes.setToolTipText("ESCOGER ARCHIVO"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCreditosPendientes = new JButtonMe();
		this.jButtonAbrirImportacionCreditosPendientes.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCreditosPendientes,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCreditosPendientes.setToolTipText("Generar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosPendientes.add(this.jButtonAbrirImportacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCreditosPendientes = new JLabelMe();

		this.jLabelPathArchivoImportacionCreditosPendientes.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCreditosPendientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCreditosPendientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCreditosPendientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYImportacion;		
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCreditosPendientes.add(this.jLabelPathArchivoImportacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCreditosPendientes=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCreditosPendientes.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCreditosPendientes.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCreditosPendientes.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosPendientes.add(this.jTextFieldPathArchivoImportacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCreditosPendientes = new JButtonMe();
		this.jButtonGenerarImportacionCreditosPendientes.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCreditosPendientes,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCreditosPendientes.setToolTipText("Generar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosPendientes.add(this.jButtonGenerarImportacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCreditosPendientes = new JButtonMe();
		this.jButtonCerrarImportacionCreditosPendientes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCreditosPendientes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCreditosPendientes.setToolTipText("Cancelar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCreditosPendientes.gridy = iPosYImportacion;
		this.gridBagConstraintsCreditosPendientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCreditosPendientes.add(this.jButtonCerrarImportacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCreditosPendientes = new GridBagLayout();
		
		this.jScrollPanelImportacionCreditosPendientes= new JScrollPane(jPanelImportacionCreditosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
		this.gridBagConstraintsCreditosPendientes.gridy =iPosYImportacion;
		this.gridBagConstraintsCreditosPendientes.gridx =iPosXImportacion;
		this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCreditosPendientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCreditosPendientes.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCreditosPendientes);
		this.jInternalFrameImportacionCreditosPendientes.getContentPane().add(this.jScrollPanelImportacionCreditosPendientes, this.gridBagConstraintsCreditosPendientes);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCreditosPendientes(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCreditosPendientes = new JButtonMe();
			this.jButtonAbrirOrderByCreditosPendientes.setText("Orden");
			this.jButtonAbrirOrderByCreditosPendientes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCreditosPendientes,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCreditosPendientes";
			inputMap = this.jButtonAbrirOrderByCreditosPendientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCreditosPendientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCreditosPendientes"));
		
		
			GridBagLayout gridaBagLayoutOrderByCreditosPendientes = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCreditosPendientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCreditosPendientes.setName("jPanelOrderByCreditosPendientes"); 
			
			this.jPanelOrderByCreditosPendientes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCreditosPendientes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCreditosPendientes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCreditosPendientes.setLayout(gridaBagLayoutOrderByCreditosPendientes);
			
			
			this.jTableDatosCreditosPendientesOrderBy = new JTableMe();        
			this.jTableDatosCreditosPendientesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCreditosPendientesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCreditosPendientesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCreditosPendientesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCreditosPendientesOrderBy.setViewportView(this.jTableDatosCreditosPendientesOrderBy);
			this.jTableDatosCreditosPendientesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCreditosPendientesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCreditosPendientes= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCreditosPendientes= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCreditosPendientes = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCreditosPendientes= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCreditosPendientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCreditosPendientes.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCreditosPendientes.setTitle("Orden");
			this.jInternalFrameOrderByCreditosPendientes.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCreditosPendientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCreditosPendientes.setResizable(true);
			this.jInternalFrameOrderByCreditosPendientes.setClosable(true);
			this.jInternalFrameOrderByCreditosPendientes.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCreditosPendientes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCreditosPendientes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCreditosPendientes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCreditosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Creditos Pendienteses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCreditosPendientes.gridx =iPosXOrderBy;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCreditosPendientes.ipady =150;
				
			this.jPanelOrderByCreditosPendientes.add(jScrollPanelDatosCreditosPendientesOrderBy, this.gridBagConstraintsCreditosPendientes);//this.jTableDatosCreditosPendientesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCreditosPendientes = new JButtonMe();
			this.jButtonCerrarOrderByCreditosPendientes.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCreditosPendientes,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCreditosPendientes.setToolTipText("Cancelar"+" "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCreditosPendientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCreditosPendientes.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCreditosPendientes.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCreditosPendientes.add(this.jButtonCerrarOrderByCreditosPendientes, this.gridBagConstraintsCreditosPendientes);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCreditosPendientes = new GridBagLayout();
			
			this.jScrollPanelOrderByCreditosPendientes= new JScrollPane(jPanelOrderByCreditosPendientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCreditosPendientes = new GridBagConstraints();
			this.gridBagConstraintsCreditosPendientes.gridy =iPosYOrderBy;
			this.gridBagConstraintsCreditosPendientes.gridx =iPosXOrderBy;
			this.gridBagConstraintsCreditosPendientes.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCreditosPendientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCreditosPendientes.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCreditosPendientes);
			
			this.jInternalFrameOrderByCreditosPendientes.getContentPane().add(this.jScrollPanelOrderByCreditosPendientes, this.gridBagConstraintsCreditosPendientes);			
		
		} else {
			this.jButtonAbrirOrderByCreditosPendientes = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.creditospendientesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCreditosPendientes.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCreditosPendientes.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCreditosPendientes.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCreditosPendientes.getRowHeight();//CreditosPendientesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCreditosPendientes.isSelected()) {
					iHeightTable=CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCreditosPendientes.isSelected()) {
					iHeightTable=CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CreditosPendientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCreditosPendientes.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCreditosPendientes.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCreditosPendientes.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCreditosPendientes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCreditosPendientes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCreditosPendientes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCreditosPendientes!=null && this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy()!=null) {
			//if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCreditosPendientes.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCreditosPendientes.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCreditosPendientes.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCreditosPendientes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCreditosPendientes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCreditosPendientes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=creditospendientesLogic.getCreditosPendientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=creditospendientess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CreditosPendientes> TraerCreditosPendientesBeans(List<CreditosPendientes> creditospendientess,ArrayList<Classe> classes)throws Exception {
		try {
			for(CreditosPendientes creditospendientes:creditospendientess) {
					
				if(!(CreditosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CreditosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					creditospendientes.setsDetalleGeneralEntityReporte(CreditosPendientesConstantesFunciones.getCreditosPendientesDescripcion(creditospendientes));
										
						
					
						
					
				} else  {
							
					//creditospendientes.setsDetalleGeneralEntityReporte(creditospendientes.getsDetalleGeneralEntityReporte());
										
				}
				
				//creditospendientesbeans.add(creditospendientesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return creditospendientess;
    }
	//PARA REPORTES FIN
}
