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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.ProcesoRecapConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class ProcesoRecapJInternalFrame extends ProcesoRecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoRecap;
	
	protected JMenuBar jmenuBarProcesoRecap;
	
	protected JMenu jmenuProcesoRecap;
	protected JMenu jmenuDatosProcesoRecap;
	protected JMenu jmenuArchivoProcesoRecap;
	protected JMenu jmenuAccionesProcesoRecap;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoRecap;	
	protected GridBagConstraints gridBagConstraintsProcesoRecap;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoRecapDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoRecap;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoRecap;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoRecap;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public ProcesoRecapSessionBean procesorecapSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoRecap> procesorecaps;		
	public List<ProcesoRecap> procesorecapsEliminados;	
	public List<ProcesoRecap> procesorecapsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoRecap;		
	protected JButton jButtonAbrirOrderByProcesoRecap;
	
	
	//protected JPanel jPanelOrderByProcesoRecap;
	//public JScrollPane jScrollPanelOrderByProcesoRecap;	
	//protected JButton jButtonCerrarOrderByProcesoRecap;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoRecapLogic procesorecapLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoRecap;
	public JScrollPane jScrollPanelDatosEdicionProcesoRecap;
	public JScrollPane jScrollPanelDatosGeneralProcesoRecap;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoRecapOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoRecap;
	//public JScrollPane jScrollPanelImportacionProcesoRecap;
	
	
	
	protected JPanel jPanelAccionesProcesoRecap;
	
    protected JPanel jPanelPaginacionProcesoRecap;
    protected JPanel jPanelParametrosReportesProcesoRecap;
	protected JPanel jPanelParametrosReportesAccionesProcesoRecap;
	
	
	protected Integer iXPanelCamposProcesoRecapParam=0;
	protected Integer iYPanelCamposProcesoRecapParam=0;
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoRecap;
	protected JPanel jPanelParametrosAuxiliar2ProcesoRecap;
	protected JPanel jPanelParametrosAuxiliar3ProcesoRecap;
	protected JPanel jPanelParametrosAuxiliar4ProcesoRecap;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoRecap;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoRecap;
	//protected JPanel jPanelImportacionProcesoRecap;
	
	
	public JTable jTableDatosProcesoRecap;
	
	
	
	//public JTable jTableDatosProcesoRecapOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
	
	protected GridBagLayout gridaBagLayoutProcesoRecapParam;
	protected GridBagConstraints gridBagConstraintsProcesoRecapParam;
	protected JPanel jPanelCamposProcesoRecapParam;
	//protected BindingGroup bindingGroupProcesoRecapParam;
	//@SuppressWarnings("rawtypes")
	//protected Binding bindingProcesoRecapParam;
	public JTabbedPane jTabbedPaneCamposProcesoRecapParametros;	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoRecap;
	protected JButton jButtonDuplicarProcesoRecap;
	protected JButton jButtonCopiarProcesoRecap;
	protected JButton jButtonVerFormProcesoRecap;
	protected JButton jButtonNuevoRelacionesProcesoRecap;
	protected JButton jButtonModificarProcesoRecap;
	
    protected JButton jButtonGuardarCambiosTablaProcesoRecap;
	protected JButton jButtonCerrarProcesoRecap;
	
	
	protected JButton jButtonRecargarInformacionProcesoRecap;
	protected JButton jButtonProcesarInformacionProcesoRecap;
	
	
	protected JButton jButtonAnterioresProcesoRecap;
	protected JButton jButtonSiguientesProcesoRecap;
	protected JButton jButtonNuevoGuardarCambiosProcesoRecap;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoRecap;
	//protected JButton jButtonCerrarReporteDinamicoProcesoRecap;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoRecap;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoRecap;
	//protected JButton jButtonGenerarImportacionProcesoRecap;
	//protected JButton jButtonCerrarImportacionProcesoRecap;
	//protected JFileChooser jFileChooserImportacionProcesoRecap;
	//protected File fileImportacionProcesoRecap;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoRecap;
	protected JButton jButtonDuplicarToolBarProcesoRecap;
	protected JButton jButtonNuevoRelacionesToolBarProcesoRecap;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoRecap;
	protected JButton jButtonCopiarToolBarProcesoRecap;
	protected JButton jButtonVerFormToolBarProcesoRecap;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoRecap;
	protected JButton jButtonCerrarToolBarProcesoRecap;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoRecap;
	protected JButton jButtonProcesarInformacionToolBarProcesoRecap;
	protected JButton jButtonAnterioresToolBarProcesoRecap;
	protected JButton jButtonSiguientesToolBarProcesoRecap;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoRecap;
	protected JButton jButtonAbrirOrderByToolBarProcesoRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoRecap;
	protected JMenuItem jMenuItemDuplicarProcesoRecap;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoRecap;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoRecap;
	protected JMenuItem jMenuItemCopiarProcesoRecap;
	protected JMenuItem jMenuItemVerFormProcesoRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoRecap;
	protected JMenuItem jMenuItemCerrarProcesoRecap;
	protected JMenuItem jMenuItemDetalleCerrarProcesoRecap;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoRecap;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoRecap;
	protected JMenuItem jMenuItemProcesarInformacionProcesoRecap;
	protected JMenuItem jMenuItemAnterioresProcesoRecap;
	protected JMenuItem jMenuItemSiguientesProcesoRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoRecap;
	protected JMenuItem jMenuItemAbrirOrderByProcesoRecap;
	protected JMenuItem jMenuItemMostrarOcultarProcesoRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoRecap;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoRecap;
	protected JCheckBox jCheckBoxSeleccionadosProcesoRecap;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoRecap;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoRecap;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoRecap;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoRecap;
	protected JTextField jTextFieldValorCampoGeneralProcesoRecap;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoRecap;
	//public JList<Reporte> jListColumnasSelectReporteProcesoRecap;
	//public JScrollPane jScrollColumnasSelectReporteProcesoRecap;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoRecap;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoRecap;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoRecap;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoRecap;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoRecap;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoRecap;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoRecap;
	
		
	//public JLabel jLabelArchivoImportacionProcesoRecap;	
	//public JLabel jLabelPathArchivoImportacionProcesoRecap;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoRecap;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoRecap;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoRecap;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoRecap;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoRecap;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoRecap;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoRecap;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoRecap;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoRecap;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoRecap;
	public JPanel jPanelBusquedaProcesoRecapProcesoRecap;
	public JButton jButtonBusquedaProcesoRecapProcesoRecap;
	
	public JPanel jPanelid_ejercicioBusquedaProcesoRecapProcesoRecap;
	public JLabel jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap;
	public JButton jButtonid_ejercicioBusquedaProcesoRecapProcesoRecap= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaProcesoRecapProcesoRecapUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaProcesoRecapProcesoRecapBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap;
	public JLabel jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap;
	public JButton jButtonfecha_emision_desdeBusquedaProcesoRecapProcesoRecapBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap;
	public JLabel jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap;
	public JButton jButtonfecha_emision_hastaBusquedaProcesoRecapProcesoRecapBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	public JPanel jPanelnumero_recapProcesoRecapParam;
	public JLabel jLabelnumero_recapProcesoRecapParam;
	public JTextField jTextFieldnumero_recapProcesoRecapParam;
	public JButton jButtonnumero_recapProcesoRecapParamBusqueda= new JButtonMe();

	public JPanel jPanelautorizacion_recapProcesoRecapParam;
	public JLabel jLabelautorizacion_recapProcesoRecapParam;
	public JTextField jTextFieldautorizacion_recapProcesoRecapParam;
	public JButton jButtonautorizacion_recapProcesoRecapParamBusqueda= new JButtonMe();

	public JPanel jPanelfecha_recapProcesoRecapParam;
	public JLabel jLabelfecha_recapProcesoRecapParam;
	//public JFormattedTextField jDateChooserfecha_recapProcesoRecapParam;

	public JDateChooser jDateChooserfecha_recapProcesoRecapParam;
	public JButton jButtonfecha_recapProcesoRecapParamBusqueda= new JButtonMe();

	
	
	public JPanel jPanelid_proceso_recapProcesoRecapParam;
	public JLabel jLabelid_proceso_recapProcesoRecapParam;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_proceso_recapProcesoRecapParam;
	public JButton jButtonid_proceso_recapProcesoRecapParam= new JButtonMe();
	public JButton jButtonid_proceso_recapProcesoRecapParamUpdate= new JButtonMe();
	public JButton jButtonid_proceso_recapProcesoRecapParamBusqueda= new JButtonMe();

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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public ProcesoRecapJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecapJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecapJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoRecapJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoRecap)	{
		this.jButtonRecargarInformacionProcesoRecap = jButtonRecargarInformacionProcesoRecap;
	}
	
	public JButton getjButtonProcesarInformacionProcesoRecap() {
		return this.jButtonProcesarInformacionProcesoRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoRecap)	{
		this.jButtonProcesarInformacionProcesoRecap = jButtonProcesarInformacionProcesoRecap;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoRecap() {
		return this.jButtonRecargarInformacionProcesoRecap;
	}
	
	
	public List<ProcesoRecap> getprocesorecaps() {
		return this.procesorecaps;
	}

	public void setprocesorecaps(List<ProcesoRecap> procesorecaps) {
		this.procesorecaps = procesorecaps;
	}
	
	public List<ProcesoRecap> getprocesorecapsAux() {
		return this.procesorecapsAux;
	}

	public void setprocesorecapsAux(List<ProcesoRecap> procesorecapsAux) {
		this.procesorecapsAux = procesorecapsAux;
	}
	
	public List<ProcesoRecap> getprocesorecapsEliminados() {
		return this.procesorecapsEliminados;
	}

	public void setProcesoRecapsEliminados(List<ProcesoRecap> procesorecapsEliminados) {
		this.procesorecapsEliminados = procesorecapsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoRecap() {
		return jComboBoxTiposSeleccionarProcesoRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoRecap(
			JComboBox jComboBoxTiposSeleccionarProcesoRecap) {
		this.jComboBoxTiposSeleccionarProcesoRecap = jComboBoxTiposSeleccionarProcesoRecap;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoRecap .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoRecap() {
		return jTextFieldValorCampoGeneralProcesoRecap;
	}

	public void setjTextFieldValorCampoGeneralProcesoRecap(
			JTextField jTextFieldValorCampoGeneralProcesoRecap) {
		this.jTextFieldValorCampoGeneralProcesoRecap = jTextFieldValorCampoGeneralProcesoRecap;
	}

	public void setBorderResaltarValorCampoGeneralProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoRecap .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoRecap() {
		return this.jCheckBoxSeleccionarTodosProcesoRecap;
	}

	public void setjCheckBoxSeleccionarTodosProcesoRecap(
			JCheckBox jCheckBoxSeleccionarTodosProcesoRecap) {
		this.jCheckBoxSeleccionarTodosProcesoRecap = jCheckBoxSeleccionarTodosProcesoRecap;
	}

	public void setBorderResaltarSeleccionarTodosProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoRecap .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoRecap() {
		return this.jCheckBoxSeleccionadosProcesoRecap;
	}

	public void setjCheckBoxSeleccionadosProcesoRecap(
			JCheckBox jCheckBoxSeleccionadosProcesoRecap) {
		this.jCheckBoxSeleccionadosProcesoRecap = jCheckBoxSeleccionadosProcesoRecap;
	}
	
	public void setBorderResaltarSeleccionadosProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoRecap .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoRecap() {
		return this.jComboBoxTiposArchivosReportesProcesoRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoRecap(
			JComboBox jComboBoxTiposArchivosReportesProcesoRecap) {
		this.jComboBoxTiposArchivosReportesProcesoRecap = jComboBoxTiposArchivosReportesProcesoRecap;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoRecap() {
		return this.jComboBoxTiposReportesProcesoRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoRecap(
			JComboBox jComboBoxTiposReportesProcesoRecap) {
		this.jComboBoxTiposReportesProcesoRecap = jComboBoxTiposReportesProcesoRecap;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoRecap() {
	//	return jComboBoxTiposReportesDinamicoProcesoRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoRecap(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoRecap) {
	//	this.jComboBoxTiposReportesDinamicoProcesoRecap = jComboBoxTiposReportesDinamicoProcesoRecap;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoRecap() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoRecap;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoRecap(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoRecap) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap = jComboBoxTiposArchivosReportesDinamicoProcesoRecap;
	//}
	
	public void setBorderResaltarTiposReportesProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoRecap() {
		return this.jComboBoxTiposGraficosReportesProcesoRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoRecap(
			JComboBox jComboBoxTiposGraficosReportesProcesoRecap) {
		this.jComboBoxTiposGraficosReportesProcesoRecap = jComboBoxTiposGraficosReportesProcesoRecap;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoRecap() {
		return this.jComboBoxTiposPaginacionProcesoRecap;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoRecap(
			JComboBox jComboBoxTiposPaginacionProcesoRecap) {
		this.jComboBoxTiposPaginacionProcesoRecap = jComboBoxTiposPaginacionProcesoRecap;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoRecap .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoRecap() {
		return this.jComboBoxTiposRelacionesProcesoRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoRecap() {
		return this.jComboBoxTiposAccionesProcesoRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoRecap(
			JComboBox jComboBoxTiposRelacionesProcesoRecap) {
		this.jComboBoxTiposRelacionesProcesoRecap = jComboBoxTiposRelacionesProcesoRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoRecap(
			JComboBox jComboBoxTiposAccionesProcesoRecap) {
		this.jComboBoxTiposAccionesProcesoRecap = jComboBoxTiposAccionesProcesoRecap;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoRecap .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoRecap() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoRecap .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoRecap() {
	//	return jCheckBoxConGraficoDinamicoProcesoRecap;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoRecap(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoRecap) {
	//	this.jCheckBoxConGraficoDinamicoProcesoRecap = jCheckBoxConGraficoDinamicoProcesoRecap;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoRecap() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoRecap.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoRecap .setBorder(borderResaltar);		
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
		this.procesorecapSessionBean=new ProcesoRecapSessionBean();
		
		this.procesorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesorecapSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoRecapJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoRecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoRecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Recap MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoRecap= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"nuevo","nuevo","Nuevo"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"duplicar","duplicar","Duplicar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"copiar","copiar","Copiar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"ver_form","ver_form","Ver"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"recargar","recargar","Buscar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoRecap,this.jTtoolBarProcesoRecap,
							"cerrar","cerrar","Salir"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoRecap=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoRecap;
			
				this.jButtonProcesarInformacionToolBarProcesoRecap=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoRecap;
				
		//protected JButton jButtonModificarToolBarProcesoRecap;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoRecap=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoRecap=new JMenuMe("General");
		this.jmenuArchivoProcesoRecap=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoRecap=new JMenuMe("Acciones");
		this.jmenuDatosProcesoRecap=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoRecap= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoRecap.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoRecap,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoRecap= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoRecap.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoRecap,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoRecap= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoRecap.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoRecap,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoRecap= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoRecap.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoRecap,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoRecap= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoRecap.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoRecap,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoRecap= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoRecap.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoRecap,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoRecap= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoRecap.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoRecap,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoRecap= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoRecap.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoRecap,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoRecap= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoRecap.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoRecap,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoRecap= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoRecap.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoRecap,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoRecap= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoRecap.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoRecap,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoRecap.add(this.jMenuItemCerrarProcesoRecap);
			
			this.jmenuAccionesProcesoRecap.add(this.jMenuItemNuevoProcesoRecap);
			this.jmenuAccionesProcesoRecap.add(this.jMenuItemNuevoGuardarCambiosProcesoRecap);
			this.jmenuAccionesProcesoRecap.add(this.jMenuItemNuevoRelacionesProcesoRecap);
			this.jmenuAccionesProcesoRecap.add(this.jMenuItemGuardarCambiosTablaProcesoRecap);		
			this.jmenuAccionesProcesoRecap.add(this.jMenuItemDuplicarProcesoRecap);		
			this.jmenuAccionesProcesoRecap.add(this.jMenuItemCopiarProcesoRecap);		
			this.jmenuAccionesProcesoRecap.add(this.jMenuItemVerFormProcesoRecap);		
			
			this.jmenuDatosProcesoRecap.add(this.jMenuItemRecargarInformacionProcesoRecap);				
			this.jmenuDatosProcesoRecap.add(this.jMenuItemAnterioresProcesoRecap);				
			this.jmenuDatosProcesoRecap.add(this.jMenuItemSiguientesProcesoRecap);				
			this.jmenuDatosProcesoRecap.add(this.jMenuItemAbrirOrderByProcesoRecap);				
			this.jmenuDatosProcesoRecap.add(this.jMenuItemMostrarOcultarProcesoRecap);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoRecap.add(this.jMenuItemGuardarCambiosProcesoRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoRecap.add(this.jmenuArchivoProcesoRecap);		
			this.jmenuBarProcesoRecap.add(this.jmenuAccionesProcesoRecap);		
			this.jmenuBarProcesoRecap.add(this.jmenuDatosProcesoRecap);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoRecap);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoRecap() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoRecapProcesoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoRecapProcesoRecap.setToolTipText("Buscar Por Ejercicio Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaProcesoRecapProcesoRecap= new JButtonMe();
		this.jButtonBusquedaProcesoRecapProcesoRecap.setText("Buscar");
		this.jButtonBusquedaProcesoRecapProcesoRecap.setToolTipText("Buscar Por Ejercicio Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoRecapProcesoRecap,"buscar_button","Buscar Por Ejercicio Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoRecapProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap = new JLabelMe();
		jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasProcesoRecap=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoRecap.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoRecap.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoRecap.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoRecap = new ProcesoRecapDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Recap DATOS");
			this.jInternalFrameDetalleFormProcesoRecap = new ProcesoRecapDetalleFormJInternalFrame(jDesktopPane,this.procesorecapSessionBean.getConGuardarRelaciones(),this.procesorecapSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoRecap = null;//new ProcesoRecapDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoRecap= new GridBagLayout();
		
		
		this.jTableDatosProcesoRecap = new JTableMe();      
		
		String sToolTipProcesoRecap="";
		sToolTipProcesoRecap=ProcesoRecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoRecap+="(Cartera.ProcesoRecap)";
		}
		
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoRecap+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoRecap.setToolTipText(sToolTipProcesoRecap);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoRecap);
		this.jTableDatosProcesoRecap.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoRecap.setRowSelectionAllowed(true);
		this.jTableDatosProcesoRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoRecap,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoRecap = new JButtonMe();
		this.jButtonDuplicarProcesoRecap = new JButtonMe();
		this.jButtonCopiarProcesoRecap = new JButtonMe();
		this.jButtonVerFormProcesoRecap = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoRecap = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoRecap = new JButtonMe();
		this.jButtonCerrarProcesoRecap = new JButtonMe();
		
		this.jScrollPanelDatosProcesoRecap = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoRecap = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Recap";
		
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoRecap.setToolTipText("Acciones");
        this.jPanelAccionesProcesoRecap.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
	this.jTabbedPaneCamposProcesoRecapParametros = new JTabbedPane();
	this.jTabbedPaneCamposProcesoRecapParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("PARAMETROS"));
	this.gridaBagLayoutProcesoRecapParam= new GridBagLayout();
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.jPanelCamposProcesoRecapParam = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);

	this.jPanelCamposProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);
	this.jPanelCamposProcesoRecapParam.setBorder(javax.swing.BorderFactory.createTitledBorder("PARAMETROS"));
	this.jPanelCamposProcesoRecapParam.setName("jPanelCamposProcesoRecapParam");

	this.jTabbedPaneCamposProcesoRecapParametros.addTab("Proceso Recap Param", this.jPanelCamposProcesoRecapParam);
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoProcesoRecap=new ReporteDinamicoJInternalFrame(ProcesoRecapConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoRecap();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoRecap=new ImportacionJInternalFrame(ProcesoRecapConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoRecap();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoRecap = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoRecap.setText("Orden");
		this.jButtonAbrirOrderByProcesoRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoRecap,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecap,false,this);
			
			//this.cargarOrderByProcesoRecap(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecap,true,this);
			
			//this.cargarOrderByProcesoRecap(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoRecap.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosProcesoRecap.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosProcesoRecap.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosProcesoRecap.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoRecap.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoRecap.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoRecap.setText("Nuevo");
		this.jButtonDuplicarProcesoRecap.setText("Duplicar");
		this.jButtonCopiarProcesoRecap.setText("Copiar");
		this.jButtonVerFormProcesoRecap.setText("Ver");
		this.jButtonNuevoRelacionesProcesoRecap.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoRecap.setText("Guardar");
		this.jButtonCerrarProcesoRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoRecap,"nuevo_button","Nuevo",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoRecap,"duplicar_button","Duplicar",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoRecap,"copiar_button","Copiar",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoRecap,"ver_form","Ver",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoRecap,"nuevorelaciones_button","Nuevo Rel",this.procesorecapSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoRecap,"guardarcambiostabla_button","Guardar",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoRecap,"cerrar_button","Salir",this.procesorecapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoRecap.setToolTipText("Nuevo"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoRecap.setToolTipText("Duplicar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoRecap.setToolTipText("Copiar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoRecap.setToolTipText("Ver"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoRecap.setToolTipText("Nuevo Rel"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoRecap.setToolTipText("Guardar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoRecap.setToolTipText("Salir"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoRecap";
		inputMap = this.jButtonNuevoProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoRecap"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoRecap";
		inputMap = this.jButtonDuplicarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoRecap"));
		
		//COPIAR
		sMapKey = "CopiarProcesoRecap";
		inputMap = this.jButtonCopiarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoRecap"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoRecap";
		inputMap = this.jButtonVerFormProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoRecap"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoRecap";
		inputMap = this.jButtonNuevoRelacionesProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoRecap"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoRecap";
		inputMap = this.jButtonModificarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoRecap"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoRecap";
		inputMap = this.jButtonCerrarProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoRecap";
		inputMap = this.jButtonGuardarCambiosTablaProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoRecap"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoRecap.setName("jPanelParametrosReportesProcesoRecap"); 
		
		this.jPanelParametrosReportesAccionesProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoRecap.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoRecap.setName("jPanelParametrosReportesAccionesProcesoRecap"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoRecap = new JButtonMe();
		this.jButtonRecargarInformacionProcesoRecap.setText("Buscar");
		this.jButtonRecargarInformacionProcesoRecap.setToolTipText("Buscar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoRecap,"recargar_button","Buscar");		
		
		
		
		
		this.jButtonProcesarInformacionProcesoRecap = new JButtonMe();
		this.jButtonProcesarInformacionProcesoRecap.setText("Procesar");
		this.jButtonProcesarInformacionProcesoRecap.setToolTipText("Procesar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoRecap.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoRecap.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoRecap.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoRecap.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoRecap.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoRecap.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoRecap.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoRecap.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoRecap.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoRecap.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoRecap.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoRecap.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoRecap.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoRecap.setText("Accion");
		this.jComboBoxTiposAccionesProcesoRecap.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoRecap = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoRecap.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoRecap.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoRecap=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoRecap.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoRecap.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoRecap.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoRecap = new JLabelMe();
		
		this.jLabelAccionesProcesoRecap.setText("Acciones");		
		this.jLabelAccionesProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoRecap = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoRecap.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoRecap.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoRecap = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoRecap.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoRecap.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoRecap = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoRecap.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoRecap.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoRecap = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoRecap.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoRecap.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoRecap = new JButtonMe();
		//this.jButtonAnterioresProcesoRecap.setText("<<");
        this.jButtonAnterioresProcesoRecap.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoRecap,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoRecap = new JButtonMe();
		//this.jButtonSiguientesProcesoRecap.setText(">>");
        this.jButtonSiguientesProcesoRecap.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoRecap,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoRecap = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoRecap.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoRecap.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoRecap,"nuevoguardarcambios_button","Nue",this.procesorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoRecap";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoRecap"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoRecap";
		inputMap = this.jButtonRecargarInformacionProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoRecap"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoRecap";
		inputMap = this.jButtonSiguientesProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoRecap"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoRecap";
		inputMap = this.jButtonAnterioresProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoRecap"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoRecap();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
					
		this.jLabelnumero_recapProcesoRecapParam = new JLabelMe();
		this.jLabelnumero_recapProcesoRecapParam.setText(""+"Numero Recap"+" : *");
		this.jLabelnumero_recapProcesoRecapParam.setToolTipText("Numero Recap");
		this.jLabelnumero_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelnumero_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		jTextFieldnumero_recapProcesoRecapParam= new JTextFieldMe();

		jTextFieldnumero_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_recapProcesoRecapParamBusqueda"));



					
		this.jLabelautorizacion_recapProcesoRecapParam = new JLabelMe();
		this.jLabelautorizacion_recapProcesoRecapParam.setText(""+"Autorizacion Recap"+" : *");
		this.jLabelautorizacion_recapProcesoRecapParam.setToolTipText("Autorizacion Recap");
		this.jLabelautorizacion_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelautorizacion_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelautorizacion_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacion_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacion_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelautorizacion_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		jTextFieldautorizacion_recapProcesoRecapParam= new JTextFieldMe();

		jTextFieldautorizacion_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacion_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautorizacion_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacion_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacion_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautorizacion_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautorizacion_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacion_recapProcesoRecapParamBusqueda"));



					
		this.jLabelfecha_recapProcesoRecapParam = new JLabelMe();
		this.jLabelfecha_recapProcesoRecapParam.setText(""+"Fecha Recap"+" : *");
		this.jLabelfecha_recapProcesoRecapParam.setToolTipText("Fecha Recap");
		this.jLabelfecha_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelfecha_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		//jFormattedTextFieldfecha_recapProcesoRecapParam= new JFormattedTextFieldMe();

		jDateChooserfecha_recapProcesoRecapParam= new JDateChooser();
		jDateChooserfecha_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_recapProcesoRecapParam.setDate(new Date());
		jDateChooserfecha_recapProcesoRecapParam.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_recapProcesoRecapParam.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_recapProcesoRecapParamBusqueda"));



			
			
					
		this.jLabelid_proceso_recapProcesoRecapParam = new JLabelMe();
		this.jLabelid_proceso_recapProcesoRecapParam.setText(""+""+" :");
		this.jLabelid_proceso_recapProcesoRecapParam.setToolTipText("");
		this.jLabelid_proceso_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proceso_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_proceso_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_proceso_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_proceso_recapProcesoRecapParam=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.gridaBagLayoutProcesoRecapParam = new GridBagLayout();
		this.jPanelid_proceso_recapProcesoRecapParam.setLayout(this.gridaBagLayoutProcesoRecapParam);


		jComboBoxid_proceso_recapProcesoRecapParam= new JComboBoxMe();
		jComboBoxid_proceso_recapProcesoRecapParam.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proceso_recapProcesoRecapParam.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_proceso_recapProcesoRecapParam.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_proceso_recapProcesoRecapParam,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_proceso_recapProcesoRecapParam= new JButtonMe();
		this.jButtonid_proceso_recapProcesoRecapParam.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proceso_recapProcesoRecapParam.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proceso_recapProcesoRecapParam.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_proceso_recapProcesoRecapParam.setText("Buscar");
		this.jButtonid_proceso_recapProcesoRecapParam.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_proceso_recapProcesoRecapParam.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proceso_recapProcesoRecapParam,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_proceso_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proceso_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proceso_recapProcesoRecapParam"));

		this.jButtonid_proceso_recapProcesoRecapParamBusqueda= new JButtonMe();
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setText("U");
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_proceso_recapProcesoRecapParamBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proceso_recapProcesoRecapParamBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_proceso_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proceso_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proceso_recapProcesoRecapParamBusqueda"));

		this.jButtonid_proceso_recapProcesoRecapParamUpdate= new JButtonMe();
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_proceso_recapProcesoRecapParamUpdate.setText("U");
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_proceso_recapProcesoRecapParamUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_proceso_recapProcesoRecapParamUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_proceso_recapProcesoRecapParam.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_proceso_recapProcesoRecapParam.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_proceso_recapProcesoRecapParamUpdate"));


				
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoRecap.setMinimumSize(new Dimension(this.getWidth(),ProcesoRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoRecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoRecap.setMaximumSize(new Dimension(this.getWidth(),ProcesoRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoRecapBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoRecap.setPreferredSize(new Dimension(this.getWidth(),ProcesoRecapBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoRecapBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoRecap = new GridBagLayout();

			this.jPanelPaginacionProcesoRecap.setLayout(gridaBagLayoutPaginacionProcesoRecap);						
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 0;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoRecap.add(this.jButtonAnterioresProcesoRecap, this.gridBagConstraintsProcesoRecap);
					
						
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoRecap.gridy = 0;
			
			this.jPanelPaginacionProcesoRecap.add(this.jButtonNuevoGuardarCambiosProcesoRecap, this.gridBagConstraintsProcesoRecap);
						
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoRecap.gridy = 0;
			this.jPanelPaginacionProcesoRecap.add(this.jButtonSiguientesProcesoRecap, this.gridBagConstraintsProcesoRecap);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 1;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecap.add(this.jButtonNuevoProcesoRecap, this.gridBagConstraintsProcesoRecap);
						
			
			
			if(!this.procesorecapSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
				this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoRecap.gridy = 1;
				this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoRecap.add(this.jButtonGuardarCambiosTablaProcesoRecap, this.gridBagConstraintsProcesoRecap);
			}
			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 1;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoRecap.add(this.jButtonProcesarInformacionProcesoRecap, this.gridBagConstraintsProcesoRecap);
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 1;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecap.add(this.jButtonDuplicarProcesoRecap, this.gridBagConstraintsProcesoRecap);
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 1;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecap.add(this.jButtonCopiarProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 1;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoRecap.add(this.jButtonVerFormProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 1;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoRecap.add(this.jButtonCerrarProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		
		this.jButtonRecargarInformacionProcesoRecap.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoRecap.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoRecap.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoRecap.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoRecap.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoRecap.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoRecap.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoRecap.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoRecap.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoRecap.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoRecap.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoRecap.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoRecap.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoRecap.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoRecap.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoRecap.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoRecap.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoRecap.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoRecap.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoRecap.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoRecap.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoRecap = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoRecap = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoRecap = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoRecap.setLayout(gridaBagParametrosReportesProcesoRecap);
			this.jPanelParametrosReportesAccionesProcesoRecap.setLayout(gridaBagParametrosReportesAccionesProcesoRecap);
			
			
			this.jPanelParametrosAuxiliar1ProcesoRecap.setLayout(gridaBagParametrosAuxiliar1ProcesoRecap);
			this.jPanelParametrosAuxiliar2ProcesoRecap.setLayout(gridaBagParametrosAuxiliar2ProcesoRecap);
			this.jPanelParametrosAuxiliar3ProcesoRecap.setLayout(gridaBagParametrosAuxiliar3ProcesoRecap);
			this.jPanelParametrosAuxiliar4ProcesoRecap.setLayout(gridaBagParametrosAuxiliar4ProcesoRecap);
			//this.jPanelParametrosAuxiliar5ProcesoRecap.setLayout(gridaBagParametrosAuxiliar2ProcesoRecap);			
			
			
			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoRecap.add(this.jButtonRecargarInformacionProcesoRecap, this.gridBagConstraintsProcesoRecap);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoRecap.add(this.jComboBoxTiposPaginacionProcesoRecap, this.gridBagConstraintsProcesoRecap);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoRecap.add(this.jCheckBoxConAltoMaximoTablaProcesoRecap, this.gridBagConstraintsProcesoRecap);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoRecap.add(this.jComboBoxTiposArchivosReportesProcesoRecap, this.gridBagConstraintsProcesoRecap);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecap.add(this.jPanelParametrosAuxiliar1ProcesoRecap, this.gridBagConstraintsProcesoRecap);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoRecap.add(this.jComboBoxTiposReportesProcesoRecap, this.gridBagConstraintsProcesoRecap);																		
			
			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoRecap.add(this.jComboBoxTiposGraficosReportesProcesoRecap, this.gridBagConstraintsProcesoRecap);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecap.add(this.jPanelParametrosAuxiliar4ProcesoRecap, this.gridBagConstraintsProcesoRecap);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecap.add(this.jComboBoxTiposReportesProcesoRecap, this.gridBagConstraintsProcesoRecap);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoRecap.add(this.jCheckBoxGenerarReporteProcesoRecap, this.gridBagConstraintsProcesoRecap);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecap.add(this.jPanelParametrosAuxiliar2ProcesoRecap, this.gridBagConstraintsProcesoRecap);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoRecap.add(this.jLabelAccionesProcesoRecap, this.gridBagConstraintsProcesoRecap);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoRecap.add(this.jComboBoxTiposSeleccionarProcesoRecap, this.gridBagConstraintsProcesoRecap);			
			
			
			/*
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoRecap.add(this.jCheckBoxSeleccionarTodosProcesoRecap, this.gridBagConstraintsProcesoRecap);
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoRecap.add(this.jCheckBoxConGraficoReporteProcesoRecap, this.gridBagConstraintsProcesoRecap);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoRecap.add(this.jCheckBoxSeleccionarTodosProcesoRecap, this.gridBagConstraintsProcesoRecap);															
				
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoRecap.add(this.jCheckBoxSeleccionadosProcesoRecap, this.gridBagConstraintsProcesoRecap);															
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoRecap.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoRecap.add(this.jCheckBoxConGraficoReporteProcesoRecap, this.gridBagConstraintsProcesoRecap);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoRecap.add(this.jPanelParametrosAuxiliar3ProcesoRecap, this.gridBagConstraintsProcesoRecap);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoRecap.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoRecap.add(this.jComboBoxTiposAccionesProcesoRecap, this.gridBagConstraintsProcesoRecap);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_proceso_recapProcesoRecapParam.add(jLabelid_proceso_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proceso_recapProcesoRecapParam.add(jButtonid_proceso_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 3;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_proceso_recapProcesoRecapParam.add(jButtonid_proceso_recapProcesoRecapParamUpdate, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_proceso_recapProcesoRecapParam.add(jComboBoxid_proceso_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_recapProcesoRecapParam.add(jLabelnumero_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_recapProcesoRecapParam.add(jButtonnumero_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_recapProcesoRecapParam.add(jTextFieldnumero_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacion_recapProcesoRecapParam.add(jLabelautorizacion_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacion_recapProcesoRecapParam.add(jButtonautorizacion_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacion_recapProcesoRecapParam.add(jTextFieldautorizacion_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 0;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_recapProcesoRecapParam.add(jLabelfecha_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecapParam.gridy = 0;
		this.gridBagConstraintsProcesoRecapParam.gridx = 2;
		this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
		this.gridBagConstraintsProcesoRecapParam.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_recapProcesoRecapParam.add(jButtonfecha_recapProcesoRecapParamBusqueda, this.gridBagConstraintsProcesoRecapParam);
	}

	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoRecapParam.gridy = 0;
	this.gridBagConstraintsProcesoRecapParam.gridx = 1;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_recapProcesoRecapParam.add(jDateChooserfecha_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);


			//SUBPANELES EN PANEL CAMPOS				
			
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecapParam.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecapParam.gridy = iYPanelCamposProcesoRecapParam;
	this.gridBagConstraintsProcesoRecapParam.gridx = iXPanelCamposProcesoRecapParam++;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecapParam.add(this.jPanelnumero_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(iXPanelCamposProcesoRecapParam % 1==0) {
		iXPanelCamposProcesoRecapParam=0;
		iYPanelCamposProcesoRecapParam++;
	}
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecapParam.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecapParam.gridy = iYPanelCamposProcesoRecapParam;
	this.gridBagConstraintsProcesoRecapParam.gridx = iXPanelCamposProcesoRecapParam++;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecapParam.add(this.jPanelautorizacion_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(iXPanelCamposProcesoRecapParam % 1==0) {
		iXPanelCamposProcesoRecapParam=0;
		iYPanelCamposProcesoRecapParam++;
	}
	this.gridBagConstraintsProcesoRecapParam = new GridBagConstraints();
	this.gridBagConstraintsProcesoRecapParam.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoRecapParam.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoRecapParam.gridy = iYPanelCamposProcesoRecapParam;
	this.gridBagConstraintsProcesoRecapParam.gridx = iXPanelCamposProcesoRecapParam++;
	this.gridBagConstraintsProcesoRecapParam.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoRecapParam.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoRecapParam.add(this.jPanelfecha_recapProcesoRecapParam, this.gridBagConstraintsProcesoRecapParam);



	if(iXPanelCamposProcesoRecapParam % 1==0) {
		iXPanelCamposProcesoRecapParam=0;
		iYPanelCamposProcesoRecapParam++;
	}
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoRecap = new GridBagLayout();

			this.jScrollPanelDatosProcesoRecap.setLayout(gridaBagLayoutDatosProcesoRecap);
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = 0;
			this.gridBagConstraintsProcesoRecap.gridx = 0;
			
			this.jScrollPanelDatosProcesoRecap.add(this.jTableDatosProcesoRecap, this.gridBagConstraintsProcesoRecap);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoRecap.setViewportView(this.jTableDatosProcesoRecap);
		this.jTableDatosProcesoRecap.setFillsViewportHeight(true);
		this.jTableDatosProcesoRecap.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoRecap= new GridBagLayout();
		this.jPanelAccionesProcesoRecap.setLayout(gridaBagLayoutAccionesProcesoRecap);
		
		
		/*	
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = 0;
			
		this.jPanelAccionesProcesoRecap.add(this.jButtonNuevoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoRecapProcesoRecap= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoRecapProcesoRecap.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoRecapProcesoRecap.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoRecapProcesoRecap.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoRecapProcesoRecap.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoRecapProcesoRecap.setLayout(gridaBagLayoutBusquedaProcesoRecapProcesoRecap);

		gridBagConstraintsProcesoRecap = new GridBagConstraints();
		gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecap.gridy = 0;
		gridBagConstraintsProcesoRecap.gridx = 0;
		jPanelBusquedaProcesoRecapProcesoRecap.add(jLabelid_ejercicioBusquedaProcesoRecapProcesoRecap, gridBagConstraintsProcesoRecap);

		gridBagConstraintsProcesoRecap = new GridBagConstraints();
		gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecap.gridy = 0;
		gridBagConstraintsProcesoRecap.gridx = 1;
		jPanelBusquedaProcesoRecapProcesoRecap.add(jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap, gridBagConstraintsProcesoRecap);


		gridBagConstraintsProcesoRecap = new GridBagConstraints();
		gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecap.gridy = 1;
		gridBagConstraintsProcesoRecap.gridx = 0;
		jPanelBusquedaProcesoRecapProcesoRecap.add(jLabelfecha_emision_desdeBusquedaProcesoRecapProcesoRecap, gridBagConstraintsProcesoRecap);

		gridBagConstraintsProcesoRecap = new GridBagConstraints();
		gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecap.gridy = 1;
		gridBagConstraintsProcesoRecap.gridx = 1;
		jPanelBusquedaProcesoRecapProcesoRecap.add(jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap, gridBagConstraintsProcesoRecap);


		gridBagConstraintsProcesoRecap = new GridBagConstraints();
		gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecap.gridy = 2;
		gridBagConstraintsProcesoRecap.gridx = 0;
		jPanelBusquedaProcesoRecapProcesoRecap.add(jLabelfecha_emision_hastaBusquedaProcesoRecapProcesoRecap, gridBagConstraintsProcesoRecap);

		gridBagConstraintsProcesoRecap = new GridBagConstraints();
		gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecap.gridy = 2;
		gridBagConstraintsProcesoRecap.gridx = 1;
		jPanelBusquedaProcesoRecapProcesoRecap.add(jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap, gridBagConstraintsProcesoRecap);

		gridBagConstraintsProcesoRecap = new GridBagConstraints();
		gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoRecap.gridy = 3;
		gridBagConstraintsProcesoRecap.gridx =1;
		jPanelBusquedaProcesoRecapProcesoRecap.add(jButtonBusquedaProcesoRecapProcesoRecap, gridBagConstraintsProcesoRecap);

		jTabbedPaneBusquedasProcesoRecap.addTab("1.-Por Ejercicio Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaProcesoRecapProcesoRecap);
		jTabbedPaneBusquedasProcesoRecap.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoRecap);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();						
			this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoRecap.gridx = 0;		
			//this.gridBagConstraintsProcesoRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoRecap.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoRecap, this.gridBagConstraintsProcesoRecap);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoRecap.gridx = 0;		
		//this.gridBagConstraintsProcesoRecap.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoRecap.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoRecap);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoRecap.gridy = 0;
			this.gridBagConstraintsProcesoRecap.gridx = iGridxBusquedasParametros++;		
			this.gridBagConstraintsProcesoRecap.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.anchor = GridBagConstraints.NORTHWEST;
			//this.gridBagConstraintsProcesoRecap.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jPanelBusquedasParametrosProcesoRecap.add(this.jTabbedPaneBusquedasProcesoRecap, this.gridBagConstraintsProcesoRecap);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = 0;
		this.gridBagConstraintsProcesoRecap.gridx = iGridxBusquedasParametros++;

		this.jPanelBusquedasParametrosProcesoRecap.add(this.jTabbedPaneCamposProcesoRecapParametros, this.gridBagConstraintsProcesoRecap);
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
		
		if(!this.conCargarMinimo) {
			
			this.jContentPane.add(this.jPanelBusquedasParametrosProcesoRecap, this.gridBagConstraintsProcesoRecap);									
			
		}
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoRecap, this.gridBagConstraintsProcesoRecap);								
		
		
		/*
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoRecap, this.gridBagConstraintsProcesoRecap);
		*/		
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoRecap.gridx =0;
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoRecap, this.gridBagConstraintsProcesoRecap);
				
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoRecap, this.gridBagConstraintsProcesoRecap);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoRecap= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoRecap = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoRecap.setLayout(gridaBagLayoutBusquedasParametrosProcesoRecap);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoRecap, this.gridBagConstraintsProcesoRecap);
			
			
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
			
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoRecap, this.gridBagConstraintsProcesoRecap);
		*/
		
			
     	//pack();
		
		
		
		this.jButtonRecargarInformacionProcesoRecap.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoRecap.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoRecap.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoRecap.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoRecap.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoRecap.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoRecap.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoRecap;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoRecap() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoRecap.setName("jPanelReporteDinamicoProcesoRecap"); 
		
		this.jPanelReporteDinamicoProcesoRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoRecap.setLayout(gridaBagLayoutReporteDinamicoProcesoRecap);
		
		
		this.jInternalFrameReporteDinamicoProcesoRecap= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoRecap.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoRecap.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoRecap.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoRecap.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoRecap.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoRecap.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoRecap.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Recapes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoRecap = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoRecap.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelColumnasSelectReporteProcesoRecap, this.gridBagConstraintsProcesoRecap);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoRecap = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoRecap.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoRecap.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoRecap=new JScrollPane(this.jListColumnasSelectReporteProcesoRecap);
			
			this.jScrollColumnasSelectReporteProcesoRecap.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoRecap.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoRecap.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoRecap.add(this.jListColumnasSelectReporteProcesoRecap, this.gridBagConstraintsProcesoRecap);
		this.jPanelReporteDinamicoProcesoRecap.add(this.jScrollColumnasSelectReporteProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoRecap = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoRecap.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoRecap = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoRecap.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoRecap.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoRecap.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoRecap=new JScrollPane(this.jListRelacionesSelectReporteProcesoRecap);
			
			this.jScrollRelacionesSelectReporteProcesoRecap.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoRecap.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoRecap.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoRecap = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoRecap = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoRecap = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoRecap = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoRecap.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoRecap = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoRecap.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelConGraficoDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoRecap = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoRecap.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoRecap.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoRecap.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoRecap.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoRecap.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecap.add(this.jCheckBoxConGraficoDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoRecap = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoRecap.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelColumnaCategoriaGraficoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoRecap.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoRecap.add(this.jComboBoxColumnaCategoriaGraficoProcesoRecap, this.gridBagConstraintsProcesoRecap);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoRecap = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoRecap.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelColumnaCategoriaValorProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoRecap.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoRecap.add(this.jComboBoxColumnaCategoriaValorProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoRecap = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoRecap.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelColumnasValoresGraficoProcesoRecap, this.gridBagConstraintsProcesoRecap);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoRecap = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoRecap.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoRecap.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoRecap.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoRecap.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoRecap.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoRecap=new JScrollPane(this.jListColumnasValoresGraficoProcesoRecap);
			
			this.jScrollColumnasValoresGraficoProcesoRecap.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoRecap.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoRecap.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoRecap.add(this.jListColumnasSelectReporteProcesoRecap, this.gridBagConstraintsProcesoRecap);
		this.jPanelReporteDinamicoProcesoRecap.add(this.jScrollColumnasValoresGraficoProcesoRecap, this.gridBagConstraintsProcesoRecap);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoRecap = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoRecap.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelTiposGraficosReportesDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoRecap = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoRecap.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoRecap.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoRecap.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecap.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoRecap = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoRecap.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelGenerarExcelReporteDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoRecap = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoRecap.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoRecap,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoRecap.setToolTipText("Generar EXCEL"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		//this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoRecap.add(this.jButtonGenerarExcelReporteDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecap.add(this.jComboBoxTiposReportesDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoRecap = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoRecap.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoRecap.add(this.jLabelTiposArchivoReporteDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecap.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoRecap = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoRecap.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoRecap,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoRecap.setToolTipText("Generar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecap.add(this.jButtonGenerarReporteDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoRecap = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoRecap.setToolTipText("Cancelar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoRecap.add(this.jButtonCerrarReporteDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoRecap = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoRecap= new JScrollPane(jPanelReporteDinamicoProcesoRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoRecap.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoRecap.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoRecap.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Recapes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoRecap.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoRecap.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoRecap);
		this.jInternalFrameReporteDinamicoProcesoRecap.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoRecap, this.gridBagConstraintsProcesoRecap);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoRecap() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoRecap = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoRecap.setName("jPanelImportacionProcesoRecap"); 
		
		this.jPanelImportacionProcesoRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoRecap.setLayout(gridaBagLayoutImportacionProcesoRecap);
		
		
		this.jInternalFrameImportacionProcesoRecap= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoRecap= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoRecap = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoRecap= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoRecap.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoRecap.setResizable(true);
	    this.jInternalFrameImportacionProcesoRecap.setClosable(true);
	    this.jInternalFrameImportacionProcesoRecap.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoRecap.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoRecap.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoRecap.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoRecap.setResizable(true);
	    this.jInternalFrameImportacionProcesoRecap.setClosable(true);
	    this.jInternalFrameImportacionProcesoRecap.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoRecap.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoRecap.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoRecap.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Recapes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoRecap = new JLabelMe();

		this.jLabelArchivoImportacionProcesoRecap.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoRecap.add(this.jLabelArchivoImportacionProcesoRecap, this.gridBagConstraintsProcesoRecap);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoRecap = new JFileChooser();		
		this.jFileChooserImportacionProcesoRecap.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoRecap = new JButtonMe();
		this.jButtonAbrirImportacionProcesoRecap.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoRecap,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoRecap.setToolTipText("Generar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecap.add(this.jButtonAbrirImportacionProcesoRecap, this.gridBagConstraintsProcesoRecap);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoRecap = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoRecap.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoRecap.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoRecap.add(this.jLabelPathArchivoImportacionProcesoRecap, this.gridBagConstraintsProcesoRecap);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoRecap=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoRecap.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoRecap.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoRecap.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecap.add(this.jTextFieldPathArchivoImportacionProcesoRecap, this.gridBagConstraintsProcesoRecap);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoRecap = new JButtonMe();
		this.jButtonGenerarImportacionProcesoRecap.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoRecap,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoRecap.setToolTipText("Generar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecap.add(this.jButtonGenerarImportacionProcesoRecap, this.gridBagConstraintsProcesoRecap);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoRecap = new JButtonMe();
		this.jButtonCerrarImportacionProcesoRecap.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoRecap,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoRecap.setToolTipText("Cancelar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoRecap.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoRecap.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoRecap.add(this.jButtonCerrarImportacionProcesoRecap, this.gridBagConstraintsProcesoRecap);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoRecap = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoRecap= new JScrollPane(jPanelImportacionProcesoRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
		this.gridBagConstraintsProcesoRecap.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoRecap.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoRecap.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoRecap);
		this.jInternalFrameImportacionProcesoRecap.getContentPane().add(this.jScrollPanelImportacionProcesoRecap, this.gridBagConstraintsProcesoRecap);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoRecap(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoRecap = new JButtonMe();
			this.jButtonAbrirOrderByProcesoRecap.setText("Orden");
			this.jButtonAbrirOrderByProcesoRecap.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoRecap,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoRecap";
			inputMap = this.jButtonAbrirOrderByProcesoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoRecap"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoRecap = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoRecap.setName("jPanelOrderByProcesoRecap"); 
			
			this.jPanelOrderByProcesoRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoRecap.setLayout(gridaBagLayoutOrderByProcesoRecap);
			
			
			this.jTableDatosProcesoRecapOrderBy = new JTableMe();        
			this.jTableDatosProcesoRecapOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoRecapOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoRecapOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoRecapOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoRecapOrderBy.setViewportView(this.jTableDatosProcesoRecapOrderBy);
			this.jTableDatosProcesoRecapOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoRecapOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoRecap= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoRecap= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoRecap = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoRecap= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoRecap.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoRecap.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoRecap.setTitle("Orden");
			this.jInternalFrameOrderByProcesoRecap.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoRecap.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoRecap.setResizable(true);
			this.jInternalFrameOrderByProcesoRecap.setClosable(true);
			this.jInternalFrameOrderByProcesoRecap.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoRecap.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoRecap.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoRecap.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Recapes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoRecap.ipady =150;
				
			this.jPanelOrderByProcesoRecap.add(jScrollPanelDatosProcesoRecapOrderBy, this.gridBagConstraintsProcesoRecap);//this.jTableDatosProcesoRecapTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoRecap = new JButtonMe();
			this.jButtonCerrarOrderByProcesoRecap.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoRecap,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoRecap.setToolTipText("Cancelar"+" "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoRecap.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoRecap.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoRecap.add(this.jButtonCerrarOrderByProcesoRecap, this.gridBagConstraintsProcesoRecap);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoRecap = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoRecap= new JScrollPane(jPanelOrderByProcesoRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoRecap = new GridBagConstraints();
			this.gridBagConstraintsProcesoRecap.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoRecap.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoRecap.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoRecap.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoRecap.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoRecap);
			
			this.jInternalFrameOrderByProcesoRecap.getContentPane().add(this.jScrollPanelOrderByProcesoRecap, this.gridBagConstraintsProcesoRecap);			
		
		} else {
			this.jButtonAbrirOrderByProcesoRecap = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesorecapSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoRecap.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoRecap.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoRecap.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoRecap.getRowHeight();//ProcesoRecapConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoRecap.isSelected()) {
					iHeightTable=ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoRecap.isSelected()) {
					iHeightTable=ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoRecapConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoRecap.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoRecap.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoRecap.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoRecap!=null && this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy()!=null) {
			//if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoRecap.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoRecap.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoRecap.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoRecap.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoRecap.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoRecap.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesorecapLogic.getProcesoRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesorecaps.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoRecap> TraerProcesoRecapBeans(List<ProcesoRecap> procesorecaps,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoRecap procesorecap:procesorecaps) {
					
				if(!(ProcesoRecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoRecapConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesorecap.setsDetalleGeneralEntityReporte(ProcesoRecapConstantesFunciones.getProcesoRecapDescripcion(procesorecap));
										
						
					
						
					
				} else  {
							
					//procesorecap.setsDetalleGeneralEntityReporte(procesorecap.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesorecapbeans.add(procesorecapbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesorecaps;
    }
	//PARA REPORTES FIN
}
