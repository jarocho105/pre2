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

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.CuentaBancoConstantesFunciones;

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
public class CuentaBancoJInternalFrame extends CuentaBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaBanco;
	
	protected JMenuBar jmenuBarCuentaBanco;
	
	protected JMenu jmenuCuentaBanco;
	protected JMenu jmenuDatosCuentaBanco;
	protected JMenu jmenuArchivoCuentaBanco;
	protected JMenu jmenuAccionesCuentaBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaBanco;	
	protected GridBagConstraints gridBagConstraintsCuentaBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaBancoDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EstadoCuentaBancoBeanSwingJInternalFrame estadocuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocuentabanco="";

	protected FormatoBeanSwingJInternalFrame formatoingresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoingreso="";

	protected FormatoBeanSwingJInternalFrame formatoegresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoegreso="";

	protected FormatoBeanSwingJInternalFrame formatodiarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatodiario="";

	protected FormatoBeanSwingJInternalFrame formatochequeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatocheque="";

	protected FormatoBeanSwingJInternalFrame formatoretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoretencion="";

	protected FormatoBeanSwingJInternalFrame formatoretencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoretencioniva="";
	
	public CuentaBancoSessionBean cuentabancoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EstadoCuentaBancoSessionBean estadocuentabancoSessionBean;
	public FormatoSessionBean formatoingresoSessionBean;
	public FormatoSessionBean formatoegresoSessionBean;
	public FormatoSessionBean formatodiarioSessionBean;
	public FormatoSessionBean formatochequeSessionBean;
	public FormatoSessionBean formatoretencionSessionBean;
	public FormatoSessionBean formatoretencionivaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaBanco> cuentabancos;		
	public List<CuentaBanco> cuentabancosEliminados;	
	public List<CuentaBanco> cuentabancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaBanco;		
	protected JButton jButtonAbrirOrderByCuentaBanco;
	
	
	//protected JPanel jPanelOrderByCuentaBanco;
	//public JScrollPane jScrollPanelOrderByCuentaBanco;	
	//protected JButton jButtonCerrarOrderByCuentaBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaBancoLogic cuentabancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaBanco;
	public JScrollPane jScrollPanelDatosEdicionCuentaBanco;
	public JScrollPane jScrollPanelDatosGeneralCuentaBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaBanco;
	//public JScrollPane jScrollPanelImportacionCuentaBanco;
	
	
	
	protected JPanel jPanelAccionesCuentaBanco;
	
    protected JPanel jPanelPaginacionCuentaBanco;
    protected JPanel jPanelParametrosReportesCuentaBanco;
	protected JPanel jPanelParametrosReportesAccionesCuentaBanco;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralCuentaBanco;
	protected Integer iXPanelCamposIniciogeneralCuentaBanco=0;
	protected Integer iYPanelCamposIniciogeneralCuentaBanco=0;

	protected JPanel jPanelCamposInicioformatoCuentaBanco;
	protected Integer iXPanelCamposInicioformatoCuentaBanco=0;
	protected Integer iYPanelCamposInicioformatoCuentaBanco=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaBanco;
	protected JPanel jPanelParametrosAuxiliar2CuentaBanco;
	protected JPanel jPanelParametrosAuxiliar3CuentaBanco;
	protected JPanel jPanelParametrosAuxiliar4CuentaBanco;
	//protected JPanel jPanelParametrosAuxiliar5CuentaBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaBanco;
	//protected JPanel jPanelImportacionCuentaBanco;
	
	
	public JTable jTableDatosCuentaBanco;
	
	
	
	//public JTable jTableDatosCuentaBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaBanco;
	protected JButton jButtonDuplicarCuentaBanco;
	protected JButton jButtonCopiarCuentaBanco;
	protected JButton jButtonVerFormCuentaBanco;
	protected JButton jButtonNuevoRelacionesCuentaBanco;
	protected JButton jButtonModificarCuentaBanco;
	
    protected JButton jButtonGuardarCambiosTablaCuentaBanco;
	protected JButton jButtonCerrarCuentaBanco;
	
	
	protected JButton jButtonRecargarInformacionCuentaBanco;
	protected JButton jButtonProcesarInformacionCuentaBanco;
	
	
	protected JButton jButtonAnterioresCuentaBanco;
	protected JButton jButtonSiguientesCuentaBanco;
	protected JButton jButtonNuevoGuardarCambiosCuentaBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaBanco;
	//protected JButton jButtonCerrarReporteDinamicoCuentaBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaBanco;
	//protected JButton jButtonGenerarImportacionCuentaBanco;
	//protected JButton jButtonCerrarImportacionCuentaBanco;
	//protected JFileChooser jFileChooserImportacionCuentaBanco;
	//protected File fileImportacionCuentaBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaBanco;
	protected JButton jButtonDuplicarToolBarCuentaBanco;
	protected JButton jButtonNuevoRelacionesToolBarCuentaBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaBanco;
	protected JButton jButtonCopiarToolBarCuentaBanco;
	protected JButton jButtonVerFormToolBarCuentaBanco;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaBanco;
	protected JButton jButtonCerrarToolBarCuentaBanco;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaBanco;
	protected JButton jButtonProcesarInformacionToolBarCuentaBanco;
	protected JButton jButtonAnterioresToolBarCuentaBanco;
	protected JButton jButtonSiguientesToolBarCuentaBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaBanco;
	protected JButton jButtonAbrirOrderByToolBarCuentaBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaBanco;
	protected JMenuItem jMenuItemDuplicarCuentaBanco;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaBanco;
	protected JMenuItem jMenuItemCopiarCuentaBanco;
	protected JMenuItem jMenuItemVerFormCuentaBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaBanco;
	protected JMenuItem jMenuItemCerrarCuentaBanco;
	protected JMenuItem jMenuItemDetalleCerrarCuentaBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaBanco;
	protected JMenuItem jMenuItemProcesarInformacionCuentaBanco;
	protected JMenuItem jMenuItemAnterioresCuentaBanco;
	protected JMenuItem jMenuItemSiguientesCuentaBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaBanco;
	protected JMenuItem jMenuItemAbrirOrderByCuentaBanco;
	protected JMenuItem jMenuItemMostrarOcultarCuentaBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaBanco;
	protected JCheckBox jCheckBoxSeleccionadosCuentaBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaBanco;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaBanco;
	protected JTextField jTextFieldValorCampoGeneralCuentaBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaBanco;
	//public JList<Reporte> jListColumnasSelectReporteCuentaBanco;
	//public JScrollPane jScrollColumnasSelectReporteCuentaBanco;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaBanco;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaBanco;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaBanco;
	
		
	//public JLabel jLabelArchivoImportacionCuentaBanco;	
	//public JLabel jLabelPathArchivoImportacionCuentaBanco;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaBanco;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaBanco;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaBanco;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaBanco;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaBanco;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaBanco;
	public JPanel jPanelBusquedaPorCodigoCuentaBanco;
	public JButton jButtonBusquedaPorCodigoCuentaBanco;
	public JPanel jPanelBusquedaPorNumeroChequeCuentaBanco;
	public JButton jButtonBusquedaPorNumeroChequeCuentaBanco;
	public JPanel jPanelBusquedaPorNumeroCuentaCuentaBanco;
	public JButton jButtonBusquedaPorNumeroCuentaCuentaBanco;
	public JPanel jPanelFK_IdBancoCuentaBanco;
	public JButton jButtonFK_IdBancoCuentaBanco;
	public JPanel jPanelFK_IdEstadoCuentaBancoCuentaBanco;
	public JButton jButtonFK_IdEstadoCuentaBancoCuentaBanco;
	public JPanel jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco;
	public JButton jButtonFK_IdTipoCuentaBancoGlobalCuentaBanco;
	
	public JPanel jPanelcodigoBusquedaPorCodigoCuentaBanco;
	public JLabel jLabelcodigoBusquedaPorCodigoCuentaBanco;
	public JTextArea jTextAreacodigoBusquedaPorCodigoCuentaBanco;
	public JButton jButtoncodigoBusquedaPorCodigoCuentaBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_chequeBusquedaPorNumeroChequeCuentaBanco;
	public JLabel jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco;
	public JTextField jTextFieldnumero_chequeBusquedaPorNumeroChequeCuentaBanco;
	public JButton jButtonnumero_chequeBusquedaPorNumeroChequeCuentaBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco;
	public JLabel jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco;
	public JTextField jTextFieldnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco;
	public JButton jButtonnumero_cuentaBusquedaPorNumeroCuentaCuentaBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bancoFK_IdBancoCuentaBanco;
	public JLabel jLabelid_bancoFK_IdBancoCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoCuentaBanco;
	public JButton jButtonid_bancoFK_IdBancoCuentaBanco= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoCuentaBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco;
	public JLabel jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco;
	public JButton jButtonid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco= new JButtonMe();
	public JButton jButtonid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco;
	public JLabel jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco;
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBancoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CuentaBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaBanco)	{
		this.jButtonRecargarInformacionCuentaBanco = jButtonRecargarInformacionCuentaBanco;
	}
	
	public JButton getjButtonProcesarInformacionCuentaBanco() {
		return this.jButtonProcesarInformacionCuentaBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaBanco)	{
		this.jButtonProcesarInformacionCuentaBanco = jButtonProcesarInformacionCuentaBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaBanco() {
		return this.jButtonRecargarInformacionCuentaBanco;
	}
	
	
	public List<CuentaBanco> getcuentabancos() {
		return this.cuentabancos;
	}

	public void setcuentabancos(List<CuentaBanco> cuentabancos) {
		this.cuentabancos = cuentabancos;
	}
	
	public List<CuentaBanco> getcuentabancosAux() {
		return this.cuentabancosAux;
	}

	public void setcuentabancosAux(List<CuentaBanco> cuentabancosAux) {
		this.cuentabancosAux = cuentabancosAux;
	}
	
	public List<CuentaBanco> getcuentabancosEliminados() {
		return this.cuentabancosEliminados;
	}

	public void setCuentaBancosEliminados(List<CuentaBanco> cuentabancosEliminados) {
		this.cuentabancosEliminados = cuentabancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaBanco() {
		return jComboBoxTiposSeleccionarCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaBanco(
			JComboBox jComboBoxTiposSeleccionarCuentaBanco) {
		this.jComboBoxTiposSeleccionarCuentaBanco = jComboBoxTiposSeleccionarCuentaBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaBanco() {
		return jTextFieldValorCampoGeneralCuentaBanco;
	}

	public void setjTextFieldValorCampoGeneralCuentaBanco(
			JTextField jTextFieldValorCampoGeneralCuentaBanco) {
		this.jTextFieldValorCampoGeneralCuentaBanco = jTextFieldValorCampoGeneralCuentaBanco;
	}

	public void setBorderResaltarValorCampoGeneralCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaBanco() {
		return this.jCheckBoxSeleccionarTodosCuentaBanco;
	}

	public void setjCheckBoxSeleccionarTodosCuentaBanco(
			JCheckBox jCheckBoxSeleccionarTodosCuentaBanco) {
		this.jCheckBoxSeleccionarTodosCuentaBanco = jCheckBoxSeleccionarTodosCuentaBanco;
	}

	public void setBorderResaltarSeleccionarTodosCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaBanco() {
		return this.jCheckBoxSeleccionadosCuentaBanco;
	}

	public void setjCheckBoxSeleccionadosCuentaBanco(
			JCheckBox jCheckBoxSeleccionadosCuentaBanco) {
		this.jCheckBoxSeleccionadosCuentaBanco = jCheckBoxSeleccionadosCuentaBanco;
	}
	
	public void setBorderResaltarSeleccionadosCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaBanco() {
		return this.jComboBoxTiposArchivosReportesCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaBanco(
			JComboBox jComboBoxTiposArchivosReportesCuentaBanco) {
		this.jComboBoxTiposArchivosReportesCuentaBanco = jComboBoxTiposArchivosReportesCuentaBanco;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaBanco() {
		return this.jComboBoxTiposReportesCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaBanco(
			JComboBox jComboBoxTiposReportesCuentaBanco) {
		this.jComboBoxTiposReportesCuentaBanco = jComboBoxTiposReportesCuentaBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaBanco() {
	//	return jComboBoxTiposReportesDinamicoCuentaBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaBanco) {
	//	this.jComboBoxTiposReportesDinamicoCuentaBanco = jComboBoxTiposReportesDinamicoCuentaBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco = jComboBoxTiposArchivosReportesDinamicoCuentaBanco;
	//}
	
	public void setBorderResaltarTiposReportesCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaBanco() {
		return this.jComboBoxTiposGraficosReportesCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaBanco(
			JComboBox jComboBoxTiposGraficosReportesCuentaBanco) {
		this.jComboBoxTiposGraficosReportesCuentaBanco = jComboBoxTiposGraficosReportesCuentaBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaBanco() {
		return this.jComboBoxTiposPaginacionCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaBanco(
			JComboBox jComboBoxTiposPaginacionCuentaBanco) {
		this.jComboBoxTiposPaginacionCuentaBanco = jComboBoxTiposPaginacionCuentaBanco;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaBanco() {
		return this.jComboBoxTiposRelacionesCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaBanco() {
		return this.jComboBoxTiposAccionesCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaBanco(
			JComboBox jComboBoxTiposRelacionesCuentaBanco) {
		this.jComboBoxTiposRelacionesCuentaBanco = jComboBoxTiposRelacionesCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaBanco(
			JComboBox jComboBoxTiposAccionesCuentaBanco) {
		this.jComboBoxTiposAccionesCuentaBanco = jComboBoxTiposAccionesCuentaBanco;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaBanco() {
	//	return jCheckBoxConGraficoDinamicoCuentaBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaBanco) {
	//	this.jCheckBoxConGraficoDinamicoCuentaBanco = jCheckBoxConGraficoDinamicoCuentaBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaBanco .setBorder(borderResaltar);		
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
		this.cuentabancoSessionBean=new CuentaBancoSessionBean();
		
		this.cuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentabancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"nuevo","nuevo","Nuevo"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"duplicar","duplicar","Duplicar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"copiar","copiar","Copiar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"ver_form","ver_form","Ver"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"recargar","recargar","Recargar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaBanco,this.jTtoolBarCuentaBanco,
							"cerrar","cerrar","Salir"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaBanco;
			
				this.jButtonProcesarInformacionToolBarCuentaBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaBanco;
				
		//protected JButton jButtonModificarToolBarCuentaBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaBanco=new JMenuMe("General");
		this.jmenuArchivoCuentaBanco=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaBanco=new JMenuMe("Acciones");
		this.jmenuDatosCuentaBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaBanco.add(this.jMenuItemCerrarCuentaBanco);
			
			this.jmenuAccionesCuentaBanco.add(this.jMenuItemNuevoCuentaBanco);
			this.jmenuAccionesCuentaBanco.add(this.jMenuItemNuevoGuardarCambiosCuentaBanco);
			this.jmenuAccionesCuentaBanco.add(this.jMenuItemNuevoRelacionesCuentaBanco);
			this.jmenuAccionesCuentaBanco.add(this.jMenuItemGuardarCambiosTablaCuentaBanco);		
			this.jmenuAccionesCuentaBanco.add(this.jMenuItemDuplicarCuentaBanco);		
			this.jmenuAccionesCuentaBanco.add(this.jMenuItemCopiarCuentaBanco);		
			this.jmenuAccionesCuentaBanco.add(this.jMenuItemVerFormCuentaBanco);		
			
			this.jmenuDatosCuentaBanco.add(this.jMenuItemRecargarInformacionCuentaBanco);				
			this.jmenuDatosCuentaBanco.add(this.jMenuItemAnterioresCuentaBanco);				
			this.jmenuDatosCuentaBanco.add(this.jMenuItemSiguientesCuentaBanco);				
			this.jmenuDatosCuentaBanco.add(this.jMenuItemAbrirOrderByCuentaBanco);				
			this.jmenuDatosCuentaBanco.add(this.jMenuItemMostrarOcultarCuentaBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaBanco.add(this.jMenuItemGuardarCambiosCuentaBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaBanco.add(this.jmenuArchivoCuentaBanco);		
			this.jmenuBarCuentaBanco.add(this.jmenuAccionesCuentaBanco);		
			this.jmenuBarCuentaBanco.add(this.jmenuDatosCuentaBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaBanco() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoCuentaBanco.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoCuentaBanco= new JButtonMe();
		this.jButtonBusquedaPorCodigoCuentaBanco.setText("Buscar");
		this.jButtonBusquedaPorCodigoCuentaBanco.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoCuentaBanco,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoCuentaBanco = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoCuentaBanco.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoCuentaBanco.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacodigoBusquedaPorCodigoCuentaBanco= new JTextAreaMe();
		jTextAreacodigoBusquedaPorCodigoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBusquedaPorCodigoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNumeroChequeCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroChequeCuentaBanco.setToolTipText("Buscar Por No Cheque ");
		this.jButtonBusquedaPorNumeroChequeCuentaBanco= new JButtonMe();
		this.jButtonBusquedaPorNumeroChequeCuentaBanco.setText("Buscar");
		this.jButtonBusquedaPorNumeroChequeCuentaBanco.setToolTipText("Buscar Por No Cheque ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroChequeCuentaBanco,"buscar_button","Buscar Por No Cheque ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroChequeCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco = new JLabelMe();
		jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setText("No Cheque :");
		jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setToolTipText("No Cheque");
		jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_chequeBusquedaPorNumeroChequeCuentaBanco= new JTextFieldMe();
		jTextFieldnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeBusquedaPorNumeroChequeCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeBusquedaPorNumeroChequeCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNumeroCuentaCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroCuentaCuentaBanco.setToolTipText("Buscar Por No Cuenta ");
		this.jButtonBusquedaPorNumeroCuentaCuentaBanco= new JButtonMe();
		this.jButtonBusquedaPorNumeroCuentaCuentaBanco.setText("Buscar");
		this.jButtonBusquedaPorNumeroCuentaCuentaBanco.setToolTipText("Buscar Por No Cuenta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroCuentaCuentaBanco,"buscar_button","Buscar Por No Cuenta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroCuentaCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco = new JLabelMe();
		jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setText("No Cuenta :");
		jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setToolTipText("No Cuenta");
		jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco= new JTextFieldMe();
		jTextFieldnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBancoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoCuentaBanco.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoCuentaBanco= new JButtonMe();
		this.jButtonFK_IdBancoCuentaBanco.setText("Buscar");
		this.jButtonFK_IdBancoCuentaBanco.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoCuentaBanco,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoCuentaBanco = new JLabelMe();
		jLabelid_bancoFK_IdBancoCuentaBanco.setText("Banco :");
		jLabelid_bancoFK_IdBancoCuentaBanco.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoCuentaBanco= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoCuentaBancoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoCuentaBancoCuentaBanco.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoCuentaBancoCuentaBanco= new JButtonMe();
		this.jButtonFK_IdEstadoCuentaBancoCuentaBanco.setText("Buscar");
		this.jButtonFK_IdEstadoCuentaBancoCuentaBanco.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoCuentaBancoCuentaBanco,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoCuentaBancoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco = new JLabelMe();
		jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setText("Estado :");
		jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setToolTipText("Estado");
		jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco= new JComboBoxMe();
		jComboBoxid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco.setToolTipText("Buscar Por Tipo Cuenta ");
		this.jButtonFK_IdTipoCuentaBancoGlobalCuentaBanco= new JButtonMe();
		this.jButtonFK_IdTipoCuentaBancoGlobalCuentaBanco.setText("Buscar");
		this.jButtonFK_IdTipoCuentaBancoGlobalCuentaBanco.setToolTipText("Buscar Por Tipo Cuenta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCuentaBancoGlobalCuentaBanco,"buscar_button","Buscar Por Tipo Cuenta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCuentaBancoGlobalCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco = new JLabelMe();
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setText("Tipo Cuenta :");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setToolTipText("Tipo Cuenta");
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaBanco=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaBanco.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaBanco.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCuentaBanco.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaBanco = new CuentaBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Banco DATOS");
			this.jInternalFrameDetalleFormCuentaBanco = new CuentaBancoDetalleFormJInternalFrame(jDesktopPane,this.cuentabancoSessionBean.getConGuardarRelaciones(),this.cuentabancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaBanco = null;//new CuentaBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaBanco= new GridBagLayout();
		
		
		this.jTableDatosCuentaBanco = new JTableMe();      
		
		String sToolTipCuentaBanco="";
		sToolTipCuentaBanco=CuentaBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaBanco+="(Tesoreria.CuentaBanco)";
		}
		
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaBanco.setToolTipText(sToolTipCuentaBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaBanco);
		this.jTableDatosCuentaBanco.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaBanco.setRowSelectionAllowed(true);
		this.jTableDatosCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaBanco = new JButtonMe();
		this.jButtonDuplicarCuentaBanco = new JButtonMe();
		this.jButtonCopiarCuentaBanco = new JButtonMe();
		this.jButtonVerFormCuentaBanco = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaBanco = new JButtonMe();
		this.jButtonCerrarCuentaBanco = new JButtonMe();
		
		this.jScrollPanelDatosCuentaBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformatoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Banco";
		
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesCuentaBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCuentaBanco.setName("jPanelCamposFingeneralCuentaBanco");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformatoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
		this.jPanelCamposInicioformatoCuentaBanco.setName("jPanelCamposFinformatoCuentaBanco");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformatoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoCuentaBanco=new ReporteDinamicoJInternalFrame(CuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaBanco=new ImportacionJInternalFrame(CuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaBanco.setText("Orden");
		this.jButtonAbrirOrderByCuentaBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaBanco,false,this);
			
			//this.cargarOrderByCuentaBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaBanco,true,this);
			
			//this.cargarOrderByCuentaBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaBanco.setMinimumSize(new Dimension(400,50));//2030
		this.jTableDatosCuentaBanco.setMaximumSize(new Dimension(400,50));//2030
		this.jTableDatosCuentaBanco.setPreferredSize(new Dimension(400,50));//2030
		
		this.jScrollPanelDatosCuentaBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaBanco.setText("Nuevo");
		this.jButtonDuplicarCuentaBanco.setText("Duplicar");
		this.jButtonCopiarCuentaBanco.setText("Copiar");
		this.jButtonVerFormCuentaBanco.setText("Ver");
		this.jButtonNuevoRelacionesCuentaBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaBanco.setText("Guardar");
		this.jButtonCerrarCuentaBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaBanco,"nuevo_button","Nuevo",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaBanco,"duplicar_button","Duplicar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaBanco,"copiar_button","Copiar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaBanco,"ver_form","Ver",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaBanco,"nuevorelaciones_button","Nuevo Rel",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaBanco,"guardarcambiostabla_button","Guardar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaBanco,"cerrar_button","Salir",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaBanco.setToolTipText("Nuevo"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaBanco.setToolTipText("Duplicar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaBanco.setToolTipText("Copiar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaBanco.setToolTipText("Ver"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaBanco.setToolTipText("Nuevo Rel"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaBanco.setToolTipText("Guardar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaBanco.setToolTipText("Salir"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaBanco";
		inputMap = this.jButtonNuevoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaBanco";
		inputMap = this.jButtonDuplicarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaBanco"));
		
		//COPIAR
		sMapKey = "CopiarCuentaBanco";
		inputMap = this.jButtonCopiarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaBanco"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaBanco";
		inputMap = this.jButtonVerFormCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaBanco";
		inputMap = this.jButtonNuevoRelacionesCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaBanco";
		inputMap = this.jButtonModificarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaBanco";
		inputMap = this.jButtonCerrarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaBanco";
		inputMap = this.jButtonGuardarCambiosTablaCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaBanco.setName("jPanelParametrosReportesCuentaBanco"); 
		
		this.jPanelParametrosReportesAccionesCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaBanco.setName("jPanelParametrosReportesAccionesCuentaBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaBanco = new JButtonMe();
		this.jButtonRecargarInformacionCuentaBanco.setText("Recargar");
		this.jButtonRecargarInformacionCuentaBanco.setToolTipText("Recargar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaBanco = new JButtonMe();
		this.jButtonProcesarInformacionCuentaBanco.setText("Procesar");
		this.jButtonProcesarInformacionCuentaBanco.setToolTipText("Procesar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaBanco.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaBanco.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaBanco.setText("Accion");
		this.jComboBoxTiposAccionesCuentaBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaBanco = new JLabelMe();
		
		this.jLabelAccionesCuentaBanco.setText("Acciones");		
		this.jLabelAccionesCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaBanco = new JButtonMe();
		//this.jButtonAnterioresCuentaBanco.setText("<<");
        this.jButtonAnterioresCuentaBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaBanco = new JButtonMe();
		//this.jButtonSiguientesCuentaBanco.setText(">>");
        this.jButtonSiguientesCuentaBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaBanco,"nuevoguardarcambios_button","Nue",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaBanco";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaBanco";
		inputMap = this.jButtonRecargarInformacionCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaBanco";
		inputMap = this.jButtonSiguientesCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaBanco";
		inputMap = this.jButtonAnterioresCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaBanco.setMinimumSize(new Dimension(this.getWidth(),CuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaBanco.setMaximumSize(new Dimension(this.getWidth(),CuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaBanco.setPreferredSize(new Dimension(this.getWidth(),CuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaBanco = new GridBagLayout();

			this.jPanelPaginacionCuentaBanco.setLayout(gridaBagLayoutPaginacionCuentaBanco);						
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = 0;
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaBanco.add(this.jButtonAnterioresCuentaBanco, this.gridBagConstraintsCuentaBanco);
					
						
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaBanco.gridy = 0;
			
			this.jPanelPaginacionCuentaBanco.add(this.jButtonNuevoGuardarCambiosCuentaBanco, this.gridBagConstraintsCuentaBanco);
						
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaBanco.gridy = 0;
			this.jPanelPaginacionCuentaBanco.add(this.jButtonSiguientesCuentaBanco, this.gridBagConstraintsCuentaBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = 1;
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBanco.add(this.jButtonNuevoCuentaBanco, this.gridBagConstraintsCuentaBanco);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaBanco.gridy = 1;
				this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCuentaBanco.add(this.jButtonNuevoRelacionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
			}
			
			
			if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaBanco.gridy = 1;
				this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaBanco.add(this.jButtonGuardarCambiosTablaCuentaBanco, this.gridBagConstraintsCuentaBanco);
			}
			
			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = 1;
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBanco.add(this.jButtonDuplicarCuentaBanco, this.gridBagConstraintsCuentaBanco);
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = 1;
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBanco.add(this.jButtonCopiarCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = 1;
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaBanco.add(this.jButtonVerFormCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = 1;
			this.gridBagConstraintsCuentaBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaBanco.add(this.jButtonCerrarCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		
		this.jButtonRecargarInformacionCuentaBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaBanco.setLayout(gridaBagParametrosReportesCuentaBanco);
			this.jPanelParametrosReportesAccionesCuentaBanco.setLayout(gridaBagParametrosReportesAccionesCuentaBanco);
			
			
			this.jPanelParametrosAuxiliar1CuentaBanco.setLayout(gridaBagParametrosAuxiliar1CuentaBanco);
			this.jPanelParametrosAuxiliar2CuentaBanco.setLayout(gridaBagParametrosAuxiliar2CuentaBanco);
			this.jPanelParametrosAuxiliar3CuentaBanco.setLayout(gridaBagParametrosAuxiliar3CuentaBanco);
			this.jPanelParametrosAuxiliar4CuentaBanco.setLayout(gridaBagParametrosAuxiliar4CuentaBanco);
			//this.jPanelParametrosAuxiliar5CuentaBanco.setLayout(gridaBagParametrosAuxiliar2CuentaBanco);			
			
			
			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBanco.add(this.jButtonRecargarInformacionCuentaBanco, this.gridBagConstraintsCuentaBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaBanco.add(this.jComboBoxTiposPaginacionCuentaBanco, this.gridBagConstraintsCuentaBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaBanco.add(this.jCheckBoxConAltoMaximoTablaCuentaBanco, this.gridBagConstraintsCuentaBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaBanco.add(this.jComboBoxTiposArchivosReportesCuentaBanco, this.gridBagConstraintsCuentaBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBanco.add(this.jPanelParametrosAuxiliar1CuentaBanco, this.gridBagConstraintsCuentaBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaBanco.add(this.jComboBoxTiposReportesCuentaBanco, this.gridBagConstraintsCuentaBanco);																		
			
			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CuentaBanco.add(this.jComboBoxTiposGraficosReportesCuentaBanco, this.gridBagConstraintsCuentaBanco);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBanco.add(this.jPanelParametrosAuxiliar4CuentaBanco, this.gridBagConstraintsCuentaBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBanco.add(this.jComboBoxTiposReportesCuentaBanco, this.gridBagConstraintsCuentaBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaBanco.add(this.jCheckBoxGenerarReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBanco.add(this.jPanelParametrosAuxiliar2CuentaBanco, this.gridBagConstraintsCuentaBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaBanco.add(this.jLabelAccionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaBanco.add(this.jButtonAbrirOrderByCuentaBanco, this.gridBagConstraintsCuentaBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBanco.add(this.jComboBoxTiposSeleccionarCuentaBanco, this.gridBagConstraintsCuentaBanco);			
			
			
			/*
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaBanco.add(this.jCheckBoxSeleccionarTodosCuentaBanco, this.gridBagConstraintsCuentaBanco);
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaBanco.add(this.jCheckBoxConGraficoReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaBanco.add(this.jCheckBoxSeleccionarTodosCuentaBanco, this.gridBagConstraintsCuentaBanco);															
				
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaBanco.add(this.jCheckBoxSeleccionadosCuentaBanco, this.gridBagConstraintsCuentaBanco);															
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaBanco.add(this.jCheckBoxConGraficoReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaBanco.add(this.jPanelParametrosAuxiliar3CuentaBanco, this.gridBagConstraintsCuentaBanco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBanco.add(this.jComboBoxTiposRelacionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
				
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBanco.add(this.jComboBoxTiposAccionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
	
				
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaBanco.add(this.jTextFieldValorCampoGeneralCuentaBanco, this.gridBagConstraintsCuentaBanco);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCuentaBanco= new GridBagLayout();
		this.jPanelCamposIniciogeneralCuentaBanco.setLayout(gridaBagLayoutCamposIniciogeneralCuentaBanco);

		GridBagLayout gridaBagLayoutCamposInicioformatoCuentaBanco= new GridBagLayout();
		this.jPanelCamposInicioformatoCuentaBanco.setLayout(gridaBagLayoutCamposInicioformatoCuentaBanco);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaBanco = new GridBagLayout();

			this.jScrollPanelDatosCuentaBanco.setLayout(gridaBagLayoutDatosCuentaBanco);
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = 0;
			this.gridBagConstraintsCuentaBanco.gridx = 0;
			
			this.jScrollPanelDatosCuentaBanco.add(this.jTableDatosCuentaBanco, this.gridBagConstraintsCuentaBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaBanco.setViewportView(this.jTableDatosCuentaBanco);
		this.jTableDatosCuentaBanco.setFillsViewportHeight(true);
		this.jTableDatosCuentaBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaBanco= new GridBagLayout();
		this.jPanelAccionesCuentaBanco.setLayout(gridaBagLayoutAccionesCuentaBanco);
		
		
		/*	
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 0;
			
		this.jPanelAccionesCuentaBanco.add(this.jButtonNuevoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoCuentaBanco= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoCuentaBanco.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCuentaBanco.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCuentaBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoCuentaBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoCuentaBanco.setLayout(gridaBagLayoutBusquedaPorCodigoCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 0;
		jPanelBusquedaPorCodigoCuentaBanco.add(jLabelcodigoBusquedaPorCodigoCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 1;
		jPanelBusquedaPorCodigoCuentaBanco.add(jTextAreacodigoBusquedaPorCodigoCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 1;
		gridBagConstraintsCuentaBanco.gridx =1;
		jPanelBusquedaPorCodigoCuentaBanco.add(jButtonBusquedaPorCodigoCuentaBanco, gridBagConstraintsCuentaBanco);

		jTabbedPaneBusquedasCuentaBanco.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoCuentaBanco);
		jTabbedPaneBusquedasCuentaBanco.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroChequeCuentaBanco= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroChequeCuentaBanco.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroChequeCuentaBanco.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroChequeCuentaBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroChequeCuentaBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroChequeCuentaBanco.setLayout(gridaBagLayoutBusquedaPorNumeroChequeCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 0;
		jPanelBusquedaPorNumeroChequeCuentaBanco.add(jLabelnumero_chequeBusquedaPorNumeroChequeCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 1;
		jPanelBusquedaPorNumeroChequeCuentaBanco.add(jTextFieldnumero_chequeBusquedaPorNumeroChequeCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 1;
		gridBagConstraintsCuentaBanco.gridx =1;
		jPanelBusquedaPorNumeroChequeCuentaBanco.add(jButtonBusquedaPorNumeroChequeCuentaBanco, gridBagConstraintsCuentaBanco);

		jTabbedPaneBusquedasCuentaBanco.addTab("2.-Por No Cheque ", jPanelBusquedaPorNumeroChequeCuentaBanco);
		jTabbedPaneBusquedasCuentaBanco.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNumeroCuentaCuentaBanco= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroCuentaCuentaBanco.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroCuentaCuentaBanco.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroCuentaCuentaBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroCuentaCuentaBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroCuentaCuentaBanco.setLayout(gridaBagLayoutBusquedaPorNumeroCuentaCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 0;
		jPanelBusquedaPorNumeroCuentaCuentaBanco.add(jLabelnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 1;
		jPanelBusquedaPorNumeroCuentaCuentaBanco.add(jTextFieldnumero_cuentaBusquedaPorNumeroCuentaCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 1;
		gridBagConstraintsCuentaBanco.gridx =1;
		jPanelBusquedaPorNumeroCuentaCuentaBanco.add(jButtonBusquedaPorNumeroCuentaCuentaBanco, gridBagConstraintsCuentaBanco);

		jTabbedPaneBusquedasCuentaBanco.addTab("3.-Por No Cuenta ", jPanelBusquedaPorNumeroCuentaCuentaBanco);
		jTabbedPaneBusquedasCuentaBanco.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdBancoCuentaBanco= new GridBagLayout();
		gridaBagLayoutFK_IdBancoCuentaBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoCuentaBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoCuentaBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoCuentaBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoCuentaBanco.setLayout(gridaBagLayoutFK_IdBancoCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 0;
		jPanelFK_IdBancoCuentaBanco.add(jLabelid_bancoFK_IdBancoCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 1;
		jPanelFK_IdBancoCuentaBanco.add(jComboBoxid_bancoFK_IdBancoCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 1;
		gridBagConstraintsCuentaBanco.gridx =1;
		jPanelFK_IdBancoCuentaBanco.add(jButtonFK_IdBancoCuentaBanco, gridBagConstraintsCuentaBanco);

		jTabbedPaneBusquedasCuentaBanco.addTab("4.-Por Banco ", jPanelFK_IdBancoCuentaBanco);
		jTabbedPaneBusquedasCuentaBanco.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoCuentaBancoCuentaBanco= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoCuentaBancoCuentaBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoCuentaBancoCuentaBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoCuentaBancoCuentaBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoCuentaBancoCuentaBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoCuentaBancoCuentaBanco.setLayout(gridaBagLayoutFK_IdEstadoCuentaBancoCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 0;
		jPanelFK_IdEstadoCuentaBancoCuentaBanco.add(jLabelid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 1;
		jPanelFK_IdEstadoCuentaBancoCuentaBanco.add(jComboBoxid_estado_cuenta_bancoFK_IdEstadoCuentaBancoCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 1;
		gridBagConstraintsCuentaBanco.gridx =1;
		jPanelFK_IdEstadoCuentaBancoCuentaBanco.add(jButtonFK_IdEstadoCuentaBancoCuentaBanco, gridBagConstraintsCuentaBanco);

		jTabbedPaneBusquedasCuentaBanco.addTab("5.-Por Estado ", jPanelFK_IdEstadoCuentaBancoCuentaBanco);
		jTabbedPaneBusquedasCuentaBanco.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoCuentaBancoGlobalCuentaBanco= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalCuentaBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalCuentaBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalCuentaBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCuentaBancoGlobalCuentaBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco.setLayout(gridaBagLayoutFK_IdTipoCuentaBancoGlobalCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 0;
		jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco.add(jLabelid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 0;
		gridBagConstraintsCuentaBanco.gridx = 1;
		jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco.add(jComboBoxid_tipo_cuenta_banco_globalFK_IdTipoCuentaBancoGlobalCuentaBanco, gridBagConstraintsCuentaBanco);

		gridBagConstraintsCuentaBanco = new GridBagConstraints();
		gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaBanco.gridy = 1;
		gridBagConstraintsCuentaBanco.gridx =1;
		jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco.add(jButtonFK_IdTipoCuentaBancoGlobalCuentaBanco, gridBagConstraintsCuentaBanco);

		jTabbedPaneBusquedasCuentaBanco.addTab("6.-Por Tipo Cuenta ", jPanelFK_IdTipoCuentaBancoGlobalCuentaBanco);
		jTabbedPaneBusquedasCuentaBanco.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentabancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();						
			this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaBanco.gridx = 0;		
			//this.gridBagConstraintsCuentaBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaBanco, this.gridBagConstraintsCuentaBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaBanco.gridx = 0;		
		//this.gridBagConstraintsCuentaBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaBanco.gridx = 0;		
			this.gridBagConstraintsCuentaBanco.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaBanco.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaBanco, this.gridBagConstraintsCuentaBanco);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaBanco, this.gridBagConstraintsCuentaBanco);								
		
		
		/*
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
		*/		
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaBanco.gridx =0;
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaBanco, this.gridBagConstraintsCuentaBanco);
				
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaBanco, this.gridBagConstraintsCuentaBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CuentaBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaBanco.setLayout(gridaBagLayoutBusquedasParametrosCuentaBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaBanco, this.gridBagConstraintsCuentaBanco);
			
			
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
			
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaBanco.setName("jPanelReporteDinamicoCuentaBanco"); 
		
		this.jPanelReporteDinamicoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaBanco.setLayout(gridaBagLayoutReporteDinamicoCuentaBanco);
		
		
		this.jInternalFrameReporteDinamicoCuentaBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelColumnasSelectReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaBanco=new JScrollPane(this.jListColumnasSelectReporteCuentaBanco);
			
			this.jScrollColumnasSelectReporteCuentaBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaBanco.add(this.jListColumnasSelectReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
		this.jPanelReporteDinamicoCuentaBanco.add(this.jScrollColumnasSelectReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelRelacionesSelectReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaBanco=new JScrollPane(this.jListRelacionesSelectReporteCuentaBanco);
			
			this.jScrollRelacionesSelectReporteCuentaBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaBanco.add(this.jListRelacionesSelectReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
		this.jPanelReporteDinamicoCuentaBanco.add(this.jScrollRelacionesSelectReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCuentaBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCuentaBanco = new JLabelMe();

		this.jLabelConGraficoDinamicoCuentaBanco.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelConGraficoDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCuentaBanco.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCuentaBanco.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCuentaBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCuentaBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCuentaBanco.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBanco.add(this.jCheckBoxConGraficoDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCuentaBanco = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCuentaBanco.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelColumnaCategoriaGraficoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCuentaBanco.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCuentaBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCuentaBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCuentaBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCuentaBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCuentaBanco.add(this.jComboBoxColumnaCategoriaGraficoCuentaBanco, this.gridBagConstraintsCuentaBanco);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCuentaBanco = new JLabelMe();

		this.jLabelColumnaCategoriaValorCuentaBanco.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelColumnaCategoriaValorCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCuentaBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCuentaBanco.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCuentaBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCuentaBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCuentaBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCuentaBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCuentaBanco.add(this.jComboBoxColumnaCategoriaValorCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCuentaBanco = new JLabelMe();

		this.jLabelColumnasValoresGraficoCuentaBanco.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelColumnasValoresGraficoCuentaBanco, this.gridBagConstraintsCuentaBanco);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCuentaBanco = new JList<Reporte>();
		this.jListColumnasValoresGraficoCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCuentaBanco.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCuentaBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCuentaBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCuentaBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCuentaBanco=new JScrollPane(this.jListColumnasValoresGraficoCuentaBanco);
			
			this.jScrollColumnasValoresGraficoCuentaBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCuentaBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCuentaBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCuentaBanco.add(this.jListColumnasSelectReporteCuentaBanco, this.gridBagConstraintsCuentaBanco);
		this.jPanelReporteDinamicoCuentaBanco.add(this.jScrollColumnasValoresGraficoCuentaBanco, this.gridBagConstraintsCuentaBanco);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCuentaBanco = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCuentaBanco.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelTiposGraficosReportesDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCuentaBanco.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCuentaBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCuentaBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCuentaBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCuentaBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBanco.add(this.jComboBoxTiposGraficosReportesDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelGenerarExcelReporteDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaBanco.setToolTipText("Generar EXCEL"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaBanco.add(this.jButtonGenerarExcelReporteDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBanco.add(this.jComboBoxTiposReportesDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaBanco.add(this.jLabelTiposArchivoReporteDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBanco.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaBanco.setToolTipText("Generar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBanco.add(this.jButtonGenerarReporteDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaBanco.setToolTipText("Cancelar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaBanco.add(this.jButtonCerrarReporteDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaBanco= new JScrollPane(jPanelReporteDinamicoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaBanco);
		this.jInternalFrameReporteDinamicoCuentaBanco.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaBanco, this.gridBagConstraintsCuentaBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaBanco.setName("jPanelImportacionCuentaBanco"); 
		
		this.jPanelImportacionCuentaBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaBanco.setLayout(gridaBagLayoutImportacionCuentaBanco);
		
		
		this.jInternalFrameImportacionCuentaBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaBanco.setResizable(true);
	    this.jInternalFrameImportacionCuentaBanco.setClosable(true);
	    this.jInternalFrameImportacionCuentaBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaBanco.setResizable(true);
	    this.jInternalFrameImportacionCuentaBanco.setClosable(true);
	    this.jInternalFrameImportacionCuentaBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaBanco = new JLabelMe();

		this.jLabelArchivoImportacionCuentaBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaBanco.add(this.jLabelArchivoImportacionCuentaBanco, this.gridBagConstraintsCuentaBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaBanco = new JFileChooser();		
		this.jFileChooserImportacionCuentaBanco.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaBanco = new JButtonMe();
		this.jButtonAbrirImportacionCuentaBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaBanco.setToolTipText("Generar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBanco.add(this.jButtonAbrirImportacionCuentaBanco, this.gridBagConstraintsCuentaBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaBanco.add(this.jLabelPathArchivoImportacionCuentaBanco, this.gridBagConstraintsCuentaBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBanco.add(this.jTextFieldPathArchivoImportacionCuentaBanco, this.gridBagConstraintsCuentaBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaBanco = new JButtonMe();
		this.jButtonGenerarImportacionCuentaBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaBanco.setToolTipText("Generar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBanco.add(this.jButtonGenerarImportacionCuentaBanco, this.gridBagConstraintsCuentaBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaBanco = new JButtonMe();
		this.jButtonCerrarImportacionCuentaBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaBanco.setToolTipText("Cancelar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaBanco.add(this.jButtonCerrarImportacionCuentaBanco, this.gridBagConstraintsCuentaBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaBanco= new JScrollPane(jPanelImportacionCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaBanco);
		this.jInternalFrameImportacionCuentaBanco.getContentPane().add(this.jScrollPanelImportacionCuentaBanco, this.gridBagConstraintsCuentaBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaBanco = new JButtonMe();
			this.jButtonAbrirOrderByCuentaBanco.setText("Orden");
			this.jButtonAbrirOrderByCuentaBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaBanco";
			inputMap = this.jButtonAbrirOrderByCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaBanco.setName("jPanelOrderByCuentaBanco"); 
			
			this.jPanelOrderByCuentaBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaBanco.setLayout(gridaBagLayoutOrderByCuentaBanco);
			
			
			this.jTableDatosCuentaBancoOrderBy = new JTableMe();        
			this.jTableDatosCuentaBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaBancoOrderBy.setViewportView(this.jTableDatosCuentaBancoOrderBy);
			this.jTableDatosCuentaBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaBanco.setTitle("Orden");
			this.jInternalFrameOrderByCuentaBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaBanco.setResizable(true);
			this.jInternalFrameOrderByCuentaBanco.setClosable(true);
			this.jInternalFrameOrderByCuentaBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaBanco.ipady =150;
				
			this.jPanelOrderByCuentaBanco.add(jScrollPanelDatosCuentaBancoOrderBy, this.gridBagConstraintsCuentaBanco);//this.jTableDatosCuentaBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaBanco = new JButtonMe();
			this.jButtonCerrarOrderByCuentaBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaBanco.setToolTipText("Cancelar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaBanco.add(this.jButtonCerrarOrderByCuentaBanco, this.gridBagConstraintsCuentaBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaBanco= new JScrollPane(jPanelOrderByCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaBanco);
			
			this.jInternalFrameOrderByCuentaBanco.getContentPane().add(this.jScrollPanelOrderByCuentaBanco, this.gridBagConstraintsCuentaBanco);			
		
		} else {
			this.jButtonAbrirOrderByCuentaBanco = new JButtonMe();
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
		int iWidthTableCalculado=0;//4530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentabancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaBanco.getRowHeight();//CuentaBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaBanco.isSelected()) {
					iHeightTable=CuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaBanco.isSelected()) {
					iHeightTable=CuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaBanco!=null && this.jInternalFrameOrderByCuentaBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentabancoLogic.getCuentaBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentabancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaBanco> TraerCuentaBancoBeans(List<CuentaBanco> cuentabancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaBanco cuentabanco:cuentabancos) {
					
				if(!(CuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentabanco.setsDetalleGeneralEntityReporte(CuentaBancoConstantesFunciones.getCuentaBancoDescripcion(cuentabanco));
										
					cuentabanco.setes_banco_descripcion(CuentaBancoConstantesFunciones.getes_bancoDescripcion(cuentabanco));	
					
					

					if(cuentabanco.getPagoAutos()!=null && Funciones.existeClass(classes,PagoAuto.class)) {
						try{cuentabanco.setpagoautosDescripcionReporte(new JRBeanCollectionDataSource(PagoAutoJInternalFrame.TraerPagoAutoBeans(cuentabanco.getPagoAutos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cuentabanco.getAutoriPagoOrdenCompras()!=null && Funciones.existeClass(classes,AutoriPagoOrdenCompra.class)) {
						try{cuentabanco.setautoripagoordencomprasDescripcionReporte(new JRBeanCollectionDataSource(AutoriPagoOrdenCompraJInternalFrame.TraerAutoriPagoOrdenCompraBeans(cuentabanco.getAutoriPagoOrdenCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cuentabanco.getDetalleChequeGirados()!=null && Funciones.existeClass(classes,DetalleChequeGirado.class)) {
						try{cuentabanco.setdetallechequegiradosDescripcionReporte(new JRBeanCollectionDataSource(DetalleChequeGiradoJInternalFrame.TraerDetalleChequeGiradoBeans(cuentabanco.getDetalleChequeGirados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(cuentabanco.getAutoriPagos()!=null && Funciones.existeClass(classes,AutoriPago.class)) {
						try{cuentabanco.setautoripagosDescripcionReporte(new JRBeanCollectionDataSource(AutoriPagoJInternalFrame.TraerAutoriPagoBeans(cuentabanco.getAutoriPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cuentabanco.setsDetalleGeneralEntityReporte(cuentabanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentabancobeans.add(cuentabancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentabancos;
    }
	//PARA REPORTES FIN
}
