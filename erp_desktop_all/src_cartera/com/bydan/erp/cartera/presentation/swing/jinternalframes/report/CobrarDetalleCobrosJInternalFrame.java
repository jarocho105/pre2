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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
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
import com.bydan.erp.cartera.util.report.CobrarDetalleCobrosConstantesFunciones;

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
public class CobrarDetalleCobrosJInternalFrame extends CobrarDetalleCobrosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarDetalleCobros;
	
	protected JMenuBar jmenuBarCobrarDetalleCobros;
	
	protected JMenu jmenuCobrarDetalleCobros;
	protected JMenu jmenuDatosCobrarDetalleCobros;
	protected JMenu jmenuArchivoCobrarDetalleCobros;
	protected JMenu jmenuAccionesCobrarDetalleCobros;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarDetalleCobros;	
	protected GridBagConstraints gridBagConstraintsCobrarDetalleCobros;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarDetalleCobrosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarDetalleCobros;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarDetalleCobros;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarDetalleCobros;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";
	
	public CobrarDetalleCobrosSessionBean cobrardetallecobrosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarDetalleCobros> cobrardetallecobross;		
	public List<CobrarDetalleCobros> cobrardetallecobrossEliminados;	
	public List<CobrarDetalleCobros> cobrardetallecobrossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarDetalleCobros;		
	protected JButton jButtonAbrirOrderByCobrarDetalleCobros;
	
	
	//protected JPanel jPanelOrderByCobrarDetalleCobros;
	//public JScrollPane jScrollPanelOrderByCobrarDetalleCobros;	
	//protected JButton jButtonCerrarOrderByCobrarDetalleCobros;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarDetalleCobrosLogic cobrardetallecobrosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarDetalleCobros;
	public JScrollPane jScrollPanelDatosEdicionCobrarDetalleCobros;
	public JScrollPane jScrollPanelDatosGeneralCobrarDetalleCobros;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarDetalleCobrosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarDetalleCobros;
	//public JScrollPane jScrollPanelImportacionCobrarDetalleCobros;
	
	
	
	protected JPanel jPanelAccionesCobrarDetalleCobros;
	
    protected JPanel jPanelPaginacionCobrarDetalleCobros;
    protected JPanel jPanelParametrosReportesCobrarDetalleCobros;
	protected JPanel jPanelParametrosReportesAccionesCobrarDetalleCobros;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarDetalleCobros;
	protected JPanel jPanelParametrosAuxiliar2CobrarDetalleCobros;
	protected JPanel jPanelParametrosAuxiliar3CobrarDetalleCobros;
	protected JPanel jPanelParametrosAuxiliar4CobrarDetalleCobros;
	//protected JPanel jPanelParametrosAuxiliar5CobrarDetalleCobros;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarDetalleCobros;
	//protected JPanel jPanelImportacionCobrarDetalleCobros;
	
	
	public JTable jTableDatosCobrarDetalleCobros;
	
	
	
	//public JTable jTableDatosCobrarDetalleCobrosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarDetalleCobros;
	protected JButton jButtonDuplicarCobrarDetalleCobros;
	protected JButton jButtonCopiarCobrarDetalleCobros;
	protected JButton jButtonVerFormCobrarDetalleCobros;
	protected JButton jButtonNuevoRelacionesCobrarDetalleCobros;
	protected JButton jButtonModificarCobrarDetalleCobros;
	
    protected JButton jButtonGuardarCambiosTablaCobrarDetalleCobros;
	protected JButton jButtonCerrarCobrarDetalleCobros;
	
	
	protected JButton jButtonRecargarInformacionCobrarDetalleCobros;
	protected JButton jButtonProcesarInformacionCobrarDetalleCobros;
	
	
	protected JButton jButtonAnterioresCobrarDetalleCobros;
	protected JButton jButtonSiguientesCobrarDetalleCobros;
	protected JButton jButtonNuevoGuardarCambiosCobrarDetalleCobros;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarDetalleCobros;
	//protected JButton jButtonCerrarReporteDinamicoCobrarDetalleCobros;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarDetalleCobros;
	//protected JButton jButtonGenerarImportacionCobrarDetalleCobros;
	//protected JButton jButtonCerrarImportacionCobrarDetalleCobros;
	//protected JFileChooser jFileChooserImportacionCobrarDetalleCobros;
	//protected File fileImportacionCobrarDetalleCobros;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarDetalleCobros;
	protected JButton jButtonDuplicarToolBarCobrarDetalleCobros;
	protected JButton jButtonNuevoRelacionesToolBarCobrarDetalleCobros;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarDetalleCobros;
	protected JButton jButtonCopiarToolBarCobrarDetalleCobros;
	protected JButton jButtonVerFormToolBarCobrarDetalleCobros;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarDetalleCobros;
	protected JButton jButtonCerrarToolBarCobrarDetalleCobros;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarDetalleCobros;
	protected JButton jButtonProcesarInformacionToolBarCobrarDetalleCobros;
	protected JButton jButtonAnterioresToolBarCobrarDetalleCobros;
	protected JButton jButtonSiguientesToolBarCobrarDetalleCobros;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarDetalleCobros;
	protected JButton jButtonAbrirOrderByToolBarCobrarDetalleCobros;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarDetalleCobros;
	protected JMenuItem jMenuItemDuplicarCobrarDetalleCobros;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarDetalleCobros;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarDetalleCobros;
	protected JMenuItem jMenuItemCopiarCobrarDetalleCobros;
	protected JMenuItem jMenuItemVerFormCobrarDetalleCobros;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarDetalleCobros;
	protected JMenuItem jMenuItemCerrarCobrarDetalleCobros;
	protected JMenuItem jMenuItemDetalleCerrarCobrarDetalleCobros;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarDetalleCobros;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarDetalleCobros;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarDetalleCobros;
	protected JMenuItem jMenuItemProcesarInformacionCobrarDetalleCobros;
	protected JMenuItem jMenuItemAnterioresCobrarDetalleCobros;
	protected JMenuItem jMenuItemSiguientesCobrarDetalleCobros;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarDetalleCobros;
	protected JMenuItem jMenuItemAbrirOrderByCobrarDetalleCobros;
	protected JMenuItem jMenuItemMostrarOcultarCobrarDetalleCobros;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarDetalleCobros;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarDetalleCobros;
	protected JCheckBox jCheckBoxSeleccionadosCobrarDetalleCobros;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarDetalleCobros;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarDetalleCobros;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarDetalleCobros;
	protected JTextField jTextFieldValorCampoGeneralCobrarDetalleCobros;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarDetalleCobros;
	//public JList<Reporte> jListColumnasSelectReporteCobrarDetalleCobros;
	//public JScrollPane jScrollColumnasSelectReporteCobrarDetalleCobros;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarDetalleCobros;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarDetalleCobros;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarDetalleCobros;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarDetalleCobros;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarDetalleCobros;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarDetalleCobros;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarDetalleCobros;
	
		
	//public JLabel jLabelArchivoImportacionCobrarDetalleCobros;	
	//public JLabel jLabelPathArchivoImportacionCobrarDetalleCobros;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarDetalleCobros;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarDetalleCobros;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarDetalleCobros;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarDetalleCobros;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarDetalleCobros;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarDetalleCobros;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarDetalleCobros;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarDetalleCobros;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarDetalleCobros;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarDetalleCobros;
	public JPanel jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	
	public JPanel jPanelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JLabel jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JLabel jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JLabel jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JLabel jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JLabel jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobrosUpdate= new JButtonMe();
	public JButton jButtonid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JLabel jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	//public JFormattedTextField jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros;

	public JDateChooser jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JLabel jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros;
	public JButton jButtonfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobrosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarDetalleCobrosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarDetalleCobrosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarDetalleCobrosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarDetalleCobrosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarDetalleCobros)	{
		this.jButtonRecargarInformacionCobrarDetalleCobros = jButtonRecargarInformacionCobrarDetalleCobros;
	}
	
	public JButton getjButtonProcesarInformacionCobrarDetalleCobros() {
		return this.jButtonProcesarInformacionCobrarDetalleCobros;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarDetalleCobros)	{
		this.jButtonProcesarInformacionCobrarDetalleCobros = jButtonProcesarInformacionCobrarDetalleCobros;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarDetalleCobros() {
		return this.jButtonRecargarInformacionCobrarDetalleCobros;
	}
	
	
	public List<CobrarDetalleCobros> getcobrardetallecobross() {
		return this.cobrardetallecobross;
	}

	public void setcobrardetallecobross(List<CobrarDetalleCobros> cobrardetallecobross) {
		this.cobrardetallecobross = cobrardetallecobross;
	}
	
	public List<CobrarDetalleCobros> getcobrardetallecobrossAux() {
		return this.cobrardetallecobrossAux;
	}

	public void setcobrardetallecobrossAux(List<CobrarDetalleCobros> cobrardetallecobrossAux) {
		this.cobrardetallecobrossAux = cobrardetallecobrossAux;
	}
	
	public List<CobrarDetalleCobros> getcobrardetallecobrossEliminados() {
		return this.cobrardetallecobrossEliminados;
	}

	public void setCobrarDetalleCobrossEliminados(List<CobrarDetalleCobros> cobrardetallecobrossEliminados) {
		this.cobrardetallecobrossEliminados = cobrardetallecobrossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarDetalleCobros() {
		return jComboBoxTiposSeleccionarCobrarDetalleCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarDetalleCobros(
			JComboBox jComboBoxTiposSeleccionarCobrarDetalleCobros) {
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros = jComboBoxTiposSeleccionarCobrarDetalleCobros;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarDetalleCobros() {
		return jTextFieldValorCampoGeneralCobrarDetalleCobros;
	}

	public void setjTextFieldValorCampoGeneralCobrarDetalleCobros(
			JTextField jTextFieldValorCampoGeneralCobrarDetalleCobros) {
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros = jTextFieldValorCampoGeneralCobrarDetalleCobros;
	}

	public void setBorderResaltarValorCampoGeneralCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarDetalleCobros() {
		return this.jCheckBoxSeleccionarTodosCobrarDetalleCobros;
	}

	public void setjCheckBoxSeleccionarTodosCobrarDetalleCobros(
			JCheckBox jCheckBoxSeleccionarTodosCobrarDetalleCobros) {
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros = jCheckBoxSeleccionarTodosCobrarDetalleCobros;
	}

	public void setBorderResaltarSeleccionarTodosCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarDetalleCobros() {
		return this.jCheckBoxSeleccionadosCobrarDetalleCobros;
	}

	public void setjCheckBoxSeleccionadosCobrarDetalleCobros(
			JCheckBox jCheckBoxSeleccionadosCobrarDetalleCobros) {
		this.jCheckBoxSeleccionadosCobrarDetalleCobros = jCheckBoxSeleccionadosCobrarDetalleCobros;
	}
	
	public void setBorderResaltarSeleccionadosCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarDetalleCobros() {
		return this.jComboBoxTiposArchivosReportesCobrarDetalleCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarDetalleCobros(
			JComboBox jComboBoxTiposArchivosReportesCobrarDetalleCobros) {
		this.jComboBoxTiposArchivosReportesCobrarDetalleCobros = jComboBoxTiposArchivosReportesCobrarDetalleCobros;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarDetalleCobros() {
		return this.jComboBoxTiposReportesCobrarDetalleCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarDetalleCobros(
			JComboBox jComboBoxTiposReportesCobrarDetalleCobros) {
		this.jComboBoxTiposReportesCobrarDetalleCobros = jComboBoxTiposReportesCobrarDetalleCobros;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarDetalleCobros() {
	//	return jComboBoxTiposReportesDinamicoCobrarDetalleCobros;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarDetalleCobros(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarDetalleCobros) {
	//	this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros = jComboBoxTiposReportesDinamicoCobrarDetalleCobros;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros = jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros;
	//}
	
	public void setBorderResaltarTiposReportesCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarDetalleCobros() {
		return this.jComboBoxTiposGraficosReportesCobrarDetalleCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarDetalleCobros(
			JComboBox jComboBoxTiposGraficosReportesCobrarDetalleCobros) {
		this.jComboBoxTiposGraficosReportesCobrarDetalleCobros = jComboBoxTiposGraficosReportesCobrarDetalleCobros;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarDetalleCobros() {
		return this.jComboBoxTiposPaginacionCobrarDetalleCobros;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarDetalleCobros(
			JComboBox jComboBoxTiposPaginacionCobrarDetalleCobros) {
		this.jComboBoxTiposPaginacionCobrarDetalleCobros = jComboBoxTiposPaginacionCobrarDetalleCobros;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarDetalleCobros() {
		return this.jComboBoxTiposRelacionesCobrarDetalleCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarDetalleCobros() {
		return this.jComboBoxTiposAccionesCobrarDetalleCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarDetalleCobros(
			JComboBox jComboBoxTiposRelacionesCobrarDetalleCobros) {
		this.jComboBoxTiposRelacionesCobrarDetalleCobros = jComboBoxTiposRelacionesCobrarDetalleCobros;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarDetalleCobros(
			JComboBox jComboBoxTiposAccionesCobrarDetalleCobros) {
		this.jComboBoxTiposAccionesCobrarDetalleCobros = jComboBoxTiposAccionesCobrarDetalleCobros;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarDetalleCobros() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarDetalleCobros .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarDetalleCobros() {
	//	return jCheckBoxConGraficoDinamicoCobrarDetalleCobros;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarDetalleCobros(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarDetalleCobros) {
	//	this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros = jCheckBoxConGraficoDinamicoCobrarDetalleCobros;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarDetalleCobros() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarDetalleCobros.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros .setBorder(borderResaltar);		
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
		this.cobrardetallecobrosSessionBean=new CobrarDetalleCobrosSessionBean();
		
		this.cobrardetallecobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrardetallecobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarDetalleCobrosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarDetalleCobrosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarDetalleCobrosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarDetalleCobrosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarDetalleCobrosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Detalle Cobros MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarDetalleCobrosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarDetalleCobros No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarDetalleCobros= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"nuevo","nuevo","Nuevo"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"duplicar","duplicar","Duplicar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"copiar","copiar","Copiar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"ver_form","ver_form","Ver"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"recargar","recargar","Buscar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarDetalleCobros=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarDetalleCobros,this.jTtoolBarCobrarDetalleCobros,
							"cerrar","cerrar","Salir"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarDetalleCobros=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarDetalleCobros;
			
				this.jButtonProcesarInformacionToolBarCobrarDetalleCobros=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarDetalleCobros;
				
		//protected JButton jButtonModificarToolBarCobrarDetalleCobros;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarDetalleCobros=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarDetalleCobros=new JMenuMe("General");
		this.jmenuArchivoCobrarDetalleCobros=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarDetalleCobros=new JMenuMe("Acciones");
		this.jmenuDatosCobrarDetalleCobros=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarDetalleCobros= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarDetalleCobros.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarDetalleCobros,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarDetalleCobros= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarDetalleCobros.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarDetalleCobros,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarDetalleCobros= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarDetalleCobros.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarDetalleCobros,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarDetalleCobros= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarDetalleCobros.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarDetalleCobros,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarDetalleCobros= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarDetalleCobros.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarDetalleCobros,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarDetalleCobros= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarDetalleCobros.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarDetalleCobros,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarDetalleCobros= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarDetalleCobros.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarDetalleCobros,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarDetalleCobros= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarDetalleCobros.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarDetalleCobros,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarDetalleCobros= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarDetalleCobros.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarDetalleCobros,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarDetalleCobros= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarDetalleCobros.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarDetalleCobros,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarDetalleCobros= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarDetalleCobros.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarDetalleCobros,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarDetalleCobros= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarDetalleCobros.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarDetalleCobros,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarDetalleCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarDetalleCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarDetalleCobros,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarDetalleCobros= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarDetalleCobros.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarDetalleCobros,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarDetalleCobros.add(this.jMenuItemCerrarCobrarDetalleCobros);
			
			this.jmenuAccionesCobrarDetalleCobros.add(this.jMenuItemNuevoCobrarDetalleCobros);
			this.jmenuAccionesCobrarDetalleCobros.add(this.jMenuItemNuevoGuardarCambiosCobrarDetalleCobros);
			this.jmenuAccionesCobrarDetalleCobros.add(this.jMenuItemNuevoRelacionesCobrarDetalleCobros);
			this.jmenuAccionesCobrarDetalleCobros.add(this.jMenuItemGuardarCambiosTablaCobrarDetalleCobros);		
			this.jmenuAccionesCobrarDetalleCobros.add(this.jMenuItemDuplicarCobrarDetalleCobros);		
			this.jmenuAccionesCobrarDetalleCobros.add(this.jMenuItemCopiarCobrarDetalleCobros);		
			this.jmenuAccionesCobrarDetalleCobros.add(this.jMenuItemVerFormCobrarDetalleCobros);		
			
			this.jmenuDatosCobrarDetalleCobros.add(this.jMenuItemRecargarInformacionCobrarDetalleCobros);				
			this.jmenuDatosCobrarDetalleCobros.add(this.jMenuItemAnterioresCobrarDetalleCobros);				
			this.jmenuDatosCobrarDetalleCobros.add(this.jMenuItemSiguientesCobrarDetalleCobros);				
			this.jmenuDatosCobrarDetalleCobros.add(this.jMenuItemAbrirOrderByCobrarDetalleCobros);				
			this.jmenuDatosCobrarDetalleCobros.add(this.jMenuItemMostrarOcultarCobrarDetalleCobros);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarDetalleCobros.add(this.jMenuItemGuardarCambiosCobrarDetalleCobros);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarDetalleCobros.add(this.jmenuArchivoCobrarDetalleCobros);		
			this.jmenuBarCobrarDetalleCobros.add(this.jmenuAccionesCobrarDetalleCobros);		
			this.jmenuBarCobrarDetalleCobros.add(this.jmenuDatosCobrarDetalleCobros);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarDetalleCobros);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarDetalleCobros() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Buscar Por Pais Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Fecha Emision Por Fecha Emision Hasta ");
		this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JButtonMe();
		this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Buscar");
		this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Buscar Por Pais Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Fecha Emision Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros,"buscar_button","Buscar Por Pais Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Fecha Emision Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros = new JLabelMe();
		jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Pais :");
		jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Pais");
		jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros = new JLabelMe();
		jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Ciudad :");
		jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Ciudad");
		jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros = new JLabelMe();
		jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Zona :");
		jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Zona");
		jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros = new JLabelMe();
		jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros = new JLabelMe();
		jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Vendedor :");
		jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Vendedor");
		jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JComboBoxMe();
		jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros = new JLabelMe();
		jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Fecha Emision :");
		jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Fecha Emision");
		jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JDateChooser();
		jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setDate(new Date());
		jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarDetalleCobros=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarDetalleCobros.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasCobrarDetalleCobros.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasCobrarDetalleCobros.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarDetalleCobros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarDetalleCobros = new CobrarDetalleCobrosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Detalle Cobros DATOS");
			this.jInternalFrameDetalleFormCobrarDetalleCobros = new CobrarDetalleCobrosDetalleFormJInternalFrame(jDesktopPane,this.cobrardetallecobrosSessionBean.getConGuardarRelaciones(),this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarDetalleCobros = null;//new CobrarDetalleCobrosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarDetalleCobros= new GridBagLayout();
		
		
		this.jTableDatosCobrarDetalleCobros = new JTableMe();      
		
		String sToolTipCobrarDetalleCobros="";
		sToolTipCobrarDetalleCobros=CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarDetalleCobros+="(Cartera.CobrarDetalleCobros)";
		}
		
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarDetalleCobros+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarDetalleCobros.setToolTipText(sToolTipCobrarDetalleCobros);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarDetalleCobros);
		this.jTableDatosCobrarDetalleCobros.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarDetalleCobros.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarDetalleCobros.setRowSelectionAllowed(true);
		this.jTableDatosCobrarDetalleCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarDetalleCobros,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarDetalleCobros = new JButtonMe();
		this.jButtonDuplicarCobrarDetalleCobros = new JButtonMe();
		this.jButtonCopiarCobrarDetalleCobros = new JButtonMe();
		this.jButtonVerFormCobrarDetalleCobros = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarDetalleCobros = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros = new JButtonMe();
		this.jButtonCerrarCobrarDetalleCobros = new JButtonMe();
		
		this.jScrollPanelDatosCobrarDetalleCobros = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarDetalleCobros = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Detalle Cobros";
		
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Detalle Cobroses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarDetalleCobros.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarDetalleCobros.setToolTipText("Acciones");
        this.jPanelAccionesCobrarDetalleCobros.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarDetalleCobros=new ReporteDinamicoJInternalFrame(CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarDetalleCobros();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarDetalleCobros=new ImportacionJInternalFrame(CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarDetalleCobros();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarDetalleCobros = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarDetalleCobros.setText("Orden");
		this.jButtonAbrirOrderByCobrarDetalleCobros.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarDetalleCobros,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarDetalleCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarDetalleCobros,false,this);
			
			//this.cargarOrderByCobrarDetalleCobros(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarDetalleCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarDetalleCobros,true,this);
			
			//this.cargarOrderByCobrarDetalleCobros(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarDetalleCobros.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosCobrarDetalleCobros.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosCobrarDetalleCobros.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosCobrarDetalleCobros.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarDetalleCobros.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarDetalleCobros.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarDetalleCobros.setText("Nuevo");
		this.jButtonDuplicarCobrarDetalleCobros.setText("Duplicar");
		this.jButtonCopiarCobrarDetalleCobros.setText("Copiar");
		this.jButtonVerFormCobrarDetalleCobros.setText("Ver");
		this.jButtonNuevoRelacionesCobrarDetalleCobros.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.setText("Guardar");
		this.jButtonCerrarCobrarDetalleCobros.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarDetalleCobros,"nuevo_button","Nuevo",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarDetalleCobros,"duplicar_button","Duplicar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarDetalleCobros,"copiar_button","Copiar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarDetalleCobros,"ver_form","Ver",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarDetalleCobros,"nuevorelaciones_button","Nuevo Rel",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarDetalleCobros,"guardarcambiostabla_button","Guardar",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarDetalleCobros,"cerrar_button","Salir",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarDetalleCobros.setToolTipText("Nuevo"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarDetalleCobros.setToolTipText("Duplicar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarDetalleCobros.setToolTipText("Copiar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarDetalleCobros.setToolTipText("Ver"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarDetalleCobros.setToolTipText("Nuevo Rel"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.setToolTipText("Guardar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarDetalleCobros.setToolTipText("Salir"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarDetalleCobros";
		inputMap = this.jButtonNuevoCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarDetalleCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarDetalleCobros"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarDetalleCobros";
		inputMap = this.jButtonDuplicarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarDetalleCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarDetalleCobros"));
		
		//COPIAR
		sMapKey = "CopiarCobrarDetalleCobros";
		inputMap = this.jButtonCopiarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarDetalleCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarDetalleCobros"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarDetalleCobros";
		inputMap = this.jButtonVerFormCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarDetalleCobros.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarDetalleCobros"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarDetalleCobros";
		inputMap = this.jButtonNuevoRelacionesCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarDetalleCobros"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarDetalleCobros";
		inputMap = this.jButtonModificarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarDetalleCobros"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarDetalleCobros";
		inputMap = this.jButtonCerrarCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarDetalleCobros"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarDetalleCobros";
		inputMap = this.jButtonGuardarCambiosTablaCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarDetalleCobros"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarDetalleCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarDetalleCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarDetalleCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarDetalleCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarDetalleCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarDetalleCobros.setName("jPanelParametrosReportesCobrarDetalleCobros"); 
		
		this.jPanelParametrosReportesAccionesCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarDetalleCobros.setName("jPanelParametrosReportesAccionesCobrarDetalleCobros"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarDetalleCobros = new JButtonMe();
		this.jButtonRecargarInformacionCobrarDetalleCobros.setText("Buscar");
		this.jButtonRecargarInformacionCobrarDetalleCobros.setToolTipText("Buscar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarDetalleCobros,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarDetalleCobros.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarDetalleCobros = new JButtonMe();
		this.jButtonProcesarInformacionCobrarDetalleCobros.setText("Procesar");
		this.jButtonProcesarInformacionCobrarDetalleCobros.setToolTipText("Procesar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarDetalleCobros.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarDetalleCobros.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarDetalleCobros.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarDetalleCobros.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarDetalleCobros.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarDetalleCobros.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarDetalleCobros.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarDetalleCobros.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarDetalleCobros.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarDetalleCobros.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarDetalleCobros.setText("Accion");
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarDetalleCobros.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarDetalleCobros.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarDetalleCobros = new JLabelMe();
		
		this.jLabelAccionesCobrarDetalleCobros.setText("Acciones");		
		this.jLabelAccionesCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarDetalleCobros = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarDetalleCobros.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarDetalleCobros.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarDetalleCobros = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarDetalleCobros.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarDetalleCobros.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarDetalleCobros = new JButtonMe();
		//this.jButtonAnterioresCobrarDetalleCobros.setText("<<");
        this.jButtonAnterioresCobrarDetalleCobros.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarDetalleCobros,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarDetalleCobros = new JButtonMe();
		//this.jButtonSiguientesCobrarDetalleCobros.setText(">>");
        this.jButtonSiguientesCobrarDetalleCobros.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarDetalleCobros,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarDetalleCobros = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarDetalleCobros.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarDetalleCobros.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarDetalleCobros,"nuevoguardarcambios_button","Nue",this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarDetalleCobros";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarDetalleCobros"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarDetalleCobros";
		inputMap = this.jButtonRecargarInformacionCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarDetalleCobros"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarDetalleCobros";
		inputMap = this.jButtonSiguientesCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarDetalleCobros"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarDetalleCobros";
		inputMap = this.jButtonAnterioresCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarDetalleCobros"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarDetalleCobros();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarDetalleCobros.setMinimumSize(new Dimension(this.getWidth(),CobrarDetalleCobrosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarDetalleCobrosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarDetalleCobros.setMaximumSize(new Dimension(this.getWidth(),CobrarDetalleCobrosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarDetalleCobrosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarDetalleCobros.setPreferredSize(new Dimension(this.getWidth(),CobrarDetalleCobrosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarDetalleCobrosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarDetalleCobros = new GridBagLayout();

			this.jPanelPaginacionCobrarDetalleCobros.setLayout(gridaBagLayoutPaginacionCobrarDetalleCobros);						
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonAnterioresCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
					
						
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
			
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonNuevoGuardarCambiosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
						
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonSiguientesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 1;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonNuevoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
						
			
			
			if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
				this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarDetalleCobros.gridy = 1;
				this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonGuardarCambiosTablaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			}
			
			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 1;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonDuplicarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 1;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonCopiarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 1;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonVerFormCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 1;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarDetalleCobros.add(this.jButtonCerrarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		
		this.jButtonRecargarInformacionCobrarDetalleCobros.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarDetalleCobros.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarDetalleCobros.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarDetalleCobros.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarDetalleCobros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarDetalleCobros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarDetalleCobros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarDetalleCobros.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarDetalleCobros.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarDetalleCobros.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarDetalleCobros.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarDetalleCobros.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarDetalleCobros.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarDetalleCobros.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarDetalleCobros.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarDetalleCobros.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarDetalleCobros.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarDetalleCobros.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarDetalleCobros.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarDetalleCobros.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarDetalleCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarDetalleCobros = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarDetalleCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarDetalleCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarDetalleCobros = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarDetalleCobros = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarDetalleCobros.setLayout(gridaBagParametrosReportesCobrarDetalleCobros);
			this.jPanelParametrosReportesAccionesCobrarDetalleCobros.setLayout(gridaBagParametrosReportesAccionesCobrarDetalleCobros);
			
			
			this.jPanelParametrosAuxiliar1CobrarDetalleCobros.setLayout(gridaBagParametrosAuxiliar1CobrarDetalleCobros);
			this.jPanelParametrosAuxiliar2CobrarDetalleCobros.setLayout(gridaBagParametrosAuxiliar2CobrarDetalleCobros);
			this.jPanelParametrosAuxiliar3CobrarDetalleCobros.setLayout(gridaBagParametrosAuxiliar3CobrarDetalleCobros);
			this.jPanelParametrosAuxiliar4CobrarDetalleCobros.setLayout(gridaBagParametrosAuxiliar4CobrarDetalleCobros);
			//this.jPanelParametrosAuxiliar5CobrarDetalleCobros.setLayout(gridaBagParametrosAuxiliar2CobrarDetalleCobros);			
			
			
			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jButtonRecargarInformacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarDetalleCobros.add(this.jComboBoxTiposPaginacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarDetalleCobros.add(this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarDetalleCobros.add(this.jComboBoxTiposArchivosReportesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jPanelParametrosAuxiliar1CobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarDetalleCobros.add(this.jComboBoxTiposReportesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);																		
			
			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CobrarDetalleCobros.add(this.jComboBoxTiposGraficosReportesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jPanelParametrosAuxiliar4CobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jComboBoxTiposReportesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jCheckBoxGenerarReporteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jPanelParametrosAuxiliar2CobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jLabelAccionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
				this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jButtonAbrirOrderByCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jComboBoxTiposSeleccionarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
			
			
			/*
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jCheckBoxSeleccionarTodosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jCheckBoxConGraficoReporteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarDetalleCobros.add(this.jCheckBoxSeleccionarTodosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);															
				
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarDetalleCobros.add(this.jCheckBoxSeleccionadosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);															
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarDetalleCobros.add(this.jCheckBoxConGraficoReporteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jPanelParametrosAuxiliar3CobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarDetalleCobros.add(this.jComboBoxTiposAccionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarDetalleCobros = new GridBagLayout();

			this.jScrollPanelDatosCobrarDetalleCobros.setLayout(gridaBagLayoutDatosCobrarDetalleCobros);
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
			
			this.jScrollPanelDatosCobrarDetalleCobros.add(this.jTableDatosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarDetalleCobros.setViewportView(this.jTableDatosCobrarDetalleCobros);
		this.jTableDatosCobrarDetalleCobros.setFillsViewportHeight(true);
		this.jTableDatosCobrarDetalleCobros.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarDetalleCobros= new GridBagLayout();
		this.jPanelAccionesCobrarDetalleCobros.setLayout(gridaBagLayoutAccionesCobrarDetalleCobros);
		
		
		/*	
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
			
		this.jPanelAccionesCobrarDetalleCobros.add(this.jButtonNuevoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarDetalleCobrosCobrarDetalleCobros= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarDetalleCobrosCobrarDetalleCobros.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarDetalleCobrosCobrarDetalleCobros.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarDetalleCobrosCobrarDetalleCobros.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarDetalleCobrosCobrarDetalleCobros.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.setLayout(gridaBagLayoutBusquedaCobrarDetalleCobrosCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jLabelid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 0;
		gridBagConstraintsCobrarDetalleCobros.gridx = 1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jComboBoxid_paisBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);


		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 1;
		gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jLabelid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 1;
		gridBagConstraintsCobrarDetalleCobros.gridx = 1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jComboBoxid_ciudadBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);


		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 2;
		gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jLabelid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 2;
		gridBagConstraintsCobrarDetalleCobros.gridx = 1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jComboBoxid_zonaBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);


		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 3;
		gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jLabelid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 3;
		gridBagConstraintsCobrarDetalleCobros.gridx = 1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jComboBoxid_grupo_clienteBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);


		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 4;
		gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jLabelid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 4;
		gridBagConstraintsCobrarDetalleCobros.gridx = 1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jComboBoxid_vendedorBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);


		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 5;
		gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jLabelfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 5;
		gridBagConstraintsCobrarDetalleCobros.gridx = 1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jDateChooserfecha_emisionBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);


		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 6;
		gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jLabelfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 6;
		gridBagConstraintsCobrarDetalleCobros.gridx = 1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jDateChooserfecha_emision_hastaBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarDetalleCobros.gridy = 7;
		gridBagConstraintsCobrarDetalleCobros.gridx =1;
		jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros.add(jButtonBusquedaCobrarDetalleCobrosCobrarDetalleCobros, gridBagConstraintsCobrarDetalleCobros);

		jTabbedPaneBusquedasCobrarDetalleCobros.addTab("1.-Por Pais Por Ciudad Por Zona Por Grupo Cliente Por Vendedor Por Fecha Emision Por Fecha Emision Hasta ", jPanelBusquedaCobrarDetalleCobrosCobrarDetalleCobros);
		jTabbedPaneBusquedasCobrarDetalleCobros.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarDetalleCobros = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarDetalleCobros);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();						
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;		
			//this.gridBagConstraintsCobrarDetalleCobros.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarDetalleCobros.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;		
		//this.gridBagConstraintsCobrarDetalleCobros.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarDetalleCobros.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarDetalleCobros);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;		
			this.gridBagConstraintsCobrarDetalleCobros.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarDetalleCobros.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);								
		
		
		/*
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		*/		
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarDetalleCobros.gridx =0;
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarDetalleCobros.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
				
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarDetalleCobrosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarDetalleCobros= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarDetalleCobros = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarDetalleCobros.setLayout(gridaBagLayoutBusquedasParametrosCobrarDetalleCobros);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarDetalleCobros=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
			
			
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
			
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarDetalleCobros;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarDetalleCobros() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarDetalleCobros = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarDetalleCobros.setName("jPanelReporteDinamicoCobrarDetalleCobros"); 
		
		this.jPanelReporteDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarDetalleCobros.setLayout(gridaBagLayoutReporteDinamicoCobrarDetalleCobros);
		
		
		this.jInternalFrameReporteDinamicoCobrarDetalleCobros= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarDetalleCobros = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarDetalleCobros= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Detalle Cobroses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarDetalleCobros = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarDetalleCobros.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelColumnasSelectReporteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarDetalleCobros = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarDetalleCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarDetalleCobros.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarDetalleCobros.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarDetalleCobros.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarDetalleCobros.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarDetalleCobros=new JScrollPane(this.jListColumnasSelectReporteCobrarDetalleCobros);
			
			this.jScrollColumnasSelectReporteCobrarDetalleCobros.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarDetalleCobros.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarDetalleCobros.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jListColumnasSelectReporteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jScrollColumnasSelectReporteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarDetalleCobros = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarDetalleCobros.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarDetalleCobros = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarDetalleCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarDetalleCobros.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarDetalleCobros.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarDetalleCobros.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarDetalleCobros.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarDetalleCobros=new JScrollPane(this.jListRelacionesSelectReporteCobrarDetalleCobros);
			
			this.jScrollRelacionesSelectReporteCobrarDetalleCobros.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarDetalleCobros.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarDetalleCobros.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarDetalleCobros = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCobrarDetalleCobros = new JLabelMe();

		this.jLabelConGraficoDinamicoCobrarDetalleCobros.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelConGraficoDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jCheckBoxConGraficoDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCobrarDetalleCobros = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCobrarDetalleCobros.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelColumnaCategoriaGraficoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCobrarDetalleCobros = new JLabelMe();

		this.jLabelColumnaCategoriaValorCobrarDetalleCobros.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelColumnaCategoriaValorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCobrarDetalleCobros.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCobrarDetalleCobros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jComboBoxColumnaCategoriaValorCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCobrarDetalleCobros = new JLabelMe();

		this.jLabelColumnasValoresGraficoCobrarDetalleCobros.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelColumnasValoresGraficoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCobrarDetalleCobros = new JList<Reporte>();
		this.jListColumnasValoresGraficoCobrarDetalleCobros.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCobrarDetalleCobros.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCobrarDetalleCobros.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarDetalleCobros.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCobrarDetalleCobros.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCobrarDetalleCobros=new JScrollPane(this.jListColumnasValoresGraficoCobrarDetalleCobros);
			
			this.jScrollColumnasValoresGraficoCobrarDetalleCobros.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarDetalleCobros.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCobrarDetalleCobros.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jListColumnasSelectReporteCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jScrollColumnasValoresGraficoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCobrarDetalleCobros = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCobrarDetalleCobros.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelTiposGraficosReportesDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCobrarDetalleCobros = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCobrarDetalleCobros.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCobrarDetalleCobros.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jComboBoxTiposGraficosReportesDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarDetalleCobros = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarDetalleCobros.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelGenerarExcelReporteDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros.setToolTipText("Generar EXCEL"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		//this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jButtonGenerarExcelReporteDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jComboBoxTiposReportesDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarDetalleCobros = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarDetalleCobros.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jLabelTiposArchivoReporteDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarDetalleCobros = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarDetalleCobros.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarDetalleCobros,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarDetalleCobros.setToolTipText("Generar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jButtonGenerarReporteDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarDetalleCobros = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarDetalleCobros.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarDetalleCobros,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarDetalleCobros.setToolTipText("Cancelar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarDetalleCobros.add(this.jButtonCerrarReporteDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarDetalleCobros = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarDetalleCobros= new JScrollPane(jPanelReporteDinamicoCobrarDetalleCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Detalle Cobroses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarDetalleCobros.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarDetalleCobros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarDetalleCobros);
		this.jInternalFrameReporteDinamicoCobrarDetalleCobros.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarDetalleCobros() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarDetalleCobros = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarDetalleCobros.setName("jPanelImportacionCobrarDetalleCobros"); 
		
		this.jPanelImportacionCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarDetalleCobros.setLayout(gridaBagLayoutImportacionCobrarDetalleCobros);
		
		
		this.jInternalFrameImportacionCobrarDetalleCobros= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarDetalleCobros= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarDetalleCobros = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarDetalleCobros= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarDetalleCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarDetalleCobros.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarDetalleCobros.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarDetalleCobros.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarDetalleCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarDetalleCobros.setResizable(true);
	    this.jInternalFrameImportacionCobrarDetalleCobros.setClosable(true);
	    this.jInternalFrameImportacionCobrarDetalleCobros.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarDetalleCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarDetalleCobros.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarDetalleCobros.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarDetalleCobros.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarDetalleCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarDetalleCobros.setResizable(true);
	    this.jInternalFrameImportacionCobrarDetalleCobros.setClosable(true);
	    this.jInternalFrameImportacionCobrarDetalleCobros.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Detalle Cobroses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarDetalleCobros = new JLabelMe();

		this.jLabelArchivoImportacionCobrarDetalleCobros.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarDetalleCobros.add(this.jLabelArchivoImportacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarDetalleCobros = new JFileChooser();		
		this.jFileChooserImportacionCobrarDetalleCobros.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarDetalleCobros = new JButtonMe();
		this.jButtonAbrirImportacionCobrarDetalleCobros.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarDetalleCobros,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarDetalleCobros.setToolTipText("Generar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarDetalleCobros.add(this.jButtonAbrirImportacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarDetalleCobros = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarDetalleCobros.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarDetalleCobros.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarDetalleCobros.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarDetalleCobros.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarDetalleCobros.add(this.jLabelPathArchivoImportacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarDetalleCobros=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarDetalleCobros.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarDetalleCobros.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarDetalleCobros.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarDetalleCobros.add(this.jTextFieldPathArchivoImportacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarDetalleCobros = new JButtonMe();
		this.jButtonGenerarImportacionCobrarDetalleCobros.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarDetalleCobros,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarDetalleCobros.setToolTipText("Generar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarDetalleCobros.add(this.jButtonGenerarImportacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarDetalleCobros = new JButtonMe();
		this.jButtonCerrarImportacionCobrarDetalleCobros.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarDetalleCobros,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarDetalleCobros.setToolTipText("Cancelar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarDetalleCobros.add(this.jButtonCerrarImportacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarDetalleCobros = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarDetalleCobros= new JScrollPane(jPanelImportacionCobrarDetalleCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
		this.gridBagConstraintsCobrarDetalleCobros.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarDetalleCobros.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarDetalleCobros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarDetalleCobros.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarDetalleCobros);
		this.jInternalFrameImportacionCobrarDetalleCobros.getContentPane().add(this.jScrollPanelImportacionCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarDetalleCobros(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarDetalleCobros = new JButtonMe();
			this.jButtonAbrirOrderByCobrarDetalleCobros.setText("Orden");
			this.jButtonAbrirOrderByCobrarDetalleCobros.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarDetalleCobros,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarDetalleCobros";
			inputMap = this.jButtonAbrirOrderByCobrarDetalleCobros.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarDetalleCobros.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarDetalleCobros"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarDetalleCobros = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarDetalleCobros = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarDetalleCobros.setName("jPanelOrderByCobrarDetalleCobros"); 
			
			this.jPanelOrderByCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarDetalleCobros.setLayout(gridaBagLayoutOrderByCobrarDetalleCobros);
			
			
			this.jTableDatosCobrarDetalleCobrosOrderBy = new JTableMe();        
			this.jTableDatosCobrarDetalleCobrosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarDetalleCobrosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarDetalleCobrosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarDetalleCobrosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarDetalleCobrosOrderBy.setViewportView(this.jTableDatosCobrarDetalleCobrosOrderBy);
			this.jTableDatosCobrarDetalleCobrosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarDetalleCobrosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarDetalleCobros= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarDetalleCobros= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarDetalleCobros = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarDetalleCobros= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarDetalleCobros.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarDetalleCobros.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarDetalleCobros.setTitle("Orden");
			this.jInternalFrameOrderByCobrarDetalleCobros.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarDetalleCobros.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarDetalleCobros.setResizable(true);
			this.jInternalFrameOrderByCobrarDetalleCobros.setClosable(true);
			this.jInternalFrameOrderByCobrarDetalleCobros.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarDetalleCobros.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Detalle Cobroses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarDetalleCobros.ipady =150;
				
			this.jPanelOrderByCobrarDetalleCobros.add(jScrollPanelDatosCobrarDetalleCobrosOrderBy, this.gridBagConstraintsCobrarDetalleCobros);//this.jTableDatosCobrarDetalleCobrosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarDetalleCobros = new JButtonMe();
			this.jButtonCerrarOrderByCobrarDetalleCobros.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarDetalleCobros,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarDetalleCobros.setToolTipText("Cancelar"+" "+CobrarDetalleCobrosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarDetalleCobros, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarDetalleCobros.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarDetalleCobros.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarDetalleCobros.add(this.jButtonCerrarOrderByCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarDetalleCobros = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarDetalleCobros= new JScrollPane(jPanelOrderByCobrarDetalleCobros,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarDetalleCobros = new GridBagConstraints();
			this.gridBagConstraintsCobrarDetalleCobros.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarDetalleCobros.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarDetalleCobros.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarDetalleCobros.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarDetalleCobros.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarDetalleCobros);
			
			this.jInternalFrameOrderByCobrarDetalleCobros.getContentPane().add(this.jScrollPanelOrderByCobrarDetalleCobros, this.gridBagConstraintsCobrarDetalleCobros);			
		
		} else {
			this.jButtonAbrirOrderByCobrarDetalleCobros = new JButtonMe();
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
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrardetallecobrosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarDetalleCobros.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarDetalleCobros.getRowHeight();//CobrarDetalleCobrosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros.isSelected()) {
					iHeightTable=CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarDetalleCobros.isSelected()) {
					iHeightTable=CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarDetalleCobrosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarDetalleCobros!=null && this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrardetallecobrosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarDetalleCobros.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarDetalleCobros.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarDetalleCobros.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarDetalleCobros.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarDetalleCobros.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarDetalleCobros.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarDetalleCobros.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrardetallecobrosLogic.getCobrarDetalleCobross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrardetallecobross.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarDetalleCobros> TraerCobrarDetalleCobrosBeans(List<CobrarDetalleCobros> cobrardetallecobross,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarDetalleCobros cobrardetallecobros:cobrardetallecobross) {
					
				if(!(CobrarDetalleCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarDetalleCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrardetallecobros.setsDetalleGeneralEntityReporte(CobrarDetalleCobrosConstantesFunciones.getCobrarDetalleCobrosDescripcion(cobrardetallecobros));
										
						
					
						
					
				} else  {
							
					//cobrardetallecobros.setsDetalleGeneralEntityReporte(cobrardetallecobros.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrardetallecobrosbeans.add(cobrardetallecobrosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrardetallecobross;
    }
	//PARA REPORTES FIN
}
