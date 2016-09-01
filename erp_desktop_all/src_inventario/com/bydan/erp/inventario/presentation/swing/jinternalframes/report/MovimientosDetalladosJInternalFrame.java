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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.inventario.util.report.MovimientosDetalladosConstantesFunciones;

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
public class MovimientosDetalladosJInternalFrame extends MovimientosDetalladosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMovimientosDetallados;
	
	protected JMenuBar jmenuBarMovimientosDetallados;
	
	protected JMenu jmenuMovimientosDetallados;
	protected JMenu jmenuDatosMovimientosDetallados;
	protected JMenu jmenuArchivoMovimientosDetallados;
	protected JMenu jmenuAccionesMovimientosDetallados;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientosDetallados;	
	protected GridBagConstraints gridBagConstraintsMovimientosDetallados;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MovimientosDetalladosDetalleFormJInternalFrame jInternalFrameDetalleFormMovimientosDetallados;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMovimientosDetallados;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMovimientosDetallados;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

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
	
	public MovimientosDetalladosSessionBean movimientosdetalladosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MovimientosDetallados> movimientosdetalladoss;		
	public List<MovimientosDetallados> movimientosdetalladossEliminados;	
	public List<MovimientosDetallados> movimientosdetalladossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMovimientosDetallados;		
	protected JButton jButtonAbrirOrderByMovimientosDetallados;
	
	
	//protected JPanel jPanelOrderByMovimientosDetallados;
	//public JScrollPane jScrollPanelOrderByMovimientosDetallados;	
	//protected JButton jButtonCerrarOrderByMovimientosDetallados;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MovimientosDetalladosLogic movimientosdetalladosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMovimientosDetallados;
	public JScrollPane jScrollPanelDatosEdicionMovimientosDetallados;
	public JScrollPane jScrollPanelDatosGeneralMovimientosDetallados;
    
	
	
	//public JScrollPane jScrollPanelDatosMovimientosDetalladosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMovimientosDetallados;
	//public JScrollPane jScrollPanelImportacionMovimientosDetallados;
	
	
	
	protected JPanel jPanelAccionesMovimientosDetallados;
	
    protected JPanel jPanelPaginacionMovimientosDetallados;
    protected JPanel jPanelParametrosReportesMovimientosDetallados;
	protected JPanel jPanelParametrosReportesAccionesMovimientosDetallados;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MovimientosDetallados;
	protected JPanel jPanelParametrosAuxiliar2MovimientosDetallados;
	protected JPanel jPanelParametrosAuxiliar3MovimientosDetallados;
	protected JPanel jPanelParametrosAuxiliar4MovimientosDetallados;
	//protected JPanel jPanelParametrosAuxiliar5MovimientosDetallados;
	
	
	
	//protected JPanel jPanelReporteDinamicoMovimientosDetallados;
	//protected JPanel jPanelImportacionMovimientosDetallados;
	
	
	public JTable jTableDatosMovimientosDetallados;
	
	
	
	//public JTable jTableDatosMovimientosDetalladosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMovimientosDetallados;
	protected JButton jButtonDuplicarMovimientosDetallados;
	protected JButton jButtonCopiarMovimientosDetallados;
	protected JButton jButtonVerFormMovimientosDetallados;
	protected JButton jButtonNuevoRelacionesMovimientosDetallados;
	protected JButton jButtonModificarMovimientosDetallados;
	
    protected JButton jButtonGuardarCambiosTablaMovimientosDetallados;
	protected JButton jButtonCerrarMovimientosDetallados;
	
	
	protected JButton jButtonRecargarInformacionMovimientosDetallados;
	protected JButton jButtonProcesarInformacionMovimientosDetallados;
	
	
	protected JButton jButtonAnterioresMovimientosDetallados;
	protected JButton jButtonSiguientesMovimientosDetallados;
	protected JButton jButtonNuevoGuardarCambiosMovimientosDetallados;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMovimientosDetallados;
	//protected JButton jButtonCerrarReporteDinamicoMovimientosDetallados;
	//protected JButton jButtonGenerarExcelReporteDinamicoMovimientosDetallados;	
	
	
	
	//protected JButton jButtonAbrirImportacionMovimientosDetallados;
	//protected JButton jButtonGenerarImportacionMovimientosDetallados;
	//protected JButton jButtonCerrarImportacionMovimientosDetallados;
	//protected JFileChooser jFileChooserImportacionMovimientosDetallados;
	//protected File fileImportacionMovimientosDetallados;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientosDetallados;
	protected JButton jButtonDuplicarToolBarMovimientosDetallados;
	protected JButton jButtonNuevoRelacionesToolBarMovimientosDetallados;
	
	
	public JButton jButtonGuardarCambiosToolBarMovimientosDetallados;
	protected JButton jButtonCopiarToolBarMovimientosDetallados;
	protected JButton jButtonVerFormToolBarMovimientosDetallados;
	public JButton jButtonGuardarCambiosTablaToolBarMovimientosDetallados;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientosDetallados;
	protected JButton jButtonCerrarToolBarMovimientosDetallados;
	
	protected JButton jButtonRecargarInformacionToolBarMovimientosDetallados;
	protected JButton jButtonProcesarInformacionToolBarMovimientosDetallados;
	protected JButton jButtonAnterioresToolBarMovimientosDetallados;
	protected JButton jButtonSiguientesToolBarMovimientosDetallados;
	protected JButton jButtonNuevoGuardarCambiosToolBarMovimientosDetallados;
	protected JButton jButtonAbrirOrderByToolBarMovimientosDetallados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientosDetallados;
	protected JMenuItem jMenuItemDuplicarMovimientosDetallados;
	protected JMenuItem jMenuItemNuevoRelacionesMovimientosDetallados;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMovimientosDetallados;
	protected JMenuItem jMenuItemCopiarMovimientosDetallados;
	protected JMenuItem jMenuItemVerFormMovimientosDetallados;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientosDetallados;
	protected JMenuItem jMenuItemCerrarMovimientosDetallados;
	protected JMenuItem jMenuItemDetalleCerrarMovimientosDetallados;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMovimientosDetallados;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientosDetallados;
	
	protected JMenuItem jMenuItemRecargarInformacionMovimientosDetallados;
	protected JMenuItem jMenuItemProcesarInformacionMovimientosDetallados;
	protected JMenuItem jMenuItemAnterioresMovimientosDetallados;
	protected JMenuItem jMenuItemSiguientesMovimientosDetallados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientosDetallados;
	protected JMenuItem jMenuItemAbrirOrderByMovimientosDetallados;
	protected JMenuItem jMenuItemMostrarOcultarMovimientosDetallados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientosDetallados;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMovimientosDetallados;
	protected JCheckBox jCheckBoxSeleccionadosMovimientosDetallados;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMovimientosDetallados;
	protected JCheckBox jCheckBoxConGraficoReporteMovimientosDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMovimientosDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMovimientosDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMovimientosDetallados;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMovimientosDetallados;
	protected JTextField jTextFieldValorCampoGeneralMovimientosDetallados;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMovimientosDetallados;
	//public JList<Reporte> jListColumnasSelectReporteMovimientosDetallados;
	//public JScrollPane jScrollColumnasSelectReporteMovimientosDetallados;
	
	//public JLabel jLabelRelacionesSelectReporteMovimientosDetallados;
	//public JList<Reporte> jListRelacionesSelectReporteMovimientosDetallados;
	//public JScrollPane jScrollRelacionesSelectReporteMovimientosDetallados;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMovimientosDetallados;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMovimientosDetallados;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMovimientosDetallados;
	//public JLabel jLabelTiposArchivoReporteDinamicoMovimientosDetallados;
	
		
	//public JLabel jLabelArchivoImportacionMovimientosDetallados;	
	//public JLabel jLabelPathArchivoImportacionMovimientosDetallados;
	//protected JTextField jTextFieldPathArchivoImportacionMovimientosDetallados;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMovimientosDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMovimientosDetallados;
	
	//public JLabel jLabelColumnaCategoriaValorMovimientosDetallados;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMovimientosDetallados;
	
	//public JLabel jLabelColumnasValoresGraficoMovimientosDetallados;
	//public JList<Reporte> jListColumnasValoresGraficoMovimientosDetallados;
	//public JScrollPane jScrollColumnasValoresGraficoMovimientosDetallados;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMovimientosDetallados;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMovimientosDetallados;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMovimientosDetallados;
	public JPanel jPanelBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonBusquedaMovimientosDetalladosMovimientosDetallados;
	
	public JPanel jPanelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonid_clienteBusquedaMovimientosDetalladosMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_clienteBusquedaMovimientosDetalladosMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_clienteBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaMovimientosDetalladosMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_transaccionBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonid_lineaBusquedaMovimientosDetalladosMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_lineaBusquedaMovimientosDetalladosMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetalladosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JLabel jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados;
	public JButton jButtonfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetalladosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MovimientosDetalladosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosDetalladosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosDetalladosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientosDetalladosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMovimientosDetallados)	{
		this.jButtonRecargarInformacionMovimientosDetallados = jButtonRecargarInformacionMovimientosDetallados;
	}
	
	public JButton getjButtonProcesarInformacionMovimientosDetallados() {
		return this.jButtonProcesarInformacionMovimientosDetallados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientosDetallados)	{
		this.jButtonProcesarInformacionMovimientosDetallados = jButtonProcesarInformacionMovimientosDetallados;
	}
	
	
	public JButton getjButtonRecargarInformacionMovimientosDetallados() {
		return this.jButtonRecargarInformacionMovimientosDetallados;
	}
	
	
	public List<MovimientosDetallados> getmovimientosdetalladoss() {
		return this.movimientosdetalladoss;
	}

	public void setmovimientosdetalladoss(List<MovimientosDetallados> movimientosdetalladoss) {
		this.movimientosdetalladoss = movimientosdetalladoss;
	}
	
	public List<MovimientosDetallados> getmovimientosdetalladossAux() {
		return this.movimientosdetalladossAux;
	}

	public void setmovimientosdetalladossAux(List<MovimientosDetallados> movimientosdetalladossAux) {
		this.movimientosdetalladossAux = movimientosdetalladossAux;
	}
	
	public List<MovimientosDetallados> getmovimientosdetalladossEliminados() {
		return this.movimientosdetalladossEliminados;
	}

	public void setMovimientosDetalladossEliminados(List<MovimientosDetallados> movimientosdetalladossEliminados) {
		this.movimientosdetalladossEliminados = movimientosdetalladossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMovimientosDetallados() {
		return jComboBoxTiposSeleccionarMovimientosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMovimientosDetallados(
			JComboBox jComboBoxTiposSeleccionarMovimientosDetallados) {
		this.jComboBoxTiposSeleccionarMovimientosDetallados = jComboBoxTiposSeleccionarMovimientosDetallados;
	}
	
	public void setBorderResaltarTiposSeleccionarMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMovimientosDetallados() {
		return jTextFieldValorCampoGeneralMovimientosDetallados;
	}

	public void setjTextFieldValorCampoGeneralMovimientosDetallados(
			JTextField jTextFieldValorCampoGeneralMovimientosDetallados) {
		this.jTextFieldValorCampoGeneralMovimientosDetallados = jTextFieldValorCampoGeneralMovimientosDetallados;
	}

	public void setBorderResaltarValorCampoGeneralMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMovimientosDetallados .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMovimientosDetallados() {
		return this.jCheckBoxSeleccionarTodosMovimientosDetallados;
	}

	public void setjCheckBoxSeleccionarTodosMovimientosDetallados(
			JCheckBox jCheckBoxSeleccionarTodosMovimientosDetallados) {
		this.jCheckBoxSeleccionarTodosMovimientosDetallados = jCheckBoxSeleccionarTodosMovimientosDetallados;
	}

	public void setBorderResaltarSeleccionarTodosMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMovimientosDetallados() {
		return this.jCheckBoxSeleccionadosMovimientosDetallados;
	}

	public void setjCheckBoxSeleccionadosMovimientosDetallados(
			JCheckBox jCheckBoxSeleccionadosMovimientosDetallados) {
		this.jCheckBoxSeleccionadosMovimientosDetallados = jCheckBoxSeleccionadosMovimientosDetallados;
	}
	
	public void setBorderResaltarSeleccionadosMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMovimientosDetallados() {
		return this.jComboBoxTiposArchivosReportesMovimientosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMovimientosDetallados(
			JComboBox jComboBoxTiposArchivosReportesMovimientosDetallados) {
		this.jComboBoxTiposArchivosReportesMovimientosDetallados = jComboBoxTiposArchivosReportesMovimientosDetallados;
	}

	public void setBorderResaltarTiposArchivosReportesMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMovimientosDetallados() {
		return this.jComboBoxTiposReportesMovimientosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMovimientosDetallados(
			JComboBox jComboBoxTiposReportesMovimientosDetallados) {
		this.jComboBoxTiposReportesMovimientosDetallados = jComboBoxTiposReportesMovimientosDetallados;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMovimientosDetallados() {
	//	return jComboBoxTiposReportesDinamicoMovimientosDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMovimientosDetallados(
	//		JComboBox jComboBoxTiposReportesDinamicoMovimientosDetallados) {
	//	this.jComboBoxTiposReportesDinamicoMovimientosDetallados = jComboBoxTiposReportesDinamicoMovimientosDetallados;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMovimientosDetallados() {
	//	return jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMovimientosDetallados(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados = jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados;
	//}
	
	public void setBorderResaltarTiposReportesMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMovimientosDetallados() {
		return this.jComboBoxTiposGraficosReportesMovimientosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMovimientosDetallados(
			JComboBox jComboBoxTiposGraficosReportesMovimientosDetallados) {
		this.jComboBoxTiposGraficosReportesMovimientosDetallados = jComboBoxTiposGraficosReportesMovimientosDetallados;
	}
	
	public void setBorderResaltarTiposGraficosReportesMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMovimientosDetallados() {
		return this.jComboBoxTiposPaginacionMovimientosDetallados;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMovimientosDetallados(
			JComboBox jComboBoxTiposPaginacionMovimientosDetallados) {
		this.jComboBoxTiposPaginacionMovimientosDetallados = jComboBoxTiposPaginacionMovimientosDetallados;
	}
	
	public void setBorderResaltarTiposPaginacionMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMovimientosDetallados() {
		return this.jComboBoxTiposRelacionesMovimientosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientosDetallados() {
		return this.jComboBoxTiposAccionesMovimientosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientosDetallados(
			JComboBox jComboBoxTiposRelacionesMovimientosDetallados) {
		this.jComboBoxTiposRelacionesMovimientosDetallados = jComboBoxTiposRelacionesMovimientosDetallados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientosDetallados(
			JComboBox jComboBoxTiposAccionesMovimientosDetallados) {
		this.jComboBoxTiposAccionesMovimientosDetallados = jComboBoxTiposAccionesMovimientosDetallados;
	}
	
	public void setBorderResaltarTiposRelacionesMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMovimientosDetallados() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMovimientosDetallados .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMovimientosDetallados() {
	//	return jCheckBoxConGraficoDinamicoMovimientosDetallados;
	//}

	//public void setjCheckBoxConGraficoDinamicoMovimientosDetallados(
	//		JCheckBox jCheckBoxConGraficoDinamicoMovimientosDetallados) {
	//	this.jCheckBoxConGraficoDinamicoMovimientosDetallados = jCheckBoxConGraficoDinamicoMovimientosDetallados;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMovimientosDetallados() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMovimientosDetallados.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMovimientosDetallados .setBorder(borderResaltar);		
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
		this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
		
		this.movimientosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientosdetalladosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MovimientosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MovimientosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientosDetalladosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientosDetalladosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimientos Detallados MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
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
		
		MovimientosDetalladosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MovimientosDetallados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMovimientosDetallados= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"nuevo","nuevo","Nuevo"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"duplicar","duplicar","Duplicar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"copiar","copiar","Copiar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"ver_form","ver_form","Ver"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"recargar","recargar","Buscar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMovimientosDetallados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMovimientosDetallados,this.jTtoolBarMovimientosDetallados,
							"cerrar","cerrar","Salir"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMovimientosDetallados=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMovimientosDetallados;
			
				this.jButtonProcesarInformacionToolBarMovimientosDetallados=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMovimientosDetallados;
				
		//protected JButton jButtonModificarToolBarMovimientosDetallados;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMovimientosDetallados=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMovimientosDetallados=new JMenuMe("General");
		this.jmenuArchivoMovimientosDetallados=new JMenuMe("Archivo");
		this.jmenuAccionesMovimientosDetallados=new JMenuMe("Acciones");
		this.jmenuDatosMovimientosDetallados=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientosDetallados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientosDetallados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientosDetallados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMovimientosDetallados= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMovimientosDetallados.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMovimientosDetallados,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMovimientosDetallados= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMovimientosDetallados.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMovimientosDetallados,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMovimientosDetallados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientosDetallados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientosDetallados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMovimientosDetallados= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMovimientosDetallados.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMovimientosDetallados,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMovimientosDetallados= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMovimientosDetallados.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMovimientosDetallados,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMovimientosDetallados= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMovimientosDetallados.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMovimientosDetallados,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientosDetallados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientosDetallados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientosDetallados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMovimientosDetallados= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMovimientosDetallados.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMovimientosDetallados,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMovimientosDetallados= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMovimientosDetallados.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMovimientosDetallados,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMovimientosDetallados= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMovimientosDetallados.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMovimientosDetallados,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMovimientosDetallados= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMovimientosDetallados.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMovimientosDetallados,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMovimientosDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMovimientosDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMovimientosDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMovimientosDetallados= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMovimientosDetallados.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMovimientosDetallados,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientosDetallados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientosDetallados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientosDetallados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMovimientosDetallados= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMovimientosDetallados.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMovimientosDetallados,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMovimientosDetallados.add(this.jMenuItemCerrarMovimientosDetallados);
			
			this.jmenuAccionesMovimientosDetallados.add(this.jMenuItemNuevoMovimientosDetallados);
			this.jmenuAccionesMovimientosDetallados.add(this.jMenuItemNuevoGuardarCambiosMovimientosDetallados);
			this.jmenuAccionesMovimientosDetallados.add(this.jMenuItemNuevoRelacionesMovimientosDetallados);
			this.jmenuAccionesMovimientosDetallados.add(this.jMenuItemGuardarCambiosTablaMovimientosDetallados);		
			this.jmenuAccionesMovimientosDetallados.add(this.jMenuItemDuplicarMovimientosDetallados);		
			this.jmenuAccionesMovimientosDetallados.add(this.jMenuItemCopiarMovimientosDetallados);		
			this.jmenuAccionesMovimientosDetallados.add(this.jMenuItemVerFormMovimientosDetallados);		
			
			this.jmenuDatosMovimientosDetallados.add(this.jMenuItemRecargarInformacionMovimientosDetallados);				
			this.jmenuDatosMovimientosDetallados.add(this.jMenuItemAnterioresMovimientosDetallados);				
			this.jmenuDatosMovimientosDetallados.add(this.jMenuItemSiguientesMovimientosDetallados);				
			this.jmenuDatosMovimientosDetallados.add(this.jMenuItemAbrirOrderByMovimientosDetallados);				
			this.jmenuDatosMovimientosDetallados.add(this.jMenuItemMostrarOcultarMovimientosDetallados);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMovimientosDetallados.add(this.jMenuItemGuardarCambiosMovimientosDetallados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMovimientosDetallados.add(this.jmenuArchivoMovimientosDetallados);		
			this.jmenuBarMovimientosDetallados.add(this.jmenuAccionesMovimientosDetallados);		
			this.jmenuBarMovimientosDetallados.add(this.jmenuDatosMovimientosDetallados);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMovimientosDetallados);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMovimientosDetallados() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaMovimientosDetalladosMovimientosDetallados=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Buscar Por Cliente Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaMovimientosDetalladosMovimientosDetallados= new JButtonMe();
		this.jButtonBusquedaMovimientosDetalladosMovimientosDetallados.setText("Buscar");
		this.jButtonBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Buscar Por Cliente Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaMovimientosDetalladosMovimientosDetallados,"buscar_button","Buscar Por Cliente Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaMovimientosDetalladosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setText("Cliente :");
		jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Cliente");
		jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setText("Transaccion :");
		jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Transaccion");
		jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setText("Linea :");
		jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Linea");
		jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasMovimientosDetallados=new JTabbedPane();


		this.jTabbedPaneBusquedasMovimientosDetallados.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));
		this.jTabbedPaneBusquedasMovimientosDetallados.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));
		this.jTabbedPaneBusquedasMovimientosDetallados.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,175)));

		//this.jTabbedPaneBusquedasMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMovimientosDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMovimientosDetallados = new MovimientosDetalladosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Movimientos Detallados DATOS");
			this.jInternalFrameDetalleFormMovimientosDetallados = new MovimientosDetalladosDetalleFormJInternalFrame(jDesktopPane,this.movimientosdetalladosSessionBean.getConGuardarRelaciones(),this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMovimientosDetallados = null;//new MovimientosDetalladosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientosDetallados= new GridBagLayout();
		
		
		this.jTableDatosMovimientosDetallados = new JTableMe();      
		
		String sToolTipMovimientosDetallados="";
		sToolTipMovimientosDetallados=MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientosDetallados+="(Inventario.MovimientosDetallados)";
		}
		
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientosDetallados+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMovimientosDetallados.setToolTipText(sToolTipMovimientosDetallados);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMovimientosDetallados);
		this.jTableDatosMovimientosDetallados.setAutoCreateRowSorter(true);
		this.jTableDatosMovimientosDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMovimientosDetallados.setRowSelectionAllowed(true);
		this.jTableDatosMovimientosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMovimientosDetallados,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMovimientosDetallados = new JButtonMe();
		this.jButtonDuplicarMovimientosDetallados = new JButtonMe();
		this.jButtonCopiarMovimientosDetallados = new JButtonMe();
		this.jButtonVerFormMovimientosDetallados = new JButtonMe();
		this.jButtonNuevoRelacionesMovimientosDetallados = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados = new JButtonMe();
		this.jButtonCerrarMovimientosDetallados = new JButtonMe();
		
		this.jScrollPanelDatosMovimientosDetallados = new JScrollPane();   
        this.jScrollPanelDatosGeneralMovimientosDetallados = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Movimientos Detallados";
		
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Detalladoses" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientosDetallados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientosDetallados.setToolTipText("Acciones");
        this.jPanelAccionesMovimientosDetallados.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMovimientosDetallados=new ReporteDinamicoJInternalFrame(MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMovimientosDetallados();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMovimientosDetallados=new ImportacionJInternalFrame(MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMovimientosDetallados();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMovimientosDetallados = new JButtonMe();
		
		this.jButtonAbrirOrderByMovimientosDetallados.setText("Orden");
		this.jButtonAbrirOrderByMovimientosDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientosDetallados,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosDetallados,false,this);
			
			//this.cargarOrderByMovimientosDetallados(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMovimientosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosDetallados,true,this);
			
			//this.cargarOrderByMovimientosDetallados(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMovimientosDetallados.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosMovimientosDetallados.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosMovimientosDetallados.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosMovimientosDetallados.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientosDetallados.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMovimientosDetallados.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMovimientosDetallados.setText("Nuevo");
		this.jButtonDuplicarMovimientosDetallados.setText("Duplicar");
		this.jButtonCopiarMovimientosDetallados.setText("Copiar");
		this.jButtonVerFormMovimientosDetallados.setText("Ver");
		this.jButtonNuevoRelacionesMovimientosDetallados.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados.setText("Guardar");
		this.jButtonCerrarMovimientosDetallados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientosDetallados,"nuevo_button","Nuevo",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMovimientosDetallados,"duplicar_button","Duplicar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMovimientosDetallados,"copiar_button","Copiar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMovimientosDetallados,"ver_form","Ver",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMovimientosDetallados,"nuevorelaciones_button","Nuevo Rel",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientosDetallados,"guardarcambiostabla_button","Guardar",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientosDetallados,"cerrar_button","Salir",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMovimientosDetallados.setToolTipText("Nuevo"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMovimientosDetallados.setToolTipText("Duplicar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMovimientosDetallados.setToolTipText("Copiar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMovimientosDetallados.setToolTipText("Ver"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMovimientosDetallados.setToolTipText("Nuevo Rel"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados.setToolTipText("Guardar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientosDetallados.setToolTipText("Salir"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientosDetallados";
		inputMap = this.jButtonNuevoMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientosDetallados"));
		
		//DUPLICAR
		sMapKey = "DuplicarMovimientosDetallados";
		inputMap = this.jButtonDuplicarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMovimientosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMovimientosDetallados"));
		
		//COPIAR
		sMapKey = "CopiarMovimientosDetallados";
		inputMap = this.jButtonCopiarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMovimientosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMovimientosDetallados"));
		
		//VEr FORM
		sMapKey = "VerFormMovimientosDetallados";
		inputMap = this.jButtonVerFormMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMovimientosDetallados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMovimientosDetallados"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMovimientosDetallados";
		inputMap = this.jButtonNuevoRelacionesMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMovimientosDetallados"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMovimientosDetallados";
		inputMap = this.jButtonModificarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMovimientosDetallados"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMovimientosDetallados";
		inputMap = this.jButtonCerrarMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientosDetallados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientosDetallados";
		inputMap = this.jButtonGuardarCambiosTablaMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientosDetallados"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MovimientosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MovimientosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MovimientosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MovimientosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MovimientosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMovimientosDetallados.setName("jPanelParametrosReportesMovimientosDetallados"); 
		
		this.jPanelParametrosReportesAccionesMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMovimientosDetallados.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMovimientosDetallados.setName("jPanelParametrosReportesAccionesMovimientosDetallados"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMovimientosDetallados = new JButtonMe();
		this.jButtonRecargarInformacionMovimientosDetallados.setText("Buscar");
		this.jButtonRecargarInformacionMovimientosDetallados.setToolTipText("Buscar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMovimientosDetallados,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionMovimientosDetallados.setVisible(false);
		
		
		this.jButtonProcesarInformacionMovimientosDetallados = new JButtonMe();
		this.jButtonProcesarInformacionMovimientosDetallados.setText("Procesar");
		this.jButtonProcesarInformacionMovimientosDetallados.setToolTipText("Procesar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMovimientosDetallados.setVisible(false);
			
		this.jButtonProcesarInformacionMovimientosDetallados.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientosDetallados.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMovimientosDetallados.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientosDetallados.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMovimientosDetallados.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientosDetallados.setText("TIPO");       
		this.jComboBoxTiposReportesMovimientosDetallados.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMovimientosDetallados.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMovimientosDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMovimientosDetallados.setText("Paginacion");
		this.jComboBoxTiposPaginacionMovimientosDetallados.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMovimientosDetallados.setText("Accion");
		this.jComboBoxTiposRelacionesMovimientosDetallados.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientosDetallados.setText("Accion");
		this.jComboBoxTiposAccionesMovimientosDetallados.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMovimientosDetallados.setText("Accion");
		this.jComboBoxTiposSeleccionarMovimientosDetallados.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMovimientosDetallados=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMovimientosDetallados.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientosDetallados.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMovimientosDetallados.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMovimientosDetallados = new JLabelMe();
		
		this.jLabelAccionesMovimientosDetallados.setText("Acciones");		
		this.jLabelAccionesMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMovimientosDetallados = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMovimientosDetallados.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMovimientosDetallados.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMovimientosDetallados = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMovimientosDetallados.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMovimientosDetallados.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMovimientosDetallados = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMovimientosDetallados.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMovimientosDetallados.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMovimientosDetallados = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMovimientosDetallados.setText("Graf.");
		this.jCheckBoxConGraficoReporteMovimientosDetallados.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMovimientosDetallados = new JButtonMe();
		//this.jButtonAnterioresMovimientosDetallados.setText("<<");
        this.jButtonAnterioresMovimientosDetallados.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMovimientosDetallados,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMovimientosDetallados = new JButtonMe();
		//this.jButtonSiguientesMovimientosDetallados.setText(">>");
        this.jButtonSiguientesMovimientosDetallados.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMovimientosDetallados,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMovimientosDetallados = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMovimientosDetallados.setText("Nue");
        this.jButtonNuevoGuardarCambiosMovimientosDetallados.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMovimientosDetallados,"nuevoguardarcambios_button","Nue",this.movimientosdetalladosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMovimientosDetallados";
		inputMap = this.jButtonNuevoGuardarCambiosMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMovimientosDetallados"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMovimientosDetallados";
		inputMap = this.jButtonRecargarInformacionMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMovimientosDetallados"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMovimientosDetallados";
		inputMap = this.jButtonSiguientesMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMovimientosDetallados"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMovimientosDetallados";
		inputMap = this.jButtonAnterioresMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMovimientosDetallados"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMovimientosDetallados();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMovimientosDetallados.setMinimumSize(new Dimension(this.getWidth(),MovimientosDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientosDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientosDetallados.setMaximumSize(new Dimension(this.getWidth(),MovimientosDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientosDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMovimientosDetallados.setPreferredSize(new Dimension(this.getWidth(),MovimientosDetalladosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MovimientosDetalladosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMovimientosDetallados = new GridBagLayout();

			this.jPanelPaginacionMovimientosDetallados.setLayout(gridaBagLayoutPaginacionMovimientosDetallados);						
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = 0;
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonAnterioresMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
					
						
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMovimientosDetallados.gridy = 0;
			
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonNuevoGuardarCambiosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
						
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMovimientosDetallados.gridy = 0;
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonSiguientesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = 1;
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonNuevoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
						
			
			
			if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
				this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMovimientosDetallados.gridy = 1;
				this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMovimientosDetallados.add(this.jButtonGuardarCambiosTablaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			}
			
			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = 1;
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonDuplicarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = 1;
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonCopiarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = 1;
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonVerFormMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = 1;
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMovimientosDetallados.add(this.jButtonCerrarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		
		this.jButtonRecargarInformacionMovimientosDetallados.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientosDetallados.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMovimientosDetallados.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMovimientosDetallados.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientosDetallados.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMovimientosDetallados.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMovimientosDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientosDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMovimientosDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMovimientosDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientosDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMovimientosDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMovimientosDetallados.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientosDetallados.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMovimientosDetallados.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMovimientosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMovimientosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMovimientosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMovimientosDetallados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientosDetallados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMovimientosDetallados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMovimientosDetallados.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientosDetallados.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMovimientosDetallados.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMovimientosDetallados.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientosDetallados.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMovimientosDetallados.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMovimientosDetallados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientosDetallados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMovimientosDetallados.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMovimientosDetallados.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientosDetallados.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMovimientosDetallados.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMovimientosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMovimientosDetallados = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MovimientosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MovimientosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MovimientosDetallados = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MovimientosDetallados = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMovimientosDetallados.setLayout(gridaBagParametrosReportesMovimientosDetallados);
			this.jPanelParametrosReportesAccionesMovimientosDetallados.setLayout(gridaBagParametrosReportesAccionesMovimientosDetallados);
			
			
			this.jPanelParametrosAuxiliar1MovimientosDetallados.setLayout(gridaBagParametrosAuxiliar1MovimientosDetallados);
			this.jPanelParametrosAuxiliar2MovimientosDetallados.setLayout(gridaBagParametrosAuxiliar2MovimientosDetallados);
			this.jPanelParametrosAuxiliar3MovimientosDetallados.setLayout(gridaBagParametrosAuxiliar3MovimientosDetallados);
			this.jPanelParametrosAuxiliar4MovimientosDetallados.setLayout(gridaBagParametrosAuxiliar4MovimientosDetallados);
			//this.jPanelParametrosAuxiliar5MovimientosDetallados.setLayout(gridaBagParametrosAuxiliar2MovimientosDetallados);			
			
			
			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jButtonRecargarInformacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientosDetallados.add(this.jComboBoxTiposPaginacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientosDetallados.add(this.jCheckBoxConAltoMaximoTablaMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MovimientosDetallados.add(this.jComboBoxTiposArchivosReportesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jPanelParametrosAuxiliar1MovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MovimientosDetallados.add(this.jComboBoxTiposReportesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);																		
			
			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MovimientosDetallados.add(this.jComboBoxTiposGraficosReportesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jPanelParametrosAuxiliar4MovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jComboBoxTiposReportesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jCheckBoxGenerarReporteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jPanelParametrosAuxiliar2MovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jLabelAccionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
				this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMovimientosDetallados.add(this.jButtonAbrirOrderByMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jComboBoxTiposSeleccionarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
			
			
			/*
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jCheckBoxSeleccionarTodosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jCheckBoxConGraficoReporteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientosDetallados.add(this.jCheckBoxSeleccionarTodosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);															
				
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientosDetallados.add(this.jCheckBoxSeleccionadosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);															
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMovimientosDetallados.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MovimientosDetallados.add(this.jCheckBoxConGraficoReporteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jPanelParametrosAuxiliar3MovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMovimientosDetallados.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMovimientosDetallados.add(this.jComboBoxTiposAccionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMovimientosDetallados = new GridBagLayout();

			this.jScrollPanelDatosMovimientosDetallados.setLayout(gridaBagLayoutDatosMovimientosDetallados);
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = 0;
			this.gridBagConstraintsMovimientosDetallados.gridx = 0;
			
			this.jScrollPanelDatosMovimientosDetallados.add(this.jTableDatosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMovimientosDetallados.setViewportView(this.jTableDatosMovimientosDetallados);
		this.jTableDatosMovimientosDetallados.setFillsViewportHeight(true);
		this.jTableDatosMovimientosDetallados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMovimientosDetallados= new GridBagLayout();
		this.jPanelAccionesMovimientosDetallados.setLayout(gridaBagLayoutAccionesMovimientosDetallados);
		
		
		/*	
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = 0;
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
			
		this.jPanelAccionesMovimientosDetallados.add(this.jButtonNuevoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaMovimientosDetalladosMovimientosDetallados= new GridBagLayout();
		gridaBagLayoutBusquedaMovimientosDetalladosMovimientosDetallados.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaMovimientosDetalladosMovimientosDetallados.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaMovimientosDetalladosMovimientosDetallados.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaMovimientosDetalladosMovimientosDetallados.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.setLayout(gridaBagLayoutBusquedaMovimientosDetalladosMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 0;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelid_clienteBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 0;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);


		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 1;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 1;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);


		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 2;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelid_lineaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 2;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);


		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 3;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 3;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);


		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 4;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 4;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);


		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 5;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 5;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);


		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 6;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 6;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);


		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 7;
		gridBagConstraintsMovimientosDetallados.gridx = 0;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jLabelfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 7;
		gridBagConstraintsMovimientosDetallados.gridx = 1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMovimientosDetallados.gridy = 8;
		gridBagConstraintsMovimientosDetallados.gridx =1;
		jPanelBusquedaMovimientosDetalladosMovimientosDetallados.add(jButtonBusquedaMovimientosDetalladosMovimientosDetallados, gridBagConstraintsMovimientosDetallados);

		jTabbedPaneBusquedasMovimientosDetallados.addTab("1.-Por Cliente Por Transaccion Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaMovimientosDetalladosMovimientosDetallados);
		jTabbedPaneBusquedasMovimientosDetallados.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientosDetallados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientosDetallados);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();						
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientosDetallados.gridx = 0;		
			//this.gridBagConstraintsMovimientosDetallados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientosDetallados.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;		
		//this.gridBagConstraintsMovimientosDetallados.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMovimientosDetallados.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMovimientosDetallados);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientosDetallados.gridx = 0;		
			this.gridBagConstraintsMovimientosDetallados.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMovimientosDetallados.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);								
		
		
		/*
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		*/		
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientosDetallados.gridx =0;
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientosDetallados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
				
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMovimientosDetallados= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientosDetallados = new GridBagLayout();
			this.jPanelBusquedasParametrosMovimientosDetallados.setLayout(gridaBagLayoutBusquedasParametrosMovimientosDetallados);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMovimientosDetallados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientosDetallados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosDetallados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientosDetallados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
			
			
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
			
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientosDetallados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMovimientosDetallados;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMovimientosDetallados() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMovimientosDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMovimientosDetallados.setName("jPanelReporteDinamicoMovimientosDetallados"); 
		
		this.jPanelReporteDinamicoMovimientosDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientosDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMovimientosDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMovimientosDetallados.setLayout(gridaBagLayoutReporteDinamicoMovimientosDetallados);
		
		
		this.jInternalFrameReporteDinamicoMovimientosDetallados= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMovimientosDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientosDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMovimientosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMovimientosDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMovimientosDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMovimientosDetallados.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMovimientosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMovimientosDetallados.setResizable(true);
	    this.jInternalFrameReporteDinamicoMovimientosDetallados.setClosable(true);
	    this.jInternalFrameReporteDinamicoMovimientosDetallados.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMovimientosDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientosDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMovimientosDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Detalladoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMovimientosDetallados = new JLabelMe();

		this.jLabelColumnasSelectReporteMovimientosDetallados.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelColumnasSelectReporteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMovimientosDetallados = new JList<Reporte>();
		this.jListColumnasSelectReporteMovimientosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMovimientosDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMovimientosDetallados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientosDetallados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMovimientosDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMovimientosDetallados=new JScrollPane(this.jListColumnasSelectReporteMovimientosDetallados);
			
			this.jScrollColumnasSelectReporteMovimientosDetallados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientosDetallados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMovimientosDetallados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMovimientosDetallados.add(this.jListColumnasSelectReporteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jScrollColumnasSelectReporteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMovimientosDetallados = new JLabelMe();

		this.jLabelRelacionesSelectReporteMovimientosDetallados.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMovimientosDetallados = new JList<Reporte>();
		this.jListRelacionesSelectReporteMovimientosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMovimientosDetallados.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMovimientosDetallados.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientosDetallados.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMovimientosDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMovimientosDetallados=new JScrollPane(this.jListRelacionesSelectReporteMovimientosDetallados);
			
			this.jScrollRelacionesSelectReporteMovimientosDetallados.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientosDetallados.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMovimientosDetallados.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMovimientosDetallados = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados = new JComboBoxMe();
		this.jListColumnasValoresGraficoMovimientosDetallados = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMovimientosDetallados = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMovimientosDetallados.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMovimientosDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientosDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMovimientosDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMovimientosDetallados = new JLabelMe();

		this.jLabelConGraficoDinamicoMovimientosDetallados.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelConGraficoDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMovimientosDetallados = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMovimientosDetallados.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMovimientosDetallados.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMovimientosDetallados.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientosDetallados.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMovimientosDetallados.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jCheckBoxConGraficoDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMovimientosDetallados = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMovimientosDetallados.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelColumnaCategoriaGraficoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMovimientosDetallados = new JLabelMe();

		this.jLabelColumnaCategoriaValorMovimientosDetallados.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelColumnaCategoriaValorMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMovimientosDetallados.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMovimientosDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMovimientosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMovimientosDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jComboBoxColumnaCategoriaValorMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMovimientosDetallados = new JLabelMe();

		this.jLabelColumnasValoresGraficoMovimientosDetallados.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelColumnasValoresGraficoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMovimientosDetallados = new JList<Reporte>();
		this.jListColumnasValoresGraficoMovimientosDetallados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMovimientosDetallados.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMovimientosDetallados.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientosDetallados.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMovimientosDetallados.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMovimientosDetallados=new JScrollPane(this.jListColumnasValoresGraficoMovimientosDetallados);
			
			this.jScrollColumnasValoresGraficoMovimientosDetallados.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientosDetallados.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMovimientosDetallados.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMovimientosDetallados.add(this.jListColumnasSelectReporteMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jScrollColumnasValoresGraficoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMovimientosDetallados = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMovimientosDetallados.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelTiposGraficosReportesDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMovimientosDetallados = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMovimientosDetallados.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMovimientosDetallados.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMovimientosDetallados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientosDetallados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMovimientosDetallados.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jComboBoxTiposGraficosReportesDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMovimientosDetallados = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMovimientosDetallados.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelGenerarExcelReporteDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMovimientosDetallados = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMovimientosDetallados.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMovimientosDetallados,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMovimientosDetallados.setToolTipText("Generar EXCEL"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		//this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMovimientosDetallados.add(this.jButtonGenerarExcelReporteDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jComboBoxTiposReportesDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMovimientosDetallados = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMovimientosDetallados.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jLabelTiposArchivoReporteDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jComboBoxTiposArchivosReportesDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMovimientosDetallados = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMovimientosDetallados.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMovimientosDetallados,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMovimientosDetallados.setToolTipText("Generar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jButtonGenerarReporteDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMovimientosDetallados = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMovimientosDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMovimientosDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMovimientosDetallados.setToolTipText("Cancelar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMovimientosDetallados.add(this.jButtonCerrarReporteDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMovimientosDetallados = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMovimientosDetallados= new JScrollPane(jPanelReporteDinamicoMovimientosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMovimientosDetallados.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientosDetallados.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMovimientosDetallados.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Detalladoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMovimientosDetallados.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMovimientosDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMovimientosDetallados.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMovimientosDetallados);
		this.jInternalFrameReporteDinamicoMovimientosDetallados.getContentPane().add(this.jScrollPanelReporteDinamicoMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMovimientosDetallados() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMovimientosDetallados = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMovimientosDetallados.setName("jPanelImportacionMovimientosDetallados"); 
		
		this.jPanelImportacionMovimientosDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientosDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMovimientosDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMovimientosDetallados.setLayout(gridaBagLayoutImportacionMovimientosDetallados);
		
		
		this.jInternalFrameImportacionMovimientosDetallados= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMovimientosDetallados= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMovimientosDetallados = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMovimientosDetallados= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMovimientosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientosDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientosDetallados.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMovimientosDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientosDetallados.setResizable(true);
	    this.jInternalFrameImportacionMovimientosDetallados.setClosable(true);
	    this.jInternalFrameImportacionMovimientosDetallados.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMovimientosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMovimientosDetallados.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMovimientosDetallados.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMovimientosDetallados.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMovimientosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMovimientosDetallados.setResizable(true);
	    this.jInternalFrameImportacionMovimientosDetallados.setClosable(true);
	    this.jInternalFrameImportacionMovimientosDetallados.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMovimientosDetallados.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientosDetallados.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMovimientosDetallados.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Detalladoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMovimientosDetallados = new JLabelMe();

		this.jLabelArchivoImportacionMovimientosDetallados.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientosDetallados.add(this.jLabelArchivoImportacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMovimientosDetallados = new JFileChooser();		
		this.jFileChooserImportacionMovimientosDetallados.setToolTipText("ESCOGER ARCHIVO"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMovimientosDetallados = new JButtonMe();
		this.jButtonAbrirImportacionMovimientosDetallados.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMovimientosDetallados,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMovimientosDetallados.setToolTipText("Generar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosDetallados.add(this.jButtonAbrirImportacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMovimientosDetallados = new JLabelMe();

		this.jLabelPathArchivoImportacionMovimientosDetallados.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMovimientosDetallados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientosDetallados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMovimientosDetallados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYImportacion;		
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMovimientosDetallados.add(this.jLabelPathArchivoImportacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMovimientosDetallados=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMovimientosDetallados.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientosDetallados.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMovimientosDetallados.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosDetallados.add(this.jTextFieldPathArchivoImportacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMovimientosDetallados = new JButtonMe();
		this.jButtonGenerarImportacionMovimientosDetallados.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMovimientosDetallados,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMovimientosDetallados.setToolTipText("Generar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosDetallados.add(this.jButtonGenerarImportacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMovimientosDetallados = new JButtonMe();
		this.jButtonCerrarImportacionMovimientosDetallados.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMovimientosDetallados,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMovimientosDetallados.setToolTipText("Cancelar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientosDetallados.gridy = iPosYImportacion;
		this.gridBagConstraintsMovimientosDetallados.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMovimientosDetallados.add(this.jButtonCerrarImportacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMovimientosDetallados = new GridBagLayout();
		
		this.jScrollPanelImportacionMovimientosDetallados= new JScrollPane(jPanelImportacionMovimientosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
		this.gridBagConstraintsMovimientosDetallados.gridy =iPosYImportacion;
		this.gridBagConstraintsMovimientosDetallados.gridx =iPosXImportacion;
		this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMovimientosDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMovimientosDetallados.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMovimientosDetallados);
		this.jInternalFrameImportacionMovimientosDetallados.getContentPane().add(this.jScrollPanelImportacionMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMovimientosDetallados(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMovimientosDetallados = new JButtonMe();
			this.jButtonAbrirOrderByMovimientosDetallados.setText("Orden");
			this.jButtonAbrirOrderByMovimientosDetallados.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMovimientosDetallados,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMovimientosDetallados";
			inputMap = this.jButtonAbrirOrderByMovimientosDetallados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMovimientosDetallados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMovimientosDetallados"));
		
		
			GridBagLayout gridaBagLayoutOrderByMovimientosDetallados = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMovimientosDetallados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMovimientosDetallados.setName("jPanelOrderByMovimientosDetallados"); 
			
			this.jPanelOrderByMovimientosDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientosDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMovimientosDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMovimientosDetallados.setLayout(gridaBagLayoutOrderByMovimientosDetallados);
			
			
			this.jTableDatosMovimientosDetalladosOrderBy = new JTableMe();        
			this.jTableDatosMovimientosDetalladosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMovimientosDetalladosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMovimientosDetalladosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMovimientosDetalladosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMovimientosDetalladosOrderBy.setViewportView(this.jTableDatosMovimientosDetalladosOrderBy);
			this.jTableDatosMovimientosDetalladosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMovimientosDetalladosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMovimientosDetallados= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMovimientosDetallados= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMovimientosDetallados = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMovimientosDetallados= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMovimientosDetallados.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMovimientosDetallados.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMovimientosDetallados.setTitle("Orden");
			this.jInternalFrameOrderByMovimientosDetallados.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMovimientosDetallados.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMovimientosDetallados.setResizable(true);
			this.jInternalFrameOrderByMovimientosDetallados.setClosable(true);
			this.jInternalFrameOrderByMovimientosDetallados.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMovimientosDetallados.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientosDetallados.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMovimientosDetallados.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMovimientosDetallados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimientos Detalladoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMovimientosDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMovimientosDetallados.ipady =150;
				
			this.jPanelOrderByMovimientosDetallados.add(jScrollPanelDatosMovimientosDetalladosOrderBy, this.gridBagConstraintsMovimientosDetallados);//this.jTableDatosMovimientosDetalladosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMovimientosDetallados = new JButtonMe();
			this.jButtonCerrarOrderByMovimientosDetallados.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMovimientosDetallados,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMovimientosDetallados.setToolTipText("Cancelar"+" "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMovimientosDetallados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientosDetallados.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMovimientosDetallados.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMovimientosDetallados.add(this.jButtonCerrarOrderByMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMovimientosDetallados = new GridBagLayout();
			
			this.jScrollPanelOrderByMovimientosDetallados= new JScrollPane(jPanelOrderByMovimientosDetallados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMovimientosDetallados = new GridBagConstraints();
			this.gridBagConstraintsMovimientosDetallados.gridy =iPosYOrderBy;
			this.gridBagConstraintsMovimientosDetallados.gridx =iPosXOrderBy;
			this.gridBagConstraintsMovimientosDetallados.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMovimientosDetallados.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMovimientosDetallados.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMovimientosDetallados);
			
			this.jInternalFrameOrderByMovimientosDetallados.getContentPane().add(this.jScrollPanelOrderByMovimientosDetallados, this.gridBagConstraintsMovimientosDetallados);			
		
		} else {
			this.jButtonAbrirOrderByMovimientosDetallados = new JButtonMe();
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
		int iWidthTableCalculado=0;//4330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.movimientosdetalladosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMovimientosDetallados.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMovimientosDetallados.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosMovimientosDetallados.getRowHeight();//MovimientosDetalladosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientosDetallados.isSelected()) {
					iHeightTable=MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMovimientosDetallados.isSelected()) {
					iHeightTable=MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MovimientosDetalladosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMovimientosDetallados.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientosDetallados.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMovimientosDetallados.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMovimientosDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientosDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMovimientosDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMovimientosDetallados!=null && this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy()!=null) {
			//if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMovimientosDetallados.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMovimientosDetallados.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMovimientosDetallados.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMovimientosDetallados.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientosDetallados.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMovimientosDetallados.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=movimientosdetalladosLogic.getMovimientosDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientosdetalladoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MovimientosDetallados> TraerMovimientosDetalladosBeans(List<MovimientosDetallados> movimientosdetalladoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(MovimientosDetallados movimientosdetallados:movimientosdetalladoss) {
					
				if(!(MovimientosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MovimientosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					movimientosdetallados.setsDetalleGeneralEntityReporte(MovimientosDetalladosConstantesFunciones.getMovimientosDetalladosDescripcion(movimientosdetallados));
										
						
					
						
					
				} else  {
							
					//movimientosdetallados.setsDetalleGeneralEntityReporte(movimientosdetallados.getsDetalleGeneralEntityReporte());
										
				}
				
				//movimientosdetalladosbeans.add(movimientosdetalladosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return movimientosdetalladoss;
    }
	//PARA REPORTES FIN
}
