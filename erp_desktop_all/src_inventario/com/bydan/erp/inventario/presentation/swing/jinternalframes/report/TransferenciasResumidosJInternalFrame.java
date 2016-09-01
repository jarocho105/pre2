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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.TransferenciasResumidosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class TransferenciasResumidosJInternalFrame extends TransferenciasResumidosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransferenciasResumidos;
	
	protected JMenuBar jmenuBarTransferenciasResumidos;
	
	protected JMenu jmenuTransferenciasResumidos;
	protected JMenu jmenuDatosTransferenciasResumidos;
	protected JMenu jmenuArchivoTransferenciasResumidos;
	protected JMenu jmenuAccionesTransferenciasResumidos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransferenciasResumidos;	
	protected GridBagConstraints gridBagConstraintsTransferenciasResumidos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransferenciasResumidosDetalleFormJInternalFrame jInternalFrameDetalleFormTransferenciasResumidos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransferenciasResumidos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransferenciasResumidos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public TransferenciasResumidosSessionBean transferenciasresumidosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TransferenciasResumidos> transferenciasresumidoss;		
	public List<TransferenciasResumidos> transferenciasresumidossEliminados;	
	public List<TransferenciasResumidos> transferenciasresumidossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransferenciasResumidos;		
	protected JButton jButtonAbrirOrderByTransferenciasResumidos;
	
	
	//protected JPanel jPanelOrderByTransferenciasResumidos;
	//public JScrollPane jScrollPanelOrderByTransferenciasResumidos;	
	//protected JButton jButtonCerrarOrderByTransferenciasResumidos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransferenciasResumidosLogic transferenciasresumidosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransferenciasResumidos;
	public JScrollPane jScrollPanelDatosEdicionTransferenciasResumidos;
	public JScrollPane jScrollPanelDatosGeneralTransferenciasResumidos;
    
	
	
	//public JScrollPane jScrollPanelDatosTransferenciasResumidosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransferenciasResumidos;
	//public JScrollPane jScrollPanelImportacionTransferenciasResumidos;
	
	
	
	protected JPanel jPanelAccionesTransferenciasResumidos;
	
    protected JPanel jPanelPaginacionTransferenciasResumidos;
    protected JPanel jPanelParametrosReportesTransferenciasResumidos;
	protected JPanel jPanelParametrosReportesAccionesTransferenciasResumidos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TransferenciasResumidos;
	protected JPanel jPanelParametrosAuxiliar2TransferenciasResumidos;
	protected JPanel jPanelParametrosAuxiliar3TransferenciasResumidos;
	protected JPanel jPanelParametrosAuxiliar4TransferenciasResumidos;
	//protected JPanel jPanelParametrosAuxiliar5TransferenciasResumidos;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransferenciasResumidos;
	//protected JPanel jPanelImportacionTransferenciasResumidos;
	
	
	public JTable jTableDatosTransferenciasResumidos;
	
	
	
	//public JTable jTableDatosTransferenciasResumidosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransferenciasResumidos;
	protected JButton jButtonDuplicarTransferenciasResumidos;
	protected JButton jButtonCopiarTransferenciasResumidos;
	protected JButton jButtonVerFormTransferenciasResumidos;
	protected JButton jButtonNuevoRelacionesTransferenciasResumidos;
	protected JButton jButtonModificarTransferenciasResumidos;
	
    protected JButton jButtonGuardarCambiosTablaTransferenciasResumidos;
	protected JButton jButtonCerrarTransferenciasResumidos;
	
	
	protected JButton jButtonRecargarInformacionTransferenciasResumidos;
	protected JButton jButtonProcesarInformacionTransferenciasResumidos;
	
	
	protected JButton jButtonAnterioresTransferenciasResumidos;
	protected JButton jButtonSiguientesTransferenciasResumidos;
	protected JButton jButtonNuevoGuardarCambiosTransferenciasResumidos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransferenciasResumidos;
	//protected JButton jButtonCerrarReporteDinamicoTransferenciasResumidos;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransferenciasResumidos;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransferenciasResumidos;
	//protected JButton jButtonGenerarImportacionTransferenciasResumidos;
	//protected JButton jButtonCerrarImportacionTransferenciasResumidos;
	//protected JFileChooser jFileChooserImportacionTransferenciasResumidos;
	//protected File fileImportacionTransferenciasResumidos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransferenciasResumidos;
	protected JButton jButtonDuplicarToolBarTransferenciasResumidos;
	protected JButton jButtonNuevoRelacionesToolBarTransferenciasResumidos;
	
	
	public JButton jButtonGuardarCambiosToolBarTransferenciasResumidos;
	protected JButton jButtonCopiarToolBarTransferenciasResumidos;
	protected JButton jButtonVerFormToolBarTransferenciasResumidos;
	public JButton jButtonGuardarCambiosTablaToolBarTransferenciasResumidos;
	protected JButton jButtonMostrarOcultarTablaToolBarTransferenciasResumidos;
	protected JButton jButtonCerrarToolBarTransferenciasResumidos;
	
	protected JButton jButtonRecargarInformacionToolBarTransferenciasResumidos;
	protected JButton jButtonProcesarInformacionToolBarTransferenciasResumidos;
	protected JButton jButtonAnterioresToolBarTransferenciasResumidos;
	protected JButton jButtonSiguientesToolBarTransferenciasResumidos;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransferenciasResumidos;
	protected JButton jButtonAbrirOrderByToolBarTransferenciasResumidos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransferenciasResumidos;
	protected JMenuItem jMenuItemDuplicarTransferenciasResumidos;
	protected JMenuItem jMenuItemNuevoRelacionesTransferenciasResumidos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransferenciasResumidos;
	protected JMenuItem jMenuItemCopiarTransferenciasResumidos;
	protected JMenuItem jMenuItemVerFormTransferenciasResumidos;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransferenciasResumidos;
	protected JMenuItem jMenuItemCerrarTransferenciasResumidos;
	protected JMenuItem jMenuItemDetalleCerrarTransferenciasResumidos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransferenciasResumidos;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransferenciasResumidos;
	
	protected JMenuItem jMenuItemRecargarInformacionTransferenciasResumidos;
	protected JMenuItem jMenuItemProcesarInformacionTransferenciasResumidos;
	protected JMenuItem jMenuItemAnterioresTransferenciasResumidos;
	protected JMenuItem jMenuItemSiguientesTransferenciasResumidos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransferenciasResumidos;
	protected JMenuItem jMenuItemAbrirOrderByTransferenciasResumidos;
	protected JMenuItem jMenuItemMostrarOcultarTransferenciasResumidos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransferenciasResumidos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransferenciasResumidos;
	protected JCheckBox jCheckBoxSeleccionadosTransferenciasResumidos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransferenciasResumidos;
	protected JCheckBox jCheckBoxConGraficoReporteTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransferenciasResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransferenciasResumidos;
	protected JTextField jTextFieldValorCampoGeneralTransferenciasResumidos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransferenciasResumidos;
	//public JList<Reporte> jListColumnasSelectReporteTransferenciasResumidos;
	//public JScrollPane jScrollColumnasSelectReporteTransferenciasResumidos;
	
	//public JLabel jLabelRelacionesSelectReporteTransferenciasResumidos;
	//public JList<Reporte> jListRelacionesSelectReporteTransferenciasResumidos;
	//public JScrollPane jScrollRelacionesSelectReporteTransferenciasResumidos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransferenciasResumidos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransferenciasResumidos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransferenciasResumidos;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransferenciasResumidos;
	
		
	//public JLabel jLabelArchivoImportacionTransferenciasResumidos;	
	//public JLabel jLabelPathArchivoImportacionTransferenciasResumidos;
	//protected JTextField jTextFieldPathArchivoImportacionTransferenciasResumidos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransferenciasResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransferenciasResumidos;
	
	//public JLabel jLabelColumnaCategoriaValorTransferenciasResumidos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransferenciasResumidos;
	
	//public JLabel jLabelColumnasValoresGraficoTransferenciasResumidos;
	//public JList<Reporte> jListColumnasValoresGraficoTransferenciasResumidos;
	//public JScrollPane jScrollColumnasValoresGraficoTransferenciasResumidos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransferenciasResumidos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransferenciasResumidos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransferenciasResumidos;
	public JPanel jPanelBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonBusquedaTransferenciasResumidosTransferenciasResumidos;
	
	public JPanel jPanelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonid_productoBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_productoBusquedaTransferenciasResumidosTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaTransferenciasResumidosTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JLabel jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos;
	public JButton jButtonfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public TransferenciasResumidosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasResumidosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasResumidosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciasResumidosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransferenciasResumidos)	{
		this.jButtonRecargarInformacionTransferenciasResumidos = jButtonRecargarInformacionTransferenciasResumidos;
	}
	
	public JButton getjButtonProcesarInformacionTransferenciasResumidos() {
		return this.jButtonProcesarInformacionTransferenciasResumidos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransferenciasResumidos)	{
		this.jButtonProcesarInformacionTransferenciasResumidos = jButtonProcesarInformacionTransferenciasResumidos;
	}
	
	
	public JButton getjButtonRecargarInformacionTransferenciasResumidos() {
		return this.jButtonRecargarInformacionTransferenciasResumidos;
	}
	
	
	public List<TransferenciasResumidos> gettransferenciasresumidoss() {
		return this.transferenciasresumidoss;
	}

	public void settransferenciasresumidoss(List<TransferenciasResumidos> transferenciasresumidoss) {
		this.transferenciasresumidoss = transferenciasresumidoss;
	}
	
	public List<TransferenciasResumidos> gettransferenciasresumidossAux() {
		return this.transferenciasresumidossAux;
	}

	public void settransferenciasresumidossAux(List<TransferenciasResumidos> transferenciasresumidossAux) {
		this.transferenciasresumidossAux = transferenciasresumidossAux;
	}
	
	public List<TransferenciasResumidos> gettransferenciasresumidossEliminados() {
		return this.transferenciasresumidossEliminados;
	}

	public void setTransferenciasResumidossEliminados(List<TransferenciasResumidos> transferenciasresumidossEliminados) {
		this.transferenciasresumidossEliminados = transferenciasresumidossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransferenciasResumidos() {
		return jComboBoxTiposSeleccionarTransferenciasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransferenciasResumidos(
			JComboBox jComboBoxTiposSeleccionarTransferenciasResumidos) {
		this.jComboBoxTiposSeleccionarTransferenciasResumidos = jComboBoxTiposSeleccionarTransferenciasResumidos;
	}
	
	public void setBorderResaltarTiposSeleccionarTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransferenciasResumidos() {
		return jTextFieldValorCampoGeneralTransferenciasResumidos;
	}

	public void setjTextFieldValorCampoGeneralTransferenciasResumidos(
			JTextField jTextFieldValorCampoGeneralTransferenciasResumidos) {
		this.jTextFieldValorCampoGeneralTransferenciasResumidos = jTextFieldValorCampoGeneralTransferenciasResumidos;
	}

	public void setBorderResaltarValorCampoGeneralTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransferenciasResumidos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransferenciasResumidos() {
		return this.jCheckBoxSeleccionarTodosTransferenciasResumidos;
	}

	public void setjCheckBoxSeleccionarTodosTransferenciasResumidos(
			JCheckBox jCheckBoxSeleccionarTodosTransferenciasResumidos) {
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos = jCheckBoxSeleccionarTodosTransferenciasResumidos;
	}

	public void setBorderResaltarSeleccionarTodosTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransferenciasResumidos() {
		return this.jCheckBoxSeleccionadosTransferenciasResumidos;
	}

	public void setjCheckBoxSeleccionadosTransferenciasResumidos(
			JCheckBox jCheckBoxSeleccionadosTransferenciasResumidos) {
		this.jCheckBoxSeleccionadosTransferenciasResumidos = jCheckBoxSeleccionadosTransferenciasResumidos;
	}
	
	public void setBorderResaltarSeleccionadosTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransferenciasResumidos() {
		return this.jComboBoxTiposArchivosReportesTransferenciasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransferenciasResumidos(
			JComboBox jComboBoxTiposArchivosReportesTransferenciasResumidos) {
		this.jComboBoxTiposArchivosReportesTransferenciasResumidos = jComboBoxTiposArchivosReportesTransferenciasResumidos;
	}

	public void setBorderResaltarTiposArchivosReportesTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransferenciasResumidos() {
		return this.jComboBoxTiposReportesTransferenciasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransferenciasResumidos(
			JComboBox jComboBoxTiposReportesTransferenciasResumidos) {
		this.jComboBoxTiposReportesTransferenciasResumidos = jComboBoxTiposReportesTransferenciasResumidos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransferenciasResumidos() {
	//	return jComboBoxTiposReportesDinamicoTransferenciasResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransferenciasResumidos(
	//		JComboBox jComboBoxTiposReportesDinamicoTransferenciasResumidos) {
	//	this.jComboBoxTiposReportesDinamicoTransferenciasResumidos = jComboBoxTiposReportesDinamicoTransferenciasResumidos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos = jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos;
	//}
	
	public void setBorderResaltarTiposReportesTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransferenciasResumidos() {
		return this.jComboBoxTiposGraficosReportesTransferenciasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransferenciasResumidos(
			JComboBox jComboBoxTiposGraficosReportesTransferenciasResumidos) {
		this.jComboBoxTiposGraficosReportesTransferenciasResumidos = jComboBoxTiposGraficosReportesTransferenciasResumidos;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransferenciasResumidos() {
		return this.jComboBoxTiposPaginacionTransferenciasResumidos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransferenciasResumidos(
			JComboBox jComboBoxTiposPaginacionTransferenciasResumidos) {
		this.jComboBoxTiposPaginacionTransferenciasResumidos = jComboBoxTiposPaginacionTransferenciasResumidos;
	}
	
	public void setBorderResaltarTiposPaginacionTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransferenciasResumidos() {
		return this.jComboBoxTiposRelacionesTransferenciasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransferenciasResumidos() {
		return this.jComboBoxTiposAccionesTransferenciasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransferenciasResumidos(
			JComboBox jComboBoxTiposRelacionesTransferenciasResumidos) {
		this.jComboBoxTiposRelacionesTransferenciasResumidos = jComboBoxTiposRelacionesTransferenciasResumidos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransferenciasResumidos(
			JComboBox jComboBoxTiposAccionesTransferenciasResumidos) {
		this.jComboBoxTiposAccionesTransferenciasResumidos = jComboBoxTiposAccionesTransferenciasResumidos;
	}
	
	public void setBorderResaltarTiposRelacionesTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransferenciasResumidos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransferenciasResumidos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransferenciasResumidos() {
	//	return jCheckBoxConGraficoDinamicoTransferenciasResumidos;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransferenciasResumidos(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransferenciasResumidos) {
	//	this.jCheckBoxConGraficoDinamicoTransferenciasResumidos = jCheckBoxConGraficoDinamicoTransferenciasResumidos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransferenciasResumidos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransferenciasResumidos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransferenciasResumidos .setBorder(borderResaltar);		
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
		this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
		
		this.transferenciasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transferenciasresumidosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransferenciasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransferenciasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransferenciasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransferenciasResumidosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransferenciasResumidosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencias Resumidos MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
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
		
		TransferenciasResumidosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TransferenciasResumidos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransferenciasResumidos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"nuevo","nuevo","Nuevo"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"duplicar","duplicar","Duplicar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"copiar","copiar","Copiar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"ver_form","ver_form","Ver"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"recargar","recargar","Buscar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransferenciasResumidos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,
							"cerrar","cerrar","Salir"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransferenciasResumidos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransferenciasResumidos;
			
				this.jButtonProcesarInformacionToolBarTransferenciasResumidos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransferenciasResumidos;
				
		//protected JButton jButtonModificarToolBarTransferenciasResumidos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransferenciasResumidos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransferenciasResumidos=new JMenuMe("General");
		this.jmenuArchivoTransferenciasResumidos=new JMenuMe("Archivo");
		this.jmenuAccionesTransferenciasResumidos=new JMenuMe("Acciones");
		this.jmenuDatosTransferenciasResumidos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransferenciasResumidos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransferenciasResumidos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransferenciasResumidos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransferenciasResumidos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransferenciasResumidos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransferenciasResumidos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransferenciasResumidos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransferenciasResumidos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransferenciasResumidos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransferenciasResumidos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransferenciasResumidos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransferenciasResumidos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransferenciasResumidos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransferenciasResumidos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransferenciasResumidos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransferenciasResumidos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransferenciasResumidos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransferenciasResumidos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransferenciasResumidos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransferenciasResumidos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransferenciasResumidos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransferenciasResumidos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransferenciasResumidos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransferenciasResumidos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransferenciasResumidos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransferenciasResumidos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransferenciasResumidos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransferenciasResumidos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransferenciasResumidos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransferenciasResumidos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransferenciasResumidos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransferenciasResumidos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransferenciasResumidos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransferenciasResumidos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransferenciasResumidos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransferenciasResumidos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransferenciasResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransferenciasResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransferenciasResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransferenciasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransferenciasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransferenciasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransferenciasResumidos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransferenciasResumidos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransferenciasResumidos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransferenciasResumidos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransferenciasResumidos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransferenciasResumidos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransferenciasResumidos.add(this.jMenuItemCerrarTransferenciasResumidos);
			
			this.jmenuAccionesTransferenciasResumidos.add(this.jMenuItemNuevoTransferenciasResumidos);
			this.jmenuAccionesTransferenciasResumidos.add(this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos);
			this.jmenuAccionesTransferenciasResumidos.add(this.jMenuItemNuevoRelacionesTransferenciasResumidos);
			this.jmenuAccionesTransferenciasResumidos.add(this.jMenuItemGuardarCambiosTablaTransferenciasResumidos);		
			this.jmenuAccionesTransferenciasResumidos.add(this.jMenuItemDuplicarTransferenciasResumidos);		
			this.jmenuAccionesTransferenciasResumidos.add(this.jMenuItemCopiarTransferenciasResumidos);		
			this.jmenuAccionesTransferenciasResumidos.add(this.jMenuItemVerFormTransferenciasResumidos);		
			
			this.jmenuDatosTransferenciasResumidos.add(this.jMenuItemRecargarInformacionTransferenciasResumidos);				
			this.jmenuDatosTransferenciasResumidos.add(this.jMenuItemAnterioresTransferenciasResumidos);				
			this.jmenuDatosTransferenciasResumidos.add(this.jMenuItemSiguientesTransferenciasResumidos);				
			this.jmenuDatosTransferenciasResumidos.add(this.jMenuItemAbrirOrderByTransferenciasResumidos);				
			this.jmenuDatosTransferenciasResumidos.add(this.jMenuItemMostrarOcultarTransferenciasResumidos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransferenciasResumidos.add(this.jMenuItemGuardarCambiosTransferenciasResumidos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransferenciasResumidos.add(this.jmenuArchivoTransferenciasResumidos);		
			this.jmenuBarTransferenciasResumidos.add(this.jmenuAccionesTransferenciasResumidos);		
			this.jmenuBarTransferenciasResumidos.add(this.jmenuDatosTransferenciasResumidos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransferenciasResumidos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransferenciasResumidos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaTransferenciasResumidosTransferenciasResumidos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Buscar Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidos= new JButtonMe();
		this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Buscar");
		this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Buscar Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidos,"buscar_button","Buscar Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Bodega :");
		jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Producto :");
		jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Producto");
		jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Transaccion :");
		jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Linea :");
		jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Linea");
		jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasTransferenciasResumidos=new JTabbedPane();


		this.jTabbedPaneBusquedasTransferenciasResumidos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));
		this.jTabbedPaneBusquedasTransferenciasResumidos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));
		this.jTabbedPaneBusquedasTransferenciasResumidos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,200)));

		//this.jTabbedPaneBusquedasTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransferenciasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransferenciasResumidos = new TransferenciasResumidosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transferencias Resumidos DATOS");
			this.jInternalFrameDetalleFormTransferenciasResumidos = new TransferenciasResumidosDetalleFormJInternalFrame(jDesktopPane,this.transferenciasresumidosSessionBean.getConGuardarRelaciones(),this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransferenciasResumidos = null;//new TransferenciasResumidosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransferenciasResumidos= new GridBagLayout();
		
		
		this.jTableDatosTransferenciasResumidos = new JTableMe();      
		
		String sToolTipTransferenciasResumidos="";
		sToolTipTransferenciasResumidos=TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransferenciasResumidos+="(Inventario.TransferenciasResumidos)";
		}
		
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransferenciasResumidos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransferenciasResumidos.setToolTipText(sToolTipTransferenciasResumidos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransferenciasResumidos);
		this.jTableDatosTransferenciasResumidos.setAutoCreateRowSorter(true);
		this.jTableDatosTransferenciasResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransferenciasResumidos.setRowSelectionAllowed(true);
		this.jTableDatosTransferenciasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransferenciasResumidos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransferenciasResumidos = new JButtonMe();
		this.jButtonDuplicarTransferenciasResumidos = new JButtonMe();
		this.jButtonCopiarTransferenciasResumidos = new JButtonMe();
		this.jButtonVerFormTransferenciasResumidos = new JButtonMe();
		this.jButtonNuevoRelacionesTransferenciasResumidos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos = new JButtonMe();
		this.jButtonCerrarTransferenciasResumidos = new JButtonMe();
		
		this.jScrollPanelDatosTransferenciasResumidos = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransferenciasResumidos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transferencias Resumidos";
		
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias Resumidoses" + this.sPath));
		} else {
			this.jScrollPanelDatosTransferenciasResumidos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransferenciasResumidos.setToolTipText("Acciones");
        this.jPanelAccionesTransferenciasResumidos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransferenciasResumidos=new ReporteDinamicoJInternalFrame(TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransferenciasResumidos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransferenciasResumidos=new ImportacionJInternalFrame(TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransferenciasResumidos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransferenciasResumidos = new JButtonMe();
		
		this.jButtonAbrirOrderByTransferenciasResumidos.setText("Orden");
		this.jButtonAbrirOrderByTransferenciasResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransferenciasResumidos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransferenciasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferenciasResumidos,false,this);
			
			//this.cargarOrderByTransferenciasResumidos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransferenciasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferenciasResumidos,true,this);
			
			//this.cargarOrderByTransferenciasResumidos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransferenciasResumidos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosTransferenciasResumidos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosTransferenciasResumidos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosTransferenciasResumidos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransferenciasResumidos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransferenciasResumidos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransferenciasResumidos.setText("Nuevo");
		this.jButtonDuplicarTransferenciasResumidos.setText("Duplicar");
		this.jButtonCopiarTransferenciasResumidos.setText("Copiar");
		this.jButtonVerFormTransferenciasResumidos.setText("Ver");
		this.jButtonNuevoRelacionesTransferenciasResumidos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.setText("Guardar");
		this.jButtonCerrarTransferenciasResumidos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransferenciasResumidos,"nuevo_button","Nuevo",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransferenciasResumidos,"duplicar_button","Duplicar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransferenciasResumidos,"copiar_button","Copiar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransferenciasResumidos,"ver_form","Ver",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransferenciasResumidos,"nuevorelaciones_button","Nuevo Rel",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransferenciasResumidos,"guardarcambiostabla_button","Guardar",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransferenciasResumidos,"cerrar_button","Salir",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransferenciasResumidos.setToolTipText("Nuevo"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransferenciasResumidos.setToolTipText("Duplicar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransferenciasResumidos.setToolTipText("Copiar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransferenciasResumidos.setToolTipText("Ver"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransferenciasResumidos.setToolTipText("Nuevo Rel"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.setToolTipText("Guardar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransferenciasResumidos.setToolTipText("Salir"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransferenciasResumidos";
		inputMap = this.jButtonNuevoTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransferenciasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransferenciasResumidos"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransferenciasResumidos";
		inputMap = this.jButtonDuplicarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransferenciasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransferenciasResumidos"));
		
		//COPIAR
		sMapKey = "CopiarTransferenciasResumidos";
		inputMap = this.jButtonCopiarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransferenciasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransferenciasResumidos"));
		
		//VEr FORM
		sMapKey = "VerFormTransferenciasResumidos";
		inputMap = this.jButtonVerFormTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransferenciasResumidos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransferenciasResumidos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransferenciasResumidos";
		inputMap = this.jButtonNuevoRelacionesTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransferenciasResumidos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransferenciasResumidos";
		inputMap = this.jButtonModificarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransferenciasResumidos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransferenciasResumidos";
		inputMap = this.jButtonCerrarTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransferenciasResumidos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransferenciasResumidos";
		inputMap = this.jButtonGuardarCambiosTablaTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransferenciasResumidos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TransferenciasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TransferenciasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TransferenciasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TransferenciasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TransferenciasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransferenciasResumidos.setName("jPanelParametrosReportesTransferenciasResumidos"); 
		
		this.jPanelParametrosReportesAccionesTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransferenciasResumidos.setName("jPanelParametrosReportesAccionesTransferenciasResumidos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransferenciasResumidos = new JButtonMe();
		this.jButtonRecargarInformacionTransferenciasResumidos.setText("Buscar");
		this.jButtonRecargarInformacionTransferenciasResumidos.setToolTipText("Buscar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransferenciasResumidos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionTransferenciasResumidos.setVisible(false);
		
		
		this.jButtonProcesarInformacionTransferenciasResumidos = new JButtonMe();
		this.jButtonProcesarInformacionTransferenciasResumidos.setText("Procesar");
		this.jButtonProcesarInformacionTransferenciasResumidos.setToolTipText("Procesar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransferenciasResumidos.setVisible(false);
			
		this.jButtonProcesarInformacionTransferenciasResumidos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransferenciasResumidos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransferenciasResumidos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferenciasResumidos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransferenciasResumidos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferenciasResumidos.setText("TIPO");       
		this.jComboBoxTiposReportesTransferenciasResumidos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransferenciasResumidos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransferenciasResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransferenciasResumidos.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransferenciasResumidos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransferenciasResumidos.setText("Accion");
		this.jComboBoxTiposRelacionesTransferenciasResumidos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransferenciasResumidos.setText("Accion");
		this.jComboBoxTiposAccionesTransferenciasResumidos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransferenciasResumidos.setText("Accion");
		this.jComboBoxTiposSeleccionarTransferenciasResumidos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransferenciasResumidos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransferenciasResumidos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransferenciasResumidos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransferenciasResumidos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransferenciasResumidos = new JLabelMe();
		
		this.jLabelAccionesTransferenciasResumidos.setText("Acciones");		
		this.jLabelAccionesTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransferenciasResumidos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransferenciasResumidos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransferenciasResumidos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransferenciasResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransferenciasResumidos.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransferenciasResumidos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransferenciasResumidos = new JButtonMe();
		//this.jButtonAnterioresTransferenciasResumidos.setText("<<");
        this.jButtonAnterioresTransferenciasResumidos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransferenciasResumidos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransferenciasResumidos = new JButtonMe();
		//this.jButtonSiguientesTransferenciasResumidos.setText(">>");
        this.jButtonSiguientesTransferenciasResumidos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransferenciasResumidos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransferenciasResumidos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransferenciasResumidos.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransferenciasResumidos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransferenciasResumidos,"nuevoguardarcambios_button","Nue",this.transferenciasresumidosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransferenciasResumidos";
		inputMap = this.jButtonNuevoGuardarCambiosTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransferenciasResumidos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransferenciasResumidos";
		inputMap = this.jButtonRecargarInformacionTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransferenciasResumidos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransferenciasResumidos";
		inputMap = this.jButtonSiguientesTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransferenciasResumidos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransferenciasResumidos";
		inputMap = this.jButtonAnterioresTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransferenciasResumidos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransferenciasResumidos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransferenciasResumidos.setMinimumSize(new Dimension(this.getWidth(),TransferenciasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransferenciasResumidos.setMaximumSize(new Dimension(this.getWidth(),TransferenciasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransferenciasResumidos.setPreferredSize(new Dimension(this.getWidth(),TransferenciasResumidosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransferenciasResumidosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransferenciasResumidos = new GridBagLayout();

			this.jPanelPaginacionTransferenciasResumidos.setLayout(gridaBagLayoutPaginacionTransferenciasResumidos);						
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonAnterioresTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
					
						
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
			
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonNuevoGuardarCambiosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
						
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonSiguientesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 1;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonNuevoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
						
			
			
			if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
				this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransferenciasResumidos.gridy = 1;
				this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonGuardarCambiosTablaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			}
			
			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 1;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonDuplicarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 1;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonCopiarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 1;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonVerFormTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 1;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransferenciasResumidos.add(this.jButtonCerrarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		
		this.jButtonRecargarInformacionTransferenciasResumidos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransferenciasResumidos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransferenciasResumidos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransferenciasResumidos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransferenciasResumidos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransferenciasResumidos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransferenciasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransferenciasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransferenciasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransferenciasResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransferenciasResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransferenciasResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransferenciasResumidos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransferenciasResumidos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransferenciasResumidos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransferenciasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferenciasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransferenciasResumidos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransferenciasResumidos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransferenciasResumidos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransferenciasResumidos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransferenciasResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransferenciasResumidos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransferenciasResumidos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransferenciasResumidos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransferenciasResumidos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransferenciasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransferenciasResumidos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TransferenciasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TransferenciasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TransferenciasResumidos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TransferenciasResumidos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransferenciasResumidos.setLayout(gridaBagParametrosReportesTransferenciasResumidos);
			this.jPanelParametrosReportesAccionesTransferenciasResumidos.setLayout(gridaBagParametrosReportesAccionesTransferenciasResumidos);
			
			
			this.jPanelParametrosAuxiliar1TransferenciasResumidos.setLayout(gridaBagParametrosAuxiliar1TransferenciasResumidos);
			this.jPanelParametrosAuxiliar2TransferenciasResumidos.setLayout(gridaBagParametrosAuxiliar2TransferenciasResumidos);
			this.jPanelParametrosAuxiliar3TransferenciasResumidos.setLayout(gridaBagParametrosAuxiliar3TransferenciasResumidos);
			this.jPanelParametrosAuxiliar4TransferenciasResumidos.setLayout(gridaBagParametrosAuxiliar4TransferenciasResumidos);
			//this.jPanelParametrosAuxiliar5TransferenciasResumidos.setLayout(gridaBagParametrosAuxiliar2TransferenciasResumidos);			
			
			
			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jButtonRecargarInformacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransferenciasResumidos.add(this.jComboBoxTiposPaginacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransferenciasResumidos.add(this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransferenciasResumidos.add(this.jComboBoxTiposArchivosReportesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jPanelParametrosAuxiliar1TransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TransferenciasResumidos.add(this.jComboBoxTiposReportesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);																		
			
			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TransferenciasResumidos.add(this.jComboBoxTiposGraficosReportesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jPanelParametrosAuxiliar4TransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jComboBoxTiposReportesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jCheckBoxGenerarReporteTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jPanelParametrosAuxiliar2TransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jLabelAccionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
				this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransferenciasResumidos.add(this.jButtonAbrirOrderByTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jComboBoxTiposSeleccionarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
			
			
			/*
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jCheckBoxSeleccionarTodosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jCheckBoxConGraficoReporteTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransferenciasResumidos.add(this.jCheckBoxSeleccionarTodosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);															
				
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransferenciasResumidos.add(this.jCheckBoxSeleccionadosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);															
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransferenciasResumidos.add(this.jCheckBoxConGraficoReporteTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jPanelParametrosAuxiliar3TransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransferenciasResumidos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransferenciasResumidos.add(this.jComboBoxTiposAccionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransferenciasResumidos = new GridBagLayout();

			this.jScrollPanelDatosTransferenciasResumidos.setLayout(gridaBagLayoutDatosTransferenciasResumidos);
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
			this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
			
			this.jScrollPanelDatosTransferenciasResumidos.add(this.jTableDatosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransferenciasResumidos.setViewportView(this.jTableDatosTransferenciasResumidos);
		this.jTableDatosTransferenciasResumidos.setFillsViewportHeight(true);
		this.jTableDatosTransferenciasResumidos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransferenciasResumidos= new GridBagLayout();
		this.jPanelAccionesTransferenciasResumidos.setLayout(gridaBagLayoutAccionesTransferenciasResumidos);
		
		
		/*	
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = 0;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
			
		this.jPanelAccionesTransferenciasResumidos.add(this.jButtonNuevoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaTransferenciasResumidosTransferenciasResumidos= new GridBagLayout();
		gridaBagLayoutBusquedaTransferenciasResumidosTransferenciasResumidos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaTransferenciasResumidosTransferenciasResumidos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaTransferenciasResumidosTransferenciasResumidos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaTransferenciasResumidosTransferenciasResumidos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.setLayout(gridaBagLayoutBusquedaTransferenciasResumidosTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 0;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 0;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 1;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelid_productoBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 1;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 2;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 2;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 3;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 3;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 4;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 4;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 5;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 5;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 6;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 6;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 7;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 7;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);


		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 8;
		gridBagConstraintsTransferenciasResumidos.gridx = 0;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jLabelfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 8;
		gridBagConstraintsTransferenciasResumidos.gridx = 1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransferenciasResumidos.gridy = 9;
		gridBagConstraintsTransferenciasResumidos.gridx =1;
		jPanelBusquedaTransferenciasResumidosTransferenciasResumidos.add(jButtonBusquedaTransferenciasResumidosTransferenciasResumidos, gridBagConstraintsTransferenciasResumidos);

		jTabbedPaneBusquedasTransferenciasResumidos.addTab("1.-Por Bodega Por Producto Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);
		jTabbedPaneBusquedasTransferenciasResumidos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransferenciasResumidos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransferenciasResumidos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();						
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferenciasResumidos.gridx = 0;		
			//this.gridBagConstraintsTransferenciasResumidos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransferenciasResumidos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;		
		//this.gridBagConstraintsTransferenciasResumidos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransferenciasResumidos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransferenciasResumidos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferenciasResumidos.gridx = 0;		
			this.gridBagConstraintsTransferenciasResumidos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransferenciasResumidos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);								
		
		
		/*
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		*/		
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransferenciasResumidos.gridx =0;
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransferenciasResumidos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
				
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransferenciasResumidos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransferenciasResumidos = new GridBagLayout();
			this.jPanelBusquedasParametrosTransferenciasResumidos.setLayout(gridaBagLayoutBusquedasParametrosTransferenciasResumidos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransferenciasResumidos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransferenciasResumidos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferenciasResumidos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferenciasResumidos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
			
			
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
			
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransferenciasResumidos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransferenciasResumidos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransferenciasResumidos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransferenciasResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransferenciasResumidos.setName("jPanelReporteDinamicoTransferenciasResumidos"); 
		
		this.jPanelReporteDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransferenciasResumidos.setLayout(gridaBagLayoutReporteDinamicoTransferenciasResumidos);
		
		
		this.jInternalFrameReporteDinamicoTransferenciasResumidos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransferenciasResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransferenciasResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransferenciasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransferenciasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransferenciasResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransferenciasResumidos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransferenciasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransferenciasResumidos.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransferenciasResumidos.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransferenciasResumidos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias Resumidoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransferenciasResumidos = new JLabelMe();

		this.jLabelColumnasSelectReporteTransferenciasResumidos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelColumnasSelectReporteTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransferenciasResumidos = new JList<Reporte>();
		this.jListColumnasSelectReporteTransferenciasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransferenciasResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransferenciasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransferenciasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransferenciasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransferenciasResumidos=new JScrollPane(this.jListColumnasSelectReporteTransferenciasResumidos);
			
			this.jScrollColumnasSelectReporteTransferenciasResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransferenciasResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransferenciasResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jListColumnasSelectReporteTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jScrollColumnasSelectReporteTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransferenciasResumidos = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransferenciasResumidos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransferenciasResumidos = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransferenciasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransferenciasResumidos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransferenciasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransferenciasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransferenciasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransferenciasResumidos=new JScrollPane(this.jListRelacionesSelectReporteTransferenciasResumidos);
			
			this.jScrollRelacionesSelectReporteTransferenciasResumidos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransferenciasResumidos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransferenciasResumidos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransferenciasResumidos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransferenciasResumidos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransferenciasResumidos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransferenciasResumidos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTransferenciasResumidos = new JLabelMe();

		this.jLabelConGraficoDinamicoTransferenciasResumidos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelConGraficoDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTransferenciasResumidos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTransferenciasResumidos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTransferenciasResumidos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jCheckBoxConGraficoDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTransferenciasResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTransferenciasResumidos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelColumnaCategoriaGraficoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTransferenciasResumidos = new JLabelMe();

		this.jLabelColumnaCategoriaValorTransferenciasResumidos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelColumnaCategoriaValorTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTransferenciasResumidos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTransferenciasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTransferenciasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jComboBoxColumnaCategoriaValorTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTransferenciasResumidos = new JLabelMe();

		this.jLabelColumnasValoresGraficoTransferenciasResumidos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelColumnasValoresGraficoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTransferenciasResumidos = new JList<Reporte>();
		this.jListColumnasValoresGraficoTransferenciasResumidos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTransferenciasResumidos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTransferenciasResumidos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransferenciasResumidos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTransferenciasResumidos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTransferenciasResumidos=new JScrollPane(this.jListColumnasValoresGraficoTransferenciasResumidos);
			
			this.jScrollColumnasValoresGraficoTransferenciasResumidos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransferenciasResumidos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTransferenciasResumidos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jListColumnasSelectReporteTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jScrollColumnasValoresGraficoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTransferenciasResumidos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTransferenciasResumidos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelTiposGraficosReportesDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTransferenciasResumidos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTransferenciasResumidos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTransferenciasResumidos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jComboBoxTiposGraficosReportesDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransferenciasResumidos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransferenciasResumidos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelGenerarExcelReporteDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidos.setToolTipText("Generar EXCEL"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		//this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jComboBoxTiposReportesDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransferenciasResumidos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransferenciasResumidos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jLabelTiposArchivoReporteDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jComboBoxTiposArchivosReportesDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransferenciasResumidos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransferenciasResumidos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransferenciasResumidos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransferenciasResumidos.setToolTipText("Generar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jButtonGenerarReporteDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransferenciasResumidos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransferenciasResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransferenciasResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransferenciasResumidos.setToolTipText("Cancelar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransferenciasResumidos.add(this.jButtonCerrarReporteDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransferenciasResumidos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransferenciasResumidos= new JScrollPane(jPanelReporteDinamicoTransferenciasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransferenciasResumidos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransferenciasResumidos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransferenciasResumidos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias Resumidoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransferenciasResumidos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransferenciasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransferenciasResumidos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransferenciasResumidos);
		this.jInternalFrameReporteDinamicoTransferenciasResumidos.getContentPane().add(this.jScrollPanelReporteDinamicoTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransferenciasResumidos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransferenciasResumidos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransferenciasResumidos.setName("jPanelImportacionTransferenciasResumidos"); 
		
		this.jPanelImportacionTransferenciasResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransferenciasResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransferenciasResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransferenciasResumidos.setLayout(gridaBagLayoutImportacionTransferenciasResumidos);
		
		
		this.jInternalFrameImportacionTransferenciasResumidos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransferenciasResumidos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransferenciasResumidos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransferenciasResumidos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransferenciasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransferenciasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransferenciasResumidos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransferenciasResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransferenciasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransferenciasResumidos.setResizable(true);
	    this.jInternalFrameImportacionTransferenciasResumidos.setClosable(true);
	    this.jInternalFrameImportacionTransferenciasResumidos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransferenciasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransferenciasResumidos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransferenciasResumidos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransferenciasResumidos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransferenciasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransferenciasResumidos.setResizable(true);
	    this.jInternalFrameImportacionTransferenciasResumidos.setClosable(true);
	    this.jInternalFrameImportacionTransferenciasResumidos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransferenciasResumidos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransferenciasResumidos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransferenciasResumidos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias Resumidoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransferenciasResumidos = new JLabelMe();

		this.jLabelArchivoImportacionTransferenciasResumidos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransferenciasResumidos.add(this.jLabelArchivoImportacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransferenciasResumidos = new JFileChooser();		
		this.jFileChooserImportacionTransferenciasResumidos.setToolTipText("ESCOGER ARCHIVO"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransferenciasResumidos = new JButtonMe();
		this.jButtonAbrirImportacionTransferenciasResumidos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransferenciasResumidos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransferenciasResumidos.setToolTipText("Generar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferenciasResumidos.add(this.jButtonAbrirImportacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransferenciasResumidos = new JLabelMe();

		this.jLabelPathArchivoImportacionTransferenciasResumidos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransferenciasResumidos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransferenciasResumidos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransferenciasResumidos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransferenciasResumidos.add(this.jLabelPathArchivoImportacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransferenciasResumidos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransferenciasResumidos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransferenciasResumidos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransferenciasResumidos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferenciasResumidos.add(this.jTextFieldPathArchivoImportacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransferenciasResumidos = new JButtonMe();
		this.jButtonGenerarImportacionTransferenciasResumidos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransferenciasResumidos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransferenciasResumidos.setToolTipText("Generar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferenciasResumidos.add(this.jButtonGenerarImportacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransferenciasResumidos = new JButtonMe();
		this.jButtonCerrarImportacionTransferenciasResumidos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransferenciasResumidos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransferenciasResumidos.setToolTipText("Cancelar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYImportacion;
		this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransferenciasResumidos.add(this.jButtonCerrarImportacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransferenciasResumidos = new GridBagLayout();
		
		this.jScrollPanelImportacionTransferenciasResumidos= new JScrollPane(jPanelImportacionTransferenciasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
		this.gridBagConstraintsTransferenciasResumidos.gridy =iPosYImportacion;
		this.gridBagConstraintsTransferenciasResumidos.gridx =iPosXImportacion;
		this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransferenciasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransferenciasResumidos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransferenciasResumidos);
		this.jInternalFrameImportacionTransferenciasResumidos.getContentPane().add(this.jScrollPanelImportacionTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransferenciasResumidos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransferenciasResumidos = new JButtonMe();
			this.jButtonAbrirOrderByTransferenciasResumidos.setText("Orden");
			this.jButtonAbrirOrderByTransferenciasResumidos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransferenciasResumidos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransferenciasResumidos";
			inputMap = this.jButtonAbrirOrderByTransferenciasResumidos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransferenciasResumidos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransferenciasResumidos"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransferenciasResumidos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransferenciasResumidos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransferenciasResumidos.setName("jPanelOrderByTransferenciasResumidos"); 
			
			this.jPanelOrderByTransferenciasResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransferenciasResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransferenciasResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransferenciasResumidos.setLayout(gridaBagLayoutOrderByTransferenciasResumidos);
			
			
			this.jTableDatosTransferenciasResumidosOrderBy = new JTableMe();        
			this.jTableDatosTransferenciasResumidosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransferenciasResumidosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransferenciasResumidosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransferenciasResumidosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransferenciasResumidosOrderBy.setViewportView(this.jTableDatosTransferenciasResumidosOrderBy);
			this.jTableDatosTransferenciasResumidosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransferenciasResumidosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransferenciasResumidos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransferenciasResumidos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransferenciasResumidos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransferenciasResumidos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransferenciasResumidos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransferenciasResumidos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransferenciasResumidos.setTitle("Orden");
			this.jInternalFrameOrderByTransferenciasResumidos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransferenciasResumidos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransferenciasResumidos.setResizable(true);
			this.jInternalFrameOrderByTransferenciasResumidos.setClosable(true);
			this.jInternalFrameOrderByTransferenciasResumidos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransferenciasResumidos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransferenciasResumidos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransferenciasResumidos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransferenciasResumidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias Resumidoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransferenciasResumidos.ipady =150;
				
			this.jPanelOrderByTransferenciasResumidos.add(jScrollPanelDatosTransferenciasResumidosOrderBy, this.gridBagConstraintsTransferenciasResumidos);//this.jTableDatosTransferenciasResumidosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransferenciasResumidos = new JButtonMe();
			this.jButtonCerrarOrderByTransferenciasResumidos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransferenciasResumidos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransferenciasResumidos.setToolTipText("Cancelar"+" "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransferenciasResumidos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferenciasResumidos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransferenciasResumidos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransferenciasResumidos.add(this.jButtonCerrarOrderByTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransferenciasResumidos = new GridBagLayout();
			
			this.jScrollPanelOrderByTransferenciasResumidos= new JScrollPane(jPanelOrderByTransferenciasResumidos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransferenciasResumidos = new GridBagConstraints();
			this.gridBagConstraintsTransferenciasResumidos.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransferenciasResumidos.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransferenciasResumidos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransferenciasResumidos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransferenciasResumidos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransferenciasResumidos);
			
			this.jInternalFrameOrderByTransferenciasResumidos.getContentPane().add(this.jScrollPanelOrderByTransferenciasResumidos, this.gridBagConstraintsTransferenciasResumidos);			
		
		} else {
			this.jButtonAbrirOrderByTransferenciasResumidos = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.transferenciasresumidosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransferenciasResumidos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosTransferenciasResumidos.getRowHeight();//TransferenciasResumidosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos.isSelected()) {
					iHeightTable=TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransferenciasResumidos.isSelected()) {
					iHeightTable=TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransferenciasResumidosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransferenciasResumidos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransferenciasResumidos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransferenciasResumidos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransferenciasResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransferenciasResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransferenciasResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransferenciasResumidos!=null && this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy()!=null) {
			//if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransferenciasResumidos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransferenciasResumidos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransferenciasResumidos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransferenciasResumidos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransferenciasResumidos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransferenciasResumidos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=transferenciasresumidosLogic.getTransferenciasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transferenciasresumidoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TransferenciasResumidos> TraerTransferenciasResumidosBeans(List<TransferenciasResumidos> transferenciasresumidoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidoss) {
					
				if(!(TransferenciasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransferenciasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transferenciasresumidos.setsDetalleGeneralEntityReporte(TransferenciasResumidosConstantesFunciones.getTransferenciasResumidosDescripcion(transferenciasresumidos));
										
						
					
						
					
				} else  {
							
					//transferenciasresumidos.setsDetalleGeneralEntityReporte(transferenciasresumidos.getsDetalleGeneralEntityReporte());
										
				}
				
				//transferenciasresumidosbeans.add(transferenciasresumidosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transferenciasresumidoss;
    }
	//PARA REPORTES FIN
}
