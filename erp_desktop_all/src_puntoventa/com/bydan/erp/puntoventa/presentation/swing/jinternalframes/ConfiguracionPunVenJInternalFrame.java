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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.puntoventa.util.ConfiguracionPunVenConstantesFunciones;

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
public class ConfiguracionPunVenJInternalFrame extends ConfiguracionPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConfiguracionPunVen;
	
	protected JMenuBar jmenuBarConfiguracionPunVen;
	
	protected JMenu jmenuConfiguracionPunVen;
	protected JMenu jmenuDatosConfiguracionPunVen;
	protected JMenu jmenuArchivoConfiguracionPunVen;
	protected JMenu jmenuAccionesConfiguracionPunVen;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConfiguracionPunVen;	
	protected GridBagConstraints gridBagConstraintsConfiguracionPunVen;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConfiguracionPunVenDetalleFormJInternalFrame jInternalFrameDetalleFormConfiguracionPunVen;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConfiguracionPunVen;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConfiguracionPunVen;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableefectivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableefectivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableiceBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableice="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableotrosBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableotros="";

	protected ClienteBeanSwingJInternalFrame clienteconsumidorfinalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteconsumidorfinal="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentofactura="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotaventa="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotacredito="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentotarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentotarjetacredito="";

	protected FormatoBeanSwingJInternalFrame formatofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatofactura="";

	protected FormatoBeanSwingJInternalFrame formatonotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonotaventa="";

	protected FormatoBeanSwingJInternalFrame formatonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccionfacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionfactura="";

	protected TransaccionBeanSwingJInternalFrame transaccionnotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionnotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccionnotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionnotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentafacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentafactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentanotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentanotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentanotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentanotacredito="";
	
	public ConfiguracionPunVenSessionBean configuracionpunvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public CuentaContableSessionBean cuentacontableefectivoSessionBean;
	public CuentaContableSessionBean cuentacontableiceSessionBean;
	public CuentaContableSessionBean cuentacontableotrosSessionBean;
	public ClienteSessionBean clienteconsumidorfinalSessionBean;
	public TipoDocumentoSessionBean tipodocumentofacturaSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotaventaSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotacreditoSessionBean;
	public TipoDocumentoSessionBean tipodocumentotarjetacreditoSessionBean;
	public FormatoSessionBean formatofacturaSessionBean;
	public FormatoSessionBean formatonotaventaSessionBean;
	public FormatoSessionBean formatonotacreditoSessionBean;
	public TransaccionSessionBean transaccionfacturaSessionBean;
	public TransaccionSessionBean transaccionnotaventaSessionBean;
	public TransaccionSessionBean transaccionnotacreditoSessionBean;
	public TransaccionSessionBean transaccioncuentafacturaSessionBean;
	public TransaccionSessionBean transaccioncuentanotaventaSessionBean;
	public TransaccionSessionBean transaccioncuentanotacreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConfiguracionPunVen> configuracionpunvens;		
	public List<ConfiguracionPunVen> configuracionpunvensEliminados;	
	public List<ConfiguracionPunVen> configuracionpunvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConfiguracionPunVen;		
	protected JButton jButtonAbrirOrderByConfiguracionPunVen;
	
	
	//protected JPanel jPanelOrderByConfiguracionPunVen;
	//public JScrollPane jScrollPanelOrderByConfiguracionPunVen;	
	//protected JButton jButtonCerrarOrderByConfiguracionPunVen;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConfiguracionPunVenLogic configuracionpunvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConfiguracionPunVen;
	public JScrollPane jScrollPanelDatosEdicionConfiguracionPunVen;
	public JScrollPane jScrollPanelDatosGeneralConfiguracionPunVen;
    
	
	
	//public JScrollPane jScrollPanelDatosConfiguracionPunVenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConfiguracionPunVen;
	//public JScrollPane jScrollPanelImportacionConfiguracionPunVen;
	
	
	
	protected JPanel jPanelAccionesConfiguracionPunVen;
	
    protected JPanel jPanelPaginacionConfiguracionPunVen;
    protected JPanel jPanelParametrosReportesConfiguracionPunVen;
	protected JPanel jPanelParametrosReportesAccionesConfiguracionPunVen;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciocontableConfiguracionPunVen;
	protected Integer iXPanelCamposIniciocontableConfiguracionPunVen=0;
	protected Integer iYPanelCamposIniciocontableConfiguracionPunVen=0;

	protected JPanel jPanelCamposIniciodocumentoConfiguracionPunVen;
	protected Integer iXPanelCamposIniciodocumentoConfiguracionPunVen=0;
	protected Integer iYPanelCamposIniciodocumentoConfiguracionPunVen=0;

	protected JPanel jPanelCamposInicioformatoConfiguracionPunVen;
	protected Integer iXPanelCamposInicioformatoConfiguracionPunVen=0;
	protected Integer iYPanelCamposInicioformatoConfiguracionPunVen=0;

	protected JPanel jPanelCamposIniciotransaccionConfiguracionPunVen;
	protected Integer iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
	protected Integer iYPanelCamposIniciotransaccionConfiguracionPunVen=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConfiguracionPunVen;
	protected JPanel jPanelParametrosAuxiliar2ConfiguracionPunVen;
	protected JPanel jPanelParametrosAuxiliar3ConfiguracionPunVen;
	protected JPanel jPanelParametrosAuxiliar4ConfiguracionPunVen;
	//protected JPanel jPanelParametrosAuxiliar5ConfiguracionPunVen;
	
	
	
	//protected JPanel jPanelReporteDinamicoConfiguracionPunVen;
	//protected JPanel jPanelImportacionConfiguracionPunVen;
	
	
	public JTable jTableDatosConfiguracionPunVen;
	
	
	
	//public JTable jTableDatosConfiguracionPunVenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConfiguracionPunVen;
	protected JButton jButtonDuplicarConfiguracionPunVen;
	protected JButton jButtonCopiarConfiguracionPunVen;
	protected JButton jButtonVerFormConfiguracionPunVen;
	protected JButton jButtonNuevoRelacionesConfiguracionPunVen;
	protected JButton jButtonModificarConfiguracionPunVen;
	
    protected JButton jButtonGuardarCambiosTablaConfiguracionPunVen;
	protected JButton jButtonCerrarConfiguracionPunVen;
	
	
	protected JButton jButtonRecargarInformacionConfiguracionPunVen;
	protected JButton jButtonProcesarInformacionConfiguracionPunVen;
	
	
	protected JButton jButtonAnterioresConfiguracionPunVen;
	protected JButton jButtonSiguientesConfiguracionPunVen;
	protected JButton jButtonNuevoGuardarCambiosConfiguracionPunVen;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConfiguracionPunVen;
	//protected JButton jButtonCerrarReporteDinamicoConfiguracionPunVen;
	//protected JButton jButtonGenerarExcelReporteDinamicoConfiguracionPunVen;	
	
	
	
	//protected JButton jButtonAbrirImportacionConfiguracionPunVen;
	//protected JButton jButtonGenerarImportacionConfiguracionPunVen;
	//protected JButton jButtonCerrarImportacionConfiguracionPunVen;
	//protected JFileChooser jFileChooserImportacionConfiguracionPunVen;
	//protected File fileImportacionConfiguracionPunVen;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConfiguracionPunVen;
	protected JButton jButtonDuplicarToolBarConfiguracionPunVen;
	protected JButton jButtonNuevoRelacionesToolBarConfiguracionPunVen;
	
	
	public JButton jButtonGuardarCambiosToolBarConfiguracionPunVen;
	protected JButton jButtonCopiarToolBarConfiguracionPunVen;
	protected JButton jButtonVerFormToolBarConfiguracionPunVen;
	public JButton jButtonGuardarCambiosTablaToolBarConfiguracionPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarConfiguracionPunVen;
	protected JButton jButtonCerrarToolBarConfiguracionPunVen;
	
	protected JButton jButtonRecargarInformacionToolBarConfiguracionPunVen;
	protected JButton jButtonProcesarInformacionToolBarConfiguracionPunVen;
	protected JButton jButtonAnterioresToolBarConfiguracionPunVen;
	protected JButton jButtonSiguientesToolBarConfiguracionPunVen;
	protected JButton jButtonNuevoGuardarCambiosToolBarConfiguracionPunVen;
	protected JButton jButtonAbrirOrderByToolBarConfiguracionPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConfiguracionPunVen;
	protected JMenuItem jMenuItemDuplicarConfiguracionPunVen;
	protected JMenuItem jMenuItemNuevoRelacionesConfiguracionPunVen;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConfiguracionPunVen;
	protected JMenuItem jMenuItemCopiarConfiguracionPunVen;
	protected JMenuItem jMenuItemVerFormConfiguracionPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaConfiguracionPunVen;
	protected JMenuItem jMenuItemCerrarConfiguracionPunVen;
	protected JMenuItem jMenuItemDetalleCerrarConfiguracionPunVen;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConfiguracionPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarConfiguracionPunVen;
	
	protected JMenuItem jMenuItemRecargarInformacionConfiguracionPunVen;
	protected JMenuItem jMenuItemProcesarInformacionConfiguracionPunVen;
	protected JMenuItem jMenuItemAnterioresConfiguracionPunVen;
	protected JMenuItem jMenuItemSiguientesConfiguracionPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConfiguracionPunVen;
	protected JMenuItem jMenuItemAbrirOrderByConfiguracionPunVen;
	protected JMenuItem jMenuItemMostrarOcultarConfiguracionPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConfiguracionPunVen;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConfiguracionPunVen;
	protected JCheckBox jCheckBoxSeleccionadosConfiguracionPunVen;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConfiguracionPunVen;
	protected JCheckBox jCheckBoxConGraficoReporteConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConfiguracionPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConfiguracionPunVen;
	protected JTextField jTextFieldValorCampoGeneralConfiguracionPunVen;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConfiguracionPunVen;
	//public JList<Reporte> jListColumnasSelectReporteConfiguracionPunVen;
	//public JScrollPane jScrollColumnasSelectReporteConfiguracionPunVen;
	
	//public JLabel jLabelRelacionesSelectReporteConfiguracionPunVen;
	//public JList<Reporte> jListRelacionesSelectReporteConfiguracionPunVen;
	//public JScrollPane jScrollRelacionesSelectReporteConfiguracionPunVen;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConfiguracionPunVen;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConfiguracionPunVen;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConfiguracionPunVen;
	//public JLabel jLabelTiposArchivoReporteDinamicoConfiguracionPunVen;
	
		
	//public JLabel jLabelArchivoImportacionConfiguracionPunVen;	
	//public JLabel jLabelPathArchivoImportacionConfiguracionPunVen;
	//protected JTextField jTextFieldPathArchivoImportacionConfiguracionPunVen;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConfiguracionPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConfiguracionPunVen;
	
	//public JLabel jLabelColumnaCategoriaValorConfiguracionPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConfiguracionPunVen;
	
	//public JLabel jLabelColumnasValoresGraficoConfiguracionPunVen;
	//public JList<Reporte> jListColumnasValoresGraficoConfiguracionPunVen;
	//public JScrollPane jScrollColumnasValoresGraficoConfiguracionPunVen;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConfiguracionPunVen;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConfiguracionPunVen;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConfiguracionPunVen;
	public JPanel jPanelFK_IdBodegaConfiguracionPunVen;
	public JButton jButtonFK_IdBodegaConfiguracionPunVen;
	public JPanel jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen;
	public JButton jButtonFK_IdClienteConsumidorFinalConfiguracionPunVen;
	public JPanel jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen;
	public JButton jButtonFK_IdCuentaContableEfectivoConfiguracionPunVen;
	public JPanel jPanelFK_IdCuentaContableIceConfiguracionPunVen;
	public JButton jButtonFK_IdCuentaContableIceConfiguracionPunVen;
	public JPanel jPanelFK_IdCuentaContableOtrosConfiguracionPunVen;
	public JButton jButtonFK_IdCuentaContableOtrosConfiguracionPunVen;
	public JPanel jPanelFK_IdFormatoFacturaConfiguracionPunVen;
	public JButton jButtonFK_IdFormatoFacturaConfiguracionPunVen;
	public JPanel jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen;
	public JButton jButtonFK_IdFormatoNotaCreditoConfiguracionPunVen;
	public JPanel jPanelFK_IdFormatoNotaVentaConfiguracionPunVen;
	public JButton jButtonFK_IdFormatoNotaVentaConfiguracionPunVen;
	public JPanel jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen;
	public JButton jButtonFK_IdTipoDocumentoFacturaConfiguracionPunVen;
	public JPanel jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen;
	public JButton jButtonFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen;
	public JPanel jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen;
	public JButton jButtonFK_IdTipoDocumentoNotaVentaConfiguracionPunVen;
	public JPanel jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen;
	public JButton jButtonFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen;
	public JPanel jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen;
	public JButton jButtonFK_IdTransaccionCuentaFacturaConfiguracionPunVen;
	public JPanel jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen;
	public JButton jButtonFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen;
	public JPanel jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen;
	public JButton jButtonFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen;
	public JPanel jPanelFK_IdTransaccionFacturaConfiguracionPunVen;
	public JButton jButtonFK_IdTransaccionFacturaConfiguracionPunVen;
	public JPanel jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen;
	public JButton jButtonFK_IdTransaccionNotaCreditoConfiguracionPunVen;
	public JPanel jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen;
	public JButton jButtonFK_IdTransaccionNotaVentaConfiguracionPunVen;
	
	public JPanel jPanelid_bodegaFK_IdBodegaConfiguracionPunVen;
	public JLabel jLabelid_bodegaFK_IdBodegaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaConfiguracionPunVen;
	public JButton jButtonid_bodegaFK_IdBodegaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen;
	public JLabel jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen;
	public JButton jButtonid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVenBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen;
	
	public JPanel jPanelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen;
	public JLabel jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen;
	public JButton jButtonid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVenArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen;
	public JLabel jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen;
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVenArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen;
	public JLabel jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen;
	public JButton jButtonid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVenArbol= new JButtonMe();

	
	public JPanel jPanelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen;
	public JLabel jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen;
	public JButton jButtonid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen;
	public JLabel jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen;
	public JButton jButtonid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen;
	public JLabel jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen;
	public JButton jButtonid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen;
	public JButton jButtonid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen;
	public JLabel jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen;
	public JButton jButtonid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen;
	public JButton jButtonid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen;
	public JButton jButtonid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen;
	public JLabel jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen;
	public JButton jButtonid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen;
	public JButton jButtonid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVenBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConfiguracionPunVenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConfiguracionPunVenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConfiguracionPunVenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConfiguracionPunVenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConfiguracionPunVen)	{
		this.jButtonRecargarInformacionConfiguracionPunVen = jButtonRecargarInformacionConfiguracionPunVen;
	}
	
	public JButton getjButtonProcesarInformacionConfiguracionPunVen() {
		return this.jButtonProcesarInformacionConfiguracionPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConfiguracionPunVen)	{
		this.jButtonProcesarInformacionConfiguracionPunVen = jButtonProcesarInformacionConfiguracionPunVen;
	}
	
	
	public JButton getjButtonRecargarInformacionConfiguracionPunVen() {
		return this.jButtonRecargarInformacionConfiguracionPunVen;
	}
	
	
	public List<ConfiguracionPunVen> getconfiguracionpunvens() {
		return this.configuracionpunvens;
	}

	public void setconfiguracionpunvens(List<ConfiguracionPunVen> configuracionpunvens) {
		this.configuracionpunvens = configuracionpunvens;
	}
	
	public List<ConfiguracionPunVen> getconfiguracionpunvensAux() {
		return this.configuracionpunvensAux;
	}

	public void setconfiguracionpunvensAux(List<ConfiguracionPunVen> configuracionpunvensAux) {
		this.configuracionpunvensAux = configuracionpunvensAux;
	}
	
	public List<ConfiguracionPunVen> getconfiguracionpunvensEliminados() {
		return this.configuracionpunvensEliminados;
	}

	public void setConfiguracionPunVensEliminados(List<ConfiguracionPunVen> configuracionpunvensEliminados) {
		this.configuracionpunvensEliminados = configuracionpunvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConfiguracionPunVen() {
		return jComboBoxTiposSeleccionarConfiguracionPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConfiguracionPunVen(
			JComboBox jComboBoxTiposSeleccionarConfiguracionPunVen) {
		this.jComboBoxTiposSeleccionarConfiguracionPunVen = jComboBoxTiposSeleccionarConfiguracionPunVen;
	}
	
	public void setBorderResaltarTiposSeleccionarConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConfiguracionPunVen() {
		return jTextFieldValorCampoGeneralConfiguracionPunVen;
	}

	public void setjTextFieldValorCampoGeneralConfiguracionPunVen(
			JTextField jTextFieldValorCampoGeneralConfiguracionPunVen) {
		this.jTextFieldValorCampoGeneralConfiguracionPunVen = jTextFieldValorCampoGeneralConfiguracionPunVen;
	}

	public void setBorderResaltarValorCampoGeneralConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConfiguracionPunVen .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConfiguracionPunVen() {
		return this.jCheckBoxSeleccionarTodosConfiguracionPunVen;
	}

	public void setjCheckBoxSeleccionarTodosConfiguracionPunVen(
			JCheckBox jCheckBoxSeleccionarTodosConfiguracionPunVen) {
		this.jCheckBoxSeleccionarTodosConfiguracionPunVen = jCheckBoxSeleccionarTodosConfiguracionPunVen;
	}

	public void setBorderResaltarSeleccionarTodosConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConfiguracionPunVen() {
		return this.jCheckBoxSeleccionadosConfiguracionPunVen;
	}

	public void setjCheckBoxSeleccionadosConfiguracionPunVen(
			JCheckBox jCheckBoxSeleccionadosConfiguracionPunVen) {
		this.jCheckBoxSeleccionadosConfiguracionPunVen = jCheckBoxSeleccionadosConfiguracionPunVen;
	}
	
	public void setBorderResaltarSeleccionadosConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConfiguracionPunVen() {
		return this.jComboBoxTiposArchivosReportesConfiguracionPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConfiguracionPunVen(
			JComboBox jComboBoxTiposArchivosReportesConfiguracionPunVen) {
		this.jComboBoxTiposArchivosReportesConfiguracionPunVen = jComboBoxTiposArchivosReportesConfiguracionPunVen;
	}

	public void setBorderResaltarTiposArchivosReportesConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConfiguracionPunVen() {
		return this.jComboBoxTiposReportesConfiguracionPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConfiguracionPunVen(
			JComboBox jComboBoxTiposReportesConfiguracionPunVen) {
		this.jComboBoxTiposReportesConfiguracionPunVen = jComboBoxTiposReportesConfiguracionPunVen;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConfiguracionPunVen() {
	//	return jComboBoxTiposReportesDinamicoConfiguracionPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConfiguracionPunVen(
	//		JComboBox jComboBoxTiposReportesDinamicoConfiguracionPunVen) {
	//	this.jComboBoxTiposReportesDinamicoConfiguracionPunVen = jComboBoxTiposReportesDinamicoConfiguracionPunVen;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen() {
	//	return jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen = jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen;
	//}
	
	public void setBorderResaltarTiposReportesConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConfiguracionPunVen() {
		return this.jComboBoxTiposGraficosReportesConfiguracionPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConfiguracionPunVen(
			JComboBox jComboBoxTiposGraficosReportesConfiguracionPunVen) {
		this.jComboBoxTiposGraficosReportesConfiguracionPunVen = jComboBoxTiposGraficosReportesConfiguracionPunVen;
	}
	
	public void setBorderResaltarTiposGraficosReportesConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConfiguracionPunVen() {
		return this.jComboBoxTiposPaginacionConfiguracionPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConfiguracionPunVen(
			JComboBox jComboBoxTiposPaginacionConfiguracionPunVen) {
		this.jComboBoxTiposPaginacionConfiguracionPunVen = jComboBoxTiposPaginacionConfiguracionPunVen;
	}
	
	public void setBorderResaltarTiposPaginacionConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConfiguracionPunVen() {
		return this.jComboBoxTiposRelacionesConfiguracionPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConfiguracionPunVen() {
		return this.jComboBoxTiposAccionesConfiguracionPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConfiguracionPunVen(
			JComboBox jComboBoxTiposRelacionesConfiguracionPunVen) {
		this.jComboBoxTiposRelacionesConfiguracionPunVen = jComboBoxTiposRelacionesConfiguracionPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConfiguracionPunVen(
			JComboBox jComboBoxTiposAccionesConfiguracionPunVen) {
		this.jComboBoxTiposAccionesConfiguracionPunVen = jComboBoxTiposAccionesConfiguracionPunVen;
	}
	
	public void setBorderResaltarTiposRelacionesConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConfiguracionPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConfiguracionPunVen .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConfiguracionPunVen() {
	//	return jCheckBoxConGraficoDinamicoConfiguracionPunVen;
	//}

	//public void setjCheckBoxConGraficoDinamicoConfiguracionPunVen(
	//		JCheckBox jCheckBoxConGraficoDinamicoConfiguracionPunVen) {
	//	this.jCheckBoxConGraficoDinamicoConfiguracionPunVen = jCheckBoxConGraficoDinamicoConfiguracionPunVen;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConfiguracionPunVen() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConfiguracionPunVen.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConfiguracionPunVen .setBorder(borderResaltar);		
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
		this.configuracionpunvenSessionBean=new ConfiguracionPunVenSessionBean();
		
		this.configuracionpunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.configuracionpunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.configuracionpunvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConfiguracionPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConfiguracionPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConfiguracionPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConfiguracionPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConfiguracionPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Configuracion Pun Ven MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {
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
		
		ConfiguracionPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConfiguracionPunVen= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"nuevo","nuevo","Nuevo"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"duplicar","duplicar","Duplicar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"copiar","copiar","Copiar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"ver_form","ver_form","Ver"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"recargar","recargar","Recargar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConfiguracionPunVen,this.jTtoolBarConfiguracionPunVen,
							"cerrar","cerrar","Salir"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConfiguracionPunVen=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConfiguracionPunVen;
			
				this.jButtonProcesarInformacionToolBarConfiguracionPunVen=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConfiguracionPunVen;
				
		//protected JButton jButtonModificarToolBarConfiguracionPunVen;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConfiguracionPunVen=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConfiguracionPunVen=new JMenuMe("General");
		this.jmenuArchivoConfiguracionPunVen=new JMenuMe("Archivo");
		this.jmenuAccionesConfiguracionPunVen=new JMenuMe("Acciones");
		this.jmenuDatosConfiguracionPunVen=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConfiguracionPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConfiguracionPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConfiguracionPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConfiguracionPunVen= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConfiguracionPunVen.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConfiguracionPunVen,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConfiguracionPunVen= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConfiguracionPunVen.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConfiguracionPunVen,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConfiguracionPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConfiguracionPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConfiguracionPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConfiguracionPunVen= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConfiguracionPunVen.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConfiguracionPunVen,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConfiguracionPunVen= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConfiguracionPunVen.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConfiguracionPunVen,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConfiguracionPunVen= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConfiguracionPunVen.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConfiguracionPunVen,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConfiguracionPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConfiguracionPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConfiguracionPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConfiguracionPunVen= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConfiguracionPunVen.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConfiguracionPunVen,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConfiguracionPunVen= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConfiguracionPunVen.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConfiguracionPunVen,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConfiguracionPunVen= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConfiguracionPunVen.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConfiguracionPunVen,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConfiguracionPunVen= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConfiguracionPunVen.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConfiguracionPunVen,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConfiguracionPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConfiguracionPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConfiguracionPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConfiguracionPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConfiguracionPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConfiguracionPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConfiguracionPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConfiguracionPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConfiguracionPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConfiguracionPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConfiguracionPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConfiguracionPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConfiguracionPunVen= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConfiguracionPunVen.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConfiguracionPunVen,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConfiguracionPunVen.add(this.jMenuItemCerrarConfiguracionPunVen);
			
			this.jmenuAccionesConfiguracionPunVen.add(this.jMenuItemNuevoConfiguracionPunVen);
			this.jmenuAccionesConfiguracionPunVen.add(this.jMenuItemNuevoGuardarCambiosConfiguracionPunVen);
			this.jmenuAccionesConfiguracionPunVen.add(this.jMenuItemNuevoRelacionesConfiguracionPunVen);
			this.jmenuAccionesConfiguracionPunVen.add(this.jMenuItemGuardarCambiosTablaConfiguracionPunVen);		
			this.jmenuAccionesConfiguracionPunVen.add(this.jMenuItemDuplicarConfiguracionPunVen);		
			this.jmenuAccionesConfiguracionPunVen.add(this.jMenuItemCopiarConfiguracionPunVen);		
			this.jmenuAccionesConfiguracionPunVen.add(this.jMenuItemVerFormConfiguracionPunVen);		
			
			this.jmenuDatosConfiguracionPunVen.add(this.jMenuItemRecargarInformacionConfiguracionPunVen);				
			this.jmenuDatosConfiguracionPunVen.add(this.jMenuItemAnterioresConfiguracionPunVen);				
			this.jmenuDatosConfiguracionPunVen.add(this.jMenuItemSiguientesConfiguracionPunVen);				
			this.jmenuDatosConfiguracionPunVen.add(this.jMenuItemAbrirOrderByConfiguracionPunVen);				
			this.jmenuDatosConfiguracionPunVen.add(this.jMenuItemMostrarOcultarConfiguracionPunVen);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConfiguracionPunVen.add(this.jMenuItemGuardarCambiosConfiguracionPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConfiguracionPunVen.add(this.jmenuArchivoConfiguracionPunVen);		
			this.jmenuBarConfiguracionPunVen.add(this.jmenuAccionesConfiguracionPunVen);		
			this.jmenuBarConfiguracionPunVen.add(this.jmenuDatosConfiguracionPunVen);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConfiguracionPunVen);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConfiguracionPunVen() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaConfiguracionPunVen.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdBodegaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdBodegaConfiguracionPunVen.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaConfiguracionPunVen,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaConfiguracionPunVen = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaConfiguracionPunVen.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaConfiguracionPunVen.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen.setToolTipText("Buscar Por Cliente Consumor Final ");
		this.jButtonFK_IdClienteConsumidorFinalConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdClienteConsumidorFinalConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdClienteConsumidorFinalConfiguracionPunVen.setToolTipText("Buscar Por Cliente Consumor Final ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteConsumidorFinalConfiguracionPunVen,"buscar_button","Buscar Por Cliente Consumor Final ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteConsumidorFinalConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen = new JLabelMe();
		jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setText("Cliente Consumor Final :");
		jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setToolTipText("Cliente Consumor Final");
		jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen= new JButtonMe();
		this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen.setText("Buscar");
		this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen.setFocusable(false);

		this.jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen.setToolTipText("Buscar Por Cta Contable Efectivo ");
		this.jButtonFK_IdCuentaContableEfectivoConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdCuentaContableEfectivoConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdCuentaContableEfectivoConfiguracionPunVen.setToolTipText("Buscar Por Cta Contable Efectivo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableEfectivoConfiguracionPunVen,"buscar_button","Buscar Por Cta Contable Efectivo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableEfectivoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen = new JLabelMe();
		jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setText("Cta Contable Efectivo :");
		jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setToolTipText("Cta Contable Efectivo");
		jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableIceConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIceConfiguracionPunVen.setToolTipText("Buscar Por Cta Contable Ice ");
		this.jButtonFK_IdCuentaContableIceConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdCuentaContableIceConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdCuentaContableIceConfiguracionPunVen.setToolTipText("Buscar Por Cta Contable Ice ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIceConfiguracionPunVen,"buscar_button","Buscar Por Cta Contable Ice ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIceConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen = new JLabelMe();
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setText("Cta Contable Ice :");
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setToolTipText("Cta Contable Ice");
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableOtrosConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableOtrosConfiguracionPunVen.setToolTipText("Buscar Por Cta Contable Otros ");
		this.jButtonFK_IdCuentaContableOtrosConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdCuentaContableOtrosConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdCuentaContableOtrosConfiguracionPunVen.setToolTipText("Buscar Por Cta Contable Otros ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableOtrosConfiguracionPunVen,"buscar_button","Buscar Por Cta Contable Otros ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableOtrosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen = new JLabelMe();
		jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setText("Cta Contable Otros :");
		jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setToolTipText("Cta Contable Otros");
		jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoFacturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoFacturaConfiguracionPunVen.setToolTipText("Buscar Por Formato Factura ");
		this.jButtonFK_IdFormatoFacturaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdFormatoFacturaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdFormatoFacturaConfiguracionPunVen.setToolTipText("Buscar Por Formato Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoFacturaConfiguracionPunVen,"buscar_button","Buscar Por Formato Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoFacturaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen = new JLabelMe();
		jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setText("Formato Factura :");
		jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setToolTipText("Formato Factura");
		jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por Formato Nota Credito ");
		this.jButtonFK_IdFormatoNotaCreditoConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdFormatoNotaCreditoConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdFormatoNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por Formato Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNotaCreditoConfiguracionPunVen,"buscar_button","Buscar Por Formato Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNotaCreditoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen = new JLabelMe();
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setText("Formato Nota Credito :");
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setToolTipText("Formato Nota Credito");
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNotaVentaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por Formato Nota Venta ");
		this.jButtonFK_IdFormatoNotaVentaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdFormatoNotaVentaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdFormatoNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por Formato Nota Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNotaVentaConfiguracionPunVen,"buscar_button","Buscar Por Formato Nota Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNotaVentaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen = new JLabelMe();
		jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setText("Formato Nota Venta :");
		jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setToolTipText("Formato Nota Venta");
		jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen.setToolTipText("Buscar Por T Documento Factura ");
		this.jButtonFK_IdTipoDocumentoFacturaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoFacturaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoFacturaConfiguracionPunVen.setToolTipText("Buscar Por T Documento Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoFacturaConfiguracionPunVen,"buscar_button","Buscar Por T Documento Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoFacturaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen = new JLabelMe();
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setText("T Documento Factura :");
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setToolTipText("T Documento Factura");
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por T Documento Nota Credito ");
		this.jButtonFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por T Documento Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen,"buscar_button","Buscar Por T Documento Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen = new JLabelMe();
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setText("T Documento Nota Credito :");
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setToolTipText("T Documento Nota Credito");
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por T Documento Nota Venta ");
		this.jButtonFK_IdTipoDocumentoNotaVentaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por T Documento Nota Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoNotaVentaConfiguracionPunVen,"buscar_button","Buscar Por T Documento Nota Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoNotaVentaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen = new JLabelMe();
		jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setText("T Documento Nota Venta :");
		jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setToolTipText("T Documento Nota Venta");
		jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setToolTipText("Buscar Por T Documento Tarjeta Credito ");
		this.jButtonFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setToolTipText("Buscar Por T Documento Tarjeta Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen,"buscar_button","Buscar Por T Documento Tarjeta Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen = new JLabelMe();
		jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setText("T Documento Tarjeta Credito :");
		jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setToolTipText("T Documento Tarjeta Credito");
		jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Cuenta Factura ");
		this.jButtonFK_IdTransaccionCuentaFacturaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Cuenta Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaFacturaConfiguracionPunVen,"buscar_button","Buscar Por Transaccion Cuenta Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaFacturaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen = new JLabelMe();
		jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setText("Transaccion Cuenta Factura :");
		jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setToolTipText("Transaccion Cuenta Factura");
		jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Cuenta Nota Credito ");
		this.jButtonFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Cuenta Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen,"buscar_button","Buscar Por Transaccion Cuenta Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen = new JLabelMe();
		jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setText("Transaccion Cuenta Nota Credito :");
		jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setToolTipText("Transaccion Cuenta Nota Credito");
		jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Cuenta Nota Venta ");
		this.jButtonFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Cuenta Nota Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen,"buscar_button","Buscar Por Transaccion Cuenta Nota Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen = new JLabelMe();
		jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setText("Transaccion Cuenta Nota Venta :");
		jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setToolTipText("Transaccion Cuenta Nota Venta");
		jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionFacturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionFacturaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Factura ");
		this.jButtonFK_IdTransaccionFacturaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTransaccionFacturaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTransaccionFacturaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionFacturaConfiguracionPunVen,"buscar_button","Buscar Por Transaccion Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionFacturaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen = new JLabelMe();
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setText("Transaccion Factura :");
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setToolTipText("Transaccion Factura");
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Nota Credito ");
		this.jButtonFK_IdTransaccionNotaCreditoConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTransaccionNotaCreditoConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTransaccionNotaCreditoConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Nota Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionNotaCreditoConfiguracionPunVen,"buscar_button","Buscar Por Transaccion Nota Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionNotaCreditoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen = new JLabelMe();
		jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setText("Transaccion Nota Credito :");
		jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setToolTipText("Transaccion Nota Credito");
		jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Nota Venta ");
		this.jButtonFK_IdTransaccionNotaVentaConfiguracionPunVen= new JButtonMe();
		this.jButtonFK_IdTransaccionNotaVentaConfiguracionPunVen.setText("Buscar");
		this.jButtonFK_IdTransaccionNotaVentaConfiguracionPunVen.setToolTipText("Buscar Por Transaccion Nota Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionNotaVentaConfiguracionPunVen,"buscar_button","Buscar Por Transaccion Nota Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionNotaVentaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen = new JLabelMe();
		jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setText("Transaccion Nota Venta :");
		jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setToolTipText("Transaccion Nota Venta");
		jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasConfiguracionPunVen=new JTabbedPane();


		this.jTabbedPaneBusquedasConfiguracionPunVen.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasConfiguracionPunVen.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasConfiguracionPunVen.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConfiguracionPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConfiguracionPunVen = new ConfiguracionPunVenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Configuracion Pun Ven DATOS");
			this.jInternalFrameDetalleFormConfiguracionPunVen = new ConfiguracionPunVenDetalleFormJInternalFrame(jDesktopPane,this.configuracionpunvenSessionBean.getConGuardarRelaciones(),this.configuracionpunvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConfiguracionPunVen = null;//new ConfiguracionPunVenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConfiguracionPunVen= new GridBagLayout();
		
		
		this.jTableDatosConfiguracionPunVen = new JTableMe();      
		
		String sToolTipConfiguracionPunVen="";
		sToolTipConfiguracionPunVen=ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConfiguracionPunVen+="(PuntoVenta.ConfiguracionPunVen)";
		}
		
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipConfiguracionPunVen+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConfiguracionPunVen.setToolTipText(sToolTipConfiguracionPunVen);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConfiguracionPunVen);
		this.jTableDatosConfiguracionPunVen.setAutoCreateRowSorter(true);
		this.jTableDatosConfiguracionPunVen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConfiguracionPunVen.setRowSelectionAllowed(true);
		this.jTableDatosConfiguracionPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConfiguracionPunVen = new JButtonMe();
		this.jButtonDuplicarConfiguracionPunVen = new JButtonMe();
		this.jButtonCopiarConfiguracionPunVen = new JButtonMe();
		this.jButtonVerFormConfiguracionPunVen = new JButtonMe();
		this.jButtonNuevoRelacionesConfiguracionPunVen = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConfiguracionPunVen = new JButtonMe();
		this.jButtonCerrarConfiguracionPunVen = new JButtonMe();
		
		this.jScrollPanelDatosConfiguracionPunVen = new JScrollPane();   
        this.jScrollPanelDatosGeneralConfiguracionPunVen = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciocontableConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodocumentoConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformatoConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotransaccionConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Configuracion Pun Ven";
		
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Configuracion Pun Venes" + this.sPath));
		} else {
			this.jScrollPanelDatosConfiguracionPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConfiguracionPunVen.setToolTipText("Acciones");
        this.jPanelAccionesConfiguracionPunVen.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciocontableConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableConfiguracionPunVen.setName("jPanelCamposFincontableConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodocumentoConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento"));
		this.jPanelCamposIniciodocumentoConfiguracionPunVen.setName("jPanelCamposFindocumentoConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodocumentoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformatoConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
		this.jPanelCamposInicioformatoConfiguracionPunVen.setName("jPanelCamposFinformatoConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformatoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotransaccionConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Transaccion"));
		this.jPanelCamposIniciotransaccionConfiguracionPunVen.setName("jPanelCamposFintransaccionConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotransaccionConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoConfiguracionPunVen=new ReporteDinamicoJInternalFrame(ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConfiguracionPunVen();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConfiguracionPunVen=new ImportacionJInternalFrame(ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConfiguracionPunVen();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConfiguracionPunVen = new JButtonMe();
		
		this.jButtonAbrirOrderByConfiguracionPunVen.setText("Orden");
		this.jButtonAbrirOrderByConfiguracionPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConfiguracionPunVen,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConfiguracionPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConfiguracionPunVen,false,this);
			
			//this.cargarOrderByConfiguracionPunVen(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConfiguracionPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConfiguracionPunVen,true,this);
			
			//this.cargarOrderByConfiguracionPunVen(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConfiguracionPunVen.setMinimumSize(new Dimension(400,50));//2030
		this.jTableDatosConfiguracionPunVen.setMaximumSize(new Dimension(400,50));//2030
		this.jTableDatosConfiguracionPunVen.setPreferredSize(new Dimension(400,50));//2030
		
		this.jScrollPanelDatosConfiguracionPunVen.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConfiguracionPunVen.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConfiguracionPunVen.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConfiguracionPunVen.setText("Nuevo");
		this.jButtonDuplicarConfiguracionPunVen.setText("Duplicar");
		this.jButtonCopiarConfiguracionPunVen.setText("Copiar");
		this.jButtonVerFormConfiguracionPunVen.setText("Ver");
		this.jButtonNuevoRelacionesConfiguracionPunVen.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConfiguracionPunVen.setText("Guardar");
		this.jButtonCerrarConfiguracionPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConfiguracionPunVen,"nuevo_button","Nuevo",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConfiguracionPunVen,"duplicar_button","Duplicar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConfiguracionPunVen,"copiar_button","Copiar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConfiguracionPunVen,"ver_form","Ver",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConfiguracionPunVen,"nuevorelaciones_button","Nuevo Rel",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConfiguracionPunVen,"guardarcambiostabla_button","Guardar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConfiguracionPunVen,"cerrar_button","Salir",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConfiguracionPunVen.setToolTipText("Nuevo"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConfiguracionPunVen.setToolTipText("Duplicar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConfiguracionPunVen.setToolTipText("Copiar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConfiguracionPunVen.setToolTipText("Ver"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConfiguracionPunVen.setToolTipText("Nuevo Rel"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConfiguracionPunVen.setToolTipText("Guardar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConfiguracionPunVen.setToolTipText("Salir"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConfiguracionPunVen";
		inputMap = this.jButtonNuevoConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConfiguracionPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConfiguracionPunVen"));
		
		//DUPLICAR
		sMapKey = "DuplicarConfiguracionPunVen";
		inputMap = this.jButtonDuplicarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConfiguracionPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConfiguracionPunVen"));
		
		//COPIAR
		sMapKey = "CopiarConfiguracionPunVen";
		inputMap = this.jButtonCopiarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConfiguracionPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConfiguracionPunVen"));
		
		//VEr FORM
		sMapKey = "VerFormConfiguracionPunVen";
		inputMap = this.jButtonVerFormConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConfiguracionPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConfiguracionPunVen"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConfiguracionPunVen";
		inputMap = this.jButtonNuevoRelacionesConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConfiguracionPunVen"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConfiguracionPunVen";
		inputMap = this.jButtonModificarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConfiguracionPunVen"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConfiguracionPunVen";
		inputMap = this.jButtonCerrarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConfiguracionPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConfiguracionPunVen";
		inputMap = this.jButtonGuardarCambiosTablaConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConfiguracionPunVen"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConfiguracionPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConfiguracionPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConfiguracionPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConfiguracionPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConfiguracionPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConfiguracionPunVen.setName("jPanelParametrosReportesConfiguracionPunVen"); 
		
		this.jPanelParametrosReportesAccionesConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConfiguracionPunVen.setName("jPanelParametrosReportesAccionesConfiguracionPunVen"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConfiguracionPunVen = new JButtonMe();
		this.jButtonRecargarInformacionConfiguracionPunVen.setText("Recargar");
		this.jButtonRecargarInformacionConfiguracionPunVen.setToolTipText("Recargar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConfiguracionPunVen,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConfiguracionPunVen = new JButtonMe();
		this.jButtonProcesarInformacionConfiguracionPunVen.setText("Procesar");
		this.jButtonProcesarInformacionConfiguracionPunVen.setToolTipText("Procesar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConfiguracionPunVen.setVisible(false);
			
		this.jButtonProcesarInformacionConfiguracionPunVen.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConfiguracionPunVen.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConfiguracionPunVen.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConfiguracionPunVen.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConfiguracionPunVen.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConfiguracionPunVen.setText("TIPO");       
		this.jComboBoxTiposReportesConfiguracionPunVen.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConfiguracionPunVen.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConfiguracionPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConfiguracionPunVen.setText("Paginacion");
		this.jComboBoxTiposPaginacionConfiguracionPunVen.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConfiguracionPunVen.setText("Accion");
		this.jComboBoxTiposRelacionesConfiguracionPunVen.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConfiguracionPunVen.setText("Accion");
		this.jComboBoxTiposAccionesConfiguracionPunVen.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConfiguracionPunVen.setText("Accion");
		this.jComboBoxTiposSeleccionarConfiguracionPunVen.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConfiguracionPunVen=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConfiguracionPunVen.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConfiguracionPunVen.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConfiguracionPunVen.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConfiguracionPunVen = new JLabelMe();
		
		this.jLabelAccionesConfiguracionPunVen.setText("Acciones");		
		this.jLabelAccionesConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConfiguracionPunVen = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConfiguracionPunVen.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConfiguracionPunVen.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConfiguracionPunVen = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConfiguracionPunVen.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConfiguracionPunVen.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConfiguracionPunVen = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConfiguracionPunVen.setText("Graf.");
		this.jCheckBoxConGraficoReporteConfiguracionPunVen.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConfiguracionPunVen = new JButtonMe();
		//this.jButtonAnterioresConfiguracionPunVen.setText("<<");
        this.jButtonAnterioresConfiguracionPunVen.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConfiguracionPunVen,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConfiguracionPunVen = new JButtonMe();
		//this.jButtonSiguientesConfiguracionPunVen.setText(">>");
        this.jButtonSiguientesConfiguracionPunVen.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConfiguracionPunVen,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConfiguracionPunVen = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConfiguracionPunVen.setText("Nue");
        this.jButtonNuevoGuardarCambiosConfiguracionPunVen.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConfiguracionPunVen,"nuevoguardarcambios_button","Nue",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConfiguracionPunVen";
		inputMap = this.jButtonNuevoGuardarCambiosConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConfiguracionPunVen"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConfiguracionPunVen";
		inputMap = this.jButtonRecargarInformacionConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConfiguracionPunVen"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConfiguracionPunVen";
		inputMap = this.jButtonSiguientesConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConfiguracionPunVen"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConfiguracionPunVen";
		inputMap = this.jButtonAnterioresConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConfiguracionPunVen"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConfiguracionPunVen();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConfiguracionPunVen.setMinimumSize(new Dimension(this.getWidth(),ConfiguracionPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConfiguracionPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConfiguracionPunVen.setMaximumSize(new Dimension(this.getWidth(),ConfiguracionPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConfiguracionPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConfiguracionPunVen.setPreferredSize(new Dimension(this.getWidth(),ConfiguracionPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConfiguracionPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConfiguracionPunVen = new GridBagLayout();

			this.jPanelPaginacionConfiguracionPunVen.setLayout(gridaBagLayoutPaginacionConfiguracionPunVen);						
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonAnterioresConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
					
						
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
			
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonNuevoGuardarCambiosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
						
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonSiguientesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 1;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonNuevoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
						
			
			
			if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
				this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConfiguracionPunVen.gridy = 1;
				this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonGuardarCambiosTablaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			}
			
			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 1;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonDuplicarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 1;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonCopiarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 1;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonVerFormConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 1;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConfiguracionPunVen.add(this.jButtonCerrarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
		
		
		this.jButtonRecargarInformacionConfiguracionPunVen.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConfiguracionPunVen.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConfiguracionPunVen.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConfiguracionPunVen.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConfiguracionPunVen.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConfiguracionPunVen.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConfiguracionPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConfiguracionPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConfiguracionPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConfiguracionPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConfiguracionPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConfiguracionPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConfiguracionPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConfiguracionPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConfiguracionPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConfiguracionPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConfiguracionPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConfiguracionPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConfiguracionPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConfiguracionPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConfiguracionPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConfiguracionPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConfiguracionPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConfiguracionPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConfiguracionPunVen.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConfiguracionPunVen.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConfiguracionPunVen.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConfiguracionPunVen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConfiguracionPunVen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConfiguracionPunVen.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConfiguracionPunVen.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConfiguracionPunVen.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConfiguracionPunVen.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConfiguracionPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConfiguracionPunVen = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConfiguracionPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConfiguracionPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConfiguracionPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConfiguracionPunVen = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConfiguracionPunVen.setLayout(gridaBagParametrosReportesConfiguracionPunVen);
			this.jPanelParametrosReportesAccionesConfiguracionPunVen.setLayout(gridaBagParametrosReportesAccionesConfiguracionPunVen);
			
			
			this.jPanelParametrosAuxiliar1ConfiguracionPunVen.setLayout(gridaBagParametrosAuxiliar1ConfiguracionPunVen);
			this.jPanelParametrosAuxiliar2ConfiguracionPunVen.setLayout(gridaBagParametrosAuxiliar2ConfiguracionPunVen);
			this.jPanelParametrosAuxiliar3ConfiguracionPunVen.setLayout(gridaBagParametrosAuxiliar3ConfiguracionPunVen);
			this.jPanelParametrosAuxiliar4ConfiguracionPunVen.setLayout(gridaBagParametrosAuxiliar4ConfiguracionPunVen);
			//this.jPanelParametrosAuxiliar5ConfiguracionPunVen.setLayout(gridaBagParametrosAuxiliar2ConfiguracionPunVen);			
			
			
			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jButtonRecargarInformacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConfiguracionPunVen.add(this.jComboBoxTiposPaginacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConfiguracionPunVen.add(this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConfiguracionPunVen.add(this.jComboBoxTiposArchivosReportesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jPanelParametrosAuxiliar1ConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConfiguracionPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConfiguracionPunVen.add(this.jComboBoxTiposReportesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jPanelParametrosAuxiliar4ConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jComboBoxTiposReportesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jCheckBoxGenerarReporteConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jPanelParametrosAuxiliar2ConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConfiguracionPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jLabelAccionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
				this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConfiguracionPunVen.add(this.jButtonAbrirOrderByConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jComboBoxTiposSeleccionarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
			
			
			/*
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConfiguracionPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jCheckBoxSeleccionarTodosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConfiguracionPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConfiguracionPunVen.add(this.jCheckBoxSeleccionarTodosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);															
				
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConfiguracionPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConfiguracionPunVen.add(this.jCheckBoxSeleccionadosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jPanelParametrosAuxiliar3ConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jComboBoxTiposAccionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
	
				
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConfiguracionPunVen.add(this.jTextFieldValorCampoGeneralConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciocontableConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposIniciocontableConfiguracionPunVen.setLayout(gridaBagLayoutCamposIniciocontableConfiguracionPunVen);

		GridBagLayout gridaBagLayoutCamposIniciodocumentoConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposIniciodocumentoConfiguracionPunVen.setLayout(gridaBagLayoutCamposIniciodocumentoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutCamposInicioformatoConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposInicioformatoConfiguracionPunVen.setLayout(gridaBagLayoutCamposInicioformatoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutCamposIniciotransaccionConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposIniciotransaccionConfiguracionPunVen.setLayout(gridaBagLayoutCamposIniciotransaccionConfiguracionPunVen);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConfiguracionPunVen = new GridBagLayout();

			this.jScrollPanelDatosConfiguracionPunVen.setLayout(gridaBagLayoutDatosConfiguracionPunVen);
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
			this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
			
			this.jScrollPanelDatosConfiguracionPunVen.add(this.jTableDatosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConfiguracionPunVen.setViewportView(this.jTableDatosConfiguracionPunVen);
		this.jTableDatosConfiguracionPunVen.setFillsViewportHeight(true);
		this.jTableDatosConfiguracionPunVen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConfiguracionPunVen= new GridBagLayout();
		this.jPanelAccionesConfiguracionPunVen.setLayout(gridaBagLayoutAccionesConfiguracionPunVen);
		
		
		/*	
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
			
		this.jPanelAccionesConfiguracionPunVen.add(this.jButtonNuevoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdBodegaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdBodegaConfiguracionPunVen.add(jLabelid_bodegaFK_IdBodegaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdBodegaConfiguracionPunVen.add(jComboBoxid_bodegaFK_IdBodegaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdBodegaConfiguracionPunVen.add(jButtonFK_IdBodegaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("1.-Por Bodega ", jPanelFK_IdBodegaConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteConsumidorFinalConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdClienteConsumidorFinalConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteConsumidorFinalConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteConsumidorFinalConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteConsumidorFinalConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdClienteConsumidorFinalConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen.add(jLabelid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen.add(jComboBoxid_cliente_consumidor_finalFK_IdClienteConsumidorFinalConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);


		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen.add(this.jButtonBuscarFK_IdClienteConsumidorFinalid_cliente_consumidor_finalConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen.add(jButtonFK_IdClienteConsumidorFinalConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("2.-Por Cliente Consumor Final ", jPanelFK_IdClienteConsumidorFinalConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableEfectivoConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableEfectivoConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableEfectivoConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableEfectivoConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableEfectivoConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdCuentaContableEfectivoConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen.add(jLabelid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen.add(jComboBoxid_cuenta_contable_efectivoFK_IdCuentaContableEfectivoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen.add(jButtonFK_IdCuentaContableEfectivoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("3.-Por Cta Contable Efectivo ", jPanelFK_IdCuentaContableEfectivoConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableIceConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableIceConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIceConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIceConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableIceConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableIceConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdCuentaContableIceConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdCuentaContableIceConfiguracionPunVen.add(jLabelid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdCuentaContableIceConfiguracionPunVen.add(jComboBoxid_cuenta_contable_iceFK_IdCuentaContableIceConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdCuentaContableIceConfiguracionPunVen.add(jButtonFK_IdCuentaContableIceConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("4.-Por Cta Contable Ice ", jPanelFK_IdCuentaContableIceConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableOtrosConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableOtrosConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableOtrosConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableOtrosConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableOtrosConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableOtrosConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdCuentaContableOtrosConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdCuentaContableOtrosConfiguracionPunVen.add(jLabelid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdCuentaContableOtrosConfiguracionPunVen.add(jComboBoxid_cuenta_contable_otrosFK_IdCuentaContableOtrosConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdCuentaContableOtrosConfiguracionPunVen.add(jButtonFK_IdCuentaContableOtrosConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("5.-Por Cta Contable Otros ", jPanelFK_IdCuentaContableOtrosConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFormatoFacturaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoFacturaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoFacturaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoFacturaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoFacturaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoFacturaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdFormatoFacturaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdFormatoFacturaConfiguracionPunVen.add(jLabelid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdFormatoFacturaConfiguracionPunVen.add(jComboBoxid_formato_facturaFK_IdFormatoFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdFormatoFacturaConfiguracionPunVen.add(jButtonFK_IdFormatoFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("6.-Por Formato Factura ", jPanelFK_IdFormatoFacturaConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdFormatoNotaCreditoConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNotaCreditoConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaCreditoConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaCreditoConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNotaCreditoConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdFormatoNotaCreditoConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen.add(jLabelid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen.add(jComboBoxid_formato_nota_creditoFK_IdFormatoNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen.add(jButtonFK_IdFormatoNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("7.-Por Formato Nota Credito ", jPanelFK_IdFormatoNotaCreditoConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdFormatoNotaVentaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNotaVentaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaVentaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNotaVentaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNotaVentaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNotaVentaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdFormatoNotaVentaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdFormatoNotaVentaConfiguracionPunVen.add(jLabelid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdFormatoNotaVentaConfiguracionPunVen.add(jComboBoxid_formato_nota_ventaFK_IdFormatoNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdFormatoNotaVentaConfiguracionPunVen.add(jButtonFK_IdFormatoNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("8.-Por Formato Nota Venta ", jPanelFK_IdFormatoNotaVentaConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoFacturaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoFacturaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoFacturaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoFacturaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoFacturaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTipoDocumentoFacturaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen.add(jLabelid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen.add(jComboBoxid_tipo_documento_facturaFK_IdTipoDocumentoFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen.add(jButtonFK_IdTipoDocumentoFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("9.-Por T Documento Factura ", jPanelFK_IdTipoDocumentoFacturaConfiguracionPunVen);
		jTabbedPaneBusquedasConfiguracionPunVen.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.add(jLabelid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.add(jComboBoxid_tipo_documento_nota_creditoFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen.add(jButtonFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("10.-Por T Documento Nota Credito ", jPanelFK_IdTipoDocumentoNotaCreditoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoNotaVentaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTipoDocumentoNotaVentaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.add(jLabelid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.add(jComboBoxid_tipo_documento_nota_ventaFK_IdTipoDocumentoNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen.add(jButtonFK_IdTipoDocumentoNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("11.-Por T Documento Nota Venta ", jPanelFK_IdTipoDocumentoNotaVentaConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.add(jLabelid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.add(jComboBoxid_tipo_documento_tarjeta_creditoFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen.add(jButtonFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("12.-Por T Documento Tarjeta Credito ", jPanelFK_IdTipoDocumentoTarjetaCreditoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTransaccionCuentaFacturaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionCuentaFacturaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaFacturaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaFacturaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionCuentaFacturaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTransaccionCuentaFacturaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen.add(jLabelid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen.add(jComboBoxid_transaccion_cuenta_facturaFK_IdTransaccionCuentaFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen.add(jButtonFK_IdTransaccionCuentaFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("13.-Por Transaccion Cuenta Factura ", jPanelFK_IdTransaccionCuentaFacturaConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.add(jLabelid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.add(jComboBoxid_transaccion_cuenta_nota_creditoFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen.add(jButtonFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("14.-Por Transaccion Cuenta Nota Credito ", jPanelFK_IdTransaccionCuentaNotaCreditoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.add(jLabelid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.add(jComboBoxid_transaccion_cuenta_nota_ventaFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen.add(jButtonFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("15.-Por Transaccion Cuenta Nota Venta ", jPanelFK_IdTransaccionCuentaNotaVentaConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTransaccionFacturaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionFacturaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFacturaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionFacturaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionFacturaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionFacturaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTransaccionFacturaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTransaccionFacturaConfiguracionPunVen.add(jLabelid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTransaccionFacturaConfiguracionPunVen.add(jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTransaccionFacturaConfiguracionPunVen.add(jButtonFK_IdTransaccionFacturaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("16.-Por Transaccion Factura ", jPanelFK_IdTransaccionFacturaConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTransaccionNotaCreditoConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionNotaCreditoConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionNotaCreditoConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionNotaCreditoConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionNotaCreditoConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTransaccionNotaCreditoConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen.add(jLabelid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen.add(jComboBoxid_transaccion_nota_creditoFK_IdTransaccionNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen.add(jButtonFK_IdTransaccionNotaCreditoConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("17.-Por Transaccion Nota Credito ", jPanelFK_IdTransaccionNotaCreditoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutFK_IdTransaccionNotaVentaConfiguracionPunVen= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionNotaVentaConfiguracionPunVen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionNotaVentaConfiguracionPunVen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionNotaVentaConfiguracionPunVen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionNotaVentaConfiguracionPunVen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen.setLayout(gridaBagLayoutFK_IdTransaccionNotaVentaConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 0;
		jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen.add(jLabelid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 0;
		gridBagConstraintsConfiguracionPunVen.gridx = 1;
		jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen.add(jComboBoxid_transaccion_nota_ventaFK_IdTransaccionNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConfiguracionPunVen.gridy = 1;
		gridBagConstraintsConfiguracionPunVen.gridx =1;
		jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen.add(jButtonFK_IdTransaccionNotaVentaConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);

		jTabbedPaneBusquedasConfiguracionPunVen.addTab("18.-Por Transaccion Nota Venta ", jPanelFK_IdTransaccionNotaVentaConfiguracionPunVen);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConfiguracionPunVen);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();						
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConfiguracionPunVen.gridx = 0;		
			//this.gridBagConstraintsConfiguracionPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConfiguracionPunVen.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;		
		//this.gridBagConstraintsConfiguracionPunVen.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConfiguracionPunVen);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConfiguracionPunVen.gridx = 0;		
			this.gridBagConstraintsConfiguracionPunVen.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConfiguracionPunVen.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);								
		
		
		/*
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		*/		
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConfiguracionPunVen.gridx =0;
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConfiguracionPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
				
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConfiguracionPunVenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConfiguracionPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConfiguracionPunVen = new GridBagLayout();
			this.jPanelBusquedasParametrosConfiguracionPunVen.setLayout(gridaBagLayoutBusquedasParametrosConfiguracionPunVen);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConfiguracionPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConfiguracionPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConfiguracionPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConfiguracionPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			
			
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
			
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConfiguracionPunVen;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConfiguracionPunVen() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConfiguracionPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConfiguracionPunVen.setName("jPanelReporteDinamicoConfiguracionPunVen"); 
		
		this.jPanelReporteDinamicoConfiguracionPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConfiguracionPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConfiguracionPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConfiguracionPunVen.setLayout(gridaBagLayoutReporteDinamicoConfiguracionPunVen);
		
		
		this.jInternalFrameReporteDinamicoConfiguracionPunVen= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConfiguracionPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConfiguracionPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConfiguracionPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConfiguracionPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConfiguracionPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConfiguracionPunVen.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConfiguracionPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConfiguracionPunVen.setResizable(true);
	    this.jInternalFrameReporteDinamicoConfiguracionPunVen.setClosable(true);
	    this.jInternalFrameReporteDinamicoConfiguracionPunVen.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConfiguracionPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConfiguracionPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConfiguracionPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Configuracion Pun Venes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConfiguracionPunVen = new JLabelMe();

		this.jLabelColumnasSelectReporteConfiguracionPunVen.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jLabelColumnasSelectReporteConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConfiguracionPunVen = new JList<Reporte>();
		this.jListColumnasSelectReporteConfiguracionPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConfiguracionPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConfiguracionPunVen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConfiguracionPunVen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConfiguracionPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConfiguracionPunVen=new JScrollPane(this.jListColumnasSelectReporteConfiguracionPunVen);
			
			this.jScrollColumnasSelectReporteConfiguracionPunVen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConfiguracionPunVen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConfiguracionPunVen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jListColumnasSelectReporteConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jScrollColumnasSelectReporteConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConfiguracionPunVen = new JLabelMe();

		this.jLabelRelacionesSelectReporteConfiguracionPunVen.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConfiguracionPunVen = new JList<Reporte>();
		this.jListRelacionesSelectReporteConfiguracionPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConfiguracionPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConfiguracionPunVen.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConfiguracionPunVen.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConfiguracionPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConfiguracionPunVen=new JScrollPane(this.jListRelacionesSelectReporteConfiguracionPunVen);
			
			this.jScrollRelacionesSelectReporteConfiguracionPunVen.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConfiguracionPunVen.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConfiguracionPunVen.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConfiguracionPunVen = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConfiguracionPunVen = new JComboBoxMe();
		this.jListColumnasValoresGraficoConfiguracionPunVen = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConfiguracionPunVen = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConfiguracionPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConfiguracionPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConfiguracionPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConfiguracionPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConfiguracionPunVen = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConfiguracionPunVen.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jLabelGenerarExcelReporteDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConfiguracionPunVen = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConfiguracionPunVen.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConfiguracionPunVen,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConfiguracionPunVen.setToolTipText("Generar EXCEL"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jButtonGenerarExcelReporteDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jComboBoxTiposReportesDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConfiguracionPunVen = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConfiguracionPunVen.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jLabelTiposArchivoReporteDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jComboBoxTiposArchivosReportesDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConfiguracionPunVen = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConfiguracionPunVen.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConfiguracionPunVen,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConfiguracionPunVen.setToolTipText("Generar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jButtonGenerarReporteDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConfiguracionPunVen = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConfiguracionPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConfiguracionPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConfiguracionPunVen.setToolTipText("Cancelar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConfiguracionPunVen.add(this.jButtonCerrarReporteDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConfiguracionPunVen = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConfiguracionPunVen= new JScrollPane(jPanelReporteDinamicoConfiguracionPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConfiguracionPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConfiguracionPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConfiguracionPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Configuracion Pun Venes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConfiguracionPunVen.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConfiguracionPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConfiguracionPunVen.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConfiguracionPunVen);
		this.jInternalFrameReporteDinamicoConfiguracionPunVen.getContentPane().add(this.jScrollPanelReporteDinamicoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConfiguracionPunVen() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConfiguracionPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConfiguracionPunVen.setName("jPanelImportacionConfiguracionPunVen"); 
		
		this.jPanelImportacionConfiguracionPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConfiguracionPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConfiguracionPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConfiguracionPunVen.setLayout(gridaBagLayoutImportacionConfiguracionPunVen);
		
		
		this.jInternalFrameImportacionConfiguracionPunVen= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConfiguracionPunVen= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConfiguracionPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConfiguracionPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConfiguracionPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConfiguracionPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConfiguracionPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConfiguracionPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConfiguracionPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConfiguracionPunVen.setResizable(true);
	    this.jInternalFrameImportacionConfiguracionPunVen.setClosable(true);
	    this.jInternalFrameImportacionConfiguracionPunVen.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConfiguracionPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConfiguracionPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConfiguracionPunVen.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConfiguracionPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConfiguracionPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConfiguracionPunVen.setResizable(true);
	    this.jInternalFrameImportacionConfiguracionPunVen.setClosable(true);
	    this.jInternalFrameImportacionConfiguracionPunVen.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConfiguracionPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConfiguracionPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConfiguracionPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Configuracion Pun Venes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConfiguracionPunVen = new JLabelMe();

		this.jLabelArchivoImportacionConfiguracionPunVen.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConfiguracionPunVen.add(this.jLabelArchivoImportacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConfiguracionPunVen = new JFileChooser();		
		this.jFileChooserImportacionConfiguracionPunVen.setToolTipText("ESCOGER ARCHIVO"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConfiguracionPunVen = new JButtonMe();
		this.jButtonAbrirImportacionConfiguracionPunVen.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConfiguracionPunVen,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConfiguracionPunVen.setToolTipText("Generar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConfiguracionPunVen.add(this.jButtonAbrirImportacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConfiguracionPunVen = new JLabelMe();

		this.jLabelPathArchivoImportacionConfiguracionPunVen.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConfiguracionPunVen.add(this.jLabelPathArchivoImportacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConfiguracionPunVen=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConfiguracionPunVen.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConfiguracionPunVen.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConfiguracionPunVen.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConfiguracionPunVen.add(this.jTextFieldPathArchivoImportacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConfiguracionPunVen = new JButtonMe();
		this.jButtonGenerarImportacionConfiguracionPunVen.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConfiguracionPunVen,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConfiguracionPunVen.setToolTipText("Generar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConfiguracionPunVen.add(this.jButtonGenerarImportacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConfiguracionPunVen = new JButtonMe();
		this.jButtonCerrarImportacionConfiguracionPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConfiguracionPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConfiguracionPunVen.setToolTipText("Cancelar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConfiguracionPunVen.add(this.jButtonCerrarImportacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConfiguracionPunVen = new GridBagLayout();
		
		this.jScrollPanelImportacionConfiguracionPunVen= new JScrollPane(jPanelImportacionConfiguracionPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy =iPosYImportacion;
		this.gridBagConstraintsConfiguracionPunVen.gridx =iPosXImportacion;
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConfiguracionPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConfiguracionPunVen.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConfiguracionPunVen);
		this.jInternalFrameImportacionConfiguracionPunVen.getContentPane().add(this.jScrollPanelImportacionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConfiguracionPunVen(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConfiguracionPunVen = new JButtonMe();
			this.jButtonAbrirOrderByConfiguracionPunVen.setText("Orden");
			this.jButtonAbrirOrderByConfiguracionPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConfiguracionPunVen,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConfiguracionPunVen";
			inputMap = this.jButtonAbrirOrderByConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConfiguracionPunVen"));
		
		
			GridBagLayout gridaBagLayoutOrderByConfiguracionPunVen = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConfiguracionPunVen.setName("jPanelOrderByConfiguracionPunVen"); 
			
			this.jPanelOrderByConfiguracionPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConfiguracionPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConfiguracionPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConfiguracionPunVen.setLayout(gridaBagLayoutOrderByConfiguracionPunVen);
			
			
			this.jTableDatosConfiguracionPunVenOrderBy = new JTableMe();        
			this.jTableDatosConfiguracionPunVenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConfiguracionPunVenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConfiguracionPunVenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConfiguracionPunVenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConfiguracionPunVenOrderBy.setViewportView(this.jTableDatosConfiguracionPunVenOrderBy);
			this.jTableDatosConfiguracionPunVenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConfiguracionPunVenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConfiguracionPunVen= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConfiguracionPunVen= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConfiguracionPunVen = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConfiguracionPunVen= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConfiguracionPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConfiguracionPunVen.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConfiguracionPunVen.setTitle("Orden");
			this.jInternalFrameOrderByConfiguracionPunVen.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConfiguracionPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConfiguracionPunVen.setResizable(true);
			this.jInternalFrameOrderByConfiguracionPunVen.setClosable(true);
			this.jInternalFrameOrderByConfiguracionPunVen.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConfiguracionPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConfiguracionPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConfiguracionPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Configuracion Pun Venes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConfiguracionPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConfiguracionPunVen.ipady =150;
				
			this.jPanelOrderByConfiguracionPunVen.add(jScrollPanelDatosConfiguracionPunVenOrderBy, this.gridBagConstraintsConfiguracionPunVen);//this.jTableDatosConfiguracionPunVenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConfiguracionPunVen = new JButtonMe();
			this.jButtonCerrarOrderByConfiguracionPunVen.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConfiguracionPunVen,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConfiguracionPunVen.setToolTipText("Cancelar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConfiguracionPunVen.add(this.jButtonCerrarOrderByConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConfiguracionPunVen = new GridBagLayout();
			
			this.jScrollPanelOrderByConfiguracionPunVen= new JScrollPane(jPanelOrderByConfiguracionPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy =iPosYOrderBy;
			this.gridBagConstraintsConfiguracionPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConfiguracionPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConfiguracionPunVen.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConfiguracionPunVen);
			
			this.jInternalFrameOrderByConfiguracionPunVen.getContentPane().add(this.jScrollPanelOrderByConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
		
		} else {
			this.jButtonAbrirOrderByConfiguracionPunVen = new JButtonMe();
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
		int iWidthTableCalculado=0;//4130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.configuracionpunvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConfiguracionPunVen.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConfiguracionPunVen.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConfiguracionPunVen.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConfiguracionPunVen.getRowHeight();//ConfiguracionPunVenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen.isSelected()) {
					iHeightTable=ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConfiguracionPunVen.isSelected()) {
					iHeightTable=ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConfiguracionPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConfiguracionPunVen.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConfiguracionPunVen.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConfiguracionPunVen.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConfiguracionPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConfiguracionPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConfiguracionPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConfiguracionPunVen!=null && this.jInternalFrameOrderByConfiguracionPunVen.getjTableDatosOrderBy()!=null) {
			//if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConfiguracionPunVen.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConfiguracionPunVen.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConfiguracionPunVen.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConfiguracionPunVen.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConfiguracionPunVen.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConfiguracionPunVen.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConfiguracionPunVen.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConfiguracionPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConfiguracionPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConfiguracionPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=configuracionpunvenLogic.getConfiguracionPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=configuracionpunvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConfiguracionPunVen> TraerConfiguracionPunVenBeans(List<ConfiguracionPunVen> configuracionpunvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConfiguracionPunVen configuracionpunven:configuracionpunvens) {
					
				if(!(ConfiguracionPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConfiguracionPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					configuracionpunven.setsDetalleGeneralEntityReporte(ConfiguracionPunVenConstantesFunciones.getConfiguracionPunVenDescripcion(configuracionpunven));
										
						
					
						
					
				} else  {
							
					//configuracionpunven.setsDetalleGeneralEntityReporte(configuracionpunven.getsDetalleGeneralEntityReporte());
										
				}
				
				//configuracionpunvenbeans.add(configuracionpunvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return configuracionpunvens;
    }
	//PARA REPORTES FIN
}
