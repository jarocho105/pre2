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

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.tesoreria.util.BancoFormaPagoConstantesFunciones;

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
public class BancoFormaPagoJInternalFrame extends BancoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBancoFormaPago;
	
	protected JMenuBar jmenuBarBancoFormaPago;
	
	protected JMenu jmenuBancoFormaPago;
	protected JMenu jmenuDatosBancoFormaPago;
	protected JMenu jmenuArchivoBancoFormaPago;
	protected JMenu jmenuAccionesBancoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBancoFormaPago;	
	protected GridBagConstraints gridBagConstraintsBancoFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BancoFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormBancoFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBancoFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBancoFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detaformapago="";

	protected TipoBancoFormaPagoBeanSwingJInternalFrame tipobancoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobancoformapago="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public BancoFormaPagoSessionBean bancoformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public DetaFormaPagoSessionBean detaformapagoSessionBean;
	public TipoBancoFormaPagoSessionBean tipobancoformapagoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BancoFormaPago> bancoformapagos;		
	public List<BancoFormaPago> bancoformapagosEliminados;	
	public List<BancoFormaPago> bancoformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBancoFormaPago;		
	protected JButton jButtonAbrirOrderByBancoFormaPago;
	
	
	//protected JPanel jPanelOrderByBancoFormaPago;
	//public JScrollPane jScrollPanelOrderByBancoFormaPago;	
	//protected JButton jButtonCerrarOrderByBancoFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BancoFormaPagoLogic bancoformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBancoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionBancoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralBancoFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosBancoFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBancoFormaPago;
	//public JScrollPane jScrollPanelImportacionBancoFormaPago;
	
	
	
	protected JPanel jPanelAccionesBancoFormaPago;
	
    protected JPanel jPanelPaginacionBancoFormaPago;
    protected JPanel jPanelParametrosReportesBancoFormaPago;
	protected JPanel jPanelParametrosReportesAccionesBancoFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BancoFormaPago;
	protected JPanel jPanelParametrosAuxiliar2BancoFormaPago;
	protected JPanel jPanelParametrosAuxiliar3BancoFormaPago;
	protected JPanel jPanelParametrosAuxiliar4BancoFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5BancoFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoBancoFormaPago;
	//protected JPanel jPanelImportacionBancoFormaPago;
	
	
	public JTable jTableDatosBancoFormaPago;
	
	
	
	//public JTable jTableDatosBancoFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBancoFormaPago;
	protected JButton jButtonDuplicarBancoFormaPago;
	protected JButton jButtonCopiarBancoFormaPago;
	protected JButton jButtonVerFormBancoFormaPago;
	protected JButton jButtonNuevoRelacionesBancoFormaPago;
	protected JButton jButtonModificarBancoFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaBancoFormaPago;
	protected JButton jButtonCerrarBancoFormaPago;
	
	
	protected JButton jButtonRecargarInformacionBancoFormaPago;
	protected JButton jButtonProcesarInformacionBancoFormaPago;
	
	
	protected JButton jButtonAnterioresBancoFormaPago;
	protected JButton jButtonSiguientesBancoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosBancoFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBancoFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoBancoFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoBancoFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionBancoFormaPago;
	//protected JButton jButtonGenerarImportacionBancoFormaPago;
	//protected JButton jButtonCerrarImportacionBancoFormaPago;
	//protected JFileChooser jFileChooserImportacionBancoFormaPago;
	//protected File fileImportacionBancoFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBancoFormaPago;
	protected JButton jButtonDuplicarToolBarBancoFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarBancoFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarBancoFormaPago;
	protected JButton jButtonCopiarToolBarBancoFormaPago;
	protected JButton jButtonVerFormToolBarBancoFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarBancoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarBancoFormaPago;
	protected JButton jButtonCerrarToolBarBancoFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarBancoFormaPago;
	protected JButton jButtonProcesarInformacionToolBarBancoFormaPago;
	protected JButton jButtonAnterioresToolBarBancoFormaPago;
	protected JButton jButtonSiguientesToolBarBancoFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarBancoFormaPago;
	protected JButton jButtonAbrirOrderByToolBarBancoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBancoFormaPago;
	protected JMenuItem jMenuItemDuplicarBancoFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesBancoFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBancoFormaPago;
	protected JMenuItem jMenuItemCopiarBancoFormaPago;
	protected JMenuItem jMenuItemVerFormBancoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaBancoFormaPago;
	protected JMenuItem jMenuItemCerrarBancoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarBancoFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBancoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarBancoFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionBancoFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionBancoFormaPago;
	protected JMenuItem jMenuItemAnterioresBancoFormaPago;
	protected JMenuItem jMenuItemSiguientesBancoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBancoFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByBancoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarBancoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBancoFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBancoFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosBancoFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBancoFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteBancoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBancoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBancoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBancoFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBancoFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBancoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBancoFormaPago;
	protected JTextField jTextFieldValorCampoGeneralBancoFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBancoFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteBancoFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteBancoFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteBancoFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteBancoFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteBancoFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBancoFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBancoFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBancoFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoBancoFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionBancoFormaPago;	
	//public JLabel jLabelPathArchivoImportacionBancoFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionBancoFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBancoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBancoFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorBancoFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBancoFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoBancoFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoBancoFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoBancoFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBancoFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBancoFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBancoFormaPago;
	public JPanel jPanelFK_IdBancoFormaPagoBancoFormaPago;
	public JButton jButtonFK_IdBancoFormaPagoBancoFormaPago;
	public JPanel jPanelFK_IdDetaFormaPagoBancoFormaPago;
	public JButton jButtonFK_IdDetaFormaPagoBancoFormaPago;
	public JPanel jPanelFK_IdFacturaBancoFormaPago;
	public JButton jButtonFK_IdFacturaBancoFormaPago;
	
	public JPanel jPanelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago;
	public JLabel jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago;
	public JButton jButtonid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago;
	public JLabel jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago;
	public JButton jButtonid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago= new JButtonMe();
	public JButton jButtonid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaBancoFormaPago;
	public JLabel jLabelid_facturaFK_IdFacturaBancoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaBancoFormaPago;
	public JButton jButtonid_facturaFK_IdFacturaBancoFormaPago= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaBancoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaBancoFormaPagoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago;
	
	
	
	
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
	public BancoFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BancoFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBancoFormaPago)	{
		this.jButtonRecargarInformacionBancoFormaPago = jButtonRecargarInformacionBancoFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionBancoFormaPago() {
		return this.jButtonProcesarInformacionBancoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBancoFormaPago)	{
		this.jButtonProcesarInformacionBancoFormaPago = jButtonProcesarInformacionBancoFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionBancoFormaPago() {
		return this.jButtonRecargarInformacionBancoFormaPago;
	}
	
	
	public List<BancoFormaPago> getbancoformapagos() {
		return this.bancoformapagos;
	}

	public void setbancoformapagos(List<BancoFormaPago> bancoformapagos) {
		this.bancoformapagos = bancoformapagos;
	}
	
	public List<BancoFormaPago> getbancoformapagosAux() {
		return this.bancoformapagosAux;
	}

	public void setbancoformapagosAux(List<BancoFormaPago> bancoformapagosAux) {
		this.bancoformapagosAux = bancoformapagosAux;
	}
	
	public List<BancoFormaPago> getbancoformapagosEliminados() {
		return this.bancoformapagosEliminados;
	}

	public void setBancoFormaPagosEliminados(List<BancoFormaPago> bancoformapagosEliminados) {
		this.bancoformapagosEliminados = bancoformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBancoFormaPago() {
		return jComboBoxTiposSeleccionarBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBancoFormaPago(
			JComboBox jComboBoxTiposSeleccionarBancoFormaPago) {
		this.jComboBoxTiposSeleccionarBancoFormaPago = jComboBoxTiposSeleccionarBancoFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBancoFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBancoFormaPago() {
		return jTextFieldValorCampoGeneralBancoFormaPago;
	}

	public void setjTextFieldValorCampoGeneralBancoFormaPago(
			JTextField jTextFieldValorCampoGeneralBancoFormaPago) {
		this.jTextFieldValorCampoGeneralBancoFormaPago = jTextFieldValorCampoGeneralBancoFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBancoFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBancoFormaPago() {
		return this.jCheckBoxSeleccionarTodosBancoFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosBancoFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosBancoFormaPago) {
		this.jCheckBoxSeleccionarTodosBancoFormaPago = jCheckBoxSeleccionarTodosBancoFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBancoFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBancoFormaPago() {
		return this.jCheckBoxSeleccionadosBancoFormaPago;
	}

	public void setjCheckBoxSeleccionadosBancoFormaPago(
			JCheckBox jCheckBoxSeleccionadosBancoFormaPago) {
		this.jCheckBoxSeleccionadosBancoFormaPago = jCheckBoxSeleccionadosBancoFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBancoFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBancoFormaPago() {
		return this.jComboBoxTiposArchivosReportesBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBancoFormaPago(
			JComboBox jComboBoxTiposArchivosReportesBancoFormaPago) {
		this.jComboBoxTiposArchivosReportesBancoFormaPago = jComboBoxTiposArchivosReportesBancoFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBancoFormaPago() {
		return this.jComboBoxTiposReportesBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBancoFormaPago(
			JComboBox jComboBoxTiposReportesBancoFormaPago) {
		this.jComboBoxTiposReportesBancoFormaPago = jComboBoxTiposReportesBancoFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBancoFormaPago() {
	//	return jComboBoxTiposReportesDinamicoBancoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBancoFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoBancoFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoBancoFormaPago = jComboBoxTiposReportesDinamicoBancoFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBancoFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoBancoFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBancoFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBancoFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago = jComboBoxTiposArchivosReportesDinamicoBancoFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBancoFormaPago() {
		return this.jComboBoxTiposGraficosReportesBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBancoFormaPago(
			JComboBox jComboBoxTiposGraficosReportesBancoFormaPago) {
		this.jComboBoxTiposGraficosReportesBancoFormaPago = jComboBoxTiposGraficosReportesBancoFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBancoFormaPago() {
		return this.jComboBoxTiposPaginacionBancoFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBancoFormaPago(
			JComboBox jComboBoxTiposPaginacionBancoFormaPago) {
		this.jComboBoxTiposPaginacionBancoFormaPago = jComboBoxTiposPaginacionBancoFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBancoFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBancoFormaPago() {
		return this.jComboBoxTiposRelacionesBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBancoFormaPago() {
		return this.jComboBoxTiposAccionesBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBancoFormaPago(
			JComboBox jComboBoxTiposRelacionesBancoFormaPago) {
		this.jComboBoxTiposRelacionesBancoFormaPago = jComboBoxTiposRelacionesBancoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBancoFormaPago(
			JComboBox jComboBoxTiposAccionesBancoFormaPago) {
		this.jComboBoxTiposAccionesBancoFormaPago = jComboBoxTiposAccionesBancoFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBancoFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBancoFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBancoFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBancoFormaPago() {
	//	return jCheckBoxConGraficoDinamicoBancoFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoBancoFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoBancoFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoBancoFormaPago = jCheckBoxConGraficoDinamicoBancoFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBancoFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBancoFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBancoFormaPago .setBorder(borderResaltar);		
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
		this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		
		this.bancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bancoformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BancoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Banco Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BancoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBancoFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"nuevo","nuevo","Nuevo"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"duplicar","duplicar","Duplicar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"copiar","copiar","Copiar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"ver_form","ver_form","Ver"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"recargar","recargar","Recargar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBancoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBancoFormaPago,this.jTtoolBarBancoFormaPago,
							"cerrar","cerrar","Salir"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBancoFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBancoFormaPago;
			
				this.jButtonProcesarInformacionToolBarBancoFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBancoFormaPago;
				
		//protected JButton jButtonModificarToolBarBancoFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBancoFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBancoFormaPago=new JMenuMe("General");
		this.jmenuArchivoBancoFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesBancoFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosBancoFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBancoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBancoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBancoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBancoFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBancoFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBancoFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBancoFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBancoFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBancoFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBancoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBancoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBancoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBancoFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBancoFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBancoFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBancoFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBancoFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBancoFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBancoFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBancoFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBancoFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBancoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBancoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBancoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBancoFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBancoFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBancoFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBancoFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBancoFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBancoFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBancoFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBancoFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBancoFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBancoFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBancoFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBancoFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBancoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBancoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBancoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBancoFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBancoFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBancoFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBancoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBancoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBancoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBancoFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBancoFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBancoFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBancoFormaPago.add(this.jMenuItemCerrarBancoFormaPago);
			
			this.jmenuAccionesBancoFormaPago.add(this.jMenuItemNuevoBancoFormaPago);
			this.jmenuAccionesBancoFormaPago.add(this.jMenuItemNuevoGuardarCambiosBancoFormaPago);
			this.jmenuAccionesBancoFormaPago.add(this.jMenuItemNuevoRelacionesBancoFormaPago);
			this.jmenuAccionesBancoFormaPago.add(this.jMenuItemGuardarCambiosTablaBancoFormaPago);		
			this.jmenuAccionesBancoFormaPago.add(this.jMenuItemDuplicarBancoFormaPago);		
			this.jmenuAccionesBancoFormaPago.add(this.jMenuItemCopiarBancoFormaPago);		
			this.jmenuAccionesBancoFormaPago.add(this.jMenuItemVerFormBancoFormaPago);		
			
			this.jmenuDatosBancoFormaPago.add(this.jMenuItemRecargarInformacionBancoFormaPago);				
			this.jmenuDatosBancoFormaPago.add(this.jMenuItemAnterioresBancoFormaPago);				
			this.jmenuDatosBancoFormaPago.add(this.jMenuItemSiguientesBancoFormaPago);				
			this.jmenuDatosBancoFormaPago.add(this.jMenuItemAbrirOrderByBancoFormaPago);				
			this.jmenuDatosBancoFormaPago.add(this.jMenuItemMostrarOcultarBancoFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBancoFormaPago.add(this.jMenuItemGuardarCambiosBancoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBancoFormaPago.add(this.jmenuArchivoBancoFormaPago);		
			this.jmenuBarBancoFormaPago.add(this.jmenuAccionesBancoFormaPago);		
			this.jmenuBarBancoFormaPago.add(this.jmenuDatosBancoFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBancoFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBancoFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoFormaPagoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoFormaPagoBancoFormaPago.setToolTipText("Buscar Por Tipo Banco Forma Pago ");
		this.jButtonFK_IdBancoFormaPagoBancoFormaPago= new JButtonMe();
		this.jButtonFK_IdBancoFormaPagoBancoFormaPago.setText("Buscar");
		this.jButtonFK_IdBancoFormaPagoBancoFormaPago.setToolTipText("Buscar Por Tipo Banco Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoFormaPagoBancoFormaPago,"buscar_button","Buscar Por Tipo Banco Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoFormaPagoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago = new JLabelMe();
		jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setText("Tipo Banco Forma Pago :");
		jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setToolTipText("Tipo Banco Forma Pago");
		jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetaFormaPagoBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetaFormaPagoBancoFormaPago.setToolTipText("Buscar Por Deta Forma Pago ");
		this.jButtonFK_IdDetaFormaPagoBancoFormaPago= new JButtonMe();
		this.jButtonFK_IdDetaFormaPagoBancoFormaPago.setText("Buscar");
		this.jButtonFK_IdDetaFormaPagoBancoFormaPago.setToolTipText("Buscar Por Deta Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetaFormaPagoBancoFormaPago,"buscar_button","Buscar Por Deta Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetaFormaPagoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago = new JLabelMe();
		jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setText("Deta Forma Pago :");
		jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setToolTipText("Deta Forma Pago");
		jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago= new JComboBoxMe();
		jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaBancoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaBancoFormaPago.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaBancoFormaPago= new JButtonMe();
		this.jButtonFK_IdFacturaBancoFormaPago.setText("Buscar");
		this.jButtonFK_IdFacturaBancoFormaPago.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaBancoFormaPago,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaBancoFormaPago = new JLabelMe();
		jLabelid_facturaFK_IdFacturaBancoFormaPago.setText("Factura :");
		jLabelid_facturaFK_IdFacturaBancoFormaPago.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaBancoFormaPago= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago.setFocusable(false);


		this.jTabbedPaneBusquedasBancoFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasBancoFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBancoFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBancoFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBancoFormaPago = new BancoFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Banco Forma Pago DATOS");
			this.jInternalFrameDetalleFormBancoFormaPago = new BancoFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.bancoformapagoSessionBean.getConGuardarRelaciones(),this.bancoformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBancoFormaPago = null;//new BancoFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBancoFormaPago= new GridBagLayout();
		
		
		this.jTableDatosBancoFormaPago = new JTableMe();      
		
		String sToolTipBancoFormaPago="";
		sToolTipBancoFormaPago=BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBancoFormaPago+="(Tesoreria.BancoFormaPago)";
		}
		
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipBancoFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBancoFormaPago.setToolTipText(sToolTipBancoFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBancoFormaPago);
		this.jTableDatosBancoFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosBancoFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBancoFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosBancoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBancoFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBancoFormaPago = new JButtonMe();
		this.jButtonDuplicarBancoFormaPago = new JButtonMe();
		this.jButtonCopiarBancoFormaPago = new JButtonMe();
		this.jButtonVerFormBancoFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesBancoFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBancoFormaPago = new JButtonMe();
		this.jButtonCerrarBancoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosBancoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralBancoFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Banco Forma Pago";
		
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosBancoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBancoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesBancoFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBancoFormaPago=new ReporteDinamicoJInternalFrame(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBancoFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBancoFormaPago=new ImportacionJInternalFrame(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBancoFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBancoFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByBancoFormaPago.setText("Orden");
		this.jButtonAbrirOrderByBancoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBancoFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoFormaPago,false,this);
			
			//this.cargarOrderByBancoFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBancoFormaPago,true,this);
			
			//this.cargarOrderByBancoFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBancoFormaPago.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosBancoFormaPago.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosBancoFormaPago.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosBancoFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBancoFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBancoFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBancoFormaPago.setText("Nuevo");
		this.jButtonDuplicarBancoFormaPago.setText("Duplicar");
		this.jButtonCopiarBancoFormaPago.setText("Copiar");
		this.jButtonVerFormBancoFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesBancoFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBancoFormaPago.setText("Guardar");
		this.jButtonCerrarBancoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBancoFormaPago,"nuevo_button","Nuevo",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBancoFormaPago,"duplicar_button","Duplicar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBancoFormaPago,"copiar_button","Copiar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBancoFormaPago,"ver_form","Ver",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBancoFormaPago,"nuevorelaciones_button","Nuevo Rel",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBancoFormaPago,"guardarcambiostabla_button","Guardar",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBancoFormaPago,"cerrar_button","Salir",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBancoFormaPago.setToolTipText("Nuevo"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBancoFormaPago.setToolTipText("Duplicar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBancoFormaPago.setToolTipText("Copiar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBancoFormaPago.setToolTipText("Ver"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBancoFormaPago.setToolTipText("Nuevo Rel"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBancoFormaPago.setToolTipText("Guardar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBancoFormaPago.setToolTipText("Salir"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBancoFormaPago";
		inputMap = this.jButtonNuevoBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBancoFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarBancoFormaPago";
		inputMap = this.jButtonDuplicarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBancoFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarBancoFormaPago";
		inputMap = this.jButtonCopiarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBancoFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormBancoFormaPago";
		inputMap = this.jButtonVerFormBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBancoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBancoFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBancoFormaPago";
		inputMap = this.jButtonNuevoRelacionesBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBancoFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBancoFormaPago";
		inputMap = this.jButtonModificarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBancoFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBancoFormaPago";
		inputMap = this.jButtonCerrarBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBancoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBancoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBancoFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBancoFormaPago.setName("jPanelParametrosReportesBancoFormaPago"); 
		
		this.jPanelParametrosReportesAccionesBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBancoFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBancoFormaPago.setName("jPanelParametrosReportesAccionesBancoFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBancoFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionBancoFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionBancoFormaPago.setToolTipText("Recargar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBancoFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBancoFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionBancoFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionBancoFormaPago.setToolTipText("Procesar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBancoFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionBancoFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBancoFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBancoFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBancoFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBancoFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBancoFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesBancoFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBancoFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBancoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBancoFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionBancoFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBancoFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesBancoFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBancoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesBancoFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBancoFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarBancoFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBancoFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBancoFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBancoFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBancoFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBancoFormaPago = new JLabelMe();
		
		this.jLabelAccionesBancoFormaPago.setText("Acciones");		
		this.jLabelAccionesBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBancoFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBancoFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBancoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBancoFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBancoFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBancoFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBancoFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBancoFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBancoFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteBancoFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBancoFormaPago = new JButtonMe();
		//this.jButtonAnterioresBancoFormaPago.setText("<<");
        this.jButtonAnterioresBancoFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBancoFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBancoFormaPago = new JButtonMe();
		//this.jButtonSiguientesBancoFormaPago.setText(">>");
        this.jButtonSiguientesBancoFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBancoFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBancoFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBancoFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosBancoFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBancoFormaPago,"nuevoguardarcambios_button","Nue",this.bancoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBancoFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBancoFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBancoFormaPago";
		inputMap = this.jButtonRecargarInformacionBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBancoFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBancoFormaPago";
		inputMap = this.jButtonSiguientesBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBancoFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBancoFormaPago";
		inputMap = this.jButtonAnterioresBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBancoFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBancoFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBancoFormaPago.setMinimumSize(new Dimension(this.getWidth(),BancoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBancoFormaPago.setMaximumSize(new Dimension(this.getWidth(),BancoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBancoFormaPago.setPreferredSize(new Dimension(this.getWidth(),BancoFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BancoFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBancoFormaPago = new GridBagLayout();

			this.jPanelPaginacionBancoFormaPago.setLayout(gridaBagLayoutPaginacionBancoFormaPago);						
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = 0;
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonAnterioresBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
					
						
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBancoFormaPago.gridy = 0;
			
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonNuevoGuardarCambiosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
						
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBancoFormaPago.gridy = 0;
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonSiguientesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = 1;
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonNuevoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
						
			
			
			if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBancoFormaPago.gridy = 1;
				this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBancoFormaPago.add(this.jButtonGuardarCambiosTablaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			}
			
			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = 1;
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonDuplicarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = 1;
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonCopiarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = 1;
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonVerFormBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = 1;
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBancoFormaPago.add(this.jButtonCerrarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		
		this.jButtonRecargarInformacionBancoFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBancoFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBancoFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBancoFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBancoFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBancoFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBancoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBancoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBancoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBancoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBancoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBancoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBancoFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBancoFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBancoFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBancoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBancoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBancoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBancoFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBancoFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBancoFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBancoFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBancoFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBancoFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBancoFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBancoFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBancoFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBancoFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBancoFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBancoFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBancoFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BancoFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BancoFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBancoFormaPago.setLayout(gridaBagParametrosReportesBancoFormaPago);
			this.jPanelParametrosReportesAccionesBancoFormaPago.setLayout(gridaBagParametrosReportesAccionesBancoFormaPago);
			
			
			this.jPanelParametrosAuxiliar1BancoFormaPago.setLayout(gridaBagParametrosAuxiliar1BancoFormaPago);
			this.jPanelParametrosAuxiliar2BancoFormaPago.setLayout(gridaBagParametrosAuxiliar2BancoFormaPago);
			this.jPanelParametrosAuxiliar3BancoFormaPago.setLayout(gridaBagParametrosAuxiliar3BancoFormaPago);
			this.jPanelParametrosAuxiliar4BancoFormaPago.setLayout(gridaBagParametrosAuxiliar4BancoFormaPago);
			//this.jPanelParametrosAuxiliar5BancoFormaPago.setLayout(gridaBagParametrosAuxiliar2BancoFormaPago);			
			
			
			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoFormaPago.add(this.jButtonRecargarInformacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BancoFormaPago.add(this.jComboBoxTiposPaginacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BancoFormaPago.add(this.jCheckBoxConAltoMaximoTablaBancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BancoFormaPago.add(this.jComboBoxTiposArchivosReportesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoFormaPago.add(this.jPanelParametrosAuxiliar1BancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BancoFormaPago.add(this.jComboBoxTiposReportesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);																		
			
			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4BancoFormaPago.add(this.jComboBoxTiposGraficosReportesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoFormaPago.add(this.jPanelParametrosAuxiliar4BancoFormaPago, this.gridBagConstraintsBancoFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoFormaPago.add(this.jComboBoxTiposReportesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBancoFormaPago.add(this.jCheckBoxGenerarReporteBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoFormaPago.add(this.jPanelParametrosAuxiliar2BancoFormaPago, this.gridBagConstraintsBancoFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBancoFormaPago.add(this.jLabelAccionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBancoFormaPago.add(this.jButtonAbrirOrderByBancoFormaPago, this.gridBagConstraintsBancoFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoFormaPago.add(this.jComboBoxTiposSeleccionarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
			
			
			/*
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBancoFormaPago.add(this.jCheckBoxSeleccionarTodosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBancoFormaPago.add(this.jCheckBoxConGraficoReporteBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BancoFormaPago.add(this.jCheckBoxSeleccionarTodosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);															
				
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BancoFormaPago.add(this.jCheckBoxSeleccionadosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);															
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBancoFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BancoFormaPago.add(this.jCheckBoxConGraficoReporteBancoFormaPago, this.gridBagConstraintsBancoFormaPago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBancoFormaPago.add(this.jPanelParametrosAuxiliar3BancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoFormaPago.add(this.jComboBoxTiposAccionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
	
				
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBancoFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBancoFormaPago.add(this.jTextFieldValorCampoGeneralBancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBancoFormaPago = new GridBagLayout();

			this.jScrollPanelDatosBancoFormaPago.setLayout(gridaBagLayoutDatosBancoFormaPago);
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = 0;
			this.gridBagConstraintsBancoFormaPago.gridx = 0;
			
			this.jScrollPanelDatosBancoFormaPago.add(this.jTableDatosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBancoFormaPago.setViewportView(this.jTableDatosBancoFormaPago);
		this.jTableDatosBancoFormaPago.setFillsViewportHeight(true);
		this.jTableDatosBancoFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBancoFormaPago= new GridBagLayout();
		this.jPanelAccionesBancoFormaPago.setLayout(gridaBagLayoutAccionesBancoFormaPago);
		
		
		/*	
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = 0;
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
			
		this.jPanelAccionesBancoFormaPago.add(this.jButtonNuevoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoFormaPagoBancoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdBancoFormaPagoBancoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoFormaPagoBancoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoFormaPagoBancoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoFormaPagoBancoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoFormaPagoBancoFormaPago.setLayout(gridaBagLayoutFK_IdBancoFormaPagoBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 0;
		gridBagConstraintsBancoFormaPago.gridx = 0;
		jPanelFK_IdBancoFormaPagoBancoFormaPago.add(jLabelid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago, gridBagConstraintsBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 0;
		gridBagConstraintsBancoFormaPago.gridx = 1;
		jPanelFK_IdBancoFormaPagoBancoFormaPago.add(jComboBoxid_tipo_banco_forma_pagoFK_IdBancoFormaPagoBancoFormaPago, gridBagConstraintsBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 1;
		gridBagConstraintsBancoFormaPago.gridx =1;
		jPanelFK_IdBancoFormaPagoBancoFormaPago.add(jButtonFK_IdBancoFormaPagoBancoFormaPago, gridBagConstraintsBancoFormaPago);

		jTabbedPaneBusquedasBancoFormaPago.addTab("1.-Por Tipo Banco Forma Pago ", jPanelFK_IdBancoFormaPagoBancoFormaPago);
		jTabbedPaneBusquedasBancoFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDetaFormaPagoBancoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdDetaFormaPagoBancoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetaFormaPagoBancoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetaFormaPagoBancoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetaFormaPagoBancoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetaFormaPagoBancoFormaPago.setLayout(gridaBagLayoutFK_IdDetaFormaPagoBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 0;
		gridBagConstraintsBancoFormaPago.gridx = 0;
		jPanelFK_IdDetaFormaPagoBancoFormaPago.add(jLabelid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago, gridBagConstraintsBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 0;
		gridBagConstraintsBancoFormaPago.gridx = 1;
		jPanelFK_IdDetaFormaPagoBancoFormaPago.add(jComboBoxid_deta_forma_pagoFK_IdDetaFormaPagoBancoFormaPago, gridBagConstraintsBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 1;
		gridBagConstraintsBancoFormaPago.gridx =1;
		jPanelFK_IdDetaFormaPagoBancoFormaPago.add(jButtonFK_IdDetaFormaPagoBancoFormaPago, gridBagConstraintsBancoFormaPago);

		jTabbedPaneBusquedasBancoFormaPago.addTab("2.-Por Deta Forma Pago ", jPanelFK_IdDetaFormaPagoBancoFormaPago);
		jTabbedPaneBusquedasBancoFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFacturaBancoFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaBancoFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaBancoFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaBancoFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaBancoFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaBancoFormaPago.setLayout(gridaBagLayoutFK_IdFacturaBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 0;
		gridBagConstraintsBancoFormaPago.gridx = 0;
		jPanelFK_IdFacturaBancoFormaPago.add(jLabelid_facturaFK_IdFacturaBancoFormaPago, gridBagConstraintsBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 0;
		gridBagConstraintsBancoFormaPago.gridx = 1;
		jPanelFK_IdFacturaBancoFormaPago.add(jComboBoxid_facturaFK_IdFacturaBancoFormaPago, gridBagConstraintsBancoFormaPago);


		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsBancoFormaPago.gridy = 0;
		gridBagConstraintsBancoFormaPago.gridx = 0;
		jPanelFK_IdFacturaBancoFormaPago.add(this.jButtonBuscarFK_IdFacturaid_facturaBancoFormaPago, gridBagConstraintsBancoFormaPago);

		gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBancoFormaPago.gridy = 1;
		gridBagConstraintsBancoFormaPago.gridx =1;
		jPanelFK_IdFacturaBancoFormaPago.add(jButtonFK_IdFacturaBancoFormaPago, gridBagConstraintsBancoFormaPago);

		jTabbedPaneBusquedasBancoFormaPago.addTab("3.-Por Factura ", jPanelFK_IdFacturaBancoFormaPago);
		jTabbedPaneBusquedasBancoFormaPago.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBancoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBancoFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBancoFormaPago.gridx = 0;		
			//this.gridBagConstraintsBancoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBancoFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBancoFormaPago, this.gridBagConstraintsBancoFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBancoFormaPago.gridx = 0;		
		//this.gridBagConstraintsBancoFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBancoFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBancoFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBancoFormaPago.gridx = 0;		
			this.gridBagConstraintsBancoFormaPago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBancoFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBancoFormaPago, this.gridBagConstraintsBancoFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);								
		
		
		/*
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		*/		
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBancoFormaPago.gridx =0;
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBancoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
				
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBancoFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBancoFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosBancoFormaPago.setLayout(gridaBagLayoutBusquedasParametrosBancoFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBancoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBancoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBancoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
			
			
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
			
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBancoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBancoFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBancoFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBancoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBancoFormaPago.setName("jPanelReporteDinamicoBancoFormaPago"); 
		
		this.jPanelReporteDinamicoBancoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBancoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBancoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBancoFormaPago.setLayout(gridaBagLayoutReporteDinamicoBancoFormaPago);
		
		
		this.jInternalFrameReporteDinamicoBancoFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBancoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBancoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBancoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBancoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBancoFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBancoFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoBancoFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoBancoFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBancoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBancoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBancoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBancoFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteBancoFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelColumnasSelectReporteBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBancoFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteBancoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBancoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBancoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBancoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBancoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBancoFormaPago=new JScrollPane(this.jListColumnasSelectReporteBancoFormaPago);
			
			this.jScrollColumnasSelectReporteBancoFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBancoFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBancoFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBancoFormaPago.add(this.jListColumnasSelectReporteBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jScrollColumnasSelectReporteBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBancoFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteBancoFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBancoFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteBancoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBancoFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBancoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBancoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBancoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBancoFormaPago=new JScrollPane(this.jListRelacionesSelectReporteBancoFormaPago);
			
			this.jScrollRelacionesSelectReporteBancoFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBancoFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBancoFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBancoFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBancoFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoBancoFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBancoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBancoFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBancoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBancoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBancoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBancoFormaPago = new JLabelMe();

		this.jLabelConGraficoDinamicoBancoFormaPago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelConGraficoDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBancoFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBancoFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBancoFormaPago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBancoFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBancoFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBancoFormaPago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jCheckBoxConGraficoDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBancoFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBancoFormaPago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelColumnaCategoriaGraficoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBancoFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBancoFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBancoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBancoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBancoFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jComboBoxColumnaCategoriaGraficoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBancoFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaValorBancoFormaPago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelColumnaCategoriaValorBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBancoFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBancoFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBancoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBancoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBancoFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jComboBoxColumnaCategoriaValorBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBancoFormaPago = new JLabelMe();

		this.jLabelColumnasValoresGraficoBancoFormaPago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelColumnasValoresGraficoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBancoFormaPago = new JList<Reporte>();
		this.jListColumnasValoresGraficoBancoFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBancoFormaPago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBancoFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBancoFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBancoFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBancoFormaPago=new JScrollPane(this.jListColumnasValoresGraficoBancoFormaPago);
			
			this.jScrollColumnasValoresGraficoBancoFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBancoFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBancoFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBancoFormaPago.add(this.jListColumnasSelectReporteBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jScrollColumnasValoresGraficoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBancoFormaPago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBancoFormaPago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelTiposGraficosReportesDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBancoFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBancoFormaPago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBancoFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBancoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBancoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBancoFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jComboBoxTiposGraficosReportesDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBancoFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBancoFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelGenerarExcelReporteDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBancoFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBancoFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBancoFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBancoFormaPago.setToolTipText("Generar EXCEL"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBancoFormaPago.add(this.jButtonGenerarExcelReporteDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jComboBoxTiposReportesDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBancoFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBancoFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jLabelTiposArchivoReporteDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBancoFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBancoFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBancoFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBancoFormaPago.setToolTipText("Generar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jButtonGenerarReporteDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBancoFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBancoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBancoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBancoFormaPago.setToolTipText("Cancelar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBancoFormaPago.add(this.jButtonCerrarReporteDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBancoFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBancoFormaPago= new JScrollPane(jPanelReporteDinamicoBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBancoFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBancoFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBancoFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBancoFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBancoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBancoFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBancoFormaPago);
		this.jInternalFrameReporteDinamicoBancoFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoBancoFormaPago, this.gridBagConstraintsBancoFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBancoFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBancoFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBancoFormaPago.setName("jPanelImportacionBancoFormaPago"); 
		
		this.jPanelImportacionBancoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBancoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBancoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBancoFormaPago.setLayout(gridaBagLayoutImportacionBancoFormaPago);
		
		
		this.jInternalFrameImportacionBancoFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBancoFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBancoFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBancoFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBancoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBancoFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBancoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBancoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionBancoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionBancoFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBancoFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBancoFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBancoFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBancoFormaPago.setResizable(true);
	    this.jInternalFrameImportacionBancoFormaPago.setClosable(true);
	    this.jInternalFrameImportacionBancoFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBancoFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBancoFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBancoFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBancoFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionBancoFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBancoFormaPago.add(this.jLabelArchivoImportacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBancoFormaPago = new JFileChooser();		
		this.jFileChooserImportacionBancoFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBancoFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionBancoFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBancoFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBancoFormaPago.setToolTipText("Generar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoFormaPago.add(this.jButtonAbrirImportacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBancoFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionBancoFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBancoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBancoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBancoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBancoFormaPago.add(this.jLabelPathArchivoImportacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBancoFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBancoFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBancoFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBancoFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoFormaPago.add(this.jTextFieldPathArchivoImportacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBancoFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionBancoFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBancoFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBancoFormaPago.setToolTipText("Generar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoFormaPago.add(this.jButtonGenerarImportacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBancoFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionBancoFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBancoFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBancoFormaPago.setToolTipText("Cancelar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBancoFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsBancoFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBancoFormaPago.add(this.jButtonCerrarImportacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBancoFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionBancoFormaPago= new JScrollPane(jPanelImportacionBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsBancoFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsBancoFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBancoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBancoFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBancoFormaPago);
		this.jInternalFrameImportacionBancoFormaPago.getContentPane().add(this.jScrollPanelImportacionBancoFormaPago, this.gridBagConstraintsBancoFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBancoFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBancoFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByBancoFormaPago.setText("Orden");
			this.jButtonAbrirOrderByBancoFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBancoFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBancoFormaPago";
			inputMap = this.jButtonAbrirOrderByBancoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBancoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBancoFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByBancoFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBancoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBancoFormaPago.setName("jPanelOrderByBancoFormaPago"); 
			
			this.jPanelOrderByBancoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBancoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBancoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBancoFormaPago.setLayout(gridaBagLayoutOrderByBancoFormaPago);
			
			
			this.jTableDatosBancoFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosBancoFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBancoFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBancoFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBancoFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBancoFormaPagoOrderBy.setViewportView(this.jTableDatosBancoFormaPagoOrderBy);
			this.jTableDatosBancoFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBancoFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBancoFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBancoFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBancoFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBancoFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBancoFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBancoFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBancoFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByBancoFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBancoFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBancoFormaPago.setResizable(true);
			this.jInternalFrameOrderByBancoFormaPago.setClosable(true);
			this.jInternalFrameOrderByBancoFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBancoFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBancoFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBancoFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBancoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Banco Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBancoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBancoFormaPago.ipady =150;
				
			this.jPanelOrderByBancoFormaPago.add(jScrollPanelDatosBancoFormaPagoOrderBy, this.gridBagConstraintsBancoFormaPago);//this.jTableDatosBancoFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBancoFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByBancoFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBancoFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBancoFormaPago.setToolTipText("Cancelar"+" "+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBancoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBancoFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBancoFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBancoFormaPago.add(this.jButtonCerrarOrderByBancoFormaPago, this.gridBagConstraintsBancoFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBancoFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByBancoFormaPago= new JScrollPane(jPanelOrderByBancoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBancoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsBancoFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsBancoFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsBancoFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBancoFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBancoFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBancoFormaPago);
			
			this.jInternalFrameOrderByBancoFormaPago.getContentPane().add(this.jScrollPanelOrderByBancoFormaPago, this.gridBagConstraintsBancoFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByBancoFormaPago = new JButtonMe();
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
			&& this.bancoformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBancoFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBancoFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBancoFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBancoFormaPago.getRowHeight();//BancoFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBancoFormaPago.isSelected()) {
					iHeightTable=BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBancoFormaPago.isSelected()) {
					iHeightTable=BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BancoFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBancoFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBancoFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBancoFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBancoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBancoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBancoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBancoFormaPago!=null && this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBancoFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBancoFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBancoFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBancoFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBancoFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBancoFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBancoFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bancoformapagoLogic.getBancoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bancoformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BancoFormaPago> TraerBancoFormaPagoBeans(List<BancoFormaPago> bancoformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(BancoFormaPago bancoformapago:bancoformapagos) {
					
				if(!(BancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bancoformapago.setsDetalleGeneralEntityReporte(BancoFormaPagoConstantesFunciones.getBancoFormaPagoDescripcion(bancoformapago));
										
						
					
						
					
				} else  {
							
					//bancoformapago.setsDetalleGeneralEntityReporte(bancoformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//bancoformapagobeans.add(bancoformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bancoformapagos;
    }
	//PARA REPORTES FIN
}
