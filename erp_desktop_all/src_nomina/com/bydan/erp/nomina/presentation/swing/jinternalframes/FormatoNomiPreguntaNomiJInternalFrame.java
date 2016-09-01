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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.FormatoNomiPreguntaNomiConstantesFunciones;

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
public class FormatoNomiPreguntaNomiJInternalFrame extends FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormatoNomiPreguntaNomi;
	
	protected JMenuBar jmenuBarFormatoNomiPreguntaNomi;
	
	protected JMenu jmenuFormatoNomiPreguntaNomi;
	protected JMenu jmenuDatosFormatoNomiPreguntaNomi;
	protected JMenu jmenuArchivoFormatoNomiPreguntaNomi;
	protected JMenu jmenuAccionesFormatoNomiPreguntaNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoNomiPreguntaNomi;	
	protected GridBagConstraints gridBagConstraintsFormatoNomiPreguntaNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormatoNomiPreguntaNomiDetalleFormJInternalFrame jInternalFrameDetalleFormFormatoNomiPreguntaNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormatoNomiPreguntaNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factornomi="";

	protected PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntanomi="";
	
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public FactorNomiSessionBean factornomiSessionBean;
	public PreguntaNomiSessionBean preguntanomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormatoNomiPreguntaNomi> formatonomipreguntanomis;		
	public List<FormatoNomiPreguntaNomi> formatonomipreguntanomisEliminados;	
	public List<FormatoNomiPreguntaNomi> formatonomipreguntanomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormatoNomiPreguntaNomi;		
	protected JButton jButtonAbrirOrderByFormatoNomiPreguntaNomi;
	
	
	//protected JPanel jPanelOrderByFormatoNomiPreguntaNomi;
	//public JScrollPane jScrollPanelOrderByFormatoNomiPreguntaNomi;	
	//protected JButton jButtonCerrarOrderByFormatoNomiPreguntaNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormatoNomiPreguntaNomi;
	public JScrollPane jScrollPanelDatosEdicionFormatoNomiPreguntaNomi;
	public JScrollPane jScrollPanelDatosGeneralFormatoNomiPreguntaNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosFormatoNomiPreguntaNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi;
	//public JScrollPane jScrollPanelImportacionFormatoNomiPreguntaNomi;
	
	
	
	protected JPanel jPanelAccionesFormatoNomiPreguntaNomi;
	
    protected JPanel jPanelPaginacionFormatoNomiPreguntaNomi;
    protected JPanel jPanelParametrosReportesFormatoNomiPreguntaNomi;
	protected JPanel jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormatoNomiPreguntaNomi;
	protected JPanel jPanelParametrosAuxiliar2FormatoNomiPreguntaNomi;
	protected JPanel jPanelParametrosAuxiliar3FormatoNomiPreguntaNomi;
	protected JPanel jPanelParametrosAuxiliar4FormatoNomiPreguntaNomi;
	//protected JPanel jPanelParametrosAuxiliar5FormatoNomiPreguntaNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormatoNomiPreguntaNomi;
	//protected JPanel jPanelImportacionFormatoNomiPreguntaNomi;
	
	
	public JTable jTableDatosFormatoNomiPreguntaNomi;
	
	
	
	//public JTable jTableDatosFormatoNomiPreguntaNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormatoNomiPreguntaNomi;
	protected JButton jButtonDuplicarFormatoNomiPreguntaNomi;
	protected JButton jButtonCopiarFormatoNomiPreguntaNomi;
	protected JButton jButtonVerFormFormatoNomiPreguntaNomi;
	protected JButton jButtonNuevoRelacionesFormatoNomiPreguntaNomi;
	protected JButton jButtonModificarFormatoNomiPreguntaNomi;
	
    protected JButton jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi;
	protected JButton jButtonCerrarFormatoNomiPreguntaNomi;
	
	
	protected JButton jButtonRecargarInformacionFormatoNomiPreguntaNomi;
	protected JButton jButtonProcesarInformacionFormatoNomiPreguntaNomi;
	
	
	protected JButton jButtonAnterioresFormatoNomiPreguntaNomi;
	protected JButton jButtonSiguientesFormatoNomiPreguntaNomi;
	protected JButton jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi;
	//protected JButton jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormatoNomiPreguntaNomi;
	//protected JButton jButtonGenerarImportacionFormatoNomiPreguntaNomi;
	//protected JButton jButtonCerrarImportacionFormatoNomiPreguntaNomi;
	//protected JFileChooser jFileChooserImportacionFormatoNomiPreguntaNomi;
	//protected File fileImportacionFormatoNomiPreguntaNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonDuplicarToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonCopiarToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonVerFormToolBarFormatoNomiPreguntaNomi;
	public JButton jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonCerrarToolBarFormatoNomiPreguntaNomi;
	
	protected JButton jButtonRecargarInformacionToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonProcesarInformacionToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonAnterioresToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonSiguientesToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi;
	protected JButton jButtonAbrirOrderByToolBarFormatoNomiPreguntaNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemDuplicarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemCopiarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemVerFormFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemCerrarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemDetalleCerrarFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemProcesarInformacionFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemAnterioresFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemSiguientesFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemAbrirOrderByFormatoNomiPreguntaNomi;
	protected JMenuItem jMenuItemMostrarOcultarFormatoNomiPreguntaNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoNomiPreguntaNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi;
	protected JCheckBox jCheckBoxSeleccionadosFormatoNomiPreguntaNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi;
	protected JCheckBox jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormatoNomiPreguntaNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi;
	protected JTextField jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormatoNomiPreguntaNomi;
	//public JList<Reporte> jListColumnasSelectReporteFormatoNomiPreguntaNomi;
	//public JScrollPane jScrollColumnasSelectReporteFormatoNomiPreguntaNomi;
	
	//public JLabel jLabelRelacionesSelectReporteFormatoNomiPreguntaNomi;
	//public JList<Reporte> jListRelacionesSelectReporteFormatoNomiPreguntaNomi;
	//public JScrollPane jScrollRelacionesSelectReporteFormatoNomiPreguntaNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormatoNomiPreguntaNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormatoNomiPreguntaNomi;
	
		
	//public JLabel jLabelArchivoImportacionFormatoNomiPreguntaNomi;	
	//public JLabel jLabelPathArchivoImportacionFormatoNomiPreguntaNomi;
	//protected JTextField jTextFieldPathArchivoImportacionFormatoNomiPreguntaNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormatoNomiPreguntaNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi;
	
	//public JLabel jLabelColumnaCategoriaValorFormatoNomiPreguntaNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi;
	
	//public JLabel jLabelColumnasValoresGraficoFormatoNomiPreguntaNomi;
	//public JList<Reporte> jListColumnasValoresGraficoFormatoNomiPreguntaNomi;
	//public JScrollPane jScrollColumnasValoresGraficoFormatoNomiPreguntaNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormatoNomiPreguntaNomi;
	public JPanel jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi;
	public JButton jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi;
	public JPanel jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi;
	public JButton jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi;
	public JPanel jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi;
	public JButton jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi;
	
	public JPanel jPanelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi;
	public JLabel jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi;
	public JButton jButtonid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi;
	public JLabel jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi;
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi;
	public JLabel jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi;
	public JButton jButtonid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi= new JButtonMe();
	public JButton jButtonid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomiUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomiBusqueda= new JButtonMe();

	
	
	
	
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
	public FormatoNomiPreguntaNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiPreguntaNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiPreguntaNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoNomiPreguntaNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormatoNomiPreguntaNomi)	{
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi = jButtonRecargarInformacionFormatoNomiPreguntaNomi;
	}
	
	public JButton getjButtonProcesarInformacionFormatoNomiPreguntaNomi() {
		return this.jButtonProcesarInformacionFormatoNomiPreguntaNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoNomiPreguntaNomi)	{
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi = jButtonProcesarInformacionFormatoNomiPreguntaNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionFormatoNomiPreguntaNomi() {
		return this.jButtonRecargarInformacionFormatoNomiPreguntaNomi;
	}
	
	
	public List<FormatoNomiPreguntaNomi> getformatonomipreguntanomis() {
		return this.formatonomipreguntanomis;
	}

	public void setformatonomipreguntanomis(List<FormatoNomiPreguntaNomi> formatonomipreguntanomis) {
		this.formatonomipreguntanomis = formatonomipreguntanomis;
	}
	
	public List<FormatoNomiPreguntaNomi> getformatonomipreguntanomisAux() {
		return this.formatonomipreguntanomisAux;
	}

	public void setformatonomipreguntanomisAux(List<FormatoNomiPreguntaNomi> formatonomipreguntanomisAux) {
		this.formatonomipreguntanomisAux = formatonomipreguntanomisAux;
	}
	
	public List<FormatoNomiPreguntaNomi> getformatonomipreguntanomisEliminados() {
		return this.formatonomipreguntanomisEliminados;
	}

	public void setFormatoNomiPreguntaNomisEliminados(List<FormatoNomiPreguntaNomi> formatonomipreguntanomisEliminados) {
		this.formatonomipreguntanomisEliminados = formatonomipreguntanomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormatoNomiPreguntaNomi() {
		return jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi = jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormatoNomiPreguntaNomi() {
		return jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi;
	}

	public void setjTextFieldValorCampoGeneralFormatoNomiPreguntaNomi(
			JTextField jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi) {
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi = jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi;
	}

	public void setBorderResaltarValorCampoGeneralFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi() {
		return this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi;
	}

	public void setjCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi(
			JCheckBox jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi) {
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi = jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi;
	}

	public void setBorderResaltarSeleccionarTodosFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormatoNomiPreguntaNomi() {
		return this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi;
	}

	public void setjCheckBoxSeleccionadosFormatoNomiPreguntaNomi(
			JCheckBox jCheckBoxSeleccionadosFormatoNomiPreguntaNomi) {
		this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi = jCheckBoxSeleccionadosFormatoNomiPreguntaNomi;
	}
	
	public void setBorderResaltarSeleccionadosFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi = jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi;
	}

	public void setBorderResaltarTiposArchivosReportesFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposReportesFormatoNomiPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposReportesFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposReportesFormatoNomiPreguntaNomi = jComboBoxTiposReportesFormatoNomiPreguntaNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi() {
	//	return jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi) {
	//	this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi = jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi = jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi;
	//}
	
	public void setBorderResaltarTiposReportesFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi = jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposPaginacionFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi = jComboBoxTiposPaginacionFormatoNomiPreguntaNomi;
	}
	
	public void setBorderResaltarTiposPaginacionFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoNomiPreguntaNomi() {
		return this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposRelacionesFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi = jComboBoxTiposRelacionesFormatoNomiPreguntaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoNomiPreguntaNomi(
			JComboBox jComboBoxTiposAccionesFormatoNomiPreguntaNomi) {
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi = jComboBoxTiposAccionesFormatoNomiPreguntaNomi;
	}
	
	public void setBorderResaltarTiposRelacionesFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormatoNomiPreguntaNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi() {
	//	return jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi) {
	//	this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi = jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormatoNomiPreguntaNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi .setBorder(borderResaltar);		
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
		this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		
		this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoNomiPreguntaNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formato Nomi Pregunta Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
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
		
		FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormatoNomiPreguntaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormatoNomiPreguntaNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"nuevo","nuevo","Nuevo"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"duplicar","duplicar","Duplicar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"copiar","copiar","Copiar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"ver_form","ver_form","Ver"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"recargar","recargar","Recargar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormatoNomiPreguntaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,
							"cerrar","cerrar","Salir"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi;
			
				this.jButtonProcesarInformacionToolBarFormatoNomiPreguntaNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormatoNomiPreguntaNomi;
				
		//protected JButton jButtonModificarToolBarFormatoNomiPreguntaNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormatoNomiPreguntaNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormatoNomiPreguntaNomi=new JMenuMe("General");
		this.jmenuArchivoFormatoNomiPreguntaNomi=new JMenuMe("Archivo");
		this.jmenuAccionesFormatoNomiPreguntaNomi=new JMenuMe("Acciones");
		this.jmenuDatosFormatoNomiPreguntaNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoNomiPreguntaNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoNomiPreguntaNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoNomiPreguntaNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormatoNomiPreguntaNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormatoNomiPreguntaNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormatoNomiPreguntaNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormatoNomiPreguntaNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormatoNomiPreguntaNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormatoNomiPreguntaNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormatoNomiPreguntaNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormatoNomiPreguntaNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormatoNomiPreguntaNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoNomiPreguntaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoNomiPreguntaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoNomiPreguntaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormatoNomiPreguntaNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormatoNomiPreguntaNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormatoNomiPreguntaNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormatoNomiPreguntaNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormatoNomiPreguntaNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormatoNomiPreguntaNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormatoNomiPreguntaNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormatoNomiPreguntaNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormatoNomiPreguntaNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormatoNomiPreguntaNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormatoNomiPreguntaNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormatoNomiPreguntaNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormatoNomiPreguntaNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormatoNomiPreguntaNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormatoNomiPreguntaNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormatoNomiPreguntaNomi.add(this.jMenuItemCerrarFormatoNomiPreguntaNomi);
			
			this.jmenuAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemNuevoFormatoNomiPreguntaNomi);
			this.jmenuAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi);
			this.jmenuAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi);
			this.jmenuAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi);		
			this.jmenuAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemDuplicarFormatoNomiPreguntaNomi);		
			this.jmenuAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemCopiarFormatoNomiPreguntaNomi);		
			this.jmenuAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemVerFormFormatoNomiPreguntaNomi);		
			
			this.jmenuDatosFormatoNomiPreguntaNomi.add(this.jMenuItemRecargarInformacionFormatoNomiPreguntaNomi);				
			this.jmenuDatosFormatoNomiPreguntaNomi.add(this.jMenuItemAnterioresFormatoNomiPreguntaNomi);				
			this.jmenuDatosFormatoNomiPreguntaNomi.add(this.jMenuItemSiguientesFormatoNomiPreguntaNomi);				
			this.jmenuDatosFormatoNomiPreguntaNomi.add(this.jMenuItemAbrirOrderByFormatoNomiPreguntaNomi);				
			this.jmenuDatosFormatoNomiPreguntaNomi.add(this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormatoNomiPreguntaNomi.add(this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormatoNomiPreguntaNomi.add(this.jmenuArchivoFormatoNomiPreguntaNomi);		
			this.jmenuBarFormatoNomiPreguntaNomi.add(this.jmenuAccionesFormatoNomiPreguntaNomi);		
			this.jmenuBarFormatoNomiPreguntaNomi.add(this.jmenuDatosFormatoNomiPreguntaNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormatoNomiPreguntaNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormatoNomiPreguntaNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi.setToolTipText("Buscar Por Factor Nomi ");
		this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi.setToolTipText("Buscar Por Factor Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi,"buscar_button","Buscar Por Factor Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi = new JLabelMe();
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setText("Factor Nomi :");
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setToolTipText("Factor Nomi");
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi.setToolTipText("Buscar Por Formato Nomi ");
		this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi.setToolTipText("Buscar Por Formato Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi,"buscar_button","Buscar Por Formato Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi = new JLabelMe();
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setText("Formato Nomi :");
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setToolTipText("Formato Nomi");
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setToolTipText("Buscar Por Pregunta Nomi ");
		this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi= new JButtonMe();
		this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setText("Buscar");
		this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setToolTipText("Buscar Por Pregunta Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi,"buscar_button","Buscar Por Pregunta Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi = new JLabelMe();
		jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setText("Pregunta Nomi :");
		jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setToolTipText("Pregunta Nomi");
		jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi= new JComboBoxMe();
		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormatoNomiPreguntaNomi = new FormatoNomiPreguntaNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formato Nomi Pregunta Nomi DATOS");
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi = new FormatoNomiPreguntaNomiDetalleFormJInternalFrame(jDesktopPane,this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi = null;//new FormatoNomiPreguntaNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoNomiPreguntaNomi= new GridBagLayout();
		
		
		this.jTableDatosFormatoNomiPreguntaNomi = new JTableMe();      
		
		String sToolTipFormatoNomiPreguntaNomi="";
		sToolTipFormatoNomiPreguntaNomi=FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoNomiPreguntaNomi+="(Nomina.FormatoNomiPreguntaNomi)";
		}
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoNomiPreguntaNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormatoNomiPreguntaNomi.setToolTipText(sToolTipFormatoNomiPreguntaNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormatoNomiPreguntaNomi);
		this.jTableDatosFormatoNomiPreguntaNomi.setAutoCreateRowSorter(true);
		this.jTableDatosFormatoNomiPreguntaNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionAllowed(true);
		this.jTableDatosFormatoNomiPreguntaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormatoNomiPreguntaNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonDuplicarFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonCopiarFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonVerFormFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonCerrarFormatoNomiPreguntaNomi = new JButtonMe();
		
		this.jScrollPanelDatosFormatoNomiPreguntaNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formato Nomi Pregunta Nomi";
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Pregunta Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoNomiPreguntaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoNomiPreguntaNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormatoNomiPreguntaNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi=new ReporteDinamicoJInternalFrame(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormatoNomiPreguntaNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormatoNomiPreguntaNomi=new ImportacionJInternalFrame(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormatoNomiPreguntaNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormatoNomiPreguntaNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.setText("Orden");
		this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoNomiPreguntaNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoNomiPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiPreguntaNomi,false,this);
			
			//this.cargarOrderByFormatoNomiPreguntaNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoNomiPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiPreguntaNomi,true,this);
			
			//this.cargarOrderByFormatoNomiPreguntaNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormatoNomiPreguntaNomi.setText("Nuevo");
		this.jButtonDuplicarFormatoNomiPreguntaNomi.setText("Duplicar");
		this.jButtonCopiarFormatoNomiPreguntaNomi.setText("Copiar");
		this.jButtonVerFormFormatoNomiPreguntaNomi.setText("Ver");
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.setText("Guardar");
		this.jButtonCerrarFormatoNomiPreguntaNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoNomiPreguntaNomi,"nuevo_button","Nuevo",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormatoNomiPreguntaNomi,"duplicar_button","Duplicar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormatoNomiPreguntaNomi,"copiar_button","Copiar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormatoNomiPreguntaNomi,"ver_form","Ver",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi,"nuevorelaciones_button","Nuevo Rel",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi,"guardarcambiostabla_button","Guardar",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoNomiPreguntaNomi,"cerrar_button","Salir",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormatoNomiPreguntaNomi.setToolTipText("Nuevo"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormatoNomiPreguntaNomi.setToolTipText("Duplicar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormatoNomiPreguntaNomi.setToolTipText("Copiar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormatoNomiPreguntaNomi.setToolTipText("Ver"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.setToolTipText("Nuevo Rel"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.setToolTipText("Guardar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoNomiPreguntaNomi.setToolTipText("Salir"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoNomiPreguntaNomi";
		inputMap = this.jButtonNuevoFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoNomiPreguntaNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonDuplicarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormatoNomiPreguntaNomi"));
		
		//COPIAR
		sMapKey = "CopiarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonCopiarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormatoNomiPreguntaNomi"));
		
		//VEr FORM
		sMapKey = "VerFormFormatoNomiPreguntaNomi";
		inputMap = this.jButtonVerFormFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormatoNomiPreguntaNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormatoNomiPreguntaNomi";
		inputMap = this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormatoNomiPreguntaNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonModificarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormatoNomiPreguntaNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonCerrarFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoNomiPreguntaNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoNomiPreguntaNomi";
		inputMap = this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoNomiPreguntaNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormatoNomiPreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormatoNomiPreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormatoNomiPreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormatoNomiPreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormatoNomiPreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setName("jPanelParametrosReportesFormatoNomiPreguntaNomi"); 
		
		this.jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi.setName("jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.setText("Recargar");
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.setToolTipText("Recargar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormatoNomiPreguntaNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi.setText("Procesar");
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi.setToolTipText("Procesar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi.setVisible(false);
			
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.setText("TIPO");       
		this.jComboBoxTiposReportesFormatoNomiPreguntaNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.setText("Accion");
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setText("Accion");
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormatoNomiPreguntaNomi = new JLabelMe();
		
		this.jLabelAccionesFormatoNomiPreguntaNomi.setText("Acciones");		
		this.jLabelAccionesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormatoNomiPreguntaNomi = new JButtonMe();
		//this.jButtonAnterioresFormatoNomiPreguntaNomi.setText("<<");
        this.jButtonAnterioresFormatoNomiPreguntaNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormatoNomiPreguntaNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormatoNomiPreguntaNomi = new JButtonMe();
		//this.jButtonSiguientesFormatoNomiPreguntaNomi.setText(">>");
        this.jButtonSiguientesFormatoNomiPreguntaNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormatoNomiPreguntaNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi,"nuevoguardarcambios_button","Nue",this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormatoNomiPreguntaNomi";
		inputMap = this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormatoNomiPreguntaNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormatoNomiPreguntaNomi";
		inputMap = this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormatoNomiPreguntaNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormatoNomiPreguntaNomi";
		inputMap = this.jButtonSiguientesFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormatoNomiPreguntaNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormatoNomiPreguntaNomi";
		inputMap = this.jButtonAnterioresFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormatoNomiPreguntaNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormatoNomiPreguntaNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(this.getWidth(),FormatoNomiPreguntaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiPreguntaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(this.getWidth(),FormatoNomiPreguntaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiPreguntaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(this.getWidth(),FormatoNomiPreguntaNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoNomiPreguntaNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormatoNomiPreguntaNomi = new GridBagLayout();

			this.jPanelPaginacionFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutPaginacionFormatoNomiPreguntaNomi);						
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonAnterioresFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
					
						
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
			
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
						
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonSiguientesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonNuevoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			}
			
			
			if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			}
			
			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonDuplicarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonCopiarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonVerFormFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormatoNomiPreguntaNomi.add(this.jButtonCerrarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormatoNomiPreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormatoNomiPreguntaNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormatoNomiPreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormatoNomiPreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormatoNomiPreguntaNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormatoNomiPreguntaNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setLayout(gridaBagParametrosReportesFormatoNomiPreguntaNomi);
			this.jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi.setLayout(gridaBagParametrosReportesAccionesFormatoNomiPreguntaNomi);
			
			
			this.jPanelParametrosAuxiliar1FormatoNomiPreguntaNomi.setLayout(gridaBagParametrosAuxiliar1FormatoNomiPreguntaNomi);
			this.jPanelParametrosAuxiliar2FormatoNomiPreguntaNomi.setLayout(gridaBagParametrosAuxiliar2FormatoNomiPreguntaNomi);
			this.jPanelParametrosAuxiliar3FormatoNomiPreguntaNomi.setLayout(gridaBagParametrosAuxiliar3FormatoNomiPreguntaNomi);
			this.jPanelParametrosAuxiliar4FormatoNomiPreguntaNomi.setLayout(gridaBagParametrosAuxiliar4FormatoNomiPreguntaNomi);
			//this.jPanelParametrosAuxiliar5FormatoNomiPreguntaNomi.setLayout(gridaBagParametrosAuxiliar2FormatoNomiPreguntaNomi);			
			
			
			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jButtonRecargarInformacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomiPreguntaNomi.add(this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomiPreguntaNomi.add(this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoNomiPreguntaNomi.add(this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jPanelParametrosAuxiliar1FormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormatoNomiPreguntaNomi.add(this.jComboBoxTiposReportesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);																		
			
			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormatoNomiPreguntaNomi.add(this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jPanelParametrosAuxiliar4FormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jComboBoxTiposReportesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jCheckBoxGenerarReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jPanelParametrosAuxiliar2FormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jLabelAccionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
				this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jButtonAbrirOrderByFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
			
			
			/*
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomiPreguntaNomi.add(this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);															
				
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomiPreguntaNomi.add(this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);															
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoNomiPreguntaNomi.add(this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jPanelParametrosAuxiliar3FormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
				
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	
				
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.add(this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormatoNomiPreguntaNomi = new GridBagLayout();

			this.jScrollPanelDatosFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutDatosFormatoNomiPreguntaNomi);
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
			
			this.jScrollPanelDatosFormatoNomiPreguntaNomi.add(this.jTableDatosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormatoNomiPreguntaNomi.setViewportView(this.jTableDatosFormatoNomiPreguntaNomi);
		this.jTableDatosFormatoNomiPreguntaNomi.setFillsViewportHeight(true);
		this.jTableDatosFormatoNomiPreguntaNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormatoNomiPreguntaNomi= new GridBagLayout();
		this.jPanelAccionesFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutAccionesFormatoNomiPreguntaNomi);
		
		
		/*	
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
			
		this.jPanelAccionesFormatoNomiPreguntaNomi.add(this.jButtonNuevoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdFactorNomiFormatoNomiPreguntaNomi= new GridBagLayout();
		gridaBagLayoutFK_IdFactorNomiFormatoNomiPreguntaNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFactorNomiFormatoNomiPreguntaNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFactorNomiFormatoNomiPreguntaNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFactorNomiFormatoNomiPreguntaNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutFK_IdFactorNomiFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
		jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi.add(jLabelid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
		jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi.add(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx =1;
		jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi.add(jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		jTabbedPaneBusquedasFormatoNomiPreguntaNomi.addTab("1.-Por Factor Nomi ", jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);
		jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFormatoNomiFormatoNomiPreguntaNomi= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiPreguntaNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiPreguntaNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiPreguntaNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNomiFormatoNomiPreguntaNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutFK_IdFormatoNomiFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
		jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi.add(jLabelid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
		jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi.add(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx =1;
		jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi.add(jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		jTabbedPaneBusquedasFormatoNomiPreguntaNomi.addTab("2.-Por Formato Nomi ", jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);
		jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPreguntaNomiFormatoNomiPreguntaNomi= new GridBagLayout();
		gridaBagLayoutFK_IdPreguntaNomiFormatoNomiPreguntaNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPreguntaNomiFormatoNomiPreguntaNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPreguntaNomiFormatoNomiPreguntaNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPreguntaNomiFormatoNomiPreguntaNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutFK_IdPreguntaNomiFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
		jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi.add(jLabelid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 0;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 1;
		jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi.add(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridy = 1;
		gridBagConstraintsFormatoNomiPreguntaNomi.gridx =1;
		jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi.add(jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi, gridBagConstraintsFormatoNomiPreguntaNomi);

		jTabbedPaneBusquedasFormatoNomiPreguntaNomi.addTab("3.-Por Pregunta Nomi ", jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
		jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoNomiPreguntaNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoNomiPreguntaNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();						
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;		
			//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;		
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;		
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);								
		
		
		/*
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		*/		
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =0;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
				
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormatoNomiPreguntaNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoNomiPreguntaNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutBusquedasParametrosFormatoNomiPreguntaNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
			
			
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
			
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormatoNomiPreguntaNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormatoNomiPreguntaNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormatoNomiPreguntaNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.setName("jPanelReporteDinamicoFormatoNomiPreguntaNomi"); 
		
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutReporteDinamicoFormatoNomiPreguntaNomi);
		
		
		this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Pregunta Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteFormatoNomiPreguntaNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelColumnasSelectReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormatoNomiPreguntaNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteFormatoNomiPreguntaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormatoNomiPreguntaNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi=new JScrollPane(this.jListColumnasSelectReporteFormatoNomiPreguntaNomi);
			
			this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jListColumnasSelectReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormatoNomiPreguntaNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelRelacionesSelectReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormatoNomiPreguntaNomi=new JScrollPane(this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi);
			
			this.jScrollRelacionesSelectReporteFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jListRelacionesSelectReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jScrollRelacionesSelectReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelConGraficoDinamicoFormatoNomiPreguntaNomi.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelConGraficoDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jCheckBoxConGraficoDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelColumnaCategoriaGraficoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormatoNomiPreguntaNomi.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelColumnaCategoriaValorFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jComboBoxColumnaCategoriaValorFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormatoNomiPreguntaNomi.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelColumnasValoresGraficoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormatoNomiPreguntaNomi=new JScrollPane(this.jListColumnasValoresGraficoFormatoNomiPreguntaNomi);
			
			this.jScrollColumnasValoresGraficoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jListColumnasSelectReporteFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jScrollColumnasValoresGraficoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormatoNomiPreguntaNomi.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jComboBoxTiposGraficosReportesDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.setToolTipText("Generar EXCEL"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jComboBoxTiposReportesDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormatoNomiPreguntaNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jLabelTiposArchivoReporteDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jComboBoxTiposArchivosReportesDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi.setToolTipText("Generar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi.setToolTipText("Cancelar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoNomiPreguntaNomi.add(this.jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormatoNomiPreguntaNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi= new JScrollPane(jPanelReporteDinamicoFormatoNomiPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Pregunta Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormatoNomiPreguntaNomi);
		this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getContentPane().add(this.jScrollPanelReporteDinamicoFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormatoNomiPreguntaNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormatoNomiPreguntaNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormatoNomiPreguntaNomi.setName("jPanelImportacionFormatoNomiPreguntaNomi"); 
		
		this.jPanelImportacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutImportacionFormatoNomiPreguntaNomi);
		
		
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormatoNomiPreguntaNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormatoNomiPreguntaNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setResizable(true);
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setClosable(true);
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setResizable(true);
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setClosable(true);
	    this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Pregunta Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelArchivoImportacionFormatoNomiPreguntaNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoNomiPreguntaNomi.add(this.jLabelArchivoImportacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormatoNomiPreguntaNomi = new JFileChooser();		
		this.jFileChooserImportacionFormatoNomiPreguntaNomi.setToolTipText("ESCOGER ARCHIVO"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonAbrirImportacionFormatoNomiPreguntaNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormatoNomiPreguntaNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormatoNomiPreguntaNomi.setToolTipText("Generar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiPreguntaNomi.add(this.jButtonAbrirImportacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormatoNomiPreguntaNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionFormatoNomiPreguntaNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoNomiPreguntaNomi.add(this.jLabelPathArchivoImportacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormatoNomiPreguntaNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiPreguntaNomi.add(this.jTextFieldPathArchivoImportacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonGenerarImportacionFormatoNomiPreguntaNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormatoNomiPreguntaNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormatoNomiPreguntaNomi.setToolTipText("Generar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiPreguntaNomi.add(this.jButtonGenerarImportacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormatoNomiPreguntaNomi = new JButtonMe();
		this.jButtonCerrarImportacionFormatoNomiPreguntaNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormatoNomiPreguntaNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormatoNomiPreguntaNomi.setToolTipText("Cancelar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoNomiPreguntaNomi.add(this.jButtonCerrarImportacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormatoNomiPreguntaNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionFormatoNomiPreguntaNomi= new JScrollPane(jPanelImportacionFormatoNomiPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormatoNomiPreguntaNomi);
		this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getContentPane().add(this.jScrollPanelImportacionFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormatoNomiPreguntaNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormatoNomiPreguntaNomi = new JButtonMe();
			this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.setText("Orden");
			this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoNomiPreguntaNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormatoNomiPreguntaNomi";
			inputMap = this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormatoNomiPreguntaNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormatoNomiPreguntaNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormatoNomiPreguntaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormatoNomiPreguntaNomi.setName("jPanelOrderByFormatoNomiPreguntaNomi"); 
			
			this.jPanelOrderByFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormatoNomiPreguntaNomi.setLayout(gridaBagLayoutOrderByFormatoNomiPreguntaNomi);
			
			
			this.jTableDatosFormatoNomiPreguntaNomiOrderBy = new JTableMe();        
			this.jTableDatosFormatoNomiPreguntaNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormatoNomiPreguntaNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormatoNomiPreguntaNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormatoNomiPreguntaNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormatoNomiPreguntaNomiOrderBy.setViewportView(this.jTableDatosFormatoNomiPreguntaNomiOrderBy);
			this.jTableDatosFormatoNomiPreguntaNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormatoNomiPreguntaNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormatoNomiPreguntaNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormatoNomiPreguntaNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setTitle("Orden");
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setResizable(true);
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setClosable(true);
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormatoNomiPreguntaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formato Nomi Pregunta Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormatoNomiPreguntaNomi.ipady =150;
				
			this.jPanelOrderByFormatoNomiPreguntaNomi.add(jScrollPanelDatosFormatoNomiPreguntaNomiOrderBy, this.gridBagConstraintsFormatoNomiPreguntaNomi);//this.jTableDatosFormatoNomiPreguntaNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormatoNomiPreguntaNomi = new JButtonMe();
			this.jButtonCerrarOrderByFormatoNomiPreguntaNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormatoNomiPreguntaNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormatoNomiPreguntaNomi.setToolTipText("Cancelar"+" "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormatoNomiPreguntaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormatoNomiPreguntaNomi.add(this.jButtonCerrarOrderByFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormatoNomiPreguntaNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByFormatoNomiPreguntaNomi= new JScrollPane(jPanelOrderByFormatoNomiPreguntaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormatoNomiPreguntaNomi = new GridBagConstraints();
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoNomiPreguntaNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormatoNomiPreguntaNomi);
			
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getContentPane().add(this.jScrollPanelOrderByFormatoNomiPreguntaNomi, this.gridBagConstraintsFormatoNomiPreguntaNomi);			
		
		} else {
			this.jButtonAbrirOrderByFormatoNomiPreguntaNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormatoNomiPreguntaNomi.getRowHeight();//FormatoNomiPreguntaNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi.isSelected()) {
					iHeightTable=FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoNomiPreguntaNomi.isSelected()) {
					iHeightTable=FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoNomiPreguntaNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormatoNomiPreguntaNomi!=null && this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomipreguntanomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormatoNomiPreguntaNomi> TraerFormatoNomiPreguntaNomiBeans(List<FormatoNomiPreguntaNomi> formatonomipreguntanomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomis) {
					
				if(!(FormatoNomiPreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormatoNomiPreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formatonomipreguntanomi.setsDetalleGeneralEntityReporte(FormatoNomiPreguntaNomiConstantesFunciones.getFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomi));
										
						
					
					

					if(formatonomipreguntanomi.getCalificacionEmpleados()!=null && Funciones.existeClass(classes,CalificacionEmpleado.class)) {
						try{formatonomipreguntanomi.setcalificacionempleadosDescripcionReporte(new JRBeanCollectionDataSource(CalificacionEmpleadoJInternalFrame.TraerCalificacionEmpleadoBeans(formatonomipreguntanomi.getCalificacionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//formatonomipreguntanomi.setsDetalleGeneralEntityReporte(formatonomipreguntanomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//formatonomipreguntanomibeans.add(formatonomipreguntanomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formatonomipreguntanomis;
    }
	//PARA REPORTES FIN
}
