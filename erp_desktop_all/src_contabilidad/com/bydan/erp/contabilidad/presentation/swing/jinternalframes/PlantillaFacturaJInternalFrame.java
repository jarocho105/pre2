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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PlantillaFacturaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PlantillaFacturaJInternalFrame extends PlantillaFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPlantillaFactura;
	
	protected JMenuBar jmenuBarPlantillaFactura;
	
	protected JMenu jmenuPlantillaFactura;
	protected JMenu jmenuDatosPlantillaFactura;
	protected JMenu jmenuArchivoPlantillaFactura;
	protected JMenu jmenuAccionesPlantillaFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlantillaFactura;	
	protected GridBagConstraints gridBagConstraintsPlantillaFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PlantillaFacturaDetalleFormJInternalFrame jInternalFrameDetalleFormPlantillaFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPlantillaFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPlantillaFactura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableaplicadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableaplicada="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditobienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditobien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditoservicio="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuentebienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuentebien="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuenteservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuenteservicio="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivabienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivabien="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivaservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";
	
	public PlantillaFacturaSessionBean plantillafacturaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableaplicadaSessionBean;
	public CuentaContableSessionBean cuentacontablecreditobienSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoservicioSessionBean;
	public TipoRetencionSessionBean tiporetencionfuentebienSessionBean;
	public TipoRetencionSessionBean tiporetencionfuenteservicioSessionBean;
	public TipoRetencionSessionBean tiporetencionivabienSessionBean;
	public TipoRetencionSessionBean tiporetencionivaservicioSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PlantillaFactura> plantillafacturas;		
	public List<PlantillaFactura> plantillafacturasEliminados;	
	public List<PlantillaFactura> plantillafacturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPlantillaFactura;		
	protected JButton jButtonAbrirOrderByPlantillaFactura;
	
	
	//protected JPanel jPanelOrderByPlantillaFactura;
	//public JScrollPane jScrollPanelOrderByPlantillaFactura;	
	//protected JButton jButtonCerrarOrderByPlantillaFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PlantillaFacturaLogic plantillafacturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPlantillaFactura;
	public JScrollPane jScrollPanelDatosEdicionPlantillaFactura;
	public JScrollPane jScrollPanelDatosGeneralPlantillaFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosPlantillaFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPlantillaFactura;
	//public JScrollPane jScrollPanelImportacionPlantillaFactura;
	
	
	
	protected JPanel jPanelAccionesPlantillaFactura;
	
    protected JPanel jPanelPaginacionPlantillaFactura;
    protected JPanel jPanelParametrosReportesPlantillaFactura;
	protected JPanel jPanelParametrosReportesAccionesPlantillaFactura;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralPlantillaFactura;
	protected Integer iXPanelCamposIniciogeneralPlantillaFactura=0;
	protected Integer iYPanelCamposIniciogeneralPlantillaFactura=0;

	protected JPanel jPanelCamposIniciocuenta_contablePlantillaFactura;
	protected Integer iXPanelCamposIniciocuenta_contablePlantillaFactura=0;
	protected Integer iYPanelCamposIniciocuenta_contablePlantillaFactura=0;

	protected JPanel jPanelCamposIniciotipo_retencionPlantillaFactura;
	protected Integer iXPanelCamposIniciotipo_retencionPlantillaFactura=0;
	protected Integer iYPanelCamposIniciotipo_retencionPlantillaFactura=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PlantillaFactura;
	protected JPanel jPanelParametrosAuxiliar2PlantillaFactura;
	protected JPanel jPanelParametrosAuxiliar3PlantillaFactura;
	protected JPanel jPanelParametrosAuxiliar4PlantillaFactura;
	//protected JPanel jPanelParametrosAuxiliar5PlantillaFactura;
	
	
	
	//protected JPanel jPanelReporteDinamicoPlantillaFactura;
	//protected JPanel jPanelImportacionPlantillaFactura;
	
	
	public JTable jTableDatosPlantillaFactura;
	
	
	
	//public JTable jTableDatosPlantillaFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPlantillaFactura;
	protected JButton jButtonDuplicarPlantillaFactura;
	protected JButton jButtonCopiarPlantillaFactura;
	protected JButton jButtonVerFormPlantillaFactura;
	protected JButton jButtonNuevoRelacionesPlantillaFactura;
	protected JButton jButtonModificarPlantillaFactura;
	
    protected JButton jButtonGuardarCambiosTablaPlantillaFactura;
	protected JButton jButtonCerrarPlantillaFactura;
	
	
	protected JButton jButtonRecargarInformacionPlantillaFactura;
	protected JButton jButtonProcesarInformacionPlantillaFactura;
	
	
	protected JButton jButtonAnterioresPlantillaFactura;
	protected JButton jButtonSiguientesPlantillaFactura;
	protected JButton jButtonNuevoGuardarCambiosPlantillaFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPlantillaFactura;
	//protected JButton jButtonCerrarReporteDinamicoPlantillaFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoPlantillaFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionPlantillaFactura;
	//protected JButton jButtonGenerarImportacionPlantillaFactura;
	//protected JButton jButtonCerrarImportacionPlantillaFactura;
	//protected JFileChooser jFileChooserImportacionPlantillaFactura;
	//protected File fileImportacionPlantillaFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlantillaFactura;
	protected JButton jButtonDuplicarToolBarPlantillaFactura;
	protected JButton jButtonNuevoRelacionesToolBarPlantillaFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarPlantillaFactura;
	protected JButton jButtonCopiarToolBarPlantillaFactura;
	protected JButton jButtonVerFormToolBarPlantillaFactura;
	public JButton jButtonGuardarCambiosTablaToolBarPlantillaFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarPlantillaFactura;
	protected JButton jButtonCerrarToolBarPlantillaFactura;
	
	protected JButton jButtonRecargarInformacionToolBarPlantillaFactura;
	protected JButton jButtonProcesarInformacionToolBarPlantillaFactura;
	protected JButton jButtonAnterioresToolBarPlantillaFactura;
	protected JButton jButtonSiguientesToolBarPlantillaFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarPlantillaFactura;
	protected JButton jButtonAbrirOrderByToolBarPlantillaFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlantillaFactura;
	protected JMenuItem jMenuItemDuplicarPlantillaFactura;
	protected JMenuItem jMenuItemNuevoRelacionesPlantillaFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPlantillaFactura;
	protected JMenuItem jMenuItemCopiarPlantillaFactura;
	protected JMenuItem jMenuItemVerFormPlantillaFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlantillaFactura;
	protected JMenuItem jMenuItemCerrarPlantillaFactura;
	protected JMenuItem jMenuItemDetalleCerrarPlantillaFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPlantillaFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlantillaFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionPlantillaFactura;
	protected JMenuItem jMenuItemProcesarInformacionPlantillaFactura;
	protected JMenuItem jMenuItemAnterioresPlantillaFactura;
	protected JMenuItem jMenuItemSiguientesPlantillaFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlantillaFactura;
	protected JMenuItem jMenuItemAbrirOrderByPlantillaFactura;
	protected JMenuItem jMenuItemMostrarOcultarPlantillaFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlantillaFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPlantillaFactura;
	protected JCheckBox jCheckBoxSeleccionadosPlantillaFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPlantillaFactura;
	protected JCheckBox jCheckBoxConGraficoReportePlantillaFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPlantillaFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPlantillaFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPlantillaFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPlantillaFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlantillaFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPlantillaFactura;
	protected JTextField jTextFieldValorCampoGeneralPlantillaFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePlantillaFactura;
	//public JList<Reporte> jListColumnasSelectReportePlantillaFactura;
	//public JScrollPane jScrollColumnasSelectReportePlantillaFactura;
	
	//public JLabel jLabelRelacionesSelectReportePlantillaFactura;
	//public JList<Reporte> jListRelacionesSelectReportePlantillaFactura;
	//public JScrollPane jScrollRelacionesSelectReportePlantillaFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPlantillaFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPlantillaFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPlantillaFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoPlantillaFactura;
	
		
	//public JLabel jLabelArchivoImportacionPlantillaFactura;	
	//public JLabel jLabelPathArchivoImportacionPlantillaFactura;
	//protected JTextField jTextFieldPathArchivoImportacionPlantillaFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPlantillaFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPlantillaFactura;
	
	//public JLabel jLabelColumnaCategoriaValorPlantillaFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPlantillaFactura;
	
	//public JLabel jLabelColumnasValoresGraficoPlantillaFactura;
	//public JList<Reporte> jListColumnasValoresGraficoPlantillaFactura;
	//public JScrollPane jScrollColumnasValoresGraficoPlantillaFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPlantillaFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPlantillaFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPlantillaFactura;
	public JPanel jPanelBusquedaPorCodigoPlantillaFactura;
	public JButton jButtonBusquedaPorCodigoPlantillaFactura;
	public JPanel jPanelBusquedaPorNombrePlantillaFactura;
	public JButton jButtonBusquedaPorNombrePlantillaFactura;
	public JPanel jPanelFK_IdCuentaContableCreditoBienPlantillaFactura;
	public JButton jButtonFK_IdCuentaContableCreditoBienPlantillaFactura;
	public JPanel jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura;
	public JButton jButtonFK_IdCuentaContableCreditoFinServicioPlantillaFactura;
	public JPanel jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura;
	public JButton jButtonFK_IdTipoRetencionFuenteBienPlantillaFactura;
	public JPanel jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura;
	public JButton jButtonFK_IdTipoRetencionFuenteServicioPlantillaFactura;
	public JPanel jPanelFK_IdTipoRetencionIvaBienPlantillaFactura;
	public JButton jButtonFK_IdTipoRetencionIvaBienPlantillaFactura;
	public JPanel jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura;
	public JButton jButtonFK_IdTipoRetencionIvaServicioPlantillaFactura;
	
	public JPanel jPanelcodigoBusquedaPorCodigoPlantillaFactura;
	public JLabel jLabelcodigoBusquedaPorCodigoPlantillaFactura;
	public JTextField jTextFieldcodigoBusquedaPorCodigoPlantillaFactura;
	public JButton jButtoncodigoBusquedaPorCodigoPlantillaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombrePlantillaFactura;
	public JLabel jLabelnombreBusquedaPorNombrePlantillaFactura;
	public JTextArea jTextAreanombreBusquedaPorNombrePlantillaFactura;
	public JButton jButtonnombreBusquedaPorNombrePlantillaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura;
	public JLabel jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura;
	public JButton jButtonid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFacturaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura;
	
	public JPanel jPanelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura;
	public JLabel jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura;
	public JButton jButtonid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFacturaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura;
	
	public JPanel jPanelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura;
	public JButton jButtonid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura;
	public JButton jButtonid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura;
	public JButton jButtonid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura;
	public JLabel jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura;
	public JButton jButtonid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFacturaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PlantillaFacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlantillaFacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlantillaFacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlantillaFacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPlantillaFactura)	{
		this.jButtonRecargarInformacionPlantillaFactura = jButtonRecargarInformacionPlantillaFactura;
	}
	
	public JButton getjButtonProcesarInformacionPlantillaFactura() {
		return this.jButtonProcesarInformacionPlantillaFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlantillaFactura)	{
		this.jButtonProcesarInformacionPlantillaFactura = jButtonProcesarInformacionPlantillaFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionPlantillaFactura() {
		return this.jButtonRecargarInformacionPlantillaFactura;
	}
	
	
	public List<PlantillaFactura> getplantillafacturas() {
		return this.plantillafacturas;
	}

	public void setplantillafacturas(List<PlantillaFactura> plantillafacturas) {
		this.plantillafacturas = plantillafacturas;
	}
	
	public List<PlantillaFactura> getplantillafacturasAux() {
		return this.plantillafacturasAux;
	}

	public void setplantillafacturasAux(List<PlantillaFactura> plantillafacturasAux) {
		this.plantillafacturasAux = plantillafacturasAux;
	}
	
	public List<PlantillaFactura> getplantillafacturasEliminados() {
		return this.plantillafacturasEliminados;
	}

	public void setPlantillaFacturasEliminados(List<PlantillaFactura> plantillafacturasEliminados) {
		this.plantillafacturasEliminados = plantillafacturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPlantillaFactura() {
		return jComboBoxTiposSeleccionarPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPlantillaFactura(
			JComboBox jComboBoxTiposSeleccionarPlantillaFactura) {
		this.jComboBoxTiposSeleccionarPlantillaFactura = jComboBoxTiposSeleccionarPlantillaFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPlantillaFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPlantillaFactura() {
		return jTextFieldValorCampoGeneralPlantillaFactura;
	}

	public void setjTextFieldValorCampoGeneralPlantillaFactura(
			JTextField jTextFieldValorCampoGeneralPlantillaFactura) {
		this.jTextFieldValorCampoGeneralPlantillaFactura = jTextFieldValorCampoGeneralPlantillaFactura;
	}

	public void setBorderResaltarValorCampoGeneralPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPlantillaFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPlantillaFactura() {
		return this.jCheckBoxSeleccionarTodosPlantillaFactura;
	}

	public void setjCheckBoxSeleccionarTodosPlantillaFactura(
			JCheckBox jCheckBoxSeleccionarTodosPlantillaFactura) {
		this.jCheckBoxSeleccionarTodosPlantillaFactura = jCheckBoxSeleccionarTodosPlantillaFactura;
	}

	public void setBorderResaltarSeleccionarTodosPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPlantillaFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPlantillaFactura() {
		return this.jCheckBoxSeleccionadosPlantillaFactura;
	}

	public void setjCheckBoxSeleccionadosPlantillaFactura(
			JCheckBox jCheckBoxSeleccionadosPlantillaFactura) {
		this.jCheckBoxSeleccionadosPlantillaFactura = jCheckBoxSeleccionadosPlantillaFactura;
	}
	
	public void setBorderResaltarSeleccionadosPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPlantillaFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPlantillaFactura() {
		return this.jComboBoxTiposArchivosReportesPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPlantillaFactura(
			JComboBox jComboBoxTiposArchivosReportesPlantillaFactura) {
		this.jComboBoxTiposArchivosReportesPlantillaFactura = jComboBoxTiposArchivosReportesPlantillaFactura;
	}

	public void setBorderResaltarTiposArchivosReportesPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPlantillaFactura() {
		return this.jComboBoxTiposReportesPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPlantillaFactura(
			JComboBox jComboBoxTiposReportesPlantillaFactura) {
		this.jComboBoxTiposReportesPlantillaFactura = jComboBoxTiposReportesPlantillaFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPlantillaFactura() {
	//	return jComboBoxTiposReportesDinamicoPlantillaFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPlantillaFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoPlantillaFactura) {
	//	this.jComboBoxTiposReportesDinamicoPlantillaFactura = jComboBoxTiposReportesDinamicoPlantillaFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPlantillaFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoPlantillaFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPlantillaFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPlantillaFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura = jComboBoxTiposArchivosReportesDinamicoPlantillaFactura;
	//}
	
	public void setBorderResaltarTiposReportesPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPlantillaFactura() {
		return this.jComboBoxTiposGraficosReportesPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPlantillaFactura(
			JComboBox jComboBoxTiposGraficosReportesPlantillaFactura) {
		this.jComboBoxTiposGraficosReportesPlantillaFactura = jComboBoxTiposGraficosReportesPlantillaFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPlantillaFactura() {
		return this.jComboBoxTiposPaginacionPlantillaFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPlantillaFactura(
			JComboBox jComboBoxTiposPaginacionPlantillaFactura) {
		this.jComboBoxTiposPaginacionPlantillaFactura = jComboBoxTiposPaginacionPlantillaFactura;
	}
	
	public void setBorderResaltarTiposPaginacionPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPlantillaFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPlantillaFactura() {
		return this.jComboBoxTiposRelacionesPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlantillaFactura() {
		return this.jComboBoxTiposAccionesPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlantillaFactura(
			JComboBox jComboBoxTiposRelacionesPlantillaFactura) {
		this.jComboBoxTiposRelacionesPlantillaFactura = jComboBoxTiposRelacionesPlantillaFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlantillaFactura(
			JComboBox jComboBoxTiposAccionesPlantillaFactura) {
		this.jComboBoxTiposAccionesPlantillaFactura = jComboBoxTiposAccionesPlantillaFactura;
	}
	
	public void setBorderResaltarTiposRelacionesPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPlantillaFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPlantillaFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPlantillaFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPlantillaFactura() {
	//	return jCheckBoxConGraficoDinamicoPlantillaFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoPlantillaFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoPlantillaFactura) {
	//	this.jCheckBoxConGraficoDinamicoPlantillaFactura = jCheckBoxConGraficoDinamicoPlantillaFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPlantillaFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPlantillaFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPlantillaFactura .setBorder(borderResaltar);		
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
		this.plantillafacturaSessionBean=new PlantillaFacturaSessionBean();
		
		this.plantillafacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.plantillafacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.plantillafacturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlantillaFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlantillaFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Plantilla Factura MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {
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
		
		PlantillaFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PlantillaFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPlantillaFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"nuevo","nuevo","Nuevo"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"duplicar","duplicar","Duplicar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"copiar","copiar","Copiar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"ver_form","ver_form","Ver"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"recargar","recargar","Recargar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPlantillaFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPlantillaFactura,this.jTtoolBarPlantillaFactura,
							"cerrar","cerrar","Salir"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPlantillaFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPlantillaFactura;
			
				this.jButtonProcesarInformacionToolBarPlantillaFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPlantillaFactura;
				
		//protected JButton jButtonModificarToolBarPlantillaFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPlantillaFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPlantillaFactura=new JMenuMe("General");
		this.jmenuArchivoPlantillaFactura=new JMenuMe("Archivo");
		this.jmenuAccionesPlantillaFactura=new JMenuMe("Acciones");
		this.jmenuDatosPlantillaFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlantillaFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlantillaFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlantillaFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPlantillaFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPlantillaFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPlantillaFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPlantillaFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPlantillaFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPlantillaFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPlantillaFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlantillaFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlantillaFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPlantillaFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPlantillaFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPlantillaFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPlantillaFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPlantillaFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPlantillaFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPlantillaFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPlantillaFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPlantillaFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlantillaFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlantillaFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlantillaFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPlantillaFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPlantillaFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPlantillaFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPlantillaFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPlantillaFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPlantillaFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPlantillaFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPlantillaFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPlantillaFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPlantillaFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPlantillaFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPlantillaFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPlantillaFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPlantillaFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPlantillaFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPlantillaFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPlantillaFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPlantillaFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlantillaFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlantillaFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlantillaFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPlantillaFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPlantillaFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPlantillaFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPlantillaFactura.add(this.jMenuItemCerrarPlantillaFactura);
			
			this.jmenuAccionesPlantillaFactura.add(this.jMenuItemNuevoPlantillaFactura);
			this.jmenuAccionesPlantillaFactura.add(this.jMenuItemNuevoGuardarCambiosPlantillaFactura);
			this.jmenuAccionesPlantillaFactura.add(this.jMenuItemNuevoRelacionesPlantillaFactura);
			this.jmenuAccionesPlantillaFactura.add(this.jMenuItemGuardarCambiosTablaPlantillaFactura);		
			this.jmenuAccionesPlantillaFactura.add(this.jMenuItemDuplicarPlantillaFactura);		
			this.jmenuAccionesPlantillaFactura.add(this.jMenuItemCopiarPlantillaFactura);		
			this.jmenuAccionesPlantillaFactura.add(this.jMenuItemVerFormPlantillaFactura);		
			
			this.jmenuDatosPlantillaFactura.add(this.jMenuItemRecargarInformacionPlantillaFactura);				
			this.jmenuDatosPlantillaFactura.add(this.jMenuItemAnterioresPlantillaFactura);				
			this.jmenuDatosPlantillaFactura.add(this.jMenuItemSiguientesPlantillaFactura);				
			this.jmenuDatosPlantillaFactura.add(this.jMenuItemAbrirOrderByPlantillaFactura);				
			this.jmenuDatosPlantillaFactura.add(this.jMenuItemMostrarOcultarPlantillaFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPlantillaFactura.add(this.jMenuItemGuardarCambiosPlantillaFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPlantillaFactura.add(this.jmenuArchivoPlantillaFactura);		
			this.jmenuBarPlantillaFactura.add(this.jmenuAccionesPlantillaFactura);		
			this.jmenuBarPlantillaFactura.add(this.jmenuDatosPlantillaFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPlantillaFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPlantillaFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoPlantillaFactura.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoPlantillaFactura= new JButtonMe();
		this.jButtonBusquedaPorCodigoPlantillaFactura.setText("Buscar");
		this.jButtonBusquedaPorCodigoPlantillaFactura.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoPlantillaFactura,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoPlantillaFactura = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoPlantillaFactura.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoPlantillaFactura.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoPlantillaFactura= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombrePlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePlantillaFactura.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePlantillaFactura= new JButtonMe();
		this.jButtonBusquedaPorNombrePlantillaFactura.setText("Buscar");
		this.jButtonBusquedaPorNombrePlantillaFactura.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePlantillaFactura,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePlantillaFactura = new JLabelMe();
		jLabelnombreBusquedaPorNombrePlantillaFactura.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePlantillaFactura.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombrePlantillaFactura= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombrePlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombrePlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCreditoBienPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoBienPlantillaFactura.setToolTipText("Buscar Por Cta. Credito Bien ");
		this.jButtonFK_IdCuentaContableCreditoBienPlantillaFactura= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoBienPlantillaFactura.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoBienPlantillaFactura.setToolTipText("Buscar Por Cta. Credito Bien ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoBienPlantillaFactura,"buscar_button","Buscar Por Cta. Credito Bien ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoBienPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura = new JLabelMe();
		jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setText("Cta. Credito Bien :");
		jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setToolTipText("Cta. Credito Bien");
		jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura.setFocusable(false);

		this.jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setToolTipText("Buscar Por Cta. Credito Servicio ");
		this.jButtonFK_IdCuentaContableCreditoFinServicioPlantillaFactura= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setToolTipText("Buscar Por Cta. Credito Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoFinServicioPlantillaFactura,"buscar_button","Buscar Por Cta. Credito Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoFinServicioPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura = new JLabelMe();
		jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setText("Cta. Credito Servicio :");
		jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setToolTipText("Cta. Credito Servicio");
		jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura.setFocusable(false);

		this.jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura.setToolTipText("Buscar Por Ret Fuente Bien ");
		this.jButtonFK_IdTipoRetencionFuenteBienPlantillaFactura= new JButtonMe();
		this.jButtonFK_IdTipoRetencionFuenteBienPlantillaFactura.setText("Buscar");
		this.jButtonFK_IdTipoRetencionFuenteBienPlantillaFactura.setToolTipText("Buscar Por Ret Fuente Bien ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionFuenteBienPlantillaFactura,"buscar_button","Buscar Por Ret Fuente Bien ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionFuenteBienPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura = new JLabelMe();
		jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setText("Ret Fuente Bien :");
		jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setToolTipText("Ret Fuente Bien");
		jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura.setToolTipText("Buscar Por Ret. Fuente Servicio ");
		this.jButtonFK_IdTipoRetencionFuenteServicioPlantillaFactura= new JButtonMe();
		this.jButtonFK_IdTipoRetencionFuenteServicioPlantillaFactura.setText("Buscar");
		this.jButtonFK_IdTipoRetencionFuenteServicioPlantillaFactura.setToolTipText("Buscar Por Ret. Fuente Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionFuenteServicioPlantillaFactura,"buscar_button","Buscar Por Ret. Fuente Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionFuenteServicioPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura = new JLabelMe();
		jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setText("Ret. Fuente Servicio :");
		jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setToolTipText("Ret. Fuente Servicio");
		jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIvaBienPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIvaBienPlantillaFactura.setToolTipText("Buscar Por Ret. Iva Bien ");
		this.jButtonFK_IdTipoRetencionIvaBienPlantillaFactura= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIvaBienPlantillaFactura.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIvaBienPlantillaFactura.setToolTipText("Buscar Por Ret. Iva Bien ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIvaBienPlantillaFactura,"buscar_button","Buscar Por Ret. Iva Bien ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIvaBienPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura = new JLabelMe();
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setText("Ret. Iva Bien :");
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setToolTipText("Ret. Iva Bien");
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura.setToolTipText("Buscar Por Ret. Iva Servicio ");
		this.jButtonFK_IdTipoRetencionIvaServicioPlantillaFactura= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIvaServicioPlantillaFactura.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIvaServicioPlantillaFactura.setToolTipText("Buscar Por Ret. Iva Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIvaServicioPlantillaFactura,"buscar_button","Buscar Por Ret. Iva Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIvaServicioPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura = new JLabelMe();
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setText("Ret. Iva Servicio :");
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setToolTipText("Ret. Iva Servicio");
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPlantillaFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasPlantillaFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlantillaFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlantillaFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePlantillaFactura = new PlantillaFacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Plantilla Factura DATOS");
			this.jInternalFrameDetalleFormPlantillaFactura = new PlantillaFacturaDetalleFormJInternalFrame(jDesktopPane,this.plantillafacturaSessionBean.getConGuardarRelaciones(),this.plantillafacturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPlantillaFactura = null;//new PlantillaFacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlantillaFactura= new GridBagLayout();
		
		
		this.jTableDatosPlantillaFactura = new JTableMe();      
		
		String sToolTipPlantillaFactura="";
		sToolTipPlantillaFactura=PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlantillaFactura+="(Contabilidad.PlantillaFactura)";
		}
		
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlantillaFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPlantillaFactura.setToolTipText(sToolTipPlantillaFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPlantillaFactura);
		this.jTableDatosPlantillaFactura.setAutoCreateRowSorter(true);
		this.jTableDatosPlantillaFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPlantillaFactura.setRowSelectionAllowed(true);
		this.jTableDatosPlantillaFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPlantillaFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPlantillaFactura = new JButtonMe();
		this.jButtonDuplicarPlantillaFactura = new JButtonMe();
		this.jButtonCopiarPlantillaFactura = new JButtonMe();
		this.jButtonVerFormPlantillaFactura = new JButtonMe();
		this.jButtonNuevoRelacionesPlantillaFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPlantillaFactura = new JButtonMe();
		this.jButtonCerrarPlantillaFactura = new JButtonMe();
		
		this.jScrollPanelDatosPlantillaFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralPlantillaFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contablePlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipo_retencionPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Plantilla Factura";
		
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plantilla Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosPlantillaFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlantillaFactura.setToolTipText("Acciones");
        this.jPanelAccionesPlantillaFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralPlantillaFactura.setName("jPanelCamposFingeneralPlantillaFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contablePlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contablePlantillaFactura.setName("jPanelCamposFincuenta_contablePlantillaFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contablePlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipo_retencionPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Retencion"));
		this.jPanelCamposIniciotipo_retencionPlantillaFactura.setName("jPanelCamposFintipo_retencionPlantillaFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipo_retencionPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoPlantillaFactura=new ReporteDinamicoJInternalFrame(PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPlantillaFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPlantillaFactura=new ImportacionJInternalFrame(PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPlantillaFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPlantillaFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByPlantillaFactura.setText("Orden");
		this.jButtonAbrirOrderByPlantillaFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlantillaFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlantillaFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlantillaFactura,false,this);
			
			//this.cargarOrderByPlantillaFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlantillaFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlantillaFactura,true,this);
			
			//this.cargarOrderByPlantillaFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPlantillaFactura.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosPlantillaFactura.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosPlantillaFactura.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosPlantillaFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlantillaFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlantillaFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPlantillaFactura.setText("Nuevo");
		this.jButtonDuplicarPlantillaFactura.setText("Duplicar");
		this.jButtonCopiarPlantillaFactura.setText("Copiar");
		this.jButtonVerFormPlantillaFactura.setText("Ver");
		this.jButtonNuevoRelacionesPlantillaFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPlantillaFactura.setText("Guardar");
		this.jButtonCerrarPlantillaFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlantillaFactura,"nuevo_button","Nuevo",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPlantillaFactura,"duplicar_button","Duplicar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPlantillaFactura,"copiar_button","Copiar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPlantillaFactura,"ver_form","Ver",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPlantillaFactura,"nuevorelaciones_button","Nuevo Rel",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlantillaFactura,"guardarcambiostabla_button","Guardar",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlantillaFactura,"cerrar_button","Salir",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPlantillaFactura.setToolTipText("Nuevo"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPlantillaFactura.setToolTipText("Duplicar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPlantillaFactura.setToolTipText("Copiar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPlantillaFactura.setToolTipText("Ver"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPlantillaFactura.setToolTipText("Nuevo Rel"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPlantillaFactura.setToolTipText("Guardar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlantillaFactura.setToolTipText("Salir"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlantillaFactura";
		inputMap = this.jButtonNuevoPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlantillaFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarPlantillaFactura";
		inputMap = this.jButtonDuplicarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPlantillaFactura"));
		
		//COPIAR
		sMapKey = "CopiarPlantillaFactura";
		inputMap = this.jButtonCopiarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPlantillaFactura"));
		
		//VEr FORM
		sMapKey = "VerFormPlantillaFactura";
		inputMap = this.jButtonVerFormPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPlantillaFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPlantillaFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPlantillaFactura";
		inputMap = this.jButtonNuevoRelacionesPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPlantillaFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPlantillaFactura";
		inputMap = this.jButtonModificarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPlantillaFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPlantillaFactura";
		inputMap = this.jButtonCerrarPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlantillaFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlantillaFactura";
		inputMap = this.jButtonGuardarCambiosTablaPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlantillaFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPlantillaFactura.setName("jPanelParametrosReportesPlantillaFactura"); 
		
		this.jPanelParametrosReportesAccionesPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPlantillaFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPlantillaFactura.setName("jPanelParametrosReportesAccionesPlantillaFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPlantillaFactura = new JButtonMe();
		this.jButtonRecargarInformacionPlantillaFactura.setText("Recargar");
		this.jButtonRecargarInformacionPlantillaFactura.setToolTipText("Recargar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPlantillaFactura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPlantillaFactura = new JButtonMe();
		this.jButtonProcesarInformacionPlantillaFactura.setText("Procesar");
		this.jButtonProcesarInformacionPlantillaFactura.setToolTipText("Procesar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPlantillaFactura.setVisible(false);
			
		this.jButtonProcesarInformacionPlantillaFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlantillaFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlantillaFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlantillaFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPlantillaFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlantillaFactura.setText("TIPO");       
		this.jComboBoxTiposReportesPlantillaFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlantillaFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPlantillaFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPlantillaFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionPlantillaFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPlantillaFactura.setText("Accion");
		this.jComboBoxTiposRelacionesPlantillaFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlantillaFactura.setText("Accion");
		this.jComboBoxTiposAccionesPlantillaFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPlantillaFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPlantillaFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarPlantillaFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPlantillaFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPlantillaFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlantillaFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlantillaFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPlantillaFactura = new JLabelMe();
		
		this.jLabelAccionesPlantillaFactura.setText("Acciones");		
		this.jLabelAccionesPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPlantillaFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPlantillaFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPlantillaFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPlantillaFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPlantillaFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPlantillaFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPlantillaFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPlantillaFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePlantillaFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePlantillaFactura.setText("Graf.");
		this.jCheckBoxConGraficoReportePlantillaFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPlantillaFactura = new JButtonMe();
		//this.jButtonAnterioresPlantillaFactura.setText("<<");
        this.jButtonAnterioresPlantillaFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPlantillaFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPlantillaFactura = new JButtonMe();
		//this.jButtonSiguientesPlantillaFactura.setText(">>");
        this.jButtonSiguientesPlantillaFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPlantillaFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPlantillaFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPlantillaFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosPlantillaFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPlantillaFactura,"nuevoguardarcambios_button","Nue",this.plantillafacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPlantillaFactura";
		inputMap = this.jButtonNuevoGuardarCambiosPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPlantillaFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPlantillaFactura";
		inputMap = this.jButtonRecargarInformacionPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPlantillaFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPlantillaFactura";
		inputMap = this.jButtonSiguientesPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPlantillaFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPlantillaFactura";
		inputMap = this.jButtonAnterioresPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPlantillaFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPlantillaFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPlantillaFactura.setMinimumSize(new Dimension(this.getWidth(),PlantillaFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlantillaFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlantillaFactura.setMaximumSize(new Dimension(this.getWidth(),PlantillaFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlantillaFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlantillaFactura.setPreferredSize(new Dimension(this.getWidth(),PlantillaFacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlantillaFacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPlantillaFactura = new GridBagLayout();

			this.jPanelPaginacionPlantillaFactura.setLayout(gridaBagLayoutPaginacionPlantillaFactura);						
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = 0;
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonAnterioresPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
					
						
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlantillaFactura.gridy = 0;
			
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonNuevoGuardarCambiosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
						
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlantillaFactura.gridy = 0;
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonSiguientesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = 1;
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonNuevoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
						
			
			
			if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
				this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPlantillaFactura.gridy = 1;
				this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPlantillaFactura.add(this.jButtonGuardarCambiosTablaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			}
			
			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = 1;
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonDuplicarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = 1;
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonCopiarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = 1;
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonVerFormPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = 1;
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPlantillaFactura.add(this.jButtonCerrarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
		
		
		this.jButtonRecargarInformacionPlantillaFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlantillaFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlantillaFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPlantillaFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlantillaFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlantillaFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPlantillaFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlantillaFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlantillaFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPlantillaFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlantillaFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlantillaFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPlantillaFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlantillaFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlantillaFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPlantillaFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlantillaFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlantillaFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPlantillaFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlantillaFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlantillaFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePlantillaFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlantillaFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlantillaFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPlantillaFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlantillaFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlantillaFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPlantillaFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlantillaFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlantillaFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPlantillaFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PlantillaFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PlantillaFactura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPlantillaFactura.setLayout(gridaBagParametrosReportesPlantillaFactura);
			this.jPanelParametrosReportesAccionesPlantillaFactura.setLayout(gridaBagParametrosReportesAccionesPlantillaFactura);
			
			
			this.jPanelParametrosAuxiliar1PlantillaFactura.setLayout(gridaBagParametrosAuxiliar1PlantillaFactura);
			this.jPanelParametrosAuxiliar2PlantillaFactura.setLayout(gridaBagParametrosAuxiliar2PlantillaFactura);
			this.jPanelParametrosAuxiliar3PlantillaFactura.setLayout(gridaBagParametrosAuxiliar3PlantillaFactura);
			this.jPanelParametrosAuxiliar4PlantillaFactura.setLayout(gridaBagParametrosAuxiliar4PlantillaFactura);
			//this.jPanelParametrosAuxiliar5PlantillaFactura.setLayout(gridaBagParametrosAuxiliar2PlantillaFactura);			
			
			
			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlantillaFactura.add(this.jButtonRecargarInformacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlantillaFactura.add(this.jComboBoxTiposPaginacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlantillaFactura.add(this.jCheckBoxConAltoMaximoTablaPlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlantillaFactura.add(this.jComboBoxTiposArchivosReportesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlantillaFactura.add(this.jPanelParametrosAuxiliar1PlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlantillaFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PlantillaFactura.add(this.jComboBoxTiposReportesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlantillaFactura.add(this.jPanelParametrosAuxiliar4PlantillaFactura, this.gridBagConstraintsPlantillaFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlantillaFactura.add(this.jComboBoxTiposReportesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlantillaFactura.add(this.jCheckBoxGenerarReportePlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlantillaFactura.add(this.jPanelParametrosAuxiliar2PlantillaFactura, this.gridBagConstraintsPlantillaFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlantillaFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlantillaFactura.add(this.jLabelAccionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
				this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPlantillaFactura.add(this.jButtonAbrirOrderByPlantillaFactura, this.gridBagConstraintsPlantillaFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlantillaFactura.add(this.jComboBoxTiposSeleccionarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
			
			
			/*
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlantillaFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlantillaFactura.add(this.jCheckBoxSeleccionarTodosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlantillaFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlantillaFactura.add(this.jCheckBoxSeleccionarTodosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);															
				
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlantillaFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlantillaFactura.add(this.jCheckBoxSeleccionadosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlantillaFactura.add(this.jPanelParametrosAuxiliar3PlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlantillaFactura.add(this.jComboBoxTiposRelacionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
				
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlantillaFactura.add(this.jComboBoxTiposAccionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
	
				
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlantillaFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlantillaFactura.add(this.jTextFieldValorCampoGeneralPlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralPlantillaFactura= new GridBagLayout();
		this.jPanelCamposIniciogeneralPlantillaFactura.setLayout(gridaBagLayoutCamposIniciogeneralPlantillaFactura);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contablePlantillaFactura= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contablePlantillaFactura.setLayout(gridaBagLayoutCamposIniciocuenta_contablePlantillaFactura);

		GridBagLayout gridaBagLayoutCamposIniciotipo_retencionPlantillaFactura= new GridBagLayout();
		this.jPanelCamposIniciotipo_retencionPlantillaFactura.setLayout(gridaBagLayoutCamposIniciotipo_retencionPlantillaFactura);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPlantillaFactura = new GridBagLayout();

			this.jScrollPanelDatosPlantillaFactura.setLayout(gridaBagLayoutDatosPlantillaFactura);
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = 0;
			this.gridBagConstraintsPlantillaFactura.gridx = 0;
			
			this.jScrollPanelDatosPlantillaFactura.add(this.jTableDatosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPlantillaFactura.setViewportView(this.jTableDatosPlantillaFactura);
		this.jTableDatosPlantillaFactura.setFillsViewportHeight(true);
		this.jTableDatosPlantillaFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPlantillaFactura= new GridBagLayout();
		this.jPanelAccionesPlantillaFactura.setLayout(gridaBagLayoutAccionesPlantillaFactura);
		
		
		/*	
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = 0;
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
			
		this.jPanelAccionesPlantillaFactura.add(this.jButtonNuevoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoPlantillaFactura= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoPlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoPlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoPlantillaFactura.setLayout(gridaBagLayoutBusquedaPorCodigoPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelBusquedaPorCodigoPlantillaFactura.add(jLabelcodigoBusquedaPorCodigoPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelBusquedaPorCodigoPlantillaFactura.add(jTextFieldcodigoBusquedaPorCodigoPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelBusquedaPorCodigoPlantillaFactura.add(jButtonBusquedaPorCodigoPlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoPlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePlantillaFactura= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePlantillaFactura.setLayout(gridaBagLayoutBusquedaPorNombrePlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelBusquedaPorNombrePlantillaFactura.add(jLabelnombreBusquedaPorNombrePlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelBusquedaPorNombrePlantillaFactura.add(jTextAreanombreBusquedaPorNombrePlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelBusquedaPorNombrePlantillaFactura.add(jButtonBusquedaPorNombrePlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("2.-Por Nombre ", jPanelBusquedaPorNombrePlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoBienPlantillaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoBienPlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoBienPlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoBienPlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoBienPlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoBienPlantillaFactura.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoBienPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdCuentaContableCreditoBienPlantillaFactura.add(jLabelid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelFK_IdCuentaContableCreditoBienPlantillaFactura.add(jComboBoxid_cuenta_contable_credito_bienFK_IdCuentaContableCreditoBienPlantillaFactura, gridBagConstraintsPlantillaFactura);


		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdCuentaContableCreditoBienPlantillaFactura.add(this.jButtonBuscarFK_IdCuentaContableCreditoBienid_cuenta_contable_credito_bienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelFK_IdCuentaContableCreditoBienPlantillaFactura.add(jButtonFK_IdCuentaContableCreditoBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("3.-Por Cta. Credito Bien ", jPanelFK_IdCuentaContableCreditoBienPlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoFinServicioPlantillaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoFinServicioPlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFinServicioPlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoFinServicioPlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoFinServicioPlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoFinServicioPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura.add(jLabelid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura.add(jComboBoxid_cuenta_contable_credito_servicioFK_IdCuentaContableCreditoFinServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);


		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.NONE;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura.add(this.jButtonBuscarFK_IdCuentaContableCreditoFinServicioid_cuenta_contable_credito_servicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura.add(jButtonFK_IdCuentaContableCreditoFinServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("4.-Por Cta. Credito Servicio ", jPanelFK_IdCuentaContableCreditoFinServicioPlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionFuenteBienPlantillaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionFuenteBienPlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuenteBienPlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuenteBienPlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionFuenteBienPlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura.setLayout(gridaBagLayoutFK_IdTipoRetencionFuenteBienPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura.add(jLabelid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura.add(jComboBoxid_tipo_retencion_fuente_bienFK_IdTipoRetencionFuenteBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura.add(jButtonFK_IdTipoRetencionFuenteBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("5.-Por Ret Fuente Bien ", jPanelFK_IdTipoRetencionFuenteBienPlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionFuenteServicioPlantillaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionFuenteServicioPlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuenteServicioPlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionFuenteServicioPlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionFuenteServicioPlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura.setLayout(gridaBagLayoutFK_IdTipoRetencionFuenteServicioPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura.add(jLabelid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura.add(jComboBoxid_tipo_retencion_fuente_servicioFK_IdTipoRetencionFuenteServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura.add(jButtonFK_IdTipoRetencionFuenteServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("6.-Por Ret. Fuente Servicio ", jPanelFK_IdTipoRetencionFuenteServicioPlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIvaBienPlantillaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIvaBienPlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaBienPlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaBienPlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIvaBienPlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIvaBienPlantillaFactura.setLayout(gridaBagLayoutFK_IdTipoRetencionIvaBienPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdTipoRetencionIvaBienPlantillaFactura.add(jLabelid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelFK_IdTipoRetencionIvaBienPlantillaFactura.add(jComboBoxid_tipo_retencion_iva_bienFK_IdTipoRetencionIvaBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelFK_IdTipoRetencionIvaBienPlantillaFactura.add(jButtonFK_IdTipoRetencionIvaBienPlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("7.-Por Ret. Iva Bien ", jPanelFK_IdTipoRetencionIvaBienPlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIvaServicioPlantillaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIvaServicioPlantillaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaServicioPlantillaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaServicioPlantillaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIvaServicioPlantillaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura.setLayout(gridaBagLayoutFK_IdTipoRetencionIvaServicioPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 0;
		jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura.add(jLabelid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 0;
		gridBagConstraintsPlantillaFactura.gridx = 1;
		jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura.add(jComboBoxid_tipo_retencion_iva_servicioFK_IdTipoRetencionIvaServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlantillaFactura.gridy = 1;
		gridBagConstraintsPlantillaFactura.gridx =1;
		jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura.add(jButtonFK_IdTipoRetencionIvaServicioPlantillaFactura, gridBagConstraintsPlantillaFactura);

		jTabbedPaneBusquedasPlantillaFactura.addTab("8.-Por Ret. Iva Servicio ", jPanelFK_IdTipoRetencionIvaServicioPlantillaFactura);
		jTabbedPaneBusquedasPlantillaFactura.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlantillaFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlantillaFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();						
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlantillaFactura.gridx = 0;		
			//this.gridBagConstraintsPlantillaFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlantillaFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPlantillaFactura, this.gridBagConstraintsPlantillaFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPlantillaFactura.gridx = 0;		
		//this.gridBagConstraintsPlantillaFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPlantillaFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPlantillaFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlantillaFactura.gridx = 0;		
			this.gridBagConstraintsPlantillaFactura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPlantillaFactura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPlantillaFactura, this.gridBagConstraintsPlantillaFactura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);								
		
		
		/*
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		*/		
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlantillaFactura.gridx =0;
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlantillaFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
				
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPlantillaFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlantillaFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosPlantillaFactura.setLayout(gridaBagLayoutBusquedasParametrosPlantillaFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPlantillaFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlantillaFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlantillaFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlantillaFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
			
			
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
			
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlantillaFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPlantillaFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPlantillaFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPlantillaFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPlantillaFactura.setName("jPanelReporteDinamicoPlantillaFactura"); 
		
		this.jPanelReporteDinamicoPlantillaFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlantillaFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlantillaFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPlantillaFactura.setLayout(gridaBagLayoutReporteDinamicoPlantillaFactura);
		
		
		this.jInternalFrameReporteDinamicoPlantillaFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPlantillaFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlantillaFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPlantillaFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPlantillaFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPlantillaFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPlantillaFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoPlantillaFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoPlantillaFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPlantillaFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlantillaFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlantillaFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plantilla Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePlantillaFactura = new JLabelMe();

		this.jLabelColumnasSelectReportePlantillaFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jLabelColumnasSelectReportePlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePlantillaFactura = new JList<Reporte>();
		this.jListColumnasSelectReportePlantillaFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePlantillaFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePlantillaFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlantillaFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlantillaFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePlantillaFactura=new JScrollPane(this.jListColumnasSelectReportePlantillaFactura);
			
			this.jScrollColumnasSelectReportePlantillaFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlantillaFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlantillaFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPlantillaFactura.add(this.jListColumnasSelectReportePlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jScrollColumnasSelectReportePlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePlantillaFactura = new JLabelMe();

		this.jLabelRelacionesSelectReportePlantillaFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePlantillaFactura = new JList<Reporte>();
		this.jListRelacionesSelectReportePlantillaFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePlantillaFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePlantillaFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlantillaFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlantillaFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePlantillaFactura=new JScrollPane(this.jListRelacionesSelectReportePlantillaFactura);
			
			this.jScrollRelacionesSelectReportePlantillaFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlantillaFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlantillaFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPlantillaFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPlantillaFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoPlantillaFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPlantillaFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPlantillaFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPlantillaFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlantillaFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlantillaFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPlantillaFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPlantillaFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jLabelGenerarExcelReporteDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPlantillaFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPlantillaFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPlantillaFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPlantillaFactura.setToolTipText("Generar EXCEL"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		//this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPlantillaFactura.add(this.jButtonGenerarExcelReporteDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jComboBoxTiposReportesDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPlantillaFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPlantillaFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jLabelTiposArchivoReporteDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jComboBoxTiposArchivosReportesDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPlantillaFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPlantillaFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPlantillaFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPlantillaFactura.setToolTipText("Generar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jButtonGenerarReporteDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPlantillaFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPlantillaFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPlantillaFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPlantillaFactura.setToolTipText("Cancelar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlantillaFactura.add(this.jButtonCerrarReporteDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPlantillaFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPlantillaFactura= new JScrollPane(jPanelReporteDinamicoPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPlantillaFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlantillaFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlantillaFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plantilla Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPlantillaFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPlantillaFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPlantillaFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPlantillaFactura);
		this.jInternalFrameReporteDinamicoPlantillaFactura.getContentPane().add(this.jScrollPanelReporteDinamicoPlantillaFactura, this.gridBagConstraintsPlantillaFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPlantillaFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPlantillaFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPlantillaFactura.setName("jPanelImportacionPlantillaFactura"); 
		
		this.jPanelImportacionPlantillaFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlantillaFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlantillaFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPlantillaFactura.setLayout(gridaBagLayoutImportacionPlantillaFactura);
		
		
		this.jInternalFrameImportacionPlantillaFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPlantillaFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPlantillaFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlantillaFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlantillaFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlantillaFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPlantillaFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlantillaFactura.setResizable(true);
	    this.jInternalFrameImportacionPlantillaFactura.setClosable(true);
	    this.jInternalFrameImportacionPlantillaFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlantillaFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlantillaFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPlantillaFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlantillaFactura.setResizable(true);
	    this.jInternalFrameImportacionPlantillaFactura.setClosable(true);
	    this.jInternalFrameImportacionPlantillaFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPlantillaFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlantillaFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlantillaFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plantilla Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPlantillaFactura = new JLabelMe();

		this.jLabelArchivoImportacionPlantillaFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlantillaFactura.add(this.jLabelArchivoImportacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPlantillaFactura = new JFileChooser();		
		this.jFileChooserImportacionPlantillaFactura.setToolTipText("ESCOGER ARCHIVO"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPlantillaFactura = new JButtonMe();
		this.jButtonAbrirImportacionPlantillaFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPlantillaFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPlantillaFactura.setToolTipText("Generar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlantillaFactura.add(this.jButtonAbrirImportacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPlantillaFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionPlantillaFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPlantillaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlantillaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlantillaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlantillaFactura.add(this.jLabelPathArchivoImportacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPlantillaFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPlantillaFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlantillaFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlantillaFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlantillaFactura.add(this.jTextFieldPathArchivoImportacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPlantillaFactura = new JButtonMe();
		this.jButtonGenerarImportacionPlantillaFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPlantillaFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPlantillaFactura.setToolTipText("Generar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlantillaFactura.add(this.jButtonGenerarImportacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPlantillaFactura = new JButtonMe();
		this.jButtonCerrarImportacionPlantillaFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPlantillaFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPlantillaFactura.setToolTipText("Cancelar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlantillaFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsPlantillaFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlantillaFactura.add(this.jButtonCerrarImportacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPlantillaFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionPlantillaFactura= new JScrollPane(jPanelImportacionPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
		this.gridBagConstraintsPlantillaFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsPlantillaFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPlantillaFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPlantillaFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPlantillaFactura);
		this.jInternalFrameImportacionPlantillaFactura.getContentPane().add(this.jScrollPanelImportacionPlantillaFactura, this.gridBagConstraintsPlantillaFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPlantillaFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPlantillaFactura = new JButtonMe();
			this.jButtonAbrirOrderByPlantillaFactura.setText("Orden");
			this.jButtonAbrirOrderByPlantillaFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlantillaFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPlantillaFactura";
			inputMap = this.jButtonAbrirOrderByPlantillaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPlantillaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPlantillaFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByPlantillaFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPlantillaFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPlantillaFactura.setName("jPanelOrderByPlantillaFactura"); 
			
			this.jPanelOrderByPlantillaFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlantillaFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlantillaFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPlantillaFactura.setLayout(gridaBagLayoutOrderByPlantillaFactura);
			
			
			this.jTableDatosPlantillaFacturaOrderBy = new JTableMe();        
			this.jTableDatosPlantillaFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPlantillaFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPlantillaFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPlantillaFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPlantillaFacturaOrderBy.setViewportView(this.jTableDatosPlantillaFacturaOrderBy);
			this.jTableDatosPlantillaFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPlantillaFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPlantillaFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPlantillaFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPlantillaFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePlantillaFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPlantillaFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPlantillaFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPlantillaFactura.setTitle("Orden");
			this.jInternalFrameOrderByPlantillaFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPlantillaFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPlantillaFactura.setResizable(true);
			this.jInternalFrameOrderByPlantillaFactura.setClosable(true);
			this.jInternalFrameOrderByPlantillaFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPlantillaFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlantillaFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlantillaFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPlantillaFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plantilla Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPlantillaFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPlantillaFactura.ipady =150;
				
			this.jPanelOrderByPlantillaFactura.add(jScrollPanelDatosPlantillaFacturaOrderBy, this.gridBagConstraintsPlantillaFactura);//this.jTableDatosPlantillaFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPlantillaFactura = new JButtonMe();
			this.jButtonCerrarOrderByPlantillaFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPlantillaFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPlantillaFactura.setToolTipText("Cancelar"+" "+PlantillaFacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPlantillaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlantillaFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPlantillaFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPlantillaFactura.add(this.jButtonCerrarOrderByPlantillaFactura, this.gridBagConstraintsPlantillaFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPlantillaFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByPlantillaFactura= new JScrollPane(jPanelOrderByPlantillaFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPlantillaFactura = new GridBagConstraints();
			this.gridBagConstraintsPlantillaFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsPlantillaFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlantillaFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPlantillaFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPlantillaFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPlantillaFactura);
			
			this.jInternalFrameOrderByPlantillaFactura.getContentPane().add(this.jScrollPanelOrderByPlantillaFactura, this.gridBagConstraintsPlantillaFactura);			
		
		} else {
			this.jButtonAbrirOrderByPlantillaFactura = new JButtonMe();
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
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.plantillafacturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPlantillaFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPlantillaFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPlantillaFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPlantillaFactura.getRowHeight();//PlantillaFacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlantillaFactura.isSelected()) {
					iHeightTable=PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlantillaFactura.isSelected()) {
					iHeightTable=PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlantillaFacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPlantillaFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlantillaFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlantillaFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPlantillaFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlantillaFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlantillaFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPlantillaFactura!=null && this.jInternalFrameOrderByPlantillaFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.plantillafacturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPlantillaFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPlantillaFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPlantillaFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPlantillaFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPlantillaFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPlantillaFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPlantillaFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPlantillaFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlantillaFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlantillaFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=plantillafacturaLogic.getPlantillaFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=plantillafacturas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PlantillaFactura> TraerPlantillaFacturaBeans(List<PlantillaFactura> plantillafacturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(PlantillaFactura plantillafactura:plantillafacturas) {
					
				if(!(PlantillaFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PlantillaFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					plantillafactura.setsDetalleGeneralEntityReporte(PlantillaFacturaConstantesFunciones.getPlantillaFacturaDescripcion(plantillafactura));
										
					plantillafactura.setes_proveedor_descripcion(PlantillaFacturaConstantesFunciones.getes_proveedorDescripcion(plantillafactura));	
					
						
					
				} else  {
							
					//plantillafactura.setsDetalleGeneralEntityReporte(plantillafactura.getsDetalleGeneralEntityReporte());
										
				}
				
				//plantillafacturabeans.add(plantillafacturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return plantillafacturas;
    }
	//PARA REPORTES FIN
}
