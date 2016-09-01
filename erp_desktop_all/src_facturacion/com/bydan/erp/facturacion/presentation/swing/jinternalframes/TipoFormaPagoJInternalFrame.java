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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoFormaPagoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoFormaPagoJInternalFrame extends TipoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoFormaPago;
	
	protected JMenuBar jmenuBarTipoFormaPago;
	
	protected JMenu jmenuTipoFormaPago;
	protected JMenu jmenuDatosTipoFormaPago;
	protected JMenu jmenuArchivoTipoFormaPago;
	protected JMenu jmenuAccionesTipoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoFormaPago> tipoformapagos;		
	public List<TipoFormaPago> tipoformapagosEliminados;	
	public List<TipoFormaPago> tipoformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoFormaPago;		
	protected JButton jButtonAbrirOrderByTipoFormaPago;
	
	
	//protected JPanel jPanelOrderByTipoFormaPago;
	//public JScrollPane jScrollPanelOrderByTipoFormaPago;	
	//protected JButton jButtonCerrarOrderByTipoFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoFormaPagoLogic tipoformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoFormaPago;
	//public JScrollPane jScrollPanelImportacionTipoFormaPago;
	
	
	
	protected JPanel jPanelAccionesTipoFormaPago;
	
    protected JPanel jPanelPaginacionTipoFormaPago;
    protected JPanel jPanelParametrosReportesTipoFormaPago;
	protected JPanel jPanelParametrosReportesAccionesTipoFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoFormaPago;
	protected JPanel jPanelParametrosAuxiliar2TipoFormaPago;
	protected JPanel jPanelParametrosAuxiliar3TipoFormaPago;
	protected JPanel jPanelParametrosAuxiliar4TipoFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5TipoFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoFormaPago;
	//protected JPanel jPanelImportacionTipoFormaPago;
	
	
	public JTable jTableDatosTipoFormaPago;
	
	
	
	//public JTable jTableDatosTipoFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoFormaPago;
	protected JButton jButtonDuplicarTipoFormaPago;
	protected JButton jButtonCopiarTipoFormaPago;
	protected JButton jButtonVerFormTipoFormaPago;
	protected JButton jButtonNuevoRelacionesTipoFormaPago;
	protected JButton jButtonModificarTipoFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaTipoFormaPago;
	protected JButton jButtonCerrarTipoFormaPago;
	
	
	protected JButton jButtonRecargarInformacionTipoFormaPago;
	protected JButton jButtonProcesarInformacionTipoFormaPago;
	
	
	protected JButton jButtonAnterioresTipoFormaPago;
	protected JButton jButtonSiguientesTipoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosTipoFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoTipoFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoFormaPago;
	//protected JButton jButtonGenerarImportacionTipoFormaPago;
	//protected JButton jButtonCerrarImportacionTipoFormaPago;
	//protected JFileChooser jFileChooserImportacionTipoFormaPago;
	//protected File fileImportacionTipoFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormaPago;
	protected JButton jButtonDuplicarToolBarTipoFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarTipoFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoFormaPago;
	protected JButton jButtonCopiarToolBarTipoFormaPago;
	protected JButton jButtonVerFormToolBarTipoFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarTipoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormaPago;
	protected JButton jButtonCerrarToolBarTipoFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarTipoFormaPago;
	protected JButton jButtonProcesarInformacionToolBarTipoFormaPago;
	protected JButton jButtonAnterioresToolBarTipoFormaPago;
	protected JButton jButtonSiguientesToolBarTipoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoFormaPago;
	protected JButton jButtonAbrirOrderByToolBarTipoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormaPago;
	protected JMenuItem jMenuItemDuplicarTipoFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesTipoFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoFormaPago;
	protected JMenuItem jMenuItemCopiarTipoFormaPago;
	protected JMenuItem jMenuItemVerFormTipoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormaPago;
	protected JMenuItem jMenuItemCerrarTipoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionTipoFormaPago;
	protected JMenuItem jMenuItemAnterioresTipoFormaPago;
	protected JMenuItem jMenuItemSiguientesTipoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByTipoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosTipoFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteTipoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoFormaPago;
	protected JTextField jTextFieldValorCampoGeneralTipoFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteTipoFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteTipoFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteTipoFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteTipoFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteTipoFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionTipoFormaPago;	
	//public JLabel jLabelPathArchivoImportacionTipoFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionTipoFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorTipoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoTipoFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoTipoFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoTipoFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoFormaPago;
	public JPanel jPanelBusquedaPorNombreTipoFormaPago;
	public JButton jButtonBusquedaPorNombreTipoFormaPago;
	public JPanel jPanelBusquedaPorSiglasTipoFormaPago;
	public JButton jButtonBusquedaPorSiglasTipoFormaPago;
	public JPanel jPanelFK_IdTipoFormaPagoTipoFormaPago;
	public JButton jButtonFK_IdTipoFormaPagoTipoFormaPago;
	public JPanel jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago;
	public JButton jButtonFK_IdTipoGrupoFormaPagoTipoFormaPago;
	public JPanel jPanelFK_IdTipoTransaccionModuloTipoFormaPago;
	public JButton jButtonFK_IdTipoTransaccionModuloTipoFormaPago;
	public JPanel jPanelFK_IdTransaccionTipoFormaPago;
	public JButton jButtonFK_IdTransaccionTipoFormaPago;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoFormaPago;
	public JLabel jLabelnombreBusquedaPorNombreTipoFormaPago;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoFormaPago;
	public JButton jButtonnombreBusquedaPorNombreTipoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglasBusquedaPorSiglasTipoFormaPago;
	public JLabel jLabelsiglasBusquedaPorSiglasTipoFormaPago;
	public JTextField jTextFieldsiglasBusquedaPorSiglasTipoFormaPago;
	public JButton jButtonsiglasBusquedaPorSiglasTipoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago;
	public JLabel jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago;
	public JButton jButtonid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPagoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago;
	
	public JPanel jPanelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago;
	public JLabel jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago;
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionTipoFormaPago;
	public JLabel jLabelid_transaccionFK_IdTransaccionTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionTipoFormaPago;
	public JButton jButtonid_transaccionFK_IdTransaccionTipoFormaPago= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionTipoFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoFormaPago)	{
		this.jButtonRecargarInformacionTipoFormaPago = jButtonRecargarInformacionTipoFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionTipoFormaPago() {
		return this.jButtonProcesarInformacionTipoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormaPago)	{
		this.jButtonProcesarInformacionTipoFormaPago = jButtonProcesarInformacionTipoFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoFormaPago() {
		return this.jButtonRecargarInformacionTipoFormaPago;
	}
	
	
	public List<TipoFormaPago> gettipoformapagos() {
		return this.tipoformapagos;
	}

	public void settipoformapagos(List<TipoFormaPago> tipoformapagos) {
		this.tipoformapagos = tipoformapagos;
	}
	
	public List<TipoFormaPago> gettipoformapagosAux() {
		return this.tipoformapagosAux;
	}

	public void settipoformapagosAux(List<TipoFormaPago> tipoformapagosAux) {
		this.tipoformapagosAux = tipoformapagosAux;
	}
	
	public List<TipoFormaPago> gettipoformapagosEliminados() {
		return this.tipoformapagosEliminados;
	}

	public void setTipoFormaPagosEliminados(List<TipoFormaPago> tipoformapagosEliminados) {
		this.tipoformapagosEliminados = tipoformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoFormaPago() {
		return jComboBoxTiposSeleccionarTipoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoFormaPago(
			JComboBox jComboBoxTiposSeleccionarTipoFormaPago) {
		this.jComboBoxTiposSeleccionarTipoFormaPago = jComboBoxTiposSeleccionarTipoFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoFormaPago() {
		return jTextFieldValorCampoGeneralTipoFormaPago;
	}

	public void setjTextFieldValorCampoGeneralTipoFormaPago(
			JTextField jTextFieldValorCampoGeneralTipoFormaPago) {
		this.jTextFieldValorCampoGeneralTipoFormaPago = jTextFieldValorCampoGeneralTipoFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoFormaPago() {
		return this.jCheckBoxSeleccionarTodosTipoFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosTipoFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosTipoFormaPago) {
		this.jCheckBoxSeleccionarTodosTipoFormaPago = jCheckBoxSeleccionarTodosTipoFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoFormaPago() {
		return this.jCheckBoxSeleccionadosTipoFormaPago;
	}

	public void setjCheckBoxSeleccionadosTipoFormaPago(
			JCheckBox jCheckBoxSeleccionadosTipoFormaPago) {
		this.jCheckBoxSeleccionadosTipoFormaPago = jCheckBoxSeleccionadosTipoFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoFormaPago() {
		return this.jComboBoxTiposArchivosReportesTipoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoFormaPago(
			JComboBox jComboBoxTiposArchivosReportesTipoFormaPago) {
		this.jComboBoxTiposArchivosReportesTipoFormaPago = jComboBoxTiposArchivosReportesTipoFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoFormaPago() {
		return this.jComboBoxTiposReportesTipoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoFormaPago(
			JComboBox jComboBoxTiposReportesTipoFormaPago) {
		this.jComboBoxTiposReportesTipoFormaPago = jComboBoxTiposReportesTipoFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoFormaPago() {
	//	return jComboBoxTiposReportesDinamicoTipoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoTipoFormaPago = jComboBoxTiposReportesDinamicoTipoFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago = jComboBoxTiposArchivosReportesDinamicoTipoFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoFormaPago() {
		return this.jComboBoxTiposGraficosReportesTipoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoFormaPago(
			JComboBox jComboBoxTiposGraficosReportesTipoFormaPago) {
		this.jComboBoxTiposGraficosReportesTipoFormaPago = jComboBoxTiposGraficosReportesTipoFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoFormaPago() {
		return this.jComboBoxTiposPaginacionTipoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoFormaPago(
			JComboBox jComboBoxTiposPaginacionTipoFormaPago) {
		this.jComboBoxTiposPaginacionTipoFormaPago = jComboBoxTiposPaginacionTipoFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoFormaPago() {
		return this.jComboBoxTiposRelacionesTipoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormaPago() {
		return this.jComboBoxTiposAccionesTipoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoFormaPago) {
		this.jComboBoxTiposRelacionesTipoFormaPago = jComboBoxTiposRelacionesTipoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormaPago(
			JComboBox jComboBoxTiposAccionesTipoFormaPago) {
		this.jComboBoxTiposAccionesTipoFormaPago = jComboBoxTiposAccionesTipoFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoFormaPago() {
	//	return jCheckBoxConGraficoDinamicoTipoFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoTipoFormaPago = jCheckBoxConGraficoDinamicoTipoFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoFormaPago .setBorder(borderResaltar);		
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
		this.tipoformapagoSessionBean=new TipoFormaPagoSessionBean();
		
		this.tipoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"nuevo","nuevo","Nuevo"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"duplicar","duplicar","Duplicar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"copiar","copiar","Copiar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"ver_form","ver_form","Ver"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"recargar","recargar","Recargar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoFormaPago,this.jTtoolBarTipoFormaPago,
							"cerrar","cerrar","Salir"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoFormaPago;
			
				this.jButtonProcesarInformacionToolBarTipoFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoFormaPago;
				
		//protected JButton jButtonModificarToolBarTipoFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoFormaPago=new JMenuMe("General");
		this.jmenuArchivoTipoFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesTipoFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosTipoFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoFormaPago.add(this.jMenuItemCerrarTipoFormaPago);
			
			this.jmenuAccionesTipoFormaPago.add(this.jMenuItemNuevoTipoFormaPago);
			this.jmenuAccionesTipoFormaPago.add(this.jMenuItemNuevoGuardarCambiosTipoFormaPago);
			this.jmenuAccionesTipoFormaPago.add(this.jMenuItemNuevoRelacionesTipoFormaPago);
			this.jmenuAccionesTipoFormaPago.add(this.jMenuItemGuardarCambiosTablaTipoFormaPago);		
			this.jmenuAccionesTipoFormaPago.add(this.jMenuItemDuplicarTipoFormaPago);		
			this.jmenuAccionesTipoFormaPago.add(this.jMenuItemCopiarTipoFormaPago);		
			this.jmenuAccionesTipoFormaPago.add(this.jMenuItemVerFormTipoFormaPago);		
			
			this.jmenuDatosTipoFormaPago.add(this.jMenuItemRecargarInformacionTipoFormaPago);				
			this.jmenuDatosTipoFormaPago.add(this.jMenuItemAnterioresTipoFormaPago);				
			this.jmenuDatosTipoFormaPago.add(this.jMenuItemSiguientesTipoFormaPago);				
			this.jmenuDatosTipoFormaPago.add(this.jMenuItemAbrirOrderByTipoFormaPago);				
			this.jmenuDatosTipoFormaPago.add(this.jMenuItemMostrarOcultarTipoFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoFormaPago.add(this.jMenuItemGuardarCambiosTipoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoFormaPago.add(this.jmenuArchivoTipoFormaPago);		
			this.jmenuBarTipoFormaPago.add(this.jmenuAccionesTipoFormaPago);		
			this.jmenuBarTipoFormaPago.add(this.jmenuDatosTipoFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoFormaPago.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoFormaPago= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoFormaPago.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoFormaPago.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoFormaPago,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoFormaPago = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoFormaPago.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoFormaPago.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoFormaPago= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglasTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglasTipoFormaPago.setToolTipText("Buscar Por Siglas ");
		this.jButtonBusquedaPorSiglasTipoFormaPago= new JButtonMe();
		this.jButtonBusquedaPorSiglasTipoFormaPago.setText("Buscar");
		this.jButtonBusquedaPorSiglasTipoFormaPago.setToolTipText("Buscar Por Siglas ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglasTipoFormaPago,"buscar_button","Buscar Por Siglas ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglasTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglasBusquedaPorSiglasTipoFormaPago = new JLabelMe();
		jLabelsiglasBusquedaPorSiglasTipoFormaPago.setText("Siglas :");
		jLabelsiglasBusquedaPorSiglasTipoFormaPago.setToolTipText("Siglas");
		jLabelsiglasBusquedaPorSiglasTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglasBusquedaPorSiglasTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglasBusquedaPorSiglasTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglasBusquedaPorSiglasTipoFormaPago= new JTextFieldMe();
		jTextFieldsiglasBusquedaPorSiglasTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBusquedaPorSiglasTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBusquedaPorSiglasTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFormaPagoTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoTipoFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdTipoFormaPagoTipoFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoTipoFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoTipoFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoTipoFormaPago,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago = new JLabelMe();
		jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago.setFocusable(false);

		this.jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago.setToolTipText("Buscar Por T. Forma Pago ");
		this.jButtonFK_IdTipoGrupoFormaPagoTipoFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoGrupoFormaPagoTipoFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoGrupoFormaPagoTipoFormaPago.setToolTipText("Buscar Por T. Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGrupoFormaPagoTipoFormaPago,"buscar_button","Buscar Por T. Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGrupoFormaPagoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago = new JLabelMe();
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setText("T. Forma Pago :");
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setToolTipText("T. Forma Pago");
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloTipoFormaPago.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloTipoFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloTipoFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloTipoFormaPago.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloTipoFormaPago,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionTipoFormaPago.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionTipoFormaPago= new JButtonMe();
		this.jButtonFK_IdTransaccionTipoFormaPago.setText("Buscar");
		this.jButtonFK_IdTransaccionTipoFormaPago.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionTipoFormaPago,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionTipoFormaPago = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionTipoFormaPago.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionTipoFormaPago.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionTipoFormaPago= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoFormaPago = new TipoFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Forma Pago DATOS");
			this.jInternalFrameDetalleFormTipoFormaPago = new TipoFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.tipoformapagoSessionBean.getConGuardarRelaciones(),this.tipoformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoFormaPago = null;//new TipoFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormaPago= new GridBagLayout();
		
		
		this.jTableDatosTipoFormaPago = new JTableMe();      
		
		String sToolTipTipoFormaPago="";
		sToolTipTipoFormaPago=TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormaPago+="(Facturacion.TipoFormaPago)";
		}
		
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoFormaPago.setToolTipText(sToolTipTipoFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoFormaPago);
		this.jTableDatosTipoFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosTipoFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosTipoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoFormaPago = new JButtonMe();
		this.jButtonDuplicarTipoFormaPago = new JButtonMe();
		this.jButtonCopiarTipoFormaPago = new JButtonMe();
		this.jButtonVerFormTipoFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesTipoFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoFormaPago = new JButtonMe();
		this.jButtonCerrarTipoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Forma Pago";
		
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoFormaPago=new ReporteDinamicoJInternalFrame(TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoFormaPago=new ImportacionJInternalFrame(TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoFormaPago.setText("Orden");
		this.jButtonAbrirOrderByTipoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormaPago,false,this);
			
			//this.cargarOrderByTipoFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormaPago,true,this);
			
			//this.cargarOrderByTipoFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoFormaPago.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosTipoFormaPago.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosTipoFormaPago.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosTipoFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoFormaPago.setText("Nuevo");
		this.jButtonDuplicarTipoFormaPago.setText("Duplicar");
		this.jButtonCopiarTipoFormaPago.setText("Copiar");
		this.jButtonVerFormTipoFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesTipoFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoFormaPago.setText("Guardar");
		this.jButtonCerrarTipoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormaPago,"nuevo_button","Nuevo",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoFormaPago,"duplicar_button","Duplicar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoFormaPago,"copiar_button","Copiar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoFormaPago,"ver_form","Ver",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoFormaPago,"nuevorelaciones_button","Nuevo Rel",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormaPago,"guardarcambiostabla_button","Guardar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormaPago,"cerrar_button","Salir",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoFormaPago.setToolTipText("Nuevo"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoFormaPago.setToolTipText("Duplicar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoFormaPago.setToolTipText("Copiar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoFormaPago.setToolTipText("Ver"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoFormaPago.setToolTipText("Nuevo Rel"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoFormaPago.setToolTipText("Guardar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormaPago.setToolTipText("Salir"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormaPago";
		inputMap = this.jButtonNuevoTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoFormaPago";
		inputMap = this.jButtonDuplicarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarTipoFormaPago";
		inputMap = this.jButtonCopiarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormTipoFormaPago";
		inputMap = this.jButtonVerFormTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoFormaPago";
		inputMap = this.jButtonNuevoRelacionesTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoFormaPago";
		inputMap = this.jButtonModificarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoFormaPago";
		inputMap = this.jButtonCerrarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoFormaPago.setName("jPanelParametrosReportesTipoFormaPago"); 
		
		this.jPanelParametrosReportesAccionesTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoFormaPago.setName("jPanelParametrosReportesAccionesTipoFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionTipoFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionTipoFormaPago.setToolTipText("Recargar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionTipoFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionTipoFormaPago.setToolTipText("Procesar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionTipoFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesTipoFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesTipoFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoFormaPago = new JButtonMe();
		//this.jButtonAnterioresTipoFormaPago.setText("<<");
        this.jButtonAnterioresTipoFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoFormaPago = new JButtonMe();
		//this.jButtonSiguientesTipoFormaPago.setText(">>");
        this.jButtonSiguientesTipoFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoFormaPago,"nuevoguardarcambios_button","Nue",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoFormaPago";
		inputMap = this.jButtonRecargarInformacionTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoFormaPago";
		inputMap = this.jButtonSiguientesTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoFormaPago";
		inputMap = this.jButtonAnterioresTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoFormaPago.setMinimumSize(new Dimension(this.getWidth(),TipoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormaPago.setMaximumSize(new Dimension(this.getWidth(),TipoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoFormaPago.setPreferredSize(new Dimension(this.getWidth(),TipoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoFormaPago = new GridBagLayout();

			this.jPanelPaginacionTipoFormaPago.setLayout(gridaBagLayoutPaginacionTipoFormaPago);						
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = 0;
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonAnterioresTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
					
						
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormaPago.gridy = 0;
			
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonNuevoGuardarCambiosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
						
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoFormaPago.gridy = 0;
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonSiguientesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonNuevoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFormaPago.gridy = 1;
				this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoFormaPago.add(this.jButtonNuevoRelacionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			}
			
			
			if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoFormaPago.gridy = 1;
				this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoFormaPago.add(this.jButtonGuardarCambiosTablaTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			}
			
			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonDuplicarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonCopiarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonVerFormTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = 1;
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoFormaPago.add(this.jButtonCerrarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
		
		
		this.jButtonRecargarInformacionTipoFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoFormaPago.setLayout(gridaBagParametrosReportesTipoFormaPago);
			this.jPanelParametrosReportesAccionesTipoFormaPago.setLayout(gridaBagParametrosReportesAccionesTipoFormaPago);
			
			
			this.jPanelParametrosAuxiliar1TipoFormaPago.setLayout(gridaBagParametrosAuxiliar1TipoFormaPago);
			this.jPanelParametrosAuxiliar2TipoFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoFormaPago);
			this.jPanelParametrosAuxiliar3TipoFormaPago.setLayout(gridaBagParametrosAuxiliar3TipoFormaPago);
			this.jPanelParametrosAuxiliar4TipoFormaPago.setLayout(gridaBagParametrosAuxiliar4TipoFormaPago);
			//this.jPanelParametrosAuxiliar5TipoFormaPago.setLayout(gridaBagParametrosAuxiliar2TipoFormaPago);			
			
			
			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPago.add(this.jButtonRecargarInformacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormaPago.add(this.jComboBoxTiposPaginacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormaPago.add(this.jCheckBoxConAltoMaximoTablaTipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoFormaPago.add(this.jComboBoxTiposArchivosReportesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPago.add(this.jPanelParametrosAuxiliar1TipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoFormaPago.add(this.jComboBoxTiposReportesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPago.add(this.jPanelParametrosAuxiliar4TipoFormaPago, this.gridBagConstraintsTipoFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPago.add(this.jComboBoxTiposReportesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormaPago.add(this.jCheckBoxGenerarReporteTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPago.add(this.jPanelParametrosAuxiliar2TipoFormaPago, this.gridBagConstraintsTipoFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormaPago.add(this.jLabelAccionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoFormaPago.add(this.jButtonAbrirOrderByTipoFormaPago, this.gridBagConstraintsTipoFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPago.add(this.jComboBoxTiposSeleccionarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
			
			
			/*
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoFormaPago.add(this.jCheckBoxSeleccionarTodosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormaPago.add(this.jCheckBoxSeleccionarTodosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);															
				
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoFormaPago.add(this.jCheckBoxSeleccionadosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoFormaPago.add(this.jPanelParametrosAuxiliar3TipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPago.add(this.jComboBoxTiposRelacionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
				
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPago.add(this.jComboBoxTiposAccionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
	
				
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoFormaPago.add(this.jTextFieldValorCampoGeneralTipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoFormaPago = new GridBagLayout();

			this.jScrollPanelDatosTipoFormaPago.setLayout(gridaBagLayoutDatosTipoFormaPago);
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = 0;
			this.gridBagConstraintsTipoFormaPago.gridx = 0;
			
			this.jScrollPanelDatosTipoFormaPago.add(this.jTableDatosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoFormaPago.setViewportView(this.jTableDatosTipoFormaPago);
		this.jTableDatosTipoFormaPago.setFillsViewportHeight(true);
		this.jTableDatosTipoFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoFormaPago.setLayout(gridaBagLayoutAccionesTipoFormaPago);
		
		
		/*	
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
			
		this.jPanelAccionesTipoFormaPago.add(this.jButtonNuevoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoFormaPago.setLayout(gridaBagLayoutBusquedaPorNombreTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 0;
		jPanelBusquedaPorNombreTipoFormaPago.add(jLabelnombreBusquedaPorNombreTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 1;
		jPanelBusquedaPorNombreTipoFormaPago.add(jTextAreanombreBusquedaPorNombreTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 1;
		gridBagConstraintsTipoFormaPago.gridx =1;
		jPanelBusquedaPorNombreTipoFormaPago.add(jButtonBusquedaPorNombreTipoFormaPago, gridBagConstraintsTipoFormaPago);

		jTabbedPaneBusquedasTipoFormaPago.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoFormaPago);
		jTabbedPaneBusquedasTipoFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorSiglasTipoFormaPago= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglasTipoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTipoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglasTipoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglasTipoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglasTipoFormaPago.setLayout(gridaBagLayoutBusquedaPorSiglasTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 0;
		jPanelBusquedaPorSiglasTipoFormaPago.add(jLabelsiglasBusquedaPorSiglasTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 1;
		jPanelBusquedaPorSiglasTipoFormaPago.add(jTextFieldsiglasBusquedaPorSiglasTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 1;
		gridBagConstraintsTipoFormaPago.gridx =1;
		jPanelBusquedaPorSiglasTipoFormaPago.add(jButtonBusquedaPorSiglasTipoFormaPago, gridBagConstraintsTipoFormaPago);

		jTabbedPaneBusquedasTipoFormaPago.addTab("2.-Por Siglas ", jPanelBusquedaPorSiglasTipoFormaPago);
		jTabbedPaneBusquedasTipoFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoTipoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoTipoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoTipoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoTipoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoTipoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoTipoFormaPago.setLayout(gridaBagLayoutFK_IdTipoFormaPagoTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 0;
		jPanelFK_IdTipoFormaPagoTipoFormaPago.add(jLabelid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 1;
		jPanelFK_IdTipoFormaPagoTipoFormaPago.add(jComboBoxid_cuenta_contableFK_IdTipoFormaPagoTipoFormaPago, gridBagConstraintsTipoFormaPago);


		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 0;
		jPanelFK_IdTipoFormaPagoTipoFormaPago.add(this.jButtonBuscarFK_IdTipoFormaPagoid_cuenta_contableTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 1;
		gridBagConstraintsTipoFormaPago.gridx =1;
		jPanelFK_IdTipoFormaPagoTipoFormaPago.add(jButtonFK_IdTipoFormaPagoTipoFormaPago, gridBagConstraintsTipoFormaPago);

		jTabbedPaneBusquedasTipoFormaPago.addTab("3.-Por Cuenta Contable ", jPanelFK_IdTipoFormaPagoTipoFormaPago);
		jTabbedPaneBusquedasTipoFormaPago.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoGrupoFormaPagoTipoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGrupoFormaPagoTipoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoTipoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoTipoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGrupoFormaPagoTipoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago.setLayout(gridaBagLayoutFK_IdTipoGrupoFormaPagoTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 0;
		jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago.add(jLabelid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 1;
		jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago.add(jComboBoxid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPagoTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 1;
		gridBagConstraintsTipoFormaPago.gridx =1;
		jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago.add(jButtonFK_IdTipoGrupoFormaPagoTipoFormaPago, gridBagConstraintsTipoFormaPago);

		jTabbedPaneBusquedasTipoFormaPago.addTab("4.-Por T. Forma Pago ", jPanelFK_IdTipoGrupoFormaPagoTipoFormaPago);
		jTabbedPaneBusquedasTipoFormaPago.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloTipoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloTipoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloTipoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloTipoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloTipoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloTipoFormaPago.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloTipoFormaPago.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloTipoFormaPago.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 1;
		gridBagConstraintsTipoFormaPago.gridx =1;
		jPanelFK_IdTipoTransaccionModuloTipoFormaPago.add(jButtonFK_IdTipoTransaccionModuloTipoFormaPago, gridBagConstraintsTipoFormaPago);

		jTabbedPaneBusquedasTipoFormaPago.addTab("5.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloTipoFormaPago);
		jTabbedPaneBusquedasTipoFormaPago.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTransaccionTipoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionTipoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionTipoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionTipoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionTipoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionTipoFormaPago.setLayout(gridaBagLayoutFK_IdTransaccionTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 0;
		jPanelFK_IdTransaccionTipoFormaPago.add(jLabelid_transaccionFK_IdTransaccionTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 0;
		gridBagConstraintsTipoFormaPago.gridx = 1;
		jPanelFK_IdTransaccionTipoFormaPago.add(jComboBoxid_transaccionFK_IdTransaccionTipoFormaPago, gridBagConstraintsTipoFormaPago);

		gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoFormaPago.gridy = 1;
		gridBagConstraintsTipoFormaPago.gridx =1;
		jPanelFK_IdTransaccionTipoFormaPago.add(jButtonFK_IdTransaccionTipoFormaPago, gridBagConstraintsTipoFormaPago);

		jTabbedPaneBusquedasTipoFormaPago.addTab("6.-Por Transaccion ", jPanelFK_IdTransaccionTipoFormaPago);
		jTabbedPaneBusquedasTipoFormaPago.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoFormaPago.gridx = 0;		
		//this.gridBagConstraintsTipoFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormaPago.gridx = 0;		
			this.gridBagConstraintsTipoFormaPago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoFormaPago, this.gridBagConstraintsTipoFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);								
		
		
		/*
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		*/		
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormaPago.gridx =0;
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
				
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoFormaPago.setLayout(gridaBagLayoutBusquedasParametrosTipoFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			
			
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
			
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoFormaPago.setName("jPanelReporteDinamicoTipoFormaPago"); 
		
		this.jPanelReporteDinamicoTipoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoFormaPago.setLayout(gridaBagLayoutReporteDinamicoTipoFormaPago);
		
		
		this.jInternalFrameReporteDinamicoTipoFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jLabelColumnasSelectReporteTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoFormaPago=new JScrollPane(this.jListColumnasSelectReporteTipoFormaPago);
			
			this.jScrollColumnasSelectReporteTipoFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFormaPago.add(this.jListColumnasSelectReporteTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jScrollColumnasSelectReporteTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jLabelRelacionesSelectReporteTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoFormaPago=new JScrollPane(this.jListRelacionesSelectReporteTipoFormaPago);
			
			this.jScrollRelacionesSelectReporteTipoFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoFormaPago.add(this.jListRelacionesSelectReporteTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jScrollRelacionesSelectReporteTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jLabelGenerarExcelReporteDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoFormaPago.setToolTipText("Generar EXCEL"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoFormaPago.add(this.jButtonGenerarExcelReporteDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jComboBoxTiposReportesDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jLabelTiposArchivoReporteDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoFormaPago.setToolTipText("Generar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jButtonGenerarReporteDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoFormaPago.setToolTipText("Cancelar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoFormaPago.add(this.jButtonCerrarReporteDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoFormaPago= new JScrollPane(jPanelReporteDinamicoTipoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoFormaPago);
		this.jInternalFrameReporteDinamicoTipoFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoFormaPago.setName("jPanelImportacionTipoFormaPago"); 
		
		this.jPanelImportacionTipoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoFormaPago.setLayout(gridaBagLayoutImportacionTipoFormaPago);
		
		
		this.jInternalFrameImportacionTipoFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionTipoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionTipoFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionTipoFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormaPago.add(this.jLabelArchivoImportacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoFormaPago = new JFileChooser();		
		this.jFileChooserImportacionTipoFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionTipoFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoFormaPago.setToolTipText("Generar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPago.add(this.jButtonAbrirImportacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoFormaPago.add(this.jLabelPathArchivoImportacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPago.add(this.jTextFieldPathArchivoImportacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionTipoFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoFormaPago.setToolTipText("Generar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPago.add(this.jButtonGenerarImportacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionTipoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoFormaPago.setToolTipText("Cancelar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoFormaPago.add(this.jButtonCerrarImportacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoFormaPago= new JScrollPane(jPanelImportacionTipoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoFormaPago);
		this.jInternalFrameImportacionTipoFormaPago.getContentPane().add(this.jScrollPanelImportacionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByTipoFormaPago.setText("Orden");
			this.jButtonAbrirOrderByTipoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoFormaPago";
			inputMap = this.jButtonAbrirOrderByTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoFormaPago.setName("jPanelOrderByTipoFormaPago"); 
			
			this.jPanelOrderByTipoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoFormaPago.setLayout(gridaBagLayoutOrderByTipoFormaPago);
			
			
			this.jTableDatosTipoFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosTipoFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoFormaPagoOrderBy.setViewportView(this.jTableDatosTipoFormaPagoOrderBy);
			this.jTableDatosTipoFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByTipoFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoFormaPago.setResizable(true);
			this.jInternalFrameOrderByTipoFormaPago.setClosable(true);
			this.jInternalFrameOrderByTipoFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoFormaPago.ipady =150;
				
			this.jPanelOrderByTipoFormaPago.add(jScrollPanelDatosTipoFormaPagoOrderBy, this.gridBagConstraintsTipoFormaPago);//this.jTableDatosTipoFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByTipoFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoFormaPago.setToolTipText("Cancelar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoFormaPago.add(this.jButtonCerrarOrderByTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoFormaPago= new JScrollPane(jPanelOrderByTipoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoFormaPago);
			
			this.jInternalFrameOrderByTipoFormaPago.getContentPane().add(this.jScrollPanelOrderByTipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByTipoFormaPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=800;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoFormaPago.getRowHeight();//TipoFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormaPago.isSelected()) {
					iHeightTable=TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoFormaPago.isSelected()) {
					iHeightTable=TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoFormaPago!=null && this.jInternalFrameOrderByTipoFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoformapagoLogic.getTipoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoFormaPago> TraerTipoFormaPagoBeans(List<TipoFormaPago> tipoformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoFormaPago tipoformapago:tipoformapagos) {
					
				if(!(TipoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoformapago.setsDetalleGeneralEntityReporte(TipoFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapago));
										
					tipoformapago.setcon_detalle_descripcion(TipoFormaPagoConstantesFunciones.getcon_detalleDescripcion(tipoformapago));tipoformapago.setcon_cuotas_descripcion(TipoFormaPagoConstantesFunciones.getcon_cuotasDescripcion(tipoformapago));	
					
					

					if(tipoformapago.getRegistroFormaPagoBancos()!=null && Funciones.existeClass(classes,RegistroFormaPagoBanco.class)) {
						try{tipoformapago.setregistroformapagobancosDescripcionReporte(new JRBeanCollectionDataSource(RegistroFormaPagoBancoJInternalFrame.TraerRegistroFormaPagoBancoBeans(tipoformapago.getRegistroFormaPagoBancos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoformapago.getDetaFormaPagoFactus()!=null && Funciones.existeClass(classes,DetaFormaPagoFactu.class)) {
						try{tipoformapago.setdetaformapagofactusDescripcionReporte(new JRBeanCollectionDataSource(DetaFormaPagoFactuJInternalFrame.TraerDetaFormaPagoFactuBeans(tipoformapago.getDetaFormaPagoFactus(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoformapago.getGrupoClienteFormaPagos()!=null && Funciones.existeClass(classes,GrupoClienteFormaPago.class)) {
						try{tipoformapago.setgrupoclienteformapagosDescripcionReporte(new JRBeanCollectionDataSource(GrupoClienteFormaPagoJInternalFrame.TraerGrupoClienteFormaPagoBeans(tipoformapago.getGrupoClienteFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoformapago.getDetaFormaPagos()!=null && Funciones.existeClass(classes,DetaFormaPago.class)) {
						try{tipoformapago.setdetaformapagosDescripcionReporte(new JRBeanCollectionDataSource(DetaFormaPagoJInternalFrame.TraerDetaFormaPagoBeans(tipoformapago.getDetaFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoformapago.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{tipoformapago.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(tipoformapago.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoformapago.getFormaPagos()!=null && Funciones.existeClass(classes,FormaPago.class)) {
						try{tipoformapago.setformapagosDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoJInternalFrame.TraerFormaPagoBeans(tipoformapago.getFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoformapago.getFormaPagoInvens()!=null && Funciones.existeClass(classes,FormaPagoInven.class)) {
						try{tipoformapago.setformapagoinvensDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoInvenJInternalFrame.TraerFormaPagoInvenBeans(tipoformapago.getFormaPagoInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoformapago.getCierreCajas()!=null && Funciones.existeClass(classes,CierreCaja.class)) {
						try{tipoformapago.setcierrecajasDescripcionReporte(new JRBeanCollectionDataSource(CierreCajaJInternalFrame.TraerCierreCajaBeans(tipoformapago.getCierreCajas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoformapago.setsDetalleGeneralEntityReporte(tipoformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoformapagobeans.add(tipoformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoformapagos;
    }
	//PARA REPORTES FIN
}
