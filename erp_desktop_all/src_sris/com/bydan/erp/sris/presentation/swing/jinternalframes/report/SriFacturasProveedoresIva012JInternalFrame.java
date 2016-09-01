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
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
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
import com.bydan.erp.sris.util.report.SriFacturasProveedoresIva012ConstantesFunciones;

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
public class SriFacturasProveedoresIva012JInternalFrame extends SriFacturasProveedoresIva012BeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSriFacturasProveedoresIva012;
	
	protected JMenuBar jmenuBarSriFacturasProveedoresIva012;
	
	protected JMenu jmenuSriFacturasProveedoresIva012;
	protected JMenu jmenuDatosSriFacturasProveedoresIva012;
	protected JMenu jmenuArchivoSriFacturasProveedoresIva012;
	protected JMenu jmenuAccionesSriFacturasProveedoresIva012;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriFacturasProveedoresIva012;	
	protected GridBagConstraints gridBagConstraintsSriFacturasProveedoresIva012;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SriFacturasProveedoresIva012DetalleFormJInternalFrame jInternalFrameDetalleFormSriFacturasProveedoresIva012;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSriFacturasProveedoresIva012;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSriFacturasProveedoresIva012;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public SriFacturasProveedoresIva012SessionBean srifacturasproveedoresiva012SessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaprestaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012s;		
	public List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012sEliminados;	
	public List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012sAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySriFacturasProveedoresIva012;		
	protected JButton jButtonAbrirOrderBySriFacturasProveedoresIva012;
	
	
	//protected JPanel jPanelOrderBySriFacturasProveedoresIva012;
	//public JScrollPane jScrollPanelOrderBySriFacturasProveedoresIva012;	
	//protected JButton jButtonCerrarOrderBySriFacturasProveedoresIva012;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SriFacturasProveedoresIva012Logic srifacturasproveedoresiva012Logic;
	
	
	
	public JScrollPane jScrollPanelDatosSriFacturasProveedoresIva012;
	public JScrollPane jScrollPanelDatosEdicionSriFacturasProveedoresIva012;
	public JScrollPane jScrollPanelDatosGeneralSriFacturasProveedoresIva012;
    
	
	
	//public JScrollPane jScrollPanelDatosSriFacturasProveedoresIva012OrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSriFacturasProveedoresIva012;
	//public JScrollPane jScrollPanelImportacionSriFacturasProveedoresIva012;
	
	
	
	protected JPanel jPanelAccionesSriFacturasProveedoresIva012;
	
    protected JPanel jPanelPaginacionSriFacturasProveedoresIva012;
    protected JPanel jPanelParametrosReportesSriFacturasProveedoresIva012;
	protected JPanel jPanelParametrosReportesAccionesSriFacturasProveedoresIva012;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SriFacturasProveedoresIva012;
	protected JPanel jPanelParametrosAuxiliar2SriFacturasProveedoresIva012;
	protected JPanel jPanelParametrosAuxiliar3SriFacturasProveedoresIva012;
	protected JPanel jPanelParametrosAuxiliar4SriFacturasProveedoresIva012;
	//protected JPanel jPanelParametrosAuxiliar5SriFacturasProveedoresIva012;
	
	
	
	//protected JPanel jPanelReporteDinamicoSriFacturasProveedoresIva012;
	//protected JPanel jPanelImportacionSriFacturasProveedoresIva012;
	
	
	public JTable jTableDatosSriFacturasProveedoresIva012;
	
	
	
	//public JTable jTableDatosSriFacturasProveedoresIva012OrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSriFacturasProveedoresIva012;
	protected JButton jButtonDuplicarSriFacturasProveedoresIva012;
	protected JButton jButtonCopiarSriFacturasProveedoresIva012;
	protected JButton jButtonVerFormSriFacturasProveedoresIva012;
	protected JButton jButtonNuevoRelacionesSriFacturasProveedoresIva012;
	protected JButton jButtonModificarSriFacturasProveedoresIva012;
	
    protected JButton jButtonGuardarCambiosTablaSriFacturasProveedoresIva012;
	protected JButton jButtonCerrarSriFacturasProveedoresIva012;
	
	
	protected JButton jButtonRecargarInformacionSriFacturasProveedoresIva012;
	protected JButton jButtonProcesarInformacionSriFacturasProveedoresIva012;
	
	
	protected JButton jButtonAnterioresSriFacturasProveedoresIva012;
	protected JButton jButtonSiguientesSriFacturasProveedoresIva012;
	protected JButton jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSriFacturasProveedoresIva012;
	//protected JButton jButtonCerrarReporteDinamicoSriFacturasProveedoresIva012;
	//protected JButton jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresIva012;	
	
	
	
	//protected JButton jButtonAbrirImportacionSriFacturasProveedoresIva012;
	//protected JButton jButtonGenerarImportacionSriFacturasProveedoresIva012;
	//protected JButton jButtonCerrarImportacionSriFacturasProveedoresIva012;
	//protected JFileChooser jFileChooserImportacionSriFacturasProveedoresIva012;
	//protected File fileImportacionSriFacturasProveedoresIva012;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonDuplicarToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonNuevoRelacionesToolBarSriFacturasProveedoresIva012;
	
	
	public JButton jButtonGuardarCambiosToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonCopiarToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonVerFormToolBarSriFacturasProveedoresIva012;
	public JButton jButtonGuardarCambiosTablaToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonMostrarOcultarTablaToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonCerrarToolBarSriFacturasProveedoresIva012;
	
	protected JButton jButtonRecargarInformacionToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonProcesarInformacionToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonAnterioresToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonSiguientesToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonNuevoGuardarCambiosToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonAbrirOrderByToolBarSriFacturasProveedoresIva012;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemDuplicarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemNuevoRelacionesSriFacturasProveedoresIva012;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemCopiarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemVerFormSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemCerrarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemDetalleCerrarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012;
	
	protected JMenuItem jMenuItemRecargarInformacionSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemProcesarInformacionSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemAnterioresSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemSiguientesSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemAbrirOrderBySriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemMostrarOcultarSriFacturasProveedoresIva012;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriFacturasProveedoresIva012;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012;
	protected JCheckBox jCheckBoxSeleccionadosSriFacturasProveedoresIva012;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012;
	protected JCheckBox jCheckBoxConGraficoReporteSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSriFacturasProveedoresIva012;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSriFacturasProveedoresIva012;
	protected JTextField jTextFieldValorCampoGeneralSriFacturasProveedoresIva012;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSriFacturasProveedoresIva012;
	//public JList<Reporte> jListColumnasSelectReporteSriFacturasProveedoresIva012;
	//public JScrollPane jScrollColumnasSelectReporteSriFacturasProveedoresIva012;
	
	//public JLabel jLabelRelacionesSelectReporteSriFacturasProveedoresIva012;
	//public JList<Reporte> jListRelacionesSelectReporteSriFacturasProveedoresIva012;
	//public JScrollPane jScrollRelacionesSelectReporteSriFacturasProveedoresIva012;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSriFacturasProveedoresIva012;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSriFacturasProveedoresIva012;
	//public JLabel jLabelTiposArchivoReporteDinamicoSriFacturasProveedoresIva012;
	
		
	//public JLabel jLabelArchivoImportacionSriFacturasProveedoresIva012;	
	//public JLabel jLabelPathArchivoImportacionSriFacturasProveedoresIva012;
	//protected JTextField jTextFieldPathArchivoImportacionSriFacturasProveedoresIva012;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSriFacturasProveedoresIva012;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012;
	
	//public JLabel jLabelColumnaCategoriaValorSriFacturasProveedoresIva012;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012;
	
	//public JLabel jLabelColumnasValoresGraficoSriFacturasProveedoresIva012;
	//public JList<Reporte> jListColumnasValoresGraficoSriFacturasProveedoresIva012;
	//public JScrollPane jScrollColumnasValoresGraficoSriFacturasProveedoresIva012;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSriFacturasProveedoresIva012;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedoresIva012;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSriFacturasProveedoresIva012;
	public JPanel jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	public JButton jButtonBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	
	public JPanel jPanelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	public JLabel jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	public JButton jButtonid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012Update= new JButtonMe();
	public JButton jButtonid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012Busqueda= new JButtonMe();

	
	public JPanel jPanelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	public JLabel jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	public JTextField jTextFieldrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012;
	public JButton jButtonrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012Busqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=828;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SriFacturasProveedoresIva012JInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresIva012JInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresIva012JInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresIva012JInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSriFacturasProveedoresIva012)	{
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012 = jButtonRecargarInformacionSriFacturasProveedoresIva012;
	}
	
	public JButton getjButtonProcesarInformacionSriFacturasProveedoresIva012() {
		return this.jButtonProcesarInformacionSriFacturasProveedoresIva012;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriFacturasProveedoresIva012)	{
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012 = jButtonProcesarInformacionSriFacturasProveedoresIva012;
	}
	
	
	public JButton getjButtonRecargarInformacionSriFacturasProveedoresIva012() {
		return this.jButtonRecargarInformacionSriFacturasProveedoresIva012;
	}
	
	
	public List<SriFacturasProveedoresIva012> getsrifacturasproveedoresiva012s() {
		return this.srifacturasproveedoresiva012s;
	}

	public void setsrifacturasproveedoresiva012s(List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012s) {
		this.srifacturasproveedoresiva012s = srifacturasproveedoresiva012s;
	}
	
	public List<SriFacturasProveedoresIva012> getsrifacturasproveedoresiva012sAux() {
		return this.srifacturasproveedoresiva012sAux;
	}

	public void setsrifacturasproveedoresiva012sAux(List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012sAux) {
		this.srifacturasproveedoresiva012sAux = srifacturasproveedoresiva012sAux;
	}
	
	public List<SriFacturasProveedoresIva012> getsrifacturasproveedoresiva012sEliminados() {
		return this.srifacturasproveedoresiva012sEliminados;
	}

	public void setSriFacturasProveedoresIva012sEliminados(List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012sEliminados) {
		this.srifacturasproveedoresiva012sEliminados = srifacturasproveedoresiva012sEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSriFacturasProveedoresIva012() {
		return jComboBoxTiposSeleccionarSriFacturasProveedoresIva012;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposSeleccionarSriFacturasProveedoresIva012) {
		this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012 = jComboBoxTiposSeleccionarSriFacturasProveedoresIva012;
	}
	
	public void setBorderResaltarTiposSeleccionarSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSriFacturasProveedoresIva012() {
		return jTextFieldValorCampoGeneralSriFacturasProveedoresIva012;
	}

	public void setjTextFieldValorCampoGeneralSriFacturasProveedoresIva012(
			JTextField jTextFieldValorCampoGeneralSriFacturasProveedoresIva012) {
		this.jTextFieldValorCampoGeneralSriFacturasProveedoresIva012 = jTextFieldValorCampoGeneralSriFacturasProveedoresIva012;
	}

	public void setBorderResaltarValorCampoGeneralSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSriFacturasProveedoresIva012() {
		return this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012;
	}

	public void setjCheckBoxSeleccionarTodosSriFacturasProveedoresIva012(
			JCheckBox jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012) {
		this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012 = jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012;
	}

	public void setBorderResaltarSeleccionarTodosSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSriFacturasProveedoresIva012() {
		return this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012;
	}

	public void setjCheckBoxSeleccionadosSriFacturasProveedoresIva012(
			JCheckBox jCheckBoxSeleccionadosSriFacturasProveedoresIva012) {
		this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012 = jCheckBoxSeleccionadosSriFacturasProveedoresIva012;
	}
	
	public void setBorderResaltarSeleccionadosSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012) {
		this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012 = jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012;
	}

	public void setBorderResaltarTiposArchivosReportesSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposReportesSriFacturasProveedoresIva012;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposReportesSriFacturasProveedoresIva012) {
		this.jComboBoxTiposReportesSriFacturasProveedoresIva012 = jComboBoxTiposReportesSriFacturasProveedoresIva012;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012() {
	//	return jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012(
	//		JComboBox jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012) {
	//	this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012 = jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012() {
	//	return jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012 = jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012;
	//}
	
	public void setBorderResaltarTiposReportesSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012) {
		this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012 = jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012;
	}
	
	public void setBorderResaltarTiposGraficosReportesSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposPaginacionSriFacturasProveedoresIva012) {
		this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012 = jComboBoxTiposPaginacionSriFacturasProveedoresIva012;
	}
	
	public void setBorderResaltarTiposPaginacionSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposAccionesSriFacturasProveedoresIva012;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposRelacionesSriFacturasProveedoresIva012) {
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012 = jComboBoxTiposRelacionesSriFacturasProveedoresIva012;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposAccionesSriFacturasProveedoresIva012) {
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012 = jComboBoxTiposAccionesSriFacturasProveedoresIva012;
	}
	
	public void setBorderResaltarTiposRelacionesSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSriFacturasProveedoresIva012() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012() {
	//	return jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012;
	//}

	//public void setjCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012(
	//		JCheckBox jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012) {
	//	this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012 = jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSriFacturasProveedoresIva012() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSriFacturasProveedoresIva012.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012 .setBorder(borderResaltar);		
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
		this.srifacturasproveedoresiva012SessionBean=new SriFacturasProveedoresIva012SessionBean();
		
		this.srifacturasproveedoresiva012SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srifacturasproveedoresiva012SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SriFacturasProveedoresIva012JInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SriFacturasProveedoresIva012JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriFacturasProveedoresIva012JInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriFacturasProveedoresIva012JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriFacturasProveedoresIva012JInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Facturas Proveedores Iva012 MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {
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
		
		SriFacturasProveedoresIva012JInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSriFacturasProveedoresIva012= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"nuevo","nuevo","Nuevo"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"duplicar","duplicar","Duplicar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"copiar","copiar","Copiar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"ver_form","ver_form","Ver"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"recargar","recargar","Buscar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSriFacturasProveedoresIva012,this.jTtoolBarSriFacturasProveedoresIva012,
							"cerrar","cerrar","Salir"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSriFacturasProveedoresIva012=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSriFacturasProveedoresIva012;
			
				this.jButtonProcesarInformacionToolBarSriFacturasProveedoresIva012=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSriFacturasProveedoresIva012;
				
		//protected JButton jButtonModificarToolBarSriFacturasProveedoresIva012;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSriFacturasProveedoresIva012=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSriFacturasProveedoresIva012=new JMenuMe("General");
		this.jmenuArchivoSriFacturasProveedoresIva012=new JMenuMe("Archivo");
		this.jmenuAccionesSriFacturasProveedoresIva012=new JMenuMe("Acciones");
		this.jmenuDatosSriFacturasProveedoresIva012=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriFacturasProveedoresIva012= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriFacturasProveedoresIva012.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriFacturasProveedoresIva012,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSriFacturasProveedoresIva012= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSriFacturasProveedoresIva012.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSriFacturasProveedoresIva012,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSriFacturasProveedoresIva012= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSriFacturasProveedoresIva012.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSriFacturasProveedoresIva012,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSriFacturasProveedoresIva012= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSriFacturasProveedoresIva012.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSriFacturasProveedoresIva012,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSriFacturasProveedoresIva012= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSriFacturasProveedoresIva012.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSriFacturasProveedoresIva012,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSriFacturasProveedoresIva012= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSriFacturasProveedoresIva012.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSriFacturasProveedoresIva012,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriFacturasProveedoresIva012= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriFacturasProveedoresIva012.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriFacturasProveedoresIva012,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSriFacturasProveedoresIva012= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSriFacturasProveedoresIva012.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSriFacturasProveedoresIva012,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSriFacturasProveedoresIva012= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSriFacturasProveedoresIva012.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSriFacturasProveedoresIva012,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSriFacturasProveedoresIva012= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSriFacturasProveedoresIva012.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSriFacturasProveedoresIva012,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSriFacturasProveedoresIva012= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSriFacturasProveedoresIva012.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSriFacturasProveedoresIva012,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySriFacturasProveedoresIva012= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySriFacturasProveedoresIva012.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySriFacturasProveedoresIva012,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySriFacturasProveedoresIva012= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySriFacturasProveedoresIva012.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySriFacturasProveedoresIva012,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSriFacturasProveedoresIva012= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSriFacturasProveedoresIva012.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSriFacturasProveedoresIva012,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSriFacturasProveedoresIva012.add(this.jMenuItemCerrarSriFacturasProveedoresIva012);
			
			this.jmenuAccionesSriFacturasProveedoresIva012.add(this.jMenuItemNuevoSriFacturasProveedoresIva012);
			this.jmenuAccionesSriFacturasProveedoresIva012.add(this.jMenuItemNuevoGuardarCambiosSriFacturasProveedoresIva012);
			this.jmenuAccionesSriFacturasProveedoresIva012.add(this.jMenuItemNuevoRelacionesSriFacturasProveedoresIva012);
			this.jmenuAccionesSriFacturasProveedoresIva012.add(this.jMenuItemGuardarCambiosTablaSriFacturasProveedoresIva012);		
			this.jmenuAccionesSriFacturasProveedoresIva012.add(this.jMenuItemDuplicarSriFacturasProveedoresIva012);		
			this.jmenuAccionesSriFacturasProveedoresIva012.add(this.jMenuItemCopiarSriFacturasProveedoresIva012);		
			this.jmenuAccionesSriFacturasProveedoresIva012.add(this.jMenuItemVerFormSriFacturasProveedoresIva012);		
			
			this.jmenuDatosSriFacturasProveedoresIva012.add(this.jMenuItemRecargarInformacionSriFacturasProveedoresIva012);				
			this.jmenuDatosSriFacturasProveedoresIva012.add(this.jMenuItemAnterioresSriFacturasProveedoresIva012);				
			this.jmenuDatosSriFacturasProveedoresIva012.add(this.jMenuItemSiguientesSriFacturasProveedoresIva012);				
			this.jmenuDatosSriFacturasProveedoresIva012.add(this.jMenuItemAbrirOrderBySriFacturasProveedoresIva012);				
			this.jmenuDatosSriFacturasProveedoresIva012.add(this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSriFacturasProveedoresIva012.add(this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSriFacturasProveedoresIva012.add(this.jmenuArchivoSriFacturasProveedoresIva012);		
			this.jmenuBarSriFacturasProveedoresIva012.add(this.jmenuAccionesSriFacturasProveedoresIva012);		
			this.jmenuBarSriFacturasProveedoresIva012.add(this.jmenuDatosSriFacturasProveedoresIva012);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSriFacturasProveedoresIva012);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSriFacturasProveedoresIva012() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setToolTipText("Buscar Por Periodo Declara Por Ruc ");
		this.jButtonBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012= new JButtonMe();
		this.jButtonBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setText("Buscar");
		this.jButtonBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setToolTipText("Buscar Por Periodo Declara Por Ruc ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012,"buscar_button","Buscar Por Periodo Declara Por Ruc ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012 = new JLabelMe();
		jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setText("Periodo Declara :");
		jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012= new JComboBoxMe();
		jComboBoxid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012 = new JLabelMe();
		jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setText("Ruc :");
		jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setToolTipText("Ruc");
		jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSriFacturasProveedoresIva012=new JTabbedPane();


		this.jTabbedPaneBusquedasSriFacturasProveedoresIva012.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSriFacturasProveedoresIva012.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSriFacturasProveedoresIva012.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSriFacturasProveedoresIva012 = new SriFacturasProveedoresIva012DetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sri Facturas Proveedores Iva012 DATOS");
			this.jInternalFrameDetalleFormSriFacturasProveedoresIva012 = new SriFacturasProveedoresIva012DetalleFormJInternalFrame(jDesktopPane,this.srifacturasproveedoresiva012SessionBean.getConGuardarRelaciones(),this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSriFacturasProveedoresIva012 = null;//new SriFacturasProveedoresIva012DetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriFacturasProveedoresIva012= new GridBagLayout();
		
		
		this.jTableDatosSriFacturasProveedoresIva012 = new JTableMe();      
		
		String sToolTipSriFacturasProveedoresIva012="";
		sToolTipSriFacturasProveedoresIva012=SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriFacturasProveedoresIva012+="(Sris.SriFacturasProveedoresIva012)";
		}
		
		if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {
			sToolTipSriFacturasProveedoresIva012+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSriFacturasProveedoresIva012.setToolTipText(sToolTipSriFacturasProveedoresIva012);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSriFacturasProveedoresIva012);
		this.jTableDatosSriFacturasProveedoresIva012.setAutoCreateRowSorter(true);
		this.jTableDatosSriFacturasProveedoresIva012.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSriFacturasProveedoresIva012.setRowSelectionAllowed(true);
		this.jTableDatosSriFacturasProveedoresIva012.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonDuplicarSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonCopiarSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonVerFormSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonNuevoRelacionesSriFacturasProveedoresIva012 = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonCerrarSriFacturasProveedoresIva012 = new JButtonMe();
		
		this.jScrollPanelDatosSriFacturasProveedoresIva012 = new JScrollPane();   
        this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012 = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Facturas Proveedores Iva012";
		
		if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedores Iva012es" + this.sPath));
		} else {
			this.jScrollPanelDatosSriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriFacturasProveedoresIva012.setToolTipText("Acciones");
        this.jPanelAccionesSriFacturasProveedoresIva012.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012=new ReporteDinamicoJInternalFrame(SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSriFacturasProveedoresIva012();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSriFacturasProveedoresIva012=new ImportacionJInternalFrame(SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSriFacturasProveedoresIva012();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySriFacturasProveedoresIva012 = new JButtonMe();
		
		this.jButtonAbrirOrderBySriFacturasProveedoresIva012.setText("Orden");
		this.jButtonAbrirOrderBySriFacturasProveedoresIva012.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriFacturasProveedoresIva012,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriFacturasProveedoresIva012=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriFacturasProveedoresIva012,false,this);
			
			//this.cargarOrderBySriFacturasProveedoresIva012(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySriFacturasProveedoresIva012=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriFacturasProveedoresIva012,true,this);
			
			//this.cargarOrderBySriFacturasProveedoresIva012(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSriFacturasProveedoresIva012.setMinimumSize(new Dimension(400,50));//2830
		this.jTableDatosSriFacturasProveedoresIva012.setMaximumSize(new Dimension(400,50));//2830
		this.jTableDatosSriFacturasProveedoresIva012.setPreferredSize(new Dimension(400,50));//2830
		
		this.jScrollPanelDatosSriFacturasProveedoresIva012.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriFacturasProveedoresIva012.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSriFacturasProveedoresIva012.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSriFacturasProveedoresIva012.setText("Nuevo");
		this.jButtonDuplicarSriFacturasProveedoresIva012.setText("Duplicar");
		this.jButtonCopiarSriFacturasProveedoresIva012.setText("Copiar");
		this.jButtonVerFormSriFacturasProveedoresIva012.setText("Ver");
		this.jButtonNuevoRelacionesSriFacturasProveedoresIva012.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.setText("Guardar");
		this.jButtonCerrarSriFacturasProveedoresIva012.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriFacturasProveedoresIva012,"nuevo_button","Nuevo",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSriFacturasProveedoresIva012,"duplicar_button","Duplicar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSriFacturasProveedoresIva012,"copiar_button","Copiar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSriFacturasProveedoresIva012,"ver_form","Ver",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSriFacturasProveedoresIva012,"nuevorelaciones_button","Nuevo Rel",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012,"guardarcambiostabla_button","Guardar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriFacturasProveedoresIva012,"cerrar_button","Salir",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSriFacturasProveedoresIva012.setToolTipText("Nuevo"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSriFacturasProveedoresIva012.setToolTipText("Duplicar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSriFacturasProveedoresIva012.setToolTipText("Copiar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSriFacturasProveedoresIva012.setToolTipText("Ver"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSriFacturasProveedoresIva012.setToolTipText("Nuevo Rel"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.setToolTipText("Guardar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriFacturasProveedoresIva012.setToolTipText("Salir"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriFacturasProveedoresIva012";
		inputMap = this.jButtonNuevoSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriFacturasProveedoresIva012.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriFacturasProveedoresIva012"));
		
		//DUPLICAR
		sMapKey = "DuplicarSriFacturasProveedoresIva012";
		inputMap = this.jButtonDuplicarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSriFacturasProveedoresIva012.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSriFacturasProveedoresIva012"));
		
		//COPIAR
		sMapKey = "CopiarSriFacturasProveedoresIva012";
		inputMap = this.jButtonCopiarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSriFacturasProveedoresIva012.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSriFacturasProveedoresIva012"));
		
		//VEr FORM
		sMapKey = "VerFormSriFacturasProveedoresIva012";
		inputMap = this.jButtonVerFormSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSriFacturasProveedoresIva012.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSriFacturasProveedoresIva012"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSriFacturasProveedoresIva012";
		inputMap = this.jButtonNuevoRelacionesSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSriFacturasProveedoresIva012"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSriFacturasProveedoresIva012";
		inputMap = this.jButtonModificarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSriFacturasProveedoresIva012"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSriFacturasProveedoresIva012";
		inputMap = this.jButtonCerrarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriFacturasProveedoresIva012"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriFacturasProveedoresIva012";
		inputMap = this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriFacturasProveedoresIva012"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SriFacturasProveedoresIva012= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SriFacturasProveedoresIva012= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SriFacturasProveedoresIva012= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SriFacturasProveedoresIva012= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SriFacturasProveedoresIva012= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSriFacturasProveedoresIva012.setName("jPanelParametrosReportesSriFacturasProveedoresIva012"); 
		
		this.jPanelParametrosReportesAccionesSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSriFacturasProveedoresIva012.setName("jPanelParametrosReportesAccionesSriFacturasProveedoresIva012"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012.setText("Buscar");
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012.setToolTipText("Buscar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSriFacturasProveedoresIva012,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012.setVisible(false);
		
		
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012.setText("Procesar");
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012.setToolTipText("Procesar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012.setVisible(false);
			
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012.setText("TIPO");       
		this.jComboBoxTiposReportesSriFacturasProveedoresIva012.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012.setText("Paginacion");
		this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012.setText("Accion");
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setText("Accion");
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012.setText("Accion");
		this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSriFacturasProveedoresIva012=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSriFacturasProveedoresIva012.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriFacturasProveedoresIva012.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSriFacturasProveedoresIva012.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSriFacturasProveedoresIva012 = new JLabelMe();
		
		this.jLabelAccionesSriFacturasProveedoresIva012.setText("Acciones");		
		this.jLabelAccionesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012 = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012 = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012 = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012 = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012.setText("Graf.");
		this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSriFacturasProveedoresIva012 = new JButtonMe();
		//this.jButtonAnterioresSriFacturasProveedoresIva012.setText("<<");
        this.jButtonAnterioresSriFacturasProveedoresIva012.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSriFacturasProveedoresIva012,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSriFacturasProveedoresIva012 = new JButtonMe();
		//this.jButtonSiguientesSriFacturasProveedoresIva012.setText(">>");
        this.jButtonSiguientesSriFacturasProveedoresIva012.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSriFacturasProveedoresIva012,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012.setText("Nue");
        this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012,"nuevoguardarcambios_button","Nue",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSriFacturasProveedoresIva012";
		inputMap = this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSriFacturasProveedoresIva012"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSriFacturasProveedoresIva012";
		inputMap = this.jButtonRecargarInformacionSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSriFacturasProveedoresIva012"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSriFacturasProveedoresIva012";
		inputMap = this.jButtonSiguientesSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSriFacturasProveedoresIva012"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSriFacturasProveedoresIva012";
		inputMap = this.jButtonAnterioresSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSriFacturasProveedoresIva012"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSriFacturasProveedoresIva012();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(this.getWidth(),SriFacturasProveedoresIva012Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriFacturasProveedoresIva012Bean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(this.getWidth(),SriFacturasProveedoresIva012Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriFacturasProveedoresIva012Bean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(this.getWidth(),SriFacturasProveedoresIva012Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SriFacturasProveedoresIva012Bean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSriFacturasProveedoresIva012 = new GridBagLayout();

			this.jPanelPaginacionSriFacturasProveedoresIva012.setLayout(gridaBagLayoutPaginacionSriFacturasProveedoresIva012);						
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonAnterioresSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
					
						
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
			
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonNuevoGuardarCambiosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
						
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonSiguientesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonNuevoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
						
			
			
			if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
				this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
				this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			}
			
			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonDuplicarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonCopiarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonVerFormSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSriFacturasProveedoresIva012.add(this.jButtonCerrarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSriFacturasProveedoresIva012 = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSriFacturasProveedoresIva012 = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SriFacturasProveedoresIva012 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SriFacturasProveedoresIva012 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SriFacturasProveedoresIva012 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SriFacturasProveedoresIva012 = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.setLayout(gridaBagParametrosReportesSriFacturasProveedoresIva012);
			this.jPanelParametrosReportesAccionesSriFacturasProveedoresIva012.setLayout(gridaBagParametrosReportesAccionesSriFacturasProveedoresIva012);
			
			
			this.jPanelParametrosAuxiliar1SriFacturasProveedoresIva012.setLayout(gridaBagParametrosAuxiliar1SriFacturasProveedoresIva012);
			this.jPanelParametrosAuxiliar2SriFacturasProveedoresIva012.setLayout(gridaBagParametrosAuxiliar2SriFacturasProveedoresIva012);
			this.jPanelParametrosAuxiliar3SriFacturasProveedoresIva012.setLayout(gridaBagParametrosAuxiliar3SriFacturasProveedoresIva012);
			this.jPanelParametrosAuxiliar4SriFacturasProveedoresIva012.setLayout(gridaBagParametrosAuxiliar4SriFacturasProveedoresIva012);
			//this.jPanelParametrosAuxiliar5SriFacturasProveedoresIva012.setLayout(gridaBagParametrosAuxiliar2SriFacturasProveedoresIva012);			
			
			
			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jButtonRecargarInformacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriFacturasProveedoresIva012.add(this.jComboBoxTiposPaginacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriFacturasProveedoresIva012.add(this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SriFacturasProveedoresIva012.add(this.jComboBoxTiposArchivosReportesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jPanelParametrosAuxiliar1SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SriFacturasProveedoresIva012.add(this.jComboBoxTiposReportesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);																		
			
			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SriFacturasProveedoresIva012.add(this.jComboBoxTiposGraficosReportesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jPanelParametrosAuxiliar4SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jComboBoxTiposReportesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jCheckBoxGenerarReporteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jPanelParametrosAuxiliar2SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jLabelAccionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
				this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jButtonAbrirOrderBySriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jComboBoxTiposSeleccionarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
			
			
			/*
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriFacturasProveedoresIva012.add(this.jCheckBoxSeleccionarTodosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);															
				
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriFacturasProveedoresIva012.add(this.jCheckBoxSeleccionadosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);															
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SriFacturasProveedoresIva012.add(this.jCheckBoxConGraficoReporteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jPanelParametrosAuxiliar3SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSriFacturasProveedoresIva012.add(this.jComboBoxTiposAccionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSriFacturasProveedoresIva012 = new GridBagLayout();

			this.jScrollPanelDatosSriFacturasProveedoresIva012.setLayout(gridaBagLayoutDatosSriFacturasProveedoresIva012);
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
			
			this.jScrollPanelDatosSriFacturasProveedoresIva012.add(this.jTableDatosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSriFacturasProveedoresIva012.setViewportView(this.jTableDatosSriFacturasProveedoresIva012);
		this.jTableDatosSriFacturasProveedoresIva012.setFillsViewportHeight(true);
		this.jTableDatosSriFacturasProveedoresIva012.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSriFacturasProveedoresIva012= new GridBagLayout();
		this.jPanelAccionesSriFacturasProveedoresIva012.setLayout(gridaBagLayoutAccionesSriFacturasProveedoresIva012);
		
		
		/*	
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
			
		this.jPanelAccionesSriFacturasProveedoresIva012.add(this.jButtonNuevoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012= new GridBagLayout();
		gridaBagLayoutBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.setLayout(gridaBagLayoutBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012);

		gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
		jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.add(jLabelid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);

		gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
		jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.add(jComboBoxid_periodo_declaraBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);


		gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
		gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
		jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.add(jLabelrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);

		gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedoresIva012.gridy = 1;
		gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
		jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.add(jTextFieldrucBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);

		gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSriFacturasProveedoresIva012.gridy = 2;
		gridBagConstraintsSriFacturasProveedoresIva012.gridx =1;
		jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012.add(jButtonBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);

		jTabbedPaneBusquedasSriFacturasProveedoresIva012.addTab("1.-Por Periodo Declara Por Ruc ", jPanelBusquedaSriFacturasProveedoresIva012SriFacturasProveedoresIva012);
		jTabbedPaneBusquedasSriFacturasProveedoresIva012.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriFacturasProveedoresIva012);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();						
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;		
			//this.gridBagConstraintsSriFacturasProveedoresIva012.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;		
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSriFacturasProveedoresIva012);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);								
		
		
		/*
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		*/		
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriFacturasProveedoresIva012.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
				
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SriFacturasProveedoresIva012JInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSriFacturasProveedoresIva012= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriFacturasProveedoresIva012 = new GridBagLayout();
			this.jPanelBusquedasParametrosSriFacturasProveedoresIva012.setLayout(gridaBagLayoutBusquedasParametrosSriFacturasProveedoresIva012);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			
			
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
			
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSriFacturasProveedoresIva012() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSriFacturasProveedoresIva012 = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.setName("jPanelReporteDinamicoSriFacturasProveedoresIva012"); 
		
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.setLayout(gridaBagLayoutReporteDinamicoSriFacturasProveedoresIva012);
		
		
		this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012 = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setResizable(true);
	    this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setClosable(true);
	    this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedores Iva012es"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelColumnasSelectReporteSriFacturasProveedoresIva012.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelColumnasSelectReporteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSriFacturasProveedoresIva012 = new JList<Reporte>();
		this.jListColumnasSelectReporteSriFacturasProveedoresIva012.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSriFacturasProveedoresIva012.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012=new JScrollPane(this.jListColumnasSelectReporteSriFacturasProveedoresIva012);
			
			this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jListColumnasSelectReporteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelRelacionesSelectReporteSriFacturasProveedoresIva012.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSriFacturasProveedoresIva012 = new JList<Reporte>();
		this.jListRelacionesSelectReporteSriFacturasProveedoresIva012.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSriFacturasProveedoresIva012.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSriFacturasProveedoresIva012=new JScrollPane(this.jListRelacionesSelectReporteSriFacturasProveedoresIva012);
			
			this.jScrollRelacionesSelectReporteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012 = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012 = new JComboBoxMe();
		this.jListColumnasValoresGraficoSriFacturasProveedoresIva012 = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012 = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012 = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelConGraficoDinamicoSriFacturasProveedoresIva012.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelConGraficoDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012 = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jCheckBoxConGraficoDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSriFacturasProveedoresIva012.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelColumnaCategoriaGraficoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelColumnaCategoriaValorSriFacturasProveedoresIva012.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelColumnaCategoriaValorSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jComboBoxColumnaCategoriaValorSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelColumnasValoresGraficoSriFacturasProveedoresIva012.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelColumnasValoresGraficoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSriFacturasProveedoresIva012 = new JList<Reporte>();
		this.jListColumnasValoresGraficoSriFacturasProveedoresIva012.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSriFacturasProveedoresIva012.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSriFacturasProveedoresIva012=new JScrollPane(this.jListColumnasValoresGraficoSriFacturasProveedoresIva012);
			
			this.jScrollColumnasValoresGraficoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jListColumnasSelectReporteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jScrollColumnasValoresGraficoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelTiposGraficosReportesDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSriFacturasProveedoresIva012.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jComboBoxTiposGraficosReportesDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedoresIva012.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelGenerarExcelReporteDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresIva012.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresIva012,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresIva012.setToolTipText("Generar EXCEL"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jComboBoxTiposReportesDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedoresIva012.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jLabelTiposArchivoReporteDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jComboBoxTiposArchivosReportesDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSriFacturasProveedoresIva012.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSriFacturasProveedoresIva012,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSriFacturasProveedoresIva012.setToolTipText("Generar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jButtonGenerarReporteDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSriFacturasProveedoresIva012.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSriFacturasProveedoresIva012,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSriFacturasProveedoresIva012.setToolTipText("Cancelar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSriFacturasProveedoresIva012.add(this.jButtonCerrarReporteDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSriFacturasProveedoresIva012 = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012= new JScrollPane(jPanelReporteDinamicoSriFacturasProveedoresIva012,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedores Iva012es"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSriFacturasProveedoresIva012);
		this.jInternalFrameReporteDinamicoSriFacturasProveedoresIva012.getContentPane().add(this.jScrollPanelReporteDinamicoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSriFacturasProveedoresIva012() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSriFacturasProveedoresIva012 = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSriFacturasProveedoresIva012.setName("jPanelImportacionSriFacturasProveedoresIva012"); 
		
		this.jPanelImportacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSriFacturasProveedoresIva012.setLayout(gridaBagLayoutImportacionSriFacturasProveedoresIva012);
		
		
		this.jInternalFrameImportacionSriFacturasProveedoresIva012= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSriFacturasProveedoresIva012= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSriFacturasProveedoresIva012 = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setResizable(true);
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setClosable(true);
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setResizable(true);
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setClosable(true);
	    this.jInternalFrameImportacionSriFacturasProveedoresIva012.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedores Iva012es"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelArchivoImportacionSriFacturasProveedoresIva012.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriFacturasProveedoresIva012.add(this.jLabelArchivoImportacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSriFacturasProveedoresIva012 = new JFileChooser();		
		this.jFileChooserImportacionSriFacturasProveedoresIva012.setToolTipText("ESCOGER ARCHIVO"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonAbrirImportacionSriFacturasProveedoresIva012.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSriFacturasProveedoresIva012,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSriFacturasProveedoresIva012.setToolTipText("Generar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedoresIva012.add(this.jButtonAbrirImportacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSriFacturasProveedoresIva012 = new JLabelMe();

		this.jLabelPathArchivoImportacionSriFacturasProveedoresIva012.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYImportacion;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSriFacturasProveedoresIva012.add(this.jLabelPathArchivoImportacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSriFacturasProveedoresIva012=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedoresIva012.add(this.jTextFieldPathArchivoImportacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonGenerarImportacionSriFacturasProveedoresIva012.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSriFacturasProveedoresIva012,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSriFacturasProveedoresIva012.setToolTipText("Generar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedoresIva012.add(this.jButtonGenerarImportacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonCerrarImportacionSriFacturasProveedoresIva012.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSriFacturasProveedoresIva012,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSriFacturasProveedoresIva012.setToolTipText("Cancelar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSriFacturasProveedoresIva012.add(this.jButtonCerrarImportacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSriFacturasProveedoresIva012 = new GridBagLayout();
		
		this.jScrollPanelImportacionSriFacturasProveedoresIva012= new JScrollPane(jPanelImportacionSriFacturasProveedoresIva012,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iPosYImportacion;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iPosXImportacion;
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSriFacturasProveedoresIva012);
		this.jInternalFrameImportacionSriFacturasProveedoresIva012.getContentPane().add(this.jScrollPanelImportacionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySriFacturasProveedoresIva012(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySriFacturasProveedoresIva012 = new JButtonMe();
			this.jButtonAbrirOrderBySriFacturasProveedoresIva012.setText("Orden");
			this.jButtonAbrirOrderBySriFacturasProveedoresIva012.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySriFacturasProveedoresIva012,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySriFacturasProveedoresIva012";
			inputMap = this.jButtonAbrirOrderBySriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySriFacturasProveedoresIva012"));
		
		
			GridBagLayout gridaBagLayoutOrderBySriFacturasProveedoresIva012 = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySriFacturasProveedoresIva012.setName("jPanelOrderBySriFacturasProveedoresIva012"); 
			
			this.jPanelOrderBySriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySriFacturasProveedoresIva012.setLayout(gridaBagLayoutOrderBySriFacturasProveedoresIva012);
			
			
			this.jTableDatosSriFacturasProveedoresIva012OrderBy = new JTableMe();        
			this.jTableDatosSriFacturasProveedoresIva012OrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSriFacturasProveedoresIva012OrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSriFacturasProveedoresIva012OrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSriFacturasProveedoresIva012OrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSriFacturasProveedoresIva012OrderBy.setViewportView(this.jTableDatosSriFacturasProveedoresIva012OrderBy);
			this.jTableDatosSriFacturasProveedoresIva012OrderBy.setFillsViewportHeight(true);
			this.jTableDatosSriFacturasProveedoresIva012OrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySriFacturasProveedoresIva012= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySriFacturasProveedoresIva012= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySriFacturasProveedoresIva012 = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSriFacturasProveedoresIva012= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setTitle("Orden");
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setResizable(true);
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setClosable(true);
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedores Iva012es"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSriFacturasProveedoresIva012.ipady =150;
				
			this.jPanelOrderBySriFacturasProveedoresIva012.add(jScrollPanelDatosSriFacturasProveedoresIva012OrderBy, this.gridBagConstraintsSriFacturasProveedoresIva012);//this.jTableDatosSriFacturasProveedoresIva012Totales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySriFacturasProveedoresIva012 = new JButtonMe();
			this.jButtonCerrarOrderBySriFacturasProveedoresIva012.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySriFacturasProveedoresIva012,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySriFacturasProveedoresIva012.setToolTipText("Cancelar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySriFacturasProveedoresIva012.add(this.jButtonCerrarOrderBySriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSriFacturasProveedoresIva012 = new GridBagLayout();
			
			this.jScrollPanelOrderBySriFacturasProveedoresIva012= new JScrollPane(jPanelOrderBySriFacturasProveedoresIva012,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iPosYOrderBy;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iPosXOrderBy;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSriFacturasProveedoresIva012);
			
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getContentPane().add(this.jScrollPanelOrderBySriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
		
		} else {
			this.jButtonAbrirOrderBySriFacturasProveedoresIva012 = new JButtonMe();
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
		int iWidthTableCalculado=0;//5830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.srifacturasproveedoresiva012SessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSriFacturasProveedoresIva012.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSriFacturasProveedoresIva012.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSriFacturasProveedoresIva012.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosSriFacturasProveedoresIva012.getRowHeight();//SriFacturasProveedoresIva012ConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012.isSelected()) {
					iHeightTable=SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSriFacturasProveedoresIva012.isSelected()) {
					iHeightTable=SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SriFacturasProveedoresIva012ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySriFacturasProveedoresIva012!=null && this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjTableDatosOrderBy()!=null) {
			//if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySriFacturasProveedoresIva012.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=srifacturasproveedoresiva012Logic.getSriFacturasProveedoresIva012s().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=srifacturasproveedoresiva012s.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SriFacturasProveedoresIva012> TraerSriFacturasProveedoresIva012Beans(List<SriFacturasProveedoresIva012> srifacturasproveedoresiva012s,ArrayList<Classe> classes)throws Exception {
		try {
			for(SriFacturasProveedoresIva012 srifacturasproveedoresiva012:srifacturasproveedoresiva012s) {
					
				if(!(SriFacturasProveedoresIva012ConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SriFacturasProveedoresIva012ConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					srifacturasproveedoresiva012.setsDetalleGeneralEntityReporte(SriFacturasProveedoresIva012ConstantesFunciones.getSriFacturasProveedoresIva012Descripcion(srifacturasproveedoresiva012));
										
						
					
						
					
				} else  {
							
					//srifacturasproveedoresiva012.setsDetalleGeneralEntityReporte(srifacturasproveedoresiva012.getsDetalleGeneralEntityReporte());
										
				}
				
				//srifacturasproveedoresiva012beans.add(srifacturasproveedoresiva012bean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return srifacturasproveedoresiva012s;
    }
	//PARA REPORTES FIN
}
