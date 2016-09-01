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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.cartera.util.report.CobrarClientesSaldosConstantesFunciones;

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
public class CobrarClientesSaldosJInternalFrame extends CobrarClientesSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarClientesSaldos;
	
	protected JMenuBar jmenuBarCobrarClientesSaldos;
	
	protected JMenu jmenuCobrarClientesSaldos;
	protected JMenu jmenuDatosCobrarClientesSaldos;
	protected JMenu jmenuArchivoCobrarClientesSaldos;
	protected JMenu jmenuAccionesCobrarClientesSaldos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesSaldos;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesSaldos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarClientesSaldosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarClientesSaldos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarClientesSaldos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarClientesSaldos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public CobrarClientesSaldosSessionBean cobrarclientessaldosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarClientesSaldos> cobrarclientessaldoss;		
	public List<CobrarClientesSaldos> cobrarclientessaldossEliminados;	
	public List<CobrarClientesSaldos> cobrarclientessaldossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarClientesSaldos;		
	protected JButton jButtonAbrirOrderByCobrarClientesSaldos;
	
	
	//protected JPanel jPanelOrderByCobrarClientesSaldos;
	//public JScrollPane jScrollPanelOrderByCobrarClientesSaldos;	
	//protected JButton jButtonCerrarOrderByCobrarClientesSaldos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarClientesSaldosLogic cobrarclientessaldosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarClientesSaldos;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesSaldos;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesSaldos;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarClientesSaldosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarClientesSaldos;
	//public JScrollPane jScrollPanelImportacionCobrarClientesSaldos;
	
	
	
	protected JPanel jPanelAccionesCobrarClientesSaldos;
	
    protected JPanel jPanelPaginacionCobrarClientesSaldos;
    protected JPanel jPanelParametrosReportesCobrarClientesSaldos;
	protected JPanel jPanelParametrosReportesAccionesCobrarClientesSaldos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarClientesSaldos;
	protected JPanel jPanelParametrosAuxiliar2CobrarClientesSaldos;
	protected JPanel jPanelParametrosAuxiliar3CobrarClientesSaldos;
	protected JPanel jPanelParametrosAuxiliar4CobrarClientesSaldos;
	//protected JPanel jPanelParametrosAuxiliar5CobrarClientesSaldos;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarClientesSaldos;
	//protected JPanel jPanelImportacionCobrarClientesSaldos;
	
	
	public JTable jTableDatosCobrarClientesSaldos;
	
	
	
	//public JTable jTableDatosCobrarClientesSaldosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarClientesSaldos;
	protected JButton jButtonDuplicarCobrarClientesSaldos;
	protected JButton jButtonCopiarCobrarClientesSaldos;
	protected JButton jButtonVerFormCobrarClientesSaldos;
	protected JButton jButtonNuevoRelacionesCobrarClientesSaldos;
	protected JButton jButtonModificarCobrarClientesSaldos;
	
    protected JButton jButtonGuardarCambiosTablaCobrarClientesSaldos;
	protected JButton jButtonCerrarCobrarClientesSaldos;
	
	
	protected JButton jButtonRecargarInformacionCobrarClientesSaldos;
	protected JButton jButtonProcesarInformacionCobrarClientesSaldos;
	
	
	protected JButton jButtonAnterioresCobrarClientesSaldos;
	protected JButton jButtonSiguientesCobrarClientesSaldos;
	protected JButton jButtonNuevoGuardarCambiosCobrarClientesSaldos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarClientesSaldos;
	//protected JButton jButtonCerrarReporteDinamicoCobrarClientesSaldos;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarClientesSaldos;
	//protected JButton jButtonGenerarImportacionCobrarClientesSaldos;
	//protected JButton jButtonCerrarImportacionCobrarClientesSaldos;
	//protected JFileChooser jFileChooserImportacionCobrarClientesSaldos;
	//protected File fileImportacionCobrarClientesSaldos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesSaldos;
	protected JButton jButtonDuplicarToolBarCobrarClientesSaldos;
	protected JButton jButtonNuevoRelacionesToolBarCobrarClientesSaldos;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarClientesSaldos;
	protected JButton jButtonCopiarToolBarCobrarClientesSaldos;
	protected JButton jButtonVerFormToolBarCobrarClientesSaldos;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesSaldos;
	protected JButton jButtonCerrarToolBarCobrarClientesSaldos;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarClientesSaldos;
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesSaldos;
	protected JButton jButtonAnterioresToolBarCobrarClientesSaldos;
	protected JButton jButtonSiguientesToolBarCobrarClientesSaldos;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarClientesSaldos;
	protected JButton jButtonAbrirOrderByToolBarCobrarClientesSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesSaldos;
	protected JMenuItem jMenuItemDuplicarCobrarClientesSaldos;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarClientesSaldos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarClientesSaldos;
	protected JMenuItem jMenuItemCopiarCobrarClientesSaldos;
	protected JMenuItem jMenuItemVerFormCobrarClientesSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesSaldos;
	protected JMenuItem jMenuItemCerrarCobrarClientesSaldos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesSaldos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarClientesSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesSaldos;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarClientesSaldos;
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesSaldos;
	protected JMenuItem jMenuItemAnterioresCobrarClientesSaldos;
	protected JMenuItem jMenuItemSiguientesCobrarClientesSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesSaldos;
	protected JMenuItem jMenuItemAbrirOrderByCobrarClientesSaldos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesSaldos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarClientesSaldos;
	protected JCheckBox jCheckBoxSeleccionadosCobrarClientesSaldos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarClientesSaldos;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarClientesSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarClientesSaldos;
	protected JTextField jTextFieldValorCampoGeneralCobrarClientesSaldos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarClientesSaldos;
	//public JList<Reporte> jListColumnasSelectReporteCobrarClientesSaldos;
	//public JScrollPane jScrollColumnasSelectReporteCobrarClientesSaldos;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarClientesSaldos;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarClientesSaldos;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarClientesSaldos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarClientesSaldos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesSaldos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarClientesSaldos;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarClientesSaldos;
	
		
	//public JLabel jLabelArchivoImportacionCobrarClientesSaldos;	
	//public JLabel jLabelPathArchivoImportacionCobrarClientesSaldos;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarClientesSaldos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarClientesSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarClientesSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarClientesSaldos;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarClientesSaldos;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarClientesSaldos;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarClientesSaldos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarClientesSaldos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarClientesSaldos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarClientesSaldos;
	public JPanel jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	public JButton jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	
	public JPanel jPanelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	public JLabel jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	public JButton jButtonid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	public JLabel jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos;
	public JButton jButtonfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldosBusqueda= new JButtonMe();

	
	
	
	
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
	public CobrarClientesSaldosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSaldosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSaldosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesSaldosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarClientesSaldos)	{
		this.jButtonRecargarInformacionCobrarClientesSaldos = jButtonRecargarInformacionCobrarClientesSaldos;
	}
	
	public JButton getjButtonProcesarInformacionCobrarClientesSaldos() {
		return this.jButtonProcesarInformacionCobrarClientesSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesSaldos)	{
		this.jButtonProcesarInformacionCobrarClientesSaldos = jButtonProcesarInformacionCobrarClientesSaldos;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarClientesSaldos() {
		return this.jButtonRecargarInformacionCobrarClientesSaldos;
	}
	
	
	public List<CobrarClientesSaldos> getcobrarclientessaldoss() {
		return this.cobrarclientessaldoss;
	}

	public void setcobrarclientessaldoss(List<CobrarClientesSaldos> cobrarclientessaldoss) {
		this.cobrarclientessaldoss = cobrarclientessaldoss;
	}
	
	public List<CobrarClientesSaldos> getcobrarclientessaldossAux() {
		return this.cobrarclientessaldossAux;
	}

	public void setcobrarclientessaldossAux(List<CobrarClientesSaldos> cobrarclientessaldossAux) {
		this.cobrarclientessaldossAux = cobrarclientessaldossAux;
	}
	
	public List<CobrarClientesSaldos> getcobrarclientessaldossEliminados() {
		return this.cobrarclientessaldossEliminados;
	}

	public void setCobrarClientesSaldossEliminados(List<CobrarClientesSaldos> cobrarclientessaldossEliminados) {
		this.cobrarclientessaldossEliminados = cobrarclientessaldossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarClientesSaldos() {
		return jComboBoxTiposSeleccionarCobrarClientesSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarClientesSaldos(
			JComboBox jComboBoxTiposSeleccionarCobrarClientesSaldos) {
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos = jComboBoxTiposSeleccionarCobrarClientesSaldos;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarClientesSaldos() {
		return jTextFieldValorCampoGeneralCobrarClientesSaldos;
	}

	public void setjTextFieldValorCampoGeneralCobrarClientesSaldos(
			JTextField jTextFieldValorCampoGeneralCobrarClientesSaldos) {
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos = jTextFieldValorCampoGeneralCobrarClientesSaldos;
	}

	public void setBorderResaltarValorCampoGeneralCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarClientesSaldos() {
		return this.jCheckBoxSeleccionarTodosCobrarClientesSaldos;
	}

	public void setjCheckBoxSeleccionarTodosCobrarClientesSaldos(
			JCheckBox jCheckBoxSeleccionarTodosCobrarClientesSaldos) {
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos = jCheckBoxSeleccionarTodosCobrarClientesSaldos;
	}

	public void setBorderResaltarSeleccionarTodosCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarClientesSaldos() {
		return this.jCheckBoxSeleccionadosCobrarClientesSaldos;
	}

	public void setjCheckBoxSeleccionadosCobrarClientesSaldos(
			JCheckBox jCheckBoxSeleccionadosCobrarClientesSaldos) {
		this.jCheckBoxSeleccionadosCobrarClientesSaldos = jCheckBoxSeleccionadosCobrarClientesSaldos;
	}
	
	public void setBorderResaltarSeleccionadosCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarClientesSaldos() {
		return this.jComboBoxTiposArchivosReportesCobrarClientesSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarClientesSaldos(
			JComboBox jComboBoxTiposArchivosReportesCobrarClientesSaldos) {
		this.jComboBoxTiposArchivosReportesCobrarClientesSaldos = jComboBoxTiposArchivosReportesCobrarClientesSaldos;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarClientesSaldos() {
		return this.jComboBoxTiposReportesCobrarClientesSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarClientesSaldos(
			JComboBox jComboBoxTiposReportesCobrarClientesSaldos) {
		this.jComboBoxTiposReportesCobrarClientesSaldos = jComboBoxTiposReportesCobrarClientesSaldos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarClientesSaldos() {
	//	return jComboBoxTiposReportesDinamicoCobrarClientesSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarClientesSaldos(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarClientesSaldos) {
	//	this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos = jComboBoxTiposReportesDinamicoCobrarClientesSaldos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos = jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos;
	//}
	
	public void setBorderResaltarTiposReportesCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarClientesSaldos() {
		return this.jComboBoxTiposGraficosReportesCobrarClientesSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarClientesSaldos(
			JComboBox jComboBoxTiposGraficosReportesCobrarClientesSaldos) {
		this.jComboBoxTiposGraficosReportesCobrarClientesSaldos = jComboBoxTiposGraficosReportesCobrarClientesSaldos;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarClientesSaldos() {
		return this.jComboBoxTiposPaginacionCobrarClientesSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarClientesSaldos(
			JComboBox jComboBoxTiposPaginacionCobrarClientesSaldos) {
		this.jComboBoxTiposPaginacionCobrarClientesSaldos = jComboBoxTiposPaginacionCobrarClientesSaldos;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarClientesSaldos() {
		return this.jComboBoxTiposRelacionesCobrarClientesSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesSaldos() {
		return this.jComboBoxTiposAccionesCobrarClientesSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesSaldos(
			JComboBox jComboBoxTiposRelacionesCobrarClientesSaldos) {
		this.jComboBoxTiposRelacionesCobrarClientesSaldos = jComboBoxTiposRelacionesCobrarClientesSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesSaldos(
			JComboBox jComboBoxTiposAccionesCobrarClientesSaldos) {
		this.jComboBoxTiposAccionesCobrarClientesSaldos = jComboBoxTiposAccionesCobrarClientesSaldos;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarClientesSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarClientesSaldos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarClientesSaldos() {
	//	return jCheckBoxConGraficoDinamicoCobrarClientesSaldos;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarClientesSaldos(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesSaldos) {
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos = jCheckBoxConGraficoDinamicoCobrarClientesSaldos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarClientesSaldos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarClientesSaldos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos .setBorder(borderResaltar);		
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
		this.cobrarclientessaldosSessionBean=new CobrarClientesSaldosSessionBean();
		
		this.cobrarclientessaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientessaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarClientesSaldosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarClientesSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarClientesSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarClientesSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarClientesSaldos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"nuevo","nuevo","Nuevo"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"duplicar","duplicar","Duplicar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"copiar","copiar","Copiar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"ver_form","ver_form","Ver"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"recargar","recargar","Buscar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarClientesSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarClientesSaldos,this.jTtoolBarCobrarClientesSaldos,
							"cerrar","cerrar","Salir"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarClientesSaldos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarClientesSaldos;
			
				this.jButtonProcesarInformacionToolBarCobrarClientesSaldos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarClientesSaldos;
				
		//protected JButton jButtonModificarToolBarCobrarClientesSaldos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarClientesSaldos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarClientesSaldos=new JMenuMe("General");
		this.jmenuArchivoCobrarClientesSaldos=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarClientesSaldos=new JMenuMe("Acciones");
		this.jmenuDatosCobrarClientesSaldos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarClientesSaldos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarClientesSaldos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarClientesSaldos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarClientesSaldos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarClientesSaldos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarClientesSaldos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarClientesSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarClientesSaldos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarClientesSaldos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarClientesSaldos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarClientesSaldos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarClientesSaldos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarClientesSaldos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarClientesSaldos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarClientesSaldos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarClientesSaldos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarClientesSaldos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarClientesSaldos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarClientesSaldos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarClientesSaldos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarClientesSaldos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarClientesSaldos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarClientesSaldos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarClientesSaldos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarClientesSaldos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarClientesSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarClientesSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarClientesSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarClientesSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarClientesSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarClientesSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarClientesSaldos.add(this.jMenuItemCerrarCobrarClientesSaldos);
			
			this.jmenuAccionesCobrarClientesSaldos.add(this.jMenuItemNuevoCobrarClientesSaldos);
			this.jmenuAccionesCobrarClientesSaldos.add(this.jMenuItemNuevoGuardarCambiosCobrarClientesSaldos);
			this.jmenuAccionesCobrarClientesSaldos.add(this.jMenuItemNuevoRelacionesCobrarClientesSaldos);
			this.jmenuAccionesCobrarClientesSaldos.add(this.jMenuItemGuardarCambiosTablaCobrarClientesSaldos);		
			this.jmenuAccionesCobrarClientesSaldos.add(this.jMenuItemDuplicarCobrarClientesSaldos);		
			this.jmenuAccionesCobrarClientesSaldos.add(this.jMenuItemCopiarCobrarClientesSaldos);		
			this.jmenuAccionesCobrarClientesSaldos.add(this.jMenuItemVerFormCobrarClientesSaldos);		
			
			this.jmenuDatosCobrarClientesSaldos.add(this.jMenuItemRecargarInformacionCobrarClientesSaldos);				
			this.jmenuDatosCobrarClientesSaldos.add(this.jMenuItemAnterioresCobrarClientesSaldos);				
			this.jmenuDatosCobrarClientesSaldos.add(this.jMenuItemSiguientesCobrarClientesSaldos);				
			this.jmenuDatosCobrarClientesSaldos.add(this.jMenuItemAbrirOrderByCobrarClientesSaldos);				
			this.jmenuDatosCobrarClientesSaldos.add(this.jMenuItemMostrarOcultarCobrarClientesSaldos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarClientesSaldos.add(this.jMenuItemGuardarCambiosCobrarClientesSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarClientesSaldos.add(this.jmenuArchivoCobrarClientesSaldos);		
			this.jmenuBarCobrarClientesSaldos.add(this.jmenuAccionesCobrarClientesSaldos);		
			this.jmenuBarCobrarClientesSaldos.add(this.jmenuDatosCobrarClientesSaldos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarClientesSaldos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarClientesSaldos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos.setToolTipText("Buscar Por Ejercicio Por Fecha Emision Hasta ");
		this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos= new JButtonMe();
		this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos.setText("Buscar");
		this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos.setToolTipText("Buscar Por Ejercicio Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos,"buscar_button","Buscar Por Ejercicio Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos = new JLabelMe();
		jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarClientesSaldos=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarClientesSaldos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCobrarClientesSaldos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCobrarClientesSaldos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarClientesSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarClientesSaldos = new CobrarClientesSaldosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Clientes Saldos DATOS");
			this.jInternalFrameDetalleFormCobrarClientesSaldos = new CobrarClientesSaldosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientessaldosSessionBean.getConGuardarRelaciones(),this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarClientesSaldos = null;//new CobrarClientesSaldosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesSaldos= new GridBagLayout();
		
		
		this.jTableDatosCobrarClientesSaldos = new JTableMe();      
		
		String sToolTipCobrarClientesSaldos="";
		sToolTipCobrarClientesSaldos=CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesSaldos+="(Cartera.CobrarClientesSaldos)";
		}
		
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesSaldos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarClientesSaldos.setToolTipText(sToolTipCobrarClientesSaldos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarClientesSaldos);
		this.jTableDatosCobrarClientesSaldos.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarClientesSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarClientesSaldos.setRowSelectionAllowed(true);
		this.jTableDatosCobrarClientesSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarClientesSaldos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarClientesSaldos = new JButtonMe();
		this.jButtonDuplicarCobrarClientesSaldos = new JButtonMe();
		this.jButtonCopiarCobrarClientesSaldos = new JButtonMe();
		this.jButtonVerFormCobrarClientesSaldos = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarClientesSaldos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos = new JButtonMe();
		this.jButtonCerrarCobrarClientesSaldos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesSaldos = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarClientesSaldos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Saldos";
		
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesSaldos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesSaldos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarClientesSaldos=new ReporteDinamicoJInternalFrame(CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarClientesSaldos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarClientesSaldos=new ImportacionJInternalFrame(CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarClientesSaldos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarClientesSaldos = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarClientesSaldos.setText("Orden");
		this.jButtonAbrirOrderByCobrarClientesSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesSaldos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSaldos,false,this);
			
			//this.cargarOrderByCobrarClientesSaldos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSaldos,true,this);
			
			//this.cargarOrderByCobrarClientesSaldos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarClientesSaldos.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosCobrarClientesSaldos.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosCobrarClientesSaldos.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosCobrarClientesSaldos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesSaldos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesSaldos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarClientesSaldos.setText("Nuevo");
		this.jButtonDuplicarCobrarClientesSaldos.setText("Duplicar");
		this.jButtonCopiarCobrarClientesSaldos.setText("Copiar");
		this.jButtonVerFormCobrarClientesSaldos.setText("Ver");
		this.jButtonNuevoRelacionesCobrarClientesSaldos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.setText("Guardar");
		this.jButtonCerrarCobrarClientesSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesSaldos,"nuevo_button","Nuevo",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarClientesSaldos,"duplicar_button","Duplicar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarClientesSaldos,"copiar_button","Copiar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarClientesSaldos,"ver_form","Ver",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarClientesSaldos,"nuevorelaciones_button","Nuevo Rel",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesSaldos,"guardarcambiostabla_button","Guardar",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesSaldos,"cerrar_button","Salir",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarClientesSaldos.setToolTipText("Nuevo"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarClientesSaldos.setToolTipText("Duplicar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarClientesSaldos.setToolTipText("Copiar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarClientesSaldos.setToolTipText("Ver"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarClientesSaldos.setToolTipText("Nuevo Rel"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.setToolTipText("Guardar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesSaldos.setToolTipText("Salir"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesSaldos";
		inputMap = this.jButtonNuevoCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesSaldos"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarClientesSaldos";
		inputMap = this.jButtonDuplicarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarClientesSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarClientesSaldos"));
		
		//COPIAR
		sMapKey = "CopiarCobrarClientesSaldos";
		inputMap = this.jButtonCopiarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarClientesSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarClientesSaldos"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarClientesSaldos";
		inputMap = this.jButtonVerFormCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarClientesSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarClientesSaldos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarClientesSaldos";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarClientesSaldos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarClientesSaldos";
		inputMap = this.jButtonModificarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarClientesSaldos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesSaldos";
		inputMap = this.jButtonCerrarCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesSaldos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesSaldos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarClientesSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarClientesSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarClientesSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarClientesSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarClientesSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarClientesSaldos.setName("jPanelParametrosReportesCobrarClientesSaldos"); 
		
		this.jPanelParametrosReportesAccionesCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarClientesSaldos.setName("jPanelParametrosReportesAccionesCobrarClientesSaldos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarClientesSaldos = new JButtonMe();
		this.jButtonRecargarInformacionCobrarClientesSaldos.setText("Buscar");
		this.jButtonRecargarInformacionCobrarClientesSaldos.setToolTipText("Buscar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarClientesSaldos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarClientesSaldos.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarClientesSaldos = new JButtonMe();
		this.jButtonProcesarInformacionCobrarClientesSaldos.setText("Procesar");
		this.jButtonProcesarInformacionCobrarClientesSaldos.setToolTipText("Procesar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarClientesSaldos.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarClientesSaldos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesSaldos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesSaldos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarClientesSaldos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarClientesSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarClientesSaldos.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarClientesSaldos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarClientesSaldos.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarClientesSaldos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesSaldos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarClientesSaldos.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesSaldos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarClientesSaldos = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesSaldos.setText("Acciones");		
		this.jLabelAccionesCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarClientesSaldos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarClientesSaldos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarClientesSaldos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarClientesSaldos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarClientesSaldos.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarClientesSaldos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarClientesSaldos = new JButtonMe();
		//this.jButtonAnterioresCobrarClientesSaldos.setText("<<");
        this.jButtonAnterioresCobrarClientesSaldos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarClientesSaldos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarClientesSaldos = new JButtonMe();
		//this.jButtonSiguientesCobrarClientesSaldos.setText(">>");
        this.jButtonSiguientesCobrarClientesSaldos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarClientesSaldos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSaldos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarClientesSaldos.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarClientesSaldos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarClientesSaldos,"nuevoguardarcambios_button","Nue",this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarClientesSaldos";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarClientesSaldos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarClientesSaldos";
		inputMap = this.jButtonRecargarInformacionCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarClientesSaldos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarClientesSaldos";
		inputMap = this.jButtonSiguientesCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarClientesSaldos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarClientesSaldos";
		inputMap = this.jButtonAnterioresCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarClientesSaldos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarClientesSaldos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarClientesSaldos.setMinimumSize(new Dimension(this.getWidth(),CobrarClientesSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesSaldos.setMaximumSize(new Dimension(this.getWidth(),CobrarClientesSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesSaldos.setPreferredSize(new Dimension(this.getWidth(),CobrarClientesSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarClientesSaldos = new GridBagLayout();

			this.jPanelPaginacionCobrarClientesSaldos.setLayout(gridaBagLayoutPaginacionCobrarClientesSaldos);						
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonAnterioresCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
					
						
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
			
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonNuevoGuardarCambiosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
						
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonSiguientesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonNuevoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
						
			
			
			if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarClientesSaldos.gridy = 1;
				this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonGuardarCambiosTablaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			}
			
			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonDuplicarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonCopiarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonVerFormCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 1;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarClientesSaldos.add(this.jButtonCerrarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		
		this.jButtonRecargarInformacionCobrarClientesSaldos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesSaldos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesSaldos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesSaldos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarClientesSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarClientesSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarClientesSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarClientesSaldos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesSaldos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesSaldos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesSaldos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarClientesSaldos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesSaldos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesSaldos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarClientesSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarClientesSaldos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarClientesSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarClientesSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarClientesSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarClientesSaldos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarClientesSaldos.setLayout(gridaBagParametrosReportesCobrarClientesSaldos);
			this.jPanelParametrosReportesAccionesCobrarClientesSaldos.setLayout(gridaBagParametrosReportesAccionesCobrarClientesSaldos);
			
			
			this.jPanelParametrosAuxiliar1CobrarClientesSaldos.setLayout(gridaBagParametrosAuxiliar1CobrarClientesSaldos);
			this.jPanelParametrosAuxiliar2CobrarClientesSaldos.setLayout(gridaBagParametrosAuxiliar2CobrarClientesSaldos);
			this.jPanelParametrosAuxiliar3CobrarClientesSaldos.setLayout(gridaBagParametrosAuxiliar3CobrarClientesSaldos);
			this.jPanelParametrosAuxiliar4CobrarClientesSaldos.setLayout(gridaBagParametrosAuxiliar4CobrarClientesSaldos);
			//this.jPanelParametrosAuxiliar5CobrarClientesSaldos.setLayout(gridaBagParametrosAuxiliar2CobrarClientesSaldos);			
			
			
			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jButtonRecargarInformacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesSaldos.add(this.jComboBoxTiposPaginacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesSaldos.add(this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesSaldos.add(this.jComboBoxTiposArchivosReportesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jPanelParametrosAuxiliar1CobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarClientesSaldos.add(this.jComboBoxTiposReportesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);																		
			
			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarClientesSaldos.add(this.jComboBoxTiposGraficosReportesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jPanelParametrosAuxiliar4CobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jComboBoxTiposReportesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jCheckBoxGenerarReporteCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jPanelParametrosAuxiliar2CobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jLabelAccionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jButtonAbrirOrderByCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jComboBoxTiposSeleccionarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
			
			
			/*
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jCheckBoxSeleccionarTodosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jCheckBoxConGraficoReporteCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesSaldos.add(this.jCheckBoxSeleccionarTodosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);															
				
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesSaldos.add(this.jCheckBoxSeleccionadosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);															
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesSaldos.add(this.jCheckBoxConGraficoReporteCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jPanelParametrosAuxiliar3CobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesSaldos.add(this.jComboBoxTiposAccionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarClientesSaldos = new GridBagLayout();

			this.jScrollPanelDatosCobrarClientesSaldos.setLayout(gridaBagLayoutDatosCobrarClientesSaldos);
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
			
			this.jScrollPanelDatosCobrarClientesSaldos.add(this.jTableDatosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarClientesSaldos.setViewportView(this.jTableDatosCobrarClientesSaldos);
		this.jTableDatosCobrarClientesSaldos.setFillsViewportHeight(true);
		this.jTableDatosCobrarClientesSaldos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesSaldos= new GridBagLayout();
		this.jPanelAccionesCobrarClientesSaldos.setLayout(gridaBagLayoutAccionesCobrarClientesSaldos);
		
		
		/*	
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
			
		this.jPanelAccionesCobrarClientesSaldos.add(this.jButtonNuevoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarClientesSaldosCobrarClientesSaldos= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarClientesSaldosCobrarClientesSaldos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesSaldosCobrarClientesSaldos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesSaldosCobrarClientesSaldos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarClientesSaldosCobrarClientesSaldos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos.setLayout(gridaBagLayoutBusquedaCobrarClientesSaldosCobrarClientesSaldos);

		gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		gridBagConstraintsCobrarClientesSaldos.gridx = 0;
		jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos.add(jLabelid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);

		gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSaldos.gridy = 0;
		gridBagConstraintsCobrarClientesSaldos.gridx = 1;
		jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos.add(jComboBoxid_ejercicioBusquedaCobrarClientesSaldosCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);


		gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSaldos.gridy = 1;
		gridBagConstraintsCobrarClientesSaldos.gridx = 0;
		jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos.add(jLabelfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);

		gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSaldos.gridy = 1;
		gridBagConstraintsCobrarClientesSaldos.gridx = 1;
		jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos.add(jDateChooserfecha_emision_hastaBusquedaCobrarClientesSaldosCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);

		gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesSaldos.gridy = 2;
		gridBagConstraintsCobrarClientesSaldos.gridx =1;
		jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos.add(jButtonBusquedaCobrarClientesSaldosCobrarClientesSaldos, gridBagConstraintsCobrarClientesSaldos);

		jTabbedPaneBusquedasCobrarClientesSaldos.addTab("1.-Por Ejercicio Por Fecha Emision Hasta ", jPanelBusquedaCobrarClientesSaldosCobrarClientesSaldos);
		jTabbedPaneBusquedasCobrarClientesSaldos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesSaldos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesSaldos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;		
		//this.gridBagConstraintsCobrarClientesSaldos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarClientesSaldos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarClientesSaldos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;		
			this.gridBagConstraintsCobrarClientesSaldos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarClientesSaldos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);								
		
		
		/*
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		*/		
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesSaldos.gridx =0;
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
				
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarClientesSaldosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarClientesSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesSaldos = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarClientesSaldos.setLayout(gridaBagLayoutBusquedasParametrosCobrarClientesSaldos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarClientesSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
			
			
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
			
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarClientesSaldos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarClientesSaldos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarClientesSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarClientesSaldos.setName("jPanelReporteDinamicoCobrarClientesSaldos"); 
		
		this.jPanelReporteDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarClientesSaldos.setLayout(gridaBagLayoutReporteDinamicoCobrarClientesSaldos);
		
		
		this.jInternalFrameReporteDinamicoCobrarClientesSaldos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarClientesSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Saldoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarClientesSaldos = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarClientesSaldos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelColumnasSelectReporteCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarClientesSaldos = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarClientesSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarClientesSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarClientesSaldos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesSaldos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarClientesSaldos=new JScrollPane(this.jListColumnasSelectReporteCobrarClientesSaldos);
			
			this.jScrollColumnasSelectReporteCobrarClientesSaldos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesSaldos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesSaldos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jListColumnasSelectReporteCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jScrollColumnasSelectReporteCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarClientesSaldos = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarClientesSaldos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarClientesSaldos = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarClientesSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarClientesSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarClientesSaldos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesSaldos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarClientesSaldos=new JScrollPane(this.jListRelacionesSelectReporteCobrarClientesSaldos);
			
			this.jScrollRelacionesSelectReporteCobrarClientesSaldos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesSaldos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesSaldos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarClientesSaldos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarClientesSaldos = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarClientesSaldos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelConGraficoDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jCheckBoxConGraficoDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarClientesSaldos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarClientesSaldos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelColumnaCategoriaGraficoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarClientesSaldos = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarClientesSaldos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelColumnaCategoriaValorCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarClientesSaldos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarClientesSaldos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jComboBoxColumnaCategoriaValorCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarClientesSaldos = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarClientesSaldos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelColumnasValoresGraficoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarClientesSaldos = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarClientesSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarClientesSaldos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarClientesSaldos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarClientesSaldos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarClientesSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarClientesSaldos=new JScrollPane(this.jListColumnasValoresGraficoCobrarClientesSaldos);
			
			this.jScrollColumnasValoresGraficoCobrarClientesSaldos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarClientesSaldos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarClientesSaldos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jListColumnasSelectReporteCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jScrollColumnasValoresGraficoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSaldos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSaldos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelTiposGraficosReportesDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSaldos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarClientesSaldos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSaldos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSaldos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSaldos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelGenerarExcelReporteDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos.setToolTipText("Generar EXCEL"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jButtonGenerarExcelReporteDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jComboBoxTiposReportesDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSaldos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSaldos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jLabelTiposArchivoReporteDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarClientesSaldos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarClientesSaldos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarClientesSaldos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarClientesSaldos.setToolTipText("Generar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jButtonGenerarReporteDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarClientesSaldos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarClientesSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarClientesSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarClientesSaldos.setToolTipText("Cancelar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesSaldos.add(this.jButtonCerrarReporteDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarClientesSaldos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarClientesSaldos= new JScrollPane(jPanelReporteDinamicoCobrarClientesSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Saldoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesSaldos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarClientesSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarClientesSaldos);
		this.jInternalFrameReporteDinamicoCobrarClientesSaldos.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarClientesSaldos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarClientesSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarClientesSaldos.setName("jPanelImportacionCobrarClientesSaldos"); 
		
		this.jPanelImportacionCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarClientesSaldos.setLayout(gridaBagLayoutImportacionCobrarClientesSaldos);
		
		
		this.jInternalFrameImportacionCobrarClientesSaldos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarClientesSaldos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarClientesSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarClientesSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarClientesSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesSaldos.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesSaldos.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesSaldos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarClientesSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesSaldos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarClientesSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesSaldos.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesSaldos.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesSaldos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Saldoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarClientesSaldos = new JLabelMe();

		this.jLabelArchivoImportacionCobrarClientesSaldos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesSaldos.add(this.jLabelArchivoImportacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarClientesSaldos = new JFileChooser();		
		this.jFileChooserImportacionCobrarClientesSaldos.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarClientesSaldos = new JButtonMe();
		this.jButtonAbrirImportacionCobrarClientesSaldos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarClientesSaldos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarClientesSaldos.setToolTipText("Generar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSaldos.add(this.jButtonAbrirImportacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarClientesSaldos = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarClientesSaldos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarClientesSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesSaldos.add(this.jLabelPathArchivoImportacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarClientesSaldos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarClientesSaldos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesSaldos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesSaldos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSaldos.add(this.jTextFieldPathArchivoImportacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarClientesSaldos = new JButtonMe();
		this.jButtonGenerarImportacionCobrarClientesSaldos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarClientesSaldos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarClientesSaldos.setToolTipText("Generar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSaldos.add(this.jButtonGenerarImportacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarClientesSaldos = new JButtonMe();
		this.jButtonCerrarImportacionCobrarClientesSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarClientesSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarClientesSaldos.setToolTipText("Cancelar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesSaldos.add(this.jButtonCerrarImportacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarClientesSaldos = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarClientesSaldos= new JScrollPane(jPanelImportacionCobrarClientesSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesSaldos.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarClientesSaldos.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarClientesSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarClientesSaldos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarClientesSaldos);
		this.jInternalFrameImportacionCobrarClientesSaldos.getContentPane().add(this.jScrollPanelImportacionCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarClientesSaldos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarClientesSaldos = new JButtonMe();
			this.jButtonAbrirOrderByCobrarClientesSaldos.setText("Orden");
			this.jButtonAbrirOrderByCobrarClientesSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesSaldos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarClientesSaldos";
			inputMap = this.jButtonAbrirOrderByCobrarClientesSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarClientesSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarClientesSaldos"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarClientesSaldos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarClientesSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarClientesSaldos.setName("jPanelOrderByCobrarClientesSaldos"); 
			
			this.jPanelOrderByCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarClientesSaldos.setLayout(gridaBagLayoutOrderByCobrarClientesSaldos);
			
			
			this.jTableDatosCobrarClientesSaldosOrderBy = new JTableMe();        
			this.jTableDatosCobrarClientesSaldosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarClientesSaldosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarClientesSaldosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarClientesSaldosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarClientesSaldosOrderBy.setViewportView(this.jTableDatosCobrarClientesSaldosOrderBy);
			this.jTableDatosCobrarClientesSaldosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarClientesSaldosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarClientesSaldos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarClientesSaldos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarClientesSaldos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarClientesSaldos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarClientesSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarClientesSaldos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarClientesSaldos.setTitle("Orden");
			this.jInternalFrameOrderByCobrarClientesSaldos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarClientesSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarClientesSaldos.setResizable(true);
			this.jInternalFrameOrderByCobrarClientesSaldos.setClosable(true);
			this.jInternalFrameOrderByCobrarClientesSaldos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarClientesSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Saldoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarClientesSaldos.ipady =150;
				
			this.jPanelOrderByCobrarClientesSaldos.add(jScrollPanelDatosCobrarClientesSaldosOrderBy, this.gridBagConstraintsCobrarClientesSaldos);//this.jTableDatosCobrarClientesSaldosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarClientesSaldos = new JButtonMe();
			this.jButtonCerrarOrderByCobrarClientesSaldos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarClientesSaldos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarClientesSaldos.setToolTipText("Cancelar"+" "+CobrarClientesSaldosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarClientesSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesSaldos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesSaldos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarClientesSaldos.add(this.jButtonCerrarOrderByCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarClientesSaldos = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarClientesSaldos= new JScrollPane(jPanelOrderByCobrarClientesSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarClientesSaldos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesSaldos.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarClientesSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesSaldos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarClientesSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarClientesSaldos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarClientesSaldos);
			
			this.jInternalFrameOrderByCobrarClientesSaldos.getContentPane().add(this.jScrollPanelOrderByCobrarClientesSaldos, this.gridBagConstraintsCobrarClientesSaldos);			
		
		} else {
			this.jButtonAbrirOrderByCobrarClientesSaldos = new JButtonMe();
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
		//	&& this.cobrarclientessaldosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarClientesSaldos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarClientesSaldos.getRowHeight();//CobrarClientesSaldosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos.isSelected()) {
					iHeightTable=CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesSaldos.isSelected()) {
					iHeightTable=CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarClientesSaldos!=null && this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarclientessaldosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarClientesSaldos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarClientesSaldos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarClientesSaldos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarClientesSaldos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarClientesSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarclientessaldosLogic.getCobrarClientesSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientessaldoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarClientesSaldos> TraerCobrarClientesSaldosBeans(List<CobrarClientesSaldos> cobrarclientessaldoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarClientesSaldos cobrarclientessaldos:cobrarclientessaldoss) {
					
				if(!(CobrarClientesSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarClientesSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarclientessaldos.setsDetalleGeneralEntityReporte(CobrarClientesSaldosConstantesFunciones.getCobrarClientesSaldosDescripcion(cobrarclientessaldos));
										
						
					
						
					
				} else  {
							
					//cobrarclientessaldos.setsDetalleGeneralEntityReporte(cobrarclientessaldos.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarclientessaldosbeans.add(cobrarclientessaldosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarclientessaldoss;
    }
	//PARA REPORTES FIN
}
