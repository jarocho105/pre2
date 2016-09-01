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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ParametroCarteraConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ParametroCarteraJInternalFrame extends ParametroCarteraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroCartera;
	
	protected JMenuBar jmenuBarParametroCartera;
	
	protected JMenu jmenuParametroCartera;
	protected JMenu jmenuDatosParametroCartera;
	protected JMenu jmenuArchivoParametroCartera;
	protected JMenu jmenuAccionesParametroCartera;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroCartera;	
	protected GridBagConstraints gridBagConstraintsParametroCartera;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroCarteraDetalleFormJInternalFrame jInternalFrameDetalleFormParametroCartera;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroCartera;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroCartera;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionfacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionfactura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TransaccionBeanSwingJInternalFrame transacciondeshabilitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transacciondeshabilita="";

	protected TransaccionBeanSwingJInternalFrame transaccionhabilitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionhabilita="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofactura="";

	protected TipoAutoPagoBeanSwingJInternalFrame tipoautopagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoautopago="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscal="";
	
	public ParametroCarteraSessionBean parametrocarteraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionfacturaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TransaccionSessionBean transacciondeshabilitaSessionBean;
	public TransaccionSessionBean transaccionhabilitaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public TipoFacturaSessionBean tipofacturaSessionBean;
	public TipoAutoPagoSessionBean tipoautopagoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroCartera> parametrocarteras;		
	public List<ParametroCartera> parametrocarterasEliminados;	
	public List<ParametroCartera> parametrocarterasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroCartera;		
	protected JButton jButtonAbrirOrderByParametroCartera;
	
	
	//protected JPanel jPanelOrderByParametroCartera;
	//public JScrollPane jScrollPanelOrderByParametroCartera;	
	//protected JButton jButtonCerrarOrderByParametroCartera;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroCarteraLogic parametrocarteraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroCartera;
	public JScrollPane jScrollPanelDatosEdicionParametroCartera;
	public JScrollPane jScrollPanelDatosGeneralParametroCartera;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroCarteraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroCartera;
	//public JScrollPane jScrollPanelImportacionParametroCartera;
	
	
	
	protected JPanel jPanelAccionesParametroCartera;
	
    protected JPanel jPanelPaginacionParametroCartera;
    protected JPanel jPanelParametrosReportesParametroCartera;
	protected JPanel jPanelParametrosReportesAccionesParametroCartera;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroCartera;
	protected JPanel jPanelParametrosAuxiliar2ParametroCartera;
	protected JPanel jPanelParametrosAuxiliar3ParametroCartera;
	protected JPanel jPanelParametrosAuxiliar4ParametroCartera;
	//protected JPanel jPanelParametrosAuxiliar5ParametroCartera;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroCartera;
	//protected JPanel jPanelImportacionParametroCartera;
	
	
	public JTable jTableDatosParametroCartera;
	
	
	
	//public JTable jTableDatosParametroCarteraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroCartera;
	protected JButton jButtonDuplicarParametroCartera;
	protected JButton jButtonCopiarParametroCartera;
	protected JButton jButtonVerFormParametroCartera;
	protected JButton jButtonNuevoRelacionesParametroCartera;
	protected JButton jButtonModificarParametroCartera;
	
    protected JButton jButtonGuardarCambiosTablaParametroCartera;
	protected JButton jButtonCerrarParametroCartera;
	
	
	protected JButton jButtonRecargarInformacionParametroCartera;
	protected JButton jButtonProcesarInformacionParametroCartera;
	
	
	protected JButton jButtonAnterioresParametroCartera;
	protected JButton jButtonSiguientesParametroCartera;
	protected JButton jButtonNuevoGuardarCambiosParametroCartera;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroCartera;
	//protected JButton jButtonCerrarReporteDinamicoParametroCartera;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroCartera;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroCartera;
	//protected JButton jButtonGenerarImportacionParametroCartera;
	//protected JButton jButtonCerrarImportacionParametroCartera;
	//protected JFileChooser jFileChooserImportacionParametroCartera;
	//protected File fileImportacionParametroCartera;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroCartera;
	protected JButton jButtonDuplicarToolBarParametroCartera;
	protected JButton jButtonNuevoRelacionesToolBarParametroCartera;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroCartera;
	protected JButton jButtonCopiarToolBarParametroCartera;
	protected JButton jButtonVerFormToolBarParametroCartera;
	public JButton jButtonGuardarCambiosTablaToolBarParametroCartera;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroCartera;
	protected JButton jButtonCerrarToolBarParametroCartera;
	
	protected JButton jButtonRecargarInformacionToolBarParametroCartera;
	protected JButton jButtonProcesarInformacionToolBarParametroCartera;
	protected JButton jButtonAnterioresToolBarParametroCartera;
	protected JButton jButtonSiguientesToolBarParametroCartera;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroCartera;
	protected JButton jButtonAbrirOrderByToolBarParametroCartera;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroCartera;
	protected JMenuItem jMenuItemDuplicarParametroCartera;
	protected JMenuItem jMenuItemNuevoRelacionesParametroCartera;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroCartera;
	protected JMenuItem jMenuItemCopiarParametroCartera;
	protected JMenuItem jMenuItemVerFormParametroCartera;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroCartera;
	protected JMenuItem jMenuItemCerrarParametroCartera;
	protected JMenuItem jMenuItemDetalleCerrarParametroCartera;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroCartera;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroCartera;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroCartera;
	protected JMenuItem jMenuItemProcesarInformacionParametroCartera;
	protected JMenuItem jMenuItemAnterioresParametroCartera;
	protected JMenuItem jMenuItemSiguientesParametroCartera;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroCartera;
	protected JMenuItem jMenuItemAbrirOrderByParametroCartera;
	protected JMenuItem jMenuItemMostrarOcultarParametroCartera;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroCartera;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroCartera;
	protected JCheckBox jCheckBoxSeleccionadosParametroCartera;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroCartera;
	protected JCheckBox jCheckBoxConGraficoReporteParametroCartera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroCartera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroCartera;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroCartera;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroCartera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroCartera;
	protected JTextField jTextFieldValorCampoGeneralParametroCartera;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroCartera;
	//public JList<Reporte> jListColumnasSelectReporteParametroCartera;
	//public JScrollPane jScrollColumnasSelectReporteParametroCartera;
	
	//public JLabel jLabelRelacionesSelectReporteParametroCartera;
	//public JList<Reporte> jListRelacionesSelectReporteParametroCartera;
	//public JScrollPane jScrollRelacionesSelectReporteParametroCartera;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroCartera;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroCartera;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroCartera;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroCartera;
	
		
	//public JLabel jLabelArchivoImportacionParametroCartera;	
	//public JLabel jLabelPathArchivoImportacionParametroCartera;
	//protected JTextField jTextFieldPathArchivoImportacionParametroCartera;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroCartera;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroCartera;
	
	//public JLabel jLabelColumnaCategoriaValorParametroCartera;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroCartera;
	
	//public JLabel jLabelColumnasValoresGraficoParametroCartera;
	//public JList<Reporte> jListColumnasValoresGraficoParametroCartera;
	//public JScrollPane jScrollColumnasValoresGraficoParametroCartera;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroCartera;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroCartera;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroCartera;
	public JPanel jPanelFK_IdBodegaParametroCartera;
	public JButton jButtonFK_IdBodegaParametroCartera;
	public JPanel jPanelFK_IdCuentaContableCreditoFiscalParametroCartera;
	public JButton jButtonFK_IdCuentaContableCreditoFiscalParametroCartera;
	public JPanel jPanelFK_IdEmpleadoParametroCartera;
	public JButton jButtonFK_IdEmpleadoParametroCartera;
	public JPanel jPanelFK_IdTipoAutoPagoParametroCartera;
	public JButton jButtonFK_IdTipoAutoPagoParametroCartera;
	public JPanel jPanelFK_IdTipoFacturaParametroCartera;
	public JButton jButtonFK_IdTipoFacturaParametroCartera;
	public JPanel jPanelFK_IdTransaccionDeshabilitaParametroCartera;
	public JButton jButtonFK_IdTransaccionDeshabilitaParametroCartera;
	public JPanel jPanelFK_IdTransaccionFacturaParametroCartera;
	public JButton jButtonFK_IdTransaccionFacturaParametroCartera;
	public JPanel jPanelFK_IdTransaccionHabilitaParametroCartera;
	public JButton jButtonFK_IdTransaccionHabilitaParametroCartera;
	
	public JPanel jPanelid_bodegaFK_IdBodegaParametroCartera;
	public JLabel jLabelid_bodegaFK_IdBodegaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaParametroCartera;
	public JButton jButtonid_bodegaFK_IdBodegaParametroCartera= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroCarteraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera;
	public JLabel jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera;
	public JButton jButtonid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCarteraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCarteraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoParametroCartera;
	public JLabel jLabelid_empleadoFK_IdEmpleadoParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoParametroCartera;
	public JButton jButtonid_empleadoFK_IdEmpleadoParametroCartera= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoParametroCarteraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera;
	public JLabel jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera;
	public JButton jButtonid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera= new JButtonMe();
	public JButton jButtonid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCarteraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_facturaFK_IdTipoFacturaParametroCartera;
	public JLabel jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera;
	public JButton jButtonid_tipo_facturaFK_IdTipoFacturaParametroCartera= new JButtonMe();
	public JButton jButtonid_tipo_facturaFK_IdTipoFacturaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_facturaFK_IdTipoFacturaParametroCarteraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera;
	public JLabel jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera;
	public JButton jButtonid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera= new JButtonMe();
	public JButton jButtonid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCarteraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera;
	public JLabel jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera;
	public JButton jButtonid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera= new JButtonMe();
	public JButton jButtonid_transaccion_facturaFK_IdTransaccionFacturaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_facturaFK_IdTransaccionFacturaParametroCarteraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera;
	public JLabel jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera;
	public JButton jButtonid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera= new JButtonMe();
	public JButton jButtonid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCarteraUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCarteraBusqueda= new JButtonMe();

	
	
	
	
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
	public ParametroCarteraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroCartera)	{
		this.jButtonRecargarInformacionParametroCartera = jButtonRecargarInformacionParametroCartera;
	}
	
	public JButton getjButtonProcesarInformacionParametroCartera() {
		return this.jButtonProcesarInformacionParametroCartera;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroCartera)	{
		this.jButtonProcesarInformacionParametroCartera = jButtonProcesarInformacionParametroCartera;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroCartera() {
		return this.jButtonRecargarInformacionParametroCartera;
	}
	
	
	public List<ParametroCartera> getparametrocarteras() {
		return this.parametrocarteras;
	}

	public void setparametrocarteras(List<ParametroCartera> parametrocarteras) {
		this.parametrocarteras = parametrocarteras;
	}
	
	public List<ParametroCartera> getparametrocarterasAux() {
		return this.parametrocarterasAux;
	}

	public void setparametrocarterasAux(List<ParametroCartera> parametrocarterasAux) {
		this.parametrocarterasAux = parametrocarterasAux;
	}
	
	public List<ParametroCartera> getparametrocarterasEliminados() {
		return this.parametrocarterasEliminados;
	}

	public void setParametroCarterasEliminados(List<ParametroCartera> parametrocarterasEliminados) {
		this.parametrocarterasEliminados = parametrocarterasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroCartera() {
		return jComboBoxTiposSeleccionarParametroCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroCartera(
			JComboBox jComboBoxTiposSeleccionarParametroCartera) {
		this.jComboBoxTiposSeleccionarParametroCartera = jComboBoxTiposSeleccionarParametroCartera;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroCartera .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroCartera() {
		return jTextFieldValorCampoGeneralParametroCartera;
	}

	public void setjTextFieldValorCampoGeneralParametroCartera(
			JTextField jTextFieldValorCampoGeneralParametroCartera) {
		this.jTextFieldValorCampoGeneralParametroCartera = jTextFieldValorCampoGeneralParametroCartera;
	}

	public void setBorderResaltarValorCampoGeneralParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroCartera .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroCartera() {
		return this.jCheckBoxSeleccionarTodosParametroCartera;
	}

	public void setjCheckBoxSeleccionarTodosParametroCartera(
			JCheckBox jCheckBoxSeleccionarTodosParametroCartera) {
		this.jCheckBoxSeleccionarTodosParametroCartera = jCheckBoxSeleccionarTodosParametroCartera;
	}

	public void setBorderResaltarSeleccionarTodosParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroCartera .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroCartera() {
		return this.jCheckBoxSeleccionadosParametroCartera;
	}

	public void setjCheckBoxSeleccionadosParametroCartera(
			JCheckBox jCheckBoxSeleccionadosParametroCartera) {
		this.jCheckBoxSeleccionadosParametroCartera = jCheckBoxSeleccionadosParametroCartera;
	}
	
	public void setBorderResaltarSeleccionadosParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroCartera .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroCartera() {
		return this.jComboBoxTiposArchivosReportesParametroCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroCartera(
			JComboBox jComboBoxTiposArchivosReportesParametroCartera) {
		this.jComboBoxTiposArchivosReportesParametroCartera = jComboBoxTiposArchivosReportesParametroCartera;
	}

	public void setBorderResaltarTiposArchivosReportesParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroCartera() {
		return this.jComboBoxTiposReportesParametroCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroCartera(
			JComboBox jComboBoxTiposReportesParametroCartera) {
		this.jComboBoxTiposReportesParametroCartera = jComboBoxTiposReportesParametroCartera;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroCartera() {
	//	return jComboBoxTiposReportesDinamicoParametroCartera;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroCartera(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroCartera) {
	//	this.jComboBoxTiposReportesDinamicoParametroCartera = jComboBoxTiposReportesDinamicoParametroCartera;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroCartera() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroCartera;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroCartera(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroCartera) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroCartera = jComboBoxTiposArchivosReportesDinamicoParametroCartera;
	//}
	
	public void setBorderResaltarTiposReportesParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroCartera() {
		return this.jComboBoxTiposGraficosReportesParametroCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroCartera(
			JComboBox jComboBoxTiposGraficosReportesParametroCartera) {
		this.jComboBoxTiposGraficosReportesParametroCartera = jComboBoxTiposGraficosReportesParametroCartera;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroCartera() {
		return this.jComboBoxTiposPaginacionParametroCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroCartera(
			JComboBox jComboBoxTiposPaginacionParametroCartera) {
		this.jComboBoxTiposPaginacionParametroCartera = jComboBoxTiposPaginacionParametroCartera;
	}
	
	public void setBorderResaltarTiposPaginacionParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroCartera() {
		return this.jComboBoxTiposRelacionesParametroCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroCartera() {
		return this.jComboBoxTiposAccionesParametroCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroCartera(
			JComboBox jComboBoxTiposRelacionesParametroCartera) {
		this.jComboBoxTiposRelacionesParametroCartera = jComboBoxTiposRelacionesParametroCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroCartera(
			JComboBox jComboBoxTiposAccionesParametroCartera) {
		this.jComboBoxTiposAccionesParametroCartera = jComboBoxTiposAccionesParametroCartera;
	}
	
	public void setBorderResaltarTiposRelacionesParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroCartera .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroCartera .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroCartera() {
	//	return jCheckBoxConGraficoDinamicoParametroCartera;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroCartera(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroCartera) {
	//	this.jCheckBoxConGraficoDinamicoParametroCartera = jCheckBoxConGraficoDinamicoParametroCartera;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroCartera() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroCartera.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroCartera .setBorder(borderResaltar);		
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
		this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
		
		this.parametrocarteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocarteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocarteraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroCarteraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroCarteraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroCarteraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroCarteraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroCarteraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Cartera MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroCarteraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroCartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroCartera= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"nuevo","nuevo","Nuevo"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"duplicar","duplicar","Duplicar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"copiar","copiar","Copiar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"ver_form","ver_form","Ver"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"recargar","recargar","Recargar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroCartera,this.jTtoolBarParametroCartera,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroCartera,this.jTtoolBarParametroCartera,
							"cerrar","cerrar","Salir"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroCartera=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroCartera;
			
				this.jButtonProcesarInformacionToolBarParametroCartera=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroCartera;
				
		//protected JButton jButtonModificarToolBarParametroCartera;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroCartera=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroCartera=new JMenuMe("General");
		this.jmenuArchivoParametroCartera=new JMenuMe("Archivo");
		this.jmenuAccionesParametroCartera=new JMenuMe("Acciones");
		this.jmenuDatosParametroCartera=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroCartera= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroCartera.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroCartera,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroCartera= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroCartera.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroCartera,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroCartera= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroCartera.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroCartera,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroCartera= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroCartera.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroCartera,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroCartera= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroCartera.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroCartera,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroCartera= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroCartera.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroCartera,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroCartera= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroCartera.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroCartera,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroCartera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroCartera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroCartera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroCartera= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroCartera.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroCartera,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroCartera= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroCartera.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroCartera,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroCartera= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroCartera.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroCartera,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroCartera= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroCartera.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroCartera,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroCartera= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroCartera.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroCartera,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroCartera,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroCartera= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroCartera.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroCartera,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroCartera,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroCartera= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroCartera.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroCartera,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroCartera.add(this.jMenuItemCerrarParametroCartera);
			
			this.jmenuAccionesParametroCartera.add(this.jMenuItemNuevoParametroCartera);
			this.jmenuAccionesParametroCartera.add(this.jMenuItemNuevoGuardarCambiosParametroCartera);
			this.jmenuAccionesParametroCartera.add(this.jMenuItemNuevoRelacionesParametroCartera);
			this.jmenuAccionesParametroCartera.add(this.jMenuItemGuardarCambiosTablaParametroCartera);		
			this.jmenuAccionesParametroCartera.add(this.jMenuItemDuplicarParametroCartera);		
			this.jmenuAccionesParametroCartera.add(this.jMenuItemCopiarParametroCartera);		
			this.jmenuAccionesParametroCartera.add(this.jMenuItemVerFormParametroCartera);		
			
			this.jmenuDatosParametroCartera.add(this.jMenuItemRecargarInformacionParametroCartera);				
			this.jmenuDatosParametroCartera.add(this.jMenuItemAnterioresParametroCartera);				
			this.jmenuDatosParametroCartera.add(this.jMenuItemSiguientesParametroCartera);				
			this.jmenuDatosParametroCartera.add(this.jMenuItemAbrirOrderByParametroCartera);				
			this.jmenuDatosParametroCartera.add(this.jMenuItemMostrarOcultarParametroCartera);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroCartera.add(this.jMenuItemGuardarCambiosParametroCartera);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroCartera.add(this.jmenuArchivoParametroCartera);		
			this.jmenuBarParametroCartera.add(this.jmenuAccionesParametroCartera);		
			this.jmenuBarParametroCartera.add(this.jmenuDatosParametroCartera);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroCartera);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroCartera() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaParametroCartera.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaParametroCartera= new JButtonMe();
		this.jButtonFK_IdBodegaParametroCartera.setText("Buscar");
		this.jButtonFK_IdBodegaParametroCartera.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaParametroCartera,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaParametroCartera = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaParametroCartera.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaParametroCartera.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaParametroCartera= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCreditoFiscalParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoFiscalParametroCartera.setToolTipText("Buscar Por Cuenta Contable Credito Fiscal ");
		this.jButtonFK_IdCuentaContableCreditoFiscalParametroCartera= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoFiscalParametroCartera.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoFiscalParametroCartera.setToolTipText("Buscar Por Cuenta Contable Credito Fiscal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoFiscalParametroCartera,"buscar_button","Buscar Por Cuenta Contable Credito Fiscal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoFiscalParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera = new JLabelMe();
		jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setText("Cuenta Contable Credito Fiscal :");
		jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setToolTipText("Cuenta Contable Credito Fiscal");
		jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.setFocusable(false);

		this.jPanelFK_IdEmpleadoParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoParametroCartera.setToolTipText("Buscar Por Tesorero ");
		this.jButtonFK_IdEmpleadoParametroCartera= new JButtonMe();
		this.jButtonFK_IdEmpleadoParametroCartera.setText("Buscar");
		this.jButtonFK_IdEmpleadoParametroCartera.setToolTipText("Buscar Por Tesorero ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoParametroCartera,"buscar_button","Buscar Por Tesorero ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoParametroCartera = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoParametroCartera.setText("Tesorero :");
		jLabelid_empleadoFK_IdEmpleadoParametroCartera.setToolTipText("Tesorero");
		jLabelid_empleadoFK_IdEmpleadoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoParametroCartera= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoAutoPagoParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoAutoPagoParametroCartera.setToolTipText("Buscar Por Tipo Auto Pago ");
		this.jButtonFK_IdTipoAutoPagoParametroCartera= new JButtonMe();
		this.jButtonFK_IdTipoAutoPagoParametroCartera.setText("Buscar");
		this.jButtonFK_IdTipoAutoPagoParametroCartera.setToolTipText("Buscar Por Tipo Auto Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoAutoPagoParametroCartera,"buscar_button","Buscar Por Tipo Auto Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoAutoPagoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera = new JLabelMe();
		jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setText("Tipo Auto Pago :");
		jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setToolTipText("Tipo Auto Pago");
		jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera= new JComboBoxMe();
		jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFacturaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFacturaParametroCartera.setToolTipText("Buscar Por Tipo Factura ");
		this.jButtonFK_IdTipoFacturaParametroCartera= new JButtonMe();
		this.jButtonFK_IdTipoFacturaParametroCartera.setText("Buscar");
		this.jButtonFK_IdTipoFacturaParametroCartera.setToolTipText("Buscar Por Tipo Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFacturaParametroCartera,"buscar_button","Buscar Por Tipo Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFacturaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera = new JLabelMe();
		jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera.setText("Tipo Factura :");
		jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera.setToolTipText("Tipo Factura");
		jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_facturaFK_IdTipoFacturaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera= new JComboBoxMe();
		jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionDeshabilitaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionDeshabilitaParametroCartera.setToolTipText("Buscar Por Transaccion Deshabilita ");
		this.jButtonFK_IdTransaccionDeshabilitaParametroCartera= new JButtonMe();
		this.jButtonFK_IdTransaccionDeshabilitaParametroCartera.setText("Buscar");
		this.jButtonFK_IdTransaccionDeshabilitaParametroCartera.setToolTipText("Buscar Por Transaccion Deshabilita ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionDeshabilitaParametroCartera,"buscar_button","Buscar Por Transaccion Deshabilita ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionDeshabilitaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera = new JLabelMe();
		jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setText("Transaccion Deshabilita :");
		jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setToolTipText("Transaccion Deshabilita");
		jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera= new JComboBoxMe();
		jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionFacturaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionFacturaParametroCartera.setToolTipText("Buscar Por Transaccion Factura ");
		this.jButtonFK_IdTransaccionFacturaParametroCartera= new JButtonMe();
		this.jButtonFK_IdTransaccionFacturaParametroCartera.setText("Buscar");
		this.jButtonFK_IdTransaccionFacturaParametroCartera.setToolTipText("Buscar Por Transaccion Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionFacturaParametroCartera,"buscar_button","Buscar Por Transaccion Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionFacturaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera = new JLabelMe();
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setText("Transaccion Factura :");
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setToolTipText("Transaccion Factura");
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera= new JComboBoxMe();
		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionHabilitaParametroCartera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionHabilitaParametroCartera.setToolTipText("Buscar Por Transaccion Habilita ");
		this.jButtonFK_IdTransaccionHabilitaParametroCartera= new JButtonMe();
		this.jButtonFK_IdTransaccionHabilitaParametroCartera.setText("Buscar");
		this.jButtonFK_IdTransaccionHabilitaParametroCartera.setToolTipText("Buscar Por Transaccion Habilita ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionHabilitaParametroCartera,"buscar_button","Buscar Por Transaccion Habilita ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionHabilitaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera = new JLabelMe();
		jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setText("Transaccion Habilita :");
		jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setToolTipText("Transaccion Habilita");
		jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera= new JComboBoxMe();
		jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroCartera=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroCartera.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroCartera.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroCartera.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroCartera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroCartera = new ParametroCarteraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Cartera DATOS");
			this.jInternalFrameDetalleFormParametroCartera = new ParametroCarteraDetalleFormJInternalFrame(jDesktopPane,this.parametrocarteraSessionBean.getConGuardarRelaciones(),this.parametrocarteraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroCartera = null;//new ParametroCarteraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroCartera= new GridBagLayout();
		
		
		this.jTableDatosParametroCartera = new JTableMe();      
		
		String sToolTipParametroCartera="";
		sToolTipParametroCartera=ParametroCarteraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroCartera+="(Cartera.ParametroCartera)";
		}
		
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroCartera+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroCartera.setToolTipText(sToolTipParametroCartera);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroCartera);
		this.jTableDatosParametroCartera.setAutoCreateRowSorter(true);
		this.jTableDatosParametroCartera.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroCartera.setRowSelectionAllowed(true);
		this.jTableDatosParametroCartera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroCartera,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroCartera = new JButtonMe();
		this.jButtonDuplicarParametroCartera = new JButtonMe();
		this.jButtonCopiarParametroCartera = new JButtonMe();
		this.jButtonVerFormParametroCartera = new JButtonMe();
		this.jButtonNuevoRelacionesParametroCartera = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroCartera = new JButtonMe();
		this.jButtonCerrarParametroCartera = new JButtonMe();
		
		this.jScrollPanelDatosParametroCartera = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroCartera = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Cartera";
		
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Carteras" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroCartera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroCartera.setToolTipText("Acciones");
        this.jPanelAccionesParametroCartera.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroCartera=new ReporteDinamicoJInternalFrame(ParametroCarteraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroCartera();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroCartera=new ImportacionJInternalFrame(ParametroCarteraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroCartera();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroCartera = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroCartera.setText("Orden");
		this.jButtonAbrirOrderByParametroCartera.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroCartera,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCartera,false,this);
			
			//this.cargarOrderByParametroCartera(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCartera,true,this);
			
			//this.cargarOrderByParametroCartera(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroCartera.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosParametroCartera.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosParametroCartera.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosParametroCartera.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroCartera.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroCartera.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroCartera.setText("Nuevo");
		this.jButtonDuplicarParametroCartera.setText("Duplicar");
		this.jButtonCopiarParametroCartera.setText("Copiar");
		this.jButtonVerFormParametroCartera.setText("Ver");
		this.jButtonNuevoRelacionesParametroCartera.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroCartera.setText("Guardar");
		this.jButtonCerrarParametroCartera.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroCartera,"nuevo_button","Nuevo",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroCartera,"duplicar_button","Duplicar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroCartera,"copiar_button","Copiar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroCartera,"ver_form","Ver",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroCartera,"nuevorelaciones_button","Nuevo Rel",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroCartera,"guardarcambiostabla_button","Guardar",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroCartera,"cerrar_button","Salir",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroCartera.setToolTipText("Nuevo"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroCartera.setToolTipText("Duplicar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroCartera.setToolTipText("Copiar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroCartera.setToolTipText("Ver"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroCartera.setToolTipText("Nuevo Rel"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroCartera.setToolTipText("Guardar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroCartera.setToolTipText("Salir"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroCartera";
		inputMap = this.jButtonNuevoParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroCartera"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroCartera";
		inputMap = this.jButtonDuplicarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroCartera"));
		
		//COPIAR
		sMapKey = "CopiarParametroCartera";
		inputMap = this.jButtonCopiarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroCartera"));
		
		//VEr FORM
		sMapKey = "VerFormParametroCartera";
		inputMap = this.jButtonVerFormParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroCartera"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroCartera";
		inputMap = this.jButtonNuevoRelacionesParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroCartera"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroCartera";
		inputMap = this.jButtonModificarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroCartera"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroCartera";
		inputMap = this.jButtonCerrarParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroCartera"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroCartera";
		inputMap = this.jButtonGuardarCambiosTablaParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroCartera"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroCartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroCartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroCartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroCartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroCartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroCartera.setName("jPanelParametrosReportesParametroCartera"); 
		
		this.jPanelParametrosReportesAccionesParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroCartera.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroCartera.setName("jPanelParametrosReportesAccionesParametroCartera"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroCartera, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroCartera = new JButtonMe();
		this.jButtonRecargarInformacionParametroCartera.setText("Recargar");
		this.jButtonRecargarInformacionParametroCartera.setToolTipText("Recargar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroCartera,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroCartera = new JButtonMe();
		this.jButtonProcesarInformacionParametroCartera.setText("Procesar");
		this.jButtonProcesarInformacionParametroCartera.setToolTipText("Procesar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroCartera.setVisible(false);
			
		this.jButtonProcesarInformacionParametroCartera.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroCartera.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroCartera.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCartera.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroCartera.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCartera.setText("TIPO");       
		this.jComboBoxTiposReportesParametroCartera.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroCartera.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroCartera.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroCartera.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroCartera.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroCartera.setText("Accion");
		this.jComboBoxTiposRelacionesParametroCartera.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroCartera.setText("Accion");
		this.jComboBoxTiposAccionesParametroCartera.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroCartera = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroCartera.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroCartera.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroCartera=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroCartera.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroCartera.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroCartera.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroCartera = new JLabelMe();
		
		this.jLabelAccionesParametroCartera.setText("Acciones");		
		this.jLabelAccionesParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroCartera = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroCartera.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroCartera.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroCartera = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroCartera.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroCartera.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroCartera = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroCartera.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroCartera.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroCartera = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroCartera.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroCartera.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroCartera = new JButtonMe();
		//this.jButtonAnterioresParametroCartera.setText("<<");
        this.jButtonAnterioresParametroCartera.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroCartera,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroCartera = new JButtonMe();
		//this.jButtonSiguientesParametroCartera.setText(">>");
        this.jButtonSiguientesParametroCartera.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroCartera,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroCartera = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroCartera.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroCartera.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroCartera,"nuevoguardarcambios_button","Nue",this.parametrocarteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroCartera";
		inputMap = this.jButtonNuevoGuardarCambiosParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroCartera"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroCartera";
		inputMap = this.jButtonRecargarInformacionParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroCartera"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroCartera";
		inputMap = this.jButtonSiguientesParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroCartera"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroCartera";
		inputMap = this.jButtonAnterioresParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroCartera"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroCartera();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroCartera.setMinimumSize(new Dimension(this.getWidth(),ParametroCarteraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCarteraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroCartera.setMaximumSize(new Dimension(this.getWidth(),ParametroCarteraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCarteraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroCartera.setPreferredSize(new Dimension(this.getWidth(),ParametroCarteraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroCarteraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroCartera = new GridBagLayout();

			this.jPanelPaginacionParametroCartera.setLayout(gridaBagLayoutPaginacionParametroCartera);						
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = 0;
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroCartera.add(this.jButtonAnterioresParametroCartera, this.gridBagConstraintsParametroCartera);
					
						
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroCartera.gridy = 0;
			
			this.jPanelPaginacionParametroCartera.add(this.jButtonNuevoGuardarCambiosParametroCartera, this.gridBagConstraintsParametroCartera);
						
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroCartera.gridy = 0;
			this.jPanelPaginacionParametroCartera.add(this.jButtonSiguientesParametroCartera, this.gridBagConstraintsParametroCartera);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = 1;
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCartera.add(this.jButtonNuevoParametroCartera, this.gridBagConstraintsParametroCartera);
						
			
			
			if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroCartera = new GridBagConstraints();
				this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroCartera.gridy = 1;
				this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroCartera.add(this.jButtonGuardarCambiosTablaParametroCartera, this.gridBagConstraintsParametroCartera);
			}
			
			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = 1;
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCartera.add(this.jButtonDuplicarParametroCartera, this.gridBagConstraintsParametroCartera);
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = 1;
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCartera.add(this.jButtonCopiarParametroCartera, this.gridBagConstraintsParametroCartera);
		
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = 1;
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroCartera.add(this.jButtonVerFormParametroCartera, this.gridBagConstraintsParametroCartera);
		
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = 1;
			this.gridBagConstraintsParametroCartera.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroCartera.add(this.jButtonCerrarParametroCartera, this.gridBagConstraintsParametroCartera);
		
		
		
		this.jButtonRecargarInformacionParametroCartera.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroCartera.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroCartera.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroCartera.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroCartera.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroCartera.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroCartera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroCartera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroCartera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroCartera.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroCartera.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroCartera.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroCartera.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroCartera.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroCartera.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroCartera.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroCartera.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroCartera.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroCartera.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroCartera.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroCartera.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroCartera.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroCartera.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroCartera.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroCartera.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroCartera.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroCartera.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroCartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroCartera = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroCartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroCartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroCartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroCartera = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroCartera.setLayout(gridaBagParametrosReportesParametroCartera);
			this.jPanelParametrosReportesAccionesParametroCartera.setLayout(gridaBagParametrosReportesAccionesParametroCartera);
			
			
			this.jPanelParametrosAuxiliar1ParametroCartera.setLayout(gridaBagParametrosAuxiliar1ParametroCartera);
			this.jPanelParametrosAuxiliar2ParametroCartera.setLayout(gridaBagParametrosAuxiliar2ParametroCartera);
			this.jPanelParametrosAuxiliar3ParametroCartera.setLayout(gridaBagParametrosAuxiliar3ParametroCartera);
			this.jPanelParametrosAuxiliar4ParametroCartera.setLayout(gridaBagParametrosAuxiliar4ParametroCartera);
			//this.jPanelParametrosAuxiliar5ParametroCartera.setLayout(gridaBagParametrosAuxiliar2ParametroCartera);			
			
			
			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCartera.add(this.jButtonRecargarInformacionParametroCartera, this.gridBagConstraintsParametroCartera);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCartera.add(this.jComboBoxTiposPaginacionParametroCartera, this.gridBagConstraintsParametroCartera);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCartera.add(this.jCheckBoxConAltoMaximoTablaParametroCartera, this.gridBagConstraintsParametroCartera);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroCartera.add(this.jComboBoxTiposArchivosReportesParametroCartera, this.gridBagConstraintsParametroCartera);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCartera.add(this.jPanelParametrosAuxiliar1ParametroCartera, this.gridBagConstraintsParametroCartera);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCartera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroCartera.add(this.jComboBoxTiposReportesParametroCartera, this.gridBagConstraintsParametroCartera);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCartera.add(this.jPanelParametrosAuxiliar4ParametroCartera, this.gridBagConstraintsParametroCartera);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCartera.add(this.jComboBoxTiposReportesParametroCartera, this.gridBagConstraintsParametroCartera);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCartera.add(this.jCheckBoxGenerarReporteParametroCartera, this.gridBagConstraintsParametroCartera);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCartera.add(this.jPanelParametrosAuxiliar2ParametroCartera, this.gridBagConstraintsParametroCartera);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCartera.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCartera.add(this.jLabelAccionesParametroCartera, this.gridBagConstraintsParametroCartera);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroCartera = new GridBagConstraints();
				this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroCartera.add(this.jButtonAbrirOrderByParametroCartera, this.gridBagConstraintsParametroCartera);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCartera.add(this.jComboBoxTiposSeleccionarParametroCartera, this.gridBagConstraintsParametroCartera);			
			
			
			/*
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroCartera.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroCartera.add(this.jCheckBoxSeleccionarTodosParametroCartera, this.gridBagConstraintsParametroCartera);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCartera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroCartera.add(this.jCheckBoxSeleccionarTodosParametroCartera, this.gridBagConstraintsParametroCartera);															
				
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroCartera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroCartera.add(this.jCheckBoxSeleccionadosParametroCartera, this.gridBagConstraintsParametroCartera);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroCartera.add(this.jPanelParametrosAuxiliar3ParametroCartera, this.gridBagConstraintsParametroCartera);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCartera.add(this.jComboBoxTiposAccionesParametroCartera, this.gridBagConstraintsParametroCartera);
	
				
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroCartera.add(this.jTextFieldValorCampoGeneralParametroCartera, this.gridBagConstraintsParametroCartera);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroCartera = new GridBagLayout();

			this.jScrollPanelDatosParametroCartera.setLayout(gridaBagLayoutDatosParametroCartera);
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = 0;
			this.gridBagConstraintsParametroCartera.gridx = 0;
			
			this.jScrollPanelDatosParametroCartera.add(this.jTableDatosParametroCartera, this.gridBagConstraintsParametroCartera);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroCartera.setViewportView(this.jTableDatosParametroCartera);
		this.jTableDatosParametroCartera.setFillsViewportHeight(true);
		this.jTableDatosParametroCartera.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroCartera= new GridBagLayout();
		this.jPanelAccionesParametroCartera.setLayout(gridaBagLayoutAccionesParametroCartera);
		
		
		/*	
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = 0;
		this.gridBagConstraintsParametroCartera.gridx = 0;
			
		this.jPanelAccionesParametroCartera.add(this.jButtonNuevoParametroCartera, this.gridBagConstraintsParametroCartera);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroCartera = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroCartera);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();						
			this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroCartera.gridx = 0;		
			//this.gridBagConstraintsParametroCartera.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroCartera.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroCartera, this.gridBagConstraintsParametroCartera);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroCartera.gridx = 0;		
		//this.gridBagConstraintsParametroCartera.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroCartera.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroCartera);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroCartera, this.gridBagConstraintsParametroCartera);								
		
		
		/*
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroCartera, this.gridBagConstraintsParametroCartera);
		*/		
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroCartera.gridx =0;
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroCartera.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroCartera, this.gridBagConstraintsParametroCartera);
				
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroCartera, this.gridBagConstraintsParametroCartera);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroCartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroCartera = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroCartera.setLayout(gridaBagLayoutBusquedasParametrosParametroCartera);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroCartera=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroCartera, this.gridBagConstraintsParametroCartera);
			
			
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroCartera, this.gridBagConstraintsParametroCartera);
		
			
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroCartera.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroCartera, this.gridBagConstraintsParametroCartera);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroCartera;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroCartera() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroCartera = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroCartera.setName("jPanelReporteDinamicoParametroCartera"); 
		
		this.jPanelReporteDinamicoParametroCartera.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroCartera.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroCartera.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroCartera.setLayout(gridaBagLayoutReporteDinamicoParametroCartera);
		
		
		this.jInternalFrameReporteDinamicoParametroCartera= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroCartera = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroCartera= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroCartera.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroCartera.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroCartera.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroCartera.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroCartera.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroCartera.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroCartera.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroCartera.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroCartera.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Carteras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroCartera = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroCartera.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroCartera.add(this.jLabelColumnasSelectReporteParametroCartera, this.gridBagConstraintsParametroCartera);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroCartera = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroCartera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroCartera.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroCartera.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroCartera.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroCartera.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroCartera=new JScrollPane(this.jListColumnasSelectReporteParametroCartera);
			
			this.jScrollColumnasSelectReporteParametroCartera.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroCartera.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroCartera.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroCartera.add(this.jListColumnasSelectReporteParametroCartera, this.gridBagConstraintsParametroCartera);
		this.jPanelReporteDinamicoParametroCartera.add(this.jScrollColumnasSelectReporteParametroCartera, this.gridBagConstraintsParametroCartera);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroCartera = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroCartera.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroCartera = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroCartera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroCartera.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroCartera.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroCartera.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroCartera.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroCartera=new JScrollPane(this.jListRelacionesSelectReporteParametroCartera);
			
			this.jScrollRelacionesSelectReporteParametroCartera.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroCartera.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroCartera.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroCartera = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroCartera = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroCartera = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroCartera = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroCartera.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroCartera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroCartera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroCartera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroCartera = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroCartera.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroCartera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroCartera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroCartera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroCartera = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroCartera.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroCartera.add(this.jLabelGenerarExcelReporteDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroCartera = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroCartera.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroCartera,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroCartera.setToolTipText("Generar EXCEL"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		//this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroCartera.add(this.jButtonGenerarExcelReporteDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCartera.add(this.jComboBoxTiposReportesDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroCartera = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroCartera.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroCartera.add(this.jLabelTiposArchivoReporteDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCartera.add(this.jComboBoxTiposArchivosReportesDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroCartera = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroCartera.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroCartera,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroCartera.setToolTipText("Generar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCartera.add(this.jButtonGenerarReporteDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroCartera = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroCartera.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroCartera,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroCartera.setToolTipText("Cancelar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroCartera.add(this.jButtonCerrarReporteDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroCartera = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroCartera= new JScrollPane(jPanelReporteDinamicoParametroCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroCartera.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroCartera.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroCartera.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Carteras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroCartera.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroCartera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroCartera.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroCartera);
		this.jInternalFrameReporteDinamicoParametroCartera.getContentPane().add(this.jScrollPanelReporteDinamicoParametroCartera, this.gridBagConstraintsParametroCartera);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroCartera() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroCartera = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroCartera.setName("jPanelImportacionParametroCartera"); 
		
		this.jPanelImportacionParametroCartera.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroCartera.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroCartera.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroCartera.setLayout(gridaBagLayoutImportacionParametroCartera);
		
		
		this.jInternalFrameImportacionParametroCartera= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroCartera= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroCartera = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroCartera= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroCartera.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroCartera.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroCartera.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroCartera.setResizable(true);
	    this.jInternalFrameImportacionParametroCartera.setClosable(true);
	    this.jInternalFrameImportacionParametroCartera.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroCartera.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroCartera.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroCartera.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroCartera.setResizable(true);
	    this.jInternalFrameImportacionParametroCartera.setClosable(true);
	    this.jInternalFrameImportacionParametroCartera.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroCartera.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroCartera.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroCartera.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Carteras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroCartera = new JLabelMe();

		this.jLabelArchivoImportacionParametroCartera.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroCartera.add(this.jLabelArchivoImportacionParametroCartera, this.gridBagConstraintsParametroCartera);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroCartera = new JFileChooser();		
		this.jFileChooserImportacionParametroCartera.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroCartera = new JButtonMe();
		this.jButtonAbrirImportacionParametroCartera.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroCartera,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroCartera.setToolTipText("Generar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCartera.add(this.jButtonAbrirImportacionParametroCartera, this.gridBagConstraintsParametroCartera);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroCartera = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroCartera.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroCartera.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroCartera.add(this.jLabelPathArchivoImportacionParametroCartera, this.gridBagConstraintsParametroCartera);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroCartera=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroCartera.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroCartera.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroCartera.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCartera.add(this.jTextFieldPathArchivoImportacionParametroCartera, this.gridBagConstraintsParametroCartera);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroCartera = new JButtonMe();
		this.jButtonGenerarImportacionParametroCartera.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroCartera,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroCartera.setToolTipText("Generar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCartera.add(this.jButtonGenerarImportacionParametroCartera, this.gridBagConstraintsParametroCartera);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroCartera = new JButtonMe();
		this.jButtonCerrarImportacionParametroCartera.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroCartera,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroCartera.setToolTipText("Cancelar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroCartera.add(this.jButtonCerrarImportacionParametroCartera, this.gridBagConstraintsParametroCartera);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroCartera = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroCartera= new JScrollPane(jPanelImportacionParametroCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroCartera = new GridBagConstraints();
		this.gridBagConstraintsParametroCartera.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroCartera.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroCartera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroCartera.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroCartera);
		this.jInternalFrameImportacionParametroCartera.getContentPane().add(this.jScrollPanelImportacionParametroCartera, this.gridBagConstraintsParametroCartera);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroCartera(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroCartera = new JButtonMe();
			this.jButtonAbrirOrderByParametroCartera.setText("Orden");
			this.jButtonAbrirOrderByParametroCartera.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroCartera,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroCartera";
			inputMap = this.jButtonAbrirOrderByParametroCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroCartera"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroCartera = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroCartera.setName("jPanelOrderByParametroCartera"); 
			
			this.jPanelOrderByParametroCartera.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroCartera.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroCartera.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroCartera.setLayout(gridaBagLayoutOrderByParametroCartera);
			
			
			this.jTableDatosParametroCarteraOrderBy = new JTableMe();        
			this.jTableDatosParametroCarteraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroCarteraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroCarteraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroCarteraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroCarteraOrderBy.setViewportView(this.jTableDatosParametroCarteraOrderBy);
			this.jTableDatosParametroCarteraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroCarteraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroCartera= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroCartera= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroCartera = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroCartera= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroCartera.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroCartera.setTitle("Orden");
			this.jInternalFrameOrderByParametroCartera.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroCartera.setResizable(true);
			this.jInternalFrameOrderByParametroCartera.setClosable(true);
			this.jInternalFrameOrderByParametroCartera.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroCartera.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroCartera.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroCartera.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Carteras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroCartera.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroCartera.ipady =150;
				
			this.jPanelOrderByParametroCartera.add(jScrollPanelDatosParametroCarteraOrderBy, this.gridBagConstraintsParametroCartera);//this.jTableDatosParametroCarteraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroCartera = new JButtonMe();
			this.jButtonCerrarOrderByParametroCartera.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroCartera,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroCartera.setToolTipText("Cancelar"+" "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCartera.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroCartera.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroCartera.add(this.jButtonCerrarOrderByParametroCartera, this.gridBagConstraintsParametroCartera);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroCartera = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroCartera= new JScrollPane(jPanelOrderByParametroCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroCartera = new GridBagConstraints();
			this.gridBagConstraintsParametroCartera.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroCartera.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroCartera.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroCartera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroCartera.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroCartera);
			
			this.jInternalFrameOrderByParametroCartera.getContentPane().add(this.jScrollPanelOrderByParametroCartera, this.gridBagConstraintsParametroCartera);			
		
		} else {
			this.jButtonAbrirOrderByParametroCartera = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrocarteraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroCartera.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroCartera.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroCartera.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroCartera.getRowHeight();//ParametroCarteraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroCartera.isSelected()) {
					iHeightTable=ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroCartera.isSelected()) {
					iHeightTable=ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroCarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroCartera.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroCartera.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroCartera.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroCartera.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroCartera.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroCartera.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroCartera!=null && this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroCartera.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroCartera.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroCartera.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroCartera.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroCartera.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroCartera.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrocarteraLogic.getParametroCarteras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocarteras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroCartera> TraerParametroCarteraBeans(List<ParametroCartera> parametrocarteras,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroCartera parametrocartera:parametrocarteras) {
					
				if(!(ParametroCarteraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroCarteraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrocartera.setsDetalleGeneralEntityReporte(ParametroCarteraConstantesFunciones.getParametroCarteraDescripcion(parametrocartera));
										
					parametrocartera.setpor_lotes_descripcion(ParametroCarteraConstantesFunciones.getpor_lotesDescripcion(parametrocartera));	
					
						
					
				} else  {
							
					//parametrocartera.setsDetalleGeneralEntityReporte(parametrocartera.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrocarterabeans.add(parametrocarterabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrocarteras;
    }
	//PARA REPORTES FIN
}
