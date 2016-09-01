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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoMaquinaEmpresaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoMaquinaEmpresaJInternalFrame extends TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMaquinaEmpresa;
	
	protected JMenuBar jmenuBarTipoMaquinaEmpresa;
	
	protected JMenu jmenuTipoMaquinaEmpresa;
	protected JMenu jmenuDatosTipoMaquinaEmpresa;
	protected JMenu jmenuArchivoTipoMaquinaEmpresa;
	protected JMenu jmenuAccionesTipoMaquinaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMaquinaEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoMaquinaEmpresa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMaquinaEmpresaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMaquinaEmpresa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMaquinaEmpresa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMaquinaEmpresa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMaquinaEmpresa> tipomaquinaempresas;		
	public List<TipoMaquinaEmpresa> tipomaquinaempresasEliminados;	
	public List<TipoMaquinaEmpresa> tipomaquinaempresasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMaquinaEmpresa;		
	protected JButton jButtonAbrirOrderByTipoMaquinaEmpresa;
	
	
	//protected JPanel jPanelOrderByTipoMaquinaEmpresa;
	//public JScrollPane jScrollPanelOrderByTipoMaquinaEmpresa;	
	//protected JButton jButtonCerrarOrderByTipoMaquinaEmpresa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMaquinaEmpresaLogic tipomaquinaempresaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMaquinaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoMaquinaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoMaquinaEmpresa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMaquinaEmpresaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMaquinaEmpresa;
	//public JScrollPane jScrollPanelImportacionTipoMaquinaEmpresa;
	
	
	
	protected JPanel jPanelAccionesTipoMaquinaEmpresa;
	
    protected JPanel jPanelPaginacionTipoMaquinaEmpresa;
    protected JPanel jPanelParametrosReportesTipoMaquinaEmpresa;
	protected JPanel jPanelParametrosReportesAccionesTipoMaquinaEmpresa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMaquinaEmpresa;
	protected JPanel jPanelParametrosAuxiliar2TipoMaquinaEmpresa;
	protected JPanel jPanelParametrosAuxiliar3TipoMaquinaEmpresa;
	protected JPanel jPanelParametrosAuxiliar4TipoMaquinaEmpresa;
	//protected JPanel jPanelParametrosAuxiliar5TipoMaquinaEmpresa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMaquinaEmpresa;
	//protected JPanel jPanelImportacionTipoMaquinaEmpresa;
	
	
	public JTable jTableDatosTipoMaquinaEmpresa;
	
	
	
	//public JTable jTableDatosTipoMaquinaEmpresaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMaquinaEmpresa;
	protected JButton jButtonDuplicarTipoMaquinaEmpresa;
	protected JButton jButtonCopiarTipoMaquinaEmpresa;
	protected JButton jButtonVerFormTipoMaquinaEmpresa;
	protected JButton jButtonNuevoRelacionesTipoMaquinaEmpresa;
	protected JButton jButtonModificarTipoMaquinaEmpresa;
	
    protected JButton jButtonGuardarCambiosTablaTipoMaquinaEmpresa;
	protected JButton jButtonCerrarTipoMaquinaEmpresa;
	
	
	protected JButton jButtonRecargarInformacionTipoMaquinaEmpresa;
	protected JButton jButtonProcesarInformacionTipoMaquinaEmpresa;
	
	
	protected JButton jButtonAnterioresTipoMaquinaEmpresa;
	protected JButton jButtonSiguientesTipoMaquinaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosTipoMaquinaEmpresa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMaquinaEmpresa;
	//protected JButton jButtonCerrarReporteDinamicoTipoMaquinaEmpresa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMaquinaEmpresa;
	//protected JButton jButtonGenerarImportacionTipoMaquinaEmpresa;
	//protected JButton jButtonCerrarImportacionTipoMaquinaEmpresa;
	//protected JFileChooser jFileChooserImportacionTipoMaquinaEmpresa;
	//protected File fileImportacionTipoMaquinaEmpresa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMaquinaEmpresa;
	protected JButton jButtonDuplicarToolBarTipoMaquinaEmpresa;
	protected JButton jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMaquinaEmpresa;
	protected JButton jButtonCopiarToolBarTipoMaquinaEmpresa;
	protected JButton jButtonVerFormToolBarTipoMaquinaEmpresa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMaquinaEmpresa;
	protected JButton jButtonCerrarToolBarTipoMaquinaEmpresa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMaquinaEmpresa;
	protected JButton jButtonProcesarInformacionToolBarTipoMaquinaEmpresa;
	protected JButton jButtonAnterioresToolBarTipoMaquinaEmpresa;
	protected JButton jButtonSiguientesToolBarTipoMaquinaEmpresa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMaquinaEmpresa;
	protected JButton jButtonAbrirOrderByToolBarTipoMaquinaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemDuplicarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMaquinaEmpresa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemCopiarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemVerFormTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemCerrarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemProcesarInformacionTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemAnterioresTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemSiguientesTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemAbrirOrderByTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoMaquinaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMaquinaEmpresa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMaquinaEmpresa;
	protected JCheckBox jCheckBoxSeleccionadosTipoMaquinaEmpresa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMaquinaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMaquinaEmpresa;
	protected JTextField jTextFieldValorCampoGeneralTipoMaquinaEmpresa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMaquinaEmpresa;
	//public JList<Reporte> jListColumnasSelectReporteTipoMaquinaEmpresa;
	//public JScrollPane jScrollColumnasSelectReporteTipoMaquinaEmpresa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMaquinaEmpresa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMaquinaEmpresa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMaquinaEmpresa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMaquinaEmpresa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMaquinaEmpresa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMaquinaEmpresa;
	
		
	//public JLabel jLabelArchivoImportacionTipoMaquinaEmpresa;	
	//public JLabel jLabelPathArchivoImportacionTipoMaquinaEmpresa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMaquinaEmpresa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMaquinaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMaquinaEmpresa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMaquinaEmpresa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMaquinaEmpresa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMaquinaEmpresa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMaquinaEmpresa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMaquinaEmpresa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMaquinaEmpresa;
	public JPanel jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa;
	public JButton jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa;
	public JPanel jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa;
	public JButton jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa;
	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresaArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa;
	public JLabel jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa;
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresaArbol= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public TipoMaquinaEmpresaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMaquinaEmpresaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMaquinaEmpresaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMaquinaEmpresaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMaquinaEmpresa)	{
		this.jButtonRecargarInformacionTipoMaquinaEmpresa = jButtonRecargarInformacionTipoMaquinaEmpresa;
	}
	
	public JButton getjButtonProcesarInformacionTipoMaquinaEmpresa() {
		return this.jButtonProcesarInformacionTipoMaquinaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMaquinaEmpresa)	{
		this.jButtonProcesarInformacionTipoMaquinaEmpresa = jButtonProcesarInformacionTipoMaquinaEmpresa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMaquinaEmpresa() {
		return this.jButtonRecargarInformacionTipoMaquinaEmpresa;
	}
	
	
	public List<TipoMaquinaEmpresa> gettipomaquinaempresas() {
		return this.tipomaquinaempresas;
	}

	public void settipomaquinaempresas(List<TipoMaquinaEmpresa> tipomaquinaempresas) {
		this.tipomaquinaempresas = tipomaquinaempresas;
	}
	
	public List<TipoMaquinaEmpresa> gettipomaquinaempresasAux() {
		return this.tipomaquinaempresasAux;
	}

	public void settipomaquinaempresasAux(List<TipoMaquinaEmpresa> tipomaquinaempresasAux) {
		this.tipomaquinaempresasAux = tipomaquinaempresasAux;
	}
	
	public List<TipoMaquinaEmpresa> gettipomaquinaempresasEliminados() {
		return this.tipomaquinaempresasEliminados;
	}

	public void setTipoMaquinaEmpresasEliminados(List<TipoMaquinaEmpresa> tipomaquinaempresasEliminados) {
		this.tipomaquinaempresasEliminados = tipomaquinaempresasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMaquinaEmpresa() {
		return jComboBoxTiposSeleccionarTipoMaquinaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposSeleccionarTipoMaquinaEmpresa) {
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa = jComboBoxTiposSeleccionarTipoMaquinaEmpresa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMaquinaEmpresa() {
		return jTextFieldValorCampoGeneralTipoMaquinaEmpresa;
	}

	public void setjTextFieldValorCampoGeneralTipoMaquinaEmpresa(
			JTextField jTextFieldValorCampoGeneralTipoMaquinaEmpresa) {
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa = jTextFieldValorCampoGeneralTipoMaquinaEmpresa;
	}

	public void setBorderResaltarValorCampoGeneralTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMaquinaEmpresa() {
		return this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa;
	}

	public void setjCheckBoxSeleccionarTodosTipoMaquinaEmpresa(
			JCheckBox jCheckBoxSeleccionarTodosTipoMaquinaEmpresa) {
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa = jCheckBoxSeleccionarTodosTipoMaquinaEmpresa;
	}

	public void setBorderResaltarSeleccionarTodosTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMaquinaEmpresa() {
		return this.jCheckBoxSeleccionadosTipoMaquinaEmpresa;
	}

	public void setjCheckBoxSeleccionadosTipoMaquinaEmpresa(
			JCheckBox jCheckBoxSeleccionadosTipoMaquinaEmpresa) {
		this.jCheckBoxSeleccionadosTipoMaquinaEmpresa = jCheckBoxSeleccionadosTipoMaquinaEmpresa;
	}
	
	public void setBorderResaltarSeleccionadosTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMaquinaEmpresa() {
		return this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposArchivosReportesTipoMaquinaEmpresa) {
		this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa = jComboBoxTiposArchivosReportesTipoMaquinaEmpresa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMaquinaEmpresa() {
		return this.jComboBoxTiposReportesTipoMaquinaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposReportesTipoMaquinaEmpresa) {
		this.jComboBoxTiposReportesTipoMaquinaEmpresa = jComboBoxTiposReportesTipoMaquinaEmpresa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMaquinaEmpresa() {
	//	return jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMaquinaEmpresa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa) {
	//	this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa = jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa = jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa;
	//}
	
	public void setBorderResaltarTiposReportesTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMaquinaEmpresa() {
		return this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposGraficosReportesTipoMaquinaEmpresa) {
		this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa = jComboBoxTiposGraficosReportesTipoMaquinaEmpresa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMaquinaEmpresa() {
		return this.jComboBoxTiposPaginacionTipoMaquinaEmpresa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposPaginacionTipoMaquinaEmpresa) {
		this.jComboBoxTiposPaginacionTipoMaquinaEmpresa = jComboBoxTiposPaginacionTipoMaquinaEmpresa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMaquinaEmpresa() {
		return this.jComboBoxTiposRelacionesTipoMaquinaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMaquinaEmpresa() {
		return this.jComboBoxTiposAccionesTipoMaquinaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoMaquinaEmpresa) {
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa = jComboBoxTiposRelacionesTipoMaquinaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposAccionesTipoMaquinaEmpresa) {
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa = jComboBoxTiposAccionesTipoMaquinaEmpresa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMaquinaEmpresa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMaquinaEmpresa() {
	//	return jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMaquinaEmpresa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa) {
	//	this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa = jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMaquinaEmpresa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMaquinaEmpresa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa .setBorder(borderResaltar);		
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
		this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
		
		this.tipomaquinaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomaquinaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMaquinaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Maquina Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMaquinaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMaquinaEmpresa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"nuevo","nuevo","Nuevo"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"duplicar","duplicar","Duplicar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"copiar","copiar","Copiar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"ver_form","ver_form","Ver"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"recargar","recargar","Recargar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMaquinaEmpresa,this.jTtoolBarTipoMaquinaEmpresa,
							"cerrar","cerrar","Salir"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMaquinaEmpresa;
			
				this.jButtonProcesarInformacionToolBarTipoMaquinaEmpresa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMaquinaEmpresa;
				
		//protected JButton jButtonModificarToolBarTipoMaquinaEmpresa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMaquinaEmpresa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMaquinaEmpresa=new JMenuMe("General");
		this.jmenuArchivoTipoMaquinaEmpresa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMaquinaEmpresa=new JMenuMe("Acciones");
		this.jmenuDatosTipoMaquinaEmpresa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMaquinaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMaquinaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMaquinaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMaquinaEmpresa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMaquinaEmpresa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMaquinaEmpresa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMaquinaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMaquinaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMaquinaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMaquinaEmpresa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMaquinaEmpresa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMaquinaEmpresa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMaquinaEmpresa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMaquinaEmpresa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMaquinaEmpresa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMaquinaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMaquinaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMaquinaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMaquinaEmpresa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMaquinaEmpresa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMaquinaEmpresa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMaquinaEmpresa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMaquinaEmpresa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMaquinaEmpresa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMaquinaEmpresa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMaquinaEmpresa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMaquinaEmpresa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMaquinaEmpresa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMaquinaEmpresa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMaquinaEmpresa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMaquinaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMaquinaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMaquinaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMaquinaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMaquinaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMaquinaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMaquinaEmpresa.add(this.jMenuItemCerrarTipoMaquinaEmpresa);
			
			this.jmenuAccionesTipoMaquinaEmpresa.add(this.jMenuItemNuevoTipoMaquinaEmpresa);
			this.jmenuAccionesTipoMaquinaEmpresa.add(this.jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa);
			this.jmenuAccionesTipoMaquinaEmpresa.add(this.jMenuItemNuevoRelacionesTipoMaquinaEmpresa);
			this.jmenuAccionesTipoMaquinaEmpresa.add(this.jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa);		
			this.jmenuAccionesTipoMaquinaEmpresa.add(this.jMenuItemDuplicarTipoMaquinaEmpresa);		
			this.jmenuAccionesTipoMaquinaEmpresa.add(this.jMenuItemCopiarTipoMaquinaEmpresa);		
			this.jmenuAccionesTipoMaquinaEmpresa.add(this.jMenuItemVerFormTipoMaquinaEmpresa);		
			
			this.jmenuDatosTipoMaquinaEmpresa.add(this.jMenuItemRecargarInformacionTipoMaquinaEmpresa);				
			this.jmenuDatosTipoMaquinaEmpresa.add(this.jMenuItemAnterioresTipoMaquinaEmpresa);				
			this.jmenuDatosTipoMaquinaEmpresa.add(this.jMenuItemSiguientesTipoMaquinaEmpresa);				
			this.jmenuDatosTipoMaquinaEmpresa.add(this.jMenuItemAbrirOrderByTipoMaquinaEmpresa);				
			this.jmenuDatosTipoMaquinaEmpresa.add(this.jMenuItemMostrarOcultarTipoMaquinaEmpresa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMaquinaEmpresa.add(this.jMenuItemGuardarCambiosTipoMaquinaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMaquinaEmpresa.add(this.jmenuArchivoTipoMaquinaEmpresa);		
			this.jmenuBarTipoMaquinaEmpresa.add(this.jmenuAccionesTipoMaquinaEmpresa);		
			this.jmenuBarTipoMaquinaEmpresa.add(this.jmenuDatosTipoMaquinaEmpresa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMaquinaEmpresa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMaquinaEmpresa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setToolTipText("Buscar Por Cuenta Contable Credito ");
		this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setToolTipText("Buscar Por Cuenta Contable Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa,"buscar_button","Buscar Por Cuenta Contable Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setText("Cuenta Contable Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setToolTipText("Cuenta Contable Credito");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setToolTipText("Buscar Por Cuenta Contable Debito ");
		this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa= new JButtonMe();
		this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setText("Buscar");
		this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setToolTipText("Buscar Por Cuenta Contable Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa,"buscar_button","Buscar Por Cuenta Contable Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa = new JLabelMe();
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setText("Cuenta Contable Debito :");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setToolTipText("Cuenta Contable Debito");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoMaquinaEmpresa=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMaquinaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMaquinaEmpresa = new TipoMaquinaEmpresaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Maquina Empresa DATOS");
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa = new TipoMaquinaEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipomaquinaempresaSessionBean.getConGuardarRelaciones(),this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMaquinaEmpresa = null;//new TipoMaquinaEmpresaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMaquinaEmpresa= new GridBagLayout();
		
		
		this.jTableDatosTipoMaquinaEmpresa = new JTableMe();      
		
		String sToolTipTipoMaquinaEmpresa="";
		sToolTipTipoMaquinaEmpresa=TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMaquinaEmpresa+="(Produccion.TipoMaquinaEmpresa)";
		}
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMaquinaEmpresa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMaquinaEmpresa.setToolTipText(sToolTipTipoMaquinaEmpresa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMaquinaEmpresa);
		this.jTableDatosTipoMaquinaEmpresa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMaquinaEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMaquinaEmpresa.setRowSelectionAllowed(true);
		this.jTableDatosTipoMaquinaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonDuplicarTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonCopiarTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonVerFormTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonCerrarTipoMaquinaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoMaquinaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMaquinaEmpresa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Maquina Empresa";
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Maquina Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMaquinaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMaquinaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoMaquinaEmpresa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa=new ReporteDinamicoJInternalFrame(TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMaquinaEmpresa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMaquinaEmpresa=new ImportacionJInternalFrame(TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMaquinaEmpresa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMaquinaEmpresa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMaquinaEmpresa.setText("Orden");
		this.jButtonAbrirOrderByTipoMaquinaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMaquinaEmpresa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMaquinaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMaquinaEmpresa,false,this);
			
			//this.cargarOrderByTipoMaquinaEmpresa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMaquinaEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMaquinaEmpresa,true,this);
			
			//this.cargarOrderByTipoMaquinaEmpresa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMaquinaEmpresa.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosTipoMaquinaEmpresa.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosTipoMaquinaEmpresa.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosTipoMaquinaEmpresa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMaquinaEmpresa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMaquinaEmpresa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMaquinaEmpresa.setText("Nuevo");
		this.jButtonDuplicarTipoMaquinaEmpresa.setText("Duplicar");
		this.jButtonCopiarTipoMaquinaEmpresa.setText("Copiar");
		this.jButtonVerFormTipoMaquinaEmpresa.setText("Ver");
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.setText("Guardar");
		this.jButtonCerrarTipoMaquinaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMaquinaEmpresa,"nuevo_button","Nuevo",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMaquinaEmpresa,"duplicar_button","Duplicar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMaquinaEmpresa,"copiar_button","Copiar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMaquinaEmpresa,"ver_form","Ver",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMaquinaEmpresa,"nuevorelaciones_button","Nuevo Rel",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa,"guardarcambiostabla_button","Guardar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMaquinaEmpresa,"cerrar_button","Salir",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMaquinaEmpresa.setToolTipText("Nuevo"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMaquinaEmpresa.setToolTipText("Duplicar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMaquinaEmpresa.setToolTipText("Copiar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMaquinaEmpresa.setToolTipText("Ver"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa.setToolTipText("Nuevo Rel"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.setToolTipText("Guardar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMaquinaEmpresa.setToolTipText("Salir"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMaquinaEmpresa";
		inputMap = this.jButtonNuevoTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMaquinaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMaquinaEmpresa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMaquinaEmpresa";
		inputMap = this.jButtonDuplicarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMaquinaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMaquinaEmpresa"));
		
		//COPIAR
		sMapKey = "CopiarTipoMaquinaEmpresa";
		inputMap = this.jButtonCopiarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMaquinaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMaquinaEmpresa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMaquinaEmpresa";
		inputMap = this.jButtonVerFormTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMaquinaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMaquinaEmpresa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMaquinaEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMaquinaEmpresa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMaquinaEmpresa";
		inputMap = this.jButtonModificarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMaquinaEmpresa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMaquinaEmpresa";
		inputMap = this.jButtonCerrarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMaquinaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMaquinaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMaquinaEmpresa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMaquinaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMaquinaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMaquinaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMaquinaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMaquinaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMaquinaEmpresa.setName("jPanelParametrosReportesTipoMaquinaEmpresa"); 
		
		this.jPanelParametrosReportesAccionesTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMaquinaEmpresa.setName("jPanelParametrosReportesAccionesTipoMaquinaEmpresa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.setText("Recargar");
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.setToolTipText("Recargar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMaquinaEmpresa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonProcesarInformacionTipoMaquinaEmpresa.setText("Procesar");
		this.jButtonProcesarInformacionTipoMaquinaEmpresa.setToolTipText("Procesar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMaquinaEmpresa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMaquinaEmpresa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMaquinaEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoMaquinaEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMaquinaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMaquinaEmpresa = new JButtonMe();
		//this.jButtonAnterioresTipoMaquinaEmpresa.setText("<<");
        this.jButtonAnterioresTipoMaquinaEmpresa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMaquinaEmpresa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMaquinaEmpresa = new JButtonMe();
		//this.jButtonSiguientesTipoMaquinaEmpresa.setText(">>");
        this.jButtonSiguientesTipoMaquinaEmpresa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMaquinaEmpresa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa,"nuevoguardarcambios_button","Nue",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMaquinaEmpresa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMaquinaEmpresa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMaquinaEmpresa";
		inputMap = this.jButtonRecargarInformacionTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMaquinaEmpresa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMaquinaEmpresa";
		inputMap = this.jButtonSiguientesTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMaquinaEmpresa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMaquinaEmpresa";
		inputMap = this.jButtonAnterioresTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMaquinaEmpresa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMaquinaEmpresa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setMinimumSize(new Dimension(this.getWidth(),TipoMaquinaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMaquinaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setMaximumSize(new Dimension(this.getWidth(),TipoMaquinaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMaquinaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setPreferredSize(new Dimension(this.getWidth(),TipoMaquinaEmpresaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMaquinaEmpresaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMaquinaEmpresa = new GridBagLayout();

			this.jPanelPaginacionTipoMaquinaEmpresa.setLayout(gridaBagLayoutPaginacionTipoMaquinaEmpresa);						
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonAnterioresTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
					
						
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
			
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonNuevoGuardarCambiosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
						
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonSiguientesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonNuevoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
				this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonNuevoRelacionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			}
			
			
			if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
				this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			}
			
			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonDuplicarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonCopiarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonVerFormTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMaquinaEmpresa.add(this.jButtonCerrarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMaquinaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMaquinaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMaquinaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMaquinaEmpresa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMaquinaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMaquinaEmpresa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMaquinaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMaquinaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMaquinaEmpresa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMaquinaEmpresa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMaquinaEmpresa.setLayout(gridaBagParametrosReportesTipoMaquinaEmpresa);
			this.jPanelParametrosReportesAccionesTipoMaquinaEmpresa.setLayout(gridaBagParametrosReportesAccionesTipoMaquinaEmpresa);
			
			
			this.jPanelParametrosAuxiliar1TipoMaquinaEmpresa.setLayout(gridaBagParametrosAuxiliar1TipoMaquinaEmpresa);
			this.jPanelParametrosAuxiliar2TipoMaquinaEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoMaquinaEmpresa);
			this.jPanelParametrosAuxiliar3TipoMaquinaEmpresa.setLayout(gridaBagParametrosAuxiliar3TipoMaquinaEmpresa);
			this.jPanelParametrosAuxiliar4TipoMaquinaEmpresa.setLayout(gridaBagParametrosAuxiliar4TipoMaquinaEmpresa);
			//this.jPanelParametrosAuxiliar5TipoMaquinaEmpresa.setLayout(gridaBagParametrosAuxiliar2TipoMaquinaEmpresa);			
			
			
			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jButtonRecargarInformacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMaquinaEmpresa.add(this.jComboBoxTiposPaginacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMaquinaEmpresa.add(this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMaquinaEmpresa.add(this.jComboBoxTiposArchivosReportesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jPanelParametrosAuxiliar1TipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMaquinaEmpresa.add(this.jComboBoxTiposReportesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);																		
			
			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoMaquinaEmpresa.add(this.jComboBoxTiposGraficosReportesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jPanelParametrosAuxiliar4TipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jComboBoxTiposReportesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jCheckBoxGenerarReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jPanelParametrosAuxiliar2TipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jLabelAccionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jButtonAbrirOrderByTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jComboBoxTiposSeleccionarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
			
			
			/*
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMaquinaEmpresa.add(this.jCheckBoxSeleccionarTodosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);															
				
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMaquinaEmpresa.add(this.jCheckBoxSeleccionadosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);															
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMaquinaEmpresa.add(this.jCheckBoxConGraficoReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jPanelParametrosAuxiliar3TipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jComboBoxTiposRelacionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
				
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jComboBoxTiposAccionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
	
				
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMaquinaEmpresa.add(this.jTextFieldValorCampoGeneralTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMaquinaEmpresa = new GridBagLayout();

			this.jScrollPanelDatosTipoMaquinaEmpresa.setLayout(gridaBagLayoutDatosTipoMaquinaEmpresa);
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
			
			this.jScrollPanelDatosTipoMaquinaEmpresa.add(this.jTableDatosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMaquinaEmpresa.setViewportView(this.jTableDatosTipoMaquinaEmpresa);
		this.jTableDatosTipoMaquinaEmpresa.setFillsViewportHeight(true);
		this.jTableDatosTipoMaquinaEmpresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMaquinaEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoMaquinaEmpresa.setLayout(gridaBagLayoutAccionesTipoMaquinaEmpresa);
		
		
		/*	
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
			
		this.jPanelAccionesTipoMaquinaEmpresa.add(this.jButtonNuevoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoTipoMaquinaEmpresa= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoTipoMaquinaEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoTipoMaquinaEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoTipoMaquinaEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoTipoMaquinaEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoTipoMaquinaEmpresa);

		gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
		jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa.add(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);

		gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
		jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa.add(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);

		gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
		gridBagConstraintsTipoMaquinaEmpresa.gridx =1;
		jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa.add(jButtonFK_IdCuentaContableCreditoTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);

		jTabbedPaneBusquedasTipoMaquinaEmpresa.addTab("1.-Por Cuenta Contable Credito ", jPanelFK_IdCuentaContableCreditoTipoMaquinaEmpresa);
		jTabbedPaneBusquedasTipoMaquinaEmpresa.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDebitoTipoMaquinaEmpresa= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDebitoTipoMaquinaEmpresa.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoTipoMaquinaEmpresa.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoTipoMaquinaEmpresa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDebitoTipoMaquinaEmpresa.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa.setLayout(gridaBagLayoutFK_IdCuentaContableDebitoTipoMaquinaEmpresa);

		gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
		jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa.add(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);

		gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
		jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa.add(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);

		gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMaquinaEmpresa.gridy = 1;
		gridBagConstraintsTipoMaquinaEmpresa.gridx =1;
		jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa.add(jButtonFK_IdCuentaContableDebitoTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);

		jTabbedPaneBusquedasTipoMaquinaEmpresa.addTab("2.-Por Cuenta Contable Debito ", jPanelFK_IdCuentaContableDebitoTipoMaquinaEmpresa);
		jTabbedPaneBusquedasTipoMaquinaEmpresa.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMaquinaEmpresa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoMaquinaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;		
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMaquinaEmpresa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;		
			this.gridBagConstraintsTipoMaquinaEmpresa.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);								
		
		
		/*
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		*/		
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =0;
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMaquinaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
				
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMaquinaEmpresa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMaquinaEmpresa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMaquinaEmpresa.setLayout(gridaBagLayoutBusquedasParametrosTipoMaquinaEmpresa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			
			
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
			
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMaquinaEmpresa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMaquinaEmpresa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMaquinaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.setName("jPanelReporteDinamicoTipoMaquinaEmpresa"); 
		
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.setLayout(gridaBagLayoutReporteDinamicoTipoMaquinaEmpresa);
		
		
		this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMaquinaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Maquina Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMaquinaEmpresa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelColumnasSelectReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMaquinaEmpresa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMaquinaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMaquinaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMaquinaEmpresa=new JScrollPane(this.jListColumnasSelectReporteTipoMaquinaEmpresa);
			
			this.jScrollColumnasSelectReporteTipoMaquinaEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMaquinaEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMaquinaEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jListColumnasSelectReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jScrollColumnasSelectReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMaquinaEmpresa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelRelacionesSelectReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMaquinaEmpresa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMaquinaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMaquinaEmpresa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMaquinaEmpresa=new JScrollPane(this.jListRelacionesSelectReporteTipoMaquinaEmpresa);
			
			this.jScrollRelacionesSelectReporteTipoMaquinaEmpresa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMaquinaEmpresa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMaquinaEmpresa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jListRelacionesSelectReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jScrollRelacionesSelectReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMaquinaEmpresa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoMaquinaEmpresa.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelConGraficoDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jCheckBoxConGraficoDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoMaquinaEmpresa.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelColumnaCategoriaGraficoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoMaquinaEmpresa.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelColumnaCategoriaValorTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jComboBoxColumnaCategoriaValorTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoMaquinaEmpresa.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelColumnasValoresGraficoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoMaquinaEmpresa = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoMaquinaEmpresa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoMaquinaEmpresa.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoMaquinaEmpresa=new JScrollPane(this.jListColumnasValoresGraficoTipoMaquinaEmpresa);
			
			this.jScrollColumnasValoresGraficoTipoMaquinaEmpresa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoMaquinaEmpresa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoMaquinaEmpresa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jListColumnasSelectReporteTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jScrollColumnasValoresGraficoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelTiposGraficosReportesDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoMaquinaEmpresa.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jComboBoxTiposGraficosReportesDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMaquinaEmpresa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelGenerarExcelReporteDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa.setToolTipText("Generar EXCEL"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jButtonGenerarExcelReporteDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jComboBoxTiposReportesDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMaquinaEmpresa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jLabelTiposArchivoReporteDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMaquinaEmpresa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMaquinaEmpresa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMaquinaEmpresa.setToolTipText("Generar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jButtonGenerarReporteDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMaquinaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMaquinaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMaquinaEmpresa.setToolTipText("Cancelar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMaquinaEmpresa.add(this.jButtonCerrarReporteDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMaquinaEmpresa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa= new JScrollPane(jPanelReporteDinamicoTipoMaquinaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Maquina Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMaquinaEmpresa);
		this.jInternalFrameReporteDinamicoTipoMaquinaEmpresa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMaquinaEmpresa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMaquinaEmpresa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMaquinaEmpresa.setName("jPanelImportacionTipoMaquinaEmpresa"); 
		
		this.jPanelImportacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMaquinaEmpresa.setLayout(gridaBagLayoutImportacionTipoMaquinaEmpresa);
		
		
		this.jInternalFrameImportacionTipoMaquinaEmpresa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMaquinaEmpresa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMaquinaEmpresa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMaquinaEmpresa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMaquinaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMaquinaEmpresa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMaquinaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMaquinaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMaquinaEmpresa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMaquinaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setResizable(true);
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setClosable(true);
	    this.jInternalFrameImportacionTipoMaquinaEmpresa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Maquina Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelArchivoImportacionTipoMaquinaEmpresa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMaquinaEmpresa.add(this.jLabelArchivoImportacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMaquinaEmpresa = new JFileChooser();		
		this.jFileChooserImportacionTipoMaquinaEmpresa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonAbrirImportacionTipoMaquinaEmpresa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMaquinaEmpresa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMaquinaEmpresa.setToolTipText("Generar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMaquinaEmpresa.add(this.jButtonAbrirImportacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMaquinaEmpresa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMaquinaEmpresa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMaquinaEmpresa.add(this.jLabelPathArchivoImportacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMaquinaEmpresa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMaquinaEmpresa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMaquinaEmpresa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMaquinaEmpresa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMaquinaEmpresa.add(this.jTextFieldPathArchivoImportacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonGenerarImportacionTipoMaquinaEmpresa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMaquinaEmpresa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMaquinaEmpresa.setToolTipText("Generar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMaquinaEmpresa.add(this.jButtonGenerarImportacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonCerrarImportacionTipoMaquinaEmpresa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMaquinaEmpresa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMaquinaEmpresa.setToolTipText("Cancelar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMaquinaEmpresa.add(this.jButtonCerrarImportacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMaquinaEmpresa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMaquinaEmpresa= new JScrollPane(jPanelImportacionTipoMaquinaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMaquinaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMaquinaEmpresa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMaquinaEmpresa);
		this.jInternalFrameImportacionTipoMaquinaEmpresa.getContentPane().add(this.jScrollPanelImportacionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMaquinaEmpresa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMaquinaEmpresa = new JButtonMe();
			this.jButtonAbrirOrderByTipoMaquinaEmpresa.setText("Orden");
			this.jButtonAbrirOrderByTipoMaquinaEmpresa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMaquinaEmpresa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMaquinaEmpresa";
			inputMap = this.jButtonAbrirOrderByTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMaquinaEmpresa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMaquinaEmpresa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMaquinaEmpresa.setName("jPanelOrderByTipoMaquinaEmpresa"); 
			
			this.jPanelOrderByTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMaquinaEmpresa.setLayout(gridaBagLayoutOrderByTipoMaquinaEmpresa);
			
			
			this.jTableDatosTipoMaquinaEmpresaOrderBy = new JTableMe();        
			this.jTableDatosTipoMaquinaEmpresaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMaquinaEmpresaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMaquinaEmpresaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMaquinaEmpresaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMaquinaEmpresaOrderBy.setViewportView(this.jTableDatosTipoMaquinaEmpresaOrderBy);
			this.jTableDatosTipoMaquinaEmpresaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMaquinaEmpresaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMaquinaEmpresa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMaquinaEmpresa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMaquinaEmpresa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMaquinaEmpresa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setTitle("Orden");
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setResizable(true);
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setClosable(true);
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Maquina Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMaquinaEmpresa.ipady =150;
				
			this.jPanelOrderByTipoMaquinaEmpresa.add(jScrollPanelDatosTipoMaquinaEmpresaOrderBy, this.gridBagConstraintsTipoMaquinaEmpresa);//this.jTableDatosTipoMaquinaEmpresaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMaquinaEmpresa = new JButtonMe();
			this.jButtonCerrarOrderByTipoMaquinaEmpresa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMaquinaEmpresa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMaquinaEmpresa.setToolTipText("Cancelar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMaquinaEmpresa.add(this.jButtonCerrarOrderByTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMaquinaEmpresa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMaquinaEmpresa= new JScrollPane(jPanelOrderByTipoMaquinaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMaquinaEmpresa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMaquinaEmpresa);
			
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getContentPane().add(this.jScrollPanelOrderByTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
		
		} else {
			this.jButtonAbrirOrderByTipoMaquinaEmpresa = new JButtonMe();
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
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
		}
		
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
		int iCountColumns=this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMaquinaEmpresa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMaquinaEmpresa.getRowHeight();//TipoMaquinaEmpresaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa.isSelected()) {
					iHeightTable=TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMaquinaEmpresa.isSelected()) {
					iHeightTable=TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMaquinaEmpresaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMaquinaEmpresa!=null && this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMaquinaEmpresa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomaquinaempresaLogic.getTipoMaquinaEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomaquinaempresas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMaquinaEmpresa> TraerTipoMaquinaEmpresaBeans(List<TipoMaquinaEmpresa> tipomaquinaempresas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMaquinaEmpresa tipomaquinaempresa:tipomaquinaempresas) {
					
				if(!(TipoMaquinaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMaquinaEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomaquinaempresa.setsDetalleGeneralEntityReporte(TipoMaquinaEmpresaConstantesFunciones.getTipoMaquinaEmpresaDescripcion(tipomaquinaempresa));
										
					tipomaquinaempresa.setesta_activo_descripcion(TipoMaquinaEmpresaConstantesFunciones.getesta_activoDescripcion(tipomaquinaempresa));	
					
					

					if(tipomaquinaempresa.getProductoOrdenDetaProduMaquinas()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduMaquina.class)) {
						try{tipomaquinaempresa.setproductoordendetaprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduMaquinaJInternalFrame.TraerProductoOrdenDetaProduMaquinaBeans(tipomaquinaempresa.getProductoOrdenDetaProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipomaquinaempresa.getProductoProduMaquinas()!=null && Funciones.existeClass(classes,ProductoProduMaquina.class)) {
						try{tipomaquinaempresa.setproductoprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduMaquinaJInternalFrame.TraerProductoProduMaquinaBeans(tipomaquinaempresa.getProductoProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipomaquinaempresa.setsDetalleGeneralEntityReporte(tipomaquinaempresa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomaquinaempresabeans.add(tipomaquinaempresabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomaquinaempresas;
    }
	//PARA REPORTES FIN
}
