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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.ParametroImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class ParametroImporJInternalFrame extends ParametroImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroImpor;
	
	protected JMenuBar jmenuBarParametroImpor;
	
	protected JMenu jmenuParametroImpor;
	protected JMenu jmenuDatosParametroImpor;
	protected JMenu jmenuArchivoParametroImpor;
	protected JMenu jmenuAccionesParametroImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroImpor;	
	protected GridBagConstraints gridBagConstraintsParametroImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroImporDetalleFormJInternalFrame jInternalFrameDetalleFormParametroImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TransaccionBeanSwingJInternalFrame transaccionordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionordencompra="";

	protected TransaccionBeanSwingJInternalFrame transaccioningresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioningreso="";

	protected FormatoBeanSwingJInternalFrame formatoordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoordencompra="";

	protected FormatoBeanSwingJInternalFrame formatoingresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoingreso="";

	protected FormatoBeanSwingJInternalFrame formatopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatopedido="";

	protected FormatoBeanSwingJInternalFrame formatoliquidacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoliquidacion="";
	
	public ParametroImporSessionBean parametroimporSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TransaccionSessionBean transaccionordencompraSessionBean;
	public TransaccionSessionBean transaccioningresoSessionBean;
	public FormatoSessionBean formatoordencompraSessionBean;
	public FormatoSessionBean formatoingresoSessionBean;
	public FormatoSessionBean formatopedidoSessionBean;
	public FormatoSessionBean formatoliquidacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroImpor> parametroimpors;		
	public List<ParametroImpor> parametroimporsEliminados;	
	public List<ParametroImpor> parametroimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroImpor;		
	protected JButton jButtonAbrirOrderByParametroImpor;
	
	
	//protected JPanel jPanelOrderByParametroImpor;
	//public JScrollPane jScrollPanelOrderByParametroImpor;	
	//protected JButton jButtonCerrarOrderByParametroImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroImporLogic parametroimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroImpor;
	public JScrollPane jScrollPanelDatosEdicionParametroImpor;
	public JScrollPane jScrollPanelDatosGeneralParametroImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroImpor;
	//public JScrollPane jScrollPanelImportacionParametroImpor;
	
	
	
	protected JPanel jPanelAccionesParametroImpor;
	
    protected JPanel jPanelPaginacionParametroImpor;
    protected JPanel jPanelParametrosReportesParametroImpor;
	protected JPanel jPanelParametrosReportesAccionesParametroImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroImpor;
	protected JPanel jPanelParametrosAuxiliar2ParametroImpor;
	protected JPanel jPanelParametrosAuxiliar3ParametroImpor;
	protected JPanel jPanelParametrosAuxiliar4ParametroImpor;
	//protected JPanel jPanelParametrosAuxiliar5ParametroImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroImpor;
	//protected JPanel jPanelImportacionParametroImpor;
	
	
	public JTable jTableDatosParametroImpor;
	
	
	
	//public JTable jTableDatosParametroImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroImpor;
	protected JButton jButtonDuplicarParametroImpor;
	protected JButton jButtonCopiarParametroImpor;
	protected JButton jButtonVerFormParametroImpor;
	protected JButton jButtonNuevoRelacionesParametroImpor;
	protected JButton jButtonModificarParametroImpor;
	
    protected JButton jButtonGuardarCambiosTablaParametroImpor;
	protected JButton jButtonCerrarParametroImpor;
	
	
	protected JButton jButtonRecargarInformacionParametroImpor;
	protected JButton jButtonProcesarInformacionParametroImpor;
	
	
	protected JButton jButtonAnterioresParametroImpor;
	protected JButton jButtonSiguientesParametroImpor;
	protected JButton jButtonNuevoGuardarCambiosParametroImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroImpor;
	//protected JButton jButtonCerrarReporteDinamicoParametroImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroImpor;
	//protected JButton jButtonGenerarImportacionParametroImpor;
	//protected JButton jButtonCerrarImportacionParametroImpor;
	//protected JFileChooser jFileChooserImportacionParametroImpor;
	//protected File fileImportacionParametroImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroImpor;
	protected JButton jButtonDuplicarToolBarParametroImpor;
	protected JButton jButtonNuevoRelacionesToolBarParametroImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroImpor;
	protected JButton jButtonCopiarToolBarParametroImpor;
	protected JButton jButtonVerFormToolBarParametroImpor;
	public JButton jButtonGuardarCambiosTablaToolBarParametroImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroImpor;
	protected JButton jButtonCerrarToolBarParametroImpor;
	
	protected JButton jButtonRecargarInformacionToolBarParametroImpor;
	protected JButton jButtonProcesarInformacionToolBarParametroImpor;
	protected JButton jButtonAnterioresToolBarParametroImpor;
	protected JButton jButtonSiguientesToolBarParametroImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroImpor;
	protected JButton jButtonAbrirOrderByToolBarParametroImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroImpor;
	protected JMenuItem jMenuItemDuplicarParametroImpor;
	protected JMenuItem jMenuItemNuevoRelacionesParametroImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroImpor;
	protected JMenuItem jMenuItemCopiarParametroImpor;
	protected JMenuItem jMenuItemVerFormParametroImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroImpor;
	protected JMenuItem jMenuItemCerrarParametroImpor;
	protected JMenuItem jMenuItemDetalleCerrarParametroImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroImpor;
	protected JMenuItem jMenuItemProcesarInformacionParametroImpor;
	protected JMenuItem jMenuItemAnterioresParametroImpor;
	protected JMenuItem jMenuItemSiguientesParametroImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroImpor;
	protected JMenuItem jMenuItemAbrirOrderByParametroImpor;
	protected JMenuItem jMenuItemMostrarOcultarParametroImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroImpor;
	protected JCheckBox jCheckBoxSeleccionadosParametroImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroImpor;
	protected JCheckBox jCheckBoxConGraficoReporteParametroImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroImpor;
	protected JTextField jTextFieldValorCampoGeneralParametroImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroImpor;
	//public JList<Reporte> jListColumnasSelectReporteParametroImpor;
	//public JScrollPane jScrollColumnasSelectReporteParametroImpor;
	
	//public JLabel jLabelRelacionesSelectReporteParametroImpor;
	//public JList<Reporte> jListRelacionesSelectReporteParametroImpor;
	//public JScrollPane jScrollRelacionesSelectReporteParametroImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroImpor;
	
		
	//public JLabel jLabelArchivoImportacionParametroImpor;	
	//public JLabel jLabelPathArchivoImportacionParametroImpor;
	//protected JTextField jTextFieldPathArchivoImportacionParametroImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroImpor;
	
	//public JLabel jLabelColumnaCategoriaValorParametroImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroImpor;
	
	//public JLabel jLabelColumnasValoresGraficoParametroImpor;
	//public JList<Reporte> jListColumnasValoresGraficoParametroImpor;
	//public JScrollPane jScrollColumnasValoresGraficoParametroImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroImpor;
	public JPanel jPanelFK_IdBodegaParametroImpor;
	public JButton jButtonFK_IdBodegaParametroImpor;
	public JPanel jPanelFK_IdCentroCostoParametroImpor;
	public JButton jButtonFK_IdCentroCostoParametroImpor;
	public JPanel jPanelFK_IdCuentaContableParametroImpor;
	public JButton jButtonFK_IdCuentaContableParametroImpor;
	public JPanel jPanelFK_IdFormatoIngresoParametroImpor;
	public JButton jButtonFK_IdFormatoIngresoParametroImpor;
	public JPanel jPanelFK_IdFormatoLiquacionParametroImpor;
	public JButton jButtonFK_IdFormatoLiquacionParametroImpor;
	public JPanel jPanelFK_IdFormatoOrdenCompraParametroImpor;
	public JButton jButtonFK_IdFormatoOrdenCompraParametroImpor;
	public JPanel jPanelFK_IdFormatoPedoParametroImpor;
	public JButton jButtonFK_IdFormatoPedoParametroImpor;
	public JPanel jPanelFK_IdPaisParametroImpor;
	public JButton jButtonFK_IdPaisParametroImpor;
	public JPanel jPanelFK_IdTransaccionIngresoParametroImpor;
	public JButton jButtonFK_IdTransaccionIngresoParametroImpor;
	public JPanel jPanelFK_IdTransaccionOrdenCompraParametroImpor;
	public JButton jButtonFK_IdTransaccionOrdenCompraParametroImpor;
	
	public JPanel jPanelid_bodegaFK_IdBodegaParametroImpor;
	public JLabel jLabelid_bodegaFK_IdBodegaParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaParametroImpor;
	public JButton jButtonid_bodegaFK_IdBodegaParametroImpor= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoParametroImpor;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoParametroImpor;
	public JButton jButtonid_centro_costoFK_IdCentroCostoParametroImpor= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoParametroImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoParametroImporArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableParametroImpor;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableParametroImpor;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroImpor= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroImporBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableParametroImporArbol= new JButtonMe();

	
	public JPanel jPanelid_formato_ingresoFK_IdFormatoIngresoParametroImpor;
	public JLabel jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_ingresoFK_IdFormatoIngresoParametroImpor;
	public JButton jButtonid_formato_ingresoFK_IdFormatoIngresoParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_ingresoFK_IdFormatoIngresoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_ingresoFK_IdFormatoIngresoParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor;
	public JLabel jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor;
	public JButton jButtonid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_liquidacionFK_IdFormatoLiquacionParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_liquidacionFK_IdFormatoLiquacionParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor;
	public JLabel jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor;
	public JButton jButtonid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_pedidoFK_IdFormatoPedoParametroImpor;
	public JLabel jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroImpor;
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedoParametroImpor= new JButtonMe();
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_formato_pedidoFK_IdFormatoPedoParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisParametroImpor;
	public JLabel jLabelid_paisFK_IdPaisParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisParametroImpor;
	public JButton jButtonid_paisFK_IdPaisParametroImpor= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor;
	public JLabel jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor;
	public JButton jButtonid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor= new JButtonMe();
	public JButton jButtonid_transaccion_ingresoFK_IdTransaccionIngresoParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_ingresoFK_IdTransaccionIngresoParametroImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor;
	public JLabel jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor;
	public JButton jButtonid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor= new JButtonMe();
	public JButton jButtonid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImporUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImporBusqueda= new JButtonMe();

	
	
	
	
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
	public ParametroImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroImpor)	{
		this.jButtonRecargarInformacionParametroImpor = jButtonRecargarInformacionParametroImpor;
	}
	
	public JButton getjButtonProcesarInformacionParametroImpor() {
		return this.jButtonProcesarInformacionParametroImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroImpor)	{
		this.jButtonProcesarInformacionParametroImpor = jButtonProcesarInformacionParametroImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroImpor() {
		return this.jButtonRecargarInformacionParametroImpor;
	}
	
	
	public List<ParametroImpor> getparametroimpors() {
		return this.parametroimpors;
	}

	public void setparametroimpors(List<ParametroImpor> parametroimpors) {
		this.parametroimpors = parametroimpors;
	}
	
	public List<ParametroImpor> getparametroimporsAux() {
		return this.parametroimporsAux;
	}

	public void setparametroimporsAux(List<ParametroImpor> parametroimporsAux) {
		this.parametroimporsAux = parametroimporsAux;
	}
	
	public List<ParametroImpor> getparametroimporsEliminados() {
		return this.parametroimporsEliminados;
	}

	public void setParametroImporsEliminados(List<ParametroImpor> parametroimporsEliminados) {
		this.parametroimporsEliminados = parametroimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroImpor() {
		return jComboBoxTiposSeleccionarParametroImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroImpor(
			JComboBox jComboBoxTiposSeleccionarParametroImpor) {
		this.jComboBoxTiposSeleccionarParametroImpor = jComboBoxTiposSeleccionarParametroImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroImpor() {
		return jTextFieldValorCampoGeneralParametroImpor;
	}

	public void setjTextFieldValorCampoGeneralParametroImpor(
			JTextField jTextFieldValorCampoGeneralParametroImpor) {
		this.jTextFieldValorCampoGeneralParametroImpor = jTextFieldValorCampoGeneralParametroImpor;
	}

	public void setBorderResaltarValorCampoGeneralParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroImpor() {
		return this.jCheckBoxSeleccionarTodosParametroImpor;
	}

	public void setjCheckBoxSeleccionarTodosParametroImpor(
			JCheckBox jCheckBoxSeleccionarTodosParametroImpor) {
		this.jCheckBoxSeleccionarTodosParametroImpor = jCheckBoxSeleccionarTodosParametroImpor;
	}

	public void setBorderResaltarSeleccionarTodosParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroImpor() {
		return this.jCheckBoxSeleccionadosParametroImpor;
	}

	public void setjCheckBoxSeleccionadosParametroImpor(
			JCheckBox jCheckBoxSeleccionadosParametroImpor) {
		this.jCheckBoxSeleccionadosParametroImpor = jCheckBoxSeleccionadosParametroImpor;
	}
	
	public void setBorderResaltarSeleccionadosParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroImpor() {
		return this.jComboBoxTiposArchivosReportesParametroImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroImpor(
			JComboBox jComboBoxTiposArchivosReportesParametroImpor) {
		this.jComboBoxTiposArchivosReportesParametroImpor = jComboBoxTiposArchivosReportesParametroImpor;
	}

	public void setBorderResaltarTiposArchivosReportesParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroImpor() {
		return this.jComboBoxTiposReportesParametroImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroImpor(
			JComboBox jComboBoxTiposReportesParametroImpor) {
		this.jComboBoxTiposReportesParametroImpor = jComboBoxTiposReportesParametroImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroImpor() {
	//	return jComboBoxTiposReportesDinamicoParametroImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroImpor) {
	//	this.jComboBoxTiposReportesDinamicoParametroImpor = jComboBoxTiposReportesDinamicoParametroImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroImpor = jComboBoxTiposArchivosReportesDinamicoParametroImpor;
	//}
	
	public void setBorderResaltarTiposReportesParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroImpor() {
		return this.jComboBoxTiposGraficosReportesParametroImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroImpor(
			JComboBox jComboBoxTiposGraficosReportesParametroImpor) {
		this.jComboBoxTiposGraficosReportesParametroImpor = jComboBoxTiposGraficosReportesParametroImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroImpor() {
		return this.jComboBoxTiposPaginacionParametroImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroImpor(
			JComboBox jComboBoxTiposPaginacionParametroImpor) {
		this.jComboBoxTiposPaginacionParametroImpor = jComboBoxTiposPaginacionParametroImpor;
	}
	
	public void setBorderResaltarTiposPaginacionParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroImpor() {
		return this.jComboBoxTiposRelacionesParametroImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroImpor() {
		return this.jComboBoxTiposAccionesParametroImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroImpor(
			JComboBox jComboBoxTiposRelacionesParametroImpor) {
		this.jComboBoxTiposRelacionesParametroImpor = jComboBoxTiposRelacionesParametroImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroImpor(
			JComboBox jComboBoxTiposAccionesParametroImpor) {
		this.jComboBoxTiposAccionesParametroImpor = jComboBoxTiposAccionesParametroImpor;
	}
	
	public void setBorderResaltarTiposRelacionesParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroImpor() {
	//	return jCheckBoxConGraficoDinamicoParametroImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroImpor) {
	//	this.jCheckBoxConGraficoDinamicoParametroImpor = jCheckBoxConGraficoDinamicoParametroImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroImpor .setBorder(borderResaltar);		
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
		this.parametroimporSessionBean=new ParametroImporSessionBean();
		
		this.parametroimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Impor MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"nuevo","nuevo","Nuevo"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"duplicar","duplicar","Duplicar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"copiar","copiar","Copiar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"ver_form","ver_form","Ver"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"recargar","recargar","Recargar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroImpor,this.jTtoolBarParametroImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroImpor,this.jTtoolBarParametroImpor,
							"cerrar","cerrar","Salir"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroImpor;
			
				this.jButtonProcesarInformacionToolBarParametroImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroImpor;
				
		//protected JButton jButtonModificarToolBarParametroImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroImpor=new JMenuMe("General");
		this.jmenuArchivoParametroImpor=new JMenuMe("Archivo");
		this.jmenuAccionesParametroImpor=new JMenuMe("Acciones");
		this.jmenuDatosParametroImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroImpor.add(this.jMenuItemCerrarParametroImpor);
			
			this.jmenuAccionesParametroImpor.add(this.jMenuItemNuevoParametroImpor);
			this.jmenuAccionesParametroImpor.add(this.jMenuItemNuevoGuardarCambiosParametroImpor);
			this.jmenuAccionesParametroImpor.add(this.jMenuItemNuevoRelacionesParametroImpor);
			this.jmenuAccionesParametroImpor.add(this.jMenuItemGuardarCambiosTablaParametroImpor);		
			this.jmenuAccionesParametroImpor.add(this.jMenuItemDuplicarParametroImpor);		
			this.jmenuAccionesParametroImpor.add(this.jMenuItemCopiarParametroImpor);		
			this.jmenuAccionesParametroImpor.add(this.jMenuItemVerFormParametroImpor);		
			
			this.jmenuDatosParametroImpor.add(this.jMenuItemRecargarInformacionParametroImpor);				
			this.jmenuDatosParametroImpor.add(this.jMenuItemAnterioresParametroImpor);				
			this.jmenuDatosParametroImpor.add(this.jMenuItemSiguientesParametroImpor);				
			this.jmenuDatosParametroImpor.add(this.jMenuItemAbrirOrderByParametroImpor);				
			this.jmenuDatosParametroImpor.add(this.jMenuItemMostrarOcultarParametroImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroImpor.add(this.jMenuItemGuardarCambiosParametroImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroImpor.add(this.jmenuArchivoParametroImpor);		
			this.jmenuBarParametroImpor.add(this.jmenuAccionesParametroImpor);		
			this.jmenuBarParametroImpor.add(this.jmenuDatosParametroImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaParametroImpor.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaParametroImpor= new JButtonMe();
		this.jButtonFK_IdBodegaParametroImpor.setText("Buscar");
		this.jButtonFK_IdBodegaParametroImpor.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaParametroImpor,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaParametroImpor = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaParametroImpor.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaParametroImpor.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaParametroImpor= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoParametroImpor.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoParametroImpor= new JButtonMe();
		this.jButtonFK_IdCentroCostoParametroImpor.setText("Buscar");
		this.jButtonFK_IdCentroCostoParametroImpor.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoParametroImpor,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoParametroImpor = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoParametroImpor.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoParametroImpor.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoParametroImpor= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableParametroImpor.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableParametroImpor= new JButtonMe();
		this.jButtonFK_IdCuentaContableParametroImpor.setText("Buscar");
		this.jButtonFK_IdCuentaContableParametroImpor.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableParametroImpor,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroImpor= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoIngresoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoIngresoParametroImpor.setToolTipText("Buscar Por Formato Ingreso ");
		this.jButtonFK_IdFormatoIngresoParametroImpor= new JButtonMe();
		this.jButtonFK_IdFormatoIngresoParametroImpor.setText("Buscar");
		this.jButtonFK_IdFormatoIngresoParametroImpor.setToolTipText("Buscar Por Formato Ingreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoIngresoParametroImpor,"buscar_button","Buscar Por Formato Ingreso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoIngresoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor = new JLabelMe();
		jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setText("Formato Ingreso :");
		jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setToolTipText("Formato Ingreso");
		jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_ingresoFK_IdFormatoIngresoParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_ingresoFK_IdFormatoIngresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_ingresoFK_IdFormatoIngresoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoLiquacionParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoLiquacionParametroImpor.setToolTipText("Buscar Por Formato Liquacion ");
		this.jButtonFK_IdFormatoLiquacionParametroImpor= new JButtonMe();
		this.jButtonFK_IdFormatoLiquacionParametroImpor.setText("Buscar");
		this.jButtonFK_IdFormatoLiquacionParametroImpor.setToolTipText("Buscar Por Formato Liquacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoLiquacionParametroImpor,"buscar_button","Buscar Por Formato Liquacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoLiquacionParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor = new JLabelMe();
		jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setText("Formato Liquacion :");
		jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setToolTipText("Formato Liquacion");
		jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoOrdenCompraParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoOrdenCompraParametroImpor.setToolTipText("Buscar Por Formato Orden Compra ");
		this.jButtonFK_IdFormatoOrdenCompraParametroImpor= new JButtonMe();
		this.jButtonFK_IdFormatoOrdenCompraParametroImpor.setText("Buscar");
		this.jButtonFK_IdFormatoOrdenCompraParametroImpor.setToolTipText("Buscar Por Formato Orden Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoOrdenCompraParametroImpor,"buscar_button","Buscar Por Formato Orden Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoOrdenCompraParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor = new JLabelMe();
		jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setText("Formato Orden Compra :");
		jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setToolTipText("Formato Orden Compra");
		jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoPedoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoPedoParametroImpor.setToolTipText("Buscar Por Formato Pedo ");
		this.jButtonFK_IdFormatoPedoParametroImpor= new JButtonMe();
		this.jButtonFK_IdFormatoPedoParametroImpor.setText("Buscar");
		this.jButtonFK_IdFormatoPedoParametroImpor.setToolTipText("Buscar Por Formato Pedo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoPedoParametroImpor,"buscar_button","Buscar Por Formato Pedo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoPedoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor = new JLabelMe();
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor.setText("Formato Pedo :");
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor.setToolTipText("Formato Pedo");
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroImpor= new JComboBoxMe();
		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisParametroImpor.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisParametroImpor= new JButtonMe();
		this.jButtonFK_IdPaisParametroImpor.setText("Buscar");
		this.jButtonFK_IdPaisParametroImpor.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisParametroImpor,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisParametroImpor = new JLabelMe();
		jLabelid_paisFK_IdPaisParametroImpor.setText("Pais :");
		jLabelid_paisFK_IdPaisParametroImpor.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisParametroImpor= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionIngresoParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionIngresoParametroImpor.setToolTipText("Buscar Por Transaccion Ingreso ");
		this.jButtonFK_IdTransaccionIngresoParametroImpor= new JButtonMe();
		this.jButtonFK_IdTransaccionIngresoParametroImpor.setText("Buscar");
		this.jButtonFK_IdTransaccionIngresoParametroImpor.setToolTipText("Buscar Por Transaccion Ingreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionIngresoParametroImpor,"buscar_button","Buscar Por Transaccion Ingreso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionIngresoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor = new JLabelMe();
		jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setText("Transaccion Ingreso :");
		jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setToolTipText("Transaccion Ingreso");
		jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor= new JComboBoxMe();
		jComboBoxid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionOrdenCompraParametroImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionOrdenCompraParametroImpor.setToolTipText("Buscar Por Transaccion Orden Compra ");
		this.jButtonFK_IdTransaccionOrdenCompraParametroImpor= new JButtonMe();
		this.jButtonFK_IdTransaccionOrdenCompraParametroImpor.setText("Buscar");
		this.jButtonFK_IdTransaccionOrdenCompraParametroImpor.setToolTipText("Buscar Por Transaccion Orden Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionOrdenCompraParametroImpor,"buscar_button","Buscar Por Transaccion Orden Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionOrdenCompraParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor = new JLabelMe();
		jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setText("Transaccion Orden Compra :");
		jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setToolTipText("Transaccion Orden Compra");
		jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor= new JComboBoxMe();
		jComboBoxid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroImpor = new ParametroImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Impor DATOS");
			this.jInternalFrameDetalleFormParametroImpor = new ParametroImporDetalleFormJInternalFrame(jDesktopPane,this.parametroimporSessionBean.getConGuardarRelaciones(),this.parametroimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroImpor = null;//new ParametroImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroImpor= new GridBagLayout();
		
		
		this.jTableDatosParametroImpor = new JTableMe();      
		
		String sToolTipParametroImpor="";
		sToolTipParametroImpor=ParametroImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroImpor+="(Importaciones.ParametroImpor)";
		}
		
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroImpor.setToolTipText(sToolTipParametroImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroImpor);
		this.jTableDatosParametroImpor.setAutoCreateRowSorter(true);
		this.jTableDatosParametroImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroImpor.setRowSelectionAllowed(true);
		this.jTableDatosParametroImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroImpor = new JButtonMe();
		this.jButtonDuplicarParametroImpor = new JButtonMe();
		this.jButtonCopiarParametroImpor = new JButtonMe();
		this.jButtonVerFormParametroImpor = new JButtonMe();
		this.jButtonNuevoRelacionesParametroImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroImpor = new JButtonMe();
		this.jButtonCerrarParametroImpor = new JButtonMe();
		
		this.jScrollPanelDatosParametroImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Impor";
		
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroImpor.setToolTipText("Acciones");
        this.jPanelAccionesParametroImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroImpor=new ReporteDinamicoJInternalFrame(ParametroImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroImpor=new ImportacionJInternalFrame(ParametroImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroImpor.setText("Orden");
		this.jButtonAbrirOrderByParametroImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroImpor,false,this);
			
			//this.cargarOrderByParametroImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroImpor,true,this);
			
			//this.cargarOrderByParametroImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroImpor.setMinimumSize(new Dimension(400,50));//2230
		this.jTableDatosParametroImpor.setMaximumSize(new Dimension(400,50));//2230
		this.jTableDatosParametroImpor.setPreferredSize(new Dimension(400,50));//2230
		
		this.jScrollPanelDatosParametroImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroImpor.setText("Nuevo");
		this.jButtonDuplicarParametroImpor.setText("Duplicar");
		this.jButtonCopiarParametroImpor.setText("Copiar");
		this.jButtonVerFormParametroImpor.setText("Ver");
		this.jButtonNuevoRelacionesParametroImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroImpor.setText("Guardar");
		this.jButtonCerrarParametroImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroImpor,"nuevo_button","Nuevo",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroImpor,"duplicar_button","Duplicar",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroImpor,"copiar_button","Copiar",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroImpor,"ver_form","Ver",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroImpor,"nuevorelaciones_button","Nuevo Rel",this.parametroimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroImpor,"guardarcambiostabla_button","Guardar",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroImpor,"cerrar_button","Salir",this.parametroimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroImpor.setToolTipText("Nuevo"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroImpor.setToolTipText("Duplicar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroImpor.setToolTipText("Copiar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroImpor.setToolTipText("Ver"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroImpor.setToolTipText("Nuevo Rel"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroImpor.setToolTipText("Guardar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroImpor.setToolTipText("Salir"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroImpor";
		inputMap = this.jButtonNuevoParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroImpor";
		inputMap = this.jButtonDuplicarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroImpor"));
		
		//COPIAR
		sMapKey = "CopiarParametroImpor";
		inputMap = this.jButtonCopiarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroImpor"));
		
		//VEr FORM
		sMapKey = "VerFormParametroImpor";
		inputMap = this.jButtonVerFormParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroImpor";
		inputMap = this.jButtonNuevoRelacionesParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroImpor";
		inputMap = this.jButtonModificarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroImpor";
		inputMap = this.jButtonCerrarParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroImpor";
		inputMap = this.jButtonGuardarCambiosTablaParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroImpor.setName("jPanelParametrosReportesParametroImpor"); 
		
		this.jPanelParametrosReportesAccionesParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroImpor.setName("jPanelParametrosReportesAccionesParametroImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroImpor = new JButtonMe();
		this.jButtonRecargarInformacionParametroImpor.setText("Recargar");
		this.jButtonRecargarInformacionParametroImpor.setToolTipText("Recargar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroImpor = new JButtonMe();
		this.jButtonProcesarInformacionParametroImpor.setText("Procesar");
		this.jButtonProcesarInformacionParametroImpor.setToolTipText("Procesar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroImpor.setVisible(false);
			
		this.jButtonProcesarInformacionParametroImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroImpor.setText("TIPO");       
		this.jComboBoxTiposReportesParametroImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroImpor.setText("Accion");
		this.jComboBoxTiposRelacionesParametroImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroImpor.setText("Accion");
		this.jComboBoxTiposAccionesParametroImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroImpor = new JLabelMe();
		
		this.jLabelAccionesParametroImpor.setText("Acciones");		
		this.jLabelAccionesParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroImpor = new JButtonMe();
		//this.jButtonAnterioresParametroImpor.setText("<<");
        this.jButtonAnterioresParametroImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroImpor = new JButtonMe();
		//this.jButtonSiguientesParametroImpor.setText(">>");
        this.jButtonSiguientesParametroImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroImpor,"nuevoguardarcambios_button","Nue",this.parametroimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroImpor";
		inputMap = this.jButtonNuevoGuardarCambiosParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroImpor";
		inputMap = this.jButtonRecargarInformacionParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroImpor";
		inputMap = this.jButtonSiguientesParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroImpor";
		inputMap = this.jButtonAnterioresParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroImpor.setMinimumSize(new Dimension(this.getWidth(),ParametroImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroImpor.setMaximumSize(new Dimension(this.getWidth(),ParametroImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroImpor.setPreferredSize(new Dimension(this.getWidth(),ParametroImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroImpor = new GridBagLayout();

			this.jPanelPaginacionParametroImpor.setLayout(gridaBagLayoutPaginacionParametroImpor);						
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = 0;
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroImpor.add(this.jButtonAnterioresParametroImpor, this.gridBagConstraintsParametroImpor);
					
						
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroImpor.gridy = 0;
			
			this.jPanelPaginacionParametroImpor.add(this.jButtonNuevoGuardarCambiosParametroImpor, this.gridBagConstraintsParametroImpor);
						
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroImpor.gridy = 0;
			this.jPanelPaginacionParametroImpor.add(this.jButtonSiguientesParametroImpor, this.gridBagConstraintsParametroImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = 1;
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroImpor.add(this.jButtonNuevoParametroImpor, this.gridBagConstraintsParametroImpor);
						
			
			
			if(!this.parametroimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroImpor = new GridBagConstraints();
				this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroImpor.gridy = 1;
				this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroImpor.add(this.jButtonGuardarCambiosTablaParametroImpor, this.gridBagConstraintsParametroImpor);
			}
			
			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = 1;
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroImpor.add(this.jButtonDuplicarParametroImpor, this.gridBagConstraintsParametroImpor);
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = 1;
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroImpor.add(this.jButtonCopiarParametroImpor, this.gridBagConstraintsParametroImpor);
		
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = 1;
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroImpor.add(this.jButtonVerFormParametroImpor, this.gridBagConstraintsParametroImpor);
		
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = 1;
			this.gridBagConstraintsParametroImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroImpor.add(this.jButtonCerrarParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		
		this.jButtonRecargarInformacionParametroImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroImpor.setLayout(gridaBagParametrosReportesParametroImpor);
			this.jPanelParametrosReportesAccionesParametroImpor.setLayout(gridaBagParametrosReportesAccionesParametroImpor);
			
			
			this.jPanelParametrosAuxiliar1ParametroImpor.setLayout(gridaBagParametrosAuxiliar1ParametroImpor);
			this.jPanelParametrosAuxiliar2ParametroImpor.setLayout(gridaBagParametrosAuxiliar2ParametroImpor);
			this.jPanelParametrosAuxiliar3ParametroImpor.setLayout(gridaBagParametrosAuxiliar3ParametroImpor);
			this.jPanelParametrosAuxiliar4ParametroImpor.setLayout(gridaBagParametrosAuxiliar4ParametroImpor);
			//this.jPanelParametrosAuxiliar5ParametroImpor.setLayout(gridaBagParametrosAuxiliar2ParametroImpor);			
			
			
			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroImpor.add(this.jButtonRecargarInformacionParametroImpor, this.gridBagConstraintsParametroImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroImpor.add(this.jComboBoxTiposPaginacionParametroImpor, this.gridBagConstraintsParametroImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroImpor.add(this.jCheckBoxConAltoMaximoTablaParametroImpor, this.gridBagConstraintsParametroImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroImpor.add(this.jComboBoxTiposArchivosReportesParametroImpor, this.gridBagConstraintsParametroImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroImpor.add(this.jPanelParametrosAuxiliar1ParametroImpor, this.gridBagConstraintsParametroImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroImpor.add(this.jComboBoxTiposReportesParametroImpor, this.gridBagConstraintsParametroImpor);																		
			
			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ParametroImpor.add(this.jComboBoxTiposGraficosReportesParametroImpor, this.gridBagConstraintsParametroImpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroImpor.add(this.jPanelParametrosAuxiliar4ParametroImpor, this.gridBagConstraintsParametroImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroImpor.add(this.jComboBoxTiposReportesParametroImpor, this.gridBagConstraintsParametroImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroImpor.add(this.jCheckBoxGenerarReporteParametroImpor, this.gridBagConstraintsParametroImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroImpor.add(this.jPanelParametrosAuxiliar2ParametroImpor, this.gridBagConstraintsParametroImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroImpor.add(this.jLabelAccionesParametroImpor, this.gridBagConstraintsParametroImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroImpor = new GridBagConstraints();
				this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroImpor.add(this.jButtonAbrirOrderByParametroImpor, this.gridBagConstraintsParametroImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroImpor.add(this.jComboBoxTiposSeleccionarParametroImpor, this.gridBagConstraintsParametroImpor);			
			
			
			/*
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroImpor.add(this.jCheckBoxSeleccionarTodosParametroImpor, this.gridBagConstraintsParametroImpor);
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroImpor.add(this.jCheckBoxConGraficoReporteParametroImpor, this.gridBagConstraintsParametroImpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroImpor.add(this.jCheckBoxSeleccionarTodosParametroImpor, this.gridBagConstraintsParametroImpor);															
				
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroImpor.add(this.jCheckBoxSeleccionadosParametroImpor, this.gridBagConstraintsParametroImpor);															
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroImpor.add(this.jCheckBoxConGraficoReporteParametroImpor, this.gridBagConstraintsParametroImpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroImpor.add(this.jPanelParametrosAuxiliar3ParametroImpor, this.gridBagConstraintsParametroImpor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroImpor.add(this.jComboBoxTiposAccionesParametroImpor, this.gridBagConstraintsParametroImpor);
	
				
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroImpor.add(this.jTextFieldValorCampoGeneralParametroImpor, this.gridBagConstraintsParametroImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroImpor = new GridBagLayout();

			this.jScrollPanelDatosParametroImpor.setLayout(gridaBagLayoutDatosParametroImpor);
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = 0;
			this.gridBagConstraintsParametroImpor.gridx = 0;
			
			this.jScrollPanelDatosParametroImpor.add(this.jTableDatosParametroImpor, this.gridBagConstraintsParametroImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroImpor.setViewportView(this.jTableDatosParametroImpor);
		this.jTableDatosParametroImpor.setFillsViewportHeight(true);
		this.jTableDatosParametroImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroImpor= new GridBagLayout();
		this.jPanelAccionesParametroImpor.setLayout(gridaBagLayoutAccionesParametroImpor);
		
		
		/*	
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = 0;
		this.gridBagConstraintsParametroImpor.gridx = 0;
			
		this.jPanelAccionesParametroImpor.add(this.jButtonNuevoParametroImpor, this.gridBagConstraintsParametroImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaParametroImpor.setLayout(gridaBagLayoutFK_IdBodegaParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdBodegaParametroImpor.add(jLabelid_bodegaFK_IdBodegaParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdBodegaParametroImpor.add(jComboBoxid_bodegaFK_IdBodegaParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdBodegaParametroImpor.add(jButtonFK_IdBodegaParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("1.-Por Bodega ", jPanelFK_IdBodegaParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoParametroImpor.setLayout(gridaBagLayoutFK_IdCentroCostoParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdCentroCostoParametroImpor.add(jLabelid_centro_costoFK_IdCentroCostoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdCentroCostoParametroImpor.add(jComboBoxid_centro_costoFK_IdCentroCostoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdCentroCostoParametroImpor.add(jButtonFK_IdCentroCostoParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableParametroImpor.setLayout(gridaBagLayoutFK_IdCuentaContableParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdCuentaContableParametroImpor.add(jLabelid_cuenta_contableFK_IdCuentaContableParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdCuentaContableParametroImpor.add(jComboBoxid_cuenta_contableFK_IdCuentaContableParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdCuentaContableParametroImpor.add(jButtonFK_IdCuentaContableParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("3.-Por Cuenta Contable ", jPanelFK_IdCuentaContableParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFormatoIngresoParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoIngresoParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoIngresoParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoIngresoParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoIngresoParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoIngresoParametroImpor.setLayout(gridaBagLayoutFK_IdFormatoIngresoParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdFormatoIngresoParametroImpor.add(jLabelid_formato_ingresoFK_IdFormatoIngresoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdFormatoIngresoParametroImpor.add(jComboBoxid_formato_ingresoFK_IdFormatoIngresoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdFormatoIngresoParametroImpor.add(jButtonFK_IdFormatoIngresoParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("4.-Por Formato Ingreso ", jPanelFK_IdFormatoIngresoParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFormatoLiquacionParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoLiquacionParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoLiquacionParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoLiquacionParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoLiquacionParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoLiquacionParametroImpor.setLayout(gridaBagLayoutFK_IdFormatoLiquacionParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdFormatoLiquacionParametroImpor.add(jLabelid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdFormatoLiquacionParametroImpor.add(jComboBoxid_formato_liquidacionFK_IdFormatoLiquacionParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdFormatoLiquacionParametroImpor.add(jButtonFK_IdFormatoLiquacionParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("5.-Por Formato Liquacion ", jPanelFK_IdFormatoLiquacionParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFormatoOrdenCompraParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoOrdenCompraParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoOrdenCompraParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoOrdenCompraParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoOrdenCompraParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoOrdenCompraParametroImpor.setLayout(gridaBagLayoutFK_IdFormatoOrdenCompraParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdFormatoOrdenCompraParametroImpor.add(jLabelid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdFormatoOrdenCompraParametroImpor.add(jComboBoxid_formato_orden_compraFK_IdFormatoOrdenCompraParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdFormatoOrdenCompraParametroImpor.add(jButtonFK_IdFormatoOrdenCompraParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("6.-Por Formato Orden Compra ", jPanelFK_IdFormatoOrdenCompraParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdFormatoPedoParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoPedoParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedoParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedoParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoPedoParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoPedoParametroImpor.setLayout(gridaBagLayoutFK_IdFormatoPedoParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdFormatoPedoParametroImpor.add(jLabelid_formato_pedidoFK_IdFormatoPedoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdFormatoPedoParametroImpor.add(jComboBoxid_formato_pedidoFK_IdFormatoPedoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdFormatoPedoParametroImpor.add(jButtonFK_IdFormatoPedoParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("7.-Por Formato Pedo ", jPanelFK_IdFormatoPedoParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdPaisParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdPaisParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisParametroImpor.setLayout(gridaBagLayoutFK_IdPaisParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdPaisParametroImpor.add(jLabelid_paisFK_IdPaisParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdPaisParametroImpor.add(jComboBoxid_paisFK_IdPaisParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdPaisParametroImpor.add(jButtonFK_IdPaisParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("8.-Por Pais ", jPanelFK_IdPaisParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTransaccionIngresoParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionIngresoParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionIngresoParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionIngresoParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionIngresoParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionIngresoParametroImpor.setLayout(gridaBagLayoutFK_IdTransaccionIngresoParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdTransaccionIngresoParametroImpor.add(jLabelid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdTransaccionIngresoParametroImpor.add(jComboBoxid_transaccion_ingresoFK_IdTransaccionIngresoParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdTransaccionIngresoParametroImpor.add(jButtonFK_IdTransaccionIngresoParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("9.-Por Transaccion Ingreso ", jPanelFK_IdTransaccionIngresoParametroImpor);
		jTabbedPaneBusquedasParametroImpor.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTransaccionOrdenCompraParametroImpor= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionOrdenCompraParametroImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionOrdenCompraParametroImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionOrdenCompraParametroImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionOrdenCompraParametroImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionOrdenCompraParametroImpor.setLayout(gridaBagLayoutFK_IdTransaccionOrdenCompraParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 0;
		jPanelFK_IdTransaccionOrdenCompraParametroImpor.add(jLabelid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 0;
		gridBagConstraintsParametroImpor.gridx = 1;
		jPanelFK_IdTransaccionOrdenCompraParametroImpor.add(jComboBoxid_transaccion_orden_compraFK_IdTransaccionOrdenCompraParametroImpor, gridBagConstraintsParametroImpor);

		gridBagConstraintsParametroImpor = new GridBagConstraints();
		gridBagConstraintsParametroImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroImpor.gridy = 1;
		gridBagConstraintsParametroImpor.gridx =1;
		jPanelFK_IdTransaccionOrdenCompraParametroImpor.add(jButtonFK_IdTransaccionOrdenCompraParametroImpor, gridBagConstraintsParametroImpor);

		jTabbedPaneBusquedasParametroImpor.addTab("10.-Por Transaccion Orden Compra ", jPanelFK_IdTransaccionOrdenCompraParametroImpor);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();						
			this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroImpor.gridx = 0;		
			//this.gridBagConstraintsParametroImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroImpor, this.gridBagConstraintsParametroImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroImpor.gridx = 0;		
		//this.gridBagConstraintsParametroImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroImpor.gridx = 0;		
			this.gridBagConstraintsParametroImpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroImpor, this.gridBagConstraintsParametroImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroImpor, this.gridBagConstraintsParametroImpor);								
		
		
		/*
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroImpor, this.gridBagConstraintsParametroImpor);
		*/		
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroImpor.gridx =0;
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroImpor, this.gridBagConstraintsParametroImpor);
				
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroImpor, this.gridBagConstraintsParametroImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroImpor.setLayout(gridaBagLayoutBusquedasParametrosParametroImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroImpor, this.gridBagConstraintsParametroImpor);
			
			
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroImpor, this.gridBagConstraintsParametroImpor);
		
			
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroImpor, this.gridBagConstraintsParametroImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroImpor.setName("jPanelReporteDinamicoParametroImpor"); 
		
		this.jPanelReporteDinamicoParametroImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroImpor.setLayout(gridaBagLayoutReporteDinamicoParametroImpor);
		
		
		this.jInternalFrameReporteDinamicoParametroImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Impores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelColumnasSelectReporteParametroImpor, this.gridBagConstraintsParametroImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroImpor=new JScrollPane(this.jListColumnasSelectReporteParametroImpor);
			
			this.jScrollColumnasSelectReporteParametroImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroImpor.add(this.jListColumnasSelectReporteParametroImpor, this.gridBagConstraintsParametroImpor);
		this.jPanelReporteDinamicoParametroImpor.add(this.jScrollColumnasSelectReporteParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroImpor=new JScrollPane(this.jListRelacionesSelectReporteParametroImpor);
			
			this.jScrollRelacionesSelectReporteParametroImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoParametroImpor = new JLabelMe();

		this.jLabelConGraficoDinamicoParametroImpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelConGraficoDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoParametroImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoParametroImpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoParametroImpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoParametroImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoParametroImpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroImpor.add(this.jCheckBoxConGraficoDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoParametroImpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoParametroImpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelColumnaCategoriaGraficoParametroImpor, this.gridBagConstraintsParametroImpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoParametroImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoParametroImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoParametroImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoParametroImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoParametroImpor.add(this.jComboBoxColumnaCategoriaGraficoParametroImpor, this.gridBagConstraintsParametroImpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorParametroImpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorParametroImpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelColumnaCategoriaValorParametroImpor, this.gridBagConstraintsParametroImpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorParametroImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorParametroImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorParametroImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorParametroImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorParametroImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoParametroImpor.add(this.jComboBoxColumnaCategoriaValorParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoParametroImpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoParametroImpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelColumnasValoresGraficoParametroImpor, this.gridBagConstraintsParametroImpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoParametroImpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoParametroImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoParametroImpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoParametroImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoParametroImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoParametroImpor=new JScrollPane(this.jListColumnasValoresGraficoParametroImpor);
			
			this.jScrollColumnasValoresGraficoParametroImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoParametroImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoParametroImpor.add(this.jListColumnasSelectReporteParametroImpor, this.gridBagConstraintsParametroImpor);
		this.jPanelReporteDinamicoParametroImpor.add(this.jScrollColumnasValoresGraficoParametroImpor, this.gridBagConstraintsParametroImpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoParametroImpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoParametroImpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelTiposGraficosReportesDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoParametroImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoParametroImpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoParametroImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoParametroImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoParametroImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroImpor.add(this.jComboBoxTiposGraficosReportesDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelGenerarExcelReporteDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroImpor.setToolTipText("Generar EXCEL"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		//this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroImpor.add(this.jButtonGenerarExcelReporteDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroImpor.add(this.jComboBoxTiposReportesDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroImpor.add(this.jLabelTiposArchivoReporteDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroImpor.add(this.jComboBoxTiposArchivosReportesDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroImpor.setToolTipText("Generar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroImpor.add(this.jButtonGenerarReporteDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroImpor.setToolTipText("Cancelar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroImpor.add(this.jButtonCerrarReporteDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroImpor= new JScrollPane(jPanelReporteDinamicoParametroImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Impores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroImpor);
		this.jInternalFrameReporteDinamicoParametroImpor.getContentPane().add(this.jScrollPanelReporteDinamicoParametroImpor, this.gridBagConstraintsParametroImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroImpor.setName("jPanelImportacionParametroImpor"); 
		
		this.jPanelImportacionParametroImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroImpor.setLayout(gridaBagLayoutImportacionParametroImpor);
		
		
		this.jInternalFrameImportacionParametroImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroImpor.setResizable(true);
	    this.jInternalFrameImportacionParametroImpor.setClosable(true);
	    this.jInternalFrameImportacionParametroImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroImpor.setResizable(true);
	    this.jInternalFrameImportacionParametroImpor.setClosable(true);
	    this.jInternalFrameImportacionParametroImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Impores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroImpor = new JLabelMe();

		this.jLabelArchivoImportacionParametroImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroImpor.add(this.jLabelArchivoImportacionParametroImpor, this.gridBagConstraintsParametroImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroImpor = new JFileChooser();		
		this.jFileChooserImportacionParametroImpor.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroImpor = new JButtonMe();
		this.jButtonAbrirImportacionParametroImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroImpor.setToolTipText("Generar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroImpor.add(this.jButtonAbrirImportacionParametroImpor, this.gridBagConstraintsParametroImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroImpor.add(this.jLabelPathArchivoImportacionParametroImpor, this.gridBagConstraintsParametroImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroImpor.add(this.jTextFieldPathArchivoImportacionParametroImpor, this.gridBagConstraintsParametroImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroImpor = new JButtonMe();
		this.jButtonGenerarImportacionParametroImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroImpor.setToolTipText("Generar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroImpor.add(this.jButtonGenerarImportacionParametroImpor, this.gridBagConstraintsParametroImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroImpor = new JButtonMe();
		this.jButtonCerrarImportacionParametroImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroImpor.setToolTipText("Cancelar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroImpor.add(this.jButtonCerrarImportacionParametroImpor, this.gridBagConstraintsParametroImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroImpor= new JScrollPane(jPanelImportacionParametroImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroImpor = new GridBagConstraints();
		this.gridBagConstraintsParametroImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroImpor);
		this.jInternalFrameImportacionParametroImpor.getContentPane().add(this.jScrollPanelImportacionParametroImpor, this.gridBagConstraintsParametroImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroImpor = new JButtonMe();
			this.jButtonAbrirOrderByParametroImpor.setText("Orden");
			this.jButtonAbrirOrderByParametroImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroImpor";
			inputMap = this.jButtonAbrirOrderByParametroImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroImpor.setName("jPanelOrderByParametroImpor"); 
			
			this.jPanelOrderByParametroImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroImpor.setLayout(gridaBagLayoutOrderByParametroImpor);
			
			
			this.jTableDatosParametroImporOrderBy = new JTableMe();        
			this.jTableDatosParametroImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroImporOrderBy.setViewportView(this.jTableDatosParametroImporOrderBy);
			this.jTableDatosParametroImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroImpor.setTitle("Orden");
			this.jInternalFrameOrderByParametroImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroImpor.setResizable(true);
			this.jInternalFrameOrderByParametroImpor.setClosable(true);
			this.jInternalFrameOrderByParametroImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Impores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroImpor.ipady =150;
				
			this.jPanelOrderByParametroImpor.add(jScrollPanelDatosParametroImporOrderBy, this.gridBagConstraintsParametroImpor);//this.jTableDatosParametroImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroImpor = new JButtonMe();
			this.jButtonCerrarOrderByParametroImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroImpor.setToolTipText("Cancelar"+" "+ParametroImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroImpor.add(this.jButtonCerrarOrderByParametroImpor, this.gridBagConstraintsParametroImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroImpor= new JScrollPane(jPanelOrderByParametroImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroImpor = new GridBagConstraints();
			this.gridBagConstraintsParametroImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroImpor);
			
			this.jInternalFrameOrderByParametroImpor.getContentPane().add(this.jScrollPanelOrderByParametroImpor, this.gridBagConstraintsParametroImpor);			
		
		} else {
			this.jButtonAbrirOrderByParametroImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//4430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametroimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroImpor.getRowHeight();//ParametroImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroImpor.isSelected()) {
					iHeightTable=ParametroImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroImpor.isSelected()) {
					iHeightTable=ParametroImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroImpor!=null && this.jInternalFrameOrderByParametroImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroimporLogic.getParametroImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroImpor> TraerParametroImporBeans(List<ParametroImpor> parametroimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroImpor parametroimpor:parametroimpors) {
					
				if(!(ParametroImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroimpor.setsDetalleGeneralEntityReporte(ParametroImporConstantesFunciones.getParametroImporDescripcion(parametroimpor));
										
					parametroimpor.setcon_secuencial_descripcion(ParametroImporConstantesFunciones.getcon_secuencialDescripcion(parametroimpor));parametroimpor.setcon_peso_precio_descripcion(ParametroImporConstantesFunciones.getcon_peso_precioDescripcion(parametroimpor));parametroimpor.setcon_lote_descripcion(ParametroImporConstantesFunciones.getcon_loteDescripcion(parametroimpor));parametroimpor.setcon_unidad_descripcion(ParametroImporConstantesFunciones.getcon_unidadDescripcion(parametroimpor));parametroimpor.setcon_conversion_descripcion(ParametroImporConstantesFunciones.getcon_conversionDescripcion(parametroimpor));	
					
						
					
				} else  {
							
					//parametroimpor.setsDetalleGeneralEntityReporte(parametroimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroimporbeans.add(parametroimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroimpors;
    }
	//PARA REPORTES FIN
}
