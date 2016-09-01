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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.ConciliacionesBancariasConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class ConciliacionesBancariasJInternalFrame extends ConciliacionesBancariasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConciliacionesBancarias;
	
	protected JMenuBar jmenuBarConciliacionesBancarias;
	
	protected JMenu jmenuConciliacionesBancarias;
	protected JMenu jmenuDatosConciliacionesBancarias;
	protected JMenu jmenuArchivoConciliacionesBancarias;
	protected JMenu jmenuAccionesConciliacionesBancarias;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConciliacionesBancarias;	
	protected GridBagConstraints gridBagConstraintsConciliacionesBancarias;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConciliacionesBancariasDetalleFormJInternalFrame jInternalFrameDetalleFormConciliacionesBancarias;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConciliacionesBancarias;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConciliacionesBancarias;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public ConciliacionesBancariasSessionBean conciliacionesbancariasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConciliacionesBancarias> conciliacionesbancariass;		
	public List<ConciliacionesBancarias> conciliacionesbancariassEliminados;	
	public List<ConciliacionesBancarias> conciliacionesbancariassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConciliacionesBancarias;		
	protected JButton jButtonAbrirOrderByConciliacionesBancarias;
	
	
	//protected JPanel jPanelOrderByConciliacionesBancarias;
	//public JScrollPane jScrollPanelOrderByConciliacionesBancarias;	
	//protected JButton jButtonCerrarOrderByConciliacionesBancarias;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConciliacionesBancariasLogic conciliacionesbancariasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosEdicionConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosGeneralConciliacionesBancarias;
    
	
	
	//public JScrollPane jScrollPanelDatosConciliacionesBancariasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConciliacionesBancarias;
	//public JScrollPane jScrollPanelImportacionConciliacionesBancarias;
	
	
	
	protected JPanel jPanelAccionesConciliacionesBancarias;
	
    protected JPanel jPanelPaginacionConciliacionesBancarias;
    protected JPanel jPanelParametrosReportesConciliacionesBancarias;
	protected JPanel jPanelParametrosReportesAccionesConciliacionesBancarias;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConciliacionesBancarias;
	protected JPanel jPanelParametrosAuxiliar2ConciliacionesBancarias;
	protected JPanel jPanelParametrosAuxiliar3ConciliacionesBancarias;
	protected JPanel jPanelParametrosAuxiliar4ConciliacionesBancarias;
	//protected JPanel jPanelParametrosAuxiliar5ConciliacionesBancarias;
	
	
	
	//protected JPanel jPanelReporteDinamicoConciliacionesBancarias;
	//protected JPanel jPanelImportacionConciliacionesBancarias;
	
	
	public JTable jTableDatosConciliacionesBancarias;
	
	
	
	//public JTable jTableDatosConciliacionesBancariasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConciliacionesBancarias;
	protected JButton jButtonDuplicarConciliacionesBancarias;
	protected JButton jButtonCopiarConciliacionesBancarias;
	protected JButton jButtonVerFormConciliacionesBancarias;
	protected JButton jButtonNuevoRelacionesConciliacionesBancarias;
	protected JButton jButtonModificarConciliacionesBancarias;
	
    protected JButton jButtonGuardarCambiosTablaConciliacionesBancarias;
	protected JButton jButtonCerrarConciliacionesBancarias;
	
	
	protected JButton jButtonRecargarInformacionConciliacionesBancarias;
	protected JButton jButtonProcesarInformacionConciliacionesBancarias;
	
	
	protected JButton jButtonAnterioresConciliacionesBancarias;
	protected JButton jButtonSiguientesConciliacionesBancarias;
	protected JButton jButtonNuevoGuardarCambiosConciliacionesBancarias;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConciliacionesBancarias;
	//protected JButton jButtonCerrarReporteDinamicoConciliacionesBancarias;
	//protected JButton jButtonGenerarExcelReporteDinamicoConciliacionesBancarias;	
	
	
	
	//protected JButton jButtonAbrirImportacionConciliacionesBancarias;
	//protected JButton jButtonGenerarImportacionConciliacionesBancarias;
	//protected JButton jButtonCerrarImportacionConciliacionesBancarias;
	//protected JFileChooser jFileChooserImportacionConciliacionesBancarias;
	//protected File fileImportacionConciliacionesBancarias;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConciliacionesBancarias;
	protected JButton jButtonDuplicarToolBarConciliacionesBancarias;
	protected JButton jButtonNuevoRelacionesToolBarConciliacionesBancarias;
	
	
	public JButton jButtonGuardarCambiosToolBarConciliacionesBancarias;
	protected JButton jButtonCopiarToolBarConciliacionesBancarias;
	protected JButton jButtonVerFormToolBarConciliacionesBancarias;
	public JButton jButtonGuardarCambiosTablaToolBarConciliacionesBancarias;
	protected JButton jButtonMostrarOcultarTablaToolBarConciliacionesBancarias;
	protected JButton jButtonCerrarToolBarConciliacionesBancarias;
	
	protected JButton jButtonRecargarInformacionToolBarConciliacionesBancarias;
	protected JButton jButtonProcesarInformacionToolBarConciliacionesBancarias;
	protected JButton jButtonAnterioresToolBarConciliacionesBancarias;
	protected JButton jButtonSiguientesToolBarConciliacionesBancarias;
	protected JButton jButtonNuevoGuardarCambiosToolBarConciliacionesBancarias;
	protected JButton jButtonAbrirOrderByToolBarConciliacionesBancarias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConciliacionesBancarias;
	protected JMenuItem jMenuItemDuplicarConciliacionesBancarias;
	protected JMenuItem jMenuItemNuevoRelacionesConciliacionesBancarias;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConciliacionesBancarias;
	protected JMenuItem jMenuItemCopiarConciliacionesBancarias;
	protected JMenuItem jMenuItemVerFormConciliacionesBancarias;
	protected JMenuItem jMenuItemGuardarCambiosTablaConciliacionesBancarias;
	protected JMenuItem jMenuItemCerrarConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleCerrarConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleMostarOcultarConciliacionesBancarias;
	
	protected JMenuItem jMenuItemRecargarInformacionConciliacionesBancarias;
	protected JMenuItem jMenuItemProcesarInformacionConciliacionesBancarias;
	protected JMenuItem jMenuItemAnterioresConciliacionesBancarias;
	protected JMenuItem jMenuItemSiguientesConciliacionesBancarias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConciliacionesBancarias;
	protected JMenuItem jMenuItemAbrirOrderByConciliacionesBancarias;
	protected JMenuItem jMenuItemMostrarOcultarConciliacionesBancarias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConciliacionesBancarias;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConciliacionesBancarias;
	protected JCheckBox jCheckBoxSeleccionadosConciliacionesBancarias;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConciliacionesBancarias;
	protected JCheckBox jCheckBoxConGraficoReporteConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConciliacionesBancarias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConciliacionesBancarias;
	protected JTextField jTextFieldValorCampoGeneralConciliacionesBancarias;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConciliacionesBancarias;
	//public JList<Reporte> jListColumnasSelectReporteConciliacionesBancarias;
	//public JScrollPane jScrollColumnasSelectReporteConciliacionesBancarias;
	
	//public JLabel jLabelRelacionesSelectReporteConciliacionesBancarias;
	//public JList<Reporte> jListRelacionesSelectReporteConciliacionesBancarias;
	//public JScrollPane jScrollRelacionesSelectReporteConciliacionesBancarias;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConciliacionesBancarias;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConciliacionesBancarias;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConciliacionesBancarias;
	//public JLabel jLabelTiposArchivoReporteDinamicoConciliacionesBancarias;
	
		
	//public JLabel jLabelArchivoImportacionConciliacionesBancarias;	
	//public JLabel jLabelPathArchivoImportacionConciliacionesBancarias;
	//protected JTextField jTextFieldPathArchivoImportacionConciliacionesBancarias;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConciliacionesBancarias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConciliacionesBancarias;
	
	//public JLabel jLabelColumnaCategoriaValorConciliacionesBancarias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConciliacionesBancarias;
	
	//public JLabel jLabelColumnasValoresGraficoConciliacionesBancarias;
	//public JList<Reporte> jListColumnasValoresGraficoConciliacionesBancarias;
	//public JScrollPane jScrollColumnasValoresGraficoConciliacionesBancarias;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConciliacionesBancarias;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConciliacionesBancarias;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConciliacionesBancarias;
	public JPanel jPanelBusquedaConciliacionesBancariasConciliacionesBancarias;
	public JButton jButtonBusquedaConciliacionesBancariasConciliacionesBancarias;
	
	public JPanel jPanelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias;
	public JLabel jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias;
	public JButton jButtonid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias;
	public JLabel jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias;
	public JButton jButtonfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias;
	public JLabel jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias;
	public JButton jButtonfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancariasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConciliacionesBancariasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConciliacionesBancariasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConciliacionesBancariasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConciliacionesBancariasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConciliacionesBancarias)	{
		this.jButtonRecargarInformacionConciliacionesBancarias = jButtonRecargarInformacionConciliacionesBancarias;
	}
	
	public JButton getjButtonProcesarInformacionConciliacionesBancarias() {
		return this.jButtonProcesarInformacionConciliacionesBancarias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConciliacionesBancarias)	{
		this.jButtonProcesarInformacionConciliacionesBancarias = jButtonProcesarInformacionConciliacionesBancarias;
	}
	
	
	public JButton getjButtonRecargarInformacionConciliacionesBancarias() {
		return this.jButtonRecargarInformacionConciliacionesBancarias;
	}
	
	
	public List<ConciliacionesBancarias> getconciliacionesbancariass() {
		return this.conciliacionesbancariass;
	}

	public void setconciliacionesbancariass(List<ConciliacionesBancarias> conciliacionesbancariass) {
		this.conciliacionesbancariass = conciliacionesbancariass;
	}
	
	public List<ConciliacionesBancarias> getconciliacionesbancariassAux() {
		return this.conciliacionesbancariassAux;
	}

	public void setconciliacionesbancariassAux(List<ConciliacionesBancarias> conciliacionesbancariassAux) {
		this.conciliacionesbancariassAux = conciliacionesbancariassAux;
	}
	
	public List<ConciliacionesBancarias> getconciliacionesbancariassEliminados() {
		return this.conciliacionesbancariassEliminados;
	}

	public void setConciliacionesBancariassEliminados(List<ConciliacionesBancarias> conciliacionesbancariassEliminados) {
		this.conciliacionesbancariassEliminados = conciliacionesbancariassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConciliacionesBancarias() {
		return jComboBoxTiposSeleccionarConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConciliacionesBancarias(
			JComboBox jComboBoxTiposSeleccionarConciliacionesBancarias) {
		this.jComboBoxTiposSeleccionarConciliacionesBancarias = jComboBoxTiposSeleccionarConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposSeleccionarConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConciliacionesBancarias() {
		return jTextFieldValorCampoGeneralConciliacionesBancarias;
	}

	public void setjTextFieldValorCampoGeneralConciliacionesBancarias(
			JTextField jTextFieldValorCampoGeneralConciliacionesBancarias) {
		this.jTextFieldValorCampoGeneralConciliacionesBancarias = jTextFieldValorCampoGeneralConciliacionesBancarias;
	}

	public void setBorderResaltarValorCampoGeneralConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConciliacionesBancarias .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConciliacionesBancarias() {
		return this.jCheckBoxSeleccionarTodosConciliacionesBancarias;
	}

	public void setjCheckBoxSeleccionarTodosConciliacionesBancarias(
			JCheckBox jCheckBoxSeleccionarTodosConciliacionesBancarias) {
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias = jCheckBoxSeleccionarTodosConciliacionesBancarias;
	}

	public void setBorderResaltarSeleccionarTodosConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConciliacionesBancarias() {
		return this.jCheckBoxSeleccionadosConciliacionesBancarias;
	}

	public void setjCheckBoxSeleccionadosConciliacionesBancarias(
			JCheckBox jCheckBoxSeleccionadosConciliacionesBancarias) {
		this.jCheckBoxSeleccionadosConciliacionesBancarias = jCheckBoxSeleccionadosConciliacionesBancarias;
	}
	
	public void setBorderResaltarSeleccionadosConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConciliacionesBancarias() {
		return this.jComboBoxTiposArchivosReportesConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConciliacionesBancarias(
			JComboBox jComboBoxTiposArchivosReportesConciliacionesBancarias) {
		this.jComboBoxTiposArchivosReportesConciliacionesBancarias = jComboBoxTiposArchivosReportesConciliacionesBancarias;
	}

	public void setBorderResaltarTiposArchivosReportesConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConciliacionesBancarias() {
		return this.jComboBoxTiposReportesConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConciliacionesBancarias(
			JComboBox jComboBoxTiposReportesConciliacionesBancarias) {
		this.jComboBoxTiposReportesConciliacionesBancarias = jComboBoxTiposReportesConciliacionesBancarias;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConciliacionesBancarias() {
	//	return jComboBoxTiposReportesDinamicoConciliacionesBancarias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConciliacionesBancarias(
	//		JComboBox jComboBoxTiposReportesDinamicoConciliacionesBancarias) {
	//	this.jComboBoxTiposReportesDinamicoConciliacionesBancarias = jComboBoxTiposReportesDinamicoConciliacionesBancarias;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias() {
	//	return jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias = jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias;
	//}
	
	public void setBorderResaltarTiposReportesConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConciliacionesBancarias() {
		return this.jComboBoxTiposGraficosReportesConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConciliacionesBancarias(
			JComboBox jComboBoxTiposGraficosReportesConciliacionesBancarias) {
		this.jComboBoxTiposGraficosReportesConciliacionesBancarias = jComboBoxTiposGraficosReportesConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposGraficosReportesConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConciliacionesBancarias() {
		return this.jComboBoxTiposPaginacionConciliacionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConciliacionesBancarias(
			JComboBox jComboBoxTiposPaginacionConciliacionesBancarias) {
		this.jComboBoxTiposPaginacionConciliacionesBancarias = jComboBoxTiposPaginacionConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposPaginacionConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConciliacionesBancarias() {
		return this.jComboBoxTiposRelacionesConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConciliacionesBancarias() {
		return this.jComboBoxTiposAccionesConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConciliacionesBancarias(
			JComboBox jComboBoxTiposRelacionesConciliacionesBancarias) {
		this.jComboBoxTiposRelacionesConciliacionesBancarias = jComboBoxTiposRelacionesConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConciliacionesBancarias(
			JComboBox jComboBoxTiposAccionesConciliacionesBancarias) {
		this.jComboBoxTiposAccionesConciliacionesBancarias = jComboBoxTiposAccionesConciliacionesBancarias;
	}
	
	public void setBorderResaltarTiposRelacionesConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConciliacionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConciliacionesBancarias .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConciliacionesBancarias() {
	//	return jCheckBoxConGraficoDinamicoConciliacionesBancarias;
	//}

	//public void setjCheckBoxConGraficoDinamicoConciliacionesBancarias(
	//		JCheckBox jCheckBoxConGraficoDinamicoConciliacionesBancarias) {
	//	this.jCheckBoxConGraficoDinamicoConciliacionesBancarias = jCheckBoxConGraficoDinamicoConciliacionesBancarias;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConciliacionesBancarias() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConciliacionesBancarias.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConciliacionesBancarias .setBorder(borderResaltar);		
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
		this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean();
		
		this.conciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConciliacionesBancariasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conciliaciones Bancarias MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
		
		ConciliacionesBancariasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConciliacionesBancarias= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"nuevo","nuevo","Nuevo"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"duplicar","duplicar","Duplicar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"copiar","copiar","Copiar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"ver_form","ver_form","Ver"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"recargar","recargar","Buscar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,
							"cerrar","cerrar","Salir"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConciliacionesBancarias=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConciliacionesBancarias;
			
				this.jButtonProcesarInformacionToolBarConciliacionesBancarias=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConciliacionesBancarias;
				
		//protected JButton jButtonModificarToolBarConciliacionesBancarias;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConciliacionesBancarias=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConciliacionesBancarias=new JMenuMe("General");
		this.jmenuArchivoConciliacionesBancarias=new JMenuMe("Archivo");
		this.jmenuAccionesConciliacionesBancarias=new JMenuMe("Acciones");
		this.jmenuDatosConciliacionesBancarias=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConciliacionesBancarias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConciliacionesBancarias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConciliacionesBancarias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConciliacionesBancarias= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConciliacionesBancarias.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConciliacionesBancarias,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConciliacionesBancarias= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConciliacionesBancarias.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConciliacionesBancarias,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConciliacionesBancarias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConciliacionesBancarias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConciliacionesBancarias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConciliacionesBancarias= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConciliacionesBancarias.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConciliacionesBancarias,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConciliacionesBancarias= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConciliacionesBancarias.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConciliacionesBancarias,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConciliacionesBancarias= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConciliacionesBancarias.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConciliacionesBancarias,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConciliacionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConciliacionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConciliacionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConciliacionesBancarias= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConciliacionesBancarias.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConciliacionesBancarias,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConciliacionesBancarias= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConciliacionesBancarias.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConciliacionesBancarias,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConciliacionesBancarias= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConciliacionesBancarias.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConciliacionesBancarias,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConciliacionesBancarias= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConciliacionesBancarias.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConciliacionesBancarias,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConciliacionesBancarias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConciliacionesBancarias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConciliacionesBancarias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConciliacionesBancarias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConciliacionesBancarias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConciliacionesBancarias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConciliacionesBancarias.add(this.jMenuItemCerrarConciliacionesBancarias);
			
			this.jmenuAccionesConciliacionesBancarias.add(this.jMenuItemNuevoConciliacionesBancarias);
			this.jmenuAccionesConciliacionesBancarias.add(this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias);
			this.jmenuAccionesConciliacionesBancarias.add(this.jMenuItemNuevoRelacionesConciliacionesBancarias);
			this.jmenuAccionesConciliacionesBancarias.add(this.jMenuItemGuardarCambiosTablaConciliacionesBancarias);		
			this.jmenuAccionesConciliacionesBancarias.add(this.jMenuItemDuplicarConciliacionesBancarias);		
			this.jmenuAccionesConciliacionesBancarias.add(this.jMenuItemCopiarConciliacionesBancarias);		
			this.jmenuAccionesConciliacionesBancarias.add(this.jMenuItemVerFormConciliacionesBancarias);		
			
			this.jmenuDatosConciliacionesBancarias.add(this.jMenuItemRecargarInformacionConciliacionesBancarias);				
			this.jmenuDatosConciliacionesBancarias.add(this.jMenuItemAnterioresConciliacionesBancarias);				
			this.jmenuDatosConciliacionesBancarias.add(this.jMenuItemSiguientesConciliacionesBancarias);				
			this.jmenuDatosConciliacionesBancarias.add(this.jMenuItemAbrirOrderByConciliacionesBancarias);				
			this.jmenuDatosConciliacionesBancarias.add(this.jMenuItemMostrarOcultarConciliacionesBancarias);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConciliacionesBancarias.add(this.jMenuItemGuardarCambiosConciliacionesBancarias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConciliacionesBancarias.add(this.jmenuArchivoConciliacionesBancarias);		
			this.jmenuBarConciliacionesBancarias.add(this.jmenuAccionesConciliacionesBancarias);		
			this.jmenuBarConciliacionesBancarias.add(this.jmenuDatosConciliacionesBancarias);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConciliacionesBancarias);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConciliacionesBancarias() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaConciliacionesBancariasConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.setToolTipText("Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaConciliacionesBancariasConciliacionesBancarias= new JButtonMe();
		this.jButtonBusquedaConciliacionesBancariasConciliacionesBancarias.setText("Buscar");
		this.jButtonBusquedaConciliacionesBancariasConciliacionesBancarias.setToolTipText("Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaConciliacionesBancariasConciliacionesBancarias,"buscar_button","Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaConciliacionesBancariasConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias = new JLabelMe();
		jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setText("Cuenta Contable :");
		jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias= new JComboBoxMe();
		jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias = new JLabelMe();
		jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias = new JLabelMe();
		jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasConciliacionesBancarias=new JTabbedPane();


		this.jTabbedPaneBusquedasConciliacionesBancarias.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasConciliacionesBancarias.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasConciliacionesBancarias.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConciliacionesBancarias = new ConciliacionesBancariasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Conciliaciones Bancarias DATOS");
			this.jInternalFrameDetalleFormConciliacionesBancarias = new ConciliacionesBancariasDetalleFormJInternalFrame(jDesktopPane,this.conciliacionesbancariasSessionBean.getConGuardarRelaciones(),this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConciliacionesBancarias = null;//new ConciliacionesBancariasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConciliacionesBancarias= new GridBagLayout();
		
		
		this.jTableDatosConciliacionesBancarias = new JTableMe();      
		
		String sToolTipConciliacionesBancarias="";
		sToolTipConciliacionesBancarias=ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConciliacionesBancarias+="(Tesoreria.ConciliacionesBancarias)";
		}
		
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			sToolTipConciliacionesBancarias+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConciliacionesBancarias.setToolTipText(sToolTipConciliacionesBancarias);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConciliacionesBancarias);
		this.jTableDatosConciliacionesBancarias.setAutoCreateRowSorter(true);
		this.jTableDatosConciliacionesBancarias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConciliacionesBancarias.setRowSelectionAllowed(true);
		this.jTableDatosConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConciliacionesBancarias = new JButtonMe();
		this.jButtonDuplicarConciliacionesBancarias = new JButtonMe();
		this.jButtonCopiarConciliacionesBancarias = new JButtonMe();
		this.jButtonVerFormConciliacionesBancarias = new JButtonMe();
		this.jButtonNuevoRelacionesConciliacionesBancarias = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarConciliacionesBancarias = new JButtonMe();
		
		this.jScrollPanelDatosConciliacionesBancarias = new JScrollPane();   
        this.jScrollPanelDatosGeneralConciliacionesBancarias = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Conciliaciones Bancarias";
		
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conciliaciones Bancariases" + this.sPath));
		} else {
			this.jScrollPanelDatosConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConciliacionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesConciliacionesBancarias.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConciliacionesBancarias=new ReporteDinamicoJInternalFrame(ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConciliacionesBancarias();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConciliacionesBancarias=new ImportacionJInternalFrame(ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConciliacionesBancarias();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConciliacionesBancarias = new JButtonMe();
		
		this.jButtonAbrirOrderByConciliacionesBancarias.setText("Orden");
		this.jButtonAbrirOrderByConciliacionesBancarias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConciliacionesBancarias,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConciliacionesBancarias,false,this);
			
			//this.cargarOrderByConciliacionesBancarias(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConciliacionesBancarias,true,this);
			
			//this.cargarOrderByConciliacionesBancarias(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConciliacionesBancarias.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosConciliacionesBancarias.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosConciliacionesBancarias.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosConciliacionesBancarias.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConciliacionesBancarias.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConciliacionesBancarias.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConciliacionesBancarias.setText("Nuevo");
		this.jButtonDuplicarConciliacionesBancarias.setText("Duplicar");
		this.jButtonCopiarConciliacionesBancarias.setText("Copiar");
		this.jButtonVerFormConciliacionesBancarias.setText("Ver");
		this.jButtonNuevoRelacionesConciliacionesBancarias.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.setText("Guardar");
		this.jButtonCerrarConciliacionesBancarias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConciliacionesBancarias,"nuevo_button","Nuevo",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConciliacionesBancarias,"duplicar_button","Duplicar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConciliacionesBancarias,"copiar_button","Copiar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConciliacionesBancarias,"ver_form","Ver",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConciliacionesBancarias,"nuevorelaciones_button","Nuevo Rel",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConciliacionesBancarias,"guardarcambiostabla_button","Guardar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConciliacionesBancarias,"cerrar_button","Salir",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConciliacionesBancarias.setToolTipText("Nuevo"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConciliacionesBancarias.setToolTipText("Duplicar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConciliacionesBancarias.setToolTipText("Copiar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConciliacionesBancarias.setToolTipText("Ver"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConciliacionesBancarias.setToolTipText("Nuevo Rel"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.setToolTipText("Guardar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConciliacionesBancarias.setToolTipText("Salir"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConciliacionesBancarias";
		inputMap = this.jButtonNuevoConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConciliacionesBancarias"));
		
		//DUPLICAR
		sMapKey = "DuplicarConciliacionesBancarias";
		inputMap = this.jButtonDuplicarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConciliacionesBancarias"));
		
		//COPIAR
		sMapKey = "CopiarConciliacionesBancarias";
		inputMap = this.jButtonCopiarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConciliacionesBancarias"));
		
		//VEr FORM
		sMapKey = "VerFormConciliacionesBancarias";
		inputMap = this.jButtonVerFormConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConciliacionesBancarias"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConciliacionesBancarias";
		inputMap = this.jButtonNuevoRelacionesConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConciliacionesBancarias"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConciliacionesBancarias";
		inputMap = this.jButtonModificarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConciliacionesBancarias"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConciliacionesBancarias";
		inputMap = this.jButtonCerrarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConciliacionesBancarias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConciliacionesBancarias";
		inputMap = this.jButtonGuardarCambiosTablaConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConciliacionesBancarias"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConciliacionesBancarias.setName("jPanelParametrosReportesConciliacionesBancarias"); 
		
		this.jPanelParametrosReportesAccionesConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConciliacionesBancarias.setName("jPanelParametrosReportesAccionesConciliacionesBancarias"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConciliacionesBancarias = new JButtonMe();
		this.jButtonRecargarInformacionConciliacionesBancarias.setText("Buscar");
		this.jButtonRecargarInformacionConciliacionesBancarias.setToolTipText("Buscar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConciliacionesBancarias,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionConciliacionesBancarias.setVisible(false);
		
		
		this.jButtonProcesarInformacionConciliacionesBancarias = new JButtonMe();
		this.jButtonProcesarInformacionConciliacionesBancarias.setText("Procesar");
		this.jButtonProcesarInformacionConciliacionesBancarias.setToolTipText("Procesar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConciliacionesBancarias.setVisible(false);
			
		this.jButtonProcesarInformacionConciliacionesBancarias.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConciliacionesBancarias.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConciliacionesBancarias.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConciliacionesBancarias.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConciliacionesBancarias.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConciliacionesBancarias.setText("TIPO");       
		this.jComboBoxTiposReportesConciliacionesBancarias.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConciliacionesBancarias.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConciliacionesBancarias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConciliacionesBancarias.setText("Paginacion");
		this.jComboBoxTiposPaginacionConciliacionesBancarias.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposRelacionesConciliacionesBancarias.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposAccionesConciliacionesBancarias.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposSeleccionarConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConciliacionesBancarias=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConciliacionesBancarias.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConciliacionesBancarias.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConciliacionesBancarias.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConciliacionesBancarias = new JLabelMe();
		
		this.jLabelAccionesConciliacionesBancarias.setText("Acciones");		
		this.jLabelAccionesConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConciliacionesBancarias = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConciliacionesBancarias.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConciliacionesBancarias.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConciliacionesBancarias.setText("Graf.");
		this.jCheckBoxConGraficoReporteConciliacionesBancarias.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConciliacionesBancarias = new JButtonMe();
		//this.jButtonAnterioresConciliacionesBancarias.setText("<<");
        this.jButtonAnterioresConciliacionesBancarias.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConciliacionesBancarias,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConciliacionesBancarias = new JButtonMe();
		//this.jButtonSiguientesConciliacionesBancarias.setText(">>");
        this.jButtonSiguientesConciliacionesBancarias.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConciliacionesBancarias,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConciliacionesBancarias = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConciliacionesBancarias.setText("Nue");
        this.jButtonNuevoGuardarCambiosConciliacionesBancarias.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConciliacionesBancarias,"nuevoguardarcambios_button","Nue",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConciliacionesBancarias";
		inputMap = this.jButtonNuevoGuardarCambiosConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConciliacionesBancarias"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConciliacionesBancarias";
		inputMap = this.jButtonRecargarInformacionConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConciliacionesBancarias"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConciliacionesBancarias";
		inputMap = this.jButtonSiguientesConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConciliacionesBancarias"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConciliacionesBancarias";
		inputMap = this.jButtonAnterioresConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConciliacionesBancarias"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConciliacionesBancarias();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConciliacionesBancarias.setMinimumSize(new Dimension(this.getWidth(),ConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConciliacionesBancarias.setMaximumSize(new Dimension(this.getWidth(),ConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConciliacionesBancarias.setPreferredSize(new Dimension(this.getWidth(),ConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConciliacionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConciliacionesBancarias = new GridBagLayout();

			this.jPanelPaginacionConciliacionesBancarias.setLayout(gridaBagLayoutPaginacionConciliacionesBancarias);						
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonAnterioresConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
					
						
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
			
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonNuevoGuardarCambiosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
						
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonSiguientesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonNuevoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
						
			
			
			if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConciliacionesBancarias.gridy = 1;
				this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonGuardarCambiosTablaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			}
			
			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonDuplicarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonCopiarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonVerFormConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 1;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConciliacionesBancarias.add(this.jButtonCerrarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		
		this.jButtonRecargarInformacionConciliacionesBancarias.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConciliacionesBancarias.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConciliacionesBancarias.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConciliacionesBancarias.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConciliacionesBancarias.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConciliacionesBancarias.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConciliacionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConciliacionesBancarias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConciliacionesBancarias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConciliacionesBancarias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConciliacionesBancarias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConciliacionesBancarias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConciliacionesBancarias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConciliacionesBancarias.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConciliacionesBancarias.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConciliacionesBancarias.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConciliacionesBancarias.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConciliacionesBancarias.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConciliacionesBancarias.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConciliacionesBancarias.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConciliacionesBancarias = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConciliacionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConciliacionesBancarias = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConciliacionesBancarias.setLayout(gridaBagParametrosReportesConciliacionesBancarias);
			this.jPanelParametrosReportesAccionesConciliacionesBancarias.setLayout(gridaBagParametrosReportesAccionesConciliacionesBancarias);
			
			
			this.jPanelParametrosAuxiliar1ConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar1ConciliacionesBancarias);
			this.jPanelParametrosAuxiliar2ConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar2ConciliacionesBancarias);
			this.jPanelParametrosAuxiliar3ConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar3ConciliacionesBancarias);
			this.jPanelParametrosAuxiliar4ConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar4ConciliacionesBancarias);
			//this.jPanelParametrosAuxiliar5ConciliacionesBancarias.setLayout(gridaBagParametrosAuxiliar2ConciliacionesBancarias);			
			
			
			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jButtonRecargarInformacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConciliacionesBancarias.add(this.jComboBoxTiposPaginacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConciliacionesBancarias.add(this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConciliacionesBancarias.add(this.jComboBoxTiposArchivosReportesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jPanelParametrosAuxiliar1ConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConciliacionesBancarias.add(this.jComboBoxTiposReportesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);																		
			
			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConciliacionesBancarias.add(this.jComboBoxTiposGraficosReportesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jPanelParametrosAuxiliar4ConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jComboBoxTiposReportesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jCheckBoxGenerarReporteConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jPanelParametrosAuxiliar2ConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jLabelAccionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConciliacionesBancarias.add(this.jButtonAbrirOrderByConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jComboBoxTiposSeleccionarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
			
			
			/*
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jCheckBoxSeleccionarTodosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jCheckBoxConGraficoReporteConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConciliacionesBancarias.add(this.jCheckBoxSeleccionarTodosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);															
				
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConciliacionesBancarias.add(this.jCheckBoxSeleccionadosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);															
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConciliacionesBancarias.add(this.jCheckBoxConGraficoReporteConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jPanelParametrosAuxiliar3ConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConciliacionesBancarias.add(this.jComboBoxTiposAccionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConciliacionesBancarias = new GridBagLayout();

			this.jScrollPanelDatosConciliacionesBancarias.setLayout(gridaBagLayoutDatosConciliacionesBancarias);
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
			this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
			
			this.jScrollPanelDatosConciliacionesBancarias.add(this.jTableDatosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConciliacionesBancarias.setViewportView(this.jTableDatosConciliacionesBancarias);
		this.jTableDatosConciliacionesBancarias.setFillsViewportHeight(true);
		this.jTableDatosConciliacionesBancarias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConciliacionesBancarias= new GridBagLayout();
		this.jPanelAccionesConciliacionesBancarias.setLayout(gridaBagLayoutAccionesConciliacionesBancarias);
		
		
		/*	
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
			
		this.jPanelAccionesConciliacionesBancarias.add(this.jButtonNuevoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaConciliacionesBancariasConciliacionesBancarias= new GridBagLayout();
		gridaBagLayoutBusquedaConciliacionesBancariasConciliacionesBancarias.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaConciliacionesBancariasConciliacionesBancarias.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaConciliacionesBancariasConciliacionesBancarias.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaConciliacionesBancariasConciliacionesBancarias.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.setLayout(gridaBagLayoutBusquedaConciliacionesBancariasConciliacionesBancarias);

		gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConciliacionesBancarias.gridy = 0;
		gridBagConstraintsConciliacionesBancarias.gridx = 0;
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.add(jLabelid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);

		gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConciliacionesBancarias.gridy = 0;
		gridBagConstraintsConciliacionesBancarias.gridx = 1;
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.add(jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);


		gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConciliacionesBancarias.gridy = 1;
		gridBagConstraintsConciliacionesBancarias.gridx = 0;
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.add(jLabelfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);

		gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConciliacionesBancarias.gridy = 1;
		gridBagConstraintsConciliacionesBancarias.gridx = 1;
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.add(jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);


		gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConciliacionesBancarias.gridy = 2;
		gridBagConstraintsConciliacionesBancarias.gridx = 0;
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.add(jLabelfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);

		gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConciliacionesBancarias.gridy = 2;
		gridBagConstraintsConciliacionesBancarias.gridx = 1;
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.add(jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);

		gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConciliacionesBancarias.gridy = 3;
		gridBagConstraintsConciliacionesBancarias.gridx =1;
		jPanelBusquedaConciliacionesBancariasConciliacionesBancarias.add(jButtonBusquedaConciliacionesBancariasConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);

		jTabbedPaneBusquedasConciliacionesBancarias.addTab("1.-Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaConciliacionesBancariasConciliacionesBancarias);
		jTabbedPaneBusquedasConciliacionesBancarias.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConciliacionesBancarias);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();						
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConciliacionesBancarias.gridx = 0;		
			//this.gridBagConstraintsConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConciliacionesBancarias.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;		
		//this.gridBagConstraintsConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConciliacionesBancarias);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConciliacionesBancarias.gridx = 0;		
			this.gridBagConstraintsConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConciliacionesBancarias.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);								
		
		
		/*
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		*/		
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConciliacionesBancarias.gridx =0;
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConciliacionesBancarias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
				
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConciliacionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConciliacionesBancarias = new GridBagLayout();
			this.jPanelBusquedasParametrosConciliacionesBancarias.setLayout(gridaBagLayoutBusquedasParametrosConciliacionesBancarias);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConciliacionesBancarias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			
			
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
			
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConciliacionesBancarias;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConciliacionesBancarias() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConciliacionesBancarias = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConciliacionesBancarias.setName("jPanelReporteDinamicoConciliacionesBancarias"); 
		
		this.jPanelReporteDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConciliacionesBancarias.setLayout(gridaBagLayoutReporteDinamicoConciliacionesBancarias);
		
		
		this.jInternalFrameReporteDinamicoConciliacionesBancarias= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConciliacionesBancarias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConciliacionesBancarias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConciliacionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConciliacionesBancarias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConciliacionesBancarias.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConciliacionesBancarias.setResizable(true);
	    this.jInternalFrameReporteDinamicoConciliacionesBancarias.setClosable(true);
	    this.jInternalFrameReporteDinamicoConciliacionesBancarias.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conciliaciones Bancariases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnasSelectReporteConciliacionesBancarias.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelColumnasSelectReporteConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConciliacionesBancarias = new JList<Reporte>();
		this.jListColumnasSelectReporteConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConciliacionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConciliacionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConciliacionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConciliacionesBancarias=new JScrollPane(this.jListColumnasSelectReporteConciliacionesBancarias);
			
			this.jScrollColumnasSelectReporteConciliacionesBancarias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConciliacionesBancarias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConciliacionesBancarias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jListColumnasSelectReporteConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jScrollColumnasSelectReporteConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConciliacionesBancarias = new JLabelMe();

		this.jLabelRelacionesSelectReporteConciliacionesBancarias.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConciliacionesBancarias = new JList<Reporte>();
		this.jListRelacionesSelectReporteConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConciliacionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConciliacionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConciliacionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConciliacionesBancarias=new JScrollPane(this.jListRelacionesSelectReporteConciliacionesBancarias);
			
			this.jScrollRelacionesSelectReporteConciliacionesBancarias.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConciliacionesBancarias.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConciliacionesBancarias.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConciliacionesBancarias = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias = new JComboBoxMe();
		this.jListColumnasValoresGraficoConciliacionesBancarias = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConciliacionesBancarias = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConciliacionesBancarias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConciliacionesBancarias = new JLabelMe();

		this.jLabelConGraficoDinamicoConciliacionesBancarias.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelConGraficoDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConciliacionesBancarias.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConciliacionesBancarias.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jCheckBoxConGraficoDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConciliacionesBancarias.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelColumnaCategoriaGraficoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnaCategoriaValorConciliacionesBancarias.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelColumnaCategoriaValorConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConciliacionesBancarias.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConciliacionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jComboBoxColumnaCategoriaValorConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConciliacionesBancarias = new JLabelMe();

		this.jLabelColumnasValoresGraficoConciliacionesBancarias.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelColumnasValoresGraficoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConciliacionesBancarias = new JList<Reporte>();
		this.jListColumnasValoresGraficoConciliacionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConciliacionesBancarias.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConciliacionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConciliacionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConciliacionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConciliacionesBancarias=new JScrollPane(this.jListColumnasValoresGraficoConciliacionesBancarias);
			
			this.jScrollColumnasValoresGraficoConciliacionesBancarias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConciliacionesBancarias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConciliacionesBancarias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jListColumnasSelectReporteConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jScrollColumnasValoresGraficoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConciliacionesBancarias = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConciliacionesBancarias.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelTiposGraficosReportesDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConciliacionesBancarias.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConciliacionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jComboBoxTiposGraficosReportesDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConciliacionesBancarias = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConciliacionesBancarias.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelGenerarExcelReporteDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConciliacionesBancarias = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConciliacionesBancarias.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConciliacionesBancarias,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConciliacionesBancarias.setToolTipText("Generar EXCEL"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jButtonGenerarExcelReporteDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jComboBoxTiposReportesDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConciliacionesBancarias = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConciliacionesBancarias.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jLabelTiposArchivoReporteDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jComboBoxTiposArchivosReportesDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConciliacionesBancarias = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConciliacionesBancarias.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConciliacionesBancarias,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConciliacionesBancarias.setToolTipText("Generar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jButtonGenerarReporteDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConciliacionesBancarias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConciliacionesBancarias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConciliacionesBancarias.setToolTipText("Cancelar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConciliacionesBancarias.add(this.jButtonCerrarReporteDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConciliacionesBancarias = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConciliacionesBancarias= new JScrollPane(jPanelReporteDinamicoConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConciliacionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConciliacionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConciliacionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conciliaciones Bancariases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConciliacionesBancarias.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConciliacionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConciliacionesBancarias.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConciliacionesBancarias);
		this.jInternalFrameReporteDinamicoConciliacionesBancarias.getContentPane().add(this.jScrollPanelReporteDinamicoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConciliacionesBancarias() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConciliacionesBancarias = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConciliacionesBancarias.setName("jPanelImportacionConciliacionesBancarias"); 
		
		this.jPanelImportacionConciliacionesBancarias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConciliacionesBancarias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConciliacionesBancarias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConciliacionesBancarias.setLayout(gridaBagLayoutImportacionConciliacionesBancarias);
		
		
		this.jInternalFrameImportacionConciliacionesBancarias= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConciliacionesBancarias= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConciliacionesBancarias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConciliacionesBancarias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConciliacionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConciliacionesBancarias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConciliacionesBancarias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConciliacionesBancarias.setResizable(true);
	    this.jInternalFrameImportacionConciliacionesBancarias.setClosable(true);
	    this.jInternalFrameImportacionConciliacionesBancarias.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConciliacionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConciliacionesBancarias.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConciliacionesBancarias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConciliacionesBancarias.setResizable(true);
	    this.jInternalFrameImportacionConciliacionesBancarias.setClosable(true);
	    this.jInternalFrameImportacionConciliacionesBancarias.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConciliacionesBancarias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConciliacionesBancarias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConciliacionesBancarias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conciliaciones Bancariases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConciliacionesBancarias = new JLabelMe();

		this.jLabelArchivoImportacionConciliacionesBancarias.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYImportacion;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConciliacionesBancarias.add(this.jLabelArchivoImportacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConciliacionesBancarias = new JFileChooser();		
		this.jFileChooserImportacionConciliacionesBancarias.setToolTipText("ESCOGER ARCHIVO"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConciliacionesBancarias = new JButtonMe();
		this.jButtonAbrirImportacionConciliacionesBancarias.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConciliacionesBancarias,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConciliacionesBancarias.setToolTipText("Generar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConciliacionesBancarias.add(this.jButtonAbrirImportacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConciliacionesBancarias = new JLabelMe();

		this.jLabelPathArchivoImportacionConciliacionesBancarias.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYImportacion;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConciliacionesBancarias.add(this.jLabelPathArchivoImportacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConciliacionesBancarias=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConciliacionesBancarias.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConciliacionesBancarias.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConciliacionesBancarias.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConciliacionesBancarias.add(this.jTextFieldPathArchivoImportacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConciliacionesBancarias = new JButtonMe();
		this.jButtonGenerarImportacionConciliacionesBancarias.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConciliacionesBancarias,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConciliacionesBancarias.setToolTipText("Generar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConciliacionesBancarias.add(this.jButtonGenerarImportacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarImportacionConciliacionesBancarias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConciliacionesBancarias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConciliacionesBancarias.setToolTipText("Cancelar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConciliacionesBancarias.add(this.jButtonCerrarImportacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConciliacionesBancarias = new GridBagLayout();
		
		this.jScrollPanelImportacionConciliacionesBancarias= new JScrollPane(jPanelImportacionConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy =iPosYImportacion;
		this.gridBagConstraintsConciliacionesBancarias.gridx =iPosXImportacion;
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConciliacionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConciliacionesBancarias.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConciliacionesBancarias);
		this.jInternalFrameImportacionConciliacionesBancarias.getContentPane().add(this.jScrollPanelImportacionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConciliacionesBancarias(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConciliacionesBancarias = new JButtonMe();
			this.jButtonAbrirOrderByConciliacionesBancarias.setText("Orden");
			this.jButtonAbrirOrderByConciliacionesBancarias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConciliacionesBancarias,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConciliacionesBancarias";
			inputMap = this.jButtonAbrirOrderByConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConciliacionesBancarias"));
		
		
			GridBagLayout gridaBagLayoutOrderByConciliacionesBancarias = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConciliacionesBancarias.setName("jPanelOrderByConciliacionesBancarias"); 
			
			this.jPanelOrderByConciliacionesBancarias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConciliacionesBancarias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConciliacionesBancarias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConciliacionesBancarias.setLayout(gridaBagLayoutOrderByConciliacionesBancarias);
			
			
			this.jTableDatosConciliacionesBancariasOrderBy = new JTableMe();        
			this.jTableDatosConciliacionesBancariasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConciliacionesBancariasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConciliacionesBancariasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConciliacionesBancariasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConciliacionesBancariasOrderBy.setViewportView(this.jTableDatosConciliacionesBancariasOrderBy);
			this.jTableDatosConciliacionesBancariasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConciliacionesBancariasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConciliacionesBancarias= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConciliacionesBancarias= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConciliacionesBancarias = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConciliacionesBancarias= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConciliacionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConciliacionesBancarias.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConciliacionesBancarias.setTitle("Orden");
			this.jInternalFrameOrderByConciliacionesBancarias.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConciliacionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConciliacionesBancarias.setResizable(true);
			this.jInternalFrameOrderByConciliacionesBancarias.setClosable(true);
			this.jInternalFrameOrderByConciliacionesBancarias.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConciliacionesBancarias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConciliacionesBancarias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConciliacionesBancarias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conciliaciones Bancariases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iPosXOrderBy;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConciliacionesBancarias.ipady =150;
				
			this.jPanelOrderByConciliacionesBancarias.add(jScrollPanelDatosConciliacionesBancariasOrderBy, this.gridBagConstraintsConciliacionesBancarias);//this.jTableDatosConciliacionesBancariasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConciliacionesBancarias = new JButtonMe();
			this.jButtonCerrarOrderByConciliacionesBancarias.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConciliacionesBancarias,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConciliacionesBancarias.setToolTipText("Cancelar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConciliacionesBancarias.add(this.jButtonCerrarOrderByConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConciliacionesBancarias = new GridBagLayout();
			
			this.jScrollPanelOrderByConciliacionesBancarias= new JScrollPane(jPanelOrderByConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridy =iPosYOrderBy;
			this.gridBagConstraintsConciliacionesBancarias.gridx =iPosXOrderBy;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConciliacionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConciliacionesBancarias.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConciliacionesBancarias);
			
			this.jInternalFrameOrderByConciliacionesBancarias.getContentPane().add(this.jScrollPanelOrderByConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
		
		} else {
			this.jButtonAbrirOrderByConciliacionesBancarias = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConciliacionesBancarias.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosConciliacionesBancarias.getRowHeight();//ConciliacionesBancariasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias.isSelected()) {
					iHeightTable=ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConciliacionesBancarias.isSelected()) {
					iHeightTable=ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConciliacionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConciliacionesBancarias.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConciliacionesBancarias.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConciliacionesBancarias.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConciliacionesBancarias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConciliacionesBancarias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConciliacionesBancarias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConciliacionesBancarias!=null && this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy()!=null) {
			//if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConciliacionesBancarias.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConciliacionesBancarias.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConciliacionesBancarias.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConciliacionesBancarias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConciliacionesBancarias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConciliacionesBancarias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=conciliacionesbancariasLogic.getConciliacionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conciliacionesbancariass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConciliacionesBancarias> TraerConciliacionesBancariasBeans(List<ConciliacionesBancarias> conciliacionesbancariass,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariass) {
					
				if(!(ConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					conciliacionesbancarias.setsDetalleGeneralEntityReporte(ConciliacionesBancariasConstantesFunciones.getConciliacionesBancariasDescripcion(conciliacionesbancarias));
										
						
					
						
					
				} else  {
							
					//conciliacionesbancarias.setsDetalleGeneralEntityReporte(conciliacionesbancarias.getsDetalleGeneralEntityReporte());
										
				}
				
				//conciliacionesbancariasbeans.add(conciliacionesbancariasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return conciliacionesbancariass;
    }
	//PARA REPORTES FIN
}
