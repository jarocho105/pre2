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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.ProcesoSolicitudesAutorizacionesConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class ProcesoSolicitudesAutorizacionesJInternalFrame extends ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoSolicitudesAutorizaciones;
	
	protected JMenuBar jmenuBarProcesoSolicitudesAutorizaciones;
	
	protected JMenu jmenuProcesoSolicitudesAutorizaciones;
	protected JMenu jmenuDatosProcesoSolicitudesAutorizaciones;
	protected JMenu jmenuArchivoProcesoSolicitudesAutorizaciones;
	protected JMenu jmenuAccionesProcesoSolicitudesAutorizaciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoSolicitudesAutorizaciones;	
	protected GridBagConstraints gridBagConstraintsProcesoSolicitudesAutorizaciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoSolicitudesAutorizaciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ProcesoSolicitudesAutorizacionesSessionBean procesosolicitudesautorizacionesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacioness;		
	public List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessEliminados;	
	public List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoSolicitudesAutorizaciones;		
	protected JButton jButtonAbrirOrderByProcesoSolicitudesAutorizaciones;
	
	
	//protected JPanel jPanelOrderByProcesoSolicitudesAutorizaciones;
	//public JScrollPane jScrollPanelOrderByProcesoSolicitudesAutorizaciones;	
	//protected JButton jButtonCerrarOrderByProcesoSolicitudesAutorizaciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoSolicitudesAutorizacionesLogic procesosolicitudesautorizacionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoSolicitudesAutorizaciones;
	public JScrollPane jScrollPanelDatosEdicionProcesoSolicitudesAutorizaciones;
	public JScrollPane jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoSolicitudesAutorizacionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones;
	//public JScrollPane jScrollPanelImportacionProcesoSolicitudesAutorizaciones;
	
	
	
	protected JPanel jPanelAccionesProcesoSolicitudesAutorizaciones;
	
    protected JPanel jPanelPaginacionProcesoSolicitudesAutorizaciones;
    protected JPanel jPanelParametrosReportesProcesoSolicitudesAutorizaciones;
	protected JPanel jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoSolicitudesAutorizaciones;
	protected JPanel jPanelParametrosAuxiliar2ProcesoSolicitudesAutorizaciones;
	protected JPanel jPanelParametrosAuxiliar3ProcesoSolicitudesAutorizaciones;
	protected JPanel jPanelParametrosAuxiliar4ProcesoSolicitudesAutorizaciones;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoSolicitudesAutorizaciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoSolicitudesAutorizaciones;
	//protected JPanel jPanelImportacionProcesoSolicitudesAutorizaciones;
	
	
	public JTable jTableDatosProcesoSolicitudesAutorizaciones;
	
	
	
	//public JTable jTableDatosProcesoSolicitudesAutorizacionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoSolicitudesAutorizaciones;
	protected JButton jButtonDuplicarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonCopiarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonVerFormProcesoSolicitudesAutorizaciones;
	protected JButton jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones;
	protected JButton jButtonModificarProcesoSolicitudesAutorizaciones;
	
    protected JButton jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones;
	protected JButton jButtonCerrarProcesoSolicitudesAutorizaciones;
	
	
	protected JButton jButtonRecargarInformacionProcesoSolicitudesAutorizaciones;
	protected JButton jButtonProcesarInformacionProcesoSolicitudesAutorizaciones;
	
	
	protected JButton jButtonAnterioresProcesoSolicitudesAutorizaciones;
	protected JButton jButtonSiguientesProcesoSolicitudesAutorizaciones;
	protected JButton jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones;
	//protected JButton jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoSolicitudesAutorizaciones;
	//protected JButton jButtonGenerarImportacionProcesoSolicitudesAutorizaciones;
	//protected JButton jButtonCerrarImportacionProcesoSolicitudesAutorizaciones;
	//protected JFileChooser jFileChooserImportacionProcesoSolicitudesAutorizaciones;
	//protected File fileImportacionProcesoSolicitudesAutorizaciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonDuplicarToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonCopiarToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonVerFormToolBarProcesoSolicitudesAutorizaciones;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonCerrarToolBarProcesoSolicitudesAutorizaciones;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonProcesarInformacionToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonAnterioresToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonSiguientesToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones;
	protected JButton jButtonAbrirOrderByToolBarProcesoSolicitudesAutorizaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemDuplicarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemCopiarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemVerFormProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemCerrarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemDetalleCerrarProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemProcesarInformacionProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemAnterioresProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemSiguientesProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones;
	protected JMenuItem jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoSolicitudesAutorizaciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones;
	protected JCheckBox jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoSolicitudesAutorizaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones;
	protected JTextField jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoSolicitudesAutorizaciones;
	//public JList<Reporte> jListColumnasSelectReporteProcesoSolicitudesAutorizaciones;
	//public JScrollPane jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoSolicitudesAutorizaciones;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoSolicitudesAutorizaciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoSolicitudesAutorizaciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoSolicitudesAutorizaciones;
	
		
	//public JLabel jLabelArchivoImportacionProcesoSolicitudesAutorizaciones;	
	//public JLabel jLabelPathArchivoImportacionProcesoSolicitudesAutorizaciones;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoSolicitudesAutorizaciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoSolicitudesAutorizaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoSolicitudesAutorizaciones;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoSolicitudesAutorizaciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones;
	public JPanel jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	public JButton jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	
	public JPanel jPanelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	public JLabel jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	public JButton jButtonid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones= new JButtonMe();
	public JButton jButtonid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizacionesUpdate= new JButtonMe();
	public JButton jButtonid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	public JLabel jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	//public JFormattedTextField jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;

	public JDateChooser jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones;
	public JButton jButtonfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizacionesBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoSolicitudesAutorizacionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSolicitudesAutorizacionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSolicitudesAutorizacionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoSolicitudesAutorizacionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoSolicitudesAutorizaciones)	{
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones = jButtonRecargarInformacionProcesoSolicitudesAutorizaciones;
	}
	
	public JButton getjButtonProcesarInformacionProcesoSolicitudesAutorizaciones() {
		return this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoSolicitudesAutorizaciones)	{
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones = jButtonProcesarInformacionProcesoSolicitudesAutorizaciones;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoSolicitudesAutorizaciones() {
		return this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones;
	}
	
	
	public List<ProcesoSolicitudesAutorizaciones> getprocesosolicitudesautorizacioness() {
		return this.procesosolicitudesautorizacioness;
	}

	public void setprocesosolicitudesautorizacioness(List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacioness) {
		this.procesosolicitudesautorizacioness = procesosolicitudesautorizacioness;
	}
	
	public List<ProcesoSolicitudesAutorizaciones> getprocesosolicitudesautorizacionessAux() {
		return this.procesosolicitudesautorizacionessAux;
	}

	public void setprocesosolicitudesautorizacionessAux(List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessAux) {
		this.procesosolicitudesautorizacionessAux = procesosolicitudesautorizacionessAux;
	}
	
	public List<ProcesoSolicitudesAutorizaciones> getprocesosolicitudesautorizacionessEliminados() {
		return this.procesosolicitudesautorizacionessEliminados;
	}

	public void setProcesoSolicitudesAutorizacionessEliminados(List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacionessEliminados) {
		this.procesosolicitudesautorizacionessEliminados = procesosolicitudesautorizacionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones() {
		return jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones = jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones() {
		return jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones;
	}

	public void setjTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones(
			JTextField jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones) {
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones = jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones;
	}

	public void setBorderResaltarValorCampoGeneralProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones() {
		return this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones;
	}

	public void setjCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones(
			JCheckBox jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones) {
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones = jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones;
	}

	public void setBorderResaltarSeleccionarTodosProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones() {
		return this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones;
	}

	public void setjCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones(
			JCheckBox jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones) {
		this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones = jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones;
	}
	
	public void setBorderResaltarSeleccionadosProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones = jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposReportesProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones = jComboBoxTiposReportesProcesoSolicitudesAutorizaciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones() {
	//	return jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones) {
	//	this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones = jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones = jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones;
	//}
	
	public void setBorderResaltarTiposReportesProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones = jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones = jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoSolicitudesAutorizaciones() {
		return this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones = jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoSolicitudesAutorizaciones(
			JComboBox jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones) {
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones = jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoSolicitudesAutorizaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones() {
	//	return jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones) {
	//	this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones = jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoSolicitudesAutorizaciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoSolicitudesAutorizaciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones .setBorder(borderResaltar);		
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
		this.procesosolicitudesautorizacionesSessionBean=new ProcesoSolicitudesAutorizacionesSessionBean();
		
		this.procesosolicitudesautorizacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesosolicitudesautorizacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoSolicitudesAutorizacionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoSolicitudesAutorizacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoSolicitudesAutorizacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoSolicitudesAutorizacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoSolicitudesAutorizacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Solicitudes Autorizaciones MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoSolicitudesAutorizacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoSolicitudesAutorizaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoSolicitudesAutorizaciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"nuevo","nuevo","Nuevo"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"duplicar","duplicar","Duplicar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"copiar","copiar","Copiar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"ver_form","ver_form","Ver"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"recargar","recargar","Buscar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoSolicitudesAutorizaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoSolicitudesAutorizaciones,this.jTtoolBarProcesoSolicitudesAutorizaciones,
							"cerrar","cerrar","Salir"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoSolicitudesAutorizaciones;
			
				this.jButtonProcesarInformacionToolBarProcesoSolicitudesAutorizaciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoSolicitudesAutorizaciones;
				
		//protected JButton jButtonModificarToolBarProcesoSolicitudesAutorizaciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoSolicitudesAutorizaciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoSolicitudesAutorizaciones=new JMenuMe("General");
		this.jmenuArchivoProcesoSolicitudesAutorizaciones=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoSolicitudesAutorizaciones=new JMenuMe("Acciones");
		this.jmenuDatosProcesoSolicitudesAutorizaciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoSolicitudesAutorizaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoSolicitudesAutorizaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoSolicitudesAutorizaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoSolicitudesAutorizaciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoSolicitudesAutorizaciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoSolicitudesAutorizaciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoSolicitudesAutorizaciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoSolicitudesAutorizaciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoSolicitudesAutorizaciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoSolicitudesAutorizaciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoSolicitudesAutorizaciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoSolicitudesAutorizaciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoSolicitudesAutorizaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoSolicitudesAutorizaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoSolicitudesAutorizaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoSolicitudesAutorizaciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoSolicitudesAutorizaciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoSolicitudesAutorizaciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoSolicitudesAutorizaciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoSolicitudesAutorizaciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoSolicitudesAutorizaciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoSolicitudesAutorizaciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoSolicitudesAutorizaciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoSolicitudesAutorizaciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoSolicitudesAutorizaciones.add(this.jMenuItemCerrarProcesoSolicitudesAutorizaciones);
			
			this.jmenuAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemNuevoProcesoSolicitudesAutorizaciones);
			this.jmenuAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones);
			this.jmenuAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemNuevoRelacionesProcesoSolicitudesAutorizaciones);
			this.jmenuAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemGuardarCambiosTablaProcesoSolicitudesAutorizaciones);		
			this.jmenuAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemDuplicarProcesoSolicitudesAutorizaciones);		
			this.jmenuAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemCopiarProcesoSolicitudesAutorizaciones);		
			this.jmenuAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemVerFormProcesoSolicitudesAutorizaciones);		
			
			this.jmenuDatosProcesoSolicitudesAutorizaciones.add(this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones);				
			this.jmenuDatosProcesoSolicitudesAutorizaciones.add(this.jMenuItemAnterioresProcesoSolicitudesAutorizaciones);				
			this.jmenuDatosProcesoSolicitudesAutorizaciones.add(this.jMenuItemSiguientesProcesoSolicitudesAutorizaciones);				
			this.jmenuDatosProcesoSolicitudesAutorizaciones.add(this.jMenuItemAbrirOrderByProcesoSolicitudesAutorizaciones);				
			this.jmenuDatosProcesoSolicitudesAutorizaciones.add(this.jMenuItemMostrarOcultarProcesoSolicitudesAutorizaciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoSolicitudesAutorizaciones.add(this.jMenuItemGuardarCambiosProcesoSolicitudesAutorizaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoSolicitudesAutorizaciones.add(this.jmenuArchivoProcesoSolicitudesAutorizaciones);		
			this.jmenuBarProcesoSolicitudesAutorizaciones.add(this.jmenuAccionesProcesoSolicitudesAutorizaciones);		
			this.jmenuBarProcesoSolicitudesAutorizaciones.add(this.jmenuDatosProcesoSolicitudesAutorizaciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoSolicitudesAutorizaciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoSolicitudesAutorizaciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setToolTipText("Buscar Por Cliente Por Fecha Vencimiento Hasta ");
		this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones= new JButtonMe();
		this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setText("Buscar");
		this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setToolTipText("Buscar Por Cliente Por Fecha Vencimiento Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones,"buscar_button","Buscar Por Cliente Por Fecha Vencimiento Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones = new JLabelMe();
		jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setText("Cliente :");
		jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setToolTipText("Cliente");
		jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones= new JComboBoxMe();
		jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones = new JLabelMe();
		jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setText("Fecha Vencimiento Hasta :");
		jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setToolTipText("Fecha Vencimiento Hasta");
		jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones= new JDateChooser();
		jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setDate(new Date());
		jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoSolicitudesAutorizaciones = new ProcesoSolicitudesAutorizacionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Solicitudes Autorizaciones DATOS");
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones = new ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame(jDesktopPane,this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones(),this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoSolicitudesAutorizaciones = null;//new ProcesoSolicitudesAutorizacionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoSolicitudesAutorizaciones= new GridBagLayout();
		
		
		this.jTableDatosProcesoSolicitudesAutorizaciones = new JTableMe();      
		
		String sToolTipProcesoSolicitudesAutorizaciones="";
		sToolTipProcesoSolicitudesAutorizaciones=ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoSolicitudesAutorizaciones+="(Tesoreria.ProcesoSolicitudesAutorizaciones)";
		}
		
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoSolicitudesAutorizaciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.setToolTipText(sToolTipProcesoSolicitudesAutorizaciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoSolicitudesAutorizaciones);
		this.jTableDatosProcesoSolicitudesAutorizaciones.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoSolicitudesAutorizaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoSolicitudesAutorizaciones.setRowSelectionAllowed(true);
		this.jTableDatosProcesoSolicitudesAutorizaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoSolicitudesAutorizaciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonDuplicarProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonCopiarProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonVerFormProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonCerrarProcesoSolicitudesAutorizaciones = new JButtonMe();
		
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Solicitudes Autorizaciones";
		
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Solicitudes Autorizacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoSolicitudesAutorizaciones.setToolTipText("Acciones");
        this.jPanelAccionesProcesoSolicitudesAutorizaciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones=new ReporteDinamicoJInternalFrame(ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoSolicitudesAutorizaciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones=new ImportacionJInternalFrame(ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoSolicitudesAutorizaciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.setText("Orden");
		this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones,false,this);
			
			//this.cargarOrderByProcesoSolicitudesAutorizaciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones,true,this);
			
			//this.cargarOrderByProcesoSolicitudesAutorizaciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoSolicitudesAutorizaciones.setText("Nuevo");
		this.jButtonDuplicarProcesoSolicitudesAutorizaciones.setText("Duplicar");
		this.jButtonCopiarProcesoSolicitudesAutorizaciones.setText("Copiar");
		this.jButtonVerFormProcesoSolicitudesAutorizaciones.setText("Ver");
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setText("Guardar");
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoSolicitudesAutorizaciones,"nuevo_button","Nuevo",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoSolicitudesAutorizaciones,"duplicar_button","Duplicar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoSolicitudesAutorizaciones,"copiar_button","Copiar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoSolicitudesAutorizaciones,"ver_form","Ver",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones,"nuevorelaciones_button","Nuevo Rel",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones,"guardarcambiostabla_button","Guardar",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoSolicitudesAutorizaciones,"cerrar_button","Salir",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.setToolTipText("Nuevo"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoSolicitudesAutorizaciones.setToolTipText("Duplicar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoSolicitudesAutorizaciones.setToolTipText("Copiar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoSolicitudesAutorizaciones.setToolTipText("Ver"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.setToolTipText("Nuevo Rel"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.setToolTipText("Guardar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.setToolTipText("Salir"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonNuevoProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoSolicitudesAutorizaciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonDuplicarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoSolicitudesAutorizaciones"));
		
		//COPIAR
		sMapKey = "CopiarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonCopiarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoSolicitudesAutorizaciones"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonVerFormProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoSolicitudesAutorizaciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoSolicitudesAutorizaciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonModificarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoSolicitudesAutorizaciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonCerrarProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoSolicitudesAutorizaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoSolicitudesAutorizaciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoSolicitudesAutorizaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoSolicitudesAutorizaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoSolicitudesAutorizaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoSolicitudesAutorizaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoSolicitudesAutorizaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setName("jPanelParametrosReportesProcesoSolicitudesAutorizaciones"); 
		
		this.jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones.setName("jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.setText("Buscar");
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.setToolTipText("Buscar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones,"recargar_button","Buscar");		
		
		
		
		
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.setText("Procesar");
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.setToolTipText("Procesar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setText("Accion");
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoSolicitudesAutorizaciones = new JLabelMe();
		
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setText("Acciones");		
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoSolicitudesAutorizaciones = new JButtonMe();
		//this.jButtonAnterioresProcesoSolicitudesAutorizaciones.setText("<<");
        this.jButtonAnterioresProcesoSolicitudesAutorizaciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoSolicitudesAutorizaciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoSolicitudesAutorizaciones = new JButtonMe();
		//this.jButtonSiguientesProcesoSolicitudesAutorizaciones.setText(">>");
        this.jButtonSiguientesProcesoSolicitudesAutorizaciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoSolicitudesAutorizaciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones,"nuevoguardarcambios_button","Nue",this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoSolicitudesAutorizaciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoSolicitudesAutorizaciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonSiguientesProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoSolicitudesAutorizaciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoSolicitudesAutorizaciones";
		inputMap = this.jButtonAnterioresProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoSolicitudesAutorizaciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoSolicitudesAutorizaciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(this.getWidth(),ProcesoSolicitudesAutorizacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoSolicitudesAutorizacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(this.getWidth(),ProcesoSolicitudesAutorizacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoSolicitudesAutorizacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(this.getWidth(),ProcesoSolicitudesAutorizacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoSolicitudesAutorizacionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoSolicitudesAutorizaciones = new GridBagLayout();

			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutPaginacionProcesoSolicitudesAutorizaciones);						
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonAnterioresProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
					
						
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
			
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
						
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonSiguientesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonNuevoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
						
			
			
			if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
				this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
				this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonGuardarCambiosTablaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			}
			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonProcesarInformacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonDuplicarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonCopiarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonVerFormProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoSolicitudesAutorizaciones.add(this.jButtonCerrarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoSolicitudesAutorizaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoSolicitudesAutorizaciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoSolicitudesAutorizaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoSolicitudesAutorizaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoSolicitudesAutorizaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoSolicitudesAutorizaciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.setLayout(gridaBagParametrosReportesProcesoSolicitudesAutorizaciones);
			this.jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones.setLayout(gridaBagParametrosReportesAccionesProcesoSolicitudesAutorizaciones);
			
			
			this.jPanelParametrosAuxiliar1ProcesoSolicitudesAutorizaciones.setLayout(gridaBagParametrosAuxiliar1ProcesoSolicitudesAutorizaciones);
			this.jPanelParametrosAuxiliar2ProcesoSolicitudesAutorizaciones.setLayout(gridaBagParametrosAuxiliar2ProcesoSolicitudesAutorizaciones);
			this.jPanelParametrosAuxiliar3ProcesoSolicitudesAutorizaciones.setLayout(gridaBagParametrosAuxiliar3ProcesoSolicitudesAutorizaciones);
			this.jPanelParametrosAuxiliar4ProcesoSolicitudesAutorizaciones.setLayout(gridaBagParametrosAuxiliar4ProcesoSolicitudesAutorizaciones);
			//this.jPanelParametrosAuxiliar5ProcesoSolicitudesAutorizaciones.setLayout(gridaBagParametrosAuxiliar2ProcesoSolicitudesAutorizaciones);			
			
			
			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposPaginacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoSolicitudesAutorizaciones.add(this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposArchivosReportesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jPanelParametrosAuxiliar1ProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);																		
			
			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposGraficosReportesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jPanelParametrosAuxiliar4ProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposReportesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jCheckBoxGenerarReporteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jPanelParametrosAuxiliar2ProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jLabelAccionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposSeleccionarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
			
			
			/*
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoSolicitudesAutorizaciones.add(this.jCheckBoxSeleccionarTodosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);															
				
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoSolicitudesAutorizaciones.add(this.jCheckBoxSeleccionadosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);															
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoSolicitudesAutorizaciones.add(this.jCheckBoxConGraficoReporteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jPanelParametrosAuxiliar3ProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposAccionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoSolicitudesAutorizaciones = new GridBagLayout();

			this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutDatosProcesoSolicitudesAutorizaciones);
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
			
			this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.add(this.jTableDatosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setViewportView(this.jTableDatosProcesoSolicitudesAutorizaciones);
		this.jTableDatosProcesoSolicitudesAutorizaciones.setFillsViewportHeight(true);
		this.jTableDatosProcesoSolicitudesAutorizaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoSolicitudesAutorizaciones= new GridBagLayout();
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutAccionesProcesoSolicitudesAutorizaciones);
		
		
		/*	
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
			
		this.jPanelAccionesProcesoSolicitudesAutorizaciones.add(this.jButtonNuevoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);

		gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
		jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.add(jLabelid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);

		gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 0;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
		jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.add(jComboBoxid_clienteBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);


		gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
		jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.add(jLabelfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);

		gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 1;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 1;
		jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.add(jDateChooserfecha_vencimiento_hastaBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);

		gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = 2;
		gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =1;
		jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones.add(jButtonBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones, gridBagConstraintsProcesoSolicitudesAutorizaciones);

		jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.addTab("1.-Por Cliente Por Fecha Vencimiento Hasta ", jPanelBusquedaProcesoSolicitudesAutorizacionesProcesoSolicitudesAutorizaciones);
		jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoSolicitudesAutorizaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoSolicitudesAutorizaciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();						
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;		
			//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;		
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;		
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);								
		
		
		/*
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		*/		
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =0;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
				
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoSolicitudesAutorizacionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoSolicitudesAutorizaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoSolicitudesAutorizaciones = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutBusquedasParametrosProcesoSolicitudesAutorizaciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
			
			
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
			
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		*/
		
			
     	//pack();
		
		
		
		this.jButtonRecargarInformacionProcesoSolicitudesAutorizaciones.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoSolicitudesAutorizaciones.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoSolicitudesAutorizaciones.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoSolicitudesAutorizaciones.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoSolicitudesAutorizaciones.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoSolicitudesAutorizaciones.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoSolicitudesAutorizaciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoSolicitudesAutorizaciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoSolicitudesAutorizaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setName("jPanelReporteDinamicoProcesoSolicitudesAutorizaciones"); 
		
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutReporteDinamicoProcesoSolicitudesAutorizaciones);
		
		
		this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Solicitudes Autorizacioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoSolicitudesAutorizaciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelColumnasSelectReporteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones=new JScrollPane(this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones);
			
			this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoSolicitudesAutorizaciones=new JScrollPane(this.jListRelacionesSelectReporteProcesoSolicitudesAutorizaciones);
			
			this.jScrollRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoSolicitudesAutorizaciones.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelConGraficoDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jCheckBoxConGraficoDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelColumnaCategoriaValorProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jComboBoxColumnaCategoriaValorProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelColumnasValoresGraficoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoSolicitudesAutorizaciones=new JScrollPane(this.jListColumnasValoresGraficoProcesoSolicitudesAutorizaciones);
			
			this.jScrollColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jListColumnasSelectReporteProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jScrollColumnasValoresGraficoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoSolicitudesAutorizaciones.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones.setToolTipText("Generar EXCEL"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jButtonGenerarExcelReporteDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposReportesDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoSolicitudesAutorizaciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jLabelTiposArchivoReporteDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones.setToolTipText("Generar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jButtonGenerarReporteDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones.setToolTipText("Cancelar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoSolicitudesAutorizaciones.add(this.jButtonCerrarReporteDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoSolicitudesAutorizaciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones= new JScrollPane(jPanelReporteDinamicoProcesoSolicitudesAutorizaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Solicitudes Autorizacioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoSolicitudesAutorizaciones);
		this.jInternalFrameReporteDinamicoProcesoSolicitudesAutorizaciones.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoSolicitudesAutorizaciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoSolicitudesAutorizaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.setName("jPanelImportacionProcesoSolicitudesAutorizaciones"); 
		
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutImportacionProcesoSolicitudesAutorizaciones);
		
		
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoSolicitudesAutorizaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setResizable(true);
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setClosable(true);
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setResizable(true);
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setClosable(true);
	    this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Solicitudes Autorizacioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelArchivoImportacionProcesoSolicitudesAutorizaciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.add(this.jLabelArchivoImportacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoSolicitudesAutorizaciones = new JFileChooser();		
		this.jFileChooserImportacionProcesoSolicitudesAutorizaciones.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonAbrirImportacionProcesoSolicitudesAutorizaciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoSolicitudesAutorizaciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoSolicitudesAutorizaciones.setToolTipText("Generar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.add(this.jButtonAbrirImportacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoSolicitudesAutorizaciones = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoSolicitudesAutorizaciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.add(this.jLabelPathArchivoImportacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoSolicitudesAutorizaciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.add(this.jTextFieldPathArchivoImportacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonGenerarImportacionProcesoSolicitudesAutorizaciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoSolicitudesAutorizaciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoSolicitudesAutorizaciones.setToolTipText("Generar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.add(this.jButtonGenerarImportacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoSolicitudesAutorizaciones = new JButtonMe();
		this.jButtonCerrarImportacionProcesoSolicitudesAutorizaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoSolicitudesAutorizaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoSolicitudesAutorizaciones.setToolTipText("Cancelar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoSolicitudesAutorizaciones.add(this.jButtonCerrarImportacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoSolicitudesAutorizaciones = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoSolicitudesAutorizaciones= new JScrollPane(jPanelImportacionProcesoSolicitudesAutorizaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoSolicitudesAutorizaciones);
		this.jInternalFrameImportacionProcesoSolicitudesAutorizaciones.getContentPane().add(this.jScrollPanelImportacionProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoSolicitudesAutorizaciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones = new JButtonMe();
			this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.setText("Orden");
			this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoSolicitudesAutorizaciones";
			inputMap = this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoSolicitudesAutorizaciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoSolicitudesAutorizaciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoSolicitudesAutorizaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.setName("jPanelOrderByProcesoSolicitudesAutorizaciones"); 
			
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.setLayout(gridaBagLayoutOrderByProcesoSolicitudesAutorizaciones);
			
			
			this.jTableDatosProcesoSolicitudesAutorizacionesOrderBy = new JTableMe();        
			this.jTableDatosProcesoSolicitudesAutorizacionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoSolicitudesAutorizacionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoSolicitudesAutorizacionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoSolicitudesAutorizacionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoSolicitudesAutorizacionesOrderBy.setViewportView(this.jTableDatosProcesoSolicitudesAutorizacionesOrderBy);
			this.jTableDatosProcesoSolicitudesAutorizacionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoSolicitudesAutorizacionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoSolicitudesAutorizaciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setTitle("Orden");
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setResizable(true);
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setClosable(true);
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Solicitudes Autorizacioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoSolicitudesAutorizaciones.ipady =150;
				
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.add(jScrollPanelDatosProcesoSolicitudesAutorizacionesOrderBy, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);//this.jTableDatosProcesoSolicitudesAutorizacionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoSolicitudesAutorizaciones = new JButtonMe();
			this.jButtonCerrarOrderByProcesoSolicitudesAutorizaciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoSolicitudesAutorizaciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoSolicitudesAutorizaciones.setToolTipText("Cancelar"+" "+ProcesoSolicitudesAutorizacionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoSolicitudesAutorizaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoSolicitudesAutorizaciones.add(this.jButtonCerrarOrderByProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoSolicitudesAutorizaciones = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones= new JScrollPane(jPanelOrderByProcesoSolicitudesAutorizaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones = new GridBagConstraints();
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoSolicitudesAutorizaciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoSolicitudesAutorizaciones);
			
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getContentPane().add(this.jScrollPanelOrderByProcesoSolicitudesAutorizaciones, this.gridBagConstraintsProcesoSolicitudesAutorizaciones);			
		
		} else {
			this.jButtonAbrirOrderByProcesoSolicitudesAutorizaciones = new JButtonMe();
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
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesosolicitudesautorizacionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoSolicitudesAutorizaciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoSolicitudesAutorizaciones.getRowHeight();//ProcesoSolicitudesAutorizacionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones.isSelected()) {
					iHeightTable=ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoSolicitudesAutorizaciones.isSelected()) {
					iHeightTable=ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoSolicitudesAutorizacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones!=null && this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy()!=null) {
			//if(!this.procesosolicitudesautorizacionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoSolicitudesAutorizaciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoSolicitudesAutorizaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesosolicitudesautorizacionesLogic.getProcesoSolicitudesAutorizacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesosolicitudesautorizacioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoSolicitudesAutorizaciones> TraerProcesoSolicitudesAutorizacionesBeans(List<ProcesoSolicitudesAutorizaciones> procesosolicitudesautorizacioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoSolicitudesAutorizaciones procesosolicitudesautorizaciones:procesosolicitudesautorizacioness) {
					
				if(!(ProcesoSolicitudesAutorizacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoSolicitudesAutorizacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesosolicitudesautorizaciones.setsDetalleGeneralEntityReporte(ProcesoSolicitudesAutorizacionesConstantesFunciones.getProcesoSolicitudesAutorizacionesDescripcion(procesosolicitudesautorizaciones));
										
						
					
						
					
				} else  {
							
					//procesosolicitudesautorizaciones.setsDetalleGeneralEntityReporte(procesosolicitudesautorizaciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesosolicitudesautorizacionesbeans.add(procesosolicitudesautorizacionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesosolicitudesautorizacioness;
    }
	//PARA REPORTES FIN
}
