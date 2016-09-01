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
import com.bydan.erp.cartera.util.report.CobrarConciliacionesCarterasContabilidadConstantesFunciones;

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
public class CobrarConciliacionesCarterasContabilidadJInternalFrame extends CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarConciliacionesCarterasContabilidad;
	
	protected JMenuBar jmenuBarCobrarConciliacionesCarterasContabilidad;
	
	protected JMenu jmenuCobrarConciliacionesCarterasContabilidad;
	protected JMenu jmenuDatosCobrarConciliacionesCarterasContabilidad;
	protected JMenu jmenuArchivoCobrarConciliacionesCarterasContabilidad;
	protected JMenu jmenuAccionesCobrarConciliacionesCarterasContabilidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarConciliacionesCarterasContabilidad;	
	protected GridBagConstraints gridBagConstraintsCobrarConciliacionesCarterasContabilidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CobrarConciliacionesCarterasContabilidadSessionBean cobrarconciliacionescarterascontabilidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidads;		
	public List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsEliminados;	
	public List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad;		
	protected JButton jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad;
	
	
	//protected JPanel jPanelOrderByCobrarConciliacionesCarterasContabilidad;
	//public JScrollPane jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad;	
	//protected JButton jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarConciliacionesCarterasContabilidadLogic cobrarconciliacionescarterascontabilidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarConciliacionesCarterasContabilidad;
	public JScrollPane jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad;
	public JScrollPane jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarConciliacionesCarterasContabilidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad;
	//public JScrollPane jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad;
	
	
	
	protected JPanel jPanelAccionesCobrarConciliacionesCarterasContabilidad;
	
    protected JPanel jPanelPaginacionCobrarConciliacionesCarterasContabilidad;
    protected JPanel jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad;
	protected JPanel jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad;
	protected JPanel jPanelParametrosAuxiliar2CobrarConciliacionesCarterasContabilidad;
	protected JPanel jPanelParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad;
	protected JPanel jPanelParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad;
	//protected JPanel jPanelParametrosAuxiliar5CobrarConciliacionesCarterasContabilidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad;
	//protected JPanel jPanelImportacionCobrarConciliacionesCarterasContabilidad;
	
	
	public JTable jTableDatosCobrarConciliacionesCarterasContabilidad;
	
	
	
	//public JTable jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonDuplicarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonCopiarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonVerFormCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonModificarCobrarConciliacionesCarterasContabilidad;
	
    protected JButton jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonCerrarCobrarConciliacionesCarterasContabilidad;
	
	
	protected JButton jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	
	
	protected JButton jButtonAnterioresCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonSiguientesCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad;
	//protected JButton jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidad;
	//protected JButton jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidad;
	//protected JButton jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidad;
	//protected JFileChooser jFileChooserImportacionCobrarConciliacionesCarterasContabilidad;
	//protected File fileImportacionCobrarConciliacionesCarterasContabilidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonDuplicarToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonCopiarToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonVerFormToolBarCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonCerrarToolBarCobrarConciliacionesCarterasContabilidad;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonProcesarInformacionToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonAnterioresToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonSiguientesToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonAbrirOrderByToolBarCobrarConciliacionesCarterasContabilidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemCopiarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemVerFormCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemCerrarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarConciliacionesCarterasContabilidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad;
	protected JCheckBox jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad;
	protected JTextField jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarConciliacionesCarterasContabilidad;
	//public JList<Reporte> jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad;
	//public JScrollPane jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarConciliacionesCarterasContabilidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarConciliacionesCarterasContabilidad;
	
		
	//public JLabel jLabelArchivoImportacionCobrarConciliacionesCarterasContabilidad;	
	//public JLabel jLabelPathArchivoImportacionCobrarConciliacionesCarterasContabilidad;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarConciliacionesCarterasContabilidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad;
	public JPanel jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	
	public JPanel jPanelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidadUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;

	public JDateChooser jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;

	public JDateChooser jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarConciliacionesCarterasContabilidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarConciliacionesCarterasContabilidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarConciliacionesCarterasContabilidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarConciliacionesCarterasContabilidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad)	{
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad = jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad;
	}
	
	public JButton getjButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad() {
		return this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad)	{
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad = jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad() {
		return this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad;
	}
	
	
	public List<CobrarConciliacionesCarterasContabilidad> getcobrarconciliacionescarterascontabilidads() {
		return this.cobrarconciliacionescarterascontabilidads;
	}

	public void setcobrarconciliacionescarterascontabilidads(List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidads) {
		this.cobrarconciliacionescarterascontabilidads = cobrarconciliacionescarterascontabilidads;
	}
	
	public List<CobrarConciliacionesCarterasContabilidad> getcobrarconciliacionescarterascontabilidadsAux() {
		return this.cobrarconciliacionescarterascontabilidadsAux;
	}

	public void setcobrarconciliacionescarterascontabilidadsAux(List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsAux) {
		this.cobrarconciliacionescarterascontabilidadsAux = cobrarconciliacionescarterascontabilidadsAux;
	}
	
	public List<CobrarConciliacionesCarterasContabilidad> getcobrarconciliacionescarterascontabilidadsEliminados() {
		return this.cobrarconciliacionescarterascontabilidadsEliminados;
	}

	public void setCobrarConciliacionesCarterasContabilidadsEliminados(List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsEliminados) {
		this.cobrarconciliacionescarterascontabilidadsEliminados = cobrarconciliacionescarterascontabilidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad() {
		return jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad = jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad() {
		return jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad;
	}

	public void setjTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad(
			JTextField jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad) {
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad = jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad;
	}

	public void setBorderResaltarValorCampoGeneralCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad() {
		return this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad;
	}

	public void setjCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad(
			JCheckBox jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad) {
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad = jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad;
	}

	public void setBorderResaltarSeleccionarTodosCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad() {
		return this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad;
	}

	public void setjCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad(
			JCheckBox jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad) {
		this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad = jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setBorderResaltarSeleccionadosCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad = jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad = jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad() {
	//	return jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad) {
	//	this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad = jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad = jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad;
	//}
	
	public void setBorderResaltarTiposReportesCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad = jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad = jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad = jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad = jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarConciliacionesCarterasContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad() {
	//	return jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad) {
	//	this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad = jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarConciliacionesCarterasContabilidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad .setBorder(borderResaltar);		
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
		this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean();
		
		this.cobrarconciliacionescarterascontabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarconciliacionescarterascontabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarConciliacionesCarterasContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarConciliacionesCarterasContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarConciliacionesCarterasContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarConciliacionesCarterasContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarConciliacionesCarterasContabilidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Conciliaciones Carteras Contabilidad MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarConciliacionesCarterasContabilidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarConciliacionesCarterasContabilidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"nuevo","nuevo","Nuevo"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"duplicar","duplicar","Duplicar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"copiar","copiar","Copiar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"ver_form","ver_form","Ver"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"recargar","recargar","Buscar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,
							"cerrar","cerrar","Salir"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad;
			
				this.jButtonProcesarInformacionToolBarCobrarConciliacionesCarterasContabilidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarConciliacionesCarterasContabilidad;
				
		//protected JButton jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarConciliacionesCarterasContabilidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarConciliacionesCarterasContabilidad=new JMenuMe("General");
		this.jmenuArchivoCobrarConciliacionesCarterasContabilidad=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarConciliacionesCarterasContabilidad=new JMenuMe("Acciones");
		this.jmenuDatosCobrarConciliacionesCarterasContabilidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarConciliacionesCarterasContabilidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarConciliacionesCarterasContabilidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarConciliacionesCarterasContabilidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarConciliacionesCarterasContabilidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarConciliacionesCarterasContabilidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarConciliacionesCarterasContabilidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarConciliacionesCarterasContabilidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarConciliacionesCarterasContabilidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad);
			
			this.jmenuAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad);
			this.jmenuAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad);
			this.jmenuAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad);
			this.jmenuAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad);		
			this.jmenuAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad);		
			this.jmenuAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemCopiarCobrarConciliacionesCarterasContabilidad);		
			this.jmenuAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemVerFormCobrarConciliacionesCarterasContabilidad);		
			
			this.jmenuDatosCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad);				
			this.jmenuDatosCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad);				
			this.jmenuDatosCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad);				
			this.jmenuDatosCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad);				
			this.jmenuDatosCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarConciliacionesCarterasContabilidad.add(this.jmenuArchivoCobrarConciliacionesCarterasContabilidad);		
			this.jmenuBarCobrarConciliacionesCarterasContabilidad.add(this.jmenuAccionesCobrarConciliacionesCarterasContabilidad);		
			this.jmenuBarCobrarConciliacionesCarterasContabilidad.add(this.jmenuDatosCobrarConciliacionesCarterasContabilidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarConciliacionesCarterasContabilidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarConciliacionesCarterasContabilidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setToolTipText("Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad= new JButtonMe();
		this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setText("Buscar");
		this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setToolTipText("Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad,"buscar_button","Buscar Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setText("Cuenta Contable :");
		jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad= new JComboBoxMe();
		jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad= new JDateChooser();
		jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setDate(new Date());
		jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad= new JDateChooser();
		jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setDate(new Date());
		jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarConciliacionesCarterasContabilidad = new CobrarConciliacionesCarterasContabilidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Conciliaciones Carteras Contabilidad DATOS");
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad = new CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame(jDesktopPane,this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones(),this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad = null;//new CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad= new GridBagLayout();
		
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad = new JTableMe();      
		
		String sToolTipCobrarConciliacionesCarterasContabilidad="";
		sToolTipCobrarConciliacionesCarterasContabilidad=CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarConciliacionesCarterasContabilidad+="(Cartera.CobrarConciliacionesCarterasContabilidad)";
		}
		
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarConciliacionesCarterasContabilidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setToolTipText(sToolTipCobrarConciliacionesCarterasContabilidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarConciliacionesCarterasContabilidad);
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionAllowed(true);
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonCopiarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonVerFormCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Conciliaciones Carteras Contabilidad";
		
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Conciliaciones Carteras Contabilidades" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setToolTipText("Acciones");
        this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad=new ReporteDinamicoJInternalFrame(CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarConciliacionesCarterasContabilidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad=new ImportacionJInternalFrame(CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarConciliacionesCarterasContabilidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.setText("Orden");
		this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad,false,this);
			
			//this.cargarOrderByCobrarConciliacionesCarterasContabilidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad,true,this);
			
			//this.cargarOrderByCobrarConciliacionesCarterasContabilidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.setText("Nuevo");
		this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.setText("Duplicar");
		this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.setText("Copiar");
		this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.setText("Ver");
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setText("Guardar");
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarConciliacionesCarterasContabilidad,"nuevo_button","Nuevo",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad,"duplicar_button","Duplicar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarConciliacionesCarterasContabilidad,"copiar_button","Copiar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarConciliacionesCarterasContabilidad,"ver_form","Ver",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad,"nuevorelaciones_button","Nuevo Rel",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad,"guardarcambiostabla_button","Guardar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarConciliacionesCarterasContabilidad,"cerrar_button","Salir",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.setToolTipText("Nuevo"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.setToolTipText("Duplicar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.setToolTipText("Copiar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.setToolTipText("Ver"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.setToolTipText("Nuevo Rel"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setToolTipText("Guardar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.setToolTipText("Salir"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarConciliacionesCarterasContabilidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarConciliacionesCarterasContabilidad"));
		
		//COPIAR
		sMapKey = "CopiarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarConciliacionesCarterasContabilidad"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarConciliacionesCarterasContabilidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarConciliacionesCarterasContabilidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonModificarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarConciliacionesCarterasContabilidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarConciliacionesCarterasContabilidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarConciliacionesCarterasContabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarConciliacionesCarterasContabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setName("jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad"); 
		
		this.jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad.setName("jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.setText("Buscar");
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.setToolTipText("Buscar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad.setText("Procesar");
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad.setToolTipText("Procesar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setText("Accion");
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setText("Acciones");		
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		//this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad.setText("<<");
        this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		//this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad.setText(">>");
        this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad,"nuevoguardarcambios_button","Nue",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarConciliacionesCarterasContabilidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarConciliacionesCarterasContabilidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarConciliacionesCarterasContabilidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarConciliacionesCarterasContabilidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(this.getWidth(),CobrarConciliacionesCarterasContabilidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarConciliacionesCarterasContabilidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(this.getWidth(),CobrarConciliacionesCarterasContabilidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarConciliacionesCarterasContabilidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(this.getWidth(),CobrarConciliacionesCarterasContabilidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarConciliacionesCarterasContabilidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarConciliacionesCarterasContabilidad = new GridBagLayout();

			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutPaginacionCobrarConciliacionesCarterasContabilidad);						
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
					
						
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
			
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
						
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonNuevoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
						
			
			
			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			}
			
			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonCopiarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonVerFormCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonCerrarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagParametrosReportesCobrarConciliacionesCarterasContabilidad);
			this.jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad);
			
			
			this.jPanelParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad.setLayout(gridaBagParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad);
			this.jPanelParametrosAuxiliar2CobrarConciliacionesCarterasContabilidad.setLayout(gridaBagParametrosAuxiliar2CobrarConciliacionesCarterasContabilidad);
			this.jPanelParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad.setLayout(gridaBagParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad);
			this.jPanelParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad.setLayout(gridaBagParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad);
			//this.jPanelParametrosAuxiliar5CobrarConciliacionesCarterasContabilidad.setLayout(gridaBagParametrosAuxiliar2CobrarConciliacionesCarterasContabilidad);			
			
			
			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jPanelParametrosAuxiliar1CobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);																		
			
			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jPanelParametrosAuxiliar4CobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxGenerarReporteCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jPanelParametrosAuxiliar2CobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jLabelAccionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
			
			
			/*
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);															
				
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);															
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jPanelParametrosAuxiliar3CobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarConciliacionesCarterasContabilidad = new GridBagLayout();

			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutDatosCobrarConciliacionesCarterasContabilidad);
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
			
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.add(this.jTableDatosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setViewportView(this.jTableDatosCobrarConciliacionesCarterasContabilidad);
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setFillsViewportHeight(true);
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarConciliacionesCarterasContabilidad= new GridBagLayout();
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutAccionesCobrarConciliacionesCarterasContabilidad);
		
		
		/*	
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
			
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.add(this.jButtonNuevoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);

		gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.add(jLabelid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.add(jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


		gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.add(jLabelfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 1;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.add(jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


		gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 2;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.add(jLabelfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 2;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.add(jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 3;
		gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =1;
		jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.add(jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.addTab("1.-Por Cuenta Contable Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
		jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarConciliacionesCarterasContabilidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();						
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;		
			//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;		
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);								
		
		
		/*
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		*/		
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
				
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarConciliacionesCarterasContabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutBusquedasParametrosCobrarConciliacionesCarterasContabilidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			
			
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
			
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarConciliacionesCarterasContabilidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setName("jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad"); 
		
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutReporteDinamicoCobrarConciliacionesCarterasContabilidad);
		
		
		this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Conciliaciones Carteras Contabilidades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelColumnasSelectReporteCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad=new JScrollPane(this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad);
			
			this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad=new JScrollPane(this.jListRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad);
			
			this.jScrollRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelConGraficoDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jCheckBoxConGraficoDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxColumnaCategoriaValorCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad=new JScrollPane(this.jListColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad);
			
			this.jScrollColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jListColumnasSelectReporteCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jScrollColumnasValoresGraficoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarConciliacionesCarterasContabilidad.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setToolTipText("Generar EXCEL"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposReportesDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarConciliacionesCarterasContabilidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jLabelTiposArchivoReporteDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad.setToolTipText("Generar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad.setToolTipText("Cancelar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.add(this.jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad= new JScrollPane(jPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Conciliaciones Carteras Contabilidades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarConciliacionesCarterasContabilidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.setName("jPanelImportacionCobrarConciliacionesCarterasContabilidad"); 
		
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutImportacionCobrarConciliacionesCarterasContabilidad);
		
		
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setResizable(true);
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setClosable(true);
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setResizable(true);
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setClosable(true);
	    this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Conciliaciones Carteras Contabilidades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelArchivoImportacionCobrarConciliacionesCarterasContabilidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.add(this.jLabelArchivoImportacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarConciliacionesCarterasContabilidad = new JFileChooser();		
		this.jFileChooserImportacionCobrarConciliacionesCarterasContabilidad.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidad.setToolTipText("Generar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarConciliacionesCarterasContabilidad = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarConciliacionesCarterasContabilidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.add(this.jLabelPathArchivoImportacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarConciliacionesCarterasContabilidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.add(this.jTextFieldPathArchivoImportacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidad.setToolTipText("Generar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidad.setToolTipText("Cancelar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarConciliacionesCarterasContabilidad.add(this.jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad= new JScrollPane(jPanelImportacionCobrarConciliacionesCarterasContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getContentPane().add(this.jScrollPanelImportacionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarConciliacionesCarterasContabilidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad = new JButtonMe();
			this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.setText("Orden");
			this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarConciliacionesCarterasContabilidad";
			inputMap = this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarConciliacionesCarterasContabilidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.setName("jPanelOrderByCobrarConciliacionesCarterasContabilidad"); 
			
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutOrderByCobrarConciliacionesCarterasContabilidad);
			
			
			this.jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy = new JTableMe();        
			this.jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidadOrderBy.setViewportView(this.jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy);
			this.jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarConciliacionesCarterasContabilidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setTitle("Orden");
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setResizable(true);
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setClosable(true);
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Conciliaciones Carteras Contabilidades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipady =150;
				
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.add(jScrollPanelDatosCobrarConciliacionesCarterasContabilidadOrderBy, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);//this.jTableDatosCobrarConciliacionesCarterasContabilidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidad = new JButtonMe();
			this.jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidad.setToolTipText("Cancelar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarConciliacionesCarterasContabilidad.add(this.jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad= new JScrollPane(jPanelOrderByCobrarConciliacionesCarterasContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarConciliacionesCarterasContabilidad);
			
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getContentPane().add(this.jScrollPanelOrderByCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
		
		} else {
			this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad = new JButtonMe();
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
		//	&& this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowHeight();//CobrarConciliacionesCarterasContabilidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad.isSelected()) {
					iHeightTable=CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarConciliacionesCarterasContabilidad.isSelected()) {
					iHeightTable=CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarConciliacionesCarterasContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarconciliacionescarterascontabilidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarConciliacionesCarterasContabilidad> TraerCobrarConciliacionesCarterasContabilidadBeans(List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidads) {
					
				if(!(CobrarConciliacionesCarterasContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarConciliacionesCarterasContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarconciliacionescarterascontabilidad.setsDetalleGeneralEntityReporte(CobrarConciliacionesCarterasContabilidadConstantesFunciones.getCobrarConciliacionesCarterasContabilidadDescripcion(cobrarconciliacionescarterascontabilidad));
										
						
					
						
					
				} else  {
							
					//cobrarconciliacionescarterascontabilidad.setsDetalleGeneralEntityReporte(cobrarconciliacionescarterascontabilidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarconciliacionescarterascontabilidadbeans.add(cobrarconciliacionescarterascontabilidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarconciliacionescarterascontabilidads;
    }
	//PARA REPORTES FIN
}
