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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.DepreciacionActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class DepreciacionActivoFijoJInternalFrame extends DepreciacionActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDepreciacionActivoFijo;
	
	protected JMenuBar jmenuBarDepreciacionActivoFijo;
	
	protected JMenu jmenuDepreciacionActivoFijo;
	protected JMenu jmenuDatosDepreciacionActivoFijo;
	protected JMenu jmenuArchivoDepreciacionActivoFijo;
	protected JMenu jmenuAccionesDepreciacionActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDepreciacionActivoFijo;	
	protected GridBagConstraints gridBagConstraintsDepreciacionActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DepreciacionActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormDepreciacionActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDepreciacionActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDepreciacionActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected TipoDepreciacionEmpresaBeanSwingJInternalFrame tipodepreciacionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodepreciacionempresa="";

	protected EstadoDepreActiBeanSwingJInternalFrame estadodepreactiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodepreacti="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean;
	public EstadoDepreActiSessionBean estadodepreactiSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DepreciacionActivoFijo> depreciacionactivofijos;		
	public List<DepreciacionActivoFijo> depreciacionactivofijosEliminados;	
	public List<DepreciacionActivoFijo> depreciacionactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDepreciacionActivoFijo;		
	protected JButton jButtonAbrirOrderByDepreciacionActivoFijo;
	
	
	//protected JPanel jPanelOrderByDepreciacionActivoFijo;
	//public JScrollPane jScrollPanelOrderByDepreciacionActivoFijo;	
	//protected JButton jButtonCerrarOrderByDepreciacionActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DepreciacionActivoFijoLogic depreciacionactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDepreciacionActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionDepreciacionActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralDepreciacionActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosDepreciacionActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDepreciacionActivoFijo;
	//public JScrollPane jScrollPanelImportacionDepreciacionActivoFijo;
	
	
	
	protected JPanel jPanelAccionesDepreciacionActivoFijo;
	
    protected JPanel jPanelPaginacionDepreciacionActivoFijo;
    protected JPanel jPanelParametrosReportesDepreciacionActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesDepreciacionActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DepreciacionActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2DepreciacionActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3DepreciacionActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4DepreciacionActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5DepreciacionActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoDepreciacionActivoFijo;
	//protected JPanel jPanelImportacionDepreciacionActivoFijo;
	
	
	public JTable jTableDatosDepreciacionActivoFijo;
	
	
	
	//public JTable jTableDatosDepreciacionActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDepreciacionActivoFijo;
	protected JButton jButtonDuplicarDepreciacionActivoFijo;
	protected JButton jButtonCopiarDepreciacionActivoFijo;
	protected JButton jButtonVerFormDepreciacionActivoFijo;
	protected JButton jButtonNuevoRelacionesDepreciacionActivoFijo;
	protected JButton jButtonModificarDepreciacionActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaDepreciacionActivoFijo;
	protected JButton jButtonCerrarDepreciacionActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionDepreciacionActivoFijo;
	protected JButton jButtonProcesarInformacionDepreciacionActivoFijo;
	
	
	protected JButton jButtonAnterioresDepreciacionActivoFijo;
	protected JButton jButtonSiguientesDepreciacionActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosDepreciacionActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDepreciacionActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoDepreciacionActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionDepreciacionActivoFijo;
	//protected JButton jButtonGenerarImportacionDepreciacionActivoFijo;
	//protected JButton jButtonCerrarImportacionDepreciacionActivoFijo;
	//protected JFileChooser jFileChooserImportacionDepreciacionActivoFijo;
	//protected File fileImportacionDepreciacionActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDepreciacionActivoFijo;
	protected JButton jButtonDuplicarToolBarDepreciacionActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarDepreciacionActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarDepreciacionActivoFijo;
	protected JButton jButtonCopiarToolBarDepreciacionActivoFijo;
	protected JButton jButtonVerFormToolBarDepreciacionActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarDepreciacionActivoFijo;
	protected JButton jButtonCerrarToolBarDepreciacionActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarDepreciacionActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarDepreciacionActivoFijo;
	protected JButton jButtonAnterioresToolBarDepreciacionActivoFijo;
	protected JButton jButtonSiguientesToolBarDepreciacionActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarDepreciacionActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarDepreciacionActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDepreciacionActivoFijo;
	protected JMenuItem jMenuItemDuplicarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesDepreciacionActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDepreciacionActivoFijo;
	protected JMenuItem jMenuItemCopiarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemVerFormDepreciacionActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaDepreciacionActivoFijo;
	protected JMenuItem jMenuItemCerrarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarDepreciacionActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarDepreciacionActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionDepreciacionActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionDepreciacionActivoFijo;
	protected JMenuItem jMenuItemAnterioresDepreciacionActivoFijo;
	protected JMenuItem jMenuItemSiguientesDepreciacionActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByDepreciacionActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarDepreciacionActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDepreciacionActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDepreciacionActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosDepreciacionActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDepreciacionActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDepreciacionActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralDepreciacionActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDepreciacionActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteDepreciacionActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteDepreciacionActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteDepreciacionActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteDepreciacionActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteDepreciacionActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDepreciacionActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDepreciacionActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDepreciacionActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoDepreciacionActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionDepreciacionActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionDepreciacionActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionDepreciacionActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDepreciacionActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorDepreciacionActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDepreciacionActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoDepreciacionActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoDepreciacionActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoDepreciacionActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDepreciacionActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDepreciacionActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDepreciacionActivoFijo;
	public JPanel jPanelFK_IdAnioDepreciacionActivoFijo;
	public JButton jButtonFK_IdAnioDepreciacionActivoFijo;
	public JPanel jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo;
	public JButton jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo;
	public JPanel jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo;
	public JButton jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo;
	public JPanel jPanelFK_IdMesDepreciacionActivoFijo;
	public JButton jButtonFK_IdMesDepreciacionActivoFijo;
	public JPanel jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo;
	public JButton jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo;
	
	public JPanel jPanelid_anioFK_IdAnioDepreciacionActivoFijo;
	public JLabel jLabelid_anioFK_IdAnioDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo;
	public JButton jButtonid_anioFK_IdAnioDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioDepreciacionActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo;
	public JLabel jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo;
	public JButton jButtonid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesDepreciacionActivoFijo;
	public JLabel jLabelid_mesFK_IdMesDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesDepreciacionActivoFijo;
	public JButton jButtonid_mesFK_IdMesDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesDepreciacionActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo;
	public JLabel jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo;
	public JButton jButtonid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	public DepreciacionActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepreciacionActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDepreciacionActivoFijo)	{
		this.jButtonRecargarInformacionDepreciacionActivoFijo = jButtonRecargarInformacionDepreciacionActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionDepreciacionActivoFijo() {
		return this.jButtonProcesarInformacionDepreciacionActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDepreciacionActivoFijo)	{
		this.jButtonProcesarInformacionDepreciacionActivoFijo = jButtonProcesarInformacionDepreciacionActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionDepreciacionActivoFijo() {
		return this.jButtonRecargarInformacionDepreciacionActivoFijo;
	}
	
	
	public List<DepreciacionActivoFijo> getdepreciacionactivofijos() {
		return this.depreciacionactivofijos;
	}

	public void setdepreciacionactivofijos(List<DepreciacionActivoFijo> depreciacionactivofijos) {
		this.depreciacionactivofijos = depreciacionactivofijos;
	}
	
	public List<DepreciacionActivoFijo> getdepreciacionactivofijosAux() {
		return this.depreciacionactivofijosAux;
	}

	public void setdepreciacionactivofijosAux(List<DepreciacionActivoFijo> depreciacionactivofijosAux) {
		this.depreciacionactivofijosAux = depreciacionactivofijosAux;
	}
	
	public List<DepreciacionActivoFijo> getdepreciacionactivofijosEliminados() {
		return this.depreciacionactivofijosEliminados;
	}

	public void setDepreciacionActivoFijosEliminados(List<DepreciacionActivoFijo> depreciacionactivofijosEliminados) {
		this.depreciacionactivofijosEliminados = depreciacionactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDepreciacionActivoFijo() {
		return jComboBoxTiposSeleccionarDepreciacionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDepreciacionActivoFijo(
			JComboBox jComboBoxTiposSeleccionarDepreciacionActivoFijo) {
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo = jComboBoxTiposSeleccionarDepreciacionActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDepreciacionActivoFijo() {
		return jTextFieldValorCampoGeneralDepreciacionActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralDepreciacionActivoFijo(
			JTextField jTextFieldValorCampoGeneralDepreciacionActivoFijo) {
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo = jTextFieldValorCampoGeneralDepreciacionActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDepreciacionActivoFijo() {
		return this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosDepreciacionActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosDepreciacionActivoFijo) {
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo = jCheckBoxSeleccionarTodosDepreciacionActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDepreciacionActivoFijo() {
		return this.jCheckBoxSeleccionadosDepreciacionActivoFijo;
	}

	public void setjCheckBoxSeleccionadosDepreciacionActivoFijo(
			JCheckBox jCheckBoxSeleccionadosDepreciacionActivoFijo) {
		this.jCheckBoxSeleccionadosDepreciacionActivoFijo = jCheckBoxSeleccionadosDepreciacionActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDepreciacionActivoFijo() {
		return this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDepreciacionActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesDepreciacionActivoFijo) {
		this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo = jComboBoxTiposArchivosReportesDepreciacionActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDepreciacionActivoFijo() {
		return this.jComboBoxTiposReportesDepreciacionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDepreciacionActivoFijo(
			JComboBox jComboBoxTiposReportesDepreciacionActivoFijo) {
		this.jComboBoxTiposReportesDepreciacionActivoFijo = jComboBoxTiposReportesDepreciacionActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDepreciacionActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoDepreciacionActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDepreciacionActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoDepreciacionActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo = jComboBoxTiposReportesDinamicoDepreciacionActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo = jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDepreciacionActivoFijo() {
		return this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDepreciacionActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesDepreciacionActivoFijo) {
		this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo = jComboBoxTiposGraficosReportesDepreciacionActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDepreciacionActivoFijo() {
		return this.jComboBoxTiposPaginacionDepreciacionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDepreciacionActivoFijo(
			JComboBox jComboBoxTiposPaginacionDepreciacionActivoFijo) {
		this.jComboBoxTiposPaginacionDepreciacionActivoFijo = jComboBoxTiposPaginacionDepreciacionActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDepreciacionActivoFijo() {
		return this.jComboBoxTiposRelacionesDepreciacionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDepreciacionActivoFijo() {
		return this.jComboBoxTiposAccionesDepreciacionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDepreciacionActivoFijo(
			JComboBox jComboBoxTiposRelacionesDepreciacionActivoFijo) {
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo = jComboBoxTiposRelacionesDepreciacionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDepreciacionActivoFijo(
			JComboBox jComboBoxTiposAccionesDepreciacionActivoFijo) {
		this.jComboBoxTiposAccionesDepreciacionActivoFijo = jComboBoxTiposAccionesDepreciacionActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDepreciacionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDepreciacionActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDepreciacionActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoDepreciacionActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoDepreciacionActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoDepreciacionActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo = jCheckBoxConGraficoDinamicoDepreciacionActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDepreciacionActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDepreciacionActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo .setBorder(borderResaltar);		
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
		this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		
		this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DepreciacionActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Depreciacion Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DepreciacionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDepreciacionActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"copiar","copiar","Copiar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"ver_form","ver_form","Ver"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"recargar","recargar","Recargar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDepreciacionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,
							"cerrar","cerrar","Salir"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDepreciacionActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDepreciacionActivoFijo;
			
				this.jButtonProcesarInformacionToolBarDepreciacionActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDepreciacionActivoFijo;
				
		//protected JButton jButtonModificarToolBarDepreciacionActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDepreciacionActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDepreciacionActivoFijo=new JMenuMe("General");
		this.jmenuArchivoDepreciacionActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesDepreciacionActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosDepreciacionActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDepreciacionActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDepreciacionActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDepreciacionActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDepreciacionActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDepreciacionActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDepreciacionActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDepreciacionActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDepreciacionActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDepreciacionActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDepreciacionActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDepreciacionActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDepreciacionActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDepreciacionActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDepreciacionActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDepreciacionActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDepreciacionActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDepreciacionActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDepreciacionActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDepreciacionActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDepreciacionActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDepreciacionActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDepreciacionActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDepreciacionActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDepreciacionActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDepreciacionActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDepreciacionActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDepreciacionActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDepreciacionActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDepreciacionActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDepreciacionActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDepreciacionActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDepreciacionActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDepreciacionActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDepreciacionActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDepreciacionActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDepreciacionActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDepreciacionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDepreciacionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDepreciacionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDepreciacionActivoFijo.add(this.jMenuItemCerrarDepreciacionActivoFijo);
			
			this.jmenuAccionesDepreciacionActivoFijo.add(this.jMenuItemNuevoDepreciacionActivoFijo);
			this.jmenuAccionesDepreciacionActivoFijo.add(this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo);
			this.jmenuAccionesDepreciacionActivoFijo.add(this.jMenuItemNuevoRelacionesDepreciacionActivoFijo);
			this.jmenuAccionesDepreciacionActivoFijo.add(this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo);		
			this.jmenuAccionesDepreciacionActivoFijo.add(this.jMenuItemDuplicarDepreciacionActivoFijo);		
			this.jmenuAccionesDepreciacionActivoFijo.add(this.jMenuItemCopiarDepreciacionActivoFijo);		
			this.jmenuAccionesDepreciacionActivoFijo.add(this.jMenuItemVerFormDepreciacionActivoFijo);		
			
			this.jmenuDatosDepreciacionActivoFijo.add(this.jMenuItemRecargarInformacionDepreciacionActivoFijo);				
			this.jmenuDatosDepreciacionActivoFijo.add(this.jMenuItemAnterioresDepreciacionActivoFijo);				
			this.jmenuDatosDepreciacionActivoFijo.add(this.jMenuItemSiguientesDepreciacionActivoFijo);				
			this.jmenuDatosDepreciacionActivoFijo.add(this.jMenuItemAbrirOrderByDepreciacionActivoFijo);				
			this.jmenuDatosDepreciacionActivoFijo.add(this.jMenuItemMostrarOcultarDepreciacionActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDepreciacionActivoFijo.add(this.jMenuItemGuardarCambiosDepreciacionActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDepreciacionActivoFijo.add(this.jmenuArchivoDepreciacionActivoFijo);		
			this.jmenuBarDepreciacionActivoFijo.add(this.jmenuAccionesDepreciacionActivoFijo);		
			this.jmenuBarDepreciacionActivoFijo.add(this.jmenuDatosDepreciacionActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDepreciacionActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDepreciacionActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioDepreciacionActivoFijo.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioDepreciacionActivoFijo= new JButtonMe();
		this.jButtonFK_IdAnioDepreciacionActivoFijo.setText("Buscar");
		this.jButtonFK_IdAnioDepreciacionActivoFijo.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioDepreciacionActivoFijo,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioDepreciacionActivoFijo = new JLabelMe();
		jLabelid_anioFK_IdAnioDepreciacionActivoFijo.setText("Anio :");
		jLabelid_anioFK_IdAnioDepreciacionActivoFijo.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setToolTipText("Buscar Por Estado Depre Acti ");
		this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo= new JButtonMe();
		this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setText("Buscar");
		this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setToolTipText("Buscar Por Estado Depre Acti ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo,"buscar_button","Buscar Por Estado Depre Acti ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo = new JLabelMe();
		jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setText("Estado Depre Acti :");
		jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setToolTipText("Estado Depre Acti");
		jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesDepreciacionActivoFijo.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesDepreciacionActivoFijo= new JButtonMe();
		this.jButtonFK_IdMesDepreciacionActivoFijo.setText("Buscar");
		this.jButtonFK_IdMesDepreciacionActivoFijo.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesDepreciacionActivoFijo,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesDepreciacionActivoFijo = new JLabelMe();
		jLabelid_mesFK_IdMesDepreciacionActivoFijo.setText("Mes :");
		jLabelid_mesFK_IdMesDepreciacionActivoFijo.setToolTipText("Mes");
		jLabelid_mesFK_IdMesDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setToolTipText("Buscar Por Tipo Depreciacion Empresa ");
		this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo= new JButtonMe();
		this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setText("Buscar");
		this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setToolTipText("Buscar Por Tipo Depreciacion Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo,"buscar_button","Buscar Por Tipo Depreciacion Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo = new JLabelMe();
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setText("Tipo Depreciacion Empresa :");
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setToolTipText("Tipo Depreciacion Empresa");
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDepreciacionActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasDepreciacionActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDepreciacionActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDepreciacionActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDepreciacionActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDepreciacionActivoFijo = new DepreciacionActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Depreciacion Activo Fijo DATOS");
			this.jInternalFrameDetalleFormDepreciacionActivoFijo = new DepreciacionActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.depreciacionactivofijoSessionBean.getConGuardarRelaciones(),this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo = null;//new DepreciacionActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDepreciacionActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosDepreciacionActivoFijo = new JTableMe();      
		
		String sToolTipDepreciacionActivoFijo="";
		sToolTipDepreciacionActivoFijo=DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDepreciacionActivoFijo+="(ActivosFijos.DepreciacionActivoFijo)";
		}
		
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDepreciacionActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDepreciacionActivoFijo.setToolTipText(sToolTipDepreciacionActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDepreciacionActivoFijo);
		this.jTableDatosDepreciacionActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosDepreciacionActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDepreciacionActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosDepreciacionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDepreciacionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDepreciacionActivoFijo = new JButtonMe();
		this.jButtonDuplicarDepreciacionActivoFijo = new JButtonMe();
		this.jButtonCopiarDepreciacionActivoFijo = new JButtonMe();
		this.jButtonVerFormDepreciacionActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesDepreciacionActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo = new JButtonMe();
		this.jButtonCerrarDepreciacionActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosDepreciacionActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralDepreciacionActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Depreciacion Activo Fijo";
		
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacion Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosDepreciacionActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDepreciacionActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesDepreciacionActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDepreciacionActivoFijo=new ReporteDinamicoJInternalFrame(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDepreciacionActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDepreciacionActivoFijo=new ImportacionJInternalFrame(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDepreciacionActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDepreciacionActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByDepreciacionActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByDepreciacionActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDepreciacionActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDepreciacionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciacionActivoFijo,false,this);
			
			//this.cargarOrderByDepreciacionActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDepreciacionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciacionActivoFijo,true,this);
			
			//this.cargarOrderByDepreciacionActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDepreciacionActivoFijo.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosDepreciacionActivoFijo.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosDepreciacionActivoFijo.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosDepreciacionActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDepreciacionActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDepreciacionActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDepreciacionActivoFijo.setText("Nuevo");
		this.jButtonDuplicarDepreciacionActivoFijo.setText("Duplicar");
		this.jButtonCopiarDepreciacionActivoFijo.setText("Copiar");
		this.jButtonVerFormDepreciacionActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesDepreciacionActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.setText("Guardar");
		this.jButtonCerrarDepreciacionActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDepreciacionActivoFijo,"nuevo_button","Nuevo",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDepreciacionActivoFijo,"duplicar_button","Duplicar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDepreciacionActivoFijo,"copiar_button","Copiar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDepreciacionActivoFijo,"ver_form","Ver",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDepreciacionActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDepreciacionActivoFijo,"guardarcambiostabla_button","Guardar",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDepreciacionActivoFijo,"cerrar_button","Salir",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDepreciacionActivoFijo.setToolTipText("Nuevo"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDepreciacionActivoFijo.setToolTipText("Duplicar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDepreciacionActivoFijo.setToolTipText("Copiar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDepreciacionActivoFijo.setToolTipText("Ver"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDepreciacionActivoFijo.setToolTipText("Nuevo Rel"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.setToolTipText("Guardar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDepreciacionActivoFijo.setToolTipText("Salir"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDepreciacionActivoFijo";
		inputMap = this.jButtonNuevoDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDepreciacionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDepreciacionActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarDepreciacionActivoFijo";
		inputMap = this.jButtonDuplicarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDepreciacionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDepreciacionActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarDepreciacionActivoFijo";
		inputMap = this.jButtonCopiarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDepreciacionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDepreciacionActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormDepreciacionActivoFijo";
		inputMap = this.jButtonVerFormDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDepreciacionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDepreciacionActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDepreciacionActivoFijo";
		inputMap = this.jButtonNuevoRelacionesDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDepreciacionActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDepreciacionActivoFijo";
		inputMap = this.jButtonModificarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDepreciacionActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDepreciacionActivoFijo";
		inputMap = this.jButtonCerrarDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDepreciacionActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDepreciacionActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDepreciacionActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DepreciacionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DepreciacionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DepreciacionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DepreciacionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DepreciacionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDepreciacionActivoFijo.setName("jPanelParametrosReportesDepreciacionActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDepreciacionActivoFijo.setName("jPanelParametrosReportesAccionesDepreciacionActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDepreciacionActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionDepreciacionActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionDepreciacionActivoFijo.setToolTipText("Recargar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDepreciacionActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDepreciacionActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionDepreciacionActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionDepreciacionActivoFijo.setToolTipText("Procesar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDepreciacionActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionDepreciacionActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDepreciacionActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDepreciacionActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesDepreciacionActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDepreciacionActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionDepreciacionActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDepreciacionActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDepreciacionActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDepreciacionActivoFijo = new JLabelMe();
		
		this.jLabelAccionesDepreciacionActivoFijo.setText("Acciones");		
		this.jLabelAccionesDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDepreciacionActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDepreciacionActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDepreciacionActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDepreciacionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDepreciacionActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteDepreciacionActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDepreciacionActivoFijo = new JButtonMe();
		//this.jButtonAnterioresDepreciacionActivoFijo.setText("<<");
        this.jButtonAnterioresDepreciacionActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDepreciacionActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDepreciacionActivoFijo = new JButtonMe();
		//this.jButtonSiguientesDepreciacionActivoFijo.setText(">>");
        this.jButtonSiguientesDepreciacionActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDepreciacionActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo,"nuevoguardarcambios_button","Nue",this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDepreciacionActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDepreciacionActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDepreciacionActivoFijo";
		inputMap = this.jButtonRecargarInformacionDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDepreciacionActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDepreciacionActivoFijo";
		inputMap = this.jButtonSiguientesDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDepreciacionActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDepreciacionActivoFijo";
		inputMap = this.jButtonAnterioresDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDepreciacionActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDepreciacionActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDepreciacionActivoFijo.setMinimumSize(new Dimension(this.getWidth(),DepreciacionActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepreciacionActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDepreciacionActivoFijo.setMaximumSize(new Dimension(this.getWidth(),DepreciacionActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepreciacionActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDepreciacionActivoFijo.setPreferredSize(new Dimension(this.getWidth(),DepreciacionActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepreciacionActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDepreciacionActivoFijo = new GridBagLayout();

			this.jPanelPaginacionDepreciacionActivoFijo.setLayout(gridaBagLayoutPaginacionDepreciacionActivoFijo);						
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonAnterioresDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
					
						
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
			
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
						
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonSiguientesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonNuevoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
						
			
			
			if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
				this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonGuardarCambiosTablaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			}
			
			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonDuplicarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonCopiarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonVerFormDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDepreciacionActivoFijo.add(this.jButtonCerrarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		
		this.jButtonRecargarInformacionDepreciacionActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDepreciacionActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDepreciacionActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDepreciacionActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDepreciacionActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDepreciacionActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDepreciacionActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDepreciacionActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDepreciacionActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDepreciacionActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDepreciacionActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDepreciacionActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDepreciacionActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDepreciacionActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDepreciacionActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDepreciacionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDepreciacionActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DepreciacionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DepreciacionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DepreciacionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DepreciacionActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDepreciacionActivoFijo.setLayout(gridaBagParametrosReportesDepreciacionActivoFijo);
			this.jPanelParametrosReportesAccionesDepreciacionActivoFijo.setLayout(gridaBagParametrosReportesAccionesDepreciacionActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1DepreciacionActivoFijo.setLayout(gridaBagParametrosAuxiliar1DepreciacionActivoFijo);
			this.jPanelParametrosAuxiliar2DepreciacionActivoFijo.setLayout(gridaBagParametrosAuxiliar2DepreciacionActivoFijo);
			this.jPanelParametrosAuxiliar3DepreciacionActivoFijo.setLayout(gridaBagParametrosAuxiliar3DepreciacionActivoFijo);
			this.jPanelParametrosAuxiliar4DepreciacionActivoFijo.setLayout(gridaBagParametrosAuxiliar4DepreciacionActivoFijo);
			//this.jPanelParametrosAuxiliar5DepreciacionActivoFijo.setLayout(gridaBagParametrosAuxiliar2DepreciacionActivoFijo);			
			
			
			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jButtonRecargarInformacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DepreciacionActivoFijo.add(this.jComboBoxTiposPaginacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DepreciacionActivoFijo.add(this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DepreciacionActivoFijo.add(this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jPanelParametrosAuxiliar1DepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DepreciacionActivoFijo.add(this.jComboBoxTiposReportesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);																		
			
			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DepreciacionActivoFijo.add(this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jPanelParametrosAuxiliar4DepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jComboBoxTiposReportesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jCheckBoxGenerarReporteDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jPanelParametrosAuxiliar2DepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jLabelAccionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jButtonAbrirOrderByDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jComboBoxTiposSeleccionarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
			
			
			/*
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jCheckBoxConGraficoReporteDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DepreciacionActivoFijo.add(this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);															
				
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DepreciacionActivoFijo.add(this.jCheckBoxSeleccionadosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);															
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DepreciacionActivoFijo.add(this.jCheckBoxConGraficoReporteDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jPanelParametrosAuxiliar3DepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jComboBoxTiposAccionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
	
				
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepreciacionActivoFijo.add(this.jTextFieldValorCampoGeneralDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDepreciacionActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosDepreciacionActivoFijo.setLayout(gridaBagLayoutDatosDepreciacionActivoFijo);
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosDepreciacionActivoFijo.add(this.jTableDatosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDepreciacionActivoFijo.setViewportView(this.jTableDatosDepreciacionActivoFijo);
		this.jTableDatosDepreciacionActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosDepreciacionActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDepreciacionActivoFijo= new GridBagLayout();
		this.jPanelAccionesDepreciacionActivoFijo.setLayout(gridaBagLayoutAccionesDepreciacionActivoFijo);
		
		
		/*	
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
			
		this.jPanelAccionesDepreciacionActivoFijo.add(this.jButtonNuevoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioDepreciacionActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdAnioDepreciacionActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioDepreciacionActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioDepreciacionActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioDepreciacionActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioDepreciacionActivoFijo.setLayout(gridaBagLayoutFK_IdAnioDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		jPanelFK_IdAnioDepreciacionActivoFijo.add(jLabelid_anioFK_IdAnioDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
		jPanelFK_IdAnioDepreciacionActivoFijo.add(jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
		gridBagConstraintsDepreciacionActivoFijo.gridx =1;
		jPanelFK_IdAnioDepreciacionActivoFijo.add(jButtonFK_IdAnioDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		jTabbedPaneBusquedasDepreciacionActivoFijo.addTab("1.-Por Anio ", jPanelFK_IdAnioDepreciacionActivoFijo);
		jTabbedPaneBusquedasDepreciacionActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDepreciacionActivoFijoDepreciacionActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setLayout(gridaBagLayoutFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.add(jLabelid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
		jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.add(jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
		gridBagConstraintsDepreciacionActivoFijo.gridx =1;
		jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.add(jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		jTabbedPaneBusquedasDepreciacionActivoFijo.addTab("2.-Por Estado Depre Acti ", jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
		jTabbedPaneBusquedasDepreciacionActivoFijo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoDepreciacionActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoDepreciacionActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoDepreciacionActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoDepreciacionActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoDepreciacionActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
		jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
		gridBagConstraintsDepreciacionActivoFijo.gridx =1;
		jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo.add(jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		jTabbedPaneBusquedasDepreciacionActivoFijo.addTab("3.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);
		jTabbedPaneBusquedasDepreciacionActivoFijo.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdMesDepreciacionActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdMesDepreciacionActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesDepreciacionActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesDepreciacionActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesDepreciacionActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesDepreciacionActivoFijo.setLayout(gridaBagLayoutFK_IdMesDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		jPanelFK_IdMesDepreciacionActivoFijo.add(jLabelid_mesFK_IdMesDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
		jPanelFK_IdMesDepreciacionActivoFijo.add(jComboBoxid_mesFK_IdMesDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
		gridBagConstraintsDepreciacionActivoFijo.gridx =1;
		jPanelFK_IdMesDepreciacionActivoFijo.add(jButtonFK_IdMesDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		jTabbedPaneBusquedasDepreciacionActivoFijo.addTab("4.-Por Mes ", jPanelFK_IdMesDepreciacionActivoFijo);
		jTabbedPaneBusquedasDepreciacionActivoFijo.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setLayout(gridaBagLayoutFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.add(jLabelid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 0;
		gridBagConstraintsDepreciacionActivoFijo.gridx = 1;
		jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.add(jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepreciacionActivoFijo.gridy = 1;
		gridBagConstraintsDepreciacionActivoFijo.gridx =1;
		jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.add(jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo, gridBagConstraintsDepreciacionActivoFijo);

		jTabbedPaneBusquedasDepreciacionActivoFijo.addTab("5.-Por Tipo Depreciacion Empresa ", jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
		jTabbedPaneBusquedasDepreciacionActivoFijo.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDepreciacionActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDepreciacionActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;		
			//this.gridBagConstraintsDepreciacionActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;		
		//this.gridBagConstraintsDepreciacionActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDepreciacionActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;		
			this.gridBagConstraintsDepreciacionActivoFijo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDepreciacionActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);								
		
		
		/*
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		*/		
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =0;
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDepreciacionActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
				
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDepreciacionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDepreciacionActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosDepreciacionActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosDepreciacionActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
			
			
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
			
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDepreciacionActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDepreciacionActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDepreciacionActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDepreciacionActivoFijo.setName("jPanelReporteDinamicoDepreciacionActivoFijo"); 
		
		this.jPanelReporteDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDepreciacionActivoFijo.setLayout(gridaBagLayoutReporteDinamicoDepreciacionActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoDepreciacionActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDepreciacionActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDepreciacionActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacion Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDepreciacionActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteDepreciacionActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelColumnasSelectReporteDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDepreciacionActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteDepreciacionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDepreciacionActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDepreciacionActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDepreciacionActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDepreciacionActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDepreciacionActivoFijo=new JScrollPane(this.jListColumnasSelectReporteDepreciacionActivoFijo);
			
			this.jScrollColumnasSelectReporteDepreciacionActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDepreciacionActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDepreciacionActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jListColumnasSelectReporteDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jScrollColumnasSelectReporteDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDepreciacionActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteDepreciacionActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDepreciacionActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteDepreciacionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDepreciacionActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDepreciacionActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDepreciacionActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDepreciacionActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDepreciacionActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteDepreciacionActivoFijo);
			
			this.jScrollRelacionesSelectReporteDepreciacionActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDepreciacionActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDepreciacionActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoDepreciacionActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDepreciacionActivoFijo = new JLabelMe();

		this.jLabelConGraficoDinamicoDepreciacionActivoFijo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelConGraficoDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jCheckBoxConGraficoDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDepreciacionActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDepreciacionActivoFijo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelColumnaCategoriaGraficoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDepreciacionActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaValorDepreciacionActivoFijo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelColumnaCategoriaValorDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDepreciacionActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDepreciacionActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jComboBoxColumnaCategoriaValorDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDepreciacionActivoFijo = new JLabelMe();

		this.jLabelColumnasValoresGraficoDepreciacionActivoFijo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelColumnasValoresGraficoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDepreciacionActivoFijo = new JList<Reporte>();
		this.jListColumnasValoresGraficoDepreciacionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDepreciacionActivoFijo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDepreciacionActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDepreciacionActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDepreciacionActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDepreciacionActivoFijo=new JScrollPane(this.jListColumnasValoresGraficoDepreciacionActivoFijo);
			
			this.jScrollColumnasValoresGraficoDepreciacionActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDepreciacionActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDepreciacionActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jListColumnasSelectReporteDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jScrollColumnasValoresGraficoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDepreciacionActivoFijo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDepreciacionActivoFijo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelTiposGraficosReportesDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDepreciacionActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDepreciacionActivoFijo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDepreciacionActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jComboBoxTiposGraficosReportesDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDepreciacionActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDepreciacionActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo.setToolTipText("Generar EXCEL"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jComboBoxTiposReportesDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDepreciacionActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDepreciacionActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDepreciacionActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDepreciacionActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDepreciacionActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDepreciacionActivoFijo.setToolTipText("Generar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jButtonGenerarReporteDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDepreciacionActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDepreciacionActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDepreciacionActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDepreciacionActivoFijo.setToolTipText("Cancelar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepreciacionActivoFijo.add(this.jButtonCerrarReporteDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDepreciacionActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDepreciacionActivoFijo= new JScrollPane(jPanelReporteDinamicoDepreciacionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacion Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDepreciacionActivoFijo);
		this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDepreciacionActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDepreciacionActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDepreciacionActivoFijo.setName("jPanelImportacionDepreciacionActivoFijo"); 
		
		this.jPanelImportacionDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDepreciacionActivoFijo.setLayout(gridaBagLayoutImportacionDepreciacionActivoFijo);
		
		
		this.jInternalFrameImportacionDepreciacionActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDepreciacionActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDepreciacionActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDepreciacionActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDepreciacionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDepreciacionActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDepreciacionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDepreciacionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDepreciacionActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDepreciacionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionDepreciacionActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacion Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDepreciacionActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionDepreciacionActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDepreciacionActivoFijo.add(this.jLabelArchivoImportacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDepreciacionActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionDepreciacionActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDepreciacionActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionDepreciacionActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDepreciacionActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDepreciacionActivoFijo.setToolTipText("Generar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciacionActivoFijo.add(this.jButtonAbrirImportacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDepreciacionActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionDepreciacionActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDepreciacionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDepreciacionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDepreciacionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDepreciacionActivoFijo.add(this.jLabelPathArchivoImportacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDepreciacionActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDepreciacionActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDepreciacionActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDepreciacionActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciacionActivoFijo.add(this.jTextFieldPathArchivoImportacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDepreciacionActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionDepreciacionActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDepreciacionActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDepreciacionActivoFijo.setToolTipText("Generar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciacionActivoFijo.add(this.jButtonGenerarImportacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDepreciacionActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionDepreciacionActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDepreciacionActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDepreciacionActivoFijo.setToolTipText("Cancelar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepreciacionActivoFijo.add(this.jButtonCerrarImportacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDepreciacionActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionDepreciacionActivoFijo= new JScrollPane(jPanelImportacionDepreciacionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDepreciacionActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsDepreciacionActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDepreciacionActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDepreciacionActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDepreciacionActivoFijo);
		this.jInternalFrameImportacionDepreciacionActivoFijo.getContentPane().add(this.jScrollPanelImportacionDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDepreciacionActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDepreciacionActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByDepreciacionActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByDepreciacionActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDepreciacionActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDepreciacionActivoFijo";
			inputMap = this.jButtonAbrirOrderByDepreciacionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDepreciacionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDepreciacionActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByDepreciacionActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDepreciacionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDepreciacionActivoFijo.setName("jPanelOrderByDepreciacionActivoFijo"); 
			
			this.jPanelOrderByDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDepreciacionActivoFijo.setLayout(gridaBagLayoutOrderByDepreciacionActivoFijo);
			
			
			this.jTableDatosDepreciacionActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosDepreciacionActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDepreciacionActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDepreciacionActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDepreciacionActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDepreciacionActivoFijoOrderBy.setViewportView(this.jTableDatosDepreciacionActivoFijoOrderBy);
			this.jTableDatosDepreciacionActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDepreciacionActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDepreciacionActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDepreciacionActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDepreciacionActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDepreciacionActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDepreciacionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDepreciacionActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDepreciacionActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByDepreciacionActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDepreciacionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDepreciacionActivoFijo.setResizable(true);
			this.jInternalFrameOrderByDepreciacionActivoFijo.setClosable(true);
			this.jInternalFrameOrderByDepreciacionActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDepreciacionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Depreciacion Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDepreciacionActivoFijo.ipady =150;
				
			this.jPanelOrderByDepreciacionActivoFijo.add(jScrollPanelDatosDepreciacionActivoFijoOrderBy, this.gridBagConstraintsDepreciacionActivoFijo);//this.jTableDatosDepreciacionActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDepreciacionActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByDepreciacionActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDepreciacionActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDepreciacionActivoFijo.setToolTipText("Cancelar"+" "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDepreciacionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepreciacionActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDepreciacionActivoFijo.add(this.jButtonCerrarOrderByDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDepreciacionActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByDepreciacionActivoFijo= new JScrollPane(jPanelOrderByDepreciacionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDepreciacionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDepreciacionActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsDepreciacionActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsDepreciacionActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDepreciacionActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDepreciacionActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDepreciacionActivoFijo);
			
			this.jInternalFrameOrderByDepreciacionActivoFijo.getContentPane().add(this.jScrollPanelOrderByDepreciacionActivoFijo, this.gridBagConstraintsDepreciacionActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByDepreciacionActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDepreciacionActivoFijo.getRowHeight();//DepreciacionActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo.isSelected()) {
					iHeightTable=DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDepreciacionActivoFijo.isSelected()) {
					iHeightTable=DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DepreciacionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDepreciacionActivoFijo!=null && this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDepreciacionActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDepreciacionActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDepreciacionActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDepreciacionActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDepreciacionActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDepreciacionActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=depreciacionactivofijoLogic.getDepreciacionActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depreciacionactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DepreciacionActivoFijo> TraerDepreciacionActivoFijoBeans(List<DepreciacionActivoFijo> depreciacionactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijos) {
					
				if(!(DepreciacionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DepreciacionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					depreciacionactivofijo.setsDetalleGeneralEntityReporte(DepreciacionActivoFijoConstantesFunciones.getDepreciacionActivoFijoDescripcion(depreciacionactivofijo));
										
						
					
						
					
				} else  {
							
					//depreciacionactivofijo.setsDetalleGeneralEntityReporte(depreciacionactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//depreciacionactivofijobeans.add(depreciacionactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return depreciacionactivofijos;
    }
	//PARA REPORTES FIN
}
