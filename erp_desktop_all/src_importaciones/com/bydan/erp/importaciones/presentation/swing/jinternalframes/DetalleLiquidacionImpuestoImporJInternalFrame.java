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

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.importaciones.util.DetalleLiquidacionImpuestoImporConstantesFunciones;

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
public class DetalleLiquidacionImpuestoImporJInternalFrame extends DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleLiquidacionImpuestoImpor;
	
	protected JMenuBar jmenuBarDetalleLiquidacionImpuestoImpor;
	
	protected JMenu jmenuDetalleLiquidacionImpuestoImpor;
	protected JMenu jmenuDatosDetalleLiquidacionImpuestoImpor;
	protected JMenu jmenuArchivoDetalleLiquidacionImpuestoImpor;
	protected JMenu jmenuAccionesDetalleLiquidacionImpuestoImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleLiquidacionImpuestoImpor;	
	protected GridBagConstraints gridBagConstraintsDetalleLiquidacionImpuestoImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleLiquidacionImpuestoImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_liquidacionimpuestoimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public DetalleLiquidacionImpuestoImporSessionBean detalleliquidacionimpuestoimporSessionBean;
		
	
	
	public LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimpors;		
	public List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsEliminados;	
	public List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleLiquidacionImpuestoImpor;		
	protected JButton jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor;
	
	
	//protected JPanel jPanelOrderByDetalleLiquidacionImpuestoImpor;
	//public JScrollPane jScrollPanelOrderByDetalleLiquidacionImpuestoImpor;	
	//protected JButton jButtonCerrarOrderByDetalleLiquidacionImpuestoImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleLiquidacionImpuestoImporLogic detalleliquidacionimpuestoimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor;
	public JScrollPane jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleLiquidacionImpuestoImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor;
	//public JScrollPane jScrollPanelImportacionDetalleLiquidacionImpuestoImpor;
	
	
	
	protected JPanel jPanelAccionesDetalleLiquidacionImpuestoImpor;
	
    protected JPanel jPanelPaginacionDetalleLiquidacionImpuestoImpor;
    protected JPanel jPanelParametrosReportesDetalleLiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleLiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosAuxiliar2DetalleLiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosAuxiliar3DetalleLiquidacionImpuestoImpor;
	protected JPanel jPanelParametrosAuxiliar4DetalleLiquidacionImpuestoImpor;
	//protected JPanel jPanelParametrosAuxiliar5DetalleLiquidacionImpuestoImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor;
	//protected JPanel jPanelImportacionDetalleLiquidacionImpuestoImpor;
	
	
	public JTable jTableDatosDetalleLiquidacionImpuestoImpor;
	
	
	
	//public JTable jTableDatosDetalleLiquidacionImpuestoImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonDuplicarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonCopiarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonVerFormDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonModificarDetalleLiquidacionImpuestoImpor;
	
    protected JButton jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarDetalleLiquidacionImpuestoImpor;
	
	
	protected JButton jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor;
	
	
	protected JButton jButtonAnterioresDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonSiguientesDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor;
	//protected JButton jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleLiquidacionImpuestoImpor;
	//protected JButton jButtonGenerarImportacionDetalleLiquidacionImpuestoImpor;
	//protected JButton jButtonCerrarImportacionDetalleLiquidacionImpuestoImpor;
	//protected JFileChooser jFileChooserImportacionDetalleLiquidacionImpuestoImpor;
	//protected File fileImportacionDetalleLiquidacionImpuestoImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonDuplicarToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonCopiarToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonVerFormToolBarDetalleLiquidacionImpuestoImpor;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonCerrarToolBarDetalleLiquidacionImpuestoImpor;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonProcesarInformacionToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonAnterioresToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonSiguientesToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor;
	protected JButton jButtonAbrirOrderByToolBarDetalleLiquidacionImpuestoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDuplicarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCopiarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemVerFormDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemCerrarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemProcesarInformacionDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemAnterioresDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemSiguientesDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleLiquidacionImpuestoImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor;
	protected JTextField jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleLiquidacionImpuestoImpor;
	//public JList<Reporte> jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor;
	//public JScrollPane jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleLiquidacionImpuestoImpor;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleLiquidacionImpuestoImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleLiquidacionImpuestoImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpuestoImpor;
	
		
	//public JLabel jLabelArchivoImportacionDetalleLiquidacionImpuestoImpor;	
	//public JLabel jLabelPathArchivoImportacionDetalleLiquidacionImpuestoImpor;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleLiquidacionImpuestoImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleLiquidacionImpuestoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleLiquidacionImpuestoImpor;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleLiquidacionImpuestoImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor;
	public JPanel jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor;
	public JButton jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor;
	
	public JPanel jPanelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor;
	public JLabel jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor;
	public JButton jButtonid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor= new JButtonMe();
	public JButton jButtonid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImporUpdate= new JButtonMe();
	public JButton jButtonid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImporBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=484;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleLiquidacionImpuestoImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImpuestoImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImpuestoImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImpuestoImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor)	{
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor = jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor;
	}
	
	public JButton getjButtonProcesarInformacionDetalleLiquidacionImpuestoImpor() {
		return this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor)	{
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor = jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleLiquidacionImpuestoImpor() {
		return this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor;
	}
	
	
	public List<DetalleLiquidacionImpuestoImpor> getdetalleliquidacionimpuestoimpors() {
		return this.detalleliquidacionimpuestoimpors;
	}

	public void setdetalleliquidacionimpuestoimpors(List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimpors) {
		this.detalleliquidacionimpuestoimpors = detalleliquidacionimpuestoimpors;
	}
	
	public List<DetalleLiquidacionImpuestoImpor> getdetalleliquidacionimpuestoimporsAux() {
		return this.detalleliquidacionimpuestoimporsAux;
	}

	public void setdetalleliquidacionimpuestoimporsAux(List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsAux) {
		this.detalleliquidacionimpuestoimporsAux = detalleliquidacionimpuestoimporsAux;
	}
	
	public List<DetalleLiquidacionImpuestoImpor> getdetalleliquidacionimpuestoimporsEliminados() {
		return this.detalleliquidacionimpuestoimporsEliminados;
	}

	public void setDetalleLiquidacionImpuestoImporsEliminados(List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsEliminados) {
		this.detalleliquidacionimpuestoimporsEliminados = detalleliquidacionimpuestoimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor() {
		return jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor = jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor() {
		return jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor;
	}

	public void setjTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor(
			JTextField jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor) {
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor = jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor;
	}

	public void setBorderResaltarValorCampoGeneralDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor() {
		return this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor;
	}

	public void setjCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor(
			JCheckBox jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor) {
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor = jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor;
	}

	public void setBorderResaltarSeleccionarTodosDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor() {
		return this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor;
	}

	public void setjCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor(
			JCheckBox jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor) {
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor = jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarSeleccionadosDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor = jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor = jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor() {
	//	return jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor) {
	//	this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor = jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor = jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor;
	//}
	
	public void setBorderResaltarTiposReportesDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor = jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor = jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor() {
		return this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor = jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor(
			JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor) {
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor = jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleLiquidacionImpuestoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor() {
	//	return jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor) {
	//	this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor = jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleLiquidacionImpuestoImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor .setBorder(borderResaltar);		
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
		this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		
		this.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleLiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleLiquidacionImpuestoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Liquidacion Impuesto Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleLiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleLiquidacionImpuestoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLiquidacionImpuestoImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"nuevo","nuevo","Nuevo"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"duplicar","duplicar","Duplicar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"copiar","copiar","Copiar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"ver_form","ver_form","Ver"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"recargar","recargar","Recargar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleLiquidacionImpuestoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,
							"cerrar","cerrar","Salir"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor;
			
				this.jButtonProcesarInformacionToolBarDetalleLiquidacionImpuestoImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleLiquidacionImpuestoImpor;
				
		//protected JButton jButtonModificarToolBarDetalleLiquidacionImpuestoImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleLiquidacionImpuestoImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleLiquidacionImpuestoImpor=new JMenuMe("General");
		this.jmenuArchivoDetalleLiquidacionImpuestoImpor=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleLiquidacionImpuestoImpor=new JMenuMe("Acciones");
		this.jmenuDatosDetalleLiquidacionImpuestoImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleLiquidacionImpuestoImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleLiquidacionImpuestoImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleLiquidacionImpuestoImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleLiquidacionImpuestoImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleLiquidacionImpuestoImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleLiquidacionImpuestoImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleLiquidacionImpuestoImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleLiquidacionImpuestoImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleLiquidacionImpuestoImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleLiquidacionImpuestoImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleLiquidacionImpuestoImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleLiquidacionImpuestoImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleLiquidacionImpuestoImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleLiquidacionImpuestoImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleLiquidacionImpuestoImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleLiquidacionImpuestoImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleLiquidacionImpuestoImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleLiquidacionImpuestoImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleLiquidacionImpuestoImpor.add(this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor);
			
			this.jmenuAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor);
			this.jmenuAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor);
			this.jmenuAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor);
			this.jmenuAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor);		
			this.jmenuAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemDuplicarDetalleLiquidacionImpuestoImpor);		
			this.jmenuAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemCopiarDetalleLiquidacionImpuestoImpor);		
			this.jmenuAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemVerFormDetalleLiquidacionImpuestoImpor);		
			
			this.jmenuDatosDetalleLiquidacionImpuestoImpor.add(this.jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor);				
			this.jmenuDatosDetalleLiquidacionImpuestoImpor.add(this.jMenuItemAnterioresDetalleLiquidacionImpuestoImpor);				
			this.jmenuDatosDetalleLiquidacionImpuestoImpor.add(this.jMenuItemSiguientesDetalleLiquidacionImpuestoImpor);				
			this.jmenuDatosDetalleLiquidacionImpuestoImpor.add(this.jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor);				
			this.jmenuDatosDetalleLiquidacionImpuestoImpor.add(this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleLiquidacionImpuestoImpor.add(this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleLiquidacionImpuestoImpor.add(this.jmenuArchivoDetalleLiquidacionImpuestoImpor);		
			this.jmenuBarDetalleLiquidacionImpuestoImpor.add(this.jmenuAccionesDetalleLiquidacionImpuestoImpor);		
			this.jmenuBarDetalleLiquidacionImpuestoImpor.add(this.jmenuDatosDetalleLiquidacionImpuestoImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleLiquidacionImpuestoImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleLiquidacionImpuestoImpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setToolTipText("Buscar Por Liquacion Impuesto Impor ");
		this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor= new JButtonMe();
		this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setText("Buscar");
		this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setToolTipText("Buscar Por Liquacion Impuesto Impor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor,"buscar_button","Buscar Por Liquacion Impuesto Impor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor = new JLabelMe();
		jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setText("Liquacion Impuesto Impor :");
		jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setToolTipText("Liquacion Impuesto Impor");
		jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor= new JComboBoxMe();
		jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleLiquidacionImpuestoImpor = new DetalleLiquidacionImpuestoImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Liquidacion Impuesto Impor DATOS");
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor = new DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame(jDesktopPane,this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor = null;//new DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleLiquidacionImpuestoImpor= new GridBagLayout();
		
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor = new JTableMe();      
		
		String sToolTipDetalleLiquidacionImpuestoImpor="";
		sToolTipDetalleLiquidacionImpuestoImpor=DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleLiquidacionImpuestoImpor+="(Importaciones.DetalleLiquidacionImpuestoImpor)";
		}
		
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleLiquidacionImpuestoImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setToolTipText(sToolTipDetalleLiquidacionImpuestoImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleLiquidacionImpuestoImpor);
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionAllowed(true);
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleLiquidacionImpuestoImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonDuplicarDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCopiarDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonVerFormDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Liquidacion Impuesto Impor";
		
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impuesto Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor=new ReporteDinamicoJInternalFrame(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleLiquidacionImpuestoImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor=new ImportacionJInternalFrame(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleLiquidacionImpuestoImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.setText("Orden");
		this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor,false,this);
			
			//this.cargarOrderByDetalleLiquidacionImpuestoImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor,true,this);
			
			//this.cargarOrderByDetalleLiquidacionImpuestoImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleLiquidacionImpuestoImpor.setText("Nuevo");
		this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.setText("Duplicar");
		this.jButtonCopiarDetalleLiquidacionImpuestoImpor.setText("Copiar");
		this.jButtonVerFormDetalleLiquidacionImpuestoImpor.setText("Ver");
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setText("Guardar");
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleLiquidacionImpuestoImpor,"nuevo_button","Nuevo",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleLiquidacionImpuestoImpor,"duplicar_button","Duplicar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleLiquidacionImpuestoImpor,"copiar_button","Copiar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleLiquidacionImpuestoImpor,"ver_form","Ver",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor,"nuevorelaciones_button","Nuevo Rel",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor,"guardarcambiostabla_button","Guardar",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleLiquidacionImpuestoImpor,"cerrar_button","Salir",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.setToolTipText("Nuevo"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.setToolTipText("Duplicar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleLiquidacionImpuestoImpor.setToolTipText("Copiar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleLiquidacionImpuestoImpor.setToolTipText("Ver"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.setToolTipText("Nuevo Rel"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setToolTipText("Guardar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.setToolTipText("Salir"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleLiquidacionImpuestoImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleLiquidacionImpuestoImpor"));
		
		//COPIAR
		sMapKey = "CopiarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonCopiarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleLiquidacionImpuestoImpor"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonVerFormDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleLiquidacionImpuestoImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleLiquidacionImpuestoImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonModificarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleLiquidacionImpuestoImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonCerrarDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleLiquidacionImpuestoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleLiquidacionImpuestoImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleLiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleLiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleLiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleLiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleLiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setName("jPanelParametrosReportesDetalleLiquidacionImpuestoImpor"); 
		
		this.jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor.setName("jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.setText("Recargar");
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.setToolTipText("Recargar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor.setText("Procesar");
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor.setToolTipText("Procesar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor = new JLabelMe();
		
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setText("Acciones");		
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleLiquidacionImpuestoImpor = new JButtonMe();
		//this.jButtonAnterioresDetalleLiquidacionImpuestoImpor.setText("<<");
        this.jButtonAnterioresDetalleLiquidacionImpuestoImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleLiquidacionImpuestoImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleLiquidacionImpuestoImpor = new JButtonMe();
		//this.jButtonSiguientesDetalleLiquidacionImpuestoImpor.setText(">>");
        this.jButtonSiguientesDetalleLiquidacionImpuestoImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleLiquidacionImpuestoImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor,"nuevoguardarcambios_button","Nue",this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleLiquidacionImpuestoImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleLiquidacionImpuestoImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonSiguientesDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleLiquidacionImpuestoImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonAnterioresDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleLiquidacionImpuestoImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleLiquidacionImpuestoImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(this.getWidth(),DetalleLiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleLiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(this.getWidth(),DetalleLiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleLiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(this.getWidth(),DetalleLiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleLiquidacionImpuestoImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleLiquidacionImpuestoImpor = new GridBagLayout();

			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutPaginacionDetalleLiquidacionImpuestoImpor);						
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonAnterioresDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
					
						
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
			
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
						
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonSiguientesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonNuevoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
						
			
			
			if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 1;
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			}
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonDuplicarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonCopiarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonVerFormDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 1;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.add(this.jButtonCerrarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleLiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleLiquidacionImpuestoImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleLiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleLiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleLiquidacionImpuestoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleLiquidacionImpuestoImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setLayout(gridaBagParametrosReportesDetalleLiquidacionImpuestoImpor);
			this.jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor.setLayout(gridaBagParametrosReportesAccionesDetalleLiquidacionImpuestoImpor);
			
			
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar1DetalleLiquidacionImpuestoImpor);
			this.jPanelParametrosAuxiliar2DetalleLiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar2DetalleLiquidacionImpuestoImpor);
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar3DetalleLiquidacionImpuestoImpor);
			this.jPanelParametrosAuxiliar4DetalleLiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar4DetalleLiquidacionImpuestoImpor);
			//this.jPanelParametrosAuxiliar5DetalleLiquidacionImpuestoImpor.setLayout(gridaBagParametrosAuxiliar2DetalleLiquidacionImpuestoImpor);			
			
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpuestoImpor.add(this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar1DetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);																		
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar4DetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jCheckBoxGenerarReporteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar2DetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jLabelAccionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
			
			
			/*
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpuestoImpor.add(this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);															
				
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpuestoImpor.add(this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);															
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleLiquidacionImpuestoImpor.add(this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jPanelParametrosAuxiliar3DetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	
				
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.add(this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleLiquidacionImpuestoImpor = new GridBagLayout();

			this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutDatosDetalleLiquidacionImpuestoImpor);
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
			
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.add(this.jTableDatosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setViewportView(this.jTableDatosDetalleLiquidacionImpuestoImpor);
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setFillsViewportHeight(true);
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleLiquidacionImpuestoImpor= new GridBagLayout();
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutAccionesDetalleLiquidacionImpuestoImpor);
		
		
		/*	
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
			
		this.jPanelAccionesDetalleLiquidacionImpuestoImpor.add(this.jButtonNuevoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor= new GridBagLayout();
		gridaBagLayoutFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);

		gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
		jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.add(jLabelid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor, gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 0;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 1;
		jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.add(jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor, gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = 1;
		gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =1;
		jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.add(jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor, gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.addTab("1.-Por Liquacion Impuesto Impor ", jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
		jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleLiquidacionImpuestoImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;		
			//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;		
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;		
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);								
		
		
		/*
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		*/		
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =0;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
				
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleLiquidacionImpuestoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleLiquidacionImpuestoImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutBusquedasParametrosDetalleLiquidacionImpuestoImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
			
			
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
			
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleLiquidacionImpuestoImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleLiquidacionImpuestoImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleLiquidacionImpuestoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setName("jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor"); 
		
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutReporteDinamicoDetalleLiquidacionImpuestoImpor);
		
		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impuesto Impores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelColumnasSelectReporteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor=new JScrollPane(this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor);
			
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpuestoImpor=new JScrollPane(this.jListRelacionesSelectReporteDetalleLiquidacionImpuestoImpor);
			
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelConGraficoDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jCheckBoxConGraficoDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelColumnaCategoriaValorDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jComboBoxColumnaCategoriaValorDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelColumnasValoresGraficoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpuestoImpor=new JScrollPane(this.jListColumnasValoresGraficoDetalleLiquidacionImpuestoImpor);
			
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jListColumnasSelectReporteDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jScrollColumnasValoresGraficoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleLiquidacionImpuestoImpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.setToolTipText("Generar EXCEL"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposReportesDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpuestoImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jLabelTiposArchivoReporteDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor.setToolTipText("Generar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.add(this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor= new JScrollPane(jPanelReporteDinamicoDetalleLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impuesto Impores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleLiquidacionImpuestoImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleLiquidacionImpuestoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.setName("jPanelImportacionDetalleLiquidacionImpuestoImpor"); 
		
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutImportacionDetalleLiquidacionImpuestoImpor);
		
		
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleLiquidacionImpuestoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setResizable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setClosable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setResizable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setClosable(true);
	    this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impuesto Impores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelArchivoImportacionDetalleLiquidacionImpuestoImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.add(this.jLabelArchivoImportacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleLiquidacionImpuestoImpor = new JFileChooser();		
		this.jFileChooserImportacionDetalleLiquidacionImpuestoImpor.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonAbrirImportacionDetalleLiquidacionImpuestoImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleLiquidacionImpuestoImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleLiquidacionImpuestoImpor.setToolTipText("Generar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.add(this.jButtonAbrirImportacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpuestoImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleLiquidacionImpuestoImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.add(this.jLabelPathArchivoImportacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpuestoImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.add(this.jTextFieldPathArchivoImportacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonGenerarImportacionDetalleLiquidacionImpuestoImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleLiquidacionImpuestoImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleLiquidacionImpuestoImpor.setToolTipText("Generar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.add(this.jButtonGenerarImportacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleLiquidacionImpuestoImpor = new JButtonMe();
		this.jButtonCerrarImportacionDetalleLiquidacionImpuestoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleLiquidacionImpuestoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleLiquidacionImpuestoImpor.add(this.jButtonCerrarImportacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleLiquidacionImpuestoImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleLiquidacionImpuestoImpor= new JScrollPane(jPanelImportacionDetalleLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getContentPane().add(this.jScrollPanelImportacionDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleLiquidacionImpuestoImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor = new JButtonMe();
			this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.setText("Orden");
			this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleLiquidacionImpuestoImpor";
			inputMap = this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleLiquidacionImpuestoImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleLiquidacionImpuestoImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.setName("jPanelOrderByDetalleLiquidacionImpuestoImpor"); 
			
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.setLayout(gridaBagLayoutOrderByDetalleLiquidacionImpuestoImpor);
			
			
			this.jTableDatosDetalleLiquidacionImpuestoImporOrderBy = new JTableMe();        
			this.jTableDatosDetalleLiquidacionImpuestoImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleLiquidacionImpuestoImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleLiquidacionImpuestoImporOrderBy.setViewportView(this.jTableDatosDetalleLiquidacionImpuestoImporOrderBy);
			this.jTableDatosDetalleLiquidacionImpuestoImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleLiquidacionImpuestoImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleLiquidacionImpuestoImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setTitle("Orden");
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setResizable(true);
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setClosable(true);
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impuesto Impores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.ipady =150;
				
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.add(jScrollPanelDatosDetalleLiquidacionImpuestoImporOrderBy, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);//this.jTableDatosDetalleLiquidacionImpuestoImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleLiquidacionImpuestoImpor = new JButtonMe();
			this.jButtonCerrarOrderByDetalleLiquidacionImpuestoImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleLiquidacionImpuestoImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleLiquidacionImpuestoImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleLiquidacionImpuestoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleLiquidacionImpuestoImpor.add(this.jButtonCerrarOrderByDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleLiquidacionImpuestoImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor= new JScrollPane(jPanelOrderByDetalleLiquidacionImpuestoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleLiquidacionImpuestoImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleLiquidacionImpuestoImpor);
			
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getContentPane().add(this.jScrollPanelOrderByDetalleLiquidacionImpuestoImpor, this.gridBagConstraintsDetalleLiquidacionImpuestoImpor);			
		
		} else {
			this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowHeight();//DetalleLiquidacionImpuestoImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor.isSelected()) {
					iHeightTable=DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleLiquidacionImpuestoImpor.isSelected()) {
					iHeightTable=DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleLiquidacionImpuestoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleliquidacionimpuestoimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleLiquidacionImpuestoImpor> TraerDetalleLiquidacionImpuestoImporBeans(List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimpors) {
					
				if(!(DetalleLiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleLiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleliquidacionimpuestoimpor.setsDetalleGeneralEntityReporte(DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleLiquidacionImpuestoImporDescripcion(detalleliquidacionimpuestoimpor));
										
						
					
						
					
				} else  {
							
					//detalleliquidacionimpuestoimpor.setsDetalleGeneralEntityReporte(detalleliquidacionimpuestoimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleliquidacionimpuestoimporbeans.add(detalleliquidacionimpuestoimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleliquidacionimpuestoimpors;
    }
	//PARA REPORTES FIN
}
