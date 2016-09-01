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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.facturacion.util.CentroCostoGrupoProductoConstantesFunciones;

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
public class CentroCostoGrupoProductoJInternalFrame extends CentroCostoGrupoProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCentroCostoGrupoProducto;
	
	protected JMenuBar jmenuBarCentroCostoGrupoProducto;
	
	protected JMenu jmenuCentroCostoGrupoProducto;
	protected JMenu jmenuDatosCentroCostoGrupoProducto;
	protected JMenu jmenuArchivoCentroCostoGrupoProducto;
	protected JMenu jmenuAccionesCentroCostoGrupoProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCostoGrupoProducto;	
	protected GridBagConstraints gridBagConstraintsCentroCostoGrupoProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CentroCostoGrupoProductoDetalleFormJInternalFrame jInternalFrameDetalleFormCentroCostoGrupoProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCentroCostoGrupoProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCentroCostoGrupoProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";
	
	public CentroCostoGrupoProductoSessionBean centrocostogrupoproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CentroCostoGrupoProducto> centrocostogrupoproductos;		
	public List<CentroCostoGrupoProducto> centrocostogrupoproductosEliminados;	
	public List<CentroCostoGrupoProducto> centrocostogrupoproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCentroCostoGrupoProducto;		
	protected JButton jButtonAbrirOrderByCentroCostoGrupoProducto;
	
	
	//protected JPanel jPanelOrderByCentroCostoGrupoProducto;
	//public JScrollPane jScrollPanelOrderByCentroCostoGrupoProducto;	
	//protected JButton jButtonCerrarOrderByCentroCostoGrupoProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CentroCostoGrupoProductoLogic centrocostogrupoproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCentroCostoGrupoProducto;
	public JScrollPane jScrollPanelDatosEdicionCentroCostoGrupoProducto;
	public JScrollPane jScrollPanelDatosGeneralCentroCostoGrupoProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosCentroCostoGrupoProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCentroCostoGrupoProducto;
	//public JScrollPane jScrollPanelImportacionCentroCostoGrupoProducto;
	
	
	
	protected JPanel jPanelAccionesCentroCostoGrupoProducto;
	
    protected JPanel jPanelPaginacionCentroCostoGrupoProducto;
    protected JPanel jPanelParametrosReportesCentroCostoGrupoProducto;
	protected JPanel jPanelParametrosReportesAccionesCentroCostoGrupoProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CentroCostoGrupoProducto;
	protected JPanel jPanelParametrosAuxiliar2CentroCostoGrupoProducto;
	protected JPanel jPanelParametrosAuxiliar3CentroCostoGrupoProducto;
	protected JPanel jPanelParametrosAuxiliar4CentroCostoGrupoProducto;
	//protected JPanel jPanelParametrosAuxiliar5CentroCostoGrupoProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoCentroCostoGrupoProducto;
	//protected JPanel jPanelImportacionCentroCostoGrupoProducto;
	
	
	public JTable jTableDatosCentroCostoGrupoProducto;
	
	
	
	//public JTable jTableDatosCentroCostoGrupoProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCentroCostoGrupoProducto;
	protected JButton jButtonDuplicarCentroCostoGrupoProducto;
	protected JButton jButtonCopiarCentroCostoGrupoProducto;
	protected JButton jButtonVerFormCentroCostoGrupoProducto;
	protected JButton jButtonNuevoRelacionesCentroCostoGrupoProducto;
	protected JButton jButtonModificarCentroCostoGrupoProducto;
	
    protected JButton jButtonGuardarCambiosTablaCentroCostoGrupoProducto;
	protected JButton jButtonCerrarCentroCostoGrupoProducto;
	
	
	protected JButton jButtonRecargarInformacionCentroCostoGrupoProducto;
	protected JButton jButtonProcesarInformacionCentroCostoGrupoProducto;
	
	
	protected JButton jButtonAnterioresCentroCostoGrupoProducto;
	protected JButton jButtonSiguientesCentroCostoGrupoProducto;
	protected JButton jButtonNuevoGuardarCambiosCentroCostoGrupoProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCentroCostoGrupoProducto;
	//protected JButton jButtonCerrarReporteDinamicoCentroCostoGrupoProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionCentroCostoGrupoProducto;
	//protected JButton jButtonGenerarImportacionCentroCostoGrupoProducto;
	//protected JButton jButtonCerrarImportacionCentroCostoGrupoProducto;
	//protected JFileChooser jFileChooserImportacionCentroCostoGrupoProducto;
	//protected File fileImportacionCentroCostoGrupoProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCostoGrupoProducto;
	protected JButton jButtonDuplicarToolBarCentroCostoGrupoProducto;
	protected JButton jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarCentroCostoGrupoProducto;
	protected JButton jButtonCopiarToolBarCentroCostoGrupoProducto;
	protected JButton jButtonVerFormToolBarCentroCostoGrupoProducto;
	public JButton jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCostoGrupoProducto;
	protected JButton jButtonCerrarToolBarCentroCostoGrupoProducto;
	
	protected JButton jButtonRecargarInformacionToolBarCentroCostoGrupoProducto;
	protected JButton jButtonProcesarInformacionToolBarCentroCostoGrupoProducto;
	protected JButton jButtonAnterioresToolBarCentroCostoGrupoProducto;
	protected JButton jButtonSiguientesToolBarCentroCostoGrupoProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarCentroCostoGrupoProducto;
	protected JButton jButtonAbrirOrderByToolBarCentroCostoGrupoProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemDuplicarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemNuevoRelacionesCentroCostoGrupoProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemCopiarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemVerFormCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemCerrarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemDetalleCerrarCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemProcesarInformacionCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemAnterioresCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemSiguientesCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemAbrirOrderByCentroCostoGrupoProducto;
	protected JMenuItem jMenuItemMostrarOcultarCentroCostoGrupoProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroCostoGrupoProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCentroCostoGrupoProducto;
	protected JCheckBox jCheckBoxSeleccionadosCentroCostoGrupoProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto;
	protected JCheckBox jCheckBoxConGraficoReporteCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCentroCostoGrupoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCentroCostoGrupoProducto;
	protected JTextField jTextFieldValorCampoGeneralCentroCostoGrupoProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCentroCostoGrupoProducto;
	//public JList<Reporte> jListColumnasSelectReporteCentroCostoGrupoProducto;
	//public JScrollPane jScrollColumnasSelectReporteCentroCostoGrupoProducto;
	
	//public JLabel jLabelRelacionesSelectReporteCentroCostoGrupoProducto;
	//public JList<Reporte> jListRelacionesSelectReporteCentroCostoGrupoProducto;
	//public JScrollPane jScrollRelacionesSelectReporteCentroCostoGrupoProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCentroCostoGrupoProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCentroCostoGrupoProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCentroCostoGrupoProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoCentroCostoGrupoProducto;
	
		
	//public JLabel jLabelArchivoImportacionCentroCostoGrupoProducto;	
	//public JLabel jLabelPathArchivoImportacionCentroCostoGrupoProducto;
	//protected JTextField jTextFieldPathArchivoImportacionCentroCostoGrupoProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCentroCostoGrupoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCentroCostoGrupoProducto;
	
	//public JLabel jLabelColumnaCategoriaValorCentroCostoGrupoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCentroCostoGrupoProducto;
	
	//public JLabel jLabelColumnasValoresGraficoCentroCostoGrupoProducto;
	//public JList<Reporte> jListColumnasValoresGraficoCentroCostoGrupoProducto;
	//public JScrollPane jScrollColumnasValoresGraficoCentroCostoGrupoProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCentroCostoGrupoProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCentroCostoGrupoProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCentroCostoGrupoProducto;
	public JPanel jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	public JButton jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	public JPanel jPanelFK_IdCentroCostoCentroCostoGrupoProducto;
	public JButton jButtonFK_IdCentroCostoCentroCostoGrupoProducto;
	public JPanel jPanelFK_IdLineaCentroCostoGrupoProducto;
	public JButton jButtonFK_IdLineaCentroCostoGrupoProducto;
	
	public JPanel jPanelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	public JLabel jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	public JButton jButtonid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoArbol= new JButtonMe();

	public JButton jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto;
	
	public JPanel jPanelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	public JLabel jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto;
	public JButton jButtonid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto;
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoGrupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoGrupoProductoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto;
	
	public JPanel jPanelid_lineaFK_IdLineaCentroCostoGrupoProducto;
	public JLabel jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto;
	public JButton jButtonid_lineaFK_IdLineaCentroCostoGrupoProducto= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaCentroCostoGrupoProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaCentroCostoGrupoProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaCentroCostoGrupoProductoArbol= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CentroCostoGrupoProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoGrupoProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoGrupoProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoGrupoProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCentroCostoGrupoProducto)	{
		this.jButtonRecargarInformacionCentroCostoGrupoProducto = jButtonRecargarInformacionCentroCostoGrupoProducto;
	}
	
	public JButton getjButtonProcesarInformacionCentroCostoGrupoProducto() {
		return this.jButtonProcesarInformacionCentroCostoGrupoProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCostoGrupoProducto)	{
		this.jButtonProcesarInformacionCentroCostoGrupoProducto = jButtonProcesarInformacionCentroCostoGrupoProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionCentroCostoGrupoProducto() {
		return this.jButtonRecargarInformacionCentroCostoGrupoProducto;
	}
	
	
	public List<CentroCostoGrupoProducto> getcentrocostogrupoproductos() {
		return this.centrocostogrupoproductos;
	}

	public void setcentrocostogrupoproductos(List<CentroCostoGrupoProducto> centrocostogrupoproductos) {
		this.centrocostogrupoproductos = centrocostogrupoproductos;
	}
	
	public List<CentroCostoGrupoProducto> getcentrocostogrupoproductosAux() {
		return this.centrocostogrupoproductosAux;
	}

	public void setcentrocostogrupoproductosAux(List<CentroCostoGrupoProducto> centrocostogrupoproductosAux) {
		this.centrocostogrupoproductosAux = centrocostogrupoproductosAux;
	}
	
	public List<CentroCostoGrupoProducto> getcentrocostogrupoproductosEliminados() {
		return this.centrocostogrupoproductosEliminados;
	}

	public void setCentroCostoGrupoProductosEliminados(List<CentroCostoGrupoProducto> centrocostogrupoproductosEliminados) {
		this.centrocostogrupoproductosEliminados = centrocostogrupoproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCentroCostoGrupoProducto() {
		return jComboBoxTiposSeleccionarCentroCostoGrupoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposSeleccionarCentroCostoGrupoProducto) {
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto = jComboBoxTiposSeleccionarCentroCostoGrupoProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCentroCostoGrupoProducto() {
		return jTextFieldValorCampoGeneralCentroCostoGrupoProducto;
	}

	public void setjTextFieldValorCampoGeneralCentroCostoGrupoProducto(
			JTextField jTextFieldValorCampoGeneralCentroCostoGrupoProducto) {
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto = jTextFieldValorCampoGeneralCentroCostoGrupoProducto;
	}

	public void setBorderResaltarValorCampoGeneralCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCentroCostoGrupoProducto() {
		return this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto;
	}

	public void setjCheckBoxSeleccionarTodosCentroCostoGrupoProducto(
			JCheckBox jCheckBoxSeleccionarTodosCentroCostoGrupoProducto) {
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto = jCheckBoxSeleccionarTodosCentroCostoGrupoProducto;
	}

	public void setBorderResaltarSeleccionarTodosCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCentroCostoGrupoProducto() {
		return this.jCheckBoxSeleccionadosCentroCostoGrupoProducto;
	}

	public void setjCheckBoxSeleccionadosCentroCostoGrupoProducto(
			JCheckBox jCheckBoxSeleccionadosCentroCostoGrupoProducto) {
		this.jCheckBoxSeleccionadosCentroCostoGrupoProducto = jCheckBoxSeleccionadosCentroCostoGrupoProducto;
	}
	
	public void setBorderResaltarSeleccionadosCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCentroCostoGrupoProducto() {
		return this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposArchivosReportesCentroCostoGrupoProducto) {
		this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto = jComboBoxTiposArchivosReportesCentroCostoGrupoProducto;
	}

	public void setBorderResaltarTiposArchivosReportesCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCentroCostoGrupoProducto() {
		return this.jComboBoxTiposReportesCentroCostoGrupoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposReportesCentroCostoGrupoProducto) {
		this.jComboBoxTiposReportesCentroCostoGrupoProducto = jComboBoxTiposReportesCentroCostoGrupoProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCentroCostoGrupoProducto() {
	//	return jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCentroCostoGrupoProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto) {
	//	this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto = jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto = jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto;
	//}
	
	public void setBorderResaltarTiposReportesCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCentroCostoGrupoProducto() {
		return this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposGraficosReportesCentroCostoGrupoProducto) {
		this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto = jComboBoxTiposGraficosReportesCentroCostoGrupoProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCentroCostoGrupoProducto() {
		return this.jComboBoxTiposPaginacionCentroCostoGrupoProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposPaginacionCentroCostoGrupoProducto) {
		this.jComboBoxTiposPaginacionCentroCostoGrupoProducto = jComboBoxTiposPaginacionCentroCostoGrupoProducto;
	}
	
	public void setBorderResaltarTiposPaginacionCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCentroCostoGrupoProducto() {
		return this.jComboBoxTiposRelacionesCentroCostoGrupoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCostoGrupoProducto() {
		return this.jComboBoxTiposAccionesCentroCostoGrupoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposRelacionesCentroCostoGrupoProducto) {
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto = jComboBoxTiposRelacionesCentroCostoGrupoProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCostoGrupoProducto(
			JComboBox jComboBoxTiposAccionesCentroCostoGrupoProducto) {
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto = jComboBoxTiposAccionesCentroCostoGrupoProducto;
	}
	
	public void setBorderResaltarTiposRelacionesCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCentroCostoGrupoProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCentroCostoGrupoProducto() {
	//	return jCheckBoxConGraficoDinamicoCentroCostoGrupoProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoCentroCostoGrupoProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoCentroCostoGrupoProducto) {
	//	this.jCheckBoxConGraficoDinamicoCentroCostoGrupoProducto = jCheckBoxConGraficoDinamicoCentroCostoGrupoProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCentroCostoGrupoProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCentroCostoGrupoProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCentroCostoGrupoProducto .setBorder(borderResaltar);		
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
		this.centrocostogrupoproductoSessionBean=new CentroCostoGrupoProductoSessionBean();
		
		this.centrocostogrupoproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostogrupoproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoGrupoProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoGrupoProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo Grupo Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		CentroCostoGrupoProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CentroCostoGrupoProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCentroCostoGrupoProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"nuevo","nuevo","Nuevo"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"duplicar","duplicar","Duplicar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"copiar","copiar","Copiar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"ver_form","ver_form","Ver"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"recargar","recargar","Recargar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCentroCostoGrupoProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCentroCostoGrupoProducto,this.jTtoolBarCentroCostoGrupoProducto,
							"cerrar","cerrar","Salir"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCentroCostoGrupoProducto;
			
				this.jButtonProcesarInformacionToolBarCentroCostoGrupoProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCentroCostoGrupoProducto;
				
		//protected JButton jButtonModificarToolBarCentroCostoGrupoProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCentroCostoGrupoProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCentroCostoGrupoProducto=new JMenuMe("General");
		this.jmenuArchivoCentroCostoGrupoProducto=new JMenuMe("Archivo");
		this.jmenuAccionesCentroCostoGrupoProducto=new JMenuMe("Acciones");
		this.jmenuDatosCentroCostoGrupoProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCostoGrupoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCostoGrupoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCostoGrupoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCentroCostoGrupoProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCentroCostoGrupoProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCentroCostoGrupoProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCentroCostoGrupoProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCostoGrupoProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCostoGrupoProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCentroCostoGrupoProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCentroCostoGrupoProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCentroCostoGrupoProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCentroCostoGrupoProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCentroCostoGrupoProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCentroCostoGrupoProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCostoGrupoProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCostoGrupoProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCostoGrupoProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCentroCostoGrupoProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCentroCostoGrupoProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCentroCostoGrupoProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCentroCostoGrupoProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCentroCostoGrupoProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCentroCostoGrupoProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCentroCostoGrupoProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCentroCostoGrupoProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCentroCostoGrupoProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCentroCostoGrupoProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCentroCostoGrupoProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCentroCostoGrupoProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCentroCostoGrupoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCentroCostoGrupoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCentroCostoGrupoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCostoGrupoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCostoGrupoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCostoGrupoProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCentroCostoGrupoProducto.add(this.jMenuItemCerrarCentroCostoGrupoProducto);
			
			this.jmenuAccionesCentroCostoGrupoProducto.add(this.jMenuItemNuevoCentroCostoGrupoProducto);
			this.jmenuAccionesCentroCostoGrupoProducto.add(this.jMenuItemNuevoGuardarCambiosCentroCostoGrupoProducto);
			this.jmenuAccionesCentroCostoGrupoProducto.add(this.jMenuItemNuevoRelacionesCentroCostoGrupoProducto);
			this.jmenuAccionesCentroCostoGrupoProducto.add(this.jMenuItemGuardarCambiosTablaCentroCostoGrupoProducto);		
			this.jmenuAccionesCentroCostoGrupoProducto.add(this.jMenuItemDuplicarCentroCostoGrupoProducto);		
			this.jmenuAccionesCentroCostoGrupoProducto.add(this.jMenuItemCopiarCentroCostoGrupoProducto);		
			this.jmenuAccionesCentroCostoGrupoProducto.add(this.jMenuItemVerFormCentroCostoGrupoProducto);		
			
			this.jmenuDatosCentroCostoGrupoProducto.add(this.jMenuItemRecargarInformacionCentroCostoGrupoProducto);				
			this.jmenuDatosCentroCostoGrupoProducto.add(this.jMenuItemAnterioresCentroCostoGrupoProducto);				
			this.jmenuDatosCentroCostoGrupoProducto.add(this.jMenuItemSiguientesCentroCostoGrupoProducto);				
			this.jmenuDatosCentroCostoGrupoProducto.add(this.jMenuItemAbrirOrderByCentroCostoGrupoProducto);				
			this.jmenuDatosCentroCostoGrupoProducto.add(this.jMenuItemMostrarOcultarCentroCostoGrupoProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCentroCostoGrupoProducto.add(this.jMenuItemGuardarCambiosCentroCostoGrupoProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCentroCostoGrupoProducto.add(this.jmenuArchivoCentroCostoGrupoProducto);		
			this.jmenuBarCentroCostoGrupoProducto.add(this.jmenuAccionesCentroCostoGrupoProducto);		
			this.jmenuBarCentroCostoGrupoProducto.add(this.jmenuDatosCentroCostoGrupoProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCentroCostoGrupoProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCentroCostoGrupoProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setToolTipText("Buscar Por Centro Costo Por Linea ");
		this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setToolTipText("Buscar Por Centro Costo Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto,"buscar_button","Buscar Por Centro Costo Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto = new JLabelMe();
		jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setText("Centro Costo :");
		jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setToolTipText("Centro Costo");
		jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.setToolTipText("Buscar");
		this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto.setFocusable(false);

	
		jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto = new JLabelMe();
		jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setText("Linea :");
		jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setToolTipText("Linea");
		jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoCentroCostoGrupoProducto.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonFK_IdCentroCostoCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonFK_IdCentroCostoCentroCostoGrupoProducto.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoCentroCostoGrupoProducto,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto.setFocusable(false);

		this.jPanelFK_IdLineaCentroCostoGrupoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaCentroCostoGrupoProducto.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaCentroCostoGrupoProducto= new JButtonMe();
		this.jButtonFK_IdLineaCentroCostoGrupoProducto.setText("Buscar");
		this.jButtonFK_IdLineaCentroCostoGrupoProducto.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaCentroCostoGrupoProducto,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto = new JLabelMe();
		jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto.setText("Linea :");
		jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCentroCostoGrupoProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCentroCostoGrupoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCentroCostoGrupoProducto = new CentroCostoGrupoProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Centro Costo Grupo Producto DATOS");
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto = new CentroCostoGrupoProductoDetalleFormJInternalFrame(jDesktopPane,this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones(),this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCentroCostoGrupoProducto = null;//new CentroCostoGrupoProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCostoGrupoProducto= new GridBagLayout();
		
		
		this.jTableDatosCentroCostoGrupoProducto = new JTableMe();      
		
		String sToolTipCentroCostoGrupoProducto="";
		sToolTipCentroCostoGrupoProducto=CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCostoGrupoProducto+="(Facturacion.CentroCostoGrupoProducto)";
		}
		
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCostoGrupoProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCentroCostoGrupoProducto.setToolTipText(sToolTipCentroCostoGrupoProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCentroCostoGrupoProducto);
		this.jTableDatosCentroCostoGrupoProducto.setAutoCreateRowSorter(true);
		this.jTableDatosCentroCostoGrupoProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCentroCostoGrupoProducto.setRowSelectionAllowed(true);
		this.jTableDatosCentroCostoGrupoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCentroCostoGrupoProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonDuplicarCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonCopiarCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonVerFormCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonCerrarCentroCostoGrupoProducto = new JButtonMe();
		
		this.jScrollPanelDatosCentroCostoGrupoProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralCentroCostoGrupoProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo Grupo Producto";
		
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Grupo Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCostoGrupoProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCostoGrupoProducto.setToolTipText("Acciones");
        this.jPanelAccionesCentroCostoGrupoProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto=new ReporteDinamicoJInternalFrame(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCentroCostoGrupoProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCentroCostoGrupoProducto=new ImportacionJInternalFrame(CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCentroCostoGrupoProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCentroCostoGrupoProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByCentroCostoGrupoProducto.setText("Orden");
		this.jButtonAbrirOrderByCentroCostoGrupoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCostoGrupoProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCostoGrupoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoGrupoProducto,false,this);
			
			//this.cargarOrderByCentroCostoGrupoProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCostoGrupoProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoGrupoProducto,true,this);
			
			//this.cargarOrderByCentroCostoGrupoProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCentroCostoGrupoProducto.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosCentroCostoGrupoProducto.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosCentroCostoGrupoProducto.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosCentroCostoGrupoProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCostoGrupoProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCostoGrupoProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCentroCostoGrupoProducto.setText("Nuevo");
		this.jButtonDuplicarCentroCostoGrupoProducto.setText("Duplicar");
		this.jButtonCopiarCentroCostoGrupoProducto.setText("Copiar");
		this.jButtonVerFormCentroCostoGrupoProducto.setText("Ver");
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.setText("Guardar");
		this.jButtonCerrarCentroCostoGrupoProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCostoGrupoProducto,"nuevo_button","Nuevo",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCentroCostoGrupoProducto,"duplicar_button","Duplicar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCentroCostoGrupoProducto,"copiar_button","Copiar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCentroCostoGrupoProducto,"ver_form","Ver",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCentroCostoGrupoProducto,"nuevorelaciones_button","Nuevo Rel",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto,"guardarcambiostabla_button","Guardar",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCostoGrupoProducto,"cerrar_button","Salir",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCentroCostoGrupoProducto.setToolTipText("Nuevo"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCentroCostoGrupoProducto.setToolTipText("Duplicar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCentroCostoGrupoProducto.setToolTipText("Copiar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCentroCostoGrupoProducto.setToolTipText("Ver"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto.setToolTipText("Nuevo Rel"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.setToolTipText("Guardar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCostoGrupoProducto.setToolTipText("Salir"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCostoGrupoProducto";
		inputMap = this.jButtonNuevoCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCostoGrupoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCostoGrupoProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarCentroCostoGrupoProducto";
		inputMap = this.jButtonDuplicarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCentroCostoGrupoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCentroCostoGrupoProducto"));
		
		//COPIAR
		sMapKey = "CopiarCentroCostoGrupoProducto";
		inputMap = this.jButtonCopiarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCentroCostoGrupoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCentroCostoGrupoProducto"));
		
		//VEr FORM
		sMapKey = "VerFormCentroCostoGrupoProducto";
		inputMap = this.jButtonVerFormCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCentroCostoGrupoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCentroCostoGrupoProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCentroCostoGrupoProducto";
		inputMap = this.jButtonNuevoRelacionesCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCentroCostoGrupoProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCentroCostoGrupoProducto";
		inputMap = this.jButtonModificarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCentroCostoGrupoProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCentroCostoGrupoProducto";
		inputMap = this.jButtonCerrarCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCostoGrupoProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCostoGrupoProducto";
		inputMap = this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCostoGrupoProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CentroCostoGrupoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CentroCostoGrupoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CentroCostoGrupoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CentroCostoGrupoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CentroCostoGrupoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCentroCostoGrupoProducto.setName("jPanelParametrosReportesCentroCostoGrupoProducto"); 
		
		this.jPanelParametrosReportesAccionesCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCentroCostoGrupoProducto.setName("jPanelParametrosReportesAccionesCentroCostoGrupoProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.setText("Recargar");
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.setToolTipText("Recargar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCentroCostoGrupoProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonProcesarInformacionCentroCostoGrupoProducto.setText("Procesar");
		this.jButtonProcesarInformacionCentroCostoGrupoProducto.setToolTipText("Procesar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCentroCostoGrupoProducto.setVisible(false);
			
		this.jButtonProcesarInformacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.setText("TIPO");       
		this.jComboBoxTiposReportesCentroCostoGrupoProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.setText("Accion");
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setText("Accion");
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCentroCostoGrupoProducto = new JLabelMe();
		
		this.jLabelAccionesCentroCostoGrupoProducto.setText("Acciones");		
		this.jLabelAccionesCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCentroCostoGrupoProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCentroCostoGrupoProducto = new JButtonMe();
		//this.jButtonAnterioresCentroCostoGrupoProducto.setText("<<");
        this.jButtonAnterioresCentroCostoGrupoProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCentroCostoGrupoProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCentroCostoGrupoProducto = new JButtonMe();
		//this.jButtonSiguientesCentroCostoGrupoProducto.setText(">>");
        this.jButtonSiguientesCentroCostoGrupoProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCentroCostoGrupoProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto,"nuevoguardarcambios_button","Nue",this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCentroCostoGrupoProducto";
		inputMap = this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCentroCostoGrupoProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCentroCostoGrupoProducto";
		inputMap = this.jButtonRecargarInformacionCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCentroCostoGrupoProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCentroCostoGrupoProducto";
		inputMap = this.jButtonSiguientesCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCentroCostoGrupoProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCentroCostoGrupoProducto";
		inputMap = this.jButtonAnterioresCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCentroCostoGrupoProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCentroCostoGrupoProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCentroCostoGrupoProducto.setMinimumSize(new Dimension(this.getWidth(),CentroCostoGrupoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoGrupoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCostoGrupoProducto.setMaximumSize(new Dimension(this.getWidth(),CentroCostoGrupoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoGrupoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCostoGrupoProducto.setPreferredSize(new Dimension(this.getWidth(),CentroCostoGrupoProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoGrupoProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCentroCostoGrupoProducto = new GridBagLayout();

			this.jPanelPaginacionCentroCostoGrupoProducto.setLayout(gridaBagLayoutPaginacionCentroCostoGrupoProducto);						
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonAnterioresCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
					
						
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
			
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonNuevoGuardarCambiosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
						
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonSiguientesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonNuevoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
						
			
			
			if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
				this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonGuardarCambiosTablaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			}
			
			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonDuplicarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonCopiarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonVerFormCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCentroCostoGrupoProducto.add(this.jButtonCerrarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
		
		
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCentroCostoGrupoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCostoGrupoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCostoGrupoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCostoGrupoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoGrupoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCostoGrupoProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCentroCostoGrupoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCentroCostoGrupoProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CentroCostoGrupoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CentroCostoGrupoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CentroCostoGrupoProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CentroCostoGrupoProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCentroCostoGrupoProducto.setLayout(gridaBagParametrosReportesCentroCostoGrupoProducto);
			this.jPanelParametrosReportesAccionesCentroCostoGrupoProducto.setLayout(gridaBagParametrosReportesAccionesCentroCostoGrupoProducto);
			
			
			this.jPanelParametrosAuxiliar1CentroCostoGrupoProducto.setLayout(gridaBagParametrosAuxiliar1CentroCostoGrupoProducto);
			this.jPanelParametrosAuxiliar2CentroCostoGrupoProducto.setLayout(gridaBagParametrosAuxiliar2CentroCostoGrupoProducto);
			this.jPanelParametrosAuxiliar3CentroCostoGrupoProducto.setLayout(gridaBagParametrosAuxiliar3CentroCostoGrupoProducto);
			this.jPanelParametrosAuxiliar4CentroCostoGrupoProducto.setLayout(gridaBagParametrosAuxiliar4CentroCostoGrupoProducto);
			//this.jPanelParametrosAuxiliar5CentroCostoGrupoProducto.setLayout(gridaBagParametrosAuxiliar2CentroCostoGrupoProducto);			
			
			
			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jButtonRecargarInformacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoGrupoProducto.add(this.jComboBoxTiposPaginacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoGrupoProducto.add(this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoGrupoProducto.add(this.jComboBoxTiposArchivosReportesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jPanelParametrosAuxiliar1CentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CentroCostoGrupoProducto.add(this.jComboBoxTiposReportesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jPanelParametrosAuxiliar4CentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jComboBoxTiposReportesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jCheckBoxGenerarReporteCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jPanelParametrosAuxiliar2CentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jLabelAccionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jButtonAbrirOrderByCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jComboBoxTiposSeleccionarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
			
			
			/*
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoGrupoProducto.add(this.jCheckBoxSeleccionarTodosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);															
				
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoGrupoProducto.add(this.jCheckBoxSeleccionadosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jPanelParametrosAuxiliar3CentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jComboBoxTiposAccionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
	
				
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoGrupoProducto.add(this.jTextFieldValorCampoGeneralCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCentroCostoGrupoProducto = new GridBagLayout();

			this.jScrollPanelDatosCentroCostoGrupoProducto.setLayout(gridaBagLayoutDatosCentroCostoGrupoProducto);
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
			
			this.jScrollPanelDatosCentroCostoGrupoProducto.add(this.jTableDatosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCentroCostoGrupoProducto.setViewportView(this.jTableDatosCentroCostoGrupoProducto);
		this.jTableDatosCentroCostoGrupoProducto.setFillsViewportHeight(true);
		this.jTableDatosCentroCostoGrupoProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCentroCostoGrupoProducto= new GridBagLayout();
		this.jPanelAccionesCentroCostoGrupoProducto.setLayout(gridaBagLayoutAccionesCentroCostoGrupoProducto);
		
		
		/*	
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
			
		this.jPanelAccionesCentroCostoGrupoProducto.add(this.jButtonNuevoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.setLayout(gridaBagLayoutBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.add(jLabelid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
		jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.add(jComboBoxid_centro_costoBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);


		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.add(this.jButtonBuscarBusquedaPorIdCentroCostoPorIdLineaid_centro_costoCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);


		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.add(jLabelid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
		jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.add(jComboBoxid_lineaBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 2;
		gridBagConstraintsCentroCostoGrupoProducto.gridx =1;
		jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto.add(jButtonBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		jTabbedPaneBusquedasCentroCostoGrupoProducto.addTab("1.-Por Centro Costo Por Linea ", jPanelBusquedaPorIdCentroCostoPorIdLineaCentroCostoGrupoProducto);
		jTabbedPaneBusquedasCentroCostoGrupoProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoCentroCostoGrupoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoCentroCostoGrupoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCostoGrupoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCostoGrupoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoCentroCostoGrupoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoCentroCostoGrupoProducto.setLayout(gridaBagLayoutFK_IdCentroCostoCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		jPanelFK_IdCentroCostoCentroCostoGrupoProducto.add(jLabelid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
		jPanelFK_IdCentroCostoCentroCostoGrupoProducto.add(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);


		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		jPanelFK_IdCentroCostoCentroCostoGrupoProducto.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
		gridBagConstraintsCentroCostoGrupoProducto.gridx =1;
		jPanelFK_IdCentroCostoCentroCostoGrupoProducto.add(jButtonFK_IdCentroCostoCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		jTabbedPaneBusquedasCentroCostoGrupoProducto.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoCentroCostoGrupoProducto);
		jTabbedPaneBusquedasCentroCostoGrupoProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLineaCentroCostoGrupoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdLineaCentroCostoGrupoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaCentroCostoGrupoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaCentroCostoGrupoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaCentroCostoGrupoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaCentroCostoGrupoProducto.setLayout(gridaBagLayoutFK_IdLineaCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		jPanelFK_IdLineaCentroCostoGrupoProducto.add(jLabelid_lineaFK_IdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 0;
		gridBagConstraintsCentroCostoGrupoProducto.gridx = 1;
		jPanelFK_IdLineaCentroCostoGrupoProducto.add(jComboBoxid_lineaFK_IdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoGrupoProducto.gridy = 1;
		gridBagConstraintsCentroCostoGrupoProducto.gridx =1;
		jPanelFK_IdLineaCentroCostoGrupoProducto.add(jButtonFK_IdLineaCentroCostoGrupoProducto, gridBagConstraintsCentroCostoGrupoProducto);

		jTabbedPaneBusquedasCentroCostoGrupoProducto.addTab("3.-Por Linea ", jPanelFK_IdLineaCentroCostoGrupoProducto);
		jTabbedPaneBusquedasCentroCostoGrupoProducto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCostoGrupoProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCostoGrupoProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();						
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;		
			//this.gridBagConstraintsCentroCostoGrupoProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;		
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCentroCostoGrupoProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;		
			this.gridBagConstraintsCentroCostoGrupoProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCentroCostoGrupoProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);								
		
		
		/*
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		*/		
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =0;
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCostoGrupoProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
				
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CentroCostoGrupoProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCentroCostoGrupoProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCostoGrupoProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosCentroCostoGrupoProducto.setLayout(gridaBagLayoutBusquedasParametrosCentroCostoGrupoProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
			
			
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
			
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCentroCostoGrupoProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCentroCostoGrupoProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCentroCostoGrupoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.setName("jPanelReporteDinamicoCentroCostoGrupoProducto"); 
		
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.setLayout(gridaBagLayoutReporteDinamicoCentroCostoGrupoProducto);
		
		
		this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCostoGrupoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Grupo Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCentroCostoGrupoProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteCentroCostoGrupoProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jLabelColumnasSelectReporteCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCentroCostoGrupoProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteCentroCostoGrupoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCentroCostoGrupoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCentroCostoGrupoProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCostoGrupoProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCostoGrupoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCentroCostoGrupoProducto=new JScrollPane(this.jListColumnasSelectReporteCentroCostoGrupoProducto);
			
			this.jScrollColumnasSelectReporteCentroCostoGrupoProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCostoGrupoProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCostoGrupoProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jListColumnasSelectReporteCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jScrollColumnasSelectReporteCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCentroCostoGrupoProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteCentroCostoGrupoProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCentroCostoGrupoProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteCentroCostoGrupoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCentroCostoGrupoProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCentroCostoGrupoProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCostoGrupoProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCostoGrupoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCentroCostoGrupoProducto=new JScrollPane(this.jListRelacionesSelectReporteCentroCostoGrupoProducto);
			
			this.jScrollRelacionesSelectReporteCentroCostoGrupoProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCostoGrupoProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCostoGrupoProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCentroCostoGrupoProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCentroCostoGrupoProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoCentroCostoGrupoProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCentroCostoGrupoProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCentroCostoGrupoProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jLabelGenerarExcelReporteDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto.setToolTipText("Generar EXCEL"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jButtonGenerarExcelReporteDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jComboBoxTiposReportesDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCentroCostoGrupoProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCentroCostoGrupoProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jLabelTiposArchivoReporteDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jComboBoxTiposArchivosReportesDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCentroCostoGrupoProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCentroCostoGrupoProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCentroCostoGrupoProducto.setToolTipText("Generar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jButtonGenerarReporteDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCentroCostoGrupoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCentroCostoGrupoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCentroCostoGrupoProducto.setToolTipText("Cancelar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoGrupoProducto.add(this.jButtonCerrarReporteDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCentroCostoGrupoProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto= new JScrollPane(jPanelReporteDinamicoCentroCostoGrupoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Grupo Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCentroCostoGrupoProducto);
		this.jInternalFrameReporteDinamicoCentroCostoGrupoProducto.getContentPane().add(this.jScrollPanelReporteDinamicoCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCentroCostoGrupoProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCentroCostoGrupoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCentroCostoGrupoProducto.setName("jPanelImportacionCentroCostoGrupoProducto"); 
		
		this.jPanelImportacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCentroCostoGrupoProducto.setLayout(gridaBagLayoutImportacionCentroCostoGrupoProducto);
		
		
		this.jInternalFrameImportacionCentroCostoGrupoProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCentroCostoGrupoProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCentroCostoGrupoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCostoGrupoProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCentroCostoGrupoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCostoGrupoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCostoGrupoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setResizable(true);
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setClosable(true);
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCentroCostoGrupoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCostoGrupoProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCostoGrupoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setResizable(true);
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setClosable(true);
	    this.jInternalFrameImportacionCentroCostoGrupoProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Grupo Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCentroCostoGrupoProducto = new JLabelMe();

		this.jLabelArchivoImportacionCentroCostoGrupoProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCostoGrupoProducto.add(this.jLabelArchivoImportacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCentroCostoGrupoProducto = new JFileChooser();		
		this.jFileChooserImportacionCentroCostoGrupoProducto.setToolTipText("ESCOGER ARCHIVO"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonAbrirImportacionCentroCostoGrupoProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCentroCostoGrupoProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCentroCostoGrupoProducto.setToolTipText("Generar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoGrupoProducto.add(this.jButtonAbrirImportacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCentroCostoGrupoProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionCentroCostoGrupoProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCostoGrupoProducto.add(this.jLabelPathArchivoImportacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCentroCostoGrupoProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCentroCostoGrupoProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCostoGrupoProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCostoGrupoProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoGrupoProducto.add(this.jTextFieldPathArchivoImportacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonGenerarImportacionCentroCostoGrupoProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCentroCostoGrupoProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCentroCostoGrupoProducto.setToolTipText("Generar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoGrupoProducto.add(this.jButtonGenerarImportacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCentroCostoGrupoProducto = new JButtonMe();
		this.jButtonCerrarImportacionCentroCostoGrupoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCentroCostoGrupoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCentroCostoGrupoProducto.setToolTipText("Cancelar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoGrupoProducto.add(this.jButtonCerrarImportacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCentroCostoGrupoProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionCentroCostoGrupoProducto= new JScrollPane(jPanelImportacionCentroCostoGrupoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCentroCostoGrupoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCentroCostoGrupoProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCentroCostoGrupoProducto);
		this.jInternalFrameImportacionCentroCostoGrupoProducto.getContentPane().add(this.jScrollPanelImportacionCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCentroCostoGrupoProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCentroCostoGrupoProducto = new JButtonMe();
			this.jButtonAbrirOrderByCentroCostoGrupoProducto.setText("Orden");
			this.jButtonAbrirOrderByCentroCostoGrupoProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCostoGrupoProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCentroCostoGrupoProducto";
			inputMap = this.jButtonAbrirOrderByCentroCostoGrupoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCentroCostoGrupoProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCentroCostoGrupoProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByCentroCostoGrupoProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCentroCostoGrupoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCentroCostoGrupoProducto.setName("jPanelOrderByCentroCostoGrupoProducto"); 
			
			this.jPanelOrderByCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCentroCostoGrupoProducto.setLayout(gridaBagLayoutOrderByCentroCostoGrupoProducto);
			
			
			this.jTableDatosCentroCostoGrupoProductoOrderBy = new JTableMe();        
			this.jTableDatosCentroCostoGrupoProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCentroCostoGrupoProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCentroCostoGrupoProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCentroCostoGrupoProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCentroCostoGrupoProductoOrderBy.setViewportView(this.jTableDatosCentroCostoGrupoProductoOrderBy);
			this.jTableDatosCentroCostoGrupoProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCentroCostoGrupoProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCentroCostoGrupoProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCentroCostoGrupoProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCentroCostoGrupoProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCentroCostoGrupoProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setTitle("Orden");
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setResizable(true);
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setClosable(true);
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCentroCostoGrupoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Grupo Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCentroCostoGrupoProducto.ipady =150;
				
			this.jPanelOrderByCentroCostoGrupoProducto.add(jScrollPanelDatosCentroCostoGrupoProductoOrderBy, this.gridBagConstraintsCentroCostoGrupoProducto);//this.jTableDatosCentroCostoGrupoProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCentroCostoGrupoProducto = new JButtonMe();
			this.jButtonCerrarOrderByCentroCostoGrupoProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCentroCostoGrupoProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCentroCostoGrupoProducto.setToolTipText("Cancelar"+" "+CentroCostoGrupoProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCentroCostoGrupoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCentroCostoGrupoProducto.add(this.jButtonCerrarOrderByCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCentroCostoGrupoProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByCentroCostoGrupoProducto= new JScrollPane(jPanelOrderByCentroCostoGrupoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCentroCostoGrupoProducto = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoGrupoProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsCentroCostoGrupoProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCostoGrupoProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCentroCostoGrupoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCentroCostoGrupoProducto);
			
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getContentPane().add(this.jScrollPanelOrderByCentroCostoGrupoProducto, this.gridBagConstraintsCentroCostoGrupoProducto);			
		
		} else {
			this.jButtonAbrirOrderByCentroCostoGrupoProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.centrocostogrupoproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCentroCostoGrupoProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCentroCostoGrupoProducto.getRowHeight();//CentroCostoGrupoProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto.isSelected()) {
					iHeightTable=CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCostoGrupoProducto.isSelected()) {
					iHeightTable=CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoGrupoProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCentroCostoGrupoProducto!=null && this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.centrocostogrupoproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCentroCostoGrupoProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCentroCostoGrupoProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCostoGrupoProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCostoGrupoProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=centrocostogrupoproductoLogic.getCentroCostoGrupoProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostogrupoproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CentroCostoGrupoProducto> TraerCentroCostoGrupoProductoBeans(List<CentroCostoGrupoProducto> centrocostogrupoproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CentroCostoGrupoProducto centrocostogrupoproducto:centrocostogrupoproductos) {
					
				if(!(CentroCostoGrupoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CentroCostoGrupoProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					centrocostogrupoproducto.setsDetalleGeneralEntityReporte(CentroCostoGrupoProductoConstantesFunciones.getCentroCostoGrupoProductoDescripcion(centrocostogrupoproducto));
										
						
					
						
					
				} else  {
							
					//centrocostogrupoproducto.setsDetalleGeneralEntityReporte(centrocostogrupoproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//centrocostogrupoproductobeans.add(centrocostogrupoproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return centrocostogrupoproductos;
    }
	//PARA REPORTES FIN
}
