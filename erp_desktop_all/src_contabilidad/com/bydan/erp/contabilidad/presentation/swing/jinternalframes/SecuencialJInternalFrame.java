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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.SecuencialConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class SecuencialJInternalFrame extends SecuencialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSecuencial;
	
	protected JMenuBar jmenuBarSecuencial;
	
	protected JMenu jmenuSecuencial;
	protected JMenu jmenuDatosSecuencial;
	protected JMenu jmenuArchivoSecuencial;
	protected JMenu jmenuAccionesSecuencial;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSecuencial;	
	protected GridBagConstraints gridBagConstraintsSecuencial;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SecuencialDetalleFormJInternalFrame jInternalFrameDetalleFormSecuencial;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSecuencial;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSecuencial;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public SecuencialSessionBean secuencialSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Secuencial> secuencials;		
	public List<Secuencial> secuencialsEliminados;	
	public List<Secuencial> secuencialsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySecuencial;		
	protected JButton jButtonAbrirOrderBySecuencial;
	
	
	//protected JPanel jPanelOrderBySecuencial;
	//public JScrollPane jScrollPanelOrderBySecuencial;	
	//protected JButton jButtonCerrarOrderBySecuencial;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SecuencialLogic secuencialLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSecuencial;
	public JScrollPane jScrollPanelDatosEdicionSecuencial;
	public JScrollPane jScrollPanelDatosGeneralSecuencial;
    
	
	
	//public JScrollPane jScrollPanelDatosSecuencialOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSecuencial;
	//public JScrollPane jScrollPanelImportacionSecuencial;
	
	
	
	protected JPanel jPanelAccionesSecuencial;
	
    protected JPanel jPanelPaginacionSecuencial;
    protected JPanel jPanelParametrosReportesSecuencial;
	protected JPanel jPanelParametrosReportesAccionesSecuencial;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralSecuencial;
	protected Integer iXPanelCamposIniciogeneralSecuencial=0;
	protected Integer iYPanelCamposIniciogeneralSecuencial=0;

	protected JPanel jPanelCamposIniciosecuencialSecuencial;
	protected Integer iXPanelCamposIniciosecuencialSecuencial=0;
	protected Integer iYPanelCamposIniciosecuencialSecuencial=0;

	protected JPanel jPanelCamposInicioformatoSecuencial;
	protected Integer iXPanelCamposInicioformatoSecuencial=0;
	protected Integer iYPanelCamposInicioformatoSecuencial=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Secuencial;
	protected JPanel jPanelParametrosAuxiliar2Secuencial;
	protected JPanel jPanelParametrosAuxiliar3Secuencial;
	protected JPanel jPanelParametrosAuxiliar4Secuencial;
	//protected JPanel jPanelParametrosAuxiliar5Secuencial;
	
	
	
	//protected JPanel jPanelReporteDinamicoSecuencial;
	//protected JPanel jPanelImportacionSecuencial;
	
	
	public JTable jTableDatosSecuencial;
	
	
	
	//public JTable jTableDatosSecuencialOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSecuencial;
	protected JButton jButtonDuplicarSecuencial;
	protected JButton jButtonCopiarSecuencial;
	protected JButton jButtonVerFormSecuencial;
	protected JButton jButtonNuevoRelacionesSecuencial;
	protected JButton jButtonModificarSecuencial;
	
    protected JButton jButtonGuardarCambiosTablaSecuencial;
	protected JButton jButtonCerrarSecuencial;
	
	
	protected JButton jButtonRecargarInformacionSecuencial;
	protected JButton jButtonProcesarInformacionSecuencial;
	
	
	protected JButton jButtonAnterioresSecuencial;
	protected JButton jButtonSiguientesSecuencial;
	protected JButton jButtonNuevoGuardarCambiosSecuencial;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSecuencial;
	//protected JButton jButtonCerrarReporteDinamicoSecuencial;
	//protected JButton jButtonGenerarExcelReporteDinamicoSecuencial;	
	
	
	
	//protected JButton jButtonAbrirImportacionSecuencial;
	//protected JButton jButtonGenerarImportacionSecuencial;
	//protected JButton jButtonCerrarImportacionSecuencial;
	//protected JFileChooser jFileChooserImportacionSecuencial;
	//protected File fileImportacionSecuencial;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSecuencial;
	protected JButton jButtonDuplicarToolBarSecuencial;
	protected JButton jButtonNuevoRelacionesToolBarSecuencial;
	
	
	public JButton jButtonGuardarCambiosToolBarSecuencial;
	protected JButton jButtonCopiarToolBarSecuencial;
	protected JButton jButtonVerFormToolBarSecuencial;
	public JButton jButtonGuardarCambiosTablaToolBarSecuencial;
	protected JButton jButtonMostrarOcultarTablaToolBarSecuencial;
	protected JButton jButtonCerrarToolBarSecuencial;
	
	protected JButton jButtonRecargarInformacionToolBarSecuencial;
	protected JButton jButtonProcesarInformacionToolBarSecuencial;
	protected JButton jButtonAnterioresToolBarSecuencial;
	protected JButton jButtonSiguientesToolBarSecuencial;
	protected JButton jButtonNuevoGuardarCambiosToolBarSecuencial;
	protected JButton jButtonAbrirOrderByToolBarSecuencial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSecuencial;
	protected JMenuItem jMenuItemDuplicarSecuencial;
	protected JMenuItem jMenuItemNuevoRelacionesSecuencial;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSecuencial;
	protected JMenuItem jMenuItemCopiarSecuencial;
	protected JMenuItem jMenuItemVerFormSecuencial;
	protected JMenuItem jMenuItemGuardarCambiosTablaSecuencial;
	protected JMenuItem jMenuItemCerrarSecuencial;
	protected JMenuItem jMenuItemDetalleCerrarSecuencial;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySecuencial;
	protected JMenuItem jMenuItemDetalleMostarOcultarSecuencial;
	
	protected JMenuItem jMenuItemRecargarInformacionSecuencial;
	protected JMenuItem jMenuItemProcesarInformacionSecuencial;
	protected JMenuItem jMenuItemAnterioresSecuencial;
	protected JMenuItem jMenuItemSiguientesSecuencial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSecuencial;
	protected JMenuItem jMenuItemAbrirOrderBySecuencial;
	protected JMenuItem jMenuItemMostrarOcultarSecuencial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSecuencial;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSecuencial;
	protected JCheckBox jCheckBoxSeleccionadosSecuencial;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSecuencial;
	protected JCheckBox jCheckBoxConGraficoReporteSecuencial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSecuencial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSecuencial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSecuencial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSecuencial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSecuencial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSecuencial;
	protected JTextField jTextFieldValorCampoGeneralSecuencial;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSecuencial;
	//public JList<Reporte> jListColumnasSelectReporteSecuencial;
	//public JScrollPane jScrollColumnasSelectReporteSecuencial;
	
	//public JLabel jLabelRelacionesSelectReporteSecuencial;
	//public JList<Reporte> jListRelacionesSelectReporteSecuencial;
	//public JScrollPane jScrollRelacionesSelectReporteSecuencial;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSecuencial;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSecuencial;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSecuencial;
	//public JLabel jLabelTiposArchivoReporteDinamicoSecuencial;
	
		
	//public JLabel jLabelArchivoImportacionSecuencial;	
	//public JLabel jLabelPathArchivoImportacionSecuencial;
	//protected JTextField jTextFieldPathArchivoImportacionSecuencial;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSecuencial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSecuencial;
	
	//public JLabel jLabelColumnaCategoriaValorSecuencial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSecuencial;
	
	//public JLabel jLabelColumnasValoresGraficoSecuencial;
	//public JList<Reporte> jListColumnasValoresGraficoSecuencial;
	//public JScrollPane jScrollColumnasValoresGraficoSecuencial;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSecuencial;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSecuencial;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSecuencial;
	public JPanel jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	public JButton jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	
	public JPanel jPanelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	public JLabel jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	public JButton jButtonid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	public JLabel jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	public JButton jButtonid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencialBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	public JLabel jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial;
	public JButton jButtonid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencialUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencialBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SecuencialJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SecuencialJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSecuencial)	{
		this.jButtonRecargarInformacionSecuencial = jButtonRecargarInformacionSecuencial;
	}
	
	public JButton getjButtonProcesarInformacionSecuencial() {
		return this.jButtonProcesarInformacionSecuencial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSecuencial)	{
		this.jButtonProcesarInformacionSecuencial = jButtonProcesarInformacionSecuencial;
	}
	
	
	public JButton getjButtonRecargarInformacionSecuencial() {
		return this.jButtonRecargarInformacionSecuencial;
	}
	
	
	public List<Secuencial> getsecuencials() {
		return this.secuencials;
	}

	public void setsecuencials(List<Secuencial> secuencials) {
		this.secuencials = secuencials;
	}
	
	public List<Secuencial> getsecuencialsAux() {
		return this.secuencialsAux;
	}

	public void setsecuencialsAux(List<Secuencial> secuencialsAux) {
		this.secuencialsAux = secuencialsAux;
	}
	
	public List<Secuencial> getsecuencialsEliminados() {
		return this.secuencialsEliminados;
	}

	public void setSecuencialsEliminados(List<Secuencial> secuencialsEliminados) {
		this.secuencialsEliminados = secuencialsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSecuencial() {
		return jComboBoxTiposSeleccionarSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSecuencial(
			JComboBox jComboBoxTiposSeleccionarSecuencial) {
		this.jComboBoxTiposSeleccionarSecuencial = jComboBoxTiposSeleccionarSecuencial;
	}
	
	public void setBorderResaltarTiposSeleccionarSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSecuencial .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSecuencial() {
		return jTextFieldValorCampoGeneralSecuencial;
	}

	public void setjTextFieldValorCampoGeneralSecuencial(
			JTextField jTextFieldValorCampoGeneralSecuencial) {
		this.jTextFieldValorCampoGeneralSecuencial = jTextFieldValorCampoGeneralSecuencial;
	}

	public void setBorderResaltarValorCampoGeneralSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSecuencial .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSecuencial() {
		return this.jCheckBoxSeleccionarTodosSecuencial;
	}

	public void setjCheckBoxSeleccionarTodosSecuencial(
			JCheckBox jCheckBoxSeleccionarTodosSecuencial) {
		this.jCheckBoxSeleccionarTodosSecuencial = jCheckBoxSeleccionarTodosSecuencial;
	}

	public void setBorderResaltarSeleccionarTodosSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSecuencial .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSecuencial() {
		return this.jCheckBoxSeleccionadosSecuencial;
	}

	public void setjCheckBoxSeleccionadosSecuencial(
			JCheckBox jCheckBoxSeleccionadosSecuencial) {
		this.jCheckBoxSeleccionadosSecuencial = jCheckBoxSeleccionadosSecuencial;
	}
	
	public void setBorderResaltarSeleccionadosSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSecuencial .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSecuencial() {
		return this.jComboBoxTiposArchivosReportesSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSecuencial(
			JComboBox jComboBoxTiposArchivosReportesSecuencial) {
		this.jComboBoxTiposArchivosReportesSecuencial = jComboBoxTiposArchivosReportesSecuencial;
	}

	public void setBorderResaltarTiposArchivosReportesSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSecuencial() {
		return this.jComboBoxTiposReportesSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSecuencial(
			JComboBox jComboBoxTiposReportesSecuencial) {
		this.jComboBoxTiposReportesSecuencial = jComboBoxTiposReportesSecuencial;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSecuencial() {
	//	return jComboBoxTiposReportesDinamicoSecuencial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSecuencial(
	//		JComboBox jComboBoxTiposReportesDinamicoSecuencial) {
	//	this.jComboBoxTiposReportesDinamicoSecuencial = jComboBoxTiposReportesDinamicoSecuencial;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSecuencial() {
	//	return jComboBoxTiposArchivosReportesDinamicoSecuencial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSecuencial(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSecuencial) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSecuencial = jComboBoxTiposArchivosReportesDinamicoSecuencial;
	//}
	
	public void setBorderResaltarTiposReportesSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSecuencial() {
		return this.jComboBoxTiposGraficosReportesSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSecuencial(
			JComboBox jComboBoxTiposGraficosReportesSecuencial) {
		this.jComboBoxTiposGraficosReportesSecuencial = jComboBoxTiposGraficosReportesSecuencial;
	}
	
	public void setBorderResaltarTiposGraficosReportesSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSecuencial() {
		return this.jComboBoxTiposPaginacionSecuencial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSecuencial(
			JComboBox jComboBoxTiposPaginacionSecuencial) {
		this.jComboBoxTiposPaginacionSecuencial = jComboBoxTiposPaginacionSecuencial;
	}
	
	public void setBorderResaltarTiposPaginacionSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSecuencial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSecuencial() {
		return this.jComboBoxTiposRelacionesSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSecuencial() {
		return this.jComboBoxTiposAccionesSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSecuencial(
			JComboBox jComboBoxTiposRelacionesSecuencial) {
		this.jComboBoxTiposRelacionesSecuencial = jComboBoxTiposRelacionesSecuencial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSecuencial(
			JComboBox jComboBoxTiposAccionesSecuencial) {
		this.jComboBoxTiposAccionesSecuencial = jComboBoxTiposAccionesSecuencial;
	}
	
	public void setBorderResaltarTiposRelacionesSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSecuencial .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSecuencial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSecuencial.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSecuencial .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSecuencial() {
	//	return jCheckBoxConGraficoDinamicoSecuencial;
	//}

	//public void setjCheckBoxConGraficoDinamicoSecuencial(
	//		JCheckBox jCheckBoxConGraficoDinamicoSecuencial) {
	//	this.jCheckBoxConGraficoDinamicoSecuencial = jCheckBoxConGraficoDinamicoSecuencial;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSecuencial() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSecuencial.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSecuencial .setBorder(borderResaltar);		
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
		this.secuencialSessionBean=new SecuencialSessionBean();
		
		this.secuencialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.secuencialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.secuencialSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SecuencialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SecuencialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Secuencial MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
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
		
		SecuencialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Secuencial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSecuencial= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSecuencial,this.jTtoolBarSecuencial,
							"nuevo","nuevo","Nuevo"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSecuencial,this.jTtoolBarSecuencial,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSecuencial,this.jTtoolBarSecuencial,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSecuencial,this.jTtoolBarSecuencial,
							"duplicar","duplicar","Duplicar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSecuencial,this.jTtoolBarSecuencial,
							"copiar","copiar","Copiar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSecuencial,this.jTtoolBarSecuencial,
							"ver_form","ver_form","Ver"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSecuencial,this.jTtoolBarSecuencial,
							"recargar","recargar","Recargar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSecuencial,this.jTtoolBarSecuencial,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSecuencial,this.jTtoolBarSecuencial,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSecuencial,this.jTtoolBarSecuencial,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSecuencial,this.jTtoolBarSecuencial,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSecuencial,this.jTtoolBarSecuencial,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSecuencial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSecuencial,this.jTtoolBarSecuencial,
							"cerrar","cerrar","Salir"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSecuencial=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSecuencial;
			
				this.jButtonProcesarInformacionToolBarSecuencial=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSecuencial;
				
		//protected JButton jButtonModificarToolBarSecuencial;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSecuencial=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSecuencial=new JMenuMe("General");
		this.jmenuArchivoSecuencial=new JMenuMe("Archivo");
		this.jmenuAccionesSecuencial=new JMenuMe("Acciones");
		this.jmenuDatosSecuencial=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSecuencial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSecuencial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSecuencial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSecuencial= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSecuencial.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSecuencial,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSecuencial= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSecuencial.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSecuencial,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSecuencial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSecuencial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSecuencial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSecuencial= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSecuencial.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSecuencial,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSecuencial= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSecuencial.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSecuencial,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSecuencial= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSecuencial.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSecuencial,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSecuencial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSecuencial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSecuencial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSecuencial= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSecuencial.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSecuencial,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSecuencial= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSecuencial.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSecuencial,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSecuencial= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSecuencial.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSecuencial,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSecuencial= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSecuencial.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSecuencial,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySecuencial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySecuencial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySecuencial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySecuencial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySecuencial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySecuencial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSecuencial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSecuencial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSecuencial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSecuencial= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSecuencial.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSecuencial,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSecuencial.add(this.jMenuItemCerrarSecuencial);
			
			this.jmenuAccionesSecuencial.add(this.jMenuItemNuevoSecuencial);
			this.jmenuAccionesSecuencial.add(this.jMenuItemNuevoGuardarCambiosSecuencial);
			this.jmenuAccionesSecuencial.add(this.jMenuItemNuevoRelacionesSecuencial);
			this.jmenuAccionesSecuencial.add(this.jMenuItemGuardarCambiosTablaSecuencial);		
			this.jmenuAccionesSecuencial.add(this.jMenuItemDuplicarSecuencial);		
			this.jmenuAccionesSecuencial.add(this.jMenuItemCopiarSecuencial);		
			this.jmenuAccionesSecuencial.add(this.jMenuItemVerFormSecuencial);		
			
			this.jmenuDatosSecuencial.add(this.jMenuItemRecargarInformacionSecuencial);				
			this.jmenuDatosSecuencial.add(this.jMenuItemAnterioresSecuencial);				
			this.jmenuDatosSecuencial.add(this.jMenuItemSiguientesSecuencial);				
			this.jmenuDatosSecuencial.add(this.jMenuItemAbrirOrderBySecuencial);				
			this.jmenuDatosSecuencial.add(this.jMenuItemMostrarOcultarSecuencial);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSecuencial.add(this.jMenuItemGuardarCambiosSecuencial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSecuencial.add(this.jmenuArchivoSecuencial);		
			this.jmenuBarSecuencial.add(this.jmenuAccionesSecuencial);		
			this.jmenuBarSecuencial.add(this.jmenuDatosSecuencial);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSecuencial);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSecuencial() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setToolTipText("Buscar Por Modulo Por Ejercicio Por Tipo Movimiento Modulo ");
		this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new JButtonMe();
		this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setText("Buscar");
		this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setToolTipText("Buscar Por Modulo Por Ejercicio Por Tipo Movimiento Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"buscar_button","Buscar Por Modulo Por Ejercicio Por Tipo Movimiento Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial = new JLabelMe();
		jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setText("Modulo :");
		jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial = new JLabelMe();
		jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial = new JLabelMe();
		jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setText("Tipo Movimiento Modulo :");
		jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setToolTipText("Tipo Movimiento Modulo");
		jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSecuencial=new JTabbedPane();


		this.jTabbedPaneBusquedasSecuencial.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSecuencial.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasSecuencial.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSecuencial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSecuencial = new SecuencialDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Secuencial DATOS");
			this.jInternalFrameDetalleFormSecuencial = new SecuencialDetalleFormJInternalFrame(jDesktopPane,this.secuencialSessionBean.getConGuardarRelaciones(),this.secuencialSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSecuencial = null;//new SecuencialDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSecuencial= new GridBagLayout();
		
		
		this.jTableDatosSecuencial = new JTableMe();      
		
		String sToolTipSecuencial="";
		sToolTipSecuencial=SecuencialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSecuencial+="(Contabilidad.Secuencial)";
		}
		
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
			sToolTipSecuencial+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSecuencial.setToolTipText(sToolTipSecuencial);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSecuencial);
		this.jTableDatosSecuencial.setAutoCreateRowSorter(true);
		this.jTableDatosSecuencial.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSecuencial.setRowSelectionAllowed(true);
		this.jTableDatosSecuencial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSecuencial,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSecuencial = new JButtonMe();
		this.jButtonDuplicarSecuencial = new JButtonMe();
		this.jButtonCopiarSecuencial = new JButtonMe();
		this.jButtonVerFormSecuencial = new JButtonMe();
		this.jButtonNuevoRelacionesSecuencial = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSecuencial = new JButtonMe();
		this.jButtonCerrarSecuencial = new JButtonMe();
		
		this.jScrollPanelDatosSecuencial = new JScrollPane();   
        this.jScrollPanelDatosGeneralSecuencial = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciosecuencialSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformatoSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Secuencial";
		
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuenciales" + this.sPath));
		} else {
			this.jScrollPanelDatosSecuencial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSecuencial.setToolTipText("Acciones");
        this.jPanelAccionesSecuencial.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralSecuencial.setName("jPanelCamposFingeneralSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciosecuencialSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Secuencial"));
		this.jPanelCamposIniciosecuencialSecuencial.setName("jPanelCamposFinsecuencialSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciosecuencialSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformatoSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
		this.jPanelCamposInicioformatoSecuencial.setName("jPanelCamposFinformatoSecuencial");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformatoSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoSecuencial=new ReporteDinamicoJInternalFrame(SecuencialConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSecuencial();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSecuencial=new ImportacionJInternalFrame(SecuencialConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSecuencial();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySecuencial = new JButtonMe();
		
		this.jButtonAbrirOrderBySecuencial.setText("Orden");
		this.jButtonAbrirOrderBySecuencial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySecuencial,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySecuencial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencial,false,this);
			
			//this.cargarOrderBySecuencial(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySecuencial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencial,true,this);
			
			//this.cargarOrderBySecuencial(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSecuencial.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosSecuencial.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosSecuencial.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosSecuencial.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSecuencial.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSecuencial.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSecuencial.setText("Nuevo");
		this.jButtonDuplicarSecuencial.setText("Duplicar");
		this.jButtonCopiarSecuencial.setText("Copiar");
		this.jButtonVerFormSecuencial.setText("Ver");
		this.jButtonNuevoRelacionesSecuencial.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSecuencial.setText("Guardar");
		this.jButtonCerrarSecuencial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSecuencial,"nuevo_button","Nuevo",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSecuencial,"duplicar_button","Duplicar",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSecuencial,"copiar_button","Copiar",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSecuencial,"ver_form","Ver",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSecuencial,"nuevorelaciones_button","Nuevo Rel",this.secuencialSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSecuencial,"guardarcambiostabla_button","Guardar",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSecuencial,"cerrar_button","Salir",this.secuencialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSecuencial.setToolTipText("Nuevo"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSecuencial.setToolTipText("Duplicar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSecuencial.setToolTipText("Copiar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSecuencial.setToolTipText("Ver"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSecuencial.setToolTipText("Nuevo Rel"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSecuencial.setToolTipText("Guardar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSecuencial.setToolTipText("Salir"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSecuencial";
		inputMap = this.jButtonNuevoSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSecuencial"));
		
		//DUPLICAR
		sMapKey = "DuplicarSecuencial";
		inputMap = this.jButtonDuplicarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSecuencial"));
		
		//COPIAR
		sMapKey = "CopiarSecuencial";
		inputMap = this.jButtonCopiarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSecuencial"));
		
		//VEr FORM
		sMapKey = "VerFormSecuencial";
		inputMap = this.jButtonVerFormSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSecuencial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSecuencial"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSecuencial";
		inputMap = this.jButtonNuevoRelacionesSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSecuencial"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSecuencial";
		inputMap = this.jButtonModificarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSecuencial"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSecuencial";
		inputMap = this.jButtonCerrarSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSecuencial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSecuencial";
		inputMap = this.jButtonGuardarCambiosTablaSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSecuencial"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Secuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Secuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Secuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Secuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Secuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSecuencial.setName("jPanelParametrosReportesSecuencial"); 
		
		this.jPanelParametrosReportesAccionesSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSecuencial.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSecuencial.setName("jPanelParametrosReportesAccionesSecuencial"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSecuencial, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSecuencial = new JButtonMe();
		this.jButtonRecargarInformacionSecuencial.setText("Recargar");
		this.jButtonRecargarInformacionSecuencial.setToolTipText("Recargar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSecuencial,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSecuencial = new JButtonMe();
		this.jButtonProcesarInformacionSecuencial.setText("Procesar");
		this.jButtonProcesarInformacionSecuencial.setToolTipText("Procesar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSecuencial.setVisible(false);
			
		this.jButtonProcesarInformacionSecuencial.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSecuencial.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSecuencial.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSecuencial.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSecuencial.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSecuencial.setText("TIPO");       
		this.jComboBoxTiposReportesSecuencial.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSecuencial.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSecuencial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSecuencial.setText("Paginacion");
		this.jComboBoxTiposPaginacionSecuencial.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSecuencial.setText("Accion");
		this.jComboBoxTiposRelacionesSecuencial.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSecuencial.setText("Accion");
		this.jComboBoxTiposAccionesSecuencial.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSecuencial = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSecuencial.setText("Accion");
		this.jComboBoxTiposSeleccionarSecuencial.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSecuencial=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSecuencial.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSecuencial.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSecuencial.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSecuencial = new JLabelMe();
		
		this.jLabelAccionesSecuencial.setText("Acciones");		
		this.jLabelAccionesSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSecuencial = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSecuencial.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSecuencial.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSecuencial = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSecuencial.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSecuencial.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSecuencial = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSecuencial.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSecuencial.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSecuencial = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSecuencial.setText("Graf.");
		this.jCheckBoxConGraficoReporteSecuencial.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSecuencial = new JButtonMe();
		//this.jButtonAnterioresSecuencial.setText("<<");
        this.jButtonAnterioresSecuencial.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSecuencial,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSecuencial = new JButtonMe();
		//this.jButtonSiguientesSecuencial.setText(">>");
        this.jButtonSiguientesSecuencial.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSecuencial,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSecuencial = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSecuencial.setText("Nue");
        this.jButtonNuevoGuardarCambiosSecuencial.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSecuencial,"nuevoguardarcambios_button","Nue",this.secuencialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSecuencial";
		inputMap = this.jButtonNuevoGuardarCambiosSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSecuencial"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSecuencial";
		inputMap = this.jButtonRecargarInformacionSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSecuencial"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSecuencial";
		inputMap = this.jButtonSiguientesSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSecuencial"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSecuencial";
		inputMap = this.jButtonAnterioresSecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSecuencial"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSecuencial();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSecuencial.setMinimumSize(new Dimension(this.getWidth(),SecuencialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SecuencialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSecuencial.setMaximumSize(new Dimension(this.getWidth(),SecuencialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SecuencialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSecuencial.setPreferredSize(new Dimension(this.getWidth(),SecuencialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SecuencialBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSecuencial = new GridBagLayout();

			this.jPanelPaginacionSecuencial.setLayout(gridaBagLayoutPaginacionSecuencial);						
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = 0;
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSecuencial.add(this.jButtonAnterioresSecuencial, this.gridBagConstraintsSecuencial);
					
						
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSecuencial.gridy = 0;
			
			this.jPanelPaginacionSecuencial.add(this.jButtonNuevoGuardarCambiosSecuencial, this.gridBagConstraintsSecuencial);
						
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSecuencial.gridy = 0;
			this.jPanelPaginacionSecuencial.add(this.jButtonSiguientesSecuencial, this.gridBagConstraintsSecuencial);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = 1;
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencial.add(this.jButtonNuevoSecuencial, this.gridBagConstraintsSecuencial);
						
			
			
			if(!this.secuencialSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSecuencial = new GridBagConstraints();
				this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSecuencial.gridy = 1;
				this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSecuencial.add(this.jButtonGuardarCambiosTablaSecuencial, this.gridBagConstraintsSecuencial);
			}
			
			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = 1;
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencial.add(this.jButtonDuplicarSecuencial, this.gridBagConstraintsSecuencial);
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = 1;
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencial.add(this.jButtonCopiarSecuencial, this.gridBagConstraintsSecuencial);
		
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = 1;
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSecuencial.add(this.jButtonVerFormSecuencial, this.gridBagConstraintsSecuencial);
		
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = 1;
			this.gridBagConstraintsSecuencial.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSecuencial.add(this.jButtonCerrarSecuencial, this.gridBagConstraintsSecuencial);
		
		
		
		this.jButtonRecargarInformacionSecuencial.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSecuencial.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSecuencial.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSecuencial.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSecuencial.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSecuencial.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSecuencial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSecuencial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSecuencial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSecuencial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSecuencial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSecuencial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSecuencial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSecuencial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSecuencial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSecuencial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSecuencial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSecuencial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSecuencial.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSecuencial.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSecuencial.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSecuencial.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSecuencial.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSecuencial.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSecuencial.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSecuencial.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSecuencial.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSecuencial.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSecuencial.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSecuencial.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSecuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSecuencial = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Secuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Secuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Secuencial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Secuencial = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSecuencial.setLayout(gridaBagParametrosReportesSecuencial);
			this.jPanelParametrosReportesAccionesSecuencial.setLayout(gridaBagParametrosReportesAccionesSecuencial);
			
			
			this.jPanelParametrosAuxiliar1Secuencial.setLayout(gridaBagParametrosAuxiliar1Secuencial);
			this.jPanelParametrosAuxiliar2Secuencial.setLayout(gridaBagParametrosAuxiliar2Secuencial);
			this.jPanelParametrosAuxiliar3Secuencial.setLayout(gridaBagParametrosAuxiliar3Secuencial);
			this.jPanelParametrosAuxiliar4Secuencial.setLayout(gridaBagParametrosAuxiliar4Secuencial);
			//this.jPanelParametrosAuxiliar5Secuencial.setLayout(gridaBagParametrosAuxiliar2Secuencial);			
			
			
			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencial.add(this.jButtonRecargarInformacionSecuencial, this.gridBagConstraintsSecuencial);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Secuencial.add(this.jComboBoxTiposPaginacionSecuencial, this.gridBagConstraintsSecuencial);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Secuencial.add(this.jCheckBoxConAltoMaximoTablaSecuencial, this.gridBagConstraintsSecuencial);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Secuencial.add(this.jComboBoxTiposArchivosReportesSecuencial, this.gridBagConstraintsSecuencial);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencial.add(this.jPanelParametrosAuxiliar1Secuencial, this.gridBagConstraintsSecuencial);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSecuencial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Secuencial.add(this.jComboBoxTiposReportesSecuencial, this.gridBagConstraintsSecuencial);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencial.add(this.jPanelParametrosAuxiliar4Secuencial, this.gridBagConstraintsSecuencial);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencial.add(this.jComboBoxTiposReportesSecuencial, this.gridBagConstraintsSecuencial);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSecuencial.add(this.jCheckBoxGenerarReporteSecuencial, this.gridBagConstraintsSecuencial);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencial.add(this.jPanelParametrosAuxiliar2Secuencial, this.gridBagConstraintsSecuencial);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSecuencial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSecuencial.add(this.jLabelAccionesSecuencial, this.gridBagConstraintsSecuencial);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSecuencial = new GridBagConstraints();
				this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSecuencial.add(this.jButtonAbrirOrderBySecuencial, this.gridBagConstraintsSecuencial);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencial.add(this.jComboBoxTiposSeleccionarSecuencial, this.gridBagConstraintsSecuencial);			
			
			
			/*
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSecuencial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSecuencial.add(this.jCheckBoxSeleccionarTodosSecuencial, this.gridBagConstraintsSecuencial);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSecuencial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Secuencial.add(this.jCheckBoxSeleccionarTodosSecuencial, this.gridBagConstraintsSecuencial);															
				
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSecuencial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Secuencial.add(this.jCheckBoxSeleccionadosSecuencial, this.gridBagConstraintsSecuencial);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSecuencial.add(this.jPanelParametrosAuxiliar3Secuencial, this.gridBagConstraintsSecuencial);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencial.add(this.jComboBoxTiposAccionesSecuencial, this.gridBagConstraintsSecuencial);
	
				
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSecuencial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSecuencial.add(this.jTextFieldValorCampoGeneralSecuencial, this.gridBagConstraintsSecuencial);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralSecuencial= new GridBagLayout();
		this.jPanelCamposIniciogeneralSecuencial.setLayout(gridaBagLayoutCamposIniciogeneralSecuencial);

		GridBagLayout gridaBagLayoutCamposIniciosecuencialSecuencial= new GridBagLayout();
		this.jPanelCamposIniciosecuencialSecuencial.setLayout(gridaBagLayoutCamposIniciosecuencialSecuencial);

		GridBagLayout gridaBagLayoutCamposInicioformatoSecuencial= new GridBagLayout();
		this.jPanelCamposInicioformatoSecuencial.setLayout(gridaBagLayoutCamposInicioformatoSecuencial);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSecuencial = new GridBagLayout();

			this.jScrollPanelDatosSecuencial.setLayout(gridaBagLayoutDatosSecuencial);
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = 0;
			this.gridBagConstraintsSecuencial.gridx = 0;
			
			this.jScrollPanelDatosSecuencial.add(this.jTableDatosSecuencial, this.gridBagConstraintsSecuencial);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSecuencial.setViewportView(this.jTableDatosSecuencial);
		this.jTableDatosSecuencial.setFillsViewportHeight(true);
		this.jTableDatosSecuencial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSecuencial= new GridBagLayout();
		this.jPanelAccionesSecuencial.setLayout(gridaBagLayoutAccionesSecuencial);
		
		
		/*	
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = 0;
		this.gridBagConstraintsSecuencial.gridx = 0;
			
		this.jPanelAccionesSecuencial.add(this.jButtonNuevoSecuencial, this.gridBagConstraintsSecuencial);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorEjercicioPorModuloPorMovimientoSecuencial= new GridBagLayout();
		gridaBagLayoutBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setLayout(gridaBagLayoutBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);

		gridBagConstraintsSecuencial = new GridBagConstraints();
		gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencial.gridy = 0;
		gridBagConstraintsSecuencial.gridx = 0;
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.add(jLabelid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, gridBagConstraintsSecuencial);

		gridBagConstraintsSecuencial = new GridBagConstraints();
		gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencial.gridy = 0;
		gridBagConstraintsSecuencial.gridx = 1;
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.add(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, gridBagConstraintsSecuencial);


		gridBagConstraintsSecuencial = new GridBagConstraints();
		gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencial.gridy = 1;
		gridBagConstraintsSecuencial.gridx = 0;
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.add(jLabelid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, gridBagConstraintsSecuencial);

		gridBagConstraintsSecuencial = new GridBagConstraints();
		gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencial.gridy = 1;
		gridBagConstraintsSecuencial.gridx = 1;
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.add(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, gridBagConstraintsSecuencial);


		gridBagConstraintsSecuencial = new GridBagConstraints();
		gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencial.gridy = 2;
		gridBagConstraintsSecuencial.gridx = 0;
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.add(jLabelid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, gridBagConstraintsSecuencial);

		gridBagConstraintsSecuencial = new GridBagConstraints();
		gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencial.gridy = 2;
		gridBagConstraintsSecuencial.gridx = 1;
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.add(jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, gridBagConstraintsSecuencial);

		gridBagConstraintsSecuencial = new GridBagConstraints();
		gridBagConstraintsSecuencial.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSecuencial.gridy = 3;
		gridBagConstraintsSecuencial.gridx =1;
		jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.add(jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial, gridBagConstraintsSecuencial);

		jTabbedPaneBusquedasSecuencial.addTab("1.-Por Modulo Por Ejercicio Por Tipo Movimiento Modulo ", jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
		jTabbedPaneBusquedasSecuencial.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSecuencial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSecuencial);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSecuencial = new GridBagConstraints();						
			this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSecuencial.gridx = 0;		
			//this.gridBagConstraintsSecuencial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSecuencial.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSecuencial, this.gridBagConstraintsSecuencial);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSecuencial.gridx = 0;		
		//this.gridBagConstraintsSecuencial.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSecuencial.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSecuencial);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSecuencial.gridx = 0;		
			this.gridBagConstraintsSecuencial.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSecuencial.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSecuencial, this.gridBagConstraintsSecuencial);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSecuencial, this.gridBagConstraintsSecuencial);								
		
		
		/*
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSecuencial, this.gridBagConstraintsSecuencial);
		*/		
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSecuencial.gridx =0;
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSecuencial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSecuencial, this.gridBagConstraintsSecuencial);
				
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSecuencial, this.gridBagConstraintsSecuencial);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SecuencialJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSecuencial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSecuencial = new GridBagLayout();
			this.jPanelBusquedasParametrosSecuencial.setLayout(gridaBagLayoutBusquedasParametrosSecuencial);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSecuencial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSecuencial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSecuencial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSecuencial, this.gridBagConstraintsSecuencial);
			
			
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSecuencial, this.gridBagConstraintsSecuencial);
		
			
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSecuencial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSecuencial, this.gridBagConstraintsSecuencial);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSecuencial;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSecuencial() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSecuencial = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSecuencial.setName("jPanelReporteDinamicoSecuencial"); 
		
		this.jPanelReporteDinamicoSecuencial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSecuencial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSecuencial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSecuencial.setLayout(gridaBagLayoutReporteDinamicoSecuencial);
		
		
		this.jInternalFrameReporteDinamicoSecuencial= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSecuencial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSecuencial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSecuencial.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSecuencial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSecuencial.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSecuencial.setResizable(true);
	    this.jInternalFrameReporteDinamicoSecuencial.setClosable(true);
	    this.jInternalFrameReporteDinamicoSecuencial.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSecuencial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSecuencial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSecuencial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuenciales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSecuencial = new JLabelMe();

		this.jLabelColumnasSelectReporteSecuencial.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSecuencial.add(this.jLabelColumnasSelectReporteSecuencial, this.gridBagConstraintsSecuencial);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSecuencial = new JList<Reporte>();
		this.jListColumnasSelectReporteSecuencial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSecuencial.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSecuencial.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSecuencial.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSecuencial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSecuencial=new JScrollPane(this.jListColumnasSelectReporteSecuencial);
			
			this.jScrollColumnasSelectReporteSecuencial.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSecuencial.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSecuencial.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSecuencial.add(this.jListColumnasSelectReporteSecuencial, this.gridBagConstraintsSecuencial);
		this.jPanelReporteDinamicoSecuencial.add(this.jScrollColumnasSelectReporteSecuencial, this.gridBagConstraintsSecuencial);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSecuencial = new JLabelMe();

		this.jLabelRelacionesSelectReporteSecuencial.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSecuencial = new JList<Reporte>();
		this.jListRelacionesSelectReporteSecuencial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSecuencial.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSecuencial.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSecuencial.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSecuencial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSecuencial=new JScrollPane(this.jListRelacionesSelectReporteSecuencial);
			
			this.jScrollRelacionesSelectReporteSecuencial.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSecuencial.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSecuencial.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSecuencial = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSecuencial = new JComboBoxMe();
		this.jListColumnasValoresGraficoSecuencial = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSecuencial = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSecuencial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSecuencial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSecuencial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSecuencial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSecuencial = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSecuencial.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSecuencial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSecuencial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSecuencial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSecuencial = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSecuencial.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSecuencial.add(this.jLabelGenerarExcelReporteDinamicoSecuencial, this.gridBagConstraintsSecuencial);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSecuencial = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSecuencial.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSecuencial,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSecuencial.setToolTipText("Generar EXCEL"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSecuencial = new GridBagConstraints();
		//this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSecuencial.add(this.jButtonGenerarExcelReporteDinamicoSecuencial, this.gridBagConstraintsSecuencial);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencial.add(this.jComboBoxTiposReportesDinamicoSecuencial, this.gridBagConstraintsSecuencial);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSecuencial = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSecuencial.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSecuencial.add(this.jLabelTiposArchivoReporteDinamicoSecuencial, this.gridBagConstraintsSecuencial);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencial.add(this.jComboBoxTiposArchivosReportesDinamicoSecuencial, this.gridBagConstraintsSecuencial);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSecuencial = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSecuencial.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSecuencial,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSecuencial.setToolTipText("Generar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencial.add(this.jButtonGenerarReporteDinamicoSecuencial, this.gridBagConstraintsSecuencial);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSecuencial = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSecuencial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSecuencial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSecuencial.setToolTipText("Cancelar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSecuencial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSecuencial.add(this.jButtonCerrarReporteDinamicoSecuencial, this.gridBagConstraintsSecuencial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSecuencial = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSecuencial= new JScrollPane(jPanelReporteDinamicoSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSecuencial.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSecuencial.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSecuencial.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuenciales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSecuencial.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSecuencial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSecuencial.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSecuencial);
		this.jInternalFrameReporteDinamicoSecuencial.getContentPane().add(this.jScrollPanelReporteDinamicoSecuencial, this.gridBagConstraintsSecuencial);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSecuencial() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSecuencial = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSecuencial.setName("jPanelImportacionSecuencial"); 
		
		this.jPanelImportacionSecuencial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSecuencial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSecuencial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSecuencial.setLayout(gridaBagLayoutImportacionSecuencial);
		
		
		this.jInternalFrameImportacionSecuencial= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSecuencial= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSecuencial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSecuencial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSecuencial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSecuencial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSecuencial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSecuencial.setResizable(true);
	    this.jInternalFrameImportacionSecuencial.setClosable(true);
	    this.jInternalFrameImportacionSecuencial.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSecuencial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSecuencial.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSecuencial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSecuencial.setResizable(true);
	    this.jInternalFrameImportacionSecuencial.setClosable(true);
	    this.jInternalFrameImportacionSecuencial.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSecuencial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSecuencial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSecuencial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuenciales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSecuencial = new JLabelMe();

		this.jLabelArchivoImportacionSecuencial.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYImportacion;		
		this.gridBagConstraintsSecuencial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSecuencial.add(this.jLabelArchivoImportacionSecuencial, this.gridBagConstraintsSecuencial);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSecuencial = new JFileChooser();		
		this.jFileChooserImportacionSecuencial.setToolTipText("ESCOGER ARCHIVO"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSecuencial = new JButtonMe();
		this.jButtonAbrirImportacionSecuencial.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSecuencial,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSecuencial.setToolTipText("Generar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencial.add(this.jButtonAbrirImportacionSecuencial, this.gridBagConstraintsSecuencial);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSecuencial = new JLabelMe();

		this.jLabelPathArchivoImportacionSecuencial.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSecuencial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSecuencial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSecuencial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYImportacion;		
		this.gridBagConstraintsSecuencial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSecuencial.add(this.jLabelPathArchivoImportacionSecuencial, this.gridBagConstraintsSecuencial);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSecuencial=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSecuencial.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSecuencial.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSecuencial.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencial.add(this.jTextFieldPathArchivoImportacionSecuencial, this.gridBagConstraintsSecuencial);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSecuencial = new JButtonMe();
		this.jButtonGenerarImportacionSecuencial.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSecuencial,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSecuencial.setToolTipText("Generar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencial.add(this.jButtonGenerarImportacionSecuencial, this.gridBagConstraintsSecuencial);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSecuencial = new JButtonMe();
		this.jButtonCerrarImportacionSecuencial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSecuencial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSecuencial.setToolTipText("Cancelar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSecuencial.gridy = iPosYImportacion;
		this.gridBagConstraintsSecuencial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSecuencial.add(this.jButtonCerrarImportacionSecuencial, this.gridBagConstraintsSecuencial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSecuencial = new GridBagLayout();
		
		this.jScrollPanelImportacionSecuencial= new JScrollPane(jPanelImportacionSecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSecuencial = new GridBagConstraints();
		this.gridBagConstraintsSecuencial.gridy =iPosYImportacion;
		this.gridBagConstraintsSecuencial.gridx =iPosXImportacion;
		this.gridBagConstraintsSecuencial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSecuencial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSecuencial.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSecuencial);
		this.jInternalFrameImportacionSecuencial.getContentPane().add(this.jScrollPanelImportacionSecuencial, this.gridBagConstraintsSecuencial);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySecuencial(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySecuencial = new JButtonMe();
			this.jButtonAbrirOrderBySecuencial.setText("Orden");
			this.jButtonAbrirOrderBySecuencial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySecuencial,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySecuencial";
			inputMap = this.jButtonAbrirOrderBySecuencial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySecuencial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySecuencial"));
		
		
			GridBagLayout gridaBagLayoutOrderBySecuencial = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySecuencial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySecuencial.setName("jPanelOrderBySecuencial"); 
			
			this.jPanelOrderBySecuencial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySecuencial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySecuencial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySecuencial.setLayout(gridaBagLayoutOrderBySecuencial);
			
			
			this.jTableDatosSecuencialOrderBy = new JTableMe();        
			this.jTableDatosSecuencialOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSecuencialOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSecuencialOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSecuencialOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSecuencialOrderBy.setViewportView(this.jTableDatosSecuencialOrderBy);
			this.jTableDatosSecuencialOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSecuencialOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySecuencial= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySecuencial= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySecuencial = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSecuencial= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySecuencial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySecuencial.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySecuencial.setTitle("Orden");
			this.jInternalFrameOrderBySecuencial.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySecuencial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySecuencial.setResizable(true);
			this.jInternalFrameOrderBySecuencial.setClosable(true);
			this.jInternalFrameOrderBySecuencial.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySecuencial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySecuencial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySecuencial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySecuencial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Secuenciales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSecuencial.gridx =iPosXOrderBy;
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSecuencial.ipady =150;
				
			this.jPanelOrderBySecuencial.add(jScrollPanelDatosSecuencialOrderBy, this.gridBagConstraintsSecuencial);//this.jTableDatosSecuencialTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySecuencial = new JButtonMe();
			this.jButtonCerrarOrderBySecuencial.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySecuencial,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySecuencial.setToolTipText("Cancelar"+" "+SecuencialConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySecuencial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSecuencial.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSecuencial.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySecuencial.add(this.jButtonCerrarOrderBySecuencial, this.gridBagConstraintsSecuencial);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSecuencial = new GridBagLayout();
			
			this.jScrollPanelOrderBySecuencial= new JScrollPane(jPanelOrderBySecuencial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSecuencial = new GridBagConstraints();
			this.gridBagConstraintsSecuencial.gridy =iPosYOrderBy;
			this.gridBagConstraintsSecuencial.gridx =iPosXOrderBy;
			this.gridBagConstraintsSecuencial.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySecuencial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySecuencial.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSecuencial);
			
			this.jInternalFrameOrderBySecuencial.getContentPane().add(this.jScrollPanelOrderBySecuencial, this.gridBagConstraintsSecuencial);			
		
		} else {
			this.jButtonAbrirOrderBySecuencial = new JButtonMe();
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
		int iWidthTableCalculado=0;//4230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.secuencialSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSecuencial.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSecuencial.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSecuencial.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSecuencial.getRowHeight();//SecuencialConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSecuencial.isSelected()) {
					iHeightTable=SecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSecuencial.isSelected()) {
					iHeightTable=SecuencialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SecuencialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSecuencial.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSecuencial.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSecuencial.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSecuencial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSecuencial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSecuencial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySecuencial!=null && this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy()!=null) {
			//if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySecuencial.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySecuencial.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySecuencial.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSecuencial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSecuencial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSecuencial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=secuencialLogic.getSecuencials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=secuencials.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Secuencial> TraerSecuencialBeans(List<Secuencial> secuencials,ArrayList<Classe> classes)throws Exception {
		try {
			for(Secuencial secuencial:secuencials) {
					
				if(!(SecuencialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SecuencialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					secuencial.setsDetalleGeneralEntityReporte(SecuencialConstantesFunciones.getSecuencialDescripcion(secuencial));
										
						
					
						
					
				} else  {
							
					//secuencial.setsDetalleGeneralEntityReporte(secuencial.getsDetalleGeneralEntityReporte());
										
				}
				
				//secuencialbeans.add(secuencialbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return secuencials;
    }
	//PARA REPORTES FIN
}
