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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.nomina.util.report.ProcesoCierreMesConstantesFunciones;

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
public class ProcesoCierreMesJInternalFrame extends ProcesoCierreMesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCierreMes;
	
	protected JMenuBar jmenuBarProcesoCierreMes;
	
	protected JMenu jmenuProcesoCierreMes;
	protected JMenu jmenuDatosProcesoCierreMes;
	protected JMenu jmenuArchivoProcesoCierreMes;
	protected JMenu jmenuAccionesProcesoCierreMes;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreMes;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreMes;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCierreMesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCierreMes;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCierreMes;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCierreMes;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public ProcesoCierreMesSessionBean procesocierremesSessionBean;
		
	
	
	public MesSessionBean mesSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCierreMes> procesocierremess;		
	public List<ProcesoCierreMes> procesocierremessEliminados;	
	public List<ProcesoCierreMes> procesocierremessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCierreMes;		
	protected JButton jButtonAbrirOrderByProcesoCierreMes;
	
	
	//protected JPanel jPanelOrderByProcesoCierreMes;
	//public JScrollPane jScrollPanelOrderByProcesoCierreMes;	
	//protected JButton jButtonCerrarOrderByProcesoCierreMes;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCierreMesLogic procesocierremesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCierreMes;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreMes;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreMes;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCierreMesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCierreMes;
	//public JScrollPane jScrollPanelImportacionProcesoCierreMes;
	
	
	
	protected JPanel jPanelAccionesProcesoCierreMes;
	
    protected JPanel jPanelPaginacionProcesoCierreMes;
    protected JPanel jPanelParametrosReportesProcesoCierreMes;
	protected JPanel jPanelParametrosReportesAccionesProcesoCierreMes;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCierreMes;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCierreMes;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCierreMes;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCierreMes;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCierreMes;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCierreMes;
	//protected JPanel jPanelImportacionProcesoCierreMes;
	
	
	public JTable jTableDatosProcesoCierreMes;
	
	
	
	//public JTable jTableDatosProcesoCierreMesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCierreMes;
	protected JButton jButtonDuplicarProcesoCierreMes;
	protected JButton jButtonCopiarProcesoCierreMes;
	protected JButton jButtonVerFormProcesoCierreMes;
	protected JButton jButtonNuevoRelacionesProcesoCierreMes;
	protected JButton jButtonModificarProcesoCierreMes;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCierreMes;
	protected JButton jButtonCerrarProcesoCierreMes;
	
	
	protected JButton jButtonRecargarInformacionProcesoCierreMes;
	protected JButton jButtonProcesarInformacionProcesoCierreMes;
	
	
	protected JButton jButtonAnterioresProcesoCierreMes;
	protected JButton jButtonSiguientesProcesoCierreMes;
	protected JButton jButtonNuevoGuardarCambiosProcesoCierreMes;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCierreMes;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCierreMes;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCierreMes;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCierreMes;
	//protected JButton jButtonGenerarImportacionProcesoCierreMes;
	//protected JButton jButtonCerrarImportacionProcesoCierreMes;
	//protected JFileChooser jFileChooserImportacionProcesoCierreMes;
	//protected File fileImportacionProcesoCierreMes;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreMes;
	protected JButton jButtonDuplicarToolBarProcesoCierreMes;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCierreMes;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCierreMes;
	protected JButton jButtonCopiarToolBarProcesoCierreMes;
	protected JButton jButtonVerFormToolBarProcesoCierreMes;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCierreMes;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreMes;
	protected JButton jButtonCerrarToolBarProcesoCierreMes;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCierreMes;
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreMes;
	protected JButton jButtonAnterioresToolBarProcesoCierreMes;
	protected JButton jButtonSiguientesToolBarProcesoCierreMes;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCierreMes;
	protected JButton jButtonAbrirOrderByToolBarProcesoCierreMes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreMes;
	protected JMenuItem jMenuItemDuplicarProcesoCierreMes;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCierreMes;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCierreMes;
	protected JMenuItem jMenuItemCopiarProcesoCierreMes;
	protected JMenuItem jMenuItemVerFormProcesoCierreMes;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreMes;
	protected JMenuItem jMenuItemCerrarProcesoCierreMes;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreMes;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCierreMes;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreMes;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCierreMes;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreMes;
	protected JMenuItem jMenuItemAnterioresProcesoCierreMes;
	protected JMenuItem jMenuItemSiguientesProcesoCierreMes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreMes;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCierreMes;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreMes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreMes;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCierreMes;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCierreMes;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCierreMes;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCierreMes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCierreMes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCierreMes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCierreMes;
	protected JTextField jTextFieldValorCampoGeneralProcesoCierreMes;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCierreMes;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCierreMes;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCierreMes;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCierreMes;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCierreMes;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCierreMes;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCierreMes;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreMes;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCierreMes;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCierreMes;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCierreMes;	
	//public JLabel jLabelPathArchivoImportacionProcesoCierreMes;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCierreMes;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCierreMes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCierreMes;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCierreMes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCierreMes;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCierreMes;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCierreMes;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCierreMes;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCierreMes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCierreMes;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCierreMes;
	public JPanel jPanelBusquedaProcesoCierreMesProcesoCierreMes;
	public JButton jButtonBusquedaProcesoCierreMesProcesoCierreMes;
	
	public JPanel jPanelid_mesBusquedaProcesoCierreMesProcesoCierreMes;
	public JLabel jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes;
	public JButton jButtonid_mesBusquedaProcesoCierreMesProcesoCierreMes= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoCierreMesProcesoCierreMesUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoCierreMesProcesoCierreMesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes;
	public JLabel jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes;
	public JButton jButtonid_estructuraBusquedaProcesoCierreMesProcesoCierreMes= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaProcesoCierreMesProcesoCierreMesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaProcesoCierreMesProcesoCierreMesBusqueda= new JButtonMe();

	
	public JPanel jPaneles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes;
	public JLabel jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes;
	public JCheckBox jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes;
	public JButton jButtones_para_reversionBusquedaProcesoCierreMesProcesoCierreMesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoCierreMesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreMesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreMesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreMesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCierreMes)	{
		this.jButtonRecargarInformacionProcesoCierreMes = jButtonRecargarInformacionProcesoCierreMes;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCierreMes() {
		return this.jButtonProcesarInformacionProcesoCierreMes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreMes)	{
		this.jButtonProcesarInformacionProcesoCierreMes = jButtonProcesarInformacionProcesoCierreMes;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCierreMes() {
		return this.jButtonRecargarInformacionProcesoCierreMes;
	}
	
	
	public List<ProcesoCierreMes> getprocesocierremess() {
		return this.procesocierremess;
	}

	public void setprocesocierremess(List<ProcesoCierreMes> procesocierremess) {
		this.procesocierremess = procesocierremess;
	}
	
	public List<ProcesoCierreMes> getprocesocierremessAux() {
		return this.procesocierremessAux;
	}

	public void setprocesocierremessAux(List<ProcesoCierreMes> procesocierremessAux) {
		this.procesocierremessAux = procesocierremessAux;
	}
	
	public List<ProcesoCierreMes> getprocesocierremessEliminados() {
		return this.procesocierremessEliminados;
	}

	public void setProcesoCierreMessEliminados(List<ProcesoCierreMes> procesocierremessEliminados) {
		this.procesocierremessEliminados = procesocierremessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCierreMes() {
		return jComboBoxTiposSeleccionarProcesoCierreMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCierreMes(
			JComboBox jComboBoxTiposSeleccionarProcesoCierreMes) {
		this.jComboBoxTiposSeleccionarProcesoCierreMes = jComboBoxTiposSeleccionarProcesoCierreMes;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCierreMes() {
		return jTextFieldValorCampoGeneralProcesoCierreMes;
	}

	public void setjTextFieldValorCampoGeneralProcesoCierreMes(
			JTextField jTextFieldValorCampoGeneralProcesoCierreMes) {
		this.jTextFieldValorCampoGeneralProcesoCierreMes = jTextFieldValorCampoGeneralProcesoCierreMes;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCierreMes .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCierreMes() {
		return this.jCheckBoxSeleccionarTodosProcesoCierreMes;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCierreMes(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCierreMes) {
		this.jCheckBoxSeleccionarTodosProcesoCierreMes = jCheckBoxSeleccionarTodosProcesoCierreMes;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCierreMes() {
		return this.jCheckBoxSeleccionadosProcesoCierreMes;
	}

	public void setjCheckBoxSeleccionadosProcesoCierreMes(
			JCheckBox jCheckBoxSeleccionadosProcesoCierreMes) {
		this.jCheckBoxSeleccionadosProcesoCierreMes = jCheckBoxSeleccionadosProcesoCierreMes;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCierreMes() {
		return this.jComboBoxTiposArchivosReportesProcesoCierreMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCierreMes(
			JComboBox jComboBoxTiposArchivosReportesProcesoCierreMes) {
		this.jComboBoxTiposArchivosReportesProcesoCierreMes = jComboBoxTiposArchivosReportesProcesoCierreMes;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCierreMes() {
		return this.jComboBoxTiposReportesProcesoCierreMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCierreMes(
			JComboBox jComboBoxTiposReportesProcesoCierreMes) {
		this.jComboBoxTiposReportesProcesoCierreMes = jComboBoxTiposReportesProcesoCierreMes;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCierreMes() {
	//	return jComboBoxTiposReportesDinamicoProcesoCierreMes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCierreMes(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCierreMes) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCierreMes = jComboBoxTiposReportesDinamicoProcesoCierreMes;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCierreMes() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCierreMes(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes = jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCierreMes() {
		return this.jComboBoxTiposGraficosReportesProcesoCierreMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCierreMes(
			JComboBox jComboBoxTiposGraficosReportesProcesoCierreMes) {
		this.jComboBoxTiposGraficosReportesProcesoCierreMes = jComboBoxTiposGraficosReportesProcesoCierreMes;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCierreMes() {
		return this.jComboBoxTiposPaginacionProcesoCierreMes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCierreMes(
			JComboBox jComboBoxTiposPaginacionProcesoCierreMes) {
		this.jComboBoxTiposPaginacionProcesoCierreMes = jComboBoxTiposPaginacionProcesoCierreMes;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCierreMes() {
		return this.jComboBoxTiposRelacionesProcesoCierreMes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreMes() {
		return this.jComboBoxTiposAccionesProcesoCierreMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreMes(
			JComboBox jComboBoxTiposRelacionesProcesoCierreMes) {
		this.jComboBoxTiposRelacionesProcesoCierreMes = jComboBoxTiposRelacionesProcesoCierreMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreMes(
			JComboBox jComboBoxTiposAccionesProcesoCierreMes) {
		this.jComboBoxTiposAccionesProcesoCierreMes = jComboBoxTiposAccionesProcesoCierreMes;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCierreMes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCierreMes .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCierreMes() {
	//	return jCheckBoxConGraficoDinamicoProcesoCierreMes;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCierreMes(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCierreMes) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreMes = jCheckBoxConGraficoDinamicoProcesoCierreMes;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCierreMes() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCierreMes.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCierreMes .setBorder(borderResaltar);		
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
		this.procesocierremesSessionBean=new ProcesoCierreMesSessionBean();
		
		this.procesocierremesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierremesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierremesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCierreMesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCierreMesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreMesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreMesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreMesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Mes MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCierreMesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCierreMes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCierreMes= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"copiar","copiar","Copiar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"ver_form","ver_form","Ver"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"recargar","recargar","Procesar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCierreMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCierreMes,this.jTtoolBarProcesoCierreMes,
							"cerrar","cerrar","Salir"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCierreMes=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCierreMes;
			
				this.jButtonProcesarInformacionToolBarProcesoCierreMes=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCierreMes;
				
		//protected JButton jButtonModificarToolBarProcesoCierreMes;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCierreMes=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCierreMes=new JMenuMe("General");
		this.jmenuArchivoProcesoCierreMes=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCierreMes=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCierreMes=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreMes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreMes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreMes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCierreMes= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCierreMes.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCierreMes,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCierreMes= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCierreMes.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCierreMes,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCierreMes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreMes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreMes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCierreMes= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCierreMes.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCierreMes,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCierreMes= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCierreMes.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCierreMes,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreMes= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCierreMes.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCierreMes,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreMes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreMes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreMes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCierreMes= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCierreMes.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCierreMes,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCierreMes= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCierreMes.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCierreMes,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCierreMes= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCierreMes.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCierreMes,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCierreMes= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCierreMes.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCierreMes,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCierreMes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCierreMes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCierreMes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreMes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCierreMes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCierreMes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCierreMes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreMes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCierreMes= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCierreMes.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCierreMes,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCierreMes.add(this.jMenuItemCerrarProcesoCierreMes);
			
			this.jmenuAccionesProcesoCierreMes.add(this.jMenuItemNuevoProcesoCierreMes);
			this.jmenuAccionesProcesoCierreMes.add(this.jMenuItemNuevoGuardarCambiosProcesoCierreMes);
			this.jmenuAccionesProcesoCierreMes.add(this.jMenuItemNuevoRelacionesProcesoCierreMes);
			this.jmenuAccionesProcesoCierreMes.add(this.jMenuItemGuardarCambiosTablaProcesoCierreMes);		
			this.jmenuAccionesProcesoCierreMes.add(this.jMenuItemDuplicarProcesoCierreMes);		
			this.jmenuAccionesProcesoCierreMes.add(this.jMenuItemCopiarProcesoCierreMes);		
			this.jmenuAccionesProcesoCierreMes.add(this.jMenuItemVerFormProcesoCierreMes);		
			
			this.jmenuDatosProcesoCierreMes.add(this.jMenuItemRecargarInformacionProcesoCierreMes);				
			this.jmenuDatosProcesoCierreMes.add(this.jMenuItemAnterioresProcesoCierreMes);				
			this.jmenuDatosProcesoCierreMes.add(this.jMenuItemSiguientesProcesoCierreMes);				
			this.jmenuDatosProcesoCierreMes.add(this.jMenuItemAbrirOrderByProcesoCierreMes);				
			this.jmenuDatosProcesoCierreMes.add(this.jMenuItemMostrarOcultarProcesoCierreMes);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCierreMes.add(this.jMenuItemGuardarCambiosProcesoCierreMes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCierreMes.add(this.jmenuArchivoProcesoCierreMes);		
			this.jmenuBarProcesoCierreMes.add(this.jmenuAccionesProcesoCierreMes);		
			this.jmenuBarProcesoCierreMes.add(this.jmenuDatosProcesoCierreMes);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCierreMes);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCierreMes() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCierreMesProcesoCierreMes=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCierreMesProcesoCierreMes.setToolTipText("Procesar Proceso Cierre Mes");
		this.jButtonBusquedaProcesoCierreMesProcesoCierreMes= new JButtonMe();
		this.jButtonBusquedaProcesoCierreMesProcesoCierreMes.setText("Procesar");
		this.jButtonBusquedaProcesoCierreMesProcesoCierreMes.setToolTipText("Procesar Proceso Cierre Mes");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCierreMesProcesoCierreMes,"buscar_button","Procesar Proceso Cierre Mes");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCierreMesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes = new JLabelMe();
		jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes.setText("Mes :");
		jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes.setToolTipText("Mes");
		jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes= new JComboBoxMe();
		jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes = new JLabelMe();
		jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setText("Estructura :");
		jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes = new JLabelMe();
		jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setText("Es Para Reversion :");
		jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setToolTipText("Es Para Reversion");
		jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes= new JCheckBoxMe();
		jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCierreMes=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCierreMes.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoCierreMes.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasProcesoCierreMes.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Cierre Mes"));
		this.jTabbedPaneBusquedasProcesoCierreMes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCierreMes = new ProcesoCierreMesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Cierre Mes DATOS");
			this.jInternalFrameDetalleFormProcesoCierreMes = new ProcesoCierreMesDetalleFormJInternalFrame(jDesktopPane,this.procesocierremesSessionBean.getConGuardarRelaciones(),this.procesocierremesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCierreMes = null;//new ProcesoCierreMesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreMes= new GridBagLayout();
		
		
		this.jTableDatosProcesoCierreMes = new JTableMe();      
		
		String sToolTipProcesoCierreMes="";
		sToolTipProcesoCierreMes=ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreMes+="(Nomina.ProcesoCierreMes)";
		}
		
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreMes+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCierreMes.setToolTipText(sToolTipProcesoCierreMes);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCierreMes);
		this.jTableDatosProcesoCierreMes.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCierreMes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCierreMes.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCierreMes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCierreMes,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCierreMes = new JButtonMe();
		this.jButtonDuplicarProcesoCierreMes = new JButtonMe();
		this.jButtonCopiarProcesoCierreMes = new JButtonMe();
		this.jButtonVerFormProcesoCierreMes = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCierreMes = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes = new JButtonMe();
		this.jButtonCerrarProcesoCierreMes = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreMes = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCierreMes = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Mes";
		
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Meses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreMes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreMes.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreMes.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCierreMes=new ReporteDinamicoJInternalFrame(ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCierreMes();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCierreMes=new ImportacionJInternalFrame(ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCierreMes();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCierreMes = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCierreMes.setText("Orden");
		this.jButtonAbrirOrderByProcesoCierreMes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreMes,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreMes,false,this);
			
			//this.cargarOrderByProcesoCierreMes(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCierreMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreMes,true,this);
			
			//this.cargarOrderByProcesoCierreMes(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCierreMes.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosProcesoCierreMes.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosProcesoCierreMes.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosProcesoCierreMes.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreMes.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCierreMes.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCierreMes.setText("Nuevo");
		this.jButtonDuplicarProcesoCierreMes.setText("Duplicar");
		this.jButtonCopiarProcesoCierreMes.setText("Copiar");
		this.jButtonVerFormProcesoCierreMes.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCierreMes.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes.setText("Guardar");
		this.jButtonCerrarProcesoCierreMes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreMes,"nuevo_button","Nuevo",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCierreMes,"duplicar_button","Duplicar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCierreMes,"copiar_button","Copiar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCierreMes,"ver_form","Ver",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCierreMes,"nuevorelaciones_button","Nuevo Rel",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreMes,"guardarcambiostabla_button","Guardar",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreMes,"cerrar_button","Salir",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCierreMes.setToolTipText("Nuevo"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCierreMes.setToolTipText("Duplicar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCierreMes.setToolTipText("Copiar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCierreMes.setToolTipText("Ver"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCierreMes.setToolTipText("Nuevo Rel"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes.setToolTipText("Guardar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreMes.setToolTipText("Salir"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreMes";
		inputMap = this.jButtonNuevoProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreMes"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCierreMes";
		inputMap = this.jButtonDuplicarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCierreMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCierreMes"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCierreMes";
		inputMap = this.jButtonCopiarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCierreMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCierreMes"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCierreMes";
		inputMap = this.jButtonVerFormProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCierreMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCierreMes"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCierreMes";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCierreMes"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCierreMes";
		inputMap = this.jButtonModificarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCierreMes"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreMes";
		inputMap = this.jButtonCerrarProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreMes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreMes";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreMes"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCierreMes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCierreMes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCierreMes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCierreMes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCierreMes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCierreMes.setName("jPanelParametrosReportesProcesoCierreMes"); 
		
		this.jPanelParametrosReportesAccionesProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCierreMes.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCierreMes.setName("jPanelParametrosReportesAccionesProcesoCierreMes"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCierreMes = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCierreMes.setText("Procesar");
		this.jButtonRecargarInformacionProcesoCierreMes.setToolTipText("Procesar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCierreMes,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoCierreMes.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCierreMes = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCierreMes.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCierreMes.setToolTipText("Procesar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCierreMes.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCierreMes.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreMes.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCierreMes.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreMes.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCierreMes.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreMes.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCierreMes.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCierreMes.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCierreMes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCierreMes.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCierreMes.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCierreMes.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCierreMes.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreMes.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreMes.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCierreMes = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCierreMes.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCierreMes.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCierreMes=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCierreMes.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreMes.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCierreMes.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCierreMes = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreMes.setText("Acciones");		
		this.jLabelAccionesProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCierreMes = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCierreMes.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCierreMes.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCierreMes = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCierreMes.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCierreMes.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCierreMes = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCierreMes = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCierreMes.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCierreMes.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCierreMes = new JButtonMe();
		//this.jButtonAnterioresProcesoCierreMes.setText("<<");
        this.jButtonAnterioresProcesoCierreMes.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCierreMes,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCierreMes = new JButtonMe();
		//this.jButtonSiguientesProcesoCierreMes.setText(">>");
        this.jButtonSiguientesProcesoCierreMes.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCierreMes,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreMes = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCierreMes.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCierreMes.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCierreMes,"nuevoguardarcambios_button","Nue",this.procesocierremesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCierreMes";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCierreMes"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCierreMes";
		inputMap = this.jButtonRecargarInformacionProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCierreMes"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCierreMes";
		inputMap = this.jButtonSiguientesProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCierreMes"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCierreMes";
		inputMap = this.jButtonAnterioresProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCierreMes"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCierreMes();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCierreMes.setMinimumSize(new Dimension(this.getWidth(),ProcesoCierreMesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreMesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreMes.setMaximumSize(new Dimension(this.getWidth(),ProcesoCierreMesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreMesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCierreMes.setPreferredSize(new Dimension(this.getWidth(),ProcesoCierreMesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCierreMesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCierreMes = new GridBagLayout();

			this.jPanelPaginacionProcesoCierreMes.setLayout(gridaBagLayoutPaginacionProcesoCierreMes);						
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 0;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonAnterioresProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
					
						
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreMes.gridy = 0;
			
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonNuevoGuardarCambiosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
						
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCierreMes.gridy = 0;
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonSiguientesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 1;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonNuevoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
						
			
			
			if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCierreMes.gridy = 1;
				this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCierreMes.add(this.jButtonGuardarCambiosTablaProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			}
			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 1;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonProcesarInformacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 1;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonDuplicarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 1;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonCopiarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 1;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonVerFormProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 1;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCierreMes.add(this.jButtonCerrarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
		
		
		this.jButtonRecargarInformacionProcesoCierreMes.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreMes.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCierreMes.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCierreMes.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreMes.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCierreMes.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCierreMes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreMes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCierreMes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCierreMes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreMes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCierreMes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCierreMes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreMes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCierreMes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCierreMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCierreMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCierreMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCierreMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCierreMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCierreMes.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreMes.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCierreMes.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCierreMes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreMes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCierreMes.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCierreMes.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreMes.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCierreMes.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCierreMes = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCierreMes = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCierreMes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCierreMes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCierreMes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCierreMes = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCierreMes.setLayout(gridaBagParametrosReportesProcesoCierreMes);
			this.jPanelParametrosReportesAccionesProcesoCierreMes.setLayout(gridaBagParametrosReportesAccionesProcesoCierreMes);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCierreMes.setLayout(gridaBagParametrosAuxiliar1ProcesoCierreMes);
			this.jPanelParametrosAuxiliar2ProcesoCierreMes.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreMes);
			this.jPanelParametrosAuxiliar3ProcesoCierreMes.setLayout(gridaBagParametrosAuxiliar3ProcesoCierreMes);
			this.jPanelParametrosAuxiliar4ProcesoCierreMes.setLayout(gridaBagParametrosAuxiliar4ProcesoCierreMes);
			//this.jPanelParametrosAuxiliar5ProcesoCierreMes.setLayout(gridaBagParametrosAuxiliar2ProcesoCierreMes);			
			
			
			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jButtonRecargarInformacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreMes.add(this.jComboBoxTiposPaginacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreMes.add(this.jCheckBoxConAltoMaximoTablaProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCierreMes.add(this.jComboBoxTiposArchivosReportesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jPanelParametrosAuxiliar1ProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreMes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCierreMes.add(this.jComboBoxTiposReportesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jPanelParametrosAuxiliar4ProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jComboBoxTiposReportesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jCheckBoxGenerarReporteProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jPanelParametrosAuxiliar2ProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreMes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jLabelAccionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jComboBoxTiposSeleccionarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
			
			
			/*
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreMes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jCheckBoxSeleccionarTodosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreMes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreMes.add(this.jCheckBoxSeleccionarTodosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);															
				
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCierreMes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCierreMes.add(this.jCheckBoxSeleccionadosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jPanelParametrosAuxiliar3ProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCierreMes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCierreMes.add(this.jComboBoxTiposAccionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCierreMes = new GridBagLayout();

			this.jScrollPanelDatosProcesoCierreMes.setLayout(gridaBagLayoutDatosProcesoCierreMes);
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = 0;
			this.gridBagConstraintsProcesoCierreMes.gridx = 0;
			
			this.jScrollPanelDatosProcesoCierreMes.add(this.jTableDatosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCierreMes.setViewportView(this.jTableDatosProcesoCierreMes);
		this.jTableDatosProcesoCierreMes.setFillsViewportHeight(true);
		this.jTableDatosProcesoCierreMes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreMes= new GridBagLayout();
		this.jPanelAccionesProcesoCierreMes.setLayout(gridaBagLayoutAccionesProcesoCierreMes);
		
		
		/*	
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = 0;
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
			
		this.jPanelAccionesProcesoCierreMes.add(this.jButtonNuevoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCierreMesProcesoCierreMes= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCierreMesProcesoCierreMes.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreMesProcesoCierreMes.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCierreMesProcesoCierreMes.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCierreMesProcesoCierreMes.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.setLayout(gridaBagLayoutBusquedaProcesoCierreMesProcesoCierreMes);

		gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreMes.gridy = 0;
		gridBagConstraintsProcesoCierreMes.gridx = 0;
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.add(jLabelid_mesBusquedaProcesoCierreMesProcesoCierreMes, gridBagConstraintsProcesoCierreMes);

		gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreMes.gridy = 0;
		gridBagConstraintsProcesoCierreMes.gridx = 1;
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.add(jComboBoxid_mesBusquedaProcesoCierreMesProcesoCierreMes, gridBagConstraintsProcesoCierreMes);


		gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreMes.gridy = 1;
		gridBagConstraintsProcesoCierreMes.gridx = 0;
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.add(jLabelid_estructuraBusquedaProcesoCierreMesProcesoCierreMes, gridBagConstraintsProcesoCierreMes);

		gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreMes.gridy = 1;
		gridBagConstraintsProcesoCierreMes.gridx = 1;
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.add(jComboBoxid_estructuraBusquedaProcesoCierreMesProcesoCierreMes, gridBagConstraintsProcesoCierreMes);


		gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreMes.gridy = 2;
		gridBagConstraintsProcesoCierreMes.gridx = 0;
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.add(jLabeles_para_reversionBusquedaProcesoCierreMesProcesoCierreMes, gridBagConstraintsProcesoCierreMes);

		gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreMes.gridy = 2;
		gridBagConstraintsProcesoCierreMes.gridx = 1;
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.add(jCheckBoxes_para_reversionBusquedaProcesoCierreMesProcesoCierreMes, gridBagConstraintsProcesoCierreMes);

		gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCierreMes.gridy = 3;
		gridBagConstraintsProcesoCierreMes.gridx =1;
		jPanelBusquedaProcesoCierreMesProcesoCierreMes.add(jButtonBusquedaProcesoCierreMesProcesoCierreMes, gridBagConstraintsProcesoCierreMes);

		jTabbedPaneBusquedasProcesoCierreMes.addTab("1.-Por Mes Por Estructura Por Es Para Reversion ", jPanelBusquedaProcesoCierreMesProcesoCierreMes);
		jTabbedPaneBusquedasProcesoCierreMes.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreMes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreMes);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierremesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreMes.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreMes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreMes.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;		
		//this.gridBagConstraintsProcesoCierreMes.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCierreMes.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCierreMes);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreMes.gridx = 0;		
			this.gridBagConstraintsProcesoCierreMes.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCierreMes.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);								
		
		
		/*
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		*/		
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreMes.gridx =0;
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreMes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
				
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCierreMesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCierreMes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreMes = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCierreMes.setLayout(gridaBagLayoutBusquedasParametrosProcesoCierreMes);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCierreMes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
			
			
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
			
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreMes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoCierreMes.setVisible(false);
		this.jButtonAnterioresProcesoCierreMes.setVisible(false);
		this.jButtonSiguientesProcesoCierreMes.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoCierreMes.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoCierreMes.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoCierreMes.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoCierreMes.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoCierreMes.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoCierreMes.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoCierreMes.setVisible(false);
		this.jComboBoxTiposReportesProcesoCierreMes.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoCierreMes.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoCierreMes.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoCierreMes.setVisible(false);
		this.jComboBoxTiposAccionesProcesoCierreMes.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreMes.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoCierreMes.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoCierreMes.setVisible(false);
		
		this.jPanelParametrosReportesProcesoCierreMes.setVisible(false);
		
		
		this.jTtoolBarProcesoCierreMes.setVisible(false);
			
		this.jMenuItemAnterioresProcesoCierreMes.setVisible(false);
		this.jMenuItemSiguientesProcesoCierreMes.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoCierreMes.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoCierreMes.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoCierreMes.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreMes.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoCierreMes.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoCierreMes.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreMes.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoCierreMes.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreMes.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoCierreMes.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoCierreMes;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCierreMes() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCierreMes = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCierreMes.setName("jPanelReporteDinamicoProcesoCierreMes"); 
		
		this.jPanelReporteDinamicoProcesoCierreMes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreMes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCierreMes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCierreMes.setLayout(gridaBagLayoutReporteDinamicoProcesoCierreMes);
		
		
		this.jInternalFrameReporteDinamicoProcesoCierreMes= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCierreMes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreMes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCierreMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCierreMes.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCierreMes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCierreMes.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCierreMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCierreMes.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreMes.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCierreMes.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCierreMes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreMes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCierreMes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Meses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCierreMes = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCierreMes.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jLabelColumnasSelectReporteProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCierreMes = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCierreMes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCierreMes.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCierreMes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreMes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCierreMes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCierreMes=new JScrollPane(this.jListColumnasSelectReporteProcesoCierreMes);
			
			this.jScrollColumnasSelectReporteProcesoCierreMes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreMes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCierreMes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCierreMes.add(this.jListColumnasSelectReporteProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jScrollColumnasSelectReporteProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCierreMes = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCierreMes.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCierreMes = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCierreMes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCierreMes.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCierreMes.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreMes.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCierreMes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCierreMes=new JScrollPane(this.jListRelacionesSelectReporteProcesoCierreMes);
			
			this.jScrollRelacionesSelectReporteProcesoCierreMes.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreMes.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCierreMes.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCierreMes = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCierreMes = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCierreMes = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCierreMes = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCierreMes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCierreMes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreMes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCierreMes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreMes = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCierreMes.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jLabelGenerarExcelReporteDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreMes = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreMes.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCierreMes,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreMes.setToolTipText("Generar EXCEL"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCierreMes.add(this.jButtonGenerarExcelReporteDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jComboBoxTiposReportesDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreMes = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCierreMes.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jLabelTiposArchivoReporteDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCierreMes = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCierreMes.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCierreMes,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCierreMes.setToolTipText("Generar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jButtonGenerarReporteDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCierreMes = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCierreMes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCierreMes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCierreMes.setToolTipText("Cancelar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCierreMes.add(this.jButtonCerrarReporteDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCierreMes = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCierreMes= new JScrollPane(jPanelReporteDinamicoProcesoCierreMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCierreMes.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreMes.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCierreMes.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Meses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCierreMes.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCierreMes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCierreMes.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCierreMes);
		this.jInternalFrameReporteDinamicoProcesoCierreMes.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCierreMes() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCierreMes = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCierreMes.setName("jPanelImportacionProcesoCierreMes"); 
		
		this.jPanelImportacionProcesoCierreMes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreMes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCierreMes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCierreMes.setLayout(gridaBagLayoutImportacionProcesoCierreMes);
		
		
		this.jInternalFrameImportacionProcesoCierreMes= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCierreMes= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCierreMes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCierreMes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCierreMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreMes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreMes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCierreMes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreMes.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreMes.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreMes.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCierreMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCierreMes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCierreMes.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCierreMes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCierreMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCierreMes.setResizable(true);
	    this.jInternalFrameImportacionProcesoCierreMes.setClosable(true);
	    this.jInternalFrameImportacionProcesoCierreMes.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCierreMes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreMes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCierreMes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Meses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCierreMes = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCierreMes.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreMes.add(this.jLabelArchivoImportacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCierreMes = new JFileChooser();		
		this.jFileChooserImportacionProcesoCierreMes.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCierreMes = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCierreMes.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCierreMes,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCierreMes.setToolTipText("Generar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreMes.add(this.jButtonAbrirImportacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCierreMes = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCierreMes.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCierreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCierreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCierreMes.add(this.jLabelPathArchivoImportacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCierreMes=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCierreMes.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreMes.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCierreMes.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreMes.add(this.jTextFieldPathArchivoImportacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCierreMes = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCierreMes.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCierreMes,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCierreMes.setToolTipText("Generar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreMes.add(this.jButtonGenerarImportacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCierreMes = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCierreMes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCierreMes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCierreMes.setToolTipText("Cancelar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreMes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCierreMes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCierreMes.add(this.jButtonCerrarImportacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCierreMes = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCierreMes= new JScrollPane(jPanelImportacionProcesoCierreMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreMes.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCierreMes.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCierreMes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCierreMes.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCierreMes);
		this.jInternalFrameImportacionProcesoCierreMes.getContentPane().add(this.jScrollPanelImportacionProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCierreMes(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCierreMes = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCierreMes.setText("Orden");
			this.jButtonAbrirOrderByProcesoCierreMes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCierreMes,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCierreMes";
			inputMap = this.jButtonAbrirOrderByProcesoCierreMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCierreMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCierreMes"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCierreMes = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCierreMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCierreMes.setName("jPanelOrderByProcesoCierreMes"); 
			
			this.jPanelOrderByProcesoCierreMes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreMes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCierreMes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCierreMes.setLayout(gridaBagLayoutOrderByProcesoCierreMes);
			
			
			this.jTableDatosProcesoCierreMesOrderBy = new JTableMe();        
			this.jTableDatosProcesoCierreMesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCierreMesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCierreMesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCierreMesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCierreMesOrderBy.setViewportView(this.jTableDatosProcesoCierreMesOrderBy);
			this.jTableDatosProcesoCierreMesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCierreMesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCierreMes= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCierreMes= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCierreMes = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCierreMes= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCierreMes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCierreMes.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCierreMes.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCierreMes.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCierreMes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCierreMes.setResizable(true);
			this.jInternalFrameOrderByProcesoCierreMes.setClosable(true);
			this.jInternalFrameOrderByProcesoCierreMes.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCierreMes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreMes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCierreMes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCierreMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Meses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreMes.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCierreMes.ipady =150;
				
			this.jPanelOrderByProcesoCierreMes.add(jScrollPanelDatosProcesoCierreMesOrderBy, this.gridBagConstraintsProcesoCierreMes);//this.jTableDatosProcesoCierreMesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCierreMes = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCierreMes.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCierreMes,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCierreMes.setToolTipText("Cancelar"+" "+ProcesoCierreMesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCierreMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreMes.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCierreMes.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCierreMes.add(this.jButtonCerrarOrderByProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCierreMes = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCierreMes= new JScrollPane(jPanelOrderByProcesoCierreMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCierreMes = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreMes.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCierreMes.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCierreMes.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCierreMes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCierreMes.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCierreMes);
			
			this.jInternalFrameOrderByProcesoCierreMes.getContentPane().add(this.jScrollPanelOrderByProcesoCierreMes, this.gridBagConstraintsProcesoCierreMes);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCierreMes = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocierremesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCierreMes.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCierreMes.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCierreMes.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCierreMes.getRowHeight();//ProcesoCierreMesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.isSelected()) {
					iHeightTable=ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCierreMes.isSelected()) {
					iHeightTable=ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCierreMesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCierreMes.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreMes.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCierreMes.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCierreMes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreMes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCierreMes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCierreMes!=null && this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocierremesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCierreMes.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCierreMes.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCierreMes.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCierreMes.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCierreMes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreMes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCierreMes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocierremesLogic.getProcesoCierreMess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierremess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCierreMes> TraerProcesoCierreMesBeans(List<ProcesoCierreMes> procesocierremess,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCierreMes procesocierremes:procesocierremess) {
					
				if(!(ProcesoCierreMesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCierreMesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocierremes.setsDetalleGeneralEntityReporte(ProcesoCierreMesConstantesFunciones.getProcesoCierreMesDescripcion(procesocierremes));
										
					procesocierremes.setes_para_reversion_descripcion(ProcesoCierreMesConstantesFunciones.getes_para_reversionDescripcion(procesocierremes));	
					
						
					
				} else  {
							
					//procesocierremes.setsDetalleGeneralEntityReporte(procesocierremes.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocierremesbeans.add(procesocierremesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocierremess;
    }
	//PARA REPORTES FIN
}
