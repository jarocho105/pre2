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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.importaciones.util.DetalleLiquidacionImporConstantesFunciones;

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
public class DetalleLiquidacionImporJInternalFrame extends DetalleLiquidacionImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleLiquidacionImpor;
	
	protected JMenuBar jmenuBarDetalleLiquidacionImpor;
	
	protected JMenu jmenuDetalleLiquidacionImpor;
	protected JMenu jmenuDatosDetalleLiquidacionImpor;
	protected JMenu jmenuArchivoDetalleLiquidacionImpor;
	protected JMenu jmenuAccionesDetalleLiquidacionImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleLiquidacionImpor;	
	protected GridBagConstraints gridBagConstraintsDetalleLiquidacionImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleLiquidacionImporDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleLiquidacionImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleLiquidacionImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleLiquidacionImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_liquidacionimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CostoGastoImporBeanSwingJInternalFrame costogastoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_costogastoimpor="";
	
	public DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean;
		
	
	
	public LiquidacionImporSessionBean liquidacionimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CostoGastoImporSessionBean costogastoimporSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleLiquidacionImpor> detalleliquidacionimpors;		
	public List<DetalleLiquidacionImpor> detalleliquidacionimporsEliminados;	
	public List<DetalleLiquidacionImpor> detalleliquidacionimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleLiquidacionImpor;		
	protected JButton jButtonAbrirOrderByDetalleLiquidacionImpor;
	
	
	//protected JPanel jPanelOrderByDetalleLiquidacionImpor;
	//public JScrollPane jScrollPanelOrderByDetalleLiquidacionImpor;	
	//protected JButton jButtonCerrarOrderByDetalleLiquidacionImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleLiquidacionImporLogic detalleliquidacionimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleLiquidacionImpor;
	public JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpor;
	public JScrollPane jScrollPanelDatosGeneralDetalleLiquidacionImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleLiquidacionImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleLiquidacionImpor;
	//public JScrollPane jScrollPanelImportacionDetalleLiquidacionImpor;
	
	
	
	protected JPanel jPanelAccionesDetalleLiquidacionImpor;
	
    protected JPanel jPanelPaginacionDetalleLiquidacionImpor;
    protected JPanel jPanelParametrosReportesDetalleLiquidacionImpor;
	protected JPanel jPanelParametrosReportesAccionesDetalleLiquidacionImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleLiquidacionImpor;
	protected JPanel jPanelParametrosAuxiliar2DetalleLiquidacionImpor;
	protected JPanel jPanelParametrosAuxiliar3DetalleLiquidacionImpor;
	protected JPanel jPanelParametrosAuxiliar4DetalleLiquidacionImpor;
	//protected JPanel jPanelParametrosAuxiliar5DetalleLiquidacionImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleLiquidacionImpor;
	//protected JPanel jPanelImportacionDetalleLiquidacionImpor;
	
	
	public JTable jTableDatosDetalleLiquidacionImpor;
	
	
	
	//public JTable jTableDatosDetalleLiquidacionImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleLiquidacionImpor;
	protected JButton jButtonDuplicarDetalleLiquidacionImpor;
	protected JButton jButtonCopiarDetalleLiquidacionImpor;
	protected JButton jButtonVerFormDetalleLiquidacionImpor;
	protected JButton jButtonNuevoRelacionesDetalleLiquidacionImpor;
	protected JButton jButtonModificarDetalleLiquidacionImpor;
	
    protected JButton jButtonGuardarCambiosTablaDetalleLiquidacionImpor;
	protected JButton jButtonCerrarDetalleLiquidacionImpor;
	
	
	protected JButton jButtonRecargarInformacionDetalleLiquidacionImpor;
	protected JButton jButtonProcesarInformacionDetalleLiquidacionImpor;
	
	
	protected JButton jButtonAnterioresDetalleLiquidacionImpor;
	protected JButton jButtonSiguientesDetalleLiquidacionImpor;
	protected JButton jButtonNuevoGuardarCambiosDetalleLiquidacionImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleLiquidacionImpor;
	//protected JButton jButtonCerrarReporteDinamicoDetalleLiquidacionImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleLiquidacionImpor;
	//protected JButton jButtonGenerarImportacionDetalleLiquidacionImpor;
	//protected JButton jButtonCerrarImportacionDetalleLiquidacionImpor;
	//protected JFileChooser jFileChooserImportacionDetalleLiquidacionImpor;
	//protected File fileImportacionDetalleLiquidacionImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleLiquidacionImpor;
	protected JButton jButtonDuplicarToolBarDetalleLiquidacionImpor;
	protected JButton jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleLiquidacionImpor;
	protected JButton jButtonCopiarToolBarDetalleLiquidacionImpor;
	protected JButton jButtonVerFormToolBarDetalleLiquidacionImpor;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpor;
	protected JButton jButtonCerrarToolBarDetalleLiquidacionImpor;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleLiquidacionImpor;
	protected JButton jButtonProcesarInformacionToolBarDetalleLiquidacionImpor;
	protected JButton jButtonAnterioresToolBarDetalleLiquidacionImpor;
	protected JButton jButtonSiguientesToolBarDetalleLiquidacionImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpor;
	protected JButton jButtonAbrirOrderByToolBarDetalleLiquidacionImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemDuplicarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleLiquidacionImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemCopiarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemVerFormDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemCerrarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemProcesarInformacionDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemAnterioresDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemSiguientesDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemAbrirOrderByDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleLiquidacionImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleLiquidacionImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleLiquidacionImpor;
	protected JCheckBox jCheckBoxSeleccionadosDetalleLiquidacionImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleLiquidacionImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleLiquidacionImpor;
	protected JTextField jTextFieldValorCampoGeneralDetalleLiquidacionImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleLiquidacionImpor;
	//public JList<Reporte> jListColumnasSelectReporteDetalleLiquidacionImpor;
	//public JScrollPane jScrollColumnasSelectReporteDetalleLiquidacionImpor;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleLiquidacionImpor;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleLiquidacionImpor;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleLiquidacionImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleLiquidacionImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpor;
	
		
	//public JLabel jLabelArchivoImportacionDetalleLiquidacionImpor;	
	//public JLabel jLabelPathArchivoImportacionDetalleLiquidacionImpor;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleLiquidacionImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleLiquidacionImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleLiquidacionImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleLiquidacionImpor;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleLiquidacionImpor;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleLiquidacionImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleLiquidacionImpor;
	public JPanel jPanelFK_IdCentroCostoDetalleLiquidacionImpor;
	public JButton jButtonFK_IdCentroCostoDetalleLiquidacionImpor;
	public JPanel jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor;
	public JButton jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor;
	public JPanel jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor;
	public JButton jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor;
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleLiquidacionImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoDetalleLiquidacionImporArbol= new JButtonMe();

	
	public JPanel jPanelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor;
	public JLabel jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor;
	public JButton jButtonid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor;
	public JLabel jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor;
	public JButton jButtonid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImporBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public DetalleLiquidacionImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleLiquidacionImpor)	{
		this.jButtonRecargarInformacionDetalleLiquidacionImpor = jButtonRecargarInformacionDetalleLiquidacionImpor;
	}
	
	public JButton getjButtonProcesarInformacionDetalleLiquidacionImpor() {
		return this.jButtonProcesarInformacionDetalleLiquidacionImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleLiquidacionImpor)	{
		this.jButtonProcesarInformacionDetalleLiquidacionImpor = jButtonProcesarInformacionDetalleLiquidacionImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleLiquidacionImpor() {
		return this.jButtonRecargarInformacionDetalleLiquidacionImpor;
	}
	
	
	public List<DetalleLiquidacionImpor> getdetalleliquidacionimpors() {
		return this.detalleliquidacionimpors;
	}

	public void setdetalleliquidacionimpors(List<DetalleLiquidacionImpor> detalleliquidacionimpors) {
		this.detalleliquidacionimpors = detalleliquidacionimpors;
	}
	
	public List<DetalleLiquidacionImpor> getdetalleliquidacionimporsAux() {
		return this.detalleliquidacionimporsAux;
	}

	public void setdetalleliquidacionimporsAux(List<DetalleLiquidacionImpor> detalleliquidacionimporsAux) {
		this.detalleliquidacionimporsAux = detalleliquidacionimporsAux;
	}
	
	public List<DetalleLiquidacionImpor> getdetalleliquidacionimporsEliminados() {
		return this.detalleliquidacionimporsEliminados;
	}

	public void setDetalleLiquidacionImporsEliminados(List<DetalleLiquidacionImpor> detalleliquidacionimporsEliminados) {
		this.detalleliquidacionimporsEliminados = detalleliquidacionimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleLiquidacionImpor() {
		return jComboBoxTiposSeleccionarDetalleLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposSeleccionarDetalleLiquidacionImpor) {
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor = jComboBoxTiposSeleccionarDetalleLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleLiquidacionImpor() {
		return jTextFieldValorCampoGeneralDetalleLiquidacionImpor;
	}

	public void setjTextFieldValorCampoGeneralDetalleLiquidacionImpor(
			JTextField jTextFieldValorCampoGeneralDetalleLiquidacionImpor) {
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor = jTextFieldValorCampoGeneralDetalleLiquidacionImpor;
	}

	public void setBorderResaltarValorCampoGeneralDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleLiquidacionImpor() {
		return this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor;
	}

	public void setjCheckBoxSeleccionarTodosDetalleLiquidacionImpor(
			JCheckBox jCheckBoxSeleccionarTodosDetalleLiquidacionImpor) {
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor = jCheckBoxSeleccionarTodosDetalleLiquidacionImpor;
	}

	public void setBorderResaltarSeleccionarTodosDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleLiquidacionImpor() {
		return this.jCheckBoxSeleccionadosDetalleLiquidacionImpor;
	}

	public void setjCheckBoxSeleccionadosDetalleLiquidacionImpor(
			JCheckBox jCheckBoxSeleccionadosDetalleLiquidacionImpor) {
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpor = jCheckBoxSeleccionadosDetalleLiquidacionImpor;
	}
	
	public void setBorderResaltarSeleccionadosDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleLiquidacionImpor() {
		return this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposArchivosReportesDetalleLiquidacionImpor) {
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor = jComboBoxTiposArchivosReportesDetalleLiquidacionImpor;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleLiquidacionImpor() {
		return this.jComboBoxTiposReportesDetalleLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposReportesDetalleLiquidacionImpor) {
		this.jComboBoxTiposReportesDetalleLiquidacionImpor = jComboBoxTiposReportesDetalleLiquidacionImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleLiquidacionImpor() {
	//	return jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleLiquidacionImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor) {
	//	this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor = jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor = jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor;
	//}
	
	public void setBorderResaltarTiposReportesDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleLiquidacionImpor() {
		return this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposGraficosReportesDetalleLiquidacionImpor) {
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor = jComboBoxTiposGraficosReportesDetalleLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleLiquidacionImpor() {
		return this.jComboBoxTiposPaginacionDetalleLiquidacionImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposPaginacionDetalleLiquidacionImpor) {
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpor = jComboBoxTiposPaginacionDetalleLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleLiquidacionImpor() {
		return this.jComboBoxTiposRelacionesDetalleLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleLiquidacionImpor() {
		return this.jComboBoxTiposAccionesDetalleLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpor) {
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor = jComboBoxTiposRelacionesDetalleLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpor) {
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor = jComboBoxTiposAccionesDetalleLiquidacionImpor;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleLiquidacionImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleLiquidacionImpor() {
	//	return jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleLiquidacionImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor) {
	//	this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor = jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleLiquidacionImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleLiquidacionImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor .setBorder(borderResaltar);		
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
		this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		
		this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleLiquidacionImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Liquidacion Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLiquidacionImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"nuevo","nuevo","Nuevo"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"duplicar","duplicar","Duplicar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"copiar","copiar","Copiar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"ver_form","ver_form","Ver"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"recargar","recargar","Recargar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"cerrar","cerrar","Salir"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor;
			
				this.jButtonProcesarInformacionToolBarDetalleLiquidacionImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleLiquidacionImpor;
				
		//protected JButton jButtonModificarToolBarDetalleLiquidacionImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleLiquidacionImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleLiquidacionImpor=new JMenuMe("General");
		this.jmenuArchivoDetalleLiquidacionImpor=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleLiquidacionImpor=new JMenuMe("Acciones");
		this.jmenuDatosDetalleLiquidacionImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleLiquidacionImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleLiquidacionImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleLiquidacionImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleLiquidacionImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleLiquidacionImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleLiquidacionImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleLiquidacionImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleLiquidacionImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleLiquidacionImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleLiquidacionImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleLiquidacionImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleLiquidacionImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleLiquidacionImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleLiquidacionImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleLiquidacionImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleLiquidacionImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleLiquidacionImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleLiquidacionImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleLiquidacionImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleLiquidacionImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleLiquidacionImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleLiquidacionImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleLiquidacionImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleLiquidacionImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleLiquidacionImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleLiquidacionImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleLiquidacionImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleLiquidacionImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleLiquidacionImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleLiquidacionImpor.add(this.jMenuItemCerrarDetalleLiquidacionImpor);
			
			this.jmenuAccionesDetalleLiquidacionImpor.add(this.jMenuItemNuevoDetalleLiquidacionImpor);
			this.jmenuAccionesDetalleLiquidacionImpor.add(this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor);
			this.jmenuAccionesDetalleLiquidacionImpor.add(this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor);
			this.jmenuAccionesDetalleLiquidacionImpor.add(this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor);		
			this.jmenuAccionesDetalleLiquidacionImpor.add(this.jMenuItemDuplicarDetalleLiquidacionImpor);		
			this.jmenuAccionesDetalleLiquidacionImpor.add(this.jMenuItemCopiarDetalleLiquidacionImpor);		
			this.jmenuAccionesDetalleLiquidacionImpor.add(this.jMenuItemVerFormDetalleLiquidacionImpor);		
			
			this.jmenuDatosDetalleLiquidacionImpor.add(this.jMenuItemRecargarInformacionDetalleLiquidacionImpor);				
			this.jmenuDatosDetalleLiquidacionImpor.add(this.jMenuItemAnterioresDetalleLiquidacionImpor);				
			this.jmenuDatosDetalleLiquidacionImpor.add(this.jMenuItemSiguientesDetalleLiquidacionImpor);				
			this.jmenuDatosDetalleLiquidacionImpor.add(this.jMenuItemAbrirOrderByDetalleLiquidacionImpor);				
			this.jmenuDatosDetalleLiquidacionImpor.add(this.jMenuItemMostrarOcultarDetalleLiquidacionImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleLiquidacionImpor.add(this.jMenuItemGuardarCambiosDetalleLiquidacionImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleLiquidacionImpor.add(this.jmenuArchivoDetalleLiquidacionImpor);		
			this.jmenuBarDetalleLiquidacionImpor.add(this.jmenuAccionesDetalleLiquidacionImpor);		
			this.jmenuBarDetalleLiquidacionImpor.add(this.jmenuDatosDetalleLiquidacionImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleLiquidacionImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleLiquidacionImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoDetalleLiquidacionImpor.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonFK_IdCentroCostoDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonFK_IdCentroCostoDetalleLiquidacionImpor.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoDetalleLiquidacionImpor,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor.setToolTipText("Buscar Por Costo Gasto Impor ");
		this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor.setToolTipText("Buscar Por Costo Gasto Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor,"buscar_button","Buscar Por Costo Gasto Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor = new JLabelMe();
		jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setText("Costo Gasto Impor :");
		jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setToolTipText("Costo Gasto Impor");
		jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor.setToolTipText("Buscar Por Liquacion Impor ");
		this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor.setToolTipText("Buscar Por Liquacion Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor,"buscar_button","Buscar Por Liquacion Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor = new JLabelMe();
		jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setText("Liquacion Impor :");
		jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setToolTipText("Liquacion Impor");
		jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleLiquidacionImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleLiquidacionImpor = new DetalleLiquidacionImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Liquidacion Impor DATOS");
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor = new DetalleLiquidacionImporDetalleFormJInternalFrame(jDesktopPane,this.detalleliquidacionimporSessionBean.getConGuardarRelaciones(),this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor = null;//new DetalleLiquidacionImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleLiquidacionImpor= new GridBagLayout();
		
		
		this.jTableDatosDetalleLiquidacionImpor = new JTableMe();      
		
		String sToolTipDetalleLiquidacionImpor="";
		sToolTipDetalleLiquidacionImpor=DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleLiquidacionImpor+="(Importaciones.DetalleLiquidacionImpor)";
		}
		
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleLiquidacionImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleLiquidacionImpor.setToolTipText(sToolTipDetalleLiquidacionImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleLiquidacionImpor);
		this.jTableDatosDetalleLiquidacionImpor.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleLiquidacionImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleLiquidacionImpor.setRowSelectionAllowed(true);
		this.jTableDatosDetalleLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonDuplicarDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonCopiarDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonVerFormDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarDetalleLiquidacionImpor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleLiquidacionImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleLiquidacionImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Liquidacion Impor";
		
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleLiquidacionImpor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleLiquidacionImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor=new ReporteDinamicoJInternalFrame(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleLiquidacionImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleLiquidacionImpor=new ImportacionJInternalFrame(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleLiquidacionImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleLiquidacionImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleLiquidacionImpor.setText("Orden");
		this.jButtonAbrirOrderByDetalleLiquidacionImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleLiquidacionImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpor,false,this);
			
			//this.cargarOrderByDetalleLiquidacionImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpor,true,this);
			
			//this.cargarOrderByDetalleLiquidacionImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleLiquidacionImpor.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleLiquidacionImpor.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleLiquidacionImpor.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosDetalleLiquidacionImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleLiquidacionImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleLiquidacionImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleLiquidacionImpor.setText("Nuevo");
		this.jButtonDuplicarDetalleLiquidacionImpor.setText("Duplicar");
		this.jButtonCopiarDetalleLiquidacionImpor.setText("Copiar");
		this.jButtonVerFormDetalleLiquidacionImpor.setText("Ver");
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.setText("Guardar");
		this.jButtonCerrarDetalleLiquidacionImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleLiquidacionImpor,"nuevo_button","Nuevo",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleLiquidacionImpor,"duplicar_button","Duplicar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleLiquidacionImpor,"copiar_button","Copiar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleLiquidacionImpor,"ver_form","Ver",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleLiquidacionImpor,"nuevorelaciones_button","Nuevo Rel",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor,"guardarcambiostabla_button","Guardar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleLiquidacionImpor,"cerrar_button","Salir",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleLiquidacionImpor.setToolTipText("Nuevo"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleLiquidacionImpor.setToolTipText("Duplicar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleLiquidacionImpor.setToolTipText("Copiar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleLiquidacionImpor.setToolTipText("Ver"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor.setToolTipText("Nuevo Rel"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.setToolTipText("Guardar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleLiquidacionImpor.setToolTipText("Salir"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleLiquidacionImpor";
		inputMap = this.jButtonNuevoDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleLiquidacionImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleLiquidacionImpor";
		inputMap = this.jButtonDuplicarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleLiquidacionImpor"));
		
		//COPIAR
		sMapKey = "CopiarDetalleLiquidacionImpor";
		inputMap = this.jButtonCopiarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleLiquidacionImpor"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleLiquidacionImpor";
		inputMap = this.jButtonVerFormDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleLiquidacionImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleLiquidacionImpor";
		inputMap = this.jButtonNuevoRelacionesDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleLiquidacionImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleLiquidacionImpor";
		inputMap = this.jButtonModificarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleLiquidacionImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleLiquidacionImpor";
		inputMap = this.jButtonCerrarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleLiquidacionImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleLiquidacionImpor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleLiquidacionImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleLiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleLiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleLiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleLiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleLiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleLiquidacionImpor.setName("jPanelParametrosReportesDetalleLiquidacionImpor"); 
		
		this.jPanelParametrosReportesAccionesDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleLiquidacionImpor.setName("jPanelParametrosReportesAccionesDetalleLiquidacionImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.setText("Recargar");
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.setToolTipText("Recargar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleLiquidacionImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonProcesarInformacionDetalleLiquidacionImpor.setText("Procesar");
		this.jButtonProcesarInformacionDetalleLiquidacionImpor.setToolTipText("Procesar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleLiquidacionImpor.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleLiquidacionImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleLiquidacionImpor = new JLabelMe();
		
		this.jLabelAccionesDetalleLiquidacionImpor.setText("Acciones");		
		this.jLabelAccionesDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleLiquidacionImpor = new JButtonMe();
		//this.jButtonAnterioresDetalleLiquidacionImpor.setText("<<");
        this.jButtonAnterioresDetalleLiquidacionImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleLiquidacionImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleLiquidacionImpor = new JButtonMe();
		//this.jButtonSiguientesDetalleLiquidacionImpor.setText(">>");
        this.jButtonSiguientesDetalleLiquidacionImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleLiquidacionImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor,"nuevoguardarcambios_button","Nue",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleLiquidacionImpor";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleLiquidacionImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleLiquidacionImpor";
		inputMap = this.jButtonRecargarInformacionDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleLiquidacionImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleLiquidacionImpor";
		inputMap = this.jButtonSiguientesDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleLiquidacionImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleLiquidacionImpor";
		inputMap = this.jButtonAnterioresDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleLiquidacionImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleLiquidacionImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleLiquidacionImpor.setMinimumSize(new Dimension(this.getWidth(),DetalleLiquidacionImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleLiquidacionImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleLiquidacionImpor.setMaximumSize(new Dimension(this.getWidth(),DetalleLiquidacionImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleLiquidacionImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleLiquidacionImpor.setPreferredSize(new Dimension(this.getWidth(),DetalleLiquidacionImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleLiquidacionImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleLiquidacionImpor = new GridBagLayout();

			this.jPanelPaginacionDetalleLiquidacionImpor.setLayout(gridaBagLayoutPaginacionDetalleLiquidacionImpor);						
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonAnterioresDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
					
						
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
			
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
						
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonSiguientesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonNuevoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
						
			
			
			if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
				this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
				this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			}
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonDuplicarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonCopiarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonVerFormDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleLiquidacionImpor.add(this.jButtonCerrarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleLiquidacionImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleLiquidacionImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleLiquidacionImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleLiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleLiquidacionImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleLiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleLiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleLiquidacionImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleLiquidacionImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpor.setLayout(gridaBagParametrosReportesDetalleLiquidacionImpor);
			this.jPanelParametrosReportesAccionesDetalleLiquidacionImpor.setLayout(gridaBagParametrosReportesAccionesDetalleLiquidacionImpor);
			
			
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpor.setLayout(gridaBagParametrosAuxiliar1DetalleLiquidacionImpor);
			this.jPanelParametrosAuxiliar2DetalleLiquidacionImpor.setLayout(gridaBagParametrosAuxiliar2DetalleLiquidacionImpor);
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpor.setLayout(gridaBagParametrosAuxiliar3DetalleLiquidacionImpor);
			this.jPanelParametrosAuxiliar4DetalleLiquidacionImpor.setLayout(gridaBagParametrosAuxiliar4DetalleLiquidacionImpor);
			//this.jPanelParametrosAuxiliar5DetalleLiquidacionImpor.setLayout(gridaBagParametrosAuxiliar2DetalleLiquidacionImpor);			
			
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jButtonRecargarInformacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpor.add(this.jComboBoxTiposPaginacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpor.add(this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpor.add(this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jPanelParametrosAuxiliar1DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleLiquidacionImpor.add(this.jComboBoxTiposReportesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);																		
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleLiquidacionImpor.add(this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jPanelParametrosAuxiliar4DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jComboBoxTiposReportesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jCheckBoxGenerarReporteDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jPanelParametrosAuxiliar2DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jLabelAccionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
				this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jButtonAbrirOrderByDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
			
			
			/*
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpor.add(this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);															
				
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpor.add(this.jCheckBoxSeleccionadosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);															
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpor.add(this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jPanelParametrosAuxiliar3DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jComboBoxTiposAccionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
	
				
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpor.add(this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleLiquidacionImpor = new GridBagLayout();

			this.jScrollPanelDatosDetalleLiquidacionImpor.setLayout(gridaBagLayoutDatosDetalleLiquidacionImpor);
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
			
			this.jScrollPanelDatosDetalleLiquidacionImpor.add(this.jTableDatosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleLiquidacionImpor.setViewportView(this.jTableDatosDetalleLiquidacionImpor);
		this.jTableDatosDetalleLiquidacionImpor.setFillsViewportHeight(true);
		this.jTableDatosDetalleLiquidacionImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleLiquidacionImpor= new GridBagLayout();
		this.jPanelAccionesDetalleLiquidacionImpor.setLayout(gridaBagLayoutAccionesDetalleLiquidacionImpor);
		
		
		/*	
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
			
		this.jPanelAccionesDetalleLiquidacionImpor.add(this.jButtonNuevoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoDetalleLiquidacionImpor= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoDetalleLiquidacionImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleLiquidacionImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoDetalleLiquidacionImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoDetalleLiquidacionImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoDetalleLiquidacionImpor.setLayout(gridaBagLayoutFK_IdCentroCostoDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
		jPanelFK_IdCentroCostoDetalleLiquidacionImpor.add(jLabelid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
		jPanelFK_IdCentroCostoDetalleLiquidacionImpor.add(jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
		gridBagConstraintsDetalleLiquidacionImpor.gridx =1;
		jPanelFK_IdCentroCostoDetalleLiquidacionImpor.add(jButtonFK_IdCentroCostoDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		jTabbedPaneBusquedasDetalleLiquidacionImpor.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoDetalleLiquidacionImpor);
		jTabbedPaneBusquedasDetalleLiquidacionImpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCostoGastoImporDetalleLiquidacionImpor= new GridBagLayout();
		gridaBagLayoutFK_IdCostoGastoImporDetalleLiquidacionImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCostoGastoImporDetalleLiquidacionImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCostoGastoImporDetalleLiquidacionImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCostoGastoImporDetalleLiquidacionImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor.setLayout(gridaBagLayoutFK_IdCostoGastoImporDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
		jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor.add(jLabelid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
		jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor.add(jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
		gridBagConstraintsDetalleLiquidacionImpor.gridx =1;
		jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor.add(jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		jTabbedPaneBusquedasDetalleLiquidacionImpor.addTab("2.-Por Costo Gasto Impor ", jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);
		jTabbedPaneBusquedasDetalleLiquidacionImpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLiquidacionImporDetalleLiquidacionImpor= new GridBagLayout();
		gridaBagLayoutFK_IdLiquidacionImporDetalleLiquidacionImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLiquidacionImporDetalleLiquidacionImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLiquidacionImporDetalleLiquidacionImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLiquidacionImporDetalleLiquidacionImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor.setLayout(gridaBagLayoutFK_IdLiquidacionImporDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
		jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor.add(jLabelid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
		jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor.add(jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpor.gridy = 1;
		gridBagConstraintsDetalleLiquidacionImpor.gridx =1;
		jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor.add(jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);

		jTabbedPaneBusquedasDetalleLiquidacionImpor.addTab("3.-Por Liquacion Impor ", jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);
		jTabbedPaneBusquedasDetalleLiquidacionImpor.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleLiquidacionImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;		
			//this.gridBagConstraintsDetalleLiquidacionImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;		
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleLiquidacionImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;		
			this.gridBagConstraintsDetalleLiquidacionImpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);								
		
		
		/*
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		*/		
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =0;
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleLiquidacionImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
				
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleLiquidacionImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleLiquidacionImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleLiquidacionImpor.setLayout(gridaBagLayoutBusquedasParametrosDetalleLiquidacionImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			
			
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
			
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleLiquidacionImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleLiquidacionImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleLiquidacionImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.setName("jPanelReporteDinamicoDetalleLiquidacionImpor"); 
		
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.setLayout(gridaBagLayoutReporteDinamicoDetalleLiquidacionImpor);
		
		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleLiquidacionImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleLiquidacionImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelColumnasSelectReporteDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleLiquidacionImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpor=new JScrollPane(this.jListColumnasSelectReporteDetalleLiquidacionImpor);
			
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jListColumnasSelectReporteDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jScrollColumnasSelectReporteDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleLiquidacionImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpor=new JScrollPane(this.jListRelacionesSelectReporteDetalleLiquidacionImpor);
			
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleLiquidacionImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleLiquidacionImpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelConGraficoDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelColumnaCategoriaValorDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelColumnasValoresGraficoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleLiquidacionImpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleLiquidacionImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleLiquidacionImpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpor=new JScrollPane(this.jListColumnasValoresGraficoDetalleLiquidacionImpor);
			
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jListColumnasSelectReporteDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jScrollColumnasValoresGraficoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor.setToolTipText("Generar EXCEL"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpor.setToolTipText("Generar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpor.add(this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleLiquidacionImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor= new JScrollPane(jPanelReporteDinamicoDetalleLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleLiquidacionImpor);
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleLiquidacionImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleLiquidacionImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleLiquidacionImpor.setName("jPanelImportacionDetalleLiquidacionImpor"); 
		
		this.jPanelImportacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleLiquidacionImpor.setLayout(gridaBagLayoutImportacionDetalleLiquidacionImpor);
		
		
		this.jInternalFrameImportacionDetalleLiquidacionImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleLiquidacionImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleLiquidacionImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleLiquidacionImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleLiquidacionImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setResizable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setClosable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleLiquidacionImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setResizable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setClosable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelArchivoImportacionDetalleLiquidacionImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleLiquidacionImpor.add(this.jLabelArchivoImportacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleLiquidacionImpor = new JFileChooser();		
		this.jFileChooserImportacionDetalleLiquidacionImpor.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonAbrirImportacionDetalleLiquidacionImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleLiquidacionImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleLiquidacionImpor.setToolTipText("Generar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpor.add(this.jButtonAbrirImportacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleLiquidacionImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleLiquidacionImpor.add(this.jLabelPathArchivoImportacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpor.add(this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonGenerarImportacionDetalleLiquidacionImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleLiquidacionImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleLiquidacionImpor.setToolTipText("Generar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpor.add(this.jButtonGenerarImportacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarImportacionDetalleLiquidacionImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleLiquidacionImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleLiquidacionImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpor.add(this.jButtonCerrarImportacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleLiquidacionImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleLiquidacionImpor= new JScrollPane(jPanelImportacionDetalleLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleLiquidacionImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleLiquidacionImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleLiquidacionImpor);
		this.jInternalFrameImportacionDetalleLiquidacionImpor.getContentPane().add(this.jScrollPanelImportacionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleLiquidacionImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleLiquidacionImpor = new JButtonMe();
			this.jButtonAbrirOrderByDetalleLiquidacionImpor.setText("Orden");
			this.jButtonAbrirOrderByDetalleLiquidacionImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleLiquidacionImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleLiquidacionImpor";
			inputMap = this.jButtonAbrirOrderByDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleLiquidacionImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleLiquidacionImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleLiquidacionImpor.setName("jPanelOrderByDetalleLiquidacionImpor"); 
			
			this.jPanelOrderByDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleLiquidacionImpor.setLayout(gridaBagLayoutOrderByDetalleLiquidacionImpor);
			
			
			this.jTableDatosDetalleLiquidacionImporOrderBy = new JTableMe();        
			this.jTableDatosDetalleLiquidacionImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleLiquidacionImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleLiquidacionImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleLiquidacionImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleLiquidacionImporOrderBy.setViewportView(this.jTableDatosDetalleLiquidacionImporOrderBy);
			this.jTableDatosDetalleLiquidacionImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleLiquidacionImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleLiquidacionImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleLiquidacionImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleLiquidacionImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleLiquidacionImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setTitle("Orden");
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setResizable(true);
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setClosable(true);
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleLiquidacionImpor.ipady =150;
				
			this.jPanelOrderByDetalleLiquidacionImpor.add(jScrollPanelDatosDetalleLiquidacionImporOrderBy, this.gridBagConstraintsDetalleLiquidacionImpor);//this.jTableDatosDetalleLiquidacionImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleLiquidacionImpor = new JButtonMe();
			this.jButtonCerrarOrderByDetalleLiquidacionImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleLiquidacionImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleLiquidacionImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleLiquidacionImpor.add(this.jButtonCerrarOrderByDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleLiquidacionImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleLiquidacionImpor= new JScrollPane(jPanelOrderByDetalleLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleLiquidacionImpor);
			
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getContentPane().add(this.jScrollPanelOrderByDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
		
		} else {
			this.jButtonAbrirOrderByDetalleLiquidacionImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleLiquidacionImpor.getRowHeight();//DetalleLiquidacionImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor.isSelected()) {
					iHeightTable=DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpor.isSelected()) {
					iHeightTable=DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleLiquidacionImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleLiquidacionImpor!=null && this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleLiquidacionImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleliquidacionimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleLiquidacionImpor> TraerDetalleLiquidacionImporBeans(List<DetalleLiquidacionImpor> detalleliquidacionimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimpors) {
					
				if(!(DetalleLiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleLiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleliquidacionimpor.setsDetalleGeneralEntityReporte(DetalleLiquidacionImporConstantesFunciones.getDetalleLiquidacionImporDescripcion(detalleliquidacionimpor));
										
						
					
						
					
				} else  {
							
					//detalleliquidacionimpor.setsDetalleGeneralEntityReporte(detalleliquidacionimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleliquidacionimporbeans.add(detalleliquidacionimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleliquidacionimpors;
    }
	//PARA REPORTES FIN
}
