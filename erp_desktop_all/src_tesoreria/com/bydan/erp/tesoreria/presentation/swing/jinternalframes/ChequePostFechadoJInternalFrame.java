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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.ChequePostFechadoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class ChequePostFechadoJInternalFrame extends ChequePostFechadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarChequePostFechado;
	
	protected JMenuBar jmenuBarChequePostFechado;
	
	protected JMenu jmenuChequePostFechado;
	protected JMenu jmenuDatosChequePostFechado;
	protected JMenu jmenuArchivoChequePostFechado;
	protected JMenu jmenuAccionesChequePostFechado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutChequePostFechado;	
	protected GridBagConstraints gridBagConstraintsChequePostFechado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ChequePostFechadoDetalleFormJInternalFrame jInternalFrameDetalleFormChequePostFechado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoChequePostFechado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionChequePostFechado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public ChequePostFechadoSessionBean chequepostfechadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ChequePostFechado> chequepostfechados;		
	public List<ChequePostFechado> chequepostfechadosEliminados;	
	public List<ChequePostFechado> chequepostfechadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByChequePostFechado;		
	protected JButton jButtonAbrirOrderByChequePostFechado;
	
	
	//protected JPanel jPanelOrderByChequePostFechado;
	//public JScrollPane jScrollPanelOrderByChequePostFechado;	
	//protected JButton jButtonCerrarOrderByChequePostFechado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ChequePostFechadoLogic chequepostfechadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosChequePostFechado;
	public JScrollPane jScrollPanelDatosEdicionChequePostFechado;
	public JScrollPane jScrollPanelDatosGeneralChequePostFechado;
    
	
	
	//public JScrollPane jScrollPanelDatosChequePostFechadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoChequePostFechado;
	//public JScrollPane jScrollPanelImportacionChequePostFechado;
	
	
	
	protected JPanel jPanelAccionesChequePostFechado;
	
    protected JPanel jPanelPaginacionChequePostFechado;
    protected JPanel jPanelParametrosReportesChequePostFechado;
	protected JPanel jPanelParametrosReportesAccionesChequePostFechado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ChequePostFechado;
	protected JPanel jPanelParametrosAuxiliar2ChequePostFechado;
	protected JPanel jPanelParametrosAuxiliar3ChequePostFechado;
	protected JPanel jPanelParametrosAuxiliar4ChequePostFechado;
	//protected JPanel jPanelParametrosAuxiliar5ChequePostFechado;
	
	
	
	//protected JPanel jPanelReporteDinamicoChequePostFechado;
	//protected JPanel jPanelImportacionChequePostFechado;
	
	
	public JTable jTableDatosChequePostFechado;
	
	
	
	//public JTable jTableDatosChequePostFechadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoChequePostFechado;
	protected JButton jButtonDuplicarChequePostFechado;
	protected JButton jButtonCopiarChequePostFechado;
	protected JButton jButtonVerFormChequePostFechado;
	protected JButton jButtonNuevoRelacionesChequePostFechado;
	protected JButton jButtonModificarChequePostFechado;
	
    protected JButton jButtonGuardarCambiosTablaChequePostFechado;
	protected JButton jButtonCerrarChequePostFechado;
	
	
	protected JButton jButtonRecargarInformacionChequePostFechado;
	protected JButton jButtonProcesarInformacionChequePostFechado;
	
	
	protected JButton jButtonAnterioresChequePostFechado;
	protected JButton jButtonSiguientesChequePostFechado;
	protected JButton jButtonNuevoGuardarCambiosChequePostFechado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoChequePostFechado;
	//protected JButton jButtonCerrarReporteDinamicoChequePostFechado;
	//protected JButton jButtonGenerarExcelReporteDinamicoChequePostFechado;	
	
	
	
	//protected JButton jButtonAbrirImportacionChequePostFechado;
	//protected JButton jButtonGenerarImportacionChequePostFechado;
	//protected JButton jButtonCerrarImportacionChequePostFechado;
	//protected JFileChooser jFileChooserImportacionChequePostFechado;
	//protected File fileImportacionChequePostFechado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarChequePostFechado;
	protected JButton jButtonDuplicarToolBarChequePostFechado;
	protected JButton jButtonNuevoRelacionesToolBarChequePostFechado;
	
	
	public JButton jButtonGuardarCambiosToolBarChequePostFechado;
	protected JButton jButtonCopiarToolBarChequePostFechado;
	protected JButton jButtonVerFormToolBarChequePostFechado;
	public JButton jButtonGuardarCambiosTablaToolBarChequePostFechado;
	protected JButton jButtonMostrarOcultarTablaToolBarChequePostFechado;
	protected JButton jButtonCerrarToolBarChequePostFechado;
	
	protected JButton jButtonRecargarInformacionToolBarChequePostFechado;
	protected JButton jButtonProcesarInformacionToolBarChequePostFechado;
	protected JButton jButtonAnterioresToolBarChequePostFechado;
	protected JButton jButtonSiguientesToolBarChequePostFechado;
	protected JButton jButtonNuevoGuardarCambiosToolBarChequePostFechado;
	protected JButton jButtonAbrirOrderByToolBarChequePostFechado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoChequePostFechado;
	protected JMenuItem jMenuItemDuplicarChequePostFechado;
	protected JMenuItem jMenuItemNuevoRelacionesChequePostFechado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosChequePostFechado;
	protected JMenuItem jMenuItemCopiarChequePostFechado;
	protected JMenuItem jMenuItemVerFormChequePostFechado;
	protected JMenuItem jMenuItemGuardarCambiosTablaChequePostFechado;
	protected JMenuItem jMenuItemCerrarChequePostFechado;
	protected JMenuItem jMenuItemDetalleCerrarChequePostFechado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByChequePostFechado;
	protected JMenuItem jMenuItemDetalleMostarOcultarChequePostFechado;
	
	protected JMenuItem jMenuItemRecargarInformacionChequePostFechado;
	protected JMenuItem jMenuItemProcesarInformacionChequePostFechado;
	protected JMenuItem jMenuItemAnterioresChequePostFechado;
	protected JMenuItem jMenuItemSiguientesChequePostFechado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosChequePostFechado;
	protected JMenuItem jMenuItemAbrirOrderByChequePostFechado;
	protected JMenuItem jMenuItemMostrarOcultarChequePostFechado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesChequePostFechado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosChequePostFechado;
	protected JCheckBox jCheckBoxSeleccionadosChequePostFechado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaChequePostFechado;
	protected JCheckBox jCheckBoxConGraficoReporteChequePostFechado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesChequePostFechado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesChequePostFechado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoChequePostFechado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoChequePostFechado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesChequePostFechado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionChequePostFechado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesChequePostFechado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesChequePostFechado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarChequePostFechado;
	protected JTextField jTextFieldValorCampoGeneralChequePostFechado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteChequePostFechado;
	//public JList<Reporte> jListColumnasSelectReporteChequePostFechado;
	//public JScrollPane jScrollColumnasSelectReporteChequePostFechado;
	
	//public JLabel jLabelRelacionesSelectReporteChequePostFechado;
	//public JList<Reporte> jListRelacionesSelectReporteChequePostFechado;
	//public JScrollPane jScrollRelacionesSelectReporteChequePostFechado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoChequePostFechado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoChequePostFechado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoChequePostFechado;
	//public JLabel jLabelTiposArchivoReporteDinamicoChequePostFechado;
	
		
	//public JLabel jLabelArchivoImportacionChequePostFechado;	
	//public JLabel jLabelPathArchivoImportacionChequePostFechado;
	//protected JTextField jTextFieldPathArchivoImportacionChequePostFechado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoChequePostFechado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoChequePostFechado;
	
	//public JLabel jLabelColumnaCategoriaValorChequePostFechado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorChequePostFechado;
	
	//public JLabel jLabelColumnasValoresGraficoChequePostFechado;
	//public JList<Reporte> jListColumnasValoresGraficoChequePostFechado;
	//public JScrollPane jScrollColumnasValoresGraficoChequePostFechado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoChequePostFechado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoChequePostFechado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasChequePostFechado;
	public JPanel jPanelFK_IdAsientoContableChequePostFechado;
	public JButton jButtonFK_IdAsientoContableChequePostFechado;
	public JPanel jPanelFK_IdClienteChequePostFechado;
	public JButton jButtonFK_IdClienteChequePostFechado;
	public JPanel jPanelFK_IdTipoFormaPagoChequePostFechado;
	public JButton jButtonFK_IdTipoFormaPagoChequePostFechado;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableChequePostFechado;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableChequePostFechado= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableChequePostFechadoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado;
	
	public JPanel jPanelid_clienteFK_IdClienteChequePostFechado;
	public JLabel jLabelid_clienteFK_IdClienteChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteChequePostFechado;
	public JButton jButtonid_clienteFK_IdClienteChequePostFechado= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteChequePostFechadoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteChequePostFechado;
	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechadoBusqueda= new JButtonMe();

	
	
	
	
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
	public ChequePostFechadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequePostFechadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequePostFechadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequePostFechadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionChequePostFechado)	{
		this.jButtonRecargarInformacionChequePostFechado = jButtonRecargarInformacionChequePostFechado;
	}
	
	public JButton getjButtonProcesarInformacionChequePostFechado() {
		return this.jButtonProcesarInformacionChequePostFechado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionChequePostFechado)	{
		this.jButtonProcesarInformacionChequePostFechado = jButtonProcesarInformacionChequePostFechado;
	}
	
	
	public JButton getjButtonRecargarInformacionChequePostFechado() {
		return this.jButtonRecargarInformacionChequePostFechado;
	}
	
	
	public List<ChequePostFechado> getchequepostfechados() {
		return this.chequepostfechados;
	}

	public void setchequepostfechados(List<ChequePostFechado> chequepostfechados) {
		this.chequepostfechados = chequepostfechados;
	}
	
	public List<ChequePostFechado> getchequepostfechadosAux() {
		return this.chequepostfechadosAux;
	}

	public void setchequepostfechadosAux(List<ChequePostFechado> chequepostfechadosAux) {
		this.chequepostfechadosAux = chequepostfechadosAux;
	}
	
	public List<ChequePostFechado> getchequepostfechadosEliminados() {
		return this.chequepostfechadosEliminados;
	}

	public void setChequePostFechadosEliminados(List<ChequePostFechado> chequepostfechadosEliminados) {
		this.chequepostfechadosEliminados = chequepostfechadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarChequePostFechado() {
		return jComboBoxTiposSeleccionarChequePostFechado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarChequePostFechado(
			JComboBox jComboBoxTiposSeleccionarChequePostFechado) {
		this.jComboBoxTiposSeleccionarChequePostFechado = jComboBoxTiposSeleccionarChequePostFechado;
	}
	
	public void setBorderResaltarTiposSeleccionarChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarChequePostFechado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralChequePostFechado() {
		return jTextFieldValorCampoGeneralChequePostFechado;
	}

	public void setjTextFieldValorCampoGeneralChequePostFechado(
			JTextField jTextFieldValorCampoGeneralChequePostFechado) {
		this.jTextFieldValorCampoGeneralChequePostFechado = jTextFieldValorCampoGeneralChequePostFechado;
	}

	public void setBorderResaltarValorCampoGeneralChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralChequePostFechado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosChequePostFechado() {
		return this.jCheckBoxSeleccionarTodosChequePostFechado;
	}

	public void setjCheckBoxSeleccionarTodosChequePostFechado(
			JCheckBox jCheckBoxSeleccionarTodosChequePostFechado) {
		this.jCheckBoxSeleccionarTodosChequePostFechado = jCheckBoxSeleccionarTodosChequePostFechado;
	}

	public void setBorderResaltarSeleccionarTodosChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosChequePostFechado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosChequePostFechado() {
		return this.jCheckBoxSeleccionadosChequePostFechado;
	}

	public void setjCheckBoxSeleccionadosChequePostFechado(
			JCheckBox jCheckBoxSeleccionadosChequePostFechado) {
		this.jCheckBoxSeleccionadosChequePostFechado = jCheckBoxSeleccionadosChequePostFechado;
	}
	
	public void setBorderResaltarSeleccionadosChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosChequePostFechado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesChequePostFechado() {
		return this.jComboBoxTiposArchivosReportesChequePostFechado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesChequePostFechado(
			JComboBox jComboBoxTiposArchivosReportesChequePostFechado) {
		this.jComboBoxTiposArchivosReportesChequePostFechado = jComboBoxTiposArchivosReportesChequePostFechado;
	}

	public void setBorderResaltarTiposArchivosReportesChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesChequePostFechado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesChequePostFechado() {
		return this.jComboBoxTiposReportesChequePostFechado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesChequePostFechado(
			JComboBox jComboBoxTiposReportesChequePostFechado) {
		this.jComboBoxTiposReportesChequePostFechado = jComboBoxTiposReportesChequePostFechado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoChequePostFechado() {
	//	return jComboBoxTiposReportesDinamicoChequePostFechado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoChequePostFechado(
	//		JComboBox jComboBoxTiposReportesDinamicoChequePostFechado) {
	//	this.jComboBoxTiposReportesDinamicoChequePostFechado = jComboBoxTiposReportesDinamicoChequePostFechado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoChequePostFechado() {
	//	return jComboBoxTiposArchivosReportesDinamicoChequePostFechado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoChequePostFechado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoChequePostFechado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado = jComboBoxTiposArchivosReportesDinamicoChequePostFechado;
	//}
	
	public void setBorderResaltarTiposReportesChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesChequePostFechado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesChequePostFechado() {
		return this.jComboBoxTiposGraficosReportesChequePostFechado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesChequePostFechado(
			JComboBox jComboBoxTiposGraficosReportesChequePostFechado) {
		this.jComboBoxTiposGraficosReportesChequePostFechado = jComboBoxTiposGraficosReportesChequePostFechado;
	}
	
	public void setBorderResaltarTiposGraficosReportesChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesChequePostFechado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionChequePostFechado() {
		return this.jComboBoxTiposPaginacionChequePostFechado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionChequePostFechado(
			JComboBox jComboBoxTiposPaginacionChequePostFechado) {
		this.jComboBoxTiposPaginacionChequePostFechado = jComboBoxTiposPaginacionChequePostFechado;
	}
	
	public void setBorderResaltarTiposPaginacionChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionChequePostFechado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesChequePostFechado() {
		return this.jComboBoxTiposRelacionesChequePostFechado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesChequePostFechado() {
		return this.jComboBoxTiposAccionesChequePostFechado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesChequePostFechado(
			JComboBox jComboBoxTiposRelacionesChequePostFechado) {
		this.jComboBoxTiposRelacionesChequePostFechado = jComboBoxTiposRelacionesChequePostFechado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesChequePostFechado(
			JComboBox jComboBoxTiposAccionesChequePostFechado) {
		this.jComboBoxTiposAccionesChequePostFechado = jComboBoxTiposAccionesChequePostFechado;
	}
	
	public void setBorderResaltarTiposRelacionesChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesChequePostFechado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesChequePostFechado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesChequePostFechado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoChequePostFechado() {
	//	return jCheckBoxConGraficoDinamicoChequePostFechado;
	//}

	//public void setjCheckBoxConGraficoDinamicoChequePostFechado(
	//		JCheckBox jCheckBoxConGraficoDinamicoChequePostFechado) {
	//	this.jCheckBoxConGraficoDinamicoChequePostFechado = jCheckBoxConGraficoDinamicoChequePostFechado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoChequePostFechado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarChequePostFechado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoChequePostFechado .setBorder(borderResaltar);		
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
		this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		
		this.chequepostfechadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.chequepostfechadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.chequepostfechadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ChequePostFechadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cheque Post Fechado MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
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
		
		ChequePostFechadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ChequePostFechado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarChequePostFechado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"nuevo","nuevo","Nuevo"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"duplicar","duplicar","Duplicar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"copiar","copiar","Copiar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"ver_form","ver_form","Ver"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"recargar","recargar","Recargar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarChequePostFechado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarChequePostFechado,this.jTtoolBarChequePostFechado,
							"cerrar","cerrar","Salir"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarChequePostFechado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarChequePostFechado;
			
				this.jButtonProcesarInformacionToolBarChequePostFechado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarChequePostFechado;
				
		//protected JButton jButtonModificarToolBarChequePostFechado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarChequePostFechado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuChequePostFechado=new JMenuMe("General");
		this.jmenuArchivoChequePostFechado=new JMenuMe("Archivo");
		this.jmenuAccionesChequePostFechado=new JMenuMe("Acciones");
		this.jmenuDatosChequePostFechado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoChequePostFechado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoChequePostFechado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoChequePostFechado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarChequePostFechado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarChequePostFechado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarChequePostFechado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesChequePostFechado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesChequePostFechado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesChequePostFechado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosChequePostFechado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosChequePostFechado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosChequePostFechado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarChequePostFechado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarChequePostFechado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarChequePostFechado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormChequePostFechado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormChequePostFechado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormChequePostFechado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaChequePostFechado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaChequePostFechado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaChequePostFechado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarChequePostFechado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarChequePostFechado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarChequePostFechado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionChequePostFechado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionChequePostFechado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionChequePostFechado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionChequePostFechado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionChequePostFechado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionChequePostFechado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresChequePostFechado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresChequePostFechado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresChequePostFechado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesChequePostFechado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesChequePostFechado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesChequePostFechado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByChequePostFechado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByChequePostFechado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByChequePostFechado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarChequePostFechado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarChequePostFechado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarChequePostFechado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByChequePostFechado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByChequePostFechado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByChequePostFechado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarChequePostFechado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarChequePostFechado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarChequePostFechado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosChequePostFechado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosChequePostFechado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosChequePostFechado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoChequePostFechado.add(this.jMenuItemCerrarChequePostFechado);
			
			this.jmenuAccionesChequePostFechado.add(this.jMenuItemNuevoChequePostFechado);
			this.jmenuAccionesChequePostFechado.add(this.jMenuItemNuevoGuardarCambiosChequePostFechado);
			this.jmenuAccionesChequePostFechado.add(this.jMenuItemNuevoRelacionesChequePostFechado);
			this.jmenuAccionesChequePostFechado.add(this.jMenuItemGuardarCambiosTablaChequePostFechado);		
			this.jmenuAccionesChequePostFechado.add(this.jMenuItemDuplicarChequePostFechado);		
			this.jmenuAccionesChequePostFechado.add(this.jMenuItemCopiarChequePostFechado);		
			this.jmenuAccionesChequePostFechado.add(this.jMenuItemVerFormChequePostFechado);		
			
			this.jmenuDatosChequePostFechado.add(this.jMenuItemRecargarInformacionChequePostFechado);				
			this.jmenuDatosChequePostFechado.add(this.jMenuItemAnterioresChequePostFechado);				
			this.jmenuDatosChequePostFechado.add(this.jMenuItemSiguientesChequePostFechado);				
			this.jmenuDatosChequePostFechado.add(this.jMenuItemAbrirOrderByChequePostFechado);				
			this.jmenuDatosChequePostFechado.add(this.jMenuItemMostrarOcultarChequePostFechado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesChequePostFechado.add(this.jMenuItemGuardarCambiosChequePostFechado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarChequePostFechado.add(this.jmenuArchivoChequePostFechado);		
			this.jmenuBarChequePostFechado.add(this.jmenuAccionesChequePostFechado);		
			this.jmenuBarChequePostFechado.add(this.jmenuDatosChequePostFechado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarChequePostFechado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasChequePostFechado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableChequePostFechado.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableChequePostFechado= new JButtonMe();
		this.jButtonFK_IdAsientoContableChequePostFechado.setText("Buscar");
		this.jButtonFK_IdAsientoContableChequePostFechado.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableChequePostFechado,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado.setFocusable(false);

		this.jPanelFK_IdClienteChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteChequePostFechado.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteChequePostFechado= new JButtonMe();
		this.jButtonFK_IdClienteChequePostFechado.setText("Buscar");
		this.jButtonFK_IdClienteChequePostFechado.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteChequePostFechado,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteChequePostFechado = new JLabelMe();
		jLabelid_clienteFK_IdClienteChequePostFechado.setText("Cliente :");
		jLabelid_clienteFK_IdClienteChequePostFechado.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteChequePostFechado= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado.setFocusable(false);

		this.jPanelFK_IdTipoFormaPagoChequePostFechado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoChequePostFechado.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoChequePostFechado= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoChequePostFechado.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoChequePostFechado.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoChequePostFechado,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasChequePostFechado=new JTabbedPane();


		this.jTabbedPaneBusquedasChequePostFechado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasChequePostFechado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasChequePostFechado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasChequePostFechado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleChequePostFechado = new ChequePostFechadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cheque Post Fechado DATOS");
			this.jInternalFrameDetalleFormChequePostFechado = new ChequePostFechadoDetalleFormJInternalFrame(jDesktopPane,this.chequepostfechadoSessionBean.getConGuardarRelaciones(),this.chequepostfechadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormChequePostFechado = null;//new ChequePostFechadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutChequePostFechado= new GridBagLayout();
		
		
		this.jTableDatosChequePostFechado = new JTableMe();      
		
		String sToolTipChequePostFechado="";
		sToolTipChequePostFechado=ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipChequePostFechado+="(Tesoreria.ChequePostFechado)";
		}
		
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipChequePostFechado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosChequePostFechado.setToolTipText(sToolTipChequePostFechado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosChequePostFechado);
		this.jTableDatosChequePostFechado.setAutoCreateRowSorter(true);
		this.jTableDatosChequePostFechado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosChequePostFechado.setRowSelectionAllowed(true);
		this.jTableDatosChequePostFechado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosChequePostFechado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoChequePostFechado = new JButtonMe();
		this.jButtonDuplicarChequePostFechado = new JButtonMe();
		this.jButtonCopiarChequePostFechado = new JButtonMe();
		this.jButtonVerFormChequePostFechado = new JButtonMe();
		this.jButtonNuevoRelacionesChequePostFechado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaChequePostFechado = new JButtonMe();
		this.jButtonCerrarChequePostFechado = new JButtonMe();
		
		this.jScrollPanelDatosChequePostFechado = new JScrollPane();   
        this.jScrollPanelDatosGeneralChequePostFechado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cheque Post Fechado";
		
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheque Post Fechados" + this.sPath));
		} else {
			this.jScrollPanelDatosChequePostFechado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesChequePostFechado.setToolTipText("Acciones");
        this.jPanelAccionesChequePostFechado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoChequePostFechado=new ReporteDinamicoJInternalFrame(ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoChequePostFechado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionChequePostFechado=new ImportacionJInternalFrame(ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionChequePostFechado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByChequePostFechado = new JButtonMe();
		
		this.jButtonAbrirOrderByChequePostFechado.setText("Orden");
		this.jButtonAbrirOrderByChequePostFechado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByChequePostFechado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByChequePostFechado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequePostFechado,false,this);
			
			//this.cargarOrderByChequePostFechado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByChequePostFechado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequePostFechado,true,this);
			
			//this.cargarOrderByChequePostFechado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosChequePostFechado.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosChequePostFechado.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosChequePostFechado.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosChequePostFechado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosChequePostFechado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosChequePostFechado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoChequePostFechado.setText("Nuevo");
		this.jButtonDuplicarChequePostFechado.setText("Duplicar");
		this.jButtonCopiarChequePostFechado.setText("Copiar");
		this.jButtonVerFormChequePostFechado.setText("Ver");
		this.jButtonNuevoRelacionesChequePostFechado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaChequePostFechado.setText("Guardar");
		this.jButtonCerrarChequePostFechado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoChequePostFechado,"nuevo_button","Nuevo",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarChequePostFechado,"duplicar_button","Duplicar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarChequePostFechado,"copiar_button","Copiar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormChequePostFechado,"ver_form","Ver",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesChequePostFechado,"nuevorelaciones_button","Nuevo Rel",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaChequePostFechado,"guardarcambiostabla_button","Guardar",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarChequePostFechado,"cerrar_button","Salir",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoChequePostFechado.setToolTipText("Nuevo"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarChequePostFechado.setToolTipText("Duplicar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarChequePostFechado.setToolTipText("Copiar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormChequePostFechado.setToolTipText("Ver"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesChequePostFechado.setToolTipText("Nuevo Rel"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaChequePostFechado.setToolTipText("Guardar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarChequePostFechado.setToolTipText("Salir"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoChequePostFechado";
		inputMap = this.jButtonNuevoChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoChequePostFechado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoChequePostFechado"));
		
		//DUPLICAR
		sMapKey = "DuplicarChequePostFechado";
		inputMap = this.jButtonDuplicarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarChequePostFechado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarChequePostFechado"));
		
		//COPIAR
		sMapKey = "CopiarChequePostFechado";
		inputMap = this.jButtonCopiarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarChequePostFechado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarChequePostFechado"));
		
		//VEr FORM
		sMapKey = "VerFormChequePostFechado";
		inputMap = this.jButtonVerFormChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormChequePostFechado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormChequePostFechado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesChequePostFechado";
		inputMap = this.jButtonNuevoRelacionesChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesChequePostFechado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarChequePostFechado";
		inputMap = this.jButtonModificarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarChequePostFechado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarChequePostFechado";
		inputMap = this.jButtonCerrarChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarChequePostFechado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaChequePostFechado";
		inputMap = this.jButtonGuardarCambiosTablaChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaChequePostFechado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ChequePostFechado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ChequePostFechado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ChequePostFechado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ChequePostFechado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ChequePostFechado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesChequePostFechado.setName("jPanelParametrosReportesChequePostFechado"); 
		
		this.jPanelParametrosReportesAccionesChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesChequePostFechado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesChequePostFechado.setName("jPanelParametrosReportesAccionesChequePostFechado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionChequePostFechado = new JButtonMe();
		this.jButtonRecargarInformacionChequePostFechado.setText("Recargar");
		this.jButtonRecargarInformacionChequePostFechado.setToolTipText("Recargar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionChequePostFechado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionChequePostFechado = new JButtonMe();
		this.jButtonProcesarInformacionChequePostFechado.setText("Procesar");
		this.jButtonProcesarInformacionChequePostFechado.setToolTipText("Procesar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionChequePostFechado.setVisible(false);
			
		this.jButtonProcesarInformacionChequePostFechado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionChequePostFechado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionChequePostFechado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesChequePostFechado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesChequePostFechado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesChequePostFechado.setText("TIPO");       
		this.jComboBoxTiposReportesChequePostFechado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesChequePostFechado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesChequePostFechado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionChequePostFechado.setText("Paginacion");
		this.jComboBoxTiposPaginacionChequePostFechado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesChequePostFechado.setText("Accion");
		this.jComboBoxTiposRelacionesChequePostFechado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesChequePostFechado.setText("Accion");
		this.jComboBoxTiposAccionesChequePostFechado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarChequePostFechado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarChequePostFechado.setText("Accion");
		this.jComboBoxTiposSeleccionarChequePostFechado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralChequePostFechado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralChequePostFechado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralChequePostFechado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralChequePostFechado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesChequePostFechado = new JLabelMe();
		
		this.jLabelAccionesChequePostFechado.setText("Acciones");		
		this.jLabelAccionesChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosChequePostFechado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosChequePostFechado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosChequePostFechado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosChequePostFechado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosChequePostFechado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosChequePostFechado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaChequePostFechado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaChequePostFechado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaChequePostFechado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteChequePostFechado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteChequePostFechado.setText("Graf.");
		this.jCheckBoxConGraficoReporteChequePostFechado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresChequePostFechado = new JButtonMe();
		//this.jButtonAnterioresChequePostFechado.setText("<<");
        this.jButtonAnterioresChequePostFechado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresChequePostFechado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesChequePostFechado = new JButtonMe();
		//this.jButtonSiguientesChequePostFechado.setText(">>");
        this.jButtonSiguientesChequePostFechado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesChequePostFechado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosChequePostFechado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosChequePostFechado.setText("Nue");
        this.jButtonNuevoGuardarCambiosChequePostFechado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosChequePostFechado,"nuevoguardarcambios_button","Nue",this.chequepostfechadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosChequePostFechado";
		inputMap = this.jButtonNuevoGuardarCambiosChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosChequePostFechado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionChequePostFechado";
		inputMap = this.jButtonRecargarInformacionChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionChequePostFechado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesChequePostFechado";
		inputMap = this.jButtonSiguientesChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesChequePostFechado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresChequePostFechado";
		inputMap = this.jButtonAnterioresChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresChequePostFechado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasChequePostFechado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesChequePostFechado.setMinimumSize(new Dimension(this.getWidth(),ChequePostFechadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ChequePostFechadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesChequePostFechado.setMaximumSize(new Dimension(this.getWidth(),ChequePostFechadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ChequePostFechadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesChequePostFechado.setPreferredSize(new Dimension(this.getWidth(),ChequePostFechadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ChequePostFechadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionChequePostFechado = new GridBagLayout();

			this.jPanelPaginacionChequePostFechado.setLayout(gridaBagLayoutPaginacionChequePostFechado);						
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = 0;
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionChequePostFechado.add(this.jButtonAnterioresChequePostFechado, this.gridBagConstraintsChequePostFechado);
					
						
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsChequePostFechado.gridy = 0;
			
			this.jPanelPaginacionChequePostFechado.add(this.jButtonNuevoGuardarCambiosChequePostFechado, this.gridBagConstraintsChequePostFechado);
						
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsChequePostFechado.gridy = 0;
			this.jPanelPaginacionChequePostFechado.add(this.jButtonSiguientesChequePostFechado, this.gridBagConstraintsChequePostFechado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = 1;
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequePostFechado.add(this.jButtonNuevoChequePostFechado, this.gridBagConstraintsChequePostFechado);
						
			
			
			if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
				this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsChequePostFechado.gridy = 1;
				this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionChequePostFechado.add(this.jButtonGuardarCambiosTablaChequePostFechado, this.gridBagConstraintsChequePostFechado);
			}
			
			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = 1;
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequePostFechado.add(this.jButtonDuplicarChequePostFechado, this.gridBagConstraintsChequePostFechado);
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = 1;
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequePostFechado.add(this.jButtonCopiarChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = 1;
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionChequePostFechado.add(this.jButtonVerFormChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = 1;
			this.gridBagConstraintsChequePostFechado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionChequePostFechado.add(this.jButtonCerrarChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
		
		
		this.jButtonRecargarInformacionChequePostFechado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionChequePostFechado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionChequePostFechado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesChequePostFechado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesChequePostFechado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesChequePostFechado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesChequePostFechado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesChequePostFechado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesChequePostFechado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesChequePostFechado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesChequePostFechado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesChequePostFechado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionChequePostFechado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionChequePostFechado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionChequePostFechado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesChequePostFechado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesChequePostFechado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesChequePostFechado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesChequePostFechado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequePostFechado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequePostFechado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarChequePostFechado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarChequePostFechado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarChequePostFechado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaChequePostFechado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaChequePostFechado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaChequePostFechado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteChequePostFechado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteChequePostFechado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteChequePostFechado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosChequePostFechado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosChequePostFechado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosChequePostFechado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosChequePostFechado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosChequePostFechado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosChequePostFechado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesChequePostFechado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesChequePostFechado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ChequePostFechado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ChequePostFechado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ChequePostFechado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ChequePostFechado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesChequePostFechado.setLayout(gridaBagParametrosReportesChequePostFechado);
			this.jPanelParametrosReportesAccionesChequePostFechado.setLayout(gridaBagParametrosReportesAccionesChequePostFechado);
			
			
			this.jPanelParametrosAuxiliar1ChequePostFechado.setLayout(gridaBagParametrosAuxiliar1ChequePostFechado);
			this.jPanelParametrosAuxiliar2ChequePostFechado.setLayout(gridaBagParametrosAuxiliar2ChequePostFechado);
			this.jPanelParametrosAuxiliar3ChequePostFechado.setLayout(gridaBagParametrosAuxiliar3ChequePostFechado);
			this.jPanelParametrosAuxiliar4ChequePostFechado.setLayout(gridaBagParametrosAuxiliar4ChequePostFechado);
			//this.jPanelParametrosAuxiliar5ChequePostFechado.setLayout(gridaBagParametrosAuxiliar2ChequePostFechado);			
			
			
			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesChequePostFechado.add(this.jButtonRecargarInformacionChequePostFechado, this.gridBagConstraintsChequePostFechado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ChequePostFechado.add(this.jComboBoxTiposPaginacionChequePostFechado, this.gridBagConstraintsChequePostFechado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ChequePostFechado.add(this.jCheckBoxConAltoMaximoTablaChequePostFechado, this.gridBagConstraintsChequePostFechado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ChequePostFechado.add(this.jComboBoxTiposArchivosReportesChequePostFechado, this.gridBagConstraintsChequePostFechado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequePostFechado.add(this.jPanelParametrosAuxiliar1ChequePostFechado, this.gridBagConstraintsChequePostFechado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequePostFechado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ChequePostFechado.add(this.jComboBoxTiposReportesChequePostFechado, this.gridBagConstraintsChequePostFechado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequePostFechado.add(this.jPanelParametrosAuxiliar4ChequePostFechado, this.gridBagConstraintsChequePostFechado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequePostFechado.add(this.jComboBoxTiposReportesChequePostFechado, this.gridBagConstraintsChequePostFechado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesChequePostFechado.add(this.jCheckBoxGenerarReporteChequePostFechado, this.gridBagConstraintsChequePostFechado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequePostFechado.add(this.jPanelParametrosAuxiliar2ChequePostFechado, this.gridBagConstraintsChequePostFechado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsChequePostFechado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesChequePostFechado.add(this.jLabelAccionesChequePostFechado, this.gridBagConstraintsChequePostFechado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
				this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesChequePostFechado.add(this.jButtonAbrirOrderByChequePostFechado, this.gridBagConstraintsChequePostFechado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesChequePostFechado.add(this.jComboBoxTiposSeleccionarChequePostFechado, this.gridBagConstraintsChequePostFechado);			
			
			
			/*
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsChequePostFechado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesChequePostFechado.add(this.jCheckBoxSeleccionarTodosChequePostFechado, this.gridBagConstraintsChequePostFechado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequePostFechado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ChequePostFechado.add(this.jCheckBoxSeleccionarTodosChequePostFechado, this.gridBagConstraintsChequePostFechado);															
				
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsChequePostFechado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ChequePostFechado.add(this.jCheckBoxSeleccionadosChequePostFechado, this.gridBagConstraintsChequePostFechado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesChequePostFechado.add(this.jPanelParametrosAuxiliar3ChequePostFechado, this.gridBagConstraintsChequePostFechado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesChequePostFechado.add(this.jComboBoxTiposAccionesChequePostFechado, this.gridBagConstraintsChequePostFechado);
	
				
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsChequePostFechado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesChequePostFechado.add(this.jTextFieldValorCampoGeneralChequePostFechado, this.gridBagConstraintsChequePostFechado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosChequePostFechado = new GridBagLayout();

			this.jScrollPanelDatosChequePostFechado.setLayout(gridaBagLayoutDatosChequePostFechado);
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = 0;
			this.gridBagConstraintsChequePostFechado.gridx = 0;
			
			this.jScrollPanelDatosChequePostFechado.add(this.jTableDatosChequePostFechado, this.gridBagConstraintsChequePostFechado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosChequePostFechado.setViewportView(this.jTableDatosChequePostFechado);
		this.jTableDatosChequePostFechado.setFillsViewportHeight(true);
		this.jTableDatosChequePostFechado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesChequePostFechado= new GridBagLayout();
		this.jPanelAccionesChequePostFechado.setLayout(gridaBagLayoutAccionesChequePostFechado);
		
		
		/*	
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = 0;
		this.gridBagConstraintsChequePostFechado.gridx = 0;
			
		this.jPanelAccionesChequePostFechado.add(this.jButtonNuevoChequePostFechado, this.gridBagConstraintsChequePostFechado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableChequePostFechado= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableChequePostFechado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableChequePostFechado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableChequePostFechado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableChequePostFechado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableChequePostFechado.setLayout(gridaBagLayoutFK_IdAsientoContableChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 0;
		jPanelFK_IdAsientoContableChequePostFechado.add(jLabelid_asiento_contableFK_IdAsientoContableChequePostFechado, gridBagConstraintsChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 1;
		jPanelFK_IdAsientoContableChequePostFechado.add(jComboBoxid_asiento_contableFK_IdAsientoContableChequePostFechado, gridBagConstraintsChequePostFechado);


		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.EAST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 0;
		jPanelFK_IdAsientoContableChequePostFechado.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableChequePostFechado, gridBagConstraintsChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 1;
		gridBagConstraintsChequePostFechado.gridx =1;
		jPanelFK_IdAsientoContableChequePostFechado.add(jButtonFK_IdAsientoContableChequePostFechado, gridBagConstraintsChequePostFechado);

		jTabbedPaneBusquedasChequePostFechado.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableChequePostFechado);
		jTabbedPaneBusquedasChequePostFechado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteChequePostFechado= new GridBagLayout();
		gridaBagLayoutFK_IdClienteChequePostFechado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteChequePostFechado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteChequePostFechado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteChequePostFechado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteChequePostFechado.setLayout(gridaBagLayoutFK_IdClienteChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 0;
		jPanelFK_IdClienteChequePostFechado.add(jLabelid_clienteFK_IdClienteChequePostFechado, gridBagConstraintsChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 1;
		jPanelFK_IdClienteChequePostFechado.add(jComboBoxid_clienteFK_IdClienteChequePostFechado, gridBagConstraintsChequePostFechado);


		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.EAST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.NONE;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 0;
		jPanelFK_IdClienteChequePostFechado.add(this.jButtonBuscarFK_IdClienteid_clienteChequePostFechado, gridBagConstraintsChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 1;
		gridBagConstraintsChequePostFechado.gridx =1;
		jPanelFK_IdClienteChequePostFechado.add(jButtonFK_IdClienteChequePostFechado, gridBagConstraintsChequePostFechado);

		jTabbedPaneBusquedasChequePostFechado.addTab("2.-Por Cliente ", jPanelFK_IdClienteChequePostFechado);
		jTabbedPaneBusquedasChequePostFechado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoChequePostFechado= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoChequePostFechado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoChequePostFechado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoChequePostFechado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoChequePostFechado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoChequePostFechado.setLayout(gridaBagLayoutFK_IdTipoFormaPagoChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 0;
		jPanelFK_IdTipoFormaPagoChequePostFechado.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado, gridBagConstraintsChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 0;
		gridBagConstraintsChequePostFechado.gridx = 1;
		jPanelFK_IdTipoFormaPagoChequePostFechado.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoChequePostFechado, gridBagConstraintsChequePostFechado);

		gridBagConstraintsChequePostFechado = new GridBagConstraints();
		gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsChequePostFechado.gridy = 1;
		gridBagConstraintsChequePostFechado.gridx =1;
		jPanelFK_IdTipoFormaPagoChequePostFechado.add(jButtonFK_IdTipoFormaPagoChequePostFechado, gridBagConstraintsChequePostFechado);

		jTabbedPaneBusquedasChequePostFechado.addTab("3.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoChequePostFechado);
		jTabbedPaneBusquedasChequePostFechado.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutChequePostFechado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutChequePostFechado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();						
			this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsChequePostFechado.gridx = 0;		
			//this.gridBagConstraintsChequePostFechado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsChequePostFechado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarChequePostFechado, this.gridBagConstraintsChequePostFechado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsChequePostFechado.gridx = 0;		
		//this.gridBagConstraintsChequePostFechado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsChequePostFechado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsChequePostFechado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsChequePostFechado.gridx = 0;		
			this.gridBagConstraintsChequePostFechado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsChequePostFechado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasChequePostFechado, this.gridBagConstraintsChequePostFechado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesChequePostFechado, this.gridBagConstraintsChequePostFechado);								
		
		
		/*
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesChequePostFechado, this.gridBagConstraintsChequePostFechado);
		*/		
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsChequePostFechado.gridx =0;
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsChequePostFechado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosChequePostFechado, this.gridBagConstraintsChequePostFechado);
				
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionChequePostFechado, this.gridBagConstraintsChequePostFechado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ChequePostFechadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosChequePostFechado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosChequePostFechado = new GridBagLayout();
			this.jPanelBusquedasParametrosChequePostFechado.setLayout(gridaBagLayoutBusquedasParametrosChequePostFechado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralChequePostFechado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralChequePostFechado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequePostFechado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequePostFechado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposChequePostFechado, this.gridBagConstraintsChequePostFechado);
			
			
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
			
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsChequePostFechado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesChequePostFechado, this.gridBagConstraintsChequePostFechado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralChequePostFechado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoChequePostFechado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoChequePostFechado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoChequePostFechado.setName("jPanelReporteDinamicoChequePostFechado"); 
		
		this.jPanelReporteDinamicoChequePostFechado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoChequePostFechado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoChequePostFechado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoChequePostFechado.setLayout(gridaBagLayoutReporteDinamicoChequePostFechado);
		
		
		this.jInternalFrameReporteDinamicoChequePostFechado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoChequePostFechado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteChequePostFechado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoChequePostFechado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoChequePostFechado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoChequePostFechado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoChequePostFechado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoChequePostFechado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoChequePostFechado.setResizable(true);
	    this.jInternalFrameReporteDinamicoChequePostFechado.setClosable(true);
	    this.jInternalFrameReporteDinamicoChequePostFechado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoChequePostFechado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoChequePostFechado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoChequePostFechado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheque Post Fechados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteChequePostFechado = new JLabelMe();

		this.jLabelColumnasSelectReporteChequePostFechado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoChequePostFechado.add(this.jLabelColumnasSelectReporteChequePostFechado, this.gridBagConstraintsChequePostFechado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteChequePostFechado = new JList<Reporte>();
		this.jListColumnasSelectReporteChequePostFechado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteChequePostFechado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteChequePostFechado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteChequePostFechado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteChequePostFechado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteChequePostFechado=new JScrollPane(this.jListColumnasSelectReporteChequePostFechado);
			
			this.jScrollColumnasSelectReporteChequePostFechado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteChequePostFechado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteChequePostFechado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoChequePostFechado.add(this.jListColumnasSelectReporteChequePostFechado, this.gridBagConstraintsChequePostFechado);
		this.jPanelReporteDinamicoChequePostFechado.add(this.jScrollColumnasSelectReporteChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteChequePostFechado = new JLabelMe();

		this.jLabelRelacionesSelectReporteChequePostFechado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteChequePostFechado = new JList<Reporte>();
		this.jListRelacionesSelectReporteChequePostFechado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteChequePostFechado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteChequePostFechado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteChequePostFechado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteChequePostFechado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteChequePostFechado=new JScrollPane(this.jListRelacionesSelectReporteChequePostFechado);
			
			this.jScrollRelacionesSelectReporteChequePostFechado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteChequePostFechado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteChequePostFechado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoChequePostFechado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoChequePostFechado = new JComboBoxMe();
		this.jListColumnasValoresGraficoChequePostFechado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoChequePostFechado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoChequePostFechado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoChequePostFechado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoChequePostFechado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoChequePostFechado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoChequePostFechado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoChequePostFechado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequePostFechado.add(this.jLabelGenerarExcelReporteDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoChequePostFechado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoChequePostFechado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoChequePostFechado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoChequePostFechado.setToolTipText("Generar EXCEL"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		//this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoChequePostFechado.add(this.jButtonGenerarExcelReporteDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequePostFechado.add(this.jComboBoxTiposReportesDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoChequePostFechado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoChequePostFechado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoChequePostFechado.add(this.jLabelTiposArchivoReporteDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequePostFechado.add(this.jComboBoxTiposArchivosReportesDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoChequePostFechado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoChequePostFechado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoChequePostFechado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoChequePostFechado.setToolTipText("Generar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequePostFechado.add(this.jButtonGenerarReporteDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoChequePostFechado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoChequePostFechado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoChequePostFechado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoChequePostFechado.setToolTipText("Cancelar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoChequePostFechado.add(this.jButtonCerrarReporteDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalChequePostFechado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoChequePostFechado= new JScrollPane(jPanelReporteDinamicoChequePostFechado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoChequePostFechado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoChequePostFechado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoChequePostFechado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheque Post Fechados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsChequePostFechado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoChequePostFechado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoChequePostFechado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalChequePostFechado);
		this.jInternalFrameReporteDinamicoChequePostFechado.getContentPane().add(this.jScrollPanelReporteDinamicoChequePostFechado, this.gridBagConstraintsChequePostFechado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionChequePostFechado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionChequePostFechado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionChequePostFechado.setName("jPanelImportacionChequePostFechado"); 
		
		this.jPanelImportacionChequePostFechado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionChequePostFechado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionChequePostFechado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionChequePostFechado.setLayout(gridaBagLayoutImportacionChequePostFechado);
		
		
		this.jInternalFrameImportacionChequePostFechado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionChequePostFechado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionChequePostFechado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteChequePostFechado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionChequePostFechado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionChequePostFechado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionChequePostFechado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionChequePostFechado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionChequePostFechado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionChequePostFechado.setResizable(true);
	    this.jInternalFrameImportacionChequePostFechado.setClosable(true);
	    this.jInternalFrameImportacionChequePostFechado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionChequePostFechado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionChequePostFechado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionChequePostFechado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionChequePostFechado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionChequePostFechado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionChequePostFechado.setResizable(true);
	    this.jInternalFrameImportacionChequePostFechado.setClosable(true);
	    this.jInternalFrameImportacionChequePostFechado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionChequePostFechado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionChequePostFechado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionChequePostFechado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheque Post Fechados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionChequePostFechado = new JLabelMe();

		this.jLabelArchivoImportacionChequePostFechado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYImportacion;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionChequePostFechado.add(this.jLabelArchivoImportacionChequePostFechado, this.gridBagConstraintsChequePostFechado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionChequePostFechado = new JFileChooser();		
		this.jFileChooserImportacionChequePostFechado.setToolTipText("ESCOGER ARCHIVO"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionChequePostFechado = new JButtonMe();
		this.jButtonAbrirImportacionChequePostFechado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionChequePostFechado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionChequePostFechado.setToolTipText("Generar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYImportacion;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequePostFechado.add(this.jButtonAbrirImportacionChequePostFechado, this.gridBagConstraintsChequePostFechado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionChequePostFechado = new JLabelMe();

		this.jLabelPathArchivoImportacionChequePostFechado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionChequePostFechado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionChequePostFechado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionChequePostFechado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYImportacion;		
		this.gridBagConstraintsChequePostFechado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionChequePostFechado.add(this.jLabelPathArchivoImportacionChequePostFechado, this.gridBagConstraintsChequePostFechado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionChequePostFechado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionChequePostFechado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionChequePostFechado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionChequePostFechado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYImportacion;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequePostFechado.add(this.jTextFieldPathArchivoImportacionChequePostFechado, this.gridBagConstraintsChequePostFechado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionChequePostFechado = new JButtonMe();
		this.jButtonGenerarImportacionChequePostFechado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionChequePostFechado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionChequePostFechado.setToolTipText("Generar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYImportacion;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequePostFechado.add(this.jButtonGenerarImportacionChequePostFechado, this.gridBagConstraintsChequePostFechado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionChequePostFechado = new JButtonMe();
		this.jButtonCerrarImportacionChequePostFechado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionChequePostFechado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionChequePostFechado.setToolTipText("Cancelar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequePostFechado.gridy = iPosYImportacion;
		this.gridBagConstraintsChequePostFechado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionChequePostFechado.add(this.jButtonCerrarImportacionChequePostFechado, this.gridBagConstraintsChequePostFechado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalChequePostFechado = new GridBagLayout();
		
		this.jScrollPanelImportacionChequePostFechado= new JScrollPane(jPanelImportacionChequePostFechado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
		this.gridBagConstraintsChequePostFechado.gridy =iPosYImportacion;
		this.gridBagConstraintsChequePostFechado.gridx =iPosXImportacion;
		this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionChequePostFechado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionChequePostFechado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalChequePostFechado);
		this.jInternalFrameImportacionChequePostFechado.getContentPane().add(this.jScrollPanelImportacionChequePostFechado, this.gridBagConstraintsChequePostFechado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByChequePostFechado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByChequePostFechado = new JButtonMe();
			this.jButtonAbrirOrderByChequePostFechado.setText("Orden");
			this.jButtonAbrirOrderByChequePostFechado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByChequePostFechado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByChequePostFechado";
			inputMap = this.jButtonAbrirOrderByChequePostFechado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByChequePostFechado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByChequePostFechado"));
		
		
			GridBagLayout gridaBagLayoutOrderByChequePostFechado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByChequePostFechado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByChequePostFechado.setName("jPanelOrderByChequePostFechado"); 
			
			this.jPanelOrderByChequePostFechado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByChequePostFechado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByChequePostFechado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByChequePostFechado.setLayout(gridaBagLayoutOrderByChequePostFechado);
			
			
			this.jTableDatosChequePostFechadoOrderBy = new JTableMe();        
			this.jTableDatosChequePostFechadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosChequePostFechadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosChequePostFechadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosChequePostFechadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosChequePostFechadoOrderBy.setViewportView(this.jTableDatosChequePostFechadoOrderBy);
			this.jTableDatosChequePostFechadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosChequePostFechadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByChequePostFechado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByChequePostFechado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByChequePostFechado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteChequePostFechado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByChequePostFechado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByChequePostFechado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByChequePostFechado.setTitle("Orden");
			this.jInternalFrameOrderByChequePostFechado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByChequePostFechado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByChequePostFechado.setResizable(true);
			this.jInternalFrameOrderByChequePostFechado.setClosable(true);
			this.jInternalFrameOrderByChequePostFechado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByChequePostFechado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByChequePostFechado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByChequePostFechado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByChequePostFechado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheque Post Fechados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsChequePostFechado.gridx =iPosXOrderBy;
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsChequePostFechado.ipady =150;
				
			this.jPanelOrderByChequePostFechado.add(jScrollPanelDatosChequePostFechadoOrderBy, this.gridBagConstraintsChequePostFechado);//this.jTableDatosChequePostFechadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByChequePostFechado = new JButtonMe();
			this.jButtonCerrarOrderByChequePostFechado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByChequePostFechado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByChequePostFechado.setToolTipText("Cancelar"+" "+ChequePostFechadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByChequePostFechado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequePostFechado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsChequePostFechado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByChequePostFechado.add(this.jButtonCerrarOrderByChequePostFechado, this.gridBagConstraintsChequePostFechado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalChequePostFechado = new GridBagLayout();
			
			this.jScrollPanelOrderByChequePostFechado= new JScrollPane(jPanelOrderByChequePostFechado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsChequePostFechado = new GridBagConstraints();
			this.gridBagConstraintsChequePostFechado.gridy =iPosYOrderBy;
			this.gridBagConstraintsChequePostFechado.gridx =iPosXOrderBy;
			this.gridBagConstraintsChequePostFechado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByChequePostFechado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByChequePostFechado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalChequePostFechado);
			
			this.jInternalFrameOrderByChequePostFechado.getContentPane().add(this.jScrollPanelOrderByChequePostFechado, this.gridBagConstraintsChequePostFechado);			
		
		} else {
			this.jButtonAbrirOrderByChequePostFechado = new JButtonMe();
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
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.chequepostfechadoSessionBean.getConGuardarRelaciones()
			) {
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
		int iCountColumns=this.jTableDatosChequePostFechado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosChequePostFechado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosChequePostFechado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosChequePostFechado.getRowHeight();//ChequePostFechadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaChequePostFechado.isSelected()) {
					iHeightTable=ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaChequePostFechado.isSelected()) {
					iHeightTable=ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ChequePostFechadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosChequePostFechado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosChequePostFechado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosChequePostFechado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosChequePostFechado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosChequePostFechado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosChequePostFechado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByChequePostFechado!=null && this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy()!=null) {
			//if(!this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByChequePostFechado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByChequePostFechado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByChequePostFechado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByChequePostFechado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosChequePostFechado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosChequePostFechado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosChequePostFechado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=chequepostfechadoLogic.getChequePostFechados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=chequepostfechados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ChequePostFechado> TraerChequePostFechadoBeans(List<ChequePostFechado> chequepostfechados,ArrayList<Classe> classes)throws Exception {
		try {
			for(ChequePostFechado chequepostfechado:chequepostfechados) {
					
				if(!(ChequePostFechadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ChequePostFechadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					chequepostfechado.setsDetalleGeneralEntityReporte(ChequePostFechadoConstantesFunciones.getChequePostFechadoDescripcion(chequepostfechado));
										
						
					
						
					
				} else  {
							
					//chequepostfechado.setsDetalleGeneralEntityReporte(chequepostfechado.getsDetalleGeneralEntityReporte());
										
				}
				
				//chequepostfechadobeans.add(chequepostfechadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return chequepostfechados;
    }
	//PARA REPORTES FIN
}
