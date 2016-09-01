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
import com.bydan.erp.cartera.util.report.CobrarEstadosCuentasPorFacturaConstantesFunciones;

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
public class CobrarEstadosCuentasPorFacturaJInternalFrame extends CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarEstadosCuentasPorFactura;
	
	protected JMenuBar jmenuBarCobrarEstadosCuentasPorFactura;
	
	protected JMenu jmenuCobrarEstadosCuentasPorFactura;
	protected JMenu jmenuDatosCobrarEstadosCuentasPorFactura;
	protected JMenu jmenuArchivoCobrarEstadosCuentasPorFactura;
	protected JMenu jmenuAccionesCobrarEstadosCuentasPorFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarEstadosCuentasPorFactura;	
	protected GridBagConstraints gridBagConstraintsCobrarEstadosCuentasPorFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarEstadosCuentasPorFactura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CobrarEstadosCuentasPorFacturaSessionBean cobrarestadoscuentasporfacturaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas;		
	public List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasEliminados;	
	public List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarEstadosCuentasPorFactura;		
	protected JButton jButtonAbrirOrderByCobrarEstadosCuentasPorFactura;
	
	
	//protected JPanel jPanelOrderByCobrarEstadosCuentasPorFactura;
	//public JScrollPane jScrollPanelOrderByCobrarEstadosCuentasPorFactura;	
	//protected JButton jButtonCerrarOrderByCobrarEstadosCuentasPorFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarEstadosCuentasPorFacturaLogic cobrarestadoscuentasporfacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarEstadosCuentasPorFactura;
	public JScrollPane jScrollPanelDatosEdicionCobrarEstadosCuentasPorFactura;
	public JScrollPane jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarEstadosCuentasPorFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura;
	//public JScrollPane jScrollPanelImportacionCobrarEstadosCuentasPorFactura;
	
	
	
	protected JPanel jPanelAccionesCobrarEstadosCuentasPorFactura;
	
    protected JPanel jPanelPaginacionCobrarEstadosCuentasPorFactura;
    protected JPanel jPanelParametrosReportesCobrarEstadosCuentasPorFactura;
	protected JPanel jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarEstadosCuentasPorFactura;
	protected JPanel jPanelParametrosAuxiliar2CobrarEstadosCuentasPorFactura;
	protected JPanel jPanelParametrosAuxiliar3CobrarEstadosCuentasPorFactura;
	protected JPanel jPanelParametrosAuxiliar4CobrarEstadosCuentasPorFactura;
	//protected JPanel jPanelParametrosAuxiliar5CobrarEstadosCuentasPorFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarEstadosCuentasPorFactura;
	//protected JPanel jPanelImportacionCobrarEstadosCuentasPorFactura;
	
	
	public JTable jTableDatosCobrarEstadosCuentasPorFactura;
	
	
	
	//public JTable jTableDatosCobrarEstadosCuentasPorFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarEstadosCuentasPorFactura;
	protected JButton jButtonDuplicarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonCopiarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonVerFormCobrarEstadosCuentasPorFactura;
	protected JButton jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura;
	protected JButton jButtonModificarCobrarEstadosCuentasPorFactura;
	
    protected JButton jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura;
	protected JButton jButtonCerrarCobrarEstadosCuentasPorFactura;
	
	
	protected JButton jButtonRecargarInformacionCobrarEstadosCuentasPorFactura;
	protected JButton jButtonProcesarInformacionCobrarEstadosCuentasPorFactura;
	
	
	protected JButton jButtonAnterioresCobrarEstadosCuentasPorFactura;
	protected JButton jButtonSiguientesCobrarEstadosCuentasPorFactura;
	protected JButton jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura;
	//protected JButton jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarEstadosCuentasPorFactura;
	//protected JButton jButtonGenerarImportacionCobrarEstadosCuentasPorFactura;
	//protected JButton jButtonCerrarImportacionCobrarEstadosCuentasPorFactura;
	//protected JFileChooser jFileChooserImportacionCobrarEstadosCuentasPorFactura;
	//protected File fileImportacionCobrarEstadosCuentasPorFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonDuplicarToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonCopiarToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonVerFormToolBarCobrarEstadosCuentasPorFactura;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonCerrarToolBarCobrarEstadosCuentasPorFactura;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonProcesarInformacionToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonAnterioresToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonSiguientesToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura;
	protected JButton jButtonAbrirOrderByToolBarCobrarEstadosCuentasPorFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemDuplicarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemCopiarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemVerFormCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemCerrarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemDetalleCerrarCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemProcesarInformacionCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemAnterioresCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemSiguientesCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura;
	protected JMenuItem jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarEstadosCuentasPorFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura;
	protected JCheckBox jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarEstadosCuentasPorFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura;
	protected JTextField jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarEstadosCuentasPorFactura;
	//public JList<Reporte> jListColumnasSelectReporteCobrarEstadosCuentasPorFactura;
	//public JScrollPane jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarEstadosCuentasPorFactura;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarEstadosCuentasPorFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarEstadosCuentasPorFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarEstadosCuentasPorFactura;
	
		
	//public JLabel jLabelArchivoImportacionCobrarEstadosCuentasPorFactura;	
	//public JLabel jLabelPathArchivoImportacionCobrarEstadosCuentasPorFactura;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarEstadosCuentasPorFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarEstadosCuentasPorFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarEstadosCuentasPorFactura;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarEstadosCuentasPorFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura;
	public JPanel jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	public JButton jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	public JPanel jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	public JButton jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	
	public JPanel jPanelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	public JLabel jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	//public JFormattedTextField jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;

	public JDateChooser jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura;
	public JButton jButtonfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFacturaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=799;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarEstadosCuentasPorFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarEstadosCuentasPorFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarEstadosCuentasPorFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarEstadosCuentasPorFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarEstadosCuentasPorFactura)	{
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura = jButtonRecargarInformacionCobrarEstadosCuentasPorFactura;
	}
	
	public JButton getjButtonProcesarInformacionCobrarEstadosCuentasPorFactura() {
		return this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarEstadosCuentasPorFactura)	{
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura = jButtonProcesarInformacionCobrarEstadosCuentasPorFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarEstadosCuentasPorFactura() {
		return this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura;
	}
	
	
	public List<CobrarEstadosCuentasPorFactura> getcobrarestadoscuentasporfacturas() {
		return this.cobrarestadoscuentasporfacturas;
	}

	public void setcobrarestadoscuentasporfacturas(List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas) {
		this.cobrarestadoscuentasporfacturas = cobrarestadoscuentasporfacturas;
	}
	
	public List<CobrarEstadosCuentasPorFactura> getcobrarestadoscuentasporfacturasAux() {
		return this.cobrarestadoscuentasporfacturasAux;
	}

	public void setcobrarestadoscuentasporfacturasAux(List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasAux) {
		this.cobrarestadoscuentasporfacturasAux = cobrarestadoscuentasporfacturasAux;
	}
	
	public List<CobrarEstadosCuentasPorFactura> getcobrarestadoscuentasporfacturasEliminados() {
		return this.cobrarestadoscuentasporfacturasEliminados;
	}

	public void setCobrarEstadosCuentasPorFacturasEliminados(List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturasEliminados) {
		this.cobrarestadoscuentasporfacturasEliminados = cobrarestadoscuentasporfacturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura() {
		return jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura = jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura() {
		return jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura;
	}

	public void setjTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura(
			JTextField jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura) {
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura = jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura;
	}

	public void setBorderResaltarValorCampoGeneralCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura() {
		return this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura;
	}

	public void setjCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura(
			JCheckBox jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura) {
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura = jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura;
	}

	public void setBorderResaltarSeleccionarTodosCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura() {
		return this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura;
	}

	public void setjCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura(
			JCheckBox jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura) {
		this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura = jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura;
	}
	
	public void setBorderResaltarSeleccionadosCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura = jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposReportesCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura = jComboBoxTiposReportesCobrarEstadosCuentasPorFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura() {
	//	return jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura) {
	//	this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura = jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura = jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura;
	//}
	
	public void setBorderResaltarTiposReportesCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura = jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura = jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarEstadosCuentasPorFactura() {
		return this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura = jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarEstadosCuentasPorFactura(
			JComboBox jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura) {
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura = jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarEstadosCuentasPorFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura() {
	//	return jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura) {
	//	this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura = jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarEstadosCuentasPorFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarEstadosCuentasPorFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura .setBorder(borderResaltar);		
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
		this.cobrarestadoscuentasporfacturaSessionBean=new CobrarEstadosCuentasPorFacturaSessionBean();
		
		this.cobrarestadoscuentasporfacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarestadoscuentasporfacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarEstadosCuentasPorFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarEstadosCuentasPorFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarEstadosCuentasPorFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarEstadosCuentasPorFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarEstadosCuentasPorFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Estados Cuentas Por Factura MANTENIMIENTO"));
		
		
		if(iWidth > 2450) {
			iWidth=2450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarEstadosCuentasPorFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarEstadosCuentasPorFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarEstadosCuentasPorFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"nuevo","nuevo","Nuevo"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"duplicar","duplicar","Duplicar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"copiar","copiar","Copiar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"ver_form","ver_form","Ver"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"recargar","recargar","Buscar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarEstadosCuentasPorFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarEstadosCuentasPorFactura,this.jTtoolBarCobrarEstadosCuentasPorFactura,
							"cerrar","cerrar","Salir"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarEstadosCuentasPorFactura;
			
				this.jButtonProcesarInformacionToolBarCobrarEstadosCuentasPorFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarEstadosCuentasPorFactura;
				
		//protected JButton jButtonModificarToolBarCobrarEstadosCuentasPorFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarEstadosCuentasPorFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarEstadosCuentasPorFactura=new JMenuMe("General");
		this.jmenuArchivoCobrarEstadosCuentasPorFactura=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarEstadosCuentasPorFactura=new JMenuMe("Acciones");
		this.jmenuDatosCobrarEstadosCuentasPorFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarEstadosCuentasPorFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarEstadosCuentasPorFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarEstadosCuentasPorFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarEstadosCuentasPorFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarEstadosCuentasPorFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarEstadosCuentasPorFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarEstadosCuentasPorFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarEstadosCuentasPorFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarEstadosCuentasPorFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarEstadosCuentasPorFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarEstadosCuentasPorFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarEstadosCuentasPorFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarEstadosCuentasPorFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarEstadosCuentasPorFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarEstadosCuentasPorFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarEstadosCuentasPorFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarEstadosCuentasPorFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarEstadosCuentasPorFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarEstadosCuentasPorFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarEstadosCuentasPorFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarEstadosCuentasPorFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarEstadosCuentasPorFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarEstadosCuentasPorFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarEstadosCuentasPorFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarEstadosCuentasPorFactura.add(this.jMenuItemCerrarCobrarEstadosCuentasPorFactura);
			
			this.jmenuAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemNuevoCobrarEstadosCuentasPorFactura);
			this.jmenuAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemNuevoGuardarCambiosCobrarEstadosCuentasPorFactura);
			this.jmenuAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemNuevoRelacionesCobrarEstadosCuentasPorFactura);
			this.jmenuAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemGuardarCambiosTablaCobrarEstadosCuentasPorFactura);		
			this.jmenuAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemDuplicarCobrarEstadosCuentasPorFactura);		
			this.jmenuAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemCopiarCobrarEstadosCuentasPorFactura);		
			this.jmenuAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemVerFormCobrarEstadosCuentasPorFactura);		
			
			this.jmenuDatosCobrarEstadosCuentasPorFactura.add(this.jMenuItemRecargarInformacionCobrarEstadosCuentasPorFactura);				
			this.jmenuDatosCobrarEstadosCuentasPorFactura.add(this.jMenuItemAnterioresCobrarEstadosCuentasPorFactura);				
			this.jmenuDatosCobrarEstadosCuentasPorFactura.add(this.jMenuItemSiguientesCobrarEstadosCuentasPorFactura);				
			this.jmenuDatosCobrarEstadosCuentasPorFactura.add(this.jMenuItemAbrirOrderByCobrarEstadosCuentasPorFactura);				
			this.jmenuDatosCobrarEstadosCuentasPorFactura.add(this.jMenuItemMostrarOcultarCobrarEstadosCuentasPorFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarEstadosCuentasPorFactura.add(this.jMenuItemGuardarCambiosCobrarEstadosCuentasPorFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarEstadosCuentasPorFactura.add(this.jmenuArchivoCobrarEstadosCuentasPorFactura);		
			this.jmenuBarCobrarEstadosCuentasPorFactura.add(this.jmenuAccionesCobrarEstadosCuentasPorFactura);		
			this.jmenuBarCobrarEstadosCuentasPorFactura.add(this.jmenuDatosCobrarEstadosCuentasPorFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarEstadosCuentasPorFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarEstadosCuentasPorFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura= new JButtonMe();
		this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setText("Buscar");
		this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setToolTipText("Buscar Por Fecha Vence Desde Por Fecha Vence Hasta ");
		this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura= new JButtonMe();
		this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setText("Buscar");
		this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setToolTipText("Buscar Por Fecha Vence Desde Por Fecha Vence Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura,"buscar_button","Buscar Por Fecha Vence Desde Por Fecha Vence Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura = new JLabelMe();
		jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setText("Fecha Vence Desde :");
		jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setToolTipText("Fecha Vence Desde");
		jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura = new JLabelMe();
		jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setText("Fecha Vence Hasta :");
		jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setToolTipText("Fecha Vence Hasta");
		jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura= new JDateChooser();
		jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setDate(new Date());
		jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarEstadosCuentasPorFactura = new CobrarEstadosCuentasPorFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Estados Cuentas Por Factura DATOS");
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura = new CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame(jDesktopPane,this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones(),this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarEstadosCuentasPorFactura = null;//new CobrarEstadosCuentasPorFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarEstadosCuentasPorFactura= new GridBagLayout();
		
		
		this.jTableDatosCobrarEstadosCuentasPorFactura = new JTableMe();      
		
		String sToolTipCobrarEstadosCuentasPorFactura="";
		sToolTipCobrarEstadosCuentasPorFactura=CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarEstadosCuentasPorFactura+="(Cartera.CobrarEstadosCuentasPorFactura)";
		}
		
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarEstadosCuentasPorFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.setToolTipText(sToolTipCobrarEstadosCuentasPorFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarEstadosCuentasPorFactura);
		this.jTableDatosCobrarEstadosCuentasPorFactura.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarEstadosCuentasPorFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarEstadosCuentasPorFactura.setRowSelectionAllowed(true);
		this.jTableDatosCobrarEstadosCuentasPorFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarEstadosCuentasPorFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonDuplicarCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonCopiarCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonVerFormCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonCerrarCobrarEstadosCuentasPorFactura = new JButtonMe();
		
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Estados Cuentas Por Factura";
		
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Estados Cuentas Por Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarEstadosCuentasPorFactura.setToolTipText("Acciones");
        this.jPanelAccionesCobrarEstadosCuentasPorFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura=new ReporteDinamicoJInternalFrame(CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarEstadosCuentasPorFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura=new ImportacionJInternalFrame(CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarEstadosCuentasPorFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.setText("Orden");
		this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura,false,this);
			
			//this.cargarOrderByCobrarEstadosCuentasPorFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura,true,this);
			
			//this.cargarOrderByCobrarEstadosCuentasPorFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(400,50));//2030
		this.jTableDatosCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(400,50));//2030
		this.jTableDatosCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(400,50));//2030
		
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarEstadosCuentasPorFactura.setText("Nuevo");
		this.jButtonDuplicarCobrarEstadosCuentasPorFactura.setText("Duplicar");
		this.jButtonCopiarCobrarEstadosCuentasPorFactura.setText("Copiar");
		this.jButtonVerFormCobrarEstadosCuentasPorFactura.setText("Ver");
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setText("Guardar");
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarEstadosCuentasPorFactura,"nuevo_button","Nuevo",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarEstadosCuentasPorFactura,"duplicar_button","Duplicar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarEstadosCuentasPorFactura,"copiar_button","Copiar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarEstadosCuentasPorFactura,"ver_form","Ver",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura,"nuevorelaciones_button","Nuevo Rel",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura,"guardarcambiostabla_button","Guardar",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarEstadosCuentasPorFactura,"cerrar_button","Salir",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.setToolTipText("Nuevo"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarEstadosCuentasPorFactura.setToolTipText("Duplicar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarEstadosCuentasPorFactura.setToolTipText("Copiar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarEstadosCuentasPorFactura.setToolTipText("Ver"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.setToolTipText("Nuevo Rel"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.setToolTipText("Guardar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.setToolTipText("Salir"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonNuevoCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarEstadosCuentasPorFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonDuplicarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarEstadosCuentasPorFactura"));
		
		//COPIAR
		sMapKey = "CopiarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonCopiarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarEstadosCuentasPorFactura"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonVerFormCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarEstadosCuentasPorFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarEstadosCuentasPorFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonModificarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarEstadosCuentasPorFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonCerrarCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarEstadosCuentasPorFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarEstadosCuentasPorFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarEstadosCuentasPorFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarEstadosCuentasPorFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarEstadosCuentasPorFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarEstadosCuentasPorFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarEstadosCuentasPorFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setName("jPanelParametrosReportesCobrarEstadosCuentasPorFactura"); 
		
		this.jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura.setName("jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.setText("Buscar");
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.setToolTipText("Buscar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura.setText("Procesar");
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura.setToolTipText("Procesar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setText("Accion");
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarEstadosCuentasPorFactura = new JLabelMe();
		
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setText("Acciones");		
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarEstadosCuentasPorFactura = new JButtonMe();
		//this.jButtonAnterioresCobrarEstadosCuentasPorFactura.setText("<<");
        this.jButtonAnterioresCobrarEstadosCuentasPorFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarEstadosCuentasPorFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarEstadosCuentasPorFactura = new JButtonMe();
		//this.jButtonSiguientesCobrarEstadosCuentasPorFactura.setText(">>");
        this.jButtonSiguientesCobrarEstadosCuentasPorFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarEstadosCuentasPorFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura,"nuevoguardarcambios_button","Nue",this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarEstadosCuentasPorFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarEstadosCuentasPorFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonSiguientesCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarEstadosCuentasPorFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarEstadosCuentasPorFactura";
		inputMap = this.jButtonAnterioresCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarEstadosCuentasPorFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarEstadosCuentasPorFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(this.getWidth(),CobrarEstadosCuentasPorFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarEstadosCuentasPorFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(this.getWidth(),CobrarEstadosCuentasPorFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarEstadosCuentasPorFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(this.getWidth(),CobrarEstadosCuentasPorFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarEstadosCuentasPorFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarEstadosCuentasPorFactura = new GridBagLayout();

			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutPaginacionCobrarEstadosCuentasPorFactura);						
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonAnterioresCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
					
						
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
			
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonNuevoGuardarCambiosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
						
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonSiguientesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonNuevoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
						
			
			
			if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonGuardarCambiosTablaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			}
			
			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonDuplicarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonCopiarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonVerFormCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarEstadosCuentasPorFactura.add(this.jButtonCerrarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarEstadosCuentasPorFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarEstadosCuentasPorFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarEstadosCuentasPorFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarEstadosCuentasPorFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarEstadosCuentasPorFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarEstadosCuentasPorFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.setLayout(gridaBagParametrosReportesCobrarEstadosCuentasPorFactura);
			this.jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura.setLayout(gridaBagParametrosReportesAccionesCobrarEstadosCuentasPorFactura);
			
			
			this.jPanelParametrosAuxiliar1CobrarEstadosCuentasPorFactura.setLayout(gridaBagParametrosAuxiliar1CobrarEstadosCuentasPorFactura);
			this.jPanelParametrosAuxiliar2CobrarEstadosCuentasPorFactura.setLayout(gridaBagParametrosAuxiliar2CobrarEstadosCuentasPorFactura);
			this.jPanelParametrosAuxiliar3CobrarEstadosCuentasPorFactura.setLayout(gridaBagParametrosAuxiliar3CobrarEstadosCuentasPorFactura);
			this.jPanelParametrosAuxiliar4CobrarEstadosCuentasPorFactura.setLayout(gridaBagParametrosAuxiliar4CobrarEstadosCuentasPorFactura);
			//this.jPanelParametrosAuxiliar5CobrarEstadosCuentasPorFactura.setLayout(gridaBagParametrosAuxiliar2CobrarEstadosCuentasPorFactura);			
			
			
			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jButtonRecargarInformacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposPaginacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarEstadosCuentasPorFactura.add(this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposArchivosReportesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jPanelParametrosAuxiliar1CobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);																		
			
			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposGraficosReportesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jPanelParametrosAuxiliar4CobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposReportesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jCheckBoxGenerarReporteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jPanelParametrosAuxiliar2CobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jLabelAccionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposSeleccionarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
			
			
			/*
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarEstadosCuentasPorFactura.add(this.jCheckBoxSeleccionarTodosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);															
				
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarEstadosCuentasPorFactura.add(this.jCheckBoxSeleccionadosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);															
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarEstadosCuentasPorFactura.add(this.jCheckBoxConGraficoReporteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jPanelParametrosAuxiliar3CobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposAccionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarEstadosCuentasPorFactura = new GridBagLayout();

			this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutDatosCobrarEstadosCuentasPorFactura);
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
			
			this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.add(this.jTableDatosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setViewportView(this.jTableDatosCobrarEstadosCuentasPorFactura);
		this.jTableDatosCobrarEstadosCuentasPorFactura.setFillsViewportHeight(true);
		this.jTableDatosCobrarEstadosCuentasPorFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarEstadosCuentasPorFactura= new GridBagLayout();
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutAccionesCobrarEstadosCuentasPorFactura);
		
		
		/*	
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
			
		this.jPanelAccionesCobrarEstadosCuentasPorFactura.add(this.jButtonNuevoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
		jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.add(jLabelfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
		jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_emision_desdeBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);


		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
		jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.add(jLabelfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
		jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.add(jDateChooserfecha_emision_hastaBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 2;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =1;
		jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura.add(jButtonBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaCobrarEstadosCuentasPorFacturaCobrarEstadosCuentasPorFactura);
		jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
		jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.add(jLabelfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 0;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
		jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.add(jDateChooserfecha_vence_desdeBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);


		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
		jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.add(jLabelfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 1;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 1;
		jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.add(jDateChooserfecha_vence_hastaBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = 2;
		gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =1;
		jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura.add(jButtonBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura, gridBagConstraintsCobrarEstadosCuentasPorFactura);

		jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.addTab("2.-Por Fecha Vence Desde Por Fecha Vence Hasta ", jPanelBusquedaCobrarEstadosCuentasPorFactura2CobrarEstadosCuentasPorFactura);
		jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarEstadosCuentasPorFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarEstadosCuentasPorFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();						
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;		
			//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;		
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;		
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);								
		
		
		/*
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		*/		
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =0;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
				
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarEstadosCuentasPorFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarEstadosCuentasPorFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarEstadosCuentasPorFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutBusquedasParametrosCobrarEstadosCuentasPorFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
			
			
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
			
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarEstadosCuentasPorFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarEstadosCuentasPorFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarEstadosCuentasPorFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setName("jPanelReporteDinamicoCobrarEstadosCuentasPorFactura"); 
		
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutReporteDinamicoCobrarEstadosCuentasPorFactura);
		
		
		this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Estados Cuentas Por Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarEstadosCuentasPorFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelColumnasSelectReporteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura=new JScrollPane(this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura);
			
			this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarEstadosCuentasPorFactura=new JScrollPane(this.jListRelacionesSelectReporteCobrarEstadosCuentasPorFactura);
			
			this.jScrollRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarEstadosCuentasPorFactura.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelConGraficoDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jCheckBoxConGraficoDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelColumnaCategoriaValorCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jComboBoxColumnaCategoriaValorCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelColumnasValoresGraficoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarEstadosCuentasPorFactura=new JScrollPane(this.jListColumnasValoresGraficoCobrarEstadosCuentasPorFactura);
			
			this.jScrollColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jListColumnasSelectReporteCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jScrollColumnasValoresGraficoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarEstadosCuentasPorFactura.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura.setToolTipText("Generar EXCEL"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jButtonGenerarExcelReporteDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposReportesDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarEstadosCuentasPorFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jLabelTiposArchivoReporteDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura.setToolTipText("Generar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jButtonGenerarReporteDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura.setToolTipText("Cancelar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarEstadosCuentasPorFactura.add(this.jButtonCerrarReporteDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarEstadosCuentasPorFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura= new JScrollPane(jPanelReporteDinamicoCobrarEstadosCuentasPorFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Estados Cuentas Por Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarEstadosCuentasPorFactura);
		this.jInternalFrameReporteDinamicoCobrarEstadosCuentasPorFactura.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarEstadosCuentasPorFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarEstadosCuentasPorFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.setName("jPanelImportacionCobrarEstadosCuentasPorFactura"); 
		
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutImportacionCobrarEstadosCuentasPorFactura);
		
		
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarEstadosCuentasPorFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setResizable(true);
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setClosable(true);
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setResizable(true);
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setClosable(true);
	    this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Estados Cuentas Por Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelArchivoImportacionCobrarEstadosCuentasPorFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.add(this.jLabelArchivoImportacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarEstadosCuentasPorFactura = new JFileChooser();		
		this.jFileChooserImportacionCobrarEstadosCuentasPorFactura.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonAbrirImportacionCobrarEstadosCuentasPorFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarEstadosCuentasPorFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarEstadosCuentasPorFactura.setToolTipText("Generar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.add(this.jButtonAbrirImportacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarEstadosCuentasPorFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarEstadosCuentasPorFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.add(this.jLabelPathArchivoImportacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarEstadosCuentasPorFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.add(this.jTextFieldPathArchivoImportacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonGenerarImportacionCobrarEstadosCuentasPorFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarEstadosCuentasPorFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarEstadosCuentasPorFactura.setToolTipText("Generar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.add(this.jButtonGenerarImportacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarEstadosCuentasPorFactura = new JButtonMe();
		this.jButtonCerrarImportacionCobrarEstadosCuentasPorFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarEstadosCuentasPorFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarEstadosCuentasPorFactura.setToolTipText("Cancelar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarEstadosCuentasPorFactura.add(this.jButtonCerrarImportacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarEstadosCuentasPorFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarEstadosCuentasPorFactura= new JScrollPane(jPanelImportacionCobrarEstadosCuentasPorFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarEstadosCuentasPorFactura);
		this.jInternalFrameImportacionCobrarEstadosCuentasPorFactura.getContentPane().add(this.jScrollPanelImportacionCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarEstadosCuentasPorFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura = new JButtonMe();
			this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.setText("Orden");
			this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarEstadosCuentasPorFactura";
			inputMap = this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarEstadosCuentasPorFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarEstadosCuentasPorFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarEstadosCuentasPorFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.setName("jPanelOrderByCobrarEstadosCuentasPorFactura"); 
			
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.setLayout(gridaBagLayoutOrderByCobrarEstadosCuentasPorFactura);
			
			
			this.jTableDatosCobrarEstadosCuentasPorFacturaOrderBy = new JTableMe();        
			this.jTableDatosCobrarEstadosCuentasPorFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarEstadosCuentasPorFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarEstadosCuentasPorFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarEstadosCuentasPorFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarEstadosCuentasPorFacturaOrderBy.setViewportView(this.jTableDatosCobrarEstadosCuentasPorFacturaOrderBy);
			this.jTableDatosCobrarEstadosCuentasPorFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarEstadosCuentasPorFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarEstadosCuentasPorFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setTitle("Orden");
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setResizable(true);
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setClosable(true);
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Estados Cuentas Por Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarEstadosCuentasPorFactura.ipady =150;
				
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.add(jScrollPanelDatosCobrarEstadosCuentasPorFacturaOrderBy, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);//this.jTableDatosCobrarEstadosCuentasPorFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarEstadosCuentasPorFactura = new JButtonMe();
			this.jButtonCerrarOrderByCobrarEstadosCuentasPorFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarEstadosCuentasPorFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarEstadosCuentasPorFactura.setToolTipText("Cancelar"+" "+CobrarEstadosCuentasPorFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarEstadosCuentasPorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarEstadosCuentasPorFactura.add(this.jButtonCerrarOrderByCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarEstadosCuentasPorFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura= new JScrollPane(jPanelOrderByCobrarEstadosCuentasPorFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura = new GridBagConstraints();
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarEstadosCuentasPorFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarEstadosCuentasPorFactura);
			
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getContentPane().add(this.jScrollPanelOrderByCobrarEstadosCuentasPorFactura, this.gridBagConstraintsCobrarEstadosCuentasPorFactura);			
		
		} else {
			this.jButtonAbrirOrderByCobrarEstadosCuentasPorFactura = new JButtonMe();
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
		int iWidthTableCalculado=0;//4430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarestadoscuentasporfacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarEstadosCuentasPorFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarEstadosCuentasPorFactura.getRowHeight();//CobrarEstadosCuentasPorFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura.isSelected()) {
					iHeightTable=CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarEstadosCuentasPorFactura.isSelected()) {
					iHeightTable=CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarEstadosCuentasPorFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura!=null && this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarestadoscuentasporfacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarEstadosCuentasPorFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarEstadosCuentasPorFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarestadoscuentasporfacturaLogic.getCobrarEstadosCuentasPorFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarestadoscuentasporfacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarEstadosCuentasPorFactura> TraerCobrarEstadosCuentasPorFacturaBeans(List<CobrarEstadosCuentasPorFactura> cobrarestadoscuentasporfacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarEstadosCuentasPorFactura cobrarestadoscuentasporfactura:cobrarestadoscuentasporfacturas) {
					
				if(!(CobrarEstadosCuentasPorFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarEstadosCuentasPorFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarestadoscuentasporfactura.setsDetalleGeneralEntityReporte(CobrarEstadosCuentasPorFacturaConstantesFunciones.getCobrarEstadosCuentasPorFacturaDescripcion(cobrarestadoscuentasporfactura));
										
						
					
						
					
				} else  {
							
					//cobrarestadoscuentasporfactura.setsDetalleGeneralEntityReporte(cobrarestadoscuentasporfactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarestadoscuentasporfacturabeans.add(cobrarestadoscuentasporfacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarestadoscuentasporfacturas;
    }
	//PARA REPORTES FIN
}
