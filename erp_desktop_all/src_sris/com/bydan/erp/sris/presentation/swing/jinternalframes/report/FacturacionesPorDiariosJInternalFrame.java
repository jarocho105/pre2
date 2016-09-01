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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
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
import com.bydan.erp.sris.util.report.FacturacionesPorDiariosConstantesFunciones;

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
public class FacturacionesPorDiariosJInternalFrame extends FacturacionesPorDiariosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturacionesPorDiarios;
	
	protected JMenuBar jmenuBarFacturacionesPorDiarios;
	
	protected JMenu jmenuFacturacionesPorDiarios;
	protected JMenu jmenuDatosFacturacionesPorDiarios;
	protected JMenu jmenuArchivoFacturacionesPorDiarios;
	protected JMenu jmenuAccionesFacturacionesPorDiarios;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturacionesPorDiarios;	
	protected GridBagConstraints gridBagConstraintsFacturacionesPorDiarios;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturacionesPorDiariosDetalleFormJInternalFrame jInternalFrameDetalleFormFacturacionesPorDiarios;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturacionesPorDiarios;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturacionesPorDiarios;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public FacturacionesPorDiariosSessionBean facturacionespordiariosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FacturacionesPorDiarios> facturacionespordiarioss;		
	public List<FacturacionesPorDiarios> facturacionespordiariossEliminados;	
	public List<FacturacionesPorDiarios> facturacionespordiariossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturacionesPorDiarios;		
	protected JButton jButtonAbrirOrderByFacturacionesPorDiarios;
	
	
	//protected JPanel jPanelOrderByFacturacionesPorDiarios;
	//public JScrollPane jScrollPanelOrderByFacturacionesPorDiarios;	
	//protected JButton jButtonCerrarOrderByFacturacionesPorDiarios;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturacionesPorDiariosLogic facturacionespordiariosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturacionesPorDiarios;
	public JScrollPane jScrollPanelDatosEdicionFacturacionesPorDiarios;
	public JScrollPane jScrollPanelDatosGeneralFacturacionesPorDiarios;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturacionesPorDiariosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturacionesPorDiarios;
	//public JScrollPane jScrollPanelImportacionFacturacionesPorDiarios;
	
	
	
	protected JPanel jPanelAccionesFacturacionesPorDiarios;
	
    protected JPanel jPanelPaginacionFacturacionesPorDiarios;
    protected JPanel jPanelParametrosReportesFacturacionesPorDiarios;
	protected JPanel jPanelParametrosReportesAccionesFacturacionesPorDiarios;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FacturacionesPorDiarios;
	protected JPanel jPanelParametrosAuxiliar2FacturacionesPorDiarios;
	protected JPanel jPanelParametrosAuxiliar3FacturacionesPorDiarios;
	protected JPanel jPanelParametrosAuxiliar4FacturacionesPorDiarios;
	//protected JPanel jPanelParametrosAuxiliar5FacturacionesPorDiarios;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturacionesPorDiarios;
	//protected JPanel jPanelImportacionFacturacionesPorDiarios;
	
	
	public JTable jTableDatosFacturacionesPorDiarios;
	
	
	
	//public JTable jTableDatosFacturacionesPorDiariosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturacionesPorDiarios;
	protected JButton jButtonDuplicarFacturacionesPorDiarios;
	protected JButton jButtonCopiarFacturacionesPorDiarios;
	protected JButton jButtonVerFormFacturacionesPorDiarios;
	protected JButton jButtonNuevoRelacionesFacturacionesPorDiarios;
	protected JButton jButtonModificarFacturacionesPorDiarios;
	
    protected JButton jButtonGuardarCambiosTablaFacturacionesPorDiarios;
	protected JButton jButtonCerrarFacturacionesPorDiarios;
	
	
	protected JButton jButtonRecargarInformacionFacturacionesPorDiarios;
	protected JButton jButtonProcesarInformacionFacturacionesPorDiarios;
	
	
	protected JButton jButtonAnterioresFacturacionesPorDiarios;
	protected JButton jButtonSiguientesFacturacionesPorDiarios;
	protected JButton jButtonNuevoGuardarCambiosFacturacionesPorDiarios;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturacionesPorDiarios;
	//protected JButton jButtonCerrarReporteDinamicoFacturacionesPorDiarios;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturacionesPorDiarios;
	//protected JButton jButtonGenerarImportacionFacturacionesPorDiarios;
	//protected JButton jButtonCerrarImportacionFacturacionesPorDiarios;
	//protected JFileChooser jFileChooserImportacionFacturacionesPorDiarios;
	//protected File fileImportacionFacturacionesPorDiarios;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturacionesPorDiarios;
	protected JButton jButtonDuplicarToolBarFacturacionesPorDiarios;
	protected JButton jButtonNuevoRelacionesToolBarFacturacionesPorDiarios;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturacionesPorDiarios;
	protected JButton jButtonCopiarToolBarFacturacionesPorDiarios;
	protected JButton jButtonVerFormToolBarFacturacionesPorDiarios;
	public JButton jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturacionesPorDiarios;
	protected JButton jButtonCerrarToolBarFacturacionesPorDiarios;
	
	protected JButton jButtonRecargarInformacionToolBarFacturacionesPorDiarios;
	protected JButton jButtonProcesarInformacionToolBarFacturacionesPorDiarios;
	protected JButton jButtonAnterioresToolBarFacturacionesPorDiarios;
	protected JButton jButtonSiguientesToolBarFacturacionesPorDiarios;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturacionesPorDiarios;
	protected JButton jButtonAbrirOrderByToolBarFacturacionesPorDiarios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturacionesPorDiarios;
	protected JMenuItem jMenuItemDuplicarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemNuevoRelacionesFacturacionesPorDiarios;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturacionesPorDiarios;
	protected JMenuItem jMenuItemCopiarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemVerFormFacturacionesPorDiarios;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturacionesPorDiarios;
	protected JMenuItem jMenuItemCerrarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemDetalleCerrarFacturacionesPorDiarios;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturacionesPorDiarios;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturacionesPorDiarios;
	protected JMenuItem jMenuItemProcesarInformacionFacturacionesPorDiarios;
	protected JMenuItem jMenuItemAnterioresFacturacionesPorDiarios;
	protected JMenuItem jMenuItemSiguientesFacturacionesPorDiarios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios;
	protected JMenuItem jMenuItemAbrirOrderByFacturacionesPorDiarios;
	protected JMenuItem jMenuItemMostrarOcultarFacturacionesPorDiarios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturacionesPorDiarios;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturacionesPorDiarios;
	protected JCheckBox jCheckBoxSeleccionadosFacturacionesPorDiarios;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios;
	protected JCheckBox jCheckBoxConGraficoReporteFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturacionesPorDiarios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturacionesPorDiarios;
	protected JTextField jTextFieldValorCampoGeneralFacturacionesPorDiarios;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturacionesPorDiarios;
	//public JList<Reporte> jListColumnasSelectReporteFacturacionesPorDiarios;
	//public JScrollPane jScrollColumnasSelectReporteFacturacionesPorDiarios;
	
	//public JLabel jLabelRelacionesSelectReporteFacturacionesPorDiarios;
	//public JList<Reporte> jListRelacionesSelectReporteFacturacionesPorDiarios;
	//public JScrollPane jScrollRelacionesSelectReporteFacturacionesPorDiarios;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturacionesPorDiarios;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturacionesPorDiarios;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturacionesPorDiarios;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturacionesPorDiarios;
	
		
	//public JLabel jLabelArchivoImportacionFacturacionesPorDiarios;	
	//public JLabel jLabelPathArchivoImportacionFacturacionesPorDiarios;
	//protected JTextField jTextFieldPathArchivoImportacionFacturacionesPorDiarios;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturacionesPorDiarios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios;
	
	//public JLabel jLabelColumnaCategoriaValorFacturacionesPorDiarios;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturacionesPorDiarios;
	
	//public JLabel jLabelColumnasValoresGraficoFacturacionesPorDiarios;
	//public JList<Reporte> jListColumnasValoresGraficoFacturacionesPorDiarios;
	//public JScrollPane jScrollColumnasValoresGraficoFacturacionesPorDiarios;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturacionesPorDiarios;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturacionesPorDiarios;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFacturacionesPorDiarios;
	public JPanel jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	public JButton jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	
	public JPanel jPanelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	public JLabel jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	public JButton jButtonid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiariosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiariosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	public JLabel jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	public JButton jButtonfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiariosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	public JLabel jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios;
	public JButton jButtonfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiariosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturacionesPorDiariosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionesPorDiariosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionesPorDiariosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionesPorDiariosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturacionesPorDiarios)	{
		this.jButtonRecargarInformacionFacturacionesPorDiarios = jButtonRecargarInformacionFacturacionesPorDiarios;
	}
	
	public JButton getjButtonProcesarInformacionFacturacionesPorDiarios() {
		return this.jButtonProcesarInformacionFacturacionesPorDiarios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturacionesPorDiarios)	{
		this.jButtonProcesarInformacionFacturacionesPorDiarios = jButtonProcesarInformacionFacturacionesPorDiarios;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturacionesPorDiarios() {
		return this.jButtonRecargarInformacionFacturacionesPorDiarios;
	}
	
	
	public List<FacturacionesPorDiarios> getfacturacionespordiarioss() {
		return this.facturacionespordiarioss;
	}

	public void setfacturacionespordiarioss(List<FacturacionesPorDiarios> facturacionespordiarioss) {
		this.facturacionespordiarioss = facturacionespordiarioss;
	}
	
	public List<FacturacionesPorDiarios> getfacturacionespordiariossAux() {
		return this.facturacionespordiariossAux;
	}

	public void setfacturacionespordiariossAux(List<FacturacionesPorDiarios> facturacionespordiariossAux) {
		this.facturacionespordiariossAux = facturacionespordiariossAux;
	}
	
	public List<FacturacionesPorDiarios> getfacturacionespordiariossEliminados() {
		return this.facturacionespordiariossEliminados;
	}

	public void setFacturacionesPorDiariossEliminados(List<FacturacionesPorDiarios> facturacionespordiariossEliminados) {
		this.facturacionespordiariossEliminados = facturacionespordiariossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturacionesPorDiarios() {
		return jComboBoxTiposSeleccionarFacturacionesPorDiarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturacionesPorDiarios(
			JComboBox jComboBoxTiposSeleccionarFacturacionesPorDiarios) {
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios = jComboBoxTiposSeleccionarFacturacionesPorDiarios;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturacionesPorDiarios() {
		return jTextFieldValorCampoGeneralFacturacionesPorDiarios;
	}

	public void setjTextFieldValorCampoGeneralFacturacionesPorDiarios(
			JTextField jTextFieldValorCampoGeneralFacturacionesPorDiarios) {
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios = jTextFieldValorCampoGeneralFacturacionesPorDiarios;
	}

	public void setBorderResaltarValorCampoGeneralFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturacionesPorDiarios() {
		return this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios;
	}

	public void setjCheckBoxSeleccionarTodosFacturacionesPorDiarios(
			JCheckBox jCheckBoxSeleccionarTodosFacturacionesPorDiarios) {
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios = jCheckBoxSeleccionarTodosFacturacionesPorDiarios;
	}

	public void setBorderResaltarSeleccionarTodosFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturacionesPorDiarios() {
		return this.jCheckBoxSeleccionadosFacturacionesPorDiarios;
	}

	public void setjCheckBoxSeleccionadosFacturacionesPorDiarios(
			JCheckBox jCheckBoxSeleccionadosFacturacionesPorDiarios) {
		this.jCheckBoxSeleccionadosFacturacionesPorDiarios = jCheckBoxSeleccionadosFacturacionesPorDiarios;
	}
	
	public void setBorderResaltarSeleccionadosFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturacionesPorDiarios() {
		return this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturacionesPorDiarios(
			JComboBox jComboBoxTiposArchivosReportesFacturacionesPorDiarios) {
		this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios = jComboBoxTiposArchivosReportesFacturacionesPorDiarios;
	}

	public void setBorderResaltarTiposArchivosReportesFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturacionesPorDiarios() {
		return this.jComboBoxTiposReportesFacturacionesPorDiarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturacionesPorDiarios(
			JComboBox jComboBoxTiposReportesFacturacionesPorDiarios) {
		this.jComboBoxTiposReportesFacturacionesPorDiarios = jComboBoxTiposReportesFacturacionesPorDiarios;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturacionesPorDiarios() {
	//	return jComboBoxTiposReportesDinamicoFacturacionesPorDiarios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturacionesPorDiarios(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturacionesPorDiarios) {
	//	this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios = jComboBoxTiposReportesDinamicoFacturacionesPorDiarios;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios = jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios;
	//}
	
	public void setBorderResaltarTiposReportesFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturacionesPorDiarios() {
		return this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturacionesPorDiarios(
			JComboBox jComboBoxTiposGraficosReportesFacturacionesPorDiarios) {
		this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios = jComboBoxTiposGraficosReportesFacturacionesPorDiarios;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturacionesPorDiarios() {
		return this.jComboBoxTiposPaginacionFacturacionesPorDiarios;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturacionesPorDiarios(
			JComboBox jComboBoxTiposPaginacionFacturacionesPorDiarios) {
		this.jComboBoxTiposPaginacionFacturacionesPorDiarios = jComboBoxTiposPaginacionFacturacionesPorDiarios;
	}
	
	public void setBorderResaltarTiposPaginacionFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturacionesPorDiarios() {
		return this.jComboBoxTiposRelacionesFacturacionesPorDiarios;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturacionesPorDiarios() {
		return this.jComboBoxTiposAccionesFacturacionesPorDiarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturacionesPorDiarios(
			JComboBox jComboBoxTiposRelacionesFacturacionesPorDiarios) {
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios = jComboBoxTiposRelacionesFacturacionesPorDiarios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturacionesPorDiarios(
			JComboBox jComboBoxTiposAccionesFacturacionesPorDiarios) {
		this.jComboBoxTiposAccionesFacturacionesPorDiarios = jComboBoxTiposAccionesFacturacionesPorDiarios;
	}
	
	public void setBorderResaltarTiposRelacionesFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturacionesPorDiarios() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturacionesPorDiarios .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturacionesPorDiarios() {
	//	return jCheckBoxConGraficoDinamicoFacturacionesPorDiarios;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturacionesPorDiarios(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturacionesPorDiarios) {
	//	this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios = jCheckBoxConGraficoDinamicoFacturacionesPorDiarios;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturacionesPorDiarios() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturacionesPorDiarios.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios .setBorder(borderResaltar);		
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
		this.facturacionespordiariosSessionBean=new FacturacionesPorDiariosSessionBean();
		
		this.facturacionespordiariosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturacionespordiariosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturacionespordiariosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturacionesPorDiariosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturacionesPorDiariosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturacionesPorDiariosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturacionesPorDiariosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturacionesPorDiariosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturaciones Por Diarios MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturacionesPorDiariosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FacturacionesPorDiarios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturacionesPorDiarios= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"nuevo","nuevo","Nuevo"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"duplicar","duplicar","Duplicar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"copiar","copiar","Copiar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"ver_form","ver_form","Ver"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"recargar","recargar","Buscar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturacionesPorDiarios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturacionesPorDiarios,this.jTtoolBarFacturacionesPorDiarios,
							"cerrar","cerrar","Salir"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturacionesPorDiarios=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturacionesPorDiarios;
			
				this.jButtonProcesarInformacionToolBarFacturacionesPorDiarios=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturacionesPorDiarios;
				
		//protected JButton jButtonModificarToolBarFacturacionesPorDiarios;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturacionesPorDiarios=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturacionesPorDiarios=new JMenuMe("General");
		this.jmenuArchivoFacturacionesPorDiarios=new JMenuMe("Archivo");
		this.jmenuAccionesFacturacionesPorDiarios=new JMenuMe("Acciones");
		this.jmenuDatosFacturacionesPorDiarios=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturacionesPorDiarios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturacionesPorDiarios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturacionesPorDiarios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturacionesPorDiarios= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturacionesPorDiarios.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturacionesPorDiarios,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturacionesPorDiarios= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturacionesPorDiarios.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturacionesPorDiarios,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturacionesPorDiarios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturacionesPorDiarios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturacionesPorDiarios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturacionesPorDiarios= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturacionesPorDiarios.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturacionesPorDiarios,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturacionesPorDiarios= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturacionesPorDiarios.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturacionesPorDiarios,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturacionesPorDiarios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturacionesPorDiarios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturacionesPorDiarios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturacionesPorDiarios= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturacionesPorDiarios.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturacionesPorDiarios,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturacionesPorDiarios= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturacionesPorDiarios.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturacionesPorDiarios,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturacionesPorDiarios= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturacionesPorDiarios.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturacionesPorDiarios,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturacionesPorDiarios= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturacionesPorDiarios.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturacionesPorDiarios,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturacionesPorDiarios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturacionesPorDiarios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturacionesPorDiarios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturacionesPorDiarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturacionesPorDiarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturacionesPorDiarios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturacionesPorDiarios.add(this.jMenuItemCerrarFacturacionesPorDiarios);
			
			this.jmenuAccionesFacturacionesPorDiarios.add(this.jMenuItemNuevoFacturacionesPorDiarios);
			this.jmenuAccionesFacturacionesPorDiarios.add(this.jMenuItemNuevoGuardarCambiosFacturacionesPorDiarios);
			this.jmenuAccionesFacturacionesPorDiarios.add(this.jMenuItemNuevoRelacionesFacturacionesPorDiarios);
			this.jmenuAccionesFacturacionesPorDiarios.add(this.jMenuItemGuardarCambiosTablaFacturacionesPorDiarios);		
			this.jmenuAccionesFacturacionesPorDiarios.add(this.jMenuItemDuplicarFacturacionesPorDiarios);		
			this.jmenuAccionesFacturacionesPorDiarios.add(this.jMenuItemCopiarFacturacionesPorDiarios);		
			this.jmenuAccionesFacturacionesPorDiarios.add(this.jMenuItemVerFormFacturacionesPorDiarios);		
			
			this.jmenuDatosFacturacionesPorDiarios.add(this.jMenuItemRecargarInformacionFacturacionesPorDiarios);				
			this.jmenuDatosFacturacionesPorDiarios.add(this.jMenuItemAnterioresFacturacionesPorDiarios);				
			this.jmenuDatosFacturacionesPorDiarios.add(this.jMenuItemSiguientesFacturacionesPorDiarios);				
			this.jmenuDatosFacturacionesPorDiarios.add(this.jMenuItemAbrirOrderByFacturacionesPorDiarios);				
			this.jmenuDatosFacturacionesPorDiarios.add(this.jMenuItemMostrarOcultarFacturacionesPorDiarios);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturacionesPorDiarios.add(this.jMenuItemGuardarCambiosFacturacionesPorDiarios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturacionesPorDiarios.add(this.jmenuArchivoFacturacionesPorDiarios);		
			this.jmenuBarFacturacionesPorDiarios.add(this.jmenuAccionesFacturacionesPorDiarios);		
			this.jmenuBarFacturacionesPorDiarios.add(this.jmenuDatosFacturacionesPorDiarios);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturacionesPorDiarios);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturacionesPorDiarios() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setToolTipText("Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios= new JButtonMe();
		this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setText("Buscar");
		this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setToolTipText("Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios,"buscar_button","Buscar Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios = new JLabelMe();
		jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setText("Transaccion :");
		jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasFacturacionesPorDiarios=new JTabbedPane();


		this.jTabbedPaneBusquedasFacturacionesPorDiarios.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasFacturacionesPorDiarios.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasFacturacionesPorDiarios.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFacturacionesPorDiarios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFacturacionesPorDiarios = new FacturacionesPorDiariosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Facturaciones Por Diarios DATOS");
			this.jInternalFrameDetalleFormFacturacionesPorDiarios = new FacturacionesPorDiariosDetalleFormJInternalFrame(jDesktopPane,this.facturacionespordiariosSessionBean.getConGuardarRelaciones(),this.facturacionespordiariosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturacionesPorDiarios = null;//new FacturacionesPorDiariosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturacionesPorDiarios= new GridBagLayout();
		
		
		this.jTableDatosFacturacionesPorDiarios = new JTableMe();      
		
		String sToolTipFacturacionesPorDiarios="";
		sToolTipFacturacionesPorDiarios=FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturacionesPorDiarios+="(Sris.FacturacionesPorDiarios)";
		}
		
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturacionesPorDiarios+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturacionesPorDiarios.setToolTipText(sToolTipFacturacionesPorDiarios);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturacionesPorDiarios);
		this.jTableDatosFacturacionesPorDiarios.setAutoCreateRowSorter(true);
		this.jTableDatosFacturacionesPorDiarios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturacionesPorDiarios.setRowSelectionAllowed(true);
		this.jTableDatosFacturacionesPorDiarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturacionesPorDiarios,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturacionesPorDiarios = new JButtonMe();
		this.jButtonDuplicarFacturacionesPorDiarios = new JButtonMe();
		this.jButtonCopiarFacturacionesPorDiarios = new JButtonMe();
		this.jButtonVerFormFacturacionesPorDiarios = new JButtonMe();
		this.jButtonNuevoRelacionesFacturacionesPorDiarios = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios = new JButtonMe();
		this.jButtonCerrarFacturacionesPorDiarios = new JButtonMe();
		
		this.jScrollPanelDatosFacturacionesPorDiarios = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturacionesPorDiarios = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Facturaciones Por Diarios";
		
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones Por Diarioses" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturacionesPorDiarios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturacionesPorDiarios.setToolTipText("Acciones");
        this.jPanelAccionesFacturacionesPorDiarios.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturacionesPorDiarios=new ReporteDinamicoJInternalFrame(FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturacionesPorDiarios();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturacionesPorDiarios=new ImportacionJInternalFrame(FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturacionesPorDiarios();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturacionesPorDiarios = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturacionesPorDiarios.setText("Orden");
		this.jButtonAbrirOrderByFacturacionesPorDiarios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturacionesPorDiarios,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturacionesPorDiarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacionesPorDiarios,false,this);
			
			//this.cargarOrderByFacturacionesPorDiarios(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturacionesPorDiarios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacionesPorDiarios,true,this);
			
			//this.cargarOrderByFacturacionesPorDiarios(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturacionesPorDiarios.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosFacturacionesPorDiarios.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosFacturacionesPorDiarios.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosFacturacionesPorDiarios.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturacionesPorDiarios.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturacionesPorDiarios.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturacionesPorDiarios.setText("Nuevo");
		this.jButtonDuplicarFacturacionesPorDiarios.setText("Duplicar");
		this.jButtonCopiarFacturacionesPorDiarios.setText("Copiar");
		this.jButtonVerFormFacturacionesPorDiarios.setText("Ver");
		this.jButtonNuevoRelacionesFacturacionesPorDiarios.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.setText("Guardar");
		this.jButtonCerrarFacturacionesPorDiarios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturacionesPorDiarios,"nuevo_button","Nuevo",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturacionesPorDiarios,"duplicar_button","Duplicar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturacionesPorDiarios,"copiar_button","Copiar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturacionesPorDiarios,"ver_form","Ver",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturacionesPorDiarios,"nuevorelaciones_button","Nuevo Rel",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturacionesPorDiarios,"guardarcambiostabla_button","Guardar",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturacionesPorDiarios,"cerrar_button","Salir",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturacionesPorDiarios.setToolTipText("Nuevo"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturacionesPorDiarios.setToolTipText("Duplicar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturacionesPorDiarios.setToolTipText("Copiar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturacionesPorDiarios.setToolTipText("Ver"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturacionesPorDiarios.setToolTipText("Nuevo Rel"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.setToolTipText("Guardar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturacionesPorDiarios.setToolTipText("Salir"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturacionesPorDiarios";
		inputMap = this.jButtonNuevoFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturacionesPorDiarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturacionesPorDiarios"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturacionesPorDiarios";
		inputMap = this.jButtonDuplicarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturacionesPorDiarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturacionesPorDiarios"));
		
		//COPIAR
		sMapKey = "CopiarFacturacionesPorDiarios";
		inputMap = this.jButtonCopiarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturacionesPorDiarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturacionesPorDiarios"));
		
		//VEr FORM
		sMapKey = "VerFormFacturacionesPorDiarios";
		inputMap = this.jButtonVerFormFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturacionesPorDiarios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturacionesPorDiarios"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturacionesPorDiarios";
		inputMap = this.jButtonNuevoRelacionesFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturacionesPorDiarios"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturacionesPorDiarios";
		inputMap = this.jButtonModificarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturacionesPorDiarios"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturacionesPorDiarios";
		inputMap = this.jButtonCerrarFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturacionesPorDiarios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturacionesPorDiarios";
		inputMap = this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturacionesPorDiarios"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FacturacionesPorDiarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FacturacionesPorDiarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FacturacionesPorDiarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FacturacionesPorDiarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FacturacionesPorDiarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturacionesPorDiarios.setName("jPanelParametrosReportesFacturacionesPorDiarios"); 
		
		this.jPanelParametrosReportesAccionesFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturacionesPorDiarios.setName("jPanelParametrosReportesAccionesFacturacionesPorDiarios"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturacionesPorDiarios = new JButtonMe();
		this.jButtonRecargarInformacionFacturacionesPorDiarios.setText("Buscar");
		this.jButtonRecargarInformacionFacturacionesPorDiarios.setToolTipText("Buscar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturacionesPorDiarios,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionFacturacionesPorDiarios.setVisible(false);
		
		
		this.jButtonProcesarInformacionFacturacionesPorDiarios = new JButtonMe();
		this.jButtonProcesarInformacionFacturacionesPorDiarios.setText("Procesar");
		this.jButtonProcesarInformacionFacturacionesPorDiarios.setToolTipText("Procesar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturacionesPorDiarios.setVisible(false);
			
		this.jButtonProcesarInformacionFacturacionesPorDiarios.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturacionesPorDiarios.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturacionesPorDiarios.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.setText("TIPO");       
		this.jComboBoxTiposReportesFacturacionesPorDiarios.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturacionesPorDiarios.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturacionesPorDiarios.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturacionesPorDiarios.setText("Accion");
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturacionesPorDiarios.setText("Accion");
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturacionesPorDiarios.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturacionesPorDiarios = new JLabelMe();
		
		this.jLabelAccionesFacturacionesPorDiarios.setText("Acciones");		
		this.jLabelAccionesFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturacionesPorDiarios = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturacionesPorDiarios.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturacionesPorDiarios.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturacionesPorDiarios = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturacionesPorDiarios.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturacionesPorDiarios.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturacionesPorDiarios = new JButtonMe();
		//this.jButtonAnterioresFacturacionesPorDiarios.setText("<<");
        this.jButtonAnterioresFacturacionesPorDiarios.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturacionesPorDiarios,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturacionesPorDiarios = new JButtonMe();
		//this.jButtonSiguientesFacturacionesPorDiarios.setText(">>");
        this.jButtonSiguientesFacturacionesPorDiarios.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturacionesPorDiarios,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios,"nuevoguardarcambios_button","Nue",this.facturacionespordiariosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturacionesPorDiarios";
		inputMap = this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturacionesPorDiarios"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturacionesPorDiarios";
		inputMap = this.jButtonRecargarInformacionFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturacionesPorDiarios"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturacionesPorDiarios";
		inputMap = this.jButtonSiguientesFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturacionesPorDiarios"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturacionesPorDiarios";
		inputMap = this.jButtonAnterioresFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturacionesPorDiarios"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturacionesPorDiarios();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturacionesPorDiarios.setMinimumSize(new Dimension(this.getWidth(),FacturacionesPorDiariosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturacionesPorDiariosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturacionesPorDiarios.setMaximumSize(new Dimension(this.getWidth(),FacturacionesPorDiariosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturacionesPorDiariosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturacionesPorDiarios.setPreferredSize(new Dimension(this.getWidth(),FacturacionesPorDiariosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturacionesPorDiariosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturacionesPorDiarios = new GridBagLayout();

			this.jPanelPaginacionFacturacionesPorDiarios.setLayout(gridaBagLayoutPaginacionFacturacionesPorDiarios);						
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonAnterioresFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
					
						
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
			
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonNuevoGuardarCambiosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
						
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonSiguientesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonNuevoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
						
			
			
			if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
				this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
				this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonGuardarCambiosTablaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			}
			
			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonDuplicarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonCopiarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonVerFormFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturacionesPorDiarios.add(this.jButtonCerrarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		
		this.jButtonRecargarInformacionFacturacionesPorDiarios.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturacionesPorDiarios.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturacionesPorDiarios.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturacionesPorDiarios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturacionesPorDiarios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturacionesPorDiarios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturacionesPorDiarios.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturacionesPorDiarios.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturacionesPorDiarios.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturacionesPorDiarios.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturacionesPorDiarios.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturacionesPorDiarios.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturacionesPorDiarios.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturacionesPorDiarios.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturacionesPorDiarios.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturacionesPorDiarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturacionesPorDiarios = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FacturacionesPorDiarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FacturacionesPorDiarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FacturacionesPorDiarios = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FacturacionesPorDiarios = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturacionesPorDiarios.setLayout(gridaBagParametrosReportesFacturacionesPorDiarios);
			this.jPanelParametrosReportesAccionesFacturacionesPorDiarios.setLayout(gridaBagParametrosReportesAccionesFacturacionesPorDiarios);
			
			
			this.jPanelParametrosAuxiliar1FacturacionesPorDiarios.setLayout(gridaBagParametrosAuxiliar1FacturacionesPorDiarios);
			this.jPanelParametrosAuxiliar2FacturacionesPorDiarios.setLayout(gridaBagParametrosAuxiliar2FacturacionesPorDiarios);
			this.jPanelParametrosAuxiliar3FacturacionesPorDiarios.setLayout(gridaBagParametrosAuxiliar3FacturacionesPorDiarios);
			this.jPanelParametrosAuxiliar4FacturacionesPorDiarios.setLayout(gridaBagParametrosAuxiliar4FacturacionesPorDiarios);
			//this.jPanelParametrosAuxiliar5FacturacionesPorDiarios.setLayout(gridaBagParametrosAuxiliar2FacturacionesPorDiarios);			
			
			
			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jButtonRecargarInformacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturacionesPorDiarios.add(this.jComboBoxTiposPaginacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturacionesPorDiarios.add(this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FacturacionesPorDiarios.add(this.jComboBoxTiposArchivosReportesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jPanelParametrosAuxiliar1FacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FacturacionesPorDiarios.add(this.jComboBoxTiposReportesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);																		
			
			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FacturacionesPorDiarios.add(this.jComboBoxTiposGraficosReportesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jPanelParametrosAuxiliar4FacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jComboBoxTiposReportesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jCheckBoxGenerarReporteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jPanelParametrosAuxiliar2FacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jLabelAccionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
				this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jButtonAbrirOrderByFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jComboBoxTiposSeleccionarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
			
			
			/*
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jCheckBoxConGraficoReporteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturacionesPorDiarios.add(this.jCheckBoxSeleccionarTodosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);															
				
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturacionesPorDiarios.add(this.jCheckBoxSeleccionadosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);															
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FacturacionesPorDiarios.add(this.jCheckBoxConGraficoReporteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jPanelParametrosAuxiliar3FacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturacionesPorDiarios.add(this.jComboBoxTiposAccionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturacionesPorDiarios = new GridBagLayout();

			this.jScrollPanelDatosFacturacionesPorDiarios.setLayout(gridaBagLayoutDatosFacturacionesPorDiarios);
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
			
			this.jScrollPanelDatosFacturacionesPorDiarios.add(this.jTableDatosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturacionesPorDiarios.setViewportView(this.jTableDatosFacturacionesPorDiarios);
		this.jTableDatosFacturacionesPorDiarios.setFillsViewportHeight(true);
		this.jTableDatosFacturacionesPorDiarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturacionesPorDiarios= new GridBagLayout();
		this.jPanelAccionesFacturacionesPorDiarios.setLayout(gridaBagLayoutAccionesFacturacionesPorDiarios);
		
		
		/*	
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
			
		this.jPanelAccionesFacturacionesPorDiarios.add(this.jButtonNuevoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaFacturacionesPorDiariosFacturacionesPorDiarios= new GridBagLayout();
		gridaBagLayoutBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.setLayout(gridaBagLayoutBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);

		gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.add(jLabelid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);

		gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturacionesPorDiarios.gridy = 0;
		gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.add(jComboBoxid_transaccionBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);


		gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
		gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.add(jLabelfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);

		gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturacionesPorDiarios.gridy = 1;
		gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.add(jDateChooserfecha_emision_desdeBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);


		gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturacionesPorDiarios.gridy = 2;
		gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.add(jLabelfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);

		gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturacionesPorDiarios.gridy = 2;
		gridBagConstraintsFacturacionesPorDiarios.gridx = 1;
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.add(jDateChooserfecha_emision_hastaBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);

		gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFacturacionesPorDiarios.gridy = 3;
		gridBagConstraintsFacturacionesPorDiarios.gridx =1;
		jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios.add(jButtonBusquedaFacturacionesPorDiariosFacturacionesPorDiarios, gridBagConstraintsFacturacionesPorDiarios);

		jTabbedPaneBusquedasFacturacionesPorDiarios.addTab("1.-Por Transaccion Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaFacturacionesPorDiariosFacturacionesPorDiarios);
		jTabbedPaneBusquedasFacturacionesPorDiarios.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturacionesPorDiarios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturacionesPorDiarios);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();						
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;		
			//this.gridBagConstraintsFacturacionesPorDiarios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;		
		//this.gridBagConstraintsFacturacionesPorDiarios.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturacionesPorDiarios);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;		
			this.gridBagConstraintsFacturacionesPorDiarios.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFacturacionesPorDiarios.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);								
		
		
		/*
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		*/		
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =0;
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturacionesPorDiarios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
				
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturacionesPorDiariosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturacionesPorDiarios= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturacionesPorDiarios = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturacionesPorDiarios.setLayout(gridaBagLayoutBusquedasParametrosFacturacionesPorDiarios);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
			
			
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
			
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturacionesPorDiarios;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturacionesPorDiarios() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturacionesPorDiarios = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturacionesPorDiarios.setName("jPanelReporteDinamicoFacturacionesPorDiarios"); 
		
		this.jPanelReporteDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturacionesPorDiarios.setLayout(gridaBagLayoutReporteDinamicoFacturacionesPorDiarios);
		
		
		this.jInternalFrameReporteDinamicoFacturacionesPorDiarios= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturacionesPorDiarios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturacionesPorDiarios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones Por Diarioses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturacionesPorDiarios = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturacionesPorDiarios.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelColumnasSelectReporteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturacionesPorDiarios = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturacionesPorDiarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturacionesPorDiarios.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturacionesPorDiarios.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturacionesPorDiarios.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturacionesPorDiarios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturacionesPorDiarios=new JScrollPane(this.jListColumnasSelectReporteFacturacionesPorDiarios);
			
			this.jScrollColumnasSelectReporteFacturacionesPorDiarios.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturacionesPorDiarios.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturacionesPorDiarios.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jListColumnasSelectReporteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jScrollColumnasSelectReporteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturacionesPorDiarios = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturacionesPorDiarios.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturacionesPorDiarios = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturacionesPorDiarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturacionesPorDiarios.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturacionesPorDiarios.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturacionesPorDiarios.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturacionesPorDiarios.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturacionesPorDiarios=new JScrollPane(this.jListRelacionesSelectReporteFacturacionesPorDiarios);
			
			this.jScrollRelacionesSelectReporteFacturacionesPorDiarios.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturacionesPorDiarios.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturacionesPorDiarios.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturacionesPorDiarios = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFacturacionesPorDiarios = new JLabelMe();

		this.jLabelConGraficoDinamicoFacturacionesPorDiarios.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelConGraficoDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jCheckBoxConGraficoDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFacturacionesPorDiarios = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFacturacionesPorDiarios.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelColumnaCategoriaGraficoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFacturacionesPorDiarios = new JLabelMe();

		this.jLabelColumnaCategoriaValorFacturacionesPorDiarios.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelColumnaCategoriaValorFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFacturacionesPorDiarios.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFacturacionesPorDiarios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jComboBoxColumnaCategoriaValorFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFacturacionesPorDiarios = new JLabelMe();

		this.jLabelColumnasValoresGraficoFacturacionesPorDiarios.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelColumnasValoresGraficoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFacturacionesPorDiarios = new JList<Reporte>();
		this.jListColumnasValoresGraficoFacturacionesPorDiarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFacturacionesPorDiarios.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFacturacionesPorDiarios.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturacionesPorDiarios.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFacturacionesPorDiarios.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFacturacionesPorDiarios=new JScrollPane(this.jListColumnasValoresGraficoFacturacionesPorDiarios);
			
			this.jScrollColumnasValoresGraficoFacturacionesPorDiarios.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturacionesPorDiarios.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFacturacionesPorDiarios.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jListColumnasSelectReporteFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jScrollColumnasValoresGraficoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFacturacionesPorDiarios = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFacturacionesPorDiarios.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelTiposGraficosReportesDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFacturacionesPorDiarios = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFacturacionesPorDiarios.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFacturacionesPorDiarios.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jComboBoxTiposGraficosReportesDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturacionesPorDiarios = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturacionesPorDiarios.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelGenerarExcelReporteDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios.setToolTipText("Generar EXCEL"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		//this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jButtonGenerarExcelReporteDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jComboBoxTiposReportesDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturacionesPorDiarios = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturacionesPorDiarios.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jLabelTiposArchivoReporteDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jComboBoxTiposArchivosReportesDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturacionesPorDiarios = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturacionesPorDiarios.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturacionesPorDiarios,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturacionesPorDiarios.setToolTipText("Generar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jButtonGenerarReporteDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturacionesPorDiarios = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturacionesPorDiarios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturacionesPorDiarios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturacionesPorDiarios.setToolTipText("Cancelar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacionesPorDiarios.add(this.jButtonCerrarReporteDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturacionesPorDiarios = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturacionesPorDiarios= new JScrollPane(jPanelReporteDinamicoFacturacionesPorDiarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones Por Diarioses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturacionesPorDiarios);
		this.jInternalFrameReporteDinamicoFacturacionesPorDiarios.getContentPane().add(this.jScrollPanelReporteDinamicoFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturacionesPorDiarios() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturacionesPorDiarios = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturacionesPorDiarios.setName("jPanelImportacionFacturacionesPorDiarios"); 
		
		this.jPanelImportacionFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturacionesPorDiarios.setLayout(gridaBagLayoutImportacionFacturacionesPorDiarios);
		
		
		this.jInternalFrameImportacionFacturacionesPorDiarios= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturacionesPorDiarios= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturacionesPorDiarios = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturacionesPorDiarios= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturacionesPorDiarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturacionesPorDiarios.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturacionesPorDiarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setResizable(true);
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setClosable(true);
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturacionesPorDiarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturacionesPorDiarios.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturacionesPorDiarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setResizable(true);
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setClosable(true);
	    this.jInternalFrameImportacionFacturacionesPorDiarios.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones Por Diarioses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturacionesPorDiarios = new JLabelMe();

		this.jLabelArchivoImportacionFacturacionesPorDiarios.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturacionesPorDiarios.add(this.jLabelArchivoImportacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturacionesPorDiarios = new JFileChooser();		
		this.jFileChooserImportacionFacturacionesPorDiarios.setToolTipText("ESCOGER ARCHIVO"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturacionesPorDiarios = new JButtonMe();
		this.jButtonAbrirImportacionFacturacionesPorDiarios.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturacionesPorDiarios,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturacionesPorDiarios.setToolTipText("Generar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacionesPorDiarios.add(this.jButtonAbrirImportacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturacionesPorDiarios = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturacionesPorDiarios.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturacionesPorDiarios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturacionesPorDiarios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturacionesPorDiarios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturacionesPorDiarios.add(this.jLabelPathArchivoImportacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturacionesPorDiarios=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturacionesPorDiarios.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturacionesPorDiarios.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturacionesPorDiarios.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacionesPorDiarios.add(this.jTextFieldPathArchivoImportacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturacionesPorDiarios = new JButtonMe();
		this.jButtonGenerarImportacionFacturacionesPorDiarios.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturacionesPorDiarios,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturacionesPorDiarios.setToolTipText("Generar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacionesPorDiarios.add(this.jButtonGenerarImportacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturacionesPorDiarios = new JButtonMe();
		this.jButtonCerrarImportacionFacturacionesPorDiarios.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturacionesPorDiarios,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturacionesPorDiarios.setToolTipText("Cancelar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacionesPorDiarios.add(this.jButtonCerrarImportacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturacionesPorDiarios = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturacionesPorDiarios= new JScrollPane(jPanelImportacionFacturacionesPorDiarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
		this.gridBagConstraintsFacturacionesPorDiarios.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturacionesPorDiarios.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturacionesPorDiarios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturacionesPorDiarios.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturacionesPorDiarios);
		this.jInternalFrameImportacionFacturacionesPorDiarios.getContentPane().add(this.jScrollPanelImportacionFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturacionesPorDiarios(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturacionesPorDiarios = new JButtonMe();
			this.jButtonAbrirOrderByFacturacionesPorDiarios.setText("Orden");
			this.jButtonAbrirOrderByFacturacionesPorDiarios.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturacionesPorDiarios,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturacionesPorDiarios";
			inputMap = this.jButtonAbrirOrderByFacturacionesPorDiarios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturacionesPorDiarios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturacionesPorDiarios"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturacionesPorDiarios = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturacionesPorDiarios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturacionesPorDiarios.setName("jPanelOrderByFacturacionesPorDiarios"); 
			
			this.jPanelOrderByFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturacionesPorDiarios.setLayout(gridaBagLayoutOrderByFacturacionesPorDiarios);
			
			
			this.jTableDatosFacturacionesPorDiariosOrderBy = new JTableMe();        
			this.jTableDatosFacturacionesPorDiariosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturacionesPorDiariosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturacionesPorDiariosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturacionesPorDiariosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturacionesPorDiariosOrderBy.setViewportView(this.jTableDatosFacturacionesPorDiariosOrderBy);
			this.jTableDatosFacturacionesPorDiariosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturacionesPorDiariosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturacionesPorDiarios= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturacionesPorDiarios= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturacionesPorDiarios = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturacionesPorDiarios= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturacionesPorDiarios.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturacionesPorDiarios.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturacionesPorDiarios.setTitle("Orden");
			this.jInternalFrameOrderByFacturacionesPorDiarios.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturacionesPorDiarios.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturacionesPorDiarios.setResizable(true);
			this.jInternalFrameOrderByFacturacionesPorDiarios.setClosable(true);
			this.jInternalFrameOrderByFacturacionesPorDiarios.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturacionesPorDiarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones Por Diarioses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturacionesPorDiarios.ipady =150;
				
			this.jPanelOrderByFacturacionesPorDiarios.add(jScrollPanelDatosFacturacionesPorDiariosOrderBy, this.gridBagConstraintsFacturacionesPorDiarios);//this.jTableDatosFacturacionesPorDiariosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturacionesPorDiarios = new JButtonMe();
			this.jButtonCerrarOrderByFacturacionesPorDiarios.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturacionesPorDiarios,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturacionesPorDiarios.setToolTipText("Cancelar"+" "+FacturacionesPorDiariosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturacionesPorDiarios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacionesPorDiarios.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturacionesPorDiarios.add(this.jButtonCerrarOrderByFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturacionesPorDiarios = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturacionesPorDiarios= new JScrollPane(jPanelOrderByFacturacionesPorDiarios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturacionesPorDiarios = new GridBagConstraints();
			this.gridBagConstraintsFacturacionesPorDiarios.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturacionesPorDiarios.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturacionesPorDiarios.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturacionesPorDiarios.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturacionesPorDiarios.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturacionesPorDiarios);
			
			this.jInternalFrameOrderByFacturacionesPorDiarios.getContentPane().add(this.jScrollPanelOrderByFacturacionesPorDiarios, this.gridBagConstraintsFacturacionesPorDiarios);			
		
		} else {
			this.jButtonAbrirOrderByFacturacionesPorDiarios = new JButtonMe();
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
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.facturacionespordiariosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturacionesPorDiarios.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosFacturacionesPorDiarios.getRowHeight();//FacturacionesPorDiariosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios.isSelected()) {
					iHeightTable=FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturacionesPorDiarios.isSelected()) {
					iHeightTable=FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturacionesPorDiariosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturacionesPorDiarios!=null && this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy()!=null) {
			//if(!this.facturacionespordiariosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturacionesPorDiarios.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturacionesPorDiarios.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturacionesPorDiarios.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturacionesPorDiarios.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturacionesPorDiarios.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturacionesPorDiarios.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturacionesPorDiarios.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=facturacionespordiariosLogic.getFacturacionesPorDiarioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturacionespordiarioss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FacturacionesPorDiarios> TraerFacturacionesPorDiariosBeans(List<FacturacionesPorDiarios> facturacionespordiarioss,ArrayList<Classe> classes)throws Exception {
		try {
			for(FacturacionesPorDiarios facturacionespordiarios:facturacionespordiarioss) {
					
				if(!(FacturacionesPorDiariosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturacionesPorDiariosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturacionespordiarios.setsDetalleGeneralEntityReporte(FacturacionesPorDiariosConstantesFunciones.getFacturacionesPorDiariosDescripcion(facturacionespordiarios));
										
						
					
						
					
				} else  {
							
					//facturacionespordiarios.setsDetalleGeneralEntityReporte(facturacionespordiarios.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturacionespordiariosbeans.add(facturacionespordiariosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturacionespordiarioss;
    }
	//PARA REPORTES FIN
}
