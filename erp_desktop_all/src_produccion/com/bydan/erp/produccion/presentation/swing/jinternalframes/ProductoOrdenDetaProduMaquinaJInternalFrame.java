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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMaquinaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ProductoOrdenDetaProduMaquinaJInternalFrame extends ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoOrdenDetaProduMaquina;
	
	protected JMenuBar jmenuBarProductoOrdenDetaProduMaquina;
	
	protected JMenu jmenuProductoOrdenDetaProduMaquina;
	protected JMenu jmenuDatosProductoOrdenDetaProduMaquina;
	protected JMenu jmenuArchivoProductoOrdenDetaProduMaquina;
	protected JMenu jmenuAccionesProductoOrdenDetaProduMaquina;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduMaquina;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduMaquina;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame jInternalFrameDetalleFormProductoOrdenDetaProduMaquina;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoOrdenDetaProduMaquina;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoAreaEmpresaProduBeanSwingJInternalFrame tipoareaempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoareaempresaprodu="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected TipoMaquinaEmpresaBeanSwingJInternalFrame tipomaquinaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomaquinaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean;
		
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinas;		
	public List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasEliminados;	
	public List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoOrdenDetaProduMaquina;		
	protected JButton jButtonAbrirOrderByProductoOrdenDetaProduMaquina;
	
	
	//protected JPanel jPanelOrderByProductoOrdenDetaProduMaquina;
	//public JScrollPane jScrollPanelOrderByProductoOrdenDetaProduMaquina;	
	//protected JButton jButtonCerrarOrderByProductoOrdenDetaProduMaquina;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMaquina;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMaquinaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina;
	//public JScrollPane jScrollPanelImportacionProductoOrdenDetaProduMaquina;
	
	
	
	protected JPanel jPanelAccionesProductoOrdenDetaProduMaquina;
	
    protected JPanel jPanelPaginacionProductoOrdenDetaProduMaquina;
    protected JPanel jPanelParametrosReportesProductoOrdenDetaProduMaquina;
	protected JPanel jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoOrdenDetaProduMaquina;
	protected JPanel jPanelParametrosAuxiliar2ProductoOrdenDetaProduMaquina;
	protected JPanel jPanelParametrosAuxiliar3ProductoOrdenDetaProduMaquina;
	protected JPanel jPanelParametrosAuxiliar4ProductoOrdenDetaProduMaquina;
	//protected JPanel jPanelParametrosAuxiliar5ProductoOrdenDetaProduMaquina;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoOrdenDetaProduMaquina;
	//protected JPanel jPanelImportacionProductoOrdenDetaProduMaquina;
	
	
	public JTable jTableDatosProductoOrdenDetaProduMaquina;
	
	
	
	//public JTable jTableDatosProductoOrdenDetaProduMaquinaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoOrdenDetaProduMaquina;
	protected JButton jButtonDuplicarProductoOrdenDetaProduMaquina;
	protected JButton jButtonCopiarProductoOrdenDetaProduMaquina;
	protected JButton jButtonVerFormProductoOrdenDetaProduMaquina;
	protected JButton jButtonNuevoRelacionesProductoOrdenDetaProduMaquina;
	protected JButton jButtonModificarProductoOrdenDetaProduMaquina;
	
    protected JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina;
	protected JButton jButtonCerrarProductoOrdenDetaProduMaquina;
	
	
	protected JButton jButtonRecargarInformacionProductoOrdenDetaProduMaquina;
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduMaquina;
	
	
	protected JButton jButtonAnterioresProductoOrdenDetaProduMaquina;
	protected JButton jButtonSiguientesProductoOrdenDetaProduMaquina;
	protected JButton jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina;
	//protected JButton jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoOrdenDetaProduMaquina;
	//protected JButton jButtonGenerarImportacionProductoOrdenDetaProduMaquina;
	//protected JButton jButtonCerrarImportacionProductoOrdenDetaProduMaquina;
	//protected JFileChooser jFileChooserImportacionProductoOrdenDetaProduMaquina;
	//protected File fileImportacionProductoOrdenDetaProduMaquina;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonDuplicarToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonCopiarToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonVerFormToolBarProductoOrdenDetaProduMaquina;
	public JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduMaquina;
	
	protected JButton jButtonRecargarInformacionToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonAnterioresToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonSiguientesToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonAbrirOrderByToolBarProductoOrdenDetaProduMaquina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemDuplicarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemCopiarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemVerFormProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemAnterioresProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemSiguientesProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduMaquina;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina;
	protected JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina;
	protected JCheckBox jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoOrdenDetaProduMaquina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina;
	protected JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoOrdenDetaProduMaquina;
	//public JList<Reporte> jListColumnasSelectReporteProductoOrdenDetaProduMaquina;
	//public JScrollPane jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina;
	
	//public JLabel jLabelRelacionesSelectReporteProductoOrdenDetaProduMaquina;
	//public JList<Reporte> jListRelacionesSelectReporteProductoOrdenDetaProduMaquina;
	//public JScrollPane jScrollRelacionesSelectReporteProductoOrdenDetaProduMaquina;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoOrdenDetaProduMaquina;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMaquina;
	
		
	//public JLabel jLabelArchivoImportacionProductoOrdenDetaProduMaquina;	
	//public JLabel jLabelPathArchivoImportacionProductoOrdenDetaProduMaquina;
	//protected JTextField jTextFieldPathArchivoImportacionProductoOrdenDetaProduMaquina;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMaquina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina;
	
	//public JLabel jLabelColumnaCategoriaValorProductoOrdenDetaProduMaquina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina;
	
	//public JLabel jLabelColumnasValoresGraficoProductoOrdenDetaProduMaquina;
	//public JList<Reporte> jListColumnasValoresGraficoProductoOrdenDetaProduMaquina;
	//public JScrollPane jScrollColumnasValoresGraficoProductoOrdenDetaProduMaquina;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduMaquina;
	public JPanel jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina;
	public JButton jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina;
	public JPanel jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina;
	public JButton jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina;
	public JPanel jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina;
	public JButton jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina;
	public JPanel jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina;
	public JButton jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina;
	public JPanel jPanelFK_IdUnidadProductoOrdenDetaProduMaquina;
	public JButton jButtonFK_IdUnidadProductoOrdenDetaProduMaquina;
	
	public JPanel jPanelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina;
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina;
	public JButton jButtonid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina;
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina;
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina;
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoOrdenDetaProduMaquinaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMaquinaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMaquinaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMaquinaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoOrdenDetaProduMaquina)	{
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina = jButtonRecargarInformacionProductoOrdenDetaProduMaquina;
	}
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduMaquina() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduMaquina)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina = jButtonProcesarInformacionProductoOrdenDetaProduMaquina;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoOrdenDetaProduMaquina() {
		return this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina;
	}
	
	
	public List<ProductoOrdenDetaProduMaquina> getproductoordendetaprodumaquinas() {
		return this.productoordendetaprodumaquinas;
	}

	public void setproductoordendetaprodumaquinas(List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinas) {
		this.productoordendetaprodumaquinas = productoordendetaprodumaquinas;
	}
	
	public List<ProductoOrdenDetaProduMaquina> getproductoordendetaprodumaquinasAux() {
		return this.productoordendetaprodumaquinasAux;
	}

	public void setproductoordendetaprodumaquinasAux(List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasAux) {
		this.productoordendetaprodumaquinasAux = productoordendetaprodumaquinasAux;
	}
	
	public List<ProductoOrdenDetaProduMaquina> getproductoordendetaprodumaquinasEliminados() {
		return this.productoordendetaprodumaquinasEliminados;
	}

	public void setProductoOrdenDetaProduMaquinasEliminados(List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinasEliminados) {
		this.productoordendetaprodumaquinasEliminados = productoordendetaprodumaquinasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina() {
		return jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina = jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina() {
		return jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina;
	}

	public void setjTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina(
			JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina) {
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina = jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina;
	}

	public void setBorderResaltarValorCampoGeneralProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina() {
		return this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina;
	}

	public void setjCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina(
			JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina) {
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina = jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina;
	}

	public void setBorderResaltarSeleccionarTodosProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoOrdenDetaProduMaquina() {
		return this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina;
	}

	public void setjCheckBoxSeleccionadosProductoOrdenDetaProduMaquina(
			JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina) {
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina = jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina;
	}
	
	public void setBorderResaltarSeleccionadosProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina = jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina;
	}

	public void setBorderResaltarTiposArchivosReportesProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposReportesProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina = jComboBoxTiposReportesProductoOrdenDetaProduMaquina;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina() {
	//	return jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina) {
	//	this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina = jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina = jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina;
	//}
	
	public void setBorderResaltarTiposReportesProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina = jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina = jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina;
	}
	
	public void setBorderResaltarTiposPaginacionProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina = jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina = jComboBoxTiposAccionesProductoOrdenDetaProduMaquina;
	}
	
	public void setBorderResaltarTiposRelacionesProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoOrdenDetaProduMaquina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina() {
	//	return jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina) {
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina = jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoOrdenDetaProduMaquina() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoOrdenDetaProduMaquina.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina .setBorder(borderResaltar);		
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
		this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		
		this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduMaquinaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Maquina MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoOrdenDetaProduMaquina= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"nuevo","nuevo","Nuevo"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"duplicar","duplicar","Duplicar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"copiar","copiar","Copiar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"ver_form","ver_form","Ver"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"recargar","recargar","Recargar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarProductoOrdenDetaProduMaquina,
							"cerrar","cerrar","Salir"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduMaquina;
			
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduMaquina=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMaquina;
				
		//protected JButton jButtonModificarToolBarProductoOrdenDetaProduMaquina;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoOrdenDetaProduMaquina=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoOrdenDetaProduMaquina=new JMenuMe("General");
		this.jmenuArchivoProductoOrdenDetaProduMaquina=new JMenuMe("Archivo");
		this.jmenuAccionesProductoOrdenDetaProduMaquina=new JMenuMe("Acciones");
		this.jmenuDatosProductoOrdenDetaProduMaquina=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduMaquina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduMaquina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduMaquina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoOrdenDetaProduMaquina= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoOrdenDetaProduMaquina.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoOrdenDetaProduMaquina,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoOrdenDetaProduMaquina= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoOrdenDetaProduMaquina.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoOrdenDetaProduMaquina,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoOrdenDetaProduMaquina= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoOrdenDetaProduMaquina.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoOrdenDetaProduMaquina,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduMaquina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduMaquina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduMaquina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduMaquina= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduMaquina.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoOrdenDetaProduMaquina,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoOrdenDetaProduMaquina= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoOrdenDetaProduMaquina.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoOrdenDetaProduMaquina,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoOrdenDetaProduMaquina= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoOrdenDetaProduMaquina.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoOrdenDetaProduMaquina,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoOrdenDetaProduMaquina.add(this.jMenuItemCerrarProductoOrdenDetaProduMaquina);
			
			this.jmenuAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemNuevoProductoOrdenDetaProduMaquina);
			this.jmenuAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina);
			this.jmenuAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduMaquina);
			this.jmenuAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina);		
			this.jmenuAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemDuplicarProductoOrdenDetaProduMaquina);		
			this.jmenuAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemCopiarProductoOrdenDetaProduMaquina);		
			this.jmenuAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemVerFormProductoOrdenDetaProduMaquina);		
			
			this.jmenuDatosProductoOrdenDetaProduMaquina.add(this.jMenuItemRecargarInformacionProductoOrdenDetaProduMaquina);				
			this.jmenuDatosProductoOrdenDetaProduMaquina.add(this.jMenuItemAnterioresProductoOrdenDetaProduMaquina);				
			this.jmenuDatosProductoOrdenDetaProduMaquina.add(this.jMenuItemSiguientesProductoOrdenDetaProduMaquina);				
			this.jmenuDatosProductoOrdenDetaProduMaquina.add(this.jMenuItemAbrirOrderByProductoOrdenDetaProduMaquina);				
			this.jmenuDatosProductoOrdenDetaProduMaquina.add(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoOrdenDetaProduMaquina.add(this.jmenuArchivoProductoOrdenDetaProduMaquina);		
			this.jmenuBarProductoOrdenDetaProduMaquina.add(this.jmenuAccionesProductoOrdenDetaProduMaquina);		
			this.jmenuBarProductoOrdenDetaProduMaquina.add(this.jmenuDatosProductoOrdenDetaProduMaquina);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoOrdenDetaProduMaquina);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoOrdenDetaProduMaquina() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Orden Deta Produ ");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Orden Deta Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina,"buscar_button","Buscar Por Orden Deta Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina = new JLabelMe();
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setText("Orden Deta Produ :");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setToolTipText("Orden Deta Produ");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Tipo Area Empresa Produ ");
		this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Tipo Area Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina,"buscar_button","Buscar Por Tipo Area Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina = new JLabelMe();
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setText("Tipo Area Empresa Produ :");
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setToolTipText("Tipo Area Empresa Produ");
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Tipo Merma Empresa ");
		this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Tipo Merma Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina,"buscar_button","Buscar Por Tipo Merma Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina = new JLabelMe();
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setText("Tipo Merma Empresa :");
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setToolTipText("Tipo Merma Empresa");
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Tipo Proceso Empresa Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina,"buscar_button","Buscar Por Tipo Proceso Empresa Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina = new JLabelMe();
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setText("Tipo Proceso Empresa Produ :");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setToolTipText("Tipo Proceso Empresa Produ");
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquina.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquina,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoOrdenDetaProduMaquina = new ProductoOrdenDetaProduMaquinaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Orden Maquina DATOS");
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina = new ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones(),this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduMaquina = null;//new ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduMaquina= new GridBagLayout();
		
		
		this.jTableDatosProductoOrdenDetaProduMaquina = new JTableMe();      
		
		String sToolTipProductoOrdenDetaProduMaquina="";
		sToolTipProductoOrdenDetaProduMaquina=ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduMaquina+="(Produccion.ProductoOrdenDetaProduMaquina)";
		}
		
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduMaquina+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoOrdenDetaProduMaquina.setToolTipText(sToolTipProductoOrdenDetaProduMaquina);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoOrdenDetaProduMaquina);
		this.jTableDatosProductoOrdenDetaProduMaquina.setAutoCreateRowSorter(true);
		this.jTableDatosProductoOrdenDetaProduMaquina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoOrdenDetaProduMaquina.setRowSelectionAllowed(true);
		this.jTableDatosProductoOrdenDetaProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonDuplicarProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonCopiarProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonVerFormProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduMaquina = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Maquina";
		
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Maquinaes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduMaquina.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduMaquina.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoOrdenDetaProduMaquina();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoOrdenDetaProduMaquina=new ImportacionJInternalFrame(ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoOrdenDetaProduMaquina();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.setText("Orden");
		this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina,false,this);
			
			//this.cargarOrderByProductoOrdenDetaProduMaquina(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduMaquina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina,true,this);
			
			//this.cargarOrderByProductoOrdenDetaProduMaquina(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoOrdenDetaProduMaquina.setText("Nuevo");
		this.jButtonDuplicarProductoOrdenDetaProduMaquina.setText("Duplicar");
		this.jButtonCopiarProductoOrdenDetaProduMaquina.setText("Copiar");
		this.jButtonVerFormProductoOrdenDetaProduMaquina.setText("Ver");
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduMaquina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduMaquina,"nuevo_button","Nuevo",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoOrdenDetaProduMaquina,"duplicar_button","Duplicar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoOrdenDetaProduMaquina,"copiar_button","Copiar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoOrdenDetaProduMaquina,"ver_form","Ver",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina,"nuevorelaciones_button","Nuevo Rel",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina,"guardarcambiostabla_button","Guardar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduMaquina,"cerrar_button","Salir",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoOrdenDetaProduMaquina.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoOrdenDetaProduMaquina.setToolTipText("Duplicar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoOrdenDetaProduMaquina.setToolTipText("Copiar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoOrdenDetaProduMaquina.setToolTipText("Ver"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.setToolTipText("Nuevo Rel"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduMaquina.setToolTipText("Salir"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduMaquina"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonDuplicarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoOrdenDetaProduMaquina"));
		
		//COPIAR
		sMapKey = "CopiarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonCopiarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoOrdenDetaProduMaquina"));
		
		//VEr FORM
		sMapKey = "VerFormProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonVerFormProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoOrdenDetaProduMaquina"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoOrdenDetaProduMaquina"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonModificarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoOrdenDetaProduMaquina"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduMaquina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduMaquina"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setName("jPanelParametrosReportesProductoOrdenDetaProduMaquina"); 
		
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina.setName("jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.setText("Recargar");
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.setToolTipText("Recargar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina.setText("Procesar");
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina.setToolTipText("Procesar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina.setVisible(false);
			
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.setText("TIPO");       
		this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.setText("Accion");
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoOrdenDetaProduMaquina = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoOrdenDetaProduMaquina = new JButtonMe();
		//this.jButtonAnterioresProductoOrdenDetaProduMaquina.setText("<<");
        this.jButtonAnterioresProductoOrdenDetaProduMaquina.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoOrdenDetaProduMaquina,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoOrdenDetaProduMaquina = new JButtonMe();
		//this.jButtonSiguientesProductoOrdenDetaProduMaquina.setText(">>");
        this.jButtonSiguientesProductoOrdenDetaProduMaquina.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoOrdenDetaProduMaquina,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina,"nuevoguardarcambios_button","Nue",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoOrdenDetaProduMaquina"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoOrdenDetaProduMaquina"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonSiguientesProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoOrdenDetaProduMaquina"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonAnterioresProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoOrdenDetaProduMaquina"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoOrdenDetaProduMaquina();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduMaquinaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduMaquinaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduMaquinaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduMaquinaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduMaquinaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduMaquinaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoOrdenDetaProduMaquina = new GridBagLayout();

			this.jPanelPaginacionProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutPaginacionProductoOrdenDetaProduMaquina);						
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonAnterioresProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
					
						
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
			
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
						
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonSiguientesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonNuevoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
						
			
			
			if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			}
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonDuplicarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonCopiarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonVerFormProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoOrdenDetaProduMaquina.add(this.jButtonCerrarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoOrdenDetaProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoOrdenDetaProduMaquina = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoOrdenDetaProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoOrdenDetaProduMaquina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoOrdenDetaProduMaquina = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.setLayout(gridaBagParametrosReportesProductoOrdenDetaProduMaquina);
			this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina.setLayout(gridaBagParametrosReportesAccionesProductoOrdenDetaProduMaquina);
			
			
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMaquina.setLayout(gridaBagParametrosAuxiliar1ProductoOrdenDetaProduMaquina);
			this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMaquina.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMaquina);
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMaquina.setLayout(gridaBagParametrosAuxiliar3ProductoOrdenDetaProduMaquina);
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMaquina.setLayout(gridaBagParametrosAuxiliar4ProductoOrdenDetaProduMaquina);
			//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduMaquina.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduMaquina);			
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jButtonRecargarInformacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposPaginacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMaquina.add(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);																		
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposReportesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jCheckBoxGenerarReporteProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jLabelAccionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMaquina.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);															
				
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMaquina.add(this.jCheckBoxSeleccionadosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);															
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMaquina.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	
				
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduMaquina.add(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoOrdenDetaProduMaquina = new GridBagLayout();

			this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutDatosProductoOrdenDetaProduMaquina);
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
			
			this.jScrollPanelDatosProductoOrdenDetaProduMaquina.add(this.jTableDatosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setViewportView(this.jTableDatosProductoOrdenDetaProduMaquina);
		this.jTableDatosProductoOrdenDetaProduMaquina.setFillsViewportHeight(true);
		this.jTableDatosProductoOrdenDetaProduMaquina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduMaquina= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduMaquina);
		
		
		/*	
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
			
		this.jPanelAccionesProductoOrdenDetaProduMaquina.add(this.jButtonNuevoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.add(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.add(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina.add(jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.addTab("1.-Por Orden Deta Produ ", jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduMaquina);
		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.add(jLabelid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
		jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.add(jComboBoxid_tipo_area_empresa_produFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =1;
		jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina.add(jButtonFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.addTab("2.-Por Tipo Area Empresa Produ ", jPanelFK_IdTipoAreaEmpresaProduProductoOrdenDetaProduMaquina);
		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.add(jLabelid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
		jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.add(jComboBoxid_tipo_merma_empresaFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =1;
		jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina.add(jButtonFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.addTab("3.-Por Tipo Merma Empresa ", jPanelFK_IdTipoMaquinaEmpresaProductoOrdenDetaProduMaquina);
		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.add(jLabelid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.add(jComboBoxid_tipo_proceso_empresa_produFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =1;
		jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina.add(jButtonFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.addTab("4.-Por Tipo Proceso Empresa Produ ", jPanelFK_IdTipoProcesoEmpresaProduProductoOrdenDetaProduMaquina);
		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMaquina= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMaquina.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMaquina.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMaquina.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMaquina.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		jPanelFK_IdUnidadProductoOrdenDetaProduMaquina.add(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
		jPanelFK_IdUnidadProductoOrdenDetaProduMaquina.add(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =1;
		jPanelFK_IdUnidadProductoOrdenDetaProduMaquina.add(jButtonFK_IdUnidadProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);

		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.addTab("5.-Por Unad ", jPanelFK_IdUnidadProductoOrdenDetaProduMaquina);
		jTabbedPaneBusquedasProductoOrdenDetaProduMaquina.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduMaquina);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;		
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);								
		
		
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		*/		
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
				
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoOrdenDetaProduMaquina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMaquina = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMaquina);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoOrdenDetaProduMaquina() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoOrdenDetaProduMaquina = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.setName("jPanelReporteDinamicoProductoOrdenDetaProduMaquina"); 
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutReporteDinamicoProductoOrdenDetaProduMaquina);
		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Maquinaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMaquina.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelColumnasSelectReporteProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina=new JScrollPane(this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina);
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMaquina.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMaquina = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMaquina=new JScrollPane(this.jListRelacionesSelectReporteProductoOrdenDetaProduMaquina);
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMaquina.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelConGraficoDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMaquina.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelColumnaCategoriaValorProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMaquina.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelColumnasValoresGraficoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMaquina=new JScrollPane(this.jListColumnasValoresGraficoProductoOrdenDetaProduMaquina);
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jListColumnasSelectReporteProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jScrollColumnasValoresGraficoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduMaquina.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina.setToolTipText("Generar EXCEL"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMaquina.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina.setToolTipText("Generar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduMaquina.add(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduMaquina = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina= new JScrollPane(jPanelReporteDinamicoProductoOrdenDetaProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Maquinaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduMaquina);
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduMaquina.getContentPane().add(this.jScrollPanelReporteDinamicoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoOrdenDetaProduMaquina() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoOrdenDetaProduMaquina = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoOrdenDetaProduMaquina.setName("jPanelImportacionProductoOrdenDetaProduMaquina"); 
		
		this.jPanelImportacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutImportacionProductoOrdenDetaProduMaquina);
		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoOrdenDetaProduMaquina= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMaquina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Maquinaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelArchivoImportacionProductoOrdenDetaProduMaquina.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduMaquina.add(this.jLabelArchivoImportacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoOrdenDetaProduMaquina = new JFileChooser();		
		this.jFileChooserImportacionProductoOrdenDetaProduMaquina.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonAbrirImportacionProductoOrdenDetaProduMaquina.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoOrdenDetaProduMaquina,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduMaquina.setToolTipText("Generar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMaquina.add(this.jButtonAbrirImportacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMaquina = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMaquina.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduMaquina.add(this.jLabelPathArchivoImportacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMaquina=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMaquina.add(this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonGenerarImportacionProductoOrdenDetaProduMaquina.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoOrdenDetaProduMaquina,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduMaquina.setToolTipText("Generar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMaquina.add(this.jButtonGenerarImportacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonCerrarImportacionProductoOrdenDetaProduMaquina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoOrdenDetaProduMaquina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoOrdenDetaProduMaquina.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduMaquina.add(this.jButtonCerrarImportacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduMaquina = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduMaquina= new JScrollPane(jPanelImportacionProductoOrdenDetaProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduMaquina);
		this.jInternalFrameImportacionProductoOrdenDetaProduMaquina.getContentPane().add(this.jScrollPanelImportacionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoOrdenDetaProduMaquina(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina = new JButtonMe();
			this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.setText("Orden");
			this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoOrdenDetaProduMaquina";
			inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoOrdenDetaProduMaquina"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoOrdenDetaProduMaquina = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoOrdenDetaProduMaquina.setName("jPanelOrderByProductoOrdenDetaProduMaquina"); 
			
			this.jPanelOrderByProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutOrderByProductoOrdenDetaProduMaquina);
			
			
			this.jTableDatosProductoOrdenDetaProduMaquinaOrderBy = new JTableMe();        
			this.jTableDatosProductoOrdenDetaProduMaquinaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduMaquinaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoOrdenDetaProduMaquinaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoOrdenDetaProduMaquinaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoOrdenDetaProduMaquinaOrderBy.setViewportView(this.jTableDatosProductoOrdenDetaProduMaquinaOrderBy);
			this.jTableDatosProductoOrdenDetaProduMaquinaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoOrdenDetaProduMaquinaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoOrdenDetaProduMaquina = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoOrdenDetaProduMaquina= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setTitle("Orden");
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setResizable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setClosable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Maquinaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipady =150;
				
			this.jPanelOrderByProductoOrdenDetaProduMaquina.add(jScrollPanelDatosProductoOrdenDetaProduMaquinaOrderBy, this.gridBagConstraintsProductoOrdenDetaProduMaquina);//this.jTableDatosProductoOrdenDetaProduMaquinaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoOrdenDetaProduMaquina = new JButtonMe();
			this.jButtonCerrarOrderByProductoOrdenDetaProduMaquina.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoOrdenDetaProduMaquina,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoOrdenDetaProduMaquina.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoOrdenDetaProduMaquina.add(this.jButtonCerrarOrderByProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduMaquina = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoOrdenDetaProduMaquina= new JScrollPane(jPanelOrderByProductoOrdenDetaProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduMaquina);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getContentPane().add(this.jScrollPanelOrderByProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
		
		} else {
			this.jButtonAbrirOrderByProductoOrdenDetaProduMaquina = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoOrdenDetaProduMaquina.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoOrdenDetaProduMaquina.getRowHeight();//ProductoOrdenDetaProduMaquinaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduMaquina.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduMaquinaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoOrdenDetaProduMaquina!=null && this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy()!=null) {
			//if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoOrdenDetaProduMaquina.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoordendetaprodumaquinaLogic.getProductoOrdenDetaProduMaquinas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodumaquinas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoOrdenDetaProduMaquina> TraerProductoOrdenDetaProduMaquinaBeans(List<ProductoOrdenDetaProduMaquina> productoordendetaprodumaquinas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoOrdenDetaProduMaquina productoordendetaprodumaquina:productoordendetaprodumaquinas) {
					
				if(!(ProductoOrdenDetaProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoOrdenDetaProduMaquinaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoordendetaprodumaquina.setsDetalleGeneralEntityReporte(ProductoOrdenDetaProduMaquinaConstantesFunciones.getProductoOrdenDetaProduMaquinaDescripcion(productoordendetaprodumaquina));
										
						
					
						
					
				} else  {
							
					//productoordendetaprodumaquina.setsDetalleGeneralEntityReporte(productoordendetaprodumaquina.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoordendetaprodumaquinabeans.add(productoordendetaprodumaquinabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoordendetaprodumaquinas;
    }
	//PARA REPORTES FIN
}
