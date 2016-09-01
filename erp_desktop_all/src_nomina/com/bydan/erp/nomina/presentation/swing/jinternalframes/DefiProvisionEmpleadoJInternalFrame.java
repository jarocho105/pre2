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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.DefiProvisionEmpleadoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class DefiProvisionEmpleadoJInternalFrame extends DefiProvisionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDefiProvisionEmpleado;
	
	protected JMenuBar jmenuBarDefiProvisionEmpleado;
	
	protected JMenu jmenuDefiProvisionEmpleado;
	protected JMenu jmenuDatosDefiProvisionEmpleado;
	protected JMenu jmenuArchivoDefiProvisionEmpleado;
	protected JMenu jmenuAccionesDefiProvisionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDefiProvisionEmpleado;	
	protected GridBagConstraints gridBagConstraintsDefiProvisionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DefiProvisionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormDefiProvisionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDefiProvisionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDefiProvisionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected MesBeanSwingJInternalFrame mesinicialBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesinicial="";

	protected MesBeanSwingJInternalFrame mesfinalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesfinal="";
	
	public DefiProvisionEmpleadoSessionBean defiprovisionempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public MesSessionBean mesinicialSessionBean;
	public MesSessionBean mesfinalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DefiProvisionEmpleado> defiprovisionempleados;		
	public List<DefiProvisionEmpleado> defiprovisionempleadosEliminados;	
	public List<DefiProvisionEmpleado> defiprovisionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDefiProvisionEmpleado;		
	protected JButton jButtonAbrirOrderByDefiProvisionEmpleado;
	
	
	//protected JPanel jPanelOrderByDefiProvisionEmpleado;
	//public JScrollPane jScrollPanelOrderByDefiProvisionEmpleado;	
	//protected JButton jButtonCerrarOrderByDefiProvisionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DefiProvisionEmpleadoLogic defiprovisionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDefiProvisionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionDefiProvisionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralDefiProvisionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosDefiProvisionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDefiProvisionEmpleado;
	//public JScrollPane jScrollPanelImportacionDefiProvisionEmpleado;
	
	
	
	protected JPanel jPanelAccionesDefiProvisionEmpleado;
	
    protected JPanel jPanelPaginacionDefiProvisionEmpleado;
    protected JPanel jPanelParametrosReportesDefiProvisionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesDefiProvisionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DefiProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2DefiProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3DefiProvisionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4DefiProvisionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5DefiProvisionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoDefiProvisionEmpleado;
	//protected JPanel jPanelImportacionDefiProvisionEmpleado;
	
	
	public JTable jTableDatosDefiProvisionEmpleado;
	
	
	
	//public JTable jTableDatosDefiProvisionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDefiProvisionEmpleado;
	protected JButton jButtonDuplicarDefiProvisionEmpleado;
	protected JButton jButtonCopiarDefiProvisionEmpleado;
	protected JButton jButtonVerFormDefiProvisionEmpleado;
	protected JButton jButtonNuevoRelacionesDefiProvisionEmpleado;
	protected JButton jButtonModificarDefiProvisionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaDefiProvisionEmpleado;
	protected JButton jButtonCerrarDefiProvisionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionDefiProvisionEmpleado;
	protected JButton jButtonProcesarInformacionDefiProvisionEmpleado;
	
	
	protected JButton jButtonAnterioresDefiProvisionEmpleado;
	protected JButton jButtonSiguientesDefiProvisionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosDefiProvisionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDefiProvisionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoDefiProvisionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionDefiProvisionEmpleado;
	//protected JButton jButtonGenerarImportacionDefiProvisionEmpleado;
	//protected JButton jButtonCerrarImportacionDefiProvisionEmpleado;
	//protected JFileChooser jFileChooserImportacionDefiProvisionEmpleado;
	//protected File fileImportacionDefiProvisionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDefiProvisionEmpleado;
	protected JButton jButtonDuplicarToolBarDefiProvisionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarDefiProvisionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarDefiProvisionEmpleado;
	protected JButton jButtonCopiarToolBarDefiProvisionEmpleado;
	protected JButton jButtonVerFormToolBarDefiProvisionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarDefiProvisionEmpleado;
	protected JButton jButtonCerrarToolBarDefiProvisionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarDefiProvisionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarDefiProvisionEmpleado;
	protected JButton jButtonAnterioresToolBarDefiProvisionEmpleado;
	protected JButton jButtonSiguientesToolBarDefiProvisionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarDefiProvisionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarDefiProvisionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDefiProvisionEmpleado;
	protected JMenuItem jMenuItemDuplicarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesDefiProvisionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDefiProvisionEmpleado;
	protected JMenuItem jMenuItemCopiarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemVerFormDefiProvisionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDefiProvisionEmpleado;
	protected JMenuItem jMenuItemCerrarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarDefiProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDefiProvisionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionDefiProvisionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionDefiProvisionEmpleado;
	protected JMenuItem jMenuItemAnterioresDefiProvisionEmpleado;
	protected JMenuItem jMenuItemSiguientesDefiProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByDefiProvisionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarDefiProvisionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDefiProvisionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDefiProvisionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosDefiProvisionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDefiProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDefiProvisionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralDefiProvisionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDefiProvisionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteDefiProvisionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteDefiProvisionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteDefiProvisionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteDefiProvisionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteDefiProvisionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDefiProvisionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDefiProvisionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDefiProvisionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoDefiProvisionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionDefiProvisionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionDefiProvisionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionDefiProvisionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDefiProvisionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDefiProvisionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorDefiProvisionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDefiProvisionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoDefiProvisionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoDefiProvisionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoDefiProvisionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDefiProvisionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDefiProvisionEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDefiProvisionEmpleado;
	public JPanel jPanelFK_IdFormatoDefiProvisionEmpleado;
	public JButton jButtonFK_IdFormatoDefiProvisionEmpleado;
	public JPanel jPanelFK_IdMesFinalDefiProvisionEmpleado;
	public JButton jButtonFK_IdMesFinalDefiProvisionEmpleado;
	public JPanel jPanelFK_IdMesInicialDefiProvisionEmpleado;
	public JButton jButtonFK_IdMesInicialDefiProvisionEmpleado;
	public JPanel jPanelFK_IdRubroEmpleaDefiProvisionEmpleado;
	public JButton jButtonFK_IdRubroEmpleaDefiProvisionEmpleado;
	
	public JPanel jPanelid_formatoFK_IdFormatoDefiProvisionEmpleado;
	public JLabel jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado;
	public JButton jButtonid_formatoFK_IdFormatoDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoDefiProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado;
	public JLabel jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado;
	public JButton jButtonid_mes_finalFK_IdMesFinalDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_mes_finalFK_IdMesFinalDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mes_finalFK_IdMesFinalDefiProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado;
	public JLabel jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado;
	public JButton jButtonid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_mes_inicialFK_IdMesInicialDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mes_inicialFK_IdMesInicialDefiProvisionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
	public DefiProvisionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefiProvisionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefiProvisionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefiProvisionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDefiProvisionEmpleado)	{
		this.jButtonRecargarInformacionDefiProvisionEmpleado = jButtonRecargarInformacionDefiProvisionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionDefiProvisionEmpleado() {
		return this.jButtonProcesarInformacionDefiProvisionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDefiProvisionEmpleado)	{
		this.jButtonProcesarInformacionDefiProvisionEmpleado = jButtonProcesarInformacionDefiProvisionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionDefiProvisionEmpleado() {
		return this.jButtonRecargarInformacionDefiProvisionEmpleado;
	}
	
	
	public List<DefiProvisionEmpleado> getdefiprovisionempleados() {
		return this.defiprovisionempleados;
	}

	public void setdefiprovisionempleados(List<DefiProvisionEmpleado> defiprovisionempleados) {
		this.defiprovisionempleados = defiprovisionempleados;
	}
	
	public List<DefiProvisionEmpleado> getdefiprovisionempleadosAux() {
		return this.defiprovisionempleadosAux;
	}

	public void setdefiprovisionempleadosAux(List<DefiProvisionEmpleado> defiprovisionempleadosAux) {
		this.defiprovisionempleadosAux = defiprovisionempleadosAux;
	}
	
	public List<DefiProvisionEmpleado> getdefiprovisionempleadosEliminados() {
		return this.defiprovisionempleadosEliminados;
	}

	public void setDefiProvisionEmpleadosEliminados(List<DefiProvisionEmpleado> defiprovisionempleadosEliminados) {
		this.defiprovisionempleadosEliminados = defiprovisionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDefiProvisionEmpleado() {
		return jComboBoxTiposSeleccionarDefiProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDefiProvisionEmpleado(
			JComboBox jComboBoxTiposSeleccionarDefiProvisionEmpleado) {
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado = jComboBoxTiposSeleccionarDefiProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDefiProvisionEmpleado() {
		return jTextFieldValorCampoGeneralDefiProvisionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralDefiProvisionEmpleado(
			JTextField jTextFieldValorCampoGeneralDefiProvisionEmpleado) {
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado = jTextFieldValorCampoGeneralDefiProvisionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDefiProvisionEmpleado() {
		return this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosDefiProvisionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosDefiProvisionEmpleado) {
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado = jCheckBoxSeleccionarTodosDefiProvisionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDefiProvisionEmpleado() {
		return this.jCheckBoxSeleccionadosDefiProvisionEmpleado;
	}

	public void setjCheckBoxSeleccionadosDefiProvisionEmpleado(
			JCheckBox jCheckBoxSeleccionadosDefiProvisionEmpleado) {
		this.jCheckBoxSeleccionadosDefiProvisionEmpleado = jCheckBoxSeleccionadosDefiProvisionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDefiProvisionEmpleado() {
		return this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDefiProvisionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesDefiProvisionEmpleado) {
		this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado = jComboBoxTiposArchivosReportesDefiProvisionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDefiProvisionEmpleado() {
		return this.jComboBoxTiposReportesDefiProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDefiProvisionEmpleado(
			JComboBox jComboBoxTiposReportesDefiProvisionEmpleado) {
		this.jComboBoxTiposReportesDefiProvisionEmpleado = jComboBoxTiposReportesDefiProvisionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDefiProvisionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoDefiProvisionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDefiProvisionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoDefiProvisionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado = jComboBoxTiposReportesDinamicoDefiProvisionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado = jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDefiProvisionEmpleado() {
		return this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDefiProvisionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesDefiProvisionEmpleado) {
		this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado = jComboBoxTiposGraficosReportesDefiProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDefiProvisionEmpleado() {
		return this.jComboBoxTiposPaginacionDefiProvisionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDefiProvisionEmpleado(
			JComboBox jComboBoxTiposPaginacionDefiProvisionEmpleado) {
		this.jComboBoxTiposPaginacionDefiProvisionEmpleado = jComboBoxTiposPaginacionDefiProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDefiProvisionEmpleado() {
		return this.jComboBoxTiposRelacionesDefiProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDefiProvisionEmpleado() {
		return this.jComboBoxTiposAccionesDefiProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDefiProvisionEmpleado(
			JComboBox jComboBoxTiposRelacionesDefiProvisionEmpleado) {
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado = jComboBoxTiposRelacionesDefiProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDefiProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesDefiProvisionEmpleado) {
		this.jComboBoxTiposAccionesDefiProvisionEmpleado = jComboBoxTiposAccionesDefiProvisionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDefiProvisionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDefiProvisionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDefiProvisionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoDefiProvisionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoDefiProvisionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoDefiProvisionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoDefiProvisionEmpleado = jCheckBoxConGraficoDinamicoDefiProvisionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDefiProvisionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDefiProvisionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDefiProvisionEmpleado .setBorder(borderResaltar);		
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
		this.defiprovisionempleadoSessionBean=new DefiProvisionEmpleadoSessionBean();
		
		this.defiprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.defiprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DefiProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DefiProvisionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Defi Provision Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		DefiProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DefiProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDefiProvisionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"copiar","copiar","Copiar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"ver_form","ver_form","Ver"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"recargar","recargar","Recargar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDefiProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDefiProvisionEmpleado,this.jTtoolBarDefiProvisionEmpleado,
							"cerrar","cerrar","Salir"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDefiProvisionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDefiProvisionEmpleado;
			
				this.jButtonProcesarInformacionToolBarDefiProvisionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDefiProvisionEmpleado;
				
		//protected JButton jButtonModificarToolBarDefiProvisionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDefiProvisionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDefiProvisionEmpleado=new JMenuMe("General");
		this.jmenuArchivoDefiProvisionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesDefiProvisionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosDefiProvisionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDefiProvisionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDefiProvisionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDefiProvisionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDefiProvisionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDefiProvisionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDefiProvisionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDefiProvisionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDefiProvisionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDefiProvisionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDefiProvisionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDefiProvisionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDefiProvisionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDefiProvisionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDefiProvisionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDefiProvisionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDefiProvisionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDefiProvisionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDefiProvisionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDefiProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDefiProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDefiProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDefiProvisionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDefiProvisionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDefiProvisionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDefiProvisionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDefiProvisionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDefiProvisionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDefiProvisionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDefiProvisionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDefiProvisionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDefiProvisionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDefiProvisionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDefiProvisionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDefiProvisionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDefiProvisionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDefiProvisionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDefiProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDefiProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDefiProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDefiProvisionEmpleado.add(this.jMenuItemCerrarDefiProvisionEmpleado);
			
			this.jmenuAccionesDefiProvisionEmpleado.add(this.jMenuItemNuevoDefiProvisionEmpleado);
			this.jmenuAccionesDefiProvisionEmpleado.add(this.jMenuItemNuevoGuardarCambiosDefiProvisionEmpleado);
			this.jmenuAccionesDefiProvisionEmpleado.add(this.jMenuItemNuevoRelacionesDefiProvisionEmpleado);
			this.jmenuAccionesDefiProvisionEmpleado.add(this.jMenuItemGuardarCambiosTablaDefiProvisionEmpleado);		
			this.jmenuAccionesDefiProvisionEmpleado.add(this.jMenuItemDuplicarDefiProvisionEmpleado);		
			this.jmenuAccionesDefiProvisionEmpleado.add(this.jMenuItemCopiarDefiProvisionEmpleado);		
			this.jmenuAccionesDefiProvisionEmpleado.add(this.jMenuItemVerFormDefiProvisionEmpleado);		
			
			this.jmenuDatosDefiProvisionEmpleado.add(this.jMenuItemRecargarInformacionDefiProvisionEmpleado);				
			this.jmenuDatosDefiProvisionEmpleado.add(this.jMenuItemAnterioresDefiProvisionEmpleado);				
			this.jmenuDatosDefiProvisionEmpleado.add(this.jMenuItemSiguientesDefiProvisionEmpleado);				
			this.jmenuDatosDefiProvisionEmpleado.add(this.jMenuItemAbrirOrderByDefiProvisionEmpleado);				
			this.jmenuDatosDefiProvisionEmpleado.add(this.jMenuItemMostrarOcultarDefiProvisionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDefiProvisionEmpleado.add(this.jMenuItemGuardarCambiosDefiProvisionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDefiProvisionEmpleado.add(this.jmenuArchivoDefiProvisionEmpleado);		
			this.jmenuBarDefiProvisionEmpleado.add(this.jmenuAccionesDefiProvisionEmpleado);		
			this.jmenuBarDefiProvisionEmpleado.add(this.jmenuDatosDefiProvisionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDefiProvisionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDefiProvisionEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdFormatoDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoDefiProvisionEmpleado.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoDefiProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdFormatoDefiProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdFormatoDefiProvisionEmpleado.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoDefiProvisionEmpleado,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado = new JLabelMe();
		jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado.setText("Formato :");
		jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesFinalDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesFinalDefiProvisionEmpleado.setToolTipText("Buscar Por Mes Final ");
		this.jButtonFK_IdMesFinalDefiProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdMesFinalDefiProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdMesFinalDefiProvisionEmpleado.setToolTipText("Buscar Por Mes Final ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesFinalDefiProvisionEmpleado,"buscar_button","Buscar Por Mes Final ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesFinalDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado = new JLabelMe();
		jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setText("Mes Final :");
		jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setToolTipText("Mes Final");
		jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesInicialDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesInicialDefiProvisionEmpleado.setToolTipText("Buscar Por Mes Inicial ");
		this.jButtonFK_IdMesInicialDefiProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdMesInicialDefiProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdMesInicialDefiProvisionEmpleado.setToolTipText("Buscar Por Mes Inicial ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesInicialDefiProvisionEmpleado,"buscar_button","Buscar Por Mes Inicial ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesInicialDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado = new JLabelMe();
		jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setText("Mes Inicial :");
		jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setToolTipText("Mes Inicial");
		jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaDefiProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaDefiProvisionEmpleado.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleado= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleado.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleado.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleado,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDefiProvisionEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasDefiProvisionEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDefiProvisionEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDefiProvisionEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDefiProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDefiProvisionEmpleado = new DefiProvisionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Defi Provision Empleado DATOS");
			this.jInternalFrameDetalleFormDefiProvisionEmpleado = new DefiProvisionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.defiprovisionempleadoSessionBean.getConGuardarRelaciones(),this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDefiProvisionEmpleado = null;//new DefiProvisionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDefiProvisionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosDefiProvisionEmpleado = new JTableMe();      
		
		String sToolTipDefiProvisionEmpleado="";
		sToolTipDefiProvisionEmpleado=DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDefiProvisionEmpleado+="(Nomina.DefiProvisionEmpleado)";
		}
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDefiProvisionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDefiProvisionEmpleado.setToolTipText(sToolTipDefiProvisionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDefiProvisionEmpleado);
		this.jTableDatosDefiProvisionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosDefiProvisionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDefiProvisionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosDefiProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDefiProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDefiProvisionEmpleado = new JButtonMe();
		this.jButtonDuplicarDefiProvisionEmpleado = new JButtonMe();
		this.jButtonCopiarDefiProvisionEmpleado = new JButtonMe();
		this.jButtonVerFormDefiProvisionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesDefiProvisionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarDefiProvisionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosDefiProvisionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralDefiProvisionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Defi Provision Empleado";
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Defi Provision Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosDefiProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDefiProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesDefiProvisionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDefiProvisionEmpleado=new ReporteDinamicoJInternalFrame(DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDefiProvisionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDefiProvisionEmpleado=new ImportacionJInternalFrame(DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDefiProvisionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDefiProvisionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByDefiProvisionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByDefiProvisionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDefiProvisionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDefiProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDefiProvisionEmpleado,false,this);
			
			//this.cargarOrderByDefiProvisionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDefiProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDefiProvisionEmpleado,true,this);
			
			//this.cargarOrderByDefiProvisionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDefiProvisionEmpleado.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosDefiProvisionEmpleado.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosDefiProvisionEmpleado.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosDefiProvisionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDefiProvisionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDefiProvisionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDefiProvisionEmpleado.setText("Nuevo");
		this.jButtonDuplicarDefiProvisionEmpleado.setText("Duplicar");
		this.jButtonCopiarDefiProvisionEmpleado.setText("Copiar");
		this.jButtonVerFormDefiProvisionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesDefiProvisionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.setText("Guardar");
		this.jButtonCerrarDefiProvisionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDefiProvisionEmpleado,"nuevo_button","Nuevo",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDefiProvisionEmpleado,"duplicar_button","Duplicar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDefiProvisionEmpleado,"copiar_button","Copiar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDefiProvisionEmpleado,"ver_form","Ver",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDefiProvisionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDefiProvisionEmpleado,"guardarcambiostabla_button","Guardar",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDefiProvisionEmpleado,"cerrar_button","Salir",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDefiProvisionEmpleado.setToolTipText("Nuevo"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDefiProvisionEmpleado.setToolTipText("Duplicar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDefiProvisionEmpleado.setToolTipText("Copiar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDefiProvisionEmpleado.setToolTipText("Ver"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDefiProvisionEmpleado.setToolTipText("Nuevo Rel"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.setToolTipText("Guardar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDefiProvisionEmpleado.setToolTipText("Salir"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDefiProvisionEmpleado";
		inputMap = this.jButtonNuevoDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDefiProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDefiProvisionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarDefiProvisionEmpleado";
		inputMap = this.jButtonDuplicarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDefiProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDefiProvisionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarDefiProvisionEmpleado";
		inputMap = this.jButtonCopiarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDefiProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDefiProvisionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormDefiProvisionEmpleado";
		inputMap = this.jButtonVerFormDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDefiProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDefiProvisionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDefiProvisionEmpleado";
		inputMap = this.jButtonNuevoRelacionesDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDefiProvisionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDefiProvisionEmpleado";
		inputMap = this.jButtonModificarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDefiProvisionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDefiProvisionEmpleado";
		inputMap = this.jButtonCerrarDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDefiProvisionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDefiProvisionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDefiProvisionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DefiProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DefiProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DefiProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DefiProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DefiProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDefiProvisionEmpleado.setName("jPanelParametrosReportesDefiProvisionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDefiProvisionEmpleado.setName("jPanelParametrosReportesAccionesDefiProvisionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDefiProvisionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionDefiProvisionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionDefiProvisionEmpleado.setToolTipText("Recargar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDefiProvisionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDefiProvisionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionDefiProvisionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionDefiProvisionEmpleado.setToolTipText("Procesar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDefiProvisionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionDefiProvisionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDefiProvisionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDefiProvisionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesDefiProvisionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDefiProvisionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionDefiProvisionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDefiProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDefiProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDefiProvisionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDefiProvisionEmpleado = new JLabelMe();
		
		this.jLabelAccionesDefiProvisionEmpleado.setText("Acciones");		
		this.jLabelAccionesDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDefiProvisionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDefiProvisionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDefiProvisionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDefiProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDefiProvisionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteDefiProvisionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDefiProvisionEmpleado = new JButtonMe();
		//this.jButtonAnterioresDefiProvisionEmpleado.setText("<<");
        this.jButtonAnterioresDefiProvisionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDefiProvisionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDefiProvisionEmpleado = new JButtonMe();
		//this.jButtonSiguientesDefiProvisionEmpleado.setText(">>");
        this.jButtonSiguientesDefiProvisionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDefiProvisionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado,"nuevoguardarcambios_button","Nue",this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDefiProvisionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDefiProvisionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDefiProvisionEmpleado";
		inputMap = this.jButtonRecargarInformacionDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDefiProvisionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDefiProvisionEmpleado";
		inputMap = this.jButtonSiguientesDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDefiProvisionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDefiProvisionEmpleado";
		inputMap = this.jButtonAnterioresDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDefiProvisionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDefiProvisionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDefiProvisionEmpleado.setMinimumSize(new Dimension(this.getWidth(),DefiProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DefiProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDefiProvisionEmpleado.setMaximumSize(new Dimension(this.getWidth(),DefiProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DefiProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDefiProvisionEmpleado.setPreferredSize(new Dimension(this.getWidth(),DefiProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DefiProvisionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDefiProvisionEmpleado = new GridBagLayout();

			this.jPanelPaginacionDefiProvisionEmpleado.setLayout(gridaBagLayoutPaginacionDefiProvisionEmpleado);						
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonAnterioresDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
					
						
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
			
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonNuevoGuardarCambiosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
						
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonSiguientesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonNuevoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
				this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonNuevoRelacionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			}
			
			
			if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
				this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonGuardarCambiosTablaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			}
			
			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonDuplicarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonCopiarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonVerFormDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDefiProvisionEmpleado.add(this.jButtonCerrarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
		
		
		this.jButtonRecargarInformacionDefiProvisionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDefiProvisionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDefiProvisionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDefiProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDefiProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDefiProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDefiProvisionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDefiProvisionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDefiProvisionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDefiProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefiProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDefiProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDefiProvisionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDefiProvisionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDefiProvisionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDefiProvisionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDefiProvisionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDefiProvisionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDefiProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDefiProvisionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DefiProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DefiProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DefiProvisionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DefiProvisionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDefiProvisionEmpleado.setLayout(gridaBagParametrosReportesDefiProvisionEmpleado);
			this.jPanelParametrosReportesAccionesDefiProvisionEmpleado.setLayout(gridaBagParametrosReportesAccionesDefiProvisionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1DefiProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar1DefiProvisionEmpleado);
			this.jPanelParametrosAuxiliar2DefiProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar2DefiProvisionEmpleado);
			this.jPanelParametrosAuxiliar3DefiProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar3DefiProvisionEmpleado);
			this.jPanelParametrosAuxiliar4DefiProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar4DefiProvisionEmpleado);
			//this.jPanelParametrosAuxiliar5DefiProvisionEmpleado.setLayout(gridaBagParametrosAuxiliar2DefiProvisionEmpleado);			
			
			
			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jButtonRecargarInformacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DefiProvisionEmpleado.add(this.jComboBoxTiposPaginacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DefiProvisionEmpleado.add(this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DefiProvisionEmpleado.add(this.jComboBoxTiposArchivosReportesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jPanelParametrosAuxiliar1DefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DefiProvisionEmpleado.add(this.jComboBoxTiposReportesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jPanelParametrosAuxiliar4DefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jComboBoxTiposReportesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jCheckBoxGenerarReporteDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jPanelParametrosAuxiliar2DefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jLabelAccionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jButtonAbrirOrderByDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jComboBoxTiposSeleccionarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
			
			
			/*
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DefiProvisionEmpleado.add(this.jCheckBoxSeleccionarTodosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);															
				
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DefiProvisionEmpleado.add(this.jCheckBoxSeleccionadosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jPanelParametrosAuxiliar3DefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jComboBoxTiposRelacionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
				
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jComboBoxTiposAccionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
	
				
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDefiProvisionEmpleado.add(this.jTextFieldValorCampoGeneralDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDefiProvisionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosDefiProvisionEmpleado.setLayout(gridaBagLayoutDatosDefiProvisionEmpleado);
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosDefiProvisionEmpleado.add(this.jTableDatosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDefiProvisionEmpleado.setViewportView(this.jTableDatosDefiProvisionEmpleado);
		this.jTableDatosDefiProvisionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosDefiProvisionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDefiProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesDefiProvisionEmpleado.setLayout(gridaBagLayoutAccionesDefiProvisionEmpleado);
		
		
		/*	
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
			
		this.jPanelAccionesDefiProvisionEmpleado.add(this.jButtonNuevoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdFormatoDefiProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoDefiProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoDefiProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoDefiProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoDefiProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoDefiProvisionEmpleado.setLayout(gridaBagLayoutFK_IdFormatoDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
		jPanelFK_IdFormatoDefiProvisionEmpleado.add(jLabelid_formatoFK_IdFormatoDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
		jPanelFK_IdFormatoDefiProvisionEmpleado.add(jComboBoxid_formatoFK_IdFormatoDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
		gridBagConstraintsDefiProvisionEmpleado.gridx =1;
		jPanelFK_IdFormatoDefiProvisionEmpleado.add(jButtonFK_IdFormatoDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		jTabbedPaneBusquedasDefiProvisionEmpleado.addTab("1.-Por Formato ", jPanelFK_IdFormatoDefiProvisionEmpleado);
		jTabbedPaneBusquedasDefiProvisionEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMesFinalDefiProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdMesFinalDefiProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesFinalDefiProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesFinalDefiProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesFinalDefiProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesFinalDefiProvisionEmpleado.setLayout(gridaBagLayoutFK_IdMesFinalDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
		jPanelFK_IdMesFinalDefiProvisionEmpleado.add(jLabelid_mes_finalFK_IdMesFinalDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
		jPanelFK_IdMesFinalDefiProvisionEmpleado.add(jComboBoxid_mes_finalFK_IdMesFinalDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
		gridBagConstraintsDefiProvisionEmpleado.gridx =1;
		jPanelFK_IdMesFinalDefiProvisionEmpleado.add(jButtonFK_IdMesFinalDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		jTabbedPaneBusquedasDefiProvisionEmpleado.addTab("2.-Por Mes Final ", jPanelFK_IdMesFinalDefiProvisionEmpleado);
		jTabbedPaneBusquedasDefiProvisionEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdMesInicialDefiProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdMesInicialDefiProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesInicialDefiProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesInicialDefiProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesInicialDefiProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesInicialDefiProvisionEmpleado.setLayout(gridaBagLayoutFK_IdMesInicialDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
		jPanelFK_IdMesInicialDefiProvisionEmpleado.add(jLabelid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
		jPanelFK_IdMesInicialDefiProvisionEmpleado.add(jComboBoxid_mes_inicialFK_IdMesInicialDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
		gridBagConstraintsDefiProvisionEmpleado.gridx =1;
		jPanelFK_IdMesInicialDefiProvisionEmpleado.add(jButtonFK_IdMesInicialDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		jTabbedPaneBusquedasDefiProvisionEmpleado.addTab("3.-Por Mes Inicial ", jPanelFK_IdMesInicialDefiProvisionEmpleado);
		jTabbedPaneBusquedasDefiProvisionEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaDefiProvisionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaDefiProvisionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaDefiProvisionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaDefiProvisionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaDefiProvisionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaDefiProvisionEmpleado.setLayout(gridaBagLayoutFK_IdRubroEmpleaDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
		jPanelFK_IdRubroEmpleaDefiProvisionEmpleado.add(jLabelid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 0;
		gridBagConstraintsDefiProvisionEmpleado.gridx = 1;
		jPanelFK_IdRubroEmpleaDefiProvisionEmpleado.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDefiProvisionEmpleado.gridy = 1;
		gridBagConstraintsDefiProvisionEmpleado.gridx =1;
		jPanelFK_IdRubroEmpleaDefiProvisionEmpleado.add(jButtonFK_IdRubroEmpleaDefiProvisionEmpleado, gridBagConstraintsDefiProvisionEmpleado);

		jTabbedPaneBusquedasDefiProvisionEmpleado.addTab("4.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaDefiProvisionEmpleado);
		jTabbedPaneBusquedasDefiProvisionEmpleado.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDefiProvisionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDefiProvisionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;		
			//this.gridBagConstraintsDefiProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;		
		//this.gridBagConstraintsDefiProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDefiProvisionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;		
			this.gridBagConstraintsDefiProvisionEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDefiProvisionEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);								
		
		
		/*
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		*/		
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =0;
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDefiProvisionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
				
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DefiProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDefiProvisionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDefiProvisionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosDefiProvisionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosDefiProvisionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
			
			
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
			
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDefiProvisionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDefiProvisionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDefiProvisionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDefiProvisionEmpleado.setName("jPanelReporteDinamicoDefiProvisionEmpleado"); 
		
		this.jPanelReporteDinamicoDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDefiProvisionEmpleado.setLayout(gridaBagLayoutReporteDinamicoDefiProvisionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoDefiProvisionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDefiProvisionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDefiProvisionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Defi Provision Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDefiProvisionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteDefiProvisionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jLabelColumnasSelectReporteDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDefiProvisionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteDefiProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDefiProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDefiProvisionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDefiProvisionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDefiProvisionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDefiProvisionEmpleado=new JScrollPane(this.jListColumnasSelectReporteDefiProvisionEmpleado);
			
			this.jScrollColumnasSelectReporteDefiProvisionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDefiProvisionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDefiProvisionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jListColumnasSelectReporteDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jScrollColumnasSelectReporteDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDefiProvisionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteDefiProvisionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jLabelRelacionesSelectReporteDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDefiProvisionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteDefiProvisionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDefiProvisionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDefiProvisionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDefiProvisionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDefiProvisionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDefiProvisionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteDefiProvisionEmpleado);
			
			this.jScrollRelacionesSelectReporteDefiProvisionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDefiProvisionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDefiProvisionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jListRelacionesSelectReporteDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jScrollRelacionesSelectReporteDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDefiProvisionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDefiProvisionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoDefiProvisionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDefiProvisionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDefiProvisionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado.setToolTipText("Generar EXCEL"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jComboBoxTiposReportesDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDefiProvisionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDefiProvisionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDefiProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDefiProvisionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDefiProvisionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDefiProvisionEmpleado.setToolTipText("Generar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jButtonGenerarReporteDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDefiProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDefiProvisionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDefiProvisionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDefiProvisionEmpleado.setToolTipText("Cancelar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDefiProvisionEmpleado.add(this.jButtonCerrarReporteDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDefiProvisionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDefiProvisionEmpleado= new JScrollPane(jPanelReporteDinamicoDefiProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Defi Provision Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDefiProvisionEmpleado);
		this.jInternalFrameReporteDinamicoDefiProvisionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDefiProvisionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDefiProvisionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDefiProvisionEmpleado.setName("jPanelImportacionDefiProvisionEmpleado"); 
		
		this.jPanelImportacionDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDefiProvisionEmpleado.setLayout(gridaBagLayoutImportacionDefiProvisionEmpleado);
		
		
		this.jInternalFrameImportacionDefiProvisionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDefiProvisionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDefiProvisionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDefiProvisionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDefiProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDefiProvisionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDefiProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDefiProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDefiProvisionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDefiProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionDefiProvisionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Defi Provision Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDefiProvisionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionDefiProvisionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDefiProvisionEmpleado.add(this.jLabelArchivoImportacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDefiProvisionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionDefiProvisionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDefiProvisionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionDefiProvisionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDefiProvisionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDefiProvisionEmpleado.setToolTipText("Generar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefiProvisionEmpleado.add(this.jButtonAbrirImportacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDefiProvisionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionDefiProvisionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDefiProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDefiProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDefiProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDefiProvisionEmpleado.add(this.jLabelPathArchivoImportacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDefiProvisionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDefiProvisionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDefiProvisionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDefiProvisionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefiProvisionEmpleado.add(this.jTextFieldPathArchivoImportacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDefiProvisionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionDefiProvisionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDefiProvisionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDefiProvisionEmpleado.setToolTipText("Generar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefiProvisionEmpleado.add(this.jButtonGenerarImportacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDefiProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionDefiProvisionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDefiProvisionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDefiProvisionEmpleado.setToolTipText("Cancelar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDefiProvisionEmpleado.add(this.jButtonCerrarImportacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDefiProvisionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionDefiProvisionEmpleado= new JScrollPane(jPanelImportacionDefiProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDefiProvisionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsDefiProvisionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDefiProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDefiProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDefiProvisionEmpleado);
		this.jInternalFrameImportacionDefiProvisionEmpleado.getContentPane().add(this.jScrollPanelImportacionDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDefiProvisionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDefiProvisionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByDefiProvisionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByDefiProvisionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDefiProvisionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDefiProvisionEmpleado";
			inputMap = this.jButtonAbrirOrderByDefiProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDefiProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDefiProvisionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByDefiProvisionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDefiProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDefiProvisionEmpleado.setName("jPanelOrderByDefiProvisionEmpleado"); 
			
			this.jPanelOrderByDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDefiProvisionEmpleado.setLayout(gridaBagLayoutOrderByDefiProvisionEmpleado);
			
			
			this.jTableDatosDefiProvisionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosDefiProvisionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDefiProvisionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDefiProvisionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDefiProvisionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDefiProvisionEmpleadoOrderBy.setViewportView(this.jTableDatosDefiProvisionEmpleadoOrderBy);
			this.jTableDatosDefiProvisionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDefiProvisionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDefiProvisionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDefiProvisionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDefiProvisionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDefiProvisionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDefiProvisionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDefiProvisionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDefiProvisionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByDefiProvisionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDefiProvisionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDefiProvisionEmpleado.setResizable(true);
			this.jInternalFrameOrderByDefiProvisionEmpleado.setClosable(true);
			this.jInternalFrameOrderByDefiProvisionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDefiProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Defi Provision Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDefiProvisionEmpleado.ipady =150;
				
			this.jPanelOrderByDefiProvisionEmpleado.add(jScrollPanelDatosDefiProvisionEmpleadoOrderBy, this.gridBagConstraintsDefiProvisionEmpleado);//this.jTableDatosDefiProvisionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDefiProvisionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByDefiProvisionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDefiProvisionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDefiProvisionEmpleado.setToolTipText("Cancelar"+" "+DefiProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDefiProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefiProvisionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDefiProvisionEmpleado.add(this.jButtonCerrarOrderByDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDefiProvisionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByDefiProvisionEmpleado= new JScrollPane(jPanelOrderByDefiProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDefiProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDefiProvisionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsDefiProvisionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDefiProvisionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDefiProvisionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDefiProvisionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDefiProvisionEmpleado);
			
			this.jInternalFrameOrderByDefiProvisionEmpleado.getContentPane().add(this.jScrollPanelOrderByDefiProvisionEmpleado, this.gridBagConstraintsDefiProvisionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByDefiProvisionEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.defiprovisionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDefiProvisionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDefiProvisionEmpleado.getRowHeight();//DefiProvisionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado.isSelected()) {
					iHeightTable=DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDefiProvisionEmpleado.isSelected()) {
					iHeightTable=DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DefiProvisionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDefiProvisionEmpleado!=null && this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.defiprovisionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDefiProvisionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDefiProvisionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDefiProvisionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDefiProvisionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDefiProvisionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDefiProvisionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDefiProvisionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=defiprovisionempleadoLogic.getDefiProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=defiprovisionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DefiProvisionEmpleado> TraerDefiProvisionEmpleadoBeans(List<DefiProvisionEmpleado> defiprovisionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(DefiProvisionEmpleado defiprovisionempleado:defiprovisionempleados) {
					
				if(!(DefiProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DefiProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					defiprovisionempleado.setsDetalleGeneralEntityReporte(DefiProvisionEmpleadoConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleado));
										
					defiprovisionempleado.setpara_liquidacion_descripcion(DefiProvisionEmpleadoConstantesFunciones.getpara_liquidacionDescripcion(defiprovisionempleado));	
					
					

					if(defiprovisionempleado.getProvisionEmpleados()!=null && Funciones.existeClass(classes,ProvisionEmpleado.class)) {
						try{defiprovisionempleado.setprovisionempleadosDescripcionReporte(new JRBeanCollectionDataSource(ProvisionEmpleadoJInternalFrame.TraerProvisionEmpleadoBeans(defiprovisionempleado.getProvisionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(defiprovisionempleado.getCuotas()!=null && Funciones.existeClass(classes,Cuota.class)) {
						try{defiprovisionempleado.setcuotasDescripcionReporte(new JRBeanCollectionDataSource(CuotaJInternalFrame.TraerCuotaBeans(defiprovisionempleado.getCuotas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//defiprovisionempleado.setsDetalleGeneralEntityReporte(defiprovisionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//defiprovisionempleadobeans.add(defiprovisionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return defiprovisionempleados;
    }
	//PARA REPORTES FIN
}
