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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.tesoreria.util.RegistroFormaPagoBancoConstantesFunciones;

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
public class RegistroFormaPagoBancoJInternalFrame extends RegistroFormaPagoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRegistroFormaPagoBanco;
	
	protected JMenuBar jmenuBarRegistroFormaPagoBanco;
	
	protected JMenu jmenuRegistroFormaPagoBanco;
	protected JMenu jmenuDatosRegistroFormaPagoBanco;
	protected JMenu jmenuArchivoRegistroFormaPagoBanco;
	protected JMenu jmenuAccionesRegistroFormaPagoBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRegistroFormaPagoBanco;	
	protected GridBagConstraints gridBagConstraintsRegistroFormaPagoBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RegistroFormaPagoBancoDetalleFormJInternalFrame jInternalFrameDetalleFormRegistroFormaPagoBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRegistroFormaPagoBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRegistroFormaPagoBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame estadoregistroformapagobancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoregistroformapagobanco="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public RegistroFormaPagoBancoSessionBean registroformapagobancoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public EstadoRegistroFormaPagoBancoSessionBean estadoregistroformapagobancoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RegistroFormaPagoBanco> registroformapagobancos;		
	public List<RegistroFormaPagoBanco> registroformapagobancosEliminados;	
	public List<RegistroFormaPagoBanco> registroformapagobancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRegistroFormaPagoBanco;		
	protected JButton jButtonAbrirOrderByRegistroFormaPagoBanco;
	
	
	//protected JPanel jPanelOrderByRegistroFormaPagoBanco;
	//public JScrollPane jScrollPanelOrderByRegistroFormaPagoBanco;	
	//protected JButton jButtonCerrarOrderByRegistroFormaPagoBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RegistroFormaPagoBancoLogic registroformapagobancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosEdicionRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosGeneralRegistroFormaPagoBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosRegistroFormaPagoBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRegistroFormaPagoBanco;
	//public JScrollPane jScrollPanelImportacionRegistroFormaPagoBanco;
	
	
	
	protected JPanel jPanelAccionesRegistroFormaPagoBanco;
	
    protected JPanel jPanelPaginacionRegistroFormaPagoBanco;
    protected JPanel jPanelParametrosReportesRegistroFormaPagoBanco;
	protected JPanel jPanelParametrosReportesAccionesRegistroFormaPagoBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RegistroFormaPagoBanco;
	protected JPanel jPanelParametrosAuxiliar2RegistroFormaPagoBanco;
	protected JPanel jPanelParametrosAuxiliar3RegistroFormaPagoBanco;
	protected JPanel jPanelParametrosAuxiliar4RegistroFormaPagoBanco;
	//protected JPanel jPanelParametrosAuxiliar5RegistroFormaPagoBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoRegistroFormaPagoBanco;
	//protected JPanel jPanelImportacionRegistroFormaPagoBanco;
	
	
	public JTable jTableDatosRegistroFormaPagoBanco;
	
	
	
	//public JTable jTableDatosRegistroFormaPagoBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRegistroFormaPagoBanco;
	protected JButton jButtonDuplicarRegistroFormaPagoBanco;
	protected JButton jButtonCopiarRegistroFormaPagoBanco;
	protected JButton jButtonVerFormRegistroFormaPagoBanco;
	protected JButton jButtonNuevoRelacionesRegistroFormaPagoBanco;
	protected JButton jButtonModificarRegistroFormaPagoBanco;
	
    protected JButton jButtonGuardarCambiosTablaRegistroFormaPagoBanco;
	protected JButton jButtonCerrarRegistroFormaPagoBanco;
	
	
	protected JButton jButtonRecargarInformacionRegistroFormaPagoBanco;
	protected JButton jButtonProcesarInformacionRegistroFormaPagoBanco;
	
	
	protected JButton jButtonAnterioresRegistroFormaPagoBanco;
	protected JButton jButtonSiguientesRegistroFormaPagoBanco;
	protected JButton jButtonNuevoGuardarCambiosRegistroFormaPagoBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRegistroFormaPagoBanco;
	//protected JButton jButtonCerrarReporteDinamicoRegistroFormaPagoBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoRegistroFormaPagoBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionRegistroFormaPagoBanco;
	//protected JButton jButtonGenerarImportacionRegistroFormaPagoBanco;
	//protected JButton jButtonCerrarImportacionRegistroFormaPagoBanco;
	//protected JFileChooser jFileChooserImportacionRegistroFormaPagoBanco;
	//protected File fileImportacionRegistroFormaPagoBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRegistroFormaPagoBanco;
	protected JButton jButtonDuplicarToolBarRegistroFormaPagoBanco;
	protected JButton jButtonNuevoRelacionesToolBarRegistroFormaPagoBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarRegistroFormaPagoBanco;
	protected JButton jButtonCopiarToolBarRegistroFormaPagoBanco;
	protected JButton jButtonVerFormToolBarRegistroFormaPagoBanco;
	public JButton jButtonGuardarCambiosTablaToolBarRegistroFormaPagoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarRegistroFormaPagoBanco;
	protected JButton jButtonCerrarToolBarRegistroFormaPagoBanco;
	
	protected JButton jButtonRecargarInformacionToolBarRegistroFormaPagoBanco;
	protected JButton jButtonProcesarInformacionToolBarRegistroFormaPagoBanco;
	protected JButton jButtonAnterioresToolBarRegistroFormaPagoBanco;
	protected JButton jButtonSiguientesToolBarRegistroFormaPagoBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarRegistroFormaPagoBanco;
	protected JButton jButtonAbrirOrderByToolBarRegistroFormaPagoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDuplicarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemNuevoRelacionesRegistroFormaPagoBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCopiarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemVerFormRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCerrarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleCerrarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemProcesarInformacionRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemAnterioresRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemSiguientesRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemAbrirOrderByRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemMostrarOcultarRegistroFormaPagoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRegistroFormaPagoBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxSeleccionadosRegistroFormaPagoBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxConGraficoReporteRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRegistroFormaPagoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRegistroFormaPagoBanco;
	protected JTextField jTextFieldValorCampoGeneralRegistroFormaPagoBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRegistroFormaPagoBanco;
	//public JList<Reporte> jListColumnasSelectReporteRegistroFormaPagoBanco;
	//public JScrollPane jScrollColumnasSelectReporteRegistroFormaPagoBanco;
	
	//public JLabel jLabelRelacionesSelectReporteRegistroFormaPagoBanco;
	//public JList<Reporte> jListRelacionesSelectReporteRegistroFormaPagoBanco;
	//public JScrollPane jScrollRelacionesSelectReporteRegistroFormaPagoBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRegistroFormaPagoBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRegistroFormaPagoBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoRegistroFormaPagoBanco;
	
		
	//public JLabel jLabelArchivoImportacionRegistroFormaPagoBanco;	
	//public JLabel jLabelPathArchivoImportacionRegistroFormaPagoBanco;
	//protected JTextField jTextFieldPathArchivoImportacionRegistroFormaPagoBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRegistroFormaPagoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco;
	
	//public JLabel jLabelColumnaCategoriaValorRegistroFormaPagoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco;
	
	//public JLabel jLabelColumnasValoresGraficoRegistroFormaPagoBanco;
	//public JList<Reporte> jListColumnasValoresGraficoRegistroFormaPagoBanco;
	//public JScrollPane jScrollColumnasValoresGraficoRegistroFormaPagoBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRegistroFormaPagoBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRegistroFormaPagoBanco;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRegistroFormaPagoBanco;
	public JPanel jPanelFK_IdAsientoContableRegistroFormaPagoBanco;
	public JButton jButtonFK_IdAsientoContableRegistroFormaPagoBanco;
	public JPanel jPanelFK_IdClienteRegistroFormaPagoBanco;
	public JButton jButtonFK_IdClienteRegistroFormaPagoBanco;
	public JPanel jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco;
	public JButton jButtonFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco;
	public JPanel jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco;
	public JButton jButtonFK_IdTipoFormaPagoRegistroFormaPagoBanco;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco;
	
	public JPanel jPanelid_clienteFK_IdClienteRegistroFormaPagoBanco;
	public JLabel jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteRegistroFormaPagoBanco;
	public JButton jButtonid_clienteFK_IdClienteRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco;
	
	public JPanel jPanelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco;
	public JLabel jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco;
	public JButton jButtonid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RegistroFormaPagoBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegistroFormaPagoBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegistroFormaPagoBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegistroFormaPagoBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRegistroFormaPagoBanco)	{
		this.jButtonRecargarInformacionRegistroFormaPagoBanco = jButtonRecargarInformacionRegistroFormaPagoBanco;
	}
	
	public JButton getjButtonProcesarInformacionRegistroFormaPagoBanco() {
		return this.jButtonProcesarInformacionRegistroFormaPagoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRegistroFormaPagoBanco)	{
		this.jButtonProcesarInformacionRegistroFormaPagoBanco = jButtonProcesarInformacionRegistroFormaPagoBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionRegistroFormaPagoBanco() {
		return this.jButtonRecargarInformacionRegistroFormaPagoBanco;
	}
	
	
	public List<RegistroFormaPagoBanco> getregistroformapagobancos() {
		return this.registroformapagobancos;
	}

	public void setregistroformapagobancos(List<RegistroFormaPagoBanco> registroformapagobancos) {
		this.registroformapagobancos = registroformapagobancos;
	}
	
	public List<RegistroFormaPagoBanco> getregistroformapagobancosAux() {
		return this.registroformapagobancosAux;
	}

	public void setregistroformapagobancosAux(List<RegistroFormaPagoBanco> registroformapagobancosAux) {
		this.registroformapagobancosAux = registroformapagobancosAux;
	}
	
	public List<RegistroFormaPagoBanco> getregistroformapagobancosEliminados() {
		return this.registroformapagobancosEliminados;
	}

	public void setRegistroFormaPagoBancosEliminados(List<RegistroFormaPagoBanco> registroformapagobancosEliminados) {
		this.registroformapagobancosEliminados = registroformapagobancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRegistroFormaPagoBanco() {
		return jComboBoxTiposSeleccionarRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposSeleccionarRegistroFormaPagoBanco) {
		this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco = jComboBoxTiposSeleccionarRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRegistroFormaPagoBanco() {
		return jTextFieldValorCampoGeneralRegistroFormaPagoBanco;
	}

	public void setjTextFieldValorCampoGeneralRegistroFormaPagoBanco(
			JTextField jTextFieldValorCampoGeneralRegistroFormaPagoBanco) {
		this.jTextFieldValorCampoGeneralRegistroFormaPagoBanco = jTextFieldValorCampoGeneralRegistroFormaPagoBanco;
	}

	public void setBorderResaltarValorCampoGeneralRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRegistroFormaPagoBanco() {
		return this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco;
	}

	public void setjCheckBoxSeleccionarTodosRegistroFormaPagoBanco(
			JCheckBox jCheckBoxSeleccionarTodosRegistroFormaPagoBanco) {
		this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco = jCheckBoxSeleccionarTodosRegistroFormaPagoBanco;
	}

	public void setBorderResaltarSeleccionarTodosRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRegistroFormaPagoBanco() {
		return this.jCheckBoxSeleccionadosRegistroFormaPagoBanco;
	}

	public void setjCheckBoxSeleccionadosRegistroFormaPagoBanco(
			JCheckBox jCheckBoxSeleccionadosRegistroFormaPagoBanco) {
		this.jCheckBoxSeleccionadosRegistroFormaPagoBanco = jCheckBoxSeleccionadosRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarSeleccionadosRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRegistroFormaPagoBanco() {
		return this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposArchivosReportesRegistroFormaPagoBanco) {
		this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco = jComboBoxTiposArchivosReportesRegistroFormaPagoBanco;
	}

	public void setBorderResaltarTiposArchivosReportesRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRegistroFormaPagoBanco() {
		return this.jComboBoxTiposReportesRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposReportesRegistroFormaPagoBanco) {
		this.jComboBoxTiposReportesRegistroFormaPagoBanco = jComboBoxTiposReportesRegistroFormaPagoBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRegistroFormaPagoBanco() {
	//	return jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRegistroFormaPagoBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco) {
	//	this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco = jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco = jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco;
	//}
	
	public void setBorderResaltarTiposReportesRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRegistroFormaPagoBanco() {
		return this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposGraficosReportesRegistroFormaPagoBanco) {
		this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco = jComboBoxTiposGraficosReportesRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRegistroFormaPagoBanco() {
		return this.jComboBoxTiposPaginacionRegistroFormaPagoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposPaginacionRegistroFormaPagoBanco) {
		this.jComboBoxTiposPaginacionRegistroFormaPagoBanco = jComboBoxTiposPaginacionRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposPaginacionRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRegistroFormaPagoBanco() {
		return this.jComboBoxTiposRelacionesRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRegistroFormaPagoBanco() {
		return this.jComboBoxTiposAccionesRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposRelacionesRegistroFormaPagoBanco) {
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco = jComboBoxTiposRelacionesRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposAccionesRegistroFormaPagoBanco) {
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco = jComboBoxTiposAccionesRegistroFormaPagoBanco;
	}
	
	public void setBorderResaltarTiposRelacionesRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRegistroFormaPagoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRegistroFormaPagoBanco() {
	//	return jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoRegistroFormaPagoBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco) {
	//	this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco = jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRegistroFormaPagoBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRegistroFormaPagoBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco .setBorder(borderResaltar);		
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
		this.registroformapagobancoSessionBean=new RegistroFormaPagoBancoSessionBean();
		
		this.registroformapagobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.registroformapagobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.registroformapagobancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RegistroFormaPagoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Registro Forma Pago Banco MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
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
		
		RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRegistroFormaPagoBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"nuevo","nuevo","Nuevo"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"duplicar","duplicar","Duplicar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"copiar","copiar","Copiar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"ver_form","ver_form","Ver"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"recargar","recargar","Recargar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRegistroFormaPagoBanco,this.jTtoolBarRegistroFormaPagoBanco,
							"cerrar","cerrar","Salir"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRegistroFormaPagoBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRegistroFormaPagoBanco;
			
				this.jButtonProcesarInformacionToolBarRegistroFormaPagoBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRegistroFormaPagoBanco;
				
		//protected JButton jButtonModificarToolBarRegistroFormaPagoBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRegistroFormaPagoBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRegistroFormaPagoBanco=new JMenuMe("General");
		this.jmenuArchivoRegistroFormaPagoBanco=new JMenuMe("Archivo");
		this.jmenuAccionesRegistroFormaPagoBanco=new JMenuMe("Acciones");
		this.jmenuDatosRegistroFormaPagoBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRegistroFormaPagoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRegistroFormaPagoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRegistroFormaPagoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRegistroFormaPagoBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRegistroFormaPagoBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRegistroFormaPagoBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRegistroFormaPagoBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRegistroFormaPagoBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRegistroFormaPagoBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRegistroFormaPagoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRegistroFormaPagoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRegistroFormaPagoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRegistroFormaPagoBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRegistroFormaPagoBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRegistroFormaPagoBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRegistroFormaPagoBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRegistroFormaPagoBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRegistroFormaPagoBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRegistroFormaPagoBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRegistroFormaPagoBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRegistroFormaPagoBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRegistroFormaPagoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRegistroFormaPagoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRegistroFormaPagoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRegistroFormaPagoBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRegistroFormaPagoBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRegistroFormaPagoBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRegistroFormaPagoBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRegistroFormaPagoBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRegistroFormaPagoBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRegistroFormaPagoBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRegistroFormaPagoBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRegistroFormaPagoBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRegistroFormaPagoBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRegistroFormaPagoBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRegistroFormaPagoBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRegistroFormaPagoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRegistroFormaPagoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRegistroFormaPagoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRegistroFormaPagoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRegistroFormaPagoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRegistroFormaPagoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRegistroFormaPagoBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRegistroFormaPagoBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRegistroFormaPagoBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRegistroFormaPagoBanco.add(this.jMenuItemCerrarRegistroFormaPagoBanco);
			
			this.jmenuAccionesRegistroFormaPagoBanco.add(this.jMenuItemNuevoRegistroFormaPagoBanco);
			this.jmenuAccionesRegistroFormaPagoBanco.add(this.jMenuItemNuevoGuardarCambiosRegistroFormaPagoBanco);
			this.jmenuAccionesRegistroFormaPagoBanco.add(this.jMenuItemNuevoRelacionesRegistroFormaPagoBanco);
			this.jmenuAccionesRegistroFormaPagoBanco.add(this.jMenuItemGuardarCambiosTablaRegistroFormaPagoBanco);		
			this.jmenuAccionesRegistroFormaPagoBanco.add(this.jMenuItemDuplicarRegistroFormaPagoBanco);		
			this.jmenuAccionesRegistroFormaPagoBanco.add(this.jMenuItemCopiarRegistroFormaPagoBanco);		
			this.jmenuAccionesRegistroFormaPagoBanco.add(this.jMenuItemVerFormRegistroFormaPagoBanco);		
			
			this.jmenuDatosRegistroFormaPagoBanco.add(this.jMenuItemRecargarInformacionRegistroFormaPagoBanco);				
			this.jmenuDatosRegistroFormaPagoBanco.add(this.jMenuItemAnterioresRegistroFormaPagoBanco);				
			this.jmenuDatosRegistroFormaPagoBanco.add(this.jMenuItemSiguientesRegistroFormaPagoBanco);				
			this.jmenuDatosRegistroFormaPagoBanco.add(this.jMenuItemAbrirOrderByRegistroFormaPagoBanco);				
			this.jmenuDatosRegistroFormaPagoBanco.add(this.jMenuItemMostrarOcultarRegistroFormaPagoBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRegistroFormaPagoBanco.add(this.jMenuItemGuardarCambiosRegistroFormaPagoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRegistroFormaPagoBanco.add(this.jmenuArchivoRegistroFormaPagoBanco);		
			this.jmenuBarRegistroFormaPagoBanco.add(this.jmenuAccionesRegistroFormaPagoBanco);		
			this.jmenuBarRegistroFormaPagoBanco.add(this.jmenuDatosRegistroFormaPagoBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRegistroFormaPagoBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRegistroFormaPagoBanco() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableRegistroFormaPagoBanco.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonFK_IdAsientoContableRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonFK_IdAsientoContableRegistroFormaPagoBanco.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableRegistroFormaPagoBanco,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco.setFocusable(false);

		this.jPanelFK_IdClienteRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteRegistroFormaPagoBanco.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonFK_IdClienteRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonFK_IdClienteRegistroFormaPagoBanco.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteRegistroFormaPagoBanco,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco = new JLabelMe();
		jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco.setText("Cliente :");
		jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco.setFocusable(false);

		this.jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setToolTipText("Buscar Por Estado Registro Forma Pago Banco ");
		this.jButtonFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setToolTipText("Buscar Por Estado Registro Forma Pago Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco,"buscar_button","Buscar Por Estado Registro Forma Pago Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco = new JLabelMe();
		jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setText("Estado Registro Forma Pago Banco :");
		jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setToolTipText("Estado Registro Forma Pago Banco");
		jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoRegistroFormaPagoBanco.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoRegistroFormaPagoBanco,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRegistroFormaPagoBanco=new JTabbedPane();


		this.jTabbedPaneBusquedasRegistroFormaPagoBanco.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRegistroFormaPagoBanco.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRegistroFormaPagoBanco.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRegistroFormaPagoBanco = new RegistroFormaPagoBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Registro Forma Pago Banco DATOS");
			this.jInternalFrameDetalleFormRegistroFormaPagoBanco = new RegistroFormaPagoBancoDetalleFormJInternalFrame(jDesktopPane,this.registroformapagobancoSessionBean.getConGuardarRelaciones(),this.registroformapagobancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRegistroFormaPagoBanco = null;//new RegistroFormaPagoBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRegistroFormaPagoBanco= new GridBagLayout();
		
		
		this.jTableDatosRegistroFormaPagoBanco = new JTableMe();      
		
		String sToolTipRegistroFormaPagoBanco="";
		sToolTipRegistroFormaPagoBanco=RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRegistroFormaPagoBanco+="(Tesoreria.RegistroFormaPagoBanco)";
		}
		
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipRegistroFormaPagoBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRegistroFormaPagoBanco.setToolTipText(sToolTipRegistroFormaPagoBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRegistroFormaPagoBanco);
		this.jTableDatosRegistroFormaPagoBanco.setAutoCreateRowSorter(true);
		this.jTableDatosRegistroFormaPagoBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRegistroFormaPagoBanco.setRowSelectionAllowed(true);
		this.jTableDatosRegistroFormaPagoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonDuplicarRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCopiarRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonVerFormRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonNuevoRelacionesRegistroFormaPagoBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarRegistroFormaPagoBanco = new JButtonMe();
		
		this.jScrollPanelDatosRegistroFormaPagoBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralRegistroFormaPagoBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Registro Forma Pago Banco";
		
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Registro Forma Pago Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRegistroFormaPagoBanco.setToolTipText("Acciones");
        this.jPanelAccionesRegistroFormaPagoBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco=new ReporteDinamicoJInternalFrame(RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRegistroFormaPagoBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRegistroFormaPagoBanco=new ImportacionJInternalFrame(RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRegistroFormaPagoBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRegistroFormaPagoBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByRegistroFormaPagoBanco.setText("Orden");
		this.jButtonAbrirOrderByRegistroFormaPagoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRegistroFormaPagoBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRegistroFormaPagoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRegistroFormaPagoBanco,false,this);
			
			//this.cargarOrderByRegistroFormaPagoBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRegistroFormaPagoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRegistroFormaPagoBanco,true,this);
			
			//this.cargarOrderByRegistroFormaPagoBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRegistroFormaPagoBanco.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosRegistroFormaPagoBanco.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosRegistroFormaPagoBanco.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosRegistroFormaPagoBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRegistroFormaPagoBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRegistroFormaPagoBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRegistroFormaPagoBanco.setText("Nuevo");
		this.jButtonDuplicarRegistroFormaPagoBanco.setText("Duplicar");
		this.jButtonCopiarRegistroFormaPagoBanco.setText("Copiar");
		this.jButtonVerFormRegistroFormaPagoBanco.setText("Ver");
		this.jButtonNuevoRelacionesRegistroFormaPagoBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.setText("Guardar");
		this.jButtonCerrarRegistroFormaPagoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRegistroFormaPagoBanco,"nuevo_button","Nuevo",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRegistroFormaPagoBanco,"duplicar_button","Duplicar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRegistroFormaPagoBanco,"copiar_button","Copiar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRegistroFormaPagoBanco,"ver_form","Ver",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRegistroFormaPagoBanco,"nuevorelaciones_button","Nuevo Rel",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco,"guardarcambiostabla_button","Guardar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRegistroFormaPagoBanco,"cerrar_button","Salir",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRegistroFormaPagoBanco.setToolTipText("Nuevo"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRegistroFormaPagoBanco.setToolTipText("Duplicar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRegistroFormaPagoBanco.setToolTipText("Copiar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRegistroFormaPagoBanco.setToolTipText("Ver"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRegistroFormaPagoBanco.setToolTipText("Nuevo Rel"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.setToolTipText("Guardar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRegistroFormaPagoBanco.setToolTipText("Salir"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRegistroFormaPagoBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarRegistroFormaPagoBanco";
		inputMap = this.jButtonDuplicarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRegistroFormaPagoBanco"));
		
		//COPIAR
		sMapKey = "CopiarRegistroFormaPagoBanco";
		inputMap = this.jButtonCopiarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRegistroFormaPagoBanco"));
		
		//VEr FORM
		sMapKey = "VerFormRegistroFormaPagoBanco";
		inputMap = this.jButtonVerFormRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRegistroFormaPagoBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoRelacionesRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRegistroFormaPagoBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRegistroFormaPagoBanco";
		inputMap = this.jButtonModificarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRegistroFormaPagoBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRegistroFormaPagoBanco";
		inputMap = this.jButtonCerrarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRegistroFormaPagoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRegistroFormaPagoBanco";
		inputMap = this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRegistroFormaPagoBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRegistroFormaPagoBanco.setName("jPanelParametrosReportesRegistroFormaPagoBanco"); 
		
		this.jPanelParametrosReportesAccionesRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRegistroFormaPagoBanco.setName("jPanelParametrosReportesAccionesRegistroFormaPagoBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonRecargarInformacionRegistroFormaPagoBanco.setText("Recargar");
		this.jButtonRecargarInformacionRegistroFormaPagoBanco.setToolTipText("Recargar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRegistroFormaPagoBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonProcesarInformacionRegistroFormaPagoBanco.setText("Procesar");
		this.jButtonProcesarInformacionRegistroFormaPagoBanco.setToolTipText("Procesar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRegistroFormaPagoBanco.setVisible(false);
			
		this.jButtonProcesarInformacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco.setText("TIPO");       
		this.jComboBoxTiposReportesRegistroFormaPagoBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRegistroFormaPagoBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionRegistroFormaPagoBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRegistroFormaPagoBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRegistroFormaPagoBanco = new JLabelMe();
		
		this.jLabelAccionesRegistroFormaPagoBanco.setText("Acciones");		
		this.jLabelAccionesRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRegistroFormaPagoBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRegistroFormaPagoBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRegistroFormaPagoBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRegistroFormaPagoBanco = new JButtonMe();
		//this.jButtonAnterioresRegistroFormaPagoBanco.setText("<<");
        this.jButtonAnterioresRegistroFormaPagoBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRegistroFormaPagoBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRegistroFormaPagoBanco = new JButtonMe();
		//this.jButtonSiguientesRegistroFormaPagoBanco.setText(">>");
        this.jButtonSiguientesRegistroFormaPagoBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRegistroFormaPagoBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco,"nuevoguardarcambios_button","Nue",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRegistroFormaPagoBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRegistroFormaPagoBanco";
		inputMap = this.jButtonRecargarInformacionRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRegistroFormaPagoBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRegistroFormaPagoBanco";
		inputMap = this.jButtonSiguientesRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRegistroFormaPagoBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRegistroFormaPagoBanco";
		inputMap = this.jButtonAnterioresRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRegistroFormaPagoBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRegistroFormaPagoBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRegistroFormaPagoBanco.setMinimumSize(new Dimension(this.getWidth(),RegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRegistroFormaPagoBanco.setMaximumSize(new Dimension(this.getWidth(),RegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRegistroFormaPagoBanco.setPreferredSize(new Dimension(this.getWidth(),RegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RegistroFormaPagoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRegistroFormaPagoBanco = new GridBagLayout();

			this.jPanelPaginacionRegistroFormaPagoBanco.setLayout(gridaBagLayoutPaginacionRegistroFormaPagoBanco);						
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonAnterioresRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
					
						
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
			
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonNuevoGuardarCambiosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
						
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonSiguientesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonNuevoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
						
			
			
			if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
				this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
				this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			}
			
			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonDuplicarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonCopiarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonVerFormRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRegistroFormaPagoBanco.add(this.jButtonCerrarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		
		this.jButtonRecargarInformacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRegistroFormaPagoBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRegistroFormaPagoBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRegistroFormaPagoBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRegistroFormaPagoBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RegistroFormaPagoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RegistroFormaPagoBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRegistroFormaPagoBanco.setLayout(gridaBagParametrosReportesRegistroFormaPagoBanco);
			this.jPanelParametrosReportesAccionesRegistroFormaPagoBanco.setLayout(gridaBagParametrosReportesAccionesRegistroFormaPagoBanco);
			
			
			this.jPanelParametrosAuxiliar1RegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar1RegistroFormaPagoBanco);
			this.jPanelParametrosAuxiliar2RegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar2RegistroFormaPagoBanco);
			this.jPanelParametrosAuxiliar3RegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar3RegistroFormaPagoBanco);
			this.jPanelParametrosAuxiliar4RegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar4RegistroFormaPagoBanco);
			//this.jPanelParametrosAuxiliar5RegistroFormaPagoBanco.setLayout(gridaBagParametrosAuxiliar2RegistroFormaPagoBanco);			
			
			
			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jButtonRecargarInformacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RegistroFormaPagoBanco.add(this.jComboBoxTiposPaginacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RegistroFormaPagoBanco.add(this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RegistroFormaPagoBanco.add(this.jComboBoxTiposArchivosReportesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar1RegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RegistroFormaPagoBanco.add(this.jComboBoxTiposReportesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);																		
			
			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RegistroFormaPagoBanco.add(this.jComboBoxTiposGraficosReportesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar4RegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jComboBoxTiposReportesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jCheckBoxGenerarReporteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar2RegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jLabelAccionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
				this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jButtonAbrirOrderByRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jComboBoxTiposSeleccionarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
			
			
			/*
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RegistroFormaPagoBanco.add(this.jCheckBoxSeleccionarTodosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);															
				
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RegistroFormaPagoBanco.add(this.jCheckBoxSeleccionadosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);															
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RegistroFormaPagoBanco.add(this.jCheckBoxConGraficoReporteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jPanelParametrosAuxiliar3RegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jComboBoxTiposAccionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
	
				
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegistroFormaPagoBanco.add(this.jTextFieldValorCampoGeneralRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRegistroFormaPagoBanco = new GridBagLayout();

			this.jScrollPanelDatosRegistroFormaPagoBanco.setLayout(gridaBagLayoutDatosRegistroFormaPagoBanco);
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
			
			this.jScrollPanelDatosRegistroFormaPagoBanco.add(this.jTableDatosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRegistroFormaPagoBanco.setViewportView(this.jTableDatosRegistroFormaPagoBanco);
		this.jTableDatosRegistroFormaPagoBanco.setFillsViewportHeight(true);
		this.jTableDatosRegistroFormaPagoBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRegistroFormaPagoBanco= new GridBagLayout();
		this.jPanelAccionesRegistroFormaPagoBanco.setLayout(gridaBagLayoutAccionesRegistroFormaPagoBanco);
		
		
		/*	
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
			
		this.jPanelAccionesRegistroFormaPagoBanco.add(this.jButtonNuevoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableRegistroFormaPagoBanco= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableRegistroFormaPagoBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableRegistroFormaPagoBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableRegistroFormaPagoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableRegistroFormaPagoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableRegistroFormaPagoBanco.setLayout(gridaBagLayoutFK_IdAsientoContableRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		jPanelFK_IdAsientoContableRegistroFormaPagoBanco.add(jLabelid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
		jPanelFK_IdAsientoContableRegistroFormaPagoBanco.add(jComboBoxid_asiento_contableFK_IdAsientoContableRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);


		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		jPanelFK_IdAsientoContableRegistroFormaPagoBanco.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
		gridBagConstraintsRegistroFormaPagoBanco.gridx =1;
		jPanelFK_IdAsientoContableRegistroFormaPagoBanco.add(jButtonFK_IdAsientoContableRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		jTabbedPaneBusquedasRegistroFormaPagoBanco.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableRegistroFormaPagoBanco);
		jTabbedPaneBusquedasRegistroFormaPagoBanco.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteRegistroFormaPagoBanco= new GridBagLayout();
		gridaBagLayoutFK_IdClienteRegistroFormaPagoBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteRegistroFormaPagoBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteRegistroFormaPagoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteRegistroFormaPagoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteRegistroFormaPagoBanco.setLayout(gridaBagLayoutFK_IdClienteRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		jPanelFK_IdClienteRegistroFormaPagoBanco.add(jLabelid_clienteFK_IdClienteRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
		jPanelFK_IdClienteRegistroFormaPagoBanco.add(jComboBoxid_clienteFK_IdClienteRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);


		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		jPanelFK_IdClienteRegistroFormaPagoBanco.add(this.jButtonBuscarFK_IdClienteid_clienteRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
		gridBagConstraintsRegistroFormaPagoBanco.gridx =1;
		jPanelFK_IdClienteRegistroFormaPagoBanco.add(jButtonFK_IdClienteRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		jTabbedPaneBusquedasRegistroFormaPagoBanco.addTab("2.-Por Cliente ", jPanelFK_IdClienteRegistroFormaPagoBanco);
		jTabbedPaneBusquedasRegistroFormaPagoBanco.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.setLayout(gridaBagLayoutFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.add(jLabelid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
		jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.add(jComboBoxid_estado_registro_forma_pago_bancoFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
		gridBagConstraintsRegistroFormaPagoBanco.gridx =1;
		jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco.add(jButtonFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		jTabbedPaneBusquedasRegistroFormaPagoBanco.addTab("3.-Por Estado Registro Forma Pago Banco ", jPanelFK_IdEstadoRegistroFormaPagoBancoRegistroFormaPagoBanco);
		jTabbedPaneBusquedasRegistroFormaPagoBanco.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoRegistroFormaPagoBanco= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoRegistroFormaPagoBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoRegistroFormaPagoBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoRegistroFormaPagoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoRegistroFormaPagoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco.setLayout(gridaBagLayoutFK_IdTipoFormaPagoRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
		jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegistroFormaPagoBanco.gridy = 1;
		gridBagConstraintsRegistroFormaPagoBanco.gridx =1;
		jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco.add(jButtonFK_IdTipoFormaPagoRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);

		jTabbedPaneBusquedasRegistroFormaPagoBanco.addTab("4.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoRegistroFormaPagoBanco);
		jTabbedPaneBusquedasRegistroFormaPagoBanco.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRegistroFormaPagoBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();						
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;		
			//this.gridBagConstraintsRegistroFormaPagoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;		
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRegistroFormaPagoBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;		
			this.gridBagConstraintsRegistroFormaPagoBanco.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);								
		
		
		/*
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		*/		
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =0;
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRegistroFormaPagoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
				
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRegistroFormaPagoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRegistroFormaPagoBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosRegistroFormaPagoBanco.setLayout(gridaBagLayoutBusquedasParametrosRegistroFormaPagoBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			
			
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
			
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRegistroFormaPagoBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRegistroFormaPagoBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRegistroFormaPagoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.setName("jPanelReporteDinamicoRegistroFormaPagoBanco"); 
		
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.setLayout(gridaBagLayoutReporteDinamicoRegistroFormaPagoBanco);
		
		
		this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRegistroFormaPagoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Registro Forma Pago Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteRegistroFormaPagoBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelColumnasSelectReporteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRegistroFormaPagoBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteRegistroFormaPagoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRegistroFormaPagoBanco=new JScrollPane(this.jListColumnasSelectReporteRegistroFormaPagoBanco);
			
			this.jScrollColumnasSelectReporteRegistroFormaPagoBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRegistroFormaPagoBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRegistroFormaPagoBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jListColumnasSelectReporteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jScrollColumnasSelectReporteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteRegistroFormaPagoBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRegistroFormaPagoBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteRegistroFormaPagoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRegistroFormaPagoBanco=new JScrollPane(this.jListRelacionesSelectReporteRegistroFormaPagoBanco);
			
			this.jScrollRelacionesSelectReporteRegistroFormaPagoBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRegistroFormaPagoBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRegistroFormaPagoBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoRegistroFormaPagoBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelConGraficoDinamicoRegistroFormaPagoBanco.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelConGraficoDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jCheckBoxConGraficoDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRegistroFormaPagoBanco.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelColumnaCategoriaGraficoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelColumnaCategoriaValorRegistroFormaPagoBanco.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelColumnaCategoriaValorRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jComboBoxColumnaCategoriaValorRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelColumnasValoresGraficoRegistroFormaPagoBanco.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelColumnasValoresGraficoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRegistroFormaPagoBanco = new JList<Reporte>();
		this.jListColumnasValoresGraficoRegistroFormaPagoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRegistroFormaPagoBanco.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRegistroFormaPagoBanco=new JScrollPane(this.jListColumnasValoresGraficoRegistroFormaPagoBanco);
			
			this.jScrollColumnasValoresGraficoRegistroFormaPagoBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRegistroFormaPagoBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRegistroFormaPagoBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jListColumnasSelectReporteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jScrollColumnasValoresGraficoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelTiposGraficosReportesDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRegistroFormaPagoBanco.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jComboBoxTiposGraficosReportesDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRegistroFormaPagoBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelGenerarExcelReporteDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRegistroFormaPagoBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRegistroFormaPagoBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRegistroFormaPagoBanco.setToolTipText("Generar EXCEL"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jButtonGenerarExcelReporteDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jComboBoxTiposReportesDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRegistroFormaPagoBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jLabelTiposArchivoReporteDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jComboBoxTiposArchivosReportesDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRegistroFormaPagoBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRegistroFormaPagoBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRegistroFormaPagoBanco.setToolTipText("Generar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jButtonGenerarReporteDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRegistroFormaPagoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRegistroFormaPagoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegistroFormaPagoBanco.add(this.jButtonCerrarReporteDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco= new JScrollPane(jPanelReporteDinamicoRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Registro Forma Pago Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRegistroFormaPagoBanco);
		this.jInternalFrameReporteDinamicoRegistroFormaPagoBanco.getContentPane().add(this.jScrollPanelReporteDinamicoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRegistroFormaPagoBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRegistroFormaPagoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRegistroFormaPagoBanco.setName("jPanelImportacionRegistroFormaPagoBanco"); 
		
		this.jPanelImportacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRegistroFormaPagoBanco.setLayout(gridaBagLayoutImportacionRegistroFormaPagoBanco);
		
		
		this.jInternalFrameImportacionRegistroFormaPagoBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRegistroFormaPagoBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRegistroFormaPagoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRegistroFormaPagoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRegistroFormaPagoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setResizable(true);
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setClosable(true);
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRegistroFormaPagoBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setResizable(true);
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setClosable(true);
	    this.jInternalFrameImportacionRegistroFormaPagoBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Registro Forma Pago Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelArchivoImportacionRegistroFormaPagoBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRegistroFormaPagoBanco.add(this.jLabelArchivoImportacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRegistroFormaPagoBanco = new JFileChooser();		
		this.jFileChooserImportacionRegistroFormaPagoBanco.setToolTipText("ESCOGER ARCHIVO"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonAbrirImportacionRegistroFormaPagoBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRegistroFormaPagoBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRegistroFormaPagoBanco.setToolTipText("Generar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegistroFormaPagoBanco.add(this.jButtonAbrirImportacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRegistroFormaPagoBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionRegistroFormaPagoBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRegistroFormaPagoBanco.add(this.jLabelPathArchivoImportacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRegistroFormaPagoBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRegistroFormaPagoBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRegistroFormaPagoBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRegistroFormaPagoBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegistroFormaPagoBanco.add(this.jTextFieldPathArchivoImportacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGenerarImportacionRegistroFormaPagoBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRegistroFormaPagoBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRegistroFormaPagoBanco.setToolTipText("Generar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegistroFormaPagoBanco.add(this.jButtonGenerarImportacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarImportacionRegistroFormaPagoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRegistroFormaPagoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegistroFormaPagoBanco.add(this.jButtonCerrarImportacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionRegistroFormaPagoBanco= new JScrollPane(jPanelImportacionRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRegistroFormaPagoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRegistroFormaPagoBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRegistroFormaPagoBanco);
		this.jInternalFrameImportacionRegistroFormaPagoBanco.getContentPane().add(this.jScrollPanelImportacionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRegistroFormaPagoBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRegistroFormaPagoBanco = new JButtonMe();
			this.jButtonAbrirOrderByRegistroFormaPagoBanco.setText("Orden");
			this.jButtonAbrirOrderByRegistroFormaPagoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRegistroFormaPagoBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRegistroFormaPagoBanco";
			inputMap = this.jButtonAbrirOrderByRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRegistroFormaPagoBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByRegistroFormaPagoBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRegistroFormaPagoBanco.setName("jPanelOrderByRegistroFormaPagoBanco"); 
			
			this.jPanelOrderByRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRegistroFormaPagoBanco.setLayout(gridaBagLayoutOrderByRegistroFormaPagoBanco);
			
			
			this.jTableDatosRegistroFormaPagoBancoOrderBy = new JTableMe();        
			this.jTableDatosRegistroFormaPagoBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRegistroFormaPagoBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRegistroFormaPagoBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRegistroFormaPagoBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRegistroFormaPagoBancoOrderBy.setViewportView(this.jTableDatosRegistroFormaPagoBancoOrderBy);
			this.jTableDatosRegistroFormaPagoBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRegistroFormaPagoBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRegistroFormaPagoBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRegistroFormaPagoBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRegistroFormaPagoBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRegistroFormaPagoBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setTitle("Orden");
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setResizable(true);
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setClosable(true);
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Registro Forma Pago Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRegistroFormaPagoBanco.ipady =150;
				
			this.jPanelOrderByRegistroFormaPagoBanco.add(jScrollPanelDatosRegistroFormaPagoBancoOrderBy, this.gridBagConstraintsRegistroFormaPagoBanco);//this.jTableDatosRegistroFormaPagoBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRegistroFormaPagoBanco = new JButtonMe();
			this.jButtonCerrarOrderByRegistroFormaPagoBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRegistroFormaPagoBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRegistroFormaPagoBanco.add(this.jButtonCerrarOrderByRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRegistroFormaPagoBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByRegistroFormaPagoBanco= new JScrollPane(jPanelOrderByRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRegistroFormaPagoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRegistroFormaPagoBanco);
			
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getContentPane().add(this.jScrollPanelOrderByRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
		
		} else {
			this.jButtonAbrirOrderByRegistroFormaPagoBanco = new JButtonMe();
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
		int iWidthTableCalculado=0;//3530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.registroformapagobancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRegistroFormaPagoBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRegistroFormaPagoBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRegistroFormaPagoBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRegistroFormaPagoBanco.getRowHeight();//RegistroFormaPagoBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco.isSelected()) {
					iHeightTable=RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRegistroFormaPagoBanco.isSelected()) {
					iHeightTable=RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RegistroFormaPagoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRegistroFormaPagoBanco!=null && this.jInternalFrameOrderByRegistroFormaPagoBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRegistroFormaPagoBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRegistroFormaPagoBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=registroformapagobancoLogic.getRegistroFormaPagoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=registroformapagobancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RegistroFormaPagoBanco> TraerRegistroFormaPagoBancoBeans(List<RegistroFormaPagoBanco> registroformapagobancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(RegistroFormaPagoBanco registroformapagobanco:registroformapagobancos) {
					
				if(!(RegistroFormaPagoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RegistroFormaPagoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					registroformapagobanco.setsDetalleGeneralEntityReporte(RegistroFormaPagoBancoConstantesFunciones.getRegistroFormaPagoBancoDescripcion(registroformapagobanco));
										
						
					
						
					
				} else  {
							
					//registroformapagobanco.setsDetalleGeneralEntityReporte(registroformapagobanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//registroformapagobancobeans.add(registroformapagobancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return registroformapagobancos;
    }
	//PARA REPORTES FIN
}
