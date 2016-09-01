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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.report.CobrarMorosidadClientesDetalladosConstantesFunciones;

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
public class CobrarMorosidadClientesDetalladosJInternalFrame extends CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarMorosidadClientesDetallados;
	
	protected JMenuBar jmenuBarCobrarMorosidadClientesDetallados;
	
	protected JMenu jmenuCobrarMorosidadClientesDetallados;
	protected JMenu jmenuDatosCobrarMorosidadClientesDetallados;
	protected JMenu jmenuArchivoCobrarMorosidadClientesDetallados;
	protected JMenu jmenuAccionesCobrarMorosidadClientesDetallados;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarMorosidadClientesDetallados;	
	protected GridBagConstraints gridBagConstraintsCobrarMorosidadClientesDetallados;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarMorosidadClientesDetallados;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarMorosidadClientesDetallados;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarMorosidadClientesDetalladosSessionBean cobrarmorosidadclientesdetalladosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladoss;		
	public List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossEliminados;	
	public List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarMorosidadClientesDetallados;		
	protected JButton jButtonAbrirOrderByCobrarMorosidadClientesDetallados;
	
	
	//protected JPanel jPanelOrderByCobrarMorosidadClientesDetallados;
	//public JScrollPane jScrollPanelOrderByCobrarMorosidadClientesDetallados;	
	//protected JButton jButtonCerrarOrderByCobrarMorosidadClientesDetallados;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarMorosidadClientesDetalladosLogic cobrarmorosidadclientesdetalladosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarMorosidadClientesDetallados;
	public JScrollPane jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados;
	public JScrollPane jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarMorosidadClientesDetalladosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados;
	//public JScrollPane jScrollPanelImportacionCobrarMorosidadClientesDetallados;
	
	
	
	protected JPanel jPanelAccionesCobrarMorosidadClientesDetallados;
	
    protected JPanel jPanelPaginacionCobrarMorosidadClientesDetallados;
    protected JPanel jPanelParametrosReportesCobrarMorosidadClientesDetallados;
	protected JPanel jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarMorosidadClientesDetallados;
	protected JPanel jPanelParametrosAuxiliar2CobrarMorosidadClientesDetallados;
	protected JPanel jPanelParametrosAuxiliar3CobrarMorosidadClientesDetallados;
	protected JPanel jPanelParametrosAuxiliar4CobrarMorosidadClientesDetallados;
	//protected JPanel jPanelParametrosAuxiliar5CobrarMorosidadClientesDetallados;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarMorosidadClientesDetallados;
	//protected JPanel jPanelImportacionCobrarMorosidadClientesDetallados;
	
	
	public JTable jTableDatosCobrarMorosidadClientesDetallados;
	
	
	
	//public JTable jTableDatosCobrarMorosidadClientesDetalladosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarMorosidadClientesDetallados;
	protected JButton jButtonDuplicarCobrarMorosidadClientesDetallados;
	protected JButton jButtonCopiarCobrarMorosidadClientesDetallados;
	protected JButton jButtonVerFormCobrarMorosidadClientesDetallados;
	protected JButton jButtonNuevoRelacionesCobrarMorosidadClientesDetallados;
	protected JButton jButtonModificarCobrarMorosidadClientesDetallados;
	
    protected JButton jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados;
	protected JButton jButtonCerrarCobrarMorosidadClientesDetallados;
	
	
	protected JButton jButtonRecargarInformacionCobrarMorosidadClientesDetallados;
	protected JButton jButtonProcesarInformacionCobrarMorosidadClientesDetallados;
	
	
	protected JButton jButtonAnterioresCobrarMorosidadClientesDetallados;
	protected JButton jButtonSiguientesCobrarMorosidadClientesDetallados;
	protected JButton jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados;
	//protected JButton jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarMorosidadClientesDetallados;
	//protected JButton jButtonGenerarImportacionCobrarMorosidadClientesDetallados;
	//protected JButton jButtonCerrarImportacionCobrarMorosidadClientesDetallados;
	//protected JFileChooser jFileChooserImportacionCobrarMorosidadClientesDetallados;
	//protected File fileImportacionCobrarMorosidadClientesDetallados;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonDuplicarToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonCopiarToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonVerFormToolBarCobrarMorosidadClientesDetallados;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonCerrarToolBarCobrarMorosidadClientesDetallados;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonProcesarInformacionToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonAnterioresToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonSiguientesToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados;
	protected JButton jButtonAbrirOrderByToolBarCobrarMorosidadClientesDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemDuplicarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemCopiarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemVerFormCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemCerrarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemProcesarInformacionCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemAnterioresCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemSiguientesCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados;
	protected JMenuItem jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarMorosidadClientesDetallados;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados;
	protected JCheckBox jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarMorosidadClientesDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarMorosidadClientesDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados;
	protected JTextField jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarMorosidadClientesDetallados;
	//public JList<Reporte> jListColumnasSelectReporteCobrarMorosidadClientesDetallados;
	//public JScrollPane jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarMorosidadClientesDetallados;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarMorosidadClientesDetallados;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarMorosidadClientesDetallados;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarMorosidadClientesDetallados;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarMorosidadClientesDetallados;
	
		
	//public JLabel jLabelArchivoImportacionCobrarMorosidadClientesDetallados;	
	//public JLabel jLabelPathArchivoImportacionCobrarMorosidadClientesDetallados;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarMorosidadClientesDetallados;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarMorosidadClientesDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarMorosidadClientesDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarMorosidadClientesDetallados;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarMorosidadClientesDetallados;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarMorosidadClientesDetallados;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarMorosidadClientesDetallados;
	public JPanel jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados;
	public JButton jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados;
	
	public JPanel jPanelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados;
	public JLabel jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados;
	//public JFormattedTextField jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados;

	public JDateChooser jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados;
	public JButton jButtonfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetalladosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarMorosidadClientesDetalladosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarMorosidadClientesDetalladosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarMorosidadClientesDetalladosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarMorosidadClientesDetalladosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarMorosidadClientesDetallados)	{
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados = jButtonRecargarInformacionCobrarMorosidadClientesDetallados;
	}
	
	public JButton getjButtonProcesarInformacionCobrarMorosidadClientesDetallados() {
		return this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarMorosidadClientesDetallados)	{
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados = jButtonProcesarInformacionCobrarMorosidadClientesDetallados;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarMorosidadClientesDetallados() {
		return this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados;
	}
	
	
	public List<CobrarMorosidadClientesDetallados> getcobrarmorosidadclientesdetalladoss() {
		return this.cobrarmorosidadclientesdetalladoss;
	}

	public void setcobrarmorosidadclientesdetalladoss(List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladoss) {
		this.cobrarmorosidadclientesdetalladoss = cobrarmorosidadclientesdetalladoss;
	}
	
	public List<CobrarMorosidadClientesDetallados> getcobrarmorosidadclientesdetalladossAux() {
		return this.cobrarmorosidadclientesdetalladossAux;
	}

	public void setcobrarmorosidadclientesdetalladossAux(List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossAux) {
		this.cobrarmorosidadclientesdetalladossAux = cobrarmorosidadclientesdetalladossAux;
	}
	
	public List<CobrarMorosidadClientesDetallados> getcobrarmorosidadclientesdetalladossEliminados() {
		return this.cobrarmorosidadclientesdetalladossEliminados;
	}

	public void setCobrarMorosidadClientesDetalladossEliminados(List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossEliminados) {
		this.cobrarmorosidadclientesdetalladossEliminados = cobrarmorosidadclientesdetalladossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados() {
		return jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados = jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados() {
		return jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados;
	}

	public void setjTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados(
			JTextField jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados) {
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados = jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados;
	}

	public void setBorderResaltarValorCampoGeneralCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados() {
		return this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados;
	}

	public void setjCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados(
			JCheckBox jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados) {
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados = jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados;
	}

	public void setBorderResaltarSeleccionarTodosCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarMorosidadClientesDetallados() {
		return this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados;
	}

	public void setjCheckBoxSeleccionadosCobrarMorosidadClientesDetallados(
			JCheckBox jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados) {
		this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados = jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados;
	}
	
	public void setBorderResaltarSeleccionadosCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados = jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposReportesCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados = jComboBoxTiposReportesCobrarMorosidadClientesDetallados;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados() {
	//	return jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados) {
	//	this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados = jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados = jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados;
	//}
	
	public void setBorderResaltarTiposReportesCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados = jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados = jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarMorosidadClientesDetallados() {
		return this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados = jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarMorosidadClientesDetallados(
			JComboBox jComboBoxTiposAccionesCobrarMorosidadClientesDetallados) {
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados = jComboBoxTiposAccionesCobrarMorosidadClientesDetallados;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarMorosidadClientesDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados() {
	//	return jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados) {
	//	this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados = jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarMorosidadClientesDetallados() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados .setBorder(borderResaltar);		
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
		this.cobrarmorosidadclientesdetalladosSessionBean=new CobrarMorosidadClientesDetalladosSessionBean();
		
		this.cobrarmorosidadclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarmorosidadclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarMorosidadClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarMorosidadClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarMorosidadClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarMorosidadClientesDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarMorosidadClientesDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Morosidad Clientes Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarMorosidadClientesDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarMorosidadClientesDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarMorosidadClientesDetallados= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"nuevo","nuevo","Nuevo"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"duplicar","duplicar","Duplicar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"copiar","copiar","Copiar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"ver_form","ver_form","Ver"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"recargar","recargar","Buscar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarMorosidadClientesDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,
							"cerrar","cerrar","Salir"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados;
			
				this.jButtonProcesarInformacionToolBarCobrarMorosidadClientesDetallados=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarMorosidadClientesDetallados;
				
		//protected JButton jButtonModificarToolBarCobrarMorosidadClientesDetallados;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarMorosidadClientesDetallados=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarMorosidadClientesDetallados=new JMenuMe("General");
		this.jmenuArchivoCobrarMorosidadClientesDetallados=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarMorosidadClientesDetallados=new JMenuMe("Acciones");
		this.jmenuDatosCobrarMorosidadClientesDetallados=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarMorosidadClientesDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarMorosidadClientesDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarMorosidadClientesDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarMorosidadClientesDetallados= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarMorosidadClientesDetallados.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarMorosidadClientesDetallados,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarMorosidadClientesDetallados= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarMorosidadClientesDetallados.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarMorosidadClientesDetallados,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarMorosidadClientesDetallados= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarMorosidadClientesDetallados.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarMorosidadClientesDetallados,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarMorosidadClientesDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarMorosidadClientesDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarMorosidadClientesDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarMorosidadClientesDetallados= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarMorosidadClientesDetallados.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarMorosidadClientesDetallados,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarMorosidadClientesDetallados= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarMorosidadClientesDetallados.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarMorosidadClientesDetallados,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarMorosidadClientesDetallados= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarMorosidadClientesDetallados.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarMorosidadClientesDetallados,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarMorosidadClientesDetallados.add(this.jMenuItemCerrarCobrarMorosidadClientesDetallados);
			
			this.jmenuAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemNuevoCobrarMorosidadClientesDetallados);
			this.jmenuAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados);
			this.jmenuAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados);
			this.jmenuAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados);		
			this.jmenuAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemDuplicarCobrarMorosidadClientesDetallados);		
			this.jmenuAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemCopiarCobrarMorosidadClientesDetallados);		
			this.jmenuAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemVerFormCobrarMorosidadClientesDetallados);		
			
			this.jmenuDatosCobrarMorosidadClientesDetallados.add(this.jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados);				
			this.jmenuDatosCobrarMorosidadClientesDetallados.add(this.jMenuItemAnterioresCobrarMorosidadClientesDetallados);				
			this.jmenuDatosCobrarMorosidadClientesDetallados.add(this.jMenuItemSiguientesCobrarMorosidadClientesDetallados);				
			this.jmenuDatosCobrarMorosidadClientesDetallados.add(this.jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados);				
			this.jmenuDatosCobrarMorosidadClientesDetallados.add(this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarMorosidadClientesDetallados.add(this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarMorosidadClientesDetallados.add(this.jmenuArchivoCobrarMorosidadClientesDetallados);		
			this.jmenuBarCobrarMorosidadClientesDetallados.add(this.jmenuAccionesCobrarMorosidadClientesDetallados);		
			this.jmenuBarCobrarMorosidadClientesDetallados.add(this.jmenuDatosCobrarMorosidadClientesDetallados);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarMorosidadClientesDetallados);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarMorosidadClientesDetallados() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setToolTipText("Buscar Por Fecha Vence ");
		this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados= new JButtonMe();
		this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setText("Buscar");
		this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setToolTipText("Buscar Por Fecha Vence ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados,"buscar_button","Buscar Por Fecha Vence ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados = new JLabelMe();
		jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setText("Fecha Vence :");
		jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setToolTipText("Fecha Vence");
		jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados= new JDateChooser();
		jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setDate(new Date());
		jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarMorosidadClientesDetallados = new CobrarMorosidadClientesDetalladosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Morosidad Clientes Detallados DATOS");
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados = new CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame(jDesktopPane,this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones(),this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados = null;//new CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarMorosidadClientesDetallados= new GridBagLayout();
		
		
		this.jTableDatosCobrarMorosidadClientesDetallados = new JTableMe();      
		
		String sToolTipCobrarMorosidadClientesDetallados="";
		sToolTipCobrarMorosidadClientesDetallados=CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarMorosidadClientesDetallados+="(Cartera.CobrarMorosidadClientesDetallados)";
		}
		
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarMorosidadClientesDetallados+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarMorosidadClientesDetallados.setToolTipText(sToolTipCobrarMorosidadClientesDetallados);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarMorosidadClientesDetallados);
		this.jTableDatosCobrarMorosidadClientesDetallados.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarMorosidadClientesDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarMorosidadClientesDetallados.setRowSelectionAllowed(true);
		this.jTableDatosCobrarMorosidadClientesDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarMorosidadClientesDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonDuplicarCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonCopiarCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonVerFormCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonCerrarCobrarMorosidadClientesDetallados = new JButtonMe();
		
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Morosidad Clientes Detallados";
		
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Morosidad Clientes Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarMorosidadClientesDetallados.setToolTipText("Acciones");
        this.jPanelAccionesCobrarMorosidadClientesDetallados.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados=new ReporteDinamicoJInternalFrame(CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarMorosidadClientesDetallados();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarMorosidadClientesDetallados=new ImportacionJInternalFrame(CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarMorosidadClientesDetallados();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.setText("Orden");
		this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarMorosidadClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados,false,this);
			
			//this.cargarOrderByCobrarMorosidadClientesDetallados(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarMorosidadClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados,true,this);
			
			//this.cargarOrderByCobrarMorosidadClientesDetallados(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarMorosidadClientesDetallados.setText("Nuevo");
		this.jButtonDuplicarCobrarMorosidadClientesDetallados.setText("Duplicar");
		this.jButtonCopiarCobrarMorosidadClientesDetallados.setText("Copiar");
		this.jButtonVerFormCobrarMorosidadClientesDetallados.setText("Ver");
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.setText("Guardar");
		this.jButtonCerrarCobrarMorosidadClientesDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarMorosidadClientesDetallados,"nuevo_button","Nuevo",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarMorosidadClientesDetallados,"duplicar_button","Duplicar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarMorosidadClientesDetallados,"copiar_button","Copiar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarMorosidadClientesDetallados,"ver_form","Ver",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados,"nuevorelaciones_button","Nuevo Rel",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados,"guardarcambiostabla_button","Guardar",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarMorosidadClientesDetallados,"cerrar_button","Salir",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarMorosidadClientesDetallados.setToolTipText("Nuevo"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarMorosidadClientesDetallados.setToolTipText("Duplicar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarMorosidadClientesDetallados.setToolTipText("Copiar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarMorosidadClientesDetallados.setToolTipText("Ver"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.setToolTipText("Nuevo Rel"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.setToolTipText("Guardar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarMorosidadClientesDetallados.setToolTipText("Salir"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonNuevoCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarMorosidadClientesDetallados"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonDuplicarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarMorosidadClientesDetallados"));
		
		//COPIAR
		sMapKey = "CopiarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonCopiarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarMorosidadClientesDetallados"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonVerFormCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarMorosidadClientesDetallados"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarMorosidadClientesDetallados"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonModificarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarMorosidadClientesDetallados"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonCerrarCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarMorosidadClientesDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarMorosidadClientesDetallados"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarMorosidadClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarMorosidadClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarMorosidadClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarMorosidadClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarMorosidadClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setName("jPanelParametrosReportesCobrarMorosidadClientesDetallados"); 
		
		this.jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados.setName("jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.setText("Buscar");
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.setToolTipText("Buscar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados.setText("Procesar");
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados.setToolTipText("Procesar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setText("Accion");
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarMorosidadClientesDetallados = new JLabelMe();
		
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setText("Acciones");		
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarMorosidadClientesDetallados = new JButtonMe();
		//this.jButtonAnterioresCobrarMorosidadClientesDetallados.setText("<<");
        this.jButtonAnterioresCobrarMorosidadClientesDetallados.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarMorosidadClientesDetallados,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarMorosidadClientesDetallados = new JButtonMe();
		//this.jButtonSiguientesCobrarMorosidadClientesDetallados.setText(">>");
        this.jButtonSiguientesCobrarMorosidadClientesDetallados.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarMorosidadClientesDetallados,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados,"nuevoguardarcambios_button","Nue",this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarMorosidadClientesDetallados"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarMorosidadClientesDetallados"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonSiguientesCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarMorosidadClientesDetallados"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonAnterioresCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarMorosidadClientesDetallados"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarMorosidadClientesDetallados();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(this.getWidth(),CobrarMorosidadClientesDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarMorosidadClientesDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(this.getWidth(),CobrarMorosidadClientesDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarMorosidadClientesDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(this.getWidth(),CobrarMorosidadClientesDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarMorosidadClientesDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarMorosidadClientesDetallados = new GridBagLayout();

			this.jPanelPaginacionCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutPaginacionCobrarMorosidadClientesDetallados);						
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonAnterioresCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
					
						
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
			
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
						
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonSiguientesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonNuevoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
						
			
			
			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 1;
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			}
			
			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonDuplicarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonCopiarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonVerFormCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 1;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.add(this.jButtonCerrarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarMorosidadClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarMorosidadClientesDetallados = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarMorosidadClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarMorosidadClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarMorosidadClientesDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarMorosidadClientesDetallados = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setLayout(gridaBagParametrosReportesCobrarMorosidadClientesDetallados);
			this.jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados.setLayout(gridaBagParametrosReportesAccionesCobrarMorosidadClientesDetallados);
			
			
			this.jPanelParametrosAuxiliar1CobrarMorosidadClientesDetallados.setLayout(gridaBagParametrosAuxiliar1CobrarMorosidadClientesDetallados);
			this.jPanelParametrosAuxiliar2CobrarMorosidadClientesDetallados.setLayout(gridaBagParametrosAuxiliar2CobrarMorosidadClientesDetallados);
			this.jPanelParametrosAuxiliar3CobrarMorosidadClientesDetallados.setLayout(gridaBagParametrosAuxiliar3CobrarMorosidadClientesDetallados);
			this.jPanelParametrosAuxiliar4CobrarMorosidadClientesDetallados.setLayout(gridaBagParametrosAuxiliar4CobrarMorosidadClientesDetallados);
			//this.jPanelParametrosAuxiliar5CobrarMorosidadClientesDetallados.setLayout(gridaBagParametrosAuxiliar2CobrarMorosidadClientesDetallados);			
			
			
			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarMorosidadClientesDetallados.add(this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarMorosidadClientesDetallados.add(this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarMorosidadClientesDetallados.add(this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jPanelParametrosAuxiliar1CobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarMorosidadClientesDetallados.add(this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);																		
			
			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarMorosidadClientesDetallados.add(this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jPanelParametrosAuxiliar4CobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jCheckBoxGenerarReporteCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jPanelParametrosAuxiliar2CobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jLabelAccionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
			
			
			/*
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarMorosidadClientesDetallados.add(this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);															
				
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarMorosidadClientesDetallados.add(this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);															
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarMorosidadClientesDetallados.add(this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jPanelParametrosAuxiliar3CobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.add(this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarMorosidadClientesDetallados = new GridBagLayout();

			this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutDatosCobrarMorosidadClientesDetallados);
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
			
			this.jScrollPanelDatosCobrarMorosidadClientesDetallados.add(this.jTableDatosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setViewportView(this.jTableDatosCobrarMorosidadClientesDetallados);
		this.jTableDatosCobrarMorosidadClientesDetallados.setFillsViewportHeight(true);
		this.jTableDatosCobrarMorosidadClientesDetallados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarMorosidadClientesDetallados= new GridBagLayout();
		this.jPanelAccionesCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutAccionesCobrarMorosidadClientesDetallados);
		
		
		/*	
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
			
		this.jPanelAccionesCobrarMorosidadClientesDetallados.add(this.jButtonNuevoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);

		gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
		jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.add(jLabelfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados, gridBagConstraintsCobrarMorosidadClientesDetallados);

		gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 0;
		gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 1;
		jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.add(jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados, gridBagConstraintsCobrarMorosidadClientesDetallados);

		gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = 1;
		gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =1;
		jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.add(jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados, gridBagConstraintsCobrarMorosidadClientesDetallados);

		jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.addTab("1.-Por Fecha Vence ", jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
		jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarMorosidadClientesDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarMorosidadClientesDetallados);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();						
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;		
			//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;		
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;		
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);								
		
		
		/*
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		*/		
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =0;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
				
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarMorosidadClientesDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarMorosidadClientesDetallados = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutBusquedasParametrosCobrarMorosidadClientesDetallados);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
			
			
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
			
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarMorosidadClientesDetallados;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarMorosidadClientesDetallados() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarMorosidadClientesDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.setName("jPanelReporteDinamicoCobrarMorosidadClientesDetallados"); 
		
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutReporteDinamicoCobrarMorosidadClientesDetallados);
		
		
		this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Morosidad Clientes Detalladoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarMorosidadClientesDetallados.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelColumnasSelectReporteCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados=new JScrollPane(this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados);
			
			this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarMorosidadClientesDetallados.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarMorosidadClientesDetallados = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarMorosidadClientesDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarMorosidadClientesDetallados=new JScrollPane(this.jListRelacionesSelectReporteCobrarMorosidadClientesDetallados);
			
			this.jScrollRelacionesSelectReporteCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarMorosidadClientesDetallados.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelConGraficoDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jCheckBoxConGraficoDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelColumnaCategoriaGraficoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarMorosidadClientesDetallados.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelColumnaCategoriaValorCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jComboBoxColumnaCategoriaValorCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarMorosidadClientesDetallados.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelColumnasValoresGraficoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarMorosidadClientesDetallados=new JScrollPane(this.jListColumnasValoresGraficoCobrarMorosidadClientesDetallados);
			
			this.jScrollColumnasValoresGraficoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jListColumnasSelectReporteCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jScrollColumnasValoresGraficoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarMorosidadClientesDetallados.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.setToolTipText("Generar EXCEL"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jComboBoxTiposReportesDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarMorosidadClientesDetallados.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jLabelTiposArchivoReporteDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados.setToolTipText("Generar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados.setToolTipText("Cancelar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarMorosidadClientesDetallados.add(this.jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarMorosidadClientesDetallados = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados= new JScrollPane(jPanelReporteDinamicoCobrarMorosidadClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Morosidad Clientes Detalladoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarMorosidadClientesDetallados);
		this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarMorosidadClientesDetallados() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarMorosidadClientesDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarMorosidadClientesDetallados.setName("jPanelImportacionCobrarMorosidadClientesDetallados"); 
		
		this.jPanelImportacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutImportacionCobrarMorosidadClientesDetallados);
		
		
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarMorosidadClientesDetallados= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarMorosidadClientesDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setResizable(true);
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setClosable(true);
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setResizable(true);
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setClosable(true);
	    this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Morosidad Clientes Detalladoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelArchivoImportacionCobrarMorosidadClientesDetallados.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarMorosidadClientesDetallados.add(this.jLabelArchivoImportacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarMorosidadClientesDetallados = new JFileChooser();		
		this.jFileChooserImportacionCobrarMorosidadClientesDetallados.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonAbrirImportacionCobrarMorosidadClientesDetallados.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarMorosidadClientesDetallados,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarMorosidadClientesDetallados.setToolTipText("Generar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarMorosidadClientesDetallados.add(this.jButtonAbrirImportacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarMorosidadClientesDetallados = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarMorosidadClientesDetallados.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarMorosidadClientesDetallados.add(this.jLabelPathArchivoImportacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarMorosidadClientesDetallados=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarMorosidadClientesDetallados.add(this.jTextFieldPathArchivoImportacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonGenerarImportacionCobrarMorosidadClientesDetallados.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarMorosidadClientesDetallados,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarMorosidadClientesDetallados.setToolTipText("Generar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarMorosidadClientesDetallados.add(this.jButtonGenerarImportacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarMorosidadClientesDetallados = new JButtonMe();
		this.jButtonCerrarImportacionCobrarMorosidadClientesDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarMorosidadClientesDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarMorosidadClientesDetallados.setToolTipText("Cancelar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarMorosidadClientesDetallados.add(this.jButtonCerrarImportacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarMorosidadClientesDetallados = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarMorosidadClientesDetallados= new JScrollPane(jPanelImportacionCobrarMorosidadClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarMorosidadClientesDetallados);
		this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getContentPane().add(this.jScrollPanelImportacionCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarMorosidadClientesDetallados(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados = new JButtonMe();
			this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.setText("Orden");
			this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarMorosidadClientesDetallados";
			inputMap = this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarMorosidadClientesDetallados"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarMorosidadClientesDetallados = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarMorosidadClientesDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarMorosidadClientesDetallados.setName("jPanelOrderByCobrarMorosidadClientesDetallados"); 
			
			this.jPanelOrderByCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarMorosidadClientesDetallados.setLayout(gridaBagLayoutOrderByCobrarMorosidadClientesDetallados);
			
			
			this.jTableDatosCobrarMorosidadClientesDetalladosOrderBy = new JTableMe();        
			this.jTableDatosCobrarMorosidadClientesDetalladosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarMorosidadClientesDetalladosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarMorosidadClientesDetalladosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarMorosidadClientesDetalladosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarMorosidadClientesDetalladosOrderBy.setViewportView(this.jTableDatosCobrarMorosidadClientesDetalladosOrderBy);
			this.jTableDatosCobrarMorosidadClientesDetalladosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarMorosidadClientesDetalladosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarMorosidadClientesDetallados = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarMorosidadClientesDetallados= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setTitle("Orden");
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setResizable(true);
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setClosable(true);
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarMorosidadClientesDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Morosidad Clientes Detalladoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarMorosidadClientesDetallados.ipady =150;
				
			this.jPanelOrderByCobrarMorosidadClientesDetallados.add(jScrollPanelDatosCobrarMorosidadClientesDetalladosOrderBy, this.gridBagConstraintsCobrarMorosidadClientesDetallados);//this.jTableDatosCobrarMorosidadClientesDetalladosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarMorosidadClientesDetallados = new JButtonMe();
			this.jButtonCerrarOrderByCobrarMorosidadClientesDetallados.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarMorosidadClientesDetallados,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarMorosidadClientesDetallados.setToolTipText("Cancelar"+" "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarMorosidadClientesDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarMorosidadClientesDetallados.add(this.jButtonCerrarOrderByCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarMorosidadClientesDetallados = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarMorosidadClientesDetallados= new JScrollPane(jPanelOrderByCobrarMorosidadClientesDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarMorosidadClientesDetallados = new GridBagConstraints();
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarMorosidadClientesDetallados.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarMorosidadClientesDetallados);
			
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getContentPane().add(this.jScrollPanelOrderByCobrarMorosidadClientesDetallados, this.gridBagConstraintsCobrarMorosidadClientesDetallados);			
		
		} else {
			this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarMorosidadClientesDetallados.getRowHeight();//CobrarMorosidadClientesDetalladosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados.isSelected()) {
					iHeightTable=CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarMorosidadClientesDetallados.isSelected()) {
					iHeightTable=CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarMorosidadClientesDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados!=null && this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarmorosidadclientesdetalladoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarMorosidadClientesDetallados> TraerCobrarMorosidadClientesDetalladosBeans(List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladoss) {
					
				if(!(CobrarMorosidadClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarMorosidadClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarmorosidadclientesdetallados.setsDetalleGeneralEntityReporte(CobrarMorosidadClientesDetalladosConstantesFunciones.getCobrarMorosidadClientesDetalladosDescripcion(cobrarmorosidadclientesdetallados));
										
						
					
						
					
				} else  {
							
					//cobrarmorosidadclientesdetallados.setsDetalleGeneralEntityReporte(cobrarmorosidadclientesdetallados.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarmorosidadclientesdetalladosbeans.add(cobrarmorosidadclientesdetalladosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarmorosidadclientesdetalladoss;
    }
	//PARA REPORTES FIN
}
