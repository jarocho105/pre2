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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.report.ProcesoCodigosAlternosConstantesFunciones;

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
public class ProcesoCodigosAlternosJInternalFrame extends ProcesoCodigosAlternosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCodigosAlternos;
	
	protected JMenuBar jmenuBarProcesoCodigosAlternos;
	
	protected JMenu jmenuProcesoCodigosAlternos;
	protected JMenu jmenuDatosProcesoCodigosAlternos;
	protected JMenu jmenuArchivoProcesoCodigosAlternos;
	protected JMenu jmenuAccionesProcesoCodigosAlternos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCodigosAlternos;	
	protected GridBagConstraints gridBagConstraintsProcesoCodigosAlternos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCodigosAlternosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCodigosAlternos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCodigosAlternos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCodigosAlternos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ProcesoCodigosAlternosSessionBean procesocodigosalternosSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCodigosAlternos> procesocodigosalternoss;		
	public List<ProcesoCodigosAlternos> procesocodigosalternossEliminados;	
	public List<ProcesoCodigosAlternos> procesocodigosalternossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCodigosAlternos;		
	protected JButton jButtonAbrirOrderByProcesoCodigosAlternos;
	
	
	//protected JPanel jPanelOrderByProcesoCodigosAlternos;
	//public JScrollPane jScrollPanelOrderByProcesoCodigosAlternos;	
	//protected JButton jButtonCerrarOrderByProcesoCodigosAlternos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCodigosAlternosLogic procesocodigosalternosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCodigosAlternos;
	public JScrollPane jScrollPanelDatosEdicionProcesoCodigosAlternos;
	public JScrollPane jScrollPanelDatosGeneralProcesoCodigosAlternos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCodigosAlternosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCodigosAlternos;
	//public JScrollPane jScrollPanelImportacionProcesoCodigosAlternos;
	
	
	
	protected JPanel jPanelAccionesProcesoCodigosAlternos;
	
    protected JPanel jPanelPaginacionProcesoCodigosAlternos;
    protected JPanel jPanelParametrosReportesProcesoCodigosAlternos;
	protected JPanel jPanelParametrosReportesAccionesProcesoCodigosAlternos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCodigosAlternos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCodigosAlternos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCodigosAlternos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCodigosAlternos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCodigosAlternos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCodigosAlternos;
	//protected JPanel jPanelImportacionProcesoCodigosAlternos;
	
	
	public JTable jTableDatosProcesoCodigosAlternos;
	
	
	
	//public JTable jTableDatosProcesoCodigosAlternosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCodigosAlternos;
	protected JButton jButtonDuplicarProcesoCodigosAlternos;
	protected JButton jButtonCopiarProcesoCodigosAlternos;
	protected JButton jButtonVerFormProcesoCodigosAlternos;
	protected JButton jButtonNuevoRelacionesProcesoCodigosAlternos;
	protected JButton jButtonModificarProcesoCodigosAlternos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCodigosAlternos;
	protected JButton jButtonCerrarProcesoCodigosAlternos;
	
	
	protected JButton jButtonRecargarInformacionProcesoCodigosAlternos;
	protected JButton jButtonProcesarInformacionProcesoCodigosAlternos;
	
	
	protected JButton jButtonAnterioresProcesoCodigosAlternos;
	protected JButton jButtonSiguientesProcesoCodigosAlternos;
	protected JButton jButtonNuevoGuardarCambiosProcesoCodigosAlternos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCodigosAlternos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCodigosAlternos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCodigosAlternos;
	//protected JButton jButtonGenerarImportacionProcesoCodigosAlternos;
	//protected JButton jButtonCerrarImportacionProcesoCodigosAlternos;
	//protected JFileChooser jFileChooserImportacionProcesoCodigosAlternos;
	//protected File fileImportacionProcesoCodigosAlternos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCodigosAlternos;
	protected JButton jButtonDuplicarToolBarProcesoCodigosAlternos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCodigosAlternos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCodigosAlternos;
	protected JButton jButtonCopiarToolBarProcesoCodigosAlternos;
	protected JButton jButtonVerFormToolBarProcesoCodigosAlternos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCodigosAlternos;
	protected JButton jButtonCerrarToolBarProcesoCodigosAlternos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCodigosAlternos;
	protected JButton jButtonProcesarInformacionToolBarProcesoCodigosAlternos;
	protected JButton jButtonAnterioresToolBarProcesoCodigosAlternos;
	protected JButton jButtonSiguientesToolBarProcesoCodigosAlternos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCodigosAlternos;
	protected JButton jButtonAbrirOrderByToolBarProcesoCodigosAlternos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCodigosAlternos;
	protected JMenuItem jMenuItemDuplicarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCodigosAlternos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCodigosAlternos;
	protected JMenuItem jMenuItemCopiarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemVerFormProcesoCodigosAlternos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCodigosAlternos;
	protected JMenuItem jMenuItemCerrarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCodigosAlternos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCodigosAlternos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCodigosAlternos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCodigosAlternos;
	protected JMenuItem jMenuItemAnterioresProcesoCodigosAlternos;
	protected JMenuItem jMenuItemSiguientesProcesoCodigosAlternos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCodigosAlternos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCodigosAlternos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCodigosAlternos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCodigosAlternos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCodigosAlternos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCodigosAlternos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCodigosAlternos;
	protected JTextField jTextFieldValorCampoGeneralProcesoCodigosAlternos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCodigosAlternos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCodigosAlternos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCodigosAlternos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCodigosAlternos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCodigosAlternos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCodigosAlternos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCodigosAlternos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCodigosAlternos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCodigosAlternos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCodigosAlternos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCodigosAlternos;	
	//public JLabel jLabelPathArchivoImportacionProcesoCodigosAlternos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCodigosAlternos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCodigosAlternos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCodigosAlternos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCodigosAlternos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCodigosAlternos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCodigosAlternos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCodigosAlternos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCodigosAlternos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCodigosAlternos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCodigosAlternos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCodigosAlternos;
	public JPanel jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JButton jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	
	public JPanel jPanelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JLabel jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JButton jButtonid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JLabel jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JButton jButtonid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JLabel jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JButton jButtonid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JLabel jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JButton jButtonid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JLabel jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JButton jButtonid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JLabel jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos;
	public JButton jButtonid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoCodigosAlternosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCodigosAlternosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCodigosAlternosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCodigosAlternosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCodigosAlternos)	{
		this.jButtonRecargarInformacionProcesoCodigosAlternos = jButtonRecargarInformacionProcesoCodigosAlternos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCodigosAlternos() {
		return this.jButtonProcesarInformacionProcesoCodigosAlternos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCodigosAlternos)	{
		this.jButtonProcesarInformacionProcesoCodigosAlternos = jButtonProcesarInformacionProcesoCodigosAlternos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCodigosAlternos() {
		return this.jButtonRecargarInformacionProcesoCodigosAlternos;
	}
	
	
	public List<ProcesoCodigosAlternos> getprocesocodigosalternoss() {
		return this.procesocodigosalternoss;
	}

	public void setprocesocodigosalternoss(List<ProcesoCodigosAlternos> procesocodigosalternoss) {
		this.procesocodigosalternoss = procesocodigosalternoss;
	}
	
	public List<ProcesoCodigosAlternos> getprocesocodigosalternossAux() {
		return this.procesocodigosalternossAux;
	}

	public void setprocesocodigosalternossAux(List<ProcesoCodigosAlternos> procesocodigosalternossAux) {
		this.procesocodigosalternossAux = procesocodigosalternossAux;
	}
	
	public List<ProcesoCodigosAlternos> getprocesocodigosalternossEliminados() {
		return this.procesocodigosalternossEliminados;
	}

	public void setProcesoCodigosAlternossEliminados(List<ProcesoCodigosAlternos> procesocodigosalternossEliminados) {
		this.procesocodigosalternossEliminados = procesocodigosalternossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCodigosAlternos() {
		return jComboBoxTiposSeleccionarProcesoCodigosAlternos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCodigosAlternos(
			JComboBox jComboBoxTiposSeleccionarProcesoCodigosAlternos) {
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos = jComboBoxTiposSeleccionarProcesoCodigosAlternos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCodigosAlternos() {
		return jTextFieldValorCampoGeneralProcesoCodigosAlternos;
	}

	public void setjTextFieldValorCampoGeneralProcesoCodigosAlternos(
			JTextField jTextFieldValorCampoGeneralProcesoCodigosAlternos) {
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos = jTextFieldValorCampoGeneralProcesoCodigosAlternos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCodigosAlternos() {
		return this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCodigosAlternos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCodigosAlternos) {
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos = jCheckBoxSeleccionarTodosProcesoCodigosAlternos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCodigosAlternos() {
		return this.jCheckBoxSeleccionadosProcesoCodigosAlternos;
	}

	public void setjCheckBoxSeleccionadosProcesoCodigosAlternos(
			JCheckBox jCheckBoxSeleccionadosProcesoCodigosAlternos) {
		this.jCheckBoxSeleccionadosProcesoCodigosAlternos = jCheckBoxSeleccionadosProcesoCodigosAlternos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCodigosAlternos() {
		return this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCodigosAlternos(
			JComboBox jComboBoxTiposArchivosReportesProcesoCodigosAlternos) {
		this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos = jComboBoxTiposArchivosReportesProcesoCodigosAlternos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCodigosAlternos() {
		return this.jComboBoxTiposReportesProcesoCodigosAlternos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCodigosAlternos(
			JComboBox jComboBoxTiposReportesProcesoCodigosAlternos) {
		this.jComboBoxTiposReportesProcesoCodigosAlternos = jComboBoxTiposReportesProcesoCodigosAlternos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCodigosAlternos() {
	//	return jComboBoxTiposReportesDinamicoProcesoCodigosAlternos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCodigosAlternos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCodigosAlternos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos = jComboBoxTiposReportesDinamicoProcesoCodigosAlternos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos = jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCodigosAlternos() {
		return this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCodigosAlternos(
			JComboBox jComboBoxTiposGraficosReportesProcesoCodigosAlternos) {
		this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos = jComboBoxTiposGraficosReportesProcesoCodigosAlternos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCodigosAlternos() {
		return this.jComboBoxTiposPaginacionProcesoCodigosAlternos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCodigosAlternos(
			JComboBox jComboBoxTiposPaginacionProcesoCodigosAlternos) {
		this.jComboBoxTiposPaginacionProcesoCodigosAlternos = jComboBoxTiposPaginacionProcesoCodigosAlternos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCodigosAlternos() {
		return this.jComboBoxTiposRelacionesProcesoCodigosAlternos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCodigosAlternos() {
		return this.jComboBoxTiposAccionesProcesoCodigosAlternos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCodigosAlternos(
			JComboBox jComboBoxTiposRelacionesProcesoCodigosAlternos) {
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos = jComboBoxTiposRelacionesProcesoCodigosAlternos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCodigosAlternos(
			JComboBox jComboBoxTiposAccionesProcesoCodigosAlternos) {
		this.jComboBoxTiposAccionesProcesoCodigosAlternos = jComboBoxTiposAccionesProcesoCodigosAlternos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCodigosAlternos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCodigosAlternos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCodigosAlternos() {
	//	return jCheckBoxConGraficoDinamicoProcesoCodigosAlternos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCodigosAlternos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCodigosAlternos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCodigosAlternos = jCheckBoxConGraficoDinamicoProcesoCodigosAlternos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCodigosAlternos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCodigosAlternos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCodigosAlternos .setBorder(borderResaltar);		
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
		this.procesocodigosalternosSessionBean=new ProcesoCodigosAlternosSessionBean();
		
		this.procesocodigosalternosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocodigosalternosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocodigosalternosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCodigosAlternosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCodigosAlternosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCodigosAlternosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCodigosAlternosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCodigosAlternosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Codigos Alternos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCodigosAlternosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCodigosAlternos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCodigosAlternos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"copiar","copiar","Copiar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"ver_form","ver_form","Ver"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"recargar","recargar","Buscar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCodigosAlternos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCodigosAlternos,this.jTtoolBarProcesoCodigosAlternos,
							"cerrar","cerrar","Salir"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCodigosAlternos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCodigosAlternos;
			
				this.jButtonProcesarInformacionToolBarProcesoCodigosAlternos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCodigosAlternos;
				
		//protected JButton jButtonModificarToolBarProcesoCodigosAlternos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCodigosAlternos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCodigosAlternos=new JMenuMe("General");
		this.jmenuArchivoProcesoCodigosAlternos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCodigosAlternos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCodigosAlternos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCodigosAlternos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCodigosAlternos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCodigosAlternos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCodigosAlternos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCodigosAlternos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCodigosAlternos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCodigosAlternos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCodigosAlternos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCodigosAlternos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCodigosAlternos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCodigosAlternos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCodigosAlternos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCodigosAlternos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCodigosAlternos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCodigosAlternos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCodigosAlternos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCodigosAlternos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCodigosAlternos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCodigosAlternos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCodigosAlternos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCodigosAlternos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCodigosAlternos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCodigosAlternos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCodigosAlternos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCodigosAlternos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCodigosAlternos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCodigosAlternos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCodigosAlternos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCodigosAlternos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCodigosAlternos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCodigosAlternos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCodigosAlternos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCodigosAlternos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCodigosAlternos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCodigosAlternos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCodigosAlternos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCodigosAlternos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCodigosAlternos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCodigosAlternos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCodigosAlternos.add(this.jMenuItemCerrarProcesoCodigosAlternos);
			
			this.jmenuAccionesProcesoCodigosAlternos.add(this.jMenuItemNuevoProcesoCodigosAlternos);
			this.jmenuAccionesProcesoCodigosAlternos.add(this.jMenuItemNuevoGuardarCambiosProcesoCodigosAlternos);
			this.jmenuAccionesProcesoCodigosAlternos.add(this.jMenuItemNuevoRelacionesProcesoCodigosAlternos);
			this.jmenuAccionesProcesoCodigosAlternos.add(this.jMenuItemGuardarCambiosTablaProcesoCodigosAlternos);		
			this.jmenuAccionesProcesoCodigosAlternos.add(this.jMenuItemDuplicarProcesoCodigosAlternos);		
			this.jmenuAccionesProcesoCodigosAlternos.add(this.jMenuItemCopiarProcesoCodigosAlternos);		
			this.jmenuAccionesProcesoCodigosAlternos.add(this.jMenuItemVerFormProcesoCodigosAlternos);		
			
			this.jmenuDatosProcesoCodigosAlternos.add(this.jMenuItemRecargarInformacionProcesoCodigosAlternos);				
			this.jmenuDatosProcesoCodigosAlternos.add(this.jMenuItemAnterioresProcesoCodigosAlternos);				
			this.jmenuDatosProcesoCodigosAlternos.add(this.jMenuItemSiguientesProcesoCodigosAlternos);				
			this.jmenuDatosProcesoCodigosAlternos.add(this.jMenuItemAbrirOrderByProcesoCodigosAlternos);				
			this.jmenuDatosProcesoCodigosAlternos.add(this.jMenuItemMostrarOcultarProcesoCodigosAlternos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCodigosAlternos.add(this.jMenuItemGuardarCambiosProcesoCodigosAlternos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCodigosAlternos.add(this.jmenuArchivoProcesoCodigosAlternos);		
			this.jmenuBarProcesoCodigosAlternos.add(this.jmenuAccionesProcesoCodigosAlternos);		
			this.jmenuBarProcesoCodigosAlternos.add(this.jmenuDatosProcesoCodigosAlternos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCodigosAlternos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCodigosAlternos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JButtonMe();
		this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setText("Buscar");
		this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos = new JLabelMe();
		jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setText("Bodega :");
		jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos = new JLabelMe();
		jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setText("Producto :");
		jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Producto");
		jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos = new JLabelMe();
		jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setText("Linea :");
		jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Linea");
		jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos = new JLabelMe();
		jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos = new JLabelMe();
		jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCodigosAlternos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCodigosAlternos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoCodigosAlternos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoCodigosAlternos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoCodigosAlternos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCodigosAlternos = new ProcesoCodigosAlternosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Codigos Alternos DATOS");
			this.jInternalFrameDetalleFormProcesoCodigosAlternos = new ProcesoCodigosAlternosDetalleFormJInternalFrame(jDesktopPane,this.procesocodigosalternosSessionBean.getConGuardarRelaciones(),this.procesocodigosalternosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCodigosAlternos = null;//new ProcesoCodigosAlternosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCodigosAlternos= new GridBagLayout();
		
		
		this.jTableDatosProcesoCodigosAlternos = new JTableMe();      
		
		String sToolTipProcesoCodigosAlternos="";
		sToolTipProcesoCodigosAlternos=ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCodigosAlternos+="(Inventario.ProcesoCodigosAlternos)";
		}
		
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCodigosAlternos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCodigosAlternos.setToolTipText(sToolTipProcesoCodigosAlternos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCodigosAlternos);
		this.jTableDatosProcesoCodigosAlternos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCodigosAlternos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCodigosAlternos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCodigosAlternos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCodigosAlternos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCodigosAlternos = new JButtonMe();
		this.jButtonDuplicarProcesoCodigosAlternos = new JButtonMe();
		this.jButtonCopiarProcesoCodigosAlternos = new JButtonMe();
		this.jButtonVerFormProcesoCodigosAlternos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCodigosAlternos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos = new JButtonMe();
		this.jButtonCerrarProcesoCodigosAlternos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCodigosAlternos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCodigosAlternos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Codigos Alternos";
		
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Codigos Alternoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCodigosAlternos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCodigosAlternos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCodigosAlternos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCodigosAlternos=new ReporteDinamicoJInternalFrame(ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCodigosAlternos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCodigosAlternos=new ImportacionJInternalFrame(ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCodigosAlternos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCodigosAlternos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCodigosAlternos.setText("Orden");
		this.jButtonAbrirOrderByProcesoCodigosAlternos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCodigosAlternos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCodigosAlternos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCodigosAlternos,false,this);
			
			//this.cargarOrderByProcesoCodigosAlternos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCodigosAlternos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCodigosAlternos,true,this);
			
			//this.cargarOrderByProcesoCodigosAlternos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCodigosAlternos.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosProcesoCodigosAlternos.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosProcesoCodigosAlternos.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosProcesoCodigosAlternos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCodigosAlternos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCodigosAlternos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCodigosAlternos.setText("Nuevo");
		this.jButtonDuplicarProcesoCodigosAlternos.setText("Duplicar");
		this.jButtonCopiarProcesoCodigosAlternos.setText("Copiar");
		this.jButtonVerFormProcesoCodigosAlternos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCodigosAlternos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.setText("Guardar");
		this.jButtonCerrarProcesoCodigosAlternos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCodigosAlternos,"nuevo_button","Nuevo",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCodigosAlternos,"duplicar_button","Duplicar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCodigosAlternos,"copiar_button","Copiar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCodigosAlternos,"ver_form","Ver",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCodigosAlternos,"nuevorelaciones_button","Nuevo Rel",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCodigosAlternos,"guardarcambiostabla_button","Guardar",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCodigosAlternos,"cerrar_button","Salir",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCodigosAlternos.setToolTipText("Nuevo"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCodigosAlternos.setToolTipText("Duplicar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCodigosAlternos.setToolTipText("Copiar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCodigosAlternos.setToolTipText("Ver"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCodigosAlternos.setToolTipText("Nuevo Rel"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.setToolTipText("Guardar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCodigosAlternos.setToolTipText("Salir"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCodigosAlternos";
		inputMap = this.jButtonNuevoProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCodigosAlternos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCodigosAlternos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCodigosAlternos";
		inputMap = this.jButtonDuplicarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCodigosAlternos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCodigosAlternos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCodigosAlternos";
		inputMap = this.jButtonCopiarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCodigosAlternos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCodigosAlternos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCodigosAlternos";
		inputMap = this.jButtonVerFormProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCodigosAlternos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCodigosAlternos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCodigosAlternos";
		inputMap = this.jButtonNuevoRelacionesProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCodigosAlternos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCodigosAlternos";
		inputMap = this.jButtonModificarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCodigosAlternos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCodigosAlternos";
		inputMap = this.jButtonCerrarProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCodigosAlternos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCodigosAlternos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCodigosAlternos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCodigosAlternos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCodigosAlternos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCodigosAlternos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCodigosAlternos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCodigosAlternos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCodigosAlternos.setName("jPanelParametrosReportesProcesoCodigosAlternos"); 
		
		this.jPanelParametrosReportesAccionesProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCodigosAlternos.setName("jPanelParametrosReportesAccionesProcesoCodigosAlternos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCodigosAlternos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCodigosAlternos.setText("Buscar");
		this.jButtonRecargarInformacionProcesoCodigosAlternos.setToolTipText("Buscar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCodigosAlternos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoCodigosAlternos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCodigosAlternos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCodigosAlternos.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCodigosAlternos.setToolTipText("Procesar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCodigosAlternos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCodigosAlternos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCodigosAlternos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCodigosAlternos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCodigosAlternos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCodigosAlternos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCodigosAlternos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCodigosAlternos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCodigosAlternos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCodigosAlternos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCodigosAlternos = new JLabelMe();
		
		this.jLabelAccionesProcesoCodigosAlternos.setText("Acciones");		
		this.jLabelAccionesProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCodigosAlternos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCodigosAlternos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCodigosAlternos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCodigosAlternos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCodigosAlternos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCodigosAlternos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCodigosAlternos = new JButtonMe();
		//this.jButtonAnterioresProcesoCodigosAlternos.setText("<<");
        this.jButtonAnterioresProcesoCodigosAlternos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCodigosAlternos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCodigosAlternos = new JButtonMe();
		//this.jButtonSiguientesProcesoCodigosAlternos.setText(">>");
        this.jButtonSiguientesProcesoCodigosAlternos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCodigosAlternos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos,"nuevoguardarcambios_button","Nue",this.procesocodigosalternosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCodigosAlternos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCodigosAlternos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCodigosAlternos";
		inputMap = this.jButtonRecargarInformacionProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCodigosAlternos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCodigosAlternos";
		inputMap = this.jButtonSiguientesProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCodigosAlternos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCodigosAlternos";
		inputMap = this.jButtonAnterioresProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCodigosAlternos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCodigosAlternos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCodigosAlternos.setMinimumSize(new Dimension(this.getWidth(),ProcesoCodigosAlternosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCodigosAlternosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCodigosAlternos.setMaximumSize(new Dimension(this.getWidth(),ProcesoCodigosAlternosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCodigosAlternosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCodigosAlternos.setPreferredSize(new Dimension(this.getWidth(),ProcesoCodigosAlternosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCodigosAlternosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCodigosAlternos = new GridBagLayout();

			this.jPanelPaginacionProcesoCodigosAlternos.setLayout(gridaBagLayoutPaginacionProcesoCodigosAlternos);						
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonAnterioresProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
					
						
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
			
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonNuevoGuardarCambiosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
						
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonSiguientesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonNuevoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
						
			
			
			if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
				this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
				this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonGuardarCambiosTablaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			}
			
			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonDuplicarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonCopiarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonVerFormProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCodigosAlternos.add(this.jButtonCerrarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
		
		
		this.jButtonRecargarInformacionProcesoCodigosAlternos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCodigosAlternos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCodigosAlternos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCodigosAlternos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCodigosAlternos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCodigosAlternos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCodigosAlternos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCodigosAlternos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCodigosAlternos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCodigosAlternos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCodigosAlternos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCodigosAlternos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCodigosAlternos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCodigosAlternos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCodigosAlternos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCodigosAlternos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCodigosAlternos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCodigosAlternos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCodigosAlternos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCodigosAlternos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCodigosAlternos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCodigosAlternos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCodigosAlternos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCodigosAlternos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCodigosAlternos.setLayout(gridaBagParametrosReportesProcesoCodigosAlternos);
			this.jPanelParametrosReportesAccionesProcesoCodigosAlternos.setLayout(gridaBagParametrosReportesAccionesProcesoCodigosAlternos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCodigosAlternos.setLayout(gridaBagParametrosAuxiliar1ProcesoCodigosAlternos);
			this.jPanelParametrosAuxiliar2ProcesoCodigosAlternos.setLayout(gridaBagParametrosAuxiliar2ProcesoCodigosAlternos);
			this.jPanelParametrosAuxiliar3ProcesoCodigosAlternos.setLayout(gridaBagParametrosAuxiliar3ProcesoCodigosAlternos);
			this.jPanelParametrosAuxiliar4ProcesoCodigosAlternos.setLayout(gridaBagParametrosAuxiliar4ProcesoCodigosAlternos);
			//this.jPanelParametrosAuxiliar5ProcesoCodigosAlternos.setLayout(gridaBagParametrosAuxiliar2ProcesoCodigosAlternos);			
			
			
			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jButtonRecargarInformacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCodigosAlternos.add(this.jComboBoxTiposPaginacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCodigosAlternos.add(this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCodigosAlternos.add(this.jComboBoxTiposArchivosReportesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jPanelParametrosAuxiliar1ProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCodigosAlternos.add(this.jComboBoxTiposReportesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jPanelParametrosAuxiliar4ProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jComboBoxTiposReportesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jCheckBoxGenerarReporteProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jPanelParametrosAuxiliar2ProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jLabelAccionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
				this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jButtonAbrirOrderByProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jComboBoxTiposSeleccionarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
			
			
			/*
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCodigosAlternos.add(this.jCheckBoxSeleccionarTodosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);															
				
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCodigosAlternos.add(this.jCheckBoxSeleccionadosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jPanelParametrosAuxiliar3ProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCodigosAlternos.add(this.jComboBoxTiposAccionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCodigosAlternos = new GridBagLayout();

			this.jScrollPanelDatosProcesoCodigosAlternos.setLayout(gridaBagLayoutDatosProcesoCodigosAlternos);
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
			
			this.jScrollPanelDatosProcesoCodigosAlternos.add(this.jTableDatosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCodigosAlternos.setViewportView(this.jTableDatosProcesoCodigosAlternos);
		this.jTableDatosProcesoCodigosAlternos.setFillsViewportHeight(true);
		this.jTableDatosProcesoCodigosAlternos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCodigosAlternos= new GridBagLayout();
		this.jPanelAccionesProcesoCodigosAlternos.setLayout(gridaBagLayoutAccionesProcesoCodigosAlternos);
		
		
		/*	
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
			
		this.jPanelAccionesProcesoCodigosAlternos.add(this.jButtonNuevoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCodigosAlternosProcesoCodigosAlternos= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.setLayout(gridaBagLayoutBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jLabelid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 0;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jComboBoxid_bodegaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);


		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jLabelid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 1;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jComboBoxid_productoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);


		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 2;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jLabelid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 2;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jComboBoxid_lineaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);


		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 3;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jLabelid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 3;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jComboBoxid_linea_grupoBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);


		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 4;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jLabelid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 4;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jComboBoxid_linea_categoriaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);


		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 5;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jLabelid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 5;
		gridBagConstraintsProcesoCodigosAlternos.gridx = 1;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jComboBoxid_linea_marcaBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCodigosAlternos.gridy = 6;
		gridBagConstraintsProcesoCodigosAlternos.gridx =1;
		jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos.add(jButtonBusquedaProcesoCodigosAlternosProcesoCodigosAlternos, gridBagConstraintsProcesoCodigosAlternos);

		jTabbedPaneBusquedasProcesoCodigosAlternos.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaProcesoCodigosAlternosProcesoCodigosAlternos);
		jTabbedPaneBusquedasProcesoCodigosAlternos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCodigosAlternos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCodigosAlternos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;		
			//this.gridBagConstraintsProcesoCodigosAlternos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;		
		//this.gridBagConstraintsProcesoCodigosAlternos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCodigosAlternos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;		
			this.gridBagConstraintsProcesoCodigosAlternos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCodigosAlternos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);								
		
		
		/*
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		*/		
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =0;
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCodigosAlternos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
				
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCodigosAlternosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCodigosAlternos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCodigosAlternos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCodigosAlternos.setLayout(gridaBagLayoutBusquedasParametrosProcesoCodigosAlternos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
			
			
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
			
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoCodigosAlternos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCodigosAlternos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCodigosAlternos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCodigosAlternos.setName("jPanelReporteDinamicoProcesoCodigosAlternos"); 
		
		this.jPanelReporteDinamicoProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCodigosAlternos.setLayout(gridaBagLayoutReporteDinamicoProcesoCodigosAlternos);
		
		
		this.jInternalFrameReporteDinamicoProcesoCodigosAlternos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCodigosAlternos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCodigosAlternos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Codigos Alternoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCodigosAlternos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCodigosAlternos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jLabelColumnasSelectReporteProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCodigosAlternos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCodigosAlternos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCodigosAlternos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCodigosAlternos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCodigosAlternos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCodigosAlternos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCodigosAlternos=new JScrollPane(this.jListColumnasSelectReporteProcesoCodigosAlternos);
			
			this.jScrollColumnasSelectReporteProcesoCodigosAlternos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCodigosAlternos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCodigosAlternos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jListColumnasSelectReporteProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jScrollColumnasSelectReporteProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCodigosAlternos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCodigosAlternos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCodigosAlternos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCodigosAlternos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCodigosAlternos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCodigosAlternos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCodigosAlternos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCodigosAlternos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCodigosAlternos=new JScrollPane(this.jListRelacionesSelectReporteProcesoCodigosAlternos);
			
			this.jScrollRelacionesSelectReporteProcesoCodigosAlternos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCodigosAlternos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCodigosAlternos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCodigosAlternos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCodigosAlternos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCodigosAlternos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCodigosAlternos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCodigosAlternos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jLabelGenerarExcelReporteDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos.setToolTipText("Generar EXCEL"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jButtonGenerarExcelReporteDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jComboBoxTiposReportesDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCodigosAlternos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCodigosAlternos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jLabelTiposArchivoReporteDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCodigosAlternos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCodigosAlternos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCodigosAlternos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCodigosAlternos.setToolTipText("Generar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jButtonGenerarReporteDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCodigosAlternos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCodigosAlternos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCodigosAlternos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCodigosAlternos.setToolTipText("Cancelar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCodigosAlternos.add(this.jButtonCerrarReporteDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCodigosAlternos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCodigosAlternos= new JScrollPane(jPanelReporteDinamicoProcesoCodigosAlternos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Codigos Alternoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCodigosAlternos);
		this.jInternalFrameReporteDinamicoProcesoCodigosAlternos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCodigosAlternos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCodigosAlternos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCodigosAlternos.setName("jPanelImportacionProcesoCodigosAlternos"); 
		
		this.jPanelImportacionProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCodigosAlternos.setLayout(gridaBagLayoutImportacionProcesoCodigosAlternos);
		
		
		this.jInternalFrameImportacionProcesoCodigosAlternos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCodigosAlternos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCodigosAlternos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCodigosAlternos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCodigosAlternos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCodigosAlternos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCodigosAlternos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setResizable(true);
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setClosable(true);
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCodigosAlternos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCodigosAlternos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCodigosAlternos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setResizable(true);
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setClosable(true);
	    this.jInternalFrameImportacionProcesoCodigosAlternos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Codigos Alternoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCodigosAlternos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCodigosAlternos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCodigosAlternos.add(this.jLabelArchivoImportacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCodigosAlternos = new JFileChooser();		
		this.jFileChooserImportacionProcesoCodigosAlternos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCodigosAlternos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCodigosAlternos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCodigosAlternos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCodigosAlternos.setToolTipText("Generar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCodigosAlternos.add(this.jButtonAbrirImportacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCodigosAlternos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCodigosAlternos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCodigosAlternos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCodigosAlternos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCodigosAlternos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCodigosAlternos.add(this.jLabelPathArchivoImportacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCodigosAlternos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCodigosAlternos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCodigosAlternos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCodigosAlternos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCodigosAlternos.add(this.jTextFieldPathArchivoImportacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCodigosAlternos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCodigosAlternos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCodigosAlternos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCodigosAlternos.setToolTipText("Generar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCodigosAlternos.add(this.jButtonGenerarImportacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCodigosAlternos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCodigosAlternos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCodigosAlternos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCodigosAlternos.setToolTipText("Cancelar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCodigosAlternos.add(this.jButtonCerrarImportacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCodigosAlternos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCodigosAlternos= new JScrollPane(jPanelImportacionProcesoCodigosAlternos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
		this.gridBagConstraintsProcesoCodigosAlternos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCodigosAlternos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCodigosAlternos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCodigosAlternos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCodigosAlternos);
		this.jInternalFrameImportacionProcesoCodigosAlternos.getContentPane().add(this.jScrollPanelImportacionProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCodigosAlternos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCodigosAlternos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCodigosAlternos.setText("Orden");
			this.jButtonAbrirOrderByProcesoCodigosAlternos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCodigosAlternos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCodigosAlternos";
			inputMap = this.jButtonAbrirOrderByProcesoCodigosAlternos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCodigosAlternos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCodigosAlternos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCodigosAlternos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCodigosAlternos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCodigosAlternos.setName("jPanelOrderByProcesoCodigosAlternos"); 
			
			this.jPanelOrderByProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCodigosAlternos.setLayout(gridaBagLayoutOrderByProcesoCodigosAlternos);
			
			
			this.jTableDatosProcesoCodigosAlternosOrderBy = new JTableMe();        
			this.jTableDatosProcesoCodigosAlternosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCodigosAlternosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCodigosAlternosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCodigosAlternosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCodigosAlternosOrderBy.setViewportView(this.jTableDatosProcesoCodigosAlternosOrderBy);
			this.jTableDatosProcesoCodigosAlternosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCodigosAlternosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCodigosAlternos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCodigosAlternos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCodigosAlternos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCodigosAlternos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCodigosAlternos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCodigosAlternos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCodigosAlternos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCodigosAlternos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCodigosAlternos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCodigosAlternos.setResizable(true);
			this.jInternalFrameOrderByProcesoCodigosAlternos.setClosable(true);
			this.jInternalFrameOrderByProcesoCodigosAlternos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCodigosAlternos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Codigos Alternoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCodigosAlternos.ipady =150;
				
			this.jPanelOrderByProcesoCodigosAlternos.add(jScrollPanelDatosProcesoCodigosAlternosOrderBy, this.gridBagConstraintsProcesoCodigosAlternos);//this.jTableDatosProcesoCodigosAlternosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCodigosAlternos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCodigosAlternos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCodigosAlternos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCodigosAlternos.setToolTipText("Cancelar"+" "+ProcesoCodigosAlternosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCodigosAlternos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCodigosAlternos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCodigosAlternos.add(this.jButtonCerrarOrderByProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCodigosAlternos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCodigosAlternos= new JScrollPane(jPanelOrderByProcesoCodigosAlternos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCodigosAlternos = new GridBagConstraints();
			this.gridBagConstraintsProcesoCodigosAlternos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCodigosAlternos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCodigosAlternos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCodigosAlternos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCodigosAlternos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCodigosAlternos);
			
			this.jInternalFrameOrderByProcesoCodigosAlternos.getContentPane().add(this.jScrollPanelOrderByProcesoCodigosAlternos, this.gridBagConstraintsProcesoCodigosAlternos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCodigosAlternos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocodigosalternosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCodigosAlternos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCodigosAlternos.getRowHeight();//ProcesoCodigosAlternosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos.isSelected()) {
					iHeightTable=ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCodigosAlternos.isSelected()) {
					iHeightTable=ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCodigosAlternosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCodigosAlternos!=null && this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocodigosalternosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCodigosAlternos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCodigosAlternos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCodigosAlternos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCodigosAlternos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCodigosAlternos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCodigosAlternos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCodigosAlternos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocodigosalternosLogic.getProcesoCodigosAlternoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocodigosalternoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCodigosAlternos> TraerProcesoCodigosAlternosBeans(List<ProcesoCodigosAlternos> procesocodigosalternoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCodigosAlternos procesocodigosalternos:procesocodigosalternoss) {
					
				if(!(ProcesoCodigosAlternosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCodigosAlternosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocodigosalternos.setsDetalleGeneralEntityReporte(ProcesoCodigosAlternosConstantesFunciones.getProcesoCodigosAlternosDescripcion(procesocodigosalternos));
										
						
					
						
					
				} else  {
							
					//procesocodigosalternos.setsDetalleGeneralEntityReporte(procesocodigosalternos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocodigosalternosbeans.add(procesocodigosalternosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocodigosalternoss;
    }
	//PARA REPORTES FIN
}
