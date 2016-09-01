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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.EstructuraConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class EstructuraJInternalFrame extends EstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstructura;
	
	protected JMenuBar jmenuBarEstructura;
	
	protected JMenu jmenuEstructura;
	protected JMenu jmenuDatosEstructura;
	protected JMenu jmenuArchivoEstructura;
	protected JMenu jmenuAccionesEstructura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstructura;	
	protected GridBagConstraints gridBagConstraintsEstructura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstructuraDetalleFormJInternalFrame jInternalFrameDetalleFormEstructura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstructura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstructura;	
	
	
	public EstructuraBeanSwingJInternalFrameTree jInternalFrameTreeEstructura;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected TipoPago_NMBeanSwingJInternalFrame tipopago_nmBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopago_nm="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TipoEstructuraBeanSwingJInternalFrame tipoestructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoestructura="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public EstructuraSessionBean estructuraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoPago_NMSessionBean tipopago_nmSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TipoEstructuraSessionBean tipoestructuraSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Estructura> estructuras;		
	public List<Estructura> estructurasEliminados;	
	public List<Estructura> estructurasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstructura;		
	protected JButton jButtonAbrirOrderByEstructura;
	
	
	//protected JPanel jPanelOrderByEstructura;
	//public JScrollPane jScrollPanelOrderByEstructura;	
	//protected JButton jButtonCerrarOrderByEstructura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstructuraLogic estructuraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstructura;
	public JScrollPane jScrollPanelDatosEdicionEstructura;
	public JScrollPane jScrollPanelDatosGeneralEstructura;
    
	
	
	//public JScrollPane jScrollPanelDatosEstructuraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstructura;
	//public JScrollPane jScrollPanelImportacionEstructura;
	
	
	
	protected JPanel jPanelAccionesEstructura;
	
    protected JPanel jPanelPaginacionEstructura;
    protected JPanel jPanelParametrosReportesEstructura;
	protected JPanel jPanelParametrosReportesAccionesEstructura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Estructura;
	protected JPanel jPanelParametrosAuxiliar2Estructura;
	protected JPanel jPanelParametrosAuxiliar3Estructura;
	protected JPanel jPanelParametrosAuxiliar4Estructura;
	//protected JPanel jPanelParametrosAuxiliar5Estructura;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstructura;
	//protected JPanel jPanelImportacionEstructura;
	
	
	public JTable jTableDatosEstructura;
	
	
	
	//public JTable jTableDatosEstructuraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstructura;
	protected JButton jButtonDuplicarEstructura;
	protected JButton jButtonCopiarEstructura;
	protected JButton jButtonVerFormEstructura;
	protected JButton jButtonNuevoRelacionesEstructura;
	protected JButton jButtonModificarEstructura;
	
    protected JButton jButtonGuardarCambiosTablaEstructura;
	protected JButton jButtonCerrarEstructura;
	
	
	protected JButton jButtonRecargarInformacionEstructura;
	protected JButton jButtonProcesarInformacionEstructura;
	
	
	protected JButton jButtonAnterioresEstructura;
	protected JButton jButtonSiguientesEstructura;
	protected JButton jButtonNuevoGuardarCambiosEstructura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstructura;
	//protected JButton jButtonCerrarReporteDinamicoEstructura;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstructura;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstructura;
	//protected JButton jButtonGenerarImportacionEstructura;
	//protected JButton jButtonCerrarImportacionEstructura;
	//protected JFileChooser jFileChooserImportacionEstructura;
	//protected File fileImportacionEstructura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstructura;
	protected JButton jButtonDuplicarToolBarEstructura;
	protected JButton jButtonNuevoRelacionesToolBarEstructura;
	
	
	public JButton jButtonGuardarCambiosToolBarEstructura;
	protected JButton jButtonCopiarToolBarEstructura;
	protected JButton jButtonVerFormToolBarEstructura;
	public JButton jButtonGuardarCambiosTablaToolBarEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarEstructura;
	protected JButton jButtonCerrarToolBarEstructura;
	
	protected JButton jButtonRecargarInformacionToolBarEstructura;
	protected JButton jButtonProcesarInformacionToolBarEstructura;
	protected JButton jButtonAnterioresToolBarEstructura;
	protected JButton jButtonSiguientesToolBarEstructura;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstructura;
	protected JButton jButtonAbrirOrderByToolBarEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstructura;
	protected JMenuItem jMenuItemDuplicarEstructura;
	protected JMenuItem jMenuItemNuevoRelacionesEstructura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstructura;
	protected JMenuItem jMenuItemCopiarEstructura;
	protected JMenuItem jMenuItemVerFormEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstructura;
	protected JMenuItem jMenuItemCerrarEstructura;
	protected JMenuItem jMenuItemDetalleCerrarEstructura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstructura;
	
	protected JMenuItem jMenuItemRecargarInformacionEstructura;
	protected JMenuItem jMenuItemProcesarInformacionEstructura;
	protected JMenuItem jMenuItemAnterioresEstructura;
	protected JMenuItem jMenuItemSiguientesEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstructura;
	protected JMenuItem jMenuItemAbrirOrderByEstructura;
	protected JMenuItem jMenuItemMostrarOcultarEstructura;
	
	
	//MENU
	
	protected JButton jButtonArbolEstructura;	
	
	protected JLabel jLabelAccionesEstructura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstructura;
	protected JCheckBox jCheckBoxSeleccionadosEstructura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstructura;
	protected JCheckBox jCheckBoxConGraficoReporteEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstructura;
	protected JTextField jTextFieldValorCampoGeneralEstructura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstructura;
	//public JList<Reporte> jListColumnasSelectReporteEstructura;
	//public JScrollPane jScrollColumnasSelectReporteEstructura;
	
	//public JLabel jLabelRelacionesSelectReporteEstructura;
	//public JList<Reporte> jListRelacionesSelectReporteEstructura;
	//public JScrollPane jScrollRelacionesSelectReporteEstructura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstructura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstructura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstructura;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstructura;
	
		
	//public JLabel jLabelArchivoImportacionEstructura;	
	//public JLabel jLabelPathArchivoImportacionEstructura;
	//protected JTextField jTextFieldPathArchivoImportacionEstructura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstructura;
	
	//public JLabel jLabelColumnaCategoriaValorEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstructura;
	
	//public JLabel jLabelColumnasValoresGraficoEstructura;
	//public JList<Reporte> jListColumnasValoresGraficoEstructura;
	//public JScrollPane jScrollColumnasValoresGraficoEstructura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstructura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstructura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEstructura;
	public JPanel jPanelFK_IdCiudadEstructura;
	public JButton jButtonFK_IdCiudadEstructura;
	public JPanel jPanelFK_IdCuentaContableEstructura;
	public JButton jButtonFK_IdCuentaContableEstructura;
	public JPanel jPanelFK_IdEstructuraEstructura;
	public JButton jButtonFK_IdEstructuraEstructura;
	public JPanel jPanelFK_IdNumeroPatronalEstructura;
	public JButton jButtonFK_IdNumeroPatronalEstructura;
	public JPanel jPanelFK_IdPaisEstructura;
	public JButton jButtonFK_IdPaisEstructura;
	public JPanel jPanelFK_IdTipoEstructuraEstructura;
	public JButton jButtonFK_IdTipoEstructuraEstructura;
	public JPanel jPanelFK_IdTipoPago_NMEstructura;
	public JButton jButtonFK_IdTipoPago_NMEstructura;
	
	public JPanel jPanelid_ciudadFK_IdCiudadEstructura;
	public JLabel jLabelid_ciudadFK_IdCiudadEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadEstructura;
	public JButton jButtonid_ciudadFK_IdCiudadEstructura= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableEstructura;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableEstructura;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableEstructura= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableEstructuraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraEstructura;
	public JLabel jLabelid_estructuraFK_IdEstructuraEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEstructura;
	public JButton jButtonid_estructuraFK_IdEstructuraEstructura= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEstructuraArbol= new JButtonMe();

	
	public JPanel jPanelid_numero_patronalFK_IdNumeroPatronalEstructura;
	public JLabel jLabelid_numero_patronalFK_IdNumeroPatronalEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalFK_IdNumeroPatronalEstructura;
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalEstructura= new JButtonMe();
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalFK_IdNumeroPatronalEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisEstructura;
	public JLabel jLabelid_paisFK_IdPaisEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisEstructura;
	public JButton jButtonid_paisFK_IdPaisEstructura= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_estructuraFK_IdTipoEstructuraEstructura;
	public JLabel jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_estructuraFK_IdTipoEstructuraEstructura;
	public JButton jButtonid_tipo_estructuraFK_IdTipoEstructuraEstructura= new JButtonMe();
	public JButton jButtonid_tipo_estructuraFK_IdTipoEstructuraEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_estructuraFK_IdTipoEstructuraEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura;
	public JLabel jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMEstructura;
	public JButton jButtonid_tipo_pago__n_mFK_IdTipoPago_NMEstructura= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mFK_IdTipoPago_NMEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mFK_IdTipoPago_NMEstructuraBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=945;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstructuraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstructuraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstructuraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstructuraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstructura)	{
		this.jButtonRecargarInformacionEstructura = jButtonRecargarInformacionEstructura;
	}
	
	public JButton getjButtonProcesarInformacionEstructura() {
		return this.jButtonProcesarInformacionEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstructura)	{
		this.jButtonProcesarInformacionEstructura = jButtonProcesarInformacionEstructura;
	}
	
	
	public JButton getjButtonRecargarInformacionEstructura() {
		return this.jButtonRecargarInformacionEstructura;
	}
	
	public JButton getjButtonArbolEstructura() {
		return this.jButtonArbolEstructura;
	}
	
	public void setjButtonArbol(JButton jButtonArbolEstructura)	{
		this.jButtonArbolEstructura = jButtonArbolEstructura;
	}
	
	public List<Estructura> getestructuras() {
		return this.estructuras;
	}

	public void setestructuras(List<Estructura> estructuras) {
		this.estructuras = estructuras;
	}
	
	public List<Estructura> getestructurasAux() {
		return this.estructurasAux;
	}

	public void setestructurasAux(List<Estructura> estructurasAux) {
		this.estructurasAux = estructurasAux;
	}
	
	public List<Estructura> getestructurasEliminados() {
		return this.estructurasEliminados;
	}

	public void setEstructurasEliminados(List<Estructura> estructurasEliminados) {
		this.estructurasEliminados = estructurasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstructura() {
		return jComboBoxTiposSeleccionarEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstructura(
			JComboBox jComboBoxTiposSeleccionarEstructura) {
		this.jComboBoxTiposSeleccionarEstructura = jComboBoxTiposSeleccionarEstructura;
	}
	
	public void setBorderResaltarTiposSeleccionarEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstructura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstructura() {
		return jTextFieldValorCampoGeneralEstructura;
	}

	public void setjTextFieldValorCampoGeneralEstructura(
			JTextField jTextFieldValorCampoGeneralEstructura) {
		this.jTextFieldValorCampoGeneralEstructura = jTextFieldValorCampoGeneralEstructura;
	}

	public void setBorderResaltarValorCampoGeneralEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstructura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstructura() {
		return this.jCheckBoxSeleccionarTodosEstructura;
	}

	public void setjCheckBoxSeleccionarTodosEstructura(
			JCheckBox jCheckBoxSeleccionarTodosEstructura) {
		this.jCheckBoxSeleccionarTodosEstructura = jCheckBoxSeleccionarTodosEstructura;
	}

	public void setBorderResaltarSeleccionarTodosEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstructura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstructura() {
		return this.jCheckBoxSeleccionadosEstructura;
	}

	public void setjCheckBoxSeleccionadosEstructura(
			JCheckBox jCheckBoxSeleccionadosEstructura) {
		this.jCheckBoxSeleccionadosEstructura = jCheckBoxSeleccionadosEstructura;
	}
	
	public void setBorderResaltarSeleccionadosEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstructura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstructura() {
		return this.jComboBoxTiposArchivosReportesEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstructura(
			JComboBox jComboBoxTiposArchivosReportesEstructura) {
		this.jComboBoxTiposArchivosReportesEstructura = jComboBoxTiposArchivosReportesEstructura;
	}

	public void setBorderResaltarTiposArchivosReportesEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstructura() {
		return this.jComboBoxTiposReportesEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstructura(
			JComboBox jComboBoxTiposReportesEstructura) {
		this.jComboBoxTiposReportesEstructura = jComboBoxTiposReportesEstructura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstructura() {
	//	return jComboBoxTiposReportesDinamicoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstructura(
	//		JComboBox jComboBoxTiposReportesDinamicoEstructura) {
	//	this.jComboBoxTiposReportesDinamicoEstructura = jComboBoxTiposReportesDinamicoEstructura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstructura() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstructura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstructura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstructura = jComboBoxTiposArchivosReportesDinamicoEstructura;
	//}
	
	public void setBorderResaltarTiposReportesEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstructura() {
		return this.jComboBoxTiposGraficosReportesEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstructura(
			JComboBox jComboBoxTiposGraficosReportesEstructura) {
		this.jComboBoxTiposGraficosReportesEstructura = jComboBoxTiposGraficosReportesEstructura;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstructura() {
		return this.jComboBoxTiposPaginacionEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstructura(
			JComboBox jComboBoxTiposPaginacionEstructura) {
		this.jComboBoxTiposPaginacionEstructura = jComboBoxTiposPaginacionEstructura;
	}
	
	public void setBorderResaltarTiposPaginacionEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstructura() {
		return this.jComboBoxTiposRelacionesEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstructura() {
		return this.jComboBoxTiposAccionesEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstructura(
			JComboBox jComboBoxTiposRelacionesEstructura) {
		this.jComboBoxTiposRelacionesEstructura = jComboBoxTiposRelacionesEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstructura(
			JComboBox jComboBoxTiposAccionesEstructura) {
		this.jComboBoxTiposAccionesEstructura = jComboBoxTiposAccionesEstructura;
	}
	
	public void setBorderResaltarTiposRelacionesEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstructura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstructura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstructura() {
	//	return jCheckBoxConGraficoDinamicoEstructura;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstructura(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstructura) {
	//	this.jCheckBoxConGraficoDinamicoEstructura = jCheckBoxConGraficoDinamicoEstructura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstructura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstructura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstructura .setBorder(borderResaltar);		
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
		this.estructuraSessionBean=new EstructuraSessionBean();
		
		this.estructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estructuraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {
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
		
		EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstructura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstructura,this.jTtoolBarEstructura,
							"nuevo","nuevo","Nuevo"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstructura,this.jTtoolBarEstructura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstructura,this.jTtoolBarEstructura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstructura,this.jTtoolBarEstructura,
							"duplicar","duplicar","Duplicar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstructura,this.jTtoolBarEstructura,
							"copiar","copiar","Copiar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstructura,this.jTtoolBarEstructura,
							"ver_form","ver_form","Ver"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstructura,this.jTtoolBarEstructura,
							"recargar","recargar","Recargar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstructura,this.jTtoolBarEstructura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstructura,this.jTtoolBarEstructura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstructura,this.jTtoolBarEstructura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstructura,this.jTtoolBarEstructura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstructura,this.jTtoolBarEstructura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstructura,this.jTtoolBarEstructura,
							"cerrar","cerrar","Salir"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstructura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstructura;
			
				this.jButtonProcesarInformacionToolBarEstructura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstructura;
				
		//protected JButton jButtonModificarToolBarEstructura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstructura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstructura=new JMenuMe("General");
		this.jmenuArchivoEstructura=new JMenuMe("Archivo");
		this.jmenuAccionesEstructura=new JMenuMe("Acciones");
		this.jmenuDatosEstructura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstructura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstructura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstructura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstructura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstructura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstructura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstructura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstructura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstructura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstructura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstructura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstructura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstructura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstructura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstructura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstructura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstructura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstructura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstructura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstructura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstructura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstructura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstructura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstructura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstructura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstructura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstructura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstructura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstructura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstructura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstructura.add(this.jMenuItemCerrarEstructura);
			
			this.jmenuAccionesEstructura.add(this.jMenuItemNuevoEstructura);
			this.jmenuAccionesEstructura.add(this.jMenuItemNuevoGuardarCambiosEstructura);
			this.jmenuAccionesEstructura.add(this.jMenuItemNuevoRelacionesEstructura);
			this.jmenuAccionesEstructura.add(this.jMenuItemGuardarCambiosTablaEstructura);		
			this.jmenuAccionesEstructura.add(this.jMenuItemDuplicarEstructura);		
			this.jmenuAccionesEstructura.add(this.jMenuItemCopiarEstructura);		
			this.jmenuAccionesEstructura.add(this.jMenuItemVerFormEstructura);		
			
			this.jmenuDatosEstructura.add(this.jMenuItemRecargarInformacionEstructura);				
			this.jmenuDatosEstructura.add(this.jMenuItemAnterioresEstructura);				
			this.jmenuDatosEstructura.add(this.jMenuItemSiguientesEstructura);				
			this.jmenuDatosEstructura.add(this.jMenuItemAbrirOrderByEstructura);				
			this.jmenuDatosEstructura.add(this.jMenuItemMostrarOcultarEstructura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstructura.add(this.jMenuItemGuardarCambiosEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstructura.add(this.jmenuArchivoEstructura);		
			this.jmenuBarEstructura.add(this.jmenuAccionesEstructura);		
			this.jmenuBarEstructura.add(this.jmenuDatosEstructura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstructura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstructura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadEstructura.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadEstructura= new JButtonMe();
		this.jButtonFK_IdCiudadEstructura.setText("Buscar");
		this.jButtonFK_IdCiudadEstructura.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadEstructura,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadEstructura = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadEstructura.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadEstructura.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadEstructura= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableEstructura.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableEstructura= new JButtonMe();
		this.jButtonFK_IdCuentaContableEstructura.setText("Buscar");
		this.jButtonFK_IdCuentaContableEstructura.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableEstructura,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableEstructura = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableEstructura.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableEstructura.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableEstructura= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura.setFocusable(false);

		this.jPanelFK_IdEstructuraEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEstructura.setToolTipText("Buscar Por Estructura Padre ");
		this.jButtonFK_IdEstructuraEstructura= new JButtonMe();
		this.jButtonFK_IdEstructuraEstructura.setText("Buscar");
		this.jButtonFK_IdEstructuraEstructura.setToolTipText("Buscar Por Estructura Padre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEstructura,"buscar_button","Buscar Por Estructura Padre ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEstructura = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEstructura.setText("Estructura Padre :");
		jLabelid_estructuraFK_IdEstructuraEstructura.setToolTipText("Estructura Padre");
		jLabelid_estructuraFK_IdEstructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructuraFK_IdEstructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructuraFK_IdEstructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEstructura= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdNumeroPatronalEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdNumeroPatronalEstructura.setToolTipText("Buscar Por Numero Patronal ");
		this.jButtonFK_IdNumeroPatronalEstructura= new JButtonMe();
		this.jButtonFK_IdNumeroPatronalEstructura.setText("Buscar");
		this.jButtonFK_IdNumeroPatronalEstructura.setToolTipText("Buscar Por Numero Patronal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdNumeroPatronalEstructura,"buscar_button","Buscar Por Numero Patronal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdNumeroPatronalEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_numero_patronalFK_IdNumeroPatronalEstructura = new JLabelMe();
		jLabelid_numero_patronalFK_IdNumeroPatronalEstructura.setText("Numero Patronal :");
		jLabelid_numero_patronalFK_IdNumeroPatronalEstructura.setToolTipText("Numero Patronal");
		jLabelid_numero_patronalFK_IdNumeroPatronalEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalFK_IdNumeroPatronalEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalFK_IdNumeroPatronalEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalFK_IdNumeroPatronalEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_numero_patronalFK_IdNumeroPatronalEstructura= new JComboBoxMe();
		jComboBoxid_numero_patronalFK_IdNumeroPatronalEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalFK_IdNumeroPatronalEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalFK_IdNumeroPatronalEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalFK_IdNumeroPatronalEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisEstructura.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisEstructura= new JButtonMe();
		this.jButtonFK_IdPaisEstructura.setText("Buscar");
		this.jButtonFK_IdPaisEstructura.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisEstructura,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisEstructura = new JLabelMe();
		jLabelid_paisFK_IdPaisEstructura.setText("Pais :");
		jLabelid_paisFK_IdPaisEstructura.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisEstructura= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoEstructuraEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoEstructuraEstructura.setToolTipText("Buscar Por Tipo Estructura ");
		this.jButtonFK_IdTipoEstructuraEstructura= new JButtonMe();
		this.jButtonFK_IdTipoEstructuraEstructura.setText("Buscar");
		this.jButtonFK_IdTipoEstructuraEstructura.setToolTipText("Buscar Por Tipo Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoEstructuraEstructura,"buscar_button","Buscar Por Tipo Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoEstructuraEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura = new JLabelMe();
		jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura.setText("Tipo Estructura :");
		jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura.setToolTipText("Tipo Estructura");
		jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_estructuraFK_IdTipoEstructuraEstructura= new JComboBoxMe();
		jComboBoxid_tipo_estructuraFK_IdTipoEstructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_estructuraFK_IdTipoEstructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_estructuraFK_IdTipoEstructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_estructuraFK_IdTipoEstructuraEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPago_NMEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPago_NMEstructura.setToolTipText("Buscar Por Tipo Pago_ N M ");
		this.jButtonFK_IdTipoPago_NMEstructura= new JButtonMe();
		this.jButtonFK_IdTipoPago_NMEstructura.setText("Buscar");
		this.jButtonFK_IdTipoPago_NMEstructura.setToolTipText("Buscar Por Tipo Pago_ N M ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPago_NMEstructura,"buscar_button","Buscar Por Tipo Pago_ N M ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPago_NMEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura = new JLabelMe();
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setText("Tipo Pago_ N M :");
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setToolTipText("Tipo Pago_ N M");
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMEstructura= new JComboBoxMe();
		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMEstructura,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEstructura=new JTabbedPane();


		this.jTabbedPaneBusquedasEstructura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstructura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEstructura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEstructura = new EstructuraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estructura DATOS");
			this.jInternalFrameDetalleFormEstructura = new EstructuraDetalleFormJInternalFrame(jDesktopPane,this.estructuraSessionBean.getConGuardarRelaciones(),this.estructuraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstructura = null;//new EstructuraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstructura= new GridBagLayout();
		
		
		this.jTableDatosEstructura = new JTableMe();      
		
		String sToolTipEstructura="";
		sToolTipEstructura=EstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstructura+="(Nomina.Estructura)";
		}
		
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstructura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstructura.setToolTipText(sToolTipEstructura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstructura);
		this.jTableDatosEstructura.setAutoCreateRowSorter(true);
		this.jTableDatosEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstructura.setRowSelectionAllowed(true);
		this.jTableDatosEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstructura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstructura = new JButtonMe();
		this.jButtonDuplicarEstructura = new JButtonMe();
		this.jButtonCopiarEstructura = new JButtonMe();
		this.jButtonVerFormEstructura = new JButtonMe();
		this.jButtonNuevoRelacionesEstructura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstructura = new JButtonMe();
		this.jButtonCerrarEstructura = new JButtonMe();
		
		this.jScrollPanelDatosEstructura = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstructura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estructura";
		
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstructura.setToolTipText("Acciones");
        this.jPanelAccionesEstructura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstructura=new ReporteDinamicoJInternalFrame(EstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstructura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstructura=new ImportacionJInternalFrame(EstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstructura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstructura = new JButtonMe();
		
		this.jButtonAbrirOrderByEstructura.setText("Orden");
		this.jButtonAbrirOrderByEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstructura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstructura,false,this);
			
			//this.cargarOrderByEstructura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstructura,true,this);
			
			//this.cargarOrderByEstructura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstructura.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosEstructura.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosEstructura.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosEstructura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstructura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstructura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstructura.setText("Nuevo");
		this.jButtonDuplicarEstructura.setText("Duplicar");
		this.jButtonCopiarEstructura.setText("Copiar");
		this.jButtonVerFormEstructura.setText("Ver");
		this.jButtonNuevoRelacionesEstructura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstructura.setText("Guardar");
		this.jButtonCerrarEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstructura,"nuevo_button","Nuevo",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstructura,"duplicar_button","Duplicar",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstructura,"copiar_button","Copiar",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstructura,"ver_form","Ver",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstructura,"nuevorelaciones_button","Nuevo Rel",this.estructuraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstructura,"guardarcambiostabla_button","Guardar",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstructura,"cerrar_button","Salir",this.estructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstructura.setToolTipText("Nuevo"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstructura.setToolTipText("Duplicar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstructura.setToolTipText("Copiar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstructura.setToolTipText("Ver"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstructura.setToolTipText("Nuevo Rel"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstructura.setToolTipText("Guardar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstructura.setToolTipText("Salir"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstructura";
		inputMap = this.jButtonNuevoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstructura"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstructura";
		inputMap = this.jButtonDuplicarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstructura"));
		
		//COPIAR
		sMapKey = "CopiarEstructura";
		inputMap = this.jButtonCopiarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstructura"));
		
		//VEr FORM
		sMapKey = "VerFormEstructura";
		inputMap = this.jButtonVerFormEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstructura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstructura";
		inputMap = this.jButtonNuevoRelacionesEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstructura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstructura";
		inputMap = this.jButtonModificarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstructura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstructura";
		inputMap = this.jButtonCerrarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstructura";
		inputMap = this.jButtonGuardarCambiosTablaEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstructura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Estructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Estructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Estructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Estructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Estructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstructura.setName("jPanelParametrosReportesEstructura"); 
		
		this.jPanelParametrosReportesAccionesEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstructura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstructura.setName("jPanelParametrosReportesAccionesEstructura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstructura = new JButtonMe();
		this.jButtonRecargarInformacionEstructura.setText("Recargar");
		this.jButtonRecargarInformacionEstructura.setToolTipText("Recargar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstructura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstructura = new JButtonMe();
		this.jButtonProcesarInformacionEstructura.setText("Procesar");
		this.jButtonProcesarInformacionEstructura.setToolTipText("Procesar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstructura.setVisible(false);
			
		this.jButtonProcesarInformacionEstructura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstructura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstructura.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolEstructura = new JButtonMe();
		this.jButtonArbolEstructura.setText("Arbol");		
		this.jButtonArbolEstructura.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstructura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstructura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstructura.setText("TIPO");       
		this.jComboBoxTiposReportesEstructura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstructura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstructura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstructura.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstructura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstructura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstructura.setText("Accion");
		this.jComboBoxTiposRelacionesEstructura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstructura.setText("Accion");
		this.jComboBoxTiposAccionesEstructura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstructura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstructura.setText("Accion");
		this.jComboBoxTiposSeleccionarEstructura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstructura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstructura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstructura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstructura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstructura = new JLabelMe();
		
		this.jLabelAccionesEstructura.setText("Acciones");		
		this.jLabelAccionesEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstructura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstructura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstructura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstructura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstructura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstructura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstructura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstructura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstructura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstructura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstructura.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstructura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstructura = new JButtonMe();
		//this.jButtonAnterioresEstructura.setText("<<");
        this.jButtonAnterioresEstructura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstructura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstructura = new JButtonMe();
		//this.jButtonSiguientesEstructura.setText(">>");
        this.jButtonSiguientesEstructura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstructura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstructura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstructura.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstructura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstructura,"nuevoguardarcambios_button","Nue",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstructura";
		inputMap = this.jButtonNuevoGuardarCambiosEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstructura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstructura";
		inputMap = this.jButtonRecargarInformacionEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstructura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstructura";
		inputMap = this.jButtonSiguientesEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstructura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstructura";
		inputMap = this.jButtonAnterioresEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstructura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstructura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstructura.setMinimumSize(new Dimension(this.getWidth(),EstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstructura.setMaximumSize(new Dimension(this.getWidth(),EstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstructura.setPreferredSize(new Dimension(this.getWidth(),EstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstructura = new GridBagLayout();

			this.jPanelPaginacionEstructura.setLayout(gridaBagLayoutPaginacionEstructura);						
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = 0;
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstructura.add(this.jButtonAnterioresEstructura, this.gridBagConstraintsEstructura);
					
						
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstructura.gridy = 0;
			
			this.jPanelPaginacionEstructura.add(this.jButtonNuevoGuardarCambiosEstructura, this.gridBagConstraintsEstructura);
						
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstructura.gridy = 0;
			this.jPanelPaginacionEstructura.add(this.jButtonSiguientesEstructura, this.gridBagConstraintsEstructura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = 1;
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstructura.add(this.jButtonNuevoEstructura, this.gridBagConstraintsEstructura);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstructura = new GridBagConstraints();
				this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstructura.gridy = 1;
				this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstructura.add(this.jButtonNuevoRelacionesEstructura, this.gridBagConstraintsEstructura);
			}
			
			
			if(!this.estructuraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstructura = new GridBagConstraints();
				this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstructura.gridy = 1;
				this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstructura.add(this.jButtonGuardarCambiosTablaEstructura, this.gridBagConstraintsEstructura);
			}
			
			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = 1;
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstructura.add(this.jButtonDuplicarEstructura, this.gridBagConstraintsEstructura);
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = 1;
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstructura.add(this.jButtonCopiarEstructura, this.gridBagConstraintsEstructura);
		
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = 1;
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstructura.add(this.jButtonVerFormEstructura, this.gridBagConstraintsEstructura);
		
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = 1;
			this.gridBagConstraintsEstructura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstructura.add(this.jButtonCerrarEstructura, this.gridBagConstraintsEstructura);
		
		
		
		this.jButtonRecargarInformacionEstructura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstructura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstructura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolEstructura.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolEstructura.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolEstructura.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstructura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstructura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstructura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstructura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstructura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstructura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstructura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstructura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstructura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstructura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstructura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstructura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstructura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstructura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstructura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstructura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Estructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Estructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Estructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Estructura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstructura.setLayout(gridaBagParametrosReportesEstructura);
			this.jPanelParametrosReportesAccionesEstructura.setLayout(gridaBagParametrosReportesAccionesEstructura);
			
			
			this.jPanelParametrosAuxiliar1Estructura.setLayout(gridaBagParametrosAuxiliar1Estructura);
			this.jPanelParametrosAuxiliar2Estructura.setLayout(gridaBagParametrosAuxiliar2Estructura);
			this.jPanelParametrosAuxiliar3Estructura.setLayout(gridaBagParametrosAuxiliar3Estructura);
			this.jPanelParametrosAuxiliar4Estructura.setLayout(gridaBagParametrosAuxiliar4Estructura);
			//this.jPanelParametrosAuxiliar5Estructura.setLayout(gridaBagParametrosAuxiliar2Estructura);			
			
			
			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstructura.add(this.jButtonRecargarInformacionEstructura, this.gridBagConstraintsEstructura);			
			
			

			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstructura.add(this.jButtonArbolEstructura, this.gridBagConstraintsEstructura);
			
			
			
			//PAGINACION
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Estructura.add(this.jComboBoxTiposPaginacionEstructura, this.gridBagConstraintsEstructura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Estructura.add(this.jCheckBoxConAltoMaximoTablaEstructura, this.gridBagConstraintsEstructura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Estructura.add(this.jComboBoxTiposArchivosReportesEstructura, this.gridBagConstraintsEstructura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstructura.add(this.jPanelParametrosAuxiliar1Estructura, this.gridBagConstraintsEstructura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Estructura.add(this.jComboBoxTiposReportesEstructura, this.gridBagConstraintsEstructura);																		
			
			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Estructura.add(this.jComboBoxTiposGraficosReportesEstructura, this.gridBagConstraintsEstructura);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstructura.add(this.jPanelParametrosAuxiliar4Estructura, this.gridBagConstraintsEstructura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstructura.add(this.jComboBoxTiposReportesEstructura, this.gridBagConstraintsEstructura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstructura.add(this.jCheckBoxGenerarReporteEstructura, this.gridBagConstraintsEstructura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstructura.add(this.jPanelParametrosAuxiliar2Estructura, this.gridBagConstraintsEstructura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstructura.add(this.jLabelAccionesEstructura, this.gridBagConstraintsEstructura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstructura = new GridBagConstraints();
				this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstructura.add(this.jButtonAbrirOrderByEstructura, this.gridBagConstraintsEstructura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstructura.add(this.jComboBoxTiposSeleccionarEstructura, this.gridBagConstraintsEstructura);			
			
			
			/*
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstructura.add(this.jCheckBoxSeleccionarTodosEstructura, this.gridBagConstraintsEstructura);
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstructura.add(this.jCheckBoxConGraficoReporteEstructura, this.gridBagConstraintsEstructura);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Estructura.add(this.jCheckBoxSeleccionarTodosEstructura, this.gridBagConstraintsEstructura);															
				
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Estructura.add(this.jCheckBoxSeleccionadosEstructura, this.gridBagConstraintsEstructura);															
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Estructura.add(this.jCheckBoxConGraficoReporteEstructura, this.gridBagConstraintsEstructura);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstructura.add(this.jPanelParametrosAuxiliar3Estructura, this.gridBagConstraintsEstructura);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstructura.add(this.jComboBoxTiposRelacionesEstructura, this.gridBagConstraintsEstructura);
				
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstructura.add(this.jComboBoxTiposAccionesEstructura, this.gridBagConstraintsEstructura);
	
				
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstructura.add(this.jTextFieldValorCampoGeneralEstructura, this.gridBagConstraintsEstructura);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstructura = new GridBagLayout();

			this.jScrollPanelDatosEstructura.setLayout(gridaBagLayoutDatosEstructura);
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = 0;
			this.gridBagConstraintsEstructura.gridx = 0;
			
			this.jScrollPanelDatosEstructura.add(this.jTableDatosEstructura, this.gridBagConstraintsEstructura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstructura.setViewportView(this.jTableDatosEstructura);
		this.jTableDatosEstructura.setFillsViewportHeight(true);
		this.jTableDatosEstructura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstructura= new GridBagLayout();
		this.jPanelAccionesEstructura.setLayout(gridaBagLayoutAccionesEstructura);
		
		
		/*	
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 0;
			
		this.jPanelAccionesEstructura.add(this.jButtonNuevoEstructura, this.gridBagConstraintsEstructura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadEstructura.setLayout(gridaBagLayoutFK_IdCiudadEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdCiudadEstructura.add(jLabelid_ciudadFK_IdCiudadEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 1;
		jPanelFK_IdCiudadEstructura.add(jComboBoxid_ciudadFK_IdCiudadEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 1;
		gridBagConstraintsEstructura.gridx =1;
		jPanelFK_IdCiudadEstructura.add(jButtonFK_IdCiudadEstructura, gridBagConstraintsEstructura);

		jTabbedPaneBusquedasEstructura.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadEstructura);
		jTabbedPaneBusquedasEstructura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableEstructura.setLayout(gridaBagLayoutFK_IdCuentaContableEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdCuentaContableEstructura.add(jLabelid_cuenta_contableFK_IdCuentaContableEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 1;
		jPanelFK_IdCuentaContableEstructura.add(jComboBoxid_cuenta_contableFK_IdCuentaContableEstructura, gridBagConstraintsEstructura);


		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdCuentaContableEstructura.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 1;
		gridBagConstraintsEstructura.gridx =1;
		jPanelFK_IdCuentaContableEstructura.add(jButtonFK_IdCuentaContableEstructura, gridBagConstraintsEstructura);

		jTabbedPaneBusquedasEstructura.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContableEstructura);
		jTabbedPaneBusquedasEstructura.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEstructura.setLayout(gridaBagLayoutFK_IdEstructuraEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdEstructuraEstructura.add(jLabelid_estructuraFK_IdEstructuraEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 1;
		jPanelFK_IdEstructuraEstructura.add(jComboBoxid_estructuraFK_IdEstructuraEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 1;
		gridBagConstraintsEstructura.gridx =1;
		jPanelFK_IdEstructuraEstructura.add(jButtonFK_IdEstructuraEstructura, gridBagConstraintsEstructura);

		jTabbedPaneBusquedasEstructura.addTab("3.-Por Estructura Padre ", jPanelFK_IdEstructuraEstructura);
		jTabbedPaneBusquedasEstructura.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdNumeroPatronalEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdNumeroPatronalEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdNumeroPatronalEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdNumeroPatronalEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdNumeroPatronalEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdNumeroPatronalEstructura.setLayout(gridaBagLayoutFK_IdNumeroPatronalEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdNumeroPatronalEstructura.add(jLabelid_numero_patronalFK_IdNumeroPatronalEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 1;
		jPanelFK_IdNumeroPatronalEstructura.add(jComboBoxid_numero_patronalFK_IdNumeroPatronalEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 1;
		gridBagConstraintsEstructura.gridx =1;
		jPanelFK_IdNumeroPatronalEstructura.add(jButtonFK_IdNumeroPatronalEstructura, gridBagConstraintsEstructura);

		jTabbedPaneBusquedasEstructura.addTab("4.-Por Numero Patronal ", jPanelFK_IdNumeroPatronalEstructura);
		jTabbedPaneBusquedasEstructura.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdPaisEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdPaisEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisEstructura.setLayout(gridaBagLayoutFK_IdPaisEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdPaisEstructura.add(jLabelid_paisFK_IdPaisEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 1;
		jPanelFK_IdPaisEstructura.add(jComboBoxid_paisFK_IdPaisEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 1;
		gridBagConstraintsEstructura.gridx =1;
		jPanelFK_IdPaisEstructura.add(jButtonFK_IdPaisEstructura, gridBagConstraintsEstructura);

		jTabbedPaneBusquedasEstructura.addTab("5.-Por Pais ", jPanelFK_IdPaisEstructura);
		jTabbedPaneBusquedasEstructura.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoEstructuraEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdTipoEstructuraEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoEstructuraEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoEstructuraEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoEstructuraEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoEstructuraEstructura.setLayout(gridaBagLayoutFK_IdTipoEstructuraEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdTipoEstructuraEstructura.add(jLabelid_tipo_estructuraFK_IdTipoEstructuraEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 1;
		jPanelFK_IdTipoEstructuraEstructura.add(jComboBoxid_tipo_estructuraFK_IdTipoEstructuraEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 1;
		gridBagConstraintsEstructura.gridx =1;
		jPanelFK_IdTipoEstructuraEstructura.add(jButtonFK_IdTipoEstructuraEstructura, gridBagConstraintsEstructura);

		jTabbedPaneBusquedasEstructura.addTab("6.-Por Tipo Estructura ", jPanelFK_IdTipoEstructuraEstructura);
		jTabbedPaneBusquedasEstructura.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoPago_NMEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPago_NMEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPago_NMEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPago_NMEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPago_NMEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPago_NMEstructura.setLayout(gridaBagLayoutFK_IdTipoPago_NMEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 0;
		jPanelFK_IdTipoPago_NMEstructura.add(jLabelid_tipo_pago__n_mFK_IdTipoPago_NMEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 0;
		gridBagConstraintsEstructura.gridx = 1;
		jPanelFK_IdTipoPago_NMEstructura.add(jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMEstructura, gridBagConstraintsEstructura);

		gridBagConstraintsEstructura = new GridBagConstraints();
		gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEstructura.gridy = 1;
		gridBagConstraintsEstructura.gridx =1;
		jPanelFK_IdTipoPago_NMEstructura.add(jButtonFK_IdTipoPago_NMEstructura, gridBagConstraintsEstructura);

		jTabbedPaneBusquedasEstructura.addTab("7.-Por Tipo Pago_ N M ", jPanelFK_IdTipoPago_NMEstructura);
		jTabbedPaneBusquedasEstructura.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstructura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstructura = new GridBagConstraints();						
			this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstructura.gridx = 0;		
			//this.gridBagConstraintsEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstructura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstructura, this.gridBagConstraintsEstructura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstructura.gridx = 0;		
		//this.gridBagConstraintsEstructura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstructura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstructura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstructura.gridx = 0;		
			this.gridBagConstraintsEstructura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEstructura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEstructura, this.gridBagConstraintsEstructura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstructura, this.gridBagConstraintsEstructura);								
		
		
		/*
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstructura, this.gridBagConstraintsEstructura);
		*/		
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstructura.gridx =0;
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstructura, this.gridBagConstraintsEstructura);
				
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstructura, this.gridBagConstraintsEstructura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeEstructura = new EstructuraBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeEstructura.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeEstructura.setTitle("Estructura ARBOL");
		this.jInternalFrameTreeEstructura.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estructura Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeEstructura.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeEstructura.setResizable(true);
	    this.jInternalFrameTreeEstructura.setClosable(true);
	    this.jInternalFrameTreeEstructura.setMaximizable(true);
			
			
		if(EstructuraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstructura = new GridBagLayout();
			this.jPanelBusquedasParametrosEstructura.setLayout(gridaBagLayoutBusquedasParametrosEstructura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstructura, this.gridBagConstraintsEstructura);
			
			
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstructura, this.gridBagConstraintsEstructura);
		
			
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstructura, this.gridBagConstraintsEstructura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstructura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstructura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstructura.setName("jPanelReporteDinamicoEstructura"); 
		
		this.jPanelReporteDinamicoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstructura.setLayout(gridaBagLayoutReporteDinamicoEstructura);
		
		
		this.jInternalFrameReporteDinamicoEstructura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstructura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstructura.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstructura.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstructura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estructuras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstructura = new JLabelMe();

		this.jLabelColumnasSelectReporteEstructura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstructura.add(this.jLabelColumnasSelectReporteEstructura, this.gridBagConstraintsEstructura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstructura = new JList<Reporte>();
		this.jListColumnasSelectReporteEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstructura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstructura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstructura=new JScrollPane(this.jListColumnasSelectReporteEstructura);
			
			this.jScrollColumnasSelectReporteEstructura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstructura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstructura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstructura.add(this.jListColumnasSelectReporteEstructura, this.gridBagConstraintsEstructura);
		this.jPanelReporteDinamicoEstructura.add(this.jScrollColumnasSelectReporteEstructura, this.gridBagConstraintsEstructura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstructura = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstructura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstructura.add(this.jLabelRelacionesSelectReporteEstructura, this.gridBagConstraintsEstructura);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstructura = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstructura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstructura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstructura=new JScrollPane(this.jListRelacionesSelectReporteEstructura);
			
			this.jScrollRelacionesSelectReporteEstructura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstructura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstructura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstructura.add(this.jListRelacionesSelectReporteEstructura, this.gridBagConstraintsEstructura);
		this.jPanelReporteDinamicoEstructura.add(this.jScrollRelacionesSelectReporteEstructura, this.gridBagConstraintsEstructura);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstructura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstructura = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstructura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstructura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEstructura = new JLabelMe();

		this.jLabelConGraficoDinamicoEstructura.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstructura.add(this.jLabelConGraficoDinamicoEstructura, this.gridBagConstraintsEstructura);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEstructura = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEstructura.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEstructura.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEstructura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstructura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEstructura.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstructura.add(this.jCheckBoxConGraficoDinamicoEstructura, this.gridBagConstraintsEstructura);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEstructura = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEstructura.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstructura.add(this.jLabelColumnaCategoriaGraficoEstructura, this.gridBagConstraintsEstructura);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEstructura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstructura.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEstructura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEstructura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEstructura.add(this.jComboBoxColumnaCategoriaGraficoEstructura, this.gridBagConstraintsEstructura);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEstructura = new JLabelMe();

		this.jLabelColumnaCategoriaValorEstructura.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstructura.add(this.jLabelColumnaCategoriaValorEstructura, this.gridBagConstraintsEstructura);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEstructura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEstructura.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEstructura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEstructura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEstructura.add(this.jComboBoxColumnaCategoriaValorEstructura, this.gridBagConstraintsEstructura);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEstructura = new JLabelMe();

		this.jLabelColumnasValoresGraficoEstructura.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstructura.add(this.jLabelColumnasValoresGraficoEstructura, this.gridBagConstraintsEstructura);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEstructura = new JList<Reporte>();
		this.jListColumnasValoresGraficoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEstructura.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEstructura=new JScrollPane(this.jListColumnasValoresGraficoEstructura);
			
			this.jScrollColumnasValoresGraficoEstructura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstructura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEstructura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEstructura.add(this.jListColumnasSelectReporteEstructura, this.gridBagConstraintsEstructura);
		this.jPanelReporteDinamicoEstructura.add(this.jScrollColumnasValoresGraficoEstructura, this.gridBagConstraintsEstructura);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEstructura = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEstructura.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstructura.add(this.jLabelTiposGraficosReportesDinamicoEstructura, this.gridBagConstraintsEstructura);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEstructura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEstructura.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEstructura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEstructura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstructura.add(this.jComboBoxTiposGraficosReportesDinamicoEstructura, this.gridBagConstraintsEstructura);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstructura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstructura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstructura.add(this.jLabelGenerarExcelReporteDinamicoEstructura, this.gridBagConstraintsEstructura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstructura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstructura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstructura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstructura.setToolTipText("Generar EXCEL"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstructura.add(this.jButtonGenerarExcelReporteDinamicoEstructura, this.gridBagConstraintsEstructura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstructura.add(this.jComboBoxTiposReportesDinamicoEstructura, this.gridBagConstraintsEstructura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstructura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstructura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstructura.add(this.jLabelTiposArchivoReporteDinamicoEstructura, this.gridBagConstraintsEstructura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstructura.add(this.jComboBoxTiposArchivosReportesDinamicoEstructura, this.gridBagConstraintsEstructura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstructura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstructura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstructura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstructura.setToolTipText("Generar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstructura.add(this.jButtonGenerarReporteDinamicoEstructura, this.gridBagConstraintsEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstructura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstructura.setToolTipText("Cancelar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstructura.add(this.jButtonCerrarReporteDinamicoEstructura, this.gridBagConstraintsEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstructura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstructura= new JScrollPane(jPanelReporteDinamicoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estructuras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstructura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstructura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstructura);
		this.jInternalFrameReporteDinamicoEstructura.getContentPane().add(this.jScrollPanelReporteDinamicoEstructura, this.gridBagConstraintsEstructura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstructura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstructura.setName("jPanelImportacionEstructura"); 
		
		this.jPanelImportacionEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstructura.setLayout(gridaBagLayoutImportacionEstructura);
		
		
		this.jInternalFrameImportacionEstructura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstructura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstructura.setResizable(true);
	    this.jInternalFrameImportacionEstructura.setClosable(true);
	    this.jInternalFrameImportacionEstructura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstructura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstructura.setResizable(true);
	    this.jInternalFrameImportacionEstructura.setClosable(true);
	    this.jInternalFrameImportacionEstructura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estructuras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstructura = new JLabelMe();

		this.jLabelArchivoImportacionEstructura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstructura.add(this.jLabelArchivoImportacionEstructura, this.gridBagConstraintsEstructura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstructura = new JFileChooser();		
		this.jFileChooserImportacionEstructura.setToolTipText("ESCOGER ARCHIVO"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstructura = new JButtonMe();
		this.jButtonAbrirImportacionEstructura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstructura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstructura.setToolTipText("Generar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstructura.add(this.jButtonAbrirImportacionEstructura, this.gridBagConstraintsEstructura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstructura = new JLabelMe();

		this.jLabelPathArchivoImportacionEstructura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstructura.add(this.jLabelPathArchivoImportacionEstructura, this.gridBagConstraintsEstructura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstructura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstructura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstructura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstructura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstructura.add(this.jTextFieldPathArchivoImportacionEstructura, this.gridBagConstraintsEstructura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstructura = new JButtonMe();
		this.jButtonGenerarImportacionEstructura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstructura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstructura.setToolTipText("Generar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstructura.add(this.jButtonGenerarImportacionEstructura, this.gridBagConstraintsEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstructura = new JButtonMe();
		this.jButtonCerrarImportacionEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstructura.setToolTipText("Cancelar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstructura.add(this.jButtonCerrarImportacionEstructura, this.gridBagConstraintsEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstructura = new GridBagLayout();
		
		this.jScrollPanelImportacionEstructura= new JScrollPane(jPanelImportacionEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy =iPosYImportacion;
		this.gridBagConstraintsEstructura.gridx =iPosXImportacion;
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstructura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstructura);
		this.jInternalFrameImportacionEstructura.getContentPane().add(this.jScrollPanelImportacionEstructura, this.gridBagConstraintsEstructura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstructura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstructura = new JButtonMe();
			this.jButtonAbrirOrderByEstructura.setText("Orden");
			this.jButtonAbrirOrderByEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstructura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstructura";
			inputMap = this.jButtonAbrirOrderByEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstructura"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstructura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstructura.setName("jPanelOrderByEstructura"); 
			
			this.jPanelOrderByEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstructura.setLayout(gridaBagLayoutOrderByEstructura);
			
			
			this.jTableDatosEstructuraOrderBy = new JTableMe();        
			this.jTableDatosEstructuraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstructuraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstructuraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstructuraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstructuraOrderBy.setViewportView(this.jTableDatosEstructuraOrderBy);
			this.jTableDatosEstructuraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstructuraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstructura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstructura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstructura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstructura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstructura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstructura.setTitle("Orden");
			this.jInternalFrameOrderByEstructura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstructura.setResizable(true);
			this.jInternalFrameOrderByEstructura.setClosable(true);
			this.jInternalFrameOrderByEstructura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estructuras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstructura.ipady =150;
				
			this.jPanelOrderByEstructura.add(jScrollPanelDatosEstructuraOrderBy, this.gridBagConstraintsEstructura);//this.jTableDatosEstructuraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstructura = new JButtonMe();
			this.jButtonCerrarOrderByEstructura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstructura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstructura.setToolTipText("Cancelar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstructura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstructura.add(this.jButtonCerrarOrderByEstructura, this.gridBagConstraintsEstructura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstructura = new GridBagLayout();
			
			this.jScrollPanelOrderByEstructura= new JScrollPane(jPanelOrderByEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstructura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstructura);
			
			this.jInternalFrameOrderByEstructura.getContentPane().add(this.jScrollPanelOrderByEstructura, this.gridBagConstraintsEstructura);			
		
		} else {
			this.jButtonAbrirOrderByEstructura = new JButtonMe();
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
		int iWidthTableCalculado=0;//6030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=2300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estructuraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstructura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstructura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstructura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstructura.getRowHeight();//EstructuraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstructura.isSelected()) {
					iHeightTable=EstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstructura.isSelected()) {
					iHeightTable=EstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstructura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstructura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstructura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstructura!=null && this.jInternalFrameOrderByEstructura.getjTableDatosOrderBy()!=null) {
			//if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstructura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstructura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstructura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstructura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstructura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstructura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstructura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estructuraLogic.getEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estructuras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Estructura> TraerEstructuraBeans(List<Estructura> estructuras,ArrayList<Classe> classes)throws Exception {
		try {
			for(Estructura estructura:estructuras) {
					
				if(!(EstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estructura.setsDetalleGeneralEntityReporte(EstructuraConstantesFunciones.getEstructuraDescripcion(estructura));
										
					estructura.setes_jefe_descripcion(EstructuraConstantesFunciones.getes_jefeDescripcion(estructura));estructura.setes_anual_descripcion(EstructuraConstantesFunciones.getes_anualDescripcion(estructura));	
					
					

					if(estructura.getCentroCostoEstructuras()!=null && Funciones.existeClass(classes,CentroCostoEstructura.class)) {
						try{estructura.setcentrocostoestructurasDescripcionReporte(new JRBeanCollectionDataSource(CentroCostoEstructuraJInternalFrame.TraerCentroCostoEstructuraBeans(estructura.getCentroCostoEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getPlaniVacacionCargos()!=null && Funciones.existeClass(classes,PlaniVacacion.class)) {
						try{estructura.setplanivacacionCargosDescripcionReporte(new JRBeanCollectionDataSource(PlaniVacacionJInternalFrame.TraerPlaniVacacionBeans(estructura.getPlaniVacacionCargos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getAsistenciaMensuals()!=null && Funciones.existeClass(classes,AsistenciaMensual.class)) {
						try{estructura.setasistenciamensualsDescripcionReporte(new JRBeanCollectionDataSource(AsistenciaMensualJInternalFrame.TraerAsistenciaMensualBeans(estructura.getAsistenciaMensuals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEmpleadoProcesoRubros()!=null && Funciones.existeClass(classes,EmpleadoProcesoRubro.class)) {
						try{estructura.setempleadoprocesorubrosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoProcesoRubroJInternalFrame.TraerEmpleadoProcesoRubroBeans(estructura.getEmpleadoProcesoRubros(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEmpleadoPagoRubros()!=null && Funciones.existeClass(classes,EmpleadoPagoRubro.class)) {
						try{estructura.setempleadopagorubrosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoPagoRubroJInternalFrame.TraerEmpleadoPagoRubroBeans(estructura.getEmpleadoPagoRubros(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getProvisionEmpleados()!=null && Funciones.existeClass(classes,ProvisionEmpleado.class)) {
						try{estructura.setprovisionempleadosDescripcionReporte(new JRBeanCollectionDataSource(ProvisionEmpleadoJInternalFrame.TraerProvisionEmpleadoBeans(estructura.getProvisionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{estructura.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(estructura.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEstructuras()!=null && Funciones.existeClass(classes,Estructura.class)) {
						try{estructura.setestructurasDescripcionReporte(new JRBeanCollectionDataSource(EstructuraJInternalFrame.TraerEstructuraBeans(estructura.getEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEvaluacionEmpleados()!=null && Funciones.existeClass(classes,EvaluacionEmpleado.class)) {
						try{estructura.setevaluacionempleadosDescripcionReporte(new JRBeanCollectionDataSource(EvaluacionEmpleadoJInternalFrame.TraerEvaluacionEmpleadoBeans(estructura.getEvaluacionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEmpleadoImpuestoRentas()!=null && Funciones.existeClass(classes,EmpleadoImpuestoRenta.class)) {
						try{estructura.setempleadoimpuestorentasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoImpuestoRentaJInternalFrame.TraerEmpleadoImpuestoRentaBeans(estructura.getEmpleadoImpuestoRentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getRubroEstructuras()!=null && Funciones.existeClass(classes,RubroEstructura.class)) {
						try{estructura.setrubroestructurasDescripcionReporte(new JRBeanCollectionDataSource(RubroEstructuraJInternalFrame.TraerRubroEstructuraBeans(estructura.getRubroEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getCierreRolMensuals()!=null && Funciones.existeClass(classes,CierreRolMensual.class)) {
						try{estructura.setcierrerolmensualsDescripcionReporte(new JRBeanCollectionDataSource(CierreRolMensualJInternalFrame.TraerCierreRolMensualBeans(estructura.getCierreRolMensuals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getFormatoNomis()!=null && Funciones.existeClass(classes,FormatoNomi.class)) {
						try{estructura.setformatonomisDescripcionReporte(new JRBeanCollectionDataSource(FormatoNomiJInternalFrame.TraerFormatoNomiBeans(estructura.getFormatoNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEmpleadoEstructuras()!=null && Funciones.existeClass(classes,EmpleadoEstructura.class)) {
						try{estructura.setempleadoestructurasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoEstructuraJInternalFrame.TraerEmpleadoEstructuraBeans(estructura.getEmpleadoEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getHistorialPagoNomis()!=null && Funciones.existeClass(classes,HistorialPagoNomi.class)) {
						try{estructura.sethistorialpagonomisDescripcionReporte(new JRBeanCollectionDataSource(HistorialPagoNomiJInternalFrame.TraerHistorialPagoNomiBeans(estructura.getHistorialPagoNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getAsistenciaDiarias()!=null && Funciones.existeClass(classes,AsistenciaDiaria.class)) {
						try{estructura.setasistenciadiariasDescripcionReporte(new JRBeanCollectionDataSource(AsistenciaDiariaJInternalFrame.TraerAsistenciaDiariaBeans(estructura.getAsistenciaDiarias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getFuncionEstrucs()!=null && Funciones.existeClass(classes,FuncionEstruc.class)) {
						try{estructura.setfuncionestrucsDescripcionReporte(new JRBeanCollectionDataSource(FuncionEstrucJInternalFrame.TraerFuncionEstrucBeans(estructura.getFuncionEstrucs(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getSolicitudReemplazos()!=null && Funciones.existeClass(classes,SolicitudReemplazo.class)) {
						try{estructura.setsolicitudreemplazosDescripcionReporte(new JRBeanCollectionDataSource(SolicitudReemplazoJInternalFrame.TraerSolicitudReemplazoBeans(estructura.getSolicitudReemplazos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getSolicitudHoraExtras()!=null && Funciones.existeClass(classes,SolicitudHoraExtra.class)) {
						try{estructura.setsolicitudhoraextrasDescripcionReporte(new JRBeanCollectionDataSource(SolicitudHoraExtraJInternalFrame.TraerSolicitudHoraExtraBeans(estructura.getSolicitudHoraExtras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getEvaluacionNomis()!=null && Funciones.existeClass(classes,EvaluacionNomi.class)) {
						try{estructura.setevaluacionnomisDescripcionReporte(new JRBeanCollectionDataSource(EvaluacionNomiJInternalFrame.TraerEvaluacionNomiBeans(estructura.getEvaluacionNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getSolicitudVacacions()!=null && Funciones.existeClass(classes,SolicitudVacacion.class)) {
						try{estructura.setsolicitudvacacionsDescripcionReporte(new JRBeanCollectionDataSource(SolicitudVacacionJInternalFrame.TraerSolicitudVacacionBeans(estructura.getSolicitudVacacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getResponsableActivoFijos()!=null && Funciones.existeClass(classes,ResponsableActivoFijo.class)) {
						try{estructura.setresponsableactivofijosDescripcionReporte(new JRBeanCollectionDataSource(ResponsableActivoFijoJInternalFrame.TraerResponsableActivoFijoBeans(estructura.getResponsableActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estructura.getRubroEmpleaCuentaContables()!=null && Funciones.existeClass(classes,RubroEmpleaCuentaContable.class)) {
						try{estructura.setrubroempleacuentacontablesDescripcionReporte(new JRBeanCollectionDataSource(RubroEmpleaCuentaContableJInternalFrame.TraerRubroEmpleaCuentaContableBeans(estructura.getRubroEmpleaCuentaContables(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estructura.setsDetalleGeneralEntityReporte(estructura.getsDetalleGeneralEntityReporte());
										
				}
				
				//estructurabeans.add(estructurabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estructuras;
    }
	//PARA REPORTES FIN
}
