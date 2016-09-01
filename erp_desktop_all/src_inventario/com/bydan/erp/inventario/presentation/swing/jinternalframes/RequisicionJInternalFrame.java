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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.RequisicionConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class RequisicionJInternalFrame extends RequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRequisicion;
	
	protected JMenuBar jmenuBarRequisicion;
	
	protected JMenu jmenuRequisicion;
	protected JMenu jmenuDatosRequisicion;
	protected JMenu jmenuArchivoRequisicion;
	protected JMenu jmenuAccionesRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRequisicion;	
	protected GridBagConstraints gridBagConstraintsRequisicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RequisicionDetalleFormJInternalFrame jInternalFrameDetalleFormRequisicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRequisicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRequisicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoRequisicionBeanSwingJInternalFrame tiporequisicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporequisicion="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstadoRequisicionBeanSwingJInternalFrame estadorequisicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadorequisicion="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected BodegaBeanSwingJInternalFrame bodegasolicitarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegasolicitar="";

	protected BodegaBeanSwingJInternalFrame bodegasolicitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegasolicita="";
	
	public RequisicionSessionBean requisicionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoRequisicionSessionBean tiporequisicionSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstadoRequisicionSessionBean estadorequisicionSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public BodegaSessionBean bodegasolicitarSessionBean;
	public BodegaSessionBean bodegasolicitaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Requisicion> requisicions;		
	public List<Requisicion> requisicionsEliminados;	
	public List<Requisicion> requisicionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRequisicion;		
	protected JButton jButtonAbrirOrderByRequisicion;
	
	
	//protected JPanel jPanelOrderByRequisicion;
	//public JScrollPane jScrollPanelOrderByRequisicion;	
	//protected JButton jButtonCerrarOrderByRequisicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RequisicionLogic requisicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRequisicion;
	public JScrollPane jScrollPanelDatosEdicionRequisicion;
	public JScrollPane jScrollPanelDatosGeneralRequisicion;
    
	
	
	//public JScrollPane jScrollPanelDatosRequisicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRequisicion;
	//public JScrollPane jScrollPanelImportacionRequisicion;
	
	
	
	protected JPanel jPanelAccionesRequisicion;
	
    protected JPanel jPanelPaginacionRequisicion;
    protected JPanel jPanelParametrosReportesRequisicion;
	protected JPanel jPanelParametrosReportesAccionesRequisicion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Requisicion;
	protected JPanel jPanelParametrosAuxiliar2Requisicion;
	protected JPanel jPanelParametrosAuxiliar3Requisicion;
	protected JPanel jPanelParametrosAuxiliar4Requisicion;
	//protected JPanel jPanelParametrosAuxiliar5Requisicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoRequisicion;
	//protected JPanel jPanelImportacionRequisicion;
	
	
	public JTable jTableDatosRequisicion;
	
	
	
	//public JTable jTableDatosRequisicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRequisicion;
	protected JButton jButtonDuplicarRequisicion;
	protected JButton jButtonCopiarRequisicion;
	protected JButton jButtonVerFormRequisicion;
	protected JButton jButtonNuevoRelacionesRequisicion;
	protected JButton jButtonModificarRequisicion;
	
    protected JButton jButtonGuardarCambiosTablaRequisicion;
	protected JButton jButtonCerrarRequisicion;
	
	
	protected JButton jButtonRecargarInformacionRequisicion;
	protected JButton jButtonProcesarInformacionRequisicion;
	
	
	protected JButton jButtonAnterioresRequisicion;
	protected JButton jButtonSiguientesRequisicion;
	protected JButton jButtonNuevoGuardarCambiosRequisicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRequisicion;
	//protected JButton jButtonCerrarReporteDinamicoRequisicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoRequisicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionRequisicion;
	//protected JButton jButtonGenerarImportacionRequisicion;
	//protected JButton jButtonCerrarImportacionRequisicion;
	//protected JFileChooser jFileChooserImportacionRequisicion;
	//protected File fileImportacionRequisicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRequisicion;
	protected JButton jButtonDuplicarToolBarRequisicion;
	protected JButton jButtonNuevoRelacionesToolBarRequisicion;
	
	
	public JButton jButtonGuardarCambiosToolBarRequisicion;
	protected JButton jButtonCopiarToolBarRequisicion;
	protected JButton jButtonVerFormToolBarRequisicion;
	public JButton jButtonGuardarCambiosTablaToolBarRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarRequisicion;
	protected JButton jButtonCerrarToolBarRequisicion;
	
	protected JButton jButtonRecargarInformacionToolBarRequisicion;
	protected JButton jButtonProcesarInformacionToolBarRequisicion;
	protected JButton jButtonAnterioresToolBarRequisicion;
	protected JButton jButtonSiguientesToolBarRequisicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarRequisicion;
	protected JButton jButtonAbrirOrderByToolBarRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRequisicion;
	protected JMenuItem jMenuItemDuplicarRequisicion;
	protected JMenuItem jMenuItemNuevoRelacionesRequisicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRequisicion;
	protected JMenuItem jMenuItemCopiarRequisicion;
	protected JMenuItem jMenuItemVerFormRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaRequisicion;
	protected JMenuItem jMenuItemCerrarRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarRequisicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarRequisicion;
	
	protected JMenuItem jMenuItemRecargarInformacionRequisicion;
	protected JMenuItem jMenuItemProcesarInformacionRequisicion;
	protected JMenuItem jMenuItemAnterioresRequisicion;
	protected JMenuItem jMenuItemSiguientesRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRequisicion;
	protected JMenuItem jMenuItemAbrirOrderByRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRequisicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRequisicion;
	protected JCheckBox jCheckBoxSeleccionadosRequisicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRequisicion;
	protected JCheckBox jCheckBoxConGraficoReporteRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRequisicion;
	protected JTextField jTextFieldValorCampoGeneralRequisicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRequisicion;
	//public JList<Reporte> jListColumnasSelectReporteRequisicion;
	//public JScrollPane jScrollColumnasSelectReporteRequisicion;
	
	//public JLabel jLabelRelacionesSelectReporteRequisicion;
	//public JList<Reporte> jListRelacionesSelectReporteRequisicion;
	//public JScrollPane jScrollRelacionesSelectReporteRequisicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRequisicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRequisicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRequisicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoRequisicion;
	
		
	//public JLabel jLabelArchivoImportacionRequisicion;	
	//public JLabel jLabelPathArchivoImportacionRequisicion;
	//protected JTextField jTextFieldPathArchivoImportacionRequisicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRequisicion;
	
	//public JLabel jLabelColumnaCategoriaValorRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRequisicion;
	
	//public JLabel jLabelColumnasValoresGraficoRequisicion;
	//public JList<Reporte> jListColumnasValoresGraficoRequisicion;
	//public JScrollPane jScrollColumnasValoresGraficoRequisicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRequisicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRequisicion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRequisicion;
	public JPanel jPanelBusquedaPorCodigoRequisicion;
	public JButton jButtonBusquedaPorCodigoRequisicion;
	public JPanel jPanelFK_IdBodegaSolicitaRequisicion;
	public JButton jButtonFK_IdBodegaSolicitaRequisicion;
	public JPanel jPanelFK_IdBodegaSolicitarRequisicion;
	public JButton jButtonFK_IdBodegaSolicitarRequisicion;
	public JPanel jPanelFK_IdEmpleadoRequisicion;
	public JButton jButtonFK_IdEmpleadoRequisicion;
	public JPanel jPanelFK_IdTipoRequisicionRequisicion;
	public JButton jButtonFK_IdTipoRequisicionRequisicion;
	
	public JPanel jPanelnumero_secuencialBusquedaPorCodigoRequisicion;
	public JLabel jLabelnumero_secuencialBusquedaPorCodigoRequisicion;
	public JTextField jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion;
	public JButton jButtonnumero_secuencialBusquedaPorCodigoRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion;
	public JLabel jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion;
	public JButton jButtonid_bodega_solicitaFK_IdBodegaSolicitaRequisicion= new JButtonMe();
	public JButton jButtonid_bodega_solicitaFK_IdBodegaSolicitaRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_bodega_solicitaFK_IdBodegaSolicitaRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion;
	public JLabel jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion;
	public JButton jButtonid_bodega_solicitarFK_IdBodegaSolicitarRequisicion= new JButtonMe();
	public JButton jButtonid_bodega_solicitarFK_IdBodegaSolicitarRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_bodega_solicitarFK_IdBodegaSolicitarRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoRequisicion;
	public JLabel jLabelid_empleadoFK_IdEmpleadoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoRequisicion;
	public JButton jButtonid_empleadoFK_IdEmpleadoRequisicion= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_requisicionFK_IdTipoRequisicionRequisicion;
	public JLabel jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion;
	public JButton jButtonid_tipo_requisicionFK_IdTipoRequisicionRequisicion= new JButtonMe();
	public JButton jButtonid_tipo_requisicionFK_IdTipoRequisicionRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_requisicionFK_IdTipoRequisicionRequisicionBusqueda= new JButtonMe();

	
	
	
	
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
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RequisicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRequisicion)	{
		this.jButtonRecargarInformacionRequisicion = jButtonRecargarInformacionRequisicion;
	}
	
	public JButton getjButtonProcesarInformacionRequisicion() {
		return this.jButtonProcesarInformacionRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRequisicion)	{
		this.jButtonProcesarInformacionRequisicion = jButtonProcesarInformacionRequisicion;
	}
	
	
	public JButton getjButtonRecargarInformacionRequisicion() {
		return this.jButtonRecargarInformacionRequisicion;
	}
	
	
	public List<Requisicion> getrequisicions() {
		return this.requisicions;
	}

	public void setrequisicions(List<Requisicion> requisicions) {
		this.requisicions = requisicions;
	}
	
	public List<Requisicion> getrequisicionsAux() {
		return this.requisicionsAux;
	}

	public void setrequisicionsAux(List<Requisicion> requisicionsAux) {
		this.requisicionsAux = requisicionsAux;
	}
	
	public List<Requisicion> getrequisicionsEliminados() {
		return this.requisicionsEliminados;
	}

	public void setRequisicionsEliminados(List<Requisicion> requisicionsEliminados) {
		this.requisicionsEliminados = requisicionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRequisicion() {
		return jComboBoxTiposSeleccionarRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRequisicion(
			JComboBox jComboBoxTiposSeleccionarRequisicion) {
		this.jComboBoxTiposSeleccionarRequisicion = jComboBoxTiposSeleccionarRequisicion;
	}
	
	public void setBorderResaltarTiposSeleccionarRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRequisicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRequisicion() {
		return jTextFieldValorCampoGeneralRequisicion;
	}

	public void setjTextFieldValorCampoGeneralRequisicion(
			JTextField jTextFieldValorCampoGeneralRequisicion) {
		this.jTextFieldValorCampoGeneralRequisicion = jTextFieldValorCampoGeneralRequisicion;
	}

	public void setBorderResaltarValorCampoGeneralRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRequisicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRequisicion() {
		return this.jCheckBoxSeleccionarTodosRequisicion;
	}

	public void setjCheckBoxSeleccionarTodosRequisicion(
			JCheckBox jCheckBoxSeleccionarTodosRequisicion) {
		this.jCheckBoxSeleccionarTodosRequisicion = jCheckBoxSeleccionarTodosRequisicion;
	}

	public void setBorderResaltarSeleccionarTodosRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRequisicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRequisicion() {
		return this.jCheckBoxSeleccionadosRequisicion;
	}

	public void setjCheckBoxSeleccionadosRequisicion(
			JCheckBox jCheckBoxSeleccionadosRequisicion) {
		this.jCheckBoxSeleccionadosRequisicion = jCheckBoxSeleccionadosRequisicion;
	}
	
	public void setBorderResaltarSeleccionadosRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRequisicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRequisicion() {
		return this.jComboBoxTiposArchivosReportesRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRequisicion(
			JComboBox jComboBoxTiposArchivosReportesRequisicion) {
		this.jComboBoxTiposArchivosReportesRequisicion = jComboBoxTiposArchivosReportesRequisicion;
	}

	public void setBorderResaltarTiposArchivosReportesRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRequisicion() {
		return this.jComboBoxTiposReportesRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRequisicion(
			JComboBox jComboBoxTiposReportesRequisicion) {
		this.jComboBoxTiposReportesRequisicion = jComboBoxTiposReportesRequisicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRequisicion() {
	//	return jComboBoxTiposReportesDinamicoRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRequisicion(
	//		JComboBox jComboBoxTiposReportesDinamicoRequisicion) {
	//	this.jComboBoxTiposReportesDinamicoRequisicion = jComboBoxTiposReportesDinamicoRequisicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRequisicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRequisicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRequisicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRequisicion = jComboBoxTiposArchivosReportesDinamicoRequisicion;
	//}
	
	public void setBorderResaltarTiposReportesRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRequisicion() {
		return this.jComboBoxTiposGraficosReportesRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRequisicion(
			JComboBox jComboBoxTiposGraficosReportesRequisicion) {
		this.jComboBoxTiposGraficosReportesRequisicion = jComboBoxTiposGraficosReportesRequisicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRequisicion() {
		return this.jComboBoxTiposPaginacionRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRequisicion(
			JComboBox jComboBoxTiposPaginacionRequisicion) {
		this.jComboBoxTiposPaginacionRequisicion = jComboBoxTiposPaginacionRequisicion;
	}
	
	public void setBorderResaltarTiposPaginacionRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRequisicion() {
		return this.jComboBoxTiposRelacionesRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRequisicion() {
		return this.jComboBoxTiposAccionesRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRequisicion(
			JComboBox jComboBoxTiposRelacionesRequisicion) {
		this.jComboBoxTiposRelacionesRequisicion = jComboBoxTiposRelacionesRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRequisicion(
			JComboBox jComboBoxTiposAccionesRequisicion) {
		this.jComboBoxTiposAccionesRequisicion = jComboBoxTiposAccionesRequisicion;
	}
	
	public void setBorderResaltarTiposRelacionesRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRequisicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRequisicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRequisicion() {
	//	return jCheckBoxConGraficoDinamicoRequisicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoRequisicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoRequisicion) {
	//	this.jCheckBoxConGraficoDinamicoRequisicion = jCheckBoxConGraficoDinamicoRequisicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRequisicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRequisicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRequisicion .setBorder(borderResaltar);		
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
		this.requisicionSessionBean=new RequisicionSessionBean();
		
		this.requisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.requisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.requisicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Requisicion MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
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
		
		RequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRequisicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRequisicion,this.jTtoolBarRequisicion,
							"nuevo","nuevo","Nuevo"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRequisicion,this.jTtoolBarRequisicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRequisicion,this.jTtoolBarRequisicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRequisicion,this.jTtoolBarRequisicion,
							"duplicar","duplicar","Duplicar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRequisicion,this.jTtoolBarRequisicion,
							"copiar","copiar","Copiar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRequisicion,this.jTtoolBarRequisicion,
							"ver_form","ver_form","Ver"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRequisicion,this.jTtoolBarRequisicion,
							"recargar","recargar","Recargar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRequisicion,this.jTtoolBarRequisicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRequisicion,this.jTtoolBarRequisicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRequisicion,this.jTtoolBarRequisicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRequisicion,this.jTtoolBarRequisicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRequisicion,this.jTtoolBarRequisicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRequisicion,this.jTtoolBarRequisicion,
							"cerrar","cerrar","Salir"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRequisicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRequisicion;
			
				this.jButtonProcesarInformacionToolBarRequisicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRequisicion;
				
		//protected JButton jButtonModificarToolBarRequisicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRequisicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRequisicion=new JMenuMe("General");
		this.jmenuArchivoRequisicion=new JMenuMe("Archivo");
		this.jmenuAccionesRequisicion=new JMenuMe("Acciones");
		this.jmenuDatosRequisicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRequisicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRequisicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRequisicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRequisicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRequisicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRequisicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRequisicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRequisicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRequisicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRequisicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRequisicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRequisicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRequisicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRequisicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRequisicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRequisicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRequisicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRequisicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRequisicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRequisicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRequisicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRequisicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRequisicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRequisicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRequisicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRequisicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRequisicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRequisicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRequisicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRequisicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRequisicion.add(this.jMenuItemCerrarRequisicion);
			
			this.jmenuAccionesRequisicion.add(this.jMenuItemNuevoRequisicion);
			this.jmenuAccionesRequisicion.add(this.jMenuItemNuevoGuardarCambiosRequisicion);
			this.jmenuAccionesRequisicion.add(this.jMenuItemNuevoRelacionesRequisicion);
			this.jmenuAccionesRequisicion.add(this.jMenuItemGuardarCambiosTablaRequisicion);		
			this.jmenuAccionesRequisicion.add(this.jMenuItemDuplicarRequisicion);		
			this.jmenuAccionesRequisicion.add(this.jMenuItemCopiarRequisicion);		
			this.jmenuAccionesRequisicion.add(this.jMenuItemVerFormRequisicion);		
			
			this.jmenuDatosRequisicion.add(this.jMenuItemRecargarInformacionRequisicion);				
			this.jmenuDatosRequisicion.add(this.jMenuItemAnterioresRequisicion);				
			this.jmenuDatosRequisicion.add(this.jMenuItemSiguientesRequisicion);				
			this.jmenuDatosRequisicion.add(this.jMenuItemAbrirOrderByRequisicion);				
			this.jmenuDatosRequisicion.add(this.jMenuItemMostrarOcultarRequisicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRequisicion.add(this.jMenuItemGuardarCambiosRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRequisicion.add(this.jmenuArchivoRequisicion);		
			this.jmenuBarRequisicion.add(this.jmenuAccionesRequisicion);		
			this.jmenuBarRequisicion.add(this.jmenuDatosRequisicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRequisicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRequisicion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoRequisicion.setToolTipText("Buscar Por No Secuencial ");
		this.jButtonBusquedaPorCodigoRequisicion= new JButtonMe();
		this.jButtonBusquedaPorCodigoRequisicion.setText("Buscar");
		this.jButtonBusquedaPorCodigoRequisicion.setToolTipText("Buscar Por No Secuencial ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoRequisicion,"buscar_button","Buscar Por No Secuencial ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_secuencialBusquedaPorCodigoRequisicion = new JLabelMe();
		jLabelnumero_secuencialBusquedaPorCodigoRequisicion.setText("No Secuencial :");
		jLabelnumero_secuencialBusquedaPorCodigoRequisicion.setToolTipText("No Secuencial");
		jLabelnumero_secuencialBusquedaPorCodigoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_secuencialBusquedaPorCodigoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnumero_secuencialBusquedaPorCodigoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialBusquedaPorCodigoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion= new JTextFieldMe();
		jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaSolicitaRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaSolicitaRequisicion.setToolTipText("Buscar Por Bode Solicita ");
		this.jButtonFK_IdBodegaSolicitaRequisicion= new JButtonMe();
		this.jButtonFK_IdBodegaSolicitaRequisicion.setText("Buscar");
		this.jButtonFK_IdBodegaSolicitaRequisicion.setToolTipText("Buscar Por Bode Solicita ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaSolicitaRequisicion,"buscar_button","Buscar Por Bode Solicita ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaSolicitaRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion = new JLabelMe();
		jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setText("Bode Solicita :");
		jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setToolTipText("Bode Solicita");
		jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion= new JComboBoxMe();
		jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdBodegaSolicitarRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaSolicitarRequisicion.setToolTipText("Buscar Por Bode Solicitar ");
		this.jButtonFK_IdBodegaSolicitarRequisicion= new JButtonMe();
		this.jButtonFK_IdBodegaSolicitarRequisicion.setText("Buscar");
		this.jButtonFK_IdBodegaSolicitarRequisicion.setToolTipText("Buscar Por Bode Solicitar ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaSolicitarRequisicion,"buscar_button","Buscar Por Bode Solicitar ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaSolicitarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion = new JLabelMe();
		jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setText("Bode Solicitar :");
		jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setToolTipText("Bode Solicitar");
		jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion= new JComboBoxMe();
		jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoRequisicion.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoRequisicion= new JButtonMe();
		this.jButtonFK_IdEmpleadoRequisicion.setText("Buscar");
		this.jButtonFK_IdEmpleadoRequisicion.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoRequisicion,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoRequisicion = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoRequisicion.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoRequisicion.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoRequisicion= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRequisicionRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRequisicionRequisicion.setToolTipText("Buscar Por Tipo ");
		this.jButtonFK_IdTipoRequisicionRequisicion= new JButtonMe();
		this.jButtonFK_IdTipoRequisicionRequisicion.setText("Buscar");
		this.jButtonFK_IdTipoRequisicionRequisicion.setToolTipText("Buscar Por Tipo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRequisicionRequisicion,"buscar_button","Buscar Por Tipo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRequisicionRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion = new JLabelMe();
		jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setText("Tipo :");
		jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setToolTipText("Tipo");
		jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion= new JComboBoxMe();
		jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRequisicion=new JTabbedPane();


		this.jTabbedPaneBusquedasRequisicion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRequisicion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRequisicion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleRequisicion = new RequisicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Requisicion DATOS");
			this.jInternalFrameDetalleFormRequisicion = new RequisicionDetalleFormJInternalFrame(jDesktopPane,this.requisicionSessionBean.getConGuardarRelaciones(),this.requisicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRequisicion = null;//new RequisicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRequisicion= new GridBagLayout();
		
		
		this.jTableDatosRequisicion = new JTableMe();      
		
		String sToolTipRequisicion="";
		sToolTipRequisicion=RequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRequisicion+="(Inventario.Requisicion)";
		}
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipRequisicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRequisicion.setToolTipText(sToolTipRequisicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRequisicion);
		this.jTableDatosRequisicion.setAutoCreateRowSorter(true);
		this.jTableDatosRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRequisicion.setRowSelectionAllowed(true);
		this.jTableDatosRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRequisicion = new JButtonMe();
		this.jButtonDuplicarRequisicion = new JButtonMe();
		this.jButtonCopiarRequisicion = new JButtonMe();
		this.jButtonVerFormRequisicion = new JButtonMe();
		this.jButtonNuevoRelacionesRequisicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRequisicion = new JButtonMe();
		this.jButtonCerrarRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosRequisicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralRequisicion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Requisicion";
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesRequisicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRequisicion=new ReporteDinamicoJInternalFrame(RequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRequisicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRequisicion=new ImportacionJInternalFrame(RequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRequisicion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRequisicion = new JButtonMe();
		
		this.jButtonAbrirOrderByRequisicion.setText("Orden");
		this.jButtonAbrirOrderByRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRequisicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRequisicion,false,this);
			
			//this.cargarOrderByRequisicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRequisicion,true,this);
			
			//this.cargarOrderByRequisicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRequisicion.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosRequisicion.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosRequisicion.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosRequisicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRequisicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRequisicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRequisicion.setText("Nuevo");
		this.jButtonDuplicarRequisicion.setText("Duplicar");
		this.jButtonCopiarRequisicion.setText("Copiar");
		this.jButtonVerFormRequisicion.setText("Ver");
		this.jButtonNuevoRelacionesRequisicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRequisicion.setText("Guardar");
		this.jButtonCerrarRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRequisicion,"nuevo_button","Nuevo",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRequisicion,"duplicar_button","Duplicar",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRequisicion,"copiar_button","Copiar",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRequisicion,"ver_form","Ver",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRequisicion,"nuevorelaciones_button","Nuevo Rel",this.requisicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRequisicion,"guardarcambiostabla_button","Guardar",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRequisicion,"cerrar_button","Salir",this.requisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRequisicion.setToolTipText("Nuevo"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRequisicion.setToolTipText("Duplicar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRequisicion.setToolTipText("Copiar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRequisicion.setToolTipText("Ver"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRequisicion.setToolTipText("Nuevo Rel"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRequisicion.setToolTipText("Guardar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRequisicion.setToolTipText("Salir"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRequisicion";
		inputMap = this.jButtonNuevoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRequisicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarRequisicion";
		inputMap = this.jButtonDuplicarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRequisicion"));
		
		//COPIAR
		sMapKey = "CopiarRequisicion";
		inputMap = this.jButtonCopiarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRequisicion"));
		
		//VEr FORM
		sMapKey = "VerFormRequisicion";
		inputMap = this.jButtonVerFormRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRequisicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRequisicion";
		inputMap = this.jButtonNuevoRelacionesRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRequisicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRequisicion";
		inputMap = this.jButtonModificarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRequisicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRequisicion";
		inputMap = this.jButtonCerrarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRequisicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Requisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Requisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Requisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Requisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Requisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRequisicion.setName("jPanelParametrosReportesRequisicion"); 
		
		this.jPanelParametrosReportesAccionesRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRequisicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRequisicion.setName("jPanelParametrosReportesAccionesRequisicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRequisicion = new JButtonMe();
		this.jButtonRecargarInformacionRequisicion.setText("Recargar");
		this.jButtonRecargarInformacionRequisicion.setToolTipText("Recargar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRequisicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRequisicion = new JButtonMe();
		this.jButtonProcesarInformacionRequisicion.setText("Procesar");
		this.jButtonProcesarInformacionRequisicion.setToolTipText("Procesar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRequisicion.setVisible(false);
			
		this.jButtonProcesarInformacionRequisicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRequisicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRequisicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRequisicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRequisicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRequisicion.setText("TIPO");       
		this.jComboBoxTiposReportesRequisicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRequisicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRequisicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionRequisicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRequisicion.setText("Accion");
		this.jComboBoxTiposRelacionesRequisicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesRequisicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRequisicion.setText("Accion");
		this.jComboBoxTiposSeleccionarRequisicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRequisicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRequisicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRequisicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRequisicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRequisicion = new JLabelMe();
		
		this.jLabelAccionesRequisicion.setText("Acciones");		
		this.jLabelAccionesRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRequisicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRequisicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRequisicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRequisicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRequisicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRequisicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRequisicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRequisicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRequisicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRequisicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRequisicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteRequisicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRequisicion = new JButtonMe();
		//this.jButtonAnterioresRequisicion.setText("<<");
        this.jButtonAnterioresRequisicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRequisicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRequisicion = new JButtonMe();
		//this.jButtonSiguientesRequisicion.setText(">>");
        this.jButtonSiguientesRequisicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRequisicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRequisicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRequisicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosRequisicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRequisicion,"nuevoguardarcambios_button","Nue",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRequisicion";
		inputMap = this.jButtonNuevoGuardarCambiosRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRequisicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRequisicion";
		inputMap = this.jButtonRecargarInformacionRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRequisicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRequisicion";
		inputMap = this.jButtonSiguientesRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRequisicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRequisicion";
		inputMap = this.jButtonAnterioresRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRequisicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRequisicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRequisicion.setMinimumSize(new Dimension(this.getWidth(),RequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRequisicion.setMaximumSize(new Dimension(this.getWidth(),RequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRequisicion.setPreferredSize(new Dimension(this.getWidth(),RequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRequisicion = new GridBagLayout();

			this.jPanelPaginacionRequisicion.setLayout(gridaBagLayoutPaginacionRequisicion);						
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy = 0;
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRequisicion.add(this.jButtonAnterioresRequisicion, this.gridBagConstraintsRequisicion);
					
						
			this.gridBagConstraintsRequisicion = new GridBagConstraints();//
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsRequisicion.gridy = 0;//
			
			this.jPanelPaginacionRequisicion.add(this.jButtonNuevoGuardarCambiosRequisicion, this.gridBagConstraintsRequisicion);//
						
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRequisicion.gridy = 0;
			this.jPanelPaginacionRequisicion.add(this.jButtonSiguientesRequisicion, this.gridBagConstraintsRequisicion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();//
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicion.gridy = 1;//
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicion.add(this.jButtonNuevoRequisicion, this.gridBagConstraintsRequisicion);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRequisicion = new GridBagConstraints();
				this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRequisicion.gridy = 1;
				this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRequisicion.add(this.jButtonNuevoRelacionesRequisicion, this.gridBagConstraintsRequisicion);
			}
			
			
			if(!this.requisicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRequisicion = new GridBagConstraints();//
				this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsRequisicion.gridy = 1;//
				this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionRequisicion.add(this.jButtonGuardarCambiosTablaRequisicion, this.gridBagConstraintsRequisicion);//
			}
			
			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();//
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicion.gridy = 1;//
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicion.add(this.jButtonDuplicarRequisicion, this.gridBagConstraintsRequisicion);//
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();//
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicion.gridy = 1;//
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicion.add(this.jButtonCopiarRequisicion, this.gridBagConstraintsRequisicion);//
		
			this.gridBagConstraintsRequisicion = new GridBagConstraints();//
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsRequisicion.gridy = 1;//
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionRequisicion.add(this.jButtonVerFormRequisicion, this.gridBagConstraintsRequisicion);//
		
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy = 1;
			this.gridBagConstraintsRequisicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRequisicion.add(this.jButtonCerrarRequisicion, this.gridBagConstraintsRequisicion);
		
		
		
		this.jButtonRecargarInformacionRequisicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRequisicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRequisicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRequisicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRequisicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRequisicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRequisicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRequisicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRequisicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRequisicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRequisicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRequisicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRequisicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRequisicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRequisicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRequisicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRequisicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRequisicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRequisicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Requisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Requisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Requisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Requisicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRequisicion.setLayout(gridaBagParametrosReportesRequisicion);
			this.jPanelParametrosReportesAccionesRequisicion.setLayout(gridaBagParametrosReportesAccionesRequisicion);
			
			
			this.jPanelParametrosAuxiliar1Requisicion.setLayout(gridaBagParametrosAuxiliar1Requisicion);
			this.jPanelParametrosAuxiliar2Requisicion.setLayout(gridaBagParametrosAuxiliar2Requisicion);
			this.jPanelParametrosAuxiliar3Requisicion.setLayout(gridaBagParametrosAuxiliar3Requisicion);
			this.jPanelParametrosAuxiliar4Requisicion.setLayout(gridaBagParametrosAuxiliar4Requisicion);
			//this.jPanelParametrosAuxiliar5Requisicion.setLayout(gridaBagParametrosAuxiliar2Requisicion);			
			
			
			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicion.add(this.jButtonRecargarInformacionRequisicion, this.gridBagConstraintsRequisicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Requisicion.add(this.jComboBoxTiposPaginacionRequisicion, this.gridBagConstraintsRequisicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Requisicion.add(this.jCheckBoxConAltoMaximoTablaRequisicion, this.gridBagConstraintsRequisicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Requisicion.add(this.jComboBoxTiposArchivosReportesRequisicion, this.gridBagConstraintsRequisicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicion.add(this.jPanelParametrosAuxiliar1Requisicion, this.gridBagConstraintsRequisicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Requisicion.add(this.jComboBoxTiposReportesRequisicion, this.gridBagConstraintsRequisicion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicion.add(this.jPanelParametrosAuxiliar4Requisicion, this.gridBagConstraintsRequisicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicion.add(this.jComboBoxTiposReportesRequisicion, this.gridBagConstraintsRequisicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRequisicion.add(this.jCheckBoxGenerarReporteRequisicion, this.gridBagConstraintsRequisicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicion.add(this.jPanelParametrosAuxiliar2Requisicion, this.gridBagConstraintsRequisicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRequisicion.add(this.jLabelAccionesRequisicion, this.gridBagConstraintsRequisicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRequisicion = new GridBagConstraints();
				this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRequisicion.add(this.jButtonAbrirOrderByRequisicion, this.gridBagConstraintsRequisicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicion.add(this.jComboBoxTiposSeleccionarRequisicion, this.gridBagConstraintsRequisicion);			
			
			
			/*
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRequisicion.add(this.jCheckBoxSeleccionarTodosRequisicion, this.gridBagConstraintsRequisicion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Requisicion.add(this.jCheckBoxSeleccionarTodosRequisicion, this.gridBagConstraintsRequisicion);															
				
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Requisicion.add(this.jCheckBoxSeleccionadosRequisicion, this.gridBagConstraintsRequisicion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRequisicion.add(this.jPanelParametrosAuxiliar3Requisicion, this.gridBagConstraintsRequisicion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicion.add(this.jComboBoxTiposRelacionesRequisicion, this.gridBagConstraintsRequisicion);
				
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicion.add(this.jComboBoxTiposAccionesRequisicion, this.gridBagConstraintsRequisicion);
	
				
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRequisicion.add(this.jTextFieldValorCampoGeneralRequisicion, this.gridBagConstraintsRequisicion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRequisicion = new GridBagLayout();

			this.jScrollPanelDatosRequisicion.setLayout(gridaBagLayoutDatosRequisicion);
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy = 0;
			this.gridBagConstraintsRequisicion.gridx = 0;
			
			this.jScrollPanelDatosRequisicion.add(this.jTableDatosRequisicion, this.gridBagConstraintsRequisicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRequisicion.setViewportView(this.jTableDatosRequisicion);
		this.jTableDatosRequisicion.setFillsViewportHeight(true);
		this.jTableDatosRequisicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRequisicion= new GridBagLayout();
		this.jPanelAccionesRequisicion.setLayout(gridaBagLayoutAccionesRequisicion);
		
		
		/*	
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 0;
			
		this.jPanelAccionesRequisicion.add(this.jButtonNuevoRequisicion, this.gridBagConstraintsRequisicion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoRequisicion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoRequisicion.setLayout(gridaBagLayoutBusquedaPorCodigoRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 0;
		jPanelBusquedaPorCodigoRequisicion.add(jLabelnumero_secuencialBusquedaPorCodigoRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 1;
		jPanelBusquedaPorCodigoRequisicion.add(jTextFieldnumero_secuencialBusquedaPorCodigoRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 1;
		gridBagConstraintsRequisicion.gridx =1;
		jPanelBusquedaPorCodigoRequisicion.add(jButtonBusquedaPorCodigoRequisicion, gridBagConstraintsRequisicion);

		jTabbedPaneBusquedasRequisicion.addTab("1.-Por No Secuencial ", jPanelBusquedaPorCodigoRequisicion);
		jTabbedPaneBusquedasRequisicion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBodegaSolicitaRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaSolicitaRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaSolicitaRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaSolicitaRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaSolicitaRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaSolicitaRequisicion.setLayout(gridaBagLayoutFK_IdBodegaSolicitaRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 0;
		jPanelFK_IdBodegaSolicitaRequisicion.add(jLabelid_bodega_solicitaFK_IdBodegaSolicitaRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 1;
		jPanelFK_IdBodegaSolicitaRequisicion.add(jComboBoxid_bodega_solicitaFK_IdBodegaSolicitaRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 1;
		gridBagConstraintsRequisicion.gridx =1;
		jPanelFK_IdBodegaSolicitaRequisicion.add(jButtonFK_IdBodegaSolicitaRequisicion, gridBagConstraintsRequisicion);

		jTabbedPaneBusquedasRequisicion.addTab("2.-Por Bode Solicita ", jPanelFK_IdBodegaSolicitaRequisicion);
		jTabbedPaneBusquedasRequisicion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdBodegaSolicitarRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaSolicitarRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaSolicitarRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaSolicitarRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaSolicitarRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaSolicitarRequisicion.setLayout(gridaBagLayoutFK_IdBodegaSolicitarRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 0;
		jPanelFK_IdBodegaSolicitarRequisicion.add(jLabelid_bodega_solicitarFK_IdBodegaSolicitarRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 1;
		jPanelFK_IdBodegaSolicitarRequisicion.add(jComboBoxid_bodega_solicitarFK_IdBodegaSolicitarRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 1;
		gridBagConstraintsRequisicion.gridx =1;
		jPanelFK_IdBodegaSolicitarRequisicion.add(jButtonFK_IdBodegaSolicitarRequisicion, gridBagConstraintsRequisicion);

		jTabbedPaneBusquedasRequisicion.addTab("3.-Por Bode Solicitar ", jPanelFK_IdBodegaSolicitarRequisicion);
		jTabbedPaneBusquedasRequisicion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoRequisicion.setLayout(gridaBagLayoutFK_IdEmpleadoRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 0;
		jPanelFK_IdEmpleadoRequisicion.add(jLabelid_empleadoFK_IdEmpleadoRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 1;
		jPanelFK_IdEmpleadoRequisicion.add(jComboBoxid_empleadoFK_IdEmpleadoRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 1;
		gridBagConstraintsRequisicion.gridx =1;
		jPanelFK_IdEmpleadoRequisicion.add(jButtonFK_IdEmpleadoRequisicion, gridBagConstraintsRequisicion);

		jTabbedPaneBusquedasRequisicion.addTab("4.-Por Empleado ", jPanelFK_IdEmpleadoRequisicion);
		jTabbedPaneBusquedasRequisicion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoRequisicionRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRequisicionRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRequisicionRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRequisicionRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRequisicionRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRequisicionRequisicion.setLayout(gridaBagLayoutFK_IdTipoRequisicionRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 0;
		jPanelFK_IdTipoRequisicionRequisicion.add(jLabelid_tipo_requisicionFK_IdTipoRequisicionRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 0;
		gridBagConstraintsRequisicion.gridx = 1;
		jPanelFK_IdTipoRequisicionRequisicion.add(jComboBoxid_tipo_requisicionFK_IdTipoRequisicionRequisicion, gridBagConstraintsRequisicion);

		gridBagConstraintsRequisicion = new GridBagConstraints();
		gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRequisicion.gridy = 1;
		gridBagConstraintsRequisicion.gridx =1;
		jPanelFK_IdTipoRequisicionRequisicion.add(jButtonFK_IdTipoRequisicionRequisicion, gridBagConstraintsRequisicion);

		jTabbedPaneBusquedasRequisicion.addTab("5.-Por Tipo ", jPanelFK_IdTipoRequisicionRequisicion);
		jTabbedPaneBusquedasRequisicion.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRequisicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRequisicion.gridx = 0;		
			//this.gridBagConstraintsRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRequisicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRequisicion, this.gridBagConstraintsRequisicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRequisicion.gridx = 0;		
		//this.gridBagConstraintsRequisicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRequisicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRequisicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRequisicion.gridx = 0;		
			this.gridBagConstraintsRequisicion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRequisicion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRequisicion, this.gridBagConstraintsRequisicion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRequisicion, this.gridBagConstraintsRequisicion);								
		
		
		/*
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRequisicion, this.gridBagConstraintsRequisicion);
		*/		
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRequisicion.gridx =0;
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRequisicion, this.gridBagConstraintsRequisicion);
				
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRequisicion, this.gridBagConstraintsRequisicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RequisicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRequisicion = new GridBagLayout();
			this.jPanelBusquedasParametrosRequisicion.setLayout(gridaBagLayoutBusquedasParametrosRequisicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRequisicion, this.gridBagConstraintsRequisicion);
			
			
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRequisicion, this.gridBagConstraintsRequisicion);
		
			
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRequisicion, this.gridBagConstraintsRequisicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRequisicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRequisicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRequisicion.setName("jPanelReporteDinamicoRequisicion"); 
		
		this.jPanelReporteDinamicoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRequisicion.setLayout(gridaBagLayoutReporteDinamicoRequisicion);
		
		
		this.jInternalFrameReporteDinamicoRequisicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRequisicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRequisicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoRequisicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoRequisicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisiciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRequisicion = new JLabelMe();

		this.jLabelColumnasSelectReporteRequisicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRequisicion.add(this.jLabelColumnasSelectReporteRequisicion, this.gridBagConstraintsRequisicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRequisicion = new JList<Reporte>();
		this.jListColumnasSelectReporteRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRequisicion=new JScrollPane(this.jListColumnasSelectReporteRequisicion);
			
			this.jScrollColumnasSelectReporteRequisicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRequisicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRequisicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRequisicion.add(this.jListColumnasSelectReporteRequisicion, this.gridBagConstraintsRequisicion);
		this.jPanelReporteDinamicoRequisicion.add(this.jScrollColumnasSelectReporteRequisicion, this.gridBagConstraintsRequisicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRequisicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteRequisicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRequisicion.add(this.jLabelRelacionesSelectReporteRequisicion, this.gridBagConstraintsRequisicion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRequisicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRequisicion=new JScrollPane(this.jListRelacionesSelectReporteRequisicion);
			
			this.jScrollRelacionesSelectReporteRequisicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRequisicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRequisicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRequisicion.add(this.jListRelacionesSelectReporteRequisicion, this.gridBagConstraintsRequisicion);
		this.jPanelReporteDinamicoRequisicion.add(this.jScrollRelacionesSelectReporteRequisicion, this.gridBagConstraintsRequisicion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRequisicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRequisicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoRequisicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRequisicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRequisicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRequisicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicion.add(this.jLabelGenerarExcelReporteDinamicoRequisicion, this.gridBagConstraintsRequisicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRequisicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRequisicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRequisicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRequisicion.setToolTipText("Generar EXCEL"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRequisicion.add(this.jButtonGenerarExcelReporteDinamicoRequisicion, this.gridBagConstraintsRequisicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicion.add(this.jComboBoxTiposReportesDinamicoRequisicion, this.gridBagConstraintsRequisicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRequisicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRequisicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRequisicion.add(this.jLabelTiposArchivoReporteDinamicoRequisicion, this.gridBagConstraintsRequisicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicion.add(this.jComboBoxTiposArchivosReportesDinamicoRequisicion, this.gridBagConstraintsRequisicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRequisicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRequisicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRequisicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRequisicion.setToolTipText("Generar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicion.add(this.jButtonGenerarReporteDinamicoRequisicion, this.gridBagConstraintsRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRequisicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRequisicion.setToolTipText("Cancelar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRequisicion.add(this.jButtonCerrarReporteDinamicoRequisicion, this.gridBagConstraintsRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRequisicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRequisicion= new JScrollPane(jPanelReporteDinamicoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisiciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRequisicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRequisicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRequisicion);
		this.jInternalFrameReporteDinamicoRequisicion.getContentPane().add(this.jScrollPanelReporteDinamicoRequisicion, this.gridBagConstraintsRequisicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRequisicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRequisicion.setName("jPanelImportacionRequisicion"); 
		
		this.jPanelImportacionRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRequisicion.setLayout(gridaBagLayoutImportacionRequisicion);
		
		
		this.jInternalFrameImportacionRequisicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRequisicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRequisicion.setResizable(true);
	    this.jInternalFrameImportacionRequisicion.setClosable(true);
	    this.jInternalFrameImportacionRequisicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRequisicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRequisicion.setResizable(true);
	    this.jInternalFrameImportacionRequisicion.setClosable(true);
	    this.jInternalFrameImportacionRequisicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisiciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRequisicion = new JLabelMe();

		this.jLabelArchivoImportacionRequisicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRequisicion.add(this.jLabelArchivoImportacionRequisicion, this.gridBagConstraintsRequisicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRequisicion = new JFileChooser();		
		this.jFileChooserImportacionRequisicion.setToolTipText("ESCOGER ARCHIVO"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRequisicion = new JButtonMe();
		this.jButtonAbrirImportacionRequisicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRequisicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRequisicion.setToolTipText("Generar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicion.add(this.jButtonAbrirImportacionRequisicion, this.gridBagConstraintsRequisicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRequisicion = new JLabelMe();

		this.jLabelPathArchivoImportacionRequisicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRequisicion.add(this.jLabelPathArchivoImportacionRequisicion, this.gridBagConstraintsRequisicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRequisicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRequisicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRequisicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRequisicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicion.add(this.jTextFieldPathArchivoImportacionRequisicion, this.gridBagConstraintsRequisicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRequisicion = new JButtonMe();
		this.jButtonGenerarImportacionRequisicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRequisicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRequisicion.setToolTipText("Generar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicion.add(this.jButtonGenerarImportacionRequisicion, this.gridBagConstraintsRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRequisicion = new JButtonMe();
		this.jButtonCerrarImportacionRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRequisicion.setToolTipText("Cancelar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRequisicion.add(this.jButtonCerrarImportacionRequisicion, this.gridBagConstraintsRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRequisicion = new GridBagLayout();
		
		this.jScrollPanelImportacionRequisicion= new JScrollPane(jPanelImportacionRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy =iPosYImportacion;
		this.gridBagConstraintsRequisicion.gridx =iPosXImportacion;
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRequisicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRequisicion);
		this.jInternalFrameImportacionRequisicion.getContentPane().add(this.jScrollPanelImportacionRequisicion, this.gridBagConstraintsRequisicion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRequisicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRequisicion = new JButtonMe();
			this.jButtonAbrirOrderByRequisicion.setText("Orden");
			this.jButtonAbrirOrderByRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRequisicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRequisicion";
			inputMap = this.jButtonAbrirOrderByRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRequisicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByRequisicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRequisicion.setName("jPanelOrderByRequisicion"); 
			
			this.jPanelOrderByRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRequisicion.setLayout(gridaBagLayoutOrderByRequisicion);
			
			
			this.jTableDatosRequisicionOrderBy = new JTableMe();        
			this.jTableDatosRequisicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRequisicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRequisicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRequisicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRequisicionOrderBy.setViewportView(this.jTableDatosRequisicionOrderBy);
			this.jTableDatosRequisicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRequisicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRequisicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRequisicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRequisicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRequisicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRequisicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRequisicion.setTitle("Orden");
			this.jInternalFrameOrderByRequisicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRequisicion.setResizable(true);
			this.jInternalFrameOrderByRequisicion.setClosable(true);
			this.jInternalFrameOrderByRequisicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisiciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRequisicion.ipady =150;
				
			this.jPanelOrderByRequisicion.add(jScrollPanelDatosRequisicionOrderBy, this.gridBagConstraintsRequisicion);//this.jTableDatosRequisicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRequisicion = new JButtonMe();
			this.jButtonCerrarOrderByRequisicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRequisicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRequisicion.setToolTipText("Cancelar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRequisicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRequisicion.add(this.jButtonCerrarOrderByRequisicion, this.gridBagConstraintsRequisicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRequisicion = new GridBagLayout();
			
			this.jScrollPanelOrderByRequisicion= new JScrollPane(jPanelOrderByRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRequisicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRequisicion);
			
			this.jInternalFrameOrderByRequisicion.getContentPane().add(this.jScrollPanelOrderByRequisicion, this.gridBagConstraintsRequisicion);			
		
		} else {
			this.jButtonAbrirOrderByRequisicion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.requisicionSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosRequisicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRequisicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRequisicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRequisicion.getRowHeight();//RequisicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRequisicion.isSelected()) {
					iHeightTable=RequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRequisicion.isSelected()) {
					iHeightTable=RequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRequisicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRequisicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRequisicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRequisicion!=null && this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy()!=null) {
			//if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRequisicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRequisicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRequisicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRequisicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=requisicionLogic.getRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=requisicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<Requisicion> TraerRequisicionBeans(List<Requisicion> requisicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Requisicion requisicion:requisicions) {
					
				if(!(RequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					requisicion.setsDetalleGeneralEntityReporte(RequisicionConstantesFunciones.getRequisicionDescripcion(requisicion));
										
						
					
					

					if(requisicion.getDetalleRequisicions()!=null && Funciones.existeClass(classes,DetalleRequisicion.class)) {
						try{requisicion.setdetallerequisicionsDescripcionReporte(new JRBeanCollectionDataSource(DetalleRequisicionJInternalFrame.TraerDetalleRequisicionBeans(requisicion.getDetalleRequisicions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//requisicion.setsDetalleGeneralEntityReporte(requisicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//requisicionbeans.add(requisicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return requisicions;
    }
	//PARA REPORTES FIN
}
