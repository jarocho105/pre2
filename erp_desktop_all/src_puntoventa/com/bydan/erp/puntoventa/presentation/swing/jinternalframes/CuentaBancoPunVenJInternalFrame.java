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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CuentaBancoPunVenConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class CuentaBancoPunVenJInternalFrame extends CuentaBancoPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaBancoPunVen;
	
	protected JMenuBar jmenuBarCuentaBancoPunVen;
	
	protected JMenu jmenuCuentaBancoPunVen;
	protected JMenu jmenuDatosCuentaBancoPunVen;
	protected JMenu jmenuArchivoCuentaBancoPunVen;
	protected JMenu jmenuAccionesCuentaBancoPunVen;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaBancoPunVen;	
	protected GridBagConstraints gridBagConstraintsCuentaBancoPunVen;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaBancoPunVenDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaBancoPunVen;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaBancoPunVen;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaBancoPunVen;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BancoSessionBean bancoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaBancoPunVen> cuentabancopunvens;		
	public List<CuentaBancoPunVen> cuentabancopunvensEliminados;	
	public List<CuentaBancoPunVen> cuentabancopunvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaBancoPunVen;		
	protected JButton jButtonAbrirOrderByCuentaBancoPunVen;
	
	
	//protected JPanel jPanelOrderByCuentaBancoPunVen;
	//public JScrollPane jScrollPanelOrderByCuentaBancoPunVen;	
	//protected JButton jButtonCerrarOrderByCuentaBancoPunVen;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaBancoPunVenLogic cuentabancopunvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaBancoPunVen;
	public JScrollPane jScrollPanelDatosEdicionCuentaBancoPunVen;
	public JScrollPane jScrollPanelDatosGeneralCuentaBancoPunVen;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaBancoPunVenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaBancoPunVen;
	//public JScrollPane jScrollPanelImportacionCuentaBancoPunVen;
	
	
	
	protected JPanel jPanelAccionesCuentaBancoPunVen;
	
    protected JPanel jPanelPaginacionCuentaBancoPunVen;
    protected JPanel jPanelParametrosReportesCuentaBancoPunVen;
	protected JPanel jPanelParametrosReportesAccionesCuentaBancoPunVen;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaBancoPunVen;
	protected JPanel jPanelParametrosAuxiliar2CuentaBancoPunVen;
	protected JPanel jPanelParametrosAuxiliar3CuentaBancoPunVen;
	protected JPanel jPanelParametrosAuxiliar4CuentaBancoPunVen;
	//protected JPanel jPanelParametrosAuxiliar5CuentaBancoPunVen;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaBancoPunVen;
	//protected JPanel jPanelImportacionCuentaBancoPunVen;
	
	
	public JTable jTableDatosCuentaBancoPunVen;
	
	
	
	//public JTable jTableDatosCuentaBancoPunVenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaBancoPunVen;
	protected JButton jButtonDuplicarCuentaBancoPunVen;
	protected JButton jButtonCopiarCuentaBancoPunVen;
	protected JButton jButtonVerFormCuentaBancoPunVen;
	protected JButton jButtonNuevoRelacionesCuentaBancoPunVen;
	protected JButton jButtonModificarCuentaBancoPunVen;
	
    protected JButton jButtonGuardarCambiosTablaCuentaBancoPunVen;
	protected JButton jButtonCerrarCuentaBancoPunVen;
	
	
	protected JButton jButtonRecargarInformacionCuentaBancoPunVen;
	protected JButton jButtonProcesarInformacionCuentaBancoPunVen;
	
	
	protected JButton jButtonAnterioresCuentaBancoPunVen;
	protected JButton jButtonSiguientesCuentaBancoPunVen;
	protected JButton jButtonNuevoGuardarCambiosCuentaBancoPunVen;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaBancoPunVen;
	//protected JButton jButtonCerrarReporteDinamicoCuentaBancoPunVen;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaBancoPunVen;
	//protected JButton jButtonGenerarImportacionCuentaBancoPunVen;
	//protected JButton jButtonCerrarImportacionCuentaBancoPunVen;
	//protected JFileChooser jFileChooserImportacionCuentaBancoPunVen;
	//protected File fileImportacionCuentaBancoPunVen;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaBancoPunVen;
	protected JButton jButtonDuplicarToolBarCuentaBancoPunVen;
	protected JButton jButtonNuevoRelacionesToolBarCuentaBancoPunVen;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaBancoPunVen;
	protected JButton jButtonCopiarToolBarCuentaBancoPunVen;
	protected JButton jButtonVerFormToolBarCuentaBancoPunVen;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaBancoPunVen;
	protected JButton jButtonCerrarToolBarCuentaBancoPunVen;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaBancoPunVen;
	protected JButton jButtonProcesarInformacionToolBarCuentaBancoPunVen;
	protected JButton jButtonAnterioresToolBarCuentaBancoPunVen;
	protected JButton jButtonSiguientesToolBarCuentaBancoPunVen;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaBancoPunVen;
	protected JButton jButtonAbrirOrderByToolBarCuentaBancoPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaBancoPunVen;
	protected JMenuItem jMenuItemDuplicarCuentaBancoPunVen;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaBancoPunVen;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaBancoPunVen;
	protected JMenuItem jMenuItemCopiarCuentaBancoPunVen;
	protected JMenuItem jMenuItemVerFormCuentaBancoPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaBancoPunVen;
	protected JMenuItem jMenuItemCerrarCuentaBancoPunVen;
	protected JMenuItem jMenuItemDetalleCerrarCuentaBancoPunVen;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaBancoPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaBancoPunVen;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaBancoPunVen;
	protected JMenuItem jMenuItemProcesarInformacionCuentaBancoPunVen;
	protected JMenuItem jMenuItemAnterioresCuentaBancoPunVen;
	protected JMenuItem jMenuItemSiguientesCuentaBancoPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaBancoPunVen;
	protected JMenuItem jMenuItemAbrirOrderByCuentaBancoPunVen;
	protected JMenuItem jMenuItemMostrarOcultarCuentaBancoPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaBancoPunVen;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaBancoPunVen;
	protected JCheckBox jCheckBoxSeleccionadosCuentaBancoPunVen;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaBancoPunVen;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaBancoPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaBancoPunVen;
	protected JTextField jTextFieldValorCampoGeneralCuentaBancoPunVen;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaBancoPunVen;
	//public JList<Reporte> jListColumnasSelectReporteCuentaBancoPunVen;
	//public JScrollPane jScrollColumnasSelectReporteCuentaBancoPunVen;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaBancoPunVen;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaBancoPunVen;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaBancoPunVen;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaBancoPunVen;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaBancoPunVen;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaBancoPunVen;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaBancoPunVen;
	
		
	//public JLabel jLabelArchivoImportacionCuentaBancoPunVen;	
	//public JLabel jLabelPathArchivoImportacionCuentaBancoPunVen;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaBancoPunVen;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaBancoPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaBancoPunVen;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaBancoPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaBancoPunVen;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaBancoPunVen;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaBancoPunVen;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaBancoPunVen;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaBancoPunVen;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaBancoPunVen;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaBancoPunVen;
	public JPanel jPanelFK_IdBancoCuentaBancoPunVen;
	public JButton jButtonFK_IdBancoCuentaBancoPunVen;
	public JPanel jPanelFK_IdClienteCuentaBancoPunVen;
	public JButton jButtonFK_IdClienteCuentaBancoPunVen;
	public JPanel jPanelFK_IdCuentaContableCuentaBancoPunVen;
	public JButton jButtonFK_IdCuentaContableCuentaBancoPunVen;
	
	public JPanel jPanelid_bancoFK_IdBancoCuentaBancoPunVen;
	public JLabel jLabelid_bancoFK_IdBancoCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen;
	public JButton jButtonid_bancoFK_IdBancoCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoCuentaBancoPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteCuentaBancoPunVen;
	public JLabel jLabelid_clienteFK_IdClienteCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen;
	public JButton jButtonid_clienteFK_IdClienteCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCuentaBancoPunVenBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVenArbol= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuentaBancoPunVenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoPunVenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoPunVenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoPunVenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaBancoPunVen)	{
		this.jButtonRecargarInformacionCuentaBancoPunVen = jButtonRecargarInformacionCuentaBancoPunVen;
	}
	
	public JButton getjButtonProcesarInformacionCuentaBancoPunVen() {
		return this.jButtonProcesarInformacionCuentaBancoPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaBancoPunVen)	{
		this.jButtonProcesarInformacionCuentaBancoPunVen = jButtonProcesarInformacionCuentaBancoPunVen;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaBancoPunVen() {
		return this.jButtonRecargarInformacionCuentaBancoPunVen;
	}
	
	
	public List<CuentaBancoPunVen> getcuentabancopunvens() {
		return this.cuentabancopunvens;
	}

	public void setcuentabancopunvens(List<CuentaBancoPunVen> cuentabancopunvens) {
		this.cuentabancopunvens = cuentabancopunvens;
	}
	
	public List<CuentaBancoPunVen> getcuentabancopunvensAux() {
		return this.cuentabancopunvensAux;
	}

	public void setcuentabancopunvensAux(List<CuentaBancoPunVen> cuentabancopunvensAux) {
		this.cuentabancopunvensAux = cuentabancopunvensAux;
	}
	
	public List<CuentaBancoPunVen> getcuentabancopunvensEliminados() {
		return this.cuentabancopunvensEliminados;
	}

	public void setCuentaBancoPunVensEliminados(List<CuentaBancoPunVen> cuentabancopunvensEliminados) {
		this.cuentabancopunvensEliminados = cuentabancopunvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaBancoPunVen() {
		return jComboBoxTiposSeleccionarCuentaBancoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaBancoPunVen(
			JComboBox jComboBoxTiposSeleccionarCuentaBancoPunVen) {
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen = jComboBoxTiposSeleccionarCuentaBancoPunVen;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaBancoPunVen() {
		return jTextFieldValorCampoGeneralCuentaBancoPunVen;
	}

	public void setjTextFieldValorCampoGeneralCuentaBancoPunVen(
			JTextField jTextFieldValorCampoGeneralCuentaBancoPunVen) {
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen = jTextFieldValorCampoGeneralCuentaBancoPunVen;
	}

	public void setBorderResaltarValorCampoGeneralCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaBancoPunVen() {
		return this.jCheckBoxSeleccionarTodosCuentaBancoPunVen;
	}

	public void setjCheckBoxSeleccionarTodosCuentaBancoPunVen(
			JCheckBox jCheckBoxSeleccionarTodosCuentaBancoPunVen) {
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen = jCheckBoxSeleccionarTodosCuentaBancoPunVen;
	}

	public void setBorderResaltarSeleccionarTodosCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaBancoPunVen() {
		return this.jCheckBoxSeleccionadosCuentaBancoPunVen;
	}

	public void setjCheckBoxSeleccionadosCuentaBancoPunVen(
			JCheckBox jCheckBoxSeleccionadosCuentaBancoPunVen) {
		this.jCheckBoxSeleccionadosCuentaBancoPunVen = jCheckBoxSeleccionadosCuentaBancoPunVen;
	}
	
	public void setBorderResaltarSeleccionadosCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaBancoPunVen() {
		return this.jComboBoxTiposArchivosReportesCuentaBancoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaBancoPunVen(
			JComboBox jComboBoxTiposArchivosReportesCuentaBancoPunVen) {
		this.jComboBoxTiposArchivosReportesCuentaBancoPunVen = jComboBoxTiposArchivosReportesCuentaBancoPunVen;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaBancoPunVen() {
		return this.jComboBoxTiposReportesCuentaBancoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaBancoPunVen(
			JComboBox jComboBoxTiposReportesCuentaBancoPunVen) {
		this.jComboBoxTiposReportesCuentaBancoPunVen = jComboBoxTiposReportesCuentaBancoPunVen;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaBancoPunVen() {
	//	return jComboBoxTiposReportesDinamicoCuentaBancoPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaBancoPunVen(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaBancoPunVen) {
	//	this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen = jComboBoxTiposReportesDinamicoCuentaBancoPunVen;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen = jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen;
	//}
	
	public void setBorderResaltarTiposReportesCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaBancoPunVen() {
		return this.jComboBoxTiposGraficosReportesCuentaBancoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaBancoPunVen(
			JComboBox jComboBoxTiposGraficosReportesCuentaBancoPunVen) {
		this.jComboBoxTiposGraficosReportesCuentaBancoPunVen = jComboBoxTiposGraficosReportesCuentaBancoPunVen;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaBancoPunVen() {
		return this.jComboBoxTiposPaginacionCuentaBancoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaBancoPunVen(
			JComboBox jComboBoxTiposPaginacionCuentaBancoPunVen) {
		this.jComboBoxTiposPaginacionCuentaBancoPunVen = jComboBoxTiposPaginacionCuentaBancoPunVen;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaBancoPunVen() {
		return this.jComboBoxTiposRelacionesCuentaBancoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaBancoPunVen() {
		return this.jComboBoxTiposAccionesCuentaBancoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaBancoPunVen(
			JComboBox jComboBoxTiposRelacionesCuentaBancoPunVen) {
		this.jComboBoxTiposRelacionesCuentaBancoPunVen = jComboBoxTiposRelacionesCuentaBancoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaBancoPunVen(
			JComboBox jComboBoxTiposAccionesCuentaBancoPunVen) {
		this.jComboBoxTiposAccionesCuentaBancoPunVen = jComboBoxTiposAccionesCuentaBancoPunVen;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaBancoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaBancoPunVen .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaBancoPunVen() {
	//	return jCheckBoxConGraficoDinamicoCuentaBancoPunVen;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaBancoPunVen(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaBancoPunVen) {
	//	this.jCheckBoxConGraficoDinamicoCuentaBancoPunVen = jCheckBoxConGraficoDinamicoCuentaBancoPunVen;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaBancoPunVen() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaBancoPunVen.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaBancoPunVen .setBorder(borderResaltar);		
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
		this.cuentabancopunvenSessionBean=new CuentaBancoPunVenSessionBean();
		
		this.cuentabancopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentabancopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentabancopunvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaBancoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaBancoPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaBancoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaBancoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaBancoPunVen= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"nuevo","nuevo","Nuevo"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"duplicar","duplicar","Duplicar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"copiar","copiar","Copiar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"ver_form","ver_form","Ver"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"recargar","recargar","Recargar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaBancoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaBancoPunVen,this.jTtoolBarCuentaBancoPunVen,
							"cerrar","cerrar","Salir"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaBancoPunVen=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaBancoPunVen;
			
				this.jButtonProcesarInformacionToolBarCuentaBancoPunVen=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaBancoPunVen;
				
		//protected JButton jButtonModificarToolBarCuentaBancoPunVen;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaBancoPunVen=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaBancoPunVen=new JMenuMe("General");
		this.jmenuArchivoCuentaBancoPunVen=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaBancoPunVen=new JMenuMe("Acciones");
		this.jmenuDatosCuentaBancoPunVen=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaBancoPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaBancoPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaBancoPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaBancoPunVen= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaBancoPunVen.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaBancoPunVen,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaBancoPunVen= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaBancoPunVen.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaBancoPunVen,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaBancoPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaBancoPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaBancoPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaBancoPunVen= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaBancoPunVen.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaBancoPunVen,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaBancoPunVen= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaBancoPunVen.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaBancoPunVen,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaBancoPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaBancoPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaBancoPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaBancoPunVen= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaBancoPunVen.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaBancoPunVen,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaBancoPunVen= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaBancoPunVen.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaBancoPunVen,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaBancoPunVen= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaBancoPunVen.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaBancoPunVen,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaBancoPunVen= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaBancoPunVen.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaBancoPunVen,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaBancoPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaBancoPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaBancoPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaBancoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaBancoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaBancoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaBancoPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaBancoPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaBancoPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaBancoPunVen.add(this.jMenuItemCerrarCuentaBancoPunVen);
			
			this.jmenuAccionesCuentaBancoPunVen.add(this.jMenuItemNuevoCuentaBancoPunVen);
			this.jmenuAccionesCuentaBancoPunVen.add(this.jMenuItemNuevoGuardarCambiosCuentaBancoPunVen);
			this.jmenuAccionesCuentaBancoPunVen.add(this.jMenuItemNuevoRelacionesCuentaBancoPunVen);
			this.jmenuAccionesCuentaBancoPunVen.add(this.jMenuItemGuardarCambiosTablaCuentaBancoPunVen);		
			this.jmenuAccionesCuentaBancoPunVen.add(this.jMenuItemDuplicarCuentaBancoPunVen);		
			this.jmenuAccionesCuentaBancoPunVen.add(this.jMenuItemCopiarCuentaBancoPunVen);		
			this.jmenuAccionesCuentaBancoPunVen.add(this.jMenuItemVerFormCuentaBancoPunVen);		
			
			this.jmenuDatosCuentaBancoPunVen.add(this.jMenuItemRecargarInformacionCuentaBancoPunVen);				
			this.jmenuDatosCuentaBancoPunVen.add(this.jMenuItemAnterioresCuentaBancoPunVen);				
			this.jmenuDatosCuentaBancoPunVen.add(this.jMenuItemSiguientesCuentaBancoPunVen);				
			this.jmenuDatosCuentaBancoPunVen.add(this.jMenuItemAbrirOrderByCuentaBancoPunVen);				
			this.jmenuDatosCuentaBancoPunVen.add(this.jMenuItemMostrarOcultarCuentaBancoPunVen);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaBancoPunVen.add(this.jMenuItemGuardarCambiosCuentaBancoPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaBancoPunVen.add(this.jmenuArchivoCuentaBancoPunVen);		
			this.jmenuBarCuentaBancoPunVen.add(this.jmenuAccionesCuentaBancoPunVen);		
			this.jmenuBarCuentaBancoPunVen.add(this.jmenuDatosCuentaBancoPunVen);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaBancoPunVen);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaBancoPunVen() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoCuentaBancoPunVen.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoCuentaBancoPunVen= new JButtonMe();
		this.jButtonFK_IdBancoCuentaBancoPunVen.setText("Buscar");
		this.jButtonFK_IdBancoCuentaBancoPunVen.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoCuentaBancoPunVen,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoCuentaBancoPunVen = new JLabelMe();
		jLabelid_bancoFK_IdBancoCuentaBancoPunVen.setText("Banco :");
		jLabelid_bancoFK_IdBancoCuentaBancoPunVen.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteCuentaBancoPunVen.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteCuentaBancoPunVen= new JButtonMe();
		this.jButtonFK_IdClienteCuentaBancoPunVen.setText("Buscar");
		this.jButtonFK_IdClienteCuentaBancoPunVen.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteCuentaBancoPunVen,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteCuentaBancoPunVen = new JLabelMe();
		jLabelid_clienteFK_IdClienteCuentaBancoPunVen.setText("Cliente :");
		jLabelid_clienteFK_IdClienteCuentaBancoPunVen.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen.setFocusable(false);

		this.jPanelFK_IdCuentaContableCuentaBancoPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCuentaBancoPunVen.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableCuentaBancoPunVen= new JButtonMe();
		this.jButtonFK_IdCuentaContableCuentaBancoPunVen.setText("Buscar");
		this.jButtonFK_IdCuentaContableCuentaBancoPunVen.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCuentaBancoPunVen,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaBancoPunVen=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaBancoPunVen.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaBancoPunVen.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaBancoPunVen.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaBancoPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaBancoPunVen = new CuentaBancoPunVenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Banco DATOS");
			this.jInternalFrameDetalleFormCuentaBancoPunVen = new CuentaBancoPunVenDetalleFormJInternalFrame(jDesktopPane,this.cuentabancopunvenSessionBean.getConGuardarRelaciones(),this.cuentabancopunvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaBancoPunVen = null;//new CuentaBancoPunVenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaBancoPunVen= new GridBagLayout();
		
		
		this.jTableDatosCuentaBancoPunVen = new JTableMe();      
		
		String sToolTipCuentaBancoPunVen="";
		sToolTipCuentaBancoPunVen=CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaBancoPunVen+="(PuntoVenta.CuentaBancoPunVen)";
		}
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaBancoPunVen+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaBancoPunVen.setToolTipText(sToolTipCuentaBancoPunVen);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaBancoPunVen);
		this.jTableDatosCuentaBancoPunVen.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaBancoPunVen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaBancoPunVen.setRowSelectionAllowed(true);
		this.jTableDatosCuentaBancoPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaBancoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaBancoPunVen = new JButtonMe();
		this.jButtonDuplicarCuentaBancoPunVen = new JButtonMe();
		this.jButtonCopiarCuentaBancoPunVen = new JButtonMe();
		this.jButtonVerFormCuentaBancoPunVen = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaBancoPunVen = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen = new JButtonMe();
		this.jButtonCerrarCuentaBancoPunVen = new JButtonMe();
		
		this.jScrollPanelDatosCuentaBancoPunVen = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaBancoPunVen = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Banco";
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancoes" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaBancoPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaBancoPunVen.setToolTipText("Acciones");
        this.jPanelAccionesCuentaBancoPunVen.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuentaBancoPunVen=new ReporteDinamicoJInternalFrame(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaBancoPunVen();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaBancoPunVen=new ImportacionJInternalFrame(CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaBancoPunVen();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaBancoPunVen = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaBancoPunVen.setText("Orden");
		this.jButtonAbrirOrderByCuentaBancoPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaBancoPunVen,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaBancoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaBancoPunVen,false,this);
			
			//this.cargarOrderByCuentaBancoPunVen(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaBancoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaBancoPunVen,true,this);
			
			//this.cargarOrderByCuentaBancoPunVen(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaBancoPunVen.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosCuentaBancoPunVen.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosCuentaBancoPunVen.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosCuentaBancoPunVen.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaBancoPunVen.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaBancoPunVen.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaBancoPunVen.setText("Nuevo");
		this.jButtonDuplicarCuentaBancoPunVen.setText("Duplicar");
		this.jButtonCopiarCuentaBancoPunVen.setText("Copiar");
		this.jButtonVerFormCuentaBancoPunVen.setText("Ver");
		this.jButtonNuevoRelacionesCuentaBancoPunVen.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.setText("Guardar");
		this.jButtonCerrarCuentaBancoPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaBancoPunVen,"nuevo_button","Nuevo",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaBancoPunVen,"duplicar_button","Duplicar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaBancoPunVen,"copiar_button","Copiar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaBancoPunVen,"ver_form","Ver",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaBancoPunVen,"nuevorelaciones_button","Nuevo Rel",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaBancoPunVen,"guardarcambiostabla_button","Guardar",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaBancoPunVen,"cerrar_button","Salir",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaBancoPunVen.setToolTipText("Nuevo"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaBancoPunVen.setToolTipText("Duplicar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaBancoPunVen.setToolTipText("Copiar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaBancoPunVen.setToolTipText("Ver"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaBancoPunVen.setToolTipText("Nuevo Rel"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.setToolTipText("Guardar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaBancoPunVen.setToolTipText("Salir"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaBancoPunVen";
		inputMap = this.jButtonNuevoCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaBancoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaBancoPunVen"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaBancoPunVen";
		inputMap = this.jButtonDuplicarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaBancoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaBancoPunVen"));
		
		//COPIAR
		sMapKey = "CopiarCuentaBancoPunVen";
		inputMap = this.jButtonCopiarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaBancoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaBancoPunVen"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaBancoPunVen";
		inputMap = this.jButtonVerFormCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaBancoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaBancoPunVen"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaBancoPunVen";
		inputMap = this.jButtonNuevoRelacionesCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaBancoPunVen"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaBancoPunVen";
		inputMap = this.jButtonModificarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaBancoPunVen"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaBancoPunVen";
		inputMap = this.jButtonCerrarCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaBancoPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaBancoPunVen";
		inputMap = this.jButtonGuardarCambiosTablaCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaBancoPunVen"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaBancoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaBancoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaBancoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaBancoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaBancoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaBancoPunVen.setName("jPanelParametrosReportesCuentaBancoPunVen"); 
		
		this.jPanelParametrosReportesAccionesCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaBancoPunVen.setName("jPanelParametrosReportesAccionesCuentaBancoPunVen"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaBancoPunVen = new JButtonMe();
		this.jButtonRecargarInformacionCuentaBancoPunVen.setText("Recargar");
		this.jButtonRecargarInformacionCuentaBancoPunVen.setToolTipText("Recargar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaBancoPunVen,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaBancoPunVen = new JButtonMe();
		this.jButtonProcesarInformacionCuentaBancoPunVen.setText("Procesar");
		this.jButtonProcesarInformacionCuentaBancoPunVen.setToolTipText("Procesar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaBancoPunVen.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaBancoPunVen.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaBancoPunVen.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaBancoPunVen.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaBancoPunVen.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaBancoPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaBancoPunVen.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaBancoPunVen.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaBancoPunVen.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaBancoPunVen.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaBancoPunVen.setText("Accion");
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaBancoPunVen.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaBancoPunVen.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaBancoPunVen = new JLabelMe();
		
		this.jLabelAccionesCuentaBancoPunVen.setText("Acciones");		
		this.jLabelAccionesCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaBancoPunVen = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaBancoPunVen.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaBancoPunVen.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaBancoPunVen = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaBancoPunVen.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaBancoPunVen.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaBancoPunVen = new JButtonMe();
		//this.jButtonAnterioresCuentaBancoPunVen.setText("<<");
        this.jButtonAnterioresCuentaBancoPunVen.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaBancoPunVen,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaBancoPunVen = new JButtonMe();
		//this.jButtonSiguientesCuentaBancoPunVen.setText(">>");
        this.jButtonSiguientesCuentaBancoPunVen.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaBancoPunVen,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaBancoPunVen = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaBancoPunVen.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaBancoPunVen.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaBancoPunVen,"nuevoguardarcambios_button","Nue",this.cuentabancopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaBancoPunVen";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaBancoPunVen"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaBancoPunVen";
		inputMap = this.jButtonRecargarInformacionCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaBancoPunVen"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaBancoPunVen";
		inputMap = this.jButtonSiguientesCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaBancoPunVen"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaBancoPunVen";
		inputMap = this.jButtonAnterioresCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaBancoPunVen"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaBancoPunVen();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaBancoPunVen.setMinimumSize(new Dimension(this.getWidth(),CuentaBancoPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaBancoPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaBancoPunVen.setMaximumSize(new Dimension(this.getWidth(),CuentaBancoPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaBancoPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaBancoPunVen.setPreferredSize(new Dimension(this.getWidth(),CuentaBancoPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaBancoPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaBancoPunVen = new GridBagLayout();

			this.jPanelPaginacionCuentaBancoPunVen.setLayout(gridaBagLayoutPaginacionCuentaBancoPunVen);						
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonAnterioresCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
					
						
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
			
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonNuevoGuardarCambiosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
						
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonSiguientesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 1;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonNuevoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
				this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaBancoPunVen.gridy = 1;
				this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonNuevoRelacionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			}
			
			
			if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
				this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaBancoPunVen.gridy = 1;
				this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonGuardarCambiosTablaCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			}
			
			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 1;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonDuplicarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 1;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonCopiarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 1;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonVerFormCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 1;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaBancoPunVen.add(this.jButtonCerrarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
		
		
		this.jButtonRecargarInformacionCuentaBancoPunVen.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaBancoPunVen.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaBancoPunVen.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaBancoPunVen.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaBancoPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaBancoPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaBancoPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaBancoPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaBancoPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaBancoPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaBancoPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaBancoPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaBancoPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaBancoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaBancoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaBancoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBancoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaBancoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaBancoPunVen.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaBancoPunVen.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaBancoPunVen.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaBancoPunVen.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaBancoPunVen.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaBancoPunVen.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaBancoPunVen.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaBancoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaBancoPunVen = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaBancoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaBancoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaBancoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaBancoPunVen = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaBancoPunVen.setLayout(gridaBagParametrosReportesCuentaBancoPunVen);
			this.jPanelParametrosReportesAccionesCuentaBancoPunVen.setLayout(gridaBagParametrosReportesAccionesCuentaBancoPunVen);
			
			
			this.jPanelParametrosAuxiliar1CuentaBancoPunVen.setLayout(gridaBagParametrosAuxiliar1CuentaBancoPunVen);
			this.jPanelParametrosAuxiliar2CuentaBancoPunVen.setLayout(gridaBagParametrosAuxiliar2CuentaBancoPunVen);
			this.jPanelParametrosAuxiliar3CuentaBancoPunVen.setLayout(gridaBagParametrosAuxiliar3CuentaBancoPunVen);
			this.jPanelParametrosAuxiliar4CuentaBancoPunVen.setLayout(gridaBagParametrosAuxiliar4CuentaBancoPunVen);
			//this.jPanelParametrosAuxiliar5CuentaBancoPunVen.setLayout(gridaBagParametrosAuxiliar2CuentaBancoPunVen);			
			
			
			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jButtonRecargarInformacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaBancoPunVen.add(this.jComboBoxTiposPaginacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaBancoPunVen.add(this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaBancoPunVen.add(this.jComboBoxTiposArchivosReportesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jPanelParametrosAuxiliar1CuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBancoPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaBancoPunVen.add(this.jComboBoxTiposReportesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jPanelParametrosAuxiliar4CuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jComboBoxTiposReportesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jCheckBoxGenerarReporteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jPanelParametrosAuxiliar2CuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBancoPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jLabelAccionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
				this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jButtonAbrirOrderByCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jComboBoxTiposSeleccionarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
			
			
			/*
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBancoPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jCheckBoxSeleccionarTodosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBancoPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaBancoPunVen.add(this.jCheckBoxSeleccionarTodosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);															
				
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBancoPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaBancoPunVen.add(this.jCheckBoxSeleccionadosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jPanelParametrosAuxiliar3CuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jComboBoxTiposRelacionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
				
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jComboBoxTiposAccionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
	
				
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBancoPunVen.add(this.jTextFieldValorCampoGeneralCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaBancoPunVen = new GridBagLayout();

			this.jScrollPanelDatosCuentaBancoPunVen.setLayout(gridaBagLayoutDatosCuentaBancoPunVen);
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
			
			this.jScrollPanelDatosCuentaBancoPunVen.add(this.jTableDatosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaBancoPunVen.setViewportView(this.jTableDatosCuentaBancoPunVen);
		this.jTableDatosCuentaBancoPunVen.setFillsViewportHeight(true);
		this.jTableDatosCuentaBancoPunVen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaBancoPunVen= new GridBagLayout();
		this.jPanelAccionesCuentaBancoPunVen.setLayout(gridaBagLayoutAccionesCuentaBancoPunVen);
		
		
		/*	
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
			
		this.jPanelAccionesCuentaBancoPunVen.add(this.jButtonNuevoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoCuentaBancoPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdBancoCuentaBancoPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoCuentaBancoPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoCuentaBancoPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoCuentaBancoPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoCuentaBancoPunVen.setLayout(gridaBagLayoutFK_IdBancoCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		gridBagConstraintsCuentaBancoPunVen.gridx = 0;
		jPanelFK_IdBancoCuentaBancoPunVen.add(jLabelid_bancoFK_IdBancoCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		gridBagConstraintsCuentaBancoPunVen.gridx = 1;
		jPanelFK_IdBancoCuentaBancoPunVen.add(jComboBoxid_bancoFK_IdBancoCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 1;
		gridBagConstraintsCuentaBancoPunVen.gridx =1;
		jPanelFK_IdBancoCuentaBancoPunVen.add(jButtonFK_IdBancoCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		jTabbedPaneBusquedasCuentaBancoPunVen.addTab("1.-Por Banco ", jPanelFK_IdBancoCuentaBancoPunVen);
		jTabbedPaneBusquedasCuentaBancoPunVen.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteCuentaBancoPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdClienteCuentaBancoPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteCuentaBancoPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteCuentaBancoPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteCuentaBancoPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteCuentaBancoPunVen.setLayout(gridaBagLayoutFK_IdClienteCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		gridBagConstraintsCuentaBancoPunVen.gridx = 0;
		jPanelFK_IdClienteCuentaBancoPunVen.add(jLabelid_clienteFK_IdClienteCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		gridBagConstraintsCuentaBancoPunVen.gridx = 1;
		jPanelFK_IdClienteCuentaBancoPunVen.add(jComboBoxid_clienteFK_IdClienteCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);


		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		gridBagConstraintsCuentaBancoPunVen.gridx = 0;
		jPanelFK_IdClienteCuentaBancoPunVen.add(this.jButtonBuscarFK_IdClienteid_clienteCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 1;
		gridBagConstraintsCuentaBancoPunVen.gridx =1;
		jPanelFK_IdClienteCuentaBancoPunVen.add(jButtonFK_IdClienteCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		jTabbedPaneBusquedasCuentaBancoPunVen.addTab("2.-Por Cliente ", jPanelFK_IdClienteCuentaBancoPunVen);
		jTabbedPaneBusquedasCuentaBancoPunVen.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCuentaBancoPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCuentaBancoPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaBancoPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCuentaBancoPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCuentaBancoPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCuentaBancoPunVen.setLayout(gridaBagLayoutFK_IdCuentaContableCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		gridBagConstraintsCuentaBancoPunVen.gridx = 0;
		jPanelFK_IdCuentaContableCuentaBancoPunVen.add(jLabelid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 0;
		gridBagConstraintsCuentaBancoPunVen.gridx = 1;
		jPanelFK_IdCuentaContableCuentaBancoPunVen.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBancoPunVen.gridy = 1;
		gridBagConstraintsCuentaBancoPunVen.gridx =1;
		jPanelFK_IdCuentaContableCuentaBancoPunVen.add(jButtonFK_IdCuentaContableCuentaBancoPunVen, gridBagConstraintsCuentaBancoPunVen);

		jTabbedPaneBusquedasCuentaBancoPunVen.addTab("3.-Por Cuenta Contable ", jPanelFK_IdCuentaContableCuentaBancoPunVen);
		jTabbedPaneBusquedasCuentaBancoPunVen.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaBancoPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaBancoPunVen);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();						
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;		
			//this.gridBagConstraintsCuentaBancoPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaBancoPunVen.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;		
		//this.gridBagConstraintsCuentaBancoPunVen.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaBancoPunVen.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaBancoPunVen);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;		
			this.gridBagConstraintsCuentaBancoPunVen.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaBancoPunVen.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);								
		
		
		/*
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		*/		
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaBancoPunVen.gridx =0;
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaBancoPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
				
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CuentaBancoPunVenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaBancoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaBancoPunVen = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaBancoPunVen.setLayout(gridaBagLayoutBusquedasParametrosCuentaBancoPunVen);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaBancoPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
			
			
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
			
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaBancoPunVen;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaBancoPunVen() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaBancoPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaBancoPunVen.setName("jPanelReporteDinamicoCuentaBancoPunVen"); 
		
		this.jPanelReporteDinamicoCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaBancoPunVen.setLayout(gridaBagLayoutReporteDinamicoCuentaBancoPunVen);
		
		
		this.jInternalFrameReporteDinamicoCuentaBancoPunVen= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaBancoPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaBancoPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaBancoPunVen = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaBancoPunVen.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jLabelColumnasSelectReporteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaBancoPunVen = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaBancoPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaBancoPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaBancoPunVen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaBancoPunVen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaBancoPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaBancoPunVen=new JScrollPane(this.jListColumnasSelectReporteCuentaBancoPunVen);
			
			this.jScrollColumnasSelectReporteCuentaBancoPunVen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaBancoPunVen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaBancoPunVen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jListColumnasSelectReporteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jScrollColumnasSelectReporteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaBancoPunVen = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaBancoPunVen.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jLabelRelacionesSelectReporteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaBancoPunVen = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaBancoPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaBancoPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaBancoPunVen.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaBancoPunVen.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaBancoPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaBancoPunVen=new JScrollPane(this.jListRelacionesSelectReporteCuentaBancoPunVen);
			
			this.jScrollRelacionesSelectReporteCuentaBancoPunVen.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaBancoPunVen.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaBancoPunVen.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jListRelacionesSelectReporteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jScrollRelacionesSelectReporteCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCuentaBancoPunVen = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaBancoPunVen = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaBancoPunVen = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaBancoPunVen = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaBancoPunVen.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jLabelGenerarExcelReporteDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen.setToolTipText("Generar EXCEL"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jButtonGenerarExcelReporteDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jComboBoxTiposReportesDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaBancoPunVen = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaBancoPunVen.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jLabelTiposArchivoReporteDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaBancoPunVen = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaBancoPunVen.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaBancoPunVen,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaBancoPunVen.setToolTipText("Generar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jButtonGenerarReporteDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaBancoPunVen = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaBancoPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaBancoPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaBancoPunVen.setToolTipText("Cancelar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBancoPunVen.add(this.jButtonCerrarReporteDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaBancoPunVen = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaBancoPunVen= new JScrollPane(jPanelReporteDinamicoCuentaBancoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBancoPunVen.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaBancoPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaBancoPunVen);
		this.jInternalFrameReporteDinamicoCuentaBancoPunVen.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaBancoPunVen() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaBancoPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaBancoPunVen.setName("jPanelImportacionCuentaBancoPunVen"); 
		
		this.jPanelImportacionCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaBancoPunVen.setLayout(gridaBagLayoutImportacionCuentaBancoPunVen);
		
		
		this.jInternalFrameImportacionCuentaBancoPunVen= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaBancoPunVen= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaBancoPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaBancoPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaBancoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaBancoPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaBancoPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaBancoPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaBancoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaBancoPunVen.setResizable(true);
	    this.jInternalFrameImportacionCuentaBancoPunVen.setClosable(true);
	    this.jInternalFrameImportacionCuentaBancoPunVen.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaBancoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaBancoPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaBancoPunVen.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaBancoPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaBancoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaBancoPunVen.setResizable(true);
	    this.jInternalFrameImportacionCuentaBancoPunVen.setClosable(true);
	    this.jInternalFrameImportacionCuentaBancoPunVen.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaBancoPunVen = new JLabelMe();

		this.jLabelArchivoImportacionCuentaBancoPunVen.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaBancoPunVen.add(this.jLabelArchivoImportacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaBancoPunVen = new JFileChooser();		
		this.jFileChooserImportacionCuentaBancoPunVen.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaBancoPunVen = new JButtonMe();
		this.jButtonAbrirImportacionCuentaBancoPunVen.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaBancoPunVen,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaBancoPunVen.setToolTipText("Generar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBancoPunVen.add(this.jButtonAbrirImportacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaBancoPunVen = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaBancoPunVen.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaBancoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaBancoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaBancoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaBancoPunVen.add(this.jLabelPathArchivoImportacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaBancoPunVen=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaBancoPunVen.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaBancoPunVen.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaBancoPunVen.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBancoPunVen.add(this.jTextFieldPathArchivoImportacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaBancoPunVen = new JButtonMe();
		this.jButtonGenerarImportacionCuentaBancoPunVen.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaBancoPunVen,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaBancoPunVen.setToolTipText("Generar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBancoPunVen.add(this.jButtonGenerarImportacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaBancoPunVen = new JButtonMe();
		this.jButtonCerrarImportacionCuentaBancoPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaBancoPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaBancoPunVen.setToolTipText("Cancelar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBancoPunVen.add(this.jButtonCerrarImportacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaBancoPunVen = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaBancoPunVen= new JScrollPane(jPanelImportacionCuentaBancoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
		this.gridBagConstraintsCuentaBancoPunVen.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaBancoPunVen.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaBancoPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaBancoPunVen.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaBancoPunVen);
		this.jInternalFrameImportacionCuentaBancoPunVen.getContentPane().add(this.jScrollPanelImportacionCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaBancoPunVen(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaBancoPunVen = new JButtonMe();
			this.jButtonAbrirOrderByCuentaBancoPunVen.setText("Orden");
			this.jButtonAbrirOrderByCuentaBancoPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaBancoPunVen,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaBancoPunVen";
			inputMap = this.jButtonAbrirOrderByCuentaBancoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaBancoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaBancoPunVen"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaBancoPunVen = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaBancoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaBancoPunVen.setName("jPanelOrderByCuentaBancoPunVen"); 
			
			this.jPanelOrderByCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaBancoPunVen.setLayout(gridaBagLayoutOrderByCuentaBancoPunVen);
			
			
			this.jTableDatosCuentaBancoPunVenOrderBy = new JTableMe();        
			this.jTableDatosCuentaBancoPunVenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaBancoPunVenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaBancoPunVenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaBancoPunVenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaBancoPunVenOrderBy.setViewportView(this.jTableDatosCuentaBancoPunVenOrderBy);
			this.jTableDatosCuentaBancoPunVenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaBancoPunVenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaBancoPunVen= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaBancoPunVen= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaBancoPunVen = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaBancoPunVen= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaBancoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaBancoPunVen.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaBancoPunVen.setTitle("Orden");
			this.jInternalFrameOrderByCuentaBancoPunVen.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaBancoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaBancoPunVen.setResizable(true);
			this.jInternalFrameOrderByCuentaBancoPunVen.setClosable(true);
			this.jInternalFrameOrderByCuentaBancoPunVen.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaBancoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaBancoPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaBancoPunVen.ipady =150;
				
			this.jPanelOrderByCuentaBancoPunVen.add(jScrollPanelDatosCuentaBancoPunVenOrderBy, this.gridBagConstraintsCuentaBancoPunVen);//this.jTableDatosCuentaBancoPunVenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaBancoPunVen = new JButtonMe();
			this.jButtonCerrarOrderByCuentaBancoPunVen.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaBancoPunVen,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaBancoPunVen.setToolTipText("Cancelar"+" "+CuentaBancoPunVenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaBancoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBancoPunVen.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaBancoPunVen.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaBancoPunVen.add(this.jButtonCerrarOrderByCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaBancoPunVen = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaBancoPunVen= new JScrollPane(jPanelOrderByCuentaBancoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaBancoPunVen = new GridBagConstraints();
			this.gridBagConstraintsCuentaBancoPunVen.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaBancoPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaBancoPunVen.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaBancoPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaBancoPunVen.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaBancoPunVen);
			
			this.jInternalFrameOrderByCuentaBancoPunVen.getContentPane().add(this.jScrollPanelOrderByCuentaBancoPunVen, this.gridBagConstraintsCuentaBancoPunVen);			
		
		} else {
			this.jButtonAbrirOrderByCuentaBancoPunVen = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentabancopunvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaBancoPunVen.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaBancoPunVen.getRowHeight();//CuentaBancoPunVenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen.isSelected()) {
					iHeightTable=CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaBancoPunVen.isSelected()) {
					iHeightTable=CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaBancoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaBancoPunVen!=null && this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentabancopunvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaBancoPunVen.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaBancoPunVen.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaBancoPunVen.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaBancoPunVen.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaBancoPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaBancoPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaBancoPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentabancopunvenLogic.getCuentaBancoPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentabancopunvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaBancoPunVen> TraerCuentaBancoPunVenBeans(List<CuentaBancoPunVen> cuentabancopunvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaBancoPunVen cuentabancopunven:cuentabancopunvens) {
					
				if(!(CuentaBancoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaBancoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentabancopunven.setsDetalleGeneralEntityReporte(CuentaBancoPunVenConstantesFunciones.getCuentaBancoPunVenDescripcion(cuentabancopunven));
										
						
					
					

					if(cuentabancopunven.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{cuentabancopunven.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(cuentabancopunven.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cuentabancopunven.setsDetalleGeneralEntityReporte(cuentabancopunven.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentabancopunvenbeans.add(cuentabancopunvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentabancopunvens;
    }
	//PARA REPORTES FIN
}
