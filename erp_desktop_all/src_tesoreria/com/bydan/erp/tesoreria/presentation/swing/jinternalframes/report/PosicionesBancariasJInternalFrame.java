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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.report.PosicionesBancariasConstantesFunciones;

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
public class PosicionesBancariasJInternalFrame extends PosicionesBancariasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPosicionesBancarias;
	
	protected JMenuBar jmenuBarPosicionesBancarias;
	
	protected JMenu jmenuPosicionesBancarias;
	protected JMenu jmenuDatosPosicionesBancarias;
	protected JMenu jmenuArchivoPosicionesBancarias;
	protected JMenu jmenuAccionesPosicionesBancarias;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPosicionesBancarias;	
	protected GridBagConstraints gridBagConstraintsPosicionesBancarias;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PosicionesBancariasDetalleFormJInternalFrame jInternalFrameDetalleFormPosicionesBancarias;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPosicionesBancarias;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPosicionesBancarias;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public PosicionesBancariasSessionBean posicionesbancariasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PosicionesBancarias> posicionesbancariass;		
	public List<PosicionesBancarias> posicionesbancariassEliminados;	
	public List<PosicionesBancarias> posicionesbancariassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPosicionesBancarias;		
	protected JButton jButtonAbrirOrderByPosicionesBancarias;
	
	
	//protected JPanel jPanelOrderByPosicionesBancarias;
	//public JScrollPane jScrollPanelOrderByPosicionesBancarias;	
	//protected JButton jButtonCerrarOrderByPosicionesBancarias;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PosicionesBancariasLogic posicionesbancariasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPosicionesBancarias;
	public JScrollPane jScrollPanelDatosEdicionPosicionesBancarias;
	public JScrollPane jScrollPanelDatosGeneralPosicionesBancarias;
    
	
	
	//public JScrollPane jScrollPanelDatosPosicionesBancariasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPosicionesBancarias;
	//public JScrollPane jScrollPanelImportacionPosicionesBancarias;
	
	
	
	protected JPanel jPanelAccionesPosicionesBancarias;
	
    protected JPanel jPanelPaginacionPosicionesBancarias;
    protected JPanel jPanelParametrosReportesPosicionesBancarias;
	protected JPanel jPanelParametrosReportesAccionesPosicionesBancarias;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PosicionesBancarias;
	protected JPanel jPanelParametrosAuxiliar2PosicionesBancarias;
	protected JPanel jPanelParametrosAuxiliar3PosicionesBancarias;
	protected JPanel jPanelParametrosAuxiliar4PosicionesBancarias;
	//protected JPanel jPanelParametrosAuxiliar5PosicionesBancarias;
	
	
	
	//protected JPanel jPanelReporteDinamicoPosicionesBancarias;
	//protected JPanel jPanelImportacionPosicionesBancarias;
	
	
	public JTable jTableDatosPosicionesBancarias;
	
	
	
	//public JTable jTableDatosPosicionesBancariasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPosicionesBancarias;
	protected JButton jButtonDuplicarPosicionesBancarias;
	protected JButton jButtonCopiarPosicionesBancarias;
	protected JButton jButtonVerFormPosicionesBancarias;
	protected JButton jButtonNuevoRelacionesPosicionesBancarias;
	protected JButton jButtonModificarPosicionesBancarias;
	
    protected JButton jButtonGuardarCambiosTablaPosicionesBancarias;
	protected JButton jButtonCerrarPosicionesBancarias;
	
	
	protected JButton jButtonRecargarInformacionPosicionesBancarias;
	protected JButton jButtonProcesarInformacionPosicionesBancarias;
	
	
	protected JButton jButtonAnterioresPosicionesBancarias;
	protected JButton jButtonSiguientesPosicionesBancarias;
	protected JButton jButtonNuevoGuardarCambiosPosicionesBancarias;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPosicionesBancarias;
	//protected JButton jButtonCerrarReporteDinamicoPosicionesBancarias;
	//protected JButton jButtonGenerarExcelReporteDinamicoPosicionesBancarias;	
	
	
	
	//protected JButton jButtonAbrirImportacionPosicionesBancarias;
	//protected JButton jButtonGenerarImportacionPosicionesBancarias;
	//protected JButton jButtonCerrarImportacionPosicionesBancarias;
	//protected JFileChooser jFileChooserImportacionPosicionesBancarias;
	//protected File fileImportacionPosicionesBancarias;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPosicionesBancarias;
	protected JButton jButtonDuplicarToolBarPosicionesBancarias;
	protected JButton jButtonNuevoRelacionesToolBarPosicionesBancarias;
	
	
	public JButton jButtonGuardarCambiosToolBarPosicionesBancarias;
	protected JButton jButtonCopiarToolBarPosicionesBancarias;
	protected JButton jButtonVerFormToolBarPosicionesBancarias;
	public JButton jButtonGuardarCambiosTablaToolBarPosicionesBancarias;
	protected JButton jButtonMostrarOcultarTablaToolBarPosicionesBancarias;
	protected JButton jButtonCerrarToolBarPosicionesBancarias;
	
	protected JButton jButtonRecargarInformacionToolBarPosicionesBancarias;
	protected JButton jButtonProcesarInformacionToolBarPosicionesBancarias;
	protected JButton jButtonAnterioresToolBarPosicionesBancarias;
	protected JButton jButtonSiguientesToolBarPosicionesBancarias;
	protected JButton jButtonNuevoGuardarCambiosToolBarPosicionesBancarias;
	protected JButton jButtonAbrirOrderByToolBarPosicionesBancarias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPosicionesBancarias;
	protected JMenuItem jMenuItemDuplicarPosicionesBancarias;
	protected JMenuItem jMenuItemNuevoRelacionesPosicionesBancarias;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPosicionesBancarias;
	protected JMenuItem jMenuItemCopiarPosicionesBancarias;
	protected JMenuItem jMenuItemVerFormPosicionesBancarias;
	protected JMenuItem jMenuItemGuardarCambiosTablaPosicionesBancarias;
	protected JMenuItem jMenuItemCerrarPosicionesBancarias;
	protected JMenuItem jMenuItemDetalleCerrarPosicionesBancarias;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPosicionesBancarias;
	protected JMenuItem jMenuItemDetalleMostarOcultarPosicionesBancarias;
	
	protected JMenuItem jMenuItemRecargarInformacionPosicionesBancarias;
	protected JMenuItem jMenuItemProcesarInformacionPosicionesBancarias;
	protected JMenuItem jMenuItemAnterioresPosicionesBancarias;
	protected JMenuItem jMenuItemSiguientesPosicionesBancarias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPosicionesBancarias;
	protected JMenuItem jMenuItemAbrirOrderByPosicionesBancarias;
	protected JMenuItem jMenuItemMostrarOcultarPosicionesBancarias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPosicionesBancarias;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPosicionesBancarias;
	protected JCheckBox jCheckBoxSeleccionadosPosicionesBancarias;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPosicionesBancarias;
	protected JCheckBox jCheckBoxConGraficoReportePosicionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPosicionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPosicionesBancarias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPosicionesBancarias;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPosicionesBancarias;
	protected JTextField jTextFieldValorCampoGeneralPosicionesBancarias;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePosicionesBancarias;
	//public JList<Reporte> jListColumnasSelectReportePosicionesBancarias;
	//public JScrollPane jScrollColumnasSelectReportePosicionesBancarias;
	
	//public JLabel jLabelRelacionesSelectReportePosicionesBancarias;
	//public JList<Reporte> jListRelacionesSelectReportePosicionesBancarias;
	//public JScrollPane jScrollRelacionesSelectReportePosicionesBancarias;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPosicionesBancarias;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPosicionesBancarias;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPosicionesBancarias;
	//public JLabel jLabelTiposArchivoReporteDinamicoPosicionesBancarias;
	
		
	//public JLabel jLabelArchivoImportacionPosicionesBancarias;	
	//public JLabel jLabelPathArchivoImportacionPosicionesBancarias;
	//protected JTextField jTextFieldPathArchivoImportacionPosicionesBancarias;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPosicionesBancarias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPosicionesBancarias;
	
	//public JLabel jLabelColumnaCategoriaValorPosicionesBancarias;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPosicionesBancarias;
	
	//public JLabel jLabelColumnasValoresGraficoPosicionesBancarias;
	//public JList<Reporte> jListColumnasValoresGraficoPosicionesBancarias;
	//public JScrollPane jScrollColumnasValoresGraficoPosicionesBancarias;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPosicionesBancarias;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPosicionesBancarias;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPosicionesBancarias;
	public JPanel jPanelBusquedaPosicionesBancariasPosicionesBancarias;
	public JButton jButtonBusquedaPosicionesBancariasPosicionesBancarias;
	
	public JPanel jPanelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias;
	public JLabel jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias;
	public JButton jButtonid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPosicionesBancariasPosicionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaPosicionesBancariasPosicionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias;
	public JLabel jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias;
	public JButton jButtonid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias;
	public JLabel jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias;

	public JDateChooser jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias;
	public JButton jButtonfecha_desdeBusquedaPosicionesBancariasPosicionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias;
	public JLabel jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias;

	public JDateChooser jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias;
	public JButton jButtonfecha_hastaBusquedaPosicionesBancariasPosicionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias;
	public JLabel jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias;
	public JTextField jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias;
	public JButton jButtonorden_desdeBusquedaPosicionesBancariasPosicionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias;
	public JLabel jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias;
	public JTextField jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias;
	public JButton jButtonorden_hastaBusquedaPosicionesBancariasPosicionesBancariasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PosicionesBancariasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PosicionesBancariasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PosicionesBancariasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PosicionesBancariasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPosicionesBancarias)	{
		this.jButtonRecargarInformacionPosicionesBancarias = jButtonRecargarInformacionPosicionesBancarias;
	}
	
	public JButton getjButtonProcesarInformacionPosicionesBancarias() {
		return this.jButtonProcesarInformacionPosicionesBancarias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPosicionesBancarias)	{
		this.jButtonProcesarInformacionPosicionesBancarias = jButtonProcesarInformacionPosicionesBancarias;
	}
	
	
	public JButton getjButtonRecargarInformacionPosicionesBancarias() {
		return this.jButtonRecargarInformacionPosicionesBancarias;
	}
	
	
	public List<PosicionesBancarias> getposicionesbancariass() {
		return this.posicionesbancariass;
	}

	public void setposicionesbancariass(List<PosicionesBancarias> posicionesbancariass) {
		this.posicionesbancariass = posicionesbancariass;
	}
	
	public List<PosicionesBancarias> getposicionesbancariassAux() {
		return this.posicionesbancariassAux;
	}

	public void setposicionesbancariassAux(List<PosicionesBancarias> posicionesbancariassAux) {
		this.posicionesbancariassAux = posicionesbancariassAux;
	}
	
	public List<PosicionesBancarias> getposicionesbancariassEliminados() {
		return this.posicionesbancariassEliminados;
	}

	public void setPosicionesBancariassEliminados(List<PosicionesBancarias> posicionesbancariassEliminados) {
		this.posicionesbancariassEliminados = posicionesbancariassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPosicionesBancarias() {
		return jComboBoxTiposSeleccionarPosicionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPosicionesBancarias(
			JComboBox jComboBoxTiposSeleccionarPosicionesBancarias) {
		this.jComboBoxTiposSeleccionarPosicionesBancarias = jComboBoxTiposSeleccionarPosicionesBancarias;
	}
	
	public void setBorderResaltarTiposSeleccionarPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPosicionesBancarias() {
		return jTextFieldValorCampoGeneralPosicionesBancarias;
	}

	public void setjTextFieldValorCampoGeneralPosicionesBancarias(
			JTextField jTextFieldValorCampoGeneralPosicionesBancarias) {
		this.jTextFieldValorCampoGeneralPosicionesBancarias = jTextFieldValorCampoGeneralPosicionesBancarias;
	}

	public void setBorderResaltarValorCampoGeneralPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPosicionesBancarias .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPosicionesBancarias() {
		return this.jCheckBoxSeleccionarTodosPosicionesBancarias;
	}

	public void setjCheckBoxSeleccionarTodosPosicionesBancarias(
			JCheckBox jCheckBoxSeleccionarTodosPosicionesBancarias) {
		this.jCheckBoxSeleccionarTodosPosicionesBancarias = jCheckBoxSeleccionarTodosPosicionesBancarias;
	}

	public void setBorderResaltarSeleccionarTodosPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPosicionesBancarias() {
		return this.jCheckBoxSeleccionadosPosicionesBancarias;
	}

	public void setjCheckBoxSeleccionadosPosicionesBancarias(
			JCheckBox jCheckBoxSeleccionadosPosicionesBancarias) {
		this.jCheckBoxSeleccionadosPosicionesBancarias = jCheckBoxSeleccionadosPosicionesBancarias;
	}
	
	public void setBorderResaltarSeleccionadosPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPosicionesBancarias() {
		return this.jComboBoxTiposArchivosReportesPosicionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPosicionesBancarias(
			JComboBox jComboBoxTiposArchivosReportesPosicionesBancarias) {
		this.jComboBoxTiposArchivosReportesPosicionesBancarias = jComboBoxTiposArchivosReportesPosicionesBancarias;
	}

	public void setBorderResaltarTiposArchivosReportesPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPosicionesBancarias() {
		return this.jComboBoxTiposReportesPosicionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPosicionesBancarias(
			JComboBox jComboBoxTiposReportesPosicionesBancarias) {
		this.jComboBoxTiposReportesPosicionesBancarias = jComboBoxTiposReportesPosicionesBancarias;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPosicionesBancarias() {
	//	return jComboBoxTiposReportesDinamicoPosicionesBancarias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPosicionesBancarias(
	//		JComboBox jComboBoxTiposReportesDinamicoPosicionesBancarias) {
	//	this.jComboBoxTiposReportesDinamicoPosicionesBancarias = jComboBoxTiposReportesDinamicoPosicionesBancarias;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPosicionesBancarias() {
	//	return jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPosicionesBancarias(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias = jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias;
	//}
	
	public void setBorderResaltarTiposReportesPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPosicionesBancarias() {
		return this.jComboBoxTiposGraficosReportesPosicionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPosicionesBancarias(
			JComboBox jComboBoxTiposGraficosReportesPosicionesBancarias) {
		this.jComboBoxTiposGraficosReportesPosicionesBancarias = jComboBoxTiposGraficosReportesPosicionesBancarias;
	}
	
	public void setBorderResaltarTiposGraficosReportesPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPosicionesBancarias() {
		return this.jComboBoxTiposPaginacionPosicionesBancarias;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPosicionesBancarias(
			JComboBox jComboBoxTiposPaginacionPosicionesBancarias) {
		this.jComboBoxTiposPaginacionPosicionesBancarias = jComboBoxTiposPaginacionPosicionesBancarias;
	}
	
	public void setBorderResaltarTiposPaginacionPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPosicionesBancarias() {
		return this.jComboBoxTiposRelacionesPosicionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPosicionesBancarias() {
		return this.jComboBoxTiposAccionesPosicionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPosicionesBancarias(
			JComboBox jComboBoxTiposRelacionesPosicionesBancarias) {
		this.jComboBoxTiposRelacionesPosicionesBancarias = jComboBoxTiposRelacionesPosicionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPosicionesBancarias(
			JComboBox jComboBoxTiposAccionesPosicionesBancarias) {
		this.jComboBoxTiposAccionesPosicionesBancarias = jComboBoxTiposAccionesPosicionesBancarias;
	}
	
	public void setBorderResaltarTiposRelacionesPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPosicionesBancarias() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPosicionesBancarias .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPosicionesBancarias() {
	//	return jCheckBoxConGraficoDinamicoPosicionesBancarias;
	//}

	//public void setjCheckBoxConGraficoDinamicoPosicionesBancarias(
	//		JCheckBox jCheckBoxConGraficoDinamicoPosicionesBancarias) {
	//	this.jCheckBoxConGraficoDinamicoPosicionesBancarias = jCheckBoxConGraficoDinamicoPosicionesBancarias;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPosicionesBancarias() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPosicionesBancarias.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPosicionesBancarias .setBorder(borderResaltar);		
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
		this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
		
		this.posicionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.posicionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.posicionesbancariasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PosicionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PosicionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PosicionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PosicionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PosicionesBancariasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Posiciones Bancarias MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
		
		PosicionesBancariasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPosicionesBancarias= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"nuevo","nuevo","Nuevo"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"duplicar","duplicar","Duplicar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"copiar","copiar","Copiar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"ver_form","ver_form","Ver"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"recargar","recargar","Buscar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPosicionesBancarias,this.jTtoolBarPosicionesBancarias,
							"cerrar","cerrar","Salir"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPosicionesBancarias=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPosicionesBancarias;
			
				this.jButtonProcesarInformacionToolBarPosicionesBancarias=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPosicionesBancarias;
				
		//protected JButton jButtonModificarToolBarPosicionesBancarias;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPosicionesBancarias=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPosicionesBancarias=new JMenuMe("General");
		this.jmenuArchivoPosicionesBancarias=new JMenuMe("Archivo");
		this.jmenuAccionesPosicionesBancarias=new JMenuMe("Acciones");
		this.jmenuDatosPosicionesBancarias=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPosicionesBancarias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPosicionesBancarias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPosicionesBancarias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPosicionesBancarias= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPosicionesBancarias.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPosicionesBancarias,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPosicionesBancarias= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPosicionesBancarias.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPosicionesBancarias,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPosicionesBancarias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPosicionesBancarias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPosicionesBancarias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPosicionesBancarias= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPosicionesBancarias.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPosicionesBancarias,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPosicionesBancarias= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPosicionesBancarias.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPosicionesBancarias,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPosicionesBancarias= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPosicionesBancarias.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPosicionesBancarias,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPosicionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPosicionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPosicionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPosicionesBancarias= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPosicionesBancarias.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPosicionesBancarias,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPosicionesBancarias= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPosicionesBancarias.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPosicionesBancarias,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPosicionesBancarias= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPosicionesBancarias.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPosicionesBancarias,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPosicionesBancarias= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPosicionesBancarias.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPosicionesBancarias,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPosicionesBancarias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPosicionesBancarias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPosicionesBancarias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPosicionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPosicionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPosicionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPosicionesBancarias= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPosicionesBancarias.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPosicionesBancarias,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPosicionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPosicionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPosicionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPosicionesBancarias= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPosicionesBancarias.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPosicionesBancarias,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPosicionesBancarias.add(this.jMenuItemCerrarPosicionesBancarias);
			
			this.jmenuAccionesPosicionesBancarias.add(this.jMenuItemNuevoPosicionesBancarias);
			this.jmenuAccionesPosicionesBancarias.add(this.jMenuItemNuevoGuardarCambiosPosicionesBancarias);
			this.jmenuAccionesPosicionesBancarias.add(this.jMenuItemNuevoRelacionesPosicionesBancarias);
			this.jmenuAccionesPosicionesBancarias.add(this.jMenuItemGuardarCambiosTablaPosicionesBancarias);		
			this.jmenuAccionesPosicionesBancarias.add(this.jMenuItemDuplicarPosicionesBancarias);		
			this.jmenuAccionesPosicionesBancarias.add(this.jMenuItemCopiarPosicionesBancarias);		
			this.jmenuAccionesPosicionesBancarias.add(this.jMenuItemVerFormPosicionesBancarias);		
			
			this.jmenuDatosPosicionesBancarias.add(this.jMenuItemRecargarInformacionPosicionesBancarias);				
			this.jmenuDatosPosicionesBancarias.add(this.jMenuItemAnterioresPosicionesBancarias);				
			this.jmenuDatosPosicionesBancarias.add(this.jMenuItemSiguientesPosicionesBancarias);				
			this.jmenuDatosPosicionesBancarias.add(this.jMenuItemAbrirOrderByPosicionesBancarias);				
			this.jmenuDatosPosicionesBancarias.add(this.jMenuItemMostrarOcultarPosicionesBancarias);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPosicionesBancarias.add(this.jMenuItemGuardarCambiosPosicionesBancarias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPosicionesBancarias.add(this.jmenuArchivoPosicionesBancarias);		
			this.jmenuBarPosicionesBancarias.add(this.jmenuAccionesPosicionesBancarias);		
			this.jmenuBarPosicionesBancarias.add(this.jmenuDatosPosicionesBancarias);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPosicionesBancarias);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPosicionesBancarias() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPosicionesBancariasPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta Por Orden Desde Por Orden Hasta ");
		this.jButtonBusquedaPosicionesBancariasPosicionesBancarias= new JButtonMe();
		this.jButtonBusquedaPosicionesBancariasPosicionesBancarias.setText("Buscar");
		this.jButtonBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta Por Orden Desde Por Orden Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPosicionesBancariasPosicionesBancarias,"buscar_button","Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta Por Orden Desde Por Orden Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPosicionesBancariasPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias = new JLabelMe();
		jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias = new JLabelMe();
		jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setText("Tipo Movimiento Base :");
		jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Tipo Movimiento Base");
		jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias = new JLabelMe();
		jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias= new JDateChooser();
		jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setDate(new Date());
		jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias = new JLabelMe();
		jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias= new JDateChooser();
		jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setDate(new Date());
		jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias = new JLabelMe();
		jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setText("Orden Desde :");
		jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Orden Desde");
		jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias= new JTextFieldMe();
		jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias.setText("0");



	
		jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias = new JLabelMe();
		jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setText("Orden Hasta :");
		jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setToolTipText("Orden Hasta");
		jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias= new JTextFieldMe();
		jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias.setText("0");




		this.jTabbedPaneBusquedasPosicionesBancarias=new JTabbedPane();


		this.jTabbedPaneBusquedasPosicionesBancarias.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasPosicionesBancarias.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasPosicionesBancarias.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePosicionesBancarias = new PosicionesBancariasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Posiciones Bancarias DATOS");
			this.jInternalFrameDetalleFormPosicionesBancarias = new PosicionesBancariasDetalleFormJInternalFrame(jDesktopPane,this.posicionesbancariasSessionBean.getConGuardarRelaciones(),this.posicionesbancariasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPosicionesBancarias = null;//new PosicionesBancariasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPosicionesBancarias= new GridBagLayout();
		
		
		this.jTableDatosPosicionesBancarias = new JTableMe();      
		
		String sToolTipPosicionesBancarias="";
		sToolTipPosicionesBancarias=PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPosicionesBancarias+="(Tesoreria.PosicionesBancarias)";
		}
		
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPosicionesBancarias+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPosicionesBancarias.setToolTipText(sToolTipPosicionesBancarias);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPosicionesBancarias);
		this.jTableDatosPosicionesBancarias.setAutoCreateRowSorter(true);
		this.jTableDatosPosicionesBancarias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPosicionesBancarias.setRowSelectionAllowed(true);
		this.jTableDatosPosicionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPosicionesBancarias = new JButtonMe();
		this.jButtonDuplicarPosicionesBancarias = new JButtonMe();
		this.jButtonCopiarPosicionesBancarias = new JButtonMe();
		this.jButtonVerFormPosicionesBancarias = new JButtonMe();
		this.jButtonNuevoRelacionesPosicionesBancarias = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias = new JButtonMe();
		this.jButtonCerrarPosicionesBancarias = new JButtonMe();
		
		this.jScrollPanelDatosPosicionesBancarias = new JScrollPane();   
        this.jScrollPanelDatosGeneralPosicionesBancarias = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Posiciones Bancarias";
		
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Posiciones Bancariases" + this.sPath));
		} else {
			this.jScrollPanelDatosPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPosicionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesPosicionesBancarias.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPosicionesBancarias=new ReporteDinamicoJInternalFrame(PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPosicionesBancarias();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPosicionesBancarias=new ImportacionJInternalFrame(PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPosicionesBancarias();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPosicionesBancarias = new JButtonMe();
		
		this.jButtonAbrirOrderByPosicionesBancarias.setText("Orden");
		this.jButtonAbrirOrderByPosicionesBancarias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPosicionesBancarias,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPosicionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPosicionesBancarias,false,this);
			
			//this.cargarOrderByPosicionesBancarias(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPosicionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPosicionesBancarias,true,this);
			
			//this.cargarOrderByPosicionesBancarias(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPosicionesBancarias.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosPosicionesBancarias.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosPosicionesBancarias.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosPosicionesBancarias.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPosicionesBancarias.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPosicionesBancarias.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPosicionesBancarias.setText("Nuevo");
		this.jButtonDuplicarPosicionesBancarias.setText("Duplicar");
		this.jButtonCopiarPosicionesBancarias.setText("Copiar");
		this.jButtonVerFormPosicionesBancarias.setText("Ver");
		this.jButtonNuevoRelacionesPosicionesBancarias.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias.setText("Guardar");
		this.jButtonCerrarPosicionesBancarias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPosicionesBancarias,"nuevo_button","Nuevo",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPosicionesBancarias,"duplicar_button","Duplicar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPosicionesBancarias,"copiar_button","Copiar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPosicionesBancarias,"ver_form","Ver",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPosicionesBancarias,"nuevorelaciones_button","Nuevo Rel",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPosicionesBancarias,"guardarcambiostabla_button","Guardar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPosicionesBancarias,"cerrar_button","Salir",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPosicionesBancarias.setToolTipText("Nuevo"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPosicionesBancarias.setToolTipText("Duplicar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPosicionesBancarias.setToolTipText("Copiar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPosicionesBancarias.setToolTipText("Ver"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPosicionesBancarias.setToolTipText("Nuevo Rel"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias.setToolTipText("Guardar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPosicionesBancarias.setToolTipText("Salir"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPosicionesBancarias";
		inputMap = this.jButtonNuevoPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPosicionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPosicionesBancarias"));
		
		//DUPLICAR
		sMapKey = "DuplicarPosicionesBancarias";
		inputMap = this.jButtonDuplicarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPosicionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPosicionesBancarias"));
		
		//COPIAR
		sMapKey = "CopiarPosicionesBancarias";
		inputMap = this.jButtonCopiarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPosicionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPosicionesBancarias"));
		
		//VEr FORM
		sMapKey = "VerFormPosicionesBancarias";
		inputMap = this.jButtonVerFormPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPosicionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPosicionesBancarias"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPosicionesBancarias";
		inputMap = this.jButtonNuevoRelacionesPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPosicionesBancarias"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPosicionesBancarias";
		inputMap = this.jButtonModificarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPosicionesBancarias"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPosicionesBancarias";
		inputMap = this.jButtonCerrarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPosicionesBancarias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPosicionesBancarias";
		inputMap = this.jButtonGuardarCambiosTablaPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPosicionesBancarias"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PosicionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PosicionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PosicionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PosicionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PosicionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPosicionesBancarias.setName("jPanelParametrosReportesPosicionesBancarias"); 
		
		this.jPanelParametrosReportesAccionesPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPosicionesBancarias.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPosicionesBancarias.setName("jPanelParametrosReportesAccionesPosicionesBancarias"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPosicionesBancarias = new JButtonMe();
		this.jButtonRecargarInformacionPosicionesBancarias.setText("Buscar");
		this.jButtonRecargarInformacionPosicionesBancarias.setToolTipText("Buscar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPosicionesBancarias,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPosicionesBancarias.setVisible(false);
		
		
		this.jButtonProcesarInformacionPosicionesBancarias = new JButtonMe();
		this.jButtonProcesarInformacionPosicionesBancarias.setText("Procesar");
		this.jButtonProcesarInformacionPosicionesBancarias.setToolTipText("Procesar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPosicionesBancarias.setVisible(false);
			
		this.jButtonProcesarInformacionPosicionesBancarias.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPosicionesBancarias.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPosicionesBancarias.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPosicionesBancarias.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPosicionesBancarias.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPosicionesBancarias.setText("TIPO");       
		this.jComboBoxTiposReportesPosicionesBancarias.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPosicionesBancarias.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPosicionesBancarias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPosicionesBancarias.setText("Paginacion");
		this.jComboBoxTiposPaginacionPosicionesBancarias.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPosicionesBancarias.setText("Accion");
		this.jComboBoxTiposRelacionesPosicionesBancarias.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPosicionesBancarias.setText("Accion");
		this.jComboBoxTiposAccionesPosicionesBancarias.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPosicionesBancarias.setText("Accion");
		this.jComboBoxTiposSeleccionarPosicionesBancarias.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPosicionesBancarias=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPosicionesBancarias.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPosicionesBancarias.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPosicionesBancarias.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPosicionesBancarias = new JLabelMe();
		
		this.jLabelAccionesPosicionesBancarias.setText("Acciones");		
		this.jLabelAccionesPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPosicionesBancarias = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPosicionesBancarias.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPosicionesBancarias.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPosicionesBancarias = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPosicionesBancarias.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPosicionesBancarias.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPosicionesBancarias = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPosicionesBancarias.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPosicionesBancarias.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePosicionesBancarias = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePosicionesBancarias.setText("Graf.");
		this.jCheckBoxConGraficoReportePosicionesBancarias.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPosicionesBancarias = new JButtonMe();
		//this.jButtonAnterioresPosicionesBancarias.setText("<<");
        this.jButtonAnterioresPosicionesBancarias.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPosicionesBancarias,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPosicionesBancarias = new JButtonMe();
		//this.jButtonSiguientesPosicionesBancarias.setText(">>");
        this.jButtonSiguientesPosicionesBancarias.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPosicionesBancarias,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPosicionesBancarias = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPosicionesBancarias.setText("Nue");
        this.jButtonNuevoGuardarCambiosPosicionesBancarias.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPosicionesBancarias,"nuevoguardarcambios_button","Nue",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPosicionesBancarias";
		inputMap = this.jButtonNuevoGuardarCambiosPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPosicionesBancarias"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPosicionesBancarias";
		inputMap = this.jButtonRecargarInformacionPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPosicionesBancarias"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPosicionesBancarias";
		inputMap = this.jButtonSiguientesPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPosicionesBancarias"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPosicionesBancarias";
		inputMap = this.jButtonAnterioresPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPosicionesBancarias"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPosicionesBancarias();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPosicionesBancarias.setMinimumSize(new Dimension(this.getWidth(),PosicionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PosicionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPosicionesBancarias.setMaximumSize(new Dimension(this.getWidth(),PosicionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PosicionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPosicionesBancarias.setPreferredSize(new Dimension(this.getWidth(),PosicionesBancariasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PosicionesBancariasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPosicionesBancarias = new GridBagLayout();

			this.jPanelPaginacionPosicionesBancarias.setLayout(gridaBagLayoutPaginacionPosicionesBancarias);						
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = 0;
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonAnterioresPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
					
						
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPosicionesBancarias.gridy = 0;
			
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonNuevoGuardarCambiosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
						
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPosicionesBancarias.gridy = 0;
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonSiguientesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = 1;
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonNuevoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
						
			
			
			if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPosicionesBancarias.gridy = 1;
				this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPosicionesBancarias.add(this.jButtonGuardarCambiosTablaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			}
			
			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = 1;
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonDuplicarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = 1;
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonCopiarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = 1;
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonVerFormPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = 1;
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPosicionesBancarias.add(this.jButtonCerrarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		
		this.jButtonRecargarInformacionPosicionesBancarias.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPosicionesBancarias.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPosicionesBancarias.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPosicionesBancarias.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPosicionesBancarias.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPosicionesBancarias.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPosicionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPosicionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPosicionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPosicionesBancarias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPosicionesBancarias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPosicionesBancarias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPosicionesBancarias.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPosicionesBancarias.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPosicionesBancarias.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPosicionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPosicionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPosicionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPosicionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPosicionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPosicionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPosicionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPosicionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPosicionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPosicionesBancarias.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPosicionesBancarias.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPosicionesBancarias.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePosicionesBancarias.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePosicionesBancarias.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePosicionesBancarias.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPosicionesBancarias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPosicionesBancarias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPosicionesBancarias.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPosicionesBancarias.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPosicionesBancarias.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPosicionesBancarias.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPosicionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPosicionesBancarias = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PosicionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PosicionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PosicionesBancarias = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PosicionesBancarias = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPosicionesBancarias.setLayout(gridaBagParametrosReportesPosicionesBancarias);
			this.jPanelParametrosReportesAccionesPosicionesBancarias.setLayout(gridaBagParametrosReportesAccionesPosicionesBancarias);
			
			
			this.jPanelParametrosAuxiliar1PosicionesBancarias.setLayout(gridaBagParametrosAuxiliar1PosicionesBancarias);
			this.jPanelParametrosAuxiliar2PosicionesBancarias.setLayout(gridaBagParametrosAuxiliar2PosicionesBancarias);
			this.jPanelParametrosAuxiliar3PosicionesBancarias.setLayout(gridaBagParametrosAuxiliar3PosicionesBancarias);
			this.jPanelParametrosAuxiliar4PosicionesBancarias.setLayout(gridaBagParametrosAuxiliar4PosicionesBancarias);
			//this.jPanelParametrosAuxiliar5PosicionesBancarias.setLayout(gridaBagParametrosAuxiliar2PosicionesBancarias);			
			
			
			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jButtonRecargarInformacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PosicionesBancarias.add(this.jComboBoxTiposPaginacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PosicionesBancarias.add(this.jCheckBoxConAltoMaximoTablaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PosicionesBancarias.add(this.jComboBoxTiposArchivosReportesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jPanelParametrosAuxiliar1PosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PosicionesBancarias.add(this.jComboBoxTiposReportesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);																		
			
			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PosicionesBancarias.add(this.jComboBoxTiposGraficosReportesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jPanelParametrosAuxiliar4PosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jComboBoxTiposReportesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jCheckBoxGenerarReportePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jPanelParametrosAuxiliar2PosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jLabelAccionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPosicionesBancarias.add(this.jButtonAbrirOrderByPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jComboBoxTiposSeleccionarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
			
			
			/*
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jCheckBoxSeleccionarTodosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jCheckBoxConGraficoReportePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PosicionesBancarias.add(this.jCheckBoxSeleccionarTodosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);															
				
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PosicionesBancarias.add(this.jCheckBoxSeleccionadosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);															
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPosicionesBancarias.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PosicionesBancarias.add(this.jCheckBoxConGraficoReportePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jPanelParametrosAuxiliar3PosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPosicionesBancarias.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPosicionesBancarias.add(this.jComboBoxTiposAccionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPosicionesBancarias = new GridBagLayout();

			this.jScrollPanelDatosPosicionesBancarias.setLayout(gridaBagLayoutDatosPosicionesBancarias);
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = 0;
			this.gridBagConstraintsPosicionesBancarias.gridx = 0;
			
			this.jScrollPanelDatosPosicionesBancarias.add(this.jTableDatosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPosicionesBancarias.setViewportView(this.jTableDatosPosicionesBancarias);
		this.jTableDatosPosicionesBancarias.setFillsViewportHeight(true);
		this.jTableDatosPosicionesBancarias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPosicionesBancarias= new GridBagLayout();
		this.jPanelAccionesPosicionesBancarias.setLayout(gridaBagLayoutAccionesPosicionesBancarias);
		
		
		/*	
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
			
		this.jPanelAccionesPosicionesBancarias.add(this.jButtonNuevoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPosicionesBancariasPosicionesBancarias= new GridBagLayout();
		gridaBagLayoutBusquedaPosicionesBancariasPosicionesBancarias.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPosicionesBancariasPosicionesBancarias.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPosicionesBancariasPosicionesBancarias.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPosicionesBancariasPosicionesBancarias.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.setLayout(gridaBagLayoutBusquedaPosicionesBancariasPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 0;
		gridBagConstraintsPosicionesBancarias.gridx = 0;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jLabelid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 0;
		gridBagConstraintsPosicionesBancarias.gridx = 1;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jComboBoxid_ejercicioBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);


		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 1;
		gridBagConstraintsPosicionesBancarias.gridx = 0;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jLabelid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 1;
		gridBagConstraintsPosicionesBancarias.gridx = 1;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jComboBoxid_tipo_movimientoBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);


		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 2;
		gridBagConstraintsPosicionesBancarias.gridx = 0;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jLabelfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 2;
		gridBagConstraintsPosicionesBancarias.gridx = 1;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jDateChooserfecha_desdeBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);


		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 3;
		gridBagConstraintsPosicionesBancarias.gridx = 0;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jLabelfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 3;
		gridBagConstraintsPosicionesBancarias.gridx = 1;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jDateChooserfecha_hastaBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);


		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 4;
		gridBagConstraintsPosicionesBancarias.gridx = 0;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jLabelorden_desdeBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 4;
		gridBagConstraintsPosicionesBancarias.gridx = 1;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jTextFieldorden_desdeBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);


		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 5;
		gridBagConstraintsPosicionesBancarias.gridx = 0;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jLabelorden_hastaBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 5;
		gridBagConstraintsPosicionesBancarias.gridx = 1;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jTextFieldorden_hastaBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPosicionesBancarias.gridy = 6;
		gridBagConstraintsPosicionesBancarias.gridx =1;
		jPanelBusquedaPosicionesBancariasPosicionesBancarias.add(jButtonBusquedaPosicionesBancariasPosicionesBancarias, gridBagConstraintsPosicionesBancarias);

		jTabbedPaneBusquedasPosicionesBancarias.addTab("1.-Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta Por Orden Desde Por Orden Hasta ", jPanelBusquedaPosicionesBancariasPosicionesBancarias);
		jTabbedPaneBusquedasPosicionesBancarias.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPosicionesBancarias);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();						
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPosicionesBancarias.gridx = 0;		
			//this.gridBagConstraintsPosicionesBancarias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPosicionesBancarias.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;		
		//this.gridBagConstraintsPosicionesBancarias.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPosicionesBancarias);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPosicionesBancarias.gridx = 0;		
			this.gridBagConstraintsPosicionesBancarias.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPosicionesBancarias.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);								
		
		
		/*
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		*/		
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPosicionesBancarias.gridx =0;
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPosicionesBancarias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
				
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPosicionesBancarias= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPosicionesBancarias = new GridBagLayout();
			this.jPanelBusquedasParametrosPosicionesBancarias.setLayout(gridaBagLayoutBusquedasParametrosPosicionesBancarias);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPosicionesBancarias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPosicionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPosicionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPosicionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			
			
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
			
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPosicionesBancarias;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPosicionesBancarias() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPosicionesBancarias = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPosicionesBancarias.setName("jPanelReporteDinamicoPosicionesBancarias"); 
		
		this.jPanelReporteDinamicoPosicionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPosicionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPosicionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPosicionesBancarias.setLayout(gridaBagLayoutReporteDinamicoPosicionesBancarias);
		
		
		this.jInternalFrameReporteDinamicoPosicionesBancarias= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPosicionesBancarias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePosicionesBancarias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPosicionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPosicionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPosicionesBancarias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPosicionesBancarias.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPosicionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPosicionesBancarias.setResizable(true);
	    this.jInternalFrameReporteDinamicoPosicionesBancarias.setClosable(true);
	    this.jInternalFrameReporteDinamicoPosicionesBancarias.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPosicionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPosicionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPosicionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Posiciones Bancariases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePosicionesBancarias = new JLabelMe();

		this.jLabelColumnasSelectReportePosicionesBancarias.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelColumnasSelectReportePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePosicionesBancarias = new JList<Reporte>();
		this.jListColumnasSelectReportePosicionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePosicionesBancarias.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePosicionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePosicionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePosicionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePosicionesBancarias=new JScrollPane(this.jListColumnasSelectReportePosicionesBancarias);
			
			this.jScrollColumnasSelectReportePosicionesBancarias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePosicionesBancarias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePosicionesBancarias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPosicionesBancarias.add(this.jListColumnasSelectReportePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jScrollColumnasSelectReportePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePosicionesBancarias = new JLabelMe();

		this.jLabelRelacionesSelectReportePosicionesBancarias.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePosicionesBancarias = new JList<Reporte>();
		this.jListRelacionesSelectReportePosicionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePosicionesBancarias.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePosicionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePosicionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePosicionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePosicionesBancarias=new JScrollPane(this.jListRelacionesSelectReportePosicionesBancarias);
			
			this.jScrollRelacionesSelectReportePosicionesBancarias.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePosicionesBancarias.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePosicionesBancarias.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPosicionesBancarias = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias = new JComboBoxMe();
		this.jListColumnasValoresGraficoPosicionesBancarias = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPosicionesBancarias = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPosicionesBancarias.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPosicionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPosicionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPosicionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPosicionesBancarias = new JLabelMe();

		this.jLabelConGraficoDinamicoPosicionesBancarias.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelConGraficoDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPosicionesBancarias = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPosicionesBancarias.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPosicionesBancarias.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPosicionesBancarias.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPosicionesBancarias.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPosicionesBancarias.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jCheckBoxConGraficoDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPosicionesBancarias = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPosicionesBancarias.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelColumnaCategoriaGraficoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPosicionesBancarias = new JLabelMe();

		this.jLabelColumnaCategoriaValorPosicionesBancarias.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelColumnaCategoriaValorPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPosicionesBancarias.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPosicionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPosicionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPosicionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPosicionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jComboBoxColumnaCategoriaValorPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPosicionesBancarias = new JLabelMe();

		this.jLabelColumnasValoresGraficoPosicionesBancarias.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelColumnasValoresGraficoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPosicionesBancarias = new JList<Reporte>();
		this.jListColumnasValoresGraficoPosicionesBancarias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPosicionesBancarias.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPosicionesBancarias.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPosicionesBancarias.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPosicionesBancarias.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPosicionesBancarias=new JScrollPane(this.jListColumnasValoresGraficoPosicionesBancarias);
			
			this.jScrollColumnasValoresGraficoPosicionesBancarias.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPosicionesBancarias.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPosicionesBancarias.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPosicionesBancarias.add(this.jListColumnasSelectReportePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jScrollColumnasValoresGraficoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPosicionesBancarias = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPosicionesBancarias.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelTiposGraficosReportesDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPosicionesBancarias.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPosicionesBancarias.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPosicionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPosicionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPosicionesBancarias.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jComboBoxTiposGraficosReportesDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPosicionesBancarias = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPosicionesBancarias.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelGenerarExcelReporteDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPosicionesBancarias = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPosicionesBancarias.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPosicionesBancarias,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPosicionesBancarias.setToolTipText("Generar EXCEL"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPosicionesBancarias.add(this.jButtonGenerarExcelReporteDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jComboBoxTiposReportesDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPosicionesBancarias = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPosicionesBancarias.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jLabelTiposArchivoReporteDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jComboBoxTiposArchivosReportesDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPosicionesBancarias = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPosicionesBancarias.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPosicionesBancarias,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPosicionesBancarias.setToolTipText("Generar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jButtonGenerarReporteDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPosicionesBancarias = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPosicionesBancarias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPosicionesBancarias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPosicionesBancarias.setToolTipText("Cancelar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPosicionesBancarias.add(this.jButtonCerrarReporteDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPosicionesBancarias = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPosicionesBancarias= new JScrollPane(jPanelReporteDinamicoPosicionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPosicionesBancarias.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPosicionesBancarias.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPosicionesBancarias.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Posiciones Bancariases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPosicionesBancarias.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPosicionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPosicionesBancarias.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPosicionesBancarias);
		this.jInternalFrameReporteDinamicoPosicionesBancarias.getContentPane().add(this.jScrollPanelReporteDinamicoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPosicionesBancarias() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPosicionesBancarias = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPosicionesBancarias.setName("jPanelImportacionPosicionesBancarias"); 
		
		this.jPanelImportacionPosicionesBancarias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPosicionesBancarias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPosicionesBancarias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPosicionesBancarias.setLayout(gridaBagLayoutImportacionPosicionesBancarias);
		
		
		this.jInternalFrameImportacionPosicionesBancarias= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPosicionesBancarias= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPosicionesBancarias = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePosicionesBancarias= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPosicionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPosicionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPosicionesBancarias.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPosicionesBancarias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPosicionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPosicionesBancarias.setResizable(true);
	    this.jInternalFrameImportacionPosicionesBancarias.setClosable(true);
	    this.jInternalFrameImportacionPosicionesBancarias.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPosicionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPosicionesBancarias.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPosicionesBancarias.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPosicionesBancarias.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPosicionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPosicionesBancarias.setResizable(true);
	    this.jInternalFrameImportacionPosicionesBancarias.setClosable(true);
	    this.jInternalFrameImportacionPosicionesBancarias.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPosicionesBancarias.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPosicionesBancarias.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPosicionesBancarias.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Posiciones Bancariases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPosicionesBancarias = new JLabelMe();

		this.jLabelArchivoImportacionPosicionesBancarias.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYImportacion;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPosicionesBancarias.add(this.jLabelArchivoImportacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPosicionesBancarias = new JFileChooser();		
		this.jFileChooserImportacionPosicionesBancarias.setToolTipText("ESCOGER ARCHIVO"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPosicionesBancarias = new JButtonMe();
		this.jButtonAbrirImportacionPosicionesBancarias.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPosicionesBancarias,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPosicionesBancarias.setToolTipText("Generar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPosicionesBancarias.add(this.jButtonAbrirImportacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPosicionesBancarias = new JLabelMe();

		this.jLabelPathArchivoImportacionPosicionesBancarias.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYImportacion;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPosicionesBancarias.add(this.jLabelPathArchivoImportacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPosicionesBancarias=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPosicionesBancarias.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPosicionesBancarias.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPosicionesBancarias.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPosicionesBancarias.add(this.jTextFieldPathArchivoImportacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPosicionesBancarias = new JButtonMe();
		this.jButtonGenerarImportacionPosicionesBancarias.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPosicionesBancarias,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPosicionesBancarias.setToolTipText("Generar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPosicionesBancarias.add(this.jButtonGenerarImportacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPosicionesBancarias = new JButtonMe();
		this.jButtonCerrarImportacionPosicionesBancarias.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPosicionesBancarias,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPosicionesBancarias.setToolTipText("Cancelar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = iPosYImportacion;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPosicionesBancarias.add(this.jButtonCerrarImportacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPosicionesBancarias = new GridBagLayout();
		
		this.jScrollPanelImportacionPosicionesBancarias= new JScrollPane(jPanelImportacionPosicionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy =iPosYImportacion;
		this.gridBagConstraintsPosicionesBancarias.gridx =iPosXImportacion;
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPosicionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPosicionesBancarias.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPosicionesBancarias);
		this.jInternalFrameImportacionPosicionesBancarias.getContentPane().add(this.jScrollPanelImportacionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPosicionesBancarias(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPosicionesBancarias = new JButtonMe();
			this.jButtonAbrirOrderByPosicionesBancarias.setText("Orden");
			this.jButtonAbrirOrderByPosicionesBancarias.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPosicionesBancarias,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPosicionesBancarias";
			inputMap = this.jButtonAbrirOrderByPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPosicionesBancarias"));
		
		
			GridBagLayout gridaBagLayoutOrderByPosicionesBancarias = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPosicionesBancarias.setName("jPanelOrderByPosicionesBancarias"); 
			
			this.jPanelOrderByPosicionesBancarias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPosicionesBancarias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPosicionesBancarias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPosicionesBancarias.setLayout(gridaBagLayoutOrderByPosicionesBancarias);
			
			
			this.jTableDatosPosicionesBancariasOrderBy = new JTableMe();        
			this.jTableDatosPosicionesBancariasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPosicionesBancariasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPosicionesBancariasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPosicionesBancariasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPosicionesBancariasOrderBy.setViewportView(this.jTableDatosPosicionesBancariasOrderBy);
			this.jTableDatosPosicionesBancariasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPosicionesBancariasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPosicionesBancarias= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPosicionesBancarias= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPosicionesBancarias = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePosicionesBancarias= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPosicionesBancarias.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPosicionesBancarias.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPosicionesBancarias.setTitle("Orden");
			this.jInternalFrameOrderByPosicionesBancarias.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPosicionesBancarias.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPosicionesBancarias.setResizable(true);
			this.jInternalFrameOrderByPosicionesBancarias.setClosable(true);
			this.jInternalFrameOrderByPosicionesBancarias.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPosicionesBancarias.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPosicionesBancarias.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPosicionesBancarias.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Posiciones Bancariases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPosicionesBancarias.gridx =iPosXOrderBy;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPosicionesBancarias.ipady =150;
				
			this.jPanelOrderByPosicionesBancarias.add(jScrollPanelDatosPosicionesBancariasOrderBy, this.gridBagConstraintsPosicionesBancarias);//this.jTableDatosPosicionesBancariasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPosicionesBancarias = new JButtonMe();
			this.jButtonCerrarOrderByPosicionesBancarias.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPosicionesBancarias,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPosicionesBancarias.setToolTipText("Cancelar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPosicionesBancarias.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPosicionesBancarias.add(this.jButtonCerrarOrderByPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPosicionesBancarias = new GridBagLayout();
			
			this.jScrollPanelOrderByPosicionesBancarias= new JScrollPane(jPanelOrderByPosicionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridy =iPosYOrderBy;
			this.gridBagConstraintsPosicionesBancarias.gridx =iPosXOrderBy;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPosicionesBancarias.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPosicionesBancarias.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPosicionesBancarias);
			
			this.jInternalFrameOrderByPosicionesBancarias.getContentPane().add(this.jScrollPanelOrderByPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
		
		} else {
			this.jButtonAbrirOrderByPosicionesBancarias = new JButtonMe();
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
		int iWidthTableCalculado=0;//3230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.posicionesbancariasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPosicionesBancarias.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPosicionesBancarias.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPosicionesBancarias.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPosicionesBancarias.getRowHeight();//PosicionesBancariasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPosicionesBancarias.isSelected()) {
					iHeightTable=PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPosicionesBancarias.isSelected()) {
					iHeightTable=PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PosicionesBancariasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPosicionesBancarias.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPosicionesBancarias.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPosicionesBancarias.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPosicionesBancarias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPosicionesBancarias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPosicionesBancarias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPosicionesBancarias!=null && this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy()!=null) {
			//if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPosicionesBancarias.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPosicionesBancarias.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPosicionesBancarias.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPosicionesBancarias.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPosicionesBancarias.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPosicionesBancarias.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPosicionesBancarias.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=posicionesbancariasLogic.getPosicionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=posicionesbancariass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PosicionesBancarias> TraerPosicionesBancariasBeans(List<PosicionesBancarias> posicionesbancariass,ArrayList<Classe> classes)throws Exception {
		try {
			for(PosicionesBancarias posicionesbancarias:posicionesbancariass) {
					
				if(!(PosicionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PosicionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					posicionesbancarias.setsDetalleGeneralEntityReporte(PosicionesBancariasConstantesFunciones.getPosicionesBancariasDescripcion(posicionesbancarias));
										
						
					
						
					
				} else  {
							
					//posicionesbancarias.setsDetalleGeneralEntityReporte(posicionesbancarias.getsDetalleGeneralEntityReporte());
										
				}
				
				//posicionesbancariasbeans.add(posicionesbancariasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return posicionesbancariass;
    }
	//PARA REPORTES FIN
}
