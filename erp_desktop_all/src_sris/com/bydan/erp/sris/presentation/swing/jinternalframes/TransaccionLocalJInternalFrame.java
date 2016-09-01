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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.TransaccionLocalConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class TransaccionLocalJInternalFrame extends TransaccionLocalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransaccionLocal;
	
	protected JMenuBar jmenuBarTransaccionLocal;
	
	protected JMenu jmenuTransaccionLocal;
	protected JMenu jmenuDatosTransaccionLocal;
	protected JMenu jmenuArchivoTransaccionLocal;
	protected JMenu jmenuAccionesTransaccionLocal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionLocal;	
	protected GridBagConstraints gridBagConstraintsTransaccionLocal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransaccionLocalDetalleFormJInternalFrame jInternalFrameDetalleFormTransaccionLocal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransaccionLocal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransaccionLocal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionconta="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public TransaccionLocalSessionBean transaccionlocalSessionBean;
		
	
	
	public CompraSessionBean compraSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TransaccionContaSessionBean transaccioncontaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivaSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivaprestaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TransaccionLocal> transaccionlocals;		
	public List<TransaccionLocal> transaccionlocalsEliminados;	
	public List<TransaccionLocal> transaccionlocalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransaccionLocal;		
	protected JButton jButtonAbrirOrderByTransaccionLocal;
	
	
	//protected JPanel jPanelOrderByTransaccionLocal;
	//public JScrollPane jScrollPanelOrderByTransaccionLocal;	
	//protected JButton jButtonCerrarOrderByTransaccionLocal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransaccionLocalLogic transaccionlocalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransaccionLocal;
	public JScrollPane jScrollPanelDatosEdicionTransaccionLocal;
	public JScrollPane jScrollPanelDatosGeneralTransaccionLocal;
    
	
	
	//public JScrollPane jScrollPanelDatosTransaccionLocalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransaccionLocal;
	//public JScrollPane jScrollPanelImportacionTransaccionLocal;
	
	
	
	protected JPanel jPanelAccionesTransaccionLocal;
	
    protected JPanel jPanelPaginacionTransaccionLocal;
    protected JPanel jPanelParametrosReportesTransaccionLocal;
	protected JPanel jPanelParametrosReportesAccionesTransaccionLocal;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralTransaccionLocal;
	protected Integer iXPanelCamposIniciogeneralTransaccionLocal=0;
	protected Integer iYPanelCamposIniciogeneralTransaccionLocal=0;

	protected JPanel jPanelCamposIniciovalores1TransaccionLocal;
	protected Integer iXPanelCamposIniciovalores1TransaccionLocal=0;
	protected Integer iYPanelCamposIniciovalores1TransaccionLocal=0;

	protected JPanel jPanelCamposIniciovalores2TransaccionLocal;
	protected Integer iXPanelCamposIniciovalores2TransaccionLocal=0;
	protected Integer iYPanelCamposIniciovalores2TransaccionLocal=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TransaccionLocal;
	protected JPanel jPanelParametrosAuxiliar2TransaccionLocal;
	protected JPanel jPanelParametrosAuxiliar3TransaccionLocal;
	protected JPanel jPanelParametrosAuxiliar4TransaccionLocal;
	//protected JPanel jPanelParametrosAuxiliar5TransaccionLocal;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransaccionLocal;
	//protected JPanel jPanelImportacionTransaccionLocal;
	
	
	public JTable jTableDatosTransaccionLocal;
	
	
	
	//public JTable jTableDatosTransaccionLocalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransaccionLocal;
	protected JButton jButtonDuplicarTransaccionLocal;
	protected JButton jButtonCopiarTransaccionLocal;
	protected JButton jButtonVerFormTransaccionLocal;
	protected JButton jButtonNuevoRelacionesTransaccionLocal;
	protected JButton jButtonModificarTransaccionLocal;
	
    protected JButton jButtonGuardarCambiosTablaTransaccionLocal;
	protected JButton jButtonCerrarTransaccionLocal;
	
	
	protected JButton jButtonRecargarInformacionTransaccionLocal;
	protected JButton jButtonProcesarInformacionTransaccionLocal;
	
	
	protected JButton jButtonAnterioresTransaccionLocal;
	protected JButton jButtonSiguientesTransaccionLocal;
	protected JButton jButtonNuevoGuardarCambiosTransaccionLocal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransaccionLocal;
	//protected JButton jButtonCerrarReporteDinamicoTransaccionLocal;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransaccionLocal;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransaccionLocal;
	//protected JButton jButtonGenerarImportacionTransaccionLocal;
	//protected JButton jButtonCerrarImportacionTransaccionLocal;
	//protected JFileChooser jFileChooserImportacionTransaccionLocal;
	//protected File fileImportacionTransaccionLocal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionLocal;
	protected JButton jButtonDuplicarToolBarTransaccionLocal;
	protected JButton jButtonNuevoRelacionesToolBarTransaccionLocal;
	
	
	public JButton jButtonGuardarCambiosToolBarTransaccionLocal;
	protected JButton jButtonCopiarToolBarTransaccionLocal;
	protected JButton jButtonVerFormToolBarTransaccionLocal;
	public JButton jButtonGuardarCambiosTablaToolBarTransaccionLocal;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionLocal;
	protected JButton jButtonCerrarToolBarTransaccionLocal;
	
	protected JButton jButtonRecargarInformacionToolBarTransaccionLocal;
	protected JButton jButtonProcesarInformacionToolBarTransaccionLocal;
	protected JButton jButtonAnterioresToolBarTransaccionLocal;
	protected JButton jButtonSiguientesToolBarTransaccionLocal;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransaccionLocal;
	protected JButton jButtonAbrirOrderByToolBarTransaccionLocal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionLocal;
	protected JMenuItem jMenuItemDuplicarTransaccionLocal;
	protected JMenuItem jMenuItemNuevoRelacionesTransaccionLocal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransaccionLocal;
	protected JMenuItem jMenuItemCopiarTransaccionLocal;
	protected JMenuItem jMenuItemVerFormTransaccionLocal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionLocal;
	protected JMenuItem jMenuItemCerrarTransaccionLocal;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionLocal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransaccionLocal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionLocal;
	
	protected JMenuItem jMenuItemRecargarInformacionTransaccionLocal;
	protected JMenuItem jMenuItemProcesarInformacionTransaccionLocal;
	protected JMenuItem jMenuItemAnterioresTransaccionLocal;
	protected JMenuItem jMenuItemSiguientesTransaccionLocal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionLocal;
	protected JMenuItem jMenuItemAbrirOrderByTransaccionLocal;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionLocal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionLocal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransaccionLocal;
	protected JCheckBox jCheckBoxSeleccionadosTransaccionLocal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransaccionLocal;
	protected JCheckBox jCheckBoxConGraficoReporteTransaccionLocal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransaccionLocal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransaccionLocal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionLocal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransaccionLocal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransaccionLocal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransaccionLocal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionLocal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionLocal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransaccionLocal;
	protected JTextField jTextFieldValorCampoGeneralTransaccionLocal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransaccionLocal;
	//public JList<Reporte> jListColumnasSelectReporteTransaccionLocal;
	//public JScrollPane jScrollColumnasSelectReporteTransaccionLocal;
	
	//public JLabel jLabelRelacionesSelectReporteTransaccionLocal;
	//public JList<Reporte> jListRelacionesSelectReporteTransaccionLocal;
	//public JScrollPane jScrollRelacionesSelectReporteTransaccionLocal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransaccionLocal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransaccionLocal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransaccionLocal;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransaccionLocal;
	
		
	//public JLabel jLabelArchivoImportacionTransaccionLocal;	
	//public JLabel jLabelPathArchivoImportacionTransaccionLocal;
	//protected JTextField jTextFieldPathArchivoImportacionTransaccionLocal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransaccionLocal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransaccionLocal;
	
	//public JLabel jLabelColumnaCategoriaValorTransaccionLocal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransaccionLocal;
	
	//public JLabel jLabelColumnasValoresGraficoTransaccionLocal;
	//public JList<Reporte> jListColumnasValoresGraficoTransaccionLocal;
	//public JScrollPane jScrollColumnasValoresGraficoTransaccionLocal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransaccionLocal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransaccionLocal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransaccionLocal;
	public JPanel jPanelFK_IdAsientoContableTransaccionLocal;
	public JButton jButtonFK_IdAsientoContableTransaccionLocal;
	public JPanel jPanelFK_IdClienteTransaccionLocal;
	public JButton jButtonFK_IdClienteTransaccionLocal;
	public JPanel jPanelFK_IdCompraTransaccionLocal;
	public JButton jButtonFK_IdCompraTransaccionLocal;
	public JPanel jPanelFK_IdPeriodoDeclaraTransaccionLocal;
	public JButton jButtonFK_IdPeriodoDeclaraTransaccionLocal;
	public JPanel jPanelFK_IdTipoComprobanteTransaccionLocal;
	public JButton jButtonFK_IdTipoComprobanteTransaccionLocal;
	public JPanel jPanelFK_IdTipoIvaTransaccionLocal;
	public JButton jButtonFK_IdTipoIvaTransaccionLocal;
	public JPanel jPanelFK_IdTipoRetencionIvaTransaccionLocal;
	public JButton jButtonFK_IdTipoRetencionIvaTransaccionLocal;
	public JPanel jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal;
	public JButton jButtonFK_IdTipoRetencionIvaPrestaTransaccionLocal;
	public JPanel jPanelFK_IdTipoTributarioTransaccionLocal;
	public JButton jButtonFK_IdTipoTributarioTransaccionLocal;
	public JPanel jPanelFK_IdTransaccionContaTransaccionLocal;
	public JButton jButtonFK_IdTransaccionContaTransaccionLocal;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableTransaccionLocal;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableTransaccionLocal;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableTransaccionLocal= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableTransaccionLocalBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal;
	
	public JPanel jPanelid_clienteFK_IdClienteTransaccionLocal;
	public JLabel jLabelid_clienteFK_IdClienteTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteTransaccionLocal;
	public JButton jButtonid_clienteFK_IdClienteTransaccionLocal= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTransaccionLocalBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteTransaccionLocal;
	
	public JPanel jPanelid_compraFK_IdCompraTransaccionLocal;
	public JLabel jLabelid_compraFK_IdCompraTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraFK_IdCompraTransaccionLocal;
	public JButton jButtonid_compraFK_IdCompraTransaccionLocal= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal;
	public JLabel jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal;
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal;
	public JLabel jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal;
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_ivaFK_IdTipoIvaTransaccionLocal;
	public JLabel jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaFK_IdTipoIvaTransaccionLocal;
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaFK_IdTipoIvaTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal;
	public JLabel jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal;
	public JButton jButtonid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal;
	public JLabel jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal;
	public JButton jButtonid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal;
	public JLabel jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal;
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFK_IdTipoTributarioTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal;
	public JLabel jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_contaFK_IdTransaccionContaTransaccionLocal;
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_contaFK_IdTransaccionContaTransaccionLocalBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1350;//(screenSize.width-screenSize.width/2)+(250*3);
	//public int iHeightFormulario=627;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransaccionLocalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionLocalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionLocalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionLocalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransaccionLocal)	{
		this.jButtonRecargarInformacionTransaccionLocal = jButtonRecargarInformacionTransaccionLocal;
	}
	
	public JButton getjButtonProcesarInformacionTransaccionLocal() {
		return this.jButtonProcesarInformacionTransaccionLocal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionLocal)	{
		this.jButtonProcesarInformacionTransaccionLocal = jButtonProcesarInformacionTransaccionLocal;
	}
	
	
	public JButton getjButtonRecargarInformacionTransaccionLocal() {
		return this.jButtonRecargarInformacionTransaccionLocal;
	}
	
	
	public List<TransaccionLocal> gettransaccionlocals() {
		return this.transaccionlocals;
	}

	public void settransaccionlocals(List<TransaccionLocal> transaccionlocals) {
		this.transaccionlocals = transaccionlocals;
	}
	
	public List<TransaccionLocal> gettransaccionlocalsAux() {
		return this.transaccionlocalsAux;
	}

	public void settransaccionlocalsAux(List<TransaccionLocal> transaccionlocalsAux) {
		this.transaccionlocalsAux = transaccionlocalsAux;
	}
	
	public List<TransaccionLocal> gettransaccionlocalsEliminados() {
		return this.transaccionlocalsEliminados;
	}

	public void setTransaccionLocalsEliminados(List<TransaccionLocal> transaccionlocalsEliminados) {
		this.transaccionlocalsEliminados = transaccionlocalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransaccionLocal() {
		return jComboBoxTiposSeleccionarTransaccionLocal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransaccionLocal(
			JComboBox jComboBoxTiposSeleccionarTransaccionLocal) {
		this.jComboBoxTiposSeleccionarTransaccionLocal = jComboBoxTiposSeleccionarTransaccionLocal;
	}
	
	public void setBorderResaltarTiposSeleccionarTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransaccionLocal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransaccionLocal() {
		return jTextFieldValorCampoGeneralTransaccionLocal;
	}

	public void setjTextFieldValorCampoGeneralTransaccionLocal(
			JTextField jTextFieldValorCampoGeneralTransaccionLocal) {
		this.jTextFieldValorCampoGeneralTransaccionLocal = jTextFieldValorCampoGeneralTransaccionLocal;
	}

	public void setBorderResaltarValorCampoGeneralTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransaccionLocal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransaccionLocal() {
		return this.jCheckBoxSeleccionarTodosTransaccionLocal;
	}

	public void setjCheckBoxSeleccionarTodosTransaccionLocal(
			JCheckBox jCheckBoxSeleccionarTodosTransaccionLocal) {
		this.jCheckBoxSeleccionarTodosTransaccionLocal = jCheckBoxSeleccionarTodosTransaccionLocal;
	}

	public void setBorderResaltarSeleccionarTodosTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransaccionLocal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransaccionLocal() {
		return this.jCheckBoxSeleccionadosTransaccionLocal;
	}

	public void setjCheckBoxSeleccionadosTransaccionLocal(
			JCheckBox jCheckBoxSeleccionadosTransaccionLocal) {
		this.jCheckBoxSeleccionadosTransaccionLocal = jCheckBoxSeleccionadosTransaccionLocal;
	}
	
	public void setBorderResaltarSeleccionadosTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransaccionLocal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransaccionLocal() {
		return this.jComboBoxTiposArchivosReportesTransaccionLocal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransaccionLocal(
			JComboBox jComboBoxTiposArchivosReportesTransaccionLocal) {
		this.jComboBoxTiposArchivosReportesTransaccionLocal = jComboBoxTiposArchivosReportesTransaccionLocal;
	}

	public void setBorderResaltarTiposArchivosReportesTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransaccionLocal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransaccionLocal() {
		return this.jComboBoxTiposReportesTransaccionLocal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransaccionLocal(
			JComboBox jComboBoxTiposReportesTransaccionLocal) {
		this.jComboBoxTiposReportesTransaccionLocal = jComboBoxTiposReportesTransaccionLocal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransaccionLocal() {
	//	return jComboBoxTiposReportesDinamicoTransaccionLocal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransaccionLocal(
	//		JComboBox jComboBoxTiposReportesDinamicoTransaccionLocal) {
	//	this.jComboBoxTiposReportesDinamicoTransaccionLocal = jComboBoxTiposReportesDinamicoTransaccionLocal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransaccionLocal() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransaccionLocal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransaccionLocal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionLocal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal = jComboBoxTiposArchivosReportesDinamicoTransaccionLocal;
	//}
	
	public void setBorderResaltarTiposReportesTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransaccionLocal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransaccionLocal() {
		return this.jComboBoxTiposGraficosReportesTransaccionLocal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransaccionLocal(
			JComboBox jComboBoxTiposGraficosReportesTransaccionLocal) {
		this.jComboBoxTiposGraficosReportesTransaccionLocal = jComboBoxTiposGraficosReportesTransaccionLocal;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransaccionLocal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransaccionLocal() {
		return this.jComboBoxTiposPaginacionTransaccionLocal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransaccionLocal(
			JComboBox jComboBoxTiposPaginacionTransaccionLocal) {
		this.jComboBoxTiposPaginacionTransaccionLocal = jComboBoxTiposPaginacionTransaccionLocal;
	}
	
	public void setBorderResaltarTiposPaginacionTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransaccionLocal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransaccionLocal() {
		return this.jComboBoxTiposRelacionesTransaccionLocal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionLocal() {
		return this.jComboBoxTiposAccionesTransaccionLocal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionLocal(
			JComboBox jComboBoxTiposRelacionesTransaccionLocal) {
		this.jComboBoxTiposRelacionesTransaccionLocal = jComboBoxTiposRelacionesTransaccionLocal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionLocal(
			JComboBox jComboBoxTiposAccionesTransaccionLocal) {
		this.jComboBoxTiposAccionesTransaccionLocal = jComboBoxTiposAccionesTransaccionLocal;
	}
	
	public void setBorderResaltarTiposRelacionesTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransaccionLocal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransaccionLocal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransaccionLocal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransaccionLocal() {
	//	return jCheckBoxConGraficoDinamicoTransaccionLocal;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransaccionLocal(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransaccionLocal) {
	//	this.jCheckBoxConGraficoDinamicoTransaccionLocal = jCheckBoxConGraficoDinamicoTransaccionLocal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransaccionLocal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransaccionLocal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransaccionLocal .setBorder(borderResaltar);		
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
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		
		this.transaccionlocalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccionlocalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionLocalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion Local MANTENIMIENTO"));
		
		
		if(iWidth > 3450) {
			iWidth=3450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
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
		
		TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransaccionLocal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"nuevo","nuevo","Nuevo"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"duplicar","duplicar","Duplicar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"copiar","copiar","Copiar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"ver_form","ver_form","Ver"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"recargar","recargar","Recargar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransaccionLocal,this.jTtoolBarTransaccionLocal,
							"cerrar","cerrar","Salir"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransaccionLocal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransaccionLocal;
			
				this.jButtonProcesarInformacionToolBarTransaccionLocal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransaccionLocal;
				
		//protected JButton jButtonModificarToolBarTransaccionLocal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransaccionLocal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransaccionLocal=new JMenuMe("General");
		this.jmenuArchivoTransaccionLocal=new JMenuMe("Archivo");
		this.jmenuAccionesTransaccionLocal=new JMenuMe("Acciones");
		this.jmenuDatosTransaccionLocal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionLocal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionLocal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionLocal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransaccionLocal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransaccionLocal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransaccionLocal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransaccionLocal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransaccionLocal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransaccionLocal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransaccionLocal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionLocal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionLocal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransaccionLocal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransaccionLocal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransaccionLocal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransaccionLocal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransaccionLocal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransaccionLocal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransaccionLocal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransaccionLocal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransaccionLocal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionLocal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionLocal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionLocal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransaccionLocal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransaccionLocal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransaccionLocal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransaccionLocal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransaccionLocal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransaccionLocal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransaccionLocal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransaccionLocal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransaccionLocal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransaccionLocal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransaccionLocal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransaccionLocal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransaccionLocal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransaccionLocal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransaccionLocal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionLocal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionLocal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionLocal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransaccionLocal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransaccionLocal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransaccionLocal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionLocal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionLocal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionLocal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransaccionLocal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransaccionLocal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransaccionLocal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransaccionLocal.add(this.jMenuItemCerrarTransaccionLocal);
			
			this.jmenuAccionesTransaccionLocal.add(this.jMenuItemNuevoTransaccionLocal);
			this.jmenuAccionesTransaccionLocal.add(this.jMenuItemNuevoGuardarCambiosTransaccionLocal);
			this.jmenuAccionesTransaccionLocal.add(this.jMenuItemNuevoRelacionesTransaccionLocal);
			this.jmenuAccionesTransaccionLocal.add(this.jMenuItemGuardarCambiosTablaTransaccionLocal);		
			this.jmenuAccionesTransaccionLocal.add(this.jMenuItemDuplicarTransaccionLocal);		
			this.jmenuAccionesTransaccionLocal.add(this.jMenuItemCopiarTransaccionLocal);		
			this.jmenuAccionesTransaccionLocal.add(this.jMenuItemVerFormTransaccionLocal);		
			
			this.jmenuDatosTransaccionLocal.add(this.jMenuItemRecargarInformacionTransaccionLocal);				
			this.jmenuDatosTransaccionLocal.add(this.jMenuItemAnterioresTransaccionLocal);				
			this.jmenuDatosTransaccionLocal.add(this.jMenuItemSiguientesTransaccionLocal);				
			this.jmenuDatosTransaccionLocal.add(this.jMenuItemAbrirOrderByTransaccionLocal);				
			this.jmenuDatosTransaccionLocal.add(this.jMenuItemMostrarOcultarTransaccionLocal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransaccionLocal.add(this.jMenuItemGuardarCambiosTransaccionLocal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransaccionLocal.add(this.jmenuArchivoTransaccionLocal);		
			this.jmenuBarTransaccionLocal.add(this.jmenuAccionesTransaccionLocal);		
			this.jmenuBarTransaccionLocal.add(this.jmenuDatosTransaccionLocal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransaccionLocal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransaccionLocal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableTransaccionLocal.setToolTipText("Buscar Por Asiento C. ");
		this.jButtonFK_IdAsientoContableTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdAsientoContableTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdAsientoContableTransaccionLocal.setToolTipText("Buscar Por Asiento C. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableTransaccionLocal,"buscar_button","Buscar Por Asiento C. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal.setText("Asiento C. :");
		jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal.setToolTipText("Asiento C.");
		jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableTransaccionLocal= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal.setFocusable(false);

		this.jPanelFK_IdClienteTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteTransaccionLocal.setToolTipText("Buscar Por Prove/Cliente ");
		this.jButtonFK_IdClienteTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdClienteTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdClienteTransaccionLocal.setToolTipText("Buscar Por Prove/Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteTransaccionLocal,"buscar_button","Buscar Por Prove/Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteTransaccionLocal = new JLabelMe();
		jLabelid_clienteFK_IdClienteTransaccionLocal.setText("Prove/Cliente :");
		jLabelid_clienteFK_IdClienteTransaccionLocal.setToolTipText("Prove/Cliente");
		jLabelid_clienteFK_IdClienteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteTransaccionLocal= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal.setFocusable(false);

		this.jPanelFK_IdCompraTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCompraTransaccionLocal.setToolTipText("Buscar Por Compra ");
		this.jButtonFK_IdCompraTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdCompraTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdCompraTransaccionLocal.setToolTipText("Buscar Por Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCompraTransaccionLocal,"buscar_button","Buscar Por Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCompraTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_compraFK_IdCompraTransaccionLocal = new JLabelMe();
		jLabelid_compraFK_IdCompraTransaccionLocal.setText("Compra :");
		jLabelid_compraFK_IdCompraTransaccionLocal.setToolTipText("Compra");
		jLabelid_compraFK_IdCompraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_compraFK_IdCompraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_compraFK_IdCompraTransaccionLocal= new JComboBoxMe();
		jComboBoxid_compraFK_IdCompraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraFK_IdCompraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPeriodoDeclaraTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPeriodoDeclaraTransaccionLocal.setToolTipText("Buscar Por Periodo Declara ");
		this.jButtonFK_IdPeriodoDeclaraTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdPeriodoDeclaraTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdPeriodoDeclaraTransaccionLocal.setToolTipText("Buscar Por Periodo Declara ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPeriodoDeclaraTransaccionLocal,"buscar_button","Buscar Por Periodo Declara ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPeriodoDeclaraTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal = new JLabelMe();
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setText("Periodo Declara :");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setToolTipText("Periodo Declara");
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal= new JComboBoxMe();
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoComprobanteTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoComprobanteTransaccionLocal.setToolTipText("Buscar Por T. Comprobante ");
		this.jButtonFK_IdTipoComprobanteTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdTipoComprobanteTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdTipoComprobanteTransaccionLocal.setToolTipText("Buscar Por T. Comprobante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoComprobanteTransaccionLocal,"buscar_button","Buscar Por T. Comprobante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoComprobanteTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal = new JLabelMe();
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setText("T. Comprobante :");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setToolTipText("T. Comprobante");
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoIvaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIvaTransaccionLocal.setToolTipText("Buscar Por % Iva ");
		this.jButtonFK_IdTipoIvaTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdTipoIvaTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdTipoIvaTransaccionLocal.setToolTipText("Buscar Por % Iva ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIvaTransaccionLocal,"buscar_button","Buscar Por % Iva ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIvaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal = new JLabelMe();
		jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setText("% Iva :");
		jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setToolTipText("% Iva");
		jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_ivaFK_IdTipoIvaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaFK_IdTipoIvaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaFK_IdTipoIvaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIvaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIvaTransaccionLocal.setToolTipText("Buscar Por % Iva_ ");
		this.jButtonFK_IdTipoRetencionIvaTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIvaTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIvaTransaccionLocal.setToolTipText("Buscar Por % Iva_ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIvaTransaccionLocal,"buscar_button","Buscar Por % Iva_ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIvaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal = new JLabelMe();
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setText("% Iva_ :");
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setToolTipText("% Iva_");
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal.setToolTipText("Buscar Por % Iva. ");
		this.jButtonFK_IdTipoRetencionIvaPrestaTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdTipoRetencionIvaPrestaTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdTipoRetencionIvaPrestaTransaccionLocal.setToolTipText("Buscar Por % Iva. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionIvaPrestaTransaccionLocal,"buscar_button","Buscar Por % Iva. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionIvaPrestaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal = new JLabelMe();
		jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setText("% Iva. :");
		jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setToolTipText("% Iva.");
		jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTributarioTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTributarioTransaccionLocal.setToolTipText("Buscar Por Cod. Tributario ");
		this.jButtonFK_IdTipoTributarioTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdTipoTributarioTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdTipoTributarioTransaccionLocal.setToolTipText("Buscar Por Cod. Tributario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTributarioTransaccionLocal,"buscar_button","Buscar Por Cod. Tributario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTributarioTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal = new JLabelMe();
		jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setText("Cod. Tributario :");
		jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setToolTipText("Cod. Tributario");
		jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionContaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionContaTransaccionLocal.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionContaTransaccionLocal= new JButtonMe();
		this.jButtonFK_IdTransaccionContaTransaccionLocal.setText("Buscar");
		this.jButtonFK_IdTransaccionContaTransaccionLocal.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionContaTransaccionLocal,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionContaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal = new JLabelMe();
		jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setText("Transaccion :");
		jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setToolTipText("Transaccion");
		jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_contaFK_IdTransaccionContaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaFK_IdTransaccionContaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_contaFK_IdTransaccionContaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransaccionLocal=new JTabbedPane();


		this.jTabbedPaneBusquedasTransaccionLocal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasTransaccionLocal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasTransaccionLocal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransaccionLocal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransaccionLocal = new TransaccionLocalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transaccion Local DATOS");
			this.jInternalFrameDetalleFormTransaccionLocal = new TransaccionLocalDetalleFormJInternalFrame(jDesktopPane,this.transaccionlocalSessionBean.getConGuardarRelaciones(),this.transaccionlocalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransaccionLocal = null;//new TransaccionLocalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionLocal= new GridBagLayout();
		
		
		this.jTableDatosTransaccionLocal = new JTableMe();      
		
		String sToolTipTransaccionLocal="";
		sToolTipTransaccionLocal=TransaccionLocalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionLocal+="(Sris.TransaccionLocal)";
		}
		
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionLocal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransaccionLocal.setToolTipText(sToolTipTransaccionLocal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransaccionLocal);
		this.jTableDatosTransaccionLocal.setAutoCreateRowSorter(true);
		this.jTableDatosTransaccionLocal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransaccionLocal.setRowSelectionAllowed(true);
		this.jTableDatosTransaccionLocal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransaccionLocal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransaccionLocal = new JButtonMe();
		this.jButtonDuplicarTransaccionLocal = new JButtonMe();
		this.jButtonCopiarTransaccionLocal = new JButtonMe();
		this.jButtonVerFormTransaccionLocal = new JButtonMe();
		this.jButtonNuevoRelacionesTransaccionLocal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransaccionLocal = new JButtonMe();
		this.jButtonCerrarTransaccionLocal = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionLocal = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransaccionLocal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovalores1TransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovalores2TransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Transaccion Local";
		
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Locales" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionLocal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionLocal.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionLocal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralTransaccionLocal.setName("jPanelCamposFingeneralTransaccionLocal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovalores1TransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores1"));
		this.jPanelCamposIniciovalores1TransaccionLocal.setName("jPanelCamposFinvalores1TransaccionLocal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovalores1TransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovalores2TransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores2"));
		this.jPanelCamposIniciovalores2TransaccionLocal.setName("jPanelCamposFinvalores2TransaccionLocal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovalores2TransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoTransaccionLocal=new ReporteDinamicoJInternalFrame(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransaccionLocal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransaccionLocal=new ImportacionJInternalFrame(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransaccionLocal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransaccionLocal = new JButtonMe();
		
		this.jButtonAbrirOrderByTransaccionLocal.setText("Orden");
		this.jButtonAbrirOrderByTransaccionLocal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionLocal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionLocal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionLocal,false,this);
			
			//this.cargarOrderByTransaccionLocal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionLocal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionLocal,true,this);
			
			//this.cargarOrderByTransaccionLocal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransaccionLocal.setMinimumSize(new Dimension(400,50));//3430
		this.jTableDatosTransaccionLocal.setMaximumSize(new Dimension(400,50));//3430
		this.jTableDatosTransaccionLocal.setPreferredSize(new Dimension(400,50));//3430
		
		this.jScrollPanelDatosTransaccionLocal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionLocal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionLocal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransaccionLocal.setText("Nuevo");
		this.jButtonDuplicarTransaccionLocal.setText("Duplicar");
		this.jButtonCopiarTransaccionLocal.setText("Copiar");
		this.jButtonVerFormTransaccionLocal.setText("Ver");
		this.jButtonNuevoRelacionesTransaccionLocal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransaccionLocal.setText("Guardar");
		this.jButtonCerrarTransaccionLocal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionLocal,"nuevo_button","Nuevo",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransaccionLocal,"duplicar_button","Duplicar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransaccionLocal,"copiar_button","Copiar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransaccionLocal,"ver_form","Ver",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransaccionLocal,"nuevorelaciones_button","Nuevo Rel",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionLocal,"guardarcambiostabla_button","Guardar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionLocal,"cerrar_button","Salir",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransaccionLocal.setToolTipText("Nuevo"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransaccionLocal.setToolTipText("Duplicar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransaccionLocal.setToolTipText("Copiar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransaccionLocal.setToolTipText("Ver"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransaccionLocal.setToolTipText("Nuevo Rel"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransaccionLocal.setToolTipText("Guardar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionLocal.setToolTipText("Salir"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionLocal";
		inputMap = this.jButtonNuevoTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionLocal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionLocal"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransaccionLocal";
		inputMap = this.jButtonDuplicarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransaccionLocal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransaccionLocal"));
		
		//COPIAR
		sMapKey = "CopiarTransaccionLocal";
		inputMap = this.jButtonCopiarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransaccionLocal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransaccionLocal"));
		
		//VEr FORM
		sMapKey = "VerFormTransaccionLocal";
		inputMap = this.jButtonVerFormTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransaccionLocal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransaccionLocal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransaccionLocal";
		inputMap = this.jButtonNuevoRelacionesTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransaccionLocal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransaccionLocal";
		inputMap = this.jButtonModificarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransaccionLocal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransaccionLocal";
		inputMap = this.jButtonCerrarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionLocal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionLocal";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionLocal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TransaccionLocal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TransaccionLocal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TransaccionLocal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TransaccionLocal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TransaccionLocal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransaccionLocal.setName("jPanelParametrosReportesTransaccionLocal"); 
		
		this.jPanelParametrosReportesAccionesTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransaccionLocal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransaccionLocal.setName("jPanelParametrosReportesAccionesTransaccionLocal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransaccionLocal = new JButtonMe();
		this.jButtonRecargarInformacionTransaccionLocal.setText("Recargar");
		this.jButtonRecargarInformacionTransaccionLocal.setToolTipText("Recargar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransaccionLocal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransaccionLocal = new JButtonMe();
		this.jButtonProcesarInformacionTransaccionLocal.setText("Procesar");
		this.jButtonProcesarInformacionTransaccionLocal.setToolTipText("Procesar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransaccionLocal.setVisible(false);
			
		this.jButtonProcesarInformacionTransaccionLocal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionLocal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionLocal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionLocal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransaccionLocal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionLocal.setText("TIPO");       
		this.jComboBoxTiposReportesTransaccionLocal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionLocal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransaccionLocal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransaccionLocal.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransaccionLocal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransaccionLocal.setText("Accion");
		this.jComboBoxTiposRelacionesTransaccionLocal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionLocal.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionLocal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransaccionLocal.setText("Accion");
		this.jComboBoxTiposSeleccionarTransaccionLocal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransaccionLocal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransaccionLocal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionLocal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionLocal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransaccionLocal = new JLabelMe();
		
		this.jLabelAccionesTransaccionLocal.setText("Acciones");		
		this.jLabelAccionesTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransaccionLocal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransaccionLocal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransaccionLocal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransaccionLocal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransaccionLocal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransaccionLocal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransaccionLocal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransaccionLocal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransaccionLocal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransaccionLocal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransaccionLocal.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransaccionLocal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransaccionLocal = new JButtonMe();
		//this.jButtonAnterioresTransaccionLocal.setText("<<");
        this.jButtonAnterioresTransaccionLocal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransaccionLocal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransaccionLocal = new JButtonMe();
		//this.jButtonSiguientesTransaccionLocal.setText(">>");
        this.jButtonSiguientesTransaccionLocal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransaccionLocal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransaccionLocal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransaccionLocal.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransaccionLocal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransaccionLocal,"nuevoguardarcambios_button","Nue",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransaccionLocal";
		inputMap = this.jButtonNuevoGuardarCambiosTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransaccionLocal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransaccionLocal";
		inputMap = this.jButtonRecargarInformacionTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransaccionLocal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransaccionLocal";
		inputMap = this.jButtonSiguientesTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransaccionLocal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransaccionLocal";
		inputMap = this.jButtonAnterioresTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransaccionLocal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransaccionLocal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransaccionLocal.setMinimumSize(new Dimension(this.getWidth(),TransaccionLocalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionLocalBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesTransaccionLocal.setMaximumSize(new Dimension(this.getWidth(),TransaccionLocalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionLocalBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesTransaccionLocal.setPreferredSize(new Dimension(this.getWidth(),TransaccionLocalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionLocalBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransaccionLocal = new GridBagLayout();

			this.jPanelPaginacionTransaccionLocal.setLayout(gridaBagLayoutPaginacionTransaccionLocal);						
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = 0;
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonAnterioresTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
					
						
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionLocal.gridy = 0;
			
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonNuevoGuardarCambiosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
						
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionLocal.gridy = 0;
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonSiguientesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = 1;
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonNuevoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
						
			
			
			if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
				this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccionLocal.gridy = 1;
				this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransaccionLocal.add(this.jButtonGuardarCambiosTablaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			}
			
			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = 1;
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonDuplicarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = 1;
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonCopiarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = 1;
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonVerFormTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = 1;
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransaccionLocal.add(this.jButtonCerrarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		
		this.jButtonRecargarInformacionTransaccionLocal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionLocal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionLocal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransaccionLocal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionLocal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionLocal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransaccionLocal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionLocal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionLocal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransaccionLocal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionLocal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionLocal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransaccionLocal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionLocal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionLocal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransaccionLocal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionLocal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionLocal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransaccionLocal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionLocal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionLocal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransaccionLocal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionLocal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionLocal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransaccionLocal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionLocal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionLocal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransaccionLocal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionLocal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionLocal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransaccionLocal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionLocal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionLocal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransaccionLocal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionLocal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionLocal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransaccionLocal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransaccionLocal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TransaccionLocal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TransaccionLocal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TransaccionLocal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TransaccionLocal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransaccionLocal.setLayout(gridaBagParametrosReportesTransaccionLocal);
			this.jPanelParametrosReportesAccionesTransaccionLocal.setLayout(gridaBagParametrosReportesAccionesTransaccionLocal);
			
			
			this.jPanelParametrosAuxiliar1TransaccionLocal.setLayout(gridaBagParametrosAuxiliar1TransaccionLocal);
			this.jPanelParametrosAuxiliar2TransaccionLocal.setLayout(gridaBagParametrosAuxiliar2TransaccionLocal);
			this.jPanelParametrosAuxiliar3TransaccionLocal.setLayout(gridaBagParametrosAuxiliar3TransaccionLocal);
			this.jPanelParametrosAuxiliar4TransaccionLocal.setLayout(gridaBagParametrosAuxiliar4TransaccionLocal);
			//this.jPanelParametrosAuxiliar5TransaccionLocal.setLayout(gridaBagParametrosAuxiliar2TransaccionLocal);			
			
			
			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionLocal.add(this.jButtonRecargarInformacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionLocal.add(this.jComboBoxTiposPaginacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionLocal.add(this.jCheckBoxConAltoMaximoTablaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionLocal.add(this.jComboBoxTiposArchivosReportesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionLocal.add(this.jPanelParametrosAuxiliar1TransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TransaccionLocal.add(this.jComboBoxTiposReportesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);																		
			
			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TransaccionLocal.add(this.jComboBoxTiposGraficosReportesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionLocal.add(this.jPanelParametrosAuxiliar4TransaccionLocal, this.gridBagConstraintsTransaccionLocal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionLocal.add(this.jComboBoxTiposReportesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionLocal.add(this.jCheckBoxGenerarReporteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionLocal.add(this.jPanelParametrosAuxiliar2TransaccionLocal, this.gridBagConstraintsTransaccionLocal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionLocal.add(this.jLabelAccionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
				this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransaccionLocal.add(this.jButtonAbrirOrderByTransaccionLocal, this.gridBagConstraintsTransaccionLocal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionLocal.add(this.jComboBoxTiposSeleccionarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
			
			
			/*
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionLocal.add(this.jCheckBoxSeleccionarTodosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionLocal.add(this.jCheckBoxConGraficoReporteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionLocal.add(this.jCheckBoxSeleccionarTodosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);															
				
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionLocal.add(this.jCheckBoxSeleccionadosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);															
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionLocal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionLocal.add(this.jCheckBoxConGraficoReporteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionLocal.add(this.jPanelParametrosAuxiliar3TransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionLocal.add(this.jComboBoxTiposAccionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
	
				
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionLocal.add(this.jTextFieldValorCampoGeneralTransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralTransaccionLocal= new GridBagLayout();
		this.jPanelCamposIniciogeneralTransaccionLocal.setLayout(gridaBagLayoutCamposIniciogeneralTransaccionLocal);

		GridBagLayout gridaBagLayoutCamposIniciovalores1TransaccionLocal= new GridBagLayout();
		this.jPanelCamposIniciovalores1TransaccionLocal.setLayout(gridaBagLayoutCamposIniciovalores1TransaccionLocal);

		GridBagLayout gridaBagLayoutCamposIniciovalores2TransaccionLocal= new GridBagLayout();
		this.jPanelCamposIniciovalores2TransaccionLocal.setLayout(gridaBagLayoutCamposIniciovalores2TransaccionLocal);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransaccionLocal = new GridBagLayout();

			this.jScrollPanelDatosTransaccionLocal.setLayout(gridaBagLayoutDatosTransaccionLocal);
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = 0;
			this.gridBagConstraintsTransaccionLocal.gridx = 0;
			
			this.jScrollPanelDatosTransaccionLocal.add(this.jTableDatosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransaccionLocal.setViewportView(this.jTableDatosTransaccionLocal);
		this.jTableDatosTransaccionLocal.setFillsViewportHeight(true);
		this.jTableDatosTransaccionLocal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccionLocal= new GridBagLayout();
		this.jPanelAccionesTransaccionLocal.setLayout(gridaBagLayoutAccionesTransaccionLocal);
		
		
		/*	
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
			
		this.jPanelAccionesTransaccionLocal.add(this.jButtonNuevoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableTransaccionLocal.setLayout(gridaBagLayoutFK_IdAsientoContableTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdAsientoContableTransaccionLocal.add(jLabelid_asiento_contableFK_IdAsientoContableTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdAsientoContableTransaccionLocal.add(jComboBoxid_asiento_contableFK_IdAsientoContableTransaccionLocal, gridBagConstraintsTransaccionLocal);


		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdAsientoContableTransaccionLocal.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdAsientoContableTransaccionLocal.add(jButtonFK_IdAsientoContableTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("1.-Por Asiento C. ", jPanelFK_IdAsientoContableTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdClienteTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteTransaccionLocal.setLayout(gridaBagLayoutFK_IdClienteTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdClienteTransaccionLocal.add(jLabelid_clienteFK_IdClienteTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdClienteTransaccionLocal.add(jComboBoxid_clienteFK_IdClienteTransaccionLocal, gridBagConstraintsTransaccionLocal);


		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdClienteTransaccionLocal.add(this.jButtonBuscarFK_IdClienteid_clienteTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdClienteTransaccionLocal.add(jButtonFK_IdClienteTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("2.-Por Prove/Cliente ", jPanelFK_IdClienteTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCompraTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdCompraTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCompraTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCompraTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCompraTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCompraTransaccionLocal.setLayout(gridaBagLayoutFK_IdCompraTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdCompraTransaccionLocal.add(jLabelid_compraFK_IdCompraTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdCompraTransaccionLocal.add(jComboBoxid_compraFK_IdCompraTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdCompraTransaccionLocal.add(jButtonFK_IdCompraTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("3.-Por Compra ", jPanelFK_IdCompraTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPeriodoDeclaraTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdPeriodoDeclaraTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPeriodoDeclaraTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPeriodoDeclaraTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPeriodoDeclaraTransaccionLocal.setLayout(gridaBagLayoutFK_IdPeriodoDeclaraTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdPeriodoDeclaraTransaccionLocal.add(jLabelid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdPeriodoDeclaraTransaccionLocal.add(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdPeriodoDeclaraTransaccionLocal.add(jButtonFK_IdPeriodoDeclaraTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("4.-Por Periodo Declara ", jPanelFK_IdPeriodoDeclaraTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoComprobanteTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoComprobanteTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoComprobanteTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoComprobanteTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoComprobanteTransaccionLocal.setLayout(gridaBagLayoutFK_IdTipoComprobanteTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdTipoComprobanteTransaccionLocal.add(jLabelid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdTipoComprobanteTransaccionLocal.add(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdTipoComprobanteTransaccionLocal.add(jButtonFK_IdTipoComprobanteTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("5.-Por T. Comprobante ", jPanelFK_IdTipoComprobanteTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoIvaTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIvaTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIvaTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIvaTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIvaTransaccionLocal.setLayout(gridaBagLayoutFK_IdTipoIvaTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdTipoIvaTransaccionLocal.add(jLabelid_tipo_ivaFK_IdTipoIvaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdTipoIvaTransaccionLocal.add(jComboBoxid_tipo_ivaFK_IdTipoIvaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdTipoIvaTransaccionLocal.add(jButtonFK_IdTipoIvaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("6.-Por % Iva ", jPanelFK_IdTipoIvaTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIvaTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIvaTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIvaTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIvaTransaccionLocal.setLayout(gridaBagLayoutFK_IdTipoRetencionIvaTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdTipoRetencionIvaTransaccionLocal.add(jLabelid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdTipoRetencionIvaTransaccionLocal.add(jComboBoxid_tipo_retencion_ivaFK_IdTipoRetencionIvaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdTipoRetencionIvaTransaccionLocal.add(jButtonFK_IdTipoRetencionIvaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("7.-Por % Iva_ ", jPanelFK_IdTipoRetencionIvaTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionIvaPrestaTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionIvaPrestaTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaPrestaTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionIvaPrestaTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionIvaPrestaTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal.setLayout(gridaBagLayoutFK_IdTipoRetencionIvaPrestaTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal.add(jLabelid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal.add(jComboBoxid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPrestaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal.add(jButtonFK_IdTipoRetencionIvaPrestaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("8.-Por % Iva. ", jPanelFK_IdTipoRetencionIvaPrestaTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoTributarioTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTributarioTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTributarioTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTributarioTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTributarioTransaccionLocal.setLayout(gridaBagLayoutFK_IdTipoTributarioTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdTipoTributarioTransaccionLocal.add(jLabelid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdTipoTributarioTransaccionLocal.add(jComboBoxid_tipo_tributarioFK_IdTipoTributarioTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdTipoTributarioTransaccionLocal.add(jButtonFK_IdTipoTributarioTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("9.-Por Cod. Tributario ", jPanelFK_IdTipoTributarioTransaccionLocal);
		jTabbedPaneBusquedasTransaccionLocal.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTransaccionContaTransaccionLocal= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionContaTransaccionLocal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionContaTransaccionLocal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionContaTransaccionLocal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionContaTransaccionLocal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionContaTransaccionLocal.setLayout(gridaBagLayoutFK_IdTransaccionContaTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 0;
		jPanelFK_IdTransaccionContaTransaccionLocal.add(jLabelid_transaccion_contaFK_IdTransaccionContaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 0;
		gridBagConstraintsTransaccionLocal.gridx = 1;
		jPanelFK_IdTransaccionContaTransaccionLocal.add(jComboBoxid_transaccion_contaFK_IdTransaccionContaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionLocal.gridy = 1;
		gridBagConstraintsTransaccionLocal.gridx =1;
		jPanelFK_IdTransaccionContaTransaccionLocal.add(jButtonFK_IdTransaccionContaTransaccionLocal, gridBagConstraintsTransaccionLocal);

		jTabbedPaneBusquedasTransaccionLocal.addTab("10.-Por Transaccion ", jPanelFK_IdTransaccionContaTransaccionLocal);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionLocal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionLocal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionLocal.gridx = 0;		
			//this.gridBagConstraintsTransaccionLocal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionLocal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransaccionLocal.gridx = 0;		
		//this.gridBagConstraintsTransaccionLocal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransaccionLocal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransaccionLocal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionLocal.gridx = 0;		
			this.gridBagConstraintsTransaccionLocal.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransaccionLocal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransaccionLocal, this.gridBagConstraintsTransaccionLocal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);								
		
		
		/*
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		*/		
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionLocal.gridx =0;
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionLocal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
				
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransaccionLocalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransaccionLocal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionLocal = new GridBagLayout();
			this.jPanelBusquedasParametrosTransaccionLocal.setLayout(gridaBagLayoutBusquedasParametrosTransaccionLocal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransaccionLocal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionLocal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionLocal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionLocal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			
			
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
			
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransaccionLocal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransaccionLocal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransaccionLocal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransaccionLocal.setName("jPanelReporteDinamicoTransaccionLocal"); 
		
		this.jPanelReporteDinamicoTransaccionLocal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionLocal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionLocal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransaccionLocal.setLayout(gridaBagLayoutReporteDinamicoTransaccionLocal);
		
		
		this.jInternalFrameReporteDinamicoTransaccionLocal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransaccionLocal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionLocal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransaccionLocal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransaccionLocal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransaccionLocal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransaccionLocal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransaccionLocal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransaccionLocal.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransaccionLocal.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransaccionLocal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransaccionLocal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionLocal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionLocal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Locales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransaccionLocal = new JLabelMe();

		this.jLabelColumnasSelectReporteTransaccionLocal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelColumnasSelectReporteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransaccionLocal = new JList<Reporte>();
		this.jListColumnasSelectReporteTransaccionLocal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransaccionLocal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransaccionLocal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionLocal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionLocal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransaccionLocal=new JScrollPane(this.jListColumnasSelectReporteTransaccionLocal);
			
			this.jScrollColumnasSelectReporteTransaccionLocal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionLocal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionLocal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccionLocal.add(this.jListColumnasSelectReporteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jScrollColumnasSelectReporteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransaccionLocal = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransaccionLocal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransaccionLocal = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransaccionLocal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransaccionLocal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransaccionLocal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionLocal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionLocal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransaccionLocal=new JScrollPane(this.jListRelacionesSelectReporteTransaccionLocal);
			
			this.jScrollRelacionesSelectReporteTransaccionLocal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionLocal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionLocal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransaccionLocal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransaccionLocal = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransaccionLocal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransaccionLocal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransaccionLocal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransaccionLocal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionLocal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionLocal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTransaccionLocal = new JLabelMe();

		this.jLabelConGraficoDinamicoTransaccionLocal.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelConGraficoDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTransaccionLocal = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTransaccionLocal.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTransaccionLocal.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTransaccionLocal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransaccionLocal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransaccionLocal.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jCheckBoxConGraficoDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTransaccionLocal = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTransaccionLocal.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelColumnaCategoriaGraficoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransaccionLocal.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTransaccionLocal.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTransaccionLocal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransaccionLocal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransaccionLocal.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jComboBoxColumnaCategoriaGraficoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTransaccionLocal = new JLabelMe();

		this.jLabelColumnaCategoriaValorTransaccionLocal.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelColumnaCategoriaValorTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTransaccionLocal.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTransaccionLocal.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTransaccionLocal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransaccionLocal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransaccionLocal.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jComboBoxColumnaCategoriaValorTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTransaccionLocal = new JLabelMe();

		this.jLabelColumnasValoresGraficoTransaccionLocal.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelColumnasValoresGraficoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTransaccionLocal = new JList<Reporte>();
		this.jListColumnasValoresGraficoTransaccionLocal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTransaccionLocal.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTransaccionLocal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransaccionLocal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransaccionLocal.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTransaccionLocal=new JScrollPane(this.jListColumnasValoresGraficoTransaccionLocal);
			
			this.jScrollColumnasValoresGraficoTransaccionLocal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransaccionLocal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransaccionLocal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTransaccionLocal.add(this.jListColumnasSelectReporteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jScrollColumnasValoresGraficoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTransaccionLocal = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTransaccionLocal.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelTiposGraficosReportesDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransaccionLocal.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionLocal.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTransaccionLocal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionLocal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransaccionLocal.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jComboBoxTiposGraficosReportesDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransaccionLocal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransaccionLocal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelGenerarExcelReporteDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionLocal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransaccionLocal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransaccionLocal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransaccionLocal.setToolTipText("Generar EXCEL"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransaccionLocal.add(this.jButtonGenerarExcelReporteDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jComboBoxTiposReportesDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransaccionLocal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransaccionLocal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jLabelTiposArchivoReporteDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jComboBoxTiposArchivosReportesDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransaccionLocal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransaccionLocal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransaccionLocal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransaccionLocal.setToolTipText("Generar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jButtonGenerarReporteDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransaccionLocal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransaccionLocal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransaccionLocal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransaccionLocal.setToolTipText("Cancelar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionLocal.add(this.jButtonCerrarReporteDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransaccionLocal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransaccionLocal= new JScrollPane(jPanelReporteDinamicoTransaccionLocal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransaccionLocal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionLocal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionLocal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Locales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionLocal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransaccionLocal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransaccionLocal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransaccionLocal);
		this.jInternalFrameReporteDinamicoTransaccionLocal.getContentPane().add(this.jScrollPanelReporteDinamicoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransaccionLocal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransaccionLocal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransaccionLocal.setName("jPanelImportacionTransaccionLocal"); 
		
		this.jPanelImportacionTransaccionLocal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionLocal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionLocal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransaccionLocal.setLayout(gridaBagLayoutImportacionTransaccionLocal);
		
		
		this.jInternalFrameImportacionTransaccionLocal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransaccionLocal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransaccionLocal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionLocal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransaccionLocal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionLocal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionLocal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransaccionLocal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionLocal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionLocal.setResizable(true);
	    this.jInternalFrameImportacionTransaccionLocal.setClosable(true);
	    this.jInternalFrameImportacionTransaccionLocal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransaccionLocal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionLocal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionLocal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransaccionLocal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionLocal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionLocal.setResizable(true);
	    this.jInternalFrameImportacionTransaccionLocal.setClosable(true);
	    this.jInternalFrameImportacionTransaccionLocal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransaccionLocal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionLocal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionLocal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Locales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransaccionLocal = new JLabelMe();

		this.jLabelArchivoImportacionTransaccionLocal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionLocal.add(this.jLabelArchivoImportacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransaccionLocal = new JFileChooser();		
		this.jFileChooserImportacionTransaccionLocal.setToolTipText("ESCOGER ARCHIVO"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransaccionLocal = new JButtonMe();
		this.jButtonAbrirImportacionTransaccionLocal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransaccionLocal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransaccionLocal.setToolTipText("Generar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionLocal.add(this.jButtonAbrirImportacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransaccionLocal = new JLabelMe();

		this.jLabelPathArchivoImportacionTransaccionLocal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionLocal.add(this.jLabelPathArchivoImportacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransaccionLocal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransaccionLocal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionLocal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionLocal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionLocal.add(this.jTextFieldPathArchivoImportacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransaccionLocal = new JButtonMe();
		this.jButtonGenerarImportacionTransaccionLocal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransaccionLocal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransaccionLocal.setToolTipText("Generar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionLocal.add(this.jButtonGenerarImportacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransaccionLocal = new JButtonMe();
		this.jButtonCerrarImportacionTransaccionLocal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransaccionLocal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransaccionLocal.setToolTipText("Cancelar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionLocal.add(this.jButtonCerrarImportacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransaccionLocal = new GridBagLayout();
		
		this.jScrollPanelImportacionTransaccionLocal= new JScrollPane(jPanelImportacionTransaccionLocal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy =iPosYImportacion;
		this.gridBagConstraintsTransaccionLocal.gridx =iPosXImportacion;
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransaccionLocal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransaccionLocal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransaccionLocal);
		this.jInternalFrameImportacionTransaccionLocal.getContentPane().add(this.jScrollPanelImportacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransaccionLocal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransaccionLocal = new JButtonMe();
			this.jButtonAbrirOrderByTransaccionLocal.setText("Orden");
			this.jButtonAbrirOrderByTransaccionLocal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionLocal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransaccionLocal";
			inputMap = this.jButtonAbrirOrderByTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransaccionLocal"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransaccionLocal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransaccionLocal.setName("jPanelOrderByTransaccionLocal"); 
			
			this.jPanelOrderByTransaccionLocal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionLocal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionLocal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransaccionLocal.setLayout(gridaBagLayoutOrderByTransaccionLocal);
			
			
			this.jTableDatosTransaccionLocalOrderBy = new JTableMe();        
			this.jTableDatosTransaccionLocalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransaccionLocalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransaccionLocalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransaccionLocalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransaccionLocalOrderBy.setViewportView(this.jTableDatosTransaccionLocalOrderBy);
			this.jTableDatosTransaccionLocalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransaccionLocalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransaccionLocal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransaccionLocal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransaccionLocal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransaccionLocal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransaccionLocal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransaccionLocal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransaccionLocal.setTitle("Orden");
			this.jInternalFrameOrderByTransaccionLocal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransaccionLocal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransaccionLocal.setResizable(true);
			this.jInternalFrameOrderByTransaccionLocal.setClosable(true);
			this.jInternalFrameOrderByTransaccionLocal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransaccionLocal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionLocal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionLocal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Locales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransaccionLocal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransaccionLocal.ipady =150;
				
			this.jPanelOrderByTransaccionLocal.add(jScrollPanelDatosTransaccionLocalOrderBy, this.gridBagConstraintsTransaccionLocal);//this.jTableDatosTransaccionLocalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransaccionLocal = new JButtonMe();
			this.jButtonCerrarOrderByTransaccionLocal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransaccionLocal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransaccionLocal.setToolTipText("Cancelar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransaccionLocal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransaccionLocal.add(this.jButtonCerrarOrderByTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransaccionLocal = new GridBagLayout();
			
			this.jScrollPanelOrderByTransaccionLocal= new JScrollPane(jPanelOrderByTransaccionLocal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransaccionLocal.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransaccionLocal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransaccionLocal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransaccionLocal);
			
			this.jInternalFrameOrderByTransaccionLocal.getContentPane().add(this.jScrollPanelOrderByTransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
		
		} else {
			this.jButtonAbrirOrderByTransaccionLocal = new JButtonMe();
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
		int iWidthTableCalculado=0;//6930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transaccionlocalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransaccionLocal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransaccionLocal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransaccionLocal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransaccionLocal.getRowHeight();//TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionLocal.isSelected()) {
					iHeightTable=TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionLocal.isSelected()) {
					iHeightTable=TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionLocalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransaccionLocal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionLocal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionLocal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransaccionLocal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionLocal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionLocal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransaccionLocal!=null && this.jInternalFrameOrderByTransaccionLocal.getjTableDatosOrderBy()!=null) {
			//if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransaccionLocal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransaccionLocal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransaccionLocal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransaccionLocal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransaccionLocal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransaccionLocal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransaccionLocal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransaccionLocal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionLocal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionLocal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transaccionlocalLogic.getTransaccionLocals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccionlocals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TransaccionLocal> TraerTransaccionLocalBeans(List<TransaccionLocal> transaccionlocals,ArrayList<Classe> classes)throws Exception {
		try {
			for(TransaccionLocal transaccionlocal:transaccionlocals) {
					
				if(!(TransaccionLocalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransaccionLocalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transaccionlocal.setsDetalleGeneralEntityReporte(TransaccionLocalConstantesFunciones.getTransaccionLocalDescripcion(transaccionlocal));
										
					transaccionlocal.setes_rise_descripcion(TransaccionLocalConstantesFunciones.getes_riseDescripcion(transaccionlocal));transaccionlocal.setpermite_devolucion_descripcion(TransaccionLocalConstantesFunciones.getpermite_devolucionDescripcion(transaccionlocal));	
					
						
					
				} else  {
							
					//transaccionlocal.setsDetalleGeneralEntityReporte(transaccionlocal.getsDetalleGeneralEntityReporte());
										
				}
				
				//transaccionlocalbeans.add(transaccionlocalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transaccionlocals;
    }
	//PARA REPORTES FIN
}
