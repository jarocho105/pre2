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
import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaConstantesFunciones;

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
public class ProcesoIessFondoReservaJInternalFrame extends ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoIessFondoReserva;
	
	protected JMenuBar jmenuBarProcesoIessFondoReserva;
	
	protected JMenu jmenuProcesoIessFondoReserva;
	protected JMenu jmenuDatosProcesoIessFondoReserva;
	protected JMenu jmenuArchivoProcesoIessFondoReserva;
	protected JMenu jmenuAccionesProcesoIessFondoReserva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoIessFondoReserva;	
	protected GridBagConstraints gridBagConstraintsProcesoIessFondoReserva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoIessFondoReservaDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoIessFondoReserva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoIessFondoReserva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoIessFondoReserva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";
	
	public ProcesoIessFondoReservaSessionBean procesoiessfondoreservaSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoIessFondoReserva> procesoiessfondoreservas;		
	public List<ProcesoIessFondoReserva> procesoiessfondoreservasEliminados;	
	public List<ProcesoIessFondoReserva> procesoiessfondoreservasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoIessFondoReserva;		
	protected JButton jButtonAbrirOrderByProcesoIessFondoReserva;
	
	
	//protected JPanel jPanelOrderByProcesoIessFondoReserva;
	//public JScrollPane jScrollPanelOrderByProcesoIessFondoReserva;	
	//protected JButton jButtonCerrarOrderByProcesoIessFondoReserva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoIessFondoReservaLogic procesoiessfondoreservaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoIessFondoReserva;
	public JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReserva;
	public JScrollPane jScrollPanelDatosGeneralProcesoIessFondoReserva;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoIessFondoReservaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoIessFondoReserva;
	//public JScrollPane jScrollPanelImportacionProcesoIessFondoReserva;
	
	
	
	protected JPanel jPanelAccionesProcesoIessFondoReserva;
	
    protected JPanel jPanelPaginacionProcesoIessFondoReserva;
    protected JPanel jPanelParametrosReportesProcesoIessFondoReserva;
	protected JPanel jPanelParametrosReportesAccionesProcesoIessFondoReserva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoIessFondoReserva;
	protected JPanel jPanelParametrosAuxiliar2ProcesoIessFondoReserva;
	protected JPanel jPanelParametrosAuxiliar3ProcesoIessFondoReserva;
	protected JPanel jPanelParametrosAuxiliar4ProcesoIessFondoReserva;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoIessFondoReserva;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoIessFondoReserva;
	//protected JPanel jPanelImportacionProcesoIessFondoReserva;
	
	
	public JTable jTableDatosProcesoIessFondoReserva;
	
	
	
	//public JTable jTableDatosProcesoIessFondoReservaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoIessFondoReserva;
	protected JButton jButtonDuplicarProcesoIessFondoReserva;
	protected JButton jButtonCopiarProcesoIessFondoReserva;
	protected JButton jButtonVerFormProcesoIessFondoReserva;
	protected JButton jButtonNuevoRelacionesProcesoIessFondoReserva;
	protected JButton jButtonModificarProcesoIessFondoReserva;
	
    protected JButton jButtonGuardarCambiosTablaProcesoIessFondoReserva;
	protected JButton jButtonCerrarProcesoIessFondoReserva;
	
	
	protected JButton jButtonRecargarInformacionProcesoIessFondoReserva;
	protected JButton jButtonProcesarInformacionProcesoIessFondoReserva;
	
	
	protected JButton jButtonAnterioresProcesoIessFondoReserva;
	protected JButton jButtonSiguientesProcesoIessFondoReserva;
	protected JButton jButtonNuevoGuardarCambiosProcesoIessFondoReserva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoIessFondoReserva;
	//protected JButton jButtonCerrarReporteDinamicoProcesoIessFondoReserva;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoIessFondoReserva;
	//protected JButton jButtonGenerarImportacionProcesoIessFondoReserva;
	//protected JButton jButtonCerrarImportacionProcesoIessFondoReserva;
	//protected JFileChooser jFileChooserImportacionProcesoIessFondoReserva;
	//protected File fileImportacionProcesoIessFondoReserva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoIessFondoReserva;
	protected JButton jButtonDuplicarToolBarProcesoIessFondoReserva;
	protected JButton jButtonNuevoRelacionesToolBarProcesoIessFondoReserva;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoIessFondoReserva;
	protected JButton jButtonCopiarToolBarProcesoIessFondoReserva;
	protected JButton jButtonVerFormToolBarProcesoIessFondoReserva;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoIessFondoReserva;
	protected JButton jButtonCerrarToolBarProcesoIessFondoReserva;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoIessFondoReserva;
	protected JButton jButtonProcesarInformacionToolBarProcesoIessFondoReserva;
	protected JButton jButtonAnterioresToolBarProcesoIessFondoReserva;
	protected JButton jButtonSiguientesToolBarProcesoIessFondoReserva;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReserva;
	protected JButton jButtonAbrirOrderByToolBarProcesoIessFondoReserva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoIessFondoReserva;
	protected JMenuItem jMenuItemDuplicarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoIessFondoReserva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoIessFondoReserva;
	protected JMenuItem jMenuItemCopiarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemVerFormProcesoIessFondoReserva;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoIessFondoReserva;
	protected JMenuItem jMenuItemCerrarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemDetalleCerrarProcesoIessFondoReserva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoIessFondoReserva;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoIessFondoReserva;
	protected JMenuItem jMenuItemProcesarInformacionProcesoIessFondoReserva;
	protected JMenuItem jMenuItemAnterioresProcesoIessFondoReserva;
	protected JMenuItem jMenuItemSiguientesProcesoIessFondoReserva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva;
	protected JMenuItem jMenuItemAbrirOrderByProcesoIessFondoReserva;
	protected JMenuItem jMenuItemMostrarOcultarProcesoIessFondoReserva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoIessFondoReserva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoIessFondoReserva;
	protected JCheckBox jCheckBoxSeleccionadosProcesoIessFondoReserva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoIessFondoReserva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoIessFondoReserva;
	protected JTextField jTextFieldValorCampoGeneralProcesoIessFondoReserva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoIessFondoReserva;
	//public JList<Reporte> jListColumnasSelectReporteProcesoIessFondoReserva;
	//public JScrollPane jScrollColumnasSelectReporteProcesoIessFondoReserva;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoIessFondoReserva;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoIessFondoReserva;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoIessFondoReserva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoIessFondoReserva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoIessFondoReserva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoIessFondoReserva;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoIessFondoReserva;
	
		
	//public JLabel jLabelArchivoImportacionProcesoIessFondoReserva;	
	//public JLabel jLabelPathArchivoImportacionProcesoIessFondoReserva;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoIessFondoReserva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoIessFondoReserva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoIessFondoReserva;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoIessFondoReserva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoIessFondoReserva;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoIessFondoReserva;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoIessFondoReserva;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoIessFondoReserva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoIessFondoReserva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoIessFondoReserva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoIessFondoReserva;
	public JPanel jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	public JButton jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	
	public JPanel jPanelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	public JLabel jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	public JButton jButtonid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReservaUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReservaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	public JLabel jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva;
	public JButton jButtonid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva= new JButtonMe();
	public JButton jButtonid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReservaUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReservaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoIessFondoReservaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoIessFondoReserva)	{
		this.jButtonRecargarInformacionProcesoIessFondoReserva = jButtonRecargarInformacionProcesoIessFondoReserva;
	}
	
	public JButton getjButtonProcesarInformacionProcesoIessFondoReserva() {
		return this.jButtonProcesarInformacionProcesoIessFondoReserva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoIessFondoReserva)	{
		this.jButtonProcesarInformacionProcesoIessFondoReserva = jButtonProcesarInformacionProcesoIessFondoReserva;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoIessFondoReserva() {
		return this.jButtonRecargarInformacionProcesoIessFondoReserva;
	}
	
	
	public List<ProcesoIessFondoReserva> getprocesoiessfondoreservas() {
		return this.procesoiessfondoreservas;
	}

	public void setprocesoiessfondoreservas(List<ProcesoIessFondoReserva> procesoiessfondoreservas) {
		this.procesoiessfondoreservas = procesoiessfondoreservas;
	}
	
	public List<ProcesoIessFondoReserva> getprocesoiessfondoreservasAux() {
		return this.procesoiessfondoreservasAux;
	}

	public void setprocesoiessfondoreservasAux(List<ProcesoIessFondoReserva> procesoiessfondoreservasAux) {
		this.procesoiessfondoreservasAux = procesoiessfondoreservasAux;
	}
	
	public List<ProcesoIessFondoReserva> getprocesoiessfondoreservasEliminados() {
		return this.procesoiessfondoreservasEliminados;
	}

	public void setProcesoIessFondoReservasEliminados(List<ProcesoIessFondoReserva> procesoiessfondoreservasEliminados) {
		this.procesoiessfondoreservasEliminados = procesoiessfondoreservasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoIessFondoReserva() {
		return jComboBoxTiposSeleccionarProcesoIessFondoReserva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoIessFondoReserva(
			JComboBox jComboBoxTiposSeleccionarProcesoIessFondoReserva) {
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva = jComboBoxTiposSeleccionarProcesoIessFondoReserva;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoIessFondoReserva() {
		return jTextFieldValorCampoGeneralProcesoIessFondoReserva;
	}

	public void setjTextFieldValorCampoGeneralProcesoIessFondoReserva(
			JTextField jTextFieldValorCampoGeneralProcesoIessFondoReserva) {
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva = jTextFieldValorCampoGeneralProcesoIessFondoReserva;
	}

	public void setBorderResaltarValorCampoGeneralProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoIessFondoReserva() {
		return this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva;
	}

	public void setjCheckBoxSeleccionarTodosProcesoIessFondoReserva(
			JCheckBox jCheckBoxSeleccionarTodosProcesoIessFondoReserva) {
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva = jCheckBoxSeleccionarTodosProcesoIessFondoReserva;
	}

	public void setBorderResaltarSeleccionarTodosProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoIessFondoReserva() {
		return this.jCheckBoxSeleccionadosProcesoIessFondoReserva;
	}

	public void setjCheckBoxSeleccionadosProcesoIessFondoReserva(
			JCheckBox jCheckBoxSeleccionadosProcesoIessFondoReserva) {
		this.jCheckBoxSeleccionadosProcesoIessFondoReserva = jCheckBoxSeleccionadosProcesoIessFondoReserva;
	}
	
	public void setBorderResaltarSeleccionadosProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoIessFondoReserva() {
		return this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoIessFondoReserva(
			JComboBox jComboBoxTiposArchivosReportesProcesoIessFondoReserva) {
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva = jComboBoxTiposArchivosReportesProcesoIessFondoReserva;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoIessFondoReserva() {
		return this.jComboBoxTiposReportesProcesoIessFondoReserva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoIessFondoReserva(
			JComboBox jComboBoxTiposReportesProcesoIessFondoReserva) {
		this.jComboBoxTiposReportesProcesoIessFondoReserva = jComboBoxTiposReportesProcesoIessFondoReserva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoIessFondoReserva() {
	//	return jComboBoxTiposReportesDinamicoProcesoIessFondoReserva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoIessFondoReserva(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoIessFondoReserva) {
	//	this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva = jComboBoxTiposReportesDinamicoProcesoIessFondoReserva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva = jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva;
	//}
	
	public void setBorderResaltarTiposReportesProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoIessFondoReserva() {
		return this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoIessFondoReserva(
			JComboBox jComboBoxTiposGraficosReportesProcesoIessFondoReserva) {
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva = jComboBoxTiposGraficosReportesProcesoIessFondoReserva;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoIessFondoReserva() {
		return this.jComboBoxTiposPaginacionProcesoIessFondoReserva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoIessFondoReserva(
			JComboBox jComboBoxTiposPaginacionProcesoIessFondoReserva) {
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva = jComboBoxTiposPaginacionProcesoIessFondoReserva;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoIessFondoReserva() {
		return this.jComboBoxTiposRelacionesProcesoIessFondoReserva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoIessFondoReserva() {
		return this.jComboBoxTiposAccionesProcesoIessFondoReserva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoIessFondoReserva(
			JComboBox jComboBoxTiposRelacionesProcesoIessFondoReserva) {
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva = jComboBoxTiposRelacionesProcesoIessFondoReserva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoIessFondoReserva(
			JComboBox jComboBoxTiposAccionesProcesoIessFondoReserva) {
		this.jComboBoxTiposAccionesProcesoIessFondoReserva = jComboBoxTiposAccionesProcesoIessFondoReserva;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoIessFondoReserva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoIessFondoReserva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoIessFondoReserva() {
	//	return jCheckBoxConGraficoDinamicoProcesoIessFondoReserva;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoIessFondoReserva(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoIessFondoReserva) {
	//	this.jCheckBoxConGraficoDinamicoProcesoIessFondoReserva = jCheckBoxConGraficoDinamicoProcesoIessFondoReserva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoIessFondoReserva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoIessFondoReserva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoIessFondoReserva .setBorder(borderResaltar);		
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
		this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean();
		
		this.procesoiessfondoreservaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessfondoreservaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoIessFondoReservaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoIessFondoReservaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoIessFondoReservaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoIessFondoReservaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoIessFondoReservaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Iess Fondo Reserva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoIessFondoReservaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoIessFondoReserva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoIessFondoReserva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"nuevo","nuevo","Nuevo"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"duplicar","duplicar","Duplicar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"copiar","copiar","Copiar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"ver_form","ver_form","Ver"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"recargar","recargar","Procesar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoIessFondoReserva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,
							"cerrar","cerrar","Salir"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoIessFondoReserva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoIessFondoReserva;
			
				this.jButtonProcesarInformacionToolBarProcesoIessFondoReserva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoIessFondoReserva;
				
		//protected JButton jButtonModificarToolBarProcesoIessFondoReserva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoIessFondoReserva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoIessFondoReserva=new JMenuMe("General");
		this.jmenuArchivoProcesoIessFondoReserva=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoIessFondoReserva=new JMenuMe("Acciones");
		this.jmenuDatosProcesoIessFondoReserva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoIessFondoReserva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoIessFondoReserva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoIessFondoReserva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoIessFondoReserva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoIessFondoReserva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoIessFondoReserva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoIessFondoReserva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoIessFondoReserva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoIessFondoReserva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReserva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoIessFondoReserva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoIessFondoReserva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoIessFondoReserva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoIessFondoReserva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoIessFondoReserva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoIessFondoReserva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoIessFondoReserva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoIessFondoReserva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoIessFondoReserva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoIessFondoReserva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoIessFondoReserva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoIessFondoReserva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoIessFondoReserva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoIessFondoReserva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoIessFondoReserva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoIessFondoReserva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoIessFondoReserva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoIessFondoReserva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoIessFondoReserva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoIessFondoReserva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoIessFondoReserva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoIessFondoReserva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoIessFondoReserva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoIessFondoReserva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoIessFondoReserva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoIessFondoReserva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoIessFondoReserva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoIessFondoReserva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoIessFondoReserva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoIessFondoReserva.add(this.jMenuItemCerrarProcesoIessFondoReserva);
			
			this.jmenuAccionesProcesoIessFondoReserva.add(this.jMenuItemNuevoProcesoIessFondoReserva);
			this.jmenuAccionesProcesoIessFondoReserva.add(this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva);
			this.jmenuAccionesProcesoIessFondoReserva.add(this.jMenuItemNuevoRelacionesProcesoIessFondoReserva);
			this.jmenuAccionesProcesoIessFondoReserva.add(this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva);		
			this.jmenuAccionesProcesoIessFondoReserva.add(this.jMenuItemDuplicarProcesoIessFondoReserva);		
			this.jmenuAccionesProcesoIessFondoReserva.add(this.jMenuItemCopiarProcesoIessFondoReserva);		
			this.jmenuAccionesProcesoIessFondoReserva.add(this.jMenuItemVerFormProcesoIessFondoReserva);		
			
			this.jmenuDatosProcesoIessFondoReserva.add(this.jMenuItemRecargarInformacionProcesoIessFondoReserva);				
			this.jmenuDatosProcesoIessFondoReserva.add(this.jMenuItemAnterioresProcesoIessFondoReserva);				
			this.jmenuDatosProcesoIessFondoReserva.add(this.jMenuItemSiguientesProcesoIessFondoReserva);				
			this.jmenuDatosProcesoIessFondoReserva.add(this.jMenuItemAbrirOrderByProcesoIessFondoReserva);				
			this.jmenuDatosProcesoIessFondoReserva.add(this.jMenuItemMostrarOcultarProcesoIessFondoReserva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoIessFondoReserva.add(this.jMenuItemGuardarCambiosProcesoIessFondoReserva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoIessFondoReserva.add(this.jmenuArchivoProcesoIessFondoReserva);		
			this.jmenuBarProcesoIessFondoReserva.add(this.jmenuAccionesProcesoIessFondoReserva);		
			this.jmenuBarProcesoIessFondoReserva.add(this.jmenuDatosProcesoIessFondoReserva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoIessFondoReserva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoIessFondoReserva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setToolTipText("Procesar Proceso Iess Fondo Reserva");
		this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva= new JButtonMe();
		this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setText("Procesar");
		this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setToolTipText("Procesar Proceso Iess Fondo Reserva");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva,"buscar_button","Procesar Proceso Iess Fondo Reserva");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva = new JLabelMe();
		jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setText("Anio :");
		jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva = new JLabelMe();
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setText("Numero Patronal :");
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setToolTipText("Numero Patronal");
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva= new JComboBoxMe();
		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoIessFondoReserva=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoIessFondoReserva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoIessFondoReserva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoIessFondoReserva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Iess Fondo Reserva"));
		this.jTabbedPaneBusquedasProcesoIessFondoReserva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoIessFondoReserva = new ProcesoIessFondoReservaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Iess Fondo Reserva DATOS");
			this.jInternalFrameDetalleFormProcesoIessFondoReserva = new ProcesoIessFondoReservaDetalleFormJInternalFrame(jDesktopPane,this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones(),this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva = null;//new ProcesoIessFondoReservaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoIessFondoReserva= new GridBagLayout();
		
		
		this.jTableDatosProcesoIessFondoReserva = new JTableMe();      
		
		String sToolTipProcesoIessFondoReserva="";
		sToolTipProcesoIessFondoReserva=ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoIessFondoReserva+="(Nomina.ProcesoIessFondoReserva)";
		}
		
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoIessFondoReserva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoIessFondoReserva.setToolTipText(sToolTipProcesoIessFondoReserva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoIessFondoReserva);
		this.jTableDatosProcesoIessFondoReserva.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoIessFondoReserva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoIessFondoReserva.setRowSelectionAllowed(true);
		this.jTableDatosProcesoIessFondoReserva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoIessFondoReserva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoIessFondoReserva = new JButtonMe();
		this.jButtonDuplicarProcesoIessFondoReserva = new JButtonMe();
		this.jButtonCopiarProcesoIessFondoReserva = new JButtonMe();
		this.jButtonVerFormProcesoIessFondoReserva = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoIessFondoReserva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva = new JButtonMe();
		this.jButtonCerrarProcesoIessFondoReserva = new JButtonMe();
		
		this.jScrollPanelDatosProcesoIessFondoReserva = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoIessFondoReserva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Iess Fondo Reserva";
		
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reservas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoIessFondoReserva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoIessFondoReserva.setToolTipText("Acciones");
        this.jPanelAccionesProcesoIessFondoReserva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoIessFondoReserva=new ReporteDinamicoJInternalFrame(ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoIessFondoReserva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoIessFondoReserva=new ImportacionJInternalFrame(ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoIessFondoReserva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoIessFondoReserva = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoIessFondoReserva.setText("Orden");
		this.jButtonAbrirOrderByProcesoIessFondoReserva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoIessFondoReserva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoIessFondoReserva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReserva,false,this);
			
			//this.cargarOrderByProcesoIessFondoReserva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoIessFondoReserva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReserva,true,this);
			
			//this.cargarOrderByProcesoIessFondoReserva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoIessFondoReserva.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoIessFondoReserva.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoIessFondoReserva.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProcesoIessFondoReserva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoIessFondoReserva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoIessFondoReserva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoIessFondoReserva.setText("Nuevo");
		this.jButtonDuplicarProcesoIessFondoReserva.setText("Duplicar");
		this.jButtonCopiarProcesoIessFondoReserva.setText("Copiar");
		this.jButtonVerFormProcesoIessFondoReserva.setText("Ver");
		this.jButtonNuevoRelacionesProcesoIessFondoReserva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.setText("Guardar");
		this.jButtonCerrarProcesoIessFondoReserva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoIessFondoReserva,"nuevo_button","Nuevo",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoIessFondoReserva,"duplicar_button","Duplicar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoIessFondoReserva,"copiar_button","Copiar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoIessFondoReserva,"ver_form","Ver",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoIessFondoReserva,"nuevorelaciones_button","Nuevo Rel",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoIessFondoReserva,"guardarcambiostabla_button","Guardar",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoIessFondoReserva,"cerrar_button","Salir",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoIessFondoReserva.setToolTipText("Nuevo"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoIessFondoReserva.setToolTipText("Duplicar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoIessFondoReserva.setToolTipText("Copiar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoIessFondoReserva.setToolTipText("Ver"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoIessFondoReserva.setToolTipText("Nuevo Rel"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.setToolTipText("Guardar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoIessFondoReserva.setToolTipText("Salir"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoIessFondoReserva";
		inputMap = this.jButtonNuevoProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoIessFondoReserva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoIessFondoReserva"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoIessFondoReserva";
		inputMap = this.jButtonDuplicarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoIessFondoReserva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoIessFondoReserva"));
		
		//COPIAR
		sMapKey = "CopiarProcesoIessFondoReserva";
		inputMap = this.jButtonCopiarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoIessFondoReserva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoIessFondoReserva"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoIessFondoReserva";
		inputMap = this.jButtonVerFormProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoIessFondoReserva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoIessFondoReserva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoIessFondoReserva";
		inputMap = this.jButtonNuevoRelacionesProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoIessFondoReserva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoIessFondoReserva";
		inputMap = this.jButtonModificarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoIessFondoReserva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoIessFondoReserva";
		inputMap = this.jButtonCerrarProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoIessFondoReserva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoIessFondoReserva";
		inputMap = this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoIessFondoReserva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoIessFondoReserva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoIessFondoReserva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoIessFondoReserva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoIessFondoReserva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoIessFondoReserva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoIessFondoReserva.setName("jPanelParametrosReportesProcesoIessFondoReserva"); 
		
		this.jPanelParametrosReportesAccionesProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoIessFondoReserva.setName("jPanelParametrosReportesAccionesProcesoIessFondoReserva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoIessFondoReserva = new JButtonMe();
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setText("Procesar");
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setToolTipText("Procesar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoIessFondoReserva,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoIessFondoReserva = new JButtonMe();
		this.jButtonProcesarInformacionProcesoIessFondoReserva.setText("Procesar");
		this.jButtonProcesarInformacionProcesoIessFondoReserva.setToolTipText("Procesar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoIessFondoReserva.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoIessFondoReserva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoIessFondoReserva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoIessFondoReserva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoIessFondoReserva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoIessFondoReserva.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoIessFondoReserva.setText("Accion");
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoIessFondoReserva = new JLabelMe();
		
		this.jLabelAccionesProcesoIessFondoReserva.setText("Acciones");		
		this.jLabelAccionesProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoIessFondoReserva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoIessFondoReserva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoIessFondoReserva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoIessFondoReserva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoIessFondoReserva = new JButtonMe();
		//this.jButtonAnterioresProcesoIessFondoReserva.setText("<<");
        this.jButtonAnterioresProcesoIessFondoReserva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoIessFondoReserva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoIessFondoReserva = new JButtonMe();
		//this.jButtonSiguientesProcesoIessFondoReserva.setText(">>");
        this.jButtonSiguientesProcesoIessFondoReserva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoIessFondoReserva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva,"nuevoguardarcambios_button","Nue",this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoIessFondoReserva";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoIessFondoReserva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoIessFondoReserva";
		inputMap = this.jButtonRecargarInformacionProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoIessFondoReserva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoIessFondoReserva";
		inputMap = this.jButtonSiguientesProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoIessFondoReserva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoIessFondoReserva";
		inputMap = this.jButtonAnterioresProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoIessFondoReserva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoIessFondoReserva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoIessFondoReserva.setMinimumSize(new Dimension(this.getWidth(),ProcesoIessFondoReservaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessFondoReservaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoIessFondoReserva.setMaximumSize(new Dimension(this.getWidth(),ProcesoIessFondoReservaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessFondoReservaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoIessFondoReserva.setPreferredSize(new Dimension(this.getWidth(),ProcesoIessFondoReservaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessFondoReservaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoIessFondoReserva = new GridBagLayout();

			this.jPanelPaginacionProcesoIessFondoReserva.setLayout(gridaBagLayoutPaginacionProcesoIessFondoReserva);						
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonAnterioresProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
					
						
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
			
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
						
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonSiguientesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonNuevoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
						
			
			
			if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
				this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
				this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonGuardarCambiosTablaProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			}
			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonProcesarInformacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonDuplicarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonCopiarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonVerFormProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoIessFondoReserva.add(this.jButtonCerrarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoIessFondoReserva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoIessFondoReserva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoIessFondoReserva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoIessFondoReserva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoIessFondoReserva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoIessFondoReserva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoIessFondoReserva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoIessFondoReserva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoIessFondoReserva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoIessFondoReserva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoIessFondoReserva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoIessFondoReserva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoIessFondoReserva.setLayout(gridaBagParametrosReportesProcesoIessFondoReserva);
			this.jPanelParametrosReportesAccionesProcesoIessFondoReserva.setLayout(gridaBagParametrosReportesAccionesProcesoIessFondoReserva);
			
			
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReserva.setLayout(gridaBagParametrosAuxiliar1ProcesoIessFondoReserva);
			this.jPanelParametrosAuxiliar2ProcesoIessFondoReserva.setLayout(gridaBagParametrosAuxiliar2ProcesoIessFondoReserva);
			this.jPanelParametrosAuxiliar3ProcesoIessFondoReserva.setLayout(gridaBagParametrosAuxiliar3ProcesoIessFondoReserva);
			this.jPanelParametrosAuxiliar4ProcesoIessFondoReserva.setLayout(gridaBagParametrosAuxiliar4ProcesoIessFondoReserva);
			//this.jPanelParametrosAuxiliar5ProcesoIessFondoReserva.setLayout(gridaBagParametrosAuxiliar2ProcesoIessFondoReserva);			
			
			
			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jButtonRecargarInformacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReserva.add(this.jComboBoxTiposPaginacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReserva.add(this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReserva.add(this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jPanelParametrosAuxiliar1ProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoIessFondoReserva.add(this.jComboBoxTiposReportesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jPanelParametrosAuxiliar4ProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jComboBoxTiposReportesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jCheckBoxGenerarReporteProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jPanelParametrosAuxiliar2ProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jLabelAccionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jComboBoxTiposSeleccionarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
			
			
			/*
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoIessFondoReserva.add(this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);															
				
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoIessFondoReserva.add(this.jCheckBoxSeleccionadosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jPanelParametrosAuxiliar3ProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessFondoReserva.add(this.jComboBoxTiposAccionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoIessFondoReserva = new GridBagLayout();

			this.jScrollPanelDatosProcesoIessFondoReserva.setLayout(gridaBagLayoutDatosProcesoIessFondoReserva);
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
			
			this.jScrollPanelDatosProcesoIessFondoReserva.add(this.jTableDatosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoIessFondoReserva.setViewportView(this.jTableDatosProcesoIessFondoReserva);
		this.jTableDatosProcesoIessFondoReserva.setFillsViewportHeight(true);
		this.jTableDatosProcesoIessFondoReserva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoIessFondoReserva= new GridBagLayout();
		this.jPanelAccionesProcesoIessFondoReserva.setLayout(gridaBagLayoutAccionesProcesoIessFondoReserva);
		
		
		/*	
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
			
		this.jPanelAccionesProcesoIessFondoReserva.add(this.jButtonNuevoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoIessFondoReservaProcesoIessFondoReserva= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setLayout(gridaBagLayoutBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);

		gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
		jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.add(jLabelid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);

		gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReserva.gridy = 0;
		gridBagConstraintsProcesoIessFondoReserva.gridx = 1;
		jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.add(jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);


		gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
		gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
		jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.add(jLabelid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);

		gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReserva.gridy = 1;
		gridBagConstraintsProcesoIessFondoReserva.gridx = 1;
		jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.add(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);

		gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReserva.gridy = 2;
		gridBagConstraintsProcesoIessFondoReserva.gridx =1;
		jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.add(jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva, gridBagConstraintsProcesoIessFondoReserva);

		jTabbedPaneBusquedasProcesoIessFondoReserva.addTab("1.-Por Anio Por Numero Patronal ", jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
		jTabbedPaneBusquedasProcesoIessFondoReserva.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoIessFondoReserva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoIessFondoReserva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();						
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;		
			//this.gridBagConstraintsProcesoIessFondoReserva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;		
		//this.gridBagConstraintsProcesoIessFondoReserva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoIessFondoReserva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;		
			this.gridBagConstraintsProcesoIessFondoReserva.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoIessFondoReserva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);								
		
		
		/*
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		*/		
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =0;
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoIessFondoReserva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
				
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoIessFondoReserva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoIessFondoReserva = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoIessFondoReserva.setLayout(gridaBagLayoutBusquedasParametrosProcesoIessFondoReserva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
			
			
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
			
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoIessFondoReserva.setVisible(false);
		this.jButtonAnterioresProcesoIessFondoReserva.setVisible(false);
		this.jButtonSiguientesProcesoIessFondoReserva.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoIessFondoReserva.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.setVisible(false);
		this.jComboBoxTiposReportesProcesoIessFondoReserva.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva.setVisible(false);
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.setVisible(false);
		
		this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(false);
		
		
		this.jTtoolBarProcesoIessFondoReserva.setVisible(false);
			
		this.jMenuItemAnterioresProcesoIessFondoReserva.setVisible(false);
		this.jMenuItemSiguientesProcesoIessFondoReserva.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoIessFondoReserva.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoIessFondoReserva.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReserva.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReserva.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReserva.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoIessFondoReserva.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoIessFondoReserva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoIessFondoReserva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoIessFondoReserva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoIessFondoReserva.setName("jPanelReporteDinamicoProcesoIessFondoReserva"); 
		
		this.jPanelReporteDinamicoProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoIessFondoReserva.setLayout(gridaBagLayoutReporteDinamicoProcesoIessFondoReserva);
		
		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReserva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoIessFondoReserva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoIessFondoReserva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reservas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoIessFondoReserva = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoIessFondoReserva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jLabelColumnasSelectReporteProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoIessFondoReserva = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoIessFondoReserva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoIessFondoReserva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoIessFondoReserva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoIessFondoReserva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoIessFondoReserva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoIessFondoReserva=new JScrollPane(this.jListColumnasSelectReporteProcesoIessFondoReserva);
			
			this.jScrollColumnasSelectReporteProcesoIessFondoReserva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoIessFondoReserva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoIessFondoReserva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jListColumnasSelectReporteProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jScrollColumnasSelectReporteProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoIessFondoReserva = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoIessFondoReserva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoIessFondoReserva = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoIessFondoReserva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoIessFondoReserva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoIessFondoReserva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoIessFondoReserva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoIessFondoReserva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoIessFondoReserva=new JScrollPane(this.jListRelacionesSelectReporteProcesoIessFondoReserva);
			
			this.jScrollRelacionesSelectReporteProcesoIessFondoReserva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoIessFondoReserva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoIessFondoReserva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoIessFondoReserva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoIessFondoReserva = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoIessFondoReserva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReserva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReserva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva.setToolTipText("Generar EXCEL"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jComboBoxTiposReportesDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReserva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReserva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReserva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReserva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoIessFondoReserva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReserva.setToolTipText("Generar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jButtonGenerarReporteDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReserva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReserva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoIessFondoReserva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReserva.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReserva.add(this.jButtonCerrarReporteDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoIessFondoReserva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoIessFondoReserva= new JScrollPane(jPanelReporteDinamicoProcesoIessFondoReserva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reservas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoIessFondoReserva);
		this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoIessFondoReserva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoIessFondoReserva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoIessFondoReserva.setName("jPanelImportacionProcesoIessFondoReserva"); 
		
		this.jPanelImportacionProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoIessFondoReserva.setLayout(gridaBagLayoutImportacionProcesoIessFondoReserva);
		
		
		this.jInternalFrameImportacionProcesoIessFondoReserva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoIessFondoReserva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoIessFondoReserva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoIessFondoReserva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoIessFondoReserva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoIessFondoReserva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoIessFondoReserva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setResizable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setClosable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoIessFondoReserva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoIessFondoReserva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoIessFondoReserva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setResizable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setClosable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReserva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reservas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoIessFondoReserva = new JLabelMe();

		this.jLabelArchivoImportacionProcesoIessFondoReserva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoIessFondoReserva.add(this.jLabelArchivoImportacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoIessFondoReserva = new JFileChooser();		
		this.jFileChooserImportacionProcesoIessFondoReserva.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoIessFondoReserva = new JButtonMe();
		this.jButtonAbrirImportacionProcesoIessFondoReserva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoIessFondoReserva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoIessFondoReserva.setToolTipText("Generar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReserva.add(this.jButtonAbrirImportacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoIessFondoReserva = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoIessFondoReserva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoIessFondoReserva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoIessFondoReserva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoIessFondoReserva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoIessFondoReserva.add(this.jLabelPathArchivoImportacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReserva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReserva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReserva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReserva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReserva.add(this.jTextFieldPathArchivoImportacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoIessFondoReserva = new JButtonMe();
		this.jButtonGenerarImportacionProcesoIessFondoReserva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoIessFondoReserva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoIessFondoReserva.setToolTipText("Generar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReserva.add(this.jButtonGenerarImportacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoIessFondoReserva = new JButtonMe();
		this.jButtonCerrarImportacionProcesoIessFondoReserva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoIessFondoReserva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoIessFondoReserva.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReserva.add(this.jButtonCerrarImportacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoIessFondoReserva = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoIessFondoReserva= new JScrollPane(jPanelImportacionProcesoIessFondoReserva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReserva.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReserva.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoIessFondoReserva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoIessFondoReserva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoIessFondoReserva);
		this.jInternalFrameImportacionProcesoIessFondoReserva.getContentPane().add(this.jScrollPanelImportacionProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoIessFondoReserva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoIessFondoReserva = new JButtonMe();
			this.jButtonAbrirOrderByProcesoIessFondoReserva.setText("Orden");
			this.jButtonAbrirOrderByProcesoIessFondoReserva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoIessFondoReserva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoIessFondoReserva";
			inputMap = this.jButtonAbrirOrderByProcesoIessFondoReserva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoIessFondoReserva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoIessFondoReserva"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoIessFondoReserva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoIessFondoReserva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoIessFondoReserva.setName("jPanelOrderByProcesoIessFondoReserva"); 
			
			this.jPanelOrderByProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoIessFondoReserva.setLayout(gridaBagLayoutOrderByProcesoIessFondoReserva);
			
			
			this.jTableDatosProcesoIessFondoReservaOrderBy = new JTableMe();        
			this.jTableDatosProcesoIessFondoReservaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoIessFondoReservaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoIessFondoReservaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoIessFondoReservaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoIessFondoReservaOrderBy.setViewportView(this.jTableDatosProcesoIessFondoReservaOrderBy);
			this.jTableDatosProcesoIessFondoReservaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoIessFondoReservaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoIessFondoReserva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoIessFondoReserva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoIessFondoReserva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoIessFondoReserva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoIessFondoReserva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoIessFondoReserva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoIessFondoReserva.setTitle("Orden");
			this.jInternalFrameOrderByProcesoIessFondoReserva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoIessFondoReserva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoIessFondoReserva.setResizable(true);
			this.jInternalFrameOrderByProcesoIessFondoReserva.setClosable(true);
			this.jInternalFrameOrderByProcesoIessFondoReserva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoIessFondoReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reservas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoIessFondoReserva.ipady =150;
				
			this.jPanelOrderByProcesoIessFondoReserva.add(jScrollPanelDatosProcesoIessFondoReservaOrderBy, this.gridBagConstraintsProcesoIessFondoReserva);//this.jTableDatosProcesoIessFondoReservaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoIessFondoReserva = new JButtonMe();
			this.jButtonCerrarOrderByProcesoIessFondoReserva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoIessFondoReserva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoIessFondoReserva.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoIessFondoReserva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReserva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoIessFondoReserva.add(this.jButtonCerrarOrderByProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoIessFondoReserva = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoIessFondoReserva= new JScrollPane(jPanelOrderByProcesoIessFondoReserva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoIessFondoReserva = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReserva.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoIessFondoReserva.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoIessFondoReserva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoIessFondoReserva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoIessFondoReserva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoIessFondoReserva);
			
			this.jInternalFrameOrderByProcesoIessFondoReserva.getContentPane().add(this.jScrollPanelOrderByProcesoIessFondoReserva, this.gridBagConstraintsProcesoIessFondoReserva);			
		
		} else {
			this.jButtonAbrirOrderByProcesoIessFondoReserva = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoIessFondoReserva.getRowHeight();//ProcesoIessFondoReservaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.isSelected()) {
					iHeightTable=ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReserva.isSelected()) {
					iHeightTable=ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoIessFondoReservaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoIessFondoReserva!=null && this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy()!=null) {
			//if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoIessFondoReserva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoIessFondoReserva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoIessFondoReserva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoIessFondoReserva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoIessFondoReserva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoIessFondoReserva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessfondoreservas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoIessFondoReserva> TraerProcesoIessFondoReservaBeans(List<ProcesoIessFondoReserva> procesoiessfondoreservas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoIessFondoReserva procesoiessfondoreserva:procesoiessfondoreservas) {
					
				if(!(ProcesoIessFondoReservaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoIessFondoReservaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesoiessfondoreserva.setsDetalleGeneralEntityReporte(ProcesoIessFondoReservaConstantesFunciones.getProcesoIessFondoReservaDescripcion(procesoiessfondoreserva));
										
						
					
						
					
				} else  {
							
					//procesoiessfondoreserva.setsDetalleGeneralEntityReporte(procesoiessfondoreserva.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesoiessfondoreservabeans.add(procesoiessfondoreservabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoiessfondoreservas;
    }
	//PARA REPORTES FIN
}
