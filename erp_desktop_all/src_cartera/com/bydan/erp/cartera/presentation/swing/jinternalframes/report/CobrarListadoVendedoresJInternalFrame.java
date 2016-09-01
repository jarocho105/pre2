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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarListadoVendedoresConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarListadoVendedoresJInternalFrame extends CobrarListadoVendedoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarListadoVendedores;
	
	protected JMenuBar jmenuBarCobrarListadoVendedores;
	
	protected JMenu jmenuCobrarListadoVendedores;
	protected JMenu jmenuDatosCobrarListadoVendedores;
	protected JMenu jmenuArchivoCobrarListadoVendedores;
	protected JMenu jmenuAccionesCobrarListadoVendedores;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarListadoVendedores;	
	protected GridBagConstraints gridBagConstraintsCobrarListadoVendedores;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarListadoVendedoresDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarListadoVendedores;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarListadoVendedores;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarListadoVendedores;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public CobrarListadoVendedoresSessionBean cobrarlistadovendedoresSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarListadoVendedores> cobrarlistadovendedoress;		
	public List<CobrarListadoVendedores> cobrarlistadovendedoressEliminados;	
	public List<CobrarListadoVendedores> cobrarlistadovendedoressAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarListadoVendedores;		
	protected JButton jButtonAbrirOrderByCobrarListadoVendedores;
	
	
	//protected JPanel jPanelOrderByCobrarListadoVendedores;
	//public JScrollPane jScrollPanelOrderByCobrarListadoVendedores;	
	//protected JButton jButtonCerrarOrderByCobrarListadoVendedores;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarListadoVendedoresLogic cobrarlistadovendedoresLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarListadoVendedores;
	public JScrollPane jScrollPanelDatosEdicionCobrarListadoVendedores;
	public JScrollPane jScrollPanelDatosGeneralCobrarListadoVendedores;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarListadoVendedoresOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarListadoVendedores;
	//public JScrollPane jScrollPanelImportacionCobrarListadoVendedores;
	
	
	
	protected JPanel jPanelAccionesCobrarListadoVendedores;
	
    protected JPanel jPanelPaginacionCobrarListadoVendedores;
    protected JPanel jPanelParametrosReportesCobrarListadoVendedores;
	protected JPanel jPanelParametrosReportesAccionesCobrarListadoVendedores;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarListadoVendedores;
	protected JPanel jPanelParametrosAuxiliar2CobrarListadoVendedores;
	protected JPanel jPanelParametrosAuxiliar3CobrarListadoVendedores;
	protected JPanel jPanelParametrosAuxiliar4CobrarListadoVendedores;
	//protected JPanel jPanelParametrosAuxiliar5CobrarListadoVendedores;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarListadoVendedores;
	//protected JPanel jPanelImportacionCobrarListadoVendedores;
	
	
	public JTable jTableDatosCobrarListadoVendedores;
	
	
	
	//public JTable jTableDatosCobrarListadoVendedoresOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarListadoVendedores;
	protected JButton jButtonDuplicarCobrarListadoVendedores;
	protected JButton jButtonCopiarCobrarListadoVendedores;
	protected JButton jButtonVerFormCobrarListadoVendedores;
	protected JButton jButtonNuevoRelacionesCobrarListadoVendedores;
	protected JButton jButtonModificarCobrarListadoVendedores;
	
    protected JButton jButtonGuardarCambiosTablaCobrarListadoVendedores;
	protected JButton jButtonCerrarCobrarListadoVendedores;
	
	
	protected JButton jButtonRecargarInformacionCobrarListadoVendedores;
	protected JButton jButtonProcesarInformacionCobrarListadoVendedores;
	
	
	protected JButton jButtonAnterioresCobrarListadoVendedores;
	protected JButton jButtonSiguientesCobrarListadoVendedores;
	protected JButton jButtonNuevoGuardarCambiosCobrarListadoVendedores;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarListadoVendedores;
	//protected JButton jButtonCerrarReporteDinamicoCobrarListadoVendedores;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarListadoVendedores;
	//protected JButton jButtonGenerarImportacionCobrarListadoVendedores;
	//protected JButton jButtonCerrarImportacionCobrarListadoVendedores;
	//protected JFileChooser jFileChooserImportacionCobrarListadoVendedores;
	//protected File fileImportacionCobrarListadoVendedores;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarListadoVendedores;
	protected JButton jButtonDuplicarToolBarCobrarListadoVendedores;
	protected JButton jButtonNuevoRelacionesToolBarCobrarListadoVendedores;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarListadoVendedores;
	protected JButton jButtonCopiarToolBarCobrarListadoVendedores;
	protected JButton jButtonVerFormToolBarCobrarListadoVendedores;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarListadoVendedores;
	protected JButton jButtonCerrarToolBarCobrarListadoVendedores;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarListadoVendedores;
	protected JButton jButtonProcesarInformacionToolBarCobrarListadoVendedores;
	protected JButton jButtonAnterioresToolBarCobrarListadoVendedores;
	protected JButton jButtonSiguientesToolBarCobrarListadoVendedores;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarListadoVendedores;
	protected JButton jButtonAbrirOrderByToolBarCobrarListadoVendedores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarListadoVendedores;
	protected JMenuItem jMenuItemDuplicarCobrarListadoVendedores;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarListadoVendedores;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarListadoVendedores;
	protected JMenuItem jMenuItemCopiarCobrarListadoVendedores;
	protected JMenuItem jMenuItemVerFormCobrarListadoVendedores;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarListadoVendedores;
	protected JMenuItem jMenuItemCerrarCobrarListadoVendedores;
	protected JMenuItem jMenuItemDetalleCerrarCobrarListadoVendedores;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarListadoVendedores;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarListadoVendedores;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarListadoVendedores;
	protected JMenuItem jMenuItemProcesarInformacionCobrarListadoVendedores;
	protected JMenuItem jMenuItemAnterioresCobrarListadoVendedores;
	protected JMenuItem jMenuItemSiguientesCobrarListadoVendedores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarListadoVendedores;
	protected JMenuItem jMenuItemAbrirOrderByCobrarListadoVendedores;
	protected JMenuItem jMenuItemMostrarOcultarCobrarListadoVendedores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarListadoVendedores;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarListadoVendedores;
	protected JCheckBox jCheckBoxSeleccionadosCobrarListadoVendedores;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarListadoVendedores;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarListadoVendedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarListadoVendedores;
	protected JTextField jTextFieldValorCampoGeneralCobrarListadoVendedores;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarListadoVendedores;
	//public JList<Reporte> jListColumnasSelectReporteCobrarListadoVendedores;
	//public JScrollPane jScrollColumnasSelectReporteCobrarListadoVendedores;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarListadoVendedores;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarListadoVendedores;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarListadoVendedores;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarListadoVendedores;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarListadoVendedores;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarListadoVendedores;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarListadoVendedores;
	
		
	//public JLabel jLabelArchivoImportacionCobrarListadoVendedores;	
	//public JLabel jLabelPathArchivoImportacionCobrarListadoVendedores;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarListadoVendedores;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarListadoVendedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarListadoVendedores;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarListadoVendedores;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarListadoVendedores;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarListadoVendedores;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarListadoVendedores;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarListadoVendedores;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarListadoVendedores;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarListadoVendedores;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarListadoVendedores;
	public JPanel jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores;
	public JButton jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores;
	
	public JPanel jPanelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores;
	public JLabel jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores;
	public JButton jButtonid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedoresUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedoresBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarListadoVendedoresJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadoVendedoresJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadoVendedoresJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarListadoVendedoresJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarListadoVendedores)	{
		this.jButtonRecargarInformacionCobrarListadoVendedores = jButtonRecargarInformacionCobrarListadoVendedores;
	}
	
	public JButton getjButtonProcesarInformacionCobrarListadoVendedores() {
		return this.jButtonProcesarInformacionCobrarListadoVendedores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarListadoVendedores)	{
		this.jButtonProcesarInformacionCobrarListadoVendedores = jButtonProcesarInformacionCobrarListadoVendedores;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarListadoVendedores() {
		return this.jButtonRecargarInformacionCobrarListadoVendedores;
	}
	
	
	public List<CobrarListadoVendedores> getcobrarlistadovendedoress() {
		return this.cobrarlistadovendedoress;
	}

	public void setcobrarlistadovendedoress(List<CobrarListadoVendedores> cobrarlistadovendedoress) {
		this.cobrarlistadovendedoress = cobrarlistadovendedoress;
	}
	
	public List<CobrarListadoVendedores> getcobrarlistadovendedoressAux() {
		return this.cobrarlistadovendedoressAux;
	}

	public void setcobrarlistadovendedoressAux(List<CobrarListadoVendedores> cobrarlistadovendedoressAux) {
		this.cobrarlistadovendedoressAux = cobrarlistadovendedoressAux;
	}
	
	public List<CobrarListadoVendedores> getcobrarlistadovendedoressEliminados() {
		return this.cobrarlistadovendedoressEliminados;
	}

	public void setCobrarListadoVendedoressEliminados(List<CobrarListadoVendedores> cobrarlistadovendedoressEliminados) {
		this.cobrarlistadovendedoressEliminados = cobrarlistadovendedoressEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarListadoVendedores() {
		return jComboBoxTiposSeleccionarCobrarListadoVendedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarListadoVendedores(
			JComboBox jComboBoxTiposSeleccionarCobrarListadoVendedores) {
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores = jComboBoxTiposSeleccionarCobrarListadoVendedores;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarListadoVendedores() {
		return jTextFieldValorCampoGeneralCobrarListadoVendedores;
	}

	public void setjTextFieldValorCampoGeneralCobrarListadoVendedores(
			JTextField jTextFieldValorCampoGeneralCobrarListadoVendedores) {
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores = jTextFieldValorCampoGeneralCobrarListadoVendedores;
	}

	public void setBorderResaltarValorCampoGeneralCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarListadoVendedores() {
		return this.jCheckBoxSeleccionarTodosCobrarListadoVendedores;
	}

	public void setjCheckBoxSeleccionarTodosCobrarListadoVendedores(
			JCheckBox jCheckBoxSeleccionarTodosCobrarListadoVendedores) {
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores = jCheckBoxSeleccionarTodosCobrarListadoVendedores;
	}

	public void setBorderResaltarSeleccionarTodosCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarListadoVendedores() {
		return this.jCheckBoxSeleccionadosCobrarListadoVendedores;
	}

	public void setjCheckBoxSeleccionadosCobrarListadoVendedores(
			JCheckBox jCheckBoxSeleccionadosCobrarListadoVendedores) {
		this.jCheckBoxSeleccionadosCobrarListadoVendedores = jCheckBoxSeleccionadosCobrarListadoVendedores;
	}
	
	public void setBorderResaltarSeleccionadosCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarListadoVendedores() {
		return this.jComboBoxTiposArchivosReportesCobrarListadoVendedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarListadoVendedores(
			JComboBox jComboBoxTiposArchivosReportesCobrarListadoVendedores) {
		this.jComboBoxTiposArchivosReportesCobrarListadoVendedores = jComboBoxTiposArchivosReportesCobrarListadoVendedores;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarListadoVendedores() {
		return this.jComboBoxTiposReportesCobrarListadoVendedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarListadoVendedores(
			JComboBox jComboBoxTiposReportesCobrarListadoVendedores) {
		this.jComboBoxTiposReportesCobrarListadoVendedores = jComboBoxTiposReportesCobrarListadoVendedores;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarListadoVendedores() {
	//	return jComboBoxTiposReportesDinamicoCobrarListadoVendedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarListadoVendedores(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarListadoVendedores) {
	//	this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores = jComboBoxTiposReportesDinamicoCobrarListadoVendedores;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores = jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores;
	//}
	
	public void setBorderResaltarTiposReportesCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarListadoVendedores() {
		return this.jComboBoxTiposGraficosReportesCobrarListadoVendedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarListadoVendedores(
			JComboBox jComboBoxTiposGraficosReportesCobrarListadoVendedores) {
		this.jComboBoxTiposGraficosReportesCobrarListadoVendedores = jComboBoxTiposGraficosReportesCobrarListadoVendedores;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarListadoVendedores() {
		return this.jComboBoxTiposPaginacionCobrarListadoVendedores;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarListadoVendedores(
			JComboBox jComboBoxTiposPaginacionCobrarListadoVendedores) {
		this.jComboBoxTiposPaginacionCobrarListadoVendedores = jComboBoxTiposPaginacionCobrarListadoVendedores;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarListadoVendedores() {
		return this.jComboBoxTiposRelacionesCobrarListadoVendedores;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarListadoVendedores() {
		return this.jComboBoxTiposAccionesCobrarListadoVendedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarListadoVendedores(
			JComboBox jComboBoxTiposRelacionesCobrarListadoVendedores) {
		this.jComboBoxTiposRelacionesCobrarListadoVendedores = jComboBoxTiposRelacionesCobrarListadoVendedores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarListadoVendedores(
			JComboBox jComboBoxTiposAccionesCobrarListadoVendedores) {
		this.jComboBoxTiposAccionesCobrarListadoVendedores = jComboBoxTiposAccionesCobrarListadoVendedores;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarListadoVendedores() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarListadoVendedores .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarListadoVendedores() {
	//	return jCheckBoxConGraficoDinamicoCobrarListadoVendedores;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarListadoVendedores(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarListadoVendedores) {
	//	this.jCheckBoxConGraficoDinamicoCobrarListadoVendedores = jCheckBoxConGraficoDinamicoCobrarListadoVendedores;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarListadoVendedores() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarListadoVendedores.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarListadoVendedores .setBorder(borderResaltar);		
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
		this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
		
		this.cobrarlistadovendedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarlistadovendedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarListadoVendedoresJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarListadoVendedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarListadoVendedoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarListadoVendedoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarListadoVendedoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Listado Vendedores MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarListadoVendedoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarListadoVendedores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarListadoVendedores= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"nuevo","nuevo","Nuevo"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"duplicar","duplicar","Duplicar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"copiar","copiar","Copiar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"ver_form","ver_form","Ver"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"recargar","recargar","Buscar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarListadoVendedores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,
							"cerrar","cerrar","Salir"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarListadoVendedores=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarListadoVendedores;
			
				this.jButtonProcesarInformacionToolBarCobrarListadoVendedores=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarListadoVendedores;
				
		//protected JButton jButtonModificarToolBarCobrarListadoVendedores;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarListadoVendedores=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarListadoVendedores=new JMenuMe("General");
		this.jmenuArchivoCobrarListadoVendedores=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarListadoVendedores=new JMenuMe("Acciones");
		this.jmenuDatosCobrarListadoVendedores=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarListadoVendedores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarListadoVendedores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarListadoVendedores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarListadoVendedores= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarListadoVendedores.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarListadoVendedores,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarListadoVendedores= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarListadoVendedores.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarListadoVendedores,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarListadoVendedores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarListadoVendedores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarListadoVendedores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarListadoVendedores= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarListadoVendedores.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarListadoVendedores,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarListadoVendedores= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarListadoVendedores.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarListadoVendedores,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarListadoVendedores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarListadoVendedores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarListadoVendedores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarListadoVendedores= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarListadoVendedores.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarListadoVendedores,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarListadoVendedores= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarListadoVendedores.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarListadoVendedores,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarListadoVendedores= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarListadoVendedores.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarListadoVendedores,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarListadoVendedores= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarListadoVendedores.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarListadoVendedores,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarListadoVendedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarListadoVendedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarListadoVendedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarListadoVendedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarListadoVendedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarListadoVendedores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarListadoVendedores= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarListadoVendedores.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarListadoVendedores,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarListadoVendedores.add(this.jMenuItemCerrarCobrarListadoVendedores);
			
			this.jmenuAccionesCobrarListadoVendedores.add(this.jMenuItemNuevoCobrarListadoVendedores);
			this.jmenuAccionesCobrarListadoVendedores.add(this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores);
			this.jmenuAccionesCobrarListadoVendedores.add(this.jMenuItemNuevoRelacionesCobrarListadoVendedores);
			this.jmenuAccionesCobrarListadoVendedores.add(this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores);		
			this.jmenuAccionesCobrarListadoVendedores.add(this.jMenuItemDuplicarCobrarListadoVendedores);		
			this.jmenuAccionesCobrarListadoVendedores.add(this.jMenuItemCopiarCobrarListadoVendedores);		
			this.jmenuAccionesCobrarListadoVendedores.add(this.jMenuItemVerFormCobrarListadoVendedores);		
			
			this.jmenuDatosCobrarListadoVendedores.add(this.jMenuItemRecargarInformacionCobrarListadoVendedores);				
			this.jmenuDatosCobrarListadoVendedores.add(this.jMenuItemAnterioresCobrarListadoVendedores);				
			this.jmenuDatosCobrarListadoVendedores.add(this.jMenuItemSiguientesCobrarListadoVendedores);				
			this.jmenuDatosCobrarListadoVendedores.add(this.jMenuItemAbrirOrderByCobrarListadoVendedores);				
			this.jmenuDatosCobrarListadoVendedores.add(this.jMenuItemMostrarOcultarCobrarListadoVendedores);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarListadoVendedores.add(this.jMenuItemGuardarCambiosCobrarListadoVendedores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarListadoVendedores.add(this.jmenuArchivoCobrarListadoVendedores);		
			this.jmenuBarCobrarListadoVendedores.add(this.jmenuAccionesCobrarListadoVendedores);		
			this.jmenuBarCobrarListadoVendedores.add(this.jmenuDatosCobrarListadoVendedores);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarListadoVendedores);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarListadoVendedores() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setToolTipText("Buscar Por Vendedor ");
		this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores= new JButtonMe();
		this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setText("Buscar");
		this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores = new JLabelMe();
		jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setText("Vendedor :");
		jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCobrarListadoVendedores=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarListadoVendedores.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarListadoVendedores.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarListadoVendedores.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarListadoVendedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarListadoVendedores = new CobrarListadoVendedoresDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Listado Vendedores DATOS");
			this.jInternalFrameDetalleFormCobrarListadoVendedores = new CobrarListadoVendedoresDetalleFormJInternalFrame(jDesktopPane,this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones(),this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarListadoVendedores = null;//new CobrarListadoVendedoresDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarListadoVendedores= new GridBagLayout();
		
		
		this.jTableDatosCobrarListadoVendedores = new JTableMe();      
		
		String sToolTipCobrarListadoVendedores="";
		sToolTipCobrarListadoVendedores=CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarListadoVendedores+="(Cartera.CobrarListadoVendedores)";
		}
		
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarListadoVendedores+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarListadoVendedores.setToolTipText(sToolTipCobrarListadoVendedores);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarListadoVendedores);
		this.jTableDatosCobrarListadoVendedores.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarListadoVendedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarListadoVendedores.setRowSelectionAllowed(true);
		this.jTableDatosCobrarListadoVendedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarListadoVendedores,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarListadoVendedores = new JButtonMe();
		this.jButtonDuplicarCobrarListadoVendedores = new JButtonMe();
		this.jButtonCopiarCobrarListadoVendedores = new JButtonMe();
		this.jButtonVerFormCobrarListadoVendedores = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarListadoVendedores = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores = new JButtonMe();
		this.jButtonCerrarCobrarListadoVendedores = new JButtonMe();
		
		this.jScrollPanelDatosCobrarListadoVendedores = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarListadoVendedores = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Listado Vendedores";
		
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listado Vendedoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarListadoVendedores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarListadoVendedores.setToolTipText("Acciones");
        this.jPanelAccionesCobrarListadoVendedores.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarListadoVendedores=new ReporteDinamicoJInternalFrame(CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarListadoVendedores();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarListadoVendedores=new ImportacionJInternalFrame(CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarListadoVendedores();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarListadoVendedores = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarListadoVendedores.setText("Orden");
		this.jButtonAbrirOrderByCobrarListadoVendedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarListadoVendedores,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarListadoVendedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadoVendedores,false,this);
			
			//this.cargarOrderByCobrarListadoVendedores(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarListadoVendedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadoVendedores,true,this);
			
			//this.cargarOrderByCobrarListadoVendedores(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarListadoVendedores.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosCobrarListadoVendedores.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosCobrarListadoVendedores.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosCobrarListadoVendedores.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarListadoVendedores.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarListadoVendedores.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarListadoVendedores.setText("Nuevo");
		this.jButtonDuplicarCobrarListadoVendedores.setText("Duplicar");
		this.jButtonCopiarCobrarListadoVendedores.setText("Copiar");
		this.jButtonVerFormCobrarListadoVendedores.setText("Ver");
		this.jButtonNuevoRelacionesCobrarListadoVendedores.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.setText("Guardar");
		this.jButtonCerrarCobrarListadoVendedores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarListadoVendedores,"nuevo_button","Nuevo",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarListadoVendedores,"duplicar_button","Duplicar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarListadoVendedores,"copiar_button","Copiar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarListadoVendedores,"ver_form","Ver",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarListadoVendedores,"nuevorelaciones_button","Nuevo Rel",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarListadoVendedores,"guardarcambiostabla_button","Guardar",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarListadoVendedores,"cerrar_button","Salir",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarListadoVendedores.setToolTipText("Nuevo"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarListadoVendedores.setToolTipText("Duplicar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarListadoVendedores.setToolTipText("Copiar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarListadoVendedores.setToolTipText("Ver"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarListadoVendedores.setToolTipText("Nuevo Rel"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.setToolTipText("Guardar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarListadoVendedores.setToolTipText("Salir"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarListadoVendedores";
		inputMap = this.jButtonNuevoCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarListadoVendedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarListadoVendedores"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarListadoVendedores";
		inputMap = this.jButtonDuplicarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarListadoVendedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarListadoVendedores"));
		
		//COPIAR
		sMapKey = "CopiarCobrarListadoVendedores";
		inputMap = this.jButtonCopiarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarListadoVendedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarListadoVendedores"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarListadoVendedores";
		inputMap = this.jButtonVerFormCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarListadoVendedores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarListadoVendedores"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarListadoVendedores";
		inputMap = this.jButtonNuevoRelacionesCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarListadoVendedores"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarListadoVendedores";
		inputMap = this.jButtonModificarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarListadoVendedores"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarListadoVendedores";
		inputMap = this.jButtonCerrarCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarListadoVendedores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarListadoVendedores";
		inputMap = this.jButtonGuardarCambiosTablaCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarListadoVendedores"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarListadoVendedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarListadoVendedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarListadoVendedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarListadoVendedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarListadoVendedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarListadoVendedores.setName("jPanelParametrosReportesCobrarListadoVendedores"); 
		
		this.jPanelParametrosReportesAccionesCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarListadoVendedores.setName("jPanelParametrosReportesAccionesCobrarListadoVendedores"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarListadoVendedores = new JButtonMe();
		this.jButtonRecargarInformacionCobrarListadoVendedores.setText("Buscar");
		this.jButtonRecargarInformacionCobrarListadoVendedores.setToolTipText("Buscar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarListadoVendedores,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarListadoVendedores.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarListadoVendedores = new JButtonMe();
		this.jButtonProcesarInformacionCobrarListadoVendedores.setText("Procesar");
		this.jButtonProcesarInformacionCobrarListadoVendedores.setToolTipText("Procesar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarListadoVendedores.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarListadoVendedores.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarListadoVendedores.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarListadoVendedores.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarListadoVendedores.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarListadoVendedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarListadoVendedores.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarListadoVendedores.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarListadoVendedores.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarListadoVendedores.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarListadoVendedores.setText("Accion");
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarListadoVendedores.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarListadoVendedores = new JLabelMe();
		
		this.jLabelAccionesCobrarListadoVendedores.setText("Acciones");		
		this.jLabelAccionesCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarListadoVendedores = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarListadoVendedores.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarListadoVendedores.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarListadoVendedores = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarListadoVendedores.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarListadoVendedores.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarListadoVendedores = new JButtonMe();
		//this.jButtonAnterioresCobrarListadoVendedores.setText("<<");
        this.jButtonAnterioresCobrarListadoVendedores.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarListadoVendedores,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarListadoVendedores = new JButtonMe();
		//this.jButtonSiguientesCobrarListadoVendedores.setText(">>");
        this.jButtonSiguientesCobrarListadoVendedores.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarListadoVendedores,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarListadoVendedores = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarListadoVendedores.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarListadoVendedores.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarListadoVendedores,"nuevoguardarcambios_button","Nue",this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarListadoVendedores";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarListadoVendedores"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarListadoVendedores";
		inputMap = this.jButtonRecargarInformacionCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarListadoVendedores"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarListadoVendedores";
		inputMap = this.jButtonSiguientesCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarListadoVendedores"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarListadoVendedores";
		inputMap = this.jButtonAnterioresCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarListadoVendedores"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarListadoVendedores();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarListadoVendedores.setMinimumSize(new Dimension(this.getWidth(),CobrarListadoVendedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarListadoVendedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarListadoVendedores.setMaximumSize(new Dimension(this.getWidth(),CobrarListadoVendedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarListadoVendedoresBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarListadoVendedores.setPreferredSize(new Dimension(this.getWidth(),CobrarListadoVendedoresBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarListadoVendedoresBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarListadoVendedores = new GridBagLayout();

			this.jPanelPaginacionCobrarListadoVendedores.setLayout(gridaBagLayoutPaginacionCobrarListadoVendedores);						
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonAnterioresCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
					
						
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
			
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonNuevoGuardarCambiosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
						
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonSiguientesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 1;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonNuevoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
						
			
			
			if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
				this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarListadoVendedores.gridy = 1;
				this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonGuardarCambiosTablaCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			}
			
			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 1;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonDuplicarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 1;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonCopiarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 1;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonVerFormCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 1;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarListadoVendedores.add(this.jButtonCerrarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
		
		
		this.jButtonRecargarInformacionCobrarListadoVendedores.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarListadoVendedores.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarListadoVendedores.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarListadoVendedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarListadoVendedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarListadoVendedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarListadoVendedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarListadoVendedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarListadoVendedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarListadoVendedores.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarListadoVendedores.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarListadoVendedores.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarListadoVendedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarListadoVendedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarListadoVendedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarListadoVendedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarListadoVendedores.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarListadoVendedores.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarListadoVendedores.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarListadoVendedores.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarListadoVendedores.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarListadoVendedores.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarListadoVendedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarListadoVendedores = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarListadoVendedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarListadoVendedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarListadoVendedores = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarListadoVendedores = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarListadoVendedores.setLayout(gridaBagParametrosReportesCobrarListadoVendedores);
			this.jPanelParametrosReportesAccionesCobrarListadoVendedores.setLayout(gridaBagParametrosReportesAccionesCobrarListadoVendedores);
			
			
			this.jPanelParametrosAuxiliar1CobrarListadoVendedores.setLayout(gridaBagParametrosAuxiliar1CobrarListadoVendedores);
			this.jPanelParametrosAuxiliar2CobrarListadoVendedores.setLayout(gridaBagParametrosAuxiliar2CobrarListadoVendedores);
			this.jPanelParametrosAuxiliar3CobrarListadoVendedores.setLayout(gridaBagParametrosAuxiliar3CobrarListadoVendedores);
			this.jPanelParametrosAuxiliar4CobrarListadoVendedores.setLayout(gridaBagParametrosAuxiliar4CobrarListadoVendedores);
			//this.jPanelParametrosAuxiliar5CobrarListadoVendedores.setLayout(gridaBagParametrosAuxiliar2CobrarListadoVendedores);			
			
			
			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jButtonRecargarInformacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarListadoVendedores.add(this.jComboBoxTiposPaginacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarListadoVendedores.add(this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarListadoVendedores.add(this.jComboBoxTiposArchivosReportesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jPanelParametrosAuxiliar1CobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadoVendedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarListadoVendedores.add(this.jComboBoxTiposReportesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jPanelParametrosAuxiliar4CobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jComboBoxTiposReportesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jCheckBoxGenerarReporteCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jPanelParametrosAuxiliar2CobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadoVendedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jLabelAccionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
				this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jButtonAbrirOrderByCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jComboBoxTiposSeleccionarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
			
			
			/*
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadoVendedores.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jCheckBoxSeleccionarTodosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadoVendedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarListadoVendedores.add(this.jCheckBoxSeleccionarTodosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);															
				
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarListadoVendedores.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarListadoVendedores.add(this.jCheckBoxSeleccionadosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jPanelParametrosAuxiliar3CobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarListadoVendedores.add(this.jComboBoxTiposAccionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarListadoVendedores = new GridBagLayout();

			this.jScrollPanelDatosCobrarListadoVendedores.setLayout(gridaBagLayoutDatosCobrarListadoVendedores);
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
			
			this.jScrollPanelDatosCobrarListadoVendedores.add(this.jTableDatosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarListadoVendedores.setViewportView(this.jTableDatosCobrarListadoVendedores);
		this.jTableDatosCobrarListadoVendedores.setFillsViewportHeight(true);
		this.jTableDatosCobrarListadoVendedores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarListadoVendedores= new GridBagLayout();
		this.jPanelAccionesCobrarListadoVendedores.setLayout(gridaBagLayoutAccionesCobrarListadoVendedores);
		
		
		/*	
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
			
		this.jPanelAccionesCobrarListadoVendedores.add(this.jButtonNuevoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarListadoVendedoresCobrarListadoVendedores= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarListadoVendedoresCobrarListadoVendedores.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarListadoVendedoresCobrarListadoVendedores.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarListadoVendedoresCobrarListadoVendedores.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarListadoVendedoresCobrarListadoVendedores.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setLayout(gridaBagLayoutBusquedaCobrarListadoVendedoresCobrarListadoVendedores);

		gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		gridBagConstraintsCobrarListadoVendedores.gridx = 0;
		jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores.add(jLabelid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores, gridBagConstraintsCobrarListadoVendedores);

		gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadoVendedores.gridy = 0;
		gridBagConstraintsCobrarListadoVendedores.gridx = 1;
		jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores.add(jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores, gridBagConstraintsCobrarListadoVendedores);

		gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarListadoVendedores.gridy = 1;
		gridBagConstraintsCobrarListadoVendedores.gridx =1;
		jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores.add(jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores, gridBagConstraintsCobrarListadoVendedores);

		jTabbedPaneBusquedasCobrarListadoVendedores.addTab("1.-Por Vendedor ", jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
		jTabbedPaneBusquedasCobrarListadoVendedores.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarListadoVendedores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarListadoVendedores);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();						
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;		
			//this.gridBagConstraintsCobrarListadoVendedores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarListadoVendedores.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;		
		//this.gridBagConstraintsCobrarListadoVendedores.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarListadoVendedores.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarListadoVendedores);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;		
			this.gridBagConstraintsCobrarListadoVendedores.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarListadoVendedores.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);								
		
		
		/*
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		*/		
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarListadoVendedores.gridx =0;
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarListadoVendedores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
				
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarListadoVendedores= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarListadoVendedores = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarListadoVendedores.setLayout(gridaBagLayoutBusquedasParametrosCobrarListadoVendedores);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarListadoVendedores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
			
			
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
			
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarListadoVendedores;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarListadoVendedores() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarListadoVendedores = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarListadoVendedores.setName("jPanelReporteDinamicoCobrarListadoVendedores"); 
		
		this.jPanelReporteDinamicoCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarListadoVendedores.setLayout(gridaBagLayoutReporteDinamicoCobrarListadoVendedores);
		
		
		this.jInternalFrameReporteDinamicoCobrarListadoVendedores= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarListadoVendedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarListadoVendedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listado Vendedoreses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarListadoVendedores = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarListadoVendedores.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jLabelColumnasSelectReporteCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarListadoVendedores = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarListadoVendedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarListadoVendedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarListadoVendedores.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarListadoVendedores.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarListadoVendedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarListadoVendedores=new JScrollPane(this.jListColumnasSelectReporteCobrarListadoVendedores);
			
			this.jScrollColumnasSelectReporteCobrarListadoVendedores.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarListadoVendedores.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarListadoVendedores.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jListColumnasSelectReporteCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jScrollColumnasSelectReporteCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarListadoVendedores = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarListadoVendedores.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarListadoVendedores = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarListadoVendedores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarListadoVendedores.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarListadoVendedores.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarListadoVendedores.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarListadoVendedores.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarListadoVendedores=new JScrollPane(this.jListRelacionesSelectReporteCobrarListadoVendedores);
			
			this.jScrollRelacionesSelectReporteCobrarListadoVendedores.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarListadoVendedores.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarListadoVendedores.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarListadoVendedores = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarListadoVendedores = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarListadoVendedores = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarListadoVendedores = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarListadoVendedores.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jLabelGenerarExcelReporteDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores.setToolTipText("Generar EXCEL"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		//this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jComboBoxTiposReportesDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarListadoVendedores = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarListadoVendedores.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jLabelTiposArchivoReporteDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarListadoVendedores = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarListadoVendedores.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarListadoVendedores,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarListadoVendedores.setToolTipText("Generar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jButtonGenerarReporteDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarListadoVendedores = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarListadoVendedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarListadoVendedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarListadoVendedores.setToolTipText("Cancelar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarListadoVendedores.add(this.jButtonCerrarReporteDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarListadoVendedores = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarListadoVendedores= new JScrollPane(jPanelReporteDinamicoCobrarListadoVendedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listado Vendedoreses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarListadoVendedores.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarListadoVendedores);
		this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarListadoVendedores() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarListadoVendedores = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarListadoVendedores.setName("jPanelImportacionCobrarListadoVendedores"); 
		
		this.jPanelImportacionCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarListadoVendedores.setLayout(gridaBagLayoutImportacionCobrarListadoVendedores);
		
		
		this.jInternalFrameImportacionCobrarListadoVendedores= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarListadoVendedores= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarListadoVendedores = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarListadoVendedores= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarListadoVendedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarListadoVendedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarListadoVendedores.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarListadoVendedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarListadoVendedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarListadoVendedores.setResizable(true);
	    this.jInternalFrameImportacionCobrarListadoVendedores.setClosable(true);
	    this.jInternalFrameImportacionCobrarListadoVendedores.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarListadoVendedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarListadoVendedores.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarListadoVendedores.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarListadoVendedores.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarListadoVendedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarListadoVendedores.setResizable(true);
	    this.jInternalFrameImportacionCobrarListadoVendedores.setClosable(true);
	    this.jInternalFrameImportacionCobrarListadoVendedores.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listado Vendedoreses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarListadoVendedores = new JLabelMe();

		this.jLabelArchivoImportacionCobrarListadoVendedores.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarListadoVendedores.add(this.jLabelArchivoImportacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarListadoVendedores = new JFileChooser();		
		this.jFileChooserImportacionCobrarListadoVendedores.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarListadoVendedores = new JButtonMe();
		this.jButtonAbrirImportacionCobrarListadoVendedores.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarListadoVendedores,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarListadoVendedores.setToolTipText("Generar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadoVendedores.add(this.jButtonAbrirImportacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarListadoVendedores = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarListadoVendedores.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarListadoVendedores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarListadoVendedores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarListadoVendedores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarListadoVendedores.add(this.jLabelPathArchivoImportacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarListadoVendedores=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarListadoVendedores.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarListadoVendedores.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarListadoVendedores.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadoVendedores.add(this.jTextFieldPathArchivoImportacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarListadoVendedores = new JButtonMe();
		this.jButtonGenerarImportacionCobrarListadoVendedores.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarListadoVendedores,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarListadoVendedores.setToolTipText("Generar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadoVendedores.add(this.jButtonGenerarImportacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarListadoVendedores = new JButtonMe();
		this.jButtonCerrarImportacionCobrarListadoVendedores.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarListadoVendedores,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarListadoVendedores.setToolTipText("Cancelar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarListadoVendedores.add(this.jButtonCerrarImportacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarListadoVendedores = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarListadoVendedores= new JScrollPane(jPanelImportacionCobrarListadoVendedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
		this.gridBagConstraintsCobrarListadoVendedores.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarListadoVendedores.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarListadoVendedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarListadoVendedores.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarListadoVendedores);
		this.jInternalFrameImportacionCobrarListadoVendedores.getContentPane().add(this.jScrollPanelImportacionCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarListadoVendedores(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarListadoVendedores = new JButtonMe();
			this.jButtonAbrirOrderByCobrarListadoVendedores.setText("Orden");
			this.jButtonAbrirOrderByCobrarListadoVendedores.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarListadoVendedores,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarListadoVendedores";
			inputMap = this.jButtonAbrirOrderByCobrarListadoVendedores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarListadoVendedores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarListadoVendedores"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarListadoVendedores = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarListadoVendedores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarListadoVendedores.setName("jPanelOrderByCobrarListadoVendedores"); 
			
			this.jPanelOrderByCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarListadoVendedores.setLayout(gridaBagLayoutOrderByCobrarListadoVendedores);
			
			
			this.jTableDatosCobrarListadoVendedoresOrderBy = new JTableMe();        
			this.jTableDatosCobrarListadoVendedoresOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarListadoVendedoresOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarListadoVendedoresOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarListadoVendedoresOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarListadoVendedoresOrderBy.setViewportView(this.jTableDatosCobrarListadoVendedoresOrderBy);
			this.jTableDatosCobrarListadoVendedoresOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarListadoVendedoresOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarListadoVendedores= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarListadoVendedores= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarListadoVendedores = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarListadoVendedores= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarListadoVendedores.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarListadoVendedores.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarListadoVendedores.setTitle("Orden");
			this.jInternalFrameOrderByCobrarListadoVendedores.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarListadoVendedores.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarListadoVendedores.setResizable(true);
			this.jInternalFrameOrderByCobrarListadoVendedores.setClosable(true);
			this.jInternalFrameOrderByCobrarListadoVendedores.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarListadoVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Listado Vendedoreses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarListadoVendedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarListadoVendedores.ipady =150;
				
			this.jPanelOrderByCobrarListadoVendedores.add(jScrollPanelDatosCobrarListadoVendedoresOrderBy, this.gridBagConstraintsCobrarListadoVendedores);//this.jTableDatosCobrarListadoVendedoresTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarListadoVendedores = new JButtonMe();
			this.jButtonCerrarOrderByCobrarListadoVendedores.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarListadoVendedores,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarListadoVendedores.setToolTipText("Cancelar"+" "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarListadoVendedores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarListadoVendedores.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarListadoVendedores.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarListadoVendedores.add(this.jButtonCerrarOrderByCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarListadoVendedores = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarListadoVendedores= new JScrollPane(jPanelOrderByCobrarListadoVendedores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarListadoVendedores = new GridBagConstraints();
			this.gridBagConstraintsCobrarListadoVendedores.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarListadoVendedores.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarListadoVendedores.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarListadoVendedores.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarListadoVendedores.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarListadoVendedores);
			
			this.jInternalFrameOrderByCobrarListadoVendedores.getContentPane().add(this.jScrollPanelOrderByCobrarListadoVendedores, this.gridBagConstraintsCobrarListadoVendedores);			
		
		} else {
			this.jButtonAbrirOrderByCobrarListadoVendedores = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarListadoVendedores.getRowHeight();//CobrarListadoVendedoresConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores.isSelected()) {
					iHeightTable=CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarListadoVendedores.isSelected()) {
					iHeightTable=CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarListadoVendedoresConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarListadoVendedores!=null && this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarListadoVendedores.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarListadoVendedores.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarListadoVendedores.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarListadoVendedores.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarListadoVendedores.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarListadoVendedores.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarlistadovendedoress.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarListadoVendedores> TraerCobrarListadoVendedoresBeans(List<CobrarListadoVendedores> cobrarlistadovendedoress,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoress) {
					
				if(!(CobrarListadoVendedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarListadoVendedoresConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarlistadovendedores.setsDetalleGeneralEntityReporte(CobrarListadoVendedoresConstantesFunciones.getCobrarListadoVendedoresDescripcion(cobrarlistadovendedores));
										
						
					
						
					
				} else  {
							
					//cobrarlistadovendedores.setsDetalleGeneralEntityReporte(cobrarlistadovendedores.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarlistadovendedoresbeans.add(cobrarlistadovendedoresbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarlistadovendedoress;
    }
	//PARA REPORTES FIN
}
