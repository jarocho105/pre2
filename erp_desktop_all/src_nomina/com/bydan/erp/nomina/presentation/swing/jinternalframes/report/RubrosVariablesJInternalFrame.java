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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.RubrosVariablesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class RubrosVariablesJInternalFrame extends RubrosVariablesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRubrosVariables;
	
	protected JMenuBar jmenuBarRubrosVariables;
	
	protected JMenu jmenuRubrosVariables;
	protected JMenu jmenuDatosRubrosVariables;
	protected JMenu jmenuArchivoRubrosVariables;
	protected JMenu jmenuAccionesRubrosVariables;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubrosVariables;	
	protected GridBagConstraints gridBagConstraintsRubrosVariables;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RubrosVariablesDetalleFormJInternalFrame jInternalFrameDetalleFormRubrosVariables;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRubrosVariables;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRubrosVariables;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";
	
	public RubrosVariablesSessionBean rubrosvariablesSessionBean;
		
	
	
	public TipoContratoSessionBean tipocontratoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RubrosVariables> rubrosvariabless;		
	public List<RubrosVariables> rubrosvariablessEliminados;	
	public List<RubrosVariables> rubrosvariablessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRubrosVariables;		
	protected JButton jButtonAbrirOrderByRubrosVariables;
	
	
	//protected JPanel jPanelOrderByRubrosVariables;
	//public JScrollPane jScrollPanelOrderByRubrosVariables;	
	//protected JButton jButtonCerrarOrderByRubrosVariables;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RubrosVariablesLogic rubrosvariablesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRubrosVariables;
	public JScrollPane jScrollPanelDatosEdicionRubrosVariables;
	public JScrollPane jScrollPanelDatosGeneralRubrosVariables;
    
	
	
	//public JScrollPane jScrollPanelDatosRubrosVariablesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRubrosVariables;
	//public JScrollPane jScrollPanelImportacionRubrosVariables;
	
	
	
	protected JPanel jPanelAccionesRubrosVariables;
	
    protected JPanel jPanelPaginacionRubrosVariables;
    protected JPanel jPanelParametrosReportesRubrosVariables;
	protected JPanel jPanelParametrosReportesAccionesRubrosVariables;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RubrosVariables;
	protected JPanel jPanelParametrosAuxiliar2RubrosVariables;
	protected JPanel jPanelParametrosAuxiliar3RubrosVariables;
	protected JPanel jPanelParametrosAuxiliar4RubrosVariables;
	//protected JPanel jPanelParametrosAuxiliar5RubrosVariables;
	
	
	
	//protected JPanel jPanelReporteDinamicoRubrosVariables;
	//protected JPanel jPanelImportacionRubrosVariables;
	
	
	public JTable jTableDatosRubrosVariables;
	
	
	
	//public JTable jTableDatosRubrosVariablesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRubrosVariables;
	protected JButton jButtonDuplicarRubrosVariables;
	protected JButton jButtonCopiarRubrosVariables;
	protected JButton jButtonVerFormRubrosVariables;
	protected JButton jButtonNuevoRelacionesRubrosVariables;
	protected JButton jButtonModificarRubrosVariables;
	
    protected JButton jButtonGuardarCambiosTablaRubrosVariables;
	protected JButton jButtonCerrarRubrosVariables;
	
	
	protected JButton jButtonRecargarInformacionRubrosVariables;
	protected JButton jButtonProcesarInformacionRubrosVariables;
	
	
	protected JButton jButtonAnterioresRubrosVariables;
	protected JButton jButtonSiguientesRubrosVariables;
	protected JButton jButtonNuevoGuardarCambiosRubrosVariables;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRubrosVariables;
	//protected JButton jButtonCerrarReporteDinamicoRubrosVariables;
	//protected JButton jButtonGenerarExcelReporteDinamicoRubrosVariables;	
	
	
	
	//protected JButton jButtonAbrirImportacionRubrosVariables;
	//protected JButton jButtonGenerarImportacionRubrosVariables;
	//protected JButton jButtonCerrarImportacionRubrosVariables;
	//protected JFileChooser jFileChooserImportacionRubrosVariables;
	//protected File fileImportacionRubrosVariables;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubrosVariables;
	protected JButton jButtonDuplicarToolBarRubrosVariables;
	protected JButton jButtonNuevoRelacionesToolBarRubrosVariables;
	
	
	public JButton jButtonGuardarCambiosToolBarRubrosVariables;
	protected JButton jButtonCopiarToolBarRubrosVariables;
	protected JButton jButtonVerFormToolBarRubrosVariables;
	public JButton jButtonGuardarCambiosTablaToolBarRubrosVariables;
	protected JButton jButtonMostrarOcultarTablaToolBarRubrosVariables;
	protected JButton jButtonCerrarToolBarRubrosVariables;
	
	protected JButton jButtonRecargarInformacionToolBarRubrosVariables;
	protected JButton jButtonProcesarInformacionToolBarRubrosVariables;
	protected JButton jButtonAnterioresToolBarRubrosVariables;
	protected JButton jButtonSiguientesToolBarRubrosVariables;
	protected JButton jButtonNuevoGuardarCambiosToolBarRubrosVariables;
	protected JButton jButtonAbrirOrderByToolBarRubrosVariables;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubrosVariables;
	protected JMenuItem jMenuItemDuplicarRubrosVariables;
	protected JMenuItem jMenuItemNuevoRelacionesRubrosVariables;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRubrosVariables;
	protected JMenuItem jMenuItemCopiarRubrosVariables;
	protected JMenuItem jMenuItemVerFormRubrosVariables;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubrosVariables;
	protected JMenuItem jMenuItemCerrarRubrosVariables;
	protected JMenuItem jMenuItemDetalleCerrarRubrosVariables;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRubrosVariables;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubrosVariables;
	
	protected JMenuItem jMenuItemRecargarInformacionRubrosVariables;
	protected JMenuItem jMenuItemProcesarInformacionRubrosVariables;
	protected JMenuItem jMenuItemAnterioresRubrosVariables;
	protected JMenuItem jMenuItemSiguientesRubrosVariables;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubrosVariables;
	protected JMenuItem jMenuItemAbrirOrderByRubrosVariables;
	protected JMenuItem jMenuItemMostrarOcultarRubrosVariables;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubrosVariables;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRubrosVariables;
	protected JCheckBox jCheckBoxSeleccionadosRubrosVariables;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRubrosVariables;
	protected JCheckBox jCheckBoxConGraficoReporteRubrosVariables;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRubrosVariables;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRubrosVariables;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRubrosVariables;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRubrosVariables;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRubrosVariables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRubrosVariables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubrosVariables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubrosVariables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRubrosVariables;
	protected JTextField jTextFieldValorCampoGeneralRubrosVariables;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRubrosVariables;
	//public JList<Reporte> jListColumnasSelectReporteRubrosVariables;
	//public JScrollPane jScrollColumnasSelectReporteRubrosVariables;
	
	//public JLabel jLabelRelacionesSelectReporteRubrosVariables;
	//public JList<Reporte> jListRelacionesSelectReporteRubrosVariables;
	//public JScrollPane jScrollRelacionesSelectReporteRubrosVariables;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRubrosVariables;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRubrosVariables;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRubrosVariables;
	//public JLabel jLabelTiposArchivoReporteDinamicoRubrosVariables;
	
		
	//public JLabel jLabelArchivoImportacionRubrosVariables;	
	//public JLabel jLabelPathArchivoImportacionRubrosVariables;
	//protected JTextField jTextFieldPathArchivoImportacionRubrosVariables;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRubrosVariables;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRubrosVariables;
	
	//public JLabel jLabelColumnaCategoriaValorRubrosVariables;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRubrosVariables;
	
	//public JLabel jLabelColumnasValoresGraficoRubrosVariables;
	//public JList<Reporte> jListColumnasValoresGraficoRubrosVariables;
	//public JScrollPane jScrollColumnasValoresGraficoRubrosVariables;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRubrosVariables;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRubrosVariables;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRubrosVariables;
	public JPanel jPanelBusquedaRubrosVariablesRubrosVariables;
	public JButton jButtonBusquedaRubrosVariablesRubrosVariables;
	
	public JPanel jPanelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables;
	public JLabel jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables;
	public JButton jButtonid_tipo_contratoBusquedaRubrosVariablesRubrosVariables= new JButtonMe();
	public JButton jButtonid_tipo_contratoBusquedaRubrosVariablesRubrosVariablesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoBusquedaRubrosVariablesRubrosVariablesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables;
	public JLabel jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables;
	public JButton jButtonid_rubro_empleaBusquedaRubrosVariablesRubrosVariables= new JButtonMe();
	public JButton jButtonid_rubro_empleaBusquedaRubrosVariablesRubrosVariablesUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaBusquedaRubrosVariablesRubrosVariablesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaRubrosVariablesRubrosVariables;
	public JLabel jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables;

	public JDateChooser jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables;
	public JButton jButtonfecha_desdeBusquedaRubrosVariablesRubrosVariablesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaRubrosVariablesRubrosVariables;
	public JLabel jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables;

	public JDateChooser jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables;
	public JButton jButtonfecha_hastaBusquedaRubrosVariablesRubrosVariablesBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RubrosVariablesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubrosVariablesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubrosVariablesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubrosVariablesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRubrosVariables)	{
		this.jButtonRecargarInformacionRubrosVariables = jButtonRecargarInformacionRubrosVariables;
	}
	
	public JButton getjButtonProcesarInformacionRubrosVariables() {
		return this.jButtonProcesarInformacionRubrosVariables;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubrosVariables)	{
		this.jButtonProcesarInformacionRubrosVariables = jButtonProcesarInformacionRubrosVariables;
	}
	
	
	public JButton getjButtonRecargarInformacionRubrosVariables() {
		return this.jButtonRecargarInformacionRubrosVariables;
	}
	
	
	public List<RubrosVariables> getrubrosvariabless() {
		return this.rubrosvariabless;
	}

	public void setrubrosvariabless(List<RubrosVariables> rubrosvariabless) {
		this.rubrosvariabless = rubrosvariabless;
	}
	
	public List<RubrosVariables> getrubrosvariablessAux() {
		return this.rubrosvariablessAux;
	}

	public void setrubrosvariablessAux(List<RubrosVariables> rubrosvariablessAux) {
		this.rubrosvariablessAux = rubrosvariablessAux;
	}
	
	public List<RubrosVariables> getrubrosvariablessEliminados() {
		return this.rubrosvariablessEliminados;
	}

	public void setRubrosVariablessEliminados(List<RubrosVariables> rubrosvariablessEliminados) {
		this.rubrosvariablessEliminados = rubrosvariablessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRubrosVariables() {
		return jComboBoxTiposSeleccionarRubrosVariables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRubrosVariables(
			JComboBox jComboBoxTiposSeleccionarRubrosVariables) {
		this.jComboBoxTiposSeleccionarRubrosVariables = jComboBoxTiposSeleccionarRubrosVariables;
	}
	
	public void setBorderResaltarTiposSeleccionarRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRubrosVariables .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRubrosVariables() {
		return jTextFieldValorCampoGeneralRubrosVariables;
	}

	public void setjTextFieldValorCampoGeneralRubrosVariables(
			JTextField jTextFieldValorCampoGeneralRubrosVariables) {
		this.jTextFieldValorCampoGeneralRubrosVariables = jTextFieldValorCampoGeneralRubrosVariables;
	}

	public void setBorderResaltarValorCampoGeneralRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRubrosVariables .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRubrosVariables() {
		return this.jCheckBoxSeleccionarTodosRubrosVariables;
	}

	public void setjCheckBoxSeleccionarTodosRubrosVariables(
			JCheckBox jCheckBoxSeleccionarTodosRubrosVariables) {
		this.jCheckBoxSeleccionarTodosRubrosVariables = jCheckBoxSeleccionarTodosRubrosVariables;
	}

	public void setBorderResaltarSeleccionarTodosRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRubrosVariables .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRubrosVariables() {
		return this.jCheckBoxSeleccionadosRubrosVariables;
	}

	public void setjCheckBoxSeleccionadosRubrosVariables(
			JCheckBox jCheckBoxSeleccionadosRubrosVariables) {
		this.jCheckBoxSeleccionadosRubrosVariables = jCheckBoxSeleccionadosRubrosVariables;
	}
	
	public void setBorderResaltarSeleccionadosRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRubrosVariables .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRubrosVariables() {
		return this.jComboBoxTiposArchivosReportesRubrosVariables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRubrosVariables(
			JComboBox jComboBoxTiposArchivosReportesRubrosVariables) {
		this.jComboBoxTiposArchivosReportesRubrosVariables = jComboBoxTiposArchivosReportesRubrosVariables;
	}

	public void setBorderResaltarTiposArchivosReportesRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRubrosVariables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRubrosVariables() {
		return this.jComboBoxTiposReportesRubrosVariables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRubrosVariables(
			JComboBox jComboBoxTiposReportesRubrosVariables) {
		this.jComboBoxTiposReportesRubrosVariables = jComboBoxTiposReportesRubrosVariables;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRubrosVariables() {
	//	return jComboBoxTiposReportesDinamicoRubrosVariables;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRubrosVariables(
	//		JComboBox jComboBoxTiposReportesDinamicoRubrosVariables) {
	//	this.jComboBoxTiposReportesDinamicoRubrosVariables = jComboBoxTiposReportesDinamicoRubrosVariables;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRubrosVariables() {
	//	return jComboBoxTiposArchivosReportesDinamicoRubrosVariables;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRubrosVariables(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRubrosVariables) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables = jComboBoxTiposArchivosReportesDinamicoRubrosVariables;
	//}
	
	public void setBorderResaltarTiposReportesRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRubrosVariables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRubrosVariables() {
		return this.jComboBoxTiposGraficosReportesRubrosVariables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRubrosVariables(
			JComboBox jComboBoxTiposGraficosReportesRubrosVariables) {
		this.jComboBoxTiposGraficosReportesRubrosVariables = jComboBoxTiposGraficosReportesRubrosVariables;
	}
	
	public void setBorderResaltarTiposGraficosReportesRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRubrosVariables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRubrosVariables() {
		return this.jComboBoxTiposPaginacionRubrosVariables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRubrosVariables(
			JComboBox jComboBoxTiposPaginacionRubrosVariables) {
		this.jComboBoxTiposPaginacionRubrosVariables = jComboBoxTiposPaginacionRubrosVariables;
	}
	
	public void setBorderResaltarTiposPaginacionRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRubrosVariables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRubrosVariables() {
		return this.jComboBoxTiposRelacionesRubrosVariables;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubrosVariables() {
		return this.jComboBoxTiposAccionesRubrosVariables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubrosVariables(
			JComboBox jComboBoxTiposRelacionesRubrosVariables) {
		this.jComboBoxTiposRelacionesRubrosVariables = jComboBoxTiposRelacionesRubrosVariables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubrosVariables(
			JComboBox jComboBoxTiposAccionesRubrosVariables) {
		this.jComboBoxTiposAccionesRubrosVariables = jComboBoxTiposAccionesRubrosVariables;
	}
	
	public void setBorderResaltarTiposRelacionesRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRubrosVariables .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRubrosVariables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRubrosVariables .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRubrosVariables() {
	//	return jCheckBoxConGraficoDinamicoRubrosVariables;
	//}

	//public void setjCheckBoxConGraficoDinamicoRubrosVariables(
	//		JCheckBox jCheckBoxConGraficoDinamicoRubrosVariables) {
	//	this.jCheckBoxConGraficoDinamicoRubrosVariables = jCheckBoxConGraficoDinamicoRubrosVariables;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRubrosVariables() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRubrosVariables.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRubrosVariables .setBorder(borderResaltar);		
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
		this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
		
		this.rubrosvariablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubrosvariablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubrosvariablesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RubrosVariablesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RubrosVariablesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubrosVariablesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubrosVariablesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubrosVariablesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubros Variables MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
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
		
		RubrosVariablesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RubrosVariables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRubrosVariables= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"nuevo","nuevo","Nuevo"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"duplicar","duplicar","Duplicar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"copiar","copiar","Copiar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"ver_form","ver_form","Ver"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"recargar","recargar","Buscar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRubrosVariables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRubrosVariables,this.jTtoolBarRubrosVariables,
							"cerrar","cerrar","Salir"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRubrosVariables=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRubrosVariables;
			
				this.jButtonProcesarInformacionToolBarRubrosVariables=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRubrosVariables;
				
		//protected JButton jButtonModificarToolBarRubrosVariables;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRubrosVariables=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRubrosVariables=new JMenuMe("General");
		this.jmenuArchivoRubrosVariables=new JMenuMe("Archivo");
		this.jmenuAccionesRubrosVariables=new JMenuMe("Acciones");
		this.jmenuDatosRubrosVariables=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubrosVariables= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubrosVariables.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubrosVariables,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRubrosVariables= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRubrosVariables.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRubrosVariables,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRubrosVariables= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRubrosVariables.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRubrosVariables,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRubrosVariables= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubrosVariables.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubrosVariables,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRubrosVariables= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRubrosVariables.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRubrosVariables,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRubrosVariables= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRubrosVariables.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRubrosVariables,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRubrosVariables= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRubrosVariables.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRubrosVariables,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubrosVariables= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubrosVariables.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubrosVariables,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRubrosVariables= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRubrosVariables.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRubrosVariables,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRubrosVariables= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRubrosVariables.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRubrosVariables,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRubrosVariables= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRubrosVariables.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRubrosVariables,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRubrosVariables= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRubrosVariables.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRubrosVariables,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRubrosVariables= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRubrosVariables.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRubrosVariables,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubrosVariables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubrosVariables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubrosVariables,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRubrosVariables= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRubrosVariables.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRubrosVariables,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubrosVariables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubrosVariables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubrosVariables,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRubrosVariables= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRubrosVariables.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRubrosVariables,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRubrosVariables.add(this.jMenuItemCerrarRubrosVariables);
			
			this.jmenuAccionesRubrosVariables.add(this.jMenuItemNuevoRubrosVariables);
			this.jmenuAccionesRubrosVariables.add(this.jMenuItemNuevoGuardarCambiosRubrosVariables);
			this.jmenuAccionesRubrosVariables.add(this.jMenuItemNuevoRelacionesRubrosVariables);
			this.jmenuAccionesRubrosVariables.add(this.jMenuItemGuardarCambiosTablaRubrosVariables);		
			this.jmenuAccionesRubrosVariables.add(this.jMenuItemDuplicarRubrosVariables);		
			this.jmenuAccionesRubrosVariables.add(this.jMenuItemCopiarRubrosVariables);		
			this.jmenuAccionesRubrosVariables.add(this.jMenuItemVerFormRubrosVariables);		
			
			this.jmenuDatosRubrosVariables.add(this.jMenuItemRecargarInformacionRubrosVariables);				
			this.jmenuDatosRubrosVariables.add(this.jMenuItemAnterioresRubrosVariables);				
			this.jmenuDatosRubrosVariables.add(this.jMenuItemSiguientesRubrosVariables);				
			this.jmenuDatosRubrosVariables.add(this.jMenuItemAbrirOrderByRubrosVariables);				
			this.jmenuDatosRubrosVariables.add(this.jMenuItemMostrarOcultarRubrosVariables);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRubrosVariables.add(this.jMenuItemGuardarCambiosRubrosVariables);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRubrosVariables.add(this.jmenuArchivoRubrosVariables);		
			this.jmenuBarRubrosVariables.add(this.jmenuAccionesRubrosVariables);		
			this.jmenuBarRubrosVariables.add(this.jmenuDatosRubrosVariables);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRubrosVariables);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRubrosVariables() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaRubrosVariablesRubrosVariables=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaRubrosVariablesRubrosVariables.setToolTipText("Buscar Por Tipo Contrato Por Rubro Emplea Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaRubrosVariablesRubrosVariables= new JButtonMe();
		this.jButtonBusquedaRubrosVariablesRubrosVariables.setText("Buscar");
		this.jButtonBusquedaRubrosVariablesRubrosVariables.setToolTipText("Buscar Por Tipo Contrato Por Rubro Emplea Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaRubrosVariablesRubrosVariables,"buscar_button","Buscar Por Tipo Contrato Por Rubro Emplea Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaRubrosVariablesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables = new JLabelMe();
		jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setText("Tipo Contrato :");
		jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setToolTipText("Tipo Contrato");
		jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables= new JComboBoxMe();
		jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables = new JLabelMe();
		jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setText("Rubro Emplea :");
		jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables= new JComboBoxMe();
		jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables = new JLabelMe();
		jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables= new JDateChooser();
		jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables.setDate(new Date());
		jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables = new JLabelMe();
		jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables= new JDateChooser();
		jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables.setDate(new Date());
		jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasRubrosVariables=new JTabbedPane();


		this.jTabbedPaneBusquedasRubrosVariables.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasRubrosVariables.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasRubrosVariables.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRubrosVariables.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRubrosVariables = new RubrosVariablesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rubros Variables DATOS");
			this.jInternalFrameDetalleFormRubrosVariables = new RubrosVariablesDetalleFormJInternalFrame(jDesktopPane,this.rubrosvariablesSessionBean.getConGuardarRelaciones(),this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRubrosVariables = null;//new RubrosVariablesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubrosVariables= new GridBagLayout();
		
		
		this.jTableDatosRubrosVariables = new JTableMe();      
		
		String sToolTipRubrosVariables="";
		sToolTipRubrosVariables=RubrosVariablesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubrosVariables+="(Nomina.RubrosVariables)";
		}
		
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubrosVariables+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRubrosVariables.setToolTipText(sToolTipRubrosVariables);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRubrosVariables);
		this.jTableDatosRubrosVariables.setAutoCreateRowSorter(true);
		this.jTableDatosRubrosVariables.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRubrosVariables.setRowSelectionAllowed(true);
		this.jTableDatosRubrosVariables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRubrosVariables,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRubrosVariables = new JButtonMe();
		this.jButtonDuplicarRubrosVariables = new JButtonMe();
		this.jButtonCopiarRubrosVariables = new JButtonMe();
		this.jButtonVerFormRubrosVariables = new JButtonMe();
		this.jButtonNuevoRelacionesRubrosVariables = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRubrosVariables = new JButtonMe();
		this.jButtonCerrarRubrosVariables = new JButtonMe();
		
		this.jScrollPanelDatosRubrosVariables = new JScrollPane();   
        this.jScrollPanelDatosGeneralRubrosVariables = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rubros Variables";
		
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubros Variableses" + this.sPath));
		} else {
			this.jScrollPanelDatosRubrosVariables.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubrosVariables.setToolTipText("Acciones");
        this.jPanelAccionesRubrosVariables.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRubrosVariables=new ReporteDinamicoJInternalFrame(RubrosVariablesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRubrosVariables();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRubrosVariables=new ImportacionJInternalFrame(RubrosVariablesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRubrosVariables();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRubrosVariables = new JButtonMe();
		
		this.jButtonAbrirOrderByRubrosVariables.setText("Orden");
		this.jButtonAbrirOrderByRubrosVariables.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubrosVariables,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubrosVariables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubrosVariables,false,this);
			
			//this.cargarOrderByRubrosVariables(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubrosVariables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubrosVariables,true,this);
			
			//this.cargarOrderByRubrosVariables(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRubrosVariables.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosRubrosVariables.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosRubrosVariables.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosRubrosVariables.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubrosVariables.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubrosVariables.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRubrosVariables.setText("Nuevo");
		this.jButtonDuplicarRubrosVariables.setText("Duplicar");
		this.jButtonCopiarRubrosVariables.setText("Copiar");
		this.jButtonVerFormRubrosVariables.setText("Ver");
		this.jButtonNuevoRelacionesRubrosVariables.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRubrosVariables.setText("Guardar");
		this.jButtonCerrarRubrosVariables.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubrosVariables,"nuevo_button","Nuevo",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRubrosVariables,"duplicar_button","Duplicar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRubrosVariables,"copiar_button","Copiar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRubrosVariables,"ver_form","Ver",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRubrosVariables,"nuevorelaciones_button","Nuevo Rel",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubrosVariables,"guardarcambiostabla_button","Guardar",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubrosVariables,"cerrar_button","Salir",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRubrosVariables.setToolTipText("Nuevo"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRubrosVariables.setToolTipText("Duplicar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRubrosVariables.setToolTipText("Copiar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRubrosVariables.setToolTipText("Ver"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRubrosVariables.setToolTipText("Nuevo Rel"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRubrosVariables.setToolTipText("Guardar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubrosVariables.setToolTipText("Salir"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubrosVariables";
		inputMap = this.jButtonNuevoRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubrosVariables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubrosVariables"));
		
		//DUPLICAR
		sMapKey = "DuplicarRubrosVariables";
		inputMap = this.jButtonDuplicarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRubrosVariables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRubrosVariables"));
		
		//COPIAR
		sMapKey = "CopiarRubrosVariables";
		inputMap = this.jButtonCopiarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRubrosVariables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRubrosVariables"));
		
		//VEr FORM
		sMapKey = "VerFormRubrosVariables";
		inputMap = this.jButtonVerFormRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRubrosVariables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRubrosVariables"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRubrosVariables";
		inputMap = this.jButtonNuevoRelacionesRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRubrosVariables"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRubrosVariables";
		inputMap = this.jButtonModificarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRubrosVariables"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRubrosVariables";
		inputMap = this.jButtonCerrarRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubrosVariables"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubrosVariables";
		inputMap = this.jButtonGuardarCambiosTablaRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubrosVariables"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RubrosVariables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RubrosVariables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RubrosVariables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RubrosVariables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RubrosVariables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRubrosVariables.setName("jPanelParametrosReportesRubrosVariables"); 
		
		this.jPanelParametrosReportesAccionesRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRubrosVariables.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRubrosVariables.setName("jPanelParametrosReportesAccionesRubrosVariables"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRubrosVariables = new JButtonMe();
		this.jButtonRecargarInformacionRubrosVariables.setText("Buscar");
		this.jButtonRecargarInformacionRubrosVariables.setToolTipText("Buscar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRubrosVariables,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionRubrosVariables.setVisible(false);
		
		
		this.jButtonProcesarInformacionRubrosVariables = new JButtonMe();
		this.jButtonProcesarInformacionRubrosVariables.setText("Procesar");
		this.jButtonProcesarInformacionRubrosVariables.setToolTipText("Procesar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRubrosVariables.setVisible(false);
			
		this.jButtonProcesarInformacionRubrosVariables.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubrosVariables.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubrosVariables.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubrosVariables.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRubrosVariables.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubrosVariables.setText("TIPO");       
		this.jComboBoxTiposReportesRubrosVariables.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubrosVariables.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRubrosVariables.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRubrosVariables.setText("Paginacion");
		this.jComboBoxTiposPaginacionRubrosVariables.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRubrosVariables.setText("Accion");
		this.jComboBoxTiposRelacionesRubrosVariables.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubrosVariables.setText("Accion");
		this.jComboBoxTiposAccionesRubrosVariables.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRubrosVariables = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRubrosVariables.setText("Accion");
		this.jComboBoxTiposSeleccionarRubrosVariables.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRubrosVariables=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRubrosVariables.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubrosVariables.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubrosVariables.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRubrosVariables = new JLabelMe();
		
		this.jLabelAccionesRubrosVariables.setText("Acciones");		
		this.jLabelAccionesRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRubrosVariables = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRubrosVariables.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRubrosVariables.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRubrosVariables = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRubrosVariables.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRubrosVariables.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRubrosVariables = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRubrosVariables.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRubrosVariables.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRubrosVariables = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRubrosVariables.setText("Graf.");
		this.jCheckBoxConGraficoReporteRubrosVariables.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRubrosVariables = new JButtonMe();
		//this.jButtonAnterioresRubrosVariables.setText("<<");
        this.jButtonAnterioresRubrosVariables.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRubrosVariables,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRubrosVariables = new JButtonMe();
		//this.jButtonSiguientesRubrosVariables.setText(">>");
        this.jButtonSiguientesRubrosVariables.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRubrosVariables,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRubrosVariables = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRubrosVariables.setText("Nue");
        this.jButtonNuevoGuardarCambiosRubrosVariables.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRubrosVariables,"nuevoguardarcambios_button","Nue",this.rubrosvariablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRubrosVariables";
		inputMap = this.jButtonNuevoGuardarCambiosRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRubrosVariables"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRubrosVariables";
		inputMap = this.jButtonRecargarInformacionRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRubrosVariables"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRubrosVariables";
		inputMap = this.jButtonSiguientesRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRubrosVariables"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRubrosVariables";
		inputMap = this.jButtonAnterioresRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRubrosVariables"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRubrosVariables();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRubrosVariables.setMinimumSize(new Dimension(this.getWidth(),RubrosVariablesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubrosVariablesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubrosVariables.setMaximumSize(new Dimension(this.getWidth(),RubrosVariablesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubrosVariablesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubrosVariables.setPreferredSize(new Dimension(this.getWidth(),RubrosVariablesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubrosVariablesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRubrosVariables = new GridBagLayout();

			this.jPanelPaginacionRubrosVariables.setLayout(gridaBagLayoutPaginacionRubrosVariables);						
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = 0;
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRubrosVariables.add(this.jButtonAnterioresRubrosVariables, this.gridBagConstraintsRubrosVariables);
					
						
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubrosVariables.gridy = 0;
			
			this.jPanelPaginacionRubrosVariables.add(this.jButtonNuevoGuardarCambiosRubrosVariables, this.gridBagConstraintsRubrosVariables);
						
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubrosVariables.gridy = 0;
			this.jPanelPaginacionRubrosVariables.add(this.jButtonSiguientesRubrosVariables, this.gridBagConstraintsRubrosVariables);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = 1;
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubrosVariables.add(this.jButtonNuevoRubrosVariables, this.gridBagConstraintsRubrosVariables);
						
			
			
			if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
				this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRubrosVariables.gridy = 1;
				this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRubrosVariables.add(this.jButtonGuardarCambiosTablaRubrosVariables, this.gridBagConstraintsRubrosVariables);
			}
			
			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = 1;
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubrosVariables.add(this.jButtonDuplicarRubrosVariables, this.gridBagConstraintsRubrosVariables);
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = 1;
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubrosVariables.add(this.jButtonCopiarRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = 1;
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubrosVariables.add(this.jButtonVerFormRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = 1;
			this.gridBagConstraintsRubrosVariables.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRubrosVariables.add(this.jButtonCerrarRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		
		this.jButtonRecargarInformacionRubrosVariables.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubrosVariables.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubrosVariables.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRubrosVariables.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubrosVariables.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubrosVariables.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRubrosVariables.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubrosVariables.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubrosVariables.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRubrosVariables.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubrosVariables.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubrosVariables.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRubrosVariables.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubrosVariables.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubrosVariables.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRubrosVariables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubrosVariables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubrosVariables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRubrosVariables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubrosVariables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubrosVariables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRubrosVariables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubrosVariables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubrosVariables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRubrosVariables.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubrosVariables.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubrosVariables.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRubrosVariables.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubrosVariables.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubrosVariables.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRubrosVariables.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubrosVariables.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubrosVariables.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRubrosVariables.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubrosVariables.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubrosVariables.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRubrosVariables = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRubrosVariables = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RubrosVariables = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RubrosVariables = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RubrosVariables = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RubrosVariables = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRubrosVariables.setLayout(gridaBagParametrosReportesRubrosVariables);
			this.jPanelParametrosReportesAccionesRubrosVariables.setLayout(gridaBagParametrosReportesAccionesRubrosVariables);
			
			
			this.jPanelParametrosAuxiliar1RubrosVariables.setLayout(gridaBagParametrosAuxiliar1RubrosVariables);
			this.jPanelParametrosAuxiliar2RubrosVariables.setLayout(gridaBagParametrosAuxiliar2RubrosVariables);
			this.jPanelParametrosAuxiliar3RubrosVariables.setLayout(gridaBagParametrosAuxiliar3RubrosVariables);
			this.jPanelParametrosAuxiliar4RubrosVariables.setLayout(gridaBagParametrosAuxiliar4RubrosVariables);
			//this.jPanelParametrosAuxiliar5RubrosVariables.setLayout(gridaBagParametrosAuxiliar2RubrosVariables);			
			
			
			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubrosVariables.add(this.jButtonRecargarInformacionRubrosVariables, this.gridBagConstraintsRubrosVariables);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubrosVariables.add(this.jComboBoxTiposPaginacionRubrosVariables, this.gridBagConstraintsRubrosVariables);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubrosVariables.add(this.jCheckBoxConAltoMaximoTablaRubrosVariables, this.gridBagConstraintsRubrosVariables);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubrosVariables.add(this.jComboBoxTiposArchivosReportesRubrosVariables, this.gridBagConstraintsRubrosVariables);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubrosVariables.add(this.jPanelParametrosAuxiliar1RubrosVariables, this.gridBagConstraintsRubrosVariables);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RubrosVariables.add(this.jComboBoxTiposReportesRubrosVariables, this.gridBagConstraintsRubrosVariables);																		
			
			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RubrosVariables.add(this.jComboBoxTiposGraficosReportesRubrosVariables, this.gridBagConstraintsRubrosVariables);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubrosVariables.add(this.jPanelParametrosAuxiliar4RubrosVariables, this.gridBagConstraintsRubrosVariables);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubrosVariables.add(this.jComboBoxTiposReportesRubrosVariables, this.gridBagConstraintsRubrosVariables);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubrosVariables.add(this.jCheckBoxGenerarReporteRubrosVariables, this.gridBagConstraintsRubrosVariables);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubrosVariables.add(this.jPanelParametrosAuxiliar2RubrosVariables, this.gridBagConstraintsRubrosVariables);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubrosVariables.add(this.jLabelAccionesRubrosVariables, this.gridBagConstraintsRubrosVariables);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
				this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRubrosVariables.add(this.jButtonAbrirOrderByRubrosVariables, this.gridBagConstraintsRubrosVariables);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubrosVariables.add(this.jComboBoxTiposSeleccionarRubrosVariables, this.gridBagConstraintsRubrosVariables);			
			
			
			/*
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubrosVariables.add(this.jCheckBoxSeleccionarTodosRubrosVariables, this.gridBagConstraintsRubrosVariables);
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubrosVariables.add(this.jCheckBoxConGraficoReporteRubrosVariables, this.gridBagConstraintsRubrosVariables);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubrosVariables.add(this.jCheckBoxSeleccionarTodosRubrosVariables, this.gridBagConstraintsRubrosVariables);															
				
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubrosVariables.add(this.jCheckBoxSeleccionadosRubrosVariables, this.gridBagConstraintsRubrosVariables);															
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubrosVariables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubrosVariables.add(this.jCheckBoxConGraficoReporteRubrosVariables, this.gridBagConstraintsRubrosVariables);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubrosVariables.add(this.jPanelParametrosAuxiliar3RubrosVariables, this.gridBagConstraintsRubrosVariables);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubrosVariables.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubrosVariables.add(this.jComboBoxTiposAccionesRubrosVariables, this.gridBagConstraintsRubrosVariables);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRubrosVariables = new GridBagLayout();

			this.jScrollPanelDatosRubrosVariables.setLayout(gridaBagLayoutDatosRubrosVariables);
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = 0;
			this.gridBagConstraintsRubrosVariables.gridx = 0;
			
			this.jScrollPanelDatosRubrosVariables.add(this.jTableDatosRubrosVariables, this.gridBagConstraintsRubrosVariables);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRubrosVariables.setViewportView(this.jTableDatosRubrosVariables);
		this.jTableDatosRubrosVariables.setFillsViewportHeight(true);
		this.jTableDatosRubrosVariables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRubrosVariables= new GridBagLayout();
		this.jPanelAccionesRubrosVariables.setLayout(gridaBagLayoutAccionesRubrosVariables);
		
		
		/*	
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = 0;
		this.gridBagConstraintsRubrosVariables.gridx = 0;
			
		this.jPanelAccionesRubrosVariables.add(this.jButtonNuevoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaRubrosVariablesRubrosVariables= new GridBagLayout();
		gridaBagLayoutBusquedaRubrosVariablesRubrosVariables.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaRubrosVariablesRubrosVariables.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaRubrosVariablesRubrosVariables.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaRubrosVariablesRubrosVariables.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaRubrosVariablesRubrosVariables.setLayout(gridaBagLayoutBusquedaRubrosVariablesRubrosVariables);

		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 0;
		gridBagConstraintsRubrosVariables.gridx = 0;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jLabelid_tipo_contratoBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);

		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 0;
		gridBagConstraintsRubrosVariables.gridx = 1;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);


		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 1;
		gridBagConstraintsRubrosVariables.gridx = 0;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jLabelid_rubro_empleaBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);

		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 1;
		gridBagConstraintsRubrosVariables.gridx = 1;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);


		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 2;
		gridBagConstraintsRubrosVariables.gridx = 0;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jLabelfecha_desdeBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);

		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 2;
		gridBagConstraintsRubrosVariables.gridx = 1;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);


		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 3;
		gridBagConstraintsRubrosVariables.gridx = 0;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jLabelfecha_hastaBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);

		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 3;
		gridBagConstraintsRubrosVariables.gridx = 1;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);

		gridBagConstraintsRubrosVariables = new GridBagConstraints();
		gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubrosVariables.gridy = 4;
		gridBagConstraintsRubrosVariables.gridx =1;
		jPanelBusquedaRubrosVariablesRubrosVariables.add(jButtonBusquedaRubrosVariablesRubrosVariables, gridBagConstraintsRubrosVariables);

		jTabbedPaneBusquedasRubrosVariables.addTab("1.-Por Tipo Contrato Por Rubro Emplea Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaRubrosVariablesRubrosVariables);
		jTabbedPaneBusquedasRubrosVariables.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubrosVariables = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubrosVariables);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();						
			this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubrosVariables.gridx = 0;		
			//this.gridBagConstraintsRubrosVariables.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubrosVariables.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRubrosVariables, this.gridBagConstraintsRubrosVariables);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRubrosVariables.gridx = 0;		
		//this.gridBagConstraintsRubrosVariables.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRubrosVariables.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRubrosVariables);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubrosVariables.gridx = 0;		
			this.gridBagConstraintsRubrosVariables.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRubrosVariables.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRubrosVariables, this.gridBagConstraintsRubrosVariables);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRubrosVariables, this.gridBagConstraintsRubrosVariables);								
		
		
		/*
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRubrosVariables, this.gridBagConstraintsRubrosVariables);
		*/		
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubrosVariables.gridx =0;
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubrosVariables.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubrosVariables, this.gridBagConstraintsRubrosVariables);
				
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRubrosVariables, this.gridBagConstraintsRubrosVariables);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRubrosVariables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubrosVariables = new GridBagLayout();
			this.jPanelBusquedasParametrosRubrosVariables.setLayout(gridaBagLayoutBusquedasParametrosRubrosVariables);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRubrosVariables=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubrosVariables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubrosVariables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubrosVariables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubrosVariables, this.gridBagConstraintsRubrosVariables);
			
			
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
			
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubrosVariables.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubrosVariables, this.gridBagConstraintsRubrosVariables);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRubrosVariables;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRubrosVariables() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRubrosVariables = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRubrosVariables.setName("jPanelReporteDinamicoRubrosVariables"); 
		
		this.jPanelReporteDinamicoRubrosVariables.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubrosVariables.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubrosVariables.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRubrosVariables.setLayout(gridaBagLayoutReporteDinamicoRubrosVariables);
		
		
		this.jInternalFrameReporteDinamicoRubrosVariables= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRubrosVariables = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubrosVariables= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRubrosVariables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRubrosVariables.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRubrosVariables.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRubrosVariables.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRubrosVariables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRubrosVariables.setResizable(true);
	    this.jInternalFrameReporteDinamicoRubrosVariables.setClosable(true);
	    this.jInternalFrameReporteDinamicoRubrosVariables.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRubrosVariables.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubrosVariables.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubrosVariables.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubros Variableses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRubrosVariables = new JLabelMe();

		this.jLabelColumnasSelectReporteRubrosVariables.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelColumnasSelectReporteRubrosVariables, this.gridBagConstraintsRubrosVariables);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRubrosVariables = new JList<Reporte>();
		this.jListColumnasSelectReporteRubrosVariables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRubrosVariables.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRubrosVariables.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubrosVariables.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubrosVariables.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRubrosVariables=new JScrollPane(this.jListColumnasSelectReporteRubrosVariables);
			
			this.jScrollColumnasSelectReporteRubrosVariables.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubrosVariables.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubrosVariables.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRubrosVariables.add(this.jListColumnasSelectReporteRubrosVariables, this.gridBagConstraintsRubrosVariables);
		this.jPanelReporteDinamicoRubrosVariables.add(this.jScrollColumnasSelectReporteRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRubrosVariables = new JLabelMe();

		this.jLabelRelacionesSelectReporteRubrosVariables.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRubrosVariables = new JList<Reporte>();
		this.jListRelacionesSelectReporteRubrosVariables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRubrosVariables.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRubrosVariables.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubrosVariables.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubrosVariables.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRubrosVariables=new JScrollPane(this.jListRelacionesSelectReporteRubrosVariables);
			
			this.jScrollRelacionesSelectReporteRubrosVariables.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubrosVariables.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubrosVariables.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRubrosVariables = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRubrosVariables = new JComboBoxMe();
		this.jListColumnasValoresGraficoRubrosVariables = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRubrosVariables = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRubrosVariables.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRubrosVariables.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubrosVariables.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubrosVariables.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRubrosVariables = new JLabelMe();

		this.jLabelConGraficoDinamicoRubrosVariables.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelConGraficoDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRubrosVariables = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRubrosVariables.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRubrosVariables.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRubrosVariables.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRubrosVariables.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRubrosVariables.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubrosVariables.add(this.jCheckBoxConGraficoDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRubrosVariables = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRubrosVariables.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelColumnaCategoriaGraficoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRubrosVariables = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRubrosVariables.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRubrosVariables.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRubrosVariables.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRubrosVariables.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRubrosVariables.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRubrosVariables.add(this.jComboBoxColumnaCategoriaGraficoRubrosVariables, this.gridBagConstraintsRubrosVariables);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRubrosVariables = new JLabelMe();

		this.jLabelColumnaCategoriaValorRubrosVariables.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelColumnaCategoriaValorRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRubrosVariables = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRubrosVariables.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRubrosVariables.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRubrosVariables.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRubrosVariables.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRubrosVariables.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRubrosVariables.add(this.jComboBoxColumnaCategoriaValorRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRubrosVariables = new JLabelMe();

		this.jLabelColumnasValoresGraficoRubrosVariables.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelColumnasValoresGraficoRubrosVariables, this.gridBagConstraintsRubrosVariables);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRubrosVariables = new JList<Reporte>();
		this.jListColumnasValoresGraficoRubrosVariables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRubrosVariables.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRubrosVariables.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRubrosVariables.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRubrosVariables.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRubrosVariables=new JScrollPane(this.jListColumnasValoresGraficoRubrosVariables);
			
			this.jScrollColumnasValoresGraficoRubrosVariables.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRubrosVariables.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRubrosVariables.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRubrosVariables.add(this.jListColumnasSelectReporteRubrosVariables, this.gridBagConstraintsRubrosVariables);
		this.jPanelReporteDinamicoRubrosVariables.add(this.jScrollColumnasValoresGraficoRubrosVariables, this.gridBagConstraintsRubrosVariables);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRubrosVariables = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRubrosVariables.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelTiposGraficosReportesDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRubrosVariables = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRubrosVariables.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRubrosVariables.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRubrosVariables.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRubrosVariables.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRubrosVariables.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubrosVariables.add(this.jComboBoxTiposGraficosReportesDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRubrosVariables = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRubrosVariables.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelGenerarExcelReporteDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRubrosVariables = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRubrosVariables.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRubrosVariables,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRubrosVariables.setToolTipText("Generar EXCEL"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		//this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRubrosVariables.add(this.jButtonGenerarExcelReporteDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubrosVariables.add(this.jComboBoxTiposReportesDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRubrosVariables = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRubrosVariables.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubrosVariables.add(this.jLabelTiposArchivoReporteDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubrosVariables.add(this.jComboBoxTiposArchivosReportesDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRubrosVariables = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRubrosVariables.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRubrosVariables,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRubrosVariables.setToolTipText("Generar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubrosVariables.add(this.jButtonGenerarReporteDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRubrosVariables = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRubrosVariables.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRubrosVariables,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRubrosVariables.setToolTipText("Cancelar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubrosVariables.add(this.jButtonCerrarReporteDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRubrosVariables = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRubrosVariables= new JScrollPane(jPanelReporteDinamicoRubrosVariables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRubrosVariables.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubrosVariables.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubrosVariables.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubros Variableses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRubrosVariables.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRubrosVariables.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRubrosVariables.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRubrosVariables);
		this.jInternalFrameReporteDinamicoRubrosVariables.getContentPane().add(this.jScrollPanelReporteDinamicoRubrosVariables, this.gridBagConstraintsRubrosVariables);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRubrosVariables() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRubrosVariables = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRubrosVariables.setName("jPanelImportacionRubrosVariables"); 
		
		this.jPanelImportacionRubrosVariables.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubrosVariables.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubrosVariables.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRubrosVariables.setLayout(gridaBagLayoutImportacionRubrosVariables);
		
		
		this.jInternalFrameImportacionRubrosVariables= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRubrosVariables= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRubrosVariables = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubrosVariables= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRubrosVariables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubrosVariables.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubrosVariables.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRubrosVariables.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubrosVariables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubrosVariables.setResizable(true);
	    this.jInternalFrameImportacionRubrosVariables.setClosable(true);
	    this.jInternalFrameImportacionRubrosVariables.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRubrosVariables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubrosVariables.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubrosVariables.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRubrosVariables.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubrosVariables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubrosVariables.setResizable(true);
	    this.jInternalFrameImportacionRubrosVariables.setClosable(true);
	    this.jInternalFrameImportacionRubrosVariables.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRubrosVariables.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubrosVariables.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubrosVariables.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubros Variableses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRubrosVariables = new JLabelMe();

		this.jLabelArchivoImportacionRubrosVariables.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubrosVariables.add(this.jLabelArchivoImportacionRubrosVariables, this.gridBagConstraintsRubrosVariables);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRubrosVariables = new JFileChooser();		
		this.jFileChooserImportacionRubrosVariables.setToolTipText("ESCOGER ARCHIVO"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRubrosVariables = new JButtonMe();
		this.jButtonAbrirImportacionRubrosVariables.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRubrosVariables,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRubrosVariables.setToolTipText("Generar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYImportacion;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubrosVariables.add(this.jButtonAbrirImportacionRubrosVariables, this.gridBagConstraintsRubrosVariables);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRubrosVariables = new JLabelMe();

		this.jLabelPathArchivoImportacionRubrosVariables.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRubrosVariables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubrosVariables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubrosVariables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubrosVariables.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubrosVariables.add(this.jLabelPathArchivoImportacionRubrosVariables, this.gridBagConstraintsRubrosVariables);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRubrosVariables=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRubrosVariables.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubrosVariables.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubrosVariables.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYImportacion;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubrosVariables.add(this.jTextFieldPathArchivoImportacionRubrosVariables, this.gridBagConstraintsRubrosVariables);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRubrosVariables = new JButtonMe();
		this.jButtonGenerarImportacionRubrosVariables.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRubrosVariables,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRubrosVariables.setToolTipText("Generar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYImportacion;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubrosVariables.add(this.jButtonGenerarImportacionRubrosVariables, this.gridBagConstraintsRubrosVariables);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRubrosVariables = new JButtonMe();
		this.jButtonCerrarImportacionRubrosVariables.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRubrosVariables,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRubrosVariables.setToolTipText("Cancelar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubrosVariables.gridy = iPosYImportacion;
		this.gridBagConstraintsRubrosVariables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubrosVariables.add(this.jButtonCerrarImportacionRubrosVariables, this.gridBagConstraintsRubrosVariables);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRubrosVariables = new GridBagLayout();
		
		this.jScrollPanelImportacionRubrosVariables= new JScrollPane(jPanelImportacionRubrosVariables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
		this.gridBagConstraintsRubrosVariables.gridy =iPosYImportacion;
		this.gridBagConstraintsRubrosVariables.gridx =iPosXImportacion;
		this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRubrosVariables.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRubrosVariables.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRubrosVariables);
		this.jInternalFrameImportacionRubrosVariables.getContentPane().add(this.jScrollPanelImportacionRubrosVariables, this.gridBagConstraintsRubrosVariables);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRubrosVariables(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRubrosVariables = new JButtonMe();
			this.jButtonAbrirOrderByRubrosVariables.setText("Orden");
			this.jButtonAbrirOrderByRubrosVariables.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubrosVariables,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRubrosVariables";
			inputMap = this.jButtonAbrirOrderByRubrosVariables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRubrosVariables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRubrosVariables"));
		
		
			GridBagLayout gridaBagLayoutOrderByRubrosVariables = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRubrosVariables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRubrosVariables.setName("jPanelOrderByRubrosVariables"); 
			
			this.jPanelOrderByRubrosVariables.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubrosVariables.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubrosVariables.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRubrosVariables.setLayout(gridaBagLayoutOrderByRubrosVariables);
			
			
			this.jTableDatosRubrosVariablesOrderBy = new JTableMe();        
			this.jTableDatosRubrosVariablesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRubrosVariablesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRubrosVariablesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRubrosVariablesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRubrosVariablesOrderBy.setViewportView(this.jTableDatosRubrosVariablesOrderBy);
			this.jTableDatosRubrosVariablesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRubrosVariablesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRubrosVariables= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRubrosVariables= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRubrosVariables = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRubrosVariables= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRubrosVariables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRubrosVariables.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRubrosVariables.setTitle("Orden");
			this.jInternalFrameOrderByRubrosVariables.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRubrosVariables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRubrosVariables.setResizable(true);
			this.jInternalFrameOrderByRubrosVariables.setClosable(true);
			this.jInternalFrameOrderByRubrosVariables.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRubrosVariables.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubrosVariables.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubrosVariables.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRubrosVariables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubros Variableses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRubrosVariables.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRubrosVariables.ipady =150;
				
			this.jPanelOrderByRubrosVariables.add(jScrollPanelDatosRubrosVariablesOrderBy, this.gridBagConstraintsRubrosVariables);//this.jTableDatosRubrosVariablesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRubrosVariables = new JButtonMe();
			this.jButtonCerrarOrderByRubrosVariables.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRubrosVariables,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRubrosVariables.setToolTipText("Cancelar"+" "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRubrosVariables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubrosVariables.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRubrosVariables.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRubrosVariables.add(this.jButtonCerrarOrderByRubrosVariables, this.gridBagConstraintsRubrosVariables);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRubrosVariables = new GridBagLayout();
			
			this.jScrollPanelOrderByRubrosVariables= new JScrollPane(jPanelOrderByRubrosVariables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRubrosVariables = new GridBagConstraints();
			this.gridBagConstraintsRubrosVariables.gridy =iPosYOrderBy;
			this.gridBagConstraintsRubrosVariables.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubrosVariables.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRubrosVariables.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRubrosVariables.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRubrosVariables);
			
			this.jInternalFrameOrderByRubrosVariables.getContentPane().add(this.jScrollPanelOrderByRubrosVariables, this.gridBagConstraintsRubrosVariables);			
		
		} else {
			this.jButtonAbrirOrderByRubrosVariables = new JButtonMe();
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
		//	&& this.rubrosvariablesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRubrosVariables.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRubrosVariables.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRubrosVariables.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosRubrosVariables.getRowHeight();//RubrosVariablesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubrosVariables.isSelected()) {
					iHeightTable=RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubrosVariables.isSelected()) {
					iHeightTable=RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubrosVariablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRubrosVariables.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubrosVariables.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubrosVariables.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRubrosVariables.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubrosVariables.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubrosVariables.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRubrosVariables!=null && this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy()!=null) {
			//if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRubrosVariables.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRubrosVariables.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRubrosVariables.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRubrosVariables.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubrosVariables.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubrosVariables.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=rubrosvariablesLogic.getRubrosVariabless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubrosvariabless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RubrosVariables> TraerRubrosVariablesBeans(List<RubrosVariables> rubrosvariabless,ArrayList<Classe> classes)throws Exception {
		try {
			for(RubrosVariables rubrosvariables:rubrosvariabless) {
					
				if(!(RubrosVariablesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RubrosVariablesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rubrosvariables.setsDetalleGeneralEntityReporte(RubrosVariablesConstantesFunciones.getRubrosVariablesDescripcion(rubrosvariables));
										
						
					
						
					
				} else  {
							
					//rubrosvariables.setsDetalleGeneralEntityReporte(rubrosvariables.getsDetalleGeneralEntityReporte());
										
				}
				
				//rubrosvariablesbeans.add(rubrosvariablesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rubrosvariabless;
    }
	//PARA REPORTES FIN
}
