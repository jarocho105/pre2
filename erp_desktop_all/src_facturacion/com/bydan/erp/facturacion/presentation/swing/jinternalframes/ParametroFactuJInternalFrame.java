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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.facturacion.util.ParametroFactuConstantesFunciones;

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
public class ParametroFactuJInternalFrame extends ParametroFactuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFactu;
	
	protected JMenuBar jmenuBarParametroFactu;
	
	protected JMenu jmenuParametroFactu;
	protected JMenu jmenuDatosParametroFactu;
	protected JMenu jmenuArchivoParametroFactu;
	protected JMenu jmenuAccionesParametroFactu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactu;	
	protected GridBagConstraints gridBagConstraintsParametroFactu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFactuDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFactu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFactu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFactu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefactuBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefactu="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefinanBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefinan="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableotroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableotro="";

	protected FormatoBeanSwingJInternalFrame formatoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoproforma="";

	protected FormatoBeanSwingJInternalFrame formatopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatopedido="";

	protected FormatoBeanSwingJInternalFrame formatofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatofactura="";

	protected FormatoBeanSwingJInternalFrame formatonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonotacredito="";

	protected FormatoBeanSwingJInternalFrame formatoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoinventario="";
	
	public ParametroFactuSessionBean parametrofactuSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CuentaContableSessionBean cuentacontablefactuSessionBean;
	public CuentaContableSessionBean cuentacontablefinanSessionBean;
	public CuentaContableSessionBean cuentacontableotroSessionBean;
	public FormatoSessionBean formatoproformaSessionBean;
	public FormatoSessionBean formatopedidoSessionBean;
	public FormatoSessionBean formatofacturaSessionBean;
	public FormatoSessionBean formatonotacreditoSessionBean;
	public FormatoSessionBean formatoinventarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFactu> parametrofactus;		
	public List<ParametroFactu> parametrofactusEliminados;	
	public List<ParametroFactu> parametrofactusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFactu;		
	protected JButton jButtonAbrirOrderByParametroFactu;
	
	
	//protected JPanel jPanelOrderByParametroFactu;
	//public JScrollPane jScrollPanelOrderByParametroFactu;	
	//protected JButton jButtonCerrarOrderByParametroFactu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFactuLogic parametrofactuLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFactu;
	public JScrollPane jScrollPanelDatosEdicionParametroFactu;
	public JScrollPane jScrollPanelDatosGeneralParametroFactu;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFactuOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFactu;
	//public JScrollPane jScrollPanelImportacionParametroFactu;
	
	
	
	protected JPanel jPanelAccionesParametroFactu;
	
    protected JPanel jPanelPaginacionParametroFactu;
    protected JPanel jPanelParametrosReportesParametroFactu;
	protected JPanel jPanelParametrosReportesAccionesParametroFactu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFactu;
	protected JPanel jPanelParametrosAuxiliar2ParametroFactu;
	protected JPanel jPanelParametrosAuxiliar3ParametroFactu;
	protected JPanel jPanelParametrosAuxiliar4ParametroFactu;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFactu;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFactu;
	//protected JPanel jPanelImportacionParametroFactu;
	
	
	public JTable jTableDatosParametroFactu;
	
	
	
	//public JTable jTableDatosParametroFactuOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFactu;
	protected JButton jButtonDuplicarParametroFactu;
	protected JButton jButtonCopiarParametroFactu;
	protected JButton jButtonVerFormParametroFactu;
	protected JButton jButtonNuevoRelacionesParametroFactu;
	protected JButton jButtonModificarParametroFactu;
	
    protected JButton jButtonGuardarCambiosTablaParametroFactu;
	protected JButton jButtonCerrarParametroFactu;
	
	
	protected JButton jButtonRecargarInformacionParametroFactu;
	protected JButton jButtonProcesarInformacionParametroFactu;
	
	
	protected JButton jButtonAnterioresParametroFactu;
	protected JButton jButtonSiguientesParametroFactu;
	protected JButton jButtonNuevoGuardarCambiosParametroFactu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFactu;
	//protected JButton jButtonCerrarReporteDinamicoParametroFactu;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFactu;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFactu;
	//protected JButton jButtonGenerarImportacionParametroFactu;
	//protected JButton jButtonCerrarImportacionParametroFactu;
	//protected JFileChooser jFileChooserImportacionParametroFactu;
	//protected File fileImportacionParametroFactu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactu;
	protected JButton jButtonDuplicarToolBarParametroFactu;
	protected JButton jButtonNuevoRelacionesToolBarParametroFactu;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFactu;
	protected JButton jButtonCopiarToolBarParametroFactu;
	protected JButton jButtonVerFormToolBarParametroFactu;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFactu;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactu;
	protected JButton jButtonCerrarToolBarParametroFactu;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFactu;
	protected JButton jButtonProcesarInformacionToolBarParametroFactu;
	protected JButton jButtonAnterioresToolBarParametroFactu;
	protected JButton jButtonSiguientesToolBarParametroFactu;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFactu;
	protected JButton jButtonAbrirOrderByToolBarParametroFactu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactu;
	protected JMenuItem jMenuItemDuplicarParametroFactu;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFactu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFactu;
	protected JMenuItem jMenuItemCopiarParametroFactu;
	protected JMenuItem jMenuItemVerFormParametroFactu;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactu;
	protected JMenuItem jMenuItemCerrarParametroFactu;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFactu;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactu;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFactu;
	protected JMenuItem jMenuItemProcesarInformacionParametroFactu;
	protected JMenuItem jMenuItemAnterioresParametroFactu;
	protected JMenuItem jMenuItemSiguientesParametroFactu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactu;
	protected JMenuItem jMenuItemAbrirOrderByParametroFactu;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFactu;
	protected JCheckBox jCheckBoxSeleccionadosParametroFactu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFactu;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFactu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFactu;
	protected JTextField jTextFieldValorCampoGeneralParametroFactu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFactu;
	//public JList<Reporte> jListColumnasSelectReporteParametroFactu;
	//public JScrollPane jScrollColumnasSelectReporteParametroFactu;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFactu;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFactu;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFactu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFactu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFactu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFactu;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFactu;
	
		
	//public JLabel jLabelArchivoImportacionParametroFactu;	
	//public JLabel jLabelPathArchivoImportacionParametroFactu;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFactu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFactu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFactu;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFactu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFactu;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFactu;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFactu;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFactu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFactu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFactu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroFactu;
	public JPanel jPanelFK_IdCuentaContableFactuParametroFactu;
	public JButton jButtonFK_IdCuentaContableFactuParametroFactu;
	public JPanel jPanelFK_IdCuentaContableFinanParametroFactu;
	public JButton jButtonFK_IdCuentaContableFinanParametroFactu;
	public JPanel jPanelFK_IdCuentaContableOtroParametroFactu;
	public JButton jButtonFK_IdCuentaContableOtroParametroFactu;
	public JPanel jPanelFK_IdFormatoFacturaParametroFactu;
	public JButton jButtonFK_IdFormatoFacturaParametroFactu;
	public JPanel jPanelFK_IdFormatoInventarioParametroFactu;
	public JButton jButtonFK_IdFormatoInventarioParametroFactu;
	public JPanel jPanelFK_IdFormatoNotaCreditoParametroFactu;
	public JButton jButtonFK_IdFormatoNotaCreditoParametroFactu;
	public JPanel jPanelFK_IdFormatoPedoParametroFactu;
	public JButton jButtonFK_IdFormatoPedoParametroFactu;
	public JPanel jPanelFK_IdFormatoProformaParametroFactu;
	public JButton jButtonFK_IdFormatoProformaParametroFactu;
	
	public JPanel jPanelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu;
	public JLabel jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu;
	public JButton jButtonid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu= new JButtonMe();
	public JButton jButtonid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactuBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactuArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu;
	
	public JPanel jPanelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu;
	public JLabel jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu;
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactuArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu;
	
	public JPanel jPanelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu;
	public JLabel jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu;
	public JButton jButtonid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactuBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactuArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu;
	
	public JPanel jPanelid_formato_facturaFK_IdFormatoFacturaParametroFactu;
	public JLabel jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_facturaFK_IdFormatoFacturaParametroFactu;
	public JButton jButtonid_formato_facturaFK_IdFormatoFacturaParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_facturaFK_IdFormatoFacturaParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_facturaFK_IdFormatoFacturaParametroFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_inventarioFK_IdFormatoInventarioParametroFactu;
	public JLabel jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_inventarioFK_IdFormatoInventarioParametroFactu;
	public JButton jButtonid_formato_inventarioFK_IdFormatoInventarioParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_inventarioFK_IdFormatoInventarioParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_inventarioFK_IdFormatoInventarioParametroFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu;
	public JLabel jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu;
	public JButton jButtonid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_pedidoFK_IdFormatoPedoParametroFactu;
	public JLabel jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroFactu;
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedoParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedoParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedoParametroFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_proformaFK_IdFormatoProformaParametroFactu;
	public JLabel jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_proformaFK_IdFormatoProformaParametroFactu;
	public JButton jButtonid_formato_proformaFK_IdFormatoProformaParametroFactu= new JButtonMe();
	public JButton jButtonid_formato_proformaFK_IdFormatoProformaParametroFactuUpdate= new JButtonMe();
	public JButton jButtonid_formato_proformaFK_IdFormatoProformaParametroFactuBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
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
	public ParametroFactuJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFactu)	{
		this.jButtonRecargarInformacionParametroFactu = jButtonRecargarInformacionParametroFactu;
	}
	
	public JButton getjButtonProcesarInformacionParametroFactu() {
		return this.jButtonProcesarInformacionParametroFactu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactu)	{
		this.jButtonProcesarInformacionParametroFactu = jButtonProcesarInformacionParametroFactu;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFactu() {
		return this.jButtonRecargarInformacionParametroFactu;
	}
	
	
	public List<ParametroFactu> getparametrofactus() {
		return this.parametrofactus;
	}

	public void setparametrofactus(List<ParametroFactu> parametrofactus) {
		this.parametrofactus = parametrofactus;
	}
	
	public List<ParametroFactu> getparametrofactusAux() {
		return this.parametrofactusAux;
	}

	public void setparametrofactusAux(List<ParametroFactu> parametrofactusAux) {
		this.parametrofactusAux = parametrofactusAux;
	}
	
	public List<ParametroFactu> getparametrofactusEliminados() {
		return this.parametrofactusEliminados;
	}

	public void setParametroFactusEliminados(List<ParametroFactu> parametrofactusEliminados) {
		this.parametrofactusEliminados = parametrofactusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFactu() {
		return jComboBoxTiposSeleccionarParametroFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFactu(
			JComboBox jComboBoxTiposSeleccionarParametroFactu) {
		this.jComboBoxTiposSeleccionarParametroFactu = jComboBoxTiposSeleccionarParametroFactu;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFactu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFactu() {
		return jTextFieldValorCampoGeneralParametroFactu;
	}

	public void setjTextFieldValorCampoGeneralParametroFactu(
			JTextField jTextFieldValorCampoGeneralParametroFactu) {
		this.jTextFieldValorCampoGeneralParametroFactu = jTextFieldValorCampoGeneralParametroFactu;
	}

	public void setBorderResaltarValorCampoGeneralParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFactu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFactu() {
		return this.jCheckBoxSeleccionarTodosParametroFactu;
	}

	public void setjCheckBoxSeleccionarTodosParametroFactu(
			JCheckBox jCheckBoxSeleccionarTodosParametroFactu) {
		this.jCheckBoxSeleccionarTodosParametroFactu = jCheckBoxSeleccionarTodosParametroFactu;
	}

	public void setBorderResaltarSeleccionarTodosParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFactu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFactu() {
		return this.jCheckBoxSeleccionadosParametroFactu;
	}

	public void setjCheckBoxSeleccionadosParametroFactu(
			JCheckBox jCheckBoxSeleccionadosParametroFactu) {
		this.jCheckBoxSeleccionadosParametroFactu = jCheckBoxSeleccionadosParametroFactu;
	}
	
	public void setBorderResaltarSeleccionadosParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFactu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFactu() {
		return this.jComboBoxTiposArchivosReportesParametroFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFactu(
			JComboBox jComboBoxTiposArchivosReportesParametroFactu) {
		this.jComboBoxTiposArchivosReportesParametroFactu = jComboBoxTiposArchivosReportesParametroFactu;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFactu() {
		return this.jComboBoxTiposReportesParametroFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFactu(
			JComboBox jComboBoxTiposReportesParametroFactu) {
		this.jComboBoxTiposReportesParametroFactu = jComboBoxTiposReportesParametroFactu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFactu() {
	//	return jComboBoxTiposReportesDinamicoParametroFactu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFactu(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFactu) {
	//	this.jComboBoxTiposReportesDinamicoParametroFactu = jComboBoxTiposReportesDinamicoParametroFactu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFactu() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFactu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFactu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFactu = jComboBoxTiposArchivosReportesDinamicoParametroFactu;
	//}
	
	public void setBorderResaltarTiposReportesParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFactu() {
		return this.jComboBoxTiposGraficosReportesParametroFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFactu(
			JComboBox jComboBoxTiposGraficosReportesParametroFactu) {
		this.jComboBoxTiposGraficosReportesParametroFactu = jComboBoxTiposGraficosReportesParametroFactu;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFactu() {
		return this.jComboBoxTiposPaginacionParametroFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFactu(
			JComboBox jComboBoxTiposPaginacionParametroFactu) {
		this.jComboBoxTiposPaginacionParametroFactu = jComboBoxTiposPaginacionParametroFactu;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFactu() {
		return this.jComboBoxTiposRelacionesParametroFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactu() {
		return this.jComboBoxTiposAccionesParametroFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactu(
			JComboBox jComboBoxTiposRelacionesParametroFactu) {
		this.jComboBoxTiposRelacionesParametroFactu = jComboBoxTiposRelacionesParametroFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactu(
			JComboBox jComboBoxTiposAccionesParametroFactu) {
		this.jComboBoxTiposAccionesParametroFactu = jComboBoxTiposAccionesParametroFactu;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFactu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFactu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFactu() {
	//	return jCheckBoxConGraficoDinamicoParametroFactu;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFactu(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFactu) {
	//	this.jCheckBoxConGraficoDinamicoParametroFactu = jCheckBoxConGraficoDinamicoParametroFactu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFactu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFactu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFactu .setBorder(borderResaltar);		
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
		this.parametrofactuSessionBean=new ParametroFactuSessionBean();
		
		this.parametrofactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactuSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFactuJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Factu MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFactu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"nuevo","nuevo","Nuevo"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"duplicar","duplicar","Duplicar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"copiar","copiar","Copiar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"ver_form","ver_form","Ver"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"recargar","recargar","Recargar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFactu,this.jTtoolBarParametroFactu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFactu,this.jTtoolBarParametroFactu,
							"cerrar","cerrar","Salir"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFactu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFactu;
			
				this.jButtonProcesarInformacionToolBarParametroFactu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFactu;
				
		//protected JButton jButtonModificarToolBarParametroFactu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFactu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFactu=new JMenuMe("General");
		this.jmenuArchivoParametroFactu=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFactu=new JMenuMe("Acciones");
		this.jmenuDatosParametroFactu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFactu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFactu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFactu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFactu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFactu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFactu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFactu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFactu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFactu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFactu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFactu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFactu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFactu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFactu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFactu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFactu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFactu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFactu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFactu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFactu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFactu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFactu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFactu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFactu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFactu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFactu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFactu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFactu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFactu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFactu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFactu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFactu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFactu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFactu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFactu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFactu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFactu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFactu.add(this.jMenuItemCerrarParametroFactu);
			
			this.jmenuAccionesParametroFactu.add(this.jMenuItemNuevoParametroFactu);
			this.jmenuAccionesParametroFactu.add(this.jMenuItemNuevoGuardarCambiosParametroFactu);
			this.jmenuAccionesParametroFactu.add(this.jMenuItemNuevoRelacionesParametroFactu);
			this.jmenuAccionesParametroFactu.add(this.jMenuItemGuardarCambiosTablaParametroFactu);		
			this.jmenuAccionesParametroFactu.add(this.jMenuItemDuplicarParametroFactu);		
			this.jmenuAccionesParametroFactu.add(this.jMenuItemCopiarParametroFactu);		
			this.jmenuAccionesParametroFactu.add(this.jMenuItemVerFormParametroFactu);		
			
			this.jmenuDatosParametroFactu.add(this.jMenuItemRecargarInformacionParametroFactu);				
			this.jmenuDatosParametroFactu.add(this.jMenuItemAnterioresParametroFactu);				
			this.jmenuDatosParametroFactu.add(this.jMenuItemSiguientesParametroFactu);				
			this.jmenuDatosParametroFactu.add(this.jMenuItemAbrirOrderByParametroFactu);				
			this.jmenuDatosParametroFactu.add(this.jMenuItemMostrarOcultarParametroFactu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFactu.add(this.jMenuItemGuardarCambiosParametroFactu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFactu.add(this.jmenuArchivoParametroFactu);		
			this.jmenuBarParametroFactu.add(this.jmenuAccionesParametroFactu);		
			this.jmenuBarParametroFactu.add(this.jmenuDatosParametroFactu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFactu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFactu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableFactuParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFactuParametroFactu.setToolTipText("Buscar Por Cuenta Contable Factu ");
		this.jButtonFK_IdCuentaContableFactuParametroFactu= new JButtonMe();
		this.jButtonFK_IdCuentaContableFactuParametroFactu.setText("Buscar");
		this.jButtonFK_IdCuentaContableFactuParametroFactu.setToolTipText("Buscar Por Cuenta Contable Factu ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFactuParametroFactu,"buscar_button","Buscar Por Cuenta Contable Factu ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFactuParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu = new JLabelMe();
		jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setText("Cuenta Contable Factu :");
		jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setToolTipText("Cuenta Contable Factu");
		jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu= new JComboBoxMe();
		jComboBoxid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu.setFocusable(false);

		this.jPanelFK_IdCuentaContableFinanParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFinanParametroFactu.setToolTipText("Buscar Por Cuenta Contable Finan ");
		this.jButtonFK_IdCuentaContableFinanParametroFactu= new JButtonMe();
		this.jButtonFK_IdCuentaContableFinanParametroFactu.setText("Buscar");
		this.jButtonFK_IdCuentaContableFinanParametroFactu.setToolTipText("Buscar Por Cuenta Contable Finan ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFinanParametroFactu,"buscar_button","Buscar Por Cuenta Contable Finan ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFinanParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu = new JLabelMe();
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setText("Cuenta Contable Finan :");
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setToolTipText("Cuenta Contable Finan");
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu= new JComboBoxMe();
		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu.setFocusable(false);

		this.jPanelFK_IdCuentaContableOtroParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableOtroParametroFactu.setToolTipText("Buscar Por Cuenta Contable Otro ");
		this.jButtonFK_IdCuentaContableOtroParametroFactu= new JButtonMe();
		this.jButtonFK_IdCuentaContableOtroParametroFactu.setText("Buscar");
		this.jButtonFK_IdCuentaContableOtroParametroFactu.setToolTipText("Buscar Por Cuenta Contable Otro ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableOtroParametroFactu,"buscar_button","Buscar Por Cuenta Contable Otro ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableOtroParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu = new JLabelMe();
		jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setText("Cuenta Contable Otro :");
		jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setToolTipText("Cuenta Contable Otro");
		jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu= new JComboBoxMe();
		jComboBoxid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu.setFocusable(false);

		this.jPanelFK_IdFormatoFacturaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoFacturaParametroFactu.setToolTipText("Buscar Por Formato Factura ");
		this.jButtonFK_IdFormatoFacturaParametroFactu= new JButtonMe();
		this.jButtonFK_IdFormatoFacturaParametroFactu.setText("Buscar");
		this.jButtonFK_IdFormatoFacturaParametroFactu.setToolTipText("Buscar Por Formato Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoFacturaParametroFactu,"buscar_button","Buscar Por Formato Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoFacturaParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu = new JLabelMe();
		jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu.setText("Formato Factura :");
		jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu.setToolTipText("Formato Factura");
		jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_facturaFK_IdFormatoFacturaParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_facturaFK_IdFormatoFacturaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaFK_IdFormatoFacturaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaFK_IdFormatoFacturaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_facturaFK_IdFormatoFacturaParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoInventarioParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoInventarioParametroFactu.setToolTipText("Buscar Por Formato Inventario ");
		this.jButtonFK_IdFormatoInventarioParametroFactu= new JButtonMe();
		this.jButtonFK_IdFormatoInventarioParametroFactu.setText("Buscar");
		this.jButtonFK_IdFormatoInventarioParametroFactu.setToolTipText("Buscar Por Formato Inventario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoInventarioParametroFactu,"buscar_button","Buscar Por Formato Inventario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoInventarioParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu = new JLabelMe();
		jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setText("Formato Inventario :");
		jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setToolTipText("Formato Inventario");
		jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_inventarioFK_IdFormatoInventarioParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_inventarioFK_IdFormatoInventarioParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_inventarioFK_IdFormatoInventarioParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNotaCreditoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNotaCreditoParametroFactu.setToolTipText("Buscar Por Formato Nota Credito ");
		this.jButtonFK_IdFormatoNotaCreditoParametroFactu= new JButtonMe();
		this.jButtonFK_IdFormatoNotaCreditoParametroFactu.setText("Buscar");
		this.jButtonFK_IdFormatoNotaCreditoParametroFactu.setToolTipText("Buscar Por Formato Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNotaCreditoParametroFactu,"buscar_button","Buscar Por Formato Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNotaCreditoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu = new JLabelMe();
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setText("Formato Nota Credito :");
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setToolTipText("Formato Nota Credito");
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoPedoParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoPedoParametroFactu.setToolTipText("Buscar Por Formato Pedo ");
		this.jButtonFK_IdFormatoPedoParametroFactu= new JButtonMe();
		this.jButtonFK_IdFormatoPedoParametroFactu.setText("Buscar");
		this.jButtonFK_IdFormatoPedoParametroFactu.setToolTipText("Buscar Por Formato Pedo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoPedoParametroFactu,"buscar_button","Buscar Por Formato Pedo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoPedoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu = new JLabelMe();
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu.setText("Formato Pedo :");
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu.setToolTipText("Formato Pedo");
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoProformaParametroFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoProformaParametroFactu.setToolTipText("Buscar Por Formato Proforma ");
		this.jButtonFK_IdFormatoProformaParametroFactu= new JButtonMe();
		this.jButtonFK_IdFormatoProformaParametroFactu.setText("Buscar");
		this.jButtonFK_IdFormatoProformaParametroFactu.setToolTipText("Buscar Por Formato Proforma ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoProformaParametroFactu,"buscar_button","Buscar Por Formato Proforma ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoProformaParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu = new JLabelMe();
		jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu.setText("Formato Proforma :");
		jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu.setToolTipText("Formato Proforma");
		jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_proformaFK_IdFormatoProformaParametroFactu= new JComboBoxMe();
		jComboBoxid_formato_proformaFK_IdFormatoProformaParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_proformaFK_IdFormatoProformaParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_proformaFK_IdFormatoProformaParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_proformaFK_IdFormatoProformaParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroFactu=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroFactu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFactu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFactu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroFactu = new ParametroFactuDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Factu DATOS");
			this.jInternalFrameDetalleFormParametroFactu = new ParametroFactuDetalleFormJInternalFrame(jDesktopPane,this.parametrofactuSessionBean.getConGuardarRelaciones(),this.parametrofactuSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFactu = null;//new ParametroFactuDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactu= new GridBagLayout();
		
		
		this.jTableDatosParametroFactu = new JTableMe();      
		
		String sToolTipParametroFactu="";
		sToolTipParametroFactu=ParametroFactuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactu+="(Facturacion.ParametroFactu)";
		}
		
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFactu.setToolTipText(sToolTipParametroFactu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFactu);
		this.jTableDatosParametroFactu.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFactu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFactu.setRowSelectionAllowed(true);
		this.jTableDatosParametroFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFactu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFactu = new JButtonMe();
		this.jButtonDuplicarParametroFactu = new JButtonMe();
		this.jButtonCopiarParametroFactu = new JButtonMe();
		this.jButtonVerFormParametroFactu = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFactu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFactu = new JButtonMe();
		this.jButtonCerrarParametroFactu = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactu = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFactu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Factu";
		
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Factus" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactu.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroFactu=new ReporteDinamicoJInternalFrame(ParametroFactuConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFactu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFactu=new ImportacionJInternalFrame(ParametroFactuConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFactu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFactu = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFactu.setText("Orden");
		this.jButtonAbrirOrderByParametroFactu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactu,false,this);
			
			//this.cargarOrderByParametroFactu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactu,true,this);
			
			//this.cargarOrderByParametroFactu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFactu.setMinimumSize(new Dimension(400,50));//2330
		this.jTableDatosParametroFactu.setMaximumSize(new Dimension(400,50));//2330
		this.jTableDatosParametroFactu.setPreferredSize(new Dimension(400,50));//2330
		
		this.jScrollPanelDatosParametroFactu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFactu.setText("Nuevo");
		this.jButtonDuplicarParametroFactu.setText("Duplicar");
		this.jButtonCopiarParametroFactu.setText("Copiar");
		this.jButtonVerFormParametroFactu.setText("Ver");
		this.jButtonNuevoRelacionesParametroFactu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFactu.setText("Guardar");
		this.jButtonCerrarParametroFactu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactu,"nuevo_button","Nuevo",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFactu,"duplicar_button","Duplicar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFactu,"copiar_button","Copiar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFactu,"ver_form","Ver",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFactu,"nuevorelaciones_button","Nuevo Rel",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactu,"guardarcambiostabla_button","Guardar",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactu,"cerrar_button","Salir",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFactu.setToolTipText("Nuevo"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFactu.setToolTipText("Duplicar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFactu.setToolTipText("Copiar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFactu.setToolTipText("Ver"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFactu.setToolTipText("Nuevo Rel"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFactu.setToolTipText("Guardar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactu.setToolTipText("Salir"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactu";
		inputMap = this.jButtonNuevoParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactu"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFactu";
		inputMap = this.jButtonDuplicarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFactu"));
		
		//COPIAR
		sMapKey = "CopiarParametroFactu";
		inputMap = this.jButtonCopiarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFactu"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFactu";
		inputMap = this.jButtonVerFormParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFactu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFactu";
		inputMap = this.jButtonNuevoRelacionesParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFactu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFactu";
		inputMap = this.jButtonModificarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFactu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFactu";
		inputMap = this.jButtonCerrarParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactu";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFactu.setName("jPanelParametrosReportesParametroFactu"); 
		
		this.jPanelParametrosReportesAccionesParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFactu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFactu.setName("jPanelParametrosReportesAccionesParametroFactu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFactu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFactu = new JButtonMe();
		this.jButtonRecargarInformacionParametroFactu.setText("Recargar");
		this.jButtonRecargarInformacionParametroFactu.setToolTipText("Recargar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFactu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFactu = new JButtonMe();
		this.jButtonProcesarInformacionParametroFactu.setText("Procesar");
		this.jButtonProcesarInformacionParametroFactu.setToolTipText("Procesar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFactu.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFactu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFactu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactu.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFactu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFactu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFactu.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFactu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFactu.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFactu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactu.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFactu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFactu.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFactu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFactu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFactu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFactu = new JLabelMe();
		
		this.jLabelAccionesParametroFactu.setText("Acciones");		
		this.jLabelAccionesParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFactu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFactu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFactu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFactu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFactu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFactu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFactu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFactu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFactu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFactu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFactu.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFactu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFactu = new JButtonMe();
		//this.jButtonAnterioresParametroFactu.setText("<<");
        this.jButtonAnterioresParametroFactu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFactu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFactu = new JButtonMe();
		//this.jButtonSiguientesParametroFactu.setText(">>");
        this.jButtonSiguientesParametroFactu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFactu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFactu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFactu.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFactu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFactu,"nuevoguardarcambios_button","Nue",this.parametrofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFactu";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFactu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFactu";
		inputMap = this.jButtonRecargarInformacionParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFactu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFactu";
		inputMap = this.jButtonSiguientesParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFactu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFactu";
		inputMap = this.jButtonAnterioresParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFactu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFactu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFactu.setMinimumSize(new Dimension(this.getWidth(),ParametroFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactu.setMaximumSize(new Dimension(this.getWidth(),ParametroFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactu.setPreferredSize(new Dimension(this.getWidth(),ParametroFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFactu = new GridBagLayout();

			this.jPanelPaginacionParametroFactu.setLayout(gridaBagLayoutPaginacionParametroFactu);						
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = 0;
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFactu.add(this.jButtonAnterioresParametroFactu, this.gridBagConstraintsParametroFactu);
					
						
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactu.gridy = 0;
			
			this.jPanelPaginacionParametroFactu.add(this.jButtonNuevoGuardarCambiosParametroFactu, this.gridBagConstraintsParametroFactu);
						
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactu.gridy = 0;
			this.jPanelPaginacionParametroFactu.add(this.jButtonSiguientesParametroFactu, this.gridBagConstraintsParametroFactu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = 1;
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactu.add(this.jButtonNuevoParametroFactu, this.gridBagConstraintsParametroFactu);
						
			
			
			if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFactu = new GridBagConstraints();
				this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFactu.gridy = 1;
				this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFactu.add(this.jButtonGuardarCambiosTablaParametroFactu, this.gridBagConstraintsParametroFactu);
			}
			
			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = 1;
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactu.add(this.jButtonDuplicarParametroFactu, this.gridBagConstraintsParametroFactu);
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = 1;
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactu.add(this.jButtonCopiarParametroFactu, this.gridBagConstraintsParametroFactu);
		
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = 1;
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactu.add(this.jButtonVerFormParametroFactu, this.gridBagConstraintsParametroFactu);
		
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = 1;
			this.gridBagConstraintsParametroFactu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFactu.add(this.jButtonCerrarParametroFactu, this.gridBagConstraintsParametroFactu);
		
		
		
		this.jButtonRecargarInformacionParametroFactu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFactu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFactu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFactu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFactu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFactu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFactu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFactu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFactu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFactu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFactu.setLayout(gridaBagParametrosReportesParametroFactu);
			this.jPanelParametrosReportesAccionesParametroFactu.setLayout(gridaBagParametrosReportesAccionesParametroFactu);
			
			
			this.jPanelParametrosAuxiliar1ParametroFactu.setLayout(gridaBagParametrosAuxiliar1ParametroFactu);
			this.jPanelParametrosAuxiliar2ParametroFactu.setLayout(gridaBagParametrosAuxiliar2ParametroFactu);
			this.jPanelParametrosAuxiliar3ParametroFactu.setLayout(gridaBagParametrosAuxiliar3ParametroFactu);
			this.jPanelParametrosAuxiliar4ParametroFactu.setLayout(gridaBagParametrosAuxiliar4ParametroFactu);
			//this.jPanelParametrosAuxiliar5ParametroFactu.setLayout(gridaBagParametrosAuxiliar2ParametroFactu);			
			
			
			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactu.add(this.jButtonRecargarInformacionParametroFactu, this.gridBagConstraintsParametroFactu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactu.add(this.jComboBoxTiposPaginacionParametroFactu, this.gridBagConstraintsParametroFactu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactu.add(this.jCheckBoxConAltoMaximoTablaParametroFactu, this.gridBagConstraintsParametroFactu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactu.add(this.jComboBoxTiposArchivosReportesParametroFactu, this.gridBagConstraintsParametroFactu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactu.add(this.jPanelParametrosAuxiliar1ParametroFactu, this.gridBagConstraintsParametroFactu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFactu.add(this.jComboBoxTiposReportesParametroFactu, this.gridBagConstraintsParametroFactu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactu.add(this.jPanelParametrosAuxiliar4ParametroFactu, this.gridBagConstraintsParametroFactu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactu.add(this.jComboBoxTiposReportesParametroFactu, this.gridBagConstraintsParametroFactu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactu.add(this.jCheckBoxGenerarReporteParametroFactu, this.gridBagConstraintsParametroFactu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactu.add(this.jPanelParametrosAuxiliar2ParametroFactu, this.gridBagConstraintsParametroFactu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactu.add(this.jLabelAccionesParametroFactu, this.gridBagConstraintsParametroFactu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFactu = new GridBagConstraints();
				this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFactu.add(this.jButtonAbrirOrderByParametroFactu, this.gridBagConstraintsParametroFactu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactu.add(this.jComboBoxTiposSeleccionarParametroFactu, this.gridBagConstraintsParametroFactu);			
			
			
			/*
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactu.add(this.jCheckBoxSeleccionarTodosParametroFactu, this.gridBagConstraintsParametroFactu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactu.add(this.jCheckBoxSeleccionarTodosParametroFactu, this.gridBagConstraintsParametroFactu);															
				
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactu.add(this.jCheckBoxSeleccionadosParametroFactu, this.gridBagConstraintsParametroFactu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactu.add(this.jPanelParametrosAuxiliar3ParametroFactu, this.gridBagConstraintsParametroFactu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactu.add(this.jComboBoxTiposAccionesParametroFactu, this.gridBagConstraintsParametroFactu);
	
				
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactu.add(this.jTextFieldValorCampoGeneralParametroFactu, this.gridBagConstraintsParametroFactu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFactu = new GridBagLayout();

			this.jScrollPanelDatosParametroFactu.setLayout(gridaBagLayoutDatosParametroFactu);
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = 0;
			this.gridBagConstraintsParametroFactu.gridx = 0;
			
			this.jScrollPanelDatosParametroFactu.add(this.jTableDatosParametroFactu, this.gridBagConstraintsParametroFactu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFactu.setViewportView(this.jTableDatosParametroFactu);
		this.jTableDatosParametroFactu.setFillsViewportHeight(true);
		this.jTableDatosParametroFactu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFactu= new GridBagLayout();
		this.jPanelAccionesParametroFactu.setLayout(gridaBagLayoutAccionesParametroFactu);
		
		
		/*	
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = 0;
		this.gridBagConstraintsParametroFactu.gridx = 0;
			
		this.jPanelAccionesParametroFactu.add(this.jButtonNuevoParametroFactu, this.gridBagConstraintsParametroFactu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableFactuParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFactuParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFactuParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFactuParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFactuParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFactuParametroFactu.setLayout(gridaBagLayoutFK_IdCuentaContableFactuParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdCuentaContableFactuParametroFactu.add(jLabelid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdCuentaContableFactuParametroFactu.add(jComboBoxid_cuenta_contable_factuFK_IdCuentaContableFactuParametroFactu, gridBagConstraintsParametroFactu);


		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdCuentaContableFactuParametroFactu.add(this.jButtonBuscarFK_IdCuentaContableFactuid_cuenta_contable_factuParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdCuentaContableFactuParametroFactu.add(jButtonFK_IdCuentaContableFactuParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("1.-Por Cuenta Contable Factu ", jPanelFK_IdCuentaContableFactuParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableFinanParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFinanParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFinanParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFinanParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFinanParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFinanParametroFactu.setLayout(gridaBagLayoutFK_IdCuentaContableFinanParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdCuentaContableFinanParametroFactu.add(jLabelid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdCuentaContableFinanParametroFactu.add(jComboBoxid_cuenta_contable_finanFK_IdCuentaContableFinanParametroFactu, gridBagConstraintsParametroFactu);


		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdCuentaContableFinanParametroFactu.add(this.jButtonBuscarFK_IdCuentaContableFinanid_cuenta_contable_finanParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdCuentaContableFinanParametroFactu.add(jButtonFK_IdCuentaContableFinanParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("2.-Por Cuenta Contable Finan ", jPanelFK_IdCuentaContableFinanParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableOtroParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableOtroParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableOtroParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableOtroParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableOtroParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableOtroParametroFactu.setLayout(gridaBagLayoutFK_IdCuentaContableOtroParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdCuentaContableOtroParametroFactu.add(jLabelid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdCuentaContableOtroParametroFactu.add(jComboBoxid_cuenta_contable_otroFK_IdCuentaContableOtroParametroFactu, gridBagConstraintsParametroFactu);


		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.EAST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.NONE;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdCuentaContableOtroParametroFactu.add(this.jButtonBuscarFK_IdCuentaContableOtroid_cuenta_contable_otroParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdCuentaContableOtroParametroFactu.add(jButtonFK_IdCuentaContableOtroParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("3.-Por Cuenta Contable Otro ", jPanelFK_IdCuentaContableOtroParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFormatoFacturaParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoFacturaParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoFacturaParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoFacturaParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoFacturaParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoFacturaParametroFactu.setLayout(gridaBagLayoutFK_IdFormatoFacturaParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdFormatoFacturaParametroFactu.add(jLabelid_formato_facturaFK_IdFormatoFacturaParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdFormatoFacturaParametroFactu.add(jComboBoxid_formato_facturaFK_IdFormatoFacturaParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdFormatoFacturaParametroFactu.add(jButtonFK_IdFormatoFacturaParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("4.-Por Formato Factura ", jPanelFK_IdFormatoFacturaParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFormatoInventarioParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoInventarioParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoInventarioParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoInventarioParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoInventarioParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoInventarioParametroFactu.setLayout(gridaBagLayoutFK_IdFormatoInventarioParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdFormatoInventarioParametroFactu.add(jLabelid_formato_inventarioFK_IdFormatoInventarioParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdFormatoInventarioParametroFactu.add(jComboBoxid_formato_inventarioFK_IdFormatoInventarioParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdFormatoInventarioParametroFactu.add(jButtonFK_IdFormatoInventarioParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("5.-Por Formato Inventario ", jPanelFK_IdFormatoInventarioParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFormatoNotaCreditoParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNotaCreditoParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaCreditoParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaCreditoParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNotaCreditoParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNotaCreditoParametroFactu.setLayout(gridaBagLayoutFK_IdFormatoNotaCreditoParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdFormatoNotaCreditoParametroFactu.add(jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdFormatoNotaCreditoParametroFactu.add(jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdFormatoNotaCreditoParametroFactu.add(jButtonFK_IdFormatoNotaCreditoParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("6.-Por Formato Nota Credito ", jPanelFK_IdFormatoNotaCreditoParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdFormatoPedoParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoPedoParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedoParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedoParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoPedoParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoPedoParametroFactu.setLayout(gridaBagLayoutFK_IdFormatoPedoParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdFormatoPedoParametroFactu.add(jLabelid_formato_pedidoFK_IdFormatoPedoParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdFormatoPedoParametroFactu.add(jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdFormatoPedoParametroFactu.add(jButtonFK_IdFormatoPedoParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("7.-Por Formato Pedo ", jPanelFK_IdFormatoPedoParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdFormatoProformaParametroFactu= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoProformaParametroFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoProformaParametroFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoProformaParametroFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoProformaParametroFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoProformaParametroFactu.setLayout(gridaBagLayoutFK_IdFormatoProformaParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 0;
		jPanelFK_IdFormatoProformaParametroFactu.add(jLabelid_formato_proformaFK_IdFormatoProformaParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 0;
		gridBagConstraintsParametroFactu.gridx = 1;
		jPanelFK_IdFormatoProformaParametroFactu.add(jComboBoxid_formato_proformaFK_IdFormatoProformaParametroFactu, gridBagConstraintsParametroFactu);

		gridBagConstraintsParametroFactu = new GridBagConstraints();
		gridBagConstraintsParametroFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroFactu.gridy = 1;
		gridBagConstraintsParametroFactu.gridx =1;
		jPanelFK_IdFormatoProformaParametroFactu.add(jButtonFK_IdFormatoProformaParametroFactu, gridBagConstraintsParametroFactu);

		jTabbedPaneBusquedasParametroFactu.addTab("8.-Por Formato Proforma ", jPanelFK_IdFormatoProformaParametroFactu);
		jTabbedPaneBusquedasParametroFactu.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactu.gridx = 0;		
			//this.gridBagConstraintsParametroFactu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFactu, this.gridBagConstraintsParametroFactu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFactu.gridx = 0;		
		//this.gridBagConstraintsParametroFactu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFactu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFactu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactu.gridx = 0;		
			this.gridBagConstraintsParametroFactu.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroFactu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroFactu, this.gridBagConstraintsParametroFactu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFactu, this.gridBagConstraintsParametroFactu);								
		
		
		/*
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFactu, this.gridBagConstraintsParametroFactu);
		*/		
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactu.gridx =0;
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactu, this.gridBagConstraintsParametroFactu);
				
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFactu, this.gridBagConstraintsParametroFactu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroFactuJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactu = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFactu.setLayout(gridaBagLayoutBusquedasParametrosParametroFactu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFactu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactu, this.gridBagConstraintsParametroFactu);
			
			
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactu, this.gridBagConstraintsParametroFactu);
		
			
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactu, this.gridBagConstraintsParametroFactu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFactu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFactu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFactu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFactu.setName("jPanelReporteDinamicoParametroFactu"); 
		
		this.jPanelReporteDinamicoParametroFactu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFactu.setLayout(gridaBagLayoutReporteDinamicoParametroFactu);
		
		
		this.jInternalFrameReporteDinamicoParametroFactu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFactu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFactu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFactu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFactu.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFactu.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFactu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFactu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Factus"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFactu = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFactu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFactu.add(this.jLabelColumnasSelectReporteParametroFactu, this.gridBagConstraintsParametroFactu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFactu = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFactu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFactu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFactu=new JScrollPane(this.jListColumnasSelectReporteParametroFactu);
			
			this.jScrollColumnasSelectReporteParametroFactu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFactu.add(this.jListColumnasSelectReporteParametroFactu, this.gridBagConstraintsParametroFactu);
		this.jPanelReporteDinamicoParametroFactu.add(this.jScrollColumnasSelectReporteParametroFactu, this.gridBagConstraintsParametroFactu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFactu = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFactu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFactu = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFactu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFactu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFactu=new JScrollPane(this.jListRelacionesSelectReporteParametroFactu);
			
			this.jScrollRelacionesSelectReporteParametroFactu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroFactu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFactu = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFactu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFactu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFactu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFactu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFactu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactu.add(this.jLabelGenerarExcelReporteDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFactu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFactu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFactu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFactu.setToolTipText("Generar EXCEL"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFactu.add(this.jButtonGenerarExcelReporteDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactu.add(this.jComboBoxTiposReportesDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFactu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFactu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactu.add(this.jLabelTiposArchivoReporteDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactu.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFactu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFactu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFactu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFactu.setToolTipText("Generar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactu.add(this.jButtonGenerarReporteDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFactu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFactu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFactu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFactu.setToolTipText("Cancelar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactu.add(this.jButtonCerrarReporteDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFactu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFactu= new JScrollPane(jPanelReporteDinamicoParametroFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFactu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Factus"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFactu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFactu);
		this.jInternalFrameReporteDinamicoParametroFactu.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFactu, this.gridBagConstraintsParametroFactu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFactu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFactu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFactu.setName("jPanelImportacionParametroFactu"); 
		
		this.jPanelImportacionParametroFactu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFactu.setLayout(gridaBagLayoutImportacionParametroFactu);
		
		
		this.jInternalFrameImportacionParametroFactu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFactu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFactu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFactu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactu.setResizable(true);
	    this.jInternalFrameImportacionParametroFactu.setClosable(true);
	    this.jInternalFrameImportacionParametroFactu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFactu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactu.setResizable(true);
	    this.jInternalFrameImportacionParametroFactu.setClosable(true);
	    this.jInternalFrameImportacionParametroFactu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFactu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Factus"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFactu = new JLabelMe();

		this.jLabelArchivoImportacionParametroFactu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactu.add(this.jLabelArchivoImportacionParametroFactu, this.gridBagConstraintsParametroFactu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFactu = new JFileChooser();		
		this.jFileChooserImportacionParametroFactu.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFactu = new JButtonMe();
		this.jButtonAbrirImportacionParametroFactu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFactu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFactu.setToolTipText("Generar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactu.add(this.jButtonAbrirImportacionParametroFactu, this.gridBagConstraintsParametroFactu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFactu = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFactu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactu.add(this.jLabelPathArchivoImportacionParametroFactu, this.gridBagConstraintsParametroFactu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFactu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFactu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactu.add(this.jTextFieldPathArchivoImportacionParametroFactu, this.gridBagConstraintsParametroFactu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFactu = new JButtonMe();
		this.jButtonGenerarImportacionParametroFactu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFactu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFactu.setToolTipText("Generar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactu.add(this.jButtonGenerarImportacionParametroFactu, this.gridBagConstraintsParametroFactu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFactu = new JButtonMe();
		this.jButtonCerrarImportacionParametroFactu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFactu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFactu.setToolTipText("Cancelar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactu.add(this.jButtonCerrarImportacionParametroFactu, this.gridBagConstraintsParametroFactu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFactu = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFactu= new JScrollPane(jPanelImportacionParametroFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFactu = new GridBagConstraints();
		this.gridBagConstraintsParametroFactu.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFactu.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFactu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFactu);
		this.jInternalFrameImportacionParametroFactu.getContentPane().add(this.jScrollPanelImportacionParametroFactu, this.gridBagConstraintsParametroFactu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFactu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFactu = new JButtonMe();
			this.jButtonAbrirOrderByParametroFactu.setText("Orden");
			this.jButtonAbrirOrderByParametroFactu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFactu";
			inputMap = this.jButtonAbrirOrderByParametroFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFactu"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFactu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFactu.setName("jPanelOrderByParametroFactu"); 
			
			this.jPanelOrderByParametroFactu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFactu.setLayout(gridaBagLayoutOrderByParametroFactu);
			
			
			this.jTableDatosParametroFactuOrderBy = new JTableMe();        
			this.jTableDatosParametroFactuOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFactuOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFactuOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFactuOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFactuOrderBy.setViewportView(this.jTableDatosParametroFactuOrderBy);
			this.jTableDatosParametroFactuOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFactuOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFactu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFactu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFactu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFactu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFactu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFactu.setTitle("Orden");
			this.jInternalFrameOrderByParametroFactu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFactu.setResizable(true);
			this.jInternalFrameOrderByParametroFactu.setClosable(true);
			this.jInternalFrameOrderByParametroFactu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFactu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Factus"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFactu.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFactu.ipady =150;
				
			this.jPanelOrderByParametroFactu.add(jScrollPanelDatosParametroFactuOrderBy, this.gridBagConstraintsParametroFactu);//this.jTableDatosParametroFactuTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFactu = new JButtonMe();
			this.jButtonCerrarOrderByParametroFactu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFactu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFactu.setToolTipText("Cancelar"+" "+ParametroFactuConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFactu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFactu.add(this.jButtonCerrarOrderByParametroFactu, this.gridBagConstraintsParametroFactu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFactu = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFactu= new JScrollPane(jPanelOrderByParametroFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFactu = new GridBagConstraints();
			this.gridBagConstraintsParametroFactu.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFactu.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFactu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFactu);
			
			this.jInternalFrameOrderByParametroFactu.getContentPane().add(this.jScrollPanelOrderByParametroFactu, this.gridBagConstraintsParametroFactu);			
		
		} else {
			this.jButtonAbrirOrderByParametroFactu = new JButtonMe();
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
		int iWidthTableCalculado=0;//4730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrofactuSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFactu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFactu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFactu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFactu.getRowHeight();//ParametroFactuConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactu.isSelected()) {
					iHeightTable=ParametroFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactu.isSelected()) {
					iHeightTable=ParametroFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFactu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFactu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFactu!=null && this.jInternalFrameOrderByParametroFactu.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrofactuSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFactu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFactu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFactu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFactu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFactu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFactu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFactu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFactu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrofactuLogic.getParametroFactus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofactus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFactu> TraerParametroFactuBeans(List<ParametroFactu> parametrofactus,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFactu parametrofactu:parametrofactus) {
					
				if(!(ParametroFactuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFactuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrofactu.setsDetalleGeneralEntityReporte(ParametroFactuConstantesFunciones.getParametroFactuDescripcion(parametrofactu));
										
					parametrofactu.setcon_detalle_proforma_descripcion(ParametroFactuConstantesFunciones.getcon_detalle_proformaDescripcion(parametrofactu));parametrofactu.setcon_detalle_pedido_descripcion(ParametroFactuConstantesFunciones.getcon_detalle_pedidoDescripcion(parametrofactu));parametrofactu.setcon_detalle_factura_descripcion(ParametroFactuConstantesFunciones.getcon_detalle_facturaDescripcion(parametrofactu));parametrofactu.setcon_detalle_nota_credito_descripcion(ParametroFactuConstantesFunciones.getcon_detalle_nota_creditoDescripcion(parametrofactu));	
					
						
					
				} else  {
							
					//parametrofactu.setsDetalleGeneralEntityReporte(parametrofactu.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrofactubeans.add(parametrofactubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrofactus;
    }
	//PARA REPORTES FIN
}
